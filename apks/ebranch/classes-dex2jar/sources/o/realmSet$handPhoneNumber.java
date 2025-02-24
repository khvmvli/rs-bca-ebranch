package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import o.realmGet$name;
import o.realmGet$occupation;
import o.realmGet$religionOthers;
/* loaded from: classes-dex2jar.jar:o/realmSet$handPhoneNumber.class */
public final class realmSet$handPhoneNumber extends realmGet$occupation implements realmSet$jobOthers {
    final setDob a;
    realmSet$incomeSourceValue b;
    Set c;
    final Map d;
    private final Lock f;
    Set g;
    final realmSet$religionOthers h;
    final Map i;
    final realmGet$name.IconCompatParcelizer j;
    private final Looper k;
    private final setKitasKitapNumber l;
    private final Context n;

    /* renamed from: o */
    private final int f188o;
    private final realmGet$jobOthers p;
    private volatile boolean q;
    private long r;
    private long s;
    private final realmSet$fotoKtp t;
    private final setJobValue v;
    private Integer w;
    private final realmGet$resRW x;
    private final ArrayList y;
    private realmSet$incomeSourceOthers m = null;
    final Queue e = new LinkedList();

    public realmSet$handPhoneNumber(Context context, Lock lock, Looper looper, setDob setdob, realmGet$jobOthers realmget_jobothers, realmGet$name.IconCompatParcelizer iconCompatParcelizer, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.s = true != getNoWarkatTransaksi.c() ? 120000 : 10000;
        this.r = 5000;
        this.c = new HashSet();
        this.x = new realmGet$resRW();
        this.w = null;
        this.g = null;
        realmSet$flagIB realmset_flagib = new setJobValue() { // from class: o.realmSet$flagIB
            @Override // o.setJobValue
            public final boolean j() {
                return realmSet$handPhoneNumber.this.c();
            }
        };
        this.v = realmset_flagib;
        this.n = context;
        this.f = lock;
        this.l = new setKitasKitapNumber(looper, realmset_flagib);
        this.k = looper;
        this.t = new realmSet$fotoKtp(this, looper);
        this.p = realmget_jobothers;
        this.f188o = i;
        if (i >= 0) {
            this.w = Integer.valueOf(i2);
        }
        this.i = map;
        this.d = map2;
        this.y = arrayList;
        this.h = new realmSet$religionOthers();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.l.e((realmGet$occupation.IconCompatParcelizer) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.l.b((realmGet$occupation.read) it2.next());
        }
        this.a = setdob;
        this.j = iconCompatParcelizer;
    }

    public static int a(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = (realmGet$name$MediaBrowserCompat$SearchResultReceiver) it.next();
            z2 |= realmget_name_mediabrowsercompat_searchresultreceiver.n();
            z3 |= realmget_name_mediabrowsercompat_searchresultreceiver.g();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    private final void b(int i) {
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = c(this.w.intValue());
            throw new IllegalStateException("Cannot use sign-in mode: " + c(i) + ". Mode was already set to " + c);
        }
        if (this.m == null) {
            boolean z = false;
            boolean z2 = false;
            for (realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver : this.d.values()) {
                z |= realmget_name_mediabrowsercompat_searchresultreceiver.n();
                z2 |= realmget_name_mediabrowsercompat_searchresultreceiver.g();
            }
            int intValue = this.w.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    this.m = realmSet$businessField.e(this.n, this, this.f, this.k, this.p, this.d, this.a, this.i, this.j, this.y);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.m = new realmSet$hmPhoneCodeNumber(this.n, this, this.f, this.k, this.p, this.d, this.a, this.i, this.j, this.y, this);
        }
    }

    static String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* synthetic */ void d(realmSet$handPhoneNumber realmset_handphonenumber) {
        realmset_handphonenumber.f.lock();
        try {
            if (realmset_handphonenumber.h()) {
                realmset_handphonenumber.i();
            }
        } finally {
            realmset_handphonenumber.f.unlock();
        }
    }

    public static /* synthetic */ void e(realmSet$handPhoneNumber realmset_handphonenumber) {
        realmset_handphonenumber.f.lock();
        try {
            if (realmset_handphonenumber.q) {
                realmset_handphonenumber.i();
            }
        } finally {
            realmset_handphonenumber.f.unlock();
        }
    }

    private final void i() {
        this.l.e();
        ((realmSet$incomeSourceOthers) setFotoKtp.b(this.m)).a();
    }

    @Override // o.realmGet$occupation
    public final void a() {
        this.f.lock();
        try {
            this.h.b();
            realmSet$incomeSourceOthers realmset_incomesourceothers = this.m;
            if (realmset_incomesourceothers != null) {
                realmset_incomesourceothers.c();
            }
            this.x.c();
            for (realmGet$religionOthers.write write : this.e) {
                write.a((realmSet$oldCustFlag) null);
                write.b();
            }
            this.e.clear();
            if (this.m != null) {
                h();
                this.l.b();
            }
        } finally {
            this.f.unlock();
        }
    }

