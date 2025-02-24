package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/setTitleMargin.class */
public final class setTitleMargin {
    public boolean a;
    public int d;
    public setTitleMargin f;
    public setLogoDescription h;
    public final setTitleMarginEnd i;
    public final write j;
    public HashSet<setTitleMargin> b = null;
    public int c = 0;
    int e = -1;

    /* renamed from: o.setTitleMargin$5 */
    /* loaded from: classes-dex2jar.jar:o/setTitleMargin$5.class */
    public static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[write.values().length];
            e = iArr;
            try {
                iArr[write.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                e[write.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                e[write.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                e[write.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                e[write.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                e[write.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError e7) {
            }
            try {
                e[write.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e8) {
            }
            try {
                e[write.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e9) {
            }
            try {
                e[write.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTitleMargin$write.class */
    public enum write {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public setTitleMargin(setTitleMarginEnd settitlemarginend, write write2) {
        this.i = settitlemarginend;
        this.j = write2;
    }

    public final boolean a(setTitleMargin settitlemargin, int i, int i2, boolean z) {
        if (settitlemargin == null) {
            c();
            return true;
        } else if (!z && !e(settitlemargin)) {
            return false;
        } else {
            this.f = settitlemargin;
            if (settitlemargin.b == null) {
                settitlemargin.b = new HashSet<>();
            }
            HashSet<setTitleMargin> hashSet = this.f.b;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.c = i;
            } else {
                this.c = 0;
            }
            this.e = i2;
            return true;
        }
    }

    public final boolean b() {
        HashSet<setTitleMargin> hashSet = this.b;
        if (hashSet == null) {
            return false;
        }
        Iterator<setTitleMargin> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().e().f != null) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        HashSet<setTitleMargin> hashSet;
        setTitleMargin settitlemargin = this.f;
        if (!(settitlemargin == null || (hashSet = settitlemargin.b) == null)) {
            hashSet.remove(this);
            if (this.f.b.size() == 0) {
                this.f.b = null;
            }
        }
        this.b = null;
        this.f = null;
        this.c = 0;
        this.e = -1;
        this.a = false;
        this.d = 0;
    }

    public final int d() {
        setTitleMargin settitlemargin;
        if (this.i.ap == 8) {
            return 0;
        }
        return (this.e < 0 || (settitlemargin = this.f) == null || settitlemargin.i.ap != 8) ? this.c : this.e;
    }

    public final void d(int i, ArrayList<setReferencedIds> arrayList, setReferencedIds setreferencedids) {
        HashSet<setTitleMargin> hashSet = this.b;
        if (hashSet != null) {
            Iterator<setTitleMargin> it = hashSet.iterator();
            while (it.hasNext()) {
                setAllowsGoneWidget.a(it.next().i, i, arrayList, setreferencedids);
            }
        }
    }

    public final setTitleMargin e() {
        switch (AnonymousClass5.e[this.j.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.i.am;
            case 3:
                return this.i.F;
            case 4:
                return this.i.f281o;
            case 5:
                return this.i.al;
            default:
                throw new AssertionError(this.j.name());
        }
    }

    public final boolean e(setTitleMargin settitlemargin) {
        boolean z = false;
        boolean z2 = false;
        if (settitlemargin == null) {
            return false;
        }
        write write2 = settitlemargin.j;
        write write3 = this.j;
        if (write2 != write3) {
            switch (AnonymousClass5.e[this.j.ordinal()]) {
                case 1:
                    boolean z3 = false;
                    if (write2 != write.BASELINE) {
                        z3 = false;
                        if (write2 != write.CENTER_X) {
                            z3 = false;
                            if (write2 != write.CENTER_Y) {
                                z3 = true;
                            }
                        }
                    }
                    return z3;
                case 2:
                case 3:
                    boolean z4 = write2 == write.LEFT || write2 == write.RIGHT;
                    z = z4;
                    if (settitlemargin.i instanceof setInflatedId) {
                        if (z4 || write2 == write.CENTER_X) {
                            z = true;
                        }
                    }
                    return z;
                case 4:
                case 5:
                    boolean z5 = write2 == write.TOP || write2 == write.BOTTOM;
                    z2 = z5;
                    if (settitlemargin.i instanceof setInflatedId) {
                        if (z5 || write2 == write.CENTER_Y) {
                            z2 = true;
                        }
                    }
                    return z2;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.j.name());
            }
        } else if (write3 == write.BASELINE) {
            return settitlemargin.i.f && this.i.f;
        } else {
            return true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.i.u);
        sb.append(":");
        sb.append(this.j.toString());
        return sb.toString();
    }
}
