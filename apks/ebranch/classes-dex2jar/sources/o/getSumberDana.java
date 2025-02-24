package o;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.stetho.server.http.HttpStatus;
import io.realm.internal.Property;
import java.lang.reflect.InvocationTargetException;
import o.realmGet;
import o.realmSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes-dex2jar.jar:o/getSumberDana.class */
public final class getSumberDana extends realmSet.RepresentativeName {
    private Boolean a;
    private getSumberDanaCode c = getKodeNegara.d;
    private Boolean e;

    getSumberDana(realmGet.TxnPurpose txnPurpose) {
        super(txnPurpose);
    }

    public static final long b() {
        return realmSet$hasDone.c.d(null).longValue();
    }

    public static final long d() {
        return realmSet$hasDone.al.d(null).longValue();
    }

    private final String d(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            setFotoKtp.b(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            ((realmSet.RepresentativeName) this).q.s_().b().e("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().e("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            ((realmSet.RepresentativeName) this).q.s_().b().e("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            ((realmSet.RepresentativeName) this).q.s_().b().e("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final int a(String str) {
        return a(str, realmSet$hasDone.h, 25, 100);
    }

    public final int a(String str, realmSet$image<Integer> realmset_image) {
        if (str == null) {
            return realmset_image.d(null).intValue();
        }
        String a = this.c.a(str, realmset_image.d());
        if (TextUtils.isEmpty(a)) {
            return realmset_image.d(null).intValue();
        }
        try {
            return realmset_image.d(Integer.valueOf(Integer.parseInt(a))).intValue();
        } catch (NumberFormatException e) {
            return realmset_image.d(null).intValue();
        }
    }

    public final int a(String str, realmSet$image<Integer> realmset_image, int i, int i2) {
        return Math.max(Math.min(a(str, realmset_image), i2), i);
    }

    final String a() {
        ((realmSet.RepresentativeName) this).q.n_();
        return "FA";
    }

    final void b(getSumberDanaCode getsumberdanacode) {
        this.c = getsumberdanacode;
    }

    public final boolean b(String str) {
        return "1".equals(this.c.a(str, "gaia_collection_enabled"));
    }

    public final int c() {
        setAcctNo u = ((realmSet.RepresentativeName) this).q.u();
        Boolean j = u.q.E().j();
        if (u.a() < 201500) {
            return (j == null || j.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final java.util.List<java.lang.String> c(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "analytics.safelisted_events"
            java.lang.String r0 = o.setFotoKtp.c(r0)
            r0 = r4
            android.os.Bundle r0 = r0.f()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L_0x0021
            r0 = r4
            o.realmGet$TxnPurpose r0 = r0.q
            o.setIsInputAtmPemrek r0 = r0.s_()
            o.setCodeCurrencyTeller r0 = r0.b()
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            r0.b(r1)
            goto L_0x002a
        L_0x0021:
            r0 = r5
            java.lang.String r1 = "analytics.safelisted_events"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x002f
        L_0x002a:
            r0 = 0
            r5 = r0
            goto L_0x0039
        L_0x002f:
            r0 = r5
            java.lang.String r1 = "analytics.safelisted_events"
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r0
        L_0x0039:
            r0 = r5
            if (r0 == 0) goto L_0x006d
            r0 = r4
            o.realmGet$TxnPurpose r0 = r0.q     // Catch: NotFoundException -> 0x005c
            android.content.Context r0 = r0.t_()     // Catch: NotFoundException -> 0x005c
            android.content.res.Resources r0 = r0.getResources()     // Catch: NotFoundException -> 0x005c
            r1 = r5
            int r1 = r1.intValue()     // Catch: NotFoundException -> 0x005c
            java.lang.String[] r0 = r0.getStringArray(r1)     // Catch: NotFoundException -> 0x005c
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L_0x0055
            r0 = 0
            return r0
        L_0x0055:
            r0 = r5
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: NotFoundException -> 0x005c
            r5 = r0
            r0 = r5
            return r0
        L_0x005c:
            r5 = move-exception
            r0 = r4
            o.realmGet$TxnPurpose r0 = r0.q
            o.setIsInputAtmPemrek r0 = r0.s_()
            o.setCodeCurrencyTeller r0 = r0.b()
            java.lang.String r1 = "Failed to load string array from metadata: resource not found"
            r2 = r5
            r0.e(r1, r2)
        L_0x006d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSumberDana.c(java.lang.String):java.util.List");
    }

    public final boolean c(String str, realmSet$image<Boolean> realmset_image) {
        if (str == null) {
            return realmset_image.d(null).booleanValue();
        }
        String a = this.c.a(str, realmset_image.d());
        return TextUtils.isEmpty(a) ? realmset_image.d(null).booleanValue() : realmset_image.d(Boolean.valueOf(Boolean.parseBoolean(a))).booleanValue();
    }

    public final long d(String str, realmSet$image<Long> realmset_image) {
        if (str == null) {
            return realmset_image.d(null).longValue();
        }
        String a = this.c.a(str, realmset_image.d());
        if (TextUtils.isEmpty(a)) {
            return realmset_image.d(null).longValue();
        }
        try {
            return realmset_image.d(Long.valueOf(Long.parseLong(a))).longValue();
        } catch (NumberFormatException e) {
            return realmset_image.d(null).longValue();
        }
    }

    final Boolean d(String str) {
        setFotoKtp.c(str);
        Bundle f = f();
        if (f == null) {
            ((realmSet.RepresentativeName) this).q.s_().b().b("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!f.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(f.getBoolean(str));
        }
    }

    final int e(String str) {
        return a(str, realmSet$hasDone.j, HttpStatus.HTTP_INTERNAL_SERVER_ERROR, 2000);
    }

    public final long e() {
        ((realmSet.RepresentativeName) this).q.n_();
        return 42004;
    }

    final Bundle f() {
        try {
            if (((realmSet.RepresentativeName) this).q.t_().getPackageManager() == null) {
                ((realmSet.RepresentativeName) this).q.s_().b().b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = realmGet$jenisWarkatTransaksi.b(((realmSet.RepresentativeName) this).q.t_()).c(((realmSet.RepresentativeName) this).q.t_().getPackageName(), Property.TYPE_ARRAY);
            if (c != null) {
                return c.metaData;
            }
            ((realmSet.RepresentativeName) this).q.s_().b().b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ((realmSet.RepresentativeName) this).q.s_().b().e("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final boolean g() {
        Boolean d;
        realmGet$BankBicKey.a();
        return !c(null, realmSet$hasDone.V) || (d = d("google_analytics_automatic_screen_reporting_enabled")) == null || d.booleanValue();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean h() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    ApplicationInfo applicationInfo = ((realmSet.RepresentativeName) this).q.t_().getApplicationInfo();
                    String c = getTotalBiayaTransfer.c();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null) {
                            z = false;
                            if (str.equals(c)) {
                                z = true;
                            }
                        }
                        this.e = Boolean.valueOf(z);
                    }
                    if (this.e == null) {
                        this.e = Boolean.TRUE;
                        ((realmSet.RepresentativeName) this).q.s_().b().b("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.e.booleanValue();
    }

    public final boolean i() {
        Boolean d = d("google_analytics_adid_collection_enabled");
        return d == null || d.booleanValue();
    }

    public final boolean j() {
        ((realmSet.RepresentativeName) this).q.n_();
        Boolean d = d("firebase_analytics_collection_deactivated");
        return d != null && d.booleanValue();
    }

    public final boolean j(String str) {
        return "1".equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    public final String k() {
        return d("debug.deferred.deeplink", "");
    }

    public final String m() {
        return d("debug.firebase.analytics.app", "");
    }

    final boolean n() {
        if (this.a == null) {
            Boolean d = d("app_measurement_lite");
            this.a = d;
            if (d == null) {
                this.a = false;
            }
        }
        return this.a.booleanValue() || !this.q.H();
    }
}
