package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/GuestWarningDialog_ViewBinding.class */
public class GuestWarningDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private GuestWarningDialog c;
    private View e;

    public GuestWarningDialog_ViewBinding(final GuestWarningDialog guestWarningDialog, View view) {
        this.c = guestWarningDialog;
        guestWarningDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.GuestWarningDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                guestWarningDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296449, "method 'signup'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.GuestWarningDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                guestWarningDialog.signup();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.GuestWarningDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                guestWarningDialog.lanjut();
            }
        });
        guestWarningDialog.guestWarningDesc = view.getContext().getResources().getString(2131821688);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        GuestWarningDialog guestWarningDialog = this.c;
        if (guestWarningDialog != null) {
            this.c = null;
            guestWarningDialog.tvDesc = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
