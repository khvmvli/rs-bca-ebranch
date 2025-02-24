package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import o.findFragmentByWho;
import o.setEnterTransition;
import o.setFocusedView;
import o.setMenuVisibility;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$ComponentActivity$3;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.setRetainInstance;
/* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager.class */
public class StaggeredGridLayoutManager extends setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver implements setOnStartEnterTransitionListener.ParcelableVolumeInfo.write {
    private boolean E;
    private StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver F;
    private int[] G;
    private int H;
    private final setEnterTransition I;
    private BitSet J;
    private int K;
    setMenuVisibility b;
    public IconCompatParcelizer[] g;
    setMenuVisibility h;
    private int l;

    /* renamed from: o */
    private boolean f9o;
    public int f = -1;
    public boolean e = false;
    boolean i = false;
    int c = -1;
    int d = Integer.MIN_VALUE;
    RemoteActionCompatParcelizer a = new RemoteActionCompatParcelizer();
    private int m = 2;
    private final Rect L = new Rect();
    private final read j = new read();
    private boolean k = false;
    private boolean N = true;
    private final Runnable n = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.2
        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.j();
        }
    };

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer.class */
    public final class IconCompatParcelizer {
        final int a;
        public ArrayList<View> b = new ArrayList<>();
        int e = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;

        IconCompatParcelizer(int i) {
            StaggeredGridLayoutManager.this = r5;
            this.a = i;
        }

        final void a() {
            int i = 0;
            View view = this.b.get(0);
            write write = (write) view.getLayoutParams();
            this.e = StaggeredGridLayoutManager.this.b.d(view);
            if (write.a) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = StaggeredGridLayoutManager.this.a;
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = write.h;
                int i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                int i3 = i2;
                if (i2 == -1) {
                    i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                }
                RemoteActionCompatParcelizer.IconCompatParcelizer a = remoteActionCompatParcelizer.a(i3);
                if (a != null && a.e == -1) {
                    int i4 = this.e;
                    int i5 = this.a;
                    int[] iArr = a.a;
                    if (iArr != null) {
                        i = iArr[i5];
                    }
                    this.e = i4 - i;
                }
            }
        }

        final void a(int i) {
            int i2 = this.e;
            if (i2 != Integer.MIN_VALUE) {
                this.e = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        final void a(View view) {
            write write = (write) view.getLayoutParams();
            write.c = this;
            this.b.add(view);
            this.c = Integer.MIN_VALUE;
            boolean z = true;
            if (this.b.size() == 1) {
                this.e = Integer.MIN_VALUE;
            }
            if (!((write.h.c & 8) != 0)) {
                if ((write.h.c & 2) == 0) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            this.d += StaggeredGridLayoutManager.this.b.a(view);
        }

        public final int b() {
            return StaggeredGridLayoutManager.this.e ? b(0, this.b.size(), false, false, true) : b(this.b.size() - 1, -1, false, false, true);
        }

        public final int b(int i, int i2, boolean z, boolean z2, boolean z3) {
            int g = StaggeredGridLayoutManager.this.b.g();
            int b = StaggeredGridLayoutManager.this.b.b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.b.get(i);
                int d = StaggeredGridLayoutManager.this.b.d(view);
                int b2 = StaggeredGridLayoutManager.this.b.b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? b2 > g : b2 >= g) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.f(view);
                        }
                        if (d < g || b2 > b) {
                            return StaggeredGridLayoutManager.f(view);
                        }
                    } else if (d >= g && b2 <= b) {
                        return StaggeredGridLayoutManager.f(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        final int c(int i) {
            int i2 = this.e;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.b.size() == 0) {
                return i;
            }
            a();
            return this.e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
            if (r9 != false) goto L_0x005d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        final void c() {
            /*
                r5 = this;
                r0 = r5
                java.util.ArrayList<android.view.View> r0 = r0.b
                int r0 = r0.size()
                r6 = r0
                r0 = r5
                java.util.ArrayList<android.view.View> r0 = r0.b
                r1 = r6
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.remove(r1)
                android.view.View r0 = (android.view.View) r0
                r7 = r0
                r0 = r7
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$write r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.write) r0
                r8 = r0
                r0 = r8
                r1 = 0
                r0.c = r1
                r0 = r8
                o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.h
                int r0 = r0.c
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = r9
                r1 = 8
                r0 = r0 & r1
                if (r0 == 0) goto L_0x003d
                r0 = 1
                r9 = r0
                goto L_0x0040
            L_0x003d:
                r0 = 0
                r9 = r0
            L_0x0040:
                r0 = r9
                if (r0 != 0) goto L_0x005d
                r0 = r10
                r9 = r0
                r0 = r8
                o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.h
                int r0 = r0.c
                r1 = 2
                r0 = r0 & r1
                if (r0 == 0) goto L_0x0058
                r0 = 1
                r9 = r0
            L_0x0058:
                r0 = r9
                if (r0 == 0) goto L_0x0071
            L_0x005d:
                r0 = r5
                r1 = r5
                int r1 = r1.d
                r2 = r5
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                o.setMenuVisibility r2 = r2.b
                r3 = r7
                int r2 = r2.a(r3)
                int r1 = r1 - r2
                r0.d = r1
            L_0x0071:
                r0 = r6
                r1 = 1
                if (r0 != r1) goto L_0x007c
                r0 = r5
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.e = r1
            L_0x007c:
                r0 = r5
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.c = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer.c():void");
        }

        final int d(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.b.size() == 0) {
                return i;
            }
            d();
            return this.c;
        }

        public final View d(int i, int i2) {
            View view;
            View view2 = null;
            View view3 = null;
            if (i2 != -1) {
                int size = this.b.size() - 1;
                while (true) {
                    view = view2;
                    if (size < 0) {
                        break;
                    }
                    View view4 = this.b.get(size);
                    if (StaggeredGridLayoutManager.this.e) {
                        view = view2;
                        if (StaggeredGridLayoutManager.f(view4) >= i) {
                            break;
                        }
                    }
                    if (!StaggeredGridLayoutManager.this.e && StaggeredGridLayoutManager.f(view4) <= i) {
                        view = view2;
                        break;
                    }
                    view = view2;
                    if (!view4.hasFocusable()) {
                        break;
                    }
                    size--;
                    view2 = view4;
                }
            } else {
                int size2 = this.b.size();
                int i3 = 0;
                while (true) {
                    view = view3;
                    if (i3 >= size2) {
                        break;
                    }
                    View view5 = this.b.get(i3);
                    if (StaggeredGridLayoutManager.this.e) {
                        view = view3;
                        if (StaggeredGridLayoutManager.f(view5) <= i) {
                            break;
                        }
                    }
                    if (!StaggeredGridLayoutManager.this.e && StaggeredGridLayoutManager.f(view5) >= i) {
                        view = view3;
                        break;
                    }
                    view = view3;
                    if (!view5.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view3 = view5;
                }
            }
            return view;
        }

        final void d() {
            ArrayList<View> arrayList = this.b;
            View view = arrayList.get(arrayList.size() - 1);
            write write = (write) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.b.b(view);
            if (write.a) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = StaggeredGridLayoutManager.this.a;
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = write.h;
                int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                int i2 = i;
                if (i == -1) {
                    i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                }
                RemoteActionCompatParcelizer.IconCompatParcelizer a = remoteActionCompatParcelizer.a(i2);
                if (a != null && a.e == 1) {
                    int i3 = this.c;
                    int i4 = this.a;
                    int[] iArr = a.a;
                    this.c = i3 + (iArr == null ? 0 : iArr[i4]);
                }
            }
        }

        public final int e() {
            return StaggeredGridLayoutManager.this.e ? b(this.b.size() - 1, -1, false, false, true) : b(0, this.b.size(), false, false, true);
        }

        final void e(View view) {
            write write = (write) view.getLayoutParams();
            write.c = this;
            boolean z = false;
            this.b.add(0, view);
            this.e = Integer.MIN_VALUE;
            if (this.b.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (!((write.h.c & 8) != 0)) {
                if ((write.h.c & 2) != 0) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            this.d += StaggeredGridLayoutManager.this.b.a(view);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
            if (r9 != false) goto L_0x005f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        final void g() {
            /*
                r5 = this;
                r0 = r5
                java.util.ArrayList<android.view.View> r0 = r0.b
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = r6
                r1 = 0
                java.lang.Object r0 = r0.remove(r1)
                android.view.View r0 = (android.view.View) r0
                r6 = r0
                r0 = r6
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$write r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.write) r0
                r8 = r0
                r0 = r8
                r1 = 0
                r0.c = r1
                r0 = r5
                java.util.ArrayList<android.view.View> r0 = r0.b
                int r0 = r0.size()
                if (r0 != 0) goto L_0x002d
                r0 = r5
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.c = r1
            L_0x002d:
                r0 = r8
                o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.h
                int r0 = r0.c
                r1 = 8
                r0 = r0 & r1
                if (r0 == 0) goto L_0x0040
                r0 = 1
                r9 = r0
                goto L_0x0043
            L_0x0040:
                r0 = 0
                r9 = r0
            L_0x0043:
                r0 = r9
                if (r0 != 0) goto L_0x005f
                r0 = r7
                r9 = r0
                r0 = r8
                o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.h
                int r0 = r0.c
                r1 = 2
                r0 = r0 & r1
                if (r0 == 0) goto L_0x005a
                r0 = 1
                r9 = r0
            L_0x005a:
                r0 = r9
                if (r0 == 0) goto L_0x0073
            L_0x005f:
                r0 = r5
                r1 = r5
                int r1 = r1.d
                r2 = r5
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                o.setMenuVisibility r2 = r2.b
                r3 = r6
                int r2 = r2.a(r3)
                int r1 = r1 - r2
                r0.d = r1
            L_0x0073:
                r0 = r5
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer.g():void");
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        List<IconCompatParcelizer> a;
        int[] b;

        /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$RemoteActionCompatParcelizer$IconCompatParcelizer.class */
        public static class IconCompatParcelizer implements Parcelable {
            public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.Creator<IconCompatParcelizer>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.RemoteActionCompatParcelizer.IconCompatParcelizer.2
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ IconCompatParcelizer createFromParcel(Parcel parcel) {
                    return new IconCompatParcelizer(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ IconCompatParcelizer[] newArray(int i) {
                    return new IconCompatParcelizer[i];
                }
            };
            int[] a;
            int b;
            boolean c;
            int e;

            IconCompatParcelizer() {
            }

            IconCompatParcelizer(Parcel parcel) {
                this.b = parcel.readInt();
                this.e = parcel.readInt();
                this.c = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.a = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // java.lang.Object
            public String toString() {
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.b);
                sb.append(", mGapDir=");
                sb.append(this.e);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.c);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.a));
                sb.append('}');
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.e);
                parcel.writeInt(this.c ? 1 : 0);
                int[] iArr = this.a;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.a);
            }
        }

        RemoteActionCompatParcelizer() {
        }

        private void a(int i, int i2) {
            List<IconCompatParcelizer> list = this.a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    IconCompatParcelizer iconCompatParcelizer = this.a.get(size);
                    if (iconCompatParcelizer.b >= i) {
                        if (iconCompatParcelizer.b < i + i2) {
                            this.a.remove(size);
                        } else {
                            iconCompatParcelizer.b -= i2;
                        }
                    }
                }
            }
        }

        private void b(int i, int i2) {
            List<IconCompatParcelizer> list = this.a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    IconCompatParcelizer iconCompatParcelizer = this.a.get(size);
                    if (iconCompatParcelizer.b >= i) {
                        iconCompatParcelizer.b += i2;
                    }
                }
            }
        }

        private int c(int i) {
            int i2;
            if (this.a == null) {
                return -1;
            }
            IconCompatParcelizer a = a(i);
            if (a != null) {
                this.a.remove(a);
            }
            int size = this.a.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i2 = -1;
                    break;
                }
                i2 = i3;
                if (this.a.get(i3).b >= i) {
                    break;
                }
                i3++;
            }
            if (i2 == -1) {
                return -1;
            }
            IconCompatParcelizer iconCompatParcelizer = this.a.get(i2);
            this.a.remove(i2);
            return iconCompatParcelizer.b;
        }

        public final IconCompatParcelizer a(int i) {
            List<IconCompatParcelizer> list = this.a;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                IconCompatParcelizer iconCompatParcelizer = this.a.get(size);
                if (iconCompatParcelizer.b == i) {
                    return iconCompatParcelizer;
                }
            }
            return null;
        }

        public final IconCompatParcelizer a(int i, int i2, int i3, boolean z) {
            List<IconCompatParcelizer> list = this.a;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                IconCompatParcelizer iconCompatParcelizer = this.a.get(i4);
                if (iconCompatParcelizer.b >= i2) {
                    return null;
                }
                if (iconCompatParcelizer.b >= i && (i3 == 0 || iconCompatParcelizer.e == i3 || iconCompatParcelizer.c)) {
                    return iconCompatParcelizer;
                }
            }
            return null;
        }

        final int b(int i) {
            int[] iArr = this.b;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int c = c(i);
            if (c == -1) {
                int[] iArr2 = this.b;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.b.length;
            }
            int min = Math.min(c + 1, this.b.length);
            Arrays.fill(this.b, i, min, -1);
            return min;
        }

        final void c(int i, int i2) {
            int[] iArr = this.b;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                d(i3);
                int[] iArr2 = this.b;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.b, i, i3, -1);
                b(i, i2);
            }
        }

        final void d(int i) {
            int[] iArr = this.b;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.b = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length <<= 1;
                }
                int[] iArr3 = new int[length];
                this.b = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.b;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        final int e(int i) {
            List<IconCompatParcelizer> list = this.a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.a.get(size).b >= i) {
                        this.a.remove(size);
                    }
                }
            }
            return b(i);
        }

        final void e(int i, int i2) {
            int[] iArr = this.b;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                d(i3);
                int[] iArr2 = this.b;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.b;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                a(i, i2);
            }
        }

        public final void e(IconCompatParcelizer iconCompatParcelizer) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                IconCompatParcelizer iconCompatParcelizer2 = this.a.get(i);
                if (iconCompatParcelizer2.b == iconCompatParcelizer.b) {
                    this.a.remove(i);
                }
                if (iconCompatParcelizer2.b >= iconCompatParcelizer.b) {
                    this.a.add(i, iconCompatParcelizer);
                    return;
                }
            }
            this.a.add(iconCompatParcelizer);
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$read.class */
    public final class read {
        boolean a;
        int b;
        int[] c;
        boolean d;
        int e;
        boolean i;

        read() {
            StaggeredGridLayoutManager.this = r4;
            e();
        }

        final void e() {
            this.b = -1;
            this.e = Integer.MIN_VALUE;
            this.d = false;
            this.a = false;
            this.i = false;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$write.class */
    public static final class write extends setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver {
        boolean a;
        IconCompatParcelizer c;

        public write(int i, int i2) {
            super(i, i2);
        }

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public write(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.write a = a(context, attributeSet, i, i2);
        int i3 = a.c;
        if (i3 == 0 || i3 == 1) {
            if (this.F == null) {
                a((String) null);
            }
            if (i3 != this.H) {
                this.H = i3;
                setMenuVisibility setmenuvisibility = this.b;
                this.b = this.h;
                this.h = setmenuvisibility;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
                if (setonstartentertransitionlistener != null) {
                    setonstartentertransitionlistener.requestLayout();
                }
            }
            n(a.b);
            a(a.e);
            this.I = new setEnterTransition();
            this.b = setMenuVisibility.a(this, this.H);
            this.h = setMenuVisibility.a(this, 1 - this.H);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    private static int a(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    private void a(View view, int i, int i2, boolean z) {
        Rect rect = this.L;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(setonstartentertransitionlistener.h(view));
        }
        write write2 = (write) view.getLayoutParams();
        int a = a(i, write2.leftMargin + this.L.left, write2.rightMargin + this.L.right);
        int a2 = a(i2, write2.topMargin + this.L.top, write2.bottomMargin + this.L.bottom);
        if (z ? b(view, a, a2, write2) : e(view, a, a2, write2)) {
            view.measure(a, a2);
        }
    }

    private void a(IconCompatParcelizer iconCompatParcelizer, int i, int i2) {
        int i3 = iconCompatParcelizer.d;
        if (i == -1) {
            int i4 = iconCompatParcelizer.e;
            if (i4 == Integer.MIN_VALUE) {
                iconCompatParcelizer.a();
                i4 = iconCompatParcelizer.e;
            }
            if (i4 + i3 <= i2) {
                this.J.set(iconCompatParcelizer.a, false);
                return;
            }
            return;
        }
        int i5 = iconCompatParcelizer.c;
        if (i5 == Integer.MIN_VALUE) {
            iconCompatParcelizer.d();
            i5 = iconCompatParcelizer.c;
        }
        if (i5 - i3 >= i2) {
            this.J.set(iconCompatParcelizer.a, false);
        }
    }

    private void a(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, int i) {
        while (m() > 0) {
            View h = h(0);
            if (this.b.b(h) <= i && this.b.c(h) <= i) {
                write write2 = (write) h.getLayoutParams();
                if (write2.a) {
                    for (int i2 = 0; i2 < this.f; i2++) {
                        if (this.g[i2].b.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f; i3++) {
                        this.g[i3].g();
                    }
                } else if (write2.c.b.size() != 1) {
                    write2.c.g();
                } else {
                    return;
                }
                b(h, setonstartentertransitionlistener_componentactivity_3);
            } else {
                return;
            }
        }
    }

    private void a(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setEnterTransition setentertransition) {
        if (setentertransition.h && !setentertransition.e) {
            if (setentertransition.a == 0) {
                if (setentertransition.i == -1) {
                    c(setonstartentertransitionlistener_componentactivity_3, setentertransition.b);
                } else {
                    a(setonstartentertransitionlistener_componentactivity_3, setentertransition.g);
                }
            } else if (setentertransition.i == -1) {
                int f = setentertransition.g - f(setentertransition.g);
                c(setonstartentertransitionlistener_componentactivity_3, f < 0 ? setentertransition.b : setentertransition.b - Math.min(f, setentertransition.a));
            } else {
                int m = m(setentertransition.b) - setentertransition.b;
                a(setonstartentertransitionlistener_componentactivity_3, m < 0 ? setentertransition.g : Math.min(m, setentertransition.a) + setentertransition.g);
            }
        }
    }

    private void a(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, boolean z) {
        int b;
        int b2 = b(Integer.MIN_VALUE);
        if (b2 != Integer.MIN_VALUE && (b = this.b.b() - b2) > 0) {
            int i = b - (-b(-b, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner));
            if (z && i > 0) {
                this.b.d(i);
            }
        }
    }

    private void a(boolean z) {
        if (this.F == null) {
            a((String) null);
        }
        StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver = this.F;
        if (!(staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver == null || staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c == z)) {
            this.F.c = z;
        }
        this.e = z;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener != null) {
            setonstartentertransitionlistener.requestLayout();
        }
    }

    private int b(int i) {
        int d = this.g[0].d(i);
        for (int i2 = 1; i2 < this.f; i2++) {
            int d2 = this.g[i2].d(i);
            d = d;
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private int b(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        if (m() == 0 || i == 0) {
            return 0;
        }
        e(i, immLeaksCleaner);
        int e = e(setonstartentertransitionlistener_componentactivity_3, this.I, immLeaksCleaner);
        int i2 = i;
        if (this.I.a >= e) {
            i2 = i < 0 ? -e : e;
        }
        this.b.d(-i2);
        this.f9o = this.i;
        this.I.a = 0;
        a(setonstartentertransitionlistener_componentactivity_3, this.I);
        return i2;
    }

    private View b(boolean z) {
        int g = this.b.g();
        int b = this.b.b();
        View view = null;
        for (int m = m() - 1; m >= 0; m--) {
            View h = h(m);
            int d = this.b.d(h);
            int b2 = this.b.b(h);
            view = view;
            if (b2 > g) {
                if (d >= b) {
                    view = view;
                } else if (b2 <= b || !z) {
                    return h;
                } else {
                    view = view;
                    if (view == null) {
                        view = h;
                    }
                }
            }
        }
        return view;
    }

    private View c(boolean z) {
        int g = this.b.g();
        int b = this.b.b();
        int m = m();
        View view = null;
        for (int i = 0; i < m; i++) {
            View h = h(i);
            int d = this.b.d(h);
            view = view;
            if (this.b.b(h) > g) {
                if (d >= b) {
                    view = view;
                } else if (d >= g || !z) {
                    return h;
                } else {
                    view = view;
                    if (view == null) {
                        view = h;
                    }
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(int r5, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r6) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(int, o.setOnStartEnterTransitionListener$ImmLeaksCleaner):void");
    }

    private void c(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, int i) {
        for (int m = m() - 1; m >= 0; m--) {
            View h = h(m);
            if (this.b.d(h) >= i && this.b.f(h) >= i) {
                write write2 = (write) h.getLayoutParams();
                if (write2.a) {
                    for (int i2 = 0; i2 < this.f; i2++) {
                        if (this.g[i2].b.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f; i3++) {
                        this.g[i3].c();
                    }
                } else if (write2.c.b.size() != 1) {
                    write2.c.c();
                } else {
                    return;
                }
                b(h, setonstartentertransitionlistener_componentactivity_3);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0506, code lost:
        if ((o.findFragmentByWho.k(r5.x) == 1) != r5.E) goto L_0x0509;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a00 A[LOOP:0: B:2:0x0000->B:299:0x0a00, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a0c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02da  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(o.setOnStartEnterTransitionListener$ComponentActivity$3 r6, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 2573
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(o.setOnStartEnterTransitionListener$ComponentActivity$3, o.setOnStartEnterTransitionListener$ImmLeaksCleaner, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void d(int r5, int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d(int, int, int):void");
    }

    private int e(int i) {
        int i2 = 1;
        int i3 = 1;
        if (m() == 0) {
            if (!this.i) {
                i3 = -1;
            }
            return i3;
        }
        boolean z = false;
        if (i < (m() != 0 ? f(h(0)) : 0)) {
            z = true;
        }
        if (z != this.i) {
            i2 = -1;
        }
        return i2;
    }

    private int e(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setEnterTransition setentertransition, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        IconCompatParcelizer iconCompatParcelizer;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        this.J.set(0, this.f, true);
        int i8 = this.I.e ? setentertransition.i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : setentertransition.i == 1 ? setentertransition.b + setentertransition.a : setentertransition.g - setentertransition.a;
        i(setentertransition.i, i8);
        int b = this.i ? this.b.b() : this.b.g();
        boolean z2 = false;
        while (setentertransition.b(immLeaksCleaner) && (this.I.e || !this.J.isEmpty())) {
            View c = setonstartentertransitionlistener_componentactivity_3.c(setentertransition.d);
            setentertransition.d += setentertransition.c;
            write write2 = (write) c.getLayoutParams();
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = write2.h;
            int i9 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
            int i10 = i9;
            if (i9 == -1) {
                i10 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
            }
            int[] iArr = this.a.b;
            int i11 = (iArr == null || i10 >= iArr.length) ? -1 : iArr[i10];
            boolean z3 = i11 == -1;
            if (z3) {
                if (!write2.a) {
                    if (k(setentertransition.i)) {
                        i7 = this.f - 1;
                        i6 = -1;
                        i5 = -1;
                    } else {
                        i6 = this.f;
                        i7 = 0;
                        i5 = 1;
                    }
                    IconCompatParcelizer iconCompatParcelizer2 = null;
                    IconCompatParcelizer iconCompatParcelizer3 = null;
                    if (setentertransition.i != 1) {
                        int b2 = this.b.b();
                        int i12 = Integer.MIN_VALUE;
                        while (true) {
                            iconCompatParcelizer = iconCompatParcelizer2;
                            if (i7 == i6) {
                                break;
                            }
                            IconCompatParcelizer iconCompatParcelizer4 = this.g[i7];
                            int c2 = iconCompatParcelizer4.c(b2);
                            i12 = i12;
                            if (c2 > i12) {
                                iconCompatParcelizer2 = iconCompatParcelizer4;
                                i12 = c2;
                            }
                            i7 += i5;
                        }
                    } else {
                        int g = this.b.g();
                        int i13 = Integer.MAX_VALUE;
                        while (true) {
                            iconCompatParcelizer = iconCompatParcelizer3;
                            if (i7 == i6) {
                                break;
                            }
                            IconCompatParcelizer iconCompatParcelizer5 = this.g[i7];
                            int d = iconCompatParcelizer5.d(g);
                            i13 = i13;
                            if (d < i13) {
                                i13 = d;
                                iconCompatParcelizer3 = iconCompatParcelizer5;
                            }
                            i7 += i5;
                        }
                    }
                } else {
                    iconCompatParcelizer = this.g[0];
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
                remoteActionCompatParcelizer.d(i10);
                remoteActionCompatParcelizer.b[i10] = iconCompatParcelizer.a;
            } else {
                iconCompatParcelizer = this.g[i11];
            }
            write2.c = iconCompatParcelizer;
            if (setentertransition.i == 1) {
                d(c);
            } else {
                b(c, 0);
            }
            if (write2.a) {
                if (this.H == 1) {
                    int i14 = this.l;
                    int p = p();
                    int r = r();
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
                    int paddingTop = setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingTop() : 0;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.x;
                    a(c, i14, a(p, r, paddingTop + (setonstartentertransitionlistener2 != null ? setonstartentertransitionlistener2.getPaddingBottom() : 0), write2.height, true), false);
                } else {
                    int q = q();
                    int v = v();
                    setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.x;
                    int paddingLeft = setonstartentertransitionlistener3 != null ? setonstartentertransitionlistener3.getPaddingLeft() : 0;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener4 = this.x;
                    a(c, a(q, v, paddingLeft + (setonstartentertransitionlistener4 != null ? setonstartentertransitionlistener4.getPaddingRight() : 0), write2.width, true), this.l, false);
                }
            } else if (this.H == 1) {
                int a = a(this.K, v(), 0, write2.width, false);
                int p2 = p();
                int r2 = r();
                setOnStartEnterTransitionListener setonstartentertransitionlistener5 = this.x;
                int paddingTop2 = setonstartentertransitionlistener5 != null ? setonstartentertransitionlistener5.getPaddingTop() : 0;
                setOnStartEnterTransitionListener setonstartentertransitionlistener6 = this.x;
                a(c, a, a(p2, r2, paddingTop2 + (setonstartentertransitionlistener6 != null ? setonstartentertransitionlistener6.getPaddingBottom() : 0), write2.height, true), false);
            } else {
                int q2 = q();
                int v2 = v();
                setOnStartEnterTransitionListener setonstartentertransitionlistener7 = this.x;
                int paddingLeft2 = setonstartentertransitionlistener7 != null ? setonstartentertransitionlistener7.getPaddingLeft() : 0;
                setOnStartEnterTransitionListener setonstartentertransitionlistener8 = this.x;
                a(c, a(q2, v2, paddingLeft2 + (setonstartentertransitionlistener8 != null ? setonstartentertransitionlistener8.getPaddingRight() : 0), write2.width, true), a(this.K, r(), 0, write2.height, false), false);
            }
            if (setentertransition.i == 1) {
                int b3 = write2.a ? b(b) : iconCompatParcelizer.d(b);
                int a2 = this.b.a(c);
                if (z3 && write2.a) {
                    RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer6 = new RemoteActionCompatParcelizer.IconCompatParcelizer();
                    iconCompatParcelizer6.a = new int[this.f];
                    for (int i15 = 0; i15 < this.f; i15++) {
                        iconCompatParcelizer6.a[i15] = b3 - this.g[i15].d(b3);
                    }
                    iconCompatParcelizer6.e = -1;
                    iconCompatParcelizer6.b = i10;
                    this.a.e(iconCompatParcelizer6);
                }
                i = a2 + b3;
                i2 = b3;
            } else {
                int o2 = write2.a ? o(b) : iconCompatParcelizer.c(b);
                int a3 = o2 - this.b.a(c);
                i2 = a3;
                i = o2;
                if (z3) {
                    i2 = a3;
                    i = o2;
                    if (write2.a) {
                        RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer7 = new RemoteActionCompatParcelizer.IconCompatParcelizer();
                        iconCompatParcelizer7.a = new int[this.f];
                        for (int i16 = 0; i16 < this.f; i16++) {
                            iconCompatParcelizer7.a[i16] = this.g[i16].c(o2) - o2;
                        }
                        iconCompatParcelizer7.e = 1;
                        iconCompatParcelizer7.b = i10;
                        this.a.e(iconCompatParcelizer7);
                        i = o2;
                        i2 = a3;
                    }
                }
            }
            if (write2.a && setentertransition.c == -1) {
                if (!z3) {
                    if (setentertransition.i == 1) {
                        int d2 = this.g[0].d(Integer.MIN_VALUE);
                        for (int i17 = 1; i17 < this.f; i17++) {
                            if (this.g[i17].d(Integer.MIN_VALUE) != d2) {
                                z = false;
                                break;
                            }
                        }
                        z = true;
                    } else {
                        int c3 = this.g[0].c(Integer.MIN_VALUE);
                        for (int i18 = 1; i18 < this.f; i18++) {
                            if (this.g[i18].c(Integer.MIN_VALUE) != c3) {
                                z = false;
                                break;
                            }
                        }
                        z = true;
                    }
                    if (!z) {
                        RemoteActionCompatParcelizer.IconCompatParcelizer a4 = this.a.a(i10);
                        if (a4 != null) {
                            a4.c = true;
                        }
                    }
                }
                this.k = true;
            }
            if (setentertransition.i == 1) {
                if (write2.a) {
                    for (int i19 = this.f - 1; i19 >= 0; i19--) {
                        this.g[i19].a(c);
                    }
                } else {
                    write2.c.a(c);
                }
            } else if (write2.a) {
                for (int i20 = this.f - 1; i20 >= 0; i20--) {
                    this.g[i20].e(c);
                }
            } else {
                write2.c.e(c);
            }
            if (!(findFragmentByWho.k(this.x) == 1) || this.H != 1) {
                int g2 = write2.a ? this.h.g() : (iconCompatParcelizer.a * this.K) + this.h.g();
                i4 = this.h.a(c) + g2;
                i3 = g2;
            } else {
                i4 = write2.a ? this.h.b() : this.h.b() - (((this.f - 1) - iconCompatParcelizer.a) * this.K);
                i3 = i4 - this.h.a(c);
            }
            if (this.H == 1) {
                a(c, i3, i2, i4, i);
            } else {
                a(c, i2, i3, i, i4);
            }
            if (write2.a) {
                i(this.I.i, i8);
            } else {
                a(iconCompatParcelizer, this.I.i, i8);
            }
            a(setonstartentertransitionlistener_componentactivity_3, this.I);
            if (this.I.f && c.hasFocusable()) {
                if (write2.a) {
                    this.J.clear();
                } else {
                    this.J.set(iconCompatParcelizer.a, false);
                }
            }
            z2 = true;
        }
        if (!z2) {
            a(setonstartentertransitionlistener_componentactivity_3, this.I);
        }
        int g3 = this.I.i == -1 ? this.b.g() - o(this.b.g()) : b(this.b.b()) - this.b.b();
        return g3 > 0 ? Math.min(setentertransition.a, g3) : 0;
    }

    private void e(int i, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        int i2;
        r8 = 0;
        int i3 = 0;
        if (i > 0) {
            int m = m();
            if (m != 0) {
                i3 = f(h(m - 1));
            }
            i2 = 1;
        } else {
            if (m() != 0) {
                i3 = f(h(0));
            }
            i2 = -1;
        }
        this.I.h = true;
        c(i3, immLeaksCleaner);
        l(i2);
        setEnterTransition setentertransition = this.I;
        setentertransition.d = i3 + setentertransition.c;
        this.I.a = Math.abs(i);
    }

    private void e(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, boolean z) {
        int g;
        int o2 = o(Integer.MAX_VALUE);
        if (o2 != Integer.MAX_VALUE && (g = o2 - this.b.g()) > 0) {
            int b = g - b(g, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
            if (z && b > 0) {
                this.b.d(-b);
            }
        }
    }

    private boolean e(IconCompatParcelizer iconCompatParcelizer) {
        boolean z;
        if (this.i) {
            int i = iconCompatParcelizer.c;
            if (i == Integer.MIN_VALUE) {
                iconCompatParcelizer.d();
                i = iconCompatParcelizer.c;
            }
            if (i >= this.b.b()) {
                return false;
            }
            z = ((write) iconCompatParcelizer.b.get(iconCompatParcelizer.b.size() - 1).getLayoutParams()).a;
        } else {
            int i2 = iconCompatParcelizer.e;
            if (i2 == Integer.MIN_VALUE) {
                iconCompatParcelizer.a();
                i2 = iconCompatParcelizer.e;
            }
            if (i2 <= this.b.g()) {
                return false;
            }
            z = ((write) iconCompatParcelizer.b.get(0).getLayoutParams()).a;
        }
        return !z;
    }

    private int f(int i) {
        int c = this.g[0].c(i);
        for (int i2 = 1; i2 < this.f; i2++) {
            int c2 = this.g[i2].c(i);
            c = c;
            if (c2 > c) {
                c = c2;
            }
        }
        return c;
    }

    private int f(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        if (m() == 0) {
            return 0;
        }
        return setRetainInstance.b(immLeaksCleaner, this.b, c(!this.N), b(!this.N), this, this.N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
        if (r0 == r0) goto L_0x011c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
        if (r0 == r0) goto L_0x011c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private android.view.View f() {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.f():android.view.View");
    }

    private int g(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        if (m() == 0) {
            return 0;
        }
        return setRetainInstance.e(immLeaksCleaner, this.b, c(!this.N), b(!this.N), this, this.N);
    }

    private void g() {
        if (this.H != 1) {
            if (findFragmentByWho.k(this.x) == 1) {
                this.i = !this.e;
                return;
            }
        }
        this.i = this.e;
    }

    private int i(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        if (m() == 0) {
            return 0;
        }
        return setRetainInstance.d(immLeaksCleaner, this.b, c(!this.N), b(!this.N), this, this.N, this.i);
    }

    private void i(int i, int i2) {
        for (int i3 = 0; i3 < this.f; i3++) {
            if (!this.g[i3].b.isEmpty()) {
                a(this.g[i3], i, i2);
            }
        }
    }

    private boolean k(int i) {
        boolean z = false;
        boolean z2 = false;
        if (this.H == 0) {
            if ((i == -1) != this.i) {
                z2 = true;
            }
            return z2;
        }
        if (((i == -1) == this.i) == (findFragmentByWho.k(this.x) == 1)) {
            z = true;
        }
        return z;
    }

    private void l(int i) {
        this.I.i = i;
        setEnterTransition setentertransition = this.I;
        int i2 = 1;
        if (this.i != (i == -1)) {
            i2 = -1;
        }
        setentertransition.c = i2;
    }

    private int m(int i) {
        int d = this.g[0].d(i);
        for (int i2 = 1; i2 < this.f; i2++) {
            int d2 = this.g[i2].d(i);
            d = d;
            if (d2 < d) {
                d = d2;
            }
        }
        return d;
    }

    private void n(int i) {
        if (this.F == null) {
            a((String) null);
        }
        if (i != this.f) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
            int[] iArr = remoteActionCompatParcelizer.b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            remoteActionCompatParcelizer.a = null;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
            if (setonstartentertransitionlistener != null) {
                setonstartentertransitionlistener.requestLayout();
            }
            this.f = i;
            this.J = new BitSet(this.f);
            this.g = new IconCompatParcelizer[this.f];
            for (int i2 = 0; i2 < this.f; i2++) {
                this.g[i2] = new IconCompatParcelizer(i2);
            }
            setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.x;
            if (setonstartentertransitionlistener2 != null) {
                setonstartentertransitionlistener2.requestLayout();
            }
        }
    }

    private int o(int i) {
        int c = this.g[0].c(i);
        for (int i2 = 1; i2 < this.f; i2++) {
            int c2 = this.g[i2].c(i);
            c = c;
            if (c2 < c) {
                c = c2;
            }
        }
        return c;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int a(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return i(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener.ParcelableVolumeInfo.write
    public final PointF a(int i) {
        int e = e(i);
        PointF pointF = new PointF();
        if (e == 0) {
            return null;
        }
        if (this.H == 0) {
            pointF.x = (float) e;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) e;
        }
        return pointF;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(int i, int i2) {
        d(i, i2, 1);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
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
        if (this.H == 1) {
            i4 = c(i2, rect.height() + i6, findFragmentByWho.m(this.x));
            i3 = c(i, (this.K * this.f) + paddingRight, findFragmentByWho.o(this.x));
        } else {
            i3 = c(i, rect.width() + paddingRight, findFragmentByWho.o(this.x));
            i4 = c(i2, (this.K * this.f) + i6, findFragmentByWho.m(this.x));
        }
        this.x.setMeasuredDimension(i3, i4);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(String str) {
        if (this.F == null) {
            a(str);
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(setOnStartEnterTransitionListener setonstartentertransitionlistener, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
        a(setonstartentertransitionlistener, setonstartentertransitionlistener_componentactivity_3);
        Runnable runnable = this.n;
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.x;
        if (setonstartentertransitionlistener2 != null) {
            setonstartentertransitionlistener2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f; i++) {
            IconCompatParcelizer iconCompatParcelizer = this.g[i];
            iconCompatParcelizer.b.clear();
            iconCompatParcelizer.e = Integer.MIN_VALUE;
            iconCompatParcelizer.c = Integer.MIN_VALUE;
            iconCompatParcelizer.d = 0;
        }
        setonstartentertransitionlistener.requestLayout();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final boolean a() {
        return this.F == null;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver b(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new write((ViewGroup.MarginLayoutParams) layoutParams) : new write(layoutParams);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void b() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
        int[] iArr = remoteActionCompatParcelizer.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        remoteActionCompatParcelizer.a = null;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener != null) {
            setonstartentertransitionlistener.requestLayout();
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void b(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        b(immLeaksCleaner);
        this.c = -1;
        this.d = Integer.MIN_VALUE;
        this.F = null;
        this.j.e();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void b(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
        d(i, i2, 4);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int c(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return b(i, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return i(immLeaksCleaner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r5.H != 1) goto L_0x003f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r5.H != 0) goto L_0x003f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        if ((o.findFragmentByWho.k(r5.x) == 1) == false) goto L_0x0077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if ((o.findFragmentByWho.k(r5.x) == 1) != false) goto L_0x0077;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0287 A[LOOP:3: B:127:0x0287->B:139:0x02bf, LOOP_START, PHI: r15 
      PHI: (r15v1 int) = (r15v0 int), (r15v2 int) binds: [B:110:0x023a, B:139:0x02bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.view.View c(android.view.View r6, int r7, o.setOnStartEnterTransitionListener$ComponentActivity$3 r8, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r9) {
        /*
        // Method dump skipped, instructions count: 711
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(android.view.View, int, o.setOnStartEnterTransitionListener$ComponentActivity$3, o.setOnStartEnterTransitionListener$ImmLeaksCleaner):android.view.View");
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void c(AccessibilityEvent accessibilityEvent) {
        c(accessibilityEvent);
        if (m() > 0) {
            View c = c(false);
            View b = b(false);
            if (c != null && b != null) {
                int f = f(c);
                int f2 = f(b);
                if (f < f2) {
                    accessibilityEvent.setFromIndex(f);
                    accessibilityEvent.setToIndex(f2);
                    return;
                }
                accessibilityEvent.setFromIndex(f2);
                accessibilityEvent.setToIndex(f);
            }
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void c(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        c(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, true);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final boolean c() {
        return this.H == 0;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int d(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return f(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver d() {
        return this.H == 0 ? new write(-2, -1) : new write(-1, -2);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void d(int i) {
        StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver = this.F;
        if (!(staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver == null || staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.a == i)) {
            StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2 = this.F;
            staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.f = null;
            staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.g = 0;
            staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.a = -1;
            staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.i = -1;
        }
        this.c = i;
        this.d = Integer.MIN_VALUE;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener != null) {
            setonstartentertransitionlistener.requestLayout();
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void d(int i, int i2) {
        d(i, i2, 8);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void d(int i, int i2, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.read read2) {
        int i3;
        int i4;
        if (this.H != 0) {
            i = i2;
        }
        if (!(m() == 0 || i == 0)) {
            e(i, immLeaksCleaner);
            int[] iArr = this.G;
            if (iArr == null || iArr.length < this.f) {
                this.G = new int[this.f];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f; i6++) {
                if (this.I.c == -1) {
                    i4 = this.I.g;
                    i3 = this.g[i6].c(this.I.g);
                } else {
                    i4 = this.g[i6].d(this.I.b);
                    i3 = this.I.b;
                }
                int i7 = i4 - i3;
                i5 = i5;
                if (i7 >= 0) {
                    this.G[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.G, 0, i5);
            for (int i8 = 0; i8 < i5 && this.I.b(immLeaksCleaner); i8++) {
                read2.c(this.I.d, this.G[i8]);
                this.I.d += this.I.c;
            }
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void d(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
        setFocusedView setfocusedview = new setFocusedView(setonstartentertransitionlistener.getContext());
        setfocusedview.f257o = i;
        b(setfocusedview);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int e(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return b(i, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int e(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return f(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver e(Context context, AttributeSet attributeSet) {
        return new write(context, attributeSet);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void e(int i, int i2) {
        d(i, i2, 2);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void e(Parcelable parcelable) {
        if (parcelable instanceof StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver) {
            StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver = (StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver) parcelable;
            this.F = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver;
            if (this.c != -1) {
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.f = null;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.g = 0;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.a = -1;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.i = -1;
                StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2 = this.F;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.f = null;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.g = 0;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.j = 0;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.h = null;
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver2.b = null;
            }
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
            if (setonstartentertransitionlistener != null) {
                setonstartentertransitionlistener.requestLayout();
            }
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final boolean e() {
        boolean z = true;
        if (this.H != 1) {
            z = false;
        }
        return z;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final boolean e(setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver) {
        return setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver instanceof write;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void g(int i) {
        g(i);
        for (int i2 = 0; i2 < this.f; i2++) {
            this.g[i2].a(i);
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int h(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return g(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void i(int i) {
        if (i == 0) {
            j();
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final int j(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return g(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void j(int i) {
        j(i);
        for (int i2 = 0; i2 < this.f; i2++) {
            this.g[i2].a(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final boolean j() {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.j():boolean");
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final boolean k() {
        return this.m != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.os.Parcelable o() {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o():android.os.Parcelable");
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void x() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
        int[] iArr = remoteActionCompatParcelizer.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        remoteActionCompatParcelizer.a = null;
        for (int i = 0; i < this.f; i++) {
            IconCompatParcelizer iconCompatParcelizer = this.g[i];
            iconCompatParcelizer.b.clear();
            iconCompatParcelizer.e = Integer.MIN_VALUE;
            iconCompatParcelizer.c = Integer.MIN_VALUE;
            iconCompatParcelizer.d = 0;
        }
    }
}
