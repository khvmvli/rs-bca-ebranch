package org.bson.types;

import com.bca.smartbranch.data.localdb.ReservasiOnline;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:org/bson/types/Decimal128.class */
public final class Decimal128 extends Number implements Comparable<Decimal128> {
    public final long f;
    public final long g;
    private static final BigInteger h = new BigInteger(ReservasiOnline.LAYANAN_GIRO);
    private static final BigInteger i = new BigInteger("1");
    private static final BigInteger k = new BigInteger("0");
    private static final Set<String> l = new HashSet(Collections.singletonList("nan"));
    private static final Set<String> n = new HashSet(Collections.singletonList("-nan"));
    private static final Set<String> m = new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));

    /* renamed from: o  reason: collision with root package name */
    private static final Set<String> f298o = new HashSet(Arrays.asList("-inf", "-infinity"));
    public static final Decimal128 c = fromIEEE754BIDEncoding(8646911284551352320L, 0);
    public static final Decimal128 b = fromIEEE754BIDEncoding(-576460752303423488L, 0);
    public static final Decimal128 e = fromIEEE754BIDEncoding(-288230376151711744L, 0);
    public static final Decimal128 a = fromIEEE754BIDEncoding(8935141660703064064L, 0);
    public static final Decimal128 j = fromIEEE754BIDEncoding(3476778912330022912L, 0);
    public static final Decimal128 d = fromIEEE754BIDEncoding(-5746593124524752896L, 0);

    public Decimal128(long j2) {
        this(new BigDecimal(j2, MathContext.DECIMAL128));
    }

    private Decimal128(long j2, long j3) {
        this.g = j2;
        this.f = j3;
    }

    public Decimal128(BigDecimal bigDecimal) {
        this(bigDecimal, bigDecimal.signum() == -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ac, code lost:
        if (r9 != false) goto L_0x01af;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARN: Type inference failed for: r0v39, types: [long] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4, types: [long] */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v8, types: [long] */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private Decimal128(java.math.BigDecimal r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.types.Decimal128.<init>(java.math.BigDecimal, boolean):void");
    }

    private static int a(BigDecimal bigDecimal, int i2) {
        String obj = bigDecimal.unscaledValue().abs().toString();
        int max = Math.max(0, obj.length() - i2);
        for (int i3 = max; i3 < obj.length(); i3++) {
            if (obj.charAt(i3) != '0') {
                StringBuilder sb = new StringBuilder("Conversion to Decimal128 would require inexact rounding of ");
                sb.append(bigDecimal);
                throw new NumberFormatException(sb.toString());
            }
        }
        return max;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r6.compareTo(java.math.BigDecimal.ZERO) == 0) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean a(java.math.BigDecimal r6) {
        /*
            r5 = this;
            r0 = r5
            long r0 = r0.g
            r7 = r0
            r0 = 1
            r9 = r0
            r0 = r7
            r1 = 8935141660703064064(0x7c00000000000000, double:1.94906280228E289)
            long r0 = r0 & r1
            r1 = 8935141660703064064(0x7c00000000000000, double:1.94906280228E289)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r10 = r0
            goto L_0x001d
        L_0x001a:
            r0 = 0
            r10 = r0
        L_0x001d:
            r0 = r10
            if (r0 != 0) goto L_0x004c
            r0 = r5
            long r0 = r0.g
            r1 = 8646911284551352320(0x7800000000000000, double:1.0565890622713305E270)
            long r0 = r0 & r1
            r1 = 8646911284551352320(0x7800000000000000, double:1.0565890622713305E270)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r0 = 1
            r10 = r0
            goto L_0x003a
        L_0x0037:
            r0 = 0
            r10 = r0
        L_0x003a:
            r0 = r10
            if (r0 != 0) goto L_0x004c
            r0 = r6
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            r0 = 0
            r9 = r0
        L_0x004f:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.types.Decimal128.a(java.math.BigDecimal):boolean");
    }

    private boolean b(BigDecimal bigDecimal) {
        boolean z = true;
        if (!((this.g & Long.MIN_VALUE) == Long.MIN_VALUE) || bigDecimal.signum() != 0) {
            z = false;
        }
        return z;
    }

    private byte[] b() {
        byte[] bArr = new byte[15];
        long j2 = 255;
        long j3 = 255;
        for (int i2 = 14; i2 >= 7; i2--) {
            bArr[i2] = (byte) ((byte) ((int) ((this.f & j3) >>> ((14 - i2) << 3))));
            j3 <<= 8;
        }
        for (int i3 = 6; i3 > 0; i3--) {
            bArr[i3] = (byte) ((byte) ((int) ((this.g & j2) >>> ((6 - i3) << 3))));
            j2 <<= 8;
        }
        bArr[0] = (byte) ((byte) ((int) ((this.g & 281474976710656L) >>> 48)));
        return bArr;
    }

    public static Decimal128 c(String str) {
        String lowerCase = str.toLowerCase();
        if (l.contains(lowerCase)) {
            return a;
        }
        if (n.contains(lowerCase)) {
            return e;
        }
        if (m.contains(lowerCase)) {
            return c;
        }
        if (f298o.contains(lowerCase)) {
            return b;
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        boolean z = false;
        if (str.charAt(0) == '-') {
            z = true;
        }
        return new Decimal128(bigDecimal, z);
    }

    private BigDecimal d() {
        char c2;
        long j2;
        boolean z = false;
        int i2 = 1;
        if ((this.g & 6917529027641081856L) == 6917529027641081856L) {
            j2 = this.g & 2305807824841605120L;
            c2 = '/';
        } else {
            j2 = this.g & 9223231299366420480L;
            c2 = '1';
        }
        int i3 = -(((int) (j2 >>> c2)) - 6176);
        if ((this.g & 6917529027641081856L) == 6917529027641081856L) {
            return BigDecimal.valueOf(0, i3);
        }
        if ((this.g & Long.MIN_VALUE) == Long.MIN_VALUE) {
            z = true;
        }
        if (z) {
            i2 = -1;
        }
        return new BigDecimal(new BigInteger(i2, b()), i3);
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j2, long j3) {
        return new Decimal128(j2, j3);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Decimal128 decimal128) {
        Decimal128 decimal1282 = decimal128;
        boolean z = false;
        int i2 = 0;
        boolean z2 = true;
        if ((this.g & 8935141660703064064L) == 8935141660703064064L) {
            if ((decimal1282.g & 8935141660703064064L) == 8935141660703064064L) {
                i2 = 1;
            }
            return i2 ^ 1;
        }
        if ((this.g & 8646911284551352320L) == 8646911284551352320L) {
            if ((this.g & Long.MIN_VALUE) == Long.MIN_VALUE) {
                if (!((decimal1282.g & 8646911284551352320L) == 8646911284551352320L)) {
                    return -1;
                }
                if ((decimal1282.g & Long.MIN_VALUE) != Long.MIN_VALUE) {
                    z2 = false;
                }
                return z2 ? 0 : -1;
            }
            if ((decimal1282.g & 8935141660703064064L) == 8935141660703064064L) {
                return -1;
            }
            if (!((decimal1282.g & 8646911284551352320L) == 8646911284551352320L)) {
                return 1;
            }
            return !(((decimal1282.g & Long.MIN_VALUE) > Long.MIN_VALUE ? 1 : ((decimal1282.g & Long.MIN_VALUE) == Long.MIN_VALUE ? 0 : -1)) == 0) ? 0 : 1;
        }
        BigDecimal d2 = d();
        BigDecimal d3 = decimal1282.d();
        if (a(d2) && decimal1282.a(d3)) {
            if (b(d2)) {
                return decimal1282.b(d3) ? 0 : -1;
            }
            if (decimal1282.b(d3)) {
                return 1;
            }
        }
        if ((decimal1282.g & 8935141660703064064L) == 8935141660703064064L) {
            return -1;
        }
        if (!((decimal1282.g & 8646911284551352320L) == 8646911284551352320L)) {
            return d2.compareTo(d3);
        }
        if ((decimal1282.g & Long.MIN_VALUE) == Long.MIN_VALUE) {
            z = true;
        }
        return z ? 1 : -1;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        boolean z = true;
        if ((this.g & 8935141660703064064L) == 8935141660703064064L) {
            return Double.NaN;
        }
        if ((this.g & 8646911284551352320L) == 8646911284551352320L) {
            if ((this.g & Long.MIN_VALUE) != Long.MIN_VALUE) {
                z = false;
            }
            return z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        BigDecimal d2 = d();
        if (b(d2)) {
            return 0.0d;
        }
        return d2.doubleValue();
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        return this.g == decimal128.g && this.f == decimal128.f;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) doubleValue();
    }

    @Override // java.lang.Object
    public final int hashCode() {
        long j2 = this.f;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.g;
        return (i2 * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) doubleValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) doubleValue();
    }

    @Override // java.lang.Object
    public final String toString() {
        boolean z = true;
        if ((this.g & 8935141660703064064L) == 8935141660703064064L) {
            return "NaN";
        }
        if ((this.g & 8646911284551352320L) == 8646911284551352320L) {
            if ((this.g & Long.MIN_VALUE) != Long.MIN_VALUE) {
                z = false;
            }
            return z ? "-Infinity" : "Infinity";
        }
        StringBuilder sb = new StringBuilder();
        BigDecimal d2 = d();
        String obj = d2.unscaledValue().abs().toString();
        if ((this.g & Long.MIN_VALUE) == Long.MIN_VALUE) {
            sb.append('-');
        }
        int i2 = -d2.scale();
        int length = (obj.length() - 1) + i2;
        if (i2 > 0 || length < -6) {
            sb.append(obj.charAt(0));
            if (obj.length() > 1) {
                sb.append('.');
                sb.append((CharSequence) obj, 1, obj.length());
            }
            sb.append('E');
            if (length > 0) {
                sb.append('+');
            }
            sb.append(length);
        } else if (i2 == 0) {
            sb.append(obj);
        } else {
            int length2 = (-i2) - obj.length();
            if (length2 >= 0) {
                sb.append("0.");
                for (int i3 = 0; i3 < length2; i3++) {
                    sb.append('0');
                }
                sb.append((CharSequence) obj, 0, obj.length());
            } else {
                int i4 = -length2;
                sb.append((CharSequence) obj, 0, i4);
                sb.append('.');
                sb.append((CharSequence) obj, i4, i4 - i2);
            }
        }
        return sb.toString();
    }
}
