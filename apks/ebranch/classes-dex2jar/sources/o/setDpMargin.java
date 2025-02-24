package o;

import o.setMargin;
import o.setMaxCardElevation;
import o.setTitleMargin;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setDpMargin.class */
public final class setDpMargin extends setMargin {
    public setMaxCardElevation d = new setMaxCardElevation(this);
    setPaddingRelative a = null;

    /* renamed from: o.setDpMargin$3 */
    /* loaded from: classes-dex2jar.jar:o/setDpMargin$3.class */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[setMargin.RemoteActionCompatParcelizer.values().length];
            a = iArr;
            try {
                iArr[setMargin.RemoteActionCompatParcelizer.START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[setMargin.RemoteActionCompatParcelizer.END.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[setMargin.RemoteActionCompatParcelizer.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public setDpMargin(setTitleMarginEnd settitlemarginend) {
        super(settitlemarginend);
        this.n.i = setMaxCardElevation.read.TOP;
        this.f.i = setMaxCardElevation.read.BOTTOM;
        this.d.i = setMaxCardElevation.read.BASELINE;
        this.g = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final void a() {
        setTitleMarginEnd settitlemarginend;
        setTitleMarginEnd settitlemarginend2;
        int i = 0;
        if (this.l.au) {
            setPaddingRelative setpaddingrelative = this.b;
            setTitleMarginEnd settitlemarginend3 = this.l;
            setpaddingrelative.e(settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.v);
        }
        if (!this.b.j) {
            this.e = this.l.M[1];
            if (this.l.f) {
                this.a = new setCardBackgroundColor(this);
            }
            if (this.e != setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                if (this.e == setTitleMarginEnd.write.MATCH_PARENT && (settitlemarginend2 = this.l.ac) != null && settitlemarginend2.M[1] == setTitleMarginEnd.write.FIXED) {
                    if (settitlemarginend2.ap != 8) {
                        i = settitlemarginend2.v;
                    }
                    int d = this.l.al.d();
                    int d2 = this.l.f281o.d();
                    setMaxCardElevation setmaxcardelevation = this.n;
                    setMaxCardElevation setmaxcardelevation2 = settitlemarginend2.ay.n;
                    int d3 = this.l.al.d();
                    setmaxcardelevation.h.add(setmaxcardelevation2);
                    setmaxcardelevation.a = d3;
                    setmaxcardelevation2.d.add(setmaxcardelevation);
                    setMaxCardElevation setmaxcardelevation3 = this.f;
                    setMaxCardElevation setmaxcardelevation4 = settitlemarginend2.ay.f;
                    int i2 = -this.l.f281o.d();
                    setmaxcardelevation3.h.add(setmaxcardelevation4);
                    setmaxcardelevation3.a = i2;
                    setmaxcardelevation4.d.add(setmaxcardelevation3);
                    this.b.e((i - d) - d2);
                    return;
                } else if (this.e == setTitleMarginEnd.write.FIXED) {
                    setPaddingRelative setpaddingrelative2 = this.b;
                    setTitleMarginEnd settitlemarginend4 = this.l;
                    setpaddingrelative2.e(settitlemarginend4.ap == 8 ? 0 : settitlemarginend4.v);
                }
            }
        } else if (this.e == setTitleMarginEnd.write.MATCH_PARENT && (settitlemarginend = this.l.ac) != null && settitlemarginend.M[1] == setTitleMarginEnd.write.FIXED) {
            setMaxCardElevation setmaxcardelevation5 = this.n;
            setMaxCardElevation setmaxcardelevation6 = settitlemarginend.ay.n;
            int d4 = this.l.al.d();
            setmaxcardelevation5.h.add(setmaxcardelevation6);
            setmaxcardelevation5.a = d4;
            setmaxcardelevation6.d.add(setmaxcardelevation5);
            setMaxCardElevation setmaxcardelevation7 = this.f;
            setMaxCardElevation setmaxcardelevation8 = settitlemarginend.ay.f;
            int i3 = -this.l.f281o.d();
            setmaxcardelevation7.h.add(setmaxcardelevation8);
            setmaxcardelevation7.a = i3;
            setmaxcardelevation8.d.add(setmaxcardelevation7);
            return;
        }
        if (!this.b.j || !this.l.au) {
            if (this.b.j || this.e != setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                setPaddingRelative setpaddingrelative3 = this.b;
                setpaddingrelative3.d.add(this);
                if (setpaddingrelative3.j) {
                    b(this);
                }
            } else {
                int i4 = this.l.L;
                if (i4 == 2) {
                    setTitleMarginEnd settitlemarginend5 = this.l.ac;
                    if (settitlemarginend5 != null) {
                        setPaddingRelative setpaddingrelative4 = settitlemarginend5.ay.b;
                        this.b.h.add(setpaddingrelative4);
                        setpaddingrelative4.d.add(this.b);
                        this.b.b = true;
                        this.b.d.add(this.n);
                        this.b.d.add(this.f);
                    }
                } else if (i4 == 3 && !this.l.v() && this.l.N != 3) {
                    setPaddingRelative setpaddingrelative5 = this.l.g.b;
                    this.b.h.add(setpaddingrelative5);
                    setpaddingrelative5.d.add(this.b);
                    this.b.b = true;
                    this.b.d.add(this.n);
                    this.b.d.add(this.f);
                }
            }
            if (this.l.J[2].f != null && this.l.J[3].f != null) {
                if (this.l.v()) {
                    this.n.a = this.l.J[2].d();
                    this.f.a = -this.l.J[3].d();
                } else {
                    setMaxCardElevation b = b(this.l.J[2]);
                    setMaxCardElevation b2 = b(this.l.J[3]);
                    b.d.add(this);
                    if (b.j) {
                        b(this);
                    }
                    b2.d.add(this);
                    if (b2.j) {
                        b(this);
                    }
                    this.h = setMargin.RemoteActionCompatParcelizer.CENTER;
                }
                if (this.l.f) {
                    e(this.d, this.n, 1, this.a);
                }
            } else if (this.l.J[2].f != null) {
                setMaxCardElevation b3 = b(this.l.J[2]);
                if (b3 != null) {
                    setMaxCardElevation setmaxcardelevation9 = this.n;
                    int d5 = this.l.J[2].d();
                    setmaxcardelevation9.h.add(b3);
                    setmaxcardelevation9.a = d5;
                    b3.d.add(setmaxcardelevation9);
                    e(this.f, this.n, 1, this.b);
                    if (this.l.f) {
                        e(this.d, this.n, 1, this.a);
                    }
                    if (this.e == setTitleMarginEnd.write.MATCH_CONSTRAINT && this.l.x > 0.0f && this.l.g.e == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                        this.l.g.b.d.add(this.b);
                        this.b.h.add(this.l.g.b);
                        this.b.k = this;
                    }
                }
            } else if (this.l.J[3].f != null) {
                setMaxCardElevation b4 = b(this.l.J[3]);
                if (b4 != null) {
                    setMaxCardElevation setmaxcardelevation10 = this.f;
                    int i5 = -this.l.J[3].d();
                    setmaxcardelevation10.h.add(b4);
                    setmaxcardelevation10.a = i5;
                    b4.d.add(setmaxcardelevation10);
                    e(this.n, this.f, -1, this.b);
                    if (this.l.f) {
                        e(this.d, this.n, 1, this.a);
                    }
                }
            } else if (this.l.J[4].f != null) {
                setMaxCardElevation b5 = b(this.l.J[4]);
                if (b5 != null) {
                    setMaxCardElevation setmaxcardelevation11 = this.d;
                    setmaxcardelevation11.h.add(b5);
                    setmaxcardelevation11.a = 0;
                    b5.d.add(setmaxcardelevation11);
                    e(this.n, this.d, -1, this.a);
                    e(this.f, this.n, 1, this.b);
                }
            } else if (!(this.l instanceof setTitleMarginTop) && this.l.ac != null) {
                setMaxCardElevation setmaxcardelevation12 = this.l.ac.ay.n;
                setMaxCardElevation setmaxcardelevation13 = this.n;
                int t = this.l.t();
                setmaxcardelevation13.h.add(setmaxcardelevation12);
                setmaxcardelevation13.a = t;
                setmaxcardelevation12.d.add(setmaxcardelevation13);
                e(this.f, this.n, 1, this.b);
                if (this.l.f) {
                    e(this.d, this.n, 1, this.a);
                }
                if (this.e == setTitleMarginEnd.write.MATCH_CONSTRAINT && this.l.x > 0.0f && this.l.g.e == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                    this.l.g.b.d.add(this.b);
                    this.b.h.add(this.l.g.b);
                    this.b.k = this;
                }
            }
            if (this.b.h.size() == 0) {
                this.b.f = true;
            }
        } else if (this.l.J[2].f != null && this.l.J[3].f != null) {
            if (this.l.v()) {
                this.n.a = this.l.J[2].d();
                this.f.a = -this.l.J[3].d();
            } else {
                setMaxCardElevation b6 = b(this.l.J[2]);
                if (b6 != null) {
                    setMaxCardElevation setmaxcardelevation14 = this.n;
                    int d6 = this.l.J[2].d();
                    setmaxcardelevation14.h.add(b6);
                    setmaxcardelevation14.a = d6;
                    b6.d.add(setmaxcardelevation14);
                }
                setMaxCardElevation b7 = b(this.l.J[3]);
                if (b7 != null) {
                    setMaxCardElevation setmaxcardelevation15 = this.f;
                    int i6 = -this.l.J[3].d();
                    setmaxcardelevation15.h.add(b7);
                    setmaxcardelevation15.a = i6;
                    b7.d.add(setmaxcardelevation15);
                }
                this.n.b = true;
                this.f.b = true;
            }
            if (this.l.f) {
                setMaxCardElevation setmaxcardelevation16 = this.d;
                setMaxCardElevation setmaxcardelevation17 = this.n;
                int i7 = this.l.n;
                setmaxcardelevation16.h.add(setmaxcardelevation17);
                setmaxcardelevation16.a = i7;
                setmaxcardelevation17.d.add(setmaxcardelevation16);
            }
        } else if (this.l.J[2].f != null) {
            setMaxCardElevation b8 = b(this.l.J[2]);
            if (b8 != null) {
                setMaxCardElevation setmaxcardelevation18 = this.n;
                int d7 = this.l.J[2].d();
                setmaxcardelevation18.h.add(b8);
                setmaxcardelevation18.a = d7;
                b8.d.add(setmaxcardelevation18);
                setMaxCardElevation setmaxcardelevation19 = this.f;
                setMaxCardElevation setmaxcardelevation20 = this.n;
                int i8 = this.b.l;
                setmaxcardelevation19.h.add(setmaxcardelevation20);
                setmaxcardelevation19.a = i8;
                setmaxcardelevation20.d.add(setmaxcardelevation19);
                if (this.l.f) {
                    setMaxCardElevation setmaxcardelevation21 = this.d;
                    setMaxCardElevation setmaxcardelevation22 = this.n;
                    int i9 = this.l.n;
                    setmaxcardelevation21.h.add(setmaxcardelevation22);
                    setmaxcardelevation21.a = i9;
                    setmaxcardelevation22.d.add(setmaxcardelevation21);
                }
            }
        } else if (this.l.J[3].f != null) {
            setMaxCardElevation b9 = b(this.l.J[3]);
            if (b9 != null) {
                setMaxCardElevation setmaxcardelevation23 = this.f;
                int i10 = -this.l.J[3].d();
                setmaxcardelevation23.h.add(b9);
                setmaxcardelevation23.a = i10;
                b9.d.add(setmaxcardelevation23);
                setMaxCardElevation setmaxcardelevation24 = this.n;
                setMaxCardElevation setmaxcardelevation25 = this.f;
                int i11 = -this.b.l;
                setmaxcardelevation24.h.add(setmaxcardelevation25);
                setmaxcardelevation24.a = i11;
                setmaxcardelevation25.d.add(setmaxcardelevation24);
            }
            if (this.l.f) {
                setMaxCardElevation setmaxcardelevation26 = this.d;
                setMaxCardElevation setmaxcardelevation27 = this.n;
                int i12 = this.l.n;
                setmaxcardelevation26.h.add(setmaxcardelevation27);
                setmaxcardelevation26.a = i12;
                setmaxcardelevation27.d.add(setmaxcardelevation26);
            }
        } else if (this.l.J[4].f != null) {
            setMaxCardElevation b10 = b(this.l.J[4]);
            if (b10 != null) {
                setMaxCardElevation setmaxcardelevation28 = this.d;
                setmaxcardelevation28.h.add(b10);
                setmaxcardelevation28.a = 0;
                b10.d.add(setmaxcardelevation28);
                setMaxCardElevation setmaxcardelevation29 = this.n;
                setMaxCardElevation setmaxcardelevation30 = this.d;
                int i13 = -this.l.n;
                setmaxcardelevation29.h.add(setmaxcardelevation30);
                setmaxcardelevation29.a = i13;
                setmaxcardelevation30.d.add(setmaxcardelevation29);
                setMaxCardElevation setmaxcardelevation31 = this.f;
                setMaxCardElevation setmaxcardelevation32 = this.n;
                int i14 = this.b.l;
                setmaxcardelevation31.h.add(setmaxcardelevation32);
                setmaxcardelevation31.a = i14;
                setmaxcardelevation32.d.add(setmaxcardelevation31);
            }
        } else if (!(this.l instanceof setTitleMarginTop) && this.l.ac != null && this.l.b(setTitleMargin.write.CENTER).f == null) {
            setMaxCardElevation setmaxcardelevation33 = this.l.ac.ay.n;
            setMaxCardElevation setmaxcardelevation34 = this.n;
            int t2 = this.l.t();
            setmaxcardelevation34.h.add(setmaxcardelevation33);
            setmaxcardelevation34.a = t2;
            setmaxcardelevation33.d.add(setmaxcardelevation34);
            setMaxCardElevation setmaxcardelevation35 = this.f;
            setMaxCardElevation setmaxcardelevation36 = this.n;
            int i15 = this.b.l;
            setmaxcardelevation35.h.add(setmaxcardelevation36);
            setmaxcardelevation35.a = i15;
            setmaxcardelevation36.d.add(setmaxcardelevation35);
            if (this.l.f) {
                setMaxCardElevation setmaxcardelevation37 = this.d;
                setMaxCardElevation setmaxcardelevation38 = this.n;
                int i16 = this.l.n;
                setmaxcardelevation37.h.add(setmaxcardelevation38);
                setmaxcardelevation37.a = i16;
                setmaxcardelevation38.d.add(setmaxcardelevation37);
            }
        }
    }

    @Override // o.setMargin
    public final void b() {
        this.f241o = null;
        this.n.b();
        this.f.b();
        this.d.b();
        this.b.b();
        this.j = false;
    }

    @Override // o.setMargin, o.setPreventCornerOverlap
    public final void b(setPreventCornerOverlap setpreventcorneroverlap) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = AnonymousClass3.a[this.h.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 != 3) {
            if (this.b.f && !this.b.j && this.e == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                int i3 = this.l.L;
                if (i3 == 2) {
                    setTitleMarginEnd settitlemarginend = this.l.ac;
                    if (settitlemarginend != null && settitlemarginend.ay.b.j) {
                        this.b.e((int) ((((float) settitlemarginend.ay.b.l) * this.l.P) + 0.5f));
                    }
                } else if (i3 == 3 && this.l.g.b.j) {
                    int d_ = this.l.d_();
                    if (d_ == -1) {
                        f3 = (float) this.l.g.b.l;
                        f2 = this.l.x;
                    } else if (d_ == 0) {
                        f = ((float) this.l.g.b.l) * this.l.x;
                        i = (int) (f + 0.5f);
                        this.b.e(i);
                    } else if (d_ != 1) {
                        i = 0;
                        this.b.e(i);
                    } else {
                        f3 = (float) this.l.g.b.l;
                        f2 = this.l.x;
                    }
                    f = f3 / f2;
                    i = (int) (f + 0.5f);
                    this.b.e(i);
                }
            }
            if (this.n.f && this.f.f) {
                if (this.n.j && this.f.j && this.b.j) {
                    return;
                }
                if (this.b.j || this.e != setTitleMarginEnd.write.MATCH_CONSTRAINT || this.l.N != 0 || this.l.v()) {
                    if (!this.b.j && this.e == setTitleMarginEnd.write.MATCH_CONSTRAINT && this.i == 1 && this.n.h.size() > 0 && this.f.h.size() > 0) {
                        setMaxCardElevation setmaxcardelevation = this.n.h.get(0);
                        int i4 = (this.f.h.get(0).l + this.f.a) - (setmaxcardelevation.l + this.n.a);
                        if (i4 < this.b.n) {
                            this.b.e(i4);
                        } else {
                            this.b.e(this.b.n);
                        }
                    }
                    if (this.b.j && this.n.h.size() > 0 && this.f.h.size() > 0) {
                        setMaxCardElevation setmaxcardelevation2 = this.n.h.get(0);
                        setMaxCardElevation setmaxcardelevation3 = this.f.h.get(0);
                        int i5 = setmaxcardelevation2.l + this.n.a;
                        int i6 = setmaxcardelevation3.l + this.f.a;
                        float f4 = this.l.ak;
                        if (setmaxcardelevation2 == setmaxcardelevation3) {
                            i5 = setmaxcardelevation2.l;
                            i6 = setmaxcardelevation3.l;
                            f4 = 0.5f;
                        }
                        this.n.e((int) (((float) i5) + 0.5f + (((float) ((i6 - i5) - this.b.l)) * f4)));
                        this.f.e(this.n.l + this.b.l);
                        return;
                    }
                    return;
                }
                setMaxCardElevation setmaxcardelevation4 = this.n.h.get(0);
                setMaxCardElevation setmaxcardelevation5 = this.f.h.get(0);
                int i7 = setmaxcardelevation4.l + this.n.a;
                int i8 = setmaxcardelevation5.l + this.f.a;
                this.n.e(i7);
                this.f.e(i8);
                this.b.e(i8 - i7);
                return;
            }
            return;
        }
        d(this.l.al, this.l.f281o, 1);
    }

    @Override // o.setMargin
    public final boolean c() {
        return this.e != setTitleMarginEnd.write.MATCH_CONSTRAINT || this.l.L == 0;
    }

    @Override // o.setMargin
    public final void d() {
        if (this.n.j) {
            this.l.m(this.n.l);
        }
    }

    public final void i() {
        this.j = false;
        this.n.b();
        this.n.j = false;
        this.f.b();
        this.f.j = false;
        this.d.b();
        this.d.j = false;
        this.b.j = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalRun ");
        sb.append(this.l.u);
        return sb.toString();
    }
}
