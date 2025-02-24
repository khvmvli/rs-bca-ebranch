package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import o.BaseDialogKotlin;
import o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver;
import o.BaseDialogKotlin$MediaSessionCompat$Token;
import o.BaseKonfirmasiDialog;
import o.ExitTransaksiDialog;
import o.FingerprintDialog;
import o.FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver;
import o.FingerprintDialog_ViewBinding;
import o.HaloBCADialog;
import o.HapusDaftarTransferDialog;
import o.IsiPernyataanDialog;
import o.JenisKodeBankDialog;
import o.JenisPekerjaanDialog;
import o.KategoriTujuanTransaksiORDialog;
import o.KetentuanBankTransferDialog_ViewBinding;
import o.findFragmentByWho;
import o.getInsetsForType;
import o.getPopEnterAnim;
import o.onClickBtnCancel;
import o.onClickBtnOk;
import o.onClickClose;
import o.onClickYes;
import o.setDropDownVerticalOffset;
import o.setImageResource;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/FloatingActionButton.class */
public final class FloatingActionButton extends HapusDaftarTransferDialog implements ExitTransaksiDialog, KategoriTujuanTransaksiORDialog, CoordinatorLayout.MediaBrowserCompat.CustomActionResultReceiver {
    private static final int f = BaseDialogKotlin.MediaDescriptionCompat.h;
    public final onClickYes a;
    int b;
    public FingerprintDialog c;
    boolean d;
    final Rect e;
    public int h;
    private ColorStateList i;
    private PorterDuff.Mode j;
    private final setDropDownVerticalOffset k;
    private PorterDuff.Mode l;
    private ColorStateList m;
    private int n;

