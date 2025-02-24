package o;

import java.util.ArrayList;
import java.util.Iterator;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setLayoutResource.class */
public final class setLayoutResource extends setMargin {
    private int a;
    ArrayList<setMargin> c = new ArrayList<>();

    public setLayoutResource(setTitleMarginEnd settitlemarginend, int i) {
        super(settitlemarginend);
        this.g = i;
        j();
    }

    private setTitleMarginEnd f() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            setMargin setmargin = this.c.get(size);
            if (setmargin.l.ap != 8) {
                return setmargin.l;
            }
        }
        return null;
    }

    private setTitleMarginEnd g() {
        for (int i = 0; i < this.c.size(); i++) {
            setMargin setmargin = this.c.get(i);
            if (setmargin.l.ap != 8) {
                return setmargin.l;
            }
        }
        return null;
    }

    private void j() {
        setTitleMarginEnd settitlemarginend = this.l;
        setTitleMarginEnd b = settitlemarginend.b(this.g);
        while (b != null) {
            b = b.b(this.g);
            settitlemarginend = b;
        }
        this.l = settitlemarginend;
        ArrayList<setMargin> arrayList = this.c;
        int i = this.g;
        arrayList.add(i == 0 ? settitlemarginend.g : i == 1 ? settitlemarginend.ay : null);
        setTitleMarginEnd e = settitlemarginend.e(this.g);
        while (e != null) {
            ArrayList<setMargin> arrayList2 = this.c;
            int i2 = this.g;
            arrayList2.add(i2 == 0 ? e.g : i2 == 1 ? e.ay : null);
            e = e.e(this.g);
        }
        Iterator<setMargin> it = this.c.iterator();
        while (it.hasNext()) {
            setMargin next = it.next();
            if (this.g == 0) {
                next.l.i = this;
            } else if (this.g == 1) {
                next.l.aB = this;
            }
        }
        if ((this.g == 0 && ((setTitleMarginBottom) this.l.ac).aD) && this.c.size() > 1) {
            ArrayList<setMargin> arrayList3 = this.c;
            this.l = arrayList3.get(arrayList3.size() - 1).l;
        }
        this.a = this.g == 0 ? this.l.B : this.l.aj;
    }

    @Override // o.setMargin
    final void a() {
        Iterator<setMargin> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        int size = this.c.size();
        if (size > 0) {
            setTitleMarginEnd settitlemarginend = this.c.get(0).l;
            setTitleMarginEnd settitlemarginend2 = this.c.get(size - 1).l;
            if (this.g == 0) {
                setTitleMargin settitlemargin = settitlemarginend.F;
                setTitleMargin settitlemargin2 = settitlemarginend2.am;
                setMaxCardElevation e = e(settitlemargin, 0);
                int d = settitlemargin.d();
                setTitleMarginEnd g = g();
                if (g != null) {
                    d = g.F.d();
                }
                if (e != null) {
                    setMaxCardElevation setmaxcardelevation = this.n;
                    setmaxcardelevation.h.add(e);
                    setmaxcardelevation.a = d;
                    e.d.add(setmaxcardelevation);
                }
                setMaxCardElevation e2 = e(settitlemargin2, 0);
                int d2 = settitlemargin2.d();
                setTitleMarginEnd f = f();
                if (f != null) {
                    d2 = f.am.d();
                }
                if (e2 != null) {
                    setMaxCardElevation setmaxcardelevation2 = this.f;
                    setmaxcardelevation2.h.add(e2);
                    setmaxcardelevation2.a = -d2;
                    e2.d.add(setmaxcardelevation2);
                }
            } else {
                setTitleMargin settitlemargin3 = settitlemarginend.al;
                setTitleMargin settitlemargin4 = settitlemarginend2.f281o;
                setMaxCardElevation e3 = e(settitlemargin3, 1);
                int d3 = settitlemargin3.d();
                setTitleMarginEnd g2 = g();
                if (g2 != null) {
                    d3 = g2.al.d();
                }
                if (e3 != null) {
                    setMaxCardElevation setmaxcardelevation3 = this.n;
                    setmaxcardelevation3.h.add(e3);
                    setmaxcardelevation3.a = d3;
                    e3.d.add(setmaxcardelevation3);
                }
                setMaxCardElevation e4 = e(settitlemargin4, 1);
                int d4 = settitlemargin4.d();
                setTitleMarginEnd f2 = f();
                if (f2 != null) {
                    d4 = f2.f281o.d();
                }
                if (e4 != null) {
                    setMaxCardElevation setmaxcardelevation4 = this.f;
                    setmaxcardelevation4.h.add(e4);
                    setmaxcardelevation4.a = -d4;
                    e4.d.add(setmaxcardelevation4);
                }
            }
            this.n.k = this;
            this.f.k = this;
        }
    }

    @Override // o.setMargin
    final void b() {
        this.f241o = null;
        Iterator<setMargin> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // o.setMargin, o.setPreventCornerOverlap
    public final void b(setPreventCornerOverlap setpreventcorneroverlap) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        float f2;
        int i11;
        if (this.n.j && this.f.j) {
            setTitleMarginEnd settitlemarginend = this.l.ac;
            boolean z2 = (settitlemarginend == null || !(settitlemarginend instanceof setTitleMarginBottom)) ? false : ((setTitleMarginBottom) settitlemarginend).aD;
            int i12 = this.f.l - this.n.l;
            int size = this.c.size();
            int i13 = 0;
            while (true) {
                i2 = -1;
                if (i13 >= size) {
                    i = -1;
                    break;
                }
                i = i13;
                if (this.c.get(i13).l.ap != 8) {
                    break;
                }
                i13++;
            }
            int i14 = size - 1;
            int i15 = i14;
            while (true) {
                if (i15 < 0) {
                    break;
                }
                if (this.c.get(i15).l.ap != 8) {
                    i2 = i15;
                    break;
                }
                i15--;
            }
            for (int i16 = 0; i16 < 2; i16++) {
                i4 = 0;
                int i17 = 0;
                int i18 = 0;
                f = 0.0f;
                for (int i19 = 0; i19 < size; i19++) {
                    setMargin setmargin = this.c.get(i19);
                    if (setmargin.l.ap == 8) {
                        i4 = i4;
                        i17 = i17;
                    } else {
                        int i20 = i18 + 1;
                        int i21 = i4;
                        if (i19 > 0) {
                            i21 = i4;
                            if (i19 >= i) {
                                i21 = i4 + setmargin.n.a;
                            }
                        }
                        int i22 = setmargin.b.l;
                        boolean z3 = setmargin.e != setTitleMarginEnd.write.MATCH_CONSTRAINT;
                        if (!z3) {
                            if (setmargin.i == 1 && i16 == 0) {
                                i9 = setmargin.b.n;
                                i10 = i17 + 1;
                            } else {
                                z = z3;
                                i9 = i22;
                                i10 = i17;
                                if (setmargin.b.j) {
                                    i10 = i17;
                                    i9 = i22;
                                }
                            }
                            z = true;
                        } else if (this.g != 0 || setmargin.l.g.b.j) {
                            z = z3;
                            i9 = i22;
                            i10 = i17;
                            if (this.g == 1) {
                                z = z3;
                                i9 = i22;
                                i10 = i17;
                                if (!setmargin.l.ay.b.j) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        if (!z) {
                            int i23 = i10 + 1;
                            float f3 = setmargin.l.ar[this.g];
                            i11 = i21;
                            i10 = i23;
                            f2 = f;
                            if (f3 >= 0.0f) {
                                f2 = f + f3;
                                i11 = i21;
                                i10 = i23;
                            }
                        } else {
                            i11 = i21 + i9;
                            f2 = f;
                        }
                        i4 = i11;
                        i17 = i10;
                        i18 = i20;
                        f = f2;
                        if (i19 < i14) {
                            i4 = i11;
                            i17 = i10;
                            i18 = i20;
                            f = f2;
                            if (i19 < i2) {
                                i4 = i11 - setmargin.f.a;
                                f = f2;
                                i18 = i20;
                                i17 = i10;
                            }
                        }
                    }
                }
                if (i4 < i12 || i17 == 0) {
                    i3 = i18;
                    i5 = i17;
                    break;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i24 = this.n.l;
            if (z2) {
                i24 = this.f.l;
            }
            int i25 = i24;
            if (i4 > i12) {
                int i26 = (int) ((((float) (i4 - i12)) / 2.0f) + 0.5f);
                i25 = z2 ? i24 + i26 : i24 - i26;
            }
            if (i5 > 0) {
                float f4 = (float) (i12 - i4);
                int i27 = (int) ((f4 / ((float) i5)) + 0.5f);
                int i28 = 0;
                for (int i29 = 0; i29 < size; i29++) {
                    setMargin setmargin2 = this.c.get(i29);
                    if (setmargin2.l.ap == 8 || setmargin2.e != setTitleMarginEnd.write.MATCH_CONSTRAINT || setmargin2.b.j) {
                        i28 = i28;
                    } else {
                        if (f > 0.0f) {
                            i27 = (int) (((setmargin2.l.ar[this.g] * f4) / f) + 0.5f);
                        }
                        if (this.g == 0) {
                            int i30 = setmargin2.l.Q;
                            int max = Math.max(setmargin2.l.S, setmargin2.i == 1 ? Math.min(i27, setmargin2.b.n) : i27);
                            int i31 = max;
                            if (i30 > 0) {
                                i31 = Math.min(i30, max);
                            }
                            i8 = i27;
                            i28 = i28;
                            if (i31 != i27) {
                                i28++;
                                i8 = i31;
                            }
                        } else {
                            int i32 = setmargin2.l.R;
                            int max2 = Math.max(setmargin2.l.O, setmargin2.i == 1 ? Math.min(i27, setmargin2.b.n) : i27);
                            int i33 = max2;
                            if (i32 > 0) {
                                i33 = Math.min(i32, max2);
                            }
                            i8 = i27;
                            i28 = i28;
                            if (i33 != i27) {
                                i28++;
                                i8 = i33;
                            }
                        }
                        setmargin2.b.e(i8);
                    }
                }
                if (i28 > 0) {
                    i5 -= i28;
                    i7 = 0;
                    for (int i34 = 0; i34 < size; i34++) {
                        setMargin setmargin3 = this.c.get(i34);
                        i7 = i7;
                        if (setmargin3.l.ap != 8) {
                            int i35 = i7;
                            if (i34 > 0) {
                                i35 = i7;
                                if (i34 >= i) {
                                    i35 = i7 + setmargin3.n.a;
                                }
                            }
                            int i36 = i35 + setmargin3.b.l;
                            i7 = i36;
                            if (i34 < i14) {
                                i7 = i36;
                                if (i34 < i2) {
                                    i7 = i36 - setmargin3.f.a;
                                }
                            }
                        }
                    }
                } else {
                    i7 = i4;
                }
                if (this.a == 2 && i28 == 0) {
                    this.a = 0;
                    i4 = i7;
                    i6 = i5;
                    i25 = i25;
                } else {
                    i4 = i7;
                    i6 = i5;
                    i25 = i25;
                }
            } else {
                i6 = i5;
            }
            if (i4 > i12) {
                this.a = 2;
            }
            if (i3 > 0 && i6 == 0 && i == i2) {
                this.a = 2;
            }
            int i37 = this.a;
            if (i37 == 1) {
                int i38 = i3 > 1 ? (i12 - i4) / (i3 - 1) : i3 == 1 ? (i12 - i4) / 2 : 0;
                if (i6 > 0) {
                    i38 = 0;
                }
                int i39 = i25;
                for (int i40 = 0; i40 < size; i40++) {
                    setMargin setmargin4 = this.c.get(z2 ? size - (i40 + 1) : i40);
                    if (setmargin4.l.ap == 8) {
                        setmargin4.n.e(i39);
                        setmargin4.f.e(i39);
                    } else {
                        int i41 = i39;
                        if (i40 > 0) {
                            i41 = z2 ? i39 - i38 : i39 + i38;
                        }
                        int i42 = i41;
                        if (i40 > 0) {
                            i42 = i41;
                            if (i40 >= i) {
                                i42 = z2 ? i41 - setmargin4.n.a : i41 + setmargin4.n.a;
                            }
                        }
                        if (z2) {
                            setmargin4.f.e(i42);
                        } else {
                            setmargin4.n.e(i42);
                        }
                        int i43 = setmargin4.b.l;
                        int i44 = i43;
                        if (setmargin4.e == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                            i44 = i43;
                            if (setmargin4.i == 1) {
                                i44 = setmargin4.b.n;
                            }
                        }
                        int i45 = z2 ? i42 - i44 : i42 + i44;
                        if (z2) {
                            setmargin4.n.e(i45);
                        } else {
                            setmargin4.f.e(i45);
                        }
                        setmargin4.j = true;
                        i39 = i45;
                        if (i40 < i14) {
                            i39 = i45;
                            if (i40 < i2) {
                                i39 = i45 - (z2 ? -setmargin4.f.a : setmargin4.f.a);
                            }
                        }
                    }
                }
            } else if (i37 == 0) {
                int i46 = (i12 - i4) / (i3 + 1);
                if (i6 > 0) {
                    i46 = 0;
                }
                int i47 = i25;
                for (int i48 = 0; i48 < size; i48++) {
                    setMargin setmargin5 = this.c.get(z2 ? size - (i48 + 1) : i48);
                    if (setmargin5.l.ap == 8) {
                        setmargin5.n.e(i47);
                        setmargin5.f.e(i47);
                    } else {
                        int i49 = z2 ? i47 - i46 : i47 + i46;
                        int i50 = i49;
                        if (i48 > 0) {
                            i50 = i49;
                            if (i48 >= i) {
                                i50 = z2 ? i49 - setmargin5.n.a : i49 + setmargin5.n.a;
                            }
                        }
                        if (z2) {
                            setmargin5.f.e(i50);
                        } else {
                            setmargin5.n.e(i50);
                        }
                        int i51 = setmargin5.b.l;
                        int i52 = i51;
                        if (setmargin5.e == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                            i52 = i51;
                            if (setmargin5.i == 1) {
                                i52 = Math.min(i51, setmargin5.b.n);
                            }
                        }
                        int i53 = z2 ? i50 - i52 : i50 + i52;
                        if (z2) {
                            setmargin5.n.e(i53);
                        } else {
                            setmargin5.f.e(i53);
                        }
                        i47 = i53;
                        if (i48 < i14) {
                            i47 = i53;
                            if (i48 < i2) {
                                i47 = i53 - (z2 ? -setmargin5.f.a : setmargin5.f.a);
                            }
                        }
                    }
                }
            } else if (i37 == 2) {
                float f5 = this.g == 0 ? this.l.z : this.l.ak;
                float f6 = f5;
                if (z2) {
                    f6 = 1.0f - f5;
                }
                int i54 = (int) ((((float) (i12 - i4)) * f6) + 0.5f);
                if (i54 < 0 || i6 > 0) {
                    i54 = 0;
                }
                int i55 = z2 ? i25 - i54 : i25 + i54;
                for (int i56 = 0; i56 < size; i56++) {
                    setMargin setmargin6 = this.c.get(z2 ? size - (i56 + 1) : i56);
                    if (setmargin6.l.ap == 8) {
                        setmargin6.n.e(i55);
                        setmargin6.f.e(i55);
                        i55 = i55;
                    } else {
                        int i57 = i55;
                        if (i56 > 0) {
                            i57 = i55;
                            if (i56 >= i) {
                                i57 = z2 ? i55 - setmargin6.n.a : i55 + setmargin6.n.a;
                            }
                        }
                        if (z2) {
                            setmargin6.f.e(i57);
                        } else {
                            setmargin6.n.e(i57);
                        }
                        int i58 = setmargin6.b.l;
                        if (setmargin6.e == setTitleMarginEnd.write.MATCH_CONSTRAINT && setmargin6.i == 1) {
                            i58 = setmargin6.b.n;
                        }
                        int i59 = z2 ? i57 - i58 : i57 + i58;
                        if (z2) {
                            setmargin6.n.e(i59);
                        } else {
                            setmargin6.f.e(i59);
                        }
                        i55 = i59;
                        if (i56 < i14) {
                            i55 = i59;
                            if (i56 < i2) {
                                i55 = i59 - (z2 ? -setmargin6.f.a : setmargin6.f.a);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final boolean c() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (!this.c.get(i).c()) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setMargin
    public final void d() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).d();
        }
    }

    @Override // o.setMargin
    public final long e() {
        int size = this.c.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            setMargin setmargin = this.c.get(i);
            j = j + ((long) setmargin.n.a) + setmargin.e() + ((long) setmargin.f.a);
        }
        return j;
    }

    public final String toString() {
        String concat = "ChainRun ".concat(this.g == 0 ? "horizontal : " : "vertical : ");
        Iterator<setMargin> it = this.c.iterator();
        while (it.hasNext()) {
            setMargin next = it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(concat);
            sb.append("<");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(next);
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append("> ");
            concat = sb3.toString();
        }
        return concat;
    }
}
