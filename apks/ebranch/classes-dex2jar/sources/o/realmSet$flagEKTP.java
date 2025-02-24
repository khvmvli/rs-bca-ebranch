package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import o.realmGet;
import o.realmGet$name;
import o.realmGet$religionOthers;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagEKTP.class */
public final class realmSet$flagEKTP implements realmSet$fotoNpwp {
    private final realmSet$hmPhoneCodeNumber a;
    private final realmGet$incomeSourceValue b;
    private final Lock c;
    private realmGet$jobValue d;
    private final Context e;
    private int i;
    private int j;
    private setExpID k;
    private realmGet.nomorWarkat l;
    private boolean m;
    private boolean n;

    /* renamed from: o */
    private boolean f187o;
    private boolean p;
    private boolean q;
    private final realmGet$name.IconCompatParcelizer r;
    private final Map s;
    private final setDob t;
    private int g = 0;
    private final Bundle h = new Bundle();
    private final Set f = new HashSet();
    private final ArrayList v = new ArrayList();

    public realmSet$flagEKTP(realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber, setDob setdob, Map map, realmGet$incomeSourceValue realmget_incomesourcevalue, realmGet$name.IconCompatParcelizer iconCompatParcelizer, Lock lock, Context context) {
        this.a = realmset_hmphonecodenumber;
        this.t = setdob;
        this.s = map;
        this.b = realmget_incomesourcevalue;
        this.r = iconCompatParcelizer;
        this.c = lock;
        this.e = context;
    }

    private static final String a(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    private final void a() {
        this.a.e();
        realmSet$hmHouseStatus.e().execute(new Runnable() { // from class: o.realmSet$currentPage
            @Override // java.lang.Runnable
            public final void run() {
                realmSet$flagEKTP realmset_flagektp = realmSet$flagEKTP.this;
                realmset_flagektp.b.e(realmset_flagektp.e);
            }
        });
        realmGet.nomorWarkat nomorwarkat = this.l;
        if (nomorwarkat != null) {
            if (this.p) {
                nomorwarkat.c((setExpID) setFotoKtp.b(this.k), this.q);
            }
            a(false);
        }
        for (realmGet$name.read read : this.a.e.keySet()) {
            ((realmGet$name$MediaBrowserCompat$SearchResultReceiver) setFotoKtp.b((realmGet$name$MediaBrowserCompat$SearchResultReceiver) this.a.a.get(read))).e();
        }
        this.a.i.e(this.h.isEmpty() ? null : this.h);
    }

    public final void a(realmGet$jobValue realmget_jobvalue, realmGet$name realmget_name, boolean z) {
        int c = realmget_name.b().c();
        if ((!z || realmget_jobvalue.b() || this.b.c(realmget_jobvalue.d()) != null) && (this.d == null || c < this.i)) {
            this.d = realmget_jobvalue;
            this.i = c;
        }
        realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber = this.a;
        realmset_hmphonecodenumber.e.put(realmget_name.d(), realmget_jobvalue);
    }

    private final void a(boolean z) {
        realmGet.nomorWarkat nomorwarkat = this.l;
        if (nomorwarkat != null) {
            if (nomorwarkat.j() && z) {
                nomorwarkat.F();
            }
            nomorwarkat.e();
            setDob setdob = (setDob) setFotoKtp.b(this.t);
            this.k = null;
        }
    }

    public final void c(realmGet$jobValue realmget_jobvalue) {
        j();
        a(!realmget_jobvalue.b());
        this.a.e(realmget_jobvalue);
        this.a.i.e(realmget_jobvalue);
    }

    public final boolean c(int i) {
        if (this.g == i) {
            return true;
        }
        Log.w("GACConnecting", this.a.g.f());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.j;
        Log.w("GACConnecting", "mRemainingConnections=" + i2);
        String a = a(this.g);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + a + " but received callback for step " + a(i), new Exception());
        c(new realmGet$jobValue(8, null));
        return false;
    }

