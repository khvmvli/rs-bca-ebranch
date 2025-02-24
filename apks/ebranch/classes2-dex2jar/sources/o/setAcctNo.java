package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.realm.RealmFieldTypeConstants;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import o.realmGet;
import o.realmSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/setAcctNo.class */
public final class setAcctNo extends realmSet$RepresentativeRelationship {
    public static final /* synthetic */ int a;
    private static final String[] b = {"firebase_", "google_", "ga_"};
    private static final String[] c = {"_err"};
    private SecureRandom d;
    private int i;
    private Integer h = null;
    private final AtomicLong e = new AtomicLong(0);

    public setAcctNo(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    static final boolean a(String str) {
        setFotoKtp.b(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        setFotoKtp.b(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null) {
                return false;
            }
            return receiverInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private final Object c(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return c(String.valueOf(obj), i, z);
            }
            if (!z2) {
                return null;
            }
            if (!((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable instanceof Bundle) {
                    Bundle c2 = c((Bundle) parcelable);
                    if (!c2.isEmpty()) {
                        arrayList.add(c2);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    private static boolean c(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null) {
                return false;
            }
            return serviceInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static long d(byte[] bArr) {
        setFotoKtp.b(bArr);
        int length = bArr.length;
        int i = 0;
        setFotoKtp.a(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    public static MessageDigest d() {
        MessageDigest instance;
        for (int i = 0; i < 2; i++) {
            try {
                instance = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
            }
            if (instance != null) {
                return instance;
            }
        }
        return null;
    }

    static final boolean d(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    public static boolean d(String str) {
        setFotoKtp.c(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static boolean d(String str, String[] strArr) {
        setFotoKtp.b(strArr);
        for (String str2 : strArr) {
            if (c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context, boolean z) {
        setFotoKtp.b(context);
        return Build.VERSION.SDK_INT >= 24 ? c(context, "com.google.android.gms.measurement.AppMeasurementJobService") : c(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean e(String str) {
        return !c[0].equals(str);
    }

    private final int m(String str) {
        if ("_ldl".equals(str)) {
            this.q.t();
            return 2048;
        } else if ("_id".equals(str)) {
            this.q.t();
            return RealmFieldTypeConstants.SET_OFFSET;
        } else if (!this.q.t().c((String) null, realmSet.hasDone.L) || !"_lgclid".equals(str)) {
            this.q.t();
            return 36;
        } else {
            this.q.t();
            return 100;
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int a() {
        if (this.h == null) {
            this.h = Integer.valueOf(realmGet.incomeSourceValue.b().b(this.q.t_()) / DateTimeConstants.MILLIS_PER_SECOND);
        }
        return this.h.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Type inference failed for: r0v77, types: [o.realmGet$idType, o.realmGet$FlagTxnBerkala, o.realmSet$RepresentativeName] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final int a(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12, android.os.Bundle r13, java.util.List<java.lang.String> r14, boolean r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 595
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAcctNo.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final long a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str3 = null;
                str = null;
                str2 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.q.s_().c().e("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final Object a(String str, Object obj) {
        boolean equals = "_ev".equals(str);
        int i = RealmFieldTypeConstants.SET_OFFSET;
        if (equals) {
            this.q.t();
            return c(RealmFieldTypeConstants.SET_OFFSET, obj, true, true);
        }
        if (c(str)) {
            this.q.t();
        } else {
            this.q.t();
            i = 100;
        }
        return c(i, obj, false, true);
    }

    public final void a(setBankTransfers setbanktransfers, String str, int i, String str2, String str3, int i2, boolean z) {
        Bundle bundle = new Bundle();
        d(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        if (z) {
            setbanktransfers.a(str, "_err", bundle);
            return;
        }
        this.q.n_();
        this.q.x().e("auto", "_err", bundle);
    }

    public final boolean a(String str, String str2) {
        if (str2 == null) {
            this.q.s_().a().e("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.q.s_().a().e("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.q.s_().a().a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.q.s_().a().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean a(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.q.s_().a().e("Name is required and can't be null. Type", str);
            return false;
        }
        setFotoKtp.b(str2);
        String[] strArr3 = b;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.q.s_().a().a("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !d(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && d(str2, strArr2)) {
            return true;
        }
        this.q.s_().a().a("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final int b(String str, Object obj) {
        return "_ldl".equals(str) ? e("user property referrer", str, m(str), obj) : e("user property", str, m(str), obj) ? 0 : 7;
    }

    public final URL b(long j, String str, String str2, long j2) {
        try {
            setFotoKtp.c(str2);
            setFotoKtp.c(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 42004L, Integer.valueOf(a())), str2, str, Long.valueOf(j2));
            String str3 = format;
            if (str.equals(this.q.t().k())) {
                str3 = format.concat("&ddl_test=1");
            }
            return new URL(str3);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.q.s_().b().e("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final boolean b(String str) {
        r_();
        if (realmGet.jenisWarkatTransaksi.b(this.q.t_()).a(str) == 0) {
            return true;
        }
        this.q.s_().h().e("Permission not granted", str);
        return false;
    }

    final byte[] b(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int c(int i) {
        return realmGet.incomeSourceValue.b().c(this.q.t_(), 12451000);
    }

    public final Bundle c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, bundle.get(str));
                if (a2 == null) {
                    this.q.s_().f().e("Param value can't be null", this.q.w().c(str));
                } else {
                    e(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    public final Object c(String str, Object obj) {
        return "_ldl".equals(str) ? c(m(str), obj, true, false) : c(m(str), obj, false, false);
    }

    public final String c(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final void c(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.q.u().e(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void c(setDescTransaksi setdesctransaksi, int i) {
        int i2 = 0;
        for (String str : new TreeSet(setdesctransaksi.b.keySet())) {
            if (d(str)) {
                int i3 = i2 + 1;
                i2 = i3;
                if (i3 > i) {
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    this.q.s_().a().a(sb.toString(), this.q.w().b(setdesctransaksi.e), this.q.w().c(setdesctransaksi.b));
                    d(setdesctransaksi.b, 5);
                    setdesctransaksi.b.remove(str);
                    i2 = i3;
                }
            }
        }
    }

    final boolean c(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final Bundle d(String str, String str2, Bundle bundle, List<String> list, boolean z) {
        int i;
        boolean d = d(str2, realmSet$SenderName.a);
        Bundle bundle2 = new Bundle(bundle);
        int c2 = this.q.t().c();
        int i2 = 0;
        for (String str3 : this.q.t().c(str, realmSet.hasDone.w) ? new TreeSet<>(bundle.keySet()) : bundle.keySet()) {
            if (list == null || !list.contains(str3)) {
                int g = z ? g(str3) : 0;
                i = g;
                if (g == 0) {
                    i = j(str3);
                }
            } else {
                i = 0;
            }
            if (i != 0) {
                d(bundle2, i, str3, str3, i == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int a2 = a(str, str2, str3, bundle.get(str3), bundle2, list, z, d);
                if (a2 == 17) {
                    d(bundle2, 17, str3, str3, (Object) false);
                } else if (a2 != 0 && !"_ev".equals(str3)) {
                    d(bundle2, a2, a2 == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (d(str3)) {
                    i2++;
                    if (i2 > c2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(c2);
                        sb.append(" params");
                        this.q.s_().a().a(sb.toString(), this.q.w().b(str2), this.q.w().c(bundle));
                        d(bundle2, 5);
                        bundle2.remove(str3);
                    }
                }
            }
        }
        return bundle2;
    }

    public final realmGet.tipeNasabah d(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (f(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            Bundle d = d(str, str2, bundle2, getStatusKewarganegaraanPengirim.a("_o"), false);
            Bundle bundle3 = d;
            if (z) {
                bundle3 = c(d);
            }
            setFotoKtp.b(bundle3);
            return new realmGet.tipeNasabah(str2, new realmGet.nomorRekening(bundle3), str3, j);
        }
        this.q.s_().b().e("Invalid conditional property event name", this.q.w().e(str2));
        throw new IllegalArgumentException();
    }

    final void d(Bundle bundle, int i, String str, String str2, Object obj) {
        if (d(bundle, i)) {
            this.q.t();
            bundle.putString("_ev", c(str, 40, true));
            if (obj != null) {
                setFotoKtp.b(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    public final void d(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.q.s_().c().e("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public final boolean d(String str, int i, String str2) {
        if (str2 == null) {
            this.q.s_().a().e("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.q.s_().a().b("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public final boolean d(String str, String str2) {
        if (str2 == null) {
            this.q.s_().a().e("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.q.s_().a().e("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            int i = codePointAt;
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    i = 95;
                } else {
                    this.q.s_().a().a("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(i);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.q.s_().a().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            getTipeTujuanTransaksiPenerima.b();
            if (this.q.t().c((String) null, realmSet.hasDone.N) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (a(str2)) {
                    return true;
                }
                this.q.s_().a().e("Invalid admob_app_id. Analytics disabled.", setIsInputAtmPemrek.d(str2));
                return false;
            } else if (!this.q.B()) {
                return false;
            } else {
                this.q.s_().a().b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
        } else if (a(str)) {
            return true;
        } else {
            if (!this.q.B()) {
                return false;
            }
            this.q.s_().a().e("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", setIsInputAtmPemrek.d(str));
            return false;
        }
    }

    public final void e(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.q.s_().f().a("Not putting event parameter. Invalid value type. name, type", this.q.w().c(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    final void e(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        int i2;
        if (bundle != null) {
            this.q.t();
            int i3 = 0;
            for (String str4 : new TreeSet(bundle.keySet())) {
                if (list == null || !list.contains(str4)) {
                    int g = z ? g(str4) : 0;
                    i = g;
                    if (g == 0) {
                        i = j(str4);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    d(bundle, i, str4, str4, i == 3 ? str4 : null);
                    bundle.remove(str4);
                } else {
                    if (c(bundle.get(str4))) {
                        this.q.s_().f().b("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                        i2 = 22;
                    } else {
                        i2 = a(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        d(bundle, i2, str4, str4, bundle.get(str4));
                        bundle.remove(str4);
                    } else if (d(str4) && !d(str4, realmSet$SenderIdNumber.d)) {
                        int i4 = i3 + 1;
                        i3 = i4;
                        if (i4 > 0) {
                            this.q.s_().a().a("Item cannot contain custom parameters", this.q.w().b(str2), this.q.w().c(bundle));
                            d(bundle, 23);
                            bundle.remove(str4);
                            i3 = i4;
                        }
                    }
                }
            }
        }
    }

    @Override // o.realmSet$RepresentativeRelationship
    protected final boolean e() {
        return true;
    }

    public final boolean e(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d = realmGet.jenisWarkatTransaksi.b(context).d(str, 64);
            if (d == null || d.signatures == null || d.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(d.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.q.s_().b().e("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.q.s_().b().e("Error obtaining certificate", e2);
            return true;
        }
    }

    final boolean e(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.codePointCount(0, valueOf.length()) <= i) {
            return true;
        }
        this.q.s_().f().b("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
        return false;
    }

    public final boolean e(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            setFotoKtp.b(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final int f(String str) {
        if (!d("event", str)) {
            return 2;
        }
        if (!a("event", realmSet$SenderName.b, realmSet$SenderName.e, str)) {
            return 13;
        }
        this.q.t();
        return !d("event", 40, str) ? 2 : 0;
    }

    final int g(String str) {
        if (!a("event param", str)) {
            return 3;
        }
        if (!a("event param", null, null, str)) {
            return 14;
        }
        this.q.t();
        return !d("event param", 40, str) ? 3 : 0;
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom g() {
        r_();
        if (this.d == null) {
            this.d = new SecureRandom();
        }
        return this.d;
    }

    public final int h(String str) {
        if (!d("user property", str)) {
            return 6;
        }
        if (!a("user property", realmSet$SenderPhone.e, null, str)) {
            return 15;
        }
        this.q.t();
        return !d("user property", 24, str) ? 6 : 0;
    }

    public final long i() {
        long andIncrement;
        long nextLong;
        long j;
        if (this.e.get() == 0) {
            synchronized (this.e) {
                nextLong = new Random(System.nanoTime() ^ this.q.q_().e()).nextLong();
                int i = this.i + 1;
                this.i = i;
                j = (long) i;
            }
            return nextLong + j;
        }
        synchronized (this.e) {
            this.e.compareAndSet(-1, 1);
            andIncrement = this.e.getAndIncrement();
        }
        return andIncrement;
    }

    public final boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m = this.q.t().m();
        this.q.n_();
        return m.equals(str);
    }

    final int j(String str) {
        if (!d("event param", str)) {
            return 3;
        }
        if (!a("event param", null, null, str)) {
            return 14;
        }
        this.q.t();
        return !d("event param", 40, str) ? 3 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // o.realmSet$RepresentativeRelationship
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected final void u_() {
        /*
            r5 = this;
            r0 = r5
            r0.r_()
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            long r0 = r0.nextLong()
            r7 = r0
            r0 = r7
            r9 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
            r0 = r6
            long r0 = r0.nextLong()
            r7 = r0
            r0 = r7
            r9 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
            r0 = r5
            o.realmGet$TxnPurpose r0 = r0.q
            o.setIsInputAtmPemrek r0 = r0.s_()
            o.setCodeCurrencyTeller r0 = r0.c()
            java.lang.String r1 = "Utils falling back to Random for random id"
            r0.b(r1)
            r0 = r7
            r9 = r0
        L_0x003b:
            r0 = r5
            java.util.concurrent.atomic.AtomicLong r0 = r0.e
            r1 = r9
            r0.set(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAcctNo.u_():void");
    }
}
