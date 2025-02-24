package o;
/* loaded from: classes2-dex2jar.jar:o/OnUpdateKliringPenerimaDataClick.class */
public final class OnUpdateKliringPenerimaDataClick {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final int k;
    public final long m;
    public final long n;

    /* renamed from: o  reason: collision with root package name */
    public final long f45o;

    public OnUpdateKliringPenerimaDataClick(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.i = i;
        this.g = i2;
        this.a = j;
        this.d = j2;
        this.f45o = j3;
        this.n = j4;
        this.m = j5;
        this.b = j6;
        this.c = j7;
        this.e = j8;
        this.f = i3;
        this.h = i4;
        this.k = i5;
        this.j = j9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsSnapshot{maxSize=");
        sb.append(this.i);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", cacheHits=");
        sb.append(this.a);
        sb.append(", cacheMisses=");
        sb.append(this.d);
        sb.append(", downloadCount=");
        sb.append(this.f);
        sb.append(", totalDownloadSize=");
        sb.append(this.f45o);
        sb.append(", averageDownloadSize=");
        sb.append(this.b);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.n);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.m);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.c);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.e);
        sb.append(", originalBitmapCount=");
        sb.append(this.h);
        sb.append(", transformedBitmapCount=");
        sb.append(this.k);
        sb.append(", timeStamp=");
        sb.append(this.j);
        sb.append('}');
        return sb.toString();
    }
}
