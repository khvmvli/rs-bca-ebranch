package o;

import io.realm.internal.Property;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o.setOnInflateListener;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setTitleMarginBottom.class */
public final class setTitleMarginBottom extends setContentPadding {
    public setContentInsetsRelative aH;
    int aJ;
    int aK;
    int aN;
    int aO;
    public setOnInflateListener e = new setOnInflateListener(this);
    public setMinimumHeight d = new setMinimumHeight(this);
    protected setOnInflateListener.IconCompatParcelizer aL = null;
    public boolean aD = false;
    protected setContentInsetsAbsolute aP = new setContentInsetsAbsolute();
    public int aF = 0;
    public int aS = 0;
    setSubtitleTextColor[] aM = new setSubtitleTextColor[4];
    setSubtitleTextColor[] aG = new setSubtitleTextColor[4];
    public boolean aA = false;
    public boolean aE = false;
    public boolean aT = false;
    public int aV = 0;
    public int aR = 0;
    public int aI = 257;
    public boolean aQ = false;
    public boolean aU = false;
    public boolean az = false;
    int c = 0;
    private WeakReference<setTitleMargin> aX = null;
    WeakReference<setTitleMargin> a = null;
    private WeakReference<setTitleMargin> aZ = null;
    private WeakReference<setTitleMargin> ba = null;
    public setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver aC = new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver();

    private void a(setTitleMargin settitlemargin, setLogoDescription setlogodescription) {
        this.aP.d(this.aP.b(settitlemargin), setlogodescription, 0, 5);
    }

    private void b(setContentInsetsAbsolute setcontentinsetsabsolute, boolean[] zArr) {
        zArr[2] = false;
        boolean z = (this.aI & 64) == 64;
        d(setcontentinsetsabsolute, z);
        int size = this.aY.size();
        for (int i = 0; i < size; i++) {
            ((setTitleMarginEnd) this.aY.get(i)).d(setcontentinsetsabsolute, z);
        }
    }

