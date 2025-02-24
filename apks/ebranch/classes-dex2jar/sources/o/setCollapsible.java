package o;

import java.util.Arrays;
import o.setContentInsetStartWithNavigation;
/* loaded from: classes-dex2jar.jar:o/setCollapsible.class */
public final class setCollapsible implements setContentInsetStartWithNavigation.IconCompatParcelizer {
    private static float b = 0.001f;
    protected final setContentInsetEndWithActions c;
    private final setContentInsetStartWithNavigation k;
    int d = 0;
    private int a = 8;
    private setLogoDescription e = null;
    private int[] g = new int[8];
    private int[] h = new int[8];
    private float[] f = new float[8];
    private int i = -1;
    private int n = -1;
    private boolean j = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCollapsible(setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, setContentInsetEndWithActions setcontentinsetendwithactions) {
        this.k = setcontentinsetstartwithnavigation;
        this.c = setcontentinsetendwithactions;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float a(int i) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.d) {
            if (i3 == i) {
                return this.f[i2];
            }
            i2 = this.h[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final int a() {
        return this.d;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void a(float f) {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.d) {
            float[] fArr = this.f;
            fArr[i] = fArr[i] / f;
            i = this.h[i];
            i2++;
        }
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final boolean b(setLogoDescription setlogodescription) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.d) {
            if (this.g[i] == setlogodescription.c) {
                return true;
            }
            i = this.h[i];
            i2++;
        }
        return false;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float c(setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, boolean z) {
        float c = c(setcontentinsetstartwithnavigation.b);
        d(setcontentinsetstartwithnavigation.b, z);
        setContentInsetStartWithNavigation.IconCompatParcelizer iconCompatParcelizer = setcontentinsetstartwithnavigation.c;
        int a = iconCompatParcelizer.a();
        for (int i = 0; i < a; i++) {
            setLogoDescription c2 = iconCompatParcelizer.c(i);
            e(c2, iconCompatParcelizer.c(c2) * c, z);
        }
        return c;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float c(setLogoDescription setlogodescription) {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.d) {
            if (this.g[i] == setlogodescription.c) {
                return this.f[i];
            }
            i = this.h[i];
            i2++;
        }
        return 0.0f;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final setLogoDescription c(int i) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.d) {
            if (i3 == i) {
                return this.c.b[this.g[i2]];
            }
            i2 = this.h[i2];
            i3++;
        }
        return null;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void c() {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.d) {
            float[] fArr = this.f;
            fArr[i] = -fArr[i];
            i = this.h[i];
            i2++;
        }
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final float d(setLogoDescription setlogodescription, boolean z) {
        if (this.e == setlogodescription) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.d) {
            if (this.g[i] == setlogodescription.c) {
                if (i == this.i) {
                    this.i = this.h[i];
                } else {
                    int[] iArr = this.h;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    setlogodescription.a(this.k);
                }
                setlogodescription.s--;
                this.d--;
                this.g[i] = -1;
                if (this.j) {
                    this.n = i;
                }
                return this.f[i];
            }
            i = this.h[i];
            i2++;
            i3 = i;
        }
        return 0.0f;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void d() {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.d) {
            setLogoDescription setlogodescription = this.c.b[this.g[i]];
            if (setlogodescription != null) {
                setlogodescription.a(this.k);
            }
            i = this.h[i];
            i2++;
        }
        this.i = -1;
        this.n = -1;
        this.j = false;
        this.d = 0;
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void d(setLogoDescription setlogodescription, float f) {
        int i;
        if (f == 0.0f) {
            d(setlogodescription, true);
            return;
        }
        int i2 = this.i;
        if (i2 == -1) {
            this.i = 0;
            this.f[0] = f;
            this.g[0] = setlogodescription.c;
            this.h[this.i] = -1;
            setlogodescription.s++;
            setlogodescription.d(this.k);
            this.d++;
            if (!this.j) {
                int i3 = this.n + 1;
                this.n = i3;
                int[] iArr = this.g;
                if (i3 >= iArr.length) {
                    this.j = true;
                    this.n = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.d) {
            if (this.g[i2] == setlogodescription.c) {
                this.f[i2] = f;
                return;
            }
            if (this.g[i2] < setlogodescription.c) {
                i5 = i2;
            }
            i2 = this.h[i2];
            i4++;
        }
        int i6 = this.n;
        if (this.j) {
            int[] iArr2 = this.g;
            i = i6;
            if (iArr2[i6] != -1) {
                i = iArr2.length;
            }
        } else {
            i = i6 + 1;
        }
        int[] iArr3 = this.g;
        int i7 = i;
        if (i >= iArr3.length) {
            i7 = i;
            if (this.d < iArr3.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr4 = this.g;
                    i7 = i;
                    if (i8 >= iArr4.length) {
                        break;
                    } else if (iArr4[i8] == -1) {
                        i7 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        int[] iArr5 = this.g;
        int i9 = i7;
        if (i7 >= iArr5.length) {
            i9 = iArr5.length;
            int i10 = this.a << 1;
            this.a = i10;
            this.j = false;
            this.n = i9 - 1;
            this.f = Arrays.copyOf(this.f, i10);
            this.g = Arrays.copyOf(this.g, this.a);
            this.h = Arrays.copyOf(this.h, this.a);
        }
        this.g[i9] = setlogodescription.c;
        this.f[i9] = f;
        if (i5 != -1) {
            int[] iArr6 = this.h;
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            this.h[i9] = this.i;
            this.i = i9;
        }
        setlogodescription.s++;
        setlogodescription.d(this.k);
        int i11 = this.d + 1;
        this.d = i11;
        if (!this.j) {
            this.n++;
        }
        int[] iArr7 = this.g;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.n >= iArr7.length) {
            this.j = true;
            this.n = iArr7.length - 1;
        }
    }

    @Override // o.setContentInsetStartWithNavigation.IconCompatParcelizer
    public final void e(setLogoDescription setlogodescription, float f, boolean z) {
        int i;
        float f2 = b;
        if (f <= (-f2) || f >= f2) {
            int i2 = this.i;
            if (i2 == -1) {
                this.i = 0;
                this.f[0] = f;
                this.g[0] = setlogodescription.c;
                this.h[this.i] = -1;
                setlogodescription.s++;
                setlogodescription.d(this.k);
                this.d++;
                if (!this.j) {
                    int i3 = this.n + 1;
                    this.n = i3;
                    int[] iArr = this.g;
                    if (i3 >= iArr.length) {
                        this.j = true;
                        this.n = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.d) {
                if (this.g[i2] == setlogodescription.c) {
                    float[] fArr = this.f;
                    float f3 = fArr[i2] + f;
                    float f4 = b;
                    float f5 = f3;
                    if (f3 > (-f4)) {
                        f5 = f3;
                        if (f3 < f4) {
                            f5 = 0.0f;
                        }
                    }
                    fArr[i2] = f5;
                    if (f5 == 0.0f) {
                        if (i2 == this.i) {
                            this.i = this.h[i2];
                        } else {
                            int[] iArr2 = this.h;
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z) {
                            setlogodescription.a(this.k);
                        }
                        if (this.j) {
                            this.n = i2;
                        }
                        setlogodescription.s--;
                        this.d--;
                        return;
                    }
                    return;
                }
                if (this.g[i2] < setlogodescription.c) {
                    i5 = i2;
                }
                i2 = this.h[i2];
                i4++;
            }
            int i6 = this.n;
            if (this.j) {
                int[] iArr3 = this.g;
                i = i6;
                if (iArr3[i6] != -1) {
                    i = iArr3.length;
                }
            } else {
                i = i6 + 1;
            }
            int[] iArr4 = this.g;
            int i7 = i;
            if (i >= iArr4.length) {
                i7 = i;
                if (this.d < iArr4.length) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr5 = this.g;
                        i7 = i;
                        if (i8 >= iArr5.length) {
                            break;
                        } else if (iArr5[i8] == -1) {
                            i7 = i8;
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
            int[] iArr6 = this.g;
            int i9 = i7;
            if (i7 >= iArr6.length) {
                i9 = iArr6.length;
                int i10 = this.a << 1;
                this.a = i10;
                this.j = false;
                this.n = i9 - 1;
                this.f = Arrays.copyOf(this.f, i10);
                this.g = Arrays.copyOf(this.g, this.a);
                this.h = Arrays.copyOf(this.h, this.a);
            }
            this.g[i9] = setlogodescription.c;
            this.f[i9] = f;
            if (i5 != -1) {
                int[] iArr7 = this.h;
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                this.h[i9] = this.i;
                this.i = i9;
            }
            setlogodescription.s++;
            setlogodescription.d(this.k);
            this.d++;
            if (!this.j) {
                this.n++;
            }
            int i11 = this.n;
            int[] iArr8 = this.g;
            if (i11 >= iArr8.length) {
                this.j = true;
                this.n = iArr8.length - 1;
            }
        }
    }

    public final String toString() {
        int i = this.i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.d) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.f[i]);
            sb2.append(" : ");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(this.c.b[this.g[i]]);
            str = sb3.toString();
            i = this.h[i];
            i2++;
        }
        return str;
    }
}
