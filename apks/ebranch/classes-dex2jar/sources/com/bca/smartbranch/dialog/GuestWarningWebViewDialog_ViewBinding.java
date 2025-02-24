package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/GuestWarningWebViewDialog_ViewBinding.class */
public class GuestWarningWebViewDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private GuestWarningWebViewDialog c;
    private View e;

    public GuestWarningWebViewDialog_ViewBinding(final GuestWarningWebViewDialog guestWarningWebViewDialog, View view) {
        this.c = guestWarningWebViewDialog;
        guestWarningWebViewDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.GuestWarningWebViewDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                guestWarningWebViewDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296449, "method 'signup'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.GuestWarningWebViewDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                guestWarningWebViewDialog.signup();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296460, "method 'aksesViaWeb'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.GuestWarningWebViewDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                guestWarningWebViewDialog.aksesViaWeb();
            }
        });
        guestWarningWebViewDialog.guestWarningDesc = view.getContext().getResources().getString(2131821689);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        GuestWarningWebViewDialog guestWarningWebViewDialog = this.c;
        if (guestWarningWebViewDialog != null) {
            this.c = null;
            guestWarningWebViewDialog.tvDesc = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
