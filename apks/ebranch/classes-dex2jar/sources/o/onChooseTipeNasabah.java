package o;
/* loaded from: classes-dex2jar.jar:o/onChooseTipeNasabah.class */
public final class onChooseTipeNasabah extends BN5PilihRekeningFragment_ViewBinding {
    public final Object e;

    public onChooseTipeNasabah(Boolean bool) {
        this.e = bool;
    }

    public onChooseTipeNasabah(Number number) {
        this.e = number;
    }

    public onChooseTipeNasabah(String str) {
        this.e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if ((r0 instanceof java.lang.Byte) != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean e(o.onChooseTipeNasabah r2) {
        /*
            r0 = r2
            java.lang.Object r0 = r0.e
            r2 = r0
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Number
            r3 = r0
            r0 = 0
            r4 = r0
            r0 = r4
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x003e
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            r2 = r0
            r0 = r2
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 != 0) goto L_0x003c
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L_0x003c
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x003c
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto L_0x003c
            r0 = r4
            r5 = r0
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L_0x003e
        L_0x003c:
            r0 = 1
            r5 = r0
        L_0x003e:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onChooseTipeNasabah.e(o.onChooseTipeNasabah):boolean");
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final int a() {
        return this.e instanceof Number ? b().intValue() : Integer.parseInt(c());
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final Number b() {
        Object obj = this.e;
        return obj instanceof String ? new fotoID((String) obj) : (Number) obj;
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final String c() {
        Object obj = this.e;
        return obj instanceof Number ? b().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final double d() {
        return this.e instanceof Number ? b().doubleValue() : Double.parseDouble(c());
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final long e() {
        return this.e instanceof Number ? b().longValue() : Long.parseLong(c());
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        onChooseTipeNasabah onchoosetipenasabah = (onChooseTipeNasabah) obj;
        if (this.e == null) {
            if (onchoosetipenasabah.e != null) {
                z2 = false;
            }
            return z2;
        } else if (!e(this) || !e(onchoosetipenasabah)) {
            Object obj2 = this.e;
            if (!(obj2 instanceof Number) || !(onchoosetipenasabah.e instanceof Number)) {
                return obj2.equals(onchoosetipenasabah.e);
            }
            double doubleValue = b().doubleValue();
            double doubleValue2 = onchoosetipenasabah.b().doubleValue();
            boolean z3 = true;
            if (doubleValue != doubleValue2) {
                z3 = Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return z3;
        } else {
            if (b().longValue() != onchoosetipenasabah.b().longValue()) {
                z = false;
            }
            return z;
        }
    }

    public final int hashCode() {
        long j;
        if (this.e == null) {
            return 31;
        }
        if (e(this)) {
            j = b().longValue();
        } else {
            Object obj = this.e;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            j = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (j ^ (j >>> 32));
    }
}
