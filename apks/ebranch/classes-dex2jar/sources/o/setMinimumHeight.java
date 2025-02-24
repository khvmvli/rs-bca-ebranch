package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.setOnInflateListener;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setMinimumHeight.class */
public final class setMinimumHeight {
    public setTitleMarginBottom d;
    public setTitleMarginBottom e;
    public boolean a = true;
    public boolean i = true;
    public ArrayList<setMargin> j = new ArrayList<>();
    private ArrayList<values> h = new ArrayList<>();
    public setOnInflateListener.IconCompatParcelizer b = null;
    private setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver g = new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver();
    ArrayList<values> c = new ArrayList<>();

    public setMinimumHeight(setTitleMarginBottom settitlemarginbottom) {
        this.d = settitlemarginbottom;
        this.e = settitlemarginbottom;
    }

    private void a(setMaxCardElevation setmaxcardelevation, int i, int i2, setMaxCardElevation setmaxcardelevation2, ArrayList<values> arrayList, values values) {
        setMargin setmargin = setmaxcardelevation.g;
        if (!(setmargin.f241o != null || setmargin == this.d.g || setmargin == this.d.ay)) {
            values values2 = values;
            if (values == null) {
                values2 = new values(setmargin, i2);
                arrayList.add(values2);
            }
            setmargin.f241o = values2;
            values2.i.add(setmargin);
            values2.h = setmargin;
            for (setPreventCornerOverlap setpreventcorneroverlap : setmargin.n.d) {
                if (setpreventcorneroverlap instanceof setMaxCardElevation) {
                    a((setMaxCardElevation) setpreventcorneroverlap, i, 0, setmaxcardelevation2, arrayList, values2);
                }
            }
            for (setPreventCornerOverlap setpreventcorneroverlap2 : setmargin.f.d) {
                if (setpreventcorneroverlap2 instanceof setMaxCardElevation) {
                    a((setMaxCardElevation) setpreventcorneroverlap2, i, 1, setmaxcardelevation2, arrayList, values2);
                }
            }
            if (i == 1 && (setmargin instanceof setDpMargin)) {
                for (setPreventCornerOverlap setpreventcorneroverlap3 : ((setDpMargin) setmargin).d.d) {
                    if (setpreventcorneroverlap3 instanceof setMaxCardElevation) {
                        a((setMaxCardElevation) setpreventcorneroverlap3, i, 2, setmaxcardelevation2, arrayList, values2);
                    }
                }
            }
            for (setMaxCardElevation setmaxcardelevation3 : setmargin.n.h) {
                if (setmaxcardelevation3 == setmaxcardelevation2) {
                    values2.e = true;
                }
                a(setmaxcardelevation3, i, 0, setmaxcardelevation2, arrayList, values2);
            }
            for (setMaxCardElevation setmaxcardelevation4 : setmargin.f.h) {
                if (setmaxcardelevation4 == setmaxcardelevation2) {
                    values2.e = true;
                }
                a(setmaxcardelevation4, i, 1, setmaxcardelevation2, arrayList, values2);
            }
            if (i == 1 && (setmargin instanceof setDpMargin)) {
                for (setMaxCardElevation setmaxcardelevation5 : ((setDpMargin) setmargin).d.h) {
                    a(setmaxcardelevation5, i, 2, setmaxcardelevation2, arrayList, values2);
                }
            }
        }
    }

    private void b(setTitleMarginEnd settitlemarginend, setTitleMarginEnd.write write, int i, setTitleMarginEnd.write write2, int i2) {
        this.g.e = write;
        this.g.k = write2;
        this.g.d = i;
        this.g.f252o = i2;
        this.b.b(settitlemarginend, this.g);
        settitlemarginend.n(this.g.m);
        settitlemarginend.i(this.g.j);
        settitlemarginend.f = this.g.h;
        int i3 = this.g.i;
        settitlemarginend.n = i3;
        settitlemarginend.f = i3 > 0;
    }

    private void d(ArrayList<setMargin> arrayList) {
        HashSet hashSet;
        arrayList.clear();
        setUseCompatPadding setusecompatpadding = this.e.g;
        HashSet hashSet2 = null;
        setusecompatpadding.f241o = null;
        setusecompatpadding.n.b();
        setusecompatpadding.f.b();
        setusecompatpadding.b.b();
        setusecompatpadding.j = false;
        this.e.ay.b();
        arrayList.add(this.e.g);
        arrayList.add(this.e.ay);
        Iterator it = this.e.aY.iterator();
        while (it.hasNext()) {
            setTitleMarginEnd settitlemarginend = (setTitleMarginEnd) it.next();
            if (settitlemarginend instanceof setInflatedId) {
                arrayList.add(new valueOf(settitlemarginend));
            } else {
                if (settitlemarginend.w()) {
                    if (settitlemarginend.i == null) {
                        settitlemarginend.i = new setLayoutResource(settitlemarginend, 0);
                    }
                    HashSet hashSet3 = hashSet2;
                    if (hashSet2 == null) {
                        hashSet3 = new HashSet();
                    }
                    hashSet3.add(settitlemarginend.i);
                    hashSet2 = hashSet3;
                } else {
                    arrayList.add(settitlemarginend.g);
                }
                if (settitlemarginend.v()) {
                    if (settitlemarginend.aB == null) {
                        settitlemarginend.aB = new setLayoutResource(settitlemarginend, 1);
                    }
                    hashSet = hashSet2;
                    if (hashSet2 == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(settitlemarginend.aB);
                } else {
                    arrayList.add(settitlemarginend.ay);
                    hashSet = hashSet2;
                }
                hashSet2 = hashSet;
                if (settitlemarginend instanceof setTitleTextAppearance) {
                    arrayList.add(new setRadius(settitlemarginend));
                    hashSet2 = hashSet;
                }
            }
        }
        if (hashSet2 != null) {
            arrayList.addAll(hashSet2);
        }
        Iterator<setMargin> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
        Iterator<setMargin> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            setMargin next = it3.next();
            if (next.l != this.e) {
                next.a();
            }
        }
    }

