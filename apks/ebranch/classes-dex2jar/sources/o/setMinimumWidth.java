package o;

import java.util.ArrayList;
import java.util.Iterator;
import o.setOnInflateListener;
import o.setTitleMargin;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setMinimumWidth.class */
public final class setMinimumWidth {
    private static setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver e = new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver();

    private static void b(setOnInflateListener.IconCompatParcelizer iconCompatParcelizer, setTitleMarginEnd settitlemarginend, boolean z) {
        float f = settitlemarginend.z;
        setTitleMargin settitlemargin = settitlemarginend.F.f;
        int i = 0;
        int i2 = !settitlemargin.a ? 0 : settitlemargin.d;
        setTitleMargin settitlemargin2 = settitlemarginend.am.f;
        int i3 = !settitlemargin2.a ? 0 : settitlemargin2.d;
        int d = settitlemarginend.F.d();
        int d2 = settitlemarginend.am.d();
        if (i2 == i3) {
            f = 0.5f;
        } else {
            i2 += d;
            i3 -= d2;
        }
        if (settitlemarginend.ap != 8) {
            i = settitlemarginend.aw;
        }
        int i4 = (i3 - i2) - i;
        if (i2 > i3) {
            i4 = (i2 - i3) - i;
        }
        int i5 = ((int) ((f * ((float) i4)) + 0.5f)) + i2;
        int i6 = i5 + i;
        if (i2 > i3) {
            i6 = i5 - i;
        }
        settitlemarginend.c(i5, i6);
        b(settitlemarginend, iconCompatParcelizer, z);
    }

    private static void b(setTitleMarginEnd settitlemarginend, setOnInflateListener.IconCompatParcelizer iconCompatParcelizer, setTitleMarginEnd settitlemarginend2) {
        int i;
        float f = settitlemarginend2.ak;
        setTitleMargin settitlemargin = settitlemarginend2.al.f;
        int d = (!settitlemargin.a ? 0 : settitlemargin.d) + settitlemarginend2.al.d();
        setTitleMargin settitlemargin2 = settitlemarginend2.f281o.f;
        int d2 = (!settitlemargin2.a ? 0 : settitlemargin2.d) - settitlemarginend2.f281o.d();
        if (d2 >= d) {
            int i2 = settitlemarginend2.ap == 8 ? 0 : settitlemarginend2.v;
            int i3 = i2;
            if (settitlemarginend2.ap != 8) {
                if (settitlemarginend2.L == 2) {
                    if (settitlemarginend instanceof setTitleMarginBottom) {
                        i = settitlemarginend.ap == 8 ? 0 : settitlemarginend.v;
                    } else {
                        setTitleMarginEnd settitlemarginend3 = settitlemarginend.ac;
                        i = settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.v;
                    }
                    i2 = (int) (f * 0.5f * ((float) i));
                } else if (settitlemarginend2.L == 0) {
                    i2 = d2 - d;
                }
                int max = Math.max(settitlemarginend2.O, i2);
                i3 = max;
                if (settitlemarginend2.R > 0) {
                    i3 = Math.min(settitlemarginend2.R, max);
                }
            }
            int i4 = d + ((int) ((f * ((float) ((d2 - d) - i3))) + 0.5f));
            settitlemarginend2.b(i4, i3 + i4);
            e(settitlemarginend2, iconCompatParcelizer);
        }
    }

