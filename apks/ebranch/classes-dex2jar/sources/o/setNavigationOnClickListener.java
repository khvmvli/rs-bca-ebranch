package o;

import io.realm.internal.Property;
import java.util.Arrays;
import java.util.Comparator;
import o.setContentInsetStartWithNavigation;
/* loaded from: classes-dex2jar.jar:o/setNavigationOnClickListener.class */
public final class setNavigationOnClickListener extends setContentInsetStartWithNavigation {
    setContentInsetEndWithActions g;
    private int j = Property.TYPE_ARRAY;
    private setLogoDescription[] i = new setLogoDescription[Property.TYPE_ARRAY];
    private setLogoDescription[] n = new setLogoDescription[Property.TYPE_ARRAY];
    private int k = 0;
    IconCompatParcelizer h = new IconCompatParcelizer(this);

    /* loaded from: classes-dex2jar.jar:o/setNavigationOnClickListener$IconCompatParcelizer.class */
    final class IconCompatParcelizer implements Comparable {
        setNavigationOnClickListener d;
        setLogoDescription e;

        public IconCompatParcelizer(setNavigationOnClickListener setnavigationonclicklistener) {
            this.d = setnavigationonclicklistener;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.e.c - ((setLogoDescription) obj).c;
        }

        @Override // java.lang.Object
        public final String toString() {
            String str = "[ ";
            String str2 = str;
            if (this.e != null) {
                int i = 0;
                while (true) {
                    str2 = str;
                    if (i >= 9) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.e.e[i]);
                    sb.append(" ");
                    str = sb.toString();
                    i++;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("] ");
            sb2.append(this.e);
            return sb2.toString();
        }
    }

    public setNavigationOnClickListener(setContentInsetEndWithActions setcontentinsetendwithactions) {
        super(setcontentinsetendwithactions);
        this.g = setcontentinsetendwithactions;
    }

    private final void c(setLogoDescription setlogodescription) {
        int i;
        int i2 = this.k;
        setLogoDescription[] setlogodescriptionArr = this.i;
        if (i2 + 1 > setlogodescriptionArr.length) {
            setLogoDescription[] setlogodescriptionArr2 = (setLogoDescription[]) Arrays.copyOf(setlogodescriptionArr, setlogodescriptionArr.length << 1);
            this.i = setlogodescriptionArr2;
            this.n = (setLogoDescription[]) Arrays.copyOf(setlogodescriptionArr2, setlogodescriptionArr2.length << 1);
        }
        setLogoDescription[] setlogodescriptionArr3 = this.i;
        int i3 = this.k;
        setlogodescriptionArr3[i3] = setlogodescription;
        int i4 = i3 + 1;
        this.k = i4;
        if (i4 > 1 && setlogodescriptionArr3[i4 - 1].c > setlogodescription.c) {
            int i5 = 0;
            while (true) {
                i = this.k;
                if (i5 >= i) {
                    break;
                }
                this.n[i5] = this.i[i5];
                i5++;
            }
            Arrays.sort(this.n, 0, i, new Comparator<setLogoDescription>() { // from class: o.setNavigationOnClickListener.1
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(setLogoDescription setlogodescription2, setLogoDescription setlogodescription3) {
                    return setlogodescription2.c - setlogodescription3.c;
                }
            });
            for (int i6 = 0; i6 < this.k; i6++) {
                this.i[i6] = this.n[i6];
            }
        }
        setlogodescription.i = true;
        setlogodescription.d(this);
    }

    @Override // o.setContentInsetStartWithNavigation, o.setContentInsetsAbsolute.read
    public final void b(setLogoDescription setlogodescription) {
        this.h.e = setlogodescription;
        Arrays.fill(this.h.e.e, 0.0f);
        setlogodescription.e[setlogodescription.l] = 1.0f;
        c(setlogodescription);
    }

