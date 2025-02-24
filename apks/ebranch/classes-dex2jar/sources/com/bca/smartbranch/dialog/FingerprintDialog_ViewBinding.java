package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FingerprintDialog_ViewBinding.class */
public class FingerprintDialog_ViewBinding implements Unbinder {
    private FingerprintDialog b;
    private View e;

    public FingerprintDialog_ViewBinding(final FingerprintDialog fingerprintDialog, View view) {
        this.b = fingerprintDialog;
        fingerprintDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        fingerprintDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        fingerprintDialog.ivFailed = (ImageView) Utils.findRequiredViewAsType(view, 2131297360, "field 'ivFailed'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'clickedBatal'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FingerprintDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fingerprintDialog.clickedBatal(view2);
            }
        });
        fingerprintDialog.fingerprintNotRecognized = view.getContext().getResources().getString(2131820795);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FingerprintDialog fingerprintDialog = this.b;
        if (fingerprintDialog != null) {
            this.b = null;
            fingerprintDialog.tvTitle = null;
            fingerprintDialog.tvContent = null;
            fingerprintDialog.ivFailed = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
