package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormSuccessActivity;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.ReservasiCSDialog;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import o.CategoryListAdapter$CategoryListVH;
import o.ListUtil;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickJenisIdentitasPemilikSumberDana;
import o.documentProvider;
import o.setCardSlogan;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormSuccessActivity.class */
public class FormSuccessActivity extends BaseActivityPostLogin {
    private ActivateEChannelResponse.TxnDataOutput f;
    @BindView(2131297766)
    LinearLayout llMain;
    private AccountOpeningResponse n;
    private String p;
    private String q;
    private String r;
    private long s;
    private boolean t;
    @BindView(2131299689)
    TextView tvTransaksi;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0150, code lost:
        if (r0.equals("Tahapan BCA") != false) goto L_0x0159;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void t() {
        /*
        // Method dump skipped, instructions count: 521
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormSuccessActivity.t():void");
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
    }

    @OnClick({2131296396})
    public void onClickLanjut(View view) {
        if (this.t) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.subscribeUbahBCACardEvent
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    FormSuccessActivity.this.s();
                }
            });
            documentProvider.b().d(new clickJenisIdentitasPemilikSumberDana());
            finish();
        } else if (this.m != null) {
            Bundle bundle = new Bundle();
            bundle.putString("product", this.q);
            ReservasiCSDialog reservasiCSDialog = new ReservasiCSDialog();
            reservasiCSDialog.setArguments(bundle);
            reservasiCSDialog.show(l(), "ReservasiCSDialog");
        } else {
            t();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onReservasiCSEvent(CategoryListAdapter$CategoryListVH categoryListAdapter$CategoryListVH) {
        if (!categoryListAdapter$CategoryListVH.c) {
            t();
            return;
        }
        Reservation reservation = new Reservation();
        reservation.setTypeTransaction(this.q);
        reservation.setTxnType(this.q);
        reservation.setTypeReservation("NEW_RESERVATION");
        String str = this.q;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -748993769:
                if (str.equals("Tahapan BCA")) {
                    c = 0;
                    break;
                }
                break;
            case -632361194:
                if (str.equals("Internet/Mobile Banking")) {
                    c = 1;
                    break;
                }
                break;
            case -245309302:
                if (str.equals("Tahapan Xpresi")) {
                    c = 2;
                    break;
                }
                break;
            case 164545469:
                if (str.equals("Tapres BCA")) {
                    c = 3;
                    break;
                }
                break;
            case 1076132060:
                if (str.equals("BCA Dollar")) {
                    c = 4;
                    break;
                }
                break;
            case 1269943660:
                if (str.equals("Tahapan Berjangka")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("1");
            reservation.setTransactionCode(ReservasiOnline.PEMBUKAAN_REKENING);
        } else if (c == 1) {
            reservation.setNoReff(this.f.getNoReff());
            reservation.setTnxStatus("7");
            reservation.setTransactionCode(ReservasiOnline.INTERNET_MOBILE_BANKING);
        } else if (c == 2) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("2");
            reservation.setTransactionCode(ReservasiOnline.PEMBUKAAN_REKENING);
        } else if (c == 3) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("3");
            reservation.setTransactionCode(ReservasiOnline.PEMBUKAAN_REKENING);
        } else if (c == 4) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("4");
            reservation.setTransactionCode(ReservasiOnline.PEMBUKAAN_REKENING);
        } else if (c == 5) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("5");
            reservation.setTransactionCode(ReservasiOnline.PEMBUKAAN_REKENING);
        }
        Intent intent = new Intent(this, BranchMapActivity.class);
        intent.putExtra("reff_no", reservation.getNoReff());
        intent.putExtra("type_transaksi", reservation.getTypeTransaction());
        intent.putExtra("type_reservation", reservation.getTypeReservation());
        intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "FormSuccessActivity";
        this.j = "FormSuccessActivity";
        Bundle extras = getIntent().getExtras();
        this.q = extras.getString("Transaction_name", "");
        this.r = extras.getString("email", "");
        this.t = extras.getBoolean("is_from_reservation", false);
        this.p = extras.getString("email_success", "");
        this.s = extras.getLong("id_reservation", 0);
        if (this.q.equals("Internet/Mobile Banking")) {
            if (extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE) != null) {
                this.f = (ActivateEChannelResponse.TxnDataOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
            }
            this.tvTransaksi.setText(this.q);
            return;
        }
        if (extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE) != null) {
            this.n = (AccountOpeningResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        }
        this.tvTransaksi.setText(getResources().getString(2131822000));
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492956;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    public final /* synthetic */ void s() {
        ReservasiOnline reservasiOnline = (ReservasiOnline) this.k.where(ReservasiOnline.class).equalTo("id", Long.valueOf(this.s)).findFirst();
        reservasiOnline.setHasDone(true);
        if (reservasiOnline.getCodeTransaksi().equals(ReservasiOnline.PEMBUKAAN_REKENING)) {
            Account account = (Account) this.k.where(Account.class).equalTo("id", Long.valueOf(this.s)).findFirst();
            if (this.m.getVerified().equals("N") && account.getOldCustFlag().equals("Y")) {
                reservasiOnline.setIsInputAtmPemrek("Y");
            }
        }
    }
}
