package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HapusDaftarTransferDialog_ViewBinding.class */
public class HapusDaftarTransferDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private HapusDaftarTransferDialog a;
    private View b;

    public HapusDaftarTransferDialog_ViewBinding(final HapusDaftarTransferDialog hapusDaftarTransferDialog, View view) {
        super(hapusDaftarTransferDialog, view);
        this.a = hapusDaftarTransferDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HapusDaftarTransferDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusDaftarTransferDialog.clickedYes();
            }
        });
        Resources resources = view.getContext().getResources();
        hapusDaftarTransferDialog.title = resources.getString(2131822179);
        hapusDaftarTransferDialog.desc = resources.getString(2131821603);
        hapusDaftarTransferDialog.yes = resources.getString(2131822353);
        hapusDaftarTransferDialog.no = resources.getString(2131822169);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.a != null) {
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
