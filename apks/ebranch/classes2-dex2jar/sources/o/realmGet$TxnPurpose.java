package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.Setoran$$Parcelable;
import o.realmGet;
import o.realmSet;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:o/realmGet$TxnPurpose.class */
public final class realmGet$TxnPurpose implements realmSet$RepresentativeIdNumber {
    private static volatile realmGet$TxnPurpose b;
    private final Setoran$$Parcelable.AnonymousClass1 A;
    private final realmSet$typeTransksi B;
    private final getNominalTransaksiTeller C;
    private final getNoTelpKontakPengirim D;
    private realmGet$idType E;
    private final String F;
    private realmGet.kodeNegara G;
    private realmSet$receiverNameTeller H;
    private final setJumlah I;
    final long a;
    private realmSet$nominalTransaksiTeller c;
    protected Boolean d;
    protected Boolean e;
    private volatile Boolean g;
    private realmGet$ReceiverName h;
    private Boolean i;
    private long j;
    private final String k;
    private final Context l;
    private int m;
    private final String p;
    private final getSumberDana q;
    private final setSetorans r;
    private final boolean s;
    private final String t;
    private final realmGet$SenderIdType u;
    private final realmSet$eChannels v;
    private final setAcctNo w;
    private final setIsInputAtmPemrek x;
    private final realmGet$FlagRepresentativeTransaction y;
    private final getIdType z;
    private boolean f = false;
    private final AtomicInteger n = new AtomicInteger(0);

    /* renamed from: o */
    private volatile boolean f88o = true;