    private void d(setMargin setmargin, int i, ArrayList<values> arrayList) {
        for (setPreventCornerOverlap setpreventcorneroverlap : setmargin.n.d) {
            if (setpreventcorneroverlap instanceof setMaxCardElevation) {
                a((setMaxCardElevation) setpreventcorneroverlap, i, 0, setmargin.f, arrayList, null);
            } else if (setpreventcorneroverlap instanceof setMargin) {
                a(((setMargin) setpreventcorneroverlap).n, i, 0, setmargin.f, arrayList, null);
            }
        }
        for (setPreventCornerOverlap setpreventcorneroverlap2 : setmargin.f.d) {
            if (setpreventcorneroverlap2 instanceof setMaxCardElevation) {
                a((setMaxCardElevation) setpreventcorneroverlap2, i, 1, setmargin.n, arrayList, null);
            } else if (setpreventcorneroverlap2 instanceof setMargin) {
                a(((setMargin) setpreventcorneroverlap2).f, i, 1, setmargin.n, arrayList, null);
            }
        }
        if (i == 1) {
            for (setPreventCornerOverlap setpreventcorneroverlap3 : ((setDpMargin) setmargin).d.d) {
                if (setpreventcorneroverlap3 instanceof setMaxCardElevation) {
                    a((setMaxCardElevation) setpreventcorneroverlap3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void b() {
        Iterator it = this.d.aY.iterator();
        while (it.hasNext()) {
            setTitleMarginEnd settitlemarginend = (setTitleMarginEnd) it.next();
            if (!settitlemarginend.au) {
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                setTitleMarginEnd.write write = settitlemarginend.M[0];
                setTitleMarginEnd.write write2 = settitlemarginend.M[1];
                int i5 = settitlemarginend.N;
                int i6 = settitlemarginend.L;
                boolean z = write == setTitleMarginEnd.write.WRAP_CONTENT || (write == setTitleMarginEnd.write.MATCH_CONSTRAINT && i5 == 1);
                boolean z2 = write2 == setTitleMarginEnd.write.WRAP_CONTENT || (write2 == setTitleMarginEnd.write.MATCH_CONSTRAINT && i6 == 1);
                boolean z3 = settitlemarginend.g.b.j;
                boolean z4 = settitlemarginend.ay.b.j;
                if (z3 && z4) {
                    b(settitlemarginend, setTitleMarginEnd.write.FIXED, settitlemarginend.g.b.l, setTitleMarginEnd.write.FIXED, settitlemarginend.ay.b.l);
                    settitlemarginend.au = true;
                } else if (z3 && z2) {
                    b(settitlemarginend, setTitleMarginEnd.write.FIXED, settitlemarginend.g.b.l, setTitleMarginEnd.write.WRAP_CONTENT, settitlemarginend.ay.b.l);
                    if (write2 == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                        setPaddingRelative setpaddingrelative = settitlemarginend.ay.b;
                        if (settitlemarginend.ap != 8) {
                            i4 = settitlemarginend.v;
                        }
                        setpaddingrelative.n = i4;
                    } else {
                        setPaddingRelative setpaddingrelative2 = settitlemarginend.ay.b;
                        if (settitlemarginend.ap != 8) {
                            i = settitlemarginend.v;
                        }
                        setpaddingrelative2.e(i);
                        settitlemarginend.au = true;
                    }
                } else if (z4 && z) {
                    b(settitlemarginend, setTitleMarginEnd.write.WRAP_CONTENT, settitlemarginend.g.b.l, setTitleMarginEnd.write.FIXED, settitlemarginend.ay.b.l);
                    if (write == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                        setPaddingRelative setpaddingrelative3 = settitlemarginend.g.b;
                        if (settitlemarginend.ap != 8) {
                            i2 = settitlemarginend.aw;
                        }
                        setpaddingrelative3.n = i2;
                    } else {
                        setPaddingRelative setpaddingrelative4 = settitlemarginend.g.b;
                        if (settitlemarginend.ap != 8) {
                            i3 = settitlemarginend.aw;
                        }
                        setpaddingrelative4.e(i3);
                        settitlemarginend.au = true;
                    }
                }
                if (settitlemarginend.au && settitlemarginend.ay.a != null) {
                    settitlemarginend.ay.a.e(settitlemarginend.n);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
        if (r0.am.f == null) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean b(o.setTitleMarginBottom r8) {
        /*
        // Method dump skipped, instructions count: 2373
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMinimumHeight.b(o.setTitleMarginBottom):boolean");
    }

    public int c(setTitleMarginBottom settitlemarginbottom, int i) {
        int size = this.c.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.c.get(i2).d(settitlemarginbottom, i));
        }
        return (int) j;
    }

    public final void e() {
        d(this.j);
        this.c.clear();
        values.d = 0;
        d(this.d.g, 0, this.c);
        d(this.d.ay, 1, this.c);
        this.a = false;
    }
}
