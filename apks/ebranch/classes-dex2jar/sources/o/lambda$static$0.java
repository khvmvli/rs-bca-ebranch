package o;
/* loaded from: classes-dex2jar.jar:o/lambda$static$0.class */
public final class lambda$static$0 {
    public final float a;
    public final String b;
    public final float c;
    public final lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver d;
    public final int e;
    public final float f;
    public final int g;
    public final boolean h;
    public final float i;
    public final String j;

    /* renamed from: o  reason: collision with root package name */
    public final int f164o;

    public lambda$static$0(String str, String str2, float f, lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver lambda_static_0_mediabrowsercompat_customactionresultreceiver, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.j = str;
        this.b = str2;
        this.f = f;
        this.d = lambda_static_0_mediabrowsercompat_customactionresultreceiver;
        this.f164o = i;
        this.c = f2;
        this.a = f3;
        this.e = i2;
        this.g = i3;
        this.i = f4;
        this.h = z;
    }

    public final int hashCode() {
        int hashCode = (int) (((float) (((this.j.hashCode() * 31) + this.b.hashCode()) * 31)) + this.f);
        int ordinal = this.d.ordinal();
        int i = this.f164o;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.c);
        return (((((((hashCode * 31) + ordinal) * 31) + i) * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.e;
    }
}
