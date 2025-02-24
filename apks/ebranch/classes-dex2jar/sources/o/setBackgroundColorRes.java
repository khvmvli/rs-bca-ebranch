package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import o.setAnimationListener;
/* loaded from: classes-dex2jar.jar:o/setBackgroundColorRes.class */
public class setBackgroundColorRes extends ViewGroup implements onViewStateRestored {
    private static final String m = "SwipeRefreshLayout";
    private static final int[] n = {16842766};
    private boolean A;
    private int B;
    private float C;
    private final setStyle D;
    private final int[] E;
    private Animation.AnimationListener F;
    private final ensureAnimationInfo G;
    private final int[] H;
    private boolean I;
    private Animation J;
    private View K;
    private float L;
    private Animation M;
    private Animation N;
    private int Q;
    private float R;
    protected int a;
    read b;
    int c;
    setColorScheme d;
    int e;
    boolean f;
    boolean g;
    setAnimationListener h;
    protected int i;
    public boolean j;
    int k;
    boolean l;

    /* renamed from: o  reason: collision with root package name */
    float f200o;
    private Animation p;
    private final Animation q;
    private Animation r;
    private int s;
    private final Animation t;
    private int u;
    private final DecelerateInterpolator v;
    private setBackgroundColorRes$MediaBrowserCompat$CustomActionResultReceiver w;
    private int x;
    private float y;
    private boolean z;

    /* loaded from: classes-dex2jar.jar:o/setBackgroundColorRes$read.class */
    public interface read {
        void c();
    }

    public setBackgroundColorRes(Context context) {
        this(context, null);
    }

