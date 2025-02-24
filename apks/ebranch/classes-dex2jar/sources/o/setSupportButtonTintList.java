package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes-dex2jar.jar:o/setSupportButtonTintList.class */
public class setSupportButtonTintList extends FrameLayout {
    Drawable a;
    boolean b;
    Drawable c;
    boolean d;
    Drawable e;
    private int f;
    private boolean g;
    private View h;
    private View i;
    View j;

    public setSupportButtonTintList(Context context) {
        this(context, null);
    }

    public setSupportButtonTintList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        findFragmentByWho.b(this, new setAutoSizeTextTypeWithDefaults(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.e);
        this.e = obtainStyledAttributes.getDrawable(setHasDecor$MediaBrowserCompat$MediaItem.b);
        this.c = obtainStyledAttributes.getDrawable(setHasDecor$MediaBrowserCompat$MediaItem.g);
        this.f = obtainStyledAttributes.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.m, -1);
        boolean z = true;
        if (getId() == setHasDecor$MediaBrowserCompat$SearchResultReceiver.J) {
            this.b = true;
            this.a = obtainStyledAttributes.getDrawable(setHasDecor$MediaBrowserCompat$MediaItem.a);
        }
        obtainStyledAttributes.recycle();
        if (!this.b ? !(this.e == null && this.c == null) : this.a != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void drawableStateChanged() {
        drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful()) {
            this.e.setState(getDrawableState());
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null && drawable2.isStateful()) {
            this.c.setState(getDrawableState());
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null && drawable3.isStateful()) {
            this.a.setState(getDrawableState());
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        onFinishInflate();
        this.h = findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.d);
        this.i = findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g || onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        onLayout(z, i, i2, i3, i4);
        View view = this.j;
        boolean z2 = false;
        boolean z3 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.b) {
            Drawable drawable2 = this.a;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            if (this.e != null) {
                if (this.h.getVisibility() == 0) {
                    this.e.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                } else {
                    View view2 = this.i;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.e.setBounds(0, 0, 0, 0);
                    } else {
                        this.e.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                    }
                }
                z2 = true;
            }
            this.d = z3;
            if (z3 && (drawable = this.c) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                z2 = true;
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    @Override // android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSupportButtonTintList.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.e);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.h;
            if (view != null) {
                this.e.setBounds(view.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            }
        }
        boolean z = true;
        if (!this.b ? !(this.e == null && this.c == null) : this.a != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r6.a == null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setSplitBackground(android.graphics.drawable.Drawable r7) {
        /*
            r6 = this;
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.a
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0016
            r0 = r8
            r1 = 0
            r0.setCallback(r1)
            r0 = r6
            r1 = r6
            android.graphics.drawable.Drawable r1 = r1.a
            r0.unscheduleDrawable(r1)
        L_0x0016:
            r0 = r6
            r1 = r7
            r0.a = r1
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0044
            r0 = r7
            r1 = r6
            r0.setCallback(r1)
            r0 = r6
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x0044
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.a
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0044
            r0 = r7
            r1 = 0
            r2 = 0
            r3 = r6
            int r3 = r3.getMeasuredWidth()
            r4 = r6
            int r4 = r4.getMeasuredHeight()
            r0.setBounds(r1, r2, r3, r4)
        L_0x0044:
            r0 = r6
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x0058
            r0 = r9
            r10 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.a
            if (r0 != 0) goto L_0x0072
            goto L_0x006f
        L_0x0058:
            r0 = r9
            r10 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.e
            if (r0 != 0) goto L_0x0072
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.c
            if (r0 == 0) goto L_0x006f
            r0 = r9
            r10 = r0
            goto L_0x0072
        L_0x006f:
            r0 = 1
            r10 = r0
        L_0x0072:
            r0 = r6
            r1 = r10
            r0.setWillNotDraw(r1)
            r0 = r6
            r0.invalidate()
            r0 = r6
            r0.invalidateOutline()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSupportButtonTintList.setSplitBackground(android.graphics.drawable.Drawable):void");
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.c);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.d && (drawable2 = this.c) != null) {
                drawable2.setBounds(this.j.getLeft(), this.j.getTop(), this.j.getRight(), this.j.getBottom());
            }
        }
        boolean z = true;
        if (!this.b ? !(this.e == null && this.c == null) : this.a != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(setTabSelected settabselected) {
        View view = this.j;
        if (view != null) {
            removeView(view);
        }
        this.j = settabselected;
        if (settabselected != null) {
            addView(settabselected);
            ViewGroup.LayoutParams layoutParams = settabselected.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            settabselected.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.g = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.e && !this.b) || (drawable == this.c && this.d) || ((drawable == this.a && this.b) || verifyDrawable(drawable));
    }
}
