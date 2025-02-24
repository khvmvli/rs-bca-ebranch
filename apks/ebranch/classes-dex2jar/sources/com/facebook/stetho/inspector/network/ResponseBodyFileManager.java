package com.facebook.stetho.inspector.network;

import android.content.Context;
import android.util.Base64OutputStream;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.common.Util;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/network/ResponseBodyFileManager.class */
public class ResponseBodyFileManager {
    private static final String FILENAME_PREFIX = "network-response-body-";
    private static final int PRETTY_PRINT_TIMEOUT_SEC = 10;
    private static final String TAG = "ResponseBodyFileManager";
    private final Context mContext;
    private final Map<String, AsyncPrettyPrinter> mRequestIdMap = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/network/ResponseBodyFileManager$AsyncPrettyPrintingCallable.class */
    public class AsyncPrettyPrintingCallable implements Callable<String> {
        private final AsyncPrettyPrinter mAsyncPrettyPrinter;
        private final InputStream mInputStream;

        public AsyncPrettyPrintingCallable(InputStream inputStream, AsyncPrettyPrinter asyncPrettyPrinter) {
            this.mInputStream = inputStream;
            this.mAsyncPrettyPrinter = asyncPrettyPrinter;
        }

        private String prettyPrintContent(InputStream inputStream, AsyncPrettyPrinter asyncPrettyPrinter) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
            asyncPrettyPrinter.printTo(printWriter, inputStream);
            printWriter.flush();
            return byteArrayOutputStream.toString(Utf8Charset.NAME);
        }

        @Override // java.util.concurrent.Callable
        public String call() throws IOException {
            return prettyPrintContent(this.mInputStream, this.mAsyncPrettyPrinter);
        }
    }

    public ResponseBodyFileManager(Context context) {
        this.mContext = context;
    }

    private static String getFilename(String str) {
        StringBuilder sb = new StringBuilder(FILENAME_PREFIX);
        sb.append(str);
        return sb.toString();
    }

    private String prettyPrintContentWithTimeOut(AsyncPrettyPrinter asyncPrettyPrinter, InputStream inputStream) throws IOException {
        AsyncPrettyPrintingCallable asyncPrettyPrintingCallable = new AsyncPrettyPrintingCallable(inputStream, asyncPrettyPrinter);
        ExecutorService executorService = AsyncPrettyPrinterExecutorHolder.getExecutorService();
        if (executorService == null) {
            return null;
        }
        Future submit = executorService.submit(asyncPrettyPrintingCallable);
        try {
            return (String) Util.getUninterruptibly(submit, 10, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            ExceptionUtil.propagateIfInstanceOf(cause, IOException.class);
            throw ExceptionUtil.propagate(cause);
        } catch (TimeoutException e2) {
            submit.cancel(true);
            StringBuilder sb = new StringBuilder("Time out after 10 seconds of attempting to pretty print\n");
            sb.append(Util.readAsUTF8(inputStream));
            return sb.toString();
        }
    }

    public void associateAsyncPrettyPrinterWithId(String str, AsyncPrettyPrinter asyncPrettyPrinter) {
        if (this.mRequestIdMap.put(str, asyncPrettyPrinter) != null) {
            StringBuilder sb = new StringBuilder("cannot associate different pretty printers with the same request id: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void cleanupFiles() {
        File[] listFiles = this.mContext.getFilesDir().listFiles();
        for (File file : listFiles) {
            if (file.getName().startsWith(FILENAME_PREFIX) && !file.delete()) {
                StringBuilder sb = new StringBuilder("Failed to delete ");
                sb.append(file.getAbsolutePath());
                LogRedirector.w(TAG, sb.toString());
            }
        }
        LogRedirector.i(TAG, "Cleaned up temporary network files.");
    }

    public OutputStream openResponseBodyFile(String str, boolean z) throws IOException {
        FileOutputStream openFileOutput = this.mContext.openFileOutput(getFilename(str), 0);
        openFileOutput.write(z ? 1 : 0);
        return z ? new Base64OutputStream(openFileOutput, 0) : openFileOutput;
    }

    public ResponseBodyData readFile(String str) throws IOException {
        FileInputStream openFileInput = this.mContext.openFileInput(getFilename(str));
        try {
            int read = openFileInput.read();
            if (read != -1) {
                ResponseBodyData responseBodyData = new ResponseBodyData();
                responseBodyData.base64Encoded = read != 0;
                AsyncPrettyPrinter asyncPrettyPrinter = this.mRequestIdMap.get(str);
                if (asyncPrettyPrinter != null) {
                    responseBodyData.data = prettyPrintContentWithTimeOut(asyncPrettyPrinter, openFileInput);
                } else {
                    responseBodyData.data = Util.readAsUTF8(openFileInput);
                }
                return responseBodyData;
            }
            throw new EOFException("Failed to read base64Encode byte");
        } finally {
            openFileInput.close();
        }
    }
}
