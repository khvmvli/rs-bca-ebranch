package o;

import o.setMargin;
import o.setMaxCardElevation;
import o.setTitleMargin;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setUseCompatPadding.class */
public final class setUseCompatPadding extends setMargin {
    private static int[] a = new int[2];

    /* renamed from: o.setUseCompatPadding$5 */
    /* loaded from: classes-dex2jar.jar:o/setUseCompatPadding$5.class */
    static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[setMargin.RemoteActionCompatParcelizer.values().length];
            b = iArr;
            try {
                iArr[setMargin.RemoteActionCompatParcelizer.START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[setMargin.RemoteActionCompatParcelizer.END.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[setMargin.RemoteActionCompatParcelizer.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public setUseCompatPadding(setTitleMarginEnd settitlemarginend) {
        super(settitlemarginend);
        this.n.i = setMaxCardElevation.read.LEFT;
        this.f.i = setMaxCardElevation.read.RIGHT;
        this.g = 0;
    }

    private static void c(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    @Override // o.setMargin
    public final void a() {
        setTitleMarginEnd settitlemarginend;
        setTitleMarginEnd settitlemarginend2;
        int i = 0;
        if (this.l.au) {
            setPaddingRelative setpaddingrelative = this.b;
            setTitleMarginEnd settitlemarginend3 = this.l;
            setpaddingrelative.e(settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.aw);
        }
        if (!this.b.j) {
            this.e = this.l.M[0];
            if (this.e != setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                if (this.e == setTitleMarginEnd.write.MATCH_PARENT && (((settitlemarginend2 = this.l.ac) != null && settitlemarginend2.M[0] == setTitleMarginEnd.write.FIXED) || settitlemarginend2.M[0] == setTitleMarginEnd.write.MATCH_PARENT)) {
                    if (settitlemarginend2.ap != 8) {
                        i = settitlemarginend2.aw;
                    }
                    int d = this.l.F.d();
                    int d2 = this.l.am.d();
                    setMaxCardElevation setmaxcardelevation = this.n;
                    setMaxCardElevation setmaxcardelevation2 = settitlemarginend2.g.n;
                    int d3 = this.l.F.d();
                    setmaxcardelevation.h.add(setmaxcardelevation2);
                    setmaxcardelevation.a = d3;
                    setmaxcardelevation2.d.add(setmaxcardelevation);
                    setMaxCardElevation setmaxcardelevation3 = this.f;
                    setMaxCardElevation setmaxcardelevation4 = settitlemarginend2.g.f;
                    int i2 = -this.l.am.d();
                    setmaxcardelevation3.h.add(setmaxcardelevation4);
                    setmaxcardelevation3.a = i2;
                    setmaxcardelevation4.d.add(setmaxcardelevation3);
                    this.b.e((i - d) - d2);
                    return;
                } else if (this.e == setTitleMarginEnd.write.FIXED) {
                    setPaddingRelative setpaddingrelative2 = this.b;
                    setTitleMarginEnd settitlemarginend4 = this.l;
                    setpaddingrelative2.e(settitlemarginend4.ap == 8 ? 0 : settitlemarginend4.aw);
                }
            }
        } else if (this.e == setTitleMarginEnd.write.MATCH_PARENT && (((settitlemarginend = this.l.ac) != null && settitlemarginend.M[0] == setTitleMarginEnd.write.FIXED) || settitlemarginend.M[0] == setTitleMarginEnd.write.MATCH_PARENT)) {
            setMaxCardElevation setmaxcardelevation5 = this.n;
            setMaxCardElevation setmaxcardelevation6 = settitlemarginend.g.n;
            int d4 = this.l.F.d();
            setmaxcardelevation5.h.add(setmaxcardelevation6);
            setmaxcardelevation5.a = d4;
            setmaxcardelevation6.d.add(setmaxcardelevation5);
            setMaxCardElevation setmaxcardelevation7 = this.f;
            setMaxCardElevation setmaxcardelevation8 = settitlemarginend.g.f;
            int i3 = -this.l.am.d();
            setmaxcardelevation7.h.add(setmaxcardelevation8);
            setmaxcardelevation7.a = i3;
            setmaxcardelevation8.d.add(setmaxcardelevation7);
            return;
        }
        if (!this.b.j || !this.l.au) {
            if (this.e == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                int i4 = this.l.N;
                if (i4 == 2) {
                    setTitleMarginEnd settitlemarginend5 = this.l.ac;
                    if (settitlemarginend5 != null) {
                        setPaddingRelative setpaddingrelative3 = settitlemarginend5.ay.b;
                        this.b.h.add(setpaddingrelative3);
                        setpaddingrelative3.d.add(this.b);
                        this.b.b = true;
                        this.b.d.add(this.n);
                        this.b.d.add(this.f);
                    }
                } else if (i4 == 3) {
                    if (this.l.L == 3) {
                        this.n.k = this;
                        this.f.k = this;
                        this.l.ay.n.k = this;
                        this.l.ay.f.k = this;
                        this.b.k = this;
                        if (this.l.v()) {
                            this.b.h.add(this.l.ay.b);
                            this.l.ay.b.d.add(this.b);
                            this.l.ay.b.k = this;
                            this.b.h.add(this.l.ay.n);
                            this.b.h.add(this.l.ay.f);
                            this.l.ay.n.d.add(this.b);
                            this.l.ay.f.d.add(this.b);
                        } else if (this.l.w()) {
                            this.l.ay.b.h.add(this.b);
                            this.b.d.add(this.l.ay.b);
                        } else {
                            this.l.ay.b.h.add(this.b);
                        }
                    } else {
                        setPaddingRelative setpaddingrelative4 = this.l.ay.b;
                        this.b.h.add(setpaddingrelative4);
                        setpaddingrelative4.d.add(this.b);
                        this.l.ay.n.d.add(this.b);
                        this.l.ay.f.d.add(this.b);
                        this.b.b = true;
                        this.b.d.add(this.n);
                        this.b.d.add(this.f);
                        this.n.h.add(this.b);
                        this.f.h.add(this.b);
                    }
                }
            }
            if (this.l.J[0].f == null || this.l.J[1].f == null) {
                if (this.l.J[0].f != null) {
                    setMaxCardElevation b = b(this.l.J[0]);
                    if (b != null) {
                        setMaxCardElevation setmaxcardelevation9 = this.n;
                        int d5 = this.l.J[0].d();
                        setmaxcardelevation9.h.add(b);
                        setmaxcardelevation9.a = d5;
                        b.d.add(setmaxcardelevation9);
                        e(this.f, this.n, 1, this.b);
                    }
                } else if (this.l.J[1].f != null) {
                    setMaxCardElevation b2 = b(this.l.J[1]);
                    if (b2 != null) {
                        setMaxCardElevation setmaxcardelevation10 = this.f;
                        int i5 = -this.l.J[1].d();
                        setmaxcardelevation10.h.add(b2);
                        setmaxcardelevation10.a = i5;
                        b2.d.add(setmaxcardelevation10);
                        e(this.n, this.f, -1, this.b);
                    }
                } else if (!(this.l instanceof setTitleMarginTop) && this.l.ac != null) {
                    setMaxCardElevation setmaxcardelevation11 = this.l.ac.g.n;
                    setMaxCardElevation setmaxcardelevation12 = this.n;
                    int p = this.l.p();
                    setmaxcardelevation12.h.add(setmaxcardelevation11);
                    setmaxcardelevation12.a = p;
                    setmaxcardelevation11.d.add(setmaxcardelevation12);
                    e(this.f, this.n, 1, this.b);
                }
            } else if (this.l.w()) {
                this.n.a = this.l.J[0].d();
                this.f.a = -this.l.J[1].d();
            } else {
                setMaxCardElevation b3 = b(this.l.J[0]);
                setMaxCardElevation b4 = b(this.l.J[1]);
                b3.d.add(this);
                if (b3.j) {
                    b(this);
                }
                b4.d.add(this);
                if (b4.j) {
                    b(this);
                }
                this.h = setMargin.RemoteActionCompatParcelizer.CENTER;
            }
        } else if (this.l.J[0].f == null || this.l.J[1].f == null) {
            if (this.l.J[0].f != null) {
                setMaxCardElevation b5 = b(this.l.J[0]);
                if (b5 != null) {
                    setMaxCardElevation setmaxcardelevation13 = this.n;
                    int d6 = this.l.J[0].d();
                    setmaxcardelevation13.h.add(b5);
                    setmaxcardelevation13.a = d6;
                    b5.d.add(setmaxcardelevation13);
                    setMaxCardElevation setmaxcardelevation14 = this.f;
                    setMaxCardElevation setmaxcardelevation15 = this.n;
                    int i6 = this.b.l;
                    setmaxcardelevation14.h.add(setmaxcardelevation15);
                    setmaxcardelevation14.a = i6;
                    setmaxcardelevation15.d.add(setmaxcardelevation14);
                }
            } else if (this.l.J[1].f != null) {
                setMaxCardElevation b6 = b(this.l.J[1]);
                if (b6 != null) {
                    setMaxCardElevation setmaxcardelevation16 = this.f;
                    int i7 = -this.l.J[1].d();
                    setmaxcardelevation16.h.add(b6);
                    setmaxcardelevation16.a = i7;
                    b6.d.add(setmaxcardelevation16);
                    setMaxCardElevation setmaxcardelevation17 = this.n;
                    setMaxCardElevation setmaxcardelevation18 = this.f;
                    int i8 = -this.b.l;
                    setmaxcardelevation17.h.add(setmaxcardelevation18);
                    setmaxcardelevation17.a = i8;
                    setmaxcardelevation18.d.add(setmaxcardelevation17);
                }
            } else if (!(this.l instanceof setTitleMarginTop) && this.l.ac != null && this.l.b(setTitleMargin.write.CENTER).f == null) {
                setMaxCardElevation setmaxcardelevation19 = this.l.ac.g.n;
                setMaxCardElevation setmaxcardelevation20 = this.n;
                int p2 = this.l.p();
                setmaxcardelevation20.h.add(setmaxcardelevation19);
                setmaxcardelevation20.a = p2;
                setmaxcardelevation19.d.add(setmaxcardelevation20);
                setMaxCardElevation setmaxcardelevation21 = this.f;
                setMaxCardElevation setmaxcardelevation22 = this.n;
                int i9 = this.b.l;
                setmaxcardelevation21.h.add(setmaxcardelevation22);
                setmaxcardelevation21.a = i9;
                setmaxcardelevation22.d.add(setmaxcardelevation21);
            }
        } else if (this.l.w()) {
            this.n.a = this.l.J[0].d();
            this.f.a = -this.l.J[1].d();
        } else {
            setMaxCardElevation b7 = b(this.l.J[0]);
            if (b7 != null) {
                setMaxCardElevation setmaxcardelevation23 = this.n;
                int d7 = this.l.J[0].d();
                setmaxcardelevation23.h.add(b7);
                setmaxcardelevation23.a = d7;
                b7.d.add(setmaxcardelevation23);
            }
            setMaxCardElevation b8 = b(this.l.J[1]);
            if (b8 != null) {
                setMaxCardElevation setmaxcardelevation24 = this.f;
                int i10 = -this.l.J[1].d();
                setmaxcardelevation24.h.add(b8);
                setmaxcardelevation24.a = i10;
                b8.d.add(setmaxcardelevation24);
            }
            this.n.b = true;
            this.f.b = true;
        }
    }

    @Override // o.setMargin
    public final void b() {
        this.f241o = null;
        this.n.b();
        this.f.b();
        this.b.b();
        this.j = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x050e, code lost:
        if (r0 != 1) goto L_0x05e0;
     */
    @Override // o.setMargin, o.setPreventCornerOverlap
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(o.setPreventCornerOverlap r9) {
        /*
        // Method dump skipped, instructions count: 2029
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setUseCompatPadding.b(o.setPreventCornerOverlap):void");
    }

    @Override // o.setMargin
    public final boolean c() {
        return this.e != setTitleMarginEnd.write.MATCH_CONSTRAINT || this.l.N == 0;
    }

    @Override // o.setMargin
    public final void d() {
        if (this.n.j) {
            this.l.o(this.n.l);
        }
    }

    public final void g() {
        this.j = false;
        this.n.b();
        this.n.j = false;
        this.f.b();
        this.f.j = false;
        this.b.j = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalRun ");
        sb.append(this.l.u);
        return sb.toString();
    }
}
