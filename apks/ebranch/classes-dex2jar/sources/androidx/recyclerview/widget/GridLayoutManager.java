package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import o.findFragmentByWho;
import o.getChildFragmentManager;
import o.setAnimations;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$ComponentActivity$3;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/GridLayoutManager.class */
public class GridLayoutManager extends LinearLayoutManager {
    private boolean E;
    int[] d;
    View[] i;
    boolean a = false;
    public int j = -1;
    final SparseIntArray b = new SparseIntArray();
    final SparseIntArray e = new SparseIntArray();
    read g = new RemoteActionCompatParcelizer();
    final Rect c = new Rect();

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver {
        int a = -1;
        int c = 0;

        public IconCompatParcelizer(int i, int i2) {
            super(i, i2);
        }

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/GridLayoutManager$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends read {
        @Override // androidx.recyclerview.widget.GridLayoutManager.read
        public final int e(int i, int i2) {
            return i % i2;
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/GridLayoutManager$read.class */
    public static abstract class read {
        final SparseIntArray c = new SparseIntArray();
        final SparseIntArray d = new SparseIntArray();
        private boolean b = false;
        private boolean e = false;

        private static int b(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private int d(int r5, int r6) {
            /*
                r4 = this;
                r0 = r4
                boolean r0 = r0.e
                if (r0 == 0) goto L_0x004b
                r0 = r4
                android.util.SparseIntArray r0 = r0.d
                r1 = r5
                int r0 = b(r0, r1)
                r7 = r0
                r0 = r7
                r1 = -1
                if (r0 == r1) goto L_0x004b
                r0 = r4
                android.util.SparseIntArray r0 = r0.d
                r1 = r7
                int r0 = r0.get(r1)
                r8 = r0
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                r9 = r0
                r0 = r4
                r1 = r7
                r2 = r6
                int r0 = r0.b(r1, r2)
                r1 = 1
                int r0 = r0 + r1
                r10 = r0
                r0 = r10
                r11 = r0
                r0 = r8
                r7 = r0
                r0 = r9
                r12 = r0
                r0 = r10
                r1 = r6
                if (r0 != r1) goto L_0x0053
                r0 = r8
                r1 = 1
                int r0 = r0 + r1
                r7 = r0
                r0 = r9
                r12 = r0
                goto L_0x0050
            L_0x004b:
                r0 = 0
                r7 = r0
                r0 = 0
                r12 = r0
            L_0x0050:
                r0 = 0
                r11 = r0
            L_0x0053:
                r0 = r12
                r1 = r5
                if (r0 >= r1) goto L_0x008e
                r0 = r11
                r1 = 1
                int r0 = r0 + r1
                r8 = r0
                r0 = r8
                r1 = r6
                if (r0 != r1) goto L_0x0070
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                r9 = r0
                r0 = 0
                r11 = r0
                goto L_0x0085
            L_0x0070:
                r0 = r8
                r11 = r0
                r0 = r7
                r9 = r0
                r0 = r8
                r1 = r6
                if (r0 <= r1) goto L_0x0085
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                r9 = r0
                r0 = 1
                r11 = r0
            L_0x0085:
                int r12 = r12 + 1
                r0 = r9
                r7 = r0
                goto L_0x0053
            L_0x008e:
                r0 = r7
                r5 = r0
                r0 = r11
                r1 = 1
                int r0 = r0 + r1
                r1 = r6
                if (r0 <= r1) goto L_0x009c
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                r5 = r0
            L_0x009c:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.read.d(int, int):int");
        }

        final int a(int i, int i2) {
            if (!this.e) {
                return d(i, i2);
            }
            int i3 = this.d.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.d.put(i, d);
            return d;
        }

        final int b(int i, int i2) {
            if (!this.b) {
                return e(i, i2);
            }
            int i3 = this.c.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.c.put(i, e);
            return e;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public int e(int r4, int r5) {
            /*
                r3 = this;
                r0 = 1
                r1 = r5
                if (r0 != r1) goto L_0x0007
                r0 = 0
                return r0
            L_0x0007:
                r0 = r3
                boolean r0 = r0.b
                if (r0 == 0) goto L_0x002a
                r0 = r3
                android.util.SparseIntArray r0 = r0.c
                r1 = r4
                int r0 = b(r0, r1)
                r6 = r0
                r0 = r6
                if (r0 < 0) goto L_0x002a
                r0 = r3
                android.util.SparseIntArray r0 = r0.c
                r1 = r6
                int r0 = r0.get(r1)
                r1 = 1
                int r0 = r0 + r1
                r7 = r0
                goto L_0x005e
            L_0x002a:
                r0 = 0
                r8 = r0
                r0 = 0
                r7 = r0
            L_0x0030:
                r0 = r8
                r1 = r4
                if (r0 >= r1) goto L_0x0066
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                r9 = r0
                r0 = r9
                r1 = r5
                if (r0 != r1) goto L_0x004b
                r0 = 0
                r7 = r0
                r0 = r8
                r6 = r0
                goto L_0x005e
            L_0x004b:
                r0 = r8
                r6 = r0
                r0 = r9
                r7 = r0
                r0 = r9
                r1 = r5
                if (r0 <= r1) goto L_0x005e
                r0 = 1
                r7 = r0
                r0 = r8
                r6 = r0
            L_0x005e:
                r0 = r6
                r1 = 1
                int r0 = r0 + r1
                r8 = r0
                goto L_0x0030
            L_0x0066:
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                r1 = r5
                if (r0 > r1) goto L_0x0071
                r0 = r7
                return r0
            L_0x0071:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.read.e(int, int):int");
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        m(3);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(1, false);
        m(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m(a(context, attributeSet, i, i2).b);
    }

    private void A() {
        int i;
        int i2;
        if (this.h == 1) {
            int q = q();
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
            int paddingRight = q - (setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingRight() : 0);
            setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.x;
            i = paddingRight;
            i2 = 0;
            if (setonstartentertransitionlistener2 != null) {
                i2 = setonstartentertransitionlistener2.getPaddingLeft();
                i = paddingRight;
            }
        } else {
            int p = p();
            setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.x;
            int paddingBottom = p - (setonstartentertransitionlistener3 != null ? setonstartentertransitionlistener3.getPaddingBottom() : 0);
            setOnStartEnterTransitionListener setonstartentertransitionlistener4 = this.x;
            i = paddingBottom;
            i2 = 0;
            if (setonstartentertransitionlistener4 != null) {
                i2 = setonstartentertransitionlistener4.getPaddingTop();
                i = paddingBottom;
            }
        }
        f(i - i2);
    }

    private void a(float f, int i) {
        f(Math.max(Math.round(f * ((float) this.j)), i));
    }

    private void a(View view, int i, boolean z) {
        int i2;
        int i3;
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) view.getLayoutParams();
        Rect rect = iconCompatParcelizer.e;
        int i4 = rect.top + rect.bottom + iconCompatParcelizer.topMargin + iconCompatParcelizer.bottomMargin;
        int i5 = rect.left + rect.right + iconCompatParcelizer.leftMargin + iconCompatParcelizer.rightMargin;
        int j = j(iconCompatParcelizer.a, iconCompatParcelizer.c);
        if (this.h == 1) {
            i2 = a(j, i, i5, iconCompatParcelizer.width, false);
            i3 = a(this.f7o.i(), r(), i4, iconCompatParcelizer.height, true);
        } else {
            i3 = a(j, i, i4, iconCompatParcelizer.height, false);
            i2 = a(this.f7o.i(), v(), i5, iconCompatParcelizer.width, true);
        }
        c(view, i2, i3, z);
    }

    private void b(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        if (z) {
            i3 = 1;
            i2 = i;
        } else {
            i4 = i - 1;
            i2 = -1;
            i3 = -1;
        }
        int i5 = 0;
        while (i4 != i2) {
            View view = this.i[i4];
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) view.getLayoutParams();
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
            int i6 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
            int i7 = i6;
            if (i6 == -1) {
                i7 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
            }
            iconCompatParcelizer.c = c(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, i7);
            iconCompatParcelizer.a = i5;
            i5 += iconCompatParcelizer.c;
            i4 += i3;
        }
    }

    private int c(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int i) {
        if (!immLeaksCleaner.b) {
            return 1;
        }
        int i2 = this.b.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (setonstartentertransitionlistener_componentactivity_3.a(i) != -1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    private void c(View view, int i, int i2, boolean z) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
        if (z ? b(view, i, i2, setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver) : e(view, i, i2, setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver)) {
            view.measure(i, i2);
        }
    }

    private int d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int i) {
        if (!immLeaksCleaner.b) {
            return this.g.b(i, this.j);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = setonstartentertransitionlistener_componentactivity_3.a(i);
        if (a != -1) {
            return this.g.b(a, this.j);
        }
        StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    private int e(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int i) {
        if (!immLeaksCleaner.b) {
            return this.g.a(i, this.j);
        }
        int a = setonstartentertransitionlistener_componentactivity_3.a(i);
        if (a != -1) {
            return this.g.a(a, this.j);
        }
        StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r0[r0.length - 1] != r5) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void f(int r5) {
        /*
            r4 = this;
            r0 = r4
            int[] r0 = r0.d
            r6 = r0
            r0 = r4
            int r0 = r0.j
            r7 = r0
            r0 = 1
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0026
            r0 = r6
            int r0 = r0.length
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            if (r0 != r1) goto L_0x0026
            r0 = r6
            r9 = r0
            r0 = r6
            r1 = r6
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r5
            if (r0 == r1) goto L_0x002d
        L_0x0026:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r9 = r0
        L_0x002d:
            r0 = 0
            r10 = r0
            r0 = r9
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r5
            r1 = r7
            int r0 = r0 / r1
            r11 = r0
            r0 = r5
            r1 = r7
            int r0 = r0 % r1
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r10
            r5 = r0
        L_0x0045:
            r0 = r8
            r1 = r7
            if (r0 > r1) goto L_0x0081
            r0 = r5
            r1 = r12
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            if (r0 <= 0) goto L_0x0069
            r0 = r7
            r1 = r5
            int r0 = r0 - r1
            r1 = r12
            if (r0 >= r1) goto L_0x0069
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r5
            r1 = r7
            int r0 = r0 - r1
            r5 = r0
            goto L_0x006d
        L_0x0069:
            r0 = r11
            r10 = r0
        L_0x006d:
            r0 = r13
            r1 = r10
            int r0 = r0 + r1
            r13 = r0
            r0 = r9
            r1 = r8
            r2 = r13
            r0[r1] = r2
            int r8 = r8 + 1
            goto L_0x0045
        L_0x0081:
            r0 = r4
            r1 = r9
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.f(int):void");
    }

    private int g(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        setAnimations setanimations = this.s;
        if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0) {
            return 0;
        }
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) == 0) {
            return 0;
        }
        j();
        View b = b(!n(), true);
        View d = d(!n(), true);
        if (b == null || d == null) {
            return 0;
        }
        if (!n()) {
            return this.g.a((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) - 1, this.j) + 1;
        }
        int b2 = this.f7o.b(d);
        int d2 = this.f7o.d(b);
        read read2 = this.g;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b.getLayoutParams()).h;
        int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
        int i2 = i;
        if (i == -1) {
            i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
        }
        int a = read2.a(i2, this.j);
        read read3 = this.g;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) d.getLayoutParams()).h;
        int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.m;
        int i4 = i3;
        if (i3 == -1) {
            i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k;
        }
        return (int) ((((float) (b2 - d2)) / ((float) ((read3.a(i4, this.j) - a) + 1))) * ((float) (this.g.a((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) - 1, this.j) + 1)));
    }

    private int i(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        setAnimations setanimations = this.s;
        if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0) {
            return 0;
        }
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) == 0) {
            return 0;
        }
        j();
        boolean n = n();
        boolean z = !n;
        View b = b(z, true);
        View d = d(z, true);
        if (b == null || d == null) {
            return 0;
        }
        read read2 = this.g;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b.getLayoutParams()).h;
        int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
        int i2 = i;
        if (i == -1) {
            i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
        }
        int a = read2.a(i2, this.j);
        read read3 = this.g;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) d.getLayoutParams()).h;
        int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.m;
        int i4 = i3;
        if (i3 == -1) {
            i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k;
        }
        int a2 = read3.a(i4, this.j);
        int max = this.n ? Math.max(0, ((this.g.a((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) - 1, this.j) + 1) - Math.max(a, a2)) - 1) : Math.max(0, Math.min(a, a2));
        if (!n) {
            return max;
        }
        int abs = Math.abs(this.f7o.b(d) - this.f7o.d(b));
        read read4 = this.g;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b.getLayoutParams()).h;
        int i5 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3.m;
        int i6 = i5;
        if (i5 == -1) {
            i6 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3.k;
        }
        int a3 = read4.a(i6, this.j);
        read read5 = this.g;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable4 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) d.getLayoutParams()).h;
        int i7 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable4.m;
        int i8 = i7;
        if (i7 == -1) {
            i8 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable4.k;
        }
        return Math.round((((float) max) * (((float) abs) / ((float) ((read5.a(i8, this.j) - a3) + 1)))) + ((float) (this.f7o.g() - this.f7o.d(b))));
    }

    private int j(int i, int i2) {
        boolean z = true;
        if (this.h == 1) {
            if (findFragmentByWho.k(this.x) != 1) {
                z = false;
            }
            if (z) {
                int[] iArr = this.d;
                int i3 = this.j - i;
                return iArr[i3] - iArr[i3 - i2];
            }
        }
        int[] iArr2 = this.d;
        return iArr2[i2 + i] - iArr2[i];
    }

    private void m(int i) {
        if (i != this.j) {
            this.a = true;
            if (i > 0) {
                this.j = i;
                this.g.c.clear();
                setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
                if (setonstartentertransitionlistener != null) {
                    setonstartentertransitionlistener.requestLayout();
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int a(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        if (this.h == 0) {
            return this.j;
        }
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) <= 0) {
            return 0;
        }
        return e(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, (immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int a(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return this.E ? i(immLeaksCleaner) : a(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(int i, int i2) {
        this.g.c.clear();
        this.g.d.clear();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.d == null) {
            a(rect, i, i2);
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        int i5 = 0;
        int paddingLeft = setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingLeft() : 0;
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.x;
        int paddingRight = paddingLeft + (setonstartentertransitionlistener2 != null ? setonstartentertransitionlistener2.getPaddingRight() : 0);
        setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.x;
        int paddingTop = setonstartentertransitionlistener3 != null ? setonstartentertransitionlistener3.getPaddingTop() : 0;
        setOnStartEnterTransitionListener setonstartentertransitionlistener4 = this.x;
        if (setonstartentertransitionlistener4 != null) {
            i5 = setonstartentertransitionlistener4.getPaddingBottom();
        }
        int i6 = paddingTop + i5;
        if (this.h == 1) {
            i4 = c(i2, rect.height() + i6, findFragmentByWho.m(this.x));
            int[] iArr = this.d;
            i3 = c(i, iArr[iArr.length - 1] + paddingRight, findFragmentByWho.o(this.x));
        } else {
            i3 = c(i, rect.width() + paddingRight, findFragmentByWho.o(this.x));
            int[] iArr2 = this.d;
            i4 = c(i2, iArr2[iArr2.length - 1] + i6, findFragmentByWho.m(this.x));
        }
        this.x.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final boolean a() {
        return this.l == null && !this.a;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver b(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new IconCompatParcelizer((ViewGroup.MarginLayoutParams) layoutParams) : new IconCompatParcelizer(layoutParams);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void b() {
        this.g.c.clear();
        this.g.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver, int i) {
        int i2;
        int d;
        b(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver, i);
        A();
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) > 0 && !immLeaksCleaner.b) {
            boolean z = i == 1;
            int d2 = d(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c);
            if (z) {
                while (d2 > 0 && linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c > 0) {
                    linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c--;
                    d2 = d(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c);
                }
            } else {
                int i3 = immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f;
                int i4 = linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c;
                while (i4 < i3 - 1 && (d = d(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, (i2 = i4 + 1))) > d2) {
                    i4 = i2;
                    d2 = d;
                }
                linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c = i4;
            }
        }
        View[] viewArr = this.i;
        if (viewArr == null || viewArr.length != this.j) {
            this.i = new View[this.j];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump */
    final void b(o.setOnStartEnterTransitionListener$ComponentActivity$3 r7, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r8, androidx.recyclerview.widget.LinearLayoutManager.write r9, androidx.recyclerview.widget.LinearLayoutManager.IconCompatParcelizer r10) {
        /*
        // Method dump skipped, instructions count: 1293
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b(o.setOnStartEnterTransitionListener$ComponentActivity$3, o.setOnStartEnterTransitionListener$ImmLeaksCleaner, androidx.recyclerview.widget.LinearLayoutManager$write, androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void b(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        b(immLeaksCleaner);
        this.a = false;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void b(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
        this.g.c.clear();
        this.g.d.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int c(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        A();
        View[] viewArr = this.i;
        if (viewArr == null || viewArr.length != this.j) {
            this.i = new View[this.j];
        }
        return c(i, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return this.E ? i(immLeaksCleaner) : c(immLeaksCleaner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01da, code lost:
        if (r20 == (r0 > r24)) goto L_0x023d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0237, code lost:
        if (r20 != (r0 > r8)) goto L_0x0243;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.view.View c(android.view.View r7, int r8, o.setOnStartEnterTransitionListener$ComponentActivity$3 r9, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r10) {
        /*
        // Method dump skipped, instructions count: 698
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c(android.view.View, int, o.setOnStartEnterTransitionListener$ComponentActivity$3, o.setOnStartEnterTransitionListener$ImmLeaksCleaner):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final View c(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, boolean z, boolean z2) {
        int i;
        int i2;
        setAnimations setanimations = this.s;
        int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
        if (z2) {
            setAnimations setanimations2 = this.s;
            i2 = (setanimations2 != null ? setanimations2.b.c() - setanimations2.e.size() : 0) - 1;
            c = -1;
            i = -1;
        } else {
            i2 = 0;
            i = 1;
        }
        int i3 = immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f;
        j();
        int g = this.f7o.g();
        int b = this.f7o.b();
        View view = null;
        View view2 = null;
        while (i2 != c) {
            View h = h(i2);
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) h.getLayoutParams()).h;
            int i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
            int i5 = i4;
            if (i4 == -1) {
                i5 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
            }
            if (i5 < 0 || i5 >= i3) {
                view2 = view2;
                view = view;
            } else if (d(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, i5) != 0) {
                view = view;
                view2 = view2;
            } else {
                if ((((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) h.getLayoutParams()).h.c & 8) != 0) {
                    view = view;
                    view2 = view2;
                    if (view2 == null) {
                        view = view;
                        view2 = h;
                    }
                } else if (this.f7o.d(h) < b && this.f7o.b(h) >= g) {
                    return h;
                } else {
                    view = view;
                    view2 = view2;
                    if (view == null) {
                        view = h;
                        view2 = view2;
                    }
                }
            }
            i2 += i;
        }
        View view3 = view;
        if (view == null) {
            view3 = view2;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void c(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        if (immLeaksCleaner.b) {
            setAnimations setanimations = this.s;
            int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
            for (int i = 0; i < c; i++) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) h(i).getLayoutParams();
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = iconCompatParcelizer.h;
                int i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                int i3 = i2;
                if (i2 == -1) {
                    i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                }
                this.b.put(i3, iconCompatParcelizer.c);
                this.e.put(i3, iconCompatParcelizer.a);
            }
        }
        c(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
        this.b.clear();
        this.e.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final void c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, LinearLayoutManager.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.read read2) {
        boolean z;
        int i = this.j;
        for (int i2 = 0; i2 < this.j; i2++) {
            int i3 = write.c;
            if (i3 >= 0) {
                if (i3 < (immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f)) {
                    z = true;
                    if (z && i > 0) {
                        read2.c(write.c, Math.max(0, write.l));
                        i--;
                        write.c += write.i;
                    } else {
                        return;
                    }
                }
            }
            z = false;
            if (z) {
                return;
            }
            return;
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        if (this.h == 1) {
            return this.j;
        }
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) <= 0) {
            return 0;
        }
        return e(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, (immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int d(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return this.E ? g(immLeaksCleaner) : d(immLeaksCleaner);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver d() {
        return this.h == 0 ? new IconCompatParcelizer(-2, -1) : new IconCompatParcelizer(-1, -2);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void d(int i, int i2) {
        this.g.c.clear();
        this.g.d.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d(boolean z) {
        if (!z) {
            d(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int e(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        A();
        View[] viewArr = this.i;
        if (viewArr == null || viewArr.length != this.j) {
            this.i = new View[this.j];
        }
        return e(i, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int e(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return this.E ? g(immLeaksCleaner) : e(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver e(Context context, AttributeSet attributeSet) {
        return new IconCompatParcelizer(context, attributeSet);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void e(int i, int i2) {
        this.g.c.clear();
        this.g.d.clear();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void e(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, View view, getChildFragmentManager getchildfragmentmanager) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof IconCompatParcelizer)) {
            e(view, getchildfragmentmanager);
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) layoutParams;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = iconCompatParcelizer.h;
        int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
        int i2 = i;
        if (i == -1) {
            i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
        }
        int e = e(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, i2);
        if (this.h == 0) {
            getchildfragmentmanager.b(getChildFragmentManager.IconCompatParcelizer.c(iconCompatParcelizer.a, iconCompatParcelizer.c, e, 1, false, false));
        } else {
            getchildfragmentmanager.b(getChildFragmentManager.IconCompatParcelizer.c(e, 1, iconCompatParcelizer.a, iconCompatParcelizer.c, false, false));
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final boolean e(setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver) {
        return setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver instanceof IconCompatParcelizer;
    }
}