    private static void b(setTitleMarginEnd settitlemarginend, setOnInflateListener.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        if (!(settitlemarginend instanceof setTitleMarginBottom)) {
            if ((settitlemarginend.V && settitlemarginend.ap != 8) && e(settitlemarginend)) {
                setTitleMarginBottom.c(settitlemarginend, iconCompatParcelizer, new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver(), setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
            }
        }
        setTitleMargin b = settitlemarginend.b(setTitleMargin.write.LEFT);
        setTitleMargin b2 = settitlemarginend.b(setTitleMargin.write.RIGHT);
        int i = !b.a ? 0 : b.d;
        int i2 = !b2.a ? 0 : b2.d;
        if (b.b != null && b.a) {
            Iterator<setTitleMargin> it = b.b.iterator();
            while (it.hasNext()) {
                setTitleMargin next = it.next();
                setTitleMarginEnd settitlemarginend2 = next.i;
                boolean e2 = e(settitlemarginend2);
                if ((settitlemarginend2.V && settitlemarginend2.ap != 8) && e2) {
                    setTitleMarginBottom.c(settitlemarginend2, iconCompatParcelizer, new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver(), setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
                }
                if (settitlemarginend2.M[0] != setTitleMarginEnd.write.MATCH_CONSTRAINT || e2) {
                    if (!(settitlemarginend2.V && settitlemarginend2.ap != 8)) {
                        if (next == settitlemarginend2.F && settitlemarginend2.am.f == null) {
                            int d = settitlemarginend2.F.d() + i;
                            settitlemarginend2.c(d, (settitlemarginend2.ap == 8 ? 0 : settitlemarginend2.aw) + d);
                            b(settitlemarginend2, iconCompatParcelizer, z);
                        } else if (next == settitlemarginend2.am && settitlemarginend2.F.f == null) {
                            int d2 = i - settitlemarginend2.am.d();
                            settitlemarginend2.c(d2 - (settitlemarginend2.ap == 8 ? 0 : settitlemarginend2.aw), d2);
                            b(settitlemarginend2, iconCompatParcelizer, z);
                        } else if (next == settitlemarginend2.F && settitlemarginend2.am.f != null && settitlemarginend2.am.f.a && !settitlemarginend2.w()) {
                            b(iconCompatParcelizer, settitlemarginend2, z);
                        }
                    }
                } else if (settitlemarginend2.M[0] == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend2.Q >= 0 && settitlemarginend2.S >= 0 && (settitlemarginend2.ap == 8 || (settitlemarginend2.N == 0 && settitlemarginend2.x == 0.0f))) {
                    if (!settitlemarginend2.w() && !settitlemarginend2.I) {
                        if (((next == settitlemarginend2.F && settitlemarginend2.am.f != null && settitlemarginend2.am.f.a) || (next == settitlemarginend2.am && settitlemarginend2.F.f != null && settitlemarginend2.F.f.a)) && !settitlemarginend2.w()) {
                            d(settitlemarginend, iconCompatParcelizer, settitlemarginend2, z);
                        }
                    }
                }
            }
        }
        if (!(settitlemarginend instanceof setInflatedId) && b2.b != null && b2.a) {
            Iterator<setTitleMargin> it2 = b2.b.iterator();
            while (it2.hasNext()) {
                setTitleMargin next2 = it2.next();
                setTitleMarginEnd settitlemarginend3 = next2.i;
                boolean e3 = e(settitlemarginend3);
                if ((settitlemarginend3.V && settitlemarginend3.ap != 8) && e3) {
                    setTitleMarginBottom.c(settitlemarginend3, iconCompatParcelizer, new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver(), setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
                }
                boolean z2 = (next2 == settitlemarginend3.F && settitlemarginend3.am.f != null && settitlemarginend3.am.f.a) || (next2 == settitlemarginend3.am && settitlemarginend3.F.f != null && settitlemarginend3.F.f.a);
                if (settitlemarginend3.M[0] != setTitleMarginEnd.write.MATCH_CONSTRAINT || e3) {
                    if (!(settitlemarginend3.V && settitlemarginend3.ap != 8)) {
                        if (next2 == settitlemarginend3.F && settitlemarginend3.am.f == null) {
                            int d3 = settitlemarginend3.F.d() + i2;
                            settitlemarginend3.c(d3, (settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.aw) + d3);
                            b(settitlemarginend3, iconCompatParcelizer, z);
                        } else if (next2 == settitlemarginend3.am && settitlemarginend3.F.f == null) {
                            int d4 = i2 - settitlemarginend3.am.d();
                            settitlemarginend3.c(d4 - (settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.aw), d4);
                            b(settitlemarginend3, iconCompatParcelizer, z);
                        } else if (z2 && !settitlemarginend3.w()) {
                            b(iconCompatParcelizer, settitlemarginend3, z);
                        }
                    }
                } else if (settitlemarginend3.M[0] == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend3.Q >= 0 && settitlemarginend3.S >= 0 && (settitlemarginend3.ap == 8 || (settitlemarginend3.N == 0 && settitlemarginend3.x == 0.0f))) {
                    if (!settitlemarginend3.w() && !settitlemarginend3.I && z2 && !settitlemarginend3.w()) {
                        d(settitlemarginend, iconCompatParcelizer, settitlemarginend3, z);
                    }
                }
            }
        }
    }

    private static void c(setOnInflateListener.IconCompatParcelizer iconCompatParcelizer, setTitleMarginEnd settitlemarginend) {
        float f = settitlemarginend.ak;
        setTitleMargin settitlemargin = settitlemarginend.al.f;
        int i = 0;
        int i2 = !settitlemargin.a ? 0 : settitlemargin.d;
        setTitleMargin settitlemargin2 = settitlemarginend.f281o.f;
        int i3 = !settitlemargin2.a ? 0 : settitlemargin2.d;
        int d = settitlemarginend.al.d();
        int d2 = settitlemarginend.f281o.d();
        if (i2 == i3) {
            f = 0.5f;
        } else {
            i2 += d;
            i3 -= d2;
        }
        if (settitlemarginend.ap != 8) {
            i = settitlemarginend.v;
        }
        int i4 = (i3 - i2) - i;
        if (i2 > i3) {
            i4 = (i2 - i3) - i;
        }
        int i5 = (int) ((f * ((float) i4)) + 0.5f);
        int i6 = i2 + i5;
        int i7 = i6 + i;
        if (i2 > i3) {
            i6 = i2 - i5;
            i7 = i6 - i;
        }
        settitlemarginend.b(i6, i7);
        e(settitlemarginend, iconCompatParcelizer);
    }

    private static void d(setTitleMarginEnd settitlemarginend, setOnInflateListener.IconCompatParcelizer iconCompatParcelizer, setTitleMarginEnd settitlemarginend2, boolean z) {
        int i;
        float f = settitlemarginend2.z;
        setTitleMargin settitlemargin = settitlemarginend2.F.f;
        int d = (!settitlemargin.a ? 0 : settitlemargin.d) + settitlemarginend2.F.d();
        setTitleMargin settitlemargin2 = settitlemarginend2.am.f;
        int d2 = (!settitlemargin2.a ? 0 : settitlemargin2.d) - settitlemarginend2.am.d();
        if (d2 >= d) {
            int i2 = settitlemarginend2.ap == 8 ? 0 : settitlemarginend2.aw;
            int i3 = i2;
            if (settitlemarginend2.ap != 8) {
                if (settitlemarginend2.N == 2) {
                    if (settitlemarginend instanceof setTitleMarginBottom) {
                        i = settitlemarginend.ap == 8 ? 0 : settitlemarginend.aw;
                    } else {
                        setTitleMarginEnd settitlemarginend3 = settitlemarginend.ac;
                        i = settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.aw;
                    }
                    i2 = (int) (settitlemarginend2.z * 0.5f * ((float) i));
                } else if (settitlemarginend2.N == 0) {
                    i2 = d2 - d;
                }
                int max = Math.max(settitlemarginend2.S, i2);
                i3 = max;
                if (settitlemarginend2.Q > 0) {
                    i3 = Math.min(settitlemarginend2.Q, max);
                }
            }
            int i4 = d + ((int) ((f * ((float) ((d2 - d) - i3))) + 0.5f));
            settitlemarginend2.c(i4, i3 + i4);
            b(settitlemarginend2, iconCompatParcelizer, z);
        }
    }

    public static void e(setTitleMarginBottom settitlemarginbottom, setOnInflateListener.IconCompatParcelizer iconCompatParcelizer) {
        setTitleMarginEnd.write write = settitlemarginbottom.M[0];
        setTitleMarginEnd.write write2 = settitlemarginbottom.M[1];
        settitlemarginbottom.A();
        ArrayList<setTitleMarginEnd> arrayList = settitlemarginbottom.aY;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).A();
        }
        boolean z = settitlemarginbottom.aD;
        if (write == setTitleMarginEnd.write.FIXED) {
            settitlemarginbottom.c(0, settitlemarginbottom.ap == 8 ? 0 : settitlemarginbottom.aw);
        } else {
            settitlemarginbottom.h(0);
        }
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            char c = 65535;
            if (i2 >= size) {
                break;
            }
            setTitleMarginEnd settitlemarginend = arrayList.get(i2);
            if (settitlemarginend instanceof setInflatedId) {
                setInflatedId setinflatedid = (setInflatedId) settitlemarginend;
                z2 = z2;
                z3 = z3;
                if (setinflatedid.c == 1) {
                    if (setinflatedid.d() != -1) {
                        int d = setinflatedid.d();
                        setTitleMargin settitlemargin = setinflatedid.e;
                        settitlemargin.d = d;
                        settitlemargin.a = true;
                        setinflatedid.aA = true;
                    } else if (setinflatedid.e() != -1 && settitlemarginbottom.b()) {
                        int i3 = settitlemarginbottom.ap == 8 ? 0 : settitlemarginbottom.aw;
                        int e2 = setinflatedid.e();
                        setTitleMargin settitlemargin2 = setinflatedid.e;
                        settitlemargin2.d = i3 - e2;
                        settitlemargin2.a = true;
                        setinflatedid.aA = true;
                    } else if (settitlemarginbottom.b()) {
                        int B = (int) ((setinflatedid.B() * ((float) (settitlemarginbottom.ap == 8 ? 0 : settitlemarginbottom.aw))) + 0.5f);
                        setTitleMargin settitlemargin3 = setinflatedid.e;
                        settitlemargin3.d = B;
                        settitlemargin3.a = true;
                        setinflatedid.aA = true;
                    }
                    z2 = true;
                    z3 = z3;
                }
            } else {
                z2 = z2;
                z3 = z3;
                if (settitlemarginend instanceof setNavigationContentDescription) {
                    int i4 = ((setNavigationContentDescription) settitlemarginend).a;
                    if (i4 == 0 || i4 == 1) {
                        c = 0;
                    } else if (i4 == 2 || i4 == 3) {
                        c = 1;
                    }
                    z2 = z2;
                    z3 = z3;
                    if (c == 0) {
                        z3 = true;
                        z2 = z2;
                    }
                }
            }
            i2++;
        }
        if (z2) {
            for (int i5 = 0; i5 < size; i5++) {
                setTitleMarginEnd settitlemarginend2 = arrayList.get(i5);
                if (settitlemarginend2 instanceof setInflatedId) {
                    setInflatedId setinflatedid2 = (setInflatedId) settitlemarginend2;
                    if (setinflatedid2.c == 1) {
                        b(setinflatedid2, iconCompatParcelizer, z);
                    }
                }
            }
        }
        b(settitlemarginbottom, iconCompatParcelizer, z);
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                setTitleMarginEnd settitlemarginend3 = arrayList.get(i6);
                if (settitlemarginend3 instanceof setNavigationContentDescription) {
                    setNavigationContentDescription setnavigationcontentdescription = (setNavigationContentDescription) settitlemarginend3;
                    int i7 = setnavigationcontentdescription.a;
                    if (((i7 == 0 || i7 == 1) ? 0 : (i7 == 2 || i7 == 3) ? (char) 1 : 65535) == 0 && setnavigationcontentdescription.e()) {
                        b(setnavigationcontentdescription, iconCompatParcelizer, z);
                    }
                }
            }
        }
        if (write2 == setTitleMarginEnd.write.FIXED) {
            settitlemarginbottom.b(0, settitlemarginbottom.ap == 8 ? 0 : settitlemarginbottom.v);
        } else {
            settitlemarginbottom.j(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i8 = 0; i8 < size; i8++) {
            setTitleMarginEnd settitlemarginend4 = arrayList.get(i8);
            if (settitlemarginend4 instanceof setInflatedId) {
                setInflatedId setinflatedid3 = (setInflatedId) settitlemarginend4;
                z4 = z4;
                z5 = z5;
                if (setinflatedid3.c == 0) {
                    if (setinflatedid3.d() != -1) {
                        int d2 = setinflatedid3.d();
                        setTitleMargin settitlemargin4 = setinflatedid3.e;
                        settitlemargin4.d = d2;
                        settitlemargin4.a = true;
                        setinflatedid3.aA = true;
                    } else if (setinflatedid3.e() != -1 && settitlemarginbottom.c()) {
                        int i9 = settitlemarginbottom.ap == 8 ? 0 : settitlemarginbottom.v;
                        int e3 = setinflatedid3.e();
                        setTitleMargin settitlemargin5 = setinflatedid3.e;
                        settitlemargin5.d = i9 - e3;
                        settitlemargin5.a = true;
                        setinflatedid3.aA = true;
                    } else if (settitlemarginbottom.c()) {
                        int B2 = (int) ((setinflatedid3.B() * ((float) (settitlemarginbottom.ap == 8 ? 0 : settitlemarginbottom.v))) + 0.5f);
                        setTitleMargin settitlemargin6 = setinflatedid3.e;
                        settitlemargin6.d = B2;
                        settitlemargin6.a = true;
                        setinflatedid3.aA = true;
                    }
                    z4 = true;
                    z5 = z5;
                }
            } else {
                z4 = z4;
                z5 = z5;
                if (settitlemarginend4 instanceof setNavigationContentDescription) {
                    int i10 = ((setNavigationContentDescription) settitlemarginend4).a;
                    z4 = z4;
                    z5 = z5;
                    if (((i10 == 0 || i10 == 1) ? 0 : (i10 == 2 || i10 == 3) ? (char) 1 : 65535) == 1) {
                        z5 = true;
                        z4 = z4;
                    }
                }
            }
        }
        if (z4) {
            for (int i11 = 0; i11 < size; i11++) {
                setTitleMarginEnd settitlemarginend5 = arrayList.get(i11);
                if (settitlemarginend5 instanceof setInflatedId) {
                    setInflatedId setinflatedid4 = (setInflatedId) settitlemarginend5;
                    if (setinflatedid4.c == 0) {
                        e(setinflatedid4, iconCompatParcelizer);
                    }
                }
            }
        }
        e((setTitleMarginEnd) settitlemarginbottom, iconCompatParcelizer);
        if (z5) {
            for (int i12 = 0; i12 < size; i12++) {
                setTitleMarginEnd settitlemarginend6 = arrayList.get(i12);
                if (settitlemarginend6 instanceof setNavigationContentDescription) {
                    setNavigationContentDescription setnavigationcontentdescription2 = (setNavigationContentDescription) settitlemarginend6;
                    int i13 = setnavigationcontentdescription2.a;
                    if (((i13 == 0 || i13 == 1) ? 0 : (i13 == 2 || i13 == 3) ? (char) 1 : 65535) == 1 && setnavigationcontentdescription2.e()) {
                        e(setnavigationcontentdescription2, iconCompatParcelizer);
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            setTitleMarginEnd settitlemarginend7 = arrayList.get(i14);
            if ((settitlemarginend7.V && settitlemarginend7.ap != 8) && e(settitlemarginend7)) {
                setTitleMarginBottom.c(settitlemarginend7, iconCompatParcelizer, e, setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
                b(settitlemarginend7, iconCompatParcelizer, z);
                e(settitlemarginend7, iconCompatParcelizer);
            }
        }
    }

    private static void e(setTitleMarginEnd settitlemarginend, setOnInflateListener.IconCompatParcelizer iconCompatParcelizer) {
        if (!(settitlemarginend instanceof setTitleMarginBottom)) {
            if ((settitlemarginend.V && settitlemarginend.ap != 8) && e(settitlemarginend)) {
                setTitleMarginBottom.c(settitlemarginend, iconCompatParcelizer, new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver(), setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
            }
        }
        setTitleMargin b = settitlemarginend.b(setTitleMargin.write.TOP);
        setTitleMargin b2 = settitlemarginend.b(setTitleMargin.write.BOTTOM);
        int i = !b.a ? 0 : b.d;
        int i2 = !b2.a ? 0 : b2.d;
        if (b.b != null && b.a) {
            Iterator<setTitleMargin> it = b.b.iterator();
            while (it.hasNext()) {
                setTitleMargin next = it.next();
                setTitleMarginEnd settitlemarginend2 = next.i;
                boolean e2 = e(settitlemarginend2);
                if ((settitlemarginend2.V && settitlemarginend2.ap != 8) && e2) {
                    setTitleMarginBottom.c(settitlemarginend2, iconCompatParcelizer, new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver(), setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
                }
                if (settitlemarginend2.M[1] != setTitleMarginEnd.write.MATCH_CONSTRAINT || e2) {
                    if (!(settitlemarginend2.V && settitlemarginend2.ap != 8)) {
                        if (next == settitlemarginend2.al && settitlemarginend2.f281o.f == null) {
                            int d = settitlemarginend2.al.d() + i;
                            settitlemarginend2.b(d, (settitlemarginend2.ap == 8 ? 0 : settitlemarginend2.v) + d);
                            e(settitlemarginend2, iconCompatParcelizer);
                        } else if (next == settitlemarginend2.f281o && settitlemarginend2.f281o.f == null) {
                            int d2 = i - settitlemarginend2.f281o.d();
                            settitlemarginend2.b(d2 - (settitlemarginend2.ap == 8 ? 0 : settitlemarginend2.v), d2);
                            e(settitlemarginend2, iconCompatParcelizer);
                        } else if (next == settitlemarginend2.al && settitlemarginend2.f281o.f != null && settitlemarginend2.f281o.f.a) {
                            c(iconCompatParcelizer, settitlemarginend2);
                        }
                    }
                } else if (settitlemarginend2.M[1] == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend2.R >= 0 && settitlemarginend2.O >= 0 && (settitlemarginend2.ap == 8 || (settitlemarginend2.L == 0 && settitlemarginend2.x == 0.0f))) {
                    if (!settitlemarginend2.v() && !settitlemarginend2.I) {
                        if (((next == settitlemarginend2.al && settitlemarginend2.f281o.f != null && settitlemarginend2.f281o.f.a) || (next == settitlemarginend2.f281o && settitlemarginend2.al.f != null && settitlemarginend2.al.f.a)) && !settitlemarginend2.v()) {
                            b(settitlemarginend, iconCompatParcelizer, settitlemarginend2);
                        }
                    }
                }
            }
        }
        if (!(settitlemarginend instanceof setInflatedId)) {
            if (b2.b != null && b2.a) {
                Iterator<setTitleMargin> it2 = b2.b.iterator();
                while (it2.hasNext()) {
                    setTitleMargin next2 = it2.next();
                    setTitleMarginEnd settitlemarginend3 = next2.i;
                    boolean e3 = e(settitlemarginend3);
                    if ((settitlemarginend3.V && settitlemarginend3.ap != 8) && e3) {
                        setTitleMarginBottom.c(settitlemarginend3, iconCompatParcelizer, new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver(), setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
                    }
                    boolean z = (next2 == settitlemarginend3.al && settitlemarginend3.f281o.f != null && settitlemarginend3.f281o.f.a) || (next2 == settitlemarginend3.f281o && settitlemarginend3.al.f != null && settitlemarginend3.al.f.a);
                    if (settitlemarginend3.M[1] != setTitleMarginEnd.write.MATCH_CONSTRAINT || e3) {
                        if (!(settitlemarginend3.V && settitlemarginend3.ap != 8)) {
                            if (next2 == settitlemarginend3.al && settitlemarginend3.f281o.f == null) {
                                int d3 = settitlemarginend3.al.d() + i2;
                                settitlemarginend3.b(d3, (settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.v) + d3);
                                e(settitlemarginend3, iconCompatParcelizer);
                            } else if (next2 == settitlemarginend3.f281o && settitlemarginend3.al.f == null) {
                                int d4 = i2 - settitlemarginend3.f281o.d();
                                settitlemarginend3.b(d4 - (settitlemarginend3.ap == 8 ? 0 : settitlemarginend3.v), d4);
                                e(settitlemarginend3, iconCompatParcelizer);
                            } else if (z && !settitlemarginend3.v()) {
                                c(iconCompatParcelizer, settitlemarginend3);
                            }
                        }
                    } else if (settitlemarginend3.M[1] == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend3.R >= 0 && settitlemarginend3.O >= 0 && (settitlemarginend3.ap == 8 || (settitlemarginend3.L == 0 && settitlemarginend3.x == 0.0f))) {
                        if (!settitlemarginend3.v() && !settitlemarginend3.I && z && !settitlemarginend3.v()) {
                            b(settitlemarginend, iconCompatParcelizer, settitlemarginend3);
                        }
                    }
                }
            }
            setTitleMargin b3 = settitlemarginend.b(setTitleMargin.write.BASELINE);
            if (b3.b != null && b3.a) {
                int i3 = !b3.a ? 0 : b3.d;
                Iterator<setTitleMargin> it3 = b3.b.iterator();
                while (it3.hasNext()) {
                    setTitleMargin next3 = it3.next();
                    setTitleMarginEnd settitlemarginend4 = next3.i;
                    boolean e4 = e(settitlemarginend4);
                    if ((settitlemarginend4.V && settitlemarginend4.ap != 8) && e4) {
                        setTitleMarginBottom.c(settitlemarginend4, iconCompatParcelizer, new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver(), setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c);
                    }
                    if (settitlemarginend4.M[1] != setTitleMarginEnd.write.MATCH_CONSTRAINT || e4) {
                        if (!(settitlemarginend4.V && settitlemarginend4.ap != 8) && next3 == settitlemarginend4.m) {
                            settitlemarginend4.c(i3);
                            e(settitlemarginend4, iconCompatParcelizer);
                        }
                    }
                }
            }
        }
    }

    private static boolean e(setTitleMarginEnd settitlemarginend) {
        setTitleMarginEnd.write write = settitlemarginend.M[0];
        setTitleMarginEnd.write write2 = settitlemarginend.M[1];
        setTitleMarginBottom settitlemarginbottom = settitlemarginend.ac != null ? (setTitleMarginBottom) settitlemarginend.ac : null;
        if (settitlemarginbottom != null) {
            setTitleMarginEnd.write write3 = settitlemarginbottom.M[0];
            setTitleMarginEnd.write write4 = setTitleMarginEnd.write.FIXED;
        }
        if (settitlemarginbottom != null) {
            setTitleMarginEnd.write write5 = settitlemarginbottom.M[1];
            setTitleMarginEnd.write write6 = setTitleMarginEnd.write.FIXED;
        }
        boolean z = write == setTitleMarginEnd.write.FIXED || write == setTitleMarginEnd.write.WRAP_CONTENT || (write == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend.N == 0 && settitlemarginend.x == 0.0f && settitlemarginend.d(0)) || settitlemarginend.b();
        boolean z2 = write2 == setTitleMarginEnd.write.FIXED || write2 == setTitleMarginEnd.write.WRAP_CONTENT || (write2 == setTitleMarginEnd.write.MATCH_CONSTRAINT && settitlemarginend.L == 0 && settitlemarginend.x == 0.0f && settitlemarginend.d(1)) || settitlemarginend.c();
        if (settitlemarginend.x > 0.0f && (z || z2)) {
            return true;
        }
        boolean z3 = false;
        if (z) {
            z3 = false;
            if (z2) {
                z3 = true;
            }
        }
        return z3;
    }
}
