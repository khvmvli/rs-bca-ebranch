package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/chooseSudahTransaksiEchannel.class */
public class chooseSudahTransaksiEchannel extends setSplitTrack implements Checkable, KategoriTujuanTransaksiORDialog {
    private boolean k;
    private boolean l;
    private final chooseDokumenBelumLengkap n;
    private IconCompatParcelizer p;
    private boolean t;
    private static final int[] j = {16842911};
    private static final int[] h = {16842912};

    /* renamed from: o */
    private static final int[] f61o = {BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.O};
    private static final int m = BaseDialogKotlin.MediaDescriptionCompat.r;

    /* loaded from: classes2-dex2jar.jar:o/chooseSudahTransaksiEchannel$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
    }

    public chooseSudahTransaksiEchannel(Context context) {
        this(context, null);
    }

    public chooseSudahTransaksiEchannel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.A);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Type inference failed for: r0v46, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Type inference failed for: r0v68, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Type inference failed for: r0v81, types: [android.view.View, java.lang.Object, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public chooseSudahTransaksiEchannel(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahTransaksiEchannel.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void m() {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap;
        Drawable drawable;
        if (Build.VERSION.SDK_INT > 26 && (drawable = (choosedokumenbelumlengkap = this.n).f57o) != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            choosedokumenbelumlengkap.f57o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            choosedokumenbelumlengkap.f57o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        setContentPadding(i, i2, i3, i4);
    }

    public final void d(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final float i() {
        return this.n.e.j();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.l;
    }

    public final int j() {
        return this.n.p.top;
    }

    public final float n() {
        return i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        JenisKodeBankDialog jenisKodeBankDialog = this.n.e;
        if (jenisKodeBankDialog.l()) {
            jenisKodeBankDialog.n(HaloBCADialog.c(this));
        }
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = onCreateDrawableState(i + 3);
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        if (choosedokumenbelumlengkap != null && choosedokumenbelumlengkap.d) {
            mergeDrawableStates(onCreateDrawableState, j);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        if (this.k) {
            mergeDrawableStates(onCreateDrawableState, f61o);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        accessibilityNodeInfo.setCheckable(choosedokumenbelumlengkap != null && choosedokumenbelumlengkap.d);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    public void onMeasure(int i, int i2) {
        int i3;
        onMeasure(i, i2);
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (choosedokumenbelumlengkap.f != null) {
            int i4 = choosedokumenbelumlengkap.c;
            int i5 = choosedokumenbelumlengkap.b;
            int i6 = (measuredWidth - i4) - i5;
            int i7 = (measuredHeight - i4) - i5;
            int i8 = i7;
            int i9 = i6;
            if (choosedokumenbelumlengkap.n.g()) {
                float f = 0.0f;
                i8 = i7 - ((int) Math.ceil((double) (((choosedokumenbelumlengkap.n.h() * 1.5f) + (choosedokumenbelumlengkap.a() ? choosedokumenbelumlengkap.d() : 0.0f)) * 2.0f)));
                float h2 = choosedokumenbelumlengkap.n.h();
                if (choosedokumenbelumlengkap.a()) {
                    f = choosedokumenbelumlengkap.d();
                }
                i9 = i6 - ((int) Math.ceil((double) ((h2 + f) * 2.0f)));
            }
            int i10 = choosedokumenbelumlengkap.c;
            if (findFragmentByWho.k((View) choosedokumenbelumlengkap.n) == 1) {
                i3 = i9;
            } else {
                i3 = i10;
                i10 = i9;
            }
            choosedokumenbelumlengkap.f.setLayerInset(2, i10, choosedokumenbelumlengkap.c, i3, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.t) {
            if (!this.n.k) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.n.k = true;
            }
            setBackgroundDrawable(drawable);
        }
    }

    public void setCardBackgroundColor(int i) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        choosedokumenbelumlengkap.e.c(ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.n.e.c(colorStateList);
    }

    public void setCardElevation(float f) {
        setCardElevation(f);
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        choosedokumenbelumlengkap.e.l(choosedokumenbelumlengkap.n.A_());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        JenisKodeBankDialog jenisKodeBankDialog = this.n.h;
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        jenisKodeBankDialog.c(colorStateList2);
    }

    public void setCheckable(boolean z) {
        this.n.d = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.n.b(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.n.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.n.c = getResources().getDimensionPixelSize(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckedIconResource(int i) {
        this.n.b(setPrimaryBackground.c(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.n.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.n.b = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        choosedokumenbelumlengkap.j = colorStateList;
        Drawable drawable = choosedokumenbelumlengkap.a;
        if (drawable != null) {
            getInsetsForType.e(drawable, colorStateList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, o.chooseSudahTransaksiEchannel] */
    public void setClickable(boolean z) {
        setClickable(z);
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        if (choosedokumenbelumlengkap != null) {
            Drawable drawable = choosedokumenbelumlengkap.i;
            Drawable c = choosedokumenbelumlengkap.n.isClickable() ? choosedokumenbelumlengkap.c() : choosedokumenbelumlengkap.h;
            choosedokumenbelumlengkap.i = c;
            if (drawable == c) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || !(choosedokumenbelumlengkap.n.getForeground() instanceof InsetDrawable)) {
                choosedokumenbelumlengkap.n.setForeground(choosedokumenbelumlengkap.d(c));
            } else {
                ((InsetDrawable) choosedokumenbelumlengkap.n.getForeground()).setDrawable(c);
            }
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        choosedokumenbelumlengkap.p.set(i, i2, i3, i4);
        choosedokumenbelumlengkap.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDragged(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
            m();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        setMaxCardElevation(f);
        this.n.j();
    }

    public void setOnCheckedChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        this.p = iconCompatParcelizer;
    }

