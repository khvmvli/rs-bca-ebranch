package o;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/chooseTypeKtp.class */
final class chooseTypeKtp extends LinkActivationDialog {
    chooseTypeKtp(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        super(logoutDialog_ViewBinding);
    }

    @Override // o.LinkActivationDialog
    final void d() {
        this.k.setEndIconOnClickListener((View.OnClickListener) null);
        this.k.setEndIconDrawable((Drawable) null);
        this.k.setEndIconContentDescription((CharSequence) null);
    }
}
