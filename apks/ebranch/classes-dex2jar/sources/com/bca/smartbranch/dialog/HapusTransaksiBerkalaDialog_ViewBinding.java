package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HapusTransaksiBerkalaDialog_ViewBinding.class */
public class HapusTransaksiBerkalaDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private HapusTransaksiBerkalaDialog c;
    private View d;

    public HapusTransaksiBerkalaDialog_ViewBinding(final HapusTransaksiBerkalaDialog hapusTransaksiBerkalaDialog, View view) {
        super(hapusTransaksiBerkalaDialog, view);
        this.c = hapusTransaksiBerkalaDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HapusTransaksiBerkalaDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaDialog.clickedYes();
            }
        });
        Resources resources = view.getContext().getResources();
        hapusTransaksiBerkalaDialog.title = resources.getString(2131822180);
        hapusTransaksiBerkalaDialog.desc = resources.getString(2131821604);
        hapusTransaksiBerkalaDialog.yes = resources.getString(2131822353);
        hapusTransaksiBerkalaDialog.no = resources.getString(2131822169);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.c != null) {
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