    /* JADX WARN: Type inference failed for: r0v69, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    realmGet$TxnPurpose(o.realmSet$TxnNotes r7) {
        /*
        // Method dump skipped, instructions count: 621
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$TxnPurpose.<init>(o.realmSet$TxnNotes):void");
    }

    private static final void b(realmSet$RepresentativeRelationship realmset_representativerelationship) {
        if (realmset_representativerelationship == null) {
            throw new IllegalStateException("Component not created");
        } else if (!realmset_representativerelationship.p()) {
            String valueOf = String.valueOf(realmset_representativerelationship.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r14.h == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.realmGet$TxnPurpose c(android.content.Context r13, o.realmGet.bcaDebitCardType r14, java.lang.Long r15) {
        /*
            r0 = r14
            r16 = r0
            r0 = r14
            if (r0 == 0) goto L_0x0035
            r0 = r14
            java.lang.String r0 = r0.b
            if (r0 == 0) goto L_0x0016
            r0 = r14
            r16 = r0
            r0 = r14
            java.lang.String r0 = r0.h
            if (r0 != 0) goto L_0x0035
        L_0x0016:
            o.realmGet$bcaDebitCardType r0 = new o.realmGet$bcaDebitCardType
            r1 = r0
            r2 = r14
            long r2 = r2.e
            r3 = r14
            long r3 = r3.a
            r4 = r14
            boolean r4 = r4.d
            r5 = r14
            java.lang.String r5 = r5.c
            r6 = 0
            r7 = 0
            r8 = r14
            android.os.Bundle r8 = r8.f
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r16 = r0
        L_0x0035:
            r0 = r13
            java.lang.Object r0 = o.setFotoKtp.b(r0)
            r0 = r13
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.Object r0 = o.setFotoKtp.b(r0)
            o.realmGet$TxnPurpose r0 = o.realmGet$TxnPurpose.b
            if (r0 != 0) goto L_0x0075
            java.lang.Class<o.realmGet$TxnPurpose> r0 = o.realmGet$TxnPurpose.class
            monitor-enter(r0)
            o.realmGet$TxnPurpose r0 = o.realmGet$TxnPurpose.b     // Catch: all -> 0x006f
            if (r0 != 0) goto L_0x0069
            o.realmSet$TxnNotes r0 = new o.realmSet$TxnNotes     // Catch: all -> 0x006f
            r14 = r0
            r0 = r14
            r1 = r13
            r2 = r16
            r3 = r15
            r0.<init>(r1, r2, r3)     // Catch: all -> 0x006f
            o.realmGet$TxnPurpose r0 = new o.realmGet$TxnPurpose     // Catch: all -> 0x006f
            r13 = r0
            r0 = r13
            r1 = r14
            r0.<init>(r1)     // Catch: all -> 0x006f
            r0 = r13
            o.realmGet$TxnPurpose.b = r0     // Catch: all -> 0x006f
        L_0x0069:
            java.lang.Class<o.realmGet$TxnPurpose> r0 = o.realmGet$TxnPurpose.class
            monitor-exit(r0)     // Catch: all -> 0x006f
            goto L_0x00a6
        L_0x006f:
            r13 = move-exception
            java.lang.Class<o.realmGet$TxnPurpose> r0 = o.realmGet$TxnPurpose.class
            monitor-exit(r0)     // Catch: all -> 0x006f
            r0 = r13
            throw r0
        L_0x0075:
            r0 = r16
            if (r0 == 0) goto L_0x00a6
            r0 = r16
            android.os.Bundle r0 = r0.f
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L_0x00a6
            r0 = r13
            java.lang.String r1 = "dataCollectionDefaultEnabled"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00a6
            o.realmGet$TxnPurpose r0 = o.realmGet$TxnPurpose.b
            java.lang.Object r0 = o.setFotoKtp.b(r0)
            o.realmGet$TxnPurpose r0 = o.realmGet$TxnPurpose.b
            r1 = r16
            android.os.Bundle r1 = r1.f
            java.lang.String r2 = "dataCollectionDefaultEnabled"
            boolean r1 = r1.getBoolean(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.g = r1
        L_0x00a6:
            o.realmGet$TxnPurpose r0 = o.realmGet$TxnPurpose.b
            java.lang.Object r0 = o.setFotoKtp.b(r0)
            o.realmGet$TxnPurpose r0 = o.realmGet$TxnPurpose.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$TxnPurpose.c(android.content.Context, o.realmGet$bcaDebitCardType, java.lang.Long):o.realmGet$TxnPurpose");
    }

    public static final void c() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void c(realmGet$FlagTxnBerkala realmget_flagtxnberkala) {
        if (realmget_flagtxnberkala == null) {
            throw new IllegalStateException("Component not created");
        } else if (!realmget_flagtxnberkala.l()) {
            String valueOf = String.valueOf(realmget_flagtxnberkala.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static /* synthetic */ void d(realmGet$TxnPurpose realmget_txnpurpose, realmSet$TxnNotes realmset_txnnotes) {
        realmget_txnpurpose.o_().r_();
        realmget_txnpurpose.q.a();
        realmGet.kodeNegara kodenegara = new realmGet.kodeNegara(realmget_txnpurpose);
        kodenegara.q();
        realmget_txnpurpose.G = kodenegara;
        realmSet$nominalTransaksiTeller realmset_nominaltransaksiteller = new realmSet$nominalTransaksiTeller(realmget_txnpurpose, realmset_txnnotes.h);
        realmset_nominaltransaksiteller.m();
        realmget_txnpurpose.c = realmset_nominaltransaksiteller;
        realmSet$receiverNameTeller realmset_receivernameteller = new realmSet$receiverNameTeller(realmget_txnpurpose);
        realmset_receivernameteller.m();
        realmget_txnpurpose.H = realmset_receivernameteller;
        realmGet$idType realmget_idtype = new realmGet$idType(realmget_txnpurpose);
        realmget_idtype.m();
        realmget_txnpurpose.E = realmget_idtype;
        realmget_txnpurpose.w.r();
        realmget_txnpurpose.y.r();
        realmget_txnpurpose.h = new realmGet$ReceiverName(realmget_txnpurpose);
        realmget_txnpurpose.c.k();
        setCodeCurrencyTeller g = realmget_txnpurpose.s_().g();
        realmget_txnpurpose.q.e();
        g.e("App measurement initialized, version", 42004L);
        realmget_txnpurpose.s_().g().b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String c = realmset_nominaltransaksiteller.c();
        if (TextUtils.isEmpty(realmget_txnpurpose.k)) {
            if (realmget_txnpurpose.u().i(c)) {
                realmget_txnpurpose.s_().g().b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                setCodeCurrencyTeller g2 = realmget_txnpurpose.s_().g();
                String valueOf = String.valueOf(c);
                g2.b(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        realmget_txnpurpose.s_().h().b("Debug-level message logging enabled");
        if (realmget_txnpurpose.m != realmget_txnpurpose.n.get()) {
            realmget_txnpurpose.s_().b().a("Not all components initialized", Integer.valueOf(realmget_txnpurpose.m), Integer.valueOf(realmget_txnpurpose.n.get()));
        }
        realmget_txnpurpose.f = true;
    }

    private static final void d(realmSet$RepresentativeName realmset_representativename) {
        if (realmset_representativename == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    @Pure
    public final String A() {
        return this.t;
    }

    @Pure
    public final boolean B() {
        return TextUtils.isEmpty(this.k);
    }

    @Pure
    public final String C() {
        return this.k;
    }

    @Pure
    public final String D() {
        return this.p;
    }

    @Pure
    public final realmGet$idType E() {
        c(this.E);
        return this.E;
    }

    @Pure
    public final String F() {
        return this.F;
    }

    @Pure
    public final realmGet.kodeNegara G() {
        b(this.G);
        return this.G;
    }

    @Pure
    public final boolean H() {
        return this.s;
    }

    @Pure
    public final getIdType I() {
        c(this.z);
        return this.z;
    }

    public final /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        int i2 = i;
        if (i != 200) {
            i2 = i;
            if (i != 204) {
                i2 = i;
                if (i == 304) {
                    i2 = 304;
                }
                s_().c().a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            }
        }
        if (th == null) {
            q().f87o.d(true);
            if (bArr == null || bArr.length == 0) {
                s_().h().b("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    s_().h().b("Deferred Deep Link is empty.");
                    return;
                }
                setAcctNo u = u();
                realmGet$TxnPurpose realmget_txnpurpose = u.q;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = u.q.l.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.A.e("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                    setAcctNo u2 = u();
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            SharedPreferences.Editor edit = u2.q.l.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                u2.q.l.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e) {
                            u2.q.s_().b().e("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                s_().c().a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                s_().b().e("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        s_().c().a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    public final boolean a() {
        return d() == 0;
    }

    @Pure
    public final getNominalTransaksiTeller b() {
        getNominalTransaksiTeller getnominaltransaksiteller = this.C;
        if (getnominaltransaksiteller != null) {
            return getnominaltransaksiteller;
        }
        throw new IllegalStateException("Component not created");
    }

    public final void c(realmGet.bcaDebitCardType bcadebitcardtype) {
        getTanggalJatuhTempo gettanggaljatuhtempo;
        o_().r_();
        getTanggalJatuhTempo c = q().c();
        realmGet$FlagRepresentativeTransaction q = q();
        realmGet$TxnPurpose realmget_txnpurpose = q.q;
        q.r_();
        int i = 100;
        int i2 = q.a().getInt("consent_source", 100);
        getSumberDana getsumberdana = this.q;
        realmGet$TxnPurpose realmget_txnpurpose2 = getsumberdana.q;
        Boolean d = getsumberdana.d("google_analytics_default_allow_ad_storage");
        getSumberDana getsumberdana2 = this.q;
        realmGet$TxnPurpose realmget_txnpurpose3 = getsumberdana2.q;
        Boolean d2 = getsumberdana2.d("google_analytics_default_allow_analytics_storage");
        if (!(d == null && d2 == null) && q().d(-10)) {
            gettanggaljatuhtempo = new getTanggalJatuhTempo(d, d2);
            i = -10;
        } else {
            if (TextUtils.isEmpty(e().a()) || !(i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                getKodeSwiftBankPenerima.b();
                if ((!this.q.c((String) null, realmSet.hasDone.z) || TextUtils.isEmpty(e().a())) && bcadebitcardtype != null && bcadebitcardtype.f != null && q().d(30)) {
                    gettanggaljatuhtempo = getTanggalJatuhTempo.c(bcadebitcardtype.f);
                    if (!gettanggaljatuhtempo.equals(getTanggalJatuhTempo.e)) {
                        i = 30;
                    }
                }
            } else {
                x().b(getTanggalJatuhTempo.e, -10, this.a);
            }
            gettanggaljatuhtempo = null;
        }
        if (gettanggaljatuhtempo != null) {
            x().b(gettanggaljatuhtempo, i, this.a);
            c = gettanggaljatuhtempo;
        }
        x().c(c);
        if (q().c.d() == 0) {
            s_().i().e("Persisting first open", Long.valueOf(this.a));
            q().c.b(this.a);
        }
        x().d.e();
        if (f()) {
            if (!TextUtils.isEmpty(e().a()) || !TextUtils.isEmpty(e().g())) {
                setAcctNo u = u();
                String a = e().a();
                realmGet$FlagRepresentativeTransaction q2 = q();
                q2.r_();
                String string = q2.a().getString("gmp_app_id", null);
                String g = e().g();
                realmGet$FlagRepresentativeTransaction q3 = q();
                q3.r_();
                if (u.e(a, string, g, q3.a().getString("admob_app_id", null))) {
                    s_().g().b("Rechecking which service to use due to a GMP App Id change");
                    realmGet$FlagRepresentativeTransaction q4 = q();
                    q4.r_();
                    Boolean d3 = q4.d();
                    SharedPreferences.Editor edit = q4.a().edit();
                    edit.clear();
                    edit.apply();
                    if (d3 != null) {
                        q4.e(d3);
                    }
                    v().c();
                    this.E.h();
                    this.E.a();
                    q().c.b(this.a);
                    q().e.d(null);
                }
                realmGet$FlagRepresentativeTransaction q5 = q();
                String a2 = e().a();
                q5.r_();
                SharedPreferences.Editor edit2 = q5.a().edit();
                edit2.putString("gmp_app_id", a2);
                edit2.apply();
                realmGet$FlagRepresentativeTransaction q6 = q();
                String g2 = e().g();
                q6.r_();
                SharedPreferences.Editor edit3 = q6.a().edit();
                edit3.putString("admob_app_id", g2);
                edit3.apply();
            }
            if (!q().c().d()) {
                q().e.d(null);
            }
            x().e(q().e.b());
            getKeteranganAlamatBankPenerima.d();
            if (this.q.c((String) null, realmSet.hasDone.U)) {
                try {
                    u().q.l.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException e) {
                    if (!TextUtils.isEmpty(q().m.b())) {
                        s_().c().b("Remote config removed with active feature rollouts");
                        q().m.d(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(e().a()) || !TextUtils.isEmpty(e().g())) {
                boolean a3 = a();
                if (!q().g() && !this.q.j()) {
                    q().a(!a3);
                }
                if (a3) {
                    x().a();
                }
                r().d.b();
                E().c(new AtomicReference<>());
                E().b(q().s.c());
            }
        } else if (a()) {
            if (!u().b("android.permission.INTERNET")) {
                s_().b().b("App is missing INTERNET permission");
            }
            if (!u().b("android.permission.ACCESS_NETWORK_STATE")) {
                s_().b().b("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!realmGet.jenisWarkatTransaksi.b(this.l).d() && !this.q.n()) {
                if (!setAcctNo.b(this.l)) {
                    s_().b().b("AppMeasurementReceiver not registered/enabled");
                }
                if (!setAcctNo.e(this.l, false)) {
                    s_().b().b("AppMeasurementService not registered/enabled");
                }
            }
            s_().b().b("Uploading is not possible. App measurement disabled");
        }
        q().f.d(true);
    }

    public final int d() {
        o_().r_();
        if (this.q.j()) {
            return 1;
        }
        Boolean bool = this.d;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        o_().r_();
        if (!this.f88o) {
            return 8;
        }
        Boolean d = q().d();
        if (d != null) {
            return d.booleanValue() ? 0 : 3;
        }
        getSumberDana getsumberdana = this.q;
        setSetorans setsetorans = getsumberdana.q.r;
        Boolean d2 = getsumberdana.d("firebase_analytics_collection_enabled");
        if (d2 != null) {
            return d2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.e;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.q.c((String) null, realmSet.hasDone.q) || this.g == null || this.g.booleanValue()) ? 0 : 7;
    }

    public final void d(boolean z) {
        o_().r_();
        this.f88o = z;
    }

    @Pure
    public final realmSet$nominalTransaksiTeller e() {
        c(this.c);
        return this.c;
    }

    public final boolean f() {
        if (this.f) {
            o_().r_();
            Boolean bool = this.i;
            if (bool == null || this.j == 0 || (!bool.booleanValue() && Math.abs(this.D.b() - this.j) > 1000)) {
                this.j = this.D.b();
                Boolean valueOf = Boolean.valueOf(u().b("android.permission.INTERNET") && u().b("android.permission.ACCESS_NETWORK_STATE") && (realmGet.jenisWarkatTransaksi.b(this.l).d() || this.q.n() || (setAcctNo.b(this.l) && setAcctNo.e(this.l, false))));
                this.i = valueOf;
                if (valueOf.booleanValue()) {
                    boolean z = true;
                    if (!u().d(e().a(), e().g(), e().f())) {
                        z = !TextUtils.isEmpty(e().g());
                    }
                    this.i = Boolean.valueOf(z);
                }
            }
            return this.i.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean g() {
        o_().r_();
        return this.f88o;
    }

    public final void h() {
        this.n.incrementAndGet();
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [o.realmSet$nominalTransaksiTeller, o.realmSet$RepresentativeName] */
    public final void i() {
        o_().r_();
        b(z());
        String c = e().c();
        Pair<String, Boolean> c2 = q().c(c);
        if (!this.q.i() || ((Boolean) c2.second).booleanValue() || TextUtils.isEmpty((CharSequence) c2.first)) {
            s_().h().b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        setJumlah z = z();
        z.s();
        ConnectivityManager connectivityManager = (ConnectivityManager) z.q.l.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e) {
                networkInfo = null;
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            s_().c().b("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        setAcctNo u = u();
        e().q.q.e();
        URL b2 = u.b(42004, c, (String) c2.first, q().n.d() - 1);
        if (b2 != null) {
            setJumlah z2 = z();
            realmGet$TxnNotes realmget_txnnotes = new realmGet$TxnNotes(this);
            z2.r_();
            z2.s();
            setFotoKtp.b(b2);
            setFotoKtp.b(realmget_txnnotes);
            z2.q.o_().e(new realmSet$Jumlah(z2, c, b2, null, null, realmget_txnnotes, null));
        }
    }

    public final void j() {
        this.m++;
    }

    @Override // o.realmSet$RepresentativeIdNumber
    @Pure
    public final setSetorans n_() {
        return this.r;
    }

    @Override // o.realmSet$RepresentativeIdNumber
    @Pure
    public final realmGet$SenderIdType o_() {
        b(this.u);
        return this.u;
    }

    @SideEffectFree
    public final realmGet$ReceiverName p() {
        return this.h;
    }

    @Pure
    public final realmGet$FlagRepresentativeTransaction q() {
        d(this.y);
        return this.y;
    }

    @Override // o.realmSet$RepresentativeIdNumber
    @Pure
    public final getNoTelpKontakPengirim q_() {
        return this.D;
    }

    @Pure
    public final realmSet$eChannels r() {
        c(this.v);
        return this.v;
    }

    public final setIsInputAtmPemrek s() {
        setIsInputAtmPemrek setisinputatmpemrek = this.x;
        if (setisinputatmpemrek == null || !setisinputatmpemrek.p()) {
            return null;
        }
        return this.x;
    }

    @Override // o.realmSet$RepresentativeIdNumber
    @Pure
    public final setIsInputAtmPemrek s_() {
        b(this.x);
        return this.x;
    }

    @Pure
    public final getSumberDana t() {
        return this.q;
    }

    @Override // o.realmSet$RepresentativeIdNumber
    @Pure
    public final Context t_() {
        return this.l;
    }

    @Pure
    public final setAcctNo u() {
        d(this.w);
        return this.w;
    }

    @Pure
    public final realmSet$receiverNameTeller v() {
        c(this.H);
        return this.H;
    }

    @Pure
    public final realmSet$typeTransksi w() {
        d(this.B);
        return this.B;
    }

    @Pure
    public final Setoran$$Parcelable.AnonymousClass1 x() {
        c(this.A);
        return this.A;
    }

    @SideEffectFree
    public final realmGet$SenderIdType y() {
        return this.u;
    }

    @Pure
    public final setJumlah z() {
        b(this.I);
        return this.I;
    }
}
