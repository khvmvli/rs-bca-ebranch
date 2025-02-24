package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import o.getChildFragmentManager;
/* loaded from: classes-dex2jar.jar:o/getLifecycle.class */
public class getLifecycle extends FrameLayout implements show, showNow {
    private int A;
    private float B;
    private VelocityTracker D;
    private View c;
    private final setStyle d;
    private int e;
    private EdgeEffect f;
    private boolean g;
    private boolean h;
    private boolean i;
    private EdgeEffect j;
    private int k;
    private long l;
    private int m;
    private int n;

    /* renamed from: o */
    private boolean f150o;
    private int p;
    private final ensureAnimationInfo q;
    private getLifecycle$MediaBrowserCompat$CustomActionResultReceiver r;
    private int s;
    private RemoteActionCompatParcelizer t;
    private final int[] u;
    private final Rect v;
    private OverScroller w;
    private boolean x;
    private final int[] y;
    private static final read b = new read();
    private static final int[] a = {16843130};

    /* loaded from: classes-dex2jar.jar:o/getLifecycle$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends View.BaseSavedState {
        public static final Parcelable.Creator<RemoteActionCompatParcelizer> CREATOR = new Parcelable.Creator<RemoteActionCompatParcelizer>() { // from class: o.getLifecycle.RemoteActionCompatParcelizer.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RemoteActionCompatParcelizer createFromParcel(Parcel parcel) {
                return new RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RemoteActionCompatParcelizer[] newArray(int i) {
                return new RemoteActionCompatParcelizer[i];
            }
        };
        public int b;

        RemoteActionCompatParcelizer(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt();
        }

        RemoteActionCompatParcelizer(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.b);
            sb.append("}");
            return sb.toString();
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getLifecycle$read.class */
    public static final class read extends onDismiss {
        read() {
        }

        @Override // o.onDismiss
        public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
            int e;
            b(view, getchildfragmentmanager);
            getLifecycle getlifecycle = (getLifecycle) view;
            getchildfragmentmanager.b((CharSequence) ScrollView.class.getName());
            if (getlifecycle.isEnabled() && (e = getlifecycle.e()) > 0) {
                getchildfragmentmanager.k(true);
                if (getlifecycle.getScrollY() > 0) {
                    getchildfragmentmanager.a(getChildFragmentManager.read.C);
                    getchildfragmentmanager.a(getChildFragmentManager.read.G);
                }
                if (getlifecycle.getScrollY() < e) {
                    getchildfragmentmanager.a(getChildFragmentManager.read.D);
                    getchildfragmentmanager.a(getChildFragmentManager.read.A);
                }
            }
        }

        @Override // o.onDismiss
        public final boolean b(View view, int i, Bundle bundle) {
            if (b(view, i, bundle)) {
                return true;
            }
            getLifecycle getlifecycle = (getLifecycle) view;
            if (!getlifecycle.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int height = getlifecycle.getHeight();
                    int paddingBottom = getlifecycle.getPaddingBottom();
                    int max = Math.max(getlifecycle.getScrollY() - ((height - paddingBottom) - getlifecycle.getPaddingTop()), 0);
                    if (max == getlifecycle.getScrollY()) {
                        return false;
                    }
                    getlifecycle.b(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int height2 = getlifecycle.getHeight();
            int paddingBottom2 = getlifecycle.getPaddingBottom();
            int min = Math.min(getlifecycle.getScrollY() + ((height2 - paddingBottom2) - getlifecycle.getPaddingTop()), getlifecycle.e());
            if (min == getlifecycle.getScrollY()) {
                return false;
            }
            getlifecycle.b(0, min, true);
            return true;
        }

        @Override // o.onDismiss
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            c(view, accessibilityEvent);
            getLifecycle getlifecycle = (getLifecycle) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(getlifecycle.e() > 0);
            accessibilityEvent.setScrollX(getlifecycle.getScrollX());
            accessibilityEvent.setScrollY(getlifecycle.getScrollY());
            getDefaultViewModelProviderFactory.b(accessibilityEvent, getlifecycle.getScrollX());
            getDefaultViewModelProviderFactory.d(accessibilityEvent, getlifecycle.e());
        }
    }

