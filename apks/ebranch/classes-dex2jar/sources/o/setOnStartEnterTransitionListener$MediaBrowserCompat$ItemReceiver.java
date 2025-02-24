package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import io.realm.internal.Property;
import java.util.ArrayList;
import o.setEnterSharedElementCallback;
import o.setOnStartEnterTransitionListener;
import o.setReenterTransition;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.class */
public abstract class setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver {
    public setPopDirection A;
    setOnStartEnterTransitionListener.ParcelableVolumeInfo B;
    int C;
    private final setPopDirection$MediaBrowserCompat$CustomActionResultReceiver a;
    private final setPopDirection$MediaBrowserCompat$CustomActionResultReceiver c;
    public setPopDirection p;
    int r;
    public setAnimations s;
    int t;
    boolean v;
    int w;
    public setOnStartEnterTransitionListener x;
    int z;
    public boolean D = false;
    public boolean y = false;
    boolean q = false;
    private boolean d = true;
    boolean u = true;

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver$read.class */
    public interface read {
        void c(int i, int i2);
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver$write.class */
    public static final class write {
        public boolean a;
        public int b;
        public int c;
        public boolean e;
    }

    public setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver() {
        AnonymousClass2 r0 = new setPopDirection$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.2
            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int a(View view) {
                return (view.getLeft() - ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.left) - ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).leftMargin;
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final View a(int i) {
                return setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.h(i);
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int b() {
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.x;
                return setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingLeft() : 0;
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int d() {
                int i = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.z;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.x;
                return i - (setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingRight() : 0);
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int e(View view) {
                return view.getRight() + ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.right + ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).rightMargin;
            }
        };
        this.c = r0;
        AnonymousClass1 r02 = new setPopDirection$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.1
            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int a(View view) {
                return (view.getTop() - ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.top) - ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).topMargin;
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final View a(int i) {
                return setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.h(i);
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int b() {
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.x;
                return setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingTop() : 0;
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int d() {
                int i = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.r;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.this.x;
                return i - (setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingBottom() : 0);
            }

            @Override // o.setPopDirection$MediaBrowserCompat$CustomActionResultReceiver
            public final int e(View view) {
                return view.getBottom() + ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.bottom + ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).bottomMargin;
            }
        };
        this.a = r02;
        this.p = new setPopDirection(r0);
        this.A = new setPopDirection(r02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r5 != 1073741824) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static int a(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            r0 = 0
            r9 = r0
            r0 = 0
            r1 = r4
            r2 = r6
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0030
            r0 = r7
            if (r0 >= 0) goto L_0x0034
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L_0x0063
            r0 = r5
            r4 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x005e
            r0 = r5
            if (r0 == 0) goto L_0x0063
            r0 = r5
            r4 = r0
            r0 = r5
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x005e
            goto L_0x0063
        L_0x0030:
            r0 = r7
            if (r0 < 0) goto L_0x003a
        L_0x0034:
            r0 = 1073741824(0x40000000, float:2.0)
            r4 = r0
            goto L_0x0068
        L_0x003a:
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L_0x0044
            r0 = r5
            r4 = r0
            goto L_0x005e
        L_0x0044:
            r0 = r7
            r1 = -2
            if (r0 != r1) goto L_0x0063
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x005b
            r0 = r5
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x005b
            r0 = 0
            r4 = r0
            goto L_0x005e
        L_0x005b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r0
        L_0x005e:
            r0 = r6
            r7 = r0
            goto L_0x0068
        L_0x0063:
            r0 = 0
            r7 = r0
            r0 = r9
            r4 = r0
        L_0x0068:
            r0 = r7
            r1 = r4
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.a(int, int, int, int, boolean):int");
    }

    public static write a(Context context, AttributeSet attributeSet, int i, int i2) {
        write write2 = new write();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setEnterSharedElementCallback.read.h, i, i2);
        write2.c = obtainStyledAttributes.getInt(setEnterSharedElementCallback.read.f, 1);
        write2.b = obtainStyledAttributes.getInt(setEnterSharedElementCallback.read.q, 1);
        write2.e = obtainStyledAttributes.getBoolean(setEnterSharedElementCallback.read.r, false);
        write2.a = obtainStyledAttributes.getBoolean(setEnterSharedElementCallback.read.t, false);
        obtainStyledAttributes.recycle();
        return write2;
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
        Rect rect = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.e;
        view.layout(i + rect.left + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.leftMargin, i2 + rect.top + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.topMargin, (i3 - rect.right) - setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.rightMargin, (i4 - rect.bottom) - setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.bottomMargin);
    }

    public static int b(View view) {
        return ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.bottom;
    }

    private static boolean b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        boolean z = false;
        boolean z2 = false;
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            if (size >= i) {
                z = true;
            }
            return z;
        } else if (mode == 0) {
            return true;
        } else {
            if (mode != 1073741824) {
                return false;
            }
            if (size == i) {
                z2 = true;
            }
            return z2;
        }
    }

