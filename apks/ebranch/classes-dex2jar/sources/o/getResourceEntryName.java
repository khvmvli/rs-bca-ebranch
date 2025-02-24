package o;

import android.graphics.Paint;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getResourceEntryName.class */
public final class getResourceEntryName implements name {
    public final boolean a;
    public final RemoteActionCompatParcelizer b;
    public final List<ImmutableList> c;
    public final write d;
    public final run e;
    public final float f;
    public final String g;
    public final ImmutableList h;
    public final size i;
    public final ImmutableList j;

    /* renamed from: o.getResourceEntryName$2 */
    /* loaded from: classes-dex2jar.jar:o/getResourceEntryName$2.class */
    public static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[write.values().length];
            a = iArr;
            try {
                iArr[write.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[write.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[write.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[RemoteActionCompatParcelizer.values().length];
            e = iArr2;
            try {
                iArr2[RemoteActionCompatParcelizer.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                e[RemoteActionCompatParcelizer.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                e[RemoteActionCompatParcelizer.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getResourceEntryName$RemoteActionCompatParcelizer.class */
    public enum RemoteActionCompatParcelizer {
        BUTT,
        ROUND,
        UNKNOWN
    }

    /* loaded from: classes-dex2jar.jar:o/getResourceEntryName$write.class */
    public enum write {
        MITER,
        ROUND,
        BEVEL;

        public final Paint.Join e() {
            int i = AnonymousClass2.a[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public getResourceEntryName(String str, ImmutableList immutableList, List<ImmutableList> list, run run, size size, ImmutableList immutableList2, RemoteActionCompatParcelizer remoteActionCompatParcelizer, write write2, float f, boolean z) {
        this.g = str;
        this.j = immutableList;
        this.c = list;
        this.e = run;
        this.i = size;
        this.h = immutableList2;
        this.b = remoteActionCompatParcelizer;
        this.d = write2;
        this.f = f;
        this.a = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new OnLongClick(settext, setpagecolor, this);
    }
}
