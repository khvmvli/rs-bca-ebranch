package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.global.Reservation;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AktivasiMBCAKlikBCAActivity.class */
public class AktivasiMBCAKlikBCAActivity extends BaseActivityPostLogin {
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298440)
    ToggleButton tbAktivasiKlikBCA;
    @BindView(2131298441)
    ToggleButton tbAktivasiMBCA;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbar;

    @OnClick({2131296396})
    public void clickedLanjut(View view) {
        if (this.tbAktivasiKlikBCA.isChecked() || this.tbAktivasiMBCA.isChecked()) {
            if (this.m != null) {
                this.m.getEmail();
            }
            if (this.m != null) {
                this.m.getSessionId();
            }
            if (this.m != null) {
                this.m.getImei();
            }
            String str = "";
            String string = this.tbAktivasiKlikBCA.isChecked() ? getResources().getString(2131821292) : "";
            if (this.tbAktivasiMBCA.isChecked()) {
                str = getResources().getString(2131821293);
            }
            Reservation reservation = new Reservation();
            reservation.setTxnType("Transaksi CS");
            reservation.setTypeTransaction(string);
            reservation.setTypeTransaction2(str);
            reservation.setTypeReservation("NEW_RESERVATION");
            Intent intent = new Intent(this, BranchMapActivity.class);
            intent.putExtra("reff_no", reservation.getNoReff());
            intent.putExtra("type_transaksi", reservation.getTypeTransaction());
            intent.putExtra("type_reservation", reservation.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
            startActivity(intent);
            return;
        }
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, "Aktivasi KlikBCA atau m-BCA belum dipilih", -1).g();
    }

    @OnClick({2131298811})
    public void clikedAktivasiKlikBCA(View view) {
        ToggleButton toggleButton = this.tbAktivasiKlikBCA;
        toggleButton.setChecked(!toggleButton.isChecked());
    }

    @OnClick({2131298812})
    public void clikedAktivasiMBCA(View view) {
        ToggleButton toggleButton = this.tbAktivasiMBCA;
        toggleButton.setChecked(!toggleButton.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText(2131822195);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "AktivasiMBCAKlikBCAActivity";
        this.j = "AktivasiMBCAKlikBCAActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492893;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
