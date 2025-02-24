package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.TransactionCSActivity;
import com.bca.smartbranch.adapter.MenuCSAdapter;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.ReservasiCSDialog;
import com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.CategoryListAdapter$CategoryListVH;
import o.ConfirmSubVisaAdapter$ViewHolder_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.PilihKotaActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clikedKartuHilang;
import o.getCardGroupType;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TransactionCSActivity.class */
public class TransactionCSActivity extends BaseActivityPostLogin implements GetCreditCardOptionsPresenter.read {
    @BindView(2131296397)
    Button btnLewati;
    private ActivateEChannelResponse.TxnDataOutput f;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindString(2131821918)
    String mustMember;
    private AccountOpeningResponse n;
    private String p;
    private GetCreditCardOptionsPresenter q;
    private String r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298331)
    setOnStartEnterTransitionListener rvMenu;
    private int[] s;
    private boolean t = false;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822226)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private boolean[] v;
    private int[] y;

    public static /* synthetic */ void a(Realm realm) {
        Iterator<E> it = realm.where(CreditCard.class).equalTo("isDraft", Boolean.FALSE).findAll().iterator();
        while (it.hasNext()) {
            CreditCard creditCard = (CreditCard) it.next();
            if (creditCard != null) {
                creditCard.cascadeDelete();
            }
        }
    }

    private List<ConfirmSubVisaAdapter$ViewHolder_ViewBinding> t() {
        if (!this.t) {
            this.s = new int[]{2131231280, 2131231213, 2131231056, 2131231288, 2131231278, 2131231285};
            this.y = new int[]{2131822001, 2131822017, 2131821741, 2131822025, 2131821999, 2131822020};
            this.v = new boolean[]{true, true, true, false, false, false};
        } else {
            this.s = new int[]{2131231280, 2131231056};
            this.y = new int[]{2131822001, 2131821741};
            this.v = new boolean[]{true, true};
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.s.length; i++) {
            ConfirmSubVisaAdapter$ViewHolder_ViewBinding confirmSubVisaAdapter$ViewHolder_ViewBinding = new ConfirmSubVisaAdapter$ViewHolder_ViewBinding();
            confirmSubVisaAdapter$ViewHolder_ViewBinding.c = this.s[i];
            confirmSubVisaAdapter$ViewHolder_ViewBinding.d = getResources().getString(this.y[i]);
            confirmSubVisaAdapter$ViewHolder_ViewBinding.e = this.v[i];
            arrayList.add(confirmSubVisaAdapter$ViewHolder_ViewBinding);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
        if (r0.equals("Tahapan BCA") != false) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void v() {
        /*
        // Method dump skipped, instructions count: 526
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.TransactionCSActivity.v():void");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void B_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.f10o = false;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.toolbarTitle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.t = extras.getBoolean("is_multiple", false);
            this.p = extras.getString("Transaction_name", "");
            this.r = extras.getString("email", "");
            if (this.p.equals("Internet/Mobile Banking")) {
                this.f = (ActivateEChannelResponse.TxnDataOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
            } else {
                this.n = (AccountOpeningResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
            }
        }
        if (this.t) {
            this.toolbar.setVisibility(8);
        } else {
            this.btnLewati.setVisibility(8);
        }
        GetCreditCardOptionsPresenter getCreditCardOptionsPresenter = new GetCreditCardOptionsPresenter();
        this.q = getCreditCardOptionsPresenter;
        getCreditCardOptionsPresenter.c = this;
        this.rvMenu.setLayoutManager(new GridLayoutManager(this, 3));
        this.rvMenu.c(new getCardGroupType(20), -1);
        this.rvMenu.setAdapter(new MenuCSAdapter(this, t()));
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void d(clikedKartuHilang clikedkartuhilang) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailDaftarTransferActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TransactionCSActivity.a(realm);
            }
        });
        x();
        Intent intent = new Intent(this, CC3ChooseBCACardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(clikedkartuhilang.a));
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read, com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        z();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseMenuCSEvent(PilihKotaActivity_ViewBinding pilihKotaActivity_ViewBinding) {
        String[] strArr = {getString(2131822001), getString(2131822017), getString(2131821741), getString(2131822025), getString(2131821999), getString(2131822020)};
        if (pilihKotaActivity_ViewBinding.a.equals(strArr[0])) {
            startActivity(new Intent(this, OpenAccountActivity.class));
        } else if (pilihKotaActivity_ViewBinding.a.equals(strArr[1])) {
            this.q.c();
        } else if (pilihKotaActivity_ViewBinding.a.equals(strArr[2])) {
            startActivity(new Intent(this, NoAtmEChannelActivity.class));
        } else if (!pilihKotaActivity_ViewBinding.a.equals(strArr[3]) && !pilihKotaActivity_ViewBinding.a.equals(strArr[4])) {
            pilihKotaActivity_ViewBinding.a.equals(strArr[5]);
        }
    }

    @OnClick({2131296397})
    public void onClickLanjut(View view) {
        if (this.m != null) {
            Bundle bundle = new Bundle();
            bundle.putString("product", this.p);
            ReservasiCSDialog reservasiCSDialog = new ReservasiCSDialog();
            reservasiCSDialog.setArguments(bundle);
            reservasiCSDialog.show(l(), "ReservasiCSDialog");
            return;
        }
        v();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetCreditCardOptionsPresenter getCreditCardOptionsPresenter = this.q;
        Call<OpenAccountSuccessActivity<clikedKartuHilang>> call = getCreditCardOptionsPresenter.a;
        if (call != null) {
            call.cancel();
        }
        getCreditCardOptionsPresenter.c = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            k();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onReservasiCSEvent(CategoryListAdapter$CategoryListVH categoryListAdapter$CategoryListVH) {
        if (!categoryListAdapter$CategoryListVH.c) {
            v();
            return;
        }
        Reservation reservation = new Reservation();
        reservation.setTypeTransaction(this.p);
        reservation.setTypeReservation("NEW_RESERVATION");
        String str = this.p;
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
        } else if (c == 1) {
            reservation.setNoReff(this.f.getNoReff());
            reservation.setTnxStatus("7");
        } else if (c == 2) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("2");
        } else if (c == 3) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("3");
        } else if (c == 4) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("4");
        } else if (c == 5) {
            reservation.setNoReff(this.n.getTxnDataOutput().getNoReff());
            reservation.setTnxStatus("5");
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
        setCardSlogan.e().b = "TransactionCSActivity";
        this.j = "TransactionCSActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493011;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void r_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void s_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).g();
    }
}
