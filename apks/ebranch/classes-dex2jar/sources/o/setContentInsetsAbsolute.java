package o;

import java.util.Arrays;
import java.util.HashMap;
import o.setContentInsetStartWithNavigation;
import o.setLogoDescription;
/* loaded from: classes-dex2jar.jar:o/setContentInsetsAbsolute.class */
public final class setContentInsetsAbsolute {
    public static boolean a;
    public static long b;
    public static boolean c;
    public static long d;
    public static boolean e;
    public static boolean g;
    public static setContentInsetsRelative i;
    public static boolean j;
    private static int p;
    setContentInsetStartWithNavigation[] l;
    public final setContentInsetEndWithActions n;
    private read r;
    private read w;
    public boolean f = false;
    int m = 0;
    private HashMap<String, setLogoDescription> D = null;
    private int t = 32;
    private int x = 32;
    public boolean h = false;
    public boolean q = false;
    private boolean[] s = new boolean[32];
    int k = 1;

    /* renamed from: o */
    int f209o = 0;
    private int u = 32;
    private setLogoDescription[] v = new setLogoDescription[p];
    private int y = 0;

    /* loaded from: classes-dex2jar.jar:o/setContentInsetsAbsolute$read.class */
    public interface read {
        setLogoDescription a();

        void b(setLogoDescription setlogodescription);

        setLogoDescription c(boolean[] zArr);

        boolean c();

        void e();

        void e(read read);
    }

    public setContentInsetsAbsolute() {
        this.l = null;
        this.l = new setContentInsetStartWithNavigation[32];
        g();
        setContentInsetEndWithActions setcontentinsetendwithactions = new setContentInsetEndWithActions();
        this.n = setcontentinsetendwithactions;
        this.r = new setNavigationOnClickListener(setcontentinsetendwithactions);
        if (a) {
            this.w = new setContentInsetsAbsolute$MediaBrowserCompat$CustomActionResultReceiver(this, setcontentinsetendwithactions);
        } else {
            this.w = new setContentInsetStartWithNavigation(setcontentinsetendwithactions);
        }
    }

