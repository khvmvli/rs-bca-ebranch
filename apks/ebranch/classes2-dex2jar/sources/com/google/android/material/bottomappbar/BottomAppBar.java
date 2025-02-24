package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BaseDialogKotlin;
import o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver;
import o.FingerprintDialog;
import o.HaloBCADialog;
import o.JenisKodeBankDialog;
import o.chooseWaktuTidakCocok;
import o.findFragmentByWho;
import o.getInsetsForType;
import o.getPopEnterAnim;
import o.onClickBtnCancel;
import o.onClickClose;
import o.setInputType;
import o.setSupportCompoundDrawablesTintMode;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/bottomappbar/BottomAppBar.class */
public final class BottomAppBar extends setInputType implements CoordinatorLayout.MediaBrowserCompat.CustomActionResultReceiver {
    private static final int C = BaseDialogKotlin.MediaDescriptionCompat.p;
    int A;
    private int B;
    int D;
    private int F;
    private Behavior G;
    private ArrayList<Object> I;
    int k;
    int l;
    boolean m;

    /* renamed from: o  reason: collision with root package name */
    AnimatorListenerAdapter f3o;
    onClickClose<FloatingActionButton> p;
    final int q;
    final JenisKodeBankDialog r;
    int s;
    boolean t;
    final boolean u;
    final boolean v;
    Animator w;
    boolean x;
    Animator y;
    final boolean z;

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/bottomappbar/BottomAppBar$Behavior.class */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        WeakReference<BottomAppBar> i;
        int j;
        private final View.OnLayoutChangeListener h = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
            /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.material.bottomappbar.BottomAppBar, android.view.View] */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.i.get();
                if (bottomAppBar == 0 || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.d;
                boolean z = false;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.b(rect);
                int height = Behavior.this.d.height();
                float f = (float) height;
                if (f != ((chooseWaktuTidakCocok) bottomAppBar.r.F.l.j).d) {
                    ((chooseWaktuTidakCocok) bottomAppBar.r.F.l.j).d = f;
                    bottomAppBar.r.invalidateSelf();
                }
                if (floatingActionButton.c == null) {
                    floatingActionButton.c = new onClickBtnCancel(floatingActionButton, new FloatingActionButton.read());
                }
                float e = floatingActionButton.c.z.m.e(new RectF(Behavior.this.d));
                if (e != ((chooseWaktuTidakCocok) bottomAppBar.r.F.l.j).e) {
                    ((chooseWaktuTidakCocok) bottomAppBar.r.F.l.j).e = e;
                    bottomAppBar.r.invalidateSelf();
                }
                CoordinatorLayout.read layoutParams = view.getLayoutParams();
                if (Behavior.this.j == 0) {
                    layoutParams.bottomMargin = bottomAppBar.k + (bottomAppBar.getResources().getDimensionPixelOffset(BaseDialogKotlin.read.F) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    layoutParams.leftMargin = bottomAppBar.s;
                    layoutParams.rightMargin = bottomAppBar.A;
                    if (findFragmentByWho.k(floatingActionButton) == 1) {
                        z = true;
                    }
                    if (z) {
                        layoutParams.leftMargin += bottomAppBar.q;
                    } else {
                        layoutParams.rightMargin += bottomAppBar.q;
                    }
                }
            }
        };
        final Rect d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public final /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            return bottomAppBar2.t && d(coordinatorLayout, bottomAppBar2, view, view2, i, i2);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.bottomappbar.BottomAppBar, android.view.View, java.lang.Object] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            this.i = new WeakReference<>(bottomAppBar2);
            View f = bottomAppBar2.f();
            if (f != null && !findFragmentByWho.G(f)) {
                CoordinatorLayout.read layoutParams = f.getLayoutParams();
                layoutParams.e = 49;
                this.j = layoutParams.bottomMargin;
                if (f instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) f;
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    BottomAppBar.c(bottomAppBar2, floatingActionButton);
                }
                bottomAppBar2.l();
            }
            coordinatorLayout.d(bottomAppBar2, i);
            return e(coordinatorLayout, bottomAppBar2, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/bottomappbar/BottomAppBar$write.class */
    static final class write extends getPopEnterAnim {
        public static final Parcelable.Creator<write> CREATOR = new Parcelable.ClassLoaderCreator<write>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.write.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new write(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ write createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new write(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new write[i];
            }
        };
        boolean a;
        int e;

        public write(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.e = parcel.readInt();
            this.a = parcel.readInt() != 0;
        }

        public write(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeInt(this.e);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public BottomAppBar(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 471
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    static /* synthetic */ void a(BottomAppBar bottomAppBar) {
        ArrayList<Object> arrayList;
        int i = bottomAppBar.B - 1;
        bottomAppBar.B = i;
        if (i == 0 && (arrayList = bottomAppBar.I) != null) {
            Iterator<Object> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    static /* synthetic */ void c(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.f3o;
        if (floatingActionButton.c == null) {
            floatingActionButton.c = new onClickBtnCancel(floatingActionButton, new FloatingActionButton.read());
        }
        FingerprintDialog fingerprintDialog = floatingActionButton.c;
        if (fingerprintDialog.f25o == null) {
            fingerprintDialog.f25o = new ArrayList<>();
        }
        fingerprintDialog.f25o.add(animatorListenerAdapter);
        AnonymousClass6 r0 = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                BottomAppBar.this.f3o.onAnimationStart(animator);
                View f = BottomAppBar.this.f();
                FloatingActionButton floatingActionButton2 = f instanceof FloatingActionButton ? (FloatingActionButton) f : null;
                if (floatingActionButton2 != null) {
                    BottomAppBar bottomAppBar2 = BottomAppBar.this;
                    floatingActionButton2.setTranslationX(bottomAppBar2.a(bottomAppBar2.l));
                }
            }
        };
        if (floatingActionButton.c == null) {
            floatingActionButton.c = new onClickBtnCancel(floatingActionButton, new FloatingActionButton.read());
        }
        FingerprintDialog fingerprintDialog2 = floatingActionButton.c;
        if (fingerprintDialog2.A == null) {
            fingerprintDialog2.A = new ArrayList<>();
        }
        fingerprintDialog2.A.add(r0);
        onClickClose<FloatingActionButton> onclickclose = bottomAppBar.p;
        if (floatingActionButton.c == null) {
            floatingActionButton.c = new onClickBtnCancel(floatingActionButton, new FloatingActionButton.read());
        }
        FingerprintDialog fingerprintDialog3 = floatingActionButton.c;
        FloatingActionButton.write write2 = new FloatingActionButton.write(onclickclose);
        if (fingerprintDialog3.H == null) {
            fingerprintDialog3.H = new ArrayList<>();
        }
        fingerprintDialog3.H.add(write2);
    }

    private void e(final int i, final boolean z, List<Animator> list) {
        final setSupportCompoundDrawablesTintMode m = m();
        if (m != null) {
            Animator ofFloat = ObjectAnimator.ofFloat(m, "alpha", 1.0f);
            if (Math.abs(m.getTranslationX() - ((float) c(m, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m, "alpha", 0.0f);
                ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
                    public boolean d;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.d = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (!this.d) {
                            boolean z2 = BottomAppBar.this.D != 0;
                            BottomAppBar bottomAppBar = BottomAppBar.this;
                            int i2 = bottomAppBar.D;
                            if (i2 != 0) {
                                bottomAppBar.D = 0;
                                bottomAppBar.e().clear();
                                bottomAppBar.b(i2);
                            }
                            BottomAppBar.this.c(m, i, z, z2);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (m.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    private boolean k() {
        boolean z;
        View f = f();
        FloatingActionButton floatingActionButton = f instanceof FloatingActionButton ? (FloatingActionButton) f : null;
        if (floatingActionButton != null) {
            if (floatingActionButton.c == null) {
                floatingActionButton.c = new onClickBtnCancel(floatingActionButton, new FloatingActionButton.read());
            }
            if (floatingActionButton.c.a()) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ((chooseWaktuTidakCocok) this.r.F.l.j).a = a(this.l);
        View f = f();
        JenisKodeBankDialog jenisKodeBankDialog = this.r;
        float f2 = (!this.m || !k()) ? 0.0f : 1.0f;
        if (jenisKodeBankDialog.F.i != f2) {
            jenisKodeBankDialog.F.i = f2;
            jenisKodeBankDialog.H = true;
            jenisKodeBankDialog.invalidateSelf();
        }
        if (f != null) {
            f.setTranslationY(-((chooseWaktuTidakCocok) this.r.F.l.j).b);
            f.setTranslationX(a(this.l));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private setSupportCompoundDrawablesTintMode m() {
        for (int i = 0; i < getChildCount(); i++) {
            setSupportCompoundDrawablesTintMode childAt = getChildAt(i);
            if (childAt instanceof setSupportCompoundDrawablesTintMode) {
                return childAt;
            }
        }
        return null;
    }

    private FloatingActionButton n() {
        View f = f();
        return f instanceof FloatingActionButton ? (FloatingActionButton) f : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    float a(int i) {
        int i2 = 1;
        boolean z = findFragmentByWho.k(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int i3 = z ? this.s : this.A;
        int i4 = this.q;
        int measuredWidth = getMeasuredWidth() / 2;
        if (z) {
            i2 = -1;
        }
        return (float) ((measuredWidth - (i4 + i3)) * i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final int c(setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean z2 = findFragmentByWho.k(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            measuredWidth = measuredWidth;
            if ((childAt.getLayoutParams() instanceof setInputType.MediaBrowserCompat.CustomActionResultReceiver) && (childAt.getLayoutParams().a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((z2 ? setsupportcompounddrawablestintmode.getRight() : setsupportcompounddrawablestintmode.getLeft()) + (z2 ? this.A : -this.s));
    }

    public final /* synthetic */ CoordinatorLayout.write c() {
        if (this.G == null) {
            this.G = new Behavior();
        }
        return this.G;
    }

    void c(final setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode, final int i, final boolean z, boolean z2) {
        AnonymousClass10 r0 = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.10
            @Override // java.lang.Runnable
            public final void run() {
                setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode2 = setsupportcompounddrawablestintmode;
                setsupportcompounddrawablestintmode2.setTranslationX((float) BottomAppBar.this.c(setsupportcompounddrawablestintmode2, i, z));
            }
        };
        if (z2) {
            setsupportcompounddrawablestintmode.post(r0);
        } else {
            r0.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void d(int i, boolean z) {
        if (!findFragmentByWho.G(this)) {
            this.x = false;
            int i2 = this.D;
            if (i2 != 0) {
                this.D = 0;
                e().clear();
                b(i2);
                return;
            }
            return;
        }
        Animator animator = this.w;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!k()) {
            i = 0;
            z = false;
        }
        e(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.w = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                BottomAppBar.a(BottomAppBar.this);
                BottomAppBar.this.x = false;
                BottomAppBar.this.w = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                BottomAppBar.this.h();
            }
        });
        this.w.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.view.View f() {
        /*
            r3 = this;
            r0 = r3
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 != 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            r0 = r3
            android.view.ViewParent r0 = r0.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = r3
            java.util.List r0 = r0.d(r1)
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        L_0x001d:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0040
            r0 = r4
            java.lang.Object r0 = r0.next()
            android.view.View r0 = (android.view.View) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r0 != 0) goto L_0x003e
            r0 = r5
            boolean r0 = r0 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r0 == 0) goto L_0x001d
        L_0x003e:
            r0 = r5
            return r0
        L_0x0040:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.f():android.view.View");
    }

    void h() {
        ArrayList<Object> arrayList;
        int i = this.B;
        this.B = i + 1;
        if (i == 0 && (arrayList = this.I) != null) {
            Iterator<Object> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    void o() {
        setSupportCompoundDrawablesTintMode m = m();
        if (m != null && this.w == null) {
            m.setAlpha(1.0f);
            if (!k()) {
                c(m, 0, false, false);
            } else {
                c(m, this.l, this.m, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        onAttachedToWindow();
        JenisKodeBankDialog jenisKodeBankDialog = this.r;
        if (jenisKodeBankDialog.l()) {
            jenisKodeBankDialog.n(HaloBCADialog.c(this));
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.w;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.y;
            if (animator2 != null) {
                animator2.cancel();
            }
            l();
        }
        o();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof write)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        write write2 = (write) parcelable;
        onRestoreInstanceState(((getPopEnterAnim) write2).d);
        this.l = write2.e;
        this.m = write2.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, com.google.android.material.bottomappbar.BottomAppBar$write] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r4 = this;
            com.google.android.material.bottomappbar.BottomAppBar$write r0 = new com.google.android.material.bottomappbar.BottomAppBar$write
            r1 = r0
            r2 = r4
            android.os.Parcelable r2 = r2.onSaveInstanceState()
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.l
            r0.e = r1
            r0 = r5
            r1 = r4
            boolean r1 = r1.m
            r0.a = r1
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.onSaveInstanceState():android.os.Parcelable");
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        getInsetsForType.e(this.r, colorStateList);
    }

    public final void setCradleVerticalOffset(float f) {
        if (f != ((chooseWaktuTidakCocok) this.r.F.l.j).b) {
            chooseWaktuTidakCocok choosewaktutidakcocok = (chooseWaktuTidakCocok) this.r.F.l.j;
            if (f >= 0.0f) {
                choosewaktutidakcocok.b = f;
                this.r.invalidateSelf();
                l();
                return;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setElevation(float f) {
        this.r.l(f);
        int i = this.r.F.f36o;
        JenisKodeBankDialog jenisKodeBankDialog = this.r;
        int cos = (int) (((double) jenisKodeBankDialog.F.n) * Math.cos(Math.toRadians((double) jenisKodeBankDialog.F.k)));
        if (this.G == null) {
            this.G = new Behavior();
        }
        Behavior behavior = this.G;
        int i2 = i - cos;
        behavior.e = i2;
        if (behavior.a == 1) {
            setTranslationY((float) (behavior.c + i2));
        }
    }

    public final void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFabAlignmentModeAndReplaceMenu(final int i, int i2) {
        this.D = i2;
        this.x = true;
        d(i, this.m);
        if (this.l != i && findFragmentByWho.G(this)) {
            Animator animator = this.y;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.F == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n(), "translationX", a(i));
                ofFloat.setDuration(300L);
                arrayList.add(ofFloat);
            } else {
                FloatingActionButton n = n();
                if (n != null) {
                    if (n.c == null) {
                        n.c = new onClickBtnCancel(n, new FloatingActionButton.read());
                    }
                    if (!n.c.d()) {
                        h();
                        n.b((FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver) new FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
                            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver
                            public final void b(FloatingActionButton floatingActionButton) {
                                floatingActionButton.setTranslationX(BottomAppBar.this.a(i));
                                AnonymousClass5 r0 = new FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.5
                                    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver
                                    public final void d() {
                                        BottomAppBar.a(BottomAppBar.this);
                                    }
                                };
                                if (floatingActionButton.c == null) {
                                    floatingActionButton.c = new onClickBtnCancel(floatingActionButton, new FloatingActionButton.read());
                                }
                                floatingActionButton.c.c(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE  
                                      (wrap: o.FingerprintDialog : 0x0034: IGET  (r0v5 o.FingerprintDialog A[REMOVE]) = (r9v0 'floatingActionButton' com.google.android.material.floatingactionbutton.FloatingActionButton) com.google.android.material.floatingactionbutton.FloatingActionButton.c o.FingerprintDialog)
                                      (wrap: com.google.android.material.floatingactionbutton.FloatingActionButton$5 : 0x003d: CONSTRUCTOR  (r1v4 com.google.android.material.floatingactionbutton.FloatingActionButton$5 A[REMOVE]) = 
                                      (r9v0 'floatingActionButton' com.google.android.material.floatingactionbutton.FloatingActionButton)
                                      (r0v1 'r0' com.google.android.material.bottomappbar.BottomAppBar$5$5)
                                     call: com.google.android.material.floatingactionbutton.FloatingActionButton.5.<init>(com.google.android.material.floatingactionbutton.FloatingActionButton, com.google.android.material.floatingactionbutton.FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver):void type: CONSTRUCTOR)
                                      true
                                     type: VIRTUAL call: o.FingerprintDialog.c(o.FingerprintDialog$read, boolean):void in method: com.google.android.material.bottomappbar.BottomAppBar.5.b(com.google.android.material.floatingactionbutton.FloatingActionButton):void, file: classes2-dex2jar.jar:com/google/android/material/bottomappbar/BottomAppBar$5.class
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.FloatingActionButton, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                                    	... 15 more
                                    */
                                /*
                                    this = this;
                                    r0 = r9
                                    r1 = r8
                                    com.google.android.material.bottomappbar.BottomAppBar r1 = com.google.android.material.bottomappbar.BottomAppBar.this
                                    r2 = r8
                                    int r2 = r9
                                    float r1 = r1.a(r2)
                                    r0.setTranslationX(r1)
                                    com.google.android.material.bottomappbar.BottomAppBar$5$5 r0 = new com.google.android.material.bottomappbar.BottomAppBar$5$5
                                    r1 = r0
                                    r2 = r8
                                    r1.<init>()
                                    r10 = r0
                                    r0 = r9
                                    o.FingerprintDialog r0 = r0.c
                                    if (r0 != 0) goto L_0x0033
                                    r0 = r9
                                    o.onClickBtnCancel r1 = new o.onClickBtnCancel
                                    r2 = r1
                                    r3 = r9
                                    com.google.android.material.floatingactionbutton.FloatingActionButton$read r4 = new com.google.android.material.floatingactionbutton.FloatingActionButton$read
                                    r5 = r4
                                    r6 = r9
                                    r5.<init>()
                                    r2.<init>(r3, r4)
                                    r0.c = r1
                                L_0x0033:
                                    r0 = r9
                                    o.FingerprintDialog r0 = r0.c
                                    com.google.android.material.floatingactionbutton.FloatingActionButton$5 r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$5
                                    r2 = r1
                                    r3 = r9
                                    r4 = r10
                                    r2.<init>(r4)
                                    r2 = 1
                                    r0.c(r1, r2)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.AnonymousClass5.b(com.google.android.material.floatingactionbutton.FloatingActionButton):void");
                            }
                        }, true);
                    }
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.y = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    BottomAppBar.a(BottomAppBar.this);
                    BottomAppBar.this.y = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    BottomAppBar.this.h();
                }
            });
            this.y.start();
        }
        this.l = i;
    }

    public final void setFabAnimationMode(int i) {
        this.F = i;
    }

    public final void setFabCradleMargin(float f) {
        if (f != ((chooseWaktuTidakCocok) this.r.F.l.j).c) {
            ((chooseWaktuTidakCocok) this.r.F.l.j).c = f;
            this.r.invalidateSelf();
        }
    }

    public final void setFabCradleRoundedCornerRadius(float f) {
        if (f != ((chooseWaktuTidakCocok) this.r.F.l.j).i) {
            ((chooseWaktuTidakCocok) this.r.F.l.j).i = f;
            this.r.invalidateSelf();
        }
    }

    public final void setHideOnScroll(boolean z) {
        this.t = z;
    }

    public final void setSubtitle(CharSequence charSequence) {
    }

    public final void setTitle(CharSequence charSequence) {
    }
}
