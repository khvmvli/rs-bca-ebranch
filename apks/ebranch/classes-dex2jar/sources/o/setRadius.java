package o;

import o.setMaxCardElevation;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setRadius.class */
public final class setRadius extends setMargin {
    public setRadius(setTitleMarginEnd settitlemarginend) {
        super(settitlemarginend);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final void a() {
        if (this.l instanceof setNavigationContentDescription) {
            this.n.b = true;
            setNavigationContentDescription setnavigationcontentdescription = (setNavigationContentDescription) this.l;
            int i = setnavigationcontentdescription.a;
            boolean z = setnavigationcontentdescription.e;
            if (i == 0) {
                this.n.i = setMaxCardElevation.read.LEFT;
                for (int i2 = 0; i2 < setnavigationcontentdescription.aP; i2++) {
                    setTitleMarginEnd settitlemarginend = setnavigationcontentdescription.aO[i2];
                    if (z || settitlemarginend.ap != 8) {
                        setMaxCardElevation setmaxcardelevation = settitlemarginend.g.n;
                        setmaxcardelevation.d.add(this.n);
                        this.n.h.add(setmaxcardelevation);
                    }
                }
                setMaxCardElevation setmaxcardelevation2 = this.l.g.n;
                this.n.d.add(setmaxcardelevation2);
                setmaxcardelevation2.h.add(this.n);
                setMaxCardElevation setmaxcardelevation3 = this.l.g.f;
                this.n.d.add(setmaxcardelevation3);
                setmaxcardelevation3.h.add(this.n);
            } else if (i == 1) {
                this.n.i = setMaxCardElevation.read.RIGHT;
                for (int i3 = 0; i3 < setnavigationcontentdescription.aP; i3++) {
                    setTitleMarginEnd settitlemarginend2 = setnavigationcontentdescription.aO[i3];
                    if (z || settitlemarginend2.ap != 8) {
                        setMaxCardElevation setmaxcardelevation4 = settitlemarginend2.g.f;
                        setmaxcardelevation4.d.add(this.n);
                        this.n.h.add(setmaxcardelevation4);
                    }
                }
                setMaxCardElevation setmaxcardelevation5 = this.l.g.n;
                this.n.d.add(setmaxcardelevation5);
                setmaxcardelevation5.h.add(this.n);
                setMaxCardElevation setmaxcardelevation6 = this.l.g.f;
                this.n.d.add(setmaxcardelevation6);
                setmaxcardelevation6.h.add(this.n);
            } else if (i == 2) {
                this.n.i = setMaxCardElevation.read.TOP;
                for (int i4 = 0; i4 < setnavigationcontentdescription.aP; i4++) {
                    setTitleMarginEnd settitlemarginend3 = setnavigationcontentdescription.aO[i4];
                    if (z || settitlemarginend3.ap != 8) {
                        setMaxCardElevation setmaxcardelevation7 = settitlemarginend3.ay.n;
                        setmaxcardelevation7.d.add(this.n);
                        this.n.h.add(setmaxcardelevation7);
                    }
                }
                setMaxCardElevation setmaxcardelevation8 = this.l.ay.n;
                this.n.d.add(setmaxcardelevation8);
                setmaxcardelevation8.h.add(this.n);
                setMaxCardElevation setmaxcardelevation9 = this.l.ay.f;
                this.n.d.add(setmaxcardelevation9);
                setmaxcardelevation9.h.add(this.n);
            } else if (i == 3) {
                this.n.i = setMaxCardElevation.read.BOTTOM;
                for (int i5 = 0; i5 < setnavigationcontentdescription.aP; i5++) {
                    setTitleMarginEnd settitlemarginend4 = setnavigationcontentdescription.aO[i5];
                    if (z || settitlemarginend4.ap != 8) {
                        setMaxCardElevation setmaxcardelevation10 = settitlemarginend4.ay.f;
                        setmaxcardelevation10.d.add(this.n);
                        this.n.h.add(setmaxcardelevation10);
                    }
                }
                setMaxCardElevation setmaxcardelevation11 = this.l.ay.n;
                this.n.d.add(setmaxcardelevation11);
                setmaxcardelevation11.h.add(this.n);
                setMaxCardElevation setmaxcardelevation12 = this.l.ay.f;
                this.n.d.add(setmaxcardelevation12);
                setmaxcardelevation12.h.add(this.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final void b() {
        this.f241o = null;
        this.n.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r0 < r9) goto L_0x0048;
     */
    @Override // o.setMargin, o.setPreventCornerOverlap
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(o.setPreventCornerOverlap r5) {
        /*
            r4 = this;
            r0 = r4
            o.setTitleMarginEnd r0 = r0.l
            o.setNavigationContentDescription r0 = (o.setNavigationContentDescription) r0
            r6 = r0
            r0 = r6
            int r0 = r0.a
            r7 = r0
            r0 = r4
            o.setMaxCardElevation r0 = r0.n
            java.util.List<o.setMaxCardElevation> r0 = r0.h
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            r0 = 0
            r8 = r0
            r0 = -1
            r9 = r0
        L_0x0020:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0062
            r0 = r5
            java.lang.Object r0 = r0.next()
            o.setMaxCardElevation r0 = (o.setMaxCardElevation) r0
            int r0 = r0.l
            r10 = r0
            r0 = r9
            r1 = -1
            if (r0 == r1) goto L_0x0048
            r0 = r9
            r11 = r0
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L_0x004c
        L_0x0048:
            r0 = r10
            r11 = r0
        L_0x004c:
            r0 = r11
            r9 = r0
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto L_0x0020
            r0 = r10
            r8 = r0
            r0 = r11
            r9 = r0
            goto L_0x0020
        L_0x0062:
            r0 = r7
            if (r0 == 0) goto L_0x007a
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L_0x007a
            r0 = r4
            o.setMaxCardElevation r0 = r0.n
            r1 = r8
            r2 = r6
            int r2 = r2.c
            int r1 = r1 + r2
            r0.e(r1)
            return
        L_0x007a:
            r0 = r4
            o.setMaxCardElevation r0 = r0.n
            r1 = r9
            r2 = r6
            int r2 = r2.c
            int r1 = r1 + r2
            r0.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRadius.b(o.setPreventCornerOverlap):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final boolean c() {
        return false;
    }

    @Override // o.setMargin
    public final void d() {
        if (this.l instanceof setNavigationContentDescription) {
            int i = ((setNavigationContentDescription) this.l).a;
            if (i == 0 || i == 1) {
                this.l.o(this.n.l);
            } else {
                this.l.m(this.n.l);
            }
        }
    }
}
