package o;

import o.setTitleMargin;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setInflatedId.class */
public final class setInflatedId extends setTitleMarginEnd {
    public boolean aA;
    protected float az = -1.0f;
    protected int a = -1;
    protected int d = -1;
    public setTitleMargin e = this.al;
    public int c = 0;
    private int aC = 0;

    /* renamed from: o.setInflatedId$4 */
    /* loaded from: classes-dex2jar.jar:o/setInflatedId$4.class */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[setTitleMargin.write.values().length];
            b = iArr;
            try {
                iArr[setTitleMargin.write.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[setTitleMargin.write.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[setTitleMargin.write.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[setTitleMargin.write.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[setTitleMargin.write.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                b[setTitleMargin.write.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                b[setTitleMargin.write.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                b[setTitleMargin.write.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                b[setTitleMargin.write.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    public setInflatedId() {
        this.k.clear();
        this.k.add(this.e);
        int length = this.J.length;
        for (int i = 0; i < length; i++) {
            this.J[i] = this.e;
        }
    }

    public final float B() {
        return this.az;
    }

    @Override // o.setTitleMarginEnd
    public final boolean a() {
        return true;
    }

    @Override // o.setTitleMarginEnd
    public final setTitleMargin b(setTitleMargin.write write) {
        switch (AnonymousClass4.b[write.ordinal()]) {
            case 1:
            case 2:
                if (this.c == 1) {
                    return this.e;
                }
                break;
            case 3:
            case 4:
                if (this.c == 0) {
                    return this.e;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(write.name());
    }

    @Override // o.setTitleMarginEnd
    public final void b(setContentInsetsAbsolute setcontentinsetsabsolute, boolean z) {
        setTitleMarginBottom settitlemarginbottom = (setTitleMarginBottom) this.ac;
        if (settitlemarginbottom != null) {
            setTitleMargin b = settitlemarginbottom.b(setTitleMargin.write.LEFT);
            setTitleMargin b2 = settitlemarginbottom.b(setTitleMargin.write.RIGHT);
            boolean z2 = true;
            z2 = this.ac != null && this.ac.M[0] == setTitleMarginEnd.write.WRAP_CONTENT;
            if (this.c == 0) {
                b = settitlemarginbottom.b(setTitleMargin.write.TOP);
                b2 = settitlemarginbottom.b(setTitleMargin.write.BOTTOM);
                if (this.ac == null || this.ac.M[1] != setTitleMarginEnd.write.WRAP_CONTENT) {
                    z2 = false;
                }
            }
            if (this.aA && this.e.a) {
                setLogoDescription b3 = setcontentinsetsabsolute.b(this.e);
                setTitleMargin settitlemargin = this.e;
                setcontentinsetsabsolute.d(b3, !settitlemargin.a ? 0 : settitlemargin.d);
                if (this.a != -1) {
                    if (z2) {
                        setcontentinsetsabsolute.d(setcontentinsetsabsolute.b(b2), b3, 0, 5);
                    }
                } else if (this.d != -1 && z2) {
                    setLogoDescription b4 = setcontentinsetsabsolute.b(b2);
                    setcontentinsetsabsolute.d(b3, setcontentinsetsabsolute.b(b), 0, 5);
                    setcontentinsetsabsolute.d(b4, b3, 0, 5);
                }
                this.aA = false;
            } else if (this.a != -1) {
                setLogoDescription b5 = setcontentinsetsabsolute.b(this.e);
                setcontentinsetsabsolute.e(b5, setcontentinsetsabsolute.b(b), this.a, 8);
                if (z2) {
                    setcontentinsetsabsolute.d(setcontentinsetsabsolute.b(b2), b5, 0, 5);
                }
            } else if (this.d != -1) {
                setLogoDescription b6 = setcontentinsetsabsolute.b(this.e);
                setLogoDescription b7 = setcontentinsetsabsolute.b(b2);
                setcontentinsetsabsolute.e(b6, b7, -this.d, 8);
                if (z2) {
                    setcontentinsetsabsolute.d(b6, setcontentinsetsabsolute.b(b), 0, 5);
                    setcontentinsetsabsolute.d(b7, b6, 0, 5);
                }
            } else if (this.az != -1.0f) {
                setLogoDescription b8 = setcontentinsetsabsolute.b(this.e);
                setLogoDescription b9 = setcontentinsetsabsolute.b(b2);
                float f = this.az;
                setContentInsetStartWithNavigation b10 = setcontentinsetsabsolute.b();
                b10.c.d(b8, -1.0f);
                b10.c.d(b9, f);
                setcontentinsetsabsolute.d(b10);
            }
        }
    }

    @Override // o.setTitleMarginEnd
    public final boolean b() {
        return this.aA;
    }

    @Override // o.setTitleMarginEnd
    public final boolean c() {
        return this.aA;
    }

    public final int d() {
        return this.a;
    }

    @Override // o.setTitleMarginEnd
    public final void d(setContentInsetsAbsolute setcontentinsetsabsolute, boolean z) {
        if (this.ac != null) {
            setLogoDescription setlogodescription = this.e.h;
            int i = setlogodescription != null ? (int) (setlogodescription.d + 0.5f) : 0;
            if (this.c == 1) {
                o(i);
                m(0);
                i(this.ac.e_());
                n(0);
                return;
            }
            o(0);
            m(i);
            n(this.ac.q());
            i(0);
        }
    }

    public final int e() {
        return this.d;
    }

    public final void e(float f) {
        if (f > -1.0f) {
            this.az = f;
            this.a = -1;
            this.d = -1;
        }
    }

    public final void k(int i) {
        if (i >= 0) {
            this.az = -1.0f;
            this.a = i;
            this.d = -1;
        }
    }

    public final void l(int i) {
        if (i >= 0) {
            this.az = -1.0f;
            this.a = -1;
            this.d = i;
        }
    }

    public final void s(int i) {
        if (this.c != i) {
            this.c = i;
            this.k.clear();
            if (this.c == 1) {
                this.e = this.F;
            } else {
                this.e = this.al;
            }
            this.k.add(this.e);
            int length = this.J.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.J[i2] = this.e;
            }
        }
    }
}
