package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailDaftarTransferActivity_ViewBinding.class */
public class DetailDaftarTransferActivity_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private DetailDaftarTransferActivity d;
    private View e;

    public DetailDaftarTransferActivity_ViewBinding(final DetailDaftarTransferActivity detailDaftarTransferActivity, View view) {
        this.d = detailDaftarTransferActivity;
        detailDaftarTransferActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailDaftarTransferActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailDaftarTransferActivity.etNamaPemilik = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297065, "field 'etNamaPemilik'", LogoutDialog.class);
        detailDaftarTransferActivity.etKeterangan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297017, "field 'etKeterangan'", LogoutDialog.class);
        detailDaftarTransferActivity.etNomorRekening = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297128, "field 'etNomorRekening'", LogoutDialog.class);
        detailDaftarTransferActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299724, "field 'tvUbahKeterangan' and method 'ubahKeterangan'");
        detailDaftarTransferActivity.tvUbahKeterangan = (TextView) Utils.castView(findRequiredView, 2131299724, "field 'tvUbahKeterangan'", TextView.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailDaftarTransferActivity.ubahKeterangan();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296457, "method 'ubah'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailDaftarTransferActivity.ubah();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296389, "method 'hapus'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailDaftarTransferActivity.hapus();
            }
        });
        Resources resources = view.getContext().getResources();
        detailDaftarTransferActivity.toolbarTitle = resources.getString(2131821438);
        detailDaftarTransferActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailDaftarTransferActivity detailDaftarTransferActivity = this.d;
        if (detailDaftarTransferActivity != null) {
            this.d = null;
            detailDaftarTransferActivity.toolbar = null;
            detailDaftarTransferActivity.txtToolbarTitle = null;
            detailDaftarTransferActivity.etNamaPemilik = null;
            detailDaftarTransferActivity.etKeterangan = null;
            detailDaftarTransferActivity.etNomorRekening = null;
            detailDaftarTransferActivity.lnMain = null;
            detailDaftarTransferActivity.tvUbahKeterangan = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