    @Override // o.setContentInsetStartWithNavigation, o.setContentInsetsAbsolute.read
    public final setLogoDescription c(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.k; i2++) {
            setLogoDescription setlogodescription = this.i[i2];
            if (!zArr[setlogodescription.c]) {
                this.h.e = setlogodescription;
                int i3 = 8;
                boolean z = true;
                boolean z2 = true;
                if (i == -1) {
                    IconCompatParcelizer iconCompatParcelizer = this.h;
                    while (i3 >= 0) {
                        float f = iconCompatParcelizer.e.e[i3];
                        if (f > 0.0f) {
                            break;
                        } else if (f < 0.0f) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                    i = i2;
                } else {
                    IconCompatParcelizer iconCompatParcelizer2 = this.h;
                    setLogoDescription setlogodescription2 = this.i[i];
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        float f2 = setlogodescription2.e[i3];
                        float f3 = iconCompatParcelizer2.e.e[i3];
                        if (f3 == f2) {
                            i3--;
                        } else if (f3 < f2) {
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.i[i];
    }

    @Override // o.setContentInsetStartWithNavigation, o.setContentInsetsAbsolute.read
    public final boolean c() {
        return this.k == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        r5.k = r0;
        r6.i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = r5.k - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r7 >= r0) goto L_0x0037;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        r0 = r5.i;
        r0 = r7 + 1;
        r0[r7] = r0[r0];
        r7 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final void d(o.setLogoDescription r6) {
        /*
            r5 = this;
            r0 = 0
            r7 = r0
        L_0x0002:
            r0 = r7
            r1 = r5
            int r1 = r1.k
            if (r0 >= r1) goto L_0x0048
            r0 = r5
            o.setLogoDescription[] r0 = r0.i
            r1 = r7
            r0 = r0[r1]
            r1 = r6
            if (r0 != r1) goto L_0x0042
        L_0x0014:
            r0 = r5
            int r0 = r0.k
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L_0x0037
            r0 = r5
            o.setLogoDescription[] r0 = r0.i
            r9 = r0
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r9
            r1 = r7
            r2 = r9
            r3 = r8
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            r7 = r0
            goto L_0x0014
        L_0x0037:
            r0 = r5
            r1 = r8
            r0.k = r1
            r0 = r6
            r1 = 0
            r0.i = r1
            return
        L_0x0042:
            int r7 = r7 + 1
            goto L_0x0002
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setNavigationOnClickListener.d(o.setLogoDescription):void");
    }

    @Override // o.setContentInsetStartWithNavigation, o.setContentInsetsAbsolute.read
    public final void e() {
        this.k = 0;
        this.d = 0.0f;
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void e(setContentInsetsAbsolute setcontentinsetsabsolute, setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, boolean z) {
        setLogoDescription setlogodescription = setcontentinsetstartwithnavigation.b;
        if (setlogodescription != null) {
            setContentInsetStartWithNavigation.IconCompatParcelizer iconCompatParcelizer = setcontentinsetstartwithnavigation.c;
            int a = iconCompatParcelizer.a();
            for (int i = 0; i < a; i++) {
                setLogoDescription c = iconCompatParcelizer.c(i);
                float a2 = iconCompatParcelizer.a(i);
                this.h.e = c;
                IconCompatParcelizer iconCompatParcelizer2 = this.h;
                boolean z2 = true;
                boolean z3 = true;
                if (iconCompatParcelizer2.e.i) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        float[] fArr = iconCompatParcelizer2.e.e;
                        fArr[i2] = fArr[i2] + (setlogodescription.e[i2] * a2);
                        if (Math.abs(iconCompatParcelizer2.e.e[i2]) < 1.0E-4f) {
                            iconCompatParcelizer2.e.e[i2] = 0.0f;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        setNavigationOnClickListener.this.d(iconCompatParcelizer2.e);
                    }
                    z2 = false;
                } else {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float f = setlogodescription.e[i3];
                        if (f != 0.0f) {
                            float f2 = f * a2;
                            float f3 = f2;
                            if (Math.abs(f2) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            iconCompatParcelizer2.e.e[i3] = f3;
                        } else {
                            iconCompatParcelizer2.e.e[i3] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    c(c);
                }
                this.d += setcontentinsetstartwithnavigation.d * a2;
            }
            d(setlogodescription);
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String toString() {
        StringBuilder sb = new StringBuilder(" goal -> (");
        sb.append(this.d);
        sb.append(") : ");
        String obj = sb.toString();
        for (int i = 0; i < this.k; i++) {
            this.h.e = this.i[i];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.h);
            sb2.append(" ");
            obj = sb2.toString();
        }
        return obj;
    }
}
