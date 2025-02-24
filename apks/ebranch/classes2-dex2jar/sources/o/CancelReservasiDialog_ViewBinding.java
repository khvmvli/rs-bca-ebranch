package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.BaseDialogKotlin;
import o.JenisPekerjaanDialog;
/* loaded from: classes2-dex2jar.jar:o/CancelReservasiDialog_ViewBinding.class */
public class CancelReservasiDialog_ViewBinding extends setSupportImageTintMode implements Checkable, KategoriTujuanTransaksiORDialog {
    public int a;
    write b;
    final LinkedHashSet<RemoteActionCompatParcelizer> c;
    public Drawable e;
    private boolean f;
    private boolean j;
    private int k;
    private ColorStateList l;
    private int m;
    private PorterDuff.Mode n;

    /* renamed from: o */
    private int f22o;
    private int r;
    private final chooseLainnya t;
    private static final int[] i = {16842911};
    private static final int[] g = {16842912};
    private static final int h = BaseDialogKotlin.MediaDescriptionCompat.t;

    /* loaded from: classes2-dex2jar.jar:o/CancelReservasiDialog_ViewBinding$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends getPopEnterAnim {
        public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<IconCompatParcelizer>() { // from class: o.CancelReservasiDialog_ViewBinding.IconCompatParcelizer.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new IconCompatParcelizer(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ IconCompatParcelizer createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new IconCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new IconCompatParcelizer[i];
            }
        };
        boolean c;

        public IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt() != 1 ? false : true;
        }

        public IconCompatParcelizer(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/CancelReservasiDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void c(CancelReservasiDialog_ViewBinding cancelReservasiDialog_ViewBinding, boolean z);
    }

    /* loaded from: classes2-dex2jar.jar:o/CancelReservasiDialog_ViewBinding$write.class */
    interface write {
        void a();
    }