    @Override // o.realmGet$occupation
    public final void a(realmGet$occupation.read read) {
        this.l.b(read);
    }

    @Override // o.realmGet$occupation
    public final void b(realmGet$occupation.read read) {
        this.l.c(read);
    }

    @Override // o.realmGet$occupation
    @ResultIgnorabilityUnspecified
    public final <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, R extends realmGet$oldCustFlag, T extends realmGet$religionOthers.write<R, A>> T c(T t) {
        realmGet$name<?> a = t.a();
        boolean containsKey = this.d.containsKey(t.d());
        String c = a != null ? a.c() : "the API";
        setFotoKtp.d(containsKey, "GoogleApiClient is not configured to use " + c + " required for this call.");
        this.f.lock();
        try {
            realmSet$incomeSourceOthers realmset_incomesourceothers = this.m;
            if (realmset_incomesourceothers == null) {
                this.e.add(t);
            } else {
                t = (T) realmset_incomesourceothers.a(t);
            }
            return t;
        } finally {
            this.f.unlock();
        }
    }

    @Override // o.realmGet$occupation
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.n);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.q);
        printWriter.append(" mWorkQueue.size()=").print(this.e.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.h.b.size());
        realmSet$incomeSourceOthers realmset_incomesourceothers = this.m;
        if (realmset_incomesourceothers != null) {
            realmset_incomesourceothers.d(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
        if ((!r0) == false) goto L_0x007c;
     */
    @Override // o.realmGet$occupation
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void c(o.realmSet$officePostCode r5) {
        /*
            r4 = this;
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f
            r0.lock()
            r0 = r4
            java.util.Set r0 = r0.g     // Catch: all -> 0x00a1
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0028
            java.lang.Exception r0 = new java.lang.Exception     // Catch: all -> 0x00a1
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: all -> 0x00a1
            java.lang.String r0 = "GoogleApiClientImpl"
            java.lang.String r1 = "Attempted to remove pending transform when no transforms are registered."
            r2 = r5
            int r0 = android.util.Log.wtf(r0, r1, r2)     // Catch: all -> 0x00a1
            goto L_0x008b
        L_0x0028:
            r0 = r6
            r1 = r5
            boolean r0 = r0.remove(r1)     // Catch: all -> 0x00a1
            if (r0 != 0) goto L_0x0048
            java.lang.Exception r0 = new java.lang.Exception     // Catch: all -> 0x00a1
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: all -> 0x00a1
            java.lang.String r0 = "GoogleApiClientImpl"
            java.lang.String r1 = "Failed to remove pending transform - this may lead to memory leaks!"
            r2 = r5
            int r0 = android.util.Log.wtf(r0, r1, r2)     // Catch: all -> 0x00a1
            goto L_0x008b
        L_0x0048:
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f     // Catch: all -> 0x00a1
            r0.lock()     // Catch: all -> 0x00a1
            r0 = r4
            java.util.Set r0 = r0.g     // Catch: all -> 0x0095
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L_0x0066
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f     // Catch: all -> 0x00a1
            r0.unlock()     // Catch: all -> 0x00a1
            goto L_0x007c
        L_0x0066:
            r0 = r5
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0095
            r7 = r0
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f     // Catch: all -> 0x00a1
            r0.unlock()     // Catch: all -> 0x00a1
            r0 = r7
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x008b
        L_0x007c:
            r0 = r4
            o.realmSet$incomeSourceOthers r0 = r0.m     // Catch: all -> 0x00a1
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x008b
            r0 = r5
            r0.b()     // Catch: all -> 0x00a1
        L_0x008b:
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f
            r0.unlock()
            return
        L_0x0095:
            r5 = move-exception
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f     // Catch: all -> 0x00a1
            r0.unlock()     // Catch: all -> 0x00a1
            r0 = r5
            throw r0     // Catch: all -> 0x00a1
        L_0x00a1:
            r5 = move-exception
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f
            r0.unlock()
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$handPhoneNumber.c(o.realmSet$officePostCode):void");
    }

    @Override // o.realmGet$occupation
    public final boolean c() {
        realmSet$incomeSourceOthers realmset_incomesourceothers = this.m;
        return realmset_incomesourceothers != null && realmset_incomesourceothers.d();
    }

    @Override // o.realmGet$occupation
    public final void d() {
        this.f.lock();
        try {
            boolean z = true;
            int intValue = 2;
            if (this.f188o >= 0) {
                setFotoKtp.c(this.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(a(this.d.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            intValue = ((Integer) setFotoKtp.b(this.w)).intValue();
            this.f.lock();
            if (!(intValue == 3 || intValue == 1 || intValue == 2)) {
                z = false;
                setFotoKtp.d(z, "Illegal sign-in mode: " + intValue);
                b(intValue);
                i();
                this.f.unlock();
            }
            setFotoKtp.d(z, "Illegal sign-in mode: " + intValue);
            b(intValue);
            i();
            this.f.unlock();
        } finally {
            this.f.unlock();
        }
    }

    @Override // o.realmSet$jobOthers
    public final void d(int i, boolean z) {
        int i2 = i;
        if (i == 1) {
            if (!z && !this.q) {
                this.q = true;
                if (this.b == null && !getNoWarkatTransaksi.c()) {
                    try {
                        this.b = this.p.c(this.n.getApplicationContext(), new realmSet$job(this) { // from class: o.realmSet$handPhoneCountryCodeNumber
                            private final WeakReference a;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = new WeakReference(r6);
                            }

                            @Override // o.realmSet$job
                            public final void d() {
                                realmSet$handPhoneNumber realmset_handphonenumber = (realmSet$handPhoneNumber) this.a.get();
                                if (realmset_handphonenumber != null) {
                                    realmSet$handPhoneNumber.e(realmset_handphonenumber);
                                }
                            }
                        });
                    } catch (SecurityException e) {
                    }
                }
                realmSet$fotoKtp realmset_fotoktp = this.t;
                realmset_fotoktp.sendMessageDelayed(realmset_fotoktp.obtainMessage(1), this.s);
                realmSet$fotoKtp realmset_fotoktp2 = this.t;
                realmset_fotoktp2.sendMessageDelayed(realmset_fotoktp2.obtainMessage(2), this.r);
            }
            i2 = 1;
        }
        for (realmGet$purposePemRekOthers realmget_purposepemrekothers : (realmGet$purposePemRekOthers[]) this.h.b.toArray(new realmGet$purposePemRekOthers[0])) {
            realmget_purposepemrekothers.b(realmSet$religionOthers.c);
        }
        this.l.b(i2);
        this.l.b();
        if (i2 == 2) {
            i();
        }
    }

    @Override // o.realmGet$occupation
    public final Looper e() {
        return this.k;
    }

    @Override // o.realmGet$occupation
    @ResultIgnorabilityUnspecified
    public final <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, T extends realmGet$religionOthers.write<? extends realmGet$oldCustFlag, A>> T e(T t) {
        T t2;
        Map map = this.d;
        realmGet$name<?> a = t.a();
        boolean containsKey = map.containsKey(t.d());
        String c = a != null ? a.c() : "the API";
        setFotoKtp.d(containsKey, "GoogleApiClient is not configured to use " + c + " required for this call.");
        this.f.lock();
        try {
            realmSet$incomeSourceOthers realmset_incomesourceothers = this.m;
            if (realmset_incomesourceothers != null) {
                if (this.q) {
                    this.e.add(t);
                    while (true) {
                        t2 = t;
                        if (this.e.isEmpty()) {
                            break;
                        }
                        realmGet$religionOthers.write write = (realmGet$religionOthers.write) this.e.remove();
                        this.h.b(write);
                        write.a(Status.c);
                    }
                } else {
                    t2 = (T) realmset_incomesourceothers.c(t);
                }
                return t2;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f.unlock();
        }
    }

    @Override // o.realmSet$jobOthers
    public final void e(Bundle bundle) {
        while (!this.e.isEmpty()) {
            e((realmSet$handPhoneNumber) ((realmGet$religionOthers.write) this.e.remove()));
        }
        this.l.d(bundle);
    }

    @Override // o.realmSet$jobOthers
    public final void e(realmGet$jobValue realmget_jobvalue) {
        if (!this.p.a(this.n, realmget_jobvalue.d())) {
            h();
        }
        if (!this.q) {
            this.l.c(realmget_jobvalue);
            this.l.b();
        }
    }

    @Override // o.realmGet$occupation
    public final void e(realmSet$officePostCode realmset_officepostcode) {
        this.f.lock();
        try {
            if (this.g == null) {
                this.g = new HashSet();
            }
            this.g.add(realmset_officepostcode);
        } finally {
            this.f.unlock();
        }
    }

    public final String f() {
        StringWriter stringWriter = new StringWriter();
        c("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @ResultIgnorabilityUnspecified
    public final boolean h() {
        if (!this.q) {
            return false;
        }
        this.q = false;
        this.t.removeMessages(2);
        this.t.removeMessages(1);
        realmSet$incomeSourceValue realmset_incomesourcevalue = this.b;
        if (realmset_incomesourcevalue == null) {
            return true;
        }
        realmset_incomesourcevalue.e();
        this.b = null;
        return true;
    }
}
