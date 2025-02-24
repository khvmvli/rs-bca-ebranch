package o;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/LinkUbahPINDialog_ViewBinding.class */
final class LinkUbahPINDialog_ViewBinding extends LinkActivationDialog {
    final TextWatcher b = new GuestWarningWebViewDialog() { // from class: o.LinkUbahPINDialog_ViewBinding.4
        @Override // o.GuestWarningWebViewDialog, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LinkUbahPINDialog_ViewBinding.this.n.setChecked(!LinkUbahPINDialog_ViewBinding.b(LinkUbahPINDialog_ViewBinding.this));
        }
    };
    private final LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver d = new LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.LinkUbahPINDialog_ViewBinding.5
        @Override // o.LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
        public final void b(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
            EditText editText = logoutDialog_ViewBinding.f;
            logoutDialog_ViewBinding.setEndIconVisible(true);
            logoutDialog_ViewBinding.setEndIconCheckable(true);
            LinkUbahPINDialog_ViewBinding.this.n.setChecked(true ^ LinkUbahPINDialog_ViewBinding.b(LinkUbahPINDialog_ViewBinding.this));
            editText.removeTextChangedListener(LinkUbahPINDialog_ViewBinding.this.b);
            editText.addTextChangedListener(LinkUbahPINDialog_ViewBinding.this.b);
        }
    };
    private final LogoutDialog_ViewBinding$RemoteActionCompatParcelizer a = new LogoutDialog_ViewBinding$RemoteActionCompatParcelizer() { // from class: o.LinkUbahPINDialog_ViewBinding.2
        @Override // o.LogoutDialog_ViewBinding$RemoteActionCompatParcelizer
        public final void d(LogoutDialog_ViewBinding logoutDialog_ViewBinding, int i) {
            final EditText editText = logoutDialog_ViewBinding.f;
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new Runnable() { // from class: o.LinkUbahPINDialog_ViewBinding.2.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        editText.removeTextChangedListener(LinkUbahPINDialog_ViewBinding.this.b);
                    }
                });
            }
        }
    };

    LinkUbahPINDialog_ViewBinding(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        super(logoutDialog_ViewBinding);
    }

    static /* synthetic */ boolean b(LinkUbahPINDialog_ViewBinding linkUbahPINDialog_ViewBinding) {
        EditText editText = linkUbahPINDialog_ViewBinding.k.f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // o.LinkActivationDialog
    final void d() {
        this.k.setEndIconDrawable(setPrimaryBackground.c(this.m, BaseDialogKotlin.IconCompatParcelizer.c));
        this.k.setEndIconContentDescription(this.k.getResources().getText(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.z));
        this.k.setEndIconOnClickListener(new View.OnClickListener() { // from class: o.LinkUbahPINDialog_ViewBinding.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText = LinkUbahPINDialog_ViewBinding.this.k.f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (LinkUbahPINDialog_ViewBinding.b(LinkUbahPINDialog_ViewBinding.this)) {
                        editText.setTransformationMethod(null);
                    } else {
                        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        editText.setSelection(selectionEnd);
                    }
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding = LinkUbahPINDialog_ViewBinding.this.k;
                    logoutDialog_ViewBinding.d(logoutDialog_ViewBinding.l, logoutDialog_ViewBinding.k);
                }
            }
        });
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.k;
        LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = this.d;
        logoutDialog_ViewBinding.o.add(logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        if (logoutDialog_ViewBinding.f != null) {
            logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding);
        }
        this.k.n.add(this.a);
        EditText editText = this.k.f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
