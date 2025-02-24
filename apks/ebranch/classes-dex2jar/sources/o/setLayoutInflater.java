package o;

import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/setLayoutInflater.class */
public final class setLayoutInflater extends setCardElevation {
    setTitleMarginEnd[] e;
    int aF = -1;
    int aN = -1;
    int a = -1;
    int az = -1;
    int aI = -1;
    int aJ = -1;
    float aE = 0.5f;
    float aH = 0.5f;
    float c = 0.5f;
    float aA = 0.5f;
    float aG = 0.5f;
    float aL = 0.5f;
    int aD = 0;
    int aM = 0;
    int aC = 2;
    int aK = 2;
    private int aZ = 0;
    private int aX = -1;
    private int ba = 0;
    private ArrayList<IconCompatParcelizer> aW = new ArrayList<>();
    private setTitleMarginEnd[] aT = null;
    private setTitleMarginEnd[] aR = null;
    private int[] aU = null;
    int d = 0;

    /* loaded from: classes-dex2jar.jar:o/setLayoutInflater$IconCompatParcelizer.class */
    final class IconCompatParcelizer {
        private setTitleMargin a;
        final /* synthetic */ setLayoutInflater b;
        private setTitleMarginEnd c;
        private setTitleMargin d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private setTitleMargin m;

        /* renamed from: o  reason: collision with root package name */
        private setTitleMargin f239o;

