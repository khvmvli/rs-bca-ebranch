package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.facebook.stetho.websocket.CloseCodes;
/* loaded from: classes-dex2jar.jar:o/setSelected.class */
public class setSelected extends CompoundButton {
    private static final Property<setSelected, Float> c = new Property<setSelected, Float>(Float.class, "thumbPos") { // from class: o.setSelected.4
        /* renamed from: c */
        public void set(setSelected setselected, Float f) {
            setselected.d(f.floatValue());
        }

        /* renamed from: e */
        public Float get(setSelected setselected) {
            return Float.valueOf(setselected.e);
        }
    };
    private static final int[] d = {16842912};
    private final TextPaint A;
    private CharSequence B;
    private Drawable C;
    private CharSequence D;
    private int E;
    private int F;
    private PorterDuff.Mode G;
    private ColorStateList H;
    private int I;
    private Drawable J;
    private float K;
    private PorterDuff.Mode L;
    private float M;
    private ColorStateList N;
    private VelocityTracker O;
    ObjectAnimator a;
    private boolean b;
    float e;
    private Layout f;
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private Layout f267o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final setDecorPadding u;
    private final Rect v;
    private ColorStateList w;
    private int x;
    private TransformationMethod y;
    private int z;

    public setSelected(Context context) {
        this(context, null);
    }

