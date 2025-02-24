package o;

import o.setTitleMargin;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setNavigationContentDescription.class */
public final class setNavigationContentDescription extends setTitleTextAppearance {
    public int a = 0;
    public boolean e = true;
    public int c = 0;
    boolean d = false;

    @Override // o.setTitleMarginEnd
    public final boolean a() {
        return true;
    }

    @Override // o.setTitleMarginEnd
    public final void b(setContentInsetsAbsolute setcontentinsetsabsolute, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        this.J[0] = this.F;
        this.J[2] = this.al;
        this.J[1] = this.am;
        this.J[3] = this.f281o;
        for (int i4 = 0; i4 < this.J.length; i4++) {
            this.J[i4].h = setcontentinsetsabsolute.b(this.J[i4]);
        }
        int i5 = this.a;
        if (i5 >= 0 && i5 < 4) {
            setTitleMargin settitlemargin = this.J[this.a];
            if (!this.d) {
                e();
            }
            if (this.d) {
                this.d = false;
                int i6 = this.a;
                if (i6 == 0 || i6 == 1) {
                    setcontentinsetsabsolute.d(this.F.h, this.at);
                    setcontentinsetsabsolute.d(this.am.h, this.at);
                } else if (i6 == 2 || i6 == 3) {
                    setcontentinsetsabsolute.d(this.al.h, this.as);
                    setcontentinsetsabsolute.d(this.f281o.h, this.as);
                }
            } else {
                for (int i7 = 0; i7 < this.aP; i7++) {
                    setTitleMarginEnd settitlemarginend = this.aO[i7];
                    if ((this.e || settitlemarginend.a()) && ((((i2 = this.a) == 0 || i2 == 1) && settitlemarginend.M[0] == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend.F.f != null && settitlemarginend.am.f != null) || (((i3 = this.a) == 2 || i3 == 3) && settitlemarginend.M[1] == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend.al.f != null && settitlemarginend.f281o.f != null))) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                boolean z3 = this.F.b() || this.am.b();
                boolean z4 = this.al.b() || this.f281o.b();
                int i8 = !(!z2 && (((i = this.a) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
                for (int i9 = 0; i9 < this.aP; i9++) {
                    setTitleMarginEnd settitlemarginend2 = this.aO[i9];
                    if (this.e || settitlemarginend2.a()) {
                        setLogoDescription b = setcontentinsetsabsolute.b(settitlemarginend2.J[this.a]);
                        settitlemarginend2.J[this.a].h = b;
                        int i10 = (settitlemarginend2.J[this.a].f == null || settitlemarginend2.J[this.a].f.i != this) ? 0 : settitlemarginend2.J[this.a].c;
                        int i11 = this.a;
                        if (i11 == 0 || i11 == 2) {
                            setLogoDescription setlogodescription = settitlemargin.h;
                            int i12 = this.c;
                            setContentInsetStartWithNavigation b2 = setcontentinsetsabsolute.b();
                            setLogoDescription e = setcontentinsetsabsolute.e();
                            e.l = 0;
                            b2.e(setlogodescription, b, e, i12 - i10);
                            setcontentinsetsabsolute.d(b2);
                        } else {
                            setLogoDescription setlogodescription2 = settitlemargin.h;
                            int i13 = this.c;
                            setContentInsetStartWithNavigation b3 = setcontentinsetsabsolute.b();
                            setLogoDescription e2 = setcontentinsetsabsolute.e();
                            e2.l = 0;
                            b3.b(setlogodescription2, b, e2, i13 + i10);
                            setcontentinsetsabsolute.d(b3);
                        }
                        setcontentinsetsabsolute.e(settitlemargin.h, b, this.c + i10, i8);
                    }
                }
                int i14 = this.a;
                if (i14 == 0) {
                    setcontentinsetsabsolute.e(this.am.h, this.F.h, 0, 8);
                    setcontentinsetsabsolute.e(this.F.h, this.ac.am.h, 0, 4);
                    setcontentinsetsabsolute.e(this.F.h, this.ac.F.h, 0, 0);
                } else if (i14 == 1) {
                    setcontentinsetsabsolute.e(this.F.h, this.am.h, 0, 8);
                    setcontentinsetsabsolute.e(this.F.h, this.ac.F.h, 0, 4);
                    setcontentinsetsabsolute.e(this.F.h, this.ac.am.h, 0, 0);
                } else if (i14 == 2) {
                    setcontentinsetsabsolute.e(this.f281o.h, this.al.h, 0, 8);
                    setcontentinsetsabsolute.e(this.al.h, this.ac.f281o.h, 0, 4);
                    setcontentinsetsabsolute.e(this.al.h, this.ac.al.h, 0, 0);
                } else if (i14 == 3) {
                    setcontentinsetsabsolute.e(this.al.h, this.f281o.h, 0, 8);
                    setcontentinsetsabsolute.e(this.al.h, this.ac.al.h, 0, 4);
                    setcontentinsetsabsolute.e(this.al.h, this.ac.f281o.h, 0, 0);
                }
            }
        }
    }

    @Override // o.setTitleMarginEnd
    public final boolean b() {
        return this.d;
    }

    @Override // o.setTitleMarginEnd
    public final boolean c() {
        return this.d;
    }

    public final void d() {
        for (int i = 0; i < this.aP; i++) {
            setTitleMarginEnd settitlemarginend = this.aO[i];
            int i2 = this.a;
            if (i2 == 0 || i2 == 1) {
                settitlemarginend.d(0, true);
            } else if (i2 == 2 || i2 == 3) {
                settitlemarginend.d(1, true);
            }
        }
    }

    public final boolean e() {
        boolean z = true;
        for (int i = 0; i < this.aP; i++) {
            setTitleMarginEnd settitlemarginend = this.aO[i];
            if (this.e || settitlemarginend.a()) {
                int i2 = this.a;
                if (!(i2 == 0 || i2 == 1) || settitlemarginend.b()) {
                    int i3 = this.a;
                    if (i3 != 2) {
                        z = z;
                        if (i3 != 3) {
                        }
                    }
                    if (settitlemarginend.c()) {
                        z = z;
                    }
                }
                z = false;
            } else {
                z = z;
            }
        }
        if (!z || this.aP <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.aP; i5++) {
            setTitleMarginEnd settitlemarginend2 = this.aO[i5];
            if (!this.e) {
                i4 = i4;
                z2 = z2;
                if (!settitlemarginend2.a()) {
                }
            }
            int i6 = i4;
            boolean z3 = z2;
            if (!z2) {
                int i7 = this.a;
                if (i7 == 0) {
                    setTitleMargin b = settitlemarginend2.b(setTitleMargin.write.LEFT);
                    if (b.a) {
                        i6 = b.d;
                        z3 = true;
                    }
                    i6 = 0;
                    z3 = true;
                } else if (i7 == 1) {
                    setTitleMargin b2 = settitlemarginend2.b(setTitleMargin.write.RIGHT);
                    if (b2.a) {
                        i6 = b2.d;
                        z3 = true;
                    }
                    i6 = 0;
                    z3 = true;
                } else if (i7 == 2) {
                    setTitleMargin b3 = settitlemarginend2.b(setTitleMargin.write.TOP);
                    if (b3.a) {
                        i6 = b3.d;
                        z3 = true;
                    }
                    i6 = 0;
                    z3 = true;
                } else {
                    i6 = i4;
                    if (i7 == 3) {
                        setTitleMargin b4 = settitlemarginend2.b(setTitleMargin.write.BOTTOM);
                        if (b4.a) {
                            i6 = b4.d;
                        }
                        i6 = 0;
                    }
                    z3 = true;
                }
            }
            int i8 = this.a;
            if (i8 == 0) {
                setTitleMargin b5 = settitlemarginend2.b(setTitleMargin.write.LEFT);
                i4 = Math.min(i6, !b5.a ? 0 : b5.d);
                z2 = z3;
            } else if (i8 == 1) {
                setTitleMargin b6 = settitlemarginend2.b(setTitleMargin.write.RIGHT);
                i4 = Math.max(i6, !b6.a ? 0 : b6.d);
                z2 = z3;
            } else if (i8 == 2) {
                setTitleMargin b7 = settitlemarginend2.b(setTitleMargin.write.TOP);
                i4 = Math.min(i6, !b7.a ? 0 : b7.d);
                z2 = z3;
            } else {
                i4 = i6;
                z2 = z3;
                if (i8 == 3) {
                    setTitleMargin b8 = settitlemarginend2.b(setTitleMargin.write.BOTTOM);
                    i4 = Math.max(i6, !b8.a ? 0 : b8.d);
                    z2 = z3;
                }
            }
        }
        int i9 = i4 + this.c;
        int i10 = this.a;
        if (i10 == 0 || i10 == 1) {
            c(i9, i9);
        } else {
            b(i9, i9);
        }
        this.d = true;
        return true;
    }

    @Override // o.setTitleMarginEnd
    public final String toString() {
        StringBuilder sb = new StringBuilder("[Barrier] ");
        sb.append(i());
        sb.append(" {");
        String obj = sb.toString();
        for (int i = 0; i < this.aP; i++) {
            setTitleMarginEnd settitlemarginend = this.aO[i];
            String str = obj;
            if (i > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(", ");
                str = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(settitlemarginend.i());
            obj = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj);
        sb4.append("}");
        return sb4.toString();
    }
}
