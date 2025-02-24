package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/InfoCaraPembayaranDialog_ViewBinding.class */
public class InfoCaraPembayaranDialog_ViewBinding implements Unbinder {
    private View d;
    private InfoCaraPembayaranDialog e;

    public InfoCaraPembayaranDialog_ViewBinding(final InfoCaraPembayaranDialog infoCaraPembayaranDialog, View view) {
        this.e = infoCaraPembayaranDialog;
        infoCaraPembayaranDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        infoCaraPembayaranDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.InfoCaraPembayaranDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                infoCaraPembayaranDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        infoCaraPembayaranDialog.caraBayar = resources.getStringArray(2130903043);
        infoCaraPembayaranDialog.labelValue = resources.getString(2131821617);
        infoCaraPembayaranDialog.title = resources.getString(2131821716);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoCaraPembayaranDialog infoCaraPembayaranDialog = this.e;
        if (infoCaraPembayaranDialog != null) {
            this.e = null;
            infoCaraPembayaranDialog.tvTitle = null;
            infoCaraPembayaranDialog.tvDesc = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
