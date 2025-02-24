package o;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.CustDataResponse;
import o.getIbanFlag;
import o.getTxnPurposeValue;
import o.onFindViewById;
import o.setBankStatesName;
/* loaded from: classes-dex2jar.jar:o/getDaftarTransferOutputList.class */
public final class getDaftarTransferOutputList<R> implements CustDataResponse$Account$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver<R>, getTxnPurposeValue.RemoteActionCompatParcelizer {
    private static final read g = new read();
    getIbanFlag<?> a;
    final IconCompatParcelizer b;
    setNextCategoryCd c;
    final setAlert d;
    CustDataResponse$Account$$Parcelable<R> e;
    private final setAlert f;
    boolean h;
    boolean i;
    GlideException j;
    private final read k;
    private boolean l;
    private boolean m;
    private boolean n;

    /* renamed from: o */
    private final setDaftarTransferOutputList f145o;
    private final AtomicInteger p;
    private setCode q;
    private volatile boolean r;
    private setIbanFlag<?> s;
    private final onFindViewById.write<getDaftarTransferOutputList<?>> t;
    private boolean u;
    private final setAlert v;
    private final setBankStatesName w;
    private final setAlert x;
    private final getIbanFlag.read y;
    private boolean z;

    /* loaded from: classes-dex2jar.jar:o/getDaftarTransferOutputList$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Iterable<getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver> {
        final List<getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver> b;

        IconCompatParcelizer() {
            this(new ArrayList(2));
        }

        IconCompatParcelizer(List<getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver> list) {
            this.b = list;
        }

        @Override // java.lang.Iterable
        public final Iterator<getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver> iterator() {
            return this.b.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getDaftarTransferOutputList$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements Runnable {
        private final GetPPUNumberResponse$$Parcelable b;

        RemoteActionCompatParcelizer(GetPPUNumberResponse$$Parcelable getPPUNumberResponse$$Parcelable) {
            getDaftarTransferOutputList.this = r4;
            this.b = getPPUNumberResponse$$Parcelable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.b.c()) {
                synchronized (getDaftarTransferOutputList.this) {
                    if (getDaftarTransferOutputList.this.b.b.contains(new getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver(this.b, getReceiverPostalCode.c()))) {
                        getDaftarTransferOutputList.this.a.c();
                        getDaftarTransferOutputList getdaftartransferoutputlist = getDaftarTransferOutputList.this;
                        this.b.a(getdaftartransferoutputlist.a, getdaftartransferoutputlist.c, getdaftartransferoutputlist.h);
                        getDaftarTransferOutputList.this.d(this.b);
                    }
                    getDaftarTransferOutputList.this.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getDaftarTransferOutputList$read.class */
    public static final class read {
        read() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getDaftarTransferOutputList$write.class */
    public final class write implements Runnable {
        private final GetPPUNumberResponse$$Parcelable b;

        write(GetPPUNumberResponse$$Parcelable getPPUNumberResponse$$Parcelable) {
            getDaftarTransferOutputList.this = r4;
            this.b = getPPUNumberResponse$$Parcelable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.b.c()) {
                synchronized (getDaftarTransferOutputList.this) {
                    if (getDaftarTransferOutputList.this.b.b.contains(new getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver(this.b, getReceiverPostalCode.c()))) {
                        getDaftarTransferOutputList getdaftartransferoutputlist = getDaftarTransferOutputList.this;
                        this.b.d(getdaftartransferoutputlist.j);
                    }
                    getDaftarTransferOutputList.this.a();
                }
            }
        }
    }

    public getDaftarTransferOutputList(setAlert setalert, setAlert setalert2, setAlert setalert3, setAlert setalert4, setDaftarTransferOutputList setdaftartransferoutputlist, getIbanFlag.read read2, onFindViewById.write<getDaftarTransferOutputList<?>> write2) {
        this(setalert, setalert2, setalert3, setalert4, setdaftartransferoutputlist, read2, write2, g);
    }

    private getDaftarTransferOutputList(setAlert setalert, setAlert setalert2, setAlert setalert3, setAlert setalert4, setDaftarTransferOutputList setdaftartransferoutputlist, getIbanFlag.read read2, onFindViewById.write<getDaftarTransferOutputList<?>> write2, read read3) {
        this.b = new IconCompatParcelizer();
        this.w = new setBankStatesName.write();
        this.p = new AtomicInteger();
        this.d = setalert;
        this.x = setalert2;
        this.v = setalert3;
        this.f = setalert4;
        this.f145o = setdaftartransferoutputlist;
        this.y = read2;
        this.t = write2;
        this.k = read3;
    }

    private boolean b() {
        return this.n || this.m || this.r;
    }

