package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/network/ResponseHandlingInputStream.class */
public final class ResponseHandlingInputStream extends FilterInputStream {
    private static final int BUFFER_SIZE = 1024;
    public static final String TAG = "ResponseHandlingInputStream";
    @Nullable
    private final CountingOutputStream mDecompressedCounter;
    private boolean mEofSeen;
    private final ChromePeerManager mNetworkPeerManager;
    private final OutputStream mOutputStream;
    private final String mRequestId;
    private final ResponseHandler mResponseHandler;
    @Nullable
    private byte[] mSkipBuffer;
    private long mLastDecompressedCount = 0;
    private boolean mClosed = false;

    public ResponseHandlingInputStream(InputStream inputStream, String str, OutputStream outputStream, @Nullable CountingOutputStream countingOutputStream, ChromePeerManager chromePeerManager, ResponseHandler responseHandler) {
        super(inputStream);
        this.mRequestId = str;
        this.mOutputStream = outputStream;
        this.mDecompressedCounter = countingOutputStream;
        this.mNetworkPeerManager = chromePeerManager;
        this.mResponseHandler = responseHandler;
    }

    private int checkEOF(int i) {
        synchronized (this) {
            if (i == -1) {
                closeOutputStreamQuietly();
                this.mResponseHandler.onEOF();
                this.mEofSeen = true;
            }
        }
        return i;
    }

    private void closeOutputStreamQuietly() {
        synchronized (this) {
            if (!this.mClosed) {
                try {
                    this.mOutputStream.close();
                    reportDecodedSizeIfApplicable();
                } catch (IOException e) {
                    ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
                    Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
                    Console.MessageSource messageSource = Console.MessageSource.NETWORK;
                    StringBuilder sb = new StringBuilder("Could not close the output stream");
                    sb.append(e);
                    CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, sb.toString());
                }
                this.mClosed = true;
            }
        }
    }

    @Nonnull
    private byte[] getSkipBufferLocked() {
        if (this.mSkipBuffer == null) {
            this.mSkipBuffer = new byte[BUFFER_SIZE];
        }
        return this.mSkipBuffer;
    }

    private IOException handleIOException(IOException iOException) {
        this.mResponseHandler.onError(iOException);
        return iOException;
    }

    private void handleIOExceptionWritingToStream(IOException iOException) {
        ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
        Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
        Console.MessageSource messageSource = Console.MessageSource.NETWORK;
        StringBuilder sb = new StringBuilder("Could not write response body to the stream ");
        sb.append(iOException);
        CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, sb.toString());
        closeOutputStreamQuietly();
    }

    private void reportDecodedSizeIfApplicable() {
        CountingOutputStream countingOutputStream = this.mDecompressedCounter;
        if (countingOutputStream != null) {
            long count = countingOutputStream.getCount();
            this.mResponseHandler.onReadDecoded((int) (count - this.mLastDecompressedCount));
            this.mLastDecompressedCount = count;
        }
    }

    private void writeToOutputStream(int i) {
        synchronized (this) {
            if (!this.mClosed) {
                try {
                    this.mOutputStream.write(i);
                    reportDecodedSizeIfApplicable();
                } catch (IOException e) {
                    handleIOExceptionWritingToStream(e);
                }
            }
        }
    }

    private void writeToOutputStream(byte[] bArr, int i, int i2) {
        synchronized (this) {
            if (!this.mClosed) {
                try {
                    this.mOutputStream.write(bArr, i, i2);
                    reportDecodedSizeIfApplicable();
                } catch (IOException e) {
                    handleIOExceptionWritingToStream(e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() throws IOException {
        long j;
        try {
            if (!this.mEofSeen) {
                byte[] bArr = new byte[BUFFER_SIZE];
                long j2 = 0;
                while (true) {
                    int read = read(bArr);
                    j = j2 == 1 ? 1 : 0;
                    if (read == -1) {
                        break;
                    }
                    j2 = (j2 == 1 ? 1 : 0) + ((long) read);
                }
            } else {
                j = 0;
            }
            if ((j == true ? 1 : 0) > 0) {
                ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
                Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
                Console.MessageSource messageSource = Console.MessageSource.NETWORK;
                StringBuilder sb = new StringBuilder();
                sb.append("There were ");
                sb.append(String.valueOf(j));
                sb.append(" bytes that were not consumed while processing request ");
                sb.append(this.mRequestId);
                CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, sb.toString());
            }
        } finally {
            close();
            closeOutputStreamQuietly();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        try {
            int checkEOF = checkEOF(this.in.read());
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(1);
                writeToOutputStream(checkEOF);
            }
            return checkEOF;
        } catch (IOException e) {
            throw handleIOException(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int checkEOF = checkEOF(this.in.read(bArr, i, i2));
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(checkEOF);
                writeToOutputStream(bArr, i, checkEOF);
            }
            return checkEOF;
        } catch (IOException e) {
            throw handleIOException(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException("Mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2;
        synchronized (this) {
            byte[] skipBufferLocked = getSkipBufferLocked();
            j2 = 0;
            while (j2 < j) {
                int read = read(skipBufferLocked, 0, (int) Math.min((long) skipBufferLocked.length, j - j2));
                if (read == -1) {
                    break;
                }
                j2 += (long) read;
            }
        }
        return j2;
    }
}
