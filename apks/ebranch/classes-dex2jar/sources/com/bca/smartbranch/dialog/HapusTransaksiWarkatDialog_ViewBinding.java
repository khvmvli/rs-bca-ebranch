package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HapusTransaksiWarkatDialog_ViewBinding.class */
public class HapusTransaksiWarkatDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private HapusTransaksiWarkatDialog d;
    private View e;

    public HapusTransaksiWarkatDialog_ViewBinding(final HapusTransaksiWarkatDialog hapusTransaksiWarkatDialog, View view) {
        super(hapusTransaksiWarkatDialog, view);
        this.d = hapusTransaksiWarkatDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HapusTransaksiWarkatDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiWarkatDialog.clickedYes();
            }
        });
        Resources resources = view.getContext().getResources();
        hapusTransaksiWarkatDialog.yes = resources.getString(2131822353);
        hapusTransaksiWarkatDialog.no = resources.getString(2131822169);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.d != null) {
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