    private void c() {
        synchronized (this) {
            if (this.q != null) {
                this.b.b.clear();
                this.q = null;
                this.a = null;
                this.s = null;
                this.n = false;
                this.r = false;
                this.m = false;
                this.h = false;
                CustDataResponse$Account$$Parcelable<R> custDataResponse$Account$$Parcelable = this.e;
                if (custDataResponse$Account$$Parcelable.r.c(false)) {
                    custDataResponse$Account$$Parcelable.b();
                }
                this.e = null;
                this.j = null;
                this.c = null;
                this.t.c(this);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    private void c(int i) {
        getIbanFlag<?> getibanflag;
        synchronized (this) {
            if (!b()) {
                throw new IllegalArgumentException("Not yet complete!");
            } else if (this.p.getAndAdd(i) == 0 && (getibanflag = this.a) != null) {
                getibanflag.c();
            }
        }
    }

    private void f() {
        if (!b()) {
            this.r = true;
            CustDataResponse$Account$$Parcelable<R> custDataResponse$Account$$Parcelable = this.e;
            custDataResponse$Account$$Parcelable.f = true;
            CustDataResponse.Phone phone = custDataResponse$Account$$Parcelable.b;
            if (phone != null) {
                phone.d();
            }
            this.f145o.a(this, this.q);
        }
    }

    final void a() {
        getIbanFlag<?> getibanflag;
        synchronized (this) {
            this.w.c();
            if (b()) {
                int decrementAndGet = this.p.decrementAndGet();
                if (!(decrementAndGet >= 0)) {
                    throw new IllegalArgumentException("Can't decrement below 0");
                } else if (decrementAndGet == 0) {
                    getibanflag = this.a;
                    c();
                } else {
                    getibanflag = null;
                }
            } else {
                throw new IllegalArgumentException("Not yet complete!");
            }
        }
        if (getibanflag != null) {
            getibanflag.j();
        }
    }

    @Override // o.CustDataResponse$Account$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(CustDataResponse$Account$$Parcelable<?> custDataResponse$Account$$Parcelable) {
        d().execute(custDataResponse$Account$$Parcelable);
    }

    @Override // o.CustDataResponse$Account$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(GlideException glideException) {
        synchronized (this) {
            this.j = glideException;
        }
        synchronized (this) {
            this.w.c();
            if (this.r) {
                c();
            } else if (this.b.b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!this.n) {
                this.n = true;
                setCode setcode = this.q;
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(new ArrayList(this.b.b));
                c(iconCompatParcelizer.b.size() + 1);
                this.f145o.e(this, setcode, null);
                Iterator<getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver> it = iconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
                    next.e.execute(new write(next.b));
                }
                a();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
    }

    public final void c(GetPPUNumberResponse$$Parcelable getPPUNumberResponse$$Parcelable, Executor executor) {
        synchronized (this) {
            this.w.c();
            this.b.b.add(new getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver(getPPUNumberResponse$$Parcelable, executor));
            if (this.m) {
                c(1);
                executor.execute(new RemoteActionCompatParcelizer(getPPUNumberResponse$$Parcelable));
            } else if (this.n) {
                c(1);
                executor.execute(new write(getPPUNumberResponse$$Parcelable));
            } else if (!(!this.r)) {
                throw new IllegalArgumentException("Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.CustDataResponse$Account$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(setIbanFlag<R> setibanflag, setNextCategoryCd setnextcategorycd, boolean z) {
        synchronized (this) {
            this.s = setibanflag;
            this.c = setnextcategorycd;
            this.h = z;
        }
        synchronized (this) {
            this.w.c();
            if (this.r) {
                this.s.b();
                c();
            } else if (this.b.b.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            } else if (!this.m) {
                this.a = new getIbanFlag<>(this.s, this.l, true, this.q, this.y);
                this.m = true;
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(new ArrayList(this.b.b));
                c(iconCompatParcelizer.b.size() + 1);
                this.f145o.e(this, this.q, this.a);
                Iterator<getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver> it = iconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
                    next.e.execute(new RemoteActionCompatParcelizer(next.b));
                }
                a();
            } else {
                throw new IllegalStateException("Already have resource");
            }
        }
    }

    public final getDaftarTransferOutputList<R> d(setCode setcode, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (this) {
            this.q = setcode;
            this.l = z;
            this.z = z2;
            this.u = z3;
            this.i = z4;
        }
        return this;
    }

    public setAlert d() {
        return this.z ? this.v : this.u ? this.f : this.x;
    }

    public final void d(GetPPUNumberResponse$$Parcelable getPPUNumberResponse$$Parcelable) {
        boolean z;
        synchronized (this) {
            this.w.c();
            this.b.b.remove(new getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver(getPPUNumberResponse$$Parcelable, getReceiverPostalCode.c()));
            if (this.b.b.isEmpty()) {
                f();
                if (!this.m && !this.n) {
                    z = false;
                    if (z && this.p.get() == 0) {
                        c();
                    }
                }
                z = true;
                if (z) {
                    c();
                }
            }
        }
    }

    @Override // o.getTxnPurposeValue.RemoteActionCompatParcelizer
    public final setBankStatesName j_() {
        return this.w;
    }
}
