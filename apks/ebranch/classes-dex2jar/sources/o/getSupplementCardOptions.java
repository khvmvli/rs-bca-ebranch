package o;

import sun.misc.Unsafe;
/* loaded from: classes-dex2jar.jar:o/getSupplementCardOptions.class */
final class getSupplementCardOptions extends realmGet$supplementCardOptions {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getSupplementCardOptions(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // o.realmGet$supplementCardOptions
    public final void a(Object obj, long j, double d) {
        d(obj, j, Double.doubleToLongBits(d));
    }

    @Override // o.realmGet$supplementCardOptions
    public final void a(Object obj, long j, float f) {
        e(obj, j, Float.floatToIntBits(f));
    }

    @Override // o.realmGet$supplementCardOptions
    public final boolean b(Object obj, long j) {
        return realmGet$jobSector.a ? realmGet$jobSector.j(obj, j) : realmGet$jobSector.g(obj, j);
    }

    @Override // o.realmGet$supplementCardOptions
    public final void c(Object obj, long j, boolean z) {
        if (realmGet$jobSector.a) {
            realmGet$jobSector.a(obj, j, r8 ? (byte) 1 : 0);
        } else {
            realmGet$jobSector.b(obj, j, r8 ? (byte) 1 : 0);
        }
    }

    @Override // o.realmGet$supplementCardOptions
    public final double d(Object obj, long j) {
        return Double.longBitsToDouble(a(obj, j));
    }

    @Override // o.realmGet$supplementCardOptions
    public final void d(Object obj, long j, byte b) {
        if (realmGet$jobSector.a) {
            realmGet$jobSector.a(obj, j, b);
        } else {
            realmGet$jobSector.b(obj, j, b);
        }
    }

    @Override // o.realmGet$supplementCardOptions
    public final float e(Object obj, long j) {
        return Float.intBitsToFloat(c(obj, j));
    }
}