    public getLifecycle(Context context) {
        this(context, null);
    }

    public getLifecycle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getLifecycle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = new Rect();
        this.f150o = true;
        this.i = false;
        this.c = null;
        this.h = false;
        this.x = true;
        this.e = -1;
        this.y = new int[2];
        this.u = new int[2];
        this.w = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A = viewConfiguration.getScaledTouchSlop();
        this.s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.q = new ensureAnimationInfo();
        this.d = new setStyle(this);
        setNestedScrollingEnabled(true);
        findFragmentByWho.d(this, b);
    }

    private void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.x) {
            e(0, i, 250, false);
        } else {
            scrollBy(0, i);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.e) {
            int i = actionIndex == 0 ? 1 : 0;
            this.k = (int) motionEvent.getY(i);
            this.e = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean a() {
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            z = false;
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            }
        }
        return z;
    }

    private boolean a(int i, int i2) {
        return this.d.a(i, i2);
    }

    private static boolean a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !a((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    private void b() {
        if (getOverScrollMode() == 2) {
            this.j = null;
            this.f = null;
        } else if (this.j == null) {
            Context context = getContext();
            this.j = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    private void b(int i) {
        if (getChildCount() > 0) {
            this.w.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            e(true);
        }
    }

    private void c(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.d.e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    private void c(View view) {
        view.getDrawingRect(this.v);
        offsetDescendantRectToMyCoords(view, this.v);
        int e = e(this.v);
        if (e != 0) {
            scrollBy(0, e);
        }
    }

    private boolean c(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.v.top = 0;
        this.v.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.v.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.v;
            rect.top = rect.bottom - height;
        }
        return d(i, this.v.top, this.v.bottom);
    }

    private boolean c(View view, int i, int i2) {
        view.getDrawingRect(this.v);
        offsetDescendantRectToMyCoords(view, this.v);
        return this.v.bottom + i >= getScrollY() && this.v.top - i <= getScrollY() + i2;
    }

    private void d() {
        this.h = false;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
        this.d.c(0);
        EdgeEffect edgeEffect = this.j;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f.onRelease();
        }
    }

    private void d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.d.e(0, i2, 0, i4, iArr, i5, iArr2);
    }

    private boolean d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.v.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.v.top + height > bottom) {
                    this.v.top = bottom - height;
                }
            }
        } else {
            this.v.top = getScrollY() - height;
            if (this.v.top < 0) {
                this.v.top = 0;
            }
        }
        Rect rect = this.v;
        rect.bottom = rect.top + height;
        return d(i, this.v.top, this.v.bottom);
    }

    private boolean d(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            view = view;
            z3 = z3;
            if (i2 < bottom) {
                view = view;
                z3 = z3;
                if (top < i3) {
                    boolean z4 = i2 < top && bottom < i3;
                    if (view == null) {
                        view = view2;
                        z3 = z4;
                    } else {
                        boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                        if (z3) {
                            view = view;
                            z3 = z3;
                            if (z4) {
                                view = view;
                                z3 = z3;
                                if (!z5) {
                                }
                                view = view2;
                                z3 = z3;
                            }
                        } else if (z4) {
                            view = view2;
                            z3 = true;
                        } else {
                            view = view;
                            z3 = z3;
                            if (!z5) {
                            }
                            view = view2;
                            z3 = z3;
                        }
                    }
                }
            }
        }
        View view3 = view;
        if (view == null) {
            view3 = this;
        }
        if (i2 < scrollY || i3 > i4) {
            a(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    private boolean d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i9 = i4 + i2;
        boolean z3 = false;
        int i10 = i6 + 0;
        if (i3 <= 0 && i3 >= 0) {
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        if (i9 > i10) {
            i9 = i10;
        } else if (i9 < 0) {
            i9 = 0;
        } else {
            z2 = false;
            if (z2 && !this.d.e(1)) {
                this.w.springBack(i3, i9, 0, 0, 0, e());
            }
            onOverScrolled(i3, i9, z, z2);
            if (!z || z2) {
                z3 = true;
            }
            return z3;
        }
        z2 = true;
        if (z2) {
            this.w.springBack(i3, i9, 0, 0, 0, e());
        }
        onOverScrolled(i3, i9, z, z2);
        if (!z) {
        }
        z3 = true;
        return z3;
    }

    private int e(Rect rect) {
        int i;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int i3 = scrollY;
        if (rect.top > 0) {
            i3 = scrollY + verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom <= i4 || rect.top <= i3) {
            i = 0;
            if (rect.top < i3) {
                i = 0;
                if (rect.bottom < i4) {
                    i = Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (i3 - rect.top), -getScrollY());
                }
            }
        } else {
            i = Math.min(rect.height() > height ? rect.top - i3 : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        return i;
    }

    private void e(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.l > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i4 = layoutParams.topMargin;
                int i5 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                this.w.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, i3);
                e(z);
            } else {
                if (!this.w.isFinished()) {
                    this.w.abortAnimation();
                    this.d.c(1);
                }
                scrollBy(i, i2);
            }
            this.l = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void e(boolean z) {
        if (z) {
            this.d.a(2, 1);
        } else {
            this.d.c(1);
        }
        this.m = getScrollY();
        findFragmentByWho.K(this);
    }

    private boolean e(int i) {
        int i2;
        View findFocus = findFocus();
        View view = findFocus;
        if (findFocus == this) {
            view = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !c(findNextFocus, height, getHeight())) {
            if (i != 33 || getScrollY() >= height) {
                i2 = height;
                if (i == 130) {
                    i2 = height;
                    if (getChildCount() > 0) {
                        View childAt = getChildAt(0);
                        i2 = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
                    }
                }
            } else {
                i2 = getScrollY();
            }
            if (i2 == 0) {
                return false;
            }
            int i3 = i2;
            if (i != 130) {
                i3 = -i2;
            }
            a(i3);
        } else {
            findNextFocus.getDrawingRect(this.v);
            offsetDescendantRectToMyCoords(findNextFocus, this.v);
            a(e(this.v));
            findNextFocus.requestFocus(i);
        }
        if (view == null || !view.isFocused() || !(!c(view, 0, getHeight()))) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    final void b(int i, int i2, boolean z) {
        e(0 - getScrollX(), i2 - getScrollY(), 250, true);
    }

    @Override // o.setupDialog
    public final void b(View view, int i) {
        ensureAnimationInfo ensureanimationinfo = this.q;
        if (i == 1) {
            ensureanimationinfo.d = 0;
        } else {
            ensureanimationinfo.c = 0;
        }
        this.d.c(i);
    }

    @Override // o.setupDialog
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        c(i4, i5, (int[]) null);
    }

    @Override // o.setupDialog
    public final void b(View view, View view2, int i, int i2) {
        ensureAnimationInfo ensureanimationinfo = this.q;
        if (i2 == 1) {
            ensureanimationinfo.d = i;
        } else {
            ensureanimationinfo.c = i;
        }
        this.d.a(2, i2);
    }

    public final boolean b(KeyEvent keyEvent) {
        this.v.setEmpty();
        int i = 130;
        if (!a()) {
            boolean z = false;
            if (isFocused()) {
                z = false;
                if (keyEvent.getKeyCode() != 4) {
                    View findFocus = findFocus();
                    View view = findFocus;
                    if (findFocus == this) {
                        view = null;
                    }
                    View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, 130);
                    z = false;
                    if (findNextFocus != null) {
                        z = false;
                        if (findNextFocus != this) {
                            z = false;
                            if (findNextFocus.requestFocus(130)) {
                                z = true;
                            }
                        }
                    }
                }
            }
            return z;
        }
        boolean z2 = false;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z2 = !keyEvent.isAltPressed() ? e(33) : c(33);
            } else if (keyCode == 20) {
                z2 = !keyEvent.isAltPressed() ? e(130) : c(130);
            } else if (keyCode != 62) {
                z2 = false;
            } else {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                d(i);
                z2 = false;
            }
        }
        return z2;
    }

    @Override // o.setupDialog
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        this.d.e(i, i2, iArr, null, i3);
    }

    @Override // o.setupDialog
    public final boolean c(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return computeHorizontalScrollRange();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
        if (r0 > 0) goto L_0x00be;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void computeScroll() {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLifecycle.computeScroll():void");
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int i;
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            i = bottom - scrollY;
        } else {
            i = bottom;
            if (scrollY > max) {
                i = bottom + (scrollY - max);
            }
        }
        return i;
    }

    @Override // android.view.View, android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchKeyEvent(keyEvent) || b(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.d.e(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.d.a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.d.e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.d.e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        draw(canvas);
        if (this.j != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.j.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                } else {
                    i = 0;
                }
                int i3 = height;
                int i4 = min;
                if (getClipToPadding()) {
                    i3 = height - (getPaddingTop() + getPaddingBottom());
                    i4 = min + getPaddingTop();
                }
                canvas.translate((float) i, (float) i4);
                this.j.setSize(width, i3);
                if (this.j.draw(canvas)) {
                    findFragmentByWho.K(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(e(), scrollY) + height2;
                int i5 = width2;
                if (getClipToPadding()) {
                    i5 = width2 - (getPaddingLeft() + getPaddingRight());
                    i2 = 0 + getPaddingLeft();
                }
                int i6 = max;
                int i7 = height2;
                if (getClipToPadding()) {
                    i7 = height2 - (getPaddingTop() + getPaddingBottom());
                    i6 = max - getPaddingBottom();
                }
                canvas.translate((float) (i2 - i5), (float) i6);
                canvas.rotate(180.0f, (float) i5, 0.0f);
                this.f.setSize(i5, i7);
                if (this.f.draw(canvas)) {
                    findFragmentByWho.K(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    final int e() {
        int i = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            i = Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return i;
    }

    @Override // o.show
    public final void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(i4, i5, iArr);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ensureAnimationInfo ensureanimationinfo = this.q;
        return ensureanimationinfo.d | ensureanimationinfo.c;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.d.e(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.d.a;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        onAttachedToWindow();
        this.i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || this.h) {
            return false;
        }
        float axisValue = motionEvent.getAxisValue(9);
        if (axisValue == 0.0f) {
            return false;
        }
        if (this.B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        int i2 = (int) (axisValue * this.B);
        int e = e();
        int scrollY = getScrollY();
        int i3 = scrollY - i2;
        if (i3 < 0) {
            i = 0;
        } else {
            i = e;
            if (i3 <= e) {
                i = i3;
            }
        }
        if (i == scrollY) {
            return false;
        }
        scrollTo(getScrollX(), i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLifecycle.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        onLayout(z, i, i2, i3, i4);
        this.f150o = false;
        View view = this.c;
        if (view != null && a(view, this)) {
            c(this.c);
        }
        this.c = null;
        if (!this.i) {
            if (this.t != null) {
                scrollTo(getScrollX(), this.t.b);
                this.t = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int i6 = ((i4 - i2) - paddingTop) - paddingBottom;
            int i7 = 0;
            if (i6 < i5) {
                i7 = 0;
                if (scrollY >= 0) {
                    i7 = i6 + scrollY > i5 ? i5 - i6 : scrollY;
                }
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        onMeasure(i, i2);
        if (this.g && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        b((int) f2);
        return true;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.d.e(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        c(i4, 0, (int[]) null);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.q.c = i;
        this.d.a(2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        if (i == 2) {
            i2 = 130;
        } else {
            i2 = i;
            if (i == 1) {
                i2 = 33;
            }
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !(true ^ c(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof RemoteActionCompatParcelizer)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) parcelable;
        onRestoreInstanceState(remoteActionCompatParcelizer.getSuperState());
        this.t = remoteActionCompatParcelizer;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(onSaveInstanceState());
        remoteActionCompatParcelizer.b = getScrollY();
        return remoteActionCompatParcelizer;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        onScrollChanged(i, i2, i3, i4);
        getLifecycle$MediaBrowserCompat$CustomActionResultReceiver getlifecycle_mediabrowsercompat_customactionresultreceiver = this.r;
        if (getlifecycle_mediabrowsercompat_customactionresultreceiver != null) {
            getlifecycle_mediabrowsercompat_customactionresultreceiver.a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && c(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.v);
            offsetDescendantRectToMyCoords(findFocus, this.v);
            a(e(this.v));
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onStopNestedScroll(View view) {
        this.q.c = 0;
        this.d.c(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.p = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.p);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.D;
                velocityTracker.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, (float) this.n);
                int yVelocity = (int) velocityTracker.getYVelocity(this.e);
                if (Math.abs(yVelocity) >= this.s) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        b(i);
                    }
                } else if (this.w.springBack(getScrollX(), getScrollY(), 0, 0, 0, e())) {
                    findFragmentByWho.K(this);
                }
                this.e = -1;
                d();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.e);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder("Invalid pointerId=");
                    sb.append(this.e);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.k - y;
                    int i3 = i2;
                    if (!this.h) {
                        i3 = i2;
                        if (Math.abs(i2) > this.A) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.h = true;
                            i3 = i2 > 0 ? i2 - this.A : i2 + this.A;
                        }
                    }
                    if (this.h) {
                        int i4 = i3;
                        if (this.d.e(0, i3, this.u, this.y, 0)) {
                            i4 = i3 - this.u[1];
                            this.p += this.y[1];
                        }
                        this.k = y - this.y[1];
                        int scrollY = getScrollY();
                        int e = e();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && e > 0);
                        if (d(0, i4, 0, getScrollY(), 0, e, 0, 0) && !this.d.e(0)) {
                            this.D.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.u;
                        iArr[1] = 0;
                        d(0, scrollY2, 0, i4 - scrollY2, this.y, 0, iArr);
                        int i5 = this.k;
                        int i6 = this.y[1];
                        this.k = i5 - i6;
                        this.p += i6;
                        if (z) {
                            int i7 = i4 - this.u[1];
                            b();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                getId.e(this.j, ((float) i7) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f.isFinished()) {
                                    this.f.onRelease();
                                }
                            } else if (i8 > e) {
                                getId.e(this.f, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.j.isFinished()) {
                                    this.j.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.j;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f.isFinished())) {
                                findFragmentByWho.K(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.h && getChildCount() > 0 && this.w.springBack(getScrollX(), getScrollY(), 0, 0, 0, e())) {
                    findFragmentByWho.K(this);
                }
                this.e = -1;
                d();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.k = (int) motionEvent.getY(actionIndex);
                this.e = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                a(motionEvent);
                this.k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.e));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.w.isFinished();
            this.h = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.w.isFinished()) {
                this.w.abortAnimation();
                this.d.c(1);
            }
            this.k = (int) motionEvent.getY();
            this.e = motionEvent.getPointerId(0);
            a(2, 0);
        }
        VelocityTracker velocityTracker2 = this.D;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void requestChildFocus(View view, View view2) {
        if (!this.f150o) {
            c(view2);
        } else {
            this.c = view2;
        }
        requestChildFocus(view, view2);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int e = e(rect);
        boolean z2 = e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, e);
            } else {
                e(0, e, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.D) != null) {
            velocityTracker.recycle();
            this.D = null;
        }
        requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        this.f150o = true;
        requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        int i3;
        int i4;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i5 = layoutParams.leftMargin;
            int i6 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i7 = layoutParams.topMargin;
            int i8 = layoutParams.bottomMargin;
            int i9 = (width - paddingLeft) - paddingRight;
            int i10 = width2 + i5 + i6;
            if (i9 >= i10 || i < 0) {
                i3 = 0;
            } else {
                i3 = i;
                if (i9 + i > i10) {
                    i3 = i10 - i9;
                }
            }
            int i11 = (height - paddingTop) - paddingBottom;
            int i12 = height2 + i7 + i8;
            if (i11 >= i12 || i2 < 0) {
                i4 = 0;
            } else {
                i4 = i2;
                if (i11 + i2 > i12) {
                    i4 = i12 - i11;
                }
            }
            if (i3 != getScrollX() || i4 != getScrollY()) {
                scrollTo(i3, i4);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.g) {
            this.g = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        setStyle setstyle = this.d;
        if (setstyle.a) {
            findFragmentByWho.M(setstyle.e);
        }
        setstyle.a = z;
    }

    public void setOnScrollChangeListener(getLifecycle$MediaBrowserCompat$CustomActionResultReceiver getlifecycle_mediabrowsercompat_customactionresultreceiver) {
        this.r = getlifecycle_mediabrowsercompat_customactionresultreceiver;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.x = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.d.a(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.d.c(0);
    }
}
