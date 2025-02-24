package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailDaftarTransferORActivity_ViewBinding.class */
public class DetailDaftarTransferORActivity_ViewBinding implements Unbinder {
    private View a;
    private DetailDaftarTransferORActivity b;
    private View d;

    public DetailDaftarTransferORActivity_ViewBinding(final DetailDaftarTransferORActivity detailDaftarTransferORActivity, View view) {
        this.b = detailDaftarTransferORActivity;
        detailDaftarTransferORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailDaftarTransferORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailDaftarTransferORActivity.etBankTujuan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296948, "field 'etBankTujuan'", LogoutDialog.class);
        detailDaftarTransferORActivity.etNegaraPenerima = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297088, "field 'etNegaraPenerima'", LogoutDialog.class);
        detailDaftarTransferORActivity.etNomorRekening = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297128, "field 'etNomorRekening'", LogoutDialog.class);
        detailDaftarTransferORActivity.etNamaPemilik = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297065, "field 'etNamaPemilik'", LogoutDialog.class);
        detailDaftarTransferORActivity.etAlamatLengkap = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296932, "field 'etAlamatLengkap'", LogoutDialog.class);
        detailDaftarTransferORActivity.etKotaPenerima = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297038, "field 'etKotaPenerima'", LogoutDialog.class);
        detailDaftarTransferORActivity.etTipeNasabahPenerima = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297210, "field 'etTipeNasabahPenerima'", LogoutDialog.class);
        detailDaftarTransferORActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        detailDaftarTransferORActivity.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298673, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296457, "method 'ubah'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferORActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailDaftarTransferORActivity.ubah();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296389, "method 'hapus'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferORActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailDaftarTransferORActivity.hapus();
            }
        });
        Resources resources = view.getContext().getResources();
        detailDaftarTransferORActivity.toolbarTitle = resources.getString(2131821438);
        detailDaftarTransferORActivity.retry = resources.getString(2131822092);
        detailDaftarTransferORActivity.hintNoIban = resources.getString(2131821181);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailDaftarTransferORActivity detailDaftarTransferORActivity = this.b;
        if (detailDaftarTransferORActivity != null) {
            this.b = null;
            detailDaftarTransferORActivity.toolbar = null;
            detailDaftarTransferORActivity.txtToolbarTitle = null;
            detailDaftarTransferORActivity.etBankTujuan = null;
            detailDaftarTransferORActivity.etNegaraPenerima = null;
            detailDaftarTransferORActivity.etNomorRekening = null;
            detailDaftarTransferORActivity.etNamaPemilik = null;
            detailDaftarTransferORActivity.etAlamatLengkap = null;
            detailDaftarTransferORActivity.etKotaPenerima = null;
            detailDaftarTransferORActivity.etTipeNasabahPenerima = null;
            detailDaftarTransferORActivity.lnMain = null;
            detailDaftarTransferORActivity.tilNorek = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