    public static int c(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i2, i3));
        }
        if (mode != 1073741824) {
            size = Math.max(i2, i3);
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(android.view.View r7, int r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 710
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.c(android.view.View, int, boolean):void");
    }

    public static void d(View view, Rect rect) {
        setOnStartEnterTransitionListener.e(view, rect);
    }

    public static int e(View view) {
        Rect rect = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    private void e(int i) {
        setAnimations setanimations = this.s;
        int e = setanimations.e(i);
        setanimations.d.e(e);
        setanimations.b.e(e);
    }

    public static int f(View view) {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
        int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
        int i2 = i;
        if (i == -1) {
            i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
        }
        return i2;
    }

    public static int g(View view) {
        return ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.left;
    }

    public static int h(View view) {
        Rect rect = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int i(View view) {
        return ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.right;
    }

    public static int j(View view) {
        return ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e.top;
    }

    public static View w() {
        return null;
    }

    public int a(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return -1;
    }

    public int a(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public void a(int i, int i2) {
    }

    public void a(Rect rect, int i, int i2) {
        int width = rect.width();
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        int i3 = 0;
        int paddingLeft = setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingLeft() : 0;
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.x;
        int paddingRight = setonstartentertransitionlistener2 != null ? setonstartentertransitionlistener2.getPaddingRight() : 0;
        int height = rect.height();
        setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.x;
        int paddingTop = setonstartentertransitionlistener3 != null ? setonstartentertransitionlistener3.getPaddingTop() : 0;
        setOnStartEnterTransitionListener setonstartentertransitionlistener4 = this.x;
        if (setonstartentertransitionlistener4 != null) {
            i3 = setonstartentertransitionlistener4.getPaddingBottom();
        }
        this.x.setMeasuredDimension(c(i, width + paddingLeft + paddingRight, findFragmentByWho.o(this.x)), c(i2, height + paddingTop + i3, findFragmentByWho.m(this.x)));
    }

    public final void a(View view) {
        c(view, -1, true);
    }

    public void a(String str) {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener != null) {
            setonstartentertransitionlistener.e(str);
        }
    }

    public final void a(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
        for (int m = m() - 1; m >= 0; m--) {
            if (!((setOnStartEnterTransitionListener.c(h(m)).c & Property.TYPE_ARRAY) != 0)) {
                View h = h(m);
                if (h(m) != null) {
                    this.s.c(m);
                }
                setonstartentertransitionlistener_componentactivity_3.b(h);
            }
        }
    }

    public void a(setOnStartEnterTransitionListener setonstartentertransitionlistener, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
    }

    public boolean a() {
        return false;
    }

    public setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver b(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver ? new setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver((ViewGroup.MarginLayoutParams) layoutParams) : new setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver(layoutParams);
    }

    public void b() {
    }

    public final void b(int i, int i2) {
        this.z = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.C = mode;
        if (mode == 0 && !setOnStartEnterTransitionListener.b) {
            this.z = 0;
        }
        this.r = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.t = mode2;
        if (mode2 == 0 && !setOnStartEnterTransitionListener.b) {
            this.r = 0;
        }
    }

    public final void b(View view, int i) {
        c(view, i, false);
    }

    public final void b(View view, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
        this.s.e(view);
        setonstartentertransitionlistener_componentactivity_3.b(view);
    }

    public void b(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
    }

    public final void b(setOnStartEnterTransitionListener.ParcelableVolumeInfo parcelableVolumeInfo) {
        setOnStartEnterTransitionListener.ParcelableVolumeInfo parcelableVolumeInfo2 = this.B;
        if (!(parcelableVolumeInfo2 == null || parcelableVolumeInfo == parcelableVolumeInfo2 || !parcelableVolumeInfo2.i)) {
            this.B.c();
        }
        this.B = parcelableVolumeInfo;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        setOnStartEnterTransitionListener$ActivityResultRegistry$1 setonstartentertransitionlistener_activityresultregistry_1 = setonstartentertransitionlistener.W;
        setonstartentertransitionlistener_activityresultregistry_1.i.removeCallbacks(setonstartentertransitionlistener_activityresultregistry_1);
        setonstartentertransitionlistener_activityresultregistry_1.e.abortAnimation();
        if (parcelableVolumeInfo.n) {
            StringBuilder sb = new StringBuilder("An instance of ");
            sb.append(parcelableVolumeInfo.getClass().getSimpleName());
            sb.append(" was started more than once. Each instance of");
            sb.append(parcelableVolumeInfo.getClass().getSimpleName());
            sb.append(" is intended to only be used once. You should create a new instance for each use.");
            Log.w("RecyclerView", sb.toString());
        }
        parcelableVolumeInfo.f = setonstartentertransitionlistener;
        parcelableVolumeInfo.j = this;
        if (parcelableVolumeInfo.f257o != -1) {
            setonstartentertransitionlistener.R.f255o = parcelableVolumeInfo.f257o;
            parcelableVolumeInfo.i = true;
            parcelableVolumeInfo.h = true;
            parcelableVolumeInfo.m = parcelableVolumeInfo.f.z.c(parcelableVolumeInfo.f257o);
            setOnStartEnterTransitionListener$ActivityResultRegistry$1 setonstartentertransitionlistener_activityresultregistry_12 = parcelableVolumeInfo.f.W;
            if (setonstartentertransitionlistener_activityresultregistry_12.b) {
                setonstartentertransitionlistener_activityresultregistry_12.f = true;
            } else {
                setonstartentertransitionlistener_activityresultregistry_12.i.removeCallbacks(setonstartentertransitionlistener_activityresultregistry_12);
                findFragmentByWho.c(setonstartentertransitionlistener_activityresultregistry_12.i, setonstartentertransitionlistener_activityresultregistry_12);
            }
            parcelableVolumeInfo.n = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void b(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        if (setonstartentertransitionlistener == null) {
            this.x = null;
            this.s = null;
            this.z = 0;
            this.r = 0;
        } else {
            this.x = setonstartentertransitionlistener;
            this.s = setonstartentertransitionlistener.f254o;
            this.z = setonstartentertransitionlistener.getWidth();
            this.r = setonstartentertransitionlistener.getHeight();
        }
        this.C = 1073741824;
        this.t = 1073741824;
    }

    public void b(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
    }

    protected final boolean b(View view, int i, int i2, setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver) {
        return !this.d || !b(view.getMeasuredWidth(), i, setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.width) || !b(view.getMeasuredHeight(), i2, setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.height);
    }

    public int c(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public int c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public View c(int i) {
        View view;
        setAnimations setanimations = this.s;
        int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
        int i2 = 0;
        while (true) {
            view = null;
            if (i2 >= c) {
                return null;
            }
            setAnimations setanimations2 = this.s;
            if (setanimations2 != null) {
                view = setanimations2.b.b(setanimations2.e(i2));
            }
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(view);
            if (c2 != null) {
                int i3 = c2.m;
                int i4 = i3;
                if (i3 == -1) {
                    i4 = c2.k;
                }
                if (i4 == i) {
                    boolean z = true;
                    if ((c2.c & Property.TYPE_ARRAY) != 0) {
                        continue;
                    } else if (this.x.R.b) {
                        break;
                    } else {
                        if ((c2.c & 8) == 0) {
                            z = false;
                        }
                        if (!z) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return view;
    }

    public final View c(View view) {
        View a;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener == null || (a = setonstartentertransitionlistener.a(view)) == null || this.s.e.contains(a)) {
            return null;
        }
        return a;
    }

    public View c(View view, int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return null;
    }

    public final void c(int i, int i2) {
        int m = m();
        if (m == 0) {
            this.x.c(i, i2);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < m; i7++) {
            View h = h(i7);
            Rect rect = this.x.T;
            setOnStartEnterTransitionListener.e(h, rect);
            i3 = i3;
            if (rect.left < i3) {
                i3 = rect.left;
            }
            i5 = i5;
            if (rect.right > i5) {
                i5 = rect.right;
            }
            i4 = i4;
            if (rect.top < i4) {
                i4 = rect.top;
            }
            i6 = i6;
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.x.T.set(i3, i4, i5, i6);
        a(this.x.T, i, i2);
    }

    public final void c(View view, int i) {
        c(view, i, true);
    }

    public final void c(View view, Rect rect) {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(setonstartentertransitionlistener.h(view));
        }
    }

    public void c(AccessibilityEvent accessibilityEvent) {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener != null && accessibilityEvent != null) {
            boolean z = true;
            if (!setonstartentertransitionlistener.canScrollVertically(1)) {
                z = true;
                if (!this.x.canScrollVertically(-1)) {
                    z = true;
                    if (!this.x.canScrollHorizontally(-1)) {
                        z = this.x.canScrollHorizontally(1);
                    }
                }
            }
            accessibilityEvent.setScrollable(z);
            if (this.x.g != null) {
                accessibilityEvent.setItemCount(this.x.g.c());
            }
        }
    }

    public void c(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public boolean c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0209 A[ORIG_RETURN, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean c(o.setOnStartEnterTransitionListener r6, android.view.View r7, android.graphics.Rect r8, boolean r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 549
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.c(o.setOnStartEnterTransitionListener, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public int d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return -1;
    }

    public int d(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public abstract setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver d();

    public void d(int i) {
    }

    public void d(int i, int i2) {
    }

    public void d(int i, int i2, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, read read2) {
    }

    public void d(int i, read read2) {
    }

    public final void d(View view) {
        c(view, -1, false);
    }

    public final void d(View view, boolean z, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).e;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.x == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.x.V;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
        setAnimations setanimations = this.s;
        int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
        while (true) {
            c--;
            if (c >= 0) {
                setAnimations setanimations2 = this.s;
                View view = null;
                View b = setanimations2 != null ? setanimations2.b.b(setanimations2.e(c)) : null;
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(b);
                if (!((c2.c & Property.TYPE_ARRAY) != 0)) {
                    if ((c2.c & 4) != 0) {
                        if (!((c2.c & 8) != 0) && !this.x.g.d) {
                            setAnimations setanimations3 = this.s;
                            if (setanimations3 != null) {
                                view = setanimations3.b.b(setanimations3.e(c));
                            }
                            if (view != null) {
                                this.s.c(c);
                            }
                            setonstartentertransitionlistener_componentactivity_3.c(c2);
                        }
                    }
                    setAnimations setanimations4 = this.s;
                    if (setanimations4 != null) {
                        setanimations4.b.b(setanimations4.e(c));
                    }
                    e(c);
                    setonstartentertransitionlistener_componentactivity_3.e(b);
                    setReenterTransition.read read2 = this.x.ab.e.get(c2);
                    if (read2 != null) {
                        read2.d &= -2;
                    }
                }
            } else {
                return;
            }
        }
    }

    public void d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, getChildFragmentManager getchildfragmentmanager) {
        if (this.x.canScrollVertically(-1) || this.x.canScrollHorizontally(-1)) {
            getchildfragmentmanager.e(8192);
            getchildfragmentmanager.k(true);
        }
        if (this.x.canScrollVertically(1) || this.x.canScrollHorizontally(1)) {
            getchildfragmentmanager.e(4096);
            getchildfragmentmanager.k(true);
        }
        getchildfragmentmanager.c(getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver.b(a(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner), d(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner), false, 0));
    }

    public void d(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public boolean d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int i, Bundle bundle) {
        int i2;
        int i3;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener == null) {
            return false;
        }
        if (i == 4096) {
            if (setonstartentertransitionlistener.canScrollVertically(1)) {
                int i4 = this.r;
                setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.x;
                int paddingTop = setonstartentertransitionlistener2 != null ? setonstartentertransitionlistener2.getPaddingTop() : 0;
                setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.x;
                i2 = (i4 - paddingTop) - (setonstartentertransitionlistener3 != null ? setonstartentertransitionlistener3.getPaddingBottom() : 0);
            } else {
                i2 = 0;
            }
            i2 = i2;
            if (this.x.canScrollHorizontally(1)) {
                int i5 = this.z;
                setOnStartEnterTransitionListener setonstartentertransitionlistener4 = this.x;
                int paddingLeft = setonstartentertransitionlistener4 != null ? setonstartentertransitionlistener4.getPaddingLeft() : 0;
                setOnStartEnterTransitionListener setonstartentertransitionlistener5 = this.x;
                i3 = (i5 - paddingLeft) - (setonstartentertransitionlistener5 != null ? setonstartentertransitionlistener5.getPaddingRight() : 0);
            }
            i3 = 0;
        } else if (i != 8192) {
            i3 = 0;
            i2 = 0;
        } else {
            if (setonstartentertransitionlistener.canScrollVertically(-1)) {
                int i6 = this.r;
                setOnStartEnterTransitionListener setonstartentertransitionlistener6 = this.x;
                int paddingTop2 = setonstartentertransitionlistener6 != null ? setonstartentertransitionlistener6.getPaddingTop() : 0;
                setOnStartEnterTransitionListener setonstartentertransitionlistener7 = this.x;
                i2 = -((i6 - paddingTop2) - (setonstartentertransitionlistener7 != null ? setonstartentertransitionlistener7.getPaddingBottom() : 0));
            } else {
                i2 = 0;
            }
            i2 = i2;
            if (this.x.canScrollHorizontally(-1)) {
                int i7 = this.z;
                setOnStartEnterTransitionListener setonstartentertransitionlistener8 = this.x;
                int paddingLeft2 = setonstartentertransitionlistener8 != null ? setonstartentertransitionlistener8.getPaddingLeft() : 0;
                setOnStartEnterTransitionListener setonstartentertransitionlistener9 = this.x;
                i3 = -((i7 - paddingLeft2) - (setonstartentertransitionlistener9 != null ? setonstartentertransitionlistener9.getPaddingRight() : 0));
            }
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        this.x.c(i3, i2, null, Integer.MIN_VALUE, true);
        return true;
    }

    public int e(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public int e(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver e(Context context, AttributeSet attributeSet) {
        return new setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver(context, attributeSet);
    }

    public void e(int i, int i2) {
    }

    public final void e(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
        View h = h(i);
        if (h(i) != null) {
            this.s.c(i);
        }
        setonstartentertransitionlistener_componentactivity_3.b(h);
    }

    public void e(Parcelable parcelable) {
    }

    public final void e(View view, getChildFragmentManager getchildfragmentmanager) {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c = setOnStartEnterTransitionListener.c(view);
        if (c != null) {
            if (!((c.c & 8) != 0)) {
                if (!this.s.e.contains(c.b)) {
                    e(this.x.L, this.x.R, view, getchildfragmentmanager);
                }
            }
        }
    }

    public final void e(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
        int size = setonstartentertransitionlistener_componentactivity_3.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = setonstartentertransitionlistener_componentactivity_3.a.get(i).b;
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c = setOnStartEnterTransitionListener.c(view);
            if (!((c.c & Property.TYPE_ARRAY) != 0)) {
                c.c(false);
                if ((c.c & Property.TYPE_SET) != 0) {
                    this.x.removeDetachedView(view, false);
                }
                if (this.x.x != null) {
                    this.x.x.d(c);
                }
                c.c(true);
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(view);
                c2.n = null;
                c2.a = false;
                c2.c &= -33;
                setonstartentertransitionlistener_componentactivity_3.c(c2);
            }
        }
        setonstartentertransitionlistener_componentactivity_3.a.clear();
        ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList = setonstartentertransitionlistener_componentactivity_3.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.x.invalidate();
        }
    }

    public void e(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, View view, getChildFragmentManager getchildfragmentmanager) {
    }

    public boolean e() {
        return false;
    }

    public final boolean e(View view, int i, int i2, setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver) {
        return view.isLayoutRequested() || !this.d || !b(view.getWidth(), i, setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.width) || !b(view.getHeight(), i2, setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.height);
    }

    public boolean e(setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver) {
        return setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver != null;
    }

    public void g(int i) {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener != null) {
            setAnimations setanimations = setonstartentertransitionlistener.f254o;
            int c = setanimations.b.c();
            int size = setanimations.e.size();
            for (int i2 = 0; i2 < c - size; i2++) {
                setAnimations setanimations2 = setonstartentertransitionlistener.f254o;
                setanimations2.b.b(setanimations2.e(i2)).offsetTopAndBottom(i);
            }
        }
    }

    public int h(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public final View h(int i) {
        View view;
        setAnimations setanimations = this.s;
        if (setanimations != null) {
            view = setanimations.b.b(setanimations.e(i));
        } else {
            view = null;
        }
        return view;
    }

    public void i(int i) {
    }

    public int j(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return 0;
    }

    public void j(int i) {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener != null) {
            setAnimations setanimations = setonstartentertransitionlistener.f254o;
            int c = setanimations.b.c();
            int size = setanimations.e.size();
            for (int i2 = 0; i2 < c - size; i2++) {
                setAnimations setanimations2 = setonstartentertransitionlistener.f254o;
                setanimations2.b.b(setanimations2.e(i2)).offsetLeftAndRight(i);
            }
        }
    }

    public boolean k() {
        return this.q;
    }

    public boolean l() {
        return false;
    }

    public final int m() {
        setAnimations setanimations = this.s;
        return setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
    }

    public Parcelable o() {
        return null;
    }

    public final int p() {
        return this.r;
    }

    public final int q() {
        return this.z;
    }

    public final int r() {
        return this.t;
    }

    public final int s() {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = setonstartentertransitionlistener != null ? setonstartentertransitionlistener.g : null;
        return setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null ? setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c() : 0;
    }

    public final View t() {
        View focusedChild;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
        if (setonstartentertransitionlistener == null || (focusedChild = setonstartentertransitionlistener.getFocusedChild()) == null || this.s.e.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final boolean u() {
        setOnStartEnterTransitionListener.ParcelableVolumeInfo parcelableVolumeInfo = this.B;
        return parcelableVolumeInfo != null && parcelableVolumeInfo.i;
    }

    public final int v() {
        return this.C;
    }

    public void x() {
    }

    public final void y() {
        setOnStartEnterTransitionListener.ParcelableVolumeInfo parcelableVolumeInfo = this.B;
        if (parcelableVolumeInfo != null) {
            parcelableVolumeInfo.c();
        }
    }
}
