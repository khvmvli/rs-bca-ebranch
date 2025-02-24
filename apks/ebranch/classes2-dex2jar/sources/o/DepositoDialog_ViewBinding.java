package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* loaded from: classes2-dex2jar.jar:o/DepositoDialog_ViewBinding.class */
final class DepositoDialog_ViewBinding {
    final DeleteAccountFailedDialog_ViewBinding a;
    final DeleteAccountFailedDialog_ViewBinding b;
    final DeleteAccountFailedDialog_ViewBinding c;
    final Paint d;
    final DeleteAccountFailedDialog_ViewBinding e;
    final DeleteAccountFailedDialog_ViewBinding g;
    final DeleteAccountFailedDialog_ViewBinding h;
    final DeleteAccountFailedDialog_ViewBinding j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DepositoDialog_ViewBinding(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(HubunganDialog_ViewBinding.c(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.B, DeleteAccountSuccessDialog_ViewBinding.class.getCanonicalName()), BaseDialogKotlin$MediaSessionCompat$Token.dz);
        this.c = DeleteAccountFailedDialog_ViewBinding.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dG, 0));
        this.b = DeleteAccountFailedDialog_ViewBinding.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dH, 0));
        this.e = DeleteAccountFailedDialog_ViewBinding.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dI, 0));
        this.j = DeleteAccountFailedDialog_ViewBinding.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dM, 0));
        ColorStateList c = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.dN);
        this.h = DeleteAccountFailedDialog_ViewBinding.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dL, 0));
        this.a = DeleteAccountFailedDialog_ViewBinding.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dO, 0));
        this.g = DeleteAccountFailedDialog_ViewBinding.a(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.dP, 0));
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(c.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