    public static /* synthetic */ void d(realmSet$flagEKTP realmset_flagektp, realmGet.kodeBank kodebank) {
        if (realmset_flagektp.c(0)) {
            realmGet$jobValue d = kodebank.d();
            if (d.c()) {
                setMaritalStatus setmaritalstatus = (setMaritalStatus) setFotoKtp.b(kodebank.b());
                realmGet$jobValue c = setmaritalstatus.c();
                if (!c.c()) {
                    String valueOf = String.valueOf(String.valueOf(c));
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    realmset_flagektp.c(c);
                    return;
                }
                realmset_flagektp.m = true;
                realmset_flagektp.k = (setExpID) setFotoKtp.b(setmaritalstatus.e());
                realmset_flagektp.p = setmaritalstatus.d();
                realmset_flagektp.q = setmaritalstatus.a();
                realmset_flagektp.i();
            } else if (realmset_flagektp.e(d)) {
                realmset_flagektp.e();
                realmset_flagektp.i();
            } else {
                realmset_flagektp.c(d);
            }
        }
    }

    public final void e() {
        this.n = false;
        this.a.g.c = Collections.emptySet();
        for (realmGet$name.read read : this.f) {
            if (!this.a.e.containsKey(read)) {
                realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber = this.a;
                realmset_hmphonecodenumber.e.put(read, new realmGet$jobValue(17, null));
            }
        }
    }

    public final boolean e(realmGet$jobValue realmget_jobvalue) {
        return this.f187o && !realmget_jobvalue.b();
    }

