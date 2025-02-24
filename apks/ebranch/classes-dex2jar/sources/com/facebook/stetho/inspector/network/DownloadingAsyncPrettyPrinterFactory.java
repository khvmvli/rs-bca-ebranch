package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory.class */
public abstract class DownloadingAsyncPrettyPrinterFactory implements AsyncPrettyPrinterFactory {

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory$MatchResult.class */
    protected class MatchResult {
        private final PrettyPrinterDisplayType mDisplayType;
        private final String mSchemaUri;

        public MatchResult(String str, PrettyPrinterDisplayType prettyPrinterDisplayType) {
            this.mSchemaUri = str;
            this.mDisplayType = prettyPrinterDisplayType;
        }

        public PrettyPrinterDisplayType getDisplayType() {
            return this.mDisplayType;
        }

        public String getSchemaUri() {
            return this.mSchemaUri;
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory$Request.class */
    static class Request implements Callable<String> {
        private URL url;

        public Request(URL url) {
            this.url = url;
        }

        @Override // java.util.concurrent.Callable
        public String call() throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    return Util.readAsUTF8(inputStream);
                } finally {
                    inputStream.close();
                }
            } else {
                StringBuilder sb = new StringBuilder("Got status code: ");
                sb.append(responseCode);
                sb.append(" while downloading schema with url: ");
                sb.append(this.url.toString());
                throw new IOException(sb.toString());
            }
        }
    }

    static /* synthetic */ void access$000(PrintWriter printWriter, InputStream inputStream, String str) throws IOException {
        doErrorPrint(printWriter, inputStream, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doErrorPrint(PrintWriter printWriter, InputStream inputStream, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        sb.append(Util.readAsUTF8(inputStream));
        printWriter.print(sb.toString());
    }

    private static AsyncPrettyPrinter getErrorAsyncPrettyPrinter(final String str, final String str2) {
        return new AsyncPrettyPrinter() { // from class: com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.2
            @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
            public final PrettyPrinterDisplayType getPrettifiedType() {
                return PrettyPrinterDisplayType.TEXT;
            }

            @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
            public final void printTo(PrintWriter printWriter, InputStream inputStream) throws IOException {
                StringBuilder sb = new StringBuilder("[Failed to parse header: ");
                sb.append(str);
                sb.append(" : ");
                sb.append(str2);
                sb.append(" ]");
                DownloadingAsyncPrettyPrinterFactory.doErrorPrint(printWriter, inputStream, sb.toString());
            }
        };
    }

    @Nullable
    private static URL parseURL(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            return null;
        }
    }

    protected abstract void doPrint(PrintWriter printWriter, InputStream inputStream, String str) throws IOException;

    @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinterFactory
    public AsyncPrettyPrinter getInstance(String str, String str2) {
        final MatchResult matchAndParseHeader = matchAndParseHeader(str, str2);
        if (matchAndParseHeader == null) {
            return null;
        }
        URL parseURL = parseURL(matchAndParseHeader.getSchemaUri());
        if (parseURL == null) {
            return getErrorAsyncPrettyPrinter(str, str2);
        }
        ExecutorService executorService = AsyncPrettyPrinterExecutorHolder.getExecutorService();
        if (executorService == null) {
            return null;
        }
        final Future submit = executorService.submit(new Request(parseURL));
        return new AsyncPrettyPrinter() { // from class: com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.1
            @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
            public PrettyPrinterDisplayType getPrettifiedType() {
                return matchAndParseHeader.getDisplayType();
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
                	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:88)
                	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:58)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:452)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
                */
            @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
            public void printTo(java.io.PrintWriter r6, java.io.InputStream r7) throws java.io.IOException {
                /*
                    r5 = this;
                    r0 = r5
                    java.util.concurrent.Future r0 = r3     // Catch: ExecutionException -> 0x001c, InterruptedException -> 0x0018
                    java.lang.Object r0 = r0.get()     // Catch: ExecutionException -> 0x001c, InterruptedException -> 0x0018
                    java.lang.String r0 = (java.lang.String) r0     // Catch: ExecutionException -> 0x001c, InterruptedException -> 0x0018
                    r8 = r0
                    r0 = r5
                    com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory r0 = com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.this     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    r1 = r6
                    r2 = r7
                    r3 = r8
                    r0.doPrint(r1, r2, r3)     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    return
                L_0x0018:
                    r8 = move-exception
                    goto L_0x0055
                L_0x001c:
                    r9 = move-exception
                    java.lang.Class<java.io.IOException> r0 = java.io.IOException.class
                    r1 = r9
                    java.lang.Throwable r1 = r1.getCause()     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    boolean r0 = r0.isInstance(r1)     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    if (r0 == 0) goto L_0x0049
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    r8 = r0
                    r0 = r8
                    java.lang.String r1 = "Cannot successfully download schema: "
                    r0.<init>(r1)     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    r0 = r8
                    r1 = r9
                    java.lang.String r1 = r1.getMessage()     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    java.lang.StringBuilder r0 = r0.append(r1)     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    java.lang.String r2 = r2.toString()     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.access$000(r0, r1, r2)     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                    return
                L_0x0049:
                    r0 = r9
                    throw r0     // Catch: InterruptedException -> 0x0018, ExecutionException -> 0x004c
                L_0x004c:
                    r6 = move-exception
                    r0 = r6
                    java.lang.Throwable r0 = r0.getCause()
                    java.lang.RuntimeException r0 = com.facebook.stetho.common.ExceptionUtil.propagate(r0)
                    throw r0
                L_0x0055:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r1 = r0
                    java.lang.String r2 = "Encountered spurious interrupt while downloading schema for pretty printing: "
                    r1.<init>(r2)
                    r9 = r0
                    r0 = r9
                    r1 = r8
                    java.lang.String r1 = r1.getMessage()
                    java.lang.StringBuilder r0 = r0.append(r1)
                    r0 = r6
                    r1 = r7
                    r2 = r9
                    java.lang.String r2 = r2.toString()
                    com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.access$000(r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.AnonymousClass1.printTo(java.io.PrintWriter, java.io.InputStream):void");
            }
        };
    }

    @Nullable
    protected abstract MatchResult matchAndParseHeader(String str, String str2);
}
