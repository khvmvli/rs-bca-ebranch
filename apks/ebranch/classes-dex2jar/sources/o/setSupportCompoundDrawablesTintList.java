package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.WindowInsetsCompat;
import io.realm.internal.Property;
import o.setDropDownBackgroundResource;
/* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintList.class */
public class setSupportCompoundDrawablesTintList extends ViewGroup implements setBaselineAligned, show {
    static final int[] e = {setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.a, 16842841};
    private int A;
    private WindowInsetsCompat B;
    private final Rect C;
    private final Rect D;
    private Drawable E;
    private int I;
    ViewPropertyAnimator a;
    final Runnable b;
    boolean c;
    setSupportButtonTintList d;
    private write f;
    private int g;
    final Runnable h;
    public boolean i;
    final AnimatorListenerAdapter j;
    private final Rect k;
    private WindowInsetsCompat l;
    private final Rect m;
    private final Rect n;

    /* renamed from: o  reason: collision with root package name */
    private setDividerDrawable f273o;
    private OverScroller p;
    private boolean q;
    private int r;
    private setSelector s;
    private boolean t;
    private WindowInsetsCompat u;
    private boolean v;
    private WindowInsetsCompat w;
    private final Rect x;
    private final Rect y;
    private final ensureAnimationInfo z;

    /* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintList$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends ViewGroup.MarginLayoutParams {
        public RemoteActionCompatParcelizer(int i, int i2) {
            super(-1, -1);
        }

        public RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public RemoteActionCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintList$write.class */
    public interface write {
        void e(int i);

        void f();

        void f(boolean z);

        void i();

        void j();
    }

    public setSupportCompoundDrawablesTintList(Context context) {
        this(context, null);
    }

