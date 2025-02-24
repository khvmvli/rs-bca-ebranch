package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DraftBerhasilDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.OR1DataPengirimFragment;
import com.bca.smartbranch.fragment.OR2DataTransaksiAFragment;
import com.bca.smartbranch.fragment.OR2PilihProductFragment;
import com.bca.smartbranch.fragment.OR3DataTransaksiBFragment;
import com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment;
import com.bca.smartbranch.fragment.OR5DataPenerimaFragment;
import com.bca.smartbranch.fragment.OR6DataLainnyaFragment;
import com.bca.smartbranch.fragment.OR6ReviewFragment;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.ConfirmBCACardAdapter$ViewHolder;
import o.InfoProductORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LoginSessionActivity;
import o.OpenAccountSuccessActivity;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCardName;
import o.getPromotion;
import o.getUserVisibleHint;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceFormActivity.class */
public class OutwardRemittanceFormActivity extends BaseActivityPostLogin implements GetHBPresenter.write, TxnTellerPresenter.IconCompatParcelizer, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private boolean C;
    private Long D;
    private TxnTellerResponse E;
    private String F;
    private SendEmailTransactionSuccessPresenter G;
    private TxnTellerPresenter H;
    private GetHBPresenter I;
    @BindDrawable(2131231202)
    Drawable drawableIndicatorOff;
    @BindDrawable(2131231203)
    Drawable drawableIndicatorOn;
    @BindView(2131297377)
    ImageView ivIndicatorClear1;
    @BindView(2131297379)
    ImageView ivIndicatorClear2;
    @BindView(2131297381)
    ImageView ivIndicatorClear3;
    @BindView(2131297383)
    ImageView ivIndicatorClear4;
    @BindView(2131297384)
    ImageView ivIndicatorClear5;
    @BindView(2131297385)
    ImageView ivIndicatorClear6;
    @BindView(2131297766)
    public LinearLayout llMain;
    @BindView(2131297767)
    public LinearLayout llMainIndicator;
    public KirimanUang n;
    public List<DaftarTransferResponse.DaftarTransferOutput> p;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    @BindView(2131298113)
    ProgressBar pbIndicator3;
    @BindView(2131298114)
    ProgressBar pbIndicator4;
    @BindView(2131298115)
    ProgressBar pbIndicator5;
    @BindView(2131298304)
    public RelativeLayout rlToolbar;
    public boolean s;
    public long t;
    @BindString(2131822238)
    String titleOutwardRemittance;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299276)
    TextView tvIndicator1;
    @BindView(2131299277)
    TextView tvIndicator2;
    @BindView(2131299278)
    TextView tvIndicator3;
    @BindView(2131299279)
    TextView tvIndicator4;
    @BindView(2131299280)
    TextView tvIndicator5;
    @BindView(2131299281)
    TextView tvIndicator6;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    public ListFormTeller u;
    public GetCustAcctListResponse y;
    private boolean z;
    private Boolean B = Boolean.FALSE;
    public String v = "";
    public List<BeneficiaryBankResponse.BeneficiaryBank> f = new ArrayList();
    private List<GetBankSpecialRelationResponse.SpecialBank> x = new ArrayList();
    public List<KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR> r = new ArrayList();
    public List<CategoriesORResponse.Category> w = new ArrayList();
    private boolean A = false;
    public int q = 0;

    private void c(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    private void e(int i) {
        switch (i) {
            case 1:
                this.tvIndicator1.setBackgroundResource(2131231203);
                this.tvIndicator1.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator2.setBackgroundResource(2131231202);
                this.tvIndicator2.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator3.setBackgroundResource(2131231202);
                this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator4.setBackgroundResource(2131231202);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator1.setVisibility(0);
                this.ivIndicatorClear1.setVisibility(8);
                ProgressBar progressBar = this.pbIndicator1;
                progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                ProgressBar progressBar2 = this.pbIndicator2;
                progressBar2.startAnimation(new getCardName(progressBar2, 0.0f));
                ProgressBar progressBar3 = this.pbIndicator3;
                progressBar3.startAnimation(new getCardName(progressBar3, 0.0f));
                ProgressBar progressBar4 = this.pbIndicator4;
                progressBar4.startAnimation(new getCardName(progressBar4, 0.0f));
                ProgressBar progressBar5 = this.pbIndicator5;
                progressBar5.startAnimation(new getCardName(progressBar5, 0.0f));
                return;
            case 2:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setBackgroundResource(2131231203);
                this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator3.setBackgroundResource(2131231202);
                this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator4.setBackgroundResource(2131231202);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator2.setVisibility(0);
                this.ivIndicatorClear2.setVisibility(8);
                ProgressBar progressBar6 = this.pbIndicator1;
                progressBar6.startAnimation(new getCardName(progressBar6, 100.0f));
                ProgressBar progressBar7 = this.pbIndicator2;
                progressBar7.startAnimation(new getCardName(progressBar7, 0.0f));
                ProgressBar progressBar8 = this.pbIndicator3;
                progressBar8.startAnimation(new getCardName(progressBar8, 0.0f));
                ProgressBar progressBar9 = this.pbIndicator4;
                progressBar9.startAnimation(new getCardName(progressBar9, 0.0f));
                ProgressBar progressBar10 = this.pbIndicator5;
                progressBar10.startAnimation(new getCardName(progressBar10, 0.0f));
                return;
            case 3:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setBackgroundResource(2131231203);
                this.tvIndicator3.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator4.setBackgroundResource(2131231202);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator3.setVisibility(0);
                this.ivIndicatorClear3.setVisibility(8);
                ProgressBar progressBar11 = this.pbIndicator1;
                progressBar11.startAnimation(new getCardName(progressBar11, 100.0f));
                ProgressBar progressBar12 = this.pbIndicator2;
                progressBar12.startAnimation(new getCardName(progressBar12, 100.0f));
                ProgressBar progressBar13 = this.pbIndicator3;
                progressBar13.startAnimation(new getCardName(progressBar13, 0.0f));
                ProgressBar progressBar14 = this.pbIndicator4;
                progressBar14.startAnimation(new getCardName(progressBar14, 0.0f));
                ProgressBar progressBar15 = this.pbIndicator5;
                progressBar15.startAnimation(new getCardName(progressBar15, 0.0f));
                return;
            case 4:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setVisibility(8);
                this.ivIndicatorClear3.setVisibility(0);
                this.tvIndicator4.setBackgroundResource(2131231203);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator4.setVisibility(0);
                this.ivIndicatorClear4.setVisibility(8);
                ProgressBar progressBar16 = this.pbIndicator1;
                progressBar16.startAnimation(new getCardName(progressBar16, 100.0f));
                ProgressBar progressBar17 = this.pbIndicator2;
                progressBar17.startAnimation(new getCardName(progressBar17, 100.0f));
                ProgressBar progressBar18 = this.pbIndicator3;
                progressBar18.startAnimation(new getCardName(progressBar18, 100.0f));
                ProgressBar progressBar19 = this.pbIndicator4;
                progressBar19.startAnimation(new getCardName(progressBar19, 0.0f));
                ProgressBar progressBar20 = this.pbIndicator5;
                progressBar20.startAnimation(new getCardName(progressBar20, 0.0f));
                return;
            case 5:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setVisibility(8);
                this.ivIndicatorClear3.setVisibility(0);
                this.tvIndicator4.setVisibility(8);
                this.ivIndicatorClear4.setVisibility(0);
                this.tvIndicator5.setBackgroundResource(2131231203);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setVisibility(0);
                this.ivIndicatorClear5.setVisibility(8);
                ProgressBar progressBar21 = this.pbIndicator1;
                progressBar21.startAnimation(new getCardName(progressBar21, 100.0f));
                ProgressBar progressBar22 = this.pbIndicator2;
                progressBar22.startAnimation(new getCardName(progressBar22, 100.0f));
                ProgressBar progressBar23 = this.pbIndicator3;
                progressBar23.startAnimation(new getCardName(progressBar23, 100.0f));
                ProgressBar progressBar24 = this.pbIndicator4;
                progressBar24.startAnimation(new getCardName(progressBar24, 100.0f));
                ProgressBar progressBar25 = this.pbIndicator5;
                progressBar25.startAnimation(new getCardName(progressBar25, 0.0f));
                return;
            case 6:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setVisibility(8);
                this.ivIndicatorClear3.setVisibility(0);
                this.tvIndicator4.setVisibility(8);
                this.ivIndicatorClear4.setVisibility(0);
                this.tvIndicator5.setVisibility(8);
                this.ivIndicatorClear5.setVisibility(0);
                this.tvIndicator6.setBackgroundResource(2131231203);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099772));
                ProgressBar progressBar26 = this.pbIndicator1;
                progressBar26.startAnimation(new getCardName(progressBar26, 100.0f));
                ProgressBar progressBar27 = this.pbIndicator2;
                progressBar27.startAnimation(new getCardName(progressBar27, 100.0f));
                ProgressBar progressBar28 = this.pbIndicator3;
                progressBar28.startAnimation(new getCardName(progressBar28, 100.0f));
                ProgressBar progressBar29 = this.pbIndicator4;
                progressBar29.startAnimation(new getCardName(progressBar29, 100.0f));
                ProgressBar progressBar30 = this.pbIndicator5;
                progressBar30.startAnimation(new getCardName(progressBar30, 100.0f));
                return;
            default:
                return;
        }
    }

    private void e(boolean z, String str) {
        x();
        String noReff = this.E.getTxnDataOutput().getNoReff();
        if (this.E.getTxnDataOutput().getDescriptionList() != null) {
            this.E.getTxnDataOutput().getDescriptionList().get(0).getKey();
        }
        if (this.E.getTxnDataOutput().getDescriptionList() != null) {
            this.E.getTxnDataOutput().getDescriptionList().get(0).getValue();
        }
        this.E.getTxnDataOutput().getNote();
        String email = this.m != null ? this.m.getEmail() : this.u.getSetoranList().get(0).getSenderEmail();
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.clickedKeluar
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                OutwardRemittanceFormActivity outwardRemittanceFormActivity = OutwardRemittanceFormActivity.this;
                ListFormTeller listFormTeller = outwardRemittanceFormActivity.u;
                if (listFormTeller != null) {
                    if (listFormTeller.getSetoranList() != null && outwardRemittanceFormActivity.u.getSetoranList().isValid()) {
                        outwardRemittanceFormActivity.u.getSetoranList().deleteAllFromRealm();
                    }
                    if (outwardRemittanceFormActivity.u.getTarikanList() != null && outwardRemittanceFormActivity.u.getTarikanList().isValid()) {
                        outwardRemittanceFormActivity.u.getTarikanList().deleteAllFromRealm();
                    }
                    if (outwardRemittanceFormActivity.u.getKirimanUangList() != null && outwardRemittanceFormActivity.u.getKirimanUangList().isValid()) {
                        outwardRemittanceFormActivity.u.getKirimanUangList().deleteAllFromRealm();
                    }
                    if (outwardRemittanceFormActivity.u.getKliringList() != null && outwardRemittanceFormActivity.u.getKliringList().isValid()) {
                        outwardRemittanceFormActivity.u.getKliringList().deleteAllFromRealm();
                    }
                    ListFormTeller listFormTeller2 = outwardRemittanceFormActivity.u;
                    if (listFormTeller2 != null && listFormTeller2.isValid()) {
                        outwardRemittanceFormActivity.u.deleteFromRealm();
                    }
                }
            }
        });
        if (this.C) {
            DraftBerhasilDialog draftBerhasilDialog = new DraftBerhasilDialog();
            draftBerhasilDialog.a = "transaction_teller";
            draftBerhasilDialog.show(l(), "DraftBerhasilDialog");
        } else if (this.z) {
            Reservation reservation = new Reservation();
            reservation.setTypeTransaction("Transaksi Teller");
            reservation.setTypeReservation("NEW_RESERVATION");
            reservation.setTxnType("Transaksi CS");
            reservation.setNoReff(noReff);
            reservation.setTnxStatus("8");
            reservation.setTransactionCode(this.F);
            Intent intent = new Intent(this, BranchMapActivity.class);
            intent.putExtra("reff_no", reservation.getNoReff());
            intent.putExtra("type_transaksi", reservation.getTypeTransaction());
            intent.putExtra("type_reservation", reservation.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
            intent.putExtra("txn_data", ListUtil.OneItemImmutableList.e(this.E.getTxnDataOutput()));
            intent.putExtra("is_tartun_jumbes", this.A);
            startActivity(intent);
            setOnHierarchyChangeListener.d((Activity) this);
        } else {
            Intent intent2 = new Intent(this, DetailOpenTellerActivity.class);
            intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.E.getTxnDataOutput()));
            intent2.putExtra("email", email);
            intent2.putExtra("no_reff", noReff);
            if (z) {
                intent2.putExtra("email_success", str);
            }
            startActivity(intent2);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        e(false, str);
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        if (this.E != null) {
            e(false, "");
        } else {
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).e(2131822092, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceFormActivity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutwardRemittanceFormActivity outwardRemittanceFormActivity = OutwardRemittanceFormActivity.this;
                    outwardRemittanceFormActivity.d(outwardRemittanceFormActivity.C);
                }
            }).g();
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(TxnTellerResponse txnTellerResponse) {
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
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

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b_(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.getView
    public void c(Fragment fragment) {
        char c;
        c(fragment);
        String tag = fragment.getTag();
        tag.hashCode();
        switch (tag.hashCode()) {
            case -603095421:
                if (tag.equals("OR1DataPengirimFragment")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 53888775:
                if (tag.equals("ProsesORFragment")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 404696923:
                if (tag.equals("OR6ReviewFragment")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 412114819:
                if (tag.equals("OR5DataPenerimaFragment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 635975390:
                if (tag.equals("OR4DataBankPenerimaFragment")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 758930212:
                if (tag.equals("OR3DataTransaksiBFragment")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 785582095:
                if (tag.equals("OR6DataLainnyaFragment")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1088953692:
                if (tag.equals("OR2PilihProductFragment")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1321620194:
                if (tag.equals("OR2DataTransaksiAFragment")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(1);
                break;
            case 1:
                this.llMainIndicator.setVisibility(8);
                this.rlToolbar.setVisibility(8);
                break;
            case 2:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(6);
                break;
            case 3:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(4);
                break;
            case 4:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(3);
                break;
            case 5:
            case 7:
            case '\b':
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(2);
                break;
            case 6:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(5);
                break;
        }
        this.k.executeTransaction(new Realm.Transaction(fragment) { // from class: o.clikedTwitterHalloBCA
            public final /* synthetic */ Fragment c;

            {
                this.c = r5;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                char c2;
                OutwardRemittanceFormActivity outwardRemittanceFormActivity = OutwardRemittanceFormActivity.this;
                String tag2 = this.c.getTag();
                tag2.hashCode();
                switch (tag2.hashCode()) {
                    case -603095421:
                        if (tag2.equals("OR1DataPengirimFragment")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 53888775:
                        if (tag2.equals("ProsesORFragment")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 404696923:
                        if (tag2.equals("OR6ReviewFragment")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 412114819:
                        if (tag2.equals("OR5DataPenerimaFragment")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 635975390:
                        if (tag2.equals("OR4DataBankPenerimaFragment")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 758930212:
                        if (tag2.equals("OR3DataTransaksiBFragment")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 785582095:
                        if (tag2.equals("OR6DataLainnyaFragment")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1088953692:
                        if (tag2.equals("OR2PilihProductFragment")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1321620194:
                        if (tag2.equals("OR2DataTransaksiAFragment")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        outwardRemittanceFormActivity.n.setCurrentPage("OR1DataPengirimFragment");
                        return;
                    case 1:
                        outwardRemittanceFormActivity.n.setCurrentPage("ProsesORFragment");
                        return;
                    case 2:
                        outwardRemittanceFormActivity.n.setCurrentPage("OR6ReviewFragment");
                        return;
                    case 3:
                        outwardRemittanceFormActivity.n.setCurrentPage("OR5DataPenerimaFragment");
                        return;
                    case 4:
                        outwardRemittanceFormActivity.n.setCurrentPage("OR4DataBankPenerimaFragment");
                        return;
                    case 5:
                        outwardRemittanceFormActivity.n.setCurrentPage("OR3DataTransaksiBFragment");
                        return;
                    case 6:
                        outwardRemittanceFormActivity.n.setCurrentPage("OR6DataLainnyaFragment");
                        return;
                    case 7:
                        outwardRemittanceFormActivity.n.setCurrentPage("OR2PilihProductFragment");
                        return;
                    case '\b':
                        outwardRemittanceFormActivity.n.setCurrentPage("OR2DataTransaksiAFragment");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        this.E = txnTellerResponse;
        if ((this.m != null ? this.m.getEmail() : "").isEmpty()) {
            if (!this.u.getSetoranList().isEmpty()) {
                this.u.getSetoranList().get(0).getSenderEmail();
            } else if (!this.u.getTarikanList().isEmpty()) {
                this.u.getTarikanList().get(0).getEmail();
            }
        }
        this.G.a(getPromotion.e(this.m), this.m.getEmail(), new LoginSessionActivity(txnTellerResponse.getTxnDataOutput().getNoReff()));
    }

    public final void c(String str) {
        char c;
        this.v = str;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 52) {
            if (str.equals("4")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 70) {
            if (str.equals("F")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 79) {
            if (str.equals("O")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 76) {
            if (hashCode == 77 && str.equals("M")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("L")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            this.tvToolbarTitle.setText(2131822093);
        } else if (c == 1) {
            this.tvToolbarTitle.setText(2131821362);
        } else if (c == 2) {
            this.tvToolbarTitle.setText(2131821871);
        } else if (c == 3) {
            this.tvToolbarTitle.setText(2131821916);
        } else if (c != 4) {
            this.tvToolbarTitle.setText(2131822238);
        } else {
            this.tvToolbarTitle.setText(2131822238);
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        e(false, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        char c;
        char c2;
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822238);
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.I = getHBPresenter;
        getHBPresenter.e = this;
        TxnTellerPresenter txnTellerPresenter = new TxnTellerPresenter();
        this.H = txnTellerPresenter;
        txnTellerPresenter.d = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.G = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.s = extras.getBoolean("is_from_reservation", false);
            this.t = extras.getLong("id_reservation");
            if (this.m != null && this.m.getVerified().equals("Y")) {
                this.y = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("ListAcct"));
            }
            if (extras.getParcelable("data_kategori_tujuan") != null) {
                this.r = ((KategoriTujuanTransaksiORResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_kategori_tujuan"))).getListData();
            }
            if (extras.getParcelable("data_beneficiary") != null) {
                this.f = ((BeneficiaryBankResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_beneficiary"))).getListData();
            }
            if (extras.getParcelable("data_bank_special_relation") != null) {
                this.x = ((GetBankSpecialRelationResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_bank_special_relation"))).getSpecialBanks();
            }
            if (extras.getParcelable("data_sumber_dana") != null) {
                this.w = ((CategoriesORResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_sumber_dana"))).getCategories();
            }
            if (extras.getParcelable("data_daftar_transfer") != null) {
                this.p = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_daftar_transfer"));
            }
        }
        if (extras != null && extras.getBoolean("id_draft", false)) {
            KirimanUang kirimanUang = (KirimanUang) this.k.where(KirimanUang.class).equalTo("id", Long.valueOf(extras.getLong("transaksi_teller_id", 0))).findFirst();
            this.D = Long.valueOf(extras.getLong("transaksi_teller_id", 0));
            KirimanUang kirimanUang2 = new KirimanUang();
            this.n = kirimanUang2;
            kirimanUang2.setId(kirimanUang.getId());
            this.n.setCreatedAt(kirimanUang.getCreatedAt());
            this.n.setCurrentPage(kirimanUang.getCurrentPage());
            this.n.setTypeOfProduct(kirimanUang.getTypeOfProduct());
            this.n.setNorekPengirim(kirimanUang.getNorekPengirim());
            this.n.setNamaPengirim(kirimanUang.getNamaPengirim());
            this.n.setNoHpPengirim(kirimanUang.getNoHpPengirim());
            this.n.setPromoCode(kirimanUang.getPromoCode());
            this.n.setFlagPromoCode(kirimanUang.getFlagPromoCode());
            this.n.setJenisKodeBankTransaksi(kirimanUang.getJenisKodeBankTransaksi());
            this.n.setNegaraTujuanTransaksi(kirimanUang.getNegaraTujuanTransaksi());
            this.n.setISONegaraTujuanTransaksi(kirimanUang.getISONegaraTujuanTransaksi());
            this.n.setFlagIBAN(kirimanUang.isFlagIBAN());
            this.n.setJenisMataUangTransaksi(kirimanUang.getJenisMataUangTransaksi());
            this.n.setNominalTransaksi(kirimanUang.getNominalTransaksi());
            this.n.setFlagFullAmountTransaksi(kirimanUang.getFlagFullAmountTransaksi());
            this.n.setFlagValueTodayTransaksi(kirimanUang.getFlagValueTodayTransaksi());
            this.n.setKategoriTujuanTransaksiKode(kirimanUang.getKategoriTujuanTransaksiKode());
            this.n.setKategoriTujuanTransaksi(kirimanUang.getKategoriTujuanTransaksi());
            this.n.setTujuanTransaksiKode(kirimanUang.getTujuanTransaksiKode());
            this.n.setTujuanTransaksi(kirimanUang.getTujuanTransaksi());
            this.n.setSumberDanaTransaksiKode(kirimanUang.getSumberDanaTransaksiKode());
            this.n.setSumberDanaTransaksi(kirimanUang.getSumberDanaTransaksi());
            this.n.setBeritaTransaksi(kirimanUang.getBeritaTransaksi());
            this.n.setFlagHubunganKeuanganTransaksi(kirimanUang.getFlagHubunganKeuanganTransaksi());
            this.n.setLimitMinNominalTransaksi(kirimanUang.getLimitMinNominalTransaksi());
            this.n.setLimitMaxNominalTransaksi(kirimanUang.getLimitMaxNominalTransaksi());
            this.n.setProdukRekomendasi(kirimanUang.getProdukRekomendasi());
            this.n.setKodeSwiftBankPenerima(kirimanUang.getKodeSwiftBankPenerima());
            this.n.setNamaBankPenerima(kirimanUang.getNamaBankPenerima());
            this.n.setNegaraBagianBankPenerima(kirimanUang.getNegaraBagianBankPenerima());
            this.n.setNegaraBagianBankPenerimaCode(kirimanUang.getNegaraBagianBankPenerimaCode());
            this.n.setAlamatBankPenerima(kirimanUang.getAlamatBankPenerima());
            this.n.setKotaBankPenerima(kirimanUang.getKotaBankPenerima());
            this.n.setCodewordBankPenerima(kirimanUang.getCodewordBankPenerima());
            this.n.setFlagKodeAutoCompletePenerima(kirimanUang.getFlagKodeAutoCompletePenerima());
            this.n.setFlagSettleViaBankPenerima(kirimanUang.getFlagSettleViaBankPenerima());
            this.n.setFlagAlamatBankPenerimaBelumSesuai(kirimanUang.getFlagAlamatBankPenerimaBelumSesuai());
            this.n.setKeteranganAlamatBankPenerima(kirimanUang.getKeteranganAlamatBankPenerima());
            this.n.setFlagBicCode(kirimanUang.isFlagBicCode());
            this.n.setBankBicKey(kirimanUang.getBankBicKey());
            this.n.setNorekPenerima(kirimanUang.getNorekPenerima());
            this.n.setNoIBANPenerima(kirimanUang.getNoIBANPenerima());
            this.n.setNamaPenerima(kirimanUang.getNamaPenerima());
            this.n.setNoTelpPenerima(kirimanUang.getNoTelpPenerima());
            this.n.setNegaraTujuanPenerima(kirimanUang.getNegaraTujuanPenerima());
            this.n.setNegaraTujuanPenerimaISO(kirimanUang.getNegaraTujuanPenerimaISO());
            this.n.setNegaraBagianPenerima(kirimanUang.getNegaraBagianPenerima());
            this.n.setNegaraBagianPenerimaCode(kirimanUang.getNegaraBagianPenerimaCode());
            this.n.setAlamatLengkapPenerima(kirimanUang.getAlamatLengkapPenerima());
            this.n.setKotaPenerima(kirimanUang.getKotaPenerima());
            this.n.setKodePosPenerima(kirimanUang.getKodePosPenerima());
            this.n.setTipeNasabahPenerima(kirimanUang.getTipeNasabahPenerima());
            this.n.setTipeTujuanTransaksiPenerima(kirimanUang.getTipeTujuanTransaksiPenerima());
            this.n.setStatusPendudukPenerima(kirimanUang.getStatusPendudukPenerima());
            this.n.setFlagSimpanDaftarTransferPenerima(kirimanUang.getFlagSimpanDaftarTransferPenerima());
            this.n.setFlagDaftarSwift(kirimanUang.getFlagDaftarSwift());
            String typeOfProduct = this.n.getTypeOfProduct();
            this.v = typeOfProduct;
            c(typeOfProduct);
            String currentPage = this.n.getCurrentPage();
            currentPage.hashCode();
            switch (currentPage.hashCode()) {
                case -603095421:
                    if (currentPage.equals("OR1DataPengirimFragment")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 404696923:
                    if (currentPage.equals("OR6ReviewFragment")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 412114819:
                    if (currentPage.equals("OR5DataPenerimaFragment")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 635975390:
                    if (currentPage.equals("OR4DataBankPenerimaFragment")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 758930212:
                    if (currentPage.equals("OR3DataTransaksiBFragment")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 785582095:
                    if (currentPage.equals("OR6DataLainnyaFragment")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1088953692:
                    if (currentPage.equals("OR2PilihProductFragment")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1321620194:
                    if (currentPage.equals("OR2DataTransaksiAFragment")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    c(2131296811, new OR1DataPengirimFragment(), "OR1DataPengirimFragment");
                    break;
                case 1:
                    c(2131296811, new OR6ReviewFragment(), "OR6ReviewFragment");
                    break;
                case 2:
                    c(2131296811, new OR5DataPenerimaFragment(), "OR5DataPenerimaFragment");
                    break;
                case 3:
                    c(2131296811, new OR4DataBankPenerimaFragment(), "OR4DataBankPenerimaFragment");
                    break;
                case 4:
                    c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
                    break;
                case 5:
                    c(2131296811, new OR6DataLainnyaFragment(), "OR6DataLainnyaFragment");
                    break;
                case 6:
                    c(2131296811, new OR2PilihProductFragment(), "OR2PilihProductFragment");
                    break;
                case 7:
                    c(2131296811, new OR2DataTransaksiAFragment(), "OR2DataTransaksiAFragment");
                    break;
                default:
                    c(2131296811, new OR1DataPengirimFragment(), "OR1DataPengirimFragment");
                    break;
            }
        } else {
            KirimanUang kirimanUang3 = new KirimanUang();
            this.n = kirimanUang3;
            if (this.s) {
                KirimanUang kirimanUang4 = (KirimanUang) this.k.where(KirimanUang.class).equalTo("id", Long.valueOf(this.t)).findFirst();
                if (kirimanUang4 != null) {
                    this.n.setId(kirimanUang4.getId());
                    this.n.setCreatedAt(kirimanUang4.getCreatedAt());
                    this.n.setCurrentPage("OR6ReviewFragment");
                    this.n.setTypeOfProduct(kirimanUang4.getTypeOfProduct());
                    this.n.setNorekPengirim(kirimanUang4.getNorekPengirim());
                    this.n.setNamaPengirim(kirimanUang4.getNamaPengirim());
                    this.n.setNoHpPengirim(kirimanUang4.getNoHpPengirim());
                    this.n.setPromoCode(kirimanUang4.getPromoCode());
                    this.n.setFlagPromoCode(kirimanUang4.getFlagPromoCode());
                    this.n.setJenisKodeBankTransaksi(kirimanUang4.getJenisKodeBankTransaksi());
                    this.n.setNegaraTujuanTransaksi(kirimanUang4.getNegaraTujuanTransaksi());
                    this.n.setISONegaraTujuanTransaksi(kirimanUang4.getISONegaraTujuanTransaksi());
                    this.n.setFlagIBAN(kirimanUang4.isFlagIBAN());
                    this.n.setJenisMataUangTransaksi(kirimanUang4.getJenisMataUangTransaksi());
                    this.n.setNominalTransaksi(kirimanUang4.getNominalTransaksi());
                    this.n.setFlagFullAmountTransaksi(kirimanUang4.getFlagFullAmountTransaksi());
                    this.n.setFlagValueTodayTransaksi(kirimanUang4.getFlagValueTodayTransaksi());
                    this.n.setKategoriTujuanTransaksiKode(kirimanUang4.getKategoriTujuanTransaksiKode());
                    this.n.setKategoriTujuanTransaksi(kirimanUang4.getKategoriTujuanTransaksi());
                    this.n.setTujuanTransaksiKode(kirimanUang4.getTujuanTransaksiKode());
                    this.n.setTujuanTransaksi(kirimanUang4.getTujuanTransaksi());
                    this.n.setSumberDanaTransaksiKode(kirimanUang4.getSumberDanaTransaksiKode());
                    this.n.setSumberDanaTransaksi(kirimanUang4.getSumberDanaTransaksi());
                    this.n.setBeritaTransaksi(kirimanUang4.getBeritaTransaksi());
                    this.n.setFlagHubunganKeuanganTransaksi(kirimanUang4.getFlagHubunganKeuanganTransaksi());
                    this.n.setLimitMinNominalTransaksi(kirimanUang4.getLimitMinNominalTransaksi());
                    this.n.setLimitMaxNominalTransaksi(kirimanUang4.getLimitMaxNominalTransaksi());
                    this.n.setProdukRekomendasi(kirimanUang4.getProdukRekomendasi());
                    this.n.setKodeSwiftBankPenerima(kirimanUang4.getKodeSwiftBankPenerima());
                    this.n.setNamaBankPenerima(kirimanUang4.getNamaBankPenerima());
                    this.n.setNegaraBagianBankPenerima(kirimanUang4.getNegaraBagianBankPenerima());
                    this.n.setNegaraBagianBankPenerimaCode(kirimanUang4.getNegaraBagianBankPenerimaCode());
                    this.n.setAlamatBankPenerima(kirimanUang4.getAlamatBankPenerima());
                    this.n.setKotaBankPenerima(kirimanUang4.getKotaBankPenerima());
                    this.n.setCodewordBankPenerima(kirimanUang4.getCodewordBankPenerima());
                    this.n.setFlagKodeAutoCompletePenerima(kirimanUang4.getFlagKodeAutoCompletePenerima());
                    this.n.setFlagSettleViaBankPenerima(kirimanUang4.getFlagSettleViaBankPenerima());
                    this.n.setFlagAlamatBankPenerimaBelumSesuai(kirimanUang4.getFlagAlamatBankPenerimaBelumSesuai());
                    this.n.setKeteranganAlamatBankPenerima(kirimanUang4.getKeteranganAlamatBankPenerima());
                    this.n.setFlagBicCode(kirimanUang4.isFlagBicCode());
                    this.n.setBankBicKey(kirimanUang4.getBankBicKey());
                    this.n.setNorekPenerima(kirimanUang4.getNorekPenerima());
                    this.n.setNoIBANPenerima(kirimanUang4.getNoIBANPenerima());
                    this.n.setNamaPenerima(kirimanUang4.getNamaPenerima());
                    this.n.setNoTelpPenerima(kirimanUang4.getNoTelpPenerima());
                    this.n.setNegaraTujuanPenerima(kirimanUang4.getNegaraTujuanPenerima());
                    this.n.setNegaraTujuanPenerimaISO(kirimanUang4.getNegaraTujuanPenerimaISO());
                    this.n.setNegaraBagianPenerima(kirimanUang4.getNegaraBagianPenerima());
                    this.n.setNegaraBagianPenerimaCode(kirimanUang4.getNegaraBagianPenerimaCode());
                    this.n.setAlamatLengkapPenerima(kirimanUang4.getAlamatLengkapPenerima());
                    this.n.setKotaPenerima(kirimanUang4.getKotaPenerima());
                    this.n.setKodePosPenerima(kirimanUang4.getKodePosPenerima());
                    this.n.setTipeNasabahPenerima(kirimanUang4.getTipeNasabahPenerima());
                    this.n.setTipeTujuanTransaksiPenerima(kirimanUang4.getTipeTujuanTransaksiPenerima());
                    this.n.setStatusPendudukPenerima(kirimanUang4.getStatusPendudukPenerima());
                    this.n.setFlagSimpanDaftarTransferPenerima(kirimanUang4.getFlagSimpanDaftarTransferPenerima());
                    this.n.setFlagDaftarSwift(kirimanUang4.getFlagDaftarSwift());
                    String typeOfProduct2 = this.n.getTypeOfProduct();
                    this.v = typeOfProduct2;
                    c(typeOfProduct2);
                } else {
                    this.n.setId(this.t);
                    this.n.setCreatedAt(System.currentTimeMillis());
                }
            } else {
                kirimanUang3.setId(System.currentTimeMillis());
                this.n.setCreatedAt(System.currentTimeMillis());
            }
            String currentPage2 = this.n.getCurrentPage();
            currentPage2.hashCode();
            switch (currentPage2.hashCode()) {
                case -603095421:
                    if (currentPage2.equals("OR1DataPengirimFragment")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 404696923:
                    if (currentPage2.equals("OR6ReviewFragment")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 412114819:
                    if (currentPage2.equals("OR5DataPenerimaFragment")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 635975390:
                    if (currentPage2.equals("OR4DataBankPenerimaFragment")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 758930212:
                    if (currentPage2.equals("OR3DataTransaksiBFragment")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 785582095:
                    if (currentPage2.equals("OR6DataLainnyaFragment")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1088953692:
                    if (currentPage2.equals("OR2PilihProductFragment")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1321620194:
                    if (currentPage2.equals("OR2DataTransaksiAFragment")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    c(2131296811, new OR1DataPengirimFragment(), "OR1DataPengirimFragment");
                    break;
                case 1:
                    c(2131296811, new OR6ReviewFragment(), "OR6ReviewFragment");
                    break;
                case 2:
                    c(2131296811, new OR5DataPenerimaFragment(), "OR5DataPenerimaFragment");
                    break;
                case 3:
                    c(2131296811, new OR4DataBankPenerimaFragment(), "OR4DataBankPenerimaFragment");
                    break;
                case 4:
                    c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
                    break;
                case 5:
                    c(2131296811, new OR6DataLainnyaFragment(), "OR6DataLainnyaFragment");
                    break;
                case 6:
                    c(2131296811, new OR2PilihProductFragment(), "OR2PilihProductFragment");
                    break;
                case 7:
                    c(2131296811, new OR2DataTransaksiAFragment(), "OR2DataTransaksiAFragment");
                    break;
                default:
                    c(2131296811, new OR1DataPengirimFragment(), "OR1DataPengirimFragment");
                    break;
            }
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.OutwardRemittanceFormActivity.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                OutwardRemittanceFormActivity.this.u = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                if (OutwardRemittanceFormActivity.this.u == null) {
                    OutwardRemittanceFormActivity.this.u = (ListFormTeller) realm.createObject(ListFormTeller.class, Long.valueOf(System.currentTimeMillis()));
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d09  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0e78  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e6  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(boolean r8) {
        /*
        // Method dump skipped, instructions count: 4659
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.OutwardRemittanceFormActivity.d(boolean):void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        e(true, str);
    }

    public final /* synthetic */ void e(Realm realm) {
        KirimanUang kirimanUang = (KirimanUang) this.k.where(KirimanUang.class).equalTo("id", Long.valueOf(this.n.getId())).findFirst();
        if (kirimanUang == null) {
            KirimanUang kirimanUang2 = (KirimanUang) realm.createObject(KirimanUang.class, Long.valueOf(this.n.getId()));
            kirimanUang2.setCreatedAt(this.n.getCreatedAt());
            kirimanUang2.setCurrentPage(this.n.getCurrentPage());
            kirimanUang2.setTypeOfProduct(this.n.getTypeOfProduct());
            kirimanUang2.setNorekPengirim(this.n.getNorekPengirim());
            kirimanUang2.setNamaPengirim(this.n.getNamaPengirim());
            kirimanUang2.setPromoCode(this.n.getPromoCode());
            kirimanUang2.setNoHpPengirim(this.n.getNoHpPengirim());
            kirimanUang2.setFlagPromoCode(this.n.getFlagPromoCode());
            kirimanUang2.setJenisKodeBankTransaksi(this.n.getJenisKodeBankTransaksi());
            kirimanUang2.setNegaraTujuanTransaksi(this.n.getNegaraTujuanTransaksi());
            kirimanUang2.setISONegaraTujuanTransaksi(this.n.getISONegaraTujuanTransaksi());
            kirimanUang2.setJenisMataUangTransaksi(this.n.getJenisMataUangTransaksi());
            kirimanUang2.setNominalTransaksi(this.n.getNominalTransaksi());
            kirimanUang2.setFlagFullAmountTransaksi(this.n.getFlagFullAmountTransaksi());
            kirimanUang2.setFlagValueTodayTransaksi(this.n.getFlagValueTodayTransaksi());
            kirimanUang2.setKategoriTujuanTransaksiKode(this.n.getKategoriTujuanTransaksiKode());
            kirimanUang2.setKategoriTujuanTransaksi(this.n.getKategoriTujuanTransaksi());
            kirimanUang2.setTujuanTransaksiKode(this.n.getTujuanTransaksiKode());
            kirimanUang2.setTujuanTransaksi(this.n.getTujuanTransaksi());
            kirimanUang2.setSumberDanaTransaksiKode(this.n.getSumberDanaTransaksiKode());
            kirimanUang2.setSumberDanaTransaksi(this.n.getSumberDanaTransaksi());
            kirimanUang2.setBeritaTransaksi(this.n.getBeritaTransaksi());
            kirimanUang2.setFlagHubunganKeuanganTransaksi(this.n.getFlagHubunganKeuanganTransaksi());
            kirimanUang2.setLimitMinNominalTransaksi(this.n.getLimitMinNominalTransaksi());
            kirimanUang2.setLimitMaxNominalTransaksi(this.n.getLimitMaxNominalTransaksi());
            kirimanUang2.setProdukRekomendasi(this.n.getProdukRekomendasi());
            kirimanUang2.setFlagSettleViaBankPenerima(this.n.getFlagSettleViaBankPenerima());
            kirimanUang2.setFlagAlamatBankPenerimaBelumSesuai(this.n.getFlagAlamatBankPenerimaBelumSesuai());
            kirimanUang2.setKeteranganAlamatBankPenerima(this.n.getKeteranganAlamatBankPenerima());
            kirimanUang2.setKodeSwiftBankPenerima(this.n.getKodeSwiftBankPenerima());
            kirimanUang2.setNamaBankPenerima(this.n.getNamaBankPenerima());
            kirimanUang2.setNegaraBagianBankPenerima(this.n.getNegaraBagianBankPenerima());
            kirimanUang2.setNegaraBagianBankPenerimaCode(this.n.getNegaraBagianBankPenerimaCode());
            kirimanUang2.setAlamatBankPenerima(this.n.getAlamatBankPenerima());
            kirimanUang2.setKotaBankPenerima(this.n.getKotaBankPenerima());
            kirimanUang2.setCodewordBankPenerima(this.n.getCodewordBankPenerima());
            kirimanUang2.setFlagKodeAutoCompletePenerima(this.n.getFlagKodeAutoCompletePenerima());
            kirimanUang2.setFlagSettleViaBankPenerima(this.n.getFlagSettleViaBankPenerima());
            kirimanUang2.setFlagAlamatBankPenerimaBelumSesuai(this.n.getFlagAlamatBankPenerimaBelumSesuai());
            kirimanUang2.setKeteranganAlamatBankPenerima(this.n.getKeteranganAlamatBankPenerima());
            kirimanUang2.setFlagBicCode(this.n.isFlagBicCode());
            kirimanUang2.setBankBicKey(this.n.getBankBicKey());
            kirimanUang2.setNorekPenerima(this.n.getNorekPenerima());
            kirimanUang2.setNoIBANPenerima(this.n.getNoIBANPenerima());
            kirimanUang2.setFlagIBAN(this.n.isFlagIBAN());
            kirimanUang2.setNamaPenerima(this.n.getNamaPenerima());
            kirimanUang2.setNoTelpPenerima(this.n.getNoTelpPenerima());
            kirimanUang2.setNegaraTujuanPenerima(this.n.getNegaraTujuanPenerima());
            kirimanUang2.setNegaraTujuanPenerimaISO(this.n.getNegaraTujuanPenerimaISO());
            kirimanUang2.setNegaraBagianPenerima(this.n.getNegaraBagianPenerima());
            kirimanUang2.setNegaraBagianPenerimaCode(this.n.getNegaraBagianPenerimaCode());
            kirimanUang2.setAlamatLengkapPenerima(this.n.getAlamatLengkapPenerima());
            kirimanUang2.setKotaPenerima(this.n.getKotaPenerima());
            kirimanUang2.setKodePosPenerima(this.n.getKodePosPenerima());
            kirimanUang2.setTipeNasabahPenerima(this.n.getTipeNasabahPenerima());
            kirimanUang2.setTipeTujuanTransaksiPenerima(this.n.getTipeTujuanTransaksiPenerima());
            kirimanUang2.setStatusPendudukPenerima(this.n.getStatusPendudukPenerima());
            kirimanUang2.setFlagSimpanDaftarTransferPenerima(this.n.getFlagSimpanDaftarTransferPenerima());
            kirimanUang2.setFlagDaftarSwift(this.n.getFlagDaftarSwift());
            this.m.getKirimanUangs().add(kirimanUang2);
            return;
        }
        kirimanUang.setCreatedAt(this.n.getCreatedAt());
        kirimanUang.setCurrentPage(this.n.getCurrentPage());
        kirimanUang.setTypeOfProduct(this.n.getTypeOfProduct());
        kirimanUang.setNorekPengirim(this.n.getNorekPengirim());
        kirimanUang.setNamaPengirim(this.n.getNamaPengirim());
        kirimanUang.setPromoCode(this.n.getPromoCode());
        kirimanUang.setNoHpPengirim(this.n.getNoHpPengirim());
        kirimanUang.setFlagPromoCode(this.n.getFlagPromoCode());
        kirimanUang.setJenisKodeBankTransaksi(this.n.getJenisKodeBankTransaksi());
        kirimanUang.setNegaraTujuanTransaksi(this.n.getNegaraTujuanTransaksi());
        kirimanUang.setISONegaraTujuanTransaksi(this.n.getISONegaraTujuanTransaksi());
        kirimanUang.setJenisMataUangTransaksi(this.n.getJenisMataUangTransaksi());
        kirimanUang.setNominalTransaksi(this.n.getNominalTransaksi());
        kirimanUang.setFlagFullAmountTransaksi(this.n.getFlagFullAmountTransaksi());
        kirimanUang.setFlagValueTodayTransaksi(this.n.getFlagValueTodayTransaksi());
        kirimanUang.setKategoriTujuanTransaksiKode(this.n.getKategoriTujuanTransaksiKode());
        kirimanUang.setKategoriTujuanTransaksi(this.n.getKategoriTujuanTransaksi());
        kirimanUang.setTujuanTransaksiKode(this.n.getTujuanTransaksiKode());
        kirimanUang.setTujuanTransaksi(this.n.getTujuanTransaksi());
        kirimanUang.setSumberDanaTransaksiKode(this.n.getSumberDanaTransaksiKode());
        kirimanUang.setSumberDanaTransaksi(this.n.getSumberDanaTransaksi());
        kirimanUang.setBeritaTransaksi(this.n.getBeritaTransaksi());
        kirimanUang.setFlagHubunganKeuanganTransaksi(this.n.getFlagHubunganKeuanganTransaksi());
        kirimanUang.setLimitMinNominalTransaksi(this.n.getLimitMinNominalTransaksi());
        kirimanUang.setLimitMaxNominalTransaksi(this.n.getLimitMaxNominalTransaksi());
        kirimanUang.setProdukRekomendasi(this.n.getProdukRekomendasi());
        kirimanUang.setFlagSettleViaBankPenerima(this.n.getFlagSettleViaBankPenerima());
        kirimanUang.setFlagAlamatBankPenerimaBelumSesuai(this.n.getFlagAlamatBankPenerimaBelumSesuai());
        kirimanUang.setKeteranganAlamatBankPenerima(this.n.getKeteranganAlamatBankPenerima());
        kirimanUang.setKodeSwiftBankPenerima(this.n.getKodeSwiftBankPenerima());
        kirimanUang.setNamaBankPenerima(this.n.getNamaBankPenerima());
        kirimanUang.setNegaraBagianBankPenerima(this.n.getNegaraBagianBankPenerima());
        kirimanUang.setNegaraBagianBankPenerimaCode(this.n.getNegaraBagianBankPenerimaCode());
        kirimanUang.setAlamatBankPenerima(this.n.getAlamatBankPenerima());
        kirimanUang.setKotaBankPenerima(this.n.getKotaBankPenerima());
        kirimanUang.setCodewordBankPenerima(this.n.getCodewordBankPenerima());
        kirimanUang.setFlagKodeAutoCompletePenerima(this.n.getFlagKodeAutoCompletePenerima());
        kirimanUang.setFlagSettleViaBankPenerima(this.n.getFlagSettleViaBankPenerima());
        kirimanUang.setFlagAlamatBankPenerimaBelumSesuai(this.n.getFlagAlamatBankPenerimaBelumSesuai());
        kirimanUang.setKeteranganAlamatBankPenerima(this.n.getKeteranganAlamatBankPenerima());
        kirimanUang.setFlagBicCode(this.n.isFlagBicCode());
        kirimanUang.setBankBicKey(this.n.getBankBicKey());
        kirimanUang.setNorekPenerima(this.n.getNorekPenerima());
        kirimanUang.setNoIBANPenerima(this.n.getNoIBANPenerima());
        kirimanUang.setFlagIBAN(this.n.isFlagIBAN());
        kirimanUang.setNamaPenerima(this.n.getNamaPenerima());
        kirimanUang.setNoTelpPenerima(this.n.getNoTelpPenerima());
        kirimanUang.setNegaraTujuanPenerima(this.n.getNegaraTujuanPenerima());
        kirimanUang.setNegaraTujuanPenerimaISO(this.n.getNegaraTujuanPenerimaISO());
        kirimanUang.setNegaraBagianPenerima(this.n.getNegaraBagianPenerima());
        kirimanUang.setNegaraBagianPenerimaCode(this.n.getNegaraBagianPenerimaCode());
        kirimanUang.setAlamatLengkapPenerima(this.n.getAlamatLengkapPenerima());
        kirimanUang.setKotaPenerima(this.n.getKotaPenerima());
        kirimanUang.setKodePosPenerima(this.n.getKodePosPenerima());
        kirimanUang.setTipeNasabahPenerima(this.n.getTipeNasabahPenerima());
        kirimanUang.setTipeTujuanTransaksiPenerima(this.n.getTipeTujuanTransaksiPenerima());
        kirimanUang.setStatusPendudukPenerima(this.n.getStatusPendudukPenerima());
        kirimanUang.setFlagSimpanDaftarTransferPenerima(this.n.getFlagSimpanDaftarTransferPenerima());
        kirimanUang.setFlagDaftarSwift(this.n.getFlagDaftarSwift());
    }

    public final void e(boolean z) {
        this.f10o = z;
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void i_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void l(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.OutwardRemittanceFormActivity.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    KirimanUang kirimanUang = (KirimanUang) OutwardRemittanceFormActivity.this.k.where(KirimanUang.class).equalTo("id", Long.valueOf(OutwardRemittanceFormActivity.this.n.getId())).findFirst();
                    if (kirimanUang != null) {
                        kirimanUang.deleteFromRealm();
                        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
                    }
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
        } else if (this.n.getCurrentPage().equals("OR6ReviewFragment")) {
            documentProvider.b().d(new ConfirmBCACardAdapter$ViewHolder());
        } else {
            y();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.s) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        TxnTellerPresenter txnTellerPresenter = this.H;
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call = txnTellerPresenter.e;
        if (call != null) {
            call.cancel();
        }
        txnTellerPresenter.d = null;
        GetHBPresenter getHBPresenter = this.I;
        Call<OpenAccountSuccessActivity<Object>> call2 = getHBPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        getHBPresenter.e = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.G;
        Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(this);
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (this.m == null) {
                YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                yakinKeluarDialog.d = "transaction_teller";
                yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                return true;
            } else if (this.s) {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            } else {
                u();
                return true;
            }
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "OutwardRemittanceFormActivity";
        this.j = "OutwardRemittanceFormActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492972;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    public final void t() {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.I;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.OutwardRemittanceFormActivity.t():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceFormActivity.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 23 more
                */
            /*
                this = this;
                r0 = r6
                com.bca.smartbranch.data.localdb.User r0 = r0.m
                if (r0 == 0) goto L_0x0044
                r0 = r6
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.I
                r7 = r0
                o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
                r1 = r0
                r2 = r6
                java.lang.String r2 = r2.h
                r3 = r6
                com.bca.smartbranch.data.localdb.User r3 = r3.m
                java.lang.String r3 = r3.getSessionId()
                r4 = r6
                com.bca.smartbranch.data.localdb.User r4 = r4.m
                java.lang.String r4 = r4.getImei()
                r1.<init>(r2, r3, r4)
                r8 = r0
                r0 = r7
                o.setIncomeDisplayAmount r0 = r0.apiService
                r1 = r8
                retrofit2.Call r0 = r0.e(r1)
                r8 = r0
                r0 = r7
                r1 = r8
                r0.b = r1
                r0 = r8
                com.bca.smartbranch.presenter.GetHBPresenter$5 r1 = new com.bca.smartbranch.presenter.GetHBPresenter$5
                r2 = r1
                r3 = r7
                r2.<init>()
                r0.enqueue(r1)
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.OutwardRemittanceFormActivity.t():void");
        }

        public final void u() {
            ListFormTeller listFormTeller = this.u;
            if (listFormTeller == null || listFormTeller.getCountAll() == 0) {
                SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
                simpanDraftDialog.b = "transaction_teller";
                simpanDraftDialog.show(l(), "SimpanDraftDialog");
                return;
            }
            SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = new SimpanDraftAndHitServiceDialog();
            simpanDraftAndHitServiceDialog.a = this.u.getCountAll();
            simpanDraftAndHitServiceDialog.show(l(), "SimpanDraftAndHitServiceDialog");
        }

        public final void y() {
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.clikedEmailHalloBCA
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    OutwardRemittanceFormActivity.this.e(realm);
                }
            });
            if (this.u.getCountAll() > 0) {
                d(true);
            }
        }
    }
