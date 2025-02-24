package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import o.setImageUri;
import o.setRequestHeaders;
/* loaded from: classes2-dex2jar.jar:o/setError.class */
public final class setError implements Executor, Closeable {
    volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    public final int d;
    public final isResponseBodyPlainText f;
    public final String g;
    public final int h;
    public final isResponseBodyPlainText i;
    public final long j;
    public final AtomicReferenceArray<write> m;
    volatile /* synthetic */ long parkedWorkersStack;
    public static final read a = new read((byte) 0);
    public static final getScheme$com_github_ChuckerTeam_Chucker_library c = new getScheme$com_github_ChuckerTeam_Chucker_library("NOT_IN_STACK");
    static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(setError.class, "parkedWorkersStack");
    static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(setError.class, "controlState");
    private static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(setError.class, "_isTerminated");

    /* loaded from: classes2-dex2jar.jar:o/setError$IconCompatParcelizer.class */
    public enum IconCompatParcelizer {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* loaded from: classes2-dex2jar.jar:o/setError$RemoteActionCompatParcelizer.class */
    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[IconCompatParcelizer.values().length];
            iArr[IconCompatParcelizer.PARKING.ordinal()] = 1;
            iArr[IconCompatParcelizer.BLOCKING.ordinal()] = 2;
            iArr[IconCompatParcelizer.CPU_ACQUIRED.ordinal()] = 3;
            iArr[IconCompatParcelizer.DORMANT.ordinal()] = 4;
            iArr[IconCompatParcelizer.TERMINATED.ordinal()] = 5;
            d = iArr;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/setError$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/setError$write.class */
    public final class write extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(write.class, "workerCtl");
        public boolean a;
        public final setRequestBodyPlainText b;
        public IconCompatParcelizer c;
        private long h;
        private int i;
        volatile int indexInArray;
        private long j;
        volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private write() {
            setError.this = r5;
            setDaemon(true);
            this.b = new setRequestBodyPlainText();
            this.c = IconCompatParcelizer.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = setError.c;
            setImageUri.read read = setImageUri.c;
            this.i = setImageUri.d.d();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public write(int i) {
            this();
            setError.this = r4;
            b(i);
        }

        private final setMethod a() {
            if (d(2) == 0) {
                setMethod c = setError.this.i.c();
                setMethod setmethod = c;
                if (c == null) {
                    setmethod = setError.this.f.c();
                }
                return setmethod;
            }
            setMethod c2 = setError.this.f.c();
            setMethod setmethod2 = c2;
            if (c2 == null) {
                setmethod2 = setError.this.i.c();
            }
            return setmethod2;
        }

        private final void b() {
            if (this.j == 0) {
                this.j = System.nanoTime() + setError.this.j;
            }
            LockSupport.parkNanos(setError.this.j);
            if (System.nanoTime() - this.j >= 0) {
                this.j = 0;
                AtomicReferenceArray<write> atomicReferenceArray = setError.this.m;
                setError seterror = setError.this;
                synchronized (atomicReferenceArray) {
                    if (seterror._isTerminated == 0) {
                        if (((int) (seterror.controlState & 2097151)) > seterror.d) {
                            if (e.compareAndSet(this, -1, 1)) {
                                int i = this.indexInArray;
                                b(0);
                                seterror.d(this, i, 0);
                                int andDecrement = (int) (setError.e.getAndDecrement(seterror) & 2097151);
                                if (andDecrement != i) {
                                    write write = seterror.m.get(andDecrement);
                                    subscribeReservationRescheduleEvent.c(write);
                                    write write2 = write;
                                    seterror.m.set(i, write2);
                                    write2.b(i);
                                    seterror.d(write2, andDecrement, i);
                                }
                                seterror.m.set(andDecrement, null);
                                onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
                                this.c = IconCompatParcelizer.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        private void b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(setError.this.g);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        private final void c(int i) {
            if (i != 0 && a(IconCompatParcelizer.BLOCKING)) {
                setError.this.e();
            }
        }

        private final boolean c() {
            boolean z;
            boolean z2 = false;
            if (this.c != IconCompatParcelizer.CPU_ACQUIRED) {
                setError seterror = setError.this;
                while (true) {
                    long j = seterror.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (setError.e.compareAndSet(seterror, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    this.c = IconCompatParcelizer.CPU_ACQUIRED;
                }
                return z2;
            }
            z2 = true;
            return z2;
        }

        private int d(int i) {
            int i2 = this.i;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.i = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
            if (r0 == null) goto L_0x007c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private final o.setMethod d(boolean r5) {
            /*
                r4 = this;
                r0 = r5
                if (r0 == 0) goto L_0x006d
                r0 = r4
                o.setError r0 = o.setError.this
                int r0 = r0.d
                r6 = r0
                r0 = 1
                r7 = r0
                r0 = r4
                r1 = r6
                r2 = 1
                int r1 = r1 << r2
                int r0 = r0.d(r1)
                if (r0 != 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                r7 = r0
            L_0x001d:
                r0 = r7
                if (r0 == 0) goto L_0x002f
                r0 = r4
                o.setMethod r0 = r0.a()
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L_0x002f
                r0 = r8
                return r0
            L_0x002f:
                r0 = r4
                o.setRequestBodyPlainText r0 = r0.b
                r9 = r0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.setRequestBodyPlainText.b
                r1 = r9
                r2 = 0
                java.lang.Object r0 = r0.getAndSet(r1, r2)
                o.setMethod r0 = (o.setMethod) r0
                r10 = r0
                r0 = r10
                r8 = r0
                r0 = r10
                if (r0 != 0) goto L_0x0053
                r0 = r9
                o.setMethod r0 = r0.e()
                r8 = r0
            L_0x0053:
                r0 = r8
                if (r0 != 0) goto L_0x006a
                r0 = r7
                if (r0 != 0) goto L_0x007c
                r0 = r4
                o.setMethod r0 = r0.a()
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L_0x007c
                r0 = r8
                return r0
            L_0x006a:
                r0 = r8
                return r0
            L_0x006d:
                r0 = r4
                o.setMethod r0 = r0.a()
                r10 = r0
                r0 = r10
                r8 = r0
                r0 = r10
                if (r0 != 0) goto L_0x0083
            L_0x007c:
                r0 = r4
                r1 = 0
                o.setMethod r0 = r0.e(r1)
                r8 = r0
            L_0x0083:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setError.write.d(boolean):o.setMethod");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [long] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v3 */
        /* JADX WARN: Type inference failed for: r16v4, types: [long] */
        /* JADX WARN: Type inference failed for: r18v0 */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v2 */
        /* JADX WARN: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private final o.setMethod e(boolean r6) {
            /*
            // Method dump skipped, instructions count: 350
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setError.write.e(boolean):o.setMethod");
        }

        private final void e() {
            long j;
            int i;
            if (!(this.nextParkedWorker != setError.c)) {
                setError seterror = setError.this;
                if (this.nextParkedWorker == setError.c) {
                    do {
                        j = seterror.parkedWorkersStack;
                        int i2 = (int) (2097151 & j);
                        i = this.indexInArray;
                        if (RateTransactionPresenter.c()) {
                            if (!(i != 0)) {
                                throw new AssertionError();
                            }
                        }
                        this.nextParkedWorker = seterror.m.get(i2);
                    } while (!setError.b.compareAndSet(seterror, j, ((2097152 + j) & -2097152) | ((long) i)));
                    return;
                }
                return;
            }
            if (RateTransactionPresenter.c()) {
                setRequestBodyPlainText setrequestbodyplaintext = this.b;
                if (!((setrequestbodyplaintext.lastScheduledTask != null ? (setrequestbodyplaintext.producerIndex - setrequestbodyplaintext.consumerIndex) + 1 : setrequestbodyplaintext.producerIndex - setrequestbodyplaintext.consumerIndex) == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (true) {
                if ((this.nextParkedWorker != setError.c) && this.workerCtl == -1 && setError.this._isTerminated == 0 && this.c != IconCompatParcelizer.TERMINATED) {
                    a(IconCompatParcelizer.PARKING);
                    Thread.interrupted();
                    b();
                } else {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r8 == null) goto L_0x0037;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final o.setMethod a(boolean r5) {
            /*
                r4 = this;
                r0 = r4
                boolean r0 = r0.c()
                if (r0 == 0) goto L_0x000d
                r0 = r4
                r1 = r5
                o.setMethod r0 = r0.d(r1)
                return r0
            L_0x000d:
                r0 = r5
                if (r0 == 0) goto L_0x0037
                r0 = r4
                o.setRequestBodyPlainText r0 = r0.b
                r6 = r0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.setRequestBodyPlainText.b
                r1 = r6
                r2 = 0
                java.lang.Object r0 = r0.getAndSet(r1, r2)
                o.setMethod r0 = (o.setMethod) r0
                r7 = r0
                r0 = r7
                r8 = r0
                r0 = r7
                if (r0 != 0) goto L_0x002f
                r0 = r6
                o.setMethod r0 = r0.e()
                r8 = r0
            L_0x002f:
                r0 = r8
                r7 = r0
                r0 = r8
                if (r0 != 0) goto L_0x0045
            L_0x0037:
                r0 = r4
                o.setError r0 = o.setError.this
                o.isResponseBodyPlainText r0 = r0.f
                java.lang.Object r0 = r0.c()
                o.setMethod r0 = (o.setMethod) r0
                r7 = r0
            L_0x0045:
                r0 = r7
                r8 = r0
                r0 = r7
                if (r0 != 0) goto L_0x0053
                r0 = r4
                r1 = 1
                o.setMethod r0 = r0.e(r1)
                r8 = r0
            L_0x0053:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setError.write.a(boolean):o.setMethod");
        }

        public final boolean a(IconCompatParcelizer iconCompatParcelizer) {
            IconCompatParcelizer iconCompatParcelizer2 = this.c;
            boolean z = iconCompatParcelizer2 == IconCompatParcelizer.CPU_ACQUIRED;
            if (z) {
                setError.e.addAndGet(setError.this, 4398046511104L);
            }
            if (iconCompatParcelizer2 != iconCompatParcelizer) {
                this.c = iconCompatParcelizer;
            }
            return z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
            a(o.setError.IconCompatParcelizer.TERMINATED);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
            return;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 263
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setError.write.run():void");
        }
    }

    public setError(int i, int i2, long j, String str) {
        this.d = i;
        this.h = i2;
        this.j = j;
        this.g = str;
        if (i > 0) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.i = new isResponseBodyPlainText();
                        this.f = new isResponseBodyPlainText();
                        this.parkedWorkersStack = 0;
                        this.m = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Idle worker keep alive time ");
                    sb.append(j);
                    sb.append(" must be positive");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder("Max pool size ");
                sb2.append(i2);
                sb2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(i2);
            sb3.append(" should be greater than or equals to core pool size ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder("Core pool size ");
        sb4.append(i);
        sb4.append(" should be at least 1");
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    private final int a() {
        synchronized (this.m) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            boolean z = false;
            int i3 = i2;
            if (i2 < 0) {
                i3 = 0;
            }
            if (i3 >= this.d) {
                return 0;
            }
            if (i >= this.h) {
                return 0;
            }
            int i4 = ((int) (this.controlState & 2097151)) + 1;
            if (i4 > 0 && this.m.get(i4) == null) {
                write write2 = new write(i4);
                this.m.set(i4, write2);
                if (i4 == ((int) (2097151 & e.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    write2.start();
                    return i3 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static setMethod b(Runnable runnable, setPath$com_github_ChuckerTeam_Chucker_library setpath_com_github_chuckerteam_chucker_library) {
        long a2 = setRequestContentType.f.a();
        if (!(runnable instanceof setMethod)) {
            return new setRequestHeaders.com_github_ChuckerTeam_Chucker_library(runnable, a2, setpath_com_github_chuckerteam_chucker_library);
        }
        setMethod setmethod = (setMethod) runnable;
        setmethod.j = a2;
        setmethod.g = setpath_com_github_chuckerteam_chucker_library;
        return setmethod;
    }

    public static void b(setMethod setmethod) {
        try {
            setmethod.run();
            if (ForgotEmailPassPresenter.e != null) {
            }
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                if (ForgotEmailPassPresenter.e == null) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static int c(write write2) {
        Object obj = write2.nextParkedWorker;
        while (obj != c) {
            if (obj == null) {
                return 0;
            }
            write write3 = (write) obj;
            int i = write3.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = write3.nextParkedWorker;
        }
        return -1;
    }

    private final write c() {
        while (true) {
            long j = this.parkedWorkersStack;
            write write2 = this.m.get((int) (2097151 & j));
            if (write2 == null) {
                return null;
            }
            int c2 = c(write2);
            if (c2 >= 0 && b.compareAndSet(this, j, ((long) c2) | ((2097152 + j) & -2097152))) {
                write2.nextParkedWorker = c;
                return write2;
            }
        }
    }

    private final write d() {
        Thread currentThread = Thread.currentThread();
        write write2 = currentThread instanceof write ? (write) currentThread : null;
        write write3 = null;
        if (write2 != null) {
            write3 = null;
            if (subscribeReservationRescheduleEvent.b(setError.this, this)) {
                write3 = write2;
            }
        }
        return write3;
    }

    private static setMethod d(write write2, setMethod setmethod, boolean z) {
        if (!(write2 == null || write2.c == IconCompatParcelizer.TERMINATED)) {
            if (setmethod.g.a() == 0 && write2.c == IconCompatParcelizer.BLOCKING) {
                return setmethod;
            }
            write2.a = true;
            return write2.b.c(setmethod, z);
        }
        return setmethod;
    }

    private final void d(boolean z) {
        boolean z2;
        write c2;
        long addAndGet = e.addAndGet(this, 2097152);
        if (!z) {
            while (true) {
                write c3 = c();
                if (c3 != null) {
                    if (write.e.compareAndSet(c3, -1, 0)) {
                        LockSupport.unpark(c3);
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2 && !d(addAndGet)) {
                do {
                    c2 = c();
                    if (c2 == null) {
                        return;
                    }
                } while (!write.e.compareAndSet(c2, -1, 0));
                LockSupport.unpark(c2);
            }
        }
    }

    private final boolean d(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        int i2 = i;
        if (i < 0) {
            i2 = 0;
        }
        if (i2 >= this.d) {
            return false;
        }
        int a2 = a();
        if (a2 == 1 && this.d > 1) {
            a();
        }
        return a2 > 0;
    }

    private final boolean d(setMethod setmethod) {
        boolean z = true;
        if (setmethod.g.a() != 1) {
            z = false;
        }
        return z ? this.f.b(setmethod) : this.i.b(setmethod);
    }

    public final void a(Runnable runnable, setPath$com_github_ChuckerTeam_Chucker_library setpath_com_github_chuckerteam_chucker_library, boolean z) {
        setMethod b2 = b(runnable, setpath_com_github_chuckerteam_chucker_library);
        write d = d();
        setMethod d2 = d(d, b2, z);
        if (d2 == null || d(d2)) {
            boolean z2 = z && d != null;
            if (b2.g.a() != 0) {
                d(z2);
            } else if (!z2) {
                e();
            }
        } else {
            throw new RejectedExecutionException(subscribeReservationRescheduleEvent.b(this.g, " was terminated"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        boolean z = false;
        if (l.compareAndSet(this, 0, 1)) {
            write d = d();
            synchronized (this.m) {
                i = (int) (this.controlState & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    write write2 = this.m.get(i2);
                    subscribeReservationRescheduleEvent.c(write2);
                    write write3 = write2;
                    if (write3 != d) {
                        while (write3.isAlive()) {
                            LockSupport.unpark(write3);
                            write3.join(10000);
                        }
                        IconCompatParcelizer iconCompatParcelizer = write3.c;
                        if (RateTransactionPresenter.c()) {
                            if (!(iconCompatParcelizer == IconCompatParcelizer.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        write3.b.c(this.f);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f.d();
            this.i.d();
            while (true) {
                setMethod a2 = d == null ? null : d.a(true);
                setMethod setmethod = a2;
                if (a2 == null) {
                    setMethod c2 = this.i.c();
                    setmethod = c2;
                    if (c2 == null) {
                        setMethod c3 = this.f.c();
                        setmethod = c3;
                        if (c3 == null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                b(setmethod);
            }
            if (d != null) {
                d.a(IconCompatParcelizer.TERMINATED);
            }
            if (RateTransactionPresenter.c()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.d) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public final void d(write write2, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            int i4 = i3;
            if (i3 == i) {
                i4 = i2 == 0 ? c(write2) : i2;
            }
            if (i4 >= 0 && b.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) i4))) {
                return;
            }
        }
    }

    public final void e() {
        boolean z;
        write c2;
        while (true) {
            write c3 = c();
            if (c3 != null) {
                if (write.e.compareAndSet(c3, -1, 0)) {
                    LockSupport.unpark(c3);
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && !d(this.controlState)) {
            do {
                c2 = c();
                if (c2 == null) {
                    return;
                }
            } while (!write.e.compareAndSet(c2, -1, 0));
            LockSupport.unpark(c2);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(runnable, setRequestBody.e, false);
    }

    @Override // java.lang.Object
    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        int length = this.m.length();
        int i7 = 0;
        int i8 = 0;
        if (1 < length) {
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            i4 = 0;
            int i12 = 1;
            while (true) {
                int i13 = i12 + 1;
                write write2 = this.m.get(i12);
                if (write2 == null) {
                    i6 = i8;
                    i3 = i9;
                    i5 = i10;
                    i = i11;
                } else {
                    setRequestBodyPlainText setrequestbodyplaintext = write2.b;
                    int i14 = setrequestbodyplaintext.lastScheduledTask != null ? (setrequestbodyplaintext.producerIndex - setrequestbodyplaintext.consumerIndex) + 1 : setrequestbodyplaintext.producerIndex - setrequestbodyplaintext.consumerIndex;
                    int i15 = RemoteActionCompatParcelizer.d[write2.c.ordinal()];
                    if (i15 == 1) {
                        i6 = i8 + 1;
                        i = i11;
                        i5 = i10;
                        i3 = i9;
                    } else if (i15 == 2) {
                        i3 = i9 + 1;
                        ArrayList arrayList2 = arrayList;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i14);
                        sb.append('b');
                        arrayList2.add(sb.toString());
                        i6 = i8;
                        i5 = i10;
                        i = i11;
                    } else if (i15 == 3) {
                        i5 = i10 + 1;
                        ArrayList arrayList3 = arrayList;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i14);
                        sb2.append('c');
                        arrayList3.add(sb2.toString());
                        i6 = i8;
                        i3 = i9;
                        i = i11;
                    } else if (i15 == 4) {
                        int i16 = i4 + 1;
                        i6 = i8;
                        i3 = i9;
                        i5 = i10;
                        i = i11;
                        i4 = i16;
                        if (i14 > 0) {
                            ArrayList arrayList4 = arrayList;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i14);
                            sb3.append('d');
                            arrayList4.add(sb3.toString());
                            i6 = i8;
                            i3 = i9;
                            i5 = i10;
                            i = i11;
                            i4 = i16;
                        }
                    } else if (i15 != 5) {
                        i6 = i8;
                        i3 = i9;
                        i5 = i10;
                        i = i11;
                    } else {
                        i = i11 + 1;
                        i6 = i8;
                        i3 = i9;
                        i5 = i10;
                    }
                }
                if (i13 >= length) {
                    break;
                }
                i8 = i6;
                i9 = i3;
                i10 = i5;
                i11 = i;
                i12 = i13;
            }
            i7 = i5;
            i2 = i6;
        } else {
            i2 = 0;
            i3 = 0;
            i = 0;
            i4 = 0;
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        sb4.append('@');
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.d);
        sb4.append(", max = ");
        sb4.append(this.h);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i7);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i2);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.i.e());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.e());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.d - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
