package okhttp3;

import o.setResponseMessage;
/* loaded from: classes2-dex2jar.jar:okhttp3/CertificatePinner$Pin.class */
final class CertificatePinner$Pin {
    private static final String WILDCARD = "*.";
    final String canonicalHostname;
    final setResponseMessage hash;
    final String hashAlgorithm;
    final String pattern;

    CertificatePinner$Pin(String str, String str2) {
        String str3;
        this.pattern = str;
        if (str.startsWith(WILDCARD)) {
            StringBuilder sb = new StringBuilder("http://");
            sb.append(str.substring(2));
            str3 = HttpUrl.get(sb.toString()).host();
        } else {
            StringBuilder sb2 = new StringBuilder("http://");
            sb2.append(str);
            str3 = HttpUrl.get(sb2.toString()).host();
        }
        this.canonicalHostname = str3;
        if (str2.startsWith("sha1/")) {
            this.hashAlgorithm = "sha1/";
            this.hash = setResponseMessage.d(str2.substring(5));
        } else if (str2.startsWith("sha256/")) {
            this.hashAlgorithm = "sha256/";
            this.hash = setResponseMessage.d(str2.substring(7));
        } else {
            StringBuilder sb3 = new StringBuilder("pins must start with 'sha256/' or 'sha1/': ");
            sb3.append(str2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (this.hash == null) {
            StringBuilder sb4 = new StringBuilder("pins must be base64: ");
            sb4.append(str2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof CertificatePinner$Pin) {
            CertificatePinner$Pin certificatePinner$Pin = (CertificatePinner$Pin) obj;
            if (this.pattern.equals(certificatePinner$Pin.pattern) && this.hashAlgorithm.equals(certificatePinner$Pin.hashAlgorithm) && this.hash.equals(certificatePinner$Pin.hash)) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    public final int hashCode() {
        return ((((this.pattern.hashCode() + 527) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
        if (r8.regionMatches(false, r0 + 1, r0, 0, r0.length()) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final boolean matches(java.lang.String r8) {
        /*
            r7 = this;
            r0 = r7
            java.lang.String r0 = r0.pattern
            java.lang.String r1 = "*."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0049
            r0 = r8
            r1 = 46
            int r0 = r0.indexOf(r1)
            r9 = r0
            r0 = r8
            int r0 = r0.length()
            r10 = r0
            r0 = 1
            r11 = r0
            r0 = r10
            r1 = r9
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            r1 = r7
            java.lang.String r1 = r1.canonicalHostname
            int r1 = r1.length()
            if (r0 != r1) goto L_0x0043
            r0 = r7
            java.lang.String r0 = r0.canonicalHostname
            r12 = r0
            r0 = r8
            r1 = 0
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            r3 = r12
            r4 = 0
            r5 = r12
            int r5 = r5.length()
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0046
        L_0x0043:
            r0 = 0
            r11 = r0
        L_0x0046:
            r0 = r11
            return r0
        L_0x0049:
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.canonicalHostname
            boolean r0 = r0.equals(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner$Pin.matches(java.lang.String):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hashAlgorithm);
        sb.append(this.hash.c());
        return sb.toString();
    }
}
