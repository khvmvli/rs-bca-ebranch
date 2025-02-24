package o;

import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes-dex2jar.jar:o/setLogoDescription.class */
public final class setLogoDescription {
    static int b;
    public float d;
    public boolean i;
    IconCompatParcelizer n;
    private String p;
    public int c = -1;
    int a = -1;
    public int l = 0;
    public boolean f = false;

    /* renamed from: o */
    float[] f240o = new float[9];
    float[] e = new float[9];
    setContentInsetStartWithNavigation[] j = new setContentInsetStartWithNavigation[16];
    int k = 0;
    public int s = 0;
    boolean h = false;
    int m = -1;
    float t = 0.0f;
    HashSet<setContentInsetStartWithNavigation> g = null;

    /* loaded from: classes-dex2jar.jar:o/setLogoDescription$IconCompatParcelizer.class */
    public enum IconCompatParcelizer {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public setLogoDescription(IconCompatParcelizer iconCompatParcelizer) {
        this.n = iconCompatParcelizer;
    }

    public final void a() {
        this.p = null;
        this.n = IconCompatParcelizer.UNKNOWN;
        this.l = 0;
        this.c = -1;
        this.a = -1;
        this.d = 0.0f;
        this.f = false;
        this.h = false;
        this.m = -1;
        this.t = 0.0f;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.s = 0;
        this.i = false;
        Arrays.fill(this.e, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        r5.k--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r8 >= (r0 - 1)) goto L_0x0034;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        r0 = r5.j;
        r0 = r8 + 1;
        r0[r8] = r0[r0];
        r8 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a(o.setContentInsetStartWithNavigation r6) {
        /*
            r5 = this;
            r0 = r5
            int r0 = r0.k
            r7 = r0
            r0 = 0
            r8 = r0
        L_0x0007:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L_0x0045
            r0 = r5
            o.setContentInsetStartWithNavigation[] r0 = r0.j
            r1 = r8
            r0 = r0[r1]
            r1 = r6
            if (r0 != r1) goto L_0x003f
        L_0x0016:
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L_0x0034
            r0 = r5
            o.setContentInsetStartWithNavigation[] r0 = r0.j
            r6 = r0
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r6
            r3 = r9
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r9
            r8 = r0
            goto L_0x0016
        L_0x0034:
            r0 = r5
            r1 = r5
            int r1 = r1.k
            r2 = 1
            int r1 = r1 - r2
            r0.k = r1
            return
        L_0x003f:
            int r8 = r8 + 1
            goto L_0x0007
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setLogoDescription.a(o.setContentInsetStartWithNavigation):void");
    }

    public final void c(setContentInsetsAbsolute setcontentinsetsabsolute, float f) {
        this.d = f;
        this.f = true;
        this.h = false;
        this.m = -1;
        this.t = 0.0f;
        int i = this.k;
        this.a = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].b(setcontentinsetsabsolute, this, false);
        }
        this.k = 0;
    }

    public final void d(setContentInsetStartWithNavigation setcontentinsetstartwithnavigation) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                setContentInsetStartWithNavigation[] setcontentinsetstartwithnavigationArr = this.j;
                if (i2 >= setcontentinsetstartwithnavigationArr.length) {
                    this.j = (setContentInsetStartWithNavigation[]) Arrays.copyOf(setcontentinsetstartwithnavigationArr, setcontentinsetstartwithnavigationArr.length << 1);
                }
                setContentInsetStartWithNavigation[] setcontentinsetstartwithnavigationArr2 = this.j;
                int i3 = this.k;
                setcontentinsetstartwithnavigationArr2[i3] = setcontentinsetstartwithnavigation;
                this.k = i3 + 1;
                return;
            } else if (this.j[i] != setcontentinsetstartwithnavigation) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void e(setContentInsetsAbsolute setcontentinsetsabsolute, setContentInsetStartWithNavigation setcontentinsetstartwithnavigation) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].e(setcontentinsetsabsolute, setcontentinsetstartwithnavigation, false);
        }
        this.k = 0;
    }

    public final String toString() {
        String str;
        if (this.p != null) {
            StringBuilder sb = new StringBuilder("");
            sb.append(this.p);
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(this.c);
            str = sb2.toString();
        }
        return str;
    }
}
