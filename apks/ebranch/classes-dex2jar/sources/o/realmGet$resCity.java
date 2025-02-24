package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.BankTransfer$$Parcelable;
import o.realmGet$religionOthers;
import o.realmSet;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes-dex2jar.jar:o/realmGet$resCity.class */
public final class realmGet$resCity implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status c = new Status(4, "The user must be signed in to make this API call.");
    private static final Object g = new Object();
    private static realmGet$resCity h;
    public final realmGet$jobOthers b;
    public final Context d;
    @NotOnlyInitialized
    public final Handler e;
    private setHandPhoneNumber i;
    private final setJobOthers k;
    private setHandPhoneCountryCodeNumber n;
    private volatile boolean p;
    private long j = 10000;
    private boolean f = false;
    private final AtomicInteger m = new AtomicInteger(1);
    private final AtomicInteger l = new AtomicInteger(0);

    /* renamed from: o */
    private final Map f183o = new ConcurrentHashMap(5, 0.75f, 1);
    private realmSet$acctType q = null;
    private final Set t = new setThumbTintMode();
    private final Set r = new setThumbTintMode();

    private realmGet$resCity(Context context, Looper looper, realmGet$jobOthers realmget_jobothers) {
        boolean z = true;
        this.p = true;
        this.d = context;
        BankTransfer$$Parcelable.AnonymousClass1 r0 = new BankTransfer$$Parcelable.AnonymousClass1(looper, this);
        this.e = r0;
        this.b = realmget_jobothers;
        this.k = new setJobOthers(realmget_jobothers);
        PackageManager packageManager = context.getPackageManager();
        if (getSumberDanaTransaksi.d == null) {
            getSumberDanaTransaksi.d = Boolean.valueOf((!(Build.VERSION.SDK_INT >= 26) || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z);
        }
        if (getSumberDanaTransaksi.d.booleanValue()) {
            this.p = false;
        }
        r0.sendMessage(r0.obtainMessage(6));
    }

    @ResultIgnorabilityUnspecified
    public static realmGet$resCity a(Context context) {
        realmGet$resCity realmget_rescity;
        synchronized (g) {
            if (h == null) {
                h = new realmGet$resCity(context.getApplicationContext(), setEmailAddr.a().getLooper(), realmGet$jobOthers.a);
            }
            realmget_rescity = h;
        }
        return realmget_rescity;
    }

    @ResultIgnorabilityUnspecified
    private final realmSet$hmPhoneNumber b(realmGet$numberID realmget_numberid) {
        Map map = this.f183o;
        realmGet$religion e = realmget_numberid.e();
        realmSet$hmPhoneNumber realmset_hmphonenumber = (realmSet$hmPhoneNumber) map.get(e);
        realmSet$hmPhoneNumber realmset_hmphonenumber2 = realmset_hmphonenumber;
        if (realmset_hmphonenumber == null) {
            realmset_hmphonenumber2 = new realmSet$hmPhoneNumber(this, realmget_numberid);
            this.f183o.put(e, realmset_hmphonenumber2);
        }
        if (realmset_hmphonenumber2.e()) {
            this.r.add(e);
        }
        realmset_hmphonenumber2.g();
        return realmset_hmphonenumber2;
    }

    public static Status d(realmGet$religion realmget_religion, realmGet$jobValue realmget_jobvalue) {
        String str = realmget_religion.e.b;
        String valueOf = String.valueOf(realmget_jobvalue);
        StringBuilder sb = new StringBuilder("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(realmget_jobvalue, sb.toString());
    }

    private final setHandPhoneCountryCodeNumber g() {
        if (this.n == null) {
            this.n = new setHmCountry(this.d, setHmCity.c);
        }
        return this.n;
    }

    private final void h() {
        setHandPhoneNumber sethandphonenumber = this.i;
        if (sethandphonenumber != null) {
            if (sethandphonenumber.d > 0 || e()) {
                g().d(sethandphonenumber);
            }
            this.i = null;
        }
    }

    public final int a() {
        return this.m.getAndIncrement();
    }

    public final void a(realmGet$numberID realmget_numberid, int i, realmGet$salaryValue realmget_salaryvalue, setJenisWarkat setjeniswarkat, realmGet$resSubDistrict realmget_ressubdistrict) {
        realmSet$kitasKitapFlag a2;
        int c2 = realmget_salaryvalue.c();
        if (!(c2 == 0 || (a2 = realmSet$kitasKitapFlag.a(this, c2, realmget_numberid.e())) == null)) {
            setjeniswarkat.c.e((Executor) new Executor(this.e) { // from class: o.realmSet$hmAddress
                public final /* synthetic */ Handler e;

                {
                    this.e = r4;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    this.e.post(runnable);
                }
            }, (realmSet.localClearingCodeBank) a2);
        }
        this.e.sendMessage(this.e.obtainMessage(4, new realmSet$maritalStatusValue(new realmSet$jobValue(i, realmget_salaryvalue, setjeniswarkat, realmget_ressubdistrict) { // from class: o.realmSet$purposePemRek
            private final setJenisWarkat b;
            private final realmGet$salaryValue d;
            private final realmGet$resSubDistrict e;

            {
                this.b = r7;
                this.d = r6;
                this.e = r8;
                if (r5 == 2 && r6.d()) {
                    throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
                }
            }

            @Override // o.realmSet$pob
            public final void a(realmGet$updatedAt realmget_updatedat, boolean z) {
                realmget_updatedat.e(this.b, z);
            }

            @Override // o.realmSet$pob
            public final void a(realmSet$hmPhoneNumber realmset_hmphonenumber) throws DeadObjectException {
                try {
                    this.d.b(realmset_hmphonenumber.j(), this.b);
                } catch (DeadObjectException e) {
                    throw e;
                } catch (RemoteException e2) {
                    b(realmSet$pob.e(e2));
                } catch (RuntimeException e3) {
                    this.b.c(e3);
                }
            }

            @Override // o.realmSet$pob
            public final void b(Status status) {
                this.b.c(this.e.getException(status));
            }

            @Override // o.realmSet$jobValue
            public final realmGet$job[] b(realmSet$hmPhoneNumber realmset_hmphonenumber) {
                return this.d.a();
            }

            @Override // o.realmSet$pob
            public final void d(Exception exc) {
                this.b.c(exc);
            }

            @Override // o.realmSet$jobValue
            public final boolean d(realmSet$hmPhoneNumber realmset_hmphonenumber) {
                return this.d.d();
            }
        }, this.l.get(), realmget_numberid)));
    }

    public final realmSet$hmPhoneNumber b(realmGet$religion realmget_religion) {
        return (realmSet$hmPhoneNumber) this.f183o.get(realmget_religion);
    }

    public final void b() {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(realmGet$jobValue realmget_jobvalue, int i) {
        if (!this.b.d(this.d, realmget_jobvalue, i)) {
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(5, i, 0, realmget_jobvalue));
        }
    }

    public final void b(realmSet$acctType realmset_accttype) {
        synchronized (g) {
            if (this.q != realmset_accttype) {
                this.q = realmset_accttype;
                this.t.clear();
            }
            this.t.addAll(realmset_accttype.g());
        }
    }

    public final void c(realmGet$numberID realmget_numberid, int i, realmGet$religionOthers.write write) {
        this.e.sendMessage(this.e.obtainMessage(4, new realmSet$maritalStatusValue(new realmSet$pob(i, write) { // from class: o.realmSet$purposePemRekOthers
            protected final realmGet$religionOthers.write e;

            {
                this.e = (realmGet$religionOthers.write) setFotoKtp.a(r6, "Null methods are not runnable.");
            }

            @Override // o.realmSet$pob
            public final void a(realmGet$updatedAt realmget_updatedat, boolean z) {
                realmget_updatedat.d(this.e, z);
            }

            @Override // o.realmSet$pob
            public final void a(realmSet$hmPhoneNumber realmset_hmphonenumber) throws DeadObjectException {
                try {
                    this.e.b((realmGet$religionOthers.write) realmset_hmphonenumber.j());
                } catch (RuntimeException e) {
                    d(e);
                }
            }

            @Override // o.realmSet$pob
            public final void b(Status status) {
                try {
                    this.e.a(status);
                } catch (IllegalStateException e) {
                    Log.w("ApiCallRunner", "Exception reporting failure", e);
                }
            }

            @Override // o.realmSet$pob
            public final void d(Exception exc) {
                String simpleName = exc.getClass().getSimpleName();
                String localizedMessage = exc.getLocalizedMessage();
                try {
                    this.e.a(new Status(10, simpleName + ": " + localizedMessage));
                } catch (IllegalStateException e) {
                    Log.w("ApiCallRunner", "Exception reporting failure", e);
                }
            }
        }, this.l.get(), realmget_numberid)));
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(realmGet$jobValue realmget_jobvalue, int i) {
        return this.b.d(this.d, realmget_jobvalue, i);
    }

    public final void e(realmGet$numberID realmget_numberid) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(7, realmget_numberid));
    }

    public final void e(realmSet$acctType realmset_accttype) {
        synchronized (g) {
            if (this.q == realmset_accttype) {
                this.q = null;
                this.t.clear();
            }
        }
    }

    public final void e(setFlagGuest setflagguest, int i, long j, int i2) {
        this.e.sendMessage(this.e.obtainMessage(18, new realmSet$language(setflagguest, i, j, i2)));
    }

    public final boolean e() {
        if (this.f) {
            return false;
        }
        setFlagNPWP setflagnpwp = setFlagMB.a().c;
        if (setflagnpwp != null && !setflagnpwp.b) {
            return false;
        }
        int c2 = this.k.c(this.d, 203400000);
        return c2 == -1 || c2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0440  */
    @Override // android.os.Handler.Callback
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean handleMessage(android.os.Message r9) {
        /*
        // Method dump skipped, instructions count: 1532
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$resCity.handleMessage(android.os.Message):boolean");
    }
}