    public setSupportCompoundDrawablesTintList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = 0;
        this.m = new Rect();
        this.x = new Rect();
        this.k = new Rect();
        this.n = new Rect();
        this.C = new Rect();
        this.y = new Rect();
        this.D = new Rect();
        this.l = WindowInsetsCompat.e;
        this.w = WindowInsetsCompat.e;
        this.u = WindowInsetsCompat.e;
        this.B = WindowInsetsCompat.e;
        this.j = new AnimatorListenerAdapter() { // from class: o.setSupportCompoundDrawablesTintList.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                setSupportCompoundDrawablesTintList.this.a = null;
                setSupportCompoundDrawablesTintList.this.c = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                setSupportCompoundDrawablesTintList.this.a = null;
                setSupportCompoundDrawablesTintList.this.c = false;
            }
        };
        this.h = new Runnable() { // from class: o.setSupportCompoundDrawablesTintList.3
            @Override // java.lang.Runnable
            public final void run() {
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = setSupportCompoundDrawablesTintList.this;
                setsupportcompounddrawablestintlist.removeCallbacks(setsupportcompounddrawablestintlist.h);
                setsupportcompounddrawablestintlist.removeCallbacks(setsupportcompounddrawablestintlist.b);
                ViewPropertyAnimator viewPropertyAnimator = setsupportcompounddrawablestintlist.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = setSupportCompoundDrawablesTintList.this;
                setsupportcompounddrawablestintlist2.a = setsupportcompounddrawablestintlist2.d.animate().translationY(0.0f).setListener(setSupportCompoundDrawablesTintList.this.j);
            }
        };
        this.b = new Runnable() { // from class: o.setSupportCompoundDrawablesTintList.4
            @Override // java.lang.Runnable
            public final void run() {
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = setSupportCompoundDrawablesTintList.this;
                setsupportcompounddrawablestintlist.removeCallbacks(setsupportcompounddrawablestintlist.h);
                setsupportcompounddrawablestintlist.removeCallbacks(setsupportcompounddrawablestintlist.b);
                ViewPropertyAnimator viewPropertyAnimator = setsupportcompounddrawablestintlist.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = setSupportCompoundDrawablesTintList.this;
                setsupportcompounddrawablestintlist2.a = setsupportcompounddrawablestintlist2.d.animate().translationY((float) (-setSupportCompoundDrawablesTintList.this.d.getHeight())).setListener(setSupportCompoundDrawablesTintList.this.j);
            }
        };
        a(context);
        this.z = new ensureAnimationInfo();
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(e);
        boolean z = false;
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.E = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.v = z;
        this.p = new OverScroller(context);
    }

    private static setSelector b(View view) {
        if (view instanceof setSelector) {
            return (setSelector) view;
        }
        if (view instanceof setInputType) {
            setInputType setinputtype = (setInputType) view;
            if (setinputtype.n == null) {
                setinputtype.n = new setQuery(setinputtype, true);
            }
            return setinputtype.n;
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    private static boolean e(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
        boolean z5 = true;
        if (remoteActionCompatParcelizer.leftMargin != rect.left) {
            remoteActionCompatParcelizer.leftMargin = rect.left;
            z5 = true;
        } else {
            z5 = false;
        }
        if (remoteActionCompatParcelizer.topMargin != rect.top) {
            remoteActionCompatParcelizer.topMargin = rect.top;
            z5 = true;
        }
        if (remoteActionCompatParcelizer.rightMargin != rect.right) {
            remoteActionCompatParcelizer.rightMargin = rect.right;
            z5 = true;
        }
        if (z3 && remoteActionCompatParcelizer.bottomMargin != rect.bottom) {
            remoteActionCompatParcelizer.bottomMargin = rect.bottom;
        }
        return z5;
    }

    private void j() {
        if (this.f273o == null) {
            this.f273o = (setDividerDrawable) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.a);
            this.d = (setSupportButtonTintList) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.b);
            this.s = b(findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.d));
        }
    }

    @Override // o.setBaselineAligned
    public final boolean a() {
        j();
        return this.s.g();
    }

    @Override // o.setupDialog
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // o.setupDialog
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o.setupDialog
    public final void b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.setBaselineAligned
    public final boolean b() {
        j();
        return this.s.e();
    }

    @Override // o.setupDialog
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // o.setBaselineAligned
    public final boolean c() {
        j();
        return this.s.m();
    }

    @Override // o.setupDialog
    public final boolean c(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof RemoteActionCompatParcelizer;
    }

    @Override // o.setBaselineAligned
    public final void d() {
        j();
        this.s.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        draw(canvas);
        if (this.E != null && !this.v) {
            int bottom = this.d.getVisibility() == 0 ? (int) (((float) this.d.getBottom()) + this.d.getTranslationY() + 0.5f) : 0;
            this.E.setBounds(0, bottom, getWidth(), this.E.getIntrinsicHeight() + bottom);
            this.E.draw(canvas);
        }
    }

    @Override // o.setBaselineAligned
    public final void e(int i) {
        j();
        if (i == 2) {
            this.s.n();
        } else if (i == 5) {
            this.s.k();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // o.show
    public final void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o.setBaselineAligned
    public final boolean e() {
        j();
        return this.s.l();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new RemoteActionCompatParcelizer(-1, -1);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new RemoteActionCompatParcelizer(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new RemoteActionCompatParcelizer(layoutParams);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ensureAnimationInfo ensureanimationinfo = this.z;
        return ensureanimationinfo.d | ensureanimationinfo.c;
    }

    @Override // o.setBaselineAligned
    public final boolean h() {
        j();
        return this.s.r();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        WindowInsetsCompat a = WindowInsetsCompat.a(windowInsets, this);
        boolean e2 = e(this.d, new Rect(a.i(), a.h(), a.f(), a.j()), true, true, false, true);
        findFragmentByWho.e(this, a, this.m);
        WindowInsetsCompat a2 = a.a(this.m.left, this.m.top, this.m.right, this.m.bottom);
        this.l = a2;
        e2 = true;
        if (!this.w.equals(a2)) {
            this.w = this.l;
            e2 = true;
        }
        if (!this.x.equals(this.m)) {
            this.x.set(this.m);
        }
        if (e2) {
            requestLayout();
        }
        return a.a().d().b().n();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        a(getContext());
        findFragmentByWho.J(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        removeCallbacks(this.h);
        removeCallbacks(this.b);
        ViewPropertyAnimator viewPropertyAnimator = this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = remoteActionCompatParcelizer.leftMargin + paddingLeft;
                int i7 = remoteActionCompatParcelizer.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        j();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + remoteActionCompatParcelizer.leftMargin + remoteActionCompatParcelizer.rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + remoteActionCompatParcelizer.topMargin + remoteActionCompatParcelizer.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        boolean z = (findFragmentByWho.w(this) & Property.TYPE_SET) != 0;
        if (z) {
            int i4 = this.g;
            i3 = i4;
            if (this.q) {
                i3 = i4;
                if (this.d.j != null) {
                    i3 = i4 + this.g;
                }
            }
        } else {
            i3 = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        this.k.set(this.m);
        this.u = this.l;
        if (this.i || z) {
            this.u = new WindowInsetsCompat.RemoteActionCompatParcelizer(this.u).a(hashCode.b(this.u.i(), this.u.h() + i3, this.u.f(), this.u.j())).d();
        } else {
            this.k.top += i3;
            Rect rect = this.k;
            rect.bottom = rect.bottom;
            this.u = this.u.a(0, i3, 0, 0);
        }
        e(this.f273o, this.k, true, true, true, true);
        if (!this.B.equals(this.u)) {
            WindowInsetsCompat windowInsetsCompat = this.u;
            this.B = windowInsetsCompat;
            findFragmentByWho.c(this.f273o, windowInsetsCompat);
        }
        measureChildWithMargins(this.f273o, i, 0, i2, 0);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) this.f273o.getLayoutParams();
        int max3 = Math.max(max, this.f273o.getMeasuredWidth() + remoteActionCompatParcelizer2.leftMargin + remoteActionCompatParcelizer2.rightMargin);
        int max4 = Math.max(max2, this.f273o.getMeasuredHeight() + remoteActionCompatParcelizer2.topMargin + remoteActionCompatParcelizer2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f273o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.t || !z) {
            return false;
        }
        this.p.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.p.getFinalY() > this.d.getHeight()) {
            z2 = true;
        }
        if (z2) {
            removeCallbacks(this.h);
            removeCallbacks(this.b);
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.b.run();
        } else {
            removeCallbacks(this.h);
            removeCallbacks(this.b);
            ViewPropertyAnimator viewPropertyAnimator2 = this.a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            this.h.run();
        }
        this.c = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.r + i2;
        this.r = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.z.c = i;
        setSupportButtonTintList setsupportbuttontintlist = this.d;
        this.r = setsupportbuttontintlist != null ? -((int) setsupportbuttontintlist.getTranslationY()) : 0;
        removeCallbacks(this.h);
        removeCallbacks(this.b);
        ViewPropertyAnimator viewPropertyAnimator = this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        write write2 = this.f;
        if (write2 != null) {
            write2.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.t && !this.c) {
            if (this.r <= this.d.getHeight()) {
                removeCallbacks(this.h);
                removeCallbacks(this.b);
                ViewPropertyAnimator viewPropertyAnimator = this.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                postDelayed(this.h, 600);
                return;
            }
            removeCallbacks(this.h);
            removeCallbacks(this.b);
            ViewPropertyAnimator viewPropertyAnimator2 = this.a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            postDelayed(this.b, 600);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.A;
        this.A = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & Property.TYPE_SET) != 0) {
            z = true;
        }
        write write2 = this.f;
        if (write2 != null) {
            write2.f(!z);
            if (z2 || !z) {
                this.f.i();
            } else {
                this.f.j();
            }
        }
        if (((i ^ i2) & Property.TYPE_SET) != 0 && this.f != null) {
            findFragmentByWho.J(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        onWindowVisibilityChanged(i);
        this.I = i;
        write write2 = this.f;
        if (write2 != null) {
            write2.e(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        removeCallbacks(this.h);
        removeCallbacks(this.b);
        ViewPropertyAnimator viewPropertyAnimator = this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.d.setTranslationY((float) (-Math.max(0, Math.min(i, this.d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(write write2) {
        this.f = write2;
        if (getWindowToken() != null) {
            this.f.e(this.I);
            int i = this.A;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                findFragmentByWho.J(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.q = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.t) {
            this.t = z;
            if (!z) {
                removeCallbacks(this.h);
                removeCallbacks(this.b);
                ViewPropertyAnimator viewPropertyAnimator = this.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        j();
        this.s.a(i);
    }

    public void setIcon(Drawable drawable) {
        j();
        this.s.e(drawable);
    }

    public void setLogo(int i) {
        j();
        this.s.c(i);
    }

    @Override // o.setBaselineAligned
    public void setMenu(Menu menu, setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        j();
        this.s.e(menu, iconCompatParcelizer);
    }

    @Override // o.setBaselineAligned
    public void setMenuPrepared() {
        j();
        this.s.o();
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        this.v = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // o.setBaselineAligned
    public void setWindowCallback(Window.Callback callback) {
        j();
        this.s.b(callback);
    }

    @Override // o.setBaselineAligned
    public void setWindowTitle(CharSequence charSequence) {
        j();
        this.s.d(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
