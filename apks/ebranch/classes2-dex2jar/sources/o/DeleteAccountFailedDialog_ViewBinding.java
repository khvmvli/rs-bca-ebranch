package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/DeleteAccountFailedDialog_ViewBinding.class */
public final class DeleteAccountFailedDialog_ViewBinding {
    private final JenisPekerjaanDialog a;
    private final ColorStateList b;
    private final ColorStateList c;
    final Rect d;
    private final int e;
    private final ColorStateList j;

    private DeleteAccountFailedDialog_ViewBinding(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, JenisPekerjaanDialog jenisPekerjaanDialog, Rect rect) {
        if (rect.left < 0) {
            throw new IllegalArgumentException();
        } else if (rect.top < 0) {
            throw new IllegalArgumentException();
        } else if (rect.right < 0) {
            throw new IllegalArgumentException();
        } else if (rect.bottom >= 0) {
            this.d = rect;
            this.j = colorStateList2;
            this.b = colorStateList;
            this.c = colorStateList3;
            this.e = i;
            this.a = jenisPekerjaanDialog;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static DeleteAccountFailedDialog_ViewBinding a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, BaseDialogKotlin$MediaSessionCompat$Token.dw);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(BaseDialogKotlin$MediaSessionCompat$Token.dx, 0), obtainStyledAttributes.getDimensionPixelOffset(BaseDialogKotlin$MediaSessionCompat$Token.dD, 0), obtainStyledAttributes.getDimensionPixelOffset(BaseDialogKotlin$MediaSessionCompat$Token.dA, 0), obtainStyledAttributes.getDimensionPixelOffset(BaseDialogKotlin$MediaSessionCompat$Token.dy, 0));
            ColorStateList c = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.dF);
            ColorStateList c2 = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.dK);
            ColorStateList c3 = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.dE);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.dJ, 0);
            JenisPekerjaanDialog jenisPekerjaanDialog = new JenisPekerjaanDialog(JenisPekerjaanDialog.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dC, 0), obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dB, 0), new InfoTarikanDialog_ViewBinding(0.0f)), (byte) 0);
            obtainStyledAttributes.recycle();
            return new DeleteAccountFailedDialog_ViewBinding(c, c2, c3, dimensionPixelSize, jenisPekerjaanDialog, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public final void e(TextView textView) {
        JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog();
        JenisKodeBankDialog jenisKodeBankDialog2 = new JenisKodeBankDialog();
        jenisKodeBankDialog.setShapeAppearanceModel(this.a);
        jenisKodeBankDialog2.setShapeAppearanceModel(this.a);
        jenisKodeBankDialog.c(this.b);
        jenisKodeBankDialog.c((float) this.e, this.c);
        textView.setTextColor(this.j);
        findFragmentByWho.b(textView, new InsetDrawable((Drawable) new RippleDrawable(this.j.withAlpha(30), jenisKodeBankDialog, jenisKodeBankDialog2), this.d.left, this.d.top, this.d.right, this.d.bottom));
    }
}
