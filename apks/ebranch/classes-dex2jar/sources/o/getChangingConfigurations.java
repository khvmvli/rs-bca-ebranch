package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import o.VersionedParcel$ParcelException;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/getChangingConfigurations.class */
public final class getChangingConfigurations extends setOnStartEnterTransitionListener.RatingCompat {
    boolean a;
    private int b;
    VersionedParcel$ParcelException.write c;
    boolean d;
    public int e;
    private int f;
    private final LinearLayoutManager g;
    private final setOnStartEnterTransitionListener h;
    private boolean i;
    private boolean j;
    private RemoteActionCompatParcelizer k = new RemoteActionCompatParcelizer();
    private int l;
    private final VersionedParcel$ParcelException n;

    /* loaded from: classes-dex2jar.jar:o/getChangingConfigurations$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        float a;
        int c;
        int e;

        RemoteActionCompatParcelizer() {
        }
    }

    public getChangingConfigurations(VersionedParcel$ParcelException versionedParcel$ParcelException) {
        this.n = versionedParcel$ParcelException;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = versionedParcel$ParcelException.g;
        this.h = setonstartentertransitionlistener;
        this.g = (LinearLayoutManager) setonstartentertransitionlistener.z;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0289, code lost:
        if (r0[r0 - 1][1] >= (r0 - r0)) goto L_0x016a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02be  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a() {
        /*
        // Method dump skipped, instructions count: 754
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getChangingConfigurations.a():void");
    }

    private void b(int i) {
        if ((this.b != 3 || this.e != 0) && this.e != i) {
            this.e = i;
            VersionedParcel$ParcelException.write write = this.c;
            if (write != null) {
                write.e(i);
            }
        }
    }

    private void e() {
        this.b = 0;
        this.e = 0;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.k;
        remoteActionCompatParcelizer.c = -1;
        remoteActionCompatParcelizer.a = 0.0f;
        remoteActionCompatParcelizer.e = 0;
        this.f = -1;
        this.l = -1;
        this.j = false;
        this.i = false;
        this.a = false;
        this.d = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if ((r7 < 0) != (o.findFragmentByWho.k(r5.n.i.x) == 1)) goto L_0x0045;
     */
    @Override // o.setOnStartEnterTransitionListener.RatingCompat
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a(o.setOnStartEnterTransitionListener r6, int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getChangingConfigurations.a(o.setOnStartEnterTransitionListener, int, int):void");
    }

    public final double b() {
        a();
        return ((double) this.k.c) + ((double) this.k.a);
    }

    public final void d(int i, boolean z) {
        VersionedParcel$ParcelException.write write;
        this.b = z ? 2 : 3;
        boolean z2 = false;
        this.a = false;
        if (this.l != i) {
            z2 = true;
        }
        this.l = i;
        b(2);
        if (z2 && (write = this.c) != null) {
            write.a(i);
        }
    }

    @Override // o.setOnStartEnterTransitionListener.RatingCompat
    public final void e(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
        boolean z;
        if (!(this.b == 1 && this.e == 1) && i == 1) {
            this.a = false;
            this.b = 1;
            int i2 = this.l;
            if (i2 != -1) {
                this.f = i2;
                this.l = -1;
            } else if (this.f == -1) {
                this.f = this.g.g();
            }
            b(1);
            return;
        }
        int i3 = this.b;
        if (!(i3 == 1 || i3 == 4) || i != 2) {
            int i4 = this.b;
            if ((i4 == 1 || i4 == 4) && i == 0) {
                a();
                if (!this.i) {
                    z = true;
                    if (this.k.c != -1) {
                        int i5 = this.k.c;
                        VersionedParcel$ParcelException.write write = this.c;
                        z = true;
                        if (write != null) {
                            write.b(i5, 0.0f, 0);
                            z = true;
                        }
                    }
                } else if (this.k.e == 0) {
                    z = true;
                    if (this.f != this.k.c) {
                        int i6 = this.k.c;
                        VersionedParcel$ParcelException.write write2 = this.c;
                        z = true;
                        if (write2 != null) {
                            write2.a(i6);
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    b(0);
                    e();
                }
            }
            if (this.b == 2 && i == 0 && this.d) {
                a();
                if (this.k.e == 0) {
                    if (this.l != this.k.c) {
                        int i7 = this.k.c == -1 ? 0 : this.k.c;
                        VersionedParcel$ParcelException.write write3 = this.c;
                        if (write3 != null) {
                            write3.a(i7);
                        }
                    }
                    b(0);
                    e();
                }
            }
        } else if (this.i) {
            b(2);
            this.j = true;
        }
    }
}
