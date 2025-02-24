package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FingerprintSuccessDialog_ViewBinding.class */
public class FingerprintSuccessDialog_ViewBinding implements Unbinder {
    private View a;
    private FingerprintSuccessDialog b;

    public FingerprintSuccessDialog_ViewBinding(final FingerprintSuccessDialog fingerprintSuccessDialog, View view) {
        this.b = fingerprintSuccessDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'clickedBatal'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FingerprintSuccessDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fingerprintSuccessDialog.clickedBatal(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.b != null) {
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
