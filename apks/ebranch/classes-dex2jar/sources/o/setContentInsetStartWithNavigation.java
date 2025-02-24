package o;

import java.util.ArrayList;
import o.setContentInsetsAbsolute;
import o.setLogoDescription;
/* loaded from: classes-dex2jar.jar:o/setContentInsetStartWithNavigation.class */
public class setContentInsetStartWithNavigation implements setContentInsetsAbsolute.read {
    public IconCompatParcelizer c;
    setLogoDescription b = null;
    public float d = 0.0f;
    boolean e = false;
    ArrayList<setLogoDescription> f = new ArrayList<>();
    boolean a = false;

    /* loaded from: classes-dex2jar.jar:o/setContentInsetStartWithNavigation$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        float a(int i);

        int a();

        void a(float f);

        boolean b(setLogoDescription setlogodescription);

        float c(setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, boolean z);

        float c(setLogoDescription setlogodescription);

        setLogoDescription c(int i);

        void c();

        float d(setLogoDescription setlogodescription, boolean z);

        void d();

        void d(setLogoDescription setlogodescription, float f);

        void e(setLogoDescription setlogodescription, float f, boolean z);
    }

    public setContentInsetStartWithNavigation() {
    }

    public setContentInsetStartWithNavigation(setContentInsetEndWithActions setcontentinsetendwithactions) {
        this.c = new setCollapsible(this, setcontentinsetendwithactions);
    }

    @Override // o.setContentInsetsAbsolute.read
    public final setLogoDescription a() {
        return this.b;
    }

    public setLogoDescription a(boolean[] zArr, setLogoDescription setlogodescription) {
        int a = this.c.a();
        setLogoDescription setlogodescription2 = null;
        float f = 0.0f;
        for (int i = 0; i < a; i++) {
            float a2 = this.c.a(i);
            setlogodescription2 = setlogodescription2;
            f = f;
            if (a2 < 0.0f) {
                setLogoDescription c = this.c.c(i);
                if (zArr != null) {
                    setlogodescription2 = setlogodescription2;
                    f = f;
                    if (zArr[c.c]) {
                    }
                }
                setlogodescription2 = setlogodescription2;
                f = f;
                if (c != setlogodescription) {
                    if (c.n != setLogoDescription.IconCompatParcelizer.SLACK) {
                        setlogodescription2 = setlogodescription2;
                        f = f;
                        if (c.n != setLogoDescription.IconCompatParcelizer.ERROR) {
                        }
                    }
                    setlogodescription2 = setlogodescription2;
                    f = f;
                    if (a2 < f) {
                        f = a2;
                        setlogodescription2 = c;
                    }
                }
            }
        }
        return setlogodescription2;
    }

    public final setContentInsetStartWithNavigation b(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, setLogoDescription setlogodescription3, int i) {
        boolean z = false;
        z = false;
        if (i != 0) {
            int i2 = i;
            if (i < 0) {
                i2 = -i;
                z = true;
            }
            this.d = (float) i2;
        }
        if (!z) {
            this.c.d(setlogodescription, -1.0f);
            this.c.d(setlogodescription2, 1.0f);
            this.c.d(setlogodescription3, 1.0f);
        } else {
            this.c.d(setlogodescription, 1.0f);
            this.c.d(setlogodescription2, -1.0f);
            this.c.d(setlogodescription3, -1.0f);
        }
        return this;
    }

    public final void b(setContentInsetsAbsolute setcontentinsetsabsolute, setLogoDescription setlogodescription, boolean z) {
        if (setlogodescription.f) {
            this.d += setlogodescription.d * this.c.c(setlogodescription);
            this.c.d(setlogodescription, z);
            if (z) {
                setlogodescription.a(this);
            }
            if (setContentInsetsAbsolute.e && setlogodescription != null && this.c.a() == 0) {
                this.a = true;
                setcontentinsetsabsolute.f = true;
            }
        }
    }

    @Override // o.setContentInsetsAbsolute.read
    public void b(setLogoDescription setlogodescription) {
        float f;
        if (setlogodescription.l != 1) {
            if (setlogodescription.l == 2) {
                f = 1000.0f;
            } else if (setlogodescription.l == 3) {
                f = 1000000.0f;
            } else if (setlogodescription.l == 4) {
                f = 1.0E9f;
            } else if (setlogodescription.l == 5) {
                f = 1.0E12f;
            }
            this.c.d(setlogodescription, f);
        }
        f = 1.0f;
        this.c.d(setlogodescription, f);
    }

    public final boolean b() {
        setLogoDescription setlogodescription = this.b;
        return setlogodescription != null && (setlogodescription.n == setLogoDescription.IconCompatParcelizer.UNRESTRICTED || this.d >= 0.0f);
    }

    @Override // o.setContentInsetsAbsolute.read
    public setLogoDescription c(boolean[] zArr) {
        return a(zArr, null);
    }

    @Override // o.setContentInsetsAbsolute.read
    public boolean c() {
        return this.b == null && this.d == 0.0f && this.c.a() == 0;
    }

    public final setContentInsetStartWithNavigation d(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, setLogoDescription setlogodescription3, setLogoDescription setlogodescription4, float f) {
        this.c.d(setlogodescription, -1.0f);
        this.c.d(setlogodescription2, 1.0f);
        this.c.d(setlogodescription3, f);
        this.c.d(setlogodescription4, -f);
        return this;
    }

    public final void d(setContentInsetsAbsolute setcontentinsetsabsolute) {
        if (setcontentinsetsabsolute.l.length != 0) {
            boolean z = false;
            while (!z) {
                int a = this.c.a();
                for (int i = 0; i < a; i++) {
                    setLogoDescription c = this.c.c(i);
                    if (c.a != -1 || c.f || c.h) {
                        this.f.add(c);
                    }
                }
                int size = this.f.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        setLogoDescription setlogodescription = this.f.get(i2);
                        if (setlogodescription.f) {
                            b(setcontentinsetsabsolute, setlogodescription, true);
                        } else if (!setlogodescription.h) {
                            e(setcontentinsetsabsolute, setcontentinsetsabsolute.l[setlogodescription.a], true);
                        } else if (setlogodescription.h) {
                            float c2 = this.c.c(setlogodescription);
                            this.d += setlogodescription.t * c2;
                            this.c.d(setlogodescription, true);
                            setlogodescription.a(this);
                            this.c.e(setcontentinsetsabsolute.n.b[setlogodescription.m], c2, true);
                            if (setContentInsetsAbsolute.e && setlogodescription != null && this.c.a() == 0) {
                                this.a = true;
                                setcontentinsetsabsolute.f = true;
                            }
                        }
                    }
                    this.f.clear();
                } else {
                    z = true;
                }
            }
            if (setContentInsetsAbsolute.e && this.b != null && this.c.a() == 0) {
                this.a = true;
                setcontentinsetsabsolute.f = true;
            }
        }
    }

    public final setContentInsetStartWithNavigation e(setContentInsetsAbsolute setcontentinsetsabsolute, int i) {
        this.c.d(setcontentinsetsabsolute.b(i, "ep"), 1.0f);
        this.c.d(setcontentinsetsabsolute.b(i, "em"), -1.0f);
        return this;
    }

    public final setContentInsetStartWithNavigation e(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, setLogoDescription setlogodescription3, int i) {
        boolean z = false;
        z = false;
        if (i != 0) {
            int i2 = i;
            if (i < 0) {
                i2 = -i;
                z = true;
            }
            this.d = (float) i2;
        }
        if (!z) {
            this.c.d(setlogodescription, -1.0f);
            this.c.d(setlogodescription2, 1.0f);
            this.c.d(setlogodescription3, -1.0f);
        } else {
            this.c.d(setlogodescription, 1.0f);
            this.c.d(setlogodescription2, -1.0f);
            this.c.d(setlogodescription3, 1.0f);
        }
        return this;
    }

    public final setContentInsetStartWithNavigation e(setLogoDescription setlogodescription, setLogoDescription setlogodescription2, setLogoDescription setlogodescription3, setLogoDescription setlogodescription4, float f) {
        this.c.d(setlogodescription3, 0.5f);
        this.c.d(setlogodescription4, 0.5f);
        this.c.d(setlogodescription, -0.5f);
        this.c.d(setlogodescription2, -0.5f);
        this.d = -f;
        return this;
    }

    @Override // o.setContentInsetsAbsolute.read
    public void e() {
        this.c.d();
        this.b = null;
        this.d = 0.0f;
    }

    @Override // o.setContentInsetsAbsolute.read
    public final void e(setContentInsetsAbsolute.read read) {
        if (read instanceof setContentInsetStartWithNavigation) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = (setContentInsetStartWithNavigation) read;
            this.b = null;
            this.c.d();
            for (int i = 0; i < setcontentinsetstartwithnavigation.c.a(); i++) {
                this.c.e(setcontentinsetstartwithnavigation.c.c(i), setcontentinsetstartwithnavigation.c.a(i), true);
            }
        }
    }

    public void e(setContentInsetsAbsolute setcontentinsetsabsolute, setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, boolean z) {
        this.d += setcontentinsetstartwithnavigation.d * this.c.c(setcontentinsetstartwithnavigation, z);
        if (z) {
            setcontentinsetstartwithnavigation.b.a(this);
        }
        if (setContentInsetsAbsolute.e && this.b != null && this.c.a() == 0) {
            this.a = true;
            setcontentinsetsabsolute.f = true;
        }
    }

    public final void e(setLogoDescription setlogodescription) {
        setLogoDescription setlogodescription2 = this.b;
        if (setlogodescription2 != null) {
            this.c.d(setlogodescription2, -1.0f);
            this.b.a = -1;
            this.b = null;
        }
        float f = -this.c.d(setlogodescription, true);
        this.b = setlogodescription;
        if (f != 1.0f) {
            this.d /= f;
            this.c.a(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (r0.s > 1) goto L_0x005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r0.s > 1) goto L_0x005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        r17 = r0;
        r18 = r8;
        r19 = r11;
        r20 = r0;
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0134, code lost:
        if (r0.s > 1) goto L_0x0137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0152, code lost:
        if (r0.s > 1) goto L_0x0137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
        r17 = r6;
        r18 = r0;
        r15 = r10;
        r20 = r12;
        r21 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e(o.setContentInsetsAbsolute r4) {
        /*
        // Method dump skipped, instructions count: 535
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetStartWithNavigation.e(o.setContentInsetsAbsolute):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetStartWithNavigation.toString():java.lang.String");
    }
}
