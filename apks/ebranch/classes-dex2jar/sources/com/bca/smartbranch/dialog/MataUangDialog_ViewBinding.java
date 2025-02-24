package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/MataUangDialog_ViewBinding.class */
public class MataUangDialog_ViewBinding implements Unbinder {
    private MataUangDialog d;

    public MataUangDialog_ViewBinding(MataUangDialog mataUangDialog, View view) {
        this.d = mataUangDialog;
        mataUangDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        mataUangDialog.lvContent = (ListView) Utils.findRequiredViewAsType(view, 2131297975, "field 'lvContent'", ListView.class);
        Resources resources = view.getContext().getResources();
        mataUangDialog.mataUang = resources.getStringArray(2130903077);
        mataUangDialog.title = resources.getString(2131822235);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MataUangDialog mataUangDialog = this.d;
        if (mataUangDialog != null) {
            this.d = null;
            mataUangDialog.tvTitle = null;
            mataUangDialog.lvContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