    public void setPreventCornerOverlap(boolean z) {
        setPreventCornerOverlap(z);
        this.n.j();
        this.n.b();
    }

    public void setProgress(float f) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        JenisKodeBankDialog jenisKodeBankDialog = choosedokumenbelumlengkap.e;
        if (jenisKodeBankDialog.F.i != f) {
            jenisKodeBankDialog.F.i = f;
            jenisKodeBankDialog.H = true;
            jenisKodeBankDialog.invalidateSelf();
        }
        JenisKodeBankDialog jenisKodeBankDialog2 = choosedokumenbelumlengkap.h;
        if (!(jenisKodeBankDialog2 == null || jenisKodeBankDialog2.F.i == f)) {
            jenisKodeBankDialog2.F.i = f;
            jenisKodeBankDialog2.H = true;
            jenisKodeBankDialog2.invalidateSelf();
        }
        JenisKodeBankDialog jenisKodeBankDialog3 = choosedokumenbelumlengkap.g;
        if (jenisKodeBankDialog3 != null && jenisKodeBankDialog3.F.i != f) {
            jenisKodeBankDialog3.F.i = f;
            jenisKodeBankDialog3.H = true;
            jenisKodeBankDialog3.invalidateSelf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
        if (r11 != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setRadius(float r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r0.setRadius(r1)
            r0 = r6
            o.chooseDokumenBelumLengkap r0 = r0.n
            r8 = r0
            o.JenisPekerjaanDialog$RemoteActionCompatParcelizer r0 = new o.JenisPekerjaanDialog$RemoteActionCompatParcelizer
            r1 = r0
            r2 = r8
            o.JenisPekerjaanDialog r2 = r2.m
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            o.InfoTarikanDialog_ViewBinding r1 = new o.InfoTarikanDialog_ViewBinding
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.i = r1
            r0 = r9
            o.InfoTarikanDialog_ViewBinding r1 = new o.InfoTarikanDialog_ViewBinding
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.k = r1
            r0 = r9
            o.InfoTarikanDialog_ViewBinding r1 = new o.InfoTarikanDialog_ViewBinding
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.e = r1
            r0 = r9
            o.InfoTarikanDialog_ViewBinding r1 = new o.InfoTarikanDialog_ViewBinding
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.b = r1
            r0 = 0
            r10 = r0
            r0 = r8
            o.JenisPekerjaanDialog r1 = new o.JenisPekerjaanDialog
            r2 = r1
            r3 = r9
            r4 = 0
            r2.<init>(r3, r4)
            r0.a(r1)
            r0 = r8
            android.graphics.drawable.Drawable r0 = r0.i
            r0.invalidateSelf()
            r0 = r8
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0088
            r0 = r10
            r11 = r0
            r0 = r8
            o.chooseSudahTransaksiEchannel r0 = r0.n
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0083
            r0 = r10
            r11 = r0
            r0 = r8
            o.JenisKodeBankDialog r0 = r0.e
            boolean r0 = r0.m()
            if (r0 != 0) goto L_0x0083
            r0 = 1
            r11 = r0
        L_0x0083:
            r0 = r11
            if (r0 == 0) goto L_0x008c
        L_0x0088:
            r0 = r8
            r0.b()
        L_0x008c:
            r0 = r8
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0097
            r0 = r8
            r0.j()
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahTransaksiEchannel.setRadius(float):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        choosedokumenbelumlengkap.l = colorStateList;
        choosedokumenbelumlengkap.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRippleColorResource(int i) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        choosedokumenbelumlengkap.l = setPrimaryBackground.b(getContext(), i);
        choosedokumenbelumlengkap.e();
    }

    @Override // o.KategoriTujuanTransaksiORDialog
    public void setShapeAppearanceModel(JenisPekerjaanDialog jenisPekerjaanDialog) {
        RectF rectF = new RectF();
        rectF.set(this.n.e.getBounds());
        setClipToOutline(jenisPekerjaanDialog.a(rectF));
        this.n.a(jenisPekerjaanDialog);
    }

    public void setStrokeColor(int i) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (choosedokumenbelumlengkap.r != valueOf) {
            choosedokumenbelumlengkap.r = valueOf;
            choosedokumenbelumlengkap.h.c((float) choosedokumenbelumlengkap.q, choosedokumenbelumlengkap.r);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        if (choosedokumenbelumlengkap.r != colorStateList) {
            choosedokumenbelumlengkap.r = colorStateList;
            choosedokumenbelumlengkap.h.c((float) choosedokumenbelumlengkap.q, choosedokumenbelumlengkap.r);
        }
    }

    public void setStrokeWidth(int i) {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        if (i != choosedokumenbelumlengkap.q) {
            choosedokumenbelumlengkap.q = i;
            choosedokumenbelumlengkap.h.c((float) choosedokumenbelumlengkap.q, choosedokumenbelumlengkap.r);
        }
    }

    public void setUseCompatPadding(boolean z) {
        setUseCompatPadding(z);
        this.n.j();
        this.n.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void toggle() {
        chooseDokumenBelumLengkap choosedokumenbelumlengkap = this.n;
        if ((choosedokumenbelumlengkap != null && choosedokumenbelumlengkap.d) && isEnabled()) {
            this.l = !this.l;
            refreshDrawableState();
            m();
        }
    }

    public final ColorStateList w_() {
        return this.n.e.F.d;
    }

    public final int x_() {
        return this.n.p.bottom;
    }

    public final int y_() {
        return this.n.p.left;
    }

    public final int z_() {
        return this.n.p.right;
    }
}
