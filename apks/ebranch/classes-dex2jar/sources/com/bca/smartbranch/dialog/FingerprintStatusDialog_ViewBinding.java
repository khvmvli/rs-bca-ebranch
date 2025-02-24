package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FingerprintStatusDialog_ViewBinding.class */
public class FingerprintStatusDialog_ViewBinding implements Unbinder {
    private View d;
    private FingerprintStatusDialog e;

    public FingerprintStatusDialog_ViewBinding(final FingerprintStatusDialog fingerprintStatusDialog, View view) {
        this.e = fingerprintStatusDialog;
        fingerprintStatusDialog.ivFingerprint = (ImageView) Utils.findRequiredViewAsType(view, 2131297361, "field 'ivFingerprint'", ImageView.class);
        fingerprintStatusDialog.tvFingerprintStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299259, "field 'tvFingerprintStatus'", TextView.class);
        fingerprintStatusDialog.tvFingerprintStatusDescription = (TextView) Utils.findRequiredViewAsType(view, 2131299260, "field 'tvFingerprintStatusDescription'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'clickedOk'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FingerprintStatusDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fingerprintStatusDialog.clickedOk(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FingerprintStatusDialog fingerprintStatusDialog = this.e;
        if (fingerprintStatusDialog != null) {
            this.e = null;
            fingerprintStatusDialog.ivFingerprint = null;
            fingerprintStatusDialog.tvFingerprintStatus = null;
            fingerprintStatusDialog.tvFingerprintStatusDescription = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
