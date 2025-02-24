package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.copyWindowDataInto;
import o.ensureAnimationInfo;
import o.findFragmentByWho;
import o.getInsetsForType;
import o.instantiate;
import o.onDetach;
import o.onFindViewById;
import o.onGetLayoutInflater;
import o.setContentId;
import o.setEmptyVisibility;
import o.setEmptyVisibility$MediaBrowserCompat$CustomActionResultReceiver;
import o.setGuidelineEnd;
import o.show;
/* loaded from: classes-dex2jar.jar:androidx/coordinatorlayout/widget/CoordinatorLayout.class */
public class CoordinatorLayout extends ViewGroup implements show {
    static final ThreadLocal<Map<String, Constructor<write>>> a;
    static final Comparator<View> c;
    static final String d;
    static final Class<?>[] e;
    private static final onFindViewById.write<Rect> f;
    boolean b;
    private final int[] g;
    ViewGroup.OnHierarchyChangeListener h;
    public WindowInsetsCompat i;
    private instantiate j;
    private final List<View> k;
    private boolean l;
    private final setGuidelineEnd<View> m;
    private boolean n;

    /* renamed from: o */
    private View f4o;
    private View p;
    private boolean q;
    private final int[] r;
    private int[] s;
    private final ensureAnimationInfo t;
    private final List<View> u;
    private CoordinatorLayout$MediaBrowserCompat$MediaItem v;
    private final List<View> w;
    private Drawable x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements ViewGroup.OnHierarchyChangeListener {
        IconCompatParcelizer() {
            CoordinatorLayout.this = r4;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.h != null) {
                CoordinatorLayout.this.h.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.d(2);
            if (CoordinatorLayout.this.h != null) {
                CoordinatorLayout.this.h.onChildViewRemoved(view, view2);
            }
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes-dex2jar.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer.class */
    public @interface RemoteActionCompatParcelizer {
        Class<? extends write> d();
    }

    /* loaded from: classes-dex2jar.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$read.class */
    public static final class read extends ViewGroup.MarginLayoutParams {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        boolean f;
        public write g;
        public int h;
        View i;
        View j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;

        /* renamed from: o */
        Object f5o;
        int p;
        int r;
        final Rect s;

        public read(int i, int i2) {
            super(-2, -2);
            this.f = false;
            this.d = 0;
            this.e = 0;
            this.b = -1;
            this.h = -1;
            this.c = 0;
            this.a = 0;
            this.s = new Rect();
        }

        read(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = false;
            this.d = 0;
            this.e = 0;
            this.b = -1;
            this.h = -1;
            this.c = 0;
            this.a = 0;
            this.s = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setEmptyVisibility.RemoteActionCompatParcelizer.b);
            this.d = obtainStyledAttributes.getInteger(setEmptyVisibility.RemoteActionCompatParcelizer.d, 0);
            this.h = obtainStyledAttributes.getResourceId(setEmptyVisibility.RemoteActionCompatParcelizer.a, -1);
            this.e = obtainStyledAttributes.getInteger(setEmptyVisibility.RemoteActionCompatParcelizer.f, 0);
            this.b = obtainStyledAttributes.getInteger(setEmptyVisibility.RemoteActionCompatParcelizer.i, -1);
            this.c = obtainStyledAttributes.getInt(setEmptyVisibility.RemoteActionCompatParcelizer.h, 0);
            this.a = obtainStyledAttributes.getInt(setEmptyVisibility.RemoteActionCompatParcelizer.g, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(setEmptyVisibility.RemoteActionCompatParcelizer.j);
            this.f = hasValue;
            if (hasValue) {
                this.g = CoordinatorLayout.e(context, attributeSet, obtainStyledAttributes.getString(setEmptyVisibility.RemoteActionCompatParcelizer.j));
            }
            obtainStyledAttributes.recycle();
            write write = this.g;
            if (write != null) {
                write.d(this);
            }
        }

        public read(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f = false;
            this.d = 0;
            this.e = 0;
            this.b = -1;
            this.h = -1;
            this.c = 0;
            this.a = 0;
            this.s = new Rect();
        }

        public read(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f = false;
            this.d = 0;
            this.e = 0;
            this.b = -1;
            this.h = -1;
            this.c = 0;
            this.a = 0;
            this.s = new Rect();
        }

        public read(read read) {
            super((ViewGroup.MarginLayoutParams) read);
            this.f = false;
            this.d = 0;
            this.e = 0;
            this.b = -1;
            this.h = -1;
            this.c = 0;
            this.a = 0;
            this.s = new Rect();
        }

        public final void b(write write) {
            write write2 = this.g;
            if (write2 != write) {
                if (write2 != null) {
                    write2.e();
                }
                this.g = write;
                this.f5o = null;
                this.f = true;
                if (write != null) {
                    write.d(this);
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$write.class */
    public static abstract class write<V extends View> {
        public write() {
        }

        public write(Context context, AttributeSet attributeSet) {
        }

        public Parcelable a(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void c(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void c(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public void c(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        public boolean c(V v, View view) {
            return false;
        }

        public boolean c(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public void d(read read) {
        }

        public void d(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public void d(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
            }
            return false;
        }

        public void e() {
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        d = r0 != null ? r0.getName() : null;
        c = new Comparator<View>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$SearchResultReceiver
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(View view, View view2) {
                float B = findFragmentByWho.B(view);
                float B2 = findFragmentByWho.B(view2);
                if (B > B2) {
                    return -1;
                }
                return B < B2 ? 1 : 0;
            }
        };
        e = new Class[]{Context.class, AttributeSet.class};
        a = new ThreadLocal<>();
        f = new onFindViewById.read(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setEmptyVisibility.IconCompatParcelizer.c);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new ArrayList();
        this.m = new setGuidelineEnd<>();
        this.u = new ArrayList();
        this.w = new ArrayList();
        this.g = new int[2];
        this.r = new int[2];
        this.t = new ensureAnimationInfo();
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, setEmptyVisibility.RemoteActionCompatParcelizer.c, 0, setEmptyVisibility$MediaBrowserCompat$CustomActionResultReceiver.b) : context.obtainStyledAttributes(attributeSet, setEmptyVisibility.RemoteActionCompatParcelizer.c, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, setEmptyVisibility.RemoteActionCompatParcelizer.c, attributeSet, obtainStyledAttributes, 0, setEmptyVisibility$MediaBrowserCompat$CustomActionResultReceiver.b);
            } else {
                saveAttributeDataForStyleable(context, setEmptyVisibility.RemoteActionCompatParcelizer.c, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(setEmptyVisibility.RemoteActionCompatParcelizer.m, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.s.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.s;
                iArr[i2] = (int) (((float) iArr[i2]) * f2);
            }
        }
        this.x = obtainStyledAttributes.getDrawable(setEmptyVisibility.RemoteActionCompatParcelizer.n);
        obtainStyledAttributes.recycle();
        b();
        setOnHierarchyChangeListener(new IconCompatParcelizer());
        if (findFragmentByWho.l(this) == 0) {
            findFragmentByWho.j(this, 1);
        }
    }

    private int a(int i) {
        int[] iArr = this.s;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e("CoordinatorLayout", sb2.toString());
            return 0;
        }
    }

    private static void a(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        if (read2.p != i) {
            findFragmentByWho.e(view, i - read2.p);
            read2.p = i;
        }
    }

    private void a(View view, View view2, int i) {
        Rect a2 = f.a();
        Rect rect = a2;
        if (a2 == null) {
            rect = new Rect();
        }
        Rect a3 = f.a();
        Rect rect2 = a3;
        if (a3 == null) {
            rect2 = new Rect();
        }
        try {
            setContentId.a(this, view2, rect);
            read read2 = (read) view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            c(i, rect, rect2, read2, measuredWidth, measuredHeight);
            e(read2, rect2, measuredWidth, measuredHeight);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        } finally {
            rect.setEmpty();
            f.c(rect);
            rect2.setEmpty();
            f.c(rect2);
        }
    }

    private boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.u;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = c;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            z = z3;
            if (i3 >= size) {
                break;
            }
            View view = list.get(i3);
            read read2 = (read) view.getLayoutParams();
            write write2 = read2.g;
            if ((z3 || z4) && actionMasked != 0) {
                motionEvent2 = motionEvent2;
                z3 = z3;
                z4 = z4;
                if (write2 != null) {
                    motionEvent2 = motionEvent2;
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        write2.c(this, (CoordinatorLayout) view, motionEvent2);
                        z3 = z3;
                        z4 = z4;
                    } else if (i != 1) {
                        z3 = z3;
                        z4 = z4;
                    } else {
                        write2.e(this, (CoordinatorLayout) view, motionEvent2);
                        z3 = z3;
                        z4 = z4;
                    }
                }
            } else {
                boolean z5 = z3;
                if (!z3) {
                    z5 = z3;
                    if (write2 != null) {
                        if (i == 0) {
                            z3 = write2.c(this, (CoordinatorLayout) view, motionEvent);
                        } else if (i == 1) {
                            z3 = write2.e(this, (CoordinatorLayout) view, motionEvent);
                        }
                        z5 = z3;
                        if (z3) {
                            this.f4o = view;
                            z5 = z3;
                        }
                    }
                }
                if (read2.g == null) {
                    read2.m = false;
                }
                boolean z6 = read2.m;
                boolean z7 = read2.m;
                if (z7) {
                    z2 = true;
                } else {
                    write write3 = read2.g;
                    z2 = z7 | false;
                    read2.m = z2;
                }
                boolean z8 = z2 && !z6;
                motionEvent2 = motionEvent2;
                z3 = z5;
                z4 = z8;
                if (z2) {
                    z = z5;
                    if (!z8) {
                        break;
                    }
                    z4 = z8;
                    z3 = z5;
                    motionEvent2 = motionEvent2;
                } else {
                    continue;
                }
            }
            i3++;
        }
        list.clear();
        return z;
    }

    private static read b(View view) {
        read read2 = (read) view.getLayoutParams();
        if (!read2.f) {
            if (view instanceof CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver) {
                write c2 = ((CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver) view).c();
                if (c2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                read2.b(c2);
                read2.f = true;
            } else {
                Class<?> cls = view.getClass();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
                while (cls != null) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) cls.getAnnotation(RemoteActionCompatParcelizer.class);
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                    if (remoteActionCompatParcelizer2 != null) {
                        break;
                    }
                    cls = cls.getSuperclass();
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                }
                if (remoteActionCompatParcelizer != null) {
                    try {
                        read2.b((write) remoteActionCompatParcelizer.d().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder("Default behavior class ");
                        sb.append(remoteActionCompatParcelizer.d().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), e2);
                    }
                }
                read2.f = true;
            }
        }
        return read2;
    }

    private void b() {
        if (findFragmentByWho.h(this)) {
            if (this.j == null) {
                this.j = new instantiate() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.3
                    @Override // o.instantiate
                    public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                        CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                        if (!onDetach.a(coordinatorLayout.i, windowInsetsCompat)) {
                            coordinatorLayout.i = windowInsetsCompat;
                            boolean z = true;
                            boolean z2 = windowInsetsCompat != null && windowInsetsCompat.h() > 0;
                            coordinatorLayout.b = z2;
                            if (z2 || coordinatorLayout.getBackground() != null) {
                                z = false;
                            }
                            coordinatorLayout.setWillNotDraw(z);
                            if (!windowInsetsCompat.k()) {
                                int childCount = coordinatorLayout.getChildCount();
                                for (int i = 0; i < childCount; i++) {
                                    View childAt = coordinatorLayout.getChildAt(i);
                                    if (findFragmentByWho.h(childAt) && ((read) childAt.getLayoutParams()).g != null && windowInsetsCompat.k()) {
                                        break;
                                    }
                                }
                            }
                            coordinatorLayout.requestLayout();
                        }
                        return windowInsetsCompat;
                    }
                };
            }
            findFragmentByWho.d(this, this.j);
            setSystemUiVisibility(1280);
            return;
        }
        findFragmentByWho.d(this, (instantiate) null);
    }

    private static void c(int i, Rect rect, Rect rect2, read read2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = read2.d;
        int i7 = i6;
        if (i6 == 0) {
            i7 = 17;
        }
        int c2 = onGetLayoutInflater.c(i7, i);
        int i8 = read2.e;
        int i9 = i8;
        if ((i8 & 7) == 0) {
            i9 = i8 | 8388611;
        }
        int i10 = i9;
        if ((i9 & 112) == 0) {
            i10 = i9 | 48;
        }
        int c3 = onGetLayoutInflater.c(i10, i);
        int i11 = c2 & 7;
        int i12 = c2 & 112;
        int i13 = c3 & 7;
        int i14 = c3 & 112;
        int width = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 != 1) {
            i4 = width;
            if (i11 != 5) {
                i4 = width - i2;
            }
        } else {
            i4 = width - (i2 / 2);
        }
        if (i12 != 16) {
            i5 = height;
            if (i12 != 80) {
                i5 = height - i3;
            }
        } else {
            i5 = height - (i3 / 2);
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    private static void c(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        if (read2.r != i) {
            findFragmentByWho.d(view, i - read2.r);
            read2.r = i;
        }
    }

    private void c(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            write write2 = ((read) childAt.getLayoutParams()).g;
            if (write2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    write2.c(this, (CoordinatorLayout) childAt, obtain);
                } else {
                    write2.e(this, (CoordinatorLayout) childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((read) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.f4o = null;
        this.l = false;
    }

    private void d() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            setGuidelineEnd<View> setguidelineend = this.m;
            int size = setguidelineend.e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = false;
                    break;
                }
                ArrayList arrayList = (ArrayList) setguidelineend.e.h[(i2 << 1) + 1];
                if (arrayList != null && arrayList.contains(childAt)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                z = true;
                break;
            }
            i++;
        }
        if (z == this.q) {
            return;
        }
        if (z) {
            if (this.n) {
                if (this.v == null) {
                    this.v = new CoordinatorLayout$MediaBrowserCompat$MediaItem(this);
                }
                getViewTreeObserver().addOnPreDrawListener(this.v);
            }
            this.q = true;
            return;
        }
        if (this.n && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        this.q = false;
    }

    private void d(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            setContentId.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static write e(Context context, AttributeSet attributeSet, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str2 = sb.toString();
        } else if (str.indexOf(46) >= 0) {
            str2 = str;
        } else {
            String str3 = d;
            str2 = str;
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append('.');
                sb2.append(str);
                str2 = sb2.toString();
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<write>>> threadLocal = a;
            Map<String, Constructor<write>> map = threadLocal.get();
            Map<String, Constructor<write>> map2 = map;
            if (map == null) {
                map2 = new HashMap<>();
                threadLocal.set(map2);
            }
            Constructor<write> constructor = map2.get(str2);
            Constructor<write> constructor2 = constructor;
            if (constructor == null) {
                constructor2 = Class.forName(str2, false, context.getClassLoader()).getConstructor(e);
                constructor2.setAccessible(true);
                map2.put(str2, constructor2);
            }
            return constructor2.newInstance(context, attributeSet);
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder("Could not inflate Behavior subclass ");
            sb3.append(str2);
            throw new RuntimeException(sb3.toString(), e2);
        }
    }

    private void e(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        Rect a2 = f.a();
        Rect rect = a2;
        if (a2 == null) {
            rect = new Rect();
        }
        rect.set(getPaddingLeft() + read2.leftMargin, getPaddingTop() + read2.topMargin, (getWidth() - getPaddingRight()) - read2.rightMargin, (getHeight() - getPaddingBottom()) - read2.bottomMargin);
        if (this.i != null && findFragmentByWho.h(this) && !findFragmentByWho.h(view)) {
            rect.left += this.i.i();
            rect.top += this.i.h();
            rect.right -= this.i.f();
            rect.bottom -= this.i.j();
        }
        Rect a3 = f.a();
        Rect rect2 = a3;
        if (a3 == null) {
            rect2 = new Rect();
        }
        int i2 = read2.d;
        int i3 = i2;
        if ((i2 & 7) == 0) {
            i3 = i2 | 8388611;
        }
        int i4 = i3;
        if ((i3 & 112) == 0) {
            i4 = i3 | 48;
        }
        onGetLayoutInflater.b(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        rect.setEmpty();
        f.c(rect);
        rect2.setEmpty();
        f.c(rect2);
    }

    private void e(View view, int i, int i2) {
        int i3;
        read read2 = (read) view.getLayoutParams();
        int i4 = read2.d;
        int i5 = i4;
        if (i4 == 0) {
            i5 = 8388661;
        }
        int c2 = onGetLayoutInflater.c(i5, i2);
        int i6 = c2 & 7;
        int i7 = c2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i;
        if (i2 == 1) {
            i8 = width - i;
        }
        int a2 = a(i8) - measuredWidth;
        if (i6 != 1) {
            i3 = a2;
            if (i6 == 5) {
                i3 = a2 + measuredWidth;
            }
        } else {
            i3 = a2 + (measuredWidth / 2);
        }
        int i9 = 0;
        if (i7 == 16) {
            i9 = 0 + (measuredHeight / 2);
        } else if (i7 == 80) {
            i9 = measuredHeight;
        }
        int max = Math.max(getPaddingLeft() + read2.leftMargin, Math.min(i3, ((width - getPaddingRight()) - measuredWidth) - read2.rightMargin));
        int max2 = Math.max(getPaddingTop() + read2.topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight) - read2.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void e(read read2, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + read2.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - read2.rightMargin));
        int max2 = Math.max(getPaddingTop() + read2.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - read2.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final List<View> a(View view) {
        setGuidelineEnd<View> setguidelineend = this.m;
        int size = setguidelineend.e.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Object[] objArr = setguidelineend.e.h;
            int i2 = i << 1;
            ArrayList arrayList2 = (ArrayList) objArr[i2 + 1];
            arrayList = arrayList;
            if (arrayList2 != null) {
                arrayList = arrayList;
                if (arrayList2.contains(view)) {
                    arrayList = arrayList;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(setguidelineend.e.h[i2]);
                }
            }
        }
        this.w.clear();
        if (arrayList != null) {
            this.w.addAll(arrayList);
        }
        return this.w;
    }

    @Override // o.setupDialog
    public final void b(View view, int i) {
        ensureAnimationInfo ensureanimationinfo = this.t;
        if (i == 1) {
            ensureanimationinfo.d = 0;
        } else {
            ensureanimationinfo.c = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            read read2 = (read) childAt.getLayoutParams();
            if (i != 0 ? i != 1 ? false : read2.n : read2.l) {
                write write2 = read2.g;
                if (write2 != null) {
                    write2.d(this, childAt, view, i);
                }
                if (i == 0) {
                    read2.l = false;
                } else if (i == 1) {
                    read2.n = false;
                }
                read2.k = false;
            }
        }
        this.p = null;
    }

    @Override // o.setupDialog
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        e(view, i, i2, i3, i4, 0, this.r);
    }

    @Override // o.setupDialog
    public final void b(View view, View view2, int i, int i2) {
        ensureAnimationInfo ensureanimationinfo = this.t;
        if (i2 == 1) {
            ensureanimationinfo.d = i;
        } else {
            ensureanimationinfo.c = i;
        }
        this.p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            read read2 = (read) getChildAt(i3).getLayoutParams();
            if (i2 != 0 ? i2 != 1 ? false : read2.n : read2.l) {
                write write2 = read2.g;
            }
        }
    }

    public final void c(View view) {
        ArrayList<View> arrayList = this.m.e.get(view);
        if (!(arrayList == null || arrayList.isEmpty())) {
            for (int i = 0; i < arrayList.size(); i++) {
                View view2 = arrayList.get(i);
                write write2 = ((read) view2.getLayoutParams()).g;
                if (write2 != null) {
                    write2.b(this, view2, view);
                }
            }
        }
    }

    @Override // o.setupDialog
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                i4 = i4;
                i5 = i5;
            } else {
                read read2 = (read) childAt.getLayoutParams();
                if (!(i3 != 0 ? i3 != 1 ? false : read2.n : read2.l)) {
                    i4 = i4;
                    i5 = i5;
                } else {
                    write write2 = read2.g;
                    i4 = i4;
                    i5 = i5;
                    if (write2 != null) {
                        int[] iArr2 = this.g;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        write2.c(this, childAt, view, i, i2, iArr2, i3);
                        int[] iArr3 = this.g;
                        i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                        int[] iArr4 = this.g;
                        i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            d(1);
        }
    }

    public final boolean c(View view, int i, int i2) {
        Rect a2 = f.a();
        Rect rect = a2;
        if (a2 == null) {
            rect = new Rect();
        }
        setContentId.a(this, view, rect);
        try {
            return rect.contains(i, i2);
        } finally {
            rect.setEmpty();
            f.c(rect);
        }
    }

    @Override // o.setupDialog
    public final boolean c(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            z = z;
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                write write2 = read2.g;
                if (write2 != null) {
                    boolean d2 = write2.d(this, childAt, view, view2, i, i2);
                    boolean z2 = z | d2;
                    if (i2 != 0) {
                        z = z2;
                        if (i2 == 1) {
                            read2.n = d2;
                            z = z2;
                        }
                    } else {
                        read2.l = d2;
                        z = z2;
                    }
                } else if (i2 != 0) {
                    z = z;
                    if (i2 == 1) {
                        read2.n = false;
                        z = z;
                    }
                } else {
                    read2.l = false;
                    z = z;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof read) && checkLayoutParams(layoutParams);
    }

    public final List<View> d(View view) {
        ArrayList<View> arrayList = this.m.e.get(view);
        this.w.clear();
        if (arrayList != null) {
            this.w.addAll(arrayList);
        }
        return this.w;
    }

    public final void d(int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        write write2;
        int k = findFragmentByWho.k(this);
        int size = this.k.size();
        Rect a2 = f.a();
        Rect rect = a2;
        if (a2 == null) {
            rect = new Rect();
        }
        Rect a3 = f.a();
        Rect rect2 = a3;
        if (a3 == null) {
            rect2 = new Rect();
        }
        Rect a4 = f.a();
        Rect rect3 = a4;
        if (a4 == null) {
            rect3 = new Rect();
        }
        int i5 = 0;
        while (i5 < size) {
            View view = this.k.get(i5);
            read read2 = (read) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i2 = i5;
            } else {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (read2.i == this.k.get(i6)) {
                        read read3 = (read) view.getLayoutParams();
                        if (read3.j != null) {
                            Rect a5 = f.a();
                            Rect rect4 = a5;
                            if (a5 == null) {
                                rect4 = new Rect();
                            }
                            Rect a6 = f.a();
                            Rect rect5 = a6;
                            if (a6 == null) {
                                rect5 = new Rect();
                            }
                            Rect a7 = f.a();
                            Rect rect6 = a7;
                            if (a7 == null) {
                                rect6 = new Rect();
                            }
                            setContentId.a(this, read3.j, rect4);
                            d(view, false, rect5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c(k, rect4, rect6, read3, measuredWidth, measuredHeight);
                            boolean z4 = (rect6.left == rect5.left && rect6.top == rect5.top) ? false : true;
                            e(read3, rect6, measuredWidth, measuredHeight);
                            int i7 = rect6.left - rect5.left;
                            int i8 = rect6.top - rect5.top;
                            if (i7 != 0) {
                                findFragmentByWho.d(view, i7);
                            }
                            if (i8 != 0) {
                                findFragmentByWho.e(view, i8);
                            }
                            if (z4 && (write2 = read3.g) != null) {
                                write2.b(this, view, read3.j);
                            }
                            rect4.setEmpty();
                            f.c(rect4);
                            rect5.setEmpty();
                            f.c(rect5);
                            rect6.setEmpty();
                            f.c(rect6);
                        }
                    }
                }
                d(view, true, rect2);
                if (read2.c != 0 && !rect2.isEmpty()) {
                    int c2 = onGetLayoutInflater.c(read2.c, k);
                    int i9 = c2 & 112;
                    if (i9 == 48) {
                        rect.top = Math.max(rect.top, rect2.bottom);
                    } else if (i9 == 80) {
                        rect.bottom = Math.max(rect.bottom, getHeight() - rect2.top);
                    }
                    int i10 = c2 & 7;
                    if (i10 == 3) {
                        rect.left = Math.max(rect.left, rect2.right);
                    } else if (i10 == 5) {
                        rect.right = Math.max(rect.right, getWidth() - rect2.left);
                    }
                }
                if (read2.a != 0 && view.getVisibility() == 0 && findFragmentByWho.G(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    read read4 = (read) view.getLayoutParams();
                    write write3 = read4.g;
                    Rect a8 = f.a();
                    Rect rect7 = a8;
                    if (a8 == null) {
                        rect7 = new Rect();
                    }
                    Rect a9 = f.a();
                    Rect rect8 = a9;
                    if (a9 == null) {
                        rect8 = new Rect();
                    }
                    rect8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (write3 == null || !write3.c(this, (CoordinatorLayout) view, rect7)) {
                        rect7.set(rect8);
                    } else if (!rect8.contains(rect7)) {
                        StringBuilder sb = new StringBuilder("Rect should be within the child's bounds. Rect:");
                        sb.append(rect7.toShortString());
                        sb.append(" | Bounds:");
                        sb.append(rect8.toShortString());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    rect8.setEmpty();
                    f.c(rect8);
                    if (rect7.isEmpty()) {
                        rect7.setEmpty();
                        f.c(rect7);
                    } else {
                        int c3 = onGetLayoutInflater.c(read4.a, k);
                        if ((c3 & 48) != 48 || (i4 = (rect7.top - read4.topMargin) - read4.p) >= rect.top) {
                            z2 = false;
                        } else {
                            a(view, rect.top - i4);
                            z2 = true;
                        }
                        boolean z5 = z2;
                        if ((c3 & 80) == 80) {
                            int height = ((getHeight() - rect7.bottom) - read4.bottomMargin) + read4.p;
                            z5 = z2;
                            if (height < rect.bottom) {
                                a(view, height - rect.bottom);
                                z5 = true;
                            }
                        }
                        if (!z5) {
                            a(view, 0);
                        }
                        if ((c3 & 3) != 3 || (i3 = (rect7.left - read4.leftMargin) - read4.r) >= rect.left) {
                            z3 = false;
                        } else {
                            c(view, rect.left - i3);
                            z3 = true;
                        }
                        boolean z6 = z3;
                        if ((c3 & 5) == 5) {
                            int width = ((getWidth() - rect7.right) - read4.rightMargin) + read4.r;
                            z6 = z3;
                            if (width < rect.right) {
                                c(view, width - rect.right);
                                z6 = true;
                            }
                        }
                        if (!z6) {
                            c(view, 0);
                        }
                        rect7.setEmpty();
                        f.c(rect7);
                    }
                }
                if (i != 2) {
                    rect3.set(((read) view.getLayoutParams()).s);
                    if (!rect3.equals(rect2)) {
                        ((read) view.getLayoutParams()).s.set(rect2);
                    } else {
                        i2 = i5;
                    }
                }
                int i11 = i5 + 1;
                while (true) {
                    size = size;
                    i2 = i5;
                    if (i11 < size) {
                        View view2 = this.k.get(i11);
                        read read5 = (read) view2.getLayoutParams();
                        write write4 = read5.g;
                        if (write4 != null && write4.c((write) view2, view)) {
                            if (i != 0 || !read5.k) {
                                if (i != 2) {
                                    z = write4.b(this, view2, view);
                                } else {
                                    write4.c(this, view);
                                    z = true;
                                }
                                if (i == 1) {
                                    read5.k = z;
                                }
                            } else {
                                read5.k = false;
                            }
                        }
                        i11++;
                    }
                }
            }
            i5 = i2 + 1;
        }
        rect.setEmpty();
        f.c(rect);
        rect2.setEmpty();
        f.c(rect2);
        rect3.setEmpty();
        f.c(rect3);
    }

    public final void d(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        if (read2.j == null && read2.h != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (read2.j != null) {
            a(view, read2.j, i);
        } else if (read2.b >= 0) {
            e(view, read2.b, i);
        } else {
            e(view, i);
        }
    }

    public final void d(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.x;
        boolean z = false;
        if (drawable != null) {
            z = false;
            if (drawable.isStateful()) {
                z = false | drawable.setState(drawableState);
            }
        }
        if (z) {
            invalidate();
        }
    }

    @Override // o.show
    public final void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        write write2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                if ((i5 != 0 ? i5 != 1 ? false : read2.n : read2.l) && (write2 = read2.g) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    write2.d(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.g;
                    i7 = i3 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    i6 = i4 > 0 ? Math.max(i6, this.g[1]) : Math.min(i6, this.g[1]);
                    z = true;
                }
            }
            z = z;
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i6;
        if (z) {
            d(1);
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new read(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new read(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof read ? new read((read) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new read((ViewGroup.MarginLayoutParams) layoutParams) : new read(layoutParams);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ensureAnimationInfo ensureanimationinfo = this.t;
        return ensureanimationinfo.d | ensureanimationinfo.c;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        onAttachedToWindow();
        c(false);
        if (this.q) {
            if (this.v == null) {
                this.v = new CoordinatorLayout$MediaBrowserCompat$MediaItem(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        if (this.i == null && findFragmentByWho.h(this)) {
            findFragmentByWho.J(this);
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        onDetachedFromWindow();
        c(false);
        if (this.q && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        View view = this.p;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.n = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        onDraw(canvas);
        if (this.b && this.x != null) {
            WindowInsetsCompat windowInsetsCompat = this.i;
            int h = windowInsetsCompat != null ? windowInsetsCompat.h() : 0;
            if (h > 0) {
                this.x.setBounds(0, 0, getWidth(), h);
                this.x.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            c(true);
        }
        return a2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        write write2;
        int k = findFragmentByWho.k(this);
        int size = this.k.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.k.get(i5);
            if (view.getVisibility() != 8 && ((write2 = ((read) view.getLayoutParams()).g) == null || !write2.e(this, (CoordinatorLayout) view, k))) {
                d(view, k);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
        if (r12 != false) goto L_0x01aa;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0256  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onMeasure(int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 1399
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                if (read2.l) {
                    write write2 = read2.g;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                z = z;
            } else {
                read read2 = (read) childAt.getLayoutParams();
                if (!read2.l) {
                    z = z;
                } else {
                    write write2 = read2.g;
                    z = z;
                    if (write2 != null) {
                        z |= write2.a(this, childAt, view, f2, f3);
                    }
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0, this.r);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof CoordinatorLayout$MediaBrowserCompat$ItemReceiver)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        CoordinatorLayout$MediaBrowserCompat$ItemReceiver coordinatorLayout$MediaBrowserCompat$ItemReceiver = (CoordinatorLayout$MediaBrowserCompat$ItemReceiver) parcelable;
        onRestoreInstanceState(coordinatorLayout$MediaBrowserCompat$ItemReceiver.d);
        SparseArray<Parcelable> sparseArray = coordinatorLayout$MediaBrowserCompat$ItemReceiver.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            write write2 = b(childAt).g;
            if (!(id == -1 || write2 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                write2.c(this, (CoordinatorLayout) childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable a2;
        CoordinatorLayout$MediaBrowserCompat$ItemReceiver coordinatorLayout$MediaBrowserCompat$ItemReceiver = new CoordinatorLayout$MediaBrowserCompat$ItemReceiver(onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            write write2 = ((read) childAt.getLayoutParams()).g;
            if (!(id == -1 || write2 == null || (a2 = write2.a(this, childAt)) == null)) {
                sparseArray.append(id, a2);
            }
        }
        coordinatorLayout$MediaBrowserCompat$ItemReceiver.c = sparseArray;
        return coordinatorLayout$MediaBrowserCompat$ItemReceiver;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r12 != false) goto L_0x001f;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = r10
            int r0 = r0.getActionMasked()
            r11 = r0
            r0 = r9
            android.view.View r0 = r0.f4o
            if (r0 != 0) goto L_0x001d
            r0 = r9
            r1 = r10
            r2 = 1
            boolean r0 = r0.a(r1, r2)
            r12 = r0
            r0 = r12
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L_0x004c
            goto L_0x001f
        L_0x001d:
            r0 = 0
            r12 = r0
        L_0x001f:
            r0 = r9
            android.view.View r0 = r0.f4o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$read r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.read) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$write r0 = r0.g
            r14 = r0
            r0 = r12
            r13 = r0
            r0 = r14
            if (r0 == 0) goto L_0x004c
            r0 = r14
            r1 = r9
            r2 = r9
            android.view.View r2 = r2.f4o
            r3 = r10
            boolean r0 = r0.e(r1, r2, r3)
            r15 = r0
            r0 = r12
            r13 = r0
            r0 = r15
            r12 = r0
            goto L_0x004e
        L_0x004c:
            r0 = 0
            r12 = r0
        L_0x004e:
            r0 = r9
            android.view.View r0 = r0.f4o
            r16 = r0
            r0 = 0
            r14 = r0
            r0 = r16
            if (r0 != 0) goto L_0x006b
            r0 = r12
            r1 = r9
            r2 = r10
            boolean r1 = r1.onTouchEvent(r2)
            r0 = r0 | r1
            r15 = r0
            r0 = r14
            r10 = r0
            goto L_0x0090
        L_0x006b:
            r0 = r12
            r15 = r0
            r0 = r14
            r10 = r0
            r0 = r13
            if (r0 == 0) goto L_0x0090
            long r0 = android.os.SystemClock.uptimeMillis()
            r17 = r0
            r0 = r17
            r1 = r17
            r2 = 3
            r3 = 0
            r4 = 0
            r5 = 0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r1, r2, r3, r4, r5)
            r10 = r0
            r0 = r9
            r1 = r10
            boolean r0 = r0.onTouchEvent(r1)
            r0 = r12
            r15 = r0
        L_0x0090:
            r0 = r10
            if (r0 == 0) goto L_0x0098
            r0 = r10
            r0.recycle()
        L_0x0098:
            r0 = r11
            r1 = 1
            if (r0 == r1) goto L_0x00a2
            r0 = r11
            r1 = 3
            if (r0 != r1) goto L_0x00a7
        L_0x00a2:
            r0 = r9
            r1 = 0
            r0.c(r1)
        L_0x00a7:
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        write write2 = ((read) view.getLayoutParams()).g;
        if (write2 == null || !write2.b(this, view, rect, z)) {
            return requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        requestDisallowInterceptTouchEvent(z);
        if (z && !this.l) {
            c(false);
            this.l = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        setFitsSystemWindows(z);
        b();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.x = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.x.setState(getDrawableState());
                }
                getInsetsForType.c(this.x, findFragmentByWho.k(this));
                this.x.setVisible(getVisibility() == 0, false);
                this.x.setCallback(this);
            }
            findFragmentByWho.K(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? copyWindowDataInto.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.x;
        if (drawable != null && drawable.isVisible() != z) {
            this.x.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return verifyDrawable(drawable) || drawable == this.x;
    }
}
