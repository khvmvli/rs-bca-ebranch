package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.RealCall;
import okhttp3.internal.Util;
/* loaded from: classes-dex2jar.jar:okhttp3/Dispatcher.class */
public final class Dispatcher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    @Nullable
    private ExecutorService executorService;
    @Nullable
    private Runnable idleCallback;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<RealCall.AsyncCall> readyAsyncCalls = new ArrayDeque();
    private final Deque<RealCall.AsyncCall> runningAsyncCalls = new ArrayDeque();
    private final Deque<RealCall> runningSyncCalls = new ArrayDeque();

    public Dispatcher() {
    }

    public Dispatcher(ExecutorService executorService) {
        this.executorService = executorService;
    }

    private <T> void finished(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.idleCallback;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && runnable != null) {
            runnable.run();
        }
    }

    private boolean promoteAndExecute() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                } else if (runningCallsForHost(next) < this.maxRequestsPerHost) {
                    it.remove();
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            z = runningCallsCount() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
        }
        return z;
    }

    private int runningCallsForHost(RealCall.AsyncCall asyncCall) {
        int i = 0;
        for (RealCall.AsyncCall asyncCall2 : this.runningAsyncCalls) {
            if (!asyncCall2.get().forWebSocket && asyncCall2.host().equals(asyncCall.host())) {
                i++;
            }
        }
        return i;
    }

    public final void cancelAll() {
        synchronized (this) {
            for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls) {
                asyncCall.get().cancel();
            }
            for (RealCall.AsyncCall asyncCall2 : this.runningAsyncCalls) {
                asyncCall2.get().cancel();
            }
            for (RealCall realCall : this.runningSyncCalls) {
                realCall.cancel();
            }
        }
    }

    final void enqueue(RealCall.AsyncCall asyncCall) {
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
        }
        promoteAndExecute();
    }

    final void executed(RealCall realCall) {
        synchronized (this) {
            this.runningSyncCalls.add(realCall);
        }
    }

    public final ExecutorService executorService() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.executorService == null) {
                this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            }
            executorService = this.executorService;
        }
        return executorService;
    }

    final void finished(RealCall.AsyncCall asyncCall) {
        finished(this.runningAsyncCalls, asyncCall);
    }

    final void finished(RealCall realCall) {
        finished(this.runningSyncCalls, realCall);
    }

    public final int getMaxRequests() {
        int i;
        synchronized (this) {
            i = this.maxRequests;
        }
        return i;
    }

    public final int getMaxRequestsPerHost() {
        int i;
        synchronized (this) {
            i = this.maxRequestsPerHost;
        }
        return i;
    }

    public final List<Call> queuedCalls() {
        List<Call> unmodifiableList;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls) {
                arrayList.add(asyncCall.get());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public final int queuedCallsCount() {
        int size;
        synchronized (this) {
            size = this.readyAsyncCalls.size();
        }
        return size;
    }

    public final List<Call> runningCalls() {
        List<Call> unmodifiableList;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.runningSyncCalls);
            for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
                arrayList.add(asyncCall.get());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public final int runningCallsCount() {
        int size;
        int size2;
        synchronized (this) {
            size = this.runningAsyncCalls.size();
            size2 = this.runningSyncCalls.size();
        }
        return size + size2;
    }

    public final void setIdleCallback(@Nullable Runnable runnable) {
        synchronized (this) {
            this.idleCallback = runnable;
        }
    }

    public final void setMaxRequests(int i) {
        if (i > 0) {
            synchronized (this) {
                this.maxRequests = i;
            }
            promoteAndExecute();
            return;
        }
        StringBuilder sb = new StringBuilder("max < 1: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i > 0) {
            synchronized (this) {
                this.maxRequestsPerHost = i;
            }
            promoteAndExecute();
            return;
        }
        StringBuilder sb = new StringBuilder("max < 1: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
