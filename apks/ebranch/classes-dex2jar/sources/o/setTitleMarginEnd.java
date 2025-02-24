package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.setLogoDescription;
import o.setTitleMargin;
/* loaded from: classes-dex2jar.jar:o/setTitleMarginEnd.class */
public class setTitleMarginEnd {
    public static float b;
    boolean D;
    boolean E;
    public setTitleMargin[] J;
    protected int T;
    protected int W;
    public setLayoutResource aB;
    boolean ai;
    public float ak;
    boolean an;
    public boolean h;
    public setLayoutResource i;
    public setTitleMargin r;
    public Object s;
    public float z;
    public boolean au = false;
    public setMargin[] av = new setMargin[2];
    public setUseCompatPadding g = null;
    public setDpMargin ay = null;
    public boolean[] l = {true, true};
    boolean ah = false;
    public boolean V = true;
    private boolean d = false;
    private boolean e = true;
    private boolean aA = false;
    private boolean aF = false;
    public int C = -1;
    public int aq = -1;
    public int N = 0;
    public int L = 0;
    public int[] ae = new int[2];
    public int S = 0;
    public int Q = 0;
    public float U = 1.0f;
    public int O = 0;
    public int R = 0;
    public float P = 1.0f;
    int ag = -1;
    float ad = 1.0f;
    public int[] X = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float p = 0.0f;
    public boolean f = false;
    public boolean I = false;
    public int G = 0;
    public int H = 0;
    public setTitleMargin F = new setTitleMargin(this, setTitleMargin.write.LEFT);
    public setTitleMargin al = new setTitleMargin(this, setTitleMargin.write.TOP);
    public setTitleMargin am = new setTitleMargin(this, setTitleMargin.write.RIGHT);

    /* renamed from: o */
    public setTitleMargin f281o = new setTitleMargin(this, setTitleMargin.write.BOTTOM);
    public setTitleMargin m = new setTitleMargin(this, setTitleMargin.write.BASELINE);
    setTitleMargin t = new setTitleMargin(this, setTitleMargin.write.CENTER_X);
    setTitleMargin q = new setTitleMargin(this, setTitleMargin.write.CENTER_Y);
    protected ArrayList<setTitleMargin> k = new ArrayList<>();
    private boolean[] c = new boolean[2];
    public write[] M = {write.FIXED, write.FIXED};
    public setTitleMarginEnd ac = null;
    public int aw = 0;
    public int v = 0;
    public float x = 0.0f;
    protected int y = -1;
    protected int at = 0;
    protected int as = 0;
    int Y = 0;
    int af = 0;
    protected int Z = 0;
    protected int aa = 0;
    public int n = 0;
    private int a = 0;
    public int ap = 0;
    public String u = null;
    private String az = null;
    boolean w = false;
    public int B = 0;
    public int aj = 0;
    public float[] ar = {-1.0f, -1.0f};
    protected setTitleMarginEnd[] K = {null, null};
    protected setTitleMarginEnd[] ab = {null, null};
    setTitleMarginEnd A = null;
    setTitleMarginEnd ao = null;
    public int j = -1;
    public int ax = -1;