        public final void e(boolean z, int i, boolean z2) {
            float f;
            int i2;
            setTitleMarginEnd settitlemarginend;
            float f2;
            int i3;
            int i4 = this.e;
            int i5 = 0;
            while (i5 < i4 && this.k + i5 < this.b.d) {
                setTitleMarginEnd settitlemarginend2 = this.b.e[this.k + i5];
                if (settitlemarginend2 != null) {
                    settitlemarginend2.D();
                }
                i5++;
            }
            if (!(i4 == 0 || this.c == null)) {
                boolean z3 = z2 && i == 0;
                int i6 = -1;
                int i7 = -1;
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = z ? (i4 - 1) - i8 : i8;
                    if (this.k + i9 >= this.b.d) {
                        break;
                    }
                    i6 = i6;
                    i7 = i7;
                    if (this.b.e[this.k + i9].ap == 0) {
                        i6 = i6;
                        if (i6 == -1) {
                            i6 = i8;
                        }
                        i7 = i8;
                    }
                }
                setTitleMarginEnd settitlemarginend3 = null;
                setTitleMarginEnd settitlemarginend4 = null;
                if (this.g == 0) {
                    setTitleMarginEnd settitlemarginend5 = this.c;
                    settitlemarginend5.aj = this.b.aN;
                    int i10 = this.f;
                    int i11 = i10;
                    if (i > 0) {
                        i11 = i10 + this.b.aM;
                    }
                    settitlemarginend5.al.a(this.f239o, i11, -1, false);
                    if (z2) {
                        settitlemarginend5.f281o.a(this.d, this.j, -1, false);
                    }
                    if (i > 0) {
                        this.f239o.i.f281o.a(settitlemarginend5.al, 0, -1, false);
                    }
                    if (this.b.aK == 3 && !settitlemarginend5.f) {
                        for (int i12 = 0; i12 < i4; i12++) {
                            int i13 = z ? (i4 - 1) - i12 : i12;
                            if (this.k + i13 >= this.b.d) {
                                break;
                            }
                            setTitleMarginEnd settitlemarginend6 = this.b.e[this.k + i13];
                            settitlemarginend = settitlemarginend6;
                            if (settitlemarginend6.f) {
                                break;
                            }
                        }
                    }
                    settitlemarginend = settitlemarginend5;
                    int i14 = 0;
                    while (i14 < i4) {
                        int i15 = z ? (i4 - 1) - i14 : i14;
                        if (this.k + i15 < this.b.d) {
                            setTitleMarginEnd settitlemarginend7 = this.b.e[this.k + i15];
                            if (i14 == 0) {
                                settitlemarginend7.e(settitlemarginend7.F, this.a, this.i);
                            }
                            if (i15 == 0) {
                                int i16 = this.b.aF;
                                float f3 = this.b.aE;
                                if (this.k != 0 || this.b.a == -1) {
                                    i3 = i16;
                                    f2 = f3;
                                    if (z2) {
                                        i3 = i16;
                                        f2 = f3;
                                        if (this.b.aI != -1) {
                                            i3 = this.b.aI;
                                            f2 = this.b.aG;
                                        }
                                    }
                                } else {
                                    i3 = this.b.a;
                                    f2 = this.b.c;
                                }
                                settitlemarginend7.B = i3;
                                settitlemarginend7.z = f2;
                            }
                            if (i14 == i4 - 1) {
                                settitlemarginend7.e(settitlemarginend7.am, this.m, this.h);
                            }
                            if (settitlemarginend4 != null) {
                                settitlemarginend7.F.a(settitlemarginend4.am, this.b.aD, -1, false);
                                if (i14 == i6) {
                                    setTitleMargin settitlemargin = settitlemarginend7.F;
                                    int i17 = this.i;
                                    if (settitlemargin.f != null) {
                                        settitlemargin.e = i17;
                                    }
                                }
                                settitlemarginend4.am.a(settitlemarginend7.F, 0, -1, false);
                                if (i14 == i7 + 1) {
                                    setTitleMargin settitlemargin2 = settitlemarginend4.am;
                                    int i18 = this.h;
                                    if (settitlemargin2.f != null) {
                                        settitlemargin2.e = i18;
                                    }
                                }
                            }
                            if (settitlemarginend7 != settitlemarginend5) {
                                if (this.b.aK != 3 || !settitlemarginend.f || settitlemarginend7 == settitlemarginend || !settitlemarginend7.f) {
                                    int i19 = this.b.aK;
                                    if (i19 == 0) {
                                        settitlemarginend7.al.a(settitlemarginend5.al, 0, -1, false);
                                    } else if (i19 == 1) {
                                        settitlemarginend7.f281o.a(settitlemarginend5.f281o, 0, -1, false);
                                    } else if (z3) {
                                        settitlemarginend7.al.a(this.f239o, this.f, -1, false);
                                        settitlemarginend7.f281o.a(this.d, this.j, -1, false);
                                    } else {
                                        settitlemarginend7.al.a(settitlemarginend5.al, 0, -1, false);
                                        settitlemarginend7.f281o.a(settitlemarginend5.f281o, 0, -1, false);
                                    }
                                } else {
                                    settitlemarginend7.m.a(settitlemarginend.m, 0, -1, false);
                                }
                            }
                            i14++;
                            settitlemarginend4 = settitlemarginend7;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                setTitleMarginEnd settitlemarginend8 = this.c;
                settitlemarginend8.B = this.b.aF;
                int i20 = this.i;
                int i21 = i20;
                if (i > 0) {
                    i21 = i20 + this.b.aD;
                }
                if (z) {
                    settitlemarginend8.am.a(this.m, i21, -1, false);
                    if (z2) {
                        settitlemarginend8.F.a(this.a, this.h, -1, false);
                    }
                    if (i > 0) {
                        this.m.i.F.a(settitlemarginend8.am, 0, -1, false);
                    }
                } else {
                    settitlemarginend8.F.a(this.a, i21, -1, false);
                    if (z2) {
                        settitlemarginend8.am.a(this.m, this.h, -1, false);
                    }
                    if (i > 0) {
                        this.a.i.am.a(settitlemarginend8.F, 0, -1, false);
                    }
                }
                int i22 = 0;
                while (i22 < i4 && this.k + i22 < this.b.d) {
                    setTitleMarginEnd settitlemarginend9 = this.b.e[this.k + i22];
                    if (i22 == 0) {
                        settitlemarginend9.e(settitlemarginend9.al, this.f239o, this.f);
                        int i23 = this.b.aN;
                        float f4 = this.b.aH;
                        if (this.k != 0 || this.b.az == -1) {
                            i2 = i23;
                            f = f4;
                            if (z2) {
                                i2 = i23;
                                f = f4;
                                if (this.b.aJ != -1) {
                                    i2 = this.b.aJ;
                                    f = this.b.aL;
                                }
                            }
                        } else {
                            i2 = this.b.az;
                            f = this.b.aA;
                        }
                        settitlemarginend9.aj = i2;
                        settitlemarginend9.ak = f;
                    }
                    if (i22 == i4 - 1) {
                        settitlemarginend9.e(settitlemarginend9.f281o, this.d, this.j);
                    }
                    if (settitlemarginend3 != null) {
                        settitlemarginend9.al.a(settitlemarginend3.f281o, this.b.aM, -1, false);
                        if (i22 == i6) {
                            setTitleMargin settitlemargin3 = settitlemarginend9.al;
                            int i24 = this.f;
                            if (settitlemargin3.f != null) {
                                settitlemargin3.e = i24;
                            }
                        }
                        settitlemarginend3.f281o.a(settitlemarginend9.al, 0, -1, false);
                        if (i22 == i7 + 1) {
                            setTitleMargin settitlemargin4 = settitlemarginend3.f281o;
                            int i25 = this.j;
                            if (settitlemargin4.f != null) {
                                settitlemargin4.e = i25;
                            }
                        }
                    }
                    if (settitlemarginend9 != settitlemarginend8) {
                        if (z) {
                            int i26 = this.b.aC;
                            if (i26 == 0) {
                                settitlemarginend9.am.a(settitlemarginend8.am, 0, -1, false);
                            } else if (i26 == 1) {
                                settitlemarginend9.F.a(settitlemarginend8.F, 0, -1, false);
                            } else if (i26 == 2) {
                                settitlemarginend9.F.a(settitlemarginend8.F, 0, -1, false);
                                settitlemarginend9.am.a(settitlemarginend8.am, 0, -1, false);
                            }
                        } else {
                            int i27 = this.b.aC;
                            if (i27 == 0) {
                                settitlemarginend9.F.a(settitlemarginend8.F, 0, -1, false);
                            } else if (i27 == 1) {
                                settitlemarginend9.am.a(settitlemarginend8.am, 0, -1, false);
                            } else if (i27 == 2) {
                                if (z3) {
                                    settitlemarginend9.F.a(this.a, this.i, -1, false);
                                    settitlemarginend9.am.a(this.m, this.h, -1, false);
                                } else {
                                    settitlemarginend9.F.a(settitlemarginend8.F, 0, -1, false);
                                    settitlemarginend9.am.a(settitlemarginend8.am, 0, -1, false);
                                }
                            }
                        }
                    }
                    i22++;
                    settitlemarginend3 = settitlemarginend9;
                }
            }
        }
    }

    @Override // o.setTitleMarginEnd
    public final void b(setContentInsetsAbsolute setcontentinsetsabsolute, boolean z) {
        setTitleMarginEnd settitlemarginend;
        b(setcontentinsetsabsolute, z);
        boolean z2 = this.ac != null ? ((setTitleMarginBottom) this.ac).aD : false;
        int i = this.aZ;
        if (i != 0) {
            if (i == 1) {
                int size = this.aW.size();
                int i2 = 0;
                while (i2 < size) {
                    this.aW.get(i2).e(z2, i2, i2 == size - 1);
                    i2++;
                }
            } else if (!(i != 2 || this.aU == null || this.aR == null || this.aT == null)) {
                for (int i3 = 0; i3 < this.d; i3++) {
                    this.e[i3].D();
                }
                int[] iArr = this.aU;
                int i4 = iArr[0];
                int i5 = iArr[1];
                setTitleMarginEnd settitlemarginend2 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    setTitleMarginEnd settitlemarginend3 = this.aR[z2 ? (i4 - i6) - 1 : i6];
                    settitlemarginend2 = settitlemarginend2;
                    if (settitlemarginend3 != null) {
                        if (settitlemarginend3.s() == 8) {
                            settitlemarginend2 = settitlemarginend2;
                        } else {
                            if (i6 == 0) {
                                settitlemarginend3.e(settitlemarginend3.F, this.F, d());
                                settitlemarginend3.B = this.aF;
                                settitlemarginend3.z = this.aE;
                            }
                            if (i6 == i4 - 1) {
                                settitlemarginend3.e(settitlemarginend3.am, this.am, z());
                            }
                            if (i6 > 0) {
                                settitlemarginend3.e(settitlemarginend3.F, settitlemarginend2.am, this.aD);
                                settitlemarginend2.e(settitlemarginend2.am, settitlemarginend3.F, 0);
                            }
                            settitlemarginend2 = settitlemarginend3;
                        }
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    setTitleMarginEnd settitlemarginend4 = this.aT[i7];
                    settitlemarginend2 = settitlemarginend2;
                    if (settitlemarginend4 != null) {
                        if (settitlemarginend4.s() == 8) {
                            settitlemarginend2 = settitlemarginend2;
                        } else {
                            if (i7 == 0) {
                                settitlemarginend4.e(settitlemarginend4.al, this.al, B());
                                settitlemarginend4.aj = this.aN;
                                settitlemarginend4.ak = this.aH;
                            }
                            if (i7 == i5 - 1) {
                                settitlemarginend4.e(settitlemarginend4.f281o, this.f281o, e());
                            }
                            if (i7 > 0) {
                                settitlemarginend4.e(settitlemarginend4.al, settitlemarginend2.f281o, this.aM);
                                settitlemarginend2.e(settitlemarginend2.f281o, settitlemarginend4.al, 0);
                            }
                            settitlemarginend2 = settitlemarginend4;
                        }
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.ba == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        setTitleMarginEnd[] settitlemarginendArr = this.e;
                        if (!(i10 >= settitlemarginendArr.length || (settitlemarginend = settitlemarginendArr[i10]) == null || settitlemarginend.s() == 8)) {
                            setTitleMarginEnd settitlemarginend5 = this.aR[i8];
                            setTitleMarginEnd settitlemarginend6 = this.aT[i9];
                            if (settitlemarginend != settitlemarginend5) {
                                settitlemarginend.e(settitlemarginend.F, settitlemarginend5.F, 0);
                                settitlemarginend.e(settitlemarginend.am, settitlemarginend5.am, 0);
                            }
                            if (settitlemarginend != settitlemarginend6) {
                                settitlemarginend.e(settitlemarginend.al, settitlemarginend6.al, 0);
                                settitlemarginend.e(settitlemarginend.f281o, settitlemarginend6.f281o, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.aW.size() > 0) {
            this.aW.get(0).e(z2, 0, true);
        }
        c(false);
    }
}
