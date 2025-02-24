package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.BaseDialogKotlin;
import o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver;
import o.BaseDialogKotlin$MediaSessionCompat$Token;
import o.BaseKonfirmasiDialog;
import o.CancelReservasiDialog_ViewBinding;
import o.ExitTransaksiDialog_ViewBinding;
import o.ExpiredDateDialog;
import o.ExpiredDateDialog_ViewBinding;
import o.FingerprintDialog_ViewBinding;
import o.findFragmentByWho;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton.class */
public final class ExtendedFloatingActionButton extends CancelReservasiDialog_ViewBinding implements CoordinatorLayout.MediaBrowserCompat.CustomActionResultReceiver {
    int h;
    final ExpiredDateDialog_ViewBinding k;
    final ExpiredDateDialog_ViewBinding l;
    int m;
    final int n;

    /* renamed from: o */
    int f5o;
    boolean p;
    public ColorStateList q;
    final ExpiredDateDialog_ViewBinding r;
    final ExpiredDateDialog_ViewBinding s;
    boolean t;
    private boolean u;
    private final CoordinatorLayout.write<ExtendedFloatingActionButton> w;
    private final ExitTransaksiDialog_ViewBinding y;
    private static final int x = BaseDialogKotlin.MediaDescriptionCompat.u;
    public static final Property<View, Float> f = new Property<View, Float>(Float.class, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f2) {
            View view2 = view;
            view2.getLayoutParams().width = f2.intValue();
            view2.requestLayout();
        }
    };
    public static final Property<View, Float> g = new Property<View, Float>(Float.class, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f2) {
            View view2 = view;
            view2.getLayoutParams().height = f2.intValue();
            view2.requestLayout();
        }
    };
    public static final Property<View, Float> j = new Property<View, Float>(Float.class, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf((float) findFragmentByWho.t(view));
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f2) {
            View view2 = view;
            findFragmentByWho.c(view2, f2.intValue(), view2.getPaddingTop(), findFragmentByWho.s(view2), view2.getPaddingBottom());
        }
    };
    public static final Property<View, Float> i = new Property<View, Float>(Float.class, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.8
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf((float) findFragmentByWho.s(view));
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f2) {
            View view2 = view;
            findFragmentByWho.c(view2, findFragmentByWho.t(view2), view2.getPaddingTop(), f2.intValue(), view2.getPaddingBottom());
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.class */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.write<T> {
        private boolean a;
        private IconCompatParcelizer b;
        private Rect c;
        private IconCompatParcelizer d;
        private boolean e;

        public ExtendedFloatingActionButtonBehavior() {
            this.a = false;
            this.e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.bP);
            this.a = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.bR, false);
            this.e = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.bT, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private boolean a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.a || this.e) && extendedFloatingActionButton.getLayoutParams().h == view.getId();
        }

        private void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.e;
            ExtendedFloatingActionButton.b(extendedFloatingActionButton, z ? extendedFloatingActionButton.l : extendedFloatingActionButton.s, z ? this.d : this.b);
        }

        private void e(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.e;
            ExtendedFloatingActionButton.b(extendedFloatingActionButton, z ? extendedFloatingActionButton.r : extendedFloatingActionButton.k, z ? this.d : this.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private boolean e(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + extendedFloatingActionButton.getLayoutParams().topMargin) {
                e(extendedFloatingActionButton);
                return true;
            }
            b(extendedFloatingActionButton);
            return true;
        }

        private boolean e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.c == null) {
                this.c = new Rect();
            }
            Rect rect = this.c;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            FingerprintDialog_ViewBinding.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.b()) {
                e(extendedFloatingActionButton);
                return true;
            }
            b(extendedFloatingActionButton);
            return true;
        }

        public final /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                e(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            }
            CoordinatorLayout.read layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.read ? layoutParams.g instanceof BottomSheetBehavior : false)) {
                return false;
            }
            e(view2, extendedFloatingActionButton);
            return false;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        public final /* bridge */ /* synthetic */ boolean c(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return c(coordinatorLayout, (View) ((ExtendedFloatingActionButton) view), rect);
        }

        public final void d(CoordinatorLayout.read read) {
            if (read.a == 0) {
                read.a = 80;
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final /* synthetic */ boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
            /*
                r5 = this;
                r0 = r7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r0
                r9 = r0
                r0 = r6
                r1 = r9
                java.util.List r0 = r0.a(r1)
                r10 = r0
                r0 = r10
                int r0 = r0.size()
                r11 = r0
                r0 = 0
                r12 = r0
            L_0x001a:
                r0 = r12
                r1 = r11
                if (r0 >= r1) goto L_0x007c
                r0 = r10
                r1 = r12
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                r7 = r0
                r0 = r7
                boolean r0 = r0 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto L_0x0046
                r0 = r5
                r1 = r6
                r2 = r7
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r3 = r9
                boolean r0 = r0.e(r1, r2, r3)
                if (r0 == 0) goto L_0x0076
                goto L_0x007c
            L_0x0046:
                r0 = r7
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r13 = r0
                r0 = r13
                boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.read
                if (r0 == 0) goto L_0x0064
                r0 = r13
                androidx.coordinatorlayout.widget.CoordinatorLayout$read r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.read) r0
                androidx.coordinatorlayout.widget.CoordinatorLayout$write r0 = r0.g
                boolean r0 = r0 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                r14 = r0
                goto L_0x0067
            L_0x0064:
                r0 = 0
                r14 = r0
            L_0x0067:
                r0 = r14
                if (r0 == 0) goto L_0x0076
                r0 = r5
                r1 = r7
                r2 = r9
                boolean r0 = r0.e(r1, r2)
                if (r0 != 0) goto L_0x007c
            L_0x0076:
                int r12 = r12 + 1
                goto L_0x001a
            L_0x007c:
                r0 = r6
                r1 = r9
                r2 = r8
                r0.d(r1, r2)
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ExtendedFloatingActionButtonBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        int a();

        int b();

        int c();

        ViewGroup.LayoutParams d();

        int e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$read.class */
    public final class read extends ExpiredDateDialog {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(ExitTransaksiDialog_ViewBinding exitTransaksiDialog_ViewBinding) {
            super(r5, exitTransaksiDialog_ViewBinding);
            ExtendedFloatingActionButton.this = r5;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        @Override // o.ExpiredDateDialog, o.ExpiredDateDialog_ViewBinding
        public final void b(Animator animator) {
            b(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.h = 2;
        }

        @Override // o.ExpiredDateDialog, o.ExpiredDateDialog_ViewBinding
        public final void c() {
            c();
            ExtendedFloatingActionButton.this.h = 0;
        }

        @Override // o.ExpiredDateDialog_ViewBinding
        public final boolean g() {
            return ExtendedFloatingActionButton.this.i();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        @Override // o.ExpiredDateDialog_ViewBinding
        public final void h() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // o.ExpiredDateDialog_ViewBinding
        public final int j() {
            return BaseDialogKotlin.write.f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$write.class */
    public final class write extends ExpiredDateDialog {
        private final RemoteActionCompatParcelizer b;
        private final boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(ExitTransaksiDialog_ViewBinding exitTransaksiDialog_ViewBinding, RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
            super(r5, exitTransaksiDialog_ViewBinding);
            ExtendedFloatingActionButton.this = r5;
            this.b = remoteActionCompatParcelizer;
            this.d = z;
        }

        /* JADX WARN: Type inference failed for: r4v11, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r4v19, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r4v27, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        @Override // o.ExpiredDateDialog, o.ExpiredDateDialog_ViewBinding
        public final AnimatorSet a() {
            BaseKonfirmasiDialog d = d();
            if (d.a.get("width") != null) {
                PropertyValuesHolder[] d2 = d.d("width");
                d2[0].setFloatValues((float) ExtendedFloatingActionButton.this.getWidth(), (float) this.b.b());
                d.a.put("width", d2);
            }
            if (d.a.get("height") != null) {
                PropertyValuesHolder[] d3 = d.d("height");
                d3[0].setFloatValues((float) ExtendedFloatingActionButton.this.getHeight(), (float) this.b.c());
                d.a.put("height", d3);
            }
            if (d.a.get("paddingStart") != null) {
                PropertyValuesHolder[] d4 = d.d("paddingStart");
                d4[0].setFloatValues((float) findFragmentByWho.t((View) ExtendedFloatingActionButton.this), (float) this.b.a());
                d.a.put("paddingStart", d4);
            }
            if (d.a.get("paddingEnd") != null) {
                PropertyValuesHolder[] d5 = d.d("paddingEnd");
                d5[0].setFloatValues((float) findFragmentByWho.s((View) ExtendedFloatingActionButton.this), (float) this.b.e());
                d.a.put("paddingEnd", d5);
            }
            if (d.a.get("labelOpacity") != null) {
                PropertyValuesHolder[] d6 = d.d("labelOpacity");
                boolean z = this.d;
                float f = 1.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (!z) {
                    f = 0.0f;
                }
                d6[0].setFloatValues(f2, f);
                d.a.put("labelOpacity", d6);
            }
            return e(d);
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.TextView, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        @Override // o.ExpiredDateDialog, o.ExpiredDateDialog_ViewBinding
        public final void b(Animator animator) {
            b(animator);
            ExtendedFloatingActionButton.this.t = this.d;
            ExtendedFloatingActionButton.this.p = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.TextView, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        @Override // o.ExpiredDateDialog, o.ExpiredDateDialog_ViewBinding
        public final void c() {
            c();
            ExtendedFloatingActionButton.this.p = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.b.d().width;
                layoutParams.height = this.b.d().height;
            }
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [android.widget.TextView, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        @Override // o.ExpiredDateDialog_ViewBinding
        public final boolean g() {
            return this.d == ExtendedFloatingActionButton.this.t || ExtendedFloatingActionButton.this.e == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        @Override // o.ExpiredDateDialog_ViewBinding
        public final void h() {
            ExtendedFloatingActionButton.this.t = this.d;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.b.d().width;
                layoutParams.height = this.b.d().height;
                findFragmentByWho.c((View) ExtendedFloatingActionButton.this, this.b.a(), ExtendedFloatingActionButton.this.getPaddingTop(), this.b.e(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        @Override // o.ExpiredDateDialog_ViewBinding
        public final int j() {
            return this.d ? BaseDialogKotlin.write.c : BaseDialogKotlin.write.d;
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public ExtendedFloatingActionButton(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void b(ExtendedFloatingActionButton extendedFloatingActionButton, final ExpiredDateDialog_ViewBinding expiredDateDialog_ViewBinding, final IconCompatParcelizer iconCompatParcelizer) {
        if (!expiredDateDialog_ViewBinding.g()) {
            if (!((findFragmentByWho.G(extendedFloatingActionButton) || (!extendedFloatingActionButton.i() && extendedFloatingActionButton.u)) && !extendedFloatingActionButton.isInEditMode())) {
                expiredDateDialog_ViewBinding.h();
                return;
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet a = expiredDateDialog_ViewBinding.a();
            a.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
                private boolean d;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.d = true;
                    expiredDateDialog_ViewBinding.b();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    expiredDateDialog_ViewBinding.c();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    expiredDateDialog_ViewBinding.b(animator);
                    this.d = false;
                }
            });
            for (Animator.AnimatorListener animatorListener : expiredDateDialog_ViewBinding.e()) {
                a.addListener(animatorListener);
            }
            a.start();
        }
    }

    public final CoordinatorLayout.write<ExtendedFloatingActionButton> c() {
        return this.w;
    }

    public final void e(ColorStateList colorStateList) {
        setTextColor(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final int f() {
        int i2 = this.n;
        int i3 = i2;
        if (i2 < 0) {
            i3 = (Math.min(findFragmentByWho.t(this), findFragmentByWho.s(this)) << 1) + d();
        }
        return (i3 - d()) / 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean i() {
        boolean z = false;
        boolean z2 = false;
        if (getVisibility() != 0) {
            if (this.h == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.h != 1) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.CancelReservasiDialog_ViewBinding
    public final void onAttachedToWindow() {
        onAttachedToWindow();
        if (this.t && TextUtils.isEmpty(getText()) && e() != null) {
            this.t = false;
            this.r.h();
        }
    }

    public final void setAnimateShowBeforeLayout(boolean z) {
        this.u = z;
    }

    public final void setExtendMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        this.l.a(baseKonfirmasiDialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(BaseKonfirmasiDialog.b(getContext(), i2));
    }

    public final void setExtended(boolean z) {
        if (this.t != z) {
            ExpiredDateDialog_ViewBinding expiredDateDialog_ViewBinding = z ? this.l : this.r;
            if (!expiredDateDialog_ViewBinding.g()) {
                expiredDateDialog_ViewBinding.h();
            }
        }
    }

    public final void setHideMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        this.k.a(baseKonfirmasiDialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(BaseKonfirmasiDialog.b(getContext(), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPadding(int i2, int i3, int i4, int i5) {
        setPadding(i2, i3, i4, i5);
        if (this.t && !this.p) {
            this.f5o = findFragmentByWho.t(this);
            this.m = findFragmentByWho.s(this);
        }
    }

    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
        setPaddingRelative(i2, i3, i4, i5);
        if (this.t && !this.p) {
            this.f5o = i2;
            this.m = i4;
        }
    }

    public final void setShowMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        this.s.a(baseKonfirmasiDialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(BaseKonfirmasiDialog.b(getContext(), i2));
    }

    public final void setShrinkMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        this.r.a(baseKonfirmasiDialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(BaseKonfirmasiDialog.b(getContext(), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextColor(int i2) {
        setTextColor(i2);
        this.q = getTextColors();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextColor(ColorStateList colorStateList) {
        setTextColor(colorStateList);
        this.q = getTextColors();
    }
}
