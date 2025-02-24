package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.setResponseMessage;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
/* loaded from: classes-dex2jar.jar:okhttp3/CertificatePinner.class */
public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* loaded from: classes-dex2jar.jar:okhttp3/CertificatePinner$Builder.class */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            if (str != null) {
                for (String str2 : strArr) {
                    this.pins.add(new Pin(str, str2));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        public final CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.pins), null);
        }
    }

    CertificatePinner(Set<Pin> set, @Nullable CertificateChainCleaner certificateChainCleaner) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(sha256((X509Certificate) certificate).c());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static setResponseMessage sha1(X509Certificate x509Certificate) {
        return setResponseMessage.d(x509Certificate.getPublicKey().getEncoded()).b();
    }

    static setResponseMessage sha256(X509Certificate x509Certificate) {
        return setResponseMessage.d(x509Certificate.getPublicKey().getEncoded()).h();
    }

    public final void check(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
            List<Certificate> list2 = list;
            if (certificateChainCleaner != null) {
                list2 = certificateChainCleaner.clean(list, str);
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list2.get(i);
                int size2 = findMatchingPins.size();
                setResponseMessage setresponsemessage = null;
                setResponseMessage setresponsemessage2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    Pin pin = findMatchingPins.get(i2);
                    if (pin.hashAlgorithm.equals("sha256/")) {
                        setResponseMessage setresponsemessage3 = setresponsemessage;
                        if (setresponsemessage == null) {
                            setresponsemessage3 = sha256(x509Certificate);
                        }
                        setresponsemessage = setresponsemessage3;
                        if (pin.hash.equals(setresponsemessage3)) {
                            return;
                        }
                    } else if (pin.hashAlgorithm.equals("sha1/")) {
                        setResponseMessage setresponsemessage4 = setresponsemessage2;
                        if (setresponsemessage2 == null) {
                            setresponsemessage4 = sha1(x509Certificate);
                        }
                        setresponsemessage2 = setresponsemessage4;
                        if (pin.hash.equals(setresponsemessage4)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                        sb.append(pin.hashAlgorithm);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list2.get(i3);
                sb2.append("\n    ");
                sb2.append(pin(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = findMatchingPins.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb2.append("\n    ");
                sb2.append(findMatchingPins.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        check(str, Arrays.asList(certificateArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r3.pins.equals(r0.pins) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(@javax.annotation.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r4
            boolean r0 = r0 instanceof okhttp3.CertificatePinner
            if (r0 == 0) goto L_0x0035
            r0 = r3
            okhttp3.internal.tls.CertificateChainCleaner r0 = r0.certificateChainCleaner
            r6 = r0
            r0 = r4
            okhttp3.CertificatePinner r0 = (okhttp3.CertificatePinner) r0
            r4 = r0
            r0 = r6
            r1 = r4
            okhttp3.internal.tls.CertificateChainCleaner r1 = r1.certificateChainCleaner
            boolean r0 = okhttp3.internal.Util.equal(r0, r1)
            if (r0 == 0) goto L_0x0035
            r0 = r3
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r0.pins
            r1 = r4
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r1.pins
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0037
        L_0x0035:
            r0 = 0
            r5 = r0
        L_0x0037:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.equals(java.lang.Object):boolean");
    }

    final List<Pin> findMatchingPins(String str) {
        List<Pin> emptyList = Collections.emptyList();
        for (Pin pin : this.pins) {
            if (pin.matches(str)) {
                List<Pin> list = emptyList;
                if (emptyList.isEmpty()) {
                    list = new ArrayList<>();
                }
                list.add(pin);
                emptyList = list;
            }
        }
        return emptyList;
    }

    public final int hashCode() {
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return ((certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0) * 31) + this.pins.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CertificatePinner withCertificateChainCleaner(@Nullable CertificateChainCleaner certificateChainCleaner) {
        return Util.equal(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }
}
