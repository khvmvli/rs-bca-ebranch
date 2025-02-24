package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$idType.class */
public final class realmGet$idType extends realmGet$FlagTxnBerkala {
    private volatile Boolean a;
    private final C0001realmSet$email b;
    private realmSet$isInputAtmPemrek c;
    private final realmGet.listWarkat e;
    private final realmGet.listWarkat g;
    private final List<Runnable> j = new ArrayList();
    private final realmGet$eChannels d = new realmGet$eChannels(this);

    public realmGet$idType(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
        this.b = new C0001realmSet$email(realmget_txnpurpose.q_());
        this.e = new getSetorans(this, realmget_txnpurpose);
        this.g = new isFlagContactKU(this, realmget_txnpurpose);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(realmGet$idType realmget_idtype, ComponentName componentName) {
        realmget_idtype.r_();
        if (realmget_idtype.c != null) {
            realmget_idtype.c = null;
            realmget_idtype.q.s_().i().e("Disconnected from device MeasurementService", componentName);
            realmget_idtype.r_();
            realmget_idtype.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(Runnable runnable) throws IllegalStateException {
        r_();
        if (g()) {
            runnable.run();
            return;
        }
        int size = this.j.size();
        this.q.t();
        if (((long) size) >= 1000) {
            this.q.s_().b().b("Discarding data. Max runnable queue size reached");
            return;
        }
        this.j.add(runnable);
        this.g.e(60000);
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final setCreditCards d(boolean z) {
        String str;
        Pair<String, Long> b;
        this.q.n_();
        realmSet$nominalTransaksiTeller e = ((realmSet.descTransaksi) this).q.e();
        if (z) {
            setIsInputAtmPemrek s_ = this.q.s_();
            if (!(s_.q.q().d == null || (b = s_.q.q().d.b()) == null || b == realmGet$FlagRepresentativeTransaction.a)) {
                String valueOf = String.valueOf(b.second);
                String str2 = (String) b.first;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
                return e.b(str);
            }
        }
        str = null;
        return e.b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean p() {
        this.q.n_();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        r_();
        this.b.b();
        realmGet.listWarkat listwarkat = this.e;
        this.q.t();
        listwarkat.e(((Long) realmSet.hasDone.g.d((Object) null)).longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        r_();
        this.q.s_().i().e("Processing queued up service tasks", Integer.valueOf(this.j.size()));
        for (Runnable runnable : this.j) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                this.q.s_().b().e("Task exception while flushing queue", e);
            }
        }
        this.j.clear();
        this.g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        r_();
        n();
        if (!g()) {
            if (i()) {
                this.d.e();
            } else if (!this.q.t().n()) {
                this.q.n_();
                List<ResolveInfo> queryIntentServices = this.q.t_().getPackageManager().queryIntentServices(new Intent().setClassName(this.q.t_(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.q.s_().b().b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context t_ = this.q.t_();
                this.q.n_();
                intent.setComponent(new ComponentName(t_, "com.google.android.gms.measurement.AppMeasurementService"));
                this.d.d(intent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Bundle bundle) {
        r_();
        n();
        c(new getMembership(this, d(false), bundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(realmSet$isInputAtmPemrek realmset_isinputatmpemrek) {
        r_();
        setFotoKtp.b(realmset_isinputatmpemrek);
        this.c = realmset_isinputatmpemrek;
        r();
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z) {
        r_();
        n();
        if (z) {
            p();
            ((realmSet.descTransaksi) this).q.v().c();
        }
        if (f()) {
            c(new isMember(this, d(false)));
        }
    }

    @Override // o.realmGet$FlagTxnBerkala
    protected final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(AtomicReference<String> atomicReference) {
        r_();
        n();
        c(new getNoHandphone(this, atomicReference, d(false)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(getAcctNo getacctno) {
        r_();
        n();
        c(new getTarikans(this, getacctno));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(realmGet.tipeNasabah tipenasabah, String str) {
        setFotoKtp.b(tipenasabah);
        r_();
        n();
        p();
        c(new geteChannels(this, true, d(true), ((realmSet.descTransaksi) this).q.v().a(tipenasabah), tipenasabah, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(realmSet$tarikans realmset_tarikans) {
        r_();
        n();
        p();
        c(new getKlirings(this, d(true), ((realmSet.descTransaksi) this).q.v().d(realmset_tarikans), realmset_tarikans));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(realmSet$isInputAtmPemrek realmset_isinputatmpemrek, setFotoPribadi setfotopribadi, setCreditCards setcreditcards) {
        r_();
        n();
        p();
        this.q.t();
        int i = 100;
        for (int i2 = 0; i2 < 1001 && i == 100; i2++) {
            ArrayList arrayList = new ArrayList();
            List<setFotoPribadi> b = ((realmSet.descTransaksi) this).q.v().b(100);
            if (b != null) {
                arrayList.addAll(b);
                i = b.size();
            } else {
                i = 0;
            }
            if (setfotopribadi != null && i < 100) {
                arrayList.add(setfotopribadi);
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                setFotoPribadi setfotopribadi2 = (setFotoPribadi) arrayList.get(i3);
                if (setfotopribadi2 instanceof realmGet.tipeNasabah) {
                    try {
                        realmset_isinputatmpemrek.d((realmGet.tipeNasabah) setfotopribadi2, setcreditcards);
                    } catch (RemoteException e) {
                        this.q.s_().b().e("Failed to send event to the service", e);
                    }
                } else if (setfotopribadi2 instanceof realmSet$tarikans) {
                    try {
                        realmset_isinputatmpemrek.c((realmSet$tarikans) setfotopribadi2, setcreditcards);
                    } catch (RemoteException e2) {
                        this.q.s_().b().e("Failed to send user property to the service", e2);
                    }
                } else if (setfotopribadi2 instanceof getNomorHp) {
                    try {
                        realmset_isinputatmpemrek.e((getNomorHp) setfotopribadi2, setcreditcards);
                    } catch (RemoteException e3) {
                        this.q.s_().b().e("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.q.s_().b().b("Discarding data. Unrecognized parcel type.");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        r_();
        n();
        return !i() || this.q.u().a() >= ((Integer) realmSet.hasDone.ac.d((Object) null)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        r_();
        n();
        return this.c != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        r_();
        n();
        this.d.b();
        try {
            getAlamatPengirim.b().d(this.q.t_(), this.d);
        } catch (IllegalArgumentException | IllegalStateException e) {
        }
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean i() {
        /*
        // Method dump skipped, instructions count: 457
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$idType.i():boolean");
    }

    public final Boolean j() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        r_();
        n();
        c(new Runnable(d(true)) { // from class: o.realmGet$accounts
            final /* synthetic */ setCreditCards b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r5;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
            /* JADX WARN: Type inference failed for: r0v5, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
            @Override // java.lang.Runnable
            public final void run() {
                realmSet$isInputAtmPemrek realmset_isinputatmpemrek = realmGet$idType.this.c;
                if (realmset_isinputatmpemrek == null) {
                    realmGet$idType.this.q.s_().b().b("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    setFotoKtp.b(this.b);
                    realmset_isinputatmpemrek.e(this.b);
                    realmGet$idType.this.r();
                } catch (RemoteException e) {
                    realmGet$idType.this.q.s_().b().e("Failed to send measurementEnabled to the service", e);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        r_();
        n();
        setCreditCards d = d(true);
        ((realmSet.descTransaksi) this).q.v().a();
        c(new getUserPhoto(this, d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        r_();
        n();
        setCreditCards d = d(false);
        p();
        ((realmSet.descTransaksi) this).q.v().c();
        c(new getKirimanUangs(this, d));
    }
}