    public final boolean h() {
        int i = this.j - 1;
        this.j = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.a.g.f());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            c(new realmGet$jobValue(8, null));
            return false;
        }
        realmGet$jobValue realmget_jobvalue = this.d;
        if (realmget_jobvalue == null) {
            return true;
        }
        this.a.h = this.i;
        c(realmget_jobvalue);
        return false;
    }

    public static /* synthetic */ Set i(realmSet$flagEKTP realmset_flagektp) {
        Set set;
        setDob setdob = realmset_flagektp.t;
        if (setdob == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(setdob.e());
            Map j = realmset_flagektp.t.j();
            for (realmGet$name realmget_name : j.keySet()) {
                realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber = realmset_flagektp.a;
                if (!realmset_hmphonecodenumber.e.containsKey(realmget_name.d())) {
                    hashSet.addAll(((setHmProvince) j.get(realmget_name)).e);
                }
            }
            set = hashSet;
        }
        return set;
    }

    public final void i() {
        if (this.j == 0) {
            if (!this.n || this.m) {
                ArrayList arrayList = new ArrayList();
                this.g = 1;
                this.j = this.a.a.size();
                for (realmGet$name.read read : this.a.a.keySet()) {
                    if (!this.a.e.containsKey(read)) {
                        arrayList.add((realmGet$name$MediaBrowserCompat$SearchResultReceiver) this.a.a.get(read));
                    } else if (h()) {
                        a();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.v.add(realmSet$hmHouseStatus.e().submit(new realmSet$flagMB(arrayList) { // from class: o.realmSet$dollarCurrCode
                        private final ArrayList c;

                        {
                            this.c = r6;
                        }

                        @Override // o.realmSet$flagMB
                        public final void a() {
                            realmSet$flagEKTP realmset_flagektp = realmSet$flagEKTP.this;
                            realmset_flagektp.a.g.c = realmSet$flagEKTP.i(realmset_flagektp);
                            ArrayList arrayList2 = this.c;
                            int size = arrayList2.size();
                            for (int i = 0; i < size; i++) {
                                realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = (realmGet$name$MediaBrowserCompat$SearchResultReceiver) arrayList2.get(i);
                                realmSet$flagEKTP realmset_flagektp2 = realmSet$flagEKTP.this;
                                realmget_name_mediabrowsercompat_searchresultreceiver.a(realmset_flagektp2.k, realmset_flagektp2.a.g.c);
                            }
                        }
                    }));
                }
            }
        }
    }

    private final void j() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.v.clear();
    }

    @Override // o.realmSet$fotoNpwp
    public final realmGet$religionOthers.write a(realmGet$religionOthers.write write) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // o.realmSet$fotoNpwp
    public final void b() {
    }

    @Override // o.realmSet$fotoNpwp
    public final void b(realmGet$jobValue realmget_jobvalue, realmGet$name realmget_name, boolean z) {
        if (c(1)) {
            a(realmget_jobvalue, realmget_name, z);
            if (h()) {
                a();
            }
        }
    }

    @Override // o.realmSet$fotoNpwp
    public final realmGet$religionOthers.write c(realmGet$religionOthers.write write) {
        this.a.g.e.add(write);
        return write;
    }

    @Override // o.realmSet$fotoNpwp
    public final boolean c() {
        j();
        a(true);
        this.a.e((realmGet$jobValue) null);
        return true;
    }

    @Override // o.realmSet$fotoNpwp
    public final void d() {
        this.a.e.clear();
        this.n = false;
        this.d = null;
        this.g = 0;
        this.f187o = true;
        this.m = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (realmGet$name realmget_name : this.s.keySet()) {
            realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = (realmGet$name$MediaBrowserCompat$SearchResultReceiver) setFotoKtp.b((realmGet$name$MediaBrowserCompat$SearchResultReceiver) this.a.a.get(realmget_name.d()));
            z |= realmget_name.b().c() == 1;
            boolean booleanValue = ((Boolean) this.s.get(realmget_name)).booleanValue();
            if (realmget_name_mediabrowsercompat_searchresultreceiver.n()) {
                this.n = true;
                if (booleanValue) {
                    this.f.add(realmget_name.d());
                } else {
                    this.f187o = false;
                }
            }
            hashMap.put(realmget_name_mediabrowsercompat_searchresultreceiver, new realmSet$createdAt(this, realmget_name, booleanValue));
        }
        if (z) {
            this.n = false;
        }
        if (this.n) {
            setFotoKtp.b(this.t);
            setFotoKtp.b(this.r);
            this.t.c(Integer.valueOf(System.identityHashCode(this.a.g)));
            realmSet$emailIB realmset_emailib = new Object(null) { // from class: o.realmSet$emailIB
                @Override // o.realmGet$resProvince
                public final void b(realmGet$jobValue realmget_jobvalue) {
                    realmSet$flagEKTP.this.c.lock();
                    try {
                        if (realmSet$flagEKTP.this.e(realmget_jobvalue)) {
                            realmSet$flagEKTP.this.e();
                            realmSet$flagEKTP.this.i();
                        } else {
                            realmSet$flagEKTP.this.c(realmget_jobvalue);
                        }
                    } finally {
                        realmSet$flagEKTP.this.c.unlock();
                    }
                }

                @Override // o.realmGet$resCountry
                public final void e(int i) {
                }

                @Override // o.realmGet$resCountry
                public final void e(Bundle bundle) {
                    setDob setdob = (setDob) setFotoKtp.b(realmSet$flagEKTP.this.t);
                    ((realmGet.nomorWarkat) setFotoKtp.b(realmSet$flagEKTP.this.l)).d(new realmSet$flagDifResidency(realmSet$flagEKTP.this));
                }
            };
            realmGet$name.IconCompatParcelizer iconCompatParcelizer = this.r;
            Context context = this.e;
            realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber = this.a;
            setDob setdob = this.t;
            this.l = iconCompatParcelizer.a(context, realmset_hmphonecodenumber.g.e(), setdob, setdob.d(), realmset_emailib, realmset_emailib);
        }
        this.j = this.a.a.size();
        this.v.add(realmSet$hmHouseStatus.e().submit(new realmSet$debitCardType(this, hashMap)));
    }

    @Override // o.realmSet$fotoNpwp
    public final void d(int i) {
        c(new realmGet$jobValue(8, null));
    }

    @Override // o.realmSet$fotoNpwp
    public final void d(Bundle bundle) {
        if (c(1)) {
            if (bundle != null) {
                this.h.putAll(bundle);
            }
            if (h()) {
                a();
            }
        }
    }
}
