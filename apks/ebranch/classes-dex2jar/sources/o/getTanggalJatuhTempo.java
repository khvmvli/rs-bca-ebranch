package o;

import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/getTanggalJatuhTempo.class */
public final class getTanggalJatuhTempo {
    public static final getTanggalJatuhTempo e = new getTanggalJatuhTempo(null, null);
    private final Boolean b;
    private final Boolean d;

    public getTanggalJatuhTempo(Boolean bool, Boolean bool2) {
        this.b = bool;
        this.d = bool2;
    }

    private static final char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    private static Boolean a(char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    static Boolean b(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue()) {
            z = false;
            if (bool2.booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    private static Boolean b(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static getTanggalJatuhTempo c(Bundle bundle) {
        return bundle == null ? e : new getTanggalJatuhTempo(b(bundle.getString("ad_storage")), b(bundle.getString("analytics_storage")));
    }

    static final int d(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static getTanggalJatuhTempo d(String str) {
        Boolean bool = null;
        Boolean bool2 = null;
        if (str != null) {
            bool = str.length() >= 3 ? a(str.charAt(2)) : null;
            if (str.length() >= 4) {
                bool2 = a(str.charAt(3));
            }
        } else {
            bool2 = null;
        }
        return new getTanggalJatuhTempo(bool, bool2);
    }

    public static boolean d(int i, int i2) {
        return i <= i2;
    }

    public final String a() {
        return "G1" + a(this.b) + a(this.d);
    }

    public final getTanggalJatuhTempo a(getTanggalJatuhTempo gettanggaljatuhtempo) {
        return new getTanggalJatuhTempo(b(this.b, gettanggaljatuhtempo.b), b(this.d, gettanggaljatuhtempo.d));
    }

    public final Boolean b() {
        return this.d;
    }

    public final boolean c() {
        Boolean bool = this.b;
        return bool == null || bool.booleanValue();
    }

    public final getTanggalJatuhTempo d(getTanggalJatuhTempo gettanggaljatuhtempo) {
        Boolean bool = this.b;
        Boolean bool2 = bool;
        if (bool == null) {
            bool2 = gettanggaljatuhtempo.b;
        }
        Boolean bool3 = this.d;
        Boolean bool4 = bool3;
        if (bool3 == null) {
            bool4 = gettanggaljatuhtempo.d;
        }
        return new getTanggalJatuhTempo(bool2, bool4);
    }

    public final boolean d() {
        Boolean bool = this.d;
        return bool == null || bool.booleanValue();
    }

    public final Boolean e() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r4.d != java.lang.Boolean.FALSE) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e(o.getTanggalJatuhTempo r4) {
        /*
            r3 = this;
            r0 = r3
            java.lang.Boolean r0 = r0.b
            r5 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L_0x001b
            r0 = r4
            java.lang.Boolean r0 = r0.b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            if (r0 != r1) goto L_0x0037
        L_0x001b:
            r0 = r7
            r8 = r0
            r0 = r3
            java.lang.Boolean r0 = r0.d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            if (r0 != r1) goto L_0x003a
            r0 = r7
            r8 = r0
            r0 = r4
            java.lang.Boolean r0 = r0.d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            if (r0 == r1) goto L_0x003a
        L_0x0037:
            r0 = 1
            r8 = r0
        L_0x003a:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTanggalJatuhTempo.e(o.getTanggalJatuhTempo):boolean");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getTanggalJatuhTempo)) {
            return false;
        }
        getTanggalJatuhTempo gettanggaljatuhtempo = (getTanggalJatuhTempo) obj;
        return d(this.b) == d(gettanggaljatuhtempo.b) && d(this.d) == d(gettanggaljatuhtempo.d);
    }

    public final int hashCode() {
        return ((d(this.b) + 527) * 31) + d(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: adStorage=");
        Boolean bool = this.b;
        String str = "granted";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.d;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true != bool2.booleanValue()) {
                str = "denied";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
