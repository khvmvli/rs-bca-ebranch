package o;

import java.util.Arrays;
import o.setContentInsetStartWithNavigation;
/* loaded from: classes-dex2jar.jar:o/setNavigationIcon.class */
public final class setNavigationIcon implements setContentInsetStartWithNavigation.IconCompatParcelizer {
    private static float g = 0.001f;
    protected final setContentInsetEndWithActions b;

    /* renamed from: o  reason: collision with root package name */
    private final setContentInsetStartWithNavigation f248o;
    private final int n = -1;
    private int k = 16;
    private int l = 16;
    int[] e = new int[16];
    int[] f = new int[16];
    int[] h = new int[16];
    float[] j = new float[16];
    int[] i = new int[16];
    int[] d = new int[16];
    int c = 0;
    int a = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNavigationIcon(setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, setContentInsetEndWithActions setcontentinsetendwithactions) {
        this.f248o = setcontentinsetstartwithnavigation;
        this.b = setcontentinsetendwithactions;
        d();
    }

    private void a(int i, setLogoDescription setlogodescription, float f) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.k) {
                i2 = -1;
                break;
            } else if (this.h[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        d(i2, setlogodescription, f);
        if (i != -1) {
            this.i[i2] = i;
            int[] iArr = this.d;
            iArr[i2] = iArr[i];
            iArr[i] = i2;
        } else {
            this.i[i2] = -1;
            if (this.c > 0) {
                this.d[i2] = this.a;
                this.a = i2;
            } else {
                this.d[i2] = -1;
            }
        }
        int i3 = this.d[i2];
        if (i3 != -1) {
            this.i[i3] = i2;
        }
        e(setlogodescription, i2);
    }

    private void b() {
        int i = this.k << 1;
        this.h = Arrays.copyOf(this.h, i);
        this.j = Arrays.copyOf(this.j, i);
        this.i = Arrays.copyOf(this.i, i);
        this.d = Arrays.copyOf(this.d, i);
        this.f = Arrays.copyOf(this.f, i);
        for (int i2 = this.k; i2 < i; i2++) {
            this.h[i2] = -1;
            this.f[i2] = -1;
        }
        this.k = i;
    }

    private void d(int i, setLogoDescription setlogodescription, float f) {
        this.h[i] = setlogodescription.c;
        this.j[i] = f;
        this.i[i] = -1;
        this.d[i] = -1;
        setlogodescription.d(this.f248o);
        setlogodescription.s++;
        this.c++;
    }

    private void d(setLogoDescription setlogodescription) {
        int[] iArr;
        int i;
        int i2 = setlogodescription.c % this.l;
        int i3 = this.e[i2];
        if (i3 != -1) {
            int i4 = setlogodescription.c;
            int i5 = i3;
            if (this.h[i3] == i4) {
                int[] iArr2 = this.e;
                int[] iArr3 = this.f;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
                return;
            }
            while (true) {
                iArr = this.f;
                i = iArr[i5];
                if (i == -1 || this.h[i] == i4) {
                    break;
                }
                i5 = i;
            }
            if (i != -1 && this.h[i] == i4) {
                iArr[i5] = iArr[i];
                iArr[i] = -1;
            }
        }
    }

    private int e(setLogoDescription setlogodescription) {
        int i;
        if (this.c == 0 || setlogodescription == null) {
            return -1;
        }
        int i2 = setlogodescription.c;
        int i3 = this.e[i2 % this.l];
        if (i3 == -1) {
            return -1;
        }
        int i4 = i3;
        if (this.h[i3] == i2) {
            return i3;
        }
        do {
            i = this.f[i4];
            if (i == -1) {
                break;
            }
            i4 = i;
        } while (this.h[i] != i2);
        if (i != -1 && this.h[i] == i2) {
            return i;
        }
        return -1;
    }

    private void e(setLogoDescription setlogodescription, int i) {
        int[] iArr;
        int i2 = setlogodescription.c % this.l;
        int[] iArr2 = this.e;
        int i3 = iArr2[i2];
        int i4 = i3;
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                }
                i4 = i5;
            }
            iArr[i4] = i;
        }
        this.f[i] = -1;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float a(int i) {
        int i2 = this.c;
        int i3 = this.a;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.j[i3];
            }
            i3 = this.d[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final int a() {
        return this.c;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void a(float f) {
        int i = this.c;
        int i2 = this.a;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.j;
            fArr[i2] = fArr[i2] / f;
            i2 = this.d[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final boolean b(setLogoDescription setlogodescription) {
        return e(setlogodescription) != -1;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float c(setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, boolean z) {
        int e = e(setcontentinsetstartwithnavigation.b);
        float f = e != -1 ? this.j[e] : 0.0f;
        d(setcontentinsetstartwithnavigation.b, z);
        setNavigationIcon setnavigationicon = (setNavigationIcon) setcontentinsetstartwithnavigation.c;
        int i = setnavigationicon.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            i2 = i2;
            if (setnavigationicon.h[i3] != -1) {
                e(this.b.b[setnavigationicon.h[i3]], setnavigationicon.j[i3] * f, z);
                i2++;
            }
            i3++;
        }
        return f;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float c(setLogoDescription setlogodescription) {
        int e = e(setlogodescription);
        if (e != -1) {
            return this.j[e];
        }
        return 0.0f;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final setLogoDescription c(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.a;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.b.b[this.h[i3]];
            }
            i3 = this.d[i3];
            if (i3 == -1) {
                return null;
            }
        }
        return null;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void c() {
        int i = this.c;
        int i2 = this.a;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.j;
            fArr[i2] = -fArr[i2];
            i2 = this.d[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float d(setLogoDescription setlogodescription, boolean z) {
        int e = e(setlogodescription);
        if (e == -1) {
            return 0.0f;
        }
        d(setlogodescription);
        float f = this.j[e];
        if (this.a == e) {
            this.a = this.d[e];
        }
        this.h[e] = -1;
        int[] iArr = this.i;
        int i = iArr[e];
        if (i != -1) {
            int[] iArr2 = this.d;
            iArr2[i] = iArr2[e];
        }
        int i2 = this.d[e];
        if (i2 != -1) {
            iArr[i2] = iArr[e];
        }
        this.c--;
        setlogodescription.s--;
        if (z) {
            setlogodescription.a(this.f248o);
        }
        return f;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void d() {
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            setLogoDescription c = c(i2);
            if (c != null) {
                c.a(this.f248o);
            }
        }
        for (int i3 = 0; i3 < this.k; i3++) {
            this.h[i3] = -1;
            this.f[i3] = -1;
        }
        for (int i4 = 0; i4 < this.l; i4++) {
            this.e[i4] = -1;
        }
        this.c = 0;
        this.a = -1;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void d(setLogoDescription setlogodescription, float f) {
        int i;
        float f2 = g;
        if (f <= (-f2) || f >= f2) {
            int i2 = 0;
            if (this.c == 0) {
                d(0, setlogodescription, f);
                e(setlogodescription, 0);
                this.a = 0;
                return;
            }
            int e = e(setlogodescription);
            if (e != -1) {
                this.j[e] = f;
                return;
            }
            if (this.c + 1 >= this.k) {
                b();
            }
            int i3 = this.c;
            int i4 = this.a;
            int i5 = -1;
            while (true) {
                i = i5;
                if (i2 >= i3) {
                    break;
                } else if (this.h[i4] == setlogodescription.c) {
                    this.j[i4] = f;
                    return;
                } else {
                    if (this.h[i4] < setlogodescription.c) {
                        i5 = i4;
                    }
                    i4 = this.d[i4];
                    if (i4 == -1) {
                        i = i5;
                        break;
                    }
                    i2++;
                }
            }
            a(i, setlogodescription, f);
            return;
        }
        d(setlogodescription, true);
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void e(setLogoDescription setlogodescription, float f, boolean z) {
        float f2 = g;
        if (f <= (-f2) || f >= f2) {
            int e = e(setlogodescription);
            if (e == -1) {
                d(setlogodescription, f);
                return;
            }
            float[] fArr = this.j;
            float f3 = fArr[e] + f;
            fArr[e] = f3;
            float f4 = g;
            if (f3 > (-f4) && f3 < f4) {
                fArr[e] = 0.0f;
                d(setlogodescription, z);
            }
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" { ");
        String obj = sb.toString();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            setLogoDescription c = c(i2);
            obj = obj;
            if (c != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(c);
                sb2.append(" = ");
                sb2.append(a(i2));
                sb2.append(" ");
                String obj2 = sb2.toString();
                int e = e(c);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj2);
                sb3.append("[p: ");
                String obj3 = sb3.toString();
                if (this.i[e] != -1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj3);
                    sb4.append(this.b.b[this.h[this.i[e]]]);
                    str = sb4.toString();
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(obj3);
                    sb5.append("none");
                    str = sb5.toString();
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(", n: ");
                String obj4 = sb6.toString();
                if (this.d[e] != -1) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj4);
                    sb7.append(this.b.b[this.h[this.d[e]]]);
                    str2 = sb7.toString();
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj4);
                    sb8.append("none");
                    str2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append("]");
                obj = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj);
        sb10.append(" }");
        return sb10.toString();
    }
}
