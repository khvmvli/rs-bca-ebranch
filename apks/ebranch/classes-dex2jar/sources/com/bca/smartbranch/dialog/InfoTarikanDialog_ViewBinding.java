package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/InfoTarikanDialog_ViewBinding.class */
public class InfoTarikanDialog_ViewBinding implements Unbinder {
    private InfoTarikanDialog b;
    private View e;

    public InfoTarikanDialog_ViewBinding(final InfoTarikanDialog infoTarikanDialog, View view) {
        this.b = infoTarikanDialog;
        infoTarikanDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        infoTarikanDialog.tvInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299282, "field 'tvInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'lanjut'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.InfoTarikanDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                infoTarikanDialog.lanjut();
            }
        });
        Resources resources = view.getContext().getResources();
        infoTarikanDialog.labelValue = resources.getString(2131821625);
        infoTarikanDialog.labelInfo = resources.getString(2131822075);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoTarikanDialog infoTarikanDialog = this.b;
        if (infoTarikanDialog != null) {
            this.b = null;
            infoTarikanDialog.tvContent = null;
            infoTarikanDialog.tvInfo = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
