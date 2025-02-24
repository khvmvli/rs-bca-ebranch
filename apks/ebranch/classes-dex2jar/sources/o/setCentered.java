package o;

import java.util.List;
import java.util.Locale;
import o.ListenerClass;
/* loaded from: classes-dex2jar.jar:o/setCentered.class */
public final class setCentered {
    final boolean a;
    final BindAnim b;
    final ListenerClass.NONE c;
    final List<onClickBcaKlikpay<Float>> d;
    final setSafeMode e;
    public final long f;
    public final setCentered$MediaBrowserCompat$CustomActionResultReceiver g;
    final List<findRequiredView> h;
    final String i;
    final read j;
    final List<name> k;
    final int l;
    final long m;
    final int n;

    /* renamed from: o */
    final String f204o;
    final int p;
    final C0038setter q;
    final int r;
    final float s;
    final int t;
    final remover u;
    final float w;
    final type x;
    final ImmutableList y;

    /* loaded from: classes-dex2jar.jar:o/setCentered$read.class */
    public enum read {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public setCentered(List<name> list, BindAnim bindAnim, String str, long j, setCentered$MediaBrowserCompat$CustomActionResultReceiver setcentered_mediabrowsercompat_customactionresultreceiver, long j2, String str2, List<findRequiredView> list2, type type, int i, int i2, int i3, float f, float f2, int i4, int i5, C0038setter setter, remover remover, List<onClickBcaKlikpay<Float>> list3, read read2, ImmutableList immutableList, boolean z, ListenerClass.NONE none, setSafeMode setsafemode) {
        this.k = list;
        this.b = bindAnim;
        this.i = str;
        this.f = j;
        this.g = setcentered_mediabrowsercompat_customactionresultreceiver;
        this.m = j2;
        this.f204o = str2;
        this.h = list2;
        this.x = type;
        this.p = i;
        this.t = i2;
        this.r = i3;
        this.w = f;
        this.s = f2;
        this.l = i4;
        this.n = i5;
        this.q = setter;
        this.u = remover;
        this.d = list3;
        this.j = read2;
        this.y = immutableList;
        this.a = z;
        this.c = none;
        this.e = setsafemode;
    }

    public final String d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.i);
        sb.append("\n");
        setCentered a = this.b.j.a(this.m, null);
        if (a != null) {
            sb.append("\t\tParents: ");
            sb.append(a.i);
            setCentered a2 = this.b.j.a(a.m, null);
            while (true) {
                setCentered setcentered = a2;
                if (setcentered == null) {
                    break;
                }
                sb.append("->");
                sb.append(setcentered.i);
                a2 = this.b.j.a(setcentered.m, null);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.h.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.h.size());
            sb.append("\n");
        }
        if (!(this.p == 0 || this.t == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.p), Integer.valueOf(this.t), Integer.valueOf(this.r)));
        }
        if (!this.k.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (name name : this.k) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(name);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return d("");
    }
}