    public setSelected(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.R);
    }

    public setSelected(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = null;
        this.G = null;
        this.b = false;
        this.i = false;
        this.N = null;
        this.L = null;
        this.g = false;
        this.j = false;
        this.O = VelocityTracker.obtain();
        this.v = new Rect();
        setOnCloseListener.e(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.cW, i, 0));
        findFragmentByWho.e(this, context, setHasDecor$MediaBrowserCompat$MediaItem.cW, attributeSet, seticonifiedbydefault.d, i, 0);
        Drawable d2 = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cV);
        this.C = d2;
        if (d2 != null) {
            d2.setCallback(this);
        }
        Drawable d3 = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.dg);
        this.J = d3;
        if (d3 != null) {
            d3.setCallback(this);
        }
        this.D = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.cS);
        this.B = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.cU);
        this.m = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.cT, true);
        this.z = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.cY, 0);
        this.s = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.cZ, 0);
        this.t = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.cX, 0);
        this.k = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.db, false);
        ColorStateList e = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.dc);
        if (e != null) {
            this.H = e;
            this.b = true;
        }
        PorterDuff.Mode e2 = setOnFitSystemWindowsListener.e(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.de, -1), null);
        if (this.G != e2) {
            this.G = e2;
            this.i = true;
        }
        if (this.b || this.i) {
            c();
        }
        ColorStateList e3 = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.df);
        if (e3 != null) {
            this.N = e3;
            this.g = true;
        }
        PorterDuff.Mode e4 = setOnFitSystemWindowsListener.e(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.dd, -1), null);
        if (this.L != e4) {
            this.L = e4;
            this.j = true;
        }
        if (this.g || this.j) {
            a();
        }
        int resourceId = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.da, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.u = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
        seticonifiedbydefault.d.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.I = viewConfiguration.getScaledTouchSlop();
        this.h = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a() {
        Drawable drawable = this.J;
        if (drawable == null) {
            return;
        }
        if (this.g || this.j) {
            Drawable mutate = getInsetsForType.h(drawable).mutate();
            this.J = mutate;
            if (this.g) {
                getInsetsForType.e(mutate, this.N);
            }
            if (this.j) {
                getInsetsForType.d(this.J, this.L);
            }
            if (this.J.isStateful()) {
                this.J.setState(getDrawableState());
            }
        }
    }

    private void b() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void b(MotionEvent motionEvent) {
        this.F = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.O.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE);
            float xVelocity = this.O.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.h)) {
                z = e();
            } else if (!setSubmitButtonEnabled.d(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        c(motionEvent);
    }

    private Layout c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.y;
        CharSequence charSequence2 = charSequence;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.A;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void c() {
        Drawable drawable = this.C;
        if (drawable == null) {
            return;
        }
        if (this.b || this.i) {
            Drawable mutate = getInsetsForType.h(drawable).mutate();
            this.C = mutate;
            if (this.b) {
                getInsetsForType.e(mutate, this.H);
            }
            if (this.i) {
                getInsetsForType.d(this.C, this.G);
            }
            if (this.C.isStateful()) {
                this.C.setState(getDrawableState());
            }
        }
    }

    private void c(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        onTouchEvent(obtain);
        obtain.recycle();
    }

    private boolean c(float f, float f2) {
        if (this.C == null) {
            return false;
        }
        int d2 = d();
        this.C.getPadding(this.v);
        int i = this.p;
        int i2 = this.I;
        int i3 = (this.q + d2) - i2;
        int i4 = this.E;
        int i5 = this.v.left;
        int i6 = this.v.right;
        int i7 = this.I;
        int i8 = this.l;
        boolean z = false;
        if (f > ((float) i3)) {
            z = false;
            if (f < ((float) (i4 + i3 + i5 + i6 + i7))) {
                z = false;
                if (f2 > ((float) (i - i2))) {
                    z = false;
                    if (f2 < ((float) (i8 + i7))) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private int d() {
        return (int) (((setSubmitButtonEnabled.d(this) ? 1.0f - this.e : this.e) * ((float) g())) + 0.5f);
    }

    private void d(int i, int i2) {
        setSwitchTypeface(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    private void d(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c, z ? 1.0f : 0.0f);
        this.a = ofFloat;
        ofFloat.setDuration(250L);
        this.a.setAutoCancel(true);
        this.a.start();
    }

    private static float e(float f, float f2, float f3) {
        if (f >= f2) {
            f2 = f;
            if (f > f3) {
                f2 = f3;
            }
        }
        return f2;
    }

    private boolean e() {
        return this.e > 0.5f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x0023
            r0 = r3
            java.lang.CharSequence r0 = r0.D
            r4 = r0
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L_0x001e
            r0 = r3
            android.content.res.Resources r0 = r0.getResources()
            int r1 = o.setHasDecor$MediaBrowserCompat$ItemReceiver.e
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
        L_0x001e:
            r0 = r3
            r1 = r5
            o.findFragmentByWho.e(r0, r1)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSelected.f():void");
    }

    private int g() {
        Drawable drawable = this.J;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.v;
        drawable.getPadding(rect);
        Drawable drawable2 = this.C;
        Rect a = drawable2 != null ? setOnFitSystemWindowsListener.a(drawable2) : setOnFitSystemWindowsListener.b;
        return ((((this.x - this.E) - rect.left) - rect.right) - a.left) - a.right;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void h() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x0023
            r0 = r3
            java.lang.CharSequence r0 = r0.B
            r4 = r0
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L_0x001e
            r0 = r3
            android.content.res.Resources r0 = r0.getResources()
            int r1 = o.setHasDecor$MediaBrowserCompat$ItemReceiver.a
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
        L_0x001e:
            r0 = r3
            r1 = r5
            o.findFragmentByWho.e(r0, r1)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSelected.h():void");
    }

    void d(float f) {
        this.e = f;
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.v;
        int i3 = this.q;
        int i4 = this.p;
        int i5 = this.r;
        int i6 = this.l;
        int d2 = d() + i3;
        Drawable drawable = this.C;
        Rect a = drawable != null ? setOnFitSystemWindowsListener.a(drawable) : setOnFitSystemWindowsListener.b;
        Drawable drawable2 = this.J;
        int i7 = d2;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = d2 + rect.left;
            if (a != null) {
                int i8 = i3;
                if (a.left > rect.left) {
                    i8 = i3 + (a.left - rect.left);
                }
                i = a.top > rect.top ? (a.top - rect.top) + i4 : i4;
                i5 = i5;
                if (a.right > rect.right) {
                    i5 -= a.right - rect.right;
                }
                i3 = i8;
                i5 = i5;
                i = i;
                if (a.bottom > rect.bottom) {
                    i2 = i6 - (a.bottom - rect.bottom);
                    i3 = i8;
                    this.J.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.J.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i9 = i7 - rect.left;
            int i10 = i7 + this.E + rect.right;
            this.C.setBounds(i9, i4, i10, i6);
            Drawable background = getBackground();
            if (background != null) {
                getInsetsForType.c(background, i9, i4, i10, i6);
            }
        }
        draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        drawableHotspotChanged(f, f2);
        Drawable drawable = this.C;
        if (drawable != null) {
            getInsetsForType.d(drawable, f, f2);
        }
        Drawable drawable2 = this.J;
        if (drawable2 != null) {
            getInsetsForType.d(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        boolean z = false;
        if (drawable != null) {
            z = false;
            if (drawable.isStateful()) {
                z = false | drawable.setState(drawableState);
            }
        }
        Drawable drawable2 = this.J;
        boolean z2 = z;
        if (drawable2 != null) {
            z2 = z;
            if (drawable2.isStateful()) {
                z2 = z | drawable2.setState(drawableState);
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!setSubmitButtonEnabled.d(this)) {
            return getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = getCompoundPaddingLeft() + this.x;
        int i = compoundPaddingLeft;
        if (!TextUtils.isEmpty(getText())) {
            i = compoundPaddingLeft + this.t;
        }
        return i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (setSubmitButtonEnabled.d(this)) {
            return getCompoundPaddingRight();
        }
        int compoundPaddingRight = getCompoundPaddingRight() + this.x;
        int i = compoundPaddingRight;
        if (!TextUtils.isEmpty(getText())) {
            i = compoundPaddingRight + this.t;
        }
        return i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        jumpDrawablesToCurrentState();
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.J;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.a.end();
            this.a = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        onDraw(canvas);
        Rect rect = this.v;
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.p;
        int i3 = this.l;
        int i4 = rect.top;
        int i5 = rect.bottom;
        Drawable drawable2 = this.C;
        if (drawable != null) {
            if (!this.k || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = setOnFitSystemWindowsListener.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = e() ? this.f267o : this.f;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.w;
            if (colorStateList != null) {
                this.A.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) ((((i2 + i4) + (i3 - i5)) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.D : this.B;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        onLayout(z, i, i2, i3, i4);
        int i12 = 0;
        if (this.C != null) {
            Rect rect = this.v;
            Drawable drawable = this.J;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = setOnFitSystemWindowsListener.a(this.C);
            i5 = Math.max(0, a.left - rect.left);
            i12 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (setSubmitButtonEnabled.d(this)) {
            i6 = getPaddingLeft() + i5;
            i7 = ((this.x + i6) - i5) - i12;
        } else {
            int width = (getWidth() - getPaddingRight()) - i12;
            i6 = (width - this.x) + i5 + i12;
            i7 = width;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.n;
            i11 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i11 = getPaddingTop();
            i10 = this.n;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i8 = i9 - this.n;
            this.q = i6;
            this.p = i8;
            this.l = i9;
            this.r = i7;
        }
        i8 = i11;
        i9 = i10 + i11;
        this.q = i6;
        this.p = i8;
        this.l = i9;
        this.r = i7;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.m) {
            if (this.f267o == null) {
                this.f267o = c(this.D);
            }
            if (this.f == null) {
                this.f = c(this.B);
            }
        }
        Rect rect = this.v;
        Drawable drawable = this.C;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.C.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.C.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.E = Math.max(this.m ? Math.max(this.f267o.getWidth(), this.f.getWidth()) + (this.z << 1) : 0, i4);
        Drawable drawable2 = this.J;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.J.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.C;
        int i8 = i7;
        int i9 = i6;
        if (drawable3 != null) {
            Rect a = setOnFitSystemWindowsListener.a(drawable3);
            i9 = Math.max(i6, a.left);
            i8 = Math.max(i7, a.right);
        }
        int max = Math.max(this.s, (this.E << 1) + i9 + i8);
        int max2 = Math.max(i5, i3);
        this.x = max;
        this.n = max2;
        onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.D : this.B;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 != 3) goto L_0x013b;
     */
    @Override // android.widget.TextView, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSelected.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            f();
        } else {
            h();
        }
        if (getWindowToken() == null || !findFragmentByWho.G(this)) {
            b();
            d(isChecked ? 1.0f : 0.0f);
            return;
        }
        d(isChecked);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        setCustomSelectionActionModeCallback(getParentFragment.d(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.m != z) {
            this.m = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.k = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.s = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.t = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(i, setHasDecor$MediaBrowserCompat$MediaItem.dl));
        ColorStateList e = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.dh);
        if (e != null) {
            this.w = e;
        } else {
            this.w = getTextColors();
        }
        int dimensionPixelSize = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.dq, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            if (f != this.A.getTextSize()) {
                this.A.setTextSize(f);
                requestLayout();
            }
        }
        d(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.f0do, -1), seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.dn, -1));
        if (seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.dt, false)) {
            this.y = new setLogo(getContext());
        } else {
            this.y = null;
        }
        seticonifiedbydefault.d.recycle();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.A.getTypeface() != null && !this.A.getTypeface().equals(typeface)) || (this.A.getTypeface() == null && typeface != null)) {
            this.A.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.A;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.A;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.A.setFakeBoldText(false);
        this.A.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        this.B = charSequence;
        requestLayout();
        if (!isChecked()) {
            h();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.D = charSequence;
        requestLayout();
        if (isChecked()) {
            f();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.C = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(setPrimaryBackground.c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.z = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.b = true;
        c();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.G = mode;
        this.i = true;
        c();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.J;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.J = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(setPrimaryBackground.c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.g = true;
        a();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.L = mode;
        this.j = true;
        a();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return verifyDrawable(drawable) || drawable == this.C || drawable == this.J;
    }
}