    /* renamed from: o */
    private int f6o;
    private ColorStateList q;
    private final Rect r;
    private int t;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior.class */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.write<T> {
        private Rect b;
        private FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver c;
        private boolean e;

        public BaseBehavior() {
            this.e = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.bZ);
            this.e = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ca, true);
            obtainStyledAttributes.recycle();
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            return this.e && floatingActionButton.getLayoutParams().h == view.getId() && floatingActionButton.g == 0;
        }

        private boolean c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!b(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.b == null) {
                this.b = new Rect();
            }
            Rect rect = this.b;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            FingerprintDialog_ViewBinding.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.b()) {
                floatingActionButton.b(this.c, false);
                return true;
            }
            floatingActionButton.a(this.c, false);
            return true;
        }

        private boolean e(View view, FloatingActionButton floatingActionButton) {
            if (!b(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + floatingActionButton.getLayoutParams().topMargin) {
                floatingActionButton.b(this.c, false);
                return true;
            }
            floatingActionButton.a(this.c, false);
            return true;
        }

        /* renamed from: b */
        public boolean e(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List a = coordinatorLayout.a(floatingActionButton);
            int size = a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) a.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    CoordinatorLayout.read layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.read ? layoutParams.g instanceof BottomSheetBehavior : false) && e(view, floatingActionButton)) {
                        break;
                    }
                } else if (c(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.d(floatingActionButton, i);
            Rect rect = floatingActionButton.e;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.read layoutParams2 = floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - layoutParams2.rightMargin ? rect.right : floatingActionButton.getLeft() <= layoutParams2.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - layoutParams2.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= layoutParams2.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                findFragmentByWho.e(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            findFragmentByWho.d(floatingActionButton, i4);
            return true;
        }

        /* renamed from: b */
        public boolean c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.e;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                c(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            CoordinatorLayout.read layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.read ? layoutParams.g instanceof BottomSheetBehavior : false)) {
                return false;
            }
            e(view, floatingActionButton);
            return false;
        }

        public void d(CoordinatorLayout.read read) {
            if (read.a == 0) {
                read.a = 80;
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/FloatingActionButton$Behavior.class */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return e(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return c(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return b(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ void d(CoordinatorLayout.read read) {
            d(read);
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/FloatingActionButton$read.class */
    public final class read implements IsiPernyataanDialog {
        public read() {
            FloatingActionButton.this = r4;
        }

        @Override // o.IsiPernyataanDialog
        public final void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.this.setBackgroundDrawable(drawable);
            }
        }

        @Override // o.IsiPernyataanDialog
        public final boolean c() {
            return FloatingActionButton.this.d;
        }

        @Override // o.IsiPernyataanDialog
        public final void d(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.e.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.b, i2 + FloatingActionButton.this.b, i3 + FloatingActionButton.this.b, i4 + FloatingActionButton.this.b);
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/FloatingActionButton$write.class */
    public final class write<T extends FloatingActionButton> implements FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver {
        private final onClickClose<T> b;

        public write(onClickClose<T> onclickclose) {
            FloatingActionButton.this = r4;
            this.b = onclickclose;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver
        public final void c() {
            this.b.c(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver
        public final void d() {
            this.b.a(FloatingActionButton.this);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof write) && ((write) obj).b.equals(this.b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.v);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public FloatingActionButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 915
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            i = Math.min(i, size);
        } else if (mode != 0) {
            if (mode == 1073741824) {
                i = size;
            } else {
                throw new IllegalArgumentException();
            }
        }
        return i;
    }

    private void a() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.m;
            if (colorStateList == null) {
                getInsetsForType.d(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.l;
            PorterDuff.Mode mode2 = mode;
            if (mode == null) {
                mode2 = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(setImageResource.d(colorForState, mode2));
        }
    }

    private FingerprintDialog b() {
        if (this.c == null) {
            this.c = new onClickBtnCancel(this, new read());
        }
        return this.c;
    }

    final void a(final FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver, boolean z) {
        b().c(floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver == null ? null : new FingerprintDialog.read() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButton.5
            @Override // o.FingerprintDialog.read
            public final void c() {
                r6.b(FloatingActionButton.this);
            }

            @Override // o.FingerprintDialog.read
            public final void d() {
                r6.d();
            }
        }, z);
    }

    public void b(Rect rect) {
        rect.left += this.e.left;
        rect.top += this.e.top;
        rect.right -= this.e.right;
        rect.bottom -= this.e.bottom;
    }

    public final void b(final FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver, boolean z) {
        b().b(floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver == null ? null : new FingerprintDialog.read() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButton.5
            @Override // o.FingerprintDialog.read
            public final void c() {
                floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver.b(FloatingActionButton.this);
            }

            @Override // o.FingerprintDialog.read
            public final void d() {
                floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver.d();
            }
        }, z);
    }

    public int c(int i) {
        int i2 = this.f6o;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(BaseDialogKotlin.read.a) : resources.getDimensionPixelSize(BaseDialogKotlin.read.e);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final CoordinatorLayout.write<FloatingActionButton> c() {
        return new Behavior();
    }

    @Override // o.ExitReservasiDialog_ViewBinding
    public final boolean d() {
        return this.a.c;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        drawableStateChanged();
        b().b(getDrawableState());
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.i;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.j;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        jumpDrawablesToCurrentState();
        b().c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        onAttachedToWindow();
        FingerprintDialog b = b();
        JenisKodeBankDialog jenisKodeBankDialog = b.C;
        if (jenisKodeBankDialog != null) {
            FloatingActionButton floatingActionButton = b.G;
            if (jenisKodeBankDialog.l()) {
                jenisKodeBankDialog.n(HaloBCADialog.c(floatingActionButton));
            }
        }
        if (b.g()) {
            ViewTreeObserver viewTreeObserver = b.G.getViewTreeObserver();
            if (b.p == null) {
                b.p = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0045: IPUT  
                      (wrap: o.FingerprintDialog$2 : 0x0042: CONSTRUCTOR  (r1v2 o.FingerprintDialog$2 A[REMOVE]) = (r0v2 'b' o.FingerprintDialog) call: o.FingerprintDialog.2.<init>(o.FingerprintDialog):void type: CONSTRUCTOR)
                      (r0v2 'b' o.FingerprintDialog)
                     o.FingerprintDialog.p android.view.ViewTreeObserver$OnPreDrawListener in method: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void, file: classes2-dex2jar.jar:com/google/android/material/floatingactionbutton/FloatingActionButton.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.FingerprintDialog, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                    	... 29 more
                    */
                /*
                    this = this;
                    r0 = r5
                    r0.onAttachedToWindow()
                    r0 = r5
                    o.FingerprintDialog r0 = r0.b()
                    r6 = r0
                    r0 = r6
                    o.JenisKodeBankDialog r0 = r0.C
                    r7 = r0
                    r0 = r7
                    if (r0 == 0) goto L_0x0026
                    r0 = r6
                    com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.G
                    r8 = r0
                    r0 = r7
                    boolean r0 = r0.l()
                    if (r0 == 0) goto L_0x0026
                    r0 = r7
                    r1 = r8
                    float r1 = o.HaloBCADialog.c(r1)
                    r0.n(r1)
                L_0x0026:
                    r0 = r6
                    boolean r0 = r0.g()
                    if (r0 == 0) goto L_0x0050
                    r0 = r6
                    com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.G
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    r8 = r0
                    r0 = r6
                    android.view.ViewTreeObserver$OnPreDrawListener r0 = r0.p
                    if (r0 != 0) goto L_0x0048
                    r0 = r6
                    o.FingerprintDialog$2 r1 = new o.FingerprintDialog$2
                    r2 = r1
                    r3 = r6
                    r2.<init>()
                    r0.p = r1
                L_0x0048:
                    r0 = r8
                    r1 = r6
                    android.view.ViewTreeObserver$OnPreDrawListener r1 = r1.p
                    r0.addOnPreDrawListener(r1)
                L_0x0050:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void");
            }

            @Override // android.widget.ImageView, android.view.View
            protected final void onDetachedFromWindow() {
                onDetachedFromWindow();
                FingerprintDialog b = b();
                ViewTreeObserver viewTreeObserver = b.G.getViewTreeObserver();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = b.p;
                if (onPreDrawListener != null) {
                    viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
                    b.p = null;
                }
            }

            @Override // android.widget.ImageView, android.view.View
            protected final void onMeasure(int i, int i2) {
                int c = c(this.h);
                this.b = (c - this.t) / 2;
                b().k();
                int min = Math.min(a(c, i), a(c, i2));
                setMeasuredDimension(this.e.left + min + this.e.right, min + this.e.top + this.e.bottom);
            }

            @Override // android.view.View
            protected final void onRestoreInstanceState(Parcelable parcelable) {
                if (!(parcelable instanceof KetentuanBankTransferDialog_ViewBinding)) {
                    onRestoreInstanceState(parcelable);
                    return;
                }
                KetentuanBankTransferDialog_ViewBinding ketentuanBankTransferDialog_ViewBinding = (KetentuanBankTransferDialog_ViewBinding) parcelable;
                onRestoreInstanceState(((getPopEnterAnim) ketentuanBankTransferDialog_ViewBinding).d);
                onClickYes onclickyes = this.a;
                Bundle bundle = (Bundle) ketentuanBankTransferDialog_ViewBinding.e.get("expandableWidgetHelper");
                onclickyes.c = bundle.getBoolean("expanded", false);
                onclickyes.d = bundle.getInt("expandedComponentIdHint", 0);
                if (onclickyes.c) {
                    CoordinatorLayout parent = onclickyes.b.getParent();
                    if (parent instanceof CoordinatorLayout) {
                        parent.c(onclickyes.b);
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Parcelable, o.KetentuanBankTransferDialog_ViewBinding] */
            /* JADX WARN: Unknown variable types count: 1 */
            @Override // android.view.View
            /* Code decompiled incorrectly, please refer to instructions dump */
            protected final android.os.Parcelable onSaveInstanceState() {
                /*
                    r4 = this;
                    r0 = r4
                    android.os.Parcelable r0 = r0.onSaveInstanceState()
                    r5 = r0
                    r0 = r5
                    r6 = r0
                    r0 = r5
                    if (r0 != 0) goto L_0x0013
                    android.os.Bundle r0 = new android.os.Bundle
                    r1 = r0
                    r1.<init>()
                    r6 = r0
                L_0x0013:
                    o.KetentuanBankTransferDialog_ViewBinding r0 = new o.KetentuanBankTransferDialog_ViewBinding
                    r1 = r0
                    r2 = r6
                    r1.<init>(r2)
                    r6 = r0
                    r0 = r6
                    o.setCollapseIcon<java.lang.String, android.os.Bundle> r0 = r0.e
                    r7 = r0
                    r0 = r4
                    o.onClickYes r0 = r0.a
                    r8 = r0
                    android.os.Bundle r0 = new android.os.Bundle
                    r1 = r0
                    r1.<init>()
                    r5 = r0
                    r0 = r5
                    java.lang.String r1 = "expanded"
                    r2 = r8
                    boolean r2 = r2.c
                    r0.putBoolean(r1, r2)
                    r0 = r5
                    java.lang.String r1 = "expandedComponentIdHint"
                    r2 = r8
                    int r2 = r2.d
                    r0.putInt(r1, r2)
                    r0 = r7
                    java.lang.String r1 = "expandableWidgetHelper"
                    r2 = r5
                    java.lang.Object r0 = r0.put(r1, r2)
                    r0 = r6
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.onSaveInstanceState():android.os.Parcelable");
            }

            @Override // android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                boolean z;
                if (motionEvent.getAction() == 0) {
                    Rect rect = this.r;
                    if (findFragmentByWho.G(this)) {
                        rect.set(0, 0, getWidth(), getHeight());
                        b(rect);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && !this.r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                }
                return onTouchEvent(motionEvent);
            }

            @Override // android.view.View
            public final void setBackgroundColor(int i) {
                Log.i("FloatingActionButton", "Setting a custom background is not supported.");
            }

            @Override // android.view.View
            public final void setBackgroundDrawable(Drawable drawable) {
                Log.i("FloatingActionButton", "Setting a custom background is not supported.");
            }

            @Override // android.view.View
            public final void setBackgroundResource(int i) {
                Log.i("FloatingActionButton", "Setting a custom background is not supported.");
            }

            @Override // android.view.View
            public final void setBackgroundTintList(ColorStateList colorStateList) {
                if (this.i != colorStateList) {
                    this.i = colorStateList;
                    FingerprintDialog b = b();
                    JenisKodeBankDialog jenisKodeBankDialog = b.C;
                    if (jenisKodeBankDialog != null) {
                        jenisKodeBankDialog.setTintList(colorStateList);
                    }
                    onClickBtnOk onclickbtnok = b.f;
                    if (onclickbtnok != null) {
                        onclickbtnok.e(colorStateList);
                    }
                }
            }

            @Override // android.view.View
            public final void setBackgroundTintMode(PorterDuff.Mode mode) {
                if (this.j != mode) {
                    this.j = mode;
                    JenisKodeBankDialog jenisKodeBankDialog = b().C;
                    if (jenisKodeBankDialog != null) {
                        jenisKodeBankDialog.setTintMode(mode);
                    }
                }
            }

            public final void setCompatElevation(float f2) {
                FingerprintDialog b = b();
                if (b.m != f2) {
                    b.m = f2;
                    b.e(f2, b.q, b.u);
                }
            }

            public final void setCompatElevationResource(int i) {
                setCompatElevation(getResources().getDimension(i));
            }

            public final void setCompatHoveredFocusedTranslationZ(float f2) {
                FingerprintDialog b = b();
                if (b.q != f2) {
                    b.q = f2;
                    b.e(b.m, f2, b.u);
                }
            }

            public final void setCompatHoveredFocusedTranslationZResource(int i) {
                setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
            }

            public final void setCompatPressedTranslationZ(float f2) {
                FingerprintDialog b = b();
                if (b.u != f2) {
                    b.u = f2;
                    b.e(b.m, b.q, f2);
                }
            }

            public final void setCompatPressedTranslationZResource(int i) {
                setCompatPressedTranslationZ(getResources().getDimension(i));
            }

            public final void setCustomSize(int i) {
                if (i < 0) {
                    throw new IllegalArgumentException("Custom size must be non-negative");
                } else if (i != this.f6o) {
                    this.f6o = i;
                    requestLayout();
                }
            }

            @Override // android.view.View
            public final void setElevation(float f2) {
                setElevation(f2);
                JenisKodeBankDialog jenisKodeBankDialog = b().C;
                if (jenisKodeBankDialog != null) {
                    jenisKodeBankDialog.l(f2);
                }
            }

            public final void setEnsureMinTouchTargetSize(boolean z) {
                if (z != b().n) {
                    b().n = z;
                    requestLayout();
                }
            }

            public final void setExpandedComponentIdHint(int i) {
                this.a.d = i;
            }

            public final void setHideMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
                b().l = baseKonfirmasiDialog;
            }

            public final void setHideMotionSpecResource(int i) {
                setHideMotionSpec(BaseKonfirmasiDialog.b(getContext(), i));
            }

            @Override // android.widget.ImageView
            public final void setImageDrawable(Drawable drawable) {
                if (getDrawable() != drawable) {
                    setImageDrawable(drawable);
                    FingerprintDialog b = b();
                    float f2 = b.t;
                    b.t = f2;
                    Matrix matrix = b.D;
                    b.e(f2, matrix);
                    b.G.setImageMatrix(matrix);
                    if (this.m != null) {
                        a();
                    }
                }
            }

            @Override // android.widget.ImageView
            public final void setImageResource(int i) {
                this.k.b(i);
                a();
            }

            public final void setRippleColor(int i) {
                setRippleColor(ColorStateList.valueOf(i));
            }

            public final void setRippleColor(ColorStateList colorStateList) {
                if (this.q != colorStateList) {
                    this.q = colorStateList;
                    b().b(this.q);
                }
            }

            @Override // android.view.View
            public final void setScaleX(float f2) {
                setScaleX(f2);
                b().j();
            }

            @Override // android.view.View
            public final void setScaleY(float f2) {
                setScaleY(f2);
                b().j();
            }

            public final void setShadowPaddingEnabled(boolean z) {
                FingerprintDialog b = b();
                b.x = z;
                b.k();
            }

            @Override // o.KategoriTujuanTransaksiORDialog
            public final void setShapeAppearanceModel(JenisPekerjaanDialog jenisPekerjaanDialog) {
                b().e(jenisPekerjaanDialog);
            }

            public final void setShowMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
                b().B = baseKonfirmasiDialog;
            }

            public final void setShowMotionSpecResource(int i) {
                setShowMotionSpec(BaseKonfirmasiDialog.b(getContext(), i));
            }

            public final void setSize(int i) {
                this.f6o = 0;
                if (i != this.h) {
                    this.h = i;
                    requestLayout();
                }
            }

            public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
                setBackgroundTintList(colorStateList);
            }

            public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
                setBackgroundTintMode(mode);
            }

            public final void setSupportImageTintList(ColorStateList colorStateList) {
                if (this.m != colorStateList) {
                    this.m = colorStateList;
                    a();
                }
            }

            public final void setSupportImageTintMode(PorterDuff.Mode mode) {
                if (this.l != mode) {
                    this.l = mode;
                    a();
                }
            }

            @Override // android.view.View
            public final void setTranslationX(float f2) {
                setTranslationX(f2);
                b().h();
            }

            @Override // android.view.View
            public final void setTranslationY(float f2) {
                setTranslationY(f2);
                b().h();
            }

            @Override // android.view.View
            public final void setTranslationZ(float f2) {
                setTranslationZ(f2);
                b().h();
            }

            public final void setUseCompatPadding(boolean z) {
                if (this.d != z) {
                    this.d = z;
                    b().f();
                }
            }

            @Override // o.HapusDaftarTransferDialog, android.widget.ImageView, android.view.View
            public final void setVisibility(int i) {
                setVisibility(i);
            }
        }