    public CancelReservasiDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public CancelReservasiDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v35, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v38, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v41, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v46, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v38, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v42, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v46, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public CancelReservasiDialog_ViewBinding(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
        // Method dump skipped, instructions count: 645
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CancelReservasiDialog_ViewBinding.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
        if (r0 != r7.e) goto L_0x0124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void d(boolean r8) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CancelReservasiDialog_ViewBinding.d(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(int i2, int i3) {
        if (this.e != null && getLayout() != null) {
            int i4 = this.m;
            boolean z = true;
            if (!(i4 == 1 || i4 == 2)) {
                int i5 = this.m;
                if (!(i5 == 3 || i5 == 4)) {
                    int i6 = this.m;
                    boolean z2 = true;
                    if (i6 != 16) {
                        z2 = true;
                        if (i6 != 32) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        this.f22o = 0;
                        if (this.m == 16) {
                            this.r = 0;
                            d(false);
                            return;
                        }
                        int i7 = this.a;
                        int i8 = i7;
                        if (i7 == 0) {
                            i8 = this.e.getIntrinsicHeight();
                        }
                        TextPaint paint = getPaint();
                        String charSequence = getText().toString();
                        String str = charSequence;
                        if (getTransformationMethod() != null) {
                            str = getTransformationMethod().getTransformation(charSequence, this).toString();
                        }
                        Rect rect = new Rect();
                        paint.getTextBounds(str, 0, str.length(), rect);
                        int min = (((((i3 - Math.min(rect.height(), getLayout().getHeight())) - getPaddingTop()) - i8) - this.k) - getPaddingBottom()) / 2;
                        if (this.r != min) {
                            this.r = min;
                            d(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.r = 0;
            int i9 = this.m;
            if (i9 == 1 || i9 == 3) {
                this.f22o = 0;
                d(false);
                return;
            }
            int i10 = this.a;
            int i11 = i10;
            if (i10 == 0) {
                i11 = this.e.getIntrinsicWidth();
            }
            TextPaint paint2 = getPaint();
            String charSequence2 = getText().toString();
            String str2 = charSequence2;
            if (getTransformationMethod() != null) {
                str2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
            }
            int min2 = (((((i2 - Math.min((int) paint2.measureText(str2), getLayout().getEllipsizedWidth())) - findFragmentByWho.s(this)) - i11) - this.k) - findFragmentByWho.t(this)) / 2;
            boolean z3 = findFragmentByWho.k(this) == 1;
            if (this.m != 4) {
                z = false;
            }
            int i12 = min2;
            if (z3 != z) {
                i12 = -min2;
            }
            if (this.f22o != i12) {
                this.f22o = i12;
                d(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        int i2 = this.m;
        boolean z = false;
        if (i2 == 1 || i2 == 2) {
            getParentFragment.c(this, this.e, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        int i3 = this.m;
        if (i3 == 3 || i3 == 4) {
            getParentFragment.c(this, (Drawable) null, (Drawable) null, this.e, (Drawable) null);
            return;
        }
        int i4 = this.m;
        if (i4 == 16 || i4 == 32) {
            z = true;
        }
        if (z) {
            getParentFragment.c(this, (Drawable) null, this.e, (Drawable) null, (Drawable) null);
        }
    }

    private String j() {
        chooseLainnya chooselainnya = this.t;
        return (chooselainnya != null && chooselainnya.a ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList B_() {
        chooseLainnya chooselainnya = this.t;
        return chooselainnya != null && !chooselainnya.d ? this.t.c : B_();
    }

    public final JenisPekerjaanDialog a() {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            return this.t.s;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public final void a(boolean z) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            chooselainnya2.r = true;
            chooselainnya2.e();
        }
    }

    public PorterDuff.Mode b() {
        chooseLainnya chooselainnya = this.t;
        return chooselainnya != null && !chooselainnya.d ? this.t.e : b();
    }

    public final void b(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final int d() {
        return this.a;
    }

    public final Drawable e() {
        return this.e;
    }

    public ColorStateList getBackgroundTintList() {
        return B_();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return b();
    }

    public final int h() {
        chooseLainnya chooselainnya = this.t;
        int i2 = 0;
        if (chooselainnya != null && !chooselainnya.d) {
            i2 = this.t.t;
        }
        return i2;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        onAttachedToWindow();
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            JenisKodeBankDialog b = this.t.b(false);
            if (b.l()) {
                b.n(HaloBCADialog.c(this));
            }
        }
    }

    protected int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = onCreateDrawableState(i2 + 2);
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && chooselainnya.a) {
            mergeDrawableStates(onCreateDrawableState, i);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(j());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(j());
        chooseLainnya chooselainnya = this.t;
        accessibilityNodeInfo.setCheckable(chooselainnya != null && chooselainnya.a);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        chooseLainnya chooselainnya;
        Drawable drawable;
        onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (chooselainnya = this.t) != null && (drawable = chooselainnya.k) != null) {
            drawable.setBounds(chooselainnya.j, chooselainnya.m, (i4 - i2) - chooselainnya.n, (i5 - i3) - chooselainnya.g);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof IconCompatParcelizer)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) parcelable;
        onRestoreInstanceState(((getPopEnterAnim) iconCompatParcelizer).d);
        setChecked(iconCompatParcelizer.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.CancelReservasiDialog_ViewBinding$IconCompatParcelizer, android.os.Parcelable] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r4 = this;
            o.CancelReservasiDialog_ViewBinding$IconCompatParcelizer r0 = new o.CancelReservasiDialog_ViewBinding$IconCompatParcelizer
            r1 = r0
            r2 = r4
            android.os.Parcelable r2 = r2.onSaveInstanceState()
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = r4
            boolean r1 = r1.f
            r0.c = r1
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CancelReservasiDialog_ViewBinding.onSaveInstanceState():android.os.Parcelable");
    }

    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        onSizeChanged(i2, i3, i4, i5);
        e(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        onTextChanged(charSequence, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            if (chooselainnya2.b(false) != null) {
                chooselainnya2.b(false).setTint(i2);
                return;
            }
            return;
        }
        setBackgroundColor(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(Drawable drawable) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                chooseLainnya chooselainnya2 = this.t;
                chooselainnya2.d = true;
                chooselainnya2.l.setSupportBackgroundTintList(chooselainnya2.c);
                chooselainnya2.l.setSupportBackgroundTintMode(chooselainnya2.e);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? setPrimaryBackground.c(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            this.t.a = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        chooseLainnya chooselainnya = this.t;
        if ((chooselainnya != null && chooselainnya.a) && isEnabled() && this.f != z) {
            this.f = z;
            refreshDrawableState();
            if (!this.j) {
                this.j = true;
                Iterator<RemoteActionCompatParcelizer> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.f);
                }
                this.j = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            if (!chooselainnya2.i || chooselainnya2.h != i2) {
                chooselainnya2.h = i2;
                chooselainnya2.i = true;
                JenisPekerjaanDialog jenisPekerjaanDialog = chooselainnya2.s;
                float f = (float) i2;
                JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer(jenisPekerjaanDialog);
                remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(f);
                remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(f);
                remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(f);
                remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(f);
                JenisPekerjaanDialog jenisPekerjaanDialog2 = new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0);
                chooselainnya2.s = jenisPekerjaanDialog2;
                chooselainnya2.e(jenisPekerjaanDialog2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCornerRadiusResource(int i2) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f) {
        setElevation(f);
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            this.t.b(false).l(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(Drawable drawable) {
        if (this.e != drawable) {
            this.e = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconGravity(int i2) {
        if (this.m != i2) {
            this.m = i2;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconPadding(int i2) {
        if (this.k != i2) {
            this.k = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? setPrimaryBackground.c(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.a != i2) {
            this.a = i2;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.n != mode) {
            this.n = mode;
            d(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconTintResource(int i2) {
        setIconTint(setPrimaryBackground.b(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        chooseLainnya chooselainnya = this.t;
        chooselainnya.b(chooselainnya.m, i2);
    }

    public void setInsetTop(int i2) {
        chooseLainnya chooselainnya = this.t;
        chooselainnya.b(i2, chooselainnya.g);
    }

    public void setPressed(boolean z) {
        write write2 = this.b;
        if (write2 != null) {
            write2.a();
        }
        setPressed(z);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v21, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v25, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    public void setRippleColor(ColorStateList colorStateList) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            if (chooselainnya2.f59o != colorStateList) {
                chooselainnya2.f59o = colorStateList;
                boolean z = chooseLainnya.b;
                if (z && (chooselainnya2.l.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) chooselainnya2.l.getBackground()).setColor(InfoDialog_ViewBinding.d(colorStateList));
                } else if (!z && (chooselainnya2.l.getBackground() instanceof InfoNegaraORDialog)) {
                    ((InfoNegaraORDialog) chooselainnya2.l.getBackground()).setTintList(InfoDialog_ViewBinding.d(colorStateList));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRippleColorResource(int i2) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            setRippleColor(setPrimaryBackground.b(getContext(), i2));
        }
    }

    @Override // o.KategoriTujuanTransaksiORDialog
    public void setShapeAppearanceModel(JenisPekerjaanDialog jenisPekerjaanDialog) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            chooselainnya2.s = jenisPekerjaanDialog;
            chooselainnya2.e(jenisPekerjaanDialog);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            if (chooselainnya2.q != colorStateList) {
                chooselainnya2.q = colorStateList;
                chooselainnya2.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColorResource(int i2) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            setStrokeColor(setPrimaryBackground.b(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            if (chooselainnya2.t != i2) {
                chooselainnya2.t = i2;
                chooselainnya2.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidthResource(int i2) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            if (chooselainnya2.c != colorStateList) {
                chooselainnya2.c = colorStateList;
                if (chooselainnya2.b(false) != null) {
                    getInsetsForType.e(chooselainnya2.b(false), chooselainnya2.c);
                    return;
                }
                return;
            }
            return;
        }
        setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        chooseLainnya chooselainnya = this.t;
        if (chooselainnya != null && !chooselainnya.d) {
            chooseLainnya chooselainnya2 = this.t;
            if (chooselainnya2.e != mode) {
                chooselainnya2.e = mode;
                if (chooselainnya2.b(false) != null && chooselainnya2.e != null) {
                    getInsetsForType.d(chooselainnya2.b(false), chooselainnya2.e);
                    return;
                }
                return;
            }
            return;
        }
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f);
    }
}
