package o;

import android.text.Editable;
import android.text.TextWatcher;
/* loaded from: classes2-dex2jar.jar:o/LogoutDialog_ViewBinding$5.class */
final class LogoutDialog_ViewBinding$5 implements TextWatcher {
    final /* synthetic */ LogoutDialog_ViewBinding c;

    LogoutDialog_ViewBinding$5(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        this.c = logoutDialog_ViewBinding;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.c;
        logoutDialog_ViewBinding.b(!logoutDialog_ViewBinding.v, false);
        if (this.c.a) {
            this.c.c(editable.length());
        }
        if (this.c.w) {
            this.c.a(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
