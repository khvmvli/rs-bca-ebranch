package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BaseKonfirmasiDialog_ViewBinding.class */
public class BaseKonfirmasiDialog_ViewBinding implements Unbinder {
    private View c;
    private View d;
    private BaseKonfirmasiDialog e;

    public BaseKonfirmasiDialog_ViewBinding(final BaseKonfirmasiDialog baseKonfirmasiDialog, View view) {
        this.e = baseKonfirmasiDialog;
        baseKonfirmasiDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        baseKonfirmasiDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296416, "field 'btnNo' and method 'clickedNo'");
        baseKonfirmasiDialog.btnNo = (Button) Utils.castView(findRequiredView, 2131296416, "field 'btnNo'", Button.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                baseKonfirmasiDialog.clickedNo();
            }
        });
        baseKonfirmasiDialog.btnYes = (Button) Utils.findRequiredViewAsType(view, 2131296462, "field 'btnYes'", Button.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                baseKonfirmasiDialog.close();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseKonfirmasiDialog baseKonfirmasiDialog = this.e;
        if (baseKonfirmasiDialog != null) {
            this.e = null;
            baseKonfirmasiDialog.tvTitle = null;
            baseKonfirmasiDialog.tvDesc = null;
            baseKonfirmasiDialog.btnNo = null;
            baseKonfirmasiDialog.btnYes = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
