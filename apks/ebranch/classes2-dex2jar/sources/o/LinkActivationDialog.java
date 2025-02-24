package o;

import android.content.Context;
/* loaded from: classes2-dex2jar.jar:o/LinkActivationDialog.class */
abstract class LinkActivationDialog {
    LogoutDialog_ViewBinding k;
    Context m;
    clickedOk n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkActivationDialog(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        this.k = logoutDialog_ViewBinding;
        this.m = logoutDialog_ViewBinding.getContext();
        this.n = logoutDialog_ViewBinding.l;
    }

    boolean a() {
        return false;
    }

    abstract void d();

    void e(boolean z) {
    }

    boolean e(int i) {
        return true;
    }
}