    private boolean b(setContentInsetsAbsolute setcontentinsetsabsolute) {
        boolean z = (this.aI & 64) == 64;
        b(setcontentinsetsabsolute, z);
        int size = this.aY.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            setTitleMarginEnd settitlemarginend = (setTitleMarginEnd) this.aY.get(i);
            settitlemarginend.d(0, false);
            settitlemarginend.d(1, false);
            if (settitlemarginend instanceof setNavigationContentDescription) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                setTitleMarginEnd settitlemarginend2 = (setTitleMarginEnd) this.aY.get(i2);
                if (settitlemarginend2 instanceof setNavigationContentDescription) {
                    ((setNavigationContentDescription) settitlemarginend2).d();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            setTitleMarginEnd settitlemarginend3 = (setTitleMarginEnd) this.aY.get(i3);
            if ((settitlemarginend3 instanceof setCardElevation) || (settitlemarginend3 instanceof setInflatedId)) {
                settitlemarginend3.b(setcontentinsetsabsolute, z);
            }
        }
        if (setContentInsetsAbsolute.j) {
            HashSet<setTitleMarginEnd> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                setTitleMarginEnd settitlemarginend4 = (setTitleMarginEnd) this.aY.get(i4);
                if (!((settitlemarginend4 instanceof setCardElevation) || (settitlemarginend4 instanceof setInflatedId))) {
                    hashSet.add(settitlemarginend4);
                }
            }
            b(this, setcontentinsetsabsolute, hashSet, this.M[0] == setTitleMarginEnd.write.WRAP_CONTENT ? 0 : 1, false);
            Iterator<setTitleMarginEnd> it = hashSet.iterator();
            while (it.hasNext()) {
                setTitleMarginEnd next = it.next();
                setTitleTextColor.d(this, setcontentinsetsabsolute, next);
                next.b(setcontentinsetsabsolute, z);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                setTitleMarginEnd settitlemarginend5 = (setTitleMarginEnd) this.aY.get(i5);
                if (settitlemarginend5 instanceof setTitleMarginBottom) {
                    setTitleMarginEnd.write write = settitlemarginend5.M[0];
                    setTitleMarginEnd.write write2 = settitlemarginend5.M[1];
                    if (write == setTitleMarginEnd.write.WRAP_CONTENT) {
                        settitlemarginend5.M[0] = setTitleMarginEnd.write.FIXED;
                    }
                    if (write2 == setTitleMarginEnd.write.WRAP_CONTENT) {
                        settitlemarginend5.M[1] = setTitleMarginEnd.write.FIXED;
                    }
                    settitlemarginend5.b(setcontentinsetsabsolute, z);
                    if (write == setTitleMarginEnd.write.WRAP_CONTENT) {
                        settitlemarginend5.M[0] = write;
                    }
                    if (write2 == setTitleMarginEnd.write.WRAP_CONTENT) {
                        settitlemarginend5.M[1] = write2;
                    }
                } else {
                    setTitleTextColor.d(this, setcontentinsetsabsolute, settitlemarginend5);
                    if (!((settitlemarginend5 instanceof setCardElevation) || (settitlemarginend5 instanceof setInflatedId))) {
                        settitlemarginend5.b(setcontentinsetsabsolute, z);
                    }
                }
            }
        }
        if (this.aF > 0) {
            setTitleMarginStart.a(this, setcontentinsetsabsolute, null, 0);
        }
        if (this.aS <= 0) {
            return true;
        }
        setTitleMarginStart.a(this, setcontentinsetsabsolute, null, 1);
        return true;
    }

    private void c(setTitleMargin settitlemargin, setLogoDescription setlogodescription) {
        this.aP.d(setlogodescription, this.aP.b(settitlemargin), 0, 5);
    }

    public static boolean c(setTitleMarginEnd settitlemarginend, setOnInflateListener.IconCompatParcelizer iconCompatParcelizer, setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver setoninflatelistener_mediabrowsercompat_customactionresultreceiver, int i) {
        int i2;
        int i3;
        if (iconCompatParcelizer == null) {
            return false;
        }
        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e = settitlemarginend.M[0];
        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k = settitlemarginend.M[1];
        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.d = settitlemarginend.q();
        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.f252o = settitlemarginend.e_();
        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.g = false;
        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.f = i;
        boolean z = setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e == setTitleMarginEnd.write.MATCH_CONSTRAINT;
        boolean z2 = setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k == setTitleMarginEnd.write.MATCH_CONSTRAINT;
        boolean z3 = z && settitlemarginend.x > 0.0f;
        boolean z4 = z2 && settitlemarginend.x > 0.0f;
        boolean z5 = z;
        if (z) {
            z5 = z;
            if (settitlemarginend.d(0)) {
                z5 = z;
                if (settitlemarginend.N == 0) {
                    z5 = z;
                    if (!z3) {
                        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e = setTitleMarginEnd.write.WRAP_CONTENT;
                        if (z2 && settitlemarginend.L == 0) {
                            setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e = setTitleMarginEnd.write.FIXED;
                        }
                        z5 = false;
                    }
                }
            }
        }
        boolean z6 = z2;
        if (z2) {
            z6 = z2;
            if (settitlemarginend.d(1)) {
                z6 = z2;
                if (settitlemarginend.L == 0) {
                    z6 = z2;
                    if (!z4) {
                        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k = setTitleMarginEnd.write.WRAP_CONTENT;
                        if (z5 && settitlemarginend.N == 0) {
                            setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k = setTitleMarginEnd.write.FIXED;
                        }
                        z6 = false;
                    }
                }
            }
        }
        if (settitlemarginend.b()) {
            setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e = setTitleMarginEnd.write.FIXED;
            z5 = false;
        }
        if (settitlemarginend.c()) {
            setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k = setTitleMarginEnd.write.FIXED;
            z6 = false;
        }
        if (z3) {
            if (settitlemarginend.ae[0] == 4) {
                setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e = setTitleMarginEnd.write.FIXED;
            } else if (!z6) {
                if (setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k == setTitleMarginEnd.write.FIXED) {
                    i3 = setoninflatelistener_mediabrowsercompat_customactionresultreceiver.f252o;
                } else {
                    setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e = setTitleMarginEnd.write.WRAP_CONTENT;
                    iconCompatParcelizer.b(settitlemarginend, setoninflatelistener_mediabrowsercompat_customactionresultreceiver);
                    i3 = setoninflatelistener_mediabrowsercompat_customactionresultreceiver.j;
                }
                setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e = setTitleMarginEnd.write.FIXED;
                if (settitlemarginend.y == 0 || settitlemarginend.y == -1) {
                    setoninflatelistener_mediabrowsercompat_customactionresultreceiver.d = (int) (settitlemarginend.x * ((float) i3));
                } else {
                    setoninflatelistener_mediabrowsercompat_customactionresultreceiver.d = (int) (settitlemarginend.x / ((float) i3));
                }
            }
        }
        if (z4) {
            if (settitlemarginend.ae[1] == 4) {
                setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k = setTitleMarginEnd.write.FIXED;
            } else if (!z5) {
                if (setoninflatelistener_mediabrowsercompat_customactionresultreceiver.e == setTitleMarginEnd.write.FIXED) {
                    i2 = setoninflatelistener_mediabrowsercompat_customactionresultreceiver.d;
                } else {
                    setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k = setTitleMarginEnd.write.WRAP_CONTENT;
                    iconCompatParcelizer.b(settitlemarginend, setoninflatelistener_mediabrowsercompat_customactionresultreceiver);
                    i2 = setoninflatelistener_mediabrowsercompat_customactionresultreceiver.m;
                }
                setoninflatelistener_mediabrowsercompat_customactionresultreceiver.k = setTitleMarginEnd.write.FIXED;
                if (settitlemarginend.y == 0 || settitlemarginend.y == -1) {
                    setoninflatelistener_mediabrowsercompat_customactionresultreceiver.f252o = (int) (((float) i2) / settitlemarginend.x);
                } else {
                    setoninflatelistener_mediabrowsercompat_customactionresultreceiver.f252o = (int) (((float) i2) * settitlemarginend.x);
                }
            }
        }
        iconCompatParcelizer.b(settitlemarginend, setoninflatelistener_mediabrowsercompat_customactionresultreceiver);
        settitlemarginend.n(setoninflatelistener_mediabrowsercompat_customactionresultreceiver.m);
        settitlemarginend.i(setoninflatelistener_mediabrowsercompat_customactionresultreceiver.j);
        settitlemarginend.d(setoninflatelistener_mediabrowsercompat_customactionresultreceiver.h);
        settitlemarginend.a(setoninflatelistener_mediabrowsercompat_customactionresultreceiver.i);
        setoninflatelistener_mediabrowsercompat_customactionresultreceiver.f = setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c;
        return setoninflatelistener_mediabrowsercompat_customactionresultreceiver.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x07e5, code lost:
        if (r0 == o.setTitleMarginEnd.write.MATCH_CONSTRAINT) goto L_0x07f0;
     */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0827 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long a(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 3018
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginBottom.a(int, int, int, int, int, int, int, int, int):long");
    }

    public void a(setTitleMarginEnd settitlemarginend) {
        int i = this.aS;
        setSubtitleTextColor[] setsubtitletextcolorArr = this.aM;
        if (i + 1 >= setsubtitletextcolorArr.length) {
            this.aM = (setSubtitleTextColor[]) Arrays.copyOf(setsubtitletextcolorArr, setsubtitletextcolorArr.length << 1);
        }
        this.aM[this.aS] = new setSubtitleTextColor(settitlemarginend, 1, this.aD);
        this.aS++;
    }

    @Override // o.setTitleMarginEnd
    public final void b(boolean z, boolean z2) {
        b(z, z2);
        int size = this.aY.size();
        for (int i = 0; i < size; i++) {
            ((setTitleMarginEnd) this.aY.get(i)).b(z, z2);
        }
    }

    public final boolean b(boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        setMinimumHeight setminimumheight = this.d;
        boolean z5 = z & true;
        setTitleMarginEnd.write write = setminimumheight.d.M[0];
        setTitleMarginEnd.write write2 = setminimumheight.d.M[1];
        int p = setminimumheight.d.p();
        int t = setminimumheight.d.t();
        if (z5 && (write == setTitleMarginEnd.write.WRAP_CONTENT || write2 == setTitleMarginEnd.write.WRAP_CONTENT)) {
            Iterator<setMargin> it = setminimumheight.j.iterator();
            while (true) {
                z4 = z5;
                if (!it.hasNext()) {
                    break;
                }
                setMargin next = it.next();
                if (next.g == i && !next.c()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && write == setTitleMarginEnd.write.WRAP_CONTENT) {
                    setTitleMarginBottom settitlemarginbottom = setminimumheight.d;
                    settitlemarginbottom.M[0] = setTitleMarginEnd.write.FIXED;
                    setTitleMarginBottom settitlemarginbottom2 = setminimumheight.d;
                    settitlemarginbottom2.n(setminimumheight.c(settitlemarginbottom2, 0));
                    setminimumheight.d.g.b.e(setminimumheight.d.q());
                }
            } else if (z4 && write2 == setTitleMarginEnd.write.WRAP_CONTENT) {
                setTitleMarginBottom settitlemarginbottom3 = setminimumheight.d;
                settitlemarginbottom3.M[1] = setTitleMarginEnd.write.FIXED;
                setTitleMarginBottom settitlemarginbottom4 = setminimumheight.d;
                settitlemarginbottom4.i(setminimumheight.c(settitlemarginbottom4, 1));
                setminimumheight.d.ay.b.e(setminimumheight.d.e_());
            }
        }
        if (i == 0) {
            if (setminimumheight.d.M[0] == setTitleMarginEnd.write.FIXED || setminimumheight.d.M[0] == setTitleMarginEnd.write.MATCH_PARENT) {
                int q = setminimumheight.d.q() + p;
                setminimumheight.d.g.f.e(q);
                setminimumheight.d.g.b.e(q - p);
                z2 = true;
            }
            z2 = false;
        } else {
            if (setminimumheight.d.M[1] == setTitleMarginEnd.write.FIXED || setminimumheight.d.M[1] == setTitleMarginEnd.write.MATCH_PARENT) {
                int e_ = setminimumheight.d.e_() + t;
                setminimumheight.d.ay.f.e(e_);
                setminimumheight.d.ay.b.e(e_ - t);
                z2 = true;
            }
            z2 = false;
        }
        setminimumheight.b();
        Iterator<setMargin> it2 = setminimumheight.j.iterator();
        while (it2.hasNext()) {
            setMargin next2 = it2.next();
            if (next2.g == i && (next2.l != setminimumheight.d || next2.j)) {
                next2.d();
            }
        }
        Iterator<setMargin> it3 = setminimumheight.j.iterator();
        while (it3.hasNext()) {
            setMargin next3 = it3.next();
            if (next3.g == i && (z2 || next3.l != setminimumheight.d)) {
                if (!next3.n.j || !next3.f.j || (!(next3 instanceof setLayoutResource) && !next3.b.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        setminimumheight.d.M[0] = write;
        setminimumheight.d.M[1] = write2;
        return z3;
    }

    public final void c(setTitleMargin settitlemargin) {
        WeakReference<setTitleMargin> weakReference = this.aX;
        if (!(weakReference == null || weakReference.get() == null)) {
            int i = 0;
            int i2 = !settitlemargin.a ? 0 : settitlemargin.d;
            setTitleMargin settitlemargin2 = this.aX.get();
            if (settitlemargin2.a) {
                i = settitlemargin2.d;
            }
            if (i2 <= i) {
                return;
            }
        }
        this.aX = new WeakReference<>(settitlemargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:265:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a3e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0c16  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0e07  */
    @Override // o.setContentPadding
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 3619
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginBottom.d():void");
    }

    public final void d(setOnInflateListener.IconCompatParcelizer iconCompatParcelizer) {
        this.aL = iconCompatParcelizer;
        this.d.b = iconCompatParcelizer;
    }

    public final void d(setTitleMargin settitlemargin) {
        WeakReference<setTitleMargin> weakReference = this.ba;
        if (!(weakReference == null || weakReference.get() == null)) {
            int i = 0;
            int i2 = !settitlemargin.a ? 0 : settitlemargin.d;
            setTitleMargin settitlemargin2 = this.ba.get();
            if (settitlemargin2.a) {
                i = settitlemargin2.d;
            }
            if (i2 <= i) {
                return;
            }
        }
        this.ba = new WeakReference<>(settitlemargin);
    }

    public final void e(setTitleMargin settitlemargin) {
        WeakReference<setTitleMargin> weakReference = this.aZ;
        if (!(weakReference == null || weakReference.get() == null)) {
            int i = 0;
            int i2 = !settitlemargin.a ? 0 : settitlemargin.d;
            setTitleMargin settitlemargin2 = this.aZ.get();
            if (settitlemargin2.a) {
                i = settitlemargin2.d;
            }
            if (i2 <= i) {
                return;
            }
        }
        this.aZ = new WeakReference<>(settitlemargin);
    }

    public void e(setTitleMarginEnd settitlemarginend) {
        int i = this.aF;
        setSubtitleTextColor[] setsubtitletextcolorArr = this.aG;
        if (i + 1 >= setsubtitletextcolorArr.length) {
            this.aG = (setSubtitleTextColor[]) Arrays.copyOf(setsubtitletextcolorArr, setsubtitletextcolorArr.length << 1);
        }
        this.aG[this.aF] = new setSubtitleTextColor(settitlemarginend, 0, this.aD);
        this.aF++;
    }

    public final void k(int i) {
        this.aI = i;
        setContentInsetsAbsolute.j = (i & Property.TYPE_DICTIONARY) == 512;
    }

    @Override // o.setContentPadding, o.setTitleMarginEnd
    public final void u() {
        this.aP.d();
        this.aK = 0;
        this.aO = 0;
        this.aN = 0;
        this.aJ = 0;
        this.aQ = false;
        u();
    }
}
