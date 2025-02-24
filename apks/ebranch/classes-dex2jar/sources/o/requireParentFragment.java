package o;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/requireParentFragment.class */
public final class requireParentFragment {
    static final IconCompatParcelizer c = new IconCompatParcelizer() { // from class: o.requireParentFragment.1
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
            if ((r0 >= 10.0f && r0 <= 37.0f && r5[1] <= 0.82f) == false) goto L_0x0059;
         */
        @Override // o.requireParentFragment.IconCompatParcelizer
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final boolean c(int r4, float[] r5) {
            /*
                r3 = this;
                r0 = r5
                r1 = 2
                r0 = r0[r1]
                r6 = r0
                r0 = 1
                r7 = r0
                r0 = r6
                r1 = 1064514355(0x3f733333, float:0.95)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0013
                r0 = 1
                r4 = r0
                goto L_0x0015
            L_0x0013:
                r0 = 0
                r4 = r0
            L_0x0015:
                r0 = r4
                if (r0 != 0) goto L_0x0056
                r0 = r5
                r1 = 2
                r0 = r0[r1]
                r1 = 1028443341(0x3d4ccccd, float:0.05)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x0027
                r0 = 1
                r4 = r0
                goto L_0x0029
            L_0x0027:
                r0 = 0
                r4 = r0
            L_0x0029:
                r0 = r4
                if (r0 != 0) goto L_0x0056
                r0 = r5
                r1 = 0
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                r1 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x004d
                r0 = r6
                r1 = 1108606976(0x42140000, float:37.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x004d
                r0 = r5
                r1 = 1
                r0 = r0[r1]
                r1 = 1062333317(0x3f51eb85, float:0.82)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x004d
                r0 = 1
                r4 = r0
                goto L_0x004f
            L_0x004d:
                r0 = 0
                r4 = r0
            L_0x004f:
                r0 = r4
                if (r0 != 0) goto L_0x0056
                goto L_0x0059
            L_0x0056:
                r0 = 0
                r7 = r0
            L_0x0059:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.requireParentFragment.AnonymousClass1.c(int, float[]):boolean");
        }
    };
    public final List<setAllowEnterTransitionOverlap> d;
    public final List<requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver> e;
    public final SparseBooleanArray j = new SparseBooleanArray();
    public final Map<setAllowEnterTransitionOverlap, requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver> b = new setThumbTextPadding();
    public final requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver a = c();

    /* loaded from: classes-dex2jar.jar:o/requireParentFragment$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        boolean c(int i, float[] fArr);
    }

    /* loaded from: classes-dex2jar.jar:o/requireParentFragment$write.class */
    public static final class write {
        public final Bitmap b;
        public Rect d;
        public final List<IconCompatParcelizer> e;
        public final List<setAllowEnterTransitionOverlap> g;
        public final List<requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver> i;
        public int c = 16;
        public int a = 12544;
        public int f = -1;

        public write(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.g = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(requireParentFragment.c);
            this.b = bitmap;
            this.i = null;
            arrayList.add(setAllowEnterTransitionOverlap.d);
            arrayList.add(setAllowEnterTransitionOverlap.f);
            arrayList.add(setAllowEnterTransitionOverlap.a);
            arrayList.add(setAllowEnterTransitionOverlap.e);
            arrayList.add(setAllowEnterTransitionOverlap.c);
            arrayList.add(setAllowEnterTransitionOverlap.b);
        }
    }

    public requireParentFragment(List<requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver> list, List<setAllowEnterTransitionOverlap> list2) {
        this.e = list;
        this.d = list2;
    }

    private requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver c() {
        int size = this.e.size();
        int i = Integer.MIN_VALUE;
        requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver requireparentfragment_mediabrowsercompat_customactionresultreceiver = null;
        for (int i2 = 0; i2 < size; i2++) {
            requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver requireparentfragment_mediabrowsercompat_customactionresultreceiver2 = this.e.get(i2);
            i = i;
            if (requireparentfragment_mediabrowsercompat_customactionresultreceiver2.d > i) {
                i = requireparentfragment_mediabrowsercompat_customactionresultreceiver2.d;
                requireparentfragment_mediabrowsercompat_customactionresultreceiver = requireparentfragment_mediabrowsercompat_customactionresultreceiver2;
            }
        }
        return requireparentfragment_mediabrowsercompat_customactionresultreceiver;
    }

    public static write e(Bitmap bitmap) {
        return new write(bitmap);
    }
}