    public setBackgroundColorRes(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.L = -1.0f;
        this.H = new int[2];
        this.E = new int[2];
        this.s = -1;
        this.x = -1;
        this.F = new Animation.AnimationListener() { // from class: o.setBackgroundColorRes.3
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (setBackgroundColorRes.this.j) {
                    setBackgroundColorRes.this.h.setAlpha(255);
                    setBackgroundColorRes.this.h.start();
                    if (setBackgroundColorRes.this.f && setBackgroundColorRes.this.b != null) {
                        setBackgroundColorRes.this.b.c();
                    }
                    setBackgroundColorRes setbackgroundcolorres = setBackgroundColorRes.this;
                    setbackgroundcolorres.c = setbackgroundcolorres.d.getTop();
                    return;
                }
                setBackgroundColorRes.this.a();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        };
        this.q = new Animation() { // from class: o.setBackgroundColorRes.8
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int abs = !setBackgroundColorRes.this.l ? setBackgroundColorRes.this.k - Math.abs(setBackgroundColorRes.this.i) : setBackgroundColorRes.this.k;
                int i = setBackgroundColorRes.this.a;
                int i2 = (int) (((float) (abs - setBackgroundColorRes.this.a)) * f);
                int top = setBackgroundColorRes.this.d.getTop();
                setBackgroundColorRes setbackgroundcolorres = setBackgroundColorRes.this;
                setbackgroundcolorres.d.bringToFront();
                findFragmentByWho.e((View) setbackgroundcolorres.d, (i + i2) - top);
                setbackgroundcolorres.c = setbackgroundcolorres.d.getTop();
                setAnimationListener setanimationlistener = setBackgroundColorRes.this.h;
                float f2 = 1.0f - f;
                setAnimationListener.write write = setanimationlistener.a;
                if (f2 != write.a) {
                    write.a = f2;
                }
                setanimationlistener.invalidateSelf();
            }
        };
        this.t = new Animation() { // from class: o.setBackgroundColorRes.10
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                setBackgroundColorRes.this.a(f);
            }
        };
        this.Q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.B = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.v = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.u = (int) (displayMetrics.density * 40.0f);
        this.d = new setColorScheme(getContext(), -328966);
        setAnimationListener setanimationlistener = new setAnimationListener(getContext());
        this.h = setanimationlistener;
        setanimationlistener.e(1);
        this.d.setImageDrawable(this.h);
        this.d.setVisibility(8);
        addView(this.d);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.k = i;
        this.L = (float) i;
        this.G = new ensureAnimationInfo();
        this.D = new setStyle(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.u;
        this.c = i2;
        this.i = i2;
        a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private Animation a(final int i, final int i2) {
        AnonymousClass2 r0 = new Animation() { // from class: o.setBackgroundColorRes.2
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                setAnimationListener setanimationlistener = setBackgroundColorRes.this.h;
                int i3 = i;
                setanimationlistener.setAlpha((int) (((float) i3) + (((float) (i2 - i3)) * f)));
            }
        };
        r0.setDuration(300);
        this.d.setAnimationListener(null);
        this.d.clearAnimation();
        this.d.startAnimation(r0);
        return r0;
    }

    private void b(float f) {
        setAnimationListener setanimationlistener = this.h;
        setAnimationListener.write write = setanimationlistener.a;
        boolean z = true;
        boolean z2 = true;
        if (!write.l) {
            write.l = true;
        }
        setanimationlistener.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.L));
        float max = (Math.max((float) (((double) min) - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f);
        float f2 = this.L;
        int i = this.e;
        if (i <= 0) {
            i = this.l ? this.k - this.i : this.k;
        }
        float f3 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs - f2, f3 * 2.0f) / f3) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.i;
        int i3 = (int) ((min * f3) + (f3 * pow * 2.0f));
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        if (!this.g) {
            this.d.setScaleX(1.0f);
            this.d.setScaleY(1.0f);
        }
        if (this.g) {
            float min2 = Math.min(1.0f, f / this.L);
            this.d.setScaleX(min2);
            this.d.setScaleY(min2);
        }
        if (f < this.L) {
            if (this.h.getAlpha() > 76) {
                Animation animation = this.r;
                if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
                    z2 = false;
                }
                if (!z2) {
                    this.r = a(this.h.getAlpha(), 76);
                }
            }
        } else if (this.h.getAlpha() < 255) {
            Animation animation2 = this.p;
            if (animation2 == null || !animation2.hasStarted() || animation2.hasEnded()) {
                z = false;
            }
            if (!z) {
                this.p = a(this.h.getAlpha(), 255);
            }
        }
        this.h.a(0.0f, Math.min(0.8f, max * 0.8f));
        setAnimationListener setanimationlistener2 = this.h;
        float min3 = Math.min(1.0f, max);
        setAnimationListener.write write2 = setanimationlistener2.a;
        if (min3 != write2.a) {
            write2.a = min3;
        }
        setanimationlistener2.invalidateSelf();
        setAnimationListener setanimationlistener3 = this.h;
        setanimationlistener3.a.k = (((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f;
        setanimationlistener3.invalidateSelf();
        int i4 = this.c;
        this.d.bringToFront();
        findFragmentByWho.e((View) this.d, (i2 + i3) - i4);
        this.c = this.d.getTop();
    }

    private void b(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.s) {
            this.s = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void c(float f) {
        float f2 = this.y;
        float f3 = (float) this.Q;
        if (f - f2 > f3 && !this.z) {
            this.C = f2 + f3;
            this.z = true;
            this.h.setAlpha(76);
        }
    }

    private void c(boolean z, boolean z2) {
        if (this.j != z) {
            this.f = z2;
            d();
            this.j = z;
            if (z) {
                d(this.c, this.F);
            } else {
                d(this.F);
            }
        }
    }

    private boolean c() {
        setBackgroundColorRes$MediaBrowserCompat$CustomActionResultReceiver setbackgroundcolorres_mediabrowsercompat_customactionresultreceiver = this.w;
        if (setbackgroundcolorres_mediabrowsercompat_customactionresultreceiver != null) {
            return setbackgroundcolorres_mediabrowsercompat_customactionresultreceiver.d();
        }
        View view = this.K;
        return view instanceof ListView ? getLayoutInflater.c((ListView) view, -1) : view.canScrollVertically(-1);
    }

    private void d() {
        if (this.K == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.d)) {
                    this.K = childAt;
                    return;
                }
            }
        }
    }

    private void d(int i, Animation.AnimationListener animationListener) {
        this.a = i;
        this.q.reset();
        this.q.setDuration(200);
        this.q.setInterpolator(this.v);
        if (animationListener != null) {
            this.d.setAnimationListener(animationListener);
        }
        this.d.clearAnimation();
        this.d.startAnimation(this.q);
    }

    private void e(float f) {
        if (f > this.L) {
            c(true, true);
            return;
        }
        this.j = false;
        this.h.a(0.0f, 0.0f);
        AnonymousClass1 r6 = !this.g ? new Animation.AnimationListener() { // from class: o.setBackgroundColorRes.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (!setBackgroundColorRes.this.g) {
                    setBackgroundColorRes.this.d(null);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        } : null;
        int i = this.c;
        if (this.g) {
            this.a = i;
            this.f200o = this.d.getScaleX();
            AnonymousClass7 r0 = new Animation() { // from class: o.setBackgroundColorRes.7
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f2, Transformation transformation) {
                    float f3 = setBackgroundColorRes.this.f200o;
                    float f4 = -setBackgroundColorRes.this.f200o;
                    setBackgroundColorRes setbackgroundcolorres = setBackgroundColorRes.this;
                    float f5 = f3 + (f4 * f2);
                    setbackgroundcolorres.d.setScaleX(f5);
                    setbackgroundcolorres.d.setScaleY(f5);
                    setBackgroundColorRes.this.a(f2);
                }
            };
            this.J = r0;
            r0.setDuration(150);
            if (r6 != null) {
                this.d.setAnimationListener(r6);
            }
            this.d.clearAnimation();
            this.d.startAnimation(this.J);
        } else {
            this.a = i;
            this.t.reset();
            this.t.setDuration(200);
            this.t.setInterpolator(this.v);
            if (r6 != null) {
                this.d.setAnimationListener(r6);
            }
            this.d.clearAnimation();
            this.d.startAnimation(this.t);
        }
        setAnimationListener setanimationlistener = this.h;
        setAnimationListener.write write = setanimationlistener.a;
        if (write.l) {
            write.l = false;
        }
        setanimationlistener.invalidateSelf();
    }

    final void a() {
        this.d.clearAnimation();
        this.h.stop();
        this.d.setVisibility(8);
        this.d.getBackground().setAlpha(255);
        this.h.setAlpha(255);
        if (this.g) {
            this.d.setScaleX(0.0f);
            this.d.setScaleY(0.0f);
        } else {
            int i = this.i;
            int i2 = this.c;
            this.d.bringToFront();
            findFragmentByWho.e((View) this.d, i - i2);
            this.c = this.d.getTop();
        }
        this.c = this.d.getTop();
    }

    final void a(float f) {
        int i = this.a;
        int i2 = (int) (((float) (this.i - i)) * f);
        int top = this.d.getTop();
        this.d.bringToFront();
        findFragmentByWho.e((View) this.d, (i + i2) - top);
        this.c = this.d.getTop();
    }

    final void d(Animation.AnimationListener animationListener) {
        AnonymousClass4 r0 = new Animation() { // from class: o.setBackgroundColorRes.4
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                setBackgroundColorRes setbackgroundcolorres = setBackgroundColorRes.this;
                float f2 = 1.0f - f;
                setbackgroundcolorres.d.setScaleX(f2);
                setbackgroundcolorres.d.setScaleY(f2);
            }
        };
        this.N = r0;
        r0.setDuration(150);
        this.d.setAnimationListener(animationListener);
        this.d.clearAnimation();
        this.d.startAnimation(this.N);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.D.e(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.D.a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.D.e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.D.e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = this.x;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        int i4 = i2;
        if (i2 >= i3) {
            i4 = i2 + 1;
        }
        return i4;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ensureAnimationInfo ensureanimationinfo = this.G;
        return ensureanimationinfo.d | ensureanimationinfo.c;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.D.b();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.D.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        a();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.I && actionMasked == 0) {
            this.I = false;
        }
        if (!isEnabled() || this.I || c() || this.j || this.A) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.s;
                    if (i == -1) {
                        Log.e(m, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    c(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        b(motionEvent);
                    }
                }
            }
            this.z = false;
            this.s = -1;
        } else {
            int i2 = this.i;
            int top = this.d.getTop();
            this.d.bringToFront();
            findFragmentByWho.e((View) this.d, i2 - top);
            this.c = this.d.getTop();
            int pointerId = motionEvent.getPointerId(0);
            this.s = pointerId;
            this.z = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.y = motionEvent.getY(findPointerIndex2);
        }
        return this.z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.K == null) {
                d();
            }
            View view = this.K;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.d.getMeasuredWidth();
                int measuredHeight2 = this.d.getMeasuredHeight();
                setColorScheme setcolorscheme = this.d;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.c;
                setcolorscheme.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        onMeasure(i, i2);
        if (this.K == null) {
            d();
        }
        View view = this.K;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.d.measure(View.MeasureSpec.makeMeasureSpec(this.u, 1073741824), View.MeasureSpec.makeMeasureSpec(this.u, 1073741824));
            this.x = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.d) {
                    this.x = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.R;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.R = 0.0f;
                } else {
                    this.R = f - f2;
                    iArr[1] = i2;
                }
                b(this.R);
            }
        }
        if (this.l && i2 > 0 && this.R == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.d.setVisibility(8);
        }
        int[] iArr2 = this.H;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.E);
        int i5 = i4 + this.E[1];
        if (i5 < 0 && !c()) {
            float abs = this.R + ((float) Math.abs(i5));
            this.R = abs;
            b(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.G.d(view, view2, i);
        startNestedScroll(i & 2);
        this.R = 0.0f;
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.I && !this.j && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.G.c = 0;
        this.A = false;
        float f = this.R;
        if (f > 0.0f) {
            e(f);
            this.R = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.I && actionMasked == 0) {
            this.I = false;
        }
        if (!isEnabled() || this.I || c() || this.j || this.A) {
            return false;
        }
        if (actionMasked == 0) {
            this.s = motionEvent.getPointerId(0);
            this.z = false;
            return true;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.s);
            if (findPointerIndex < 0) {
                Log.e(m, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.z) {
                float y = motionEvent.getY(findPointerIndex);
                float f = this.C;
                this.z = false;
                e((y - f) * 0.5f);
            }
            this.s = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.s);
            if (findPointerIndex2 < 0) {
                Log.e(m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            c(y2);
            if (!this.z) {
                return true;
            }
            float f2 = (y2 - this.C) * 0.5f;
            if (f2 <= 0.0f) {
                return false;
            }
            b(f2);
            return true;
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.s = motionEvent.getPointerId(actionIndex);
                return true;
            } else if (actionMasked != 6) {
                return true;
            } else {
                b(motionEvent);
                return true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.K;
        if (view == null || findFragmentByWho.H(view)) {
            requestDisallowInterceptTouchEvent(z);
        }
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        d();
        setAnimationListener setanimationlistener = this.h;
        setAnimationListener.write write = setanimationlistener.a;
        write.g = iArr;
        write.i = 0;
        write.h = write.g[0];
        setAnimationListener.write write2 = setanimationlistener.a;
        write2.i = 0;
        write2.h = write2.g[0];
        setanimationlistener.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = copyWindowDataInto.a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.L = (float) i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setEnabled(z);
        if (!z) {
            a();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        setStyle setstyle = this.D;
        if (setstyle.a) {
            findFragmentByWho.M(setstyle.e);
        }
        setstyle.a = z;
    }

    public void setOnChildScrollUpCallback(setBackgroundColorRes$MediaBrowserCompat$CustomActionResultReceiver setbackgroundcolorres_mediabrowsercompat_customactionresultreceiver) {
        this.w = setbackgroundcolorres_mediabrowsercompat_customactionresultreceiver;
    }

    public void setOnRefreshListener(read read2) {
        this.b = read2;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.d.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(copyWindowDataInto.a(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.k = i;
        this.g = z;
        this.d.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.g = z;
        this.i = i;
        this.k = i2;
        this.l = true;
        a();
        this.j = false;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.j == z) {
            c(z, false);
            return;
        }
        this.j = z;
        int i = !this.l ? this.k + this.i : this.k;
        int i2 = this.c;
        this.d.bringToFront();
        findFragmentByWho.e((View) this.d, i - i2);
        this.c = this.d.getTop();
        this.f = false;
        Animation.AnimationListener animationListener = this.F;
        this.d.setVisibility(0);
        this.h.setAlpha(255);
        AnonymousClass5 r0 = new Animation() { // from class: o.setBackgroundColorRes.5
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                setBackgroundColorRes setbackgroundcolorres = setBackgroundColorRes.this;
                setbackgroundcolorres.d.setScaleX(f);
                setbackgroundcolorres.d.setScaleY(f);
            }
        };
        this.M = r0;
        r0.setDuration((long) this.B);
        if (animationListener != null) {
            this.d.setAnimationListener(animationListener);
        }
        this.d.clearAnimation();
        this.d.startAnimation(this.M);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.u = (int) (displayMetrics.density * 56.0f);
            } else {
                this.u = (int) (displayMetrics.density * 40.0f);
            }
            this.d.setImageDrawable(null);
            this.h.e(i);
            this.d.setImageDrawable(this.h);
        }
    }

    public void setSlingshotDistance(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.D.a(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.D.d();
    }
}
