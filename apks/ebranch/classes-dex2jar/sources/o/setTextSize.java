package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.setButtonDrawable;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setTextSize.class */
public class setTextSize extends setAutoSizeTextTypeUniformWithPresetSizes {
    private View f;
    public CharSequence h;
    public CharSequence i;
    public boolean j;
    private View k;
    private int l;
    private TextView m;
    private View n;

    /* renamed from: o */
    private int f279o;
    private LinearLayout p;
    private TextView r;
    private int s;

    public setTextSize(Context context) {
        this(context, null);
    }

    public setTextSize(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.f229o);
    }

    public setTextSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.v, i, 0));
        findFragmentByWho.b(this, seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.D));
        this.s = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.A, 0);
        this.l = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.C, 0);
        this.a = seticonifiedbydefault.d.getLayoutDimension(setHasDecor$MediaBrowserCompat$MediaItem.B, 0);
        this.f279o = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.z, setHasDecor.MediaMetadataCompat.e);
        seticonifiedbydefault.d.recycle();
    }

    private void e() {
        if (this.p == null) {
            LayoutInflater.from(getContext()).inflate(setHasDecor.MediaMetadataCompat.c, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.p = linearLayout;
            this.r = (TextView) linearLayout.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.c);
            this.m = (TextView) this.p.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.e);
            if (this.s != 0) {
                this.r.setTextAppearance(getContext(), this.s);
            }
            if (this.l != 0) {
                this.m.setTextAppearance(getContext(), this.l);
            }
        }
        this.r.setText(this.h);
        this.m.setText(this.i);
        boolean isEmpty = TextUtils.isEmpty(this.h);
        boolean z = !TextUtils.isEmpty(this.i);
        int i = 8;
        this.m.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout2 = this.p;
        if ((!isEmpty) || z) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.p.getParent() == null) {
            addView(this.p);
        }
    }

    public final void a() {
        if (this.f == null) {
            b();
        }
    }

    public final void a(final setActionBarVisibilityCallback setactionbarvisibilitycallback) {
        View view = this.f;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f279o, (ViewGroup) this, false);
            this.f = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f);
        }
        View findViewById = this.f.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.h);
        this.n = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: o.setTextSize.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                setactionbarvisibilitycallback.d();
            }
        });
        setOnDismissListener setondismisslistener = (setOnDismissListener) setactionbarvisibilitycallback.e();
        if (this.b != null) {
            this.b.b();
        }
        this.b = new setButtonDrawable(getContext());
        setButtonDrawable setbuttondrawable = this.b;
        setbuttondrawable.t = true;
        setbuttondrawable.q = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        setButtonDrawable setbuttondrawable2 = this.b;
        Context context = this.e;
        setondismisslistener.s.add(new WeakReference<>(setbuttondrawable2));
        setbuttondrawable2.e(context, setondismisslistener);
        setondismisslistener.i = true;
        this.c = (setSupportCompoundDrawablesTintMode) this.b.a(this);
        findFragmentByWho.b(this.c, (Drawable) null);
        addView(this.c, layoutParams);
    }

    public final void b() {
        removeAllViews();
        this.k = null;
        this.c = null;
        this.b = null;
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // o.setAutoSizeTextTypeUniformWithPresetSizes
    public final /* bridge */ /* synthetic */ generateActivityResultKey c(int i, long j) {
        return c(i, j);
    }

    @Override // o.setAutoSizeTextTypeUniformWithPresetSizes
    public final boolean c() {
        if (this.b != null) {
            return this.b.f();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        onDetachedFromWindow();
        if (this.b != null) {
            this.b.d();
            setButtonDrawable.read read = this.b.g;
            if (read != null) {
                read.b();
            }
        }
    }

    @Override // o.setAutoSizeTextTypeUniformWithPresetSizes, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.h);
            return;
        }
        onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean d = setSubmitButtonEnabled.d(this);
        int paddingRight = d ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f;
        int i5 = paddingRight;
        if (view != null) {
            i5 = paddingRight;
            if (view.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                int i6 = d ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
                int i7 = d ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
                int i8 = d ? paddingRight - i6 : paddingRight + i6;
                int b = i8 + b(this.f, i8, paddingTop, paddingTop2, d);
                i5 = d ? b - i7 : b + i7;
            }
        }
        LinearLayout linearLayout = this.p;
        int i9 = i5;
        if (linearLayout != null) {
            i9 = i5;
            if (this.k == null) {
                i9 = i5;
                if (linearLayout.getVisibility() != 8) {
                    i9 = i5 + b(this.p, i5, paddingTop, paddingTop2, d);
                }
            }
        }
        View view2 = this.k;
        if (view2 != null) {
            b(view2, i9, paddingTop, paddingTop2, d);
        }
        int paddingLeft = d ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            b(this.c, paddingLeft, paddingTop, paddingTop2, !d);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.a > 0 ? this.a : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.f;
            int i5 = paddingLeft;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                int max = Math.max(0, paddingLeft - view.getMeasuredWidth());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                i5 = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            int i6 = i5;
            if (this.c != null) {
                i6 = i5;
                if (this.c.getParent() == this) {
                    setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = this.c;
                    setsupportcompounddrawablestintmode.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), makeMeasureSpec);
                    i6 = Math.max(0, i5 - setsupportcompounddrawablestintmode.getMeasuredWidth());
                }
            }
            LinearLayout linearLayout = this.p;
            int i7 = i6;
            if (linearLayout != null) {
                i7 = i6;
                if (this.k == null) {
                    if (this.j) {
                        this.p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.p.getMeasuredWidth();
                        boolean z = measuredWidth <= i6;
                        i7 = i6;
                        if (z) {
                            i7 = i6 - measuredWidth;
                        }
                        this.p.setVisibility(z ? 0 : 8);
                    } else {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), makeMeasureSpec);
                        i7 = Math.max(0, i6 - linearLayout.getMeasuredWidth());
                    }
                }
            }
            View view2 = this.k;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i9 = i7;
                if (layoutParams.width >= 0) {
                    i9 = Math.min(layoutParams.width, i7);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = i4;
                if (layoutParams.height >= 0) {
                    i10 = Math.min(layoutParams.height, i4);
                }
                this.k.measure(View.MeasureSpec.makeMeasureSpec(i9, i8), View.MeasureSpec.makeMeasureSpec(i10, i3));
            }
            if (this.a <= 0) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingTop;
                    i11 = i11;
                    if (measuredHeight > i11) {
                        i11 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i11);
                return;
            }
            setMeasuredDimension(size, size2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // o.setAutoSizeTextTypeUniformWithPresetSizes, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // o.setAutoSizeTextTypeUniformWithPresetSizes
    public void setContentHeight(int i) {
        this.a = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.k;
        if (view2 != null) {
            removeView(view2);
        }
        this.k = view;
        if (!(view == null || (linearLayout = this.p) == null)) {
            removeView(linearLayout);
            this.p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.i = charSequence;
        e();
    }

    public void setTitle(CharSequence charSequence) {
        this.h = charSequence;
        e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    @Override // o.setAutoSizeTextTypeUniformWithPresetSizes, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