    /* renamed from: o.setTitleMarginEnd$5 */
    /* loaded from: classes-dex2jar.jar:o/setTitleMarginEnd$5.class */
    public static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[write.values().length];
            c = iArr;
            try {
                iArr[write.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                c[write.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                c[write.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                c[write.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[setTitleMargin.write.values().length];
            b = iArr2;
            try {
                iArr2[setTitleMargin.write.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                b[setTitleMargin.write.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                b[setTitleMargin.write.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                b[setTitleMargin.write.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
            try {
                b[setTitleMargin.write.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e9) {
            }
            try {
                b[setTitleMargin.write.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e10) {
            }
            try {
                b[setTitleMargin.write.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e11) {
            }
            try {
                b[setTitleMargin.write.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e12) {
            }
            try {
                b[setTitleMargin.write.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e13) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTitleMarginEnd$write.class */
    public enum write {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public setTitleMarginEnd() {
        setTitleMargin settitlemargin = new setTitleMargin(this, setTitleMargin.write.CENTER);
        this.r = settitlemargin;
        this.J = new setTitleMargin[]{this.F, this.am, this.al, this.f281o, this.m, settitlemargin};
        float f = b;
        this.z = f;
        this.ak = f;
        this.k.add(this.F);
        this.k.add(this.al);
        this.k.add(this.am);
        this.k.add(this.f281o);
        this.k.add(this.t);
        this.k.add(this.q);
        this.k.add(this.r);
        this.k.add(this.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x041b, code lost:
        if (r22 > (!r0.a ? 0 : r0.d)) goto L_0x041e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x07ee, code lost:
        if (r14 != false) goto L_0x07f1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0876, code lost:
        if (r0 == r0) goto L_0x0879;
     */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:449:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(o.setContentInsetsAbsolute r11, boolean r12, boolean r13, boolean r14, boolean r15, o.setLogoDescription r16, o.setLogoDescription r17, o.setTitleMarginEnd.write r18, boolean r19, o.setTitleMargin r20, o.setTitleMargin r21, int r22, int r23, int r24, int r25, float r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, int r32, int r33, int r34, int r35, float r36, boolean r37) {
        /*
        // Method dump skipped, instructions count: 2603
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginEnd.b(o.setContentInsetsAbsolute, boolean, boolean, boolean, boolean, o.setLogoDescription, o.setLogoDescription, o.setTitleMarginEnd$write, boolean, o.setTitleMargin, o.setTitleMargin, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x033d, code lost:
        if (r7 == o.setTitleMargin.write.RIGHT) goto L_0x0340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        if ((r0.f != null) == false) goto L_0x0058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        if ((r0.f != null) != false) goto L_0x0071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        if ((r0.f != null) == false) goto L_0x00ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
        if ((r0.f != null) != false) goto L_0x00c6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
        r13 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(o.setTitleMargin.write r7, o.setTitleMarginEnd r8, o.setTitleMargin.write r9, int r10) {
        /*
        // Method dump skipped, instructions count: 1013
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginEnd.c(o.setTitleMargin$write, o.setTitleMarginEnd, o.setTitleMargin$write, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r4.J[r5].f.f == r4.J[r5]) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean l(int r5) {
        /*
            r4 = this;
            r0 = 1
            r6 = r0
            r0 = r5
            r1 = 1
            int r0 = r0 << r1
            r5 = r0
            r0 = r4
            o.setTitleMargin[] r0 = r0.J
            r1 = r5
            r0 = r0[r1]
            o.setTitleMargin r0 = r0.f
            if (r0 == 0) goto L_0x004f
            r0 = r4
            o.setTitleMargin[] r0 = r0.J
            r1 = r5
            r0 = r0[r1]
            o.setTitleMargin r0 = r0.f
            o.setTitleMargin r0 = r0.f
            r7 = r0
            r0 = r4
            o.setTitleMargin[] r0 = r0.J
            r8 = r0
            r0 = r7
            r1 = r8
            r2 = r5
            r1 = r1[r2]
            if (r0 == r1) goto L_0x004f
            int r5 = r5 + 1
            r0 = r8
            r1 = r5
            r0 = r0[r1]
            o.setTitleMargin r0 = r0.f
            if (r0 == 0) goto L_0x004f
            r0 = r4
            o.setTitleMargin[] r0 = r0.J
            r1 = r5
            r0 = r0[r1]
            o.setTitleMargin r0 = r0.f
            o.setTitleMargin r0 = r0.f
            r1 = r4
            o.setTitleMargin[] r1 = r1.J
            r2 = r5
            r1 = r1[r2]
            if (r0 == r1) goto L_0x0051
        L_0x004f:
            r0 = 0
            r6 = r0
        L_0x0051:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginEnd.l(int):boolean");
    }

    public final void A() {
        this.aA = false;
        this.aF = false;
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            setTitleMargin settitlemargin = this.k.get(i);
            settitlemargin.a = false;
            settitlemargin.d = 0;
        }
    }

    public final void D() {
        setTitleMarginEnd settitlemarginend = this.ac;
        if (settitlemarginend != null) {
            boolean z = settitlemarginend instanceof setTitleMarginBottom;
        }
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            this.k.get(i).c();
        }
    }

    public final void a(int i) {
        this.n = i;
        this.f = i > 0;
    }

    public final void a(int i, int i2) {
        this.at = i;
        this.as = i2;
    }

    public final void a(setContentInsetsAbsolute setcontentinsetsabsolute) {
        setcontentinsetsabsolute.b(this.F);
        setcontentinsetsabsolute.b(this.al);
        setcontentinsetsabsolute.b(this.am);
        setcontentinsetsabsolute.b(this.f281o);
        if (this.n > 0) {
            setcontentinsetsabsolute.b(this.m);
        }
    }

    public boolean a() {
        return this.ap != 8;
    }

    public setTitleMargin b(setTitleMargin.write write2) {
        switch (AnonymousClass5.b[write2.ordinal()]) {
            case 1:
                return this.F;
            case 2:
                return this.al;
            case 3:
                return this.am;
            case 4:
                return this.f281o;
            case 5:
                return this.m;
            case 6:
                return this.r;
            case 7:
                return this.t;
            case 8:
                return this.q;
            case 9:
                return null;
            default:
                throw new AssertionError(write2.name());
        }
    }

    public final setTitleMarginEnd b(int i) {
        setTitleMargin settitlemargin;
        setTitleMargin settitlemargin2;
        if (i == 0) {
            if (this.F.f == null || this.F.f.f != (settitlemargin2 = this.F)) {
                return null;
            }
            return settitlemargin2.f.i;
        } else if (i == 1 && this.al.f != null && this.al.f.f == (settitlemargin = this.al)) {
            return settitlemargin.f.i;
        } else {
            return null;
        }
    }

    public final void b(int i, int i2) {
        setTitleMargin settitlemargin = this.al;
        settitlemargin.d = i;
        settitlemargin.a = true;
        setTitleMargin settitlemargin2 = this.f281o;
        settitlemargin2.d = i2;
        settitlemargin2.a = true;
        this.as = i;
        this.v = i2 - i;
        if (this.f) {
            setTitleMargin settitlemargin3 = this.m;
            settitlemargin3.d = i + this.n;
            settitlemargin3.a = true;
        }
        this.aF = true;
    }

    public void b(setContentInsetEndWithActions setcontentinsetendwithactions) {
        setTitleMargin settitlemargin = this.F;
        setLogoDescription setlogodescription = settitlemargin.h;
        if (setlogodescription == null) {
            settitlemargin.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription.a();
        }
        setTitleMargin settitlemargin2 = this.al;
        setLogoDescription setlogodescription2 = settitlemargin2.h;
        if (setlogodescription2 == null) {
            settitlemargin2.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription2.a();
        }
        setTitleMargin settitlemargin3 = this.am;
        setLogoDescription setlogodescription3 = settitlemargin3.h;
        if (setlogodescription3 == null) {
            settitlemargin3.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription3.a();
        }
        setTitleMargin settitlemargin4 = this.f281o;
        setLogoDescription setlogodescription4 = settitlemargin4.h;
        if (setlogodescription4 == null) {
            settitlemargin4.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription4.a();
        }
        setTitleMargin settitlemargin5 = this.m;
        setLogoDescription setlogodescription5 = settitlemargin5.h;
        if (setlogodescription5 == null) {
            settitlemargin5.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription5.a();
        }
        setTitleMargin settitlemargin6 = this.r;
        setLogoDescription setlogodescription6 = settitlemargin6.h;
        if (setlogodescription6 == null) {
            settitlemargin6.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription6.a();
        }
        setTitleMargin settitlemargin7 = this.t;
        setLogoDescription setlogodescription7 = settitlemargin7.h;
        if (setlogodescription7 == null) {
            settitlemargin7.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription7.a();
        }
        setTitleMargin settitlemargin8 = this.q;
        setLogoDescription setlogodescription8 = settitlemargin8.h;
        if (setlogodescription8 == null) {
            settitlemargin8.h = new setLogoDescription(setLogoDescription.IconCompatParcelizer.UNRESTRICTED);
        } else {
            setlogodescription8.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0589, code lost:
        if ((r29.f281o.f != null) == false) goto L_0x058c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05c9, code lost:
        if ((r29.am.f != null) == false) goto L_0x05cc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0636, code lost:
        if ((r29.am.f != null) == false) goto L_0x0639;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0c0d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void b(o.setContentInsetsAbsolute r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 3483
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginEnd.b(o.setContentInsetsAbsolute, boolean):void");
    }

    public final void b(setTitleMarginBottom settitlemarginbottom, setContentInsetsAbsolute setcontentinsetsabsolute, HashSet<setTitleMarginEnd> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                setTitleTextColor.d(settitlemarginbottom, setcontentinsetsabsolute, this);
                hashSet.remove(this);
                b(setcontentinsetsabsolute, (settitlemarginbottom.aI & 64) == 64);
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<setTitleMargin> hashSet2 = this.F.b;
            if (hashSet2 != null) {
                Iterator<setTitleMargin> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().i.b(settitlemarginbottom, setcontentinsetsabsolute, hashSet, i, true);
                }
            }
            HashSet<setTitleMargin> hashSet3 = this.am.b;
            if (hashSet3 != null) {
                Iterator<setTitleMargin> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().i.b(settitlemarginbottom, setcontentinsetsabsolute, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<setTitleMargin> hashSet4 = this.al.b;
        if (hashSet4 != null) {
            Iterator<setTitleMargin> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().i.b(settitlemarginbottom, setcontentinsetsabsolute, hashSet, i, true);
            }
        }
        HashSet<setTitleMargin> hashSet5 = this.f281o.b;
        if (hashSet5 != null) {
            Iterator<setTitleMargin> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().i.b(settitlemarginbottom, setcontentinsetsabsolute, hashSet, i, true);
            }
        }
        HashSet<setTitleMargin> hashSet6 = this.m.b;
        if (hashSet6 != null) {
            Iterator<setTitleMargin> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().i.b(settitlemarginbottom, setcontentinsetsabsolute, hashSet, i, true);
            }
        }
    }

    public final void b(boolean z) {
        this.I = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
        if (r0 == Integer.MAX_VALUE) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void b(boolean r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 350
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginEnd.b(boolean, boolean):void");
    }

    public boolean b() {
        return this.aA || (this.F.a && this.am.a);
    }

    public final void c(int i) {
        if (this.f) {
            int i2 = i - this.n;
            int i3 = this.v;
            this.as = i2;
            setTitleMargin settitlemargin = this.al;
            settitlemargin.d = i2;
            settitlemargin.a = true;
            setTitleMargin settitlemargin2 = this.f281o;
            settitlemargin2.d = i3 + i2;
            settitlemargin2.a = true;
            setTitleMargin settitlemargin3 = this.m;
            settitlemargin3.d = i;
            settitlemargin3.a = true;
            this.aF = true;
        }
    }

    public final void c(int i, int i2) {
        setTitleMargin settitlemargin = this.F;
        settitlemargin.d = i;
        settitlemargin.a = true;
        setTitleMargin settitlemargin2 = this.am;
        settitlemargin2.d = i2;
        settitlemargin2.a = true;
        this.at = i;
        this.aw = i2 - i;
        this.aA = true;
    }

    public boolean c() {
        return this.aF || (this.al.a && this.f281o.a);
    }

    public final void d(int i, int i2) {
        this.at = i;
        int i3 = i2 - i;
        this.aw = i3;
        int i4 = this.T;
        if (i3 < i4) {
            this.aw = i4;
        }
    }

    public final void d(int i, boolean z) {
        this.c[i] = z;
    }

    public final void d(String str) {
        float f;
        if (str == null || str.length() == 0) {
            this.x = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i = -1;
        int i2 = 0;
        if (indexOf > 0) {
            i = -1;
            i2 = 0;
            if (indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else {
                    i = -1;
                    if (substring.equalsIgnoreCase("H")) {
                        i = 1;
                    }
                }
                i2 = indexOf + 1;
            }
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i2);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = 0.0f;
        } else {
            String substring3 = str.substring(i2, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = 0.0f;
        }
        if (f > 0.0f) {
            this.x = f;
            this.y = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0172, code lost:
        if (r6 == Integer.MAX_VALUE) goto L_0x0175;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void d(o.setContentInsetsAbsolute r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 549
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginEnd.d(o.setContentInsetsAbsolute, boolean):void");
    }

    public final void d(boolean z) {
        this.f = z;
    }

    public final boolean d(int i) {
        boolean z = false;
        boolean z2 = false;
        if (i == 0) {
            if ((this.F.f != null ? 1 : 0) + (this.am.f != null ? 1 : 0) < 2) {
                z2 = true;
            }
            return z2;
        }
        if ((this.al.f != null ? 1 : 0) + (this.f281o.f != null ? 1 : 0) + (this.m.f != null ? 1 : 0) < 2) {
            z = true;
        }
        return z;
    }

    public final int d_() {
        return this.y;
    }

    public final setTitleMarginEnd e(int i) {
        setTitleMargin settitlemargin;
        setTitleMargin settitlemargin2;
        if (i == 0) {
            if (this.am.f == null || this.am.f.f != (settitlemargin2 = this.am)) {
                return null;
            }
            return settitlemargin2.f.i;
        } else if (i == 1 && this.f281o.f != null && this.f281o.f.f == (settitlemargin = this.f281o)) {
            return settitlemargin.f.i;
        } else {
            return null;
        }
    }

    public final void e(int i, int i2) {
        this.as = i;
        int i3 = i2 - i;
        this.v = i3;
        int i4 = this.W;
        if (i3 < i4) {
            this.v = i4;
        }
    }

    public final void e(setTitleMargin settitlemargin, setTitleMargin settitlemargin2, int i) {
        if (settitlemargin.i == this) {
            c(settitlemargin.j, settitlemargin2.i, settitlemargin2.j, i);
        }
    }

    public final int e_() {
        if (this.ap == 8) {
            return 0;
        }
        return this.v;
    }

    public final void f() {
        if (this.g == null) {
            this.g = new setUseCompatPadding(this);
        }
        if (this.ay == null) {
            this.ay = new setDpMargin(this);
        }
    }

    public final void f(int i) {
        if (i < 0) {
            this.W = 0;
        } else {
            this.W = i;
        }
    }

    public final void g(int i) {
        if (i < 0) {
            this.T = 0;
        } else {
            this.T = i;
        }
    }

    public final void h(int i) {
        setTitleMargin settitlemargin = this.F;
        settitlemargin.d = 0;
        settitlemargin.a = true;
        this.at = 0;
    }

    public final String i() {
        return this.u;
    }

    public final void i(int i) {
        this.v = i;
        int i2 = this.W;
        if (i < i2) {
            this.v = i2;
        }
    }

    public final int j() {
        return t() + this.v;
    }

    public final void j(int i) {
        setTitleMargin settitlemargin = this.al;
        settitlemargin.d = 0;
        settitlemargin.a = true;
        this.as = 0;
    }

    public final int k() {
        return this.T;
    }

    public final int l() {
        return p() + this.aw;
    }

    public final int m() {
        return this.W;
    }

    public final void m(int i) {
        this.as = i;
    }

    public final int n() {
        return this.X[0];
    }

    public final void n(int i) {
        this.aw = i;
        int i2 = this.T;
        if (i < i2) {
            this.aw = i2;
        }
    }

    public final int o() {
        return this.X[1];
    }

    public final void o(int i) {
        this.at = i;
    }

    public final int p() {
        setTitleMarginEnd settitlemarginend = this.ac;
        return (settitlemarginend == null || !(settitlemarginend instanceof setTitleMarginBottom)) ? this.at : ((setTitleMarginBottom) settitlemarginend).aK + this.at;
    }

    public final int q() {
        if (this.ap == 8) {
            return 0;
        }
        return this.aw;
    }

    public final boolean r() {
        return this.f;
    }

    public final int s() {
        return this.ap;
    }

    public final int t() {
        setTitleMarginEnd settitlemarginend = this.ac;
        return (settitlemarginend == null || !(settitlemarginend instanceof setTitleMarginBottom)) ? this.as : ((setTitleMarginBottom) settitlemarginend).aN + this.as;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.az != null) {
            StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.az);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.u != null) {
            StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.u);
            sb3.append(" ");
            str2 = sb3.toString();
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.at);
        sb.append(", ");
        sb.append(this.as);
        sb.append(") - (");
        sb.append(this.aw);
        sb.append(" x ");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.F.c();
        this.al.c();
        this.am.c();
        this.f281o.c();
        this.m.c();
        this.t.c();
        this.q.c();
        this.r.c();
        this.ac = null;
        this.p = 0.0f;
        this.aw = 0;
        this.v = 0;
        this.x = 0.0f;
        this.y = -1;
        this.at = 0;
        this.as = 0;
        this.Z = 0;
        this.aa = 0;
        this.n = 0;
        this.T = 0;
        this.W = 0;
        float f = b;
        this.z = f;
        this.ak = f;
        this.M[0] = write.FIXED;
        this.M[1] = write.FIXED;
        this.s = null;
        this.a = 0;
        this.ap = 0;
        this.az = null;
        this.E = false;
        this.an = false;
        this.B = 0;
        this.aj = 0;
        this.D = false;
        this.ai = false;
        float[] fArr = this.ar;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.C = -1;
        this.aq = -1;
        int[] iArr = this.X;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.N = 0;
        this.L = 0;
        this.U = 1.0f;
        this.P = 1.0f;
        this.Q = Integer.MAX_VALUE;
        this.R = Integer.MAX_VALUE;
        this.S = 0;
        this.O = 0;
        this.ah = false;
        this.ag = -1;
        this.ad = 1.0f;
        this.w = false;
        boolean[] zArr = this.l;
        zArr[0] = true;
        zArr[1] = true;
        this.I = false;
        boolean[] zArr2 = this.c;
        zArr2[0] = false;
        zArr2[1] = false;
        this.V = true;
    }

    public final boolean v() {
        if (this.al.f == null || this.al.f.f != this.al) {
            return this.f281o.f != null && this.f281o.f.f == this.f281o;
        }
        return true;
    }

    public final boolean w() {
        if (this.F.f == null || this.F.f.f != this.F) {
            return this.am.f != null && this.am.f.f == this.am;
        }
        return true;
    }

    public final boolean x() {
        return this.V && this.ap != 8;
    }

    public final boolean y() {
        return this.I;
    }
}
