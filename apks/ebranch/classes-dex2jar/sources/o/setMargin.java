package o;

import o.setTitleMargin;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setMargin.class */
public abstract class setMargin implements setPreventCornerOverlap {
    protected setTitleMarginEnd.write e;
    public int i;
    public setTitleMarginEnd l;

    /* renamed from: o */
    values f241o;
    public setPaddingRelative b = new setPaddingRelative(this);
    public int g = 0;
    public boolean j = false;
    public setMaxCardElevation n = new setMaxCardElevation(this);
    public setMaxCardElevation f = new setMaxCardElevation(this);
    protected RemoteActionCompatParcelizer h = RemoteActionCompatParcelizer.NONE;

    /* renamed from: o.setMargin$1 */
    /* loaded from: classes-dex2jar.jar:o/setMargin$1.class */
    public static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[setTitleMargin.write.values().length];
            c = iArr;
            try {
                iArr[setTitleMargin.write.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                c[setTitleMargin.write.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                c[setTitleMargin.write.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                c[setTitleMargin.write.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                c[setTitleMargin.write.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setMargin$RemoteActionCompatParcelizer.class */
    public enum RemoteActionCompatParcelizer {
        NONE,
        START,
        END,
        CENTER
    }

    public setMargin(setTitleMarginEnd settitlemarginend) {
        this.l = settitlemarginend;
    }

    protected static setMaxCardElevation b(setTitleMargin settitlemargin) {
        setTitleMargin settitlemargin2 = settitlemargin.f;
        setMaxCardElevation setmaxcardelevation = null;
        if (settitlemargin2 == null) {
            return null;
        }
        setTitleMarginEnd settitlemarginend = settitlemargin.f.i;
        int i = AnonymousClass1.c[settitlemargin.f.j.ordinal()];
        if (i == 1) {
            setmaxcardelevation = settitlemarginend.g.n;
        } else if (i == 2) {
            setmaxcardelevation = settitlemarginend.g.f;
        } else if (i == 3) {
            setmaxcardelevation = settitlemarginend.ay.n;
        } else if (i == 4) {
            setmaxcardelevation = settitlemarginend.ay.d;
        } else if (i == 5) {
            setmaxcardelevation = settitlemarginend.ay.f;
        }
        return setmaxcardelevation;
    }

    protected static setMaxCardElevation e(setTitleMargin settitlemargin, int i) {
        setTitleMargin settitlemargin2 = settitlemargin.f;
        setMaxCardElevation setmaxcardelevation = null;
        if (settitlemargin2 == null) {
            return null;
        }
        setTitleMarginEnd settitlemarginend = settitlemargin.f.i;
        setMargin setmargin = i == 0 ? settitlemarginend.g : settitlemarginend.ay;
        int i2 = AnonymousClass1.c[settitlemargin.f.j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return setmaxcardelevation;
                    }
                }
            }
            setmaxcardelevation = setmargin.f;
            return setmaxcardelevation;
        }
        setmaxcardelevation = setmargin.n;
        return setmaxcardelevation;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b();

    @Override // o.setPreventCornerOverlap
    public void b(setPreventCornerOverlap setpreventcorneroverlap) {
    }

    public abstract boolean c();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r5 != r4) goto L_0x0051;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5 != r4) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected final int d(int r4, int r5) {
        /*
            r3 = this;
            r0 = r5
            if (r0 != 0) goto L_0x002c
            r0 = r3
            o.setTitleMarginEnd r0 = r0.l
            int r0 = r0.Q
            r6 = r0
            r0 = r3
            o.setTitleMarginEnd r0 = r0.l
            int r0 = r0.S
            r1 = r4
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
            r0 = r6
            if (r0 <= 0) goto L_0x0022
            r0 = r6
            r1 = r4
            int r0 = java.lang.Math.min(r0, r1)
            r5 = r0
        L_0x0022:
            r0 = r4
            r6 = r0
            r0 = r5
            r1 = r4
            if (r0 == r1) goto L_0x0053
            goto L_0x0051
        L_0x002c:
            r0 = r3
            o.setTitleMarginEnd r0 = r0.l
            int r0 = r0.R
            r6 = r0
            r0 = r3
            o.setTitleMarginEnd r0 = r0.l
            int r0 = r0.O
            r1 = r4
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
            r0 = r6
            if (r0 <= 0) goto L_0x004a
            r0 = r6
            r1 = r4
            int r0 = java.lang.Math.min(r0, r1)
            r5 = r0
        L_0x004a:
            r0 = r4
            r6 = r0
            r0 = r5
            r1 = r4
            if (r0 == r1) goto L_0x0053
        L_0x0051:
            r0 = r5
            r6 = r0
        L_0x0053:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMargin.d(int, int):int");
    }

    public abstract void d();

    protected final void d(setTitleMargin settitlemargin, setTitleMargin settitlemargin2, int i) {
        int i2;
        setMaxCardElevation b = b(settitlemargin);
        setMaxCardElevation b2 = b(settitlemargin2);
        if (b.j && b2.j) {
            int d = b.l + settitlemargin.d();
            int d2 = b2.l - settitlemargin2.d();
            int i3 = d2 - d;
            if (!this.b.j && this.e == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                int i4 = this.i;
                if (i4 == 0) {
                    i2 = i3;
                } else if (i4 == 1) {
                    this.b.e(Math.min(d(this.b.n, i), i3));
                } else if (i4 == 2) {
                    setTitleMarginEnd settitlemarginend = this.l.ac;
                    if (settitlemarginend != null) {
                        setMargin setmargin = i == 0 ? settitlemarginend.g : settitlemarginend.ay;
                        if (setmargin.b.j) {
                            setTitleMarginEnd settitlemarginend2 = this.l;
                            i2 = (int) ((((float) setmargin.b.l) * (i == 0 ? settitlemarginend2.U : settitlemarginend2.P)) + 0.5f);
                        }
                    }
                } else if (i4 == 3 && !(this.l.g.e == setTitleMarginEnd.write.MATCH_CONSTRAINT && this.l.g.i == 3 && this.l.ay.e == setTitleMarginEnd.write.MATCH_CONSTRAINT && this.l.ay.i == 3)) {
                    setTitleMarginEnd settitlemarginend3 = this.l;
                    setMargin setmargin2 = i == 0 ? settitlemarginend3.ay : settitlemarginend3.g;
                    if (setmargin2.b.j) {
                        float f = this.l.x;
                        this.b.e(i == 1 ? (int) ((((float) setmargin2.b.l) / f) + 0.5f) : (int) ((f * ((float) setmargin2.b.l)) + 0.5f));
                    }
                }
                this.b.e(d(i2, i));
            }
            if (this.b.j) {
                if (this.b.l == i3) {
                    this.n.e(d);
                    this.f.e(d2);
                    return;
                }
                setTitleMarginEnd settitlemarginend4 = this.l;
                float f2 = i == 0 ? settitlemarginend4.z : settitlemarginend4.ak;
                int i5 = d;
                int i6 = d2;
                if (b == b2) {
                    i5 = b.l;
                    i6 = b2.l;
                    f2 = 0.5f;
                }
                this.n.e((int) (((float) i5) + 0.5f + (((float) ((i6 - i5) - this.b.l)) * f2)));
                this.f.e(this.n.l + this.b.l);
            }
        }
    }

    public long e() {
        if (this.b.j) {
            return (long) this.b.l;
        }
        return 0;
    }

    protected final void e(setMaxCardElevation setmaxcardelevation, setMaxCardElevation setmaxcardelevation2, int i, setPaddingRelative setpaddingrelative) {
        setmaxcardelevation.h.add(setmaxcardelevation2);
        setmaxcardelevation.h.add(this.b);
        setmaxcardelevation.c = i;
        setmaxcardelevation.e = setpaddingrelative;
        setmaxcardelevation2.d.add(setmaxcardelevation);
        setpaddingrelative.d.add(setmaxcardelevation);
    }
}
