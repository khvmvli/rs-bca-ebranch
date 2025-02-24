package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/StatusTempatTinggalDialog_ViewBinding.class */
public class StatusTempatTinggalDialog_ViewBinding implements Unbinder {
    private StatusTempatTinggalDialog d;

    public StatusTempatTinggalDialog_ViewBinding(StatusTempatTinggalDialog statusTempatTinggalDialog, View view) {
        this.d = statusTempatTinggalDialog;
        statusTempatTinggalDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        statusTempatTinggalDialog.lvContent = (ListView) Utils.findRequiredViewAsType(view, 2131297975, "field 'lvContent'", ListView.class);
        Resources resources = view.getContext().getResources();
        statusTempatTinggalDialog.data = resources.getStringArray(2130903093);
        statusTempatTinggalDialog.title = resources.getString(2131822270);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        StatusTempatTinggalDialog statusTempatTinggalDialog = this.d;
        if (statusTempatTinggalDialog != null) {
            this.d = null;
            statusTempatTinggalDialog.tvTitle = null;
            statusTempatTinggalDialog.lvContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