    private void a() {
        for (int i2 = 0; i2 < this.f209o; i2++) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.l[i2];
            setcontentinsetstartwithnavigation.b.d = setcontentinsetstartwithnavigation.d;
        }
    }

    private final int b(read read2) {
        setContentInsetsRelative setcontentinsetsrelative = i;
        if (setcontentinsetsrelative != null) {
            setcontentinsetsrelative.z++;
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            this.s[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            setContentInsetsRelative setcontentinsetsrelative2 = i;
            if (setcontentinsetsrelative2 != null) {
                setcontentinsetsrelative2.n++;
            }
            int i4 = i3 + 1;
            if (i4 >= (this.k << 1)) {
                return i4;
            }
            if (read2.a() != null) {
                this.s[read2.a().c] = true;
            }
            setLogoDescription c2 = read2.c(this.s);
            if (c2 != null) {
                if (this.s[c2.c]) {
                    return i4;
                }
                this.s[c2.c] = true;
            }
            if (c2 != null) {
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f209o; i6++) {
                    setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.l[i6];
                    if (setcontentinsetstartwithnavigation.b.n == setLogoDescription.IconCompatParcelizer.UNRESTRICTED) {
                        f = f;
                        i5 = i5;
                    } else if (setcontentinsetstartwithnavigation.a) {
                        f = f;
                        i5 = i5;
                    } else {
                        f = f;
                        i5 = i5;
                        if (setcontentinsetstartwithnavigation.c.b(c2)) {
                            float c3 = setcontentinsetstartwithnavigation.c.c(c2);
                            f = f;
                            i5 = i5;
                            if (c3 < 0.0f) {
                                float f2 = (-setcontentinsetstartwithnavigation.d) / c3;
                                f = f;
                                i5 = i5;
                                if (f2 < f) {
                                    i5 = i6;
                                    f = f2;
                                }
                            }
                        }
                    }
                }
                i3 = i4;
                if (i5 >= 0) {
                    setContentInsetStartWithNavigation setcontentinsetstartwithnavigation2 = this.l[i5];
                    setcontentinsetstartwithnavigation2.b.a = -1;
                    setContentInsetsRelative setcontentinsetsrelative3 = i;
                    if (setcontentinsetsrelative3 != null) {
                        setcontentinsetsrelative3.B++;
                    }
                    setcontentinsetstartwithnavigation2.e(c2);
                    setcontentinsetstartwithnavigation2.b.a = i5;
                    setcontentinsetstartwithnavigation2.b.e(this, setcontentinsetstartwithnavigation2);
                    i3 = i4;
                }
            } else {
                z = true;
                i3 = i4;
            }
        }
        return i3;
    }

    private final void b(setContentInsetStartWithNavigation setcontentinsetstartwithnavigation) {
        int i2;
        if (!e || !setcontentinsetstartwithnavigation.a) {
            this.l[this.f209o] = setcontentinsetstartwithnavigation;
            setcontentinsetstartwithnavigation.b.a = this.f209o;
            this.f209o++;
            setcontentinsetstartwithnavigation.b.e(this, setcontentinsetstartwithnavigation);
        } else {
            setcontentinsetstartwithnavigation.b.c(this, setcontentinsetstartwithnavigation.d);
        }
        if (e && this.f) {
            int i3 = 0;
            while (i3 < this.f209o) {
                if (this.l[i3] == null) {
                    System.out.println("WTF");
                }
                setContentInsetStartWithNavigation setcontentinsetstartwithnavigation2 = this.l[i3];
                int i4 = i3;
                if (setcontentinsetstartwithnavigation2 != null) {
                    i4 = i3;
                    if (setcontentinsetstartwithnavigation2.a) {
                        setContentInsetStartWithNavigation setcontentinsetstartwithnavigation3 = this.l[i3];
                        setcontentinsetstartwithnavigation3.b.c(this, setcontentinsetstartwithnavigation3.d);
                        if (a) {
                            this.n.c.d(setcontentinsetstartwithnavigation3);
                        } else {
                            this.n.d.d(setcontentinsetstartwithnavigation3);
                        }
                        this.l[i3] = null;
                        int i5 = i3 + 1;
                        int i6 = i5;
                        while (true) {
                            i2 = this.f209o;
                            if (i5 >= i2) {
                                break;
                            }
                            setContentInsetStartWithNavigation[] setcontentinsetstartwithnavigationArr = this.l;
                            int i7 = i5 - 1;
                            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation4 = setcontentinsetstartwithnavigationArr[i5];
                            setcontentinsetstartwithnavigationArr[i7] = setcontentinsetstartwithnavigation4;
                            if (setcontentinsetstartwithnavigation4.b.a == i5) {
                                this.l[i7].b.a = i7;
                            }
                            i6 = i5;
                            i5++;
                        }
                        if (i6 < i2) {
                            this.l[i6] = null;
                        }
                        this.f209o = i2 - 1;
                        i4 = i3 - 1;
                    }
                }
                i3 = i4 + 1;
            }
            this.f = false;
        }
    }

    private void c(read read2) throws Exception {
        setContentInsetsRelative setcontentinsetsrelative = i;
        if (setcontentinsetsrelative != null) {
            setcontentinsetsrelative.u++;
            setContentInsetsRelative setcontentinsetsrelative2 = i;
            setcontentinsetsrelative2.q = Math.max(setcontentinsetsrelative2.q, (long) this.k);
            setContentInsetsRelative setcontentinsetsrelative3 = i;
            setcontentinsetsrelative3.f210o = Math.max(setcontentinsetsrelative3.f210o, (long) this.f209o);
        }
        h();
        b(read2);
        a();
    }

    private setLogoDescription d(setLogoDescription.IconCompatParcelizer iconCompatParcelizer, String str) {
        setLogoDescription setlogodescription;
        setLogoDescription b2 = this.n.a.b();
        if (b2 == null) {
            setLogoDescription setlogodescription2 = new setLogoDescription(iconCompatParcelizer);
            setlogodescription2.n = iconCompatParcelizer;
            setlogodescription = setlogodescription2;
        } else {
            b2.a();
            b2.n = iconCompatParcelizer;
            setlogodescription = b2;
        }
        int i2 = this.y;
        int i3 = p;
        if (i2 >= i3) {
            int i4 = i3 << 1;
            p = i4;
            this.v = (setLogoDescription[]) Arrays.copyOf(this.v, i4);
        }
        setLogoDescription[] setlogodescriptionArr = this.v;
        int i5 = this.y;
        this.y = i5 + 1;
        setlogodescriptionArr[i5] = setlogodescription;
        return setlogodescription;
    }

    private setLogoDescription f() {
        setContentInsetsRelative setcontentinsetsrelative = i;
        if (setcontentinsetsrelative != null) {
            setcontentinsetsrelative.e++;
        }
        if (this.k + 1 >= this.x) {
            i();
        }
        setLogoDescription d2 = d(setLogoDescription.IconCompatParcelizer.SLACK, (String) null);
        int i2 = this.m + 1;
        this.m = i2;
        this.k++;
        d2.c = i2;
        this.n.b[this.m] = d2;
        return d2;
    }

    private void g() {
        if (a) {
            for (int i2 = 0; i2 < this.f209o; i2++) {
                setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.l[i2];
                if (setcontentinsetstartwithnavigation != null) {
                    this.n.c.d(setcontentinsetstartwithnavigation);
                }
                this.l[i2] = null;
            }
            return;
        }
        for (int i3 = 0; i3 < this.f209o; i3++) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation2 = this.l[i3];
            if (setcontentinsetstartwithnavigation2 != null) {
                this.n.d.d(setcontentinsetstartwithnavigation2);
            }
            this.l[i3] = null;
        }
    }

    private int h() throws Exception {
        boolean z;
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f209o) {
                z = false;
                break;
            }
            if (this.l[i3].b.n != setLogoDescription.IconCompatParcelizer.UNRESTRICTED && this.l[i3].d < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            i2 = 0;
            while (!z2) {
                setContentInsetsRelative setcontentinsetsrelative = i;
                if (setcontentinsetsrelative != null) {
                    setcontentinsetsrelative.a++;
                }
                int i4 = i2 + 1;
                float f = Float.MAX_VALUE;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                for (int i8 = 0; i8 < this.f209o; i8++) {
                    setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.l[i8];
                    if (setcontentinsetstartwithnavigation.b.n == setLogoDescription.IconCompatParcelizer.UNRESTRICTED) {
                        f = f;
                        i5 = i5;
                        i6 = i6;
                        i7 = i7;
                    } else if (setcontentinsetstartwithnavigation.a) {
                        f = f;
                        i5 = i5;
                        i6 = i6;
                        i7 = i7;
                    } else {
                        f = f;
                        i5 = i5;
                        i6 = i6;
                        i7 = i7;
                        if (setcontentinsetstartwithnavigation.d < 0.0f) {
                            if (c) {
                                int a2 = setcontentinsetstartwithnavigation.c.a();
                                int i9 = 0;
                                while (true) {
                                    f = f;
                                    i5 = i5;
                                    i6 = i6;
                                    i7 = i7;
                                    if (i9 < a2) {
                                        setLogoDescription c2 = setcontentinsetstartwithnavigation.c.c(i9);
                                        float c3 = setcontentinsetstartwithnavigation.c.c(c2);
                                        if (c3 <= 0.0f) {
                                            f = f;
                                            i5 = i5;
                                            i6 = i6;
                                            i7 = i7;
                                        } else {
                                            int i10 = 0;
                                            int i11 = i5;
                                            while (true) {
                                                f = f;
                                                i5 = i11;
                                                i6 = i6;
                                                i7 = i7;
                                                if (i10 < 9) {
                                                    float f2 = c2.f240o[i10] / c3;
                                                    if (f2 >= f || i10 != i7) {
                                                        i7 = i7;
                                                        if (i10 <= i7) {
                                                            i10++;
                                                        }
                                                    }
                                                    i6 = c2.c;
                                                    i7 = i10;
                                                    i11 = i8;
                                                    f = f2;
                                                    i10++;
                                                }
                                            }
                                        }
                                        i9++;
                                    }
                                }
                            } else {
                                int i12 = 1;
                                while (true) {
                                    f = f;
                                    i5 = i5;
                                    i6 = i6;
                                    i7 = i7;
                                    if (i12 < this.k) {
                                        setLogoDescription setlogodescription = this.n.b[i12];
                                        float c4 = setcontentinsetstartwithnavigation.c.c(setlogodescription);
                                        if (c4 <= 0.0f) {
                                            f = f;
                                            i5 = i5;
                                            i6 = i6;
                                            i7 = i7;
                                        } else {
                                            int i13 = 0;
                                            int i14 = i5;
                                            while (true) {
                                                f = f;
                                                i5 = i14;
                                                i6 = i6;
                                                i7 = i7;
                                                if (i13 < 9) {
                                                    float f3 = setlogodescription.f240o[i13] / c4;
                                                    if (f3 >= f || i13 != i7) {
                                                        i7 = i7;
                                                        if (i13 <= i7) {
                                                            i13++;
                                                        }
                                                    }
                                                    i6 = i12;
                                                    i7 = i13;
                                                    i14 = i8;
                                                    f = f3;
                                                    i13++;
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                }
                if (i5 != -1) {
                    setContentInsetStartWithNavigation setcontentinsetstartwithnavigation2 = this.l[i5];
                    setcontentinsetstartwithnavigation2.b.a = -1;
                    setContentInsetsRelative setcontentinsetsrelative2 = i;
                    if (setcontentinsetsrelative2 != null) {
                        setcontentinsetsrelative2.B++;
                    }
                    setcontentinsetstartwithnavigation2.e(this.n.b[i6]);
                    setcontentinsetstartwithnavigation2.b.a = i5;
                    setcontentinsetstartwithnavigation2.b.e(this, setcontentinsetstartwithnavigation2);
                } else {
                    z2 = true;
                }
                i2 = i4;
                if (i4 > this.k / 2) {
                    z2 = true;
                    i2 = i4;
                }
            }
        } else {
            i2 = 0;
        }
        return i2;
    }

    private void i() {
        int i2 = this.t << 1;
        this.t = i2;
        this.l = (setContentInsetStartWithNavigation[]) Arrays.copyOf(this.l, i2);
        setContentInsetEndWithActions setcontentinsetendwithactions = this.n;
        setcontentinsetendwithactions.b = (setLogoDescription[]) Arrays.copyOf(setcontentinsetendwithactions.b, this.t);
        int i3 = this.t;
        this.s = new boolean[i3];
        this.x = i3;
        this.u = i3;
        setContentInsetsRelative setcontentinsetsrelative = i;
        if (setcontentinsetsrelative != null) {
            setcontentinsetsrelative.G++;
            setContentInsetsRelative setcontentinsetsrelative2 = i;
            setcontentinsetsrelative2.t = Math.max(setcontentinsetsrelative2.t, (long) this.t);
            setContentInsetsRelative setcontentinsetsrelative3 = i;
            setcontentinsetsrelative3.l = setcontentinsetsrelative3.t;
        }
    }

    public final void a(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, int i2, int i3) {
        setContentInsetStartWithNavigation b2 = b();
        setLogoDescription e2 = e();
        e2.l = 0;
        b2.e(setlogodescription, setlogodescription2, e2, i2);
        if (i3 != 8) {
            int i4 = (int) (-b2.c.c(e2));
            b2.c.d(b(i3, null), (float) i4);
        }
        d(b2);
    }

    public final setContentInsetStartWithNavigation b() {
        setContentInsetStartWithNavigation setcontentinsetstartwithnavigation;
        if (a) {
            setcontentinsetstartwithnavigation = this.n.c.b();
            if (setcontentinsetstartwithnavigation == null) {
                setcontentinsetstartwithnavigation = new setContentInsetsAbsolute$MediaBrowserCompat$CustomActionResultReceiver(this, this.n);
                b++;
            } else {
                setcontentinsetstartwithnavigation.b = null;
                setcontentinsetstartwithnavigation.c.d();
                setcontentinsetstartwithnavigation.d = 0.0f;
                setcontentinsetstartwithnavigation.a = false;
            }
        } else {
            setcontentinsetstartwithnavigation = this.n.d.b();
            if (setcontentinsetstartwithnavigation == null) {
                setcontentinsetstartwithnavigation = new setContentInsetStartWithNavigation(this.n);
                d++;
            } else {
                setcontentinsetstartwithnavigation.b = null;
                setcontentinsetstartwithnavigation.c.d();
                setcontentinsetstartwithnavigation.d = 0.0f;
                setcontentinsetstartwithnavigation.a = false;
            }
        }
        setLogoDescription.b++;
        return setcontentinsetstartwithnavigation;
    }

    public final setLogoDescription b(int i2, String str) {
        setContentInsetsRelative setcontentinsetsrelative = i;
        if (setcontentinsetsrelative != null) {
            setcontentinsetsrelative.d++;
        }
        if (this.k + 1 >= this.x) {
            i();
        }
        setLogoDescription d2 = d(setLogoDescription.IconCompatParcelizer.ERROR, str);
        int i3 = this.m + 1;
        this.m = i3;
        this.k++;
        d2.c = i3;
        d2.l = i2;
        this.n.b[this.m] = d2;
        this.r.b(d2);
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r5.n.b[r6.c] == null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.setLogoDescription b(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            r0 = r5
            int r0 = r0.k
            r1 = 1
            int r0 = r0 + r1
            r1 = r5
            int r1 = r1.x
            if (r0 < r1) goto L_0x0019
            r0 = r5
            r0.i()
        L_0x0019:
            r0 = r6
            boolean r0 = r0 instanceof o.setTitleMargin
            if (r0 == 0) goto L_0x00b7
            r0 = r6
            o.setTitleMargin r0 = (o.setTitleMargin) r0
            r8 = r0
            r0 = r8
            o.setLogoDescription r0 = r0.h
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L_0x0053
            r0 = r8
            o.setLogoDescription r0 = r0.h
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x004a
            r0 = r8
            o.setLogoDescription r1 = new o.setLogoDescription
            r2 = r1
            o.setLogoDescription$IconCompatParcelizer r3 = o.setLogoDescription.IconCompatParcelizer.UNRESTRICTED
            r2.<init>(r3)
            r0.h = r1
            goto L_0x004e
        L_0x004a:
            r0 = r6
            r0.a()
        L_0x004e:
            r0 = r8
            o.setLogoDescription r0 = r0.h
            r6 = r0
        L_0x0053:
            r0 = r6
            int r0 = r0.c
            r1 = -1
            if (r0 == r1) goto L_0x0077
            r0 = r6
            int r0 = r0.c
            r1 = r5
            int r1 = r1.m
            if (r0 > r1) goto L_0x0077
            r0 = r6
            r7 = r0
            r0 = r5
            o.setContentInsetEndWithActions r0 = r0.n
            o.setLogoDescription[] r0 = r0.b
            r1 = r6
            int r1 = r1.c
            r0 = r0[r1]
            if (r0 != 0) goto L_0x00b7
        L_0x0077:
            r0 = r6
            int r0 = r0.c
            r1 = -1
            if (r0 == r1) goto L_0x0083
            r0 = r6
            r0.a()
        L_0x0083:
            r0 = r5
            int r0 = r0.m
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r5
            r1 = r9
            r0.m = r1
            r0 = r5
            r1 = r5
            int r1 = r1.k
            r2 = 1
            int r1 = r1 + r2
            r0.k = r1
            r0 = r6
            r1 = r9
            r0.c = r1
            r0 = r6
            o.setLogoDescription$IconCompatParcelizer r1 = o.setLogoDescription.IconCompatParcelizer.UNRESTRICTED
            r0.n = r1
            r0 = r5
            o.setContentInsetEndWithActions r0 = r0.n
            o.setLogoDescription[] r0 = r0.b
            r1 = r5
            int r1 = r1.m
            r2 = r6
            r0[r1] = r2
            r0 = r6
            r7 = r0
        L_0x00b7:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetsAbsolute.b(java.lang.Object):o.setLogoDescription");
    }

    public final void b(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, setLogoDescription setlogodescription3, setLogoDescription setlogodescription4, float f, int i2) {
        setContentInsetStartWithNavigation b2 = b();
        b2.d(setlogodescription, setlogodescription2, setlogodescription3, setlogodescription4, f);
        d(b2);
    }

    public final void c() throws Exception {
        setContentInsetsRelative setcontentinsetsrelative = i;
        if (setcontentinsetsrelative != null) {
            setcontentinsetsrelative.w++;
        }
        if (this.r.c()) {
            a();
        } else if (this.h || this.q) {
            setContentInsetsRelative setcontentinsetsrelative2 = i;
            if (setcontentinsetsrelative2 != null) {
                setcontentinsetsrelative2.f++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f209o) {
                    z = true;
                    break;
                } else if (!this.l[i2].a) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                c(this.r);
                return;
            }
            setContentInsetsRelative setcontentinsetsrelative3 = i;
            if (setcontentinsetsrelative3 != null) {
                setcontentinsetsrelative3.j++;
            }
            a();
        } else {
            c(this.r);
        }
    }

    public final void d() {
        for (int i2 = 0; i2 < this.n.b.length; i2++) {
            setLogoDescription setlogodescription = this.n.b[i2];
            if (setlogodescription != null) {
                setlogodescription.a();
            }
        }
        this.n.a.a(this.v, this.y);
        this.y = 0;
        Arrays.fill(this.n.b, (Object) null);
        HashMap<String, setLogoDescription> hashMap = this.D;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.m = 0;
        this.r.e();
        this.k = 1;
        for (int i3 = 0; i3 < this.f209o; i3++) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.l[i3];
            if (setcontentinsetstartwithnavigation != null) {
                setcontentinsetstartwithnavigation.e = false;
            }
        }
        g();
        this.f209o = 0;
        if (a) {
            this.w = new setContentInsetsAbsolute$MediaBrowserCompat$CustomActionResultReceiver(this, this.n);
        } else {
            this.w = new setContentInsetStartWithNavigation(this.n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0146 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(o.setContentInsetStartWithNavigation r7) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetsAbsolute.d(o.setContentInsetStartWithNavigation):void");
    }

    public final void d(setLogoDescription setlogodescription, int i2) {
        if (!g || setlogodescription.a != -1) {
            int i3 = setlogodescription.a;
            if (setlogodescription.a != -1) {
                setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.l[i3];
                if (setcontentinsetstartwithnavigation.a) {
                    setcontentinsetstartwithnavigation.d = (float) i2;
                } else if (setcontentinsetstartwithnavigation.c.a() == 0) {
                    setcontentinsetstartwithnavigation.a = true;
                    setcontentinsetstartwithnavigation.d = (float) i2;
                } else {
                    setContentInsetStartWithNavigation b2 = b();
                    if (i2 < 0) {
                        b2.d = (float) (-i2);
                        b2.c.d(setlogodescription, 1.0f);
                    } else {
                        b2.d = (float) i2;
                        b2.c.d(setlogodescription, -1.0f);
                    }
                    d(b2);
                }
            } else {
                setContentInsetStartWithNavigation b3 = b();
                b3.b = setlogodescription;
                float f = (float) i2;
                setlogodescription.d = f;
                b3.d = f;
                b3.a = true;
                d(b3);
            }
        } else {
            float f2 = (float) i2;
            setlogodescription.c(this, f2);
            for (int i4 = 0; i4 < this.m + 1; i4++) {
                setLogoDescription setlogodescription2 = this.n.b[i4];
                if (setlogodescription2 != null && setlogodescription2.h && setlogodescription2.m == setlogodescription.c) {
                    setlogodescription2.c(this, setlogodescription2.t + f2);
                }
            }
        }
    }

    public final void d(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, int i2, float f, setLogoDescription setlogodescription3, setLogoDescription setlogodescription4, int i3, int i4) {
        setContentInsetStartWithNavigation b2 = b();
        if (setlogodescription2 == setlogodescription3) {
            b2.c.d(setlogodescription, 1.0f);
            b2.c.d(setlogodescription4, 1.0f);
            b2.c.d(setlogodescription2, -2.0f);
        } else if (f == 0.5f) {
            b2.c.d(setlogodescription, 1.0f);
            b2.c.d(setlogodescription2, -1.0f);
            b2.c.d(setlogodescription3, -1.0f);
            b2.c.d(setlogodescription4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                b2.d = (float) ((-i2) + i3);
            }
        } else if (f <= 0.0f) {
            b2.c.d(setlogodescription, -1.0f);
            b2.c.d(setlogodescription2, 1.0f);
            b2.d = (float) i2;
        } else if (f >= 1.0f) {
            b2.c.d(setlogodescription4, -1.0f);
            b2.c.d(setlogodescription3, 1.0f);
            b2.d = (float) (-i3);
        } else {
            setContentInsetStartWithNavigation.IconCompatParcelizer iconCompatParcelizer = b2.c;
            float f2 = 1.0f - f;
            iconCompatParcelizer.d(setlogodescription, f2);
            b2.c.d(setlogodescription2, -f2);
            b2.c.d(setlogodescription3, -1.0f * f);
            b2.c.d(setlogodescription4, 1.0f * f);
            if (i2 > 0 || i3 > 0) {
                b2.d = (((float) (-i2)) * f2) + (((float) i3) * f);
            }
        }
        if (i4 != 8) {
            b2.e(this, i4);
        }
        d(b2);
    }

    public final void d(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, int i2, int i3) {
        setContentInsetStartWithNavigation b2 = b();
        setLogoDescription e2 = e();
        e2.l = 0;
        b2.b(setlogodescription, setlogodescription2, e2, i2);
        if (i3 != 8) {
            int i4 = (int) (-b2.c.c(e2));
            b2.c.d(b(i3, null), (float) i4);
        }
        d(b2);
    }

    public final setContentInsetStartWithNavigation e(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, int i2, int i3) {
        if (!g || i3 != 8 || !setlogodescription2.f || setlogodescription.a != -1) {
            setContentInsetStartWithNavigation b2 = b();
            boolean z = false;
            z = false;
            if (i2 != 0) {
                int i4 = i2;
                if (i2 < 0) {
                    i4 = -i2;
                    z = true;
                }
                b2.d = (float) i4;
            }
            if (!z) {
                b2.c.d(setlogodescription, -1.0f);
                b2.c.d(setlogodescription2, 1.0f);
            } else {
                b2.c.d(setlogodescription, 1.0f);
                b2.c.d(setlogodescription2, -1.0f);
            }
            if (i3 != 8) {
                b2.e(this, i3);
            }
            d(b2);
            return b2;
        }
        setlogodescription.c(this, setlogodescription2.d + ((float) i2));
        return null;
    }

    public final setLogoDescription e() {
        setContentInsetsRelative setcontentinsetsrelative = i;
        if (setcontentinsetsrelative != null) {
            setcontentinsetsrelative.D++;
        }
        if (this.k + 1 >= this.x) {
            i();
        }
        setLogoDescription d2 = d(setLogoDescription.IconCompatParcelizer.SLACK, (String) null);
        int i2 = this.m + 1;
        this.m = i2;
        this.k++;
        d2.c = i2;
        this.n.b[this.m] = d2;
        return d2;
    }
}
