package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HubunganDialog_ViewBinding.class */
public class HubunganDialog_ViewBinding implements Unbinder {
    private HubunganDialog a;

    public HubunganDialog_ViewBinding(HubunganDialog hubunganDialog, View view) {
        this.a = hubunganDialog;
        hubunganDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        hubunganDialog.lvContent = (ListView) Utils.findRequiredViewAsType(view, 2131297975, "field 'lvContent'", ListView.class);
        hubunganDialog.title = view.getContext().getResources().getString(2131822211);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        HubunganDialog hubunganDialog = this.a;
        if (hubunganDialog != null) {
            this.a = null;
            hubunganDialog.tvTitle = null;
            hubunganDialog.lvContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
