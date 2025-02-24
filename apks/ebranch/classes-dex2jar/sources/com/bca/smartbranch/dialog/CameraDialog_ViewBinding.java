package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CameraDialog_ViewBinding.class */
public class CameraDialog_ViewBinding implements Unbinder {
    private View d;
    private CameraDialog e;

    public CameraDialog_ViewBinding(final CameraDialog cameraDialog, View view) {
        this.e = cameraDialog;
        cameraDialog.rgCamera = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298213, "field 'rgCamera'", RadioGroup.class);
        cameraDialog.rbAmbilDariGaleri = (RadioButton) Utils.findRequiredViewAsType(view, 2131298134, "field 'rbAmbilDariGaleri'", RadioButton.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'onClickClose'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CameraDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cameraDialog.onClickClose(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CameraDialog cameraDialog = this.e;
        if (cameraDialog != null) {
            this.e = null;
            cameraDialog.rgCamera = null;
            cameraDialog.rbAmbilDariGaleri = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
