package com.facebook.stetho.server;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/server/LocalSocketServer.class */
public class LocalSocketServer {
    private static final int MAX_BIND_RETRIES;
    private static final int TIME_BETWEEN_BIND_RETRIES_MS;
    private static final String WORKER_THREAD_NAME_PREFIX;
    private final String mAddress;
    private final String mFriendlyName;
    private Thread mListenerThread;
    private LocalServerSocket mServerSocket;
    private final SocketHandler mSocketHandler;
    private boolean mStopped;
    private final AtomicInteger mThreadId = new AtomicInteger();

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/server/LocalSocketServer$WorkerThread.class */
    public static class WorkerThread extends Thread {
        private final LocalSocket mSocket;
        private final SocketHandler mSocketHandler;

        public WorkerThread(LocalSocket localSocket, SocketHandler socketHandler) {
            this.mSocket = localSocket;
            this.mSocketHandler = socketHandler;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    this.mSocketHandler.onAccepted(this.mSocket);
                } catch (Throwable th) {
                    try {
                        this.mSocket.close();
                    } catch (IOException e) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                LogUtil.w("I/O error: %s", e2);
            }
            try {
                this.mSocket.close();
            } catch (IOException e3) {
            }
        }
    }

    public LocalSocketServer(String str, String str2, SocketHandler socketHandler) {
        this.mFriendlyName = (String) Util.throwIfNull(str);
        this.mAddress = (String) Util.throwIfNull(str2);
        this.mSocketHandler = socketHandler;
    }

    @Nonnull
    private static LocalServerSocket bindToSocket(String str) throws IOException {
        int i = 2;
        BindException bindException = null;
        while (true) {
            try {
                if (LogUtil.isLoggable(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Trying to bind to @");
                    sb.append(str);
                    LogUtil.d(sb.toString());
                }
                return new LocalServerSocket(str);
            } catch (BindException e) {
                LogUtil.w(e, "Binding error, sleep 1000 ms...");
                BindException bindException2 = bindException;
                if (bindException == null) {
                    bindException2 = e;
                }
                Util.sleepUninterruptibly(1000);
                if (i > 0) {
                    i--;
                    bindException = bindException2;
                } else {
                    throw bindException2;
                }
            }
        }
    }

    private void listenOnAddress(String str) throws IOException {
        this.mServerSocket = bindToSocket(str);
        StringBuilder sb = new StringBuilder("Listening on @");
        sb.append(str);
        LogUtil.i(sb.toString());
        while (!Thread.interrupted()) {
            try {
                WorkerThread workerThread = new WorkerThread(this.mServerSocket.accept(), this.mSocketHandler);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("StethoWorker-");
                sb2.append(this.mFriendlyName);
                sb2.append("-");
                sb2.append(this.mThreadId.incrementAndGet());
                workerThread.setName(sb2.toString());
                workerThread.setDaemon(true);
                workerThread.start();
            } catch (InterruptedIOException e) {
            } catch (SocketException e2) {
                if (Thread.interrupted()) {
                    break;
                }
                LogUtil.w(e2, "I/O error");
            } catch (IOException e3) {
                LogUtil.w(e3, "I/O error initialising connection thread");
            }
        }
        StringBuilder sb3 = new StringBuilder("Server shutdown on @");
        sb3.append(str);
        LogUtil.i(sb3.toString());
    }

    public String getName() {
        return this.mFriendlyName;
    }

    public void run() throws IOException {
        synchronized (this) {
            if (!this.mStopped) {
                this.mListenerThread = Thread.currentThread();
                listenOnAddress(this.mAddress);
            }
        }
    }

    public void stop() {
        synchronized (this) {
            this.mStopped = true;
            Thread thread = this.mListenerThread;
            if (thread != null) {
                thread.interrupt();
                try {
                    LocalServerSocket localServerSocket = this.mServerSocket;
                    if (localServerSocket != null) {
                        localServerSocket.close();
                    }
                } catch (IOException e) {
                }
            }
        }
    }
}
