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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailDaftarTransferBTActivity_ViewBinding.class */
public class DetailDaftarTransferBTActivity_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private DetailDaftarTransferBTActivity d;

    public DetailDaftarTransferBTActivity_ViewBinding(final DetailDaftarTransferBTActivity detailDaftarTransferBTActivity, View view) {
        this.d = detailDaftarTransferBTActivity;
        detailDaftarTransferBTActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailDaftarTransferBTActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailDaftarTransferBTActivity.etNomorRekening = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297128, "field 'etNomorRekening'", LogoutDialog.class);
        detailDaftarTransferBTActivity.etNamaPenerima = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297066, "field 'etNamaPenerima'", LogoutDialog.class);
        detailDaftarTransferBTActivity.etBankTujuan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296948, "field 'etBankTujuan'", LogoutDialog.class);
        detailDaftarTransferBTActivity.etAlamatLengkap = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296932, "field 'etAlamatLengkap'", LogoutDialog.class);
        detailDaftarTransferBTActivity.etTipeNasabahPenerima = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297210, "field 'etTipeNasabahPenerima'", LogoutDialog.class);
        detailDaftarTransferBTActivity.etStatusPenduduk = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297217, "field 'etStatusPenduduk'", LogoutDialog.class);
        detailDaftarTransferBTActivity.etkewarganegaraan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297018, "field 'etkewarganegaraan'", LogoutDialog.class);
        detailDaftarTransferBTActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        detailDaftarTransferBTActivity.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298673, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296457, "method 'ubah'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferBTActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailDaftarTransferBTActivity.ubah();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296389, "method 'hapus'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferBTActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailDaftarTransferBTActivity.hapus();
            }
        });
        Resources resources = view.getContext().getResources();
        detailDaftarTransferBTActivity.toolbarTitle = resources.getString(2131821438);
        detailDaftarTransferBTActivity.retry = resources.getString(2131822092);
        detailDaftarTransferBTActivity.hintNoIban = resources.getString(2131821181);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailDaftarTransferBTActivity detailDaftarTransferBTActivity = this.d;
        if (detailDaftarTransferBTActivity != null) {
            this.d = null;
            detailDaftarTransferBTActivity.toolbar = null;
            detailDaftarTransferBTActivity.txtToolbarTitle = null;
            detailDaftarTransferBTActivity.etNomorRekening = null;
            detailDaftarTransferBTActivity.etNamaPenerima = null;
            detailDaftarTransferBTActivity.etBankTujuan = null;
            detailDaftarTransferBTActivity.etAlamatLengkap = null;
            detailDaftarTransferBTActivity.etTipeNasabahPenerima = null;
            detailDaftarTransferBTActivity.etStatusPenduduk = null;
            detailDaftarTransferBTActivity.etkewarganegaraan = null;
            detailDaftarTransferBTActivity.lnMain = null;
            detailDaftarTransferBTActivity.tilNorek = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
