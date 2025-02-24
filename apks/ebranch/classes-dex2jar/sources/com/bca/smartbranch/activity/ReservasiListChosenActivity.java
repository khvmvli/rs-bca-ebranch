package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.activity.ReservasiListChosenActivity;
import com.bca.smartbranch.activity.ReservasiTellerSuccessActivity;
import com.bca.smartbranch.adapter.DataReservasiAdapter;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.api.response.UpdateRefNumberResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.UserBlockedAfterLoginDialog;
import com.bca.smartbranch.presenter.BeneficiaryBankPresenter;
import com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.DaftarTransferLoadDataORPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.DaftarTransferSetunFromUbahReservasiPresenter;
import com.bca.smartbranch.presenter.GetBankSpecialRelationPresenter;
import com.bca.smartbranch.presenter.GetCategoriesORPresenter;
import com.bca.smartbranch.presenter.GetCustAcctListPresenter;
import com.bca.smartbranch.presenter.GetFundPurposePresenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter;
import com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter;
import com.bca.smartbranch.presenter.KliringPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.bca.smartbranch.presenter.ReservasiListChosenPresenter;
import com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.ChooseSubVisaAdapter$ViewHolder_ViewBinding;
import o.InfoProductActivity;
import o.InfoProductORActivity_ViewBinding;
import o.LandingActivity;
import o.ListUtil;
import o.LoginSessionActivity;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clikedKeyHilang;
import o.getPromotion;
import o.onChooseBankTujuan;
import o.onClickDetail;
import o.onClickUbahTransferBerkala;
import o.onUbahFormReservasiEvent;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import o.subscribeUbahVisaCardEvent;
import o.ubahData;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiListChosenActivity.class */
public class ReservasiListChosenActivity extends BaseActivityPostLogin implements DaftarTransferPresenter.RemoteActionCompatParcelizer, GetCustAcctListPresenter.read, GetHBPresenter.write, ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer, ReRegistrationPresenter.write, GetFundPurposePresenter.IconCompatParcelizer, KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver, GetBankSpecialRelationPresenter.read, GetCategoriesORPresenter.write, DaftarTransferLoadDataORPresenter.RemoteActionCompatParcelizer, InquiryLoadDataBTPresenter.IconCompatParcelizer, DaftarTransferSetunFromUbahReservasiPresenter.IconCompatParcelizer, KliringPresenter.RemoteActionCompatParcelizer {
    private long A;
    private GetCustAcctListResponse B;
    private KategoriTujuanTransaksiORPresenter E;
    private boolean F;
    private GetBankSpecialRelationPresenter J;
    private DaftarTransferLoadDataORPresenter K;
    private BeneficiaryBankPresenter L;
    private DaftarTransferSetunFromUbahReservasiPresenter M;
    private Bundle N;
    private GetFundPurposePresenter O;
    private GetCustAcctListPresenter P;
    private GetHBPresenter Q;
    private InquiryLoadDataBTPresenter R;
    private GetCategoriesORPresenter S;
    private ReservasiListChosenPresenter T;
    private ReRegistrationPresenter U;
    private RealmResults<ReservasiOnline> V;
    private KliringPresenter W;
    private String X;
    private String Y;
    private SendEmailTransactionSuccessPresenter Z;
    private String ab;
    private GetBranchROResponse.DetailBranch ac;
    private BeneficiaryBankResponse ad;
    private KategoriTujuanTransaksiORResponse ae;
    private List<ReservasiOnline> ah;
    public CreateQueueReservationResponse f;
    @BindView(2131297766)
    LinearLayout llMain;
    public ListFormTeller n;
    private CategoriesORResponse p;
    private long r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298323)
    setOnStartEnterTransitionListener rvData;
    private String s;
    private DataReservasiAdapter t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private DaftarTransferPresenter u;
    private Long v;
    private List<DaftarTransferResponse.DaftarTransferOutput> w;
    private long x;
    private List<DaftarTransfer> y;
    private String z;
    private boolean C = false;
    private ArrayList<Long> G = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> ag = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> ak = new ArrayList<>();
    private String aj = "";
    private boolean H = false;
    private String al = "";
    private int q = -1;
    private String ai = "";
    private String D = "N";
    private long I = 0;
    private MasterFundSourcePurposeResponse aa = null;
    private final ArrayList<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> af = new ArrayList<>();
    private final ArrayList<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> am = new ArrayList<>();

    private void C(String str) {
        x();
        if (this.aj.equalsIgnoreCase("TELLER") || this.aj.equalsIgnoreCase("KLIRING")) {
            ReservasiListChosenPresenter reservasiListChosenPresenter = this.T;
            reservasiListChosenPresenter.e.d(reservasiListChosenPresenter.j, str);
            return;
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ReservasiListChosenActivity reservasiListChosenActivity = ReservasiListChosenActivity.this;
                reservasiListChosenActivity.n = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                reservasiListChosenActivity.t();
            }
        });
        if (!this.H) {
            Bundle bundle = new Bundle();
            bundle.putString("type_transaksi", this.ab);
            bundle.putBoolean("from_form", this.F);
            bundle.putString("reff_number", this.X);
            bundle.putParcelable("reservasi", ListUtil.OneItemImmutableList.e(this.f));
            bundle.putParcelable("data_cabang", ListUtil.OneItemImmutableList.e(this.ac));
            bundle.putString("type_reservation", "NEW_RESERVATION");
            bundle.putString("email_success", str);
            bundle.putString("jenis_ruangan", this.N.getString("jenis_ruangan", ""));
            bundle.putString("IS_FORM_SUBMITTED", this.D);
            Intent intent = new Intent(this, ReservasiROSuccessActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        this.N.putString("email_success", str);
        this.N.putString("IS_FORM_SUBMITTED", this.D);
        Intent intent2 = new Intent(this, ReservasiROSuccessActivity.class);
        intent2.putExtras(this.N);
        startActivity(intent2);
    }

    private void D() {
        getPromotion.d(this);
        this.K.e(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Transfer Valuta Asing"));
    }

    private void G() {
        if (this.al.equals(ReservasiOnline.TARIKAN_TUNAI)) {
            this.P.b(this.m, "Tarikan Tunai");
        } else if (this.al.equals(ReservasiOnline.OUTWARD_REMITTANCE)) {
            this.P.b(this.m, "Transfer Valuta Asing");
        } else if (this.al.equals(ReservasiOnline.KIRIMAN_UANG)) {
            this.P.b(this.m, "Kiriman Uang");
        } else if (this.al.equals(ReservasiOnline.KLIRING)) {
            this.P.b(this.m, "Kliring");
        }
    }

    public static /* synthetic */ void a(Account account) {
        if (!account.getTypeID().equals("Paspor")) {
            account.setCitizen("ID");
            account.setHmCountry("INDONESIA");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0dad  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0db8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ea2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0eb7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0ed7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0ee2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0efd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0fff  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x1030  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04c7  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private com.bca.smartbranch.data.api.request.TxnTellerRequest b(boolean r8) {
        /*
        // Method dump skipped, instructions count: 4276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiListChosenActivity.b(boolean):com.bca.smartbranch.data.api.request.TxnTellerRequest");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferSetunFromUbahReservasiPresenter.IconCompatParcelizer
    public final void A() {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormReservasiUbahTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("id", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void A(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void B() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void B(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void C() {
        x();
        new UserBlockedAfterLoginDialog().show(l(), "UserBlockedAfterLoginDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void D(String str) {
        this.X = str;
        this.D = "Y";
        if (this.ai.equals("Transaksi Teller")) {
            this.Z.a(getPromotion.e(this.m), this.m.getEmail(), new LoginSessionActivity(str));
        } else {
            this.Z.d(new LoginSessionActivity_ViewBinding(this.m.getEmail(), str));
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void a(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse, GetCustAcctListResponse getCustAcctListResponse, List<onClickDetail.RemoteActionCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list3, List<? extends DaftarTransferResponse.DaftarTransferOutput> list4, String str) {
        x();
        if (str.equals("LOAD_DATA")) {
            Intent intent = new Intent(this, ubahData.class);
            ubahData.write write = ubahData.h;
            intent.putExtra(ubahData.G, false);
            ubahData.write write2 = ubahData.h;
            intent.putExtra(ubahData.F, true);
            ubahData.write write3 = ubahData.h;
            intent.putExtra(ubahData.E, this.A);
            ubahData.write write4 = ubahData.h;
            intent.putExtra(ubahData.M, "bank_transfer");
            if (getCustAcctListResponse != null) {
                ubahData.write write5 = ubahData.h;
                intent.putExtra(ubahData.H, ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            }
            ubahData.write write6 = ubahData.h;
            intent.putExtra(ubahData.A, ListUtil.OneItemImmutableList.e(list));
            ubahData.write write7 = ubahData.h;
            intent.putExtra(ubahData.I, ListUtil.OneItemImmutableList.e(list2));
            ubahData.write write8 = ubahData.h;
            intent.putExtra(ubahData.L, ListUtil.OneItemImmutableList.e(list3));
            ubahData.write write9 = ubahData.h;
            intent.putExtra(ubahData.z, ListUtil.OneItemImmutableList.e(list4));
            startActivity(intent);
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        C("");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferSetunFromUbahReservasiPresenter.IconCompatParcelizer
    public final void a(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        x();
        this.y = new ArrayList();
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
            DaftarTransfer daftarTransfer = new DaftarTransfer();
            daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
            daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
            daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
            this.y.add(daftarTransfer);
        }
        Intent intent = new Intent(this, FormReservasiUbahTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(this.y));
        intent.putExtra("id", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    public final /* synthetic */ void b(Intent intent, Realm realm) {
        ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        this.n = listFormTeller;
        if (listFormTeller != null && !listFormTeller.getKliringList().isEmpty()) {
            Kliring kliring = new Kliring();
            if (this.m.getNoHandphone() != null) {
                this.m.getNoHandphone();
            }
            kliring.setId(System.currentTimeMillis());
            kliring.setNamaPenerima(this.n.getKliringList().get(0).getNamaPenerima());
            kliring.setNomorRekening(this.n.getKliringList().get(0).getNomorRekening());
            kliring.setTipeNasabah(this.n.getKliringList().get(0).getTipeNasabah());
            kliring.setTipeNasabahId(this.n.getKliringList().get(0).getTipeNasabahId());
            intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(kliring));
            intent.putExtra("isAutoFill", true);
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(BeneficiaryBankResponse beneficiaryBankResponse) {
        this.ad = beneficiaryBankResponse;
        x();
        Intent intent = new Intent(this, OutwardRemittanceFormActivity.class);
        intent.putExtra("id_draft", false);
        intent.putExtra("is_from_reservation", true);
        intent.putExtra("id_reservation", this.A);
        intent.putExtra("TellerType", "kirim_uang");
        intent.putExtra("data_beneficiary", ListUtil.OneItemImmutableList.e(this.ad));
        intent.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(this.ae));
        intent.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(this.p));
        intent.putExtra("data_daftar_transfer", ListUtil.OneItemImmutableList.e(this.w));
        GetCustAcctListResponse getCustAcctListResponse = this.B;
        if (getCustAcctListResponse != null) {
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void b(GetCustAcctListResponse getCustAcctListResponse) {
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferLoadDataORPresenter.RemoteActionCompatParcelizer
    public final void b(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        if (list != null) {
            this.w = list;
        }
        this.S.c(getPromotion.e(this.m), "C015");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void c(GetCustAcctListResponse getCustAcctListResponse) {
        this.B = getCustAcctListResponse;
        if (!this.C) {
            if (this.al.equals(ReservasiOnline.TARIKAN_TUNAI)) {
                x();
                Intent intent = new Intent(this, TarikanTransaksiActivity.class);
                intent.putExtra("id_draft", false);
                intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(this.B));
                intent.putExtra("is_from_reservation", true);
                intent.putExtra("id_reservation", this.A);
                startActivity(intent);
            } else if (this.al.equals(ReservasiOnline.OUTWARD_REMITTANCE)) {
                x();
                Intent intent2 = new Intent(this, OutwardRemittanceFormActivity.class);
                intent2.putExtra("id_draft", false);
                intent2.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(this.B));
                intent2.putExtra("is_from_reservation", true);
                intent2.putExtra("id_reservation", this.A);
                startActivity(intent2);
            } else if (this.al.equals(ReservasiOnline.KIRIMAN_UANG)) {
                x();
                Intent intent3 = new Intent(this, ubahData.class);
                ubahData.write write = ubahData.h;
                intent3.putExtra(ubahData.G, false);
                ubahData.write write2 = ubahData.h;
                intent3.putExtra(ubahData.H, ListUtil.OneItemImmutableList.e(this.B));
                ubahData.write write3 = ubahData.h;
                intent3.putExtra(ubahData.F, true);
                ubahData.write write4 = ubahData.h;
                intent3.putExtra(ubahData.E, this.A);
                startActivity(intent3);
            } else if (this.al.equals(ReservasiOnline.KLIRING)) {
                this.ag.clear();
                this.ak.clear();
                this.W.d(this.m, "Individu");
            }
        } else if (this.al.equals(ReservasiOnline.TARIKAN_TUNAI)) {
            x();
            Intent intent4 = new Intent(this, TarikanReservasiUbahTransaksiActivity.class);
            intent4.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(this.B));
            intent4.putExtra("id", this.A);
            startActivity(intent4);
        } else if (this.al.equals(ReservasiOnline.OUTWARD_REMITTANCE)) {
            x();
            D();
        }
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void c(KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse) {
        this.ae = kategoriTujuanTransaksiORResponse;
        String iSONegaraTujuanTransaksi = ((KirimanUang) this.k.where(KirimanUang.class).equalTo("id", Long.valueOf(this.A)).findFirst()).getISONegaraTujuanTransaksi();
        if (!iSONegaraTujuanTransaksi.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Email", this.m.getEmail());
                jSONObject.put("SessionId", this.m.getSessionId());
                jSONObject.put("IMEI", this.m.getImei());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.L.d(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), iSONegaraTujuanTransaksi, "BIC");
            return;
        }
        x();
        Intent intent = new Intent(this, OutwardRemittanceFormActivity.class);
        intent.putExtra("id_draft", false);
        intent.putExtra("is_from_reservation", true);
        intent.putExtra("id_reservation", this.A);
        intent.putExtra("TellerType", "kirim_uang");
        intent.putExtra("data_beneficiary", ListUtil.OneItemImmutableList.e(this.ad));
        intent.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(this.ae));
        intent.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(this.p));
        intent.putExtra("data_daftar_transfer", ListUtil.OneItemImmutableList.e(this.w));
        GetCustAcctListResponse getCustAcctListResponse = this.B;
        if (getCustAcctListResponse != null) {
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitActivationDialog limitActivationDialog = new LimitActivationDialog();
        limitActivationDialog.setArguments(bundle);
        limitActivationDialog.show(l(), LimitActivationDialog.TAG);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        C("");
    }

    public final /* synthetic */ void d(Intent intent, Realm realm) {
        ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        this.n = listFormTeller;
        if (listFormTeller == null || listFormTeller.getKliringList().isEmpty()) {
            Kliring kliring = new Kliring();
            String str = "";
            if (this.m.getNoHandphone() != null) {
                str = this.m.getNoHandphone().isEmpty() ? "" : "62";
            }
            kliring.setId(System.currentTimeMillis());
            kliring.setNamaPenerima(this.m.getName());
            kliring.setKodeNegara(str);
            kliring.setNomorHp(this.m.getNoHandphone());
            kliring.setTipeNasabah("Individu");
            kliring.setTipeNasabahId("0");
            intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(kliring));
            intent.putExtra("isAutoFill", true);
        } else {
            Kliring kliring2 = new Kliring();
            String str2 = "";
            if (this.m.getNoHandphone() != null) {
                str2 = this.m.getNoHandphone().isEmpty() ? "" : "62";
            }
            kliring2.setId(System.currentTimeMillis());
            kliring2.setNamaPenerima(this.n.getKliringList().get(0).getNamaPenerima());
            kliring2.setNomorRekening(this.n.getKliringList().get(0).getNomorRekening());
            kliring2.setNomorHp(this.m.getNoHandphone());
            kliring2.setKodeNegara(str2);
            kliring2.setTipeNasabah(this.n.getKliringList().get(0).getTipeNasabah());
            kliring2.setTipeNasabahId(this.n.getKliringList().get(0).getTipeNasabahId());
            intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(kliring2));
            intent.putExtra("isAutoFill", true);
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.N = getIntent().getExtras();
        this.f10o = false;
        this.ac = (GetBranchROResponse.DetailBranch) ListUtil.OneItemImmutableList.a(this.N.getParcelable("data_cabang"));
        this.f = (CreateQueueReservationResponse) ListUtil.OneItemImmutableList.a(this.N.getParcelable("reservasi"));
        this.ab = this.N.getString("type_transaksi", "");
        this.F = this.N.getBoolean("from_form");
        this.s = this.N.getString("BRANCH_CODE");
        this.X = this.f.getReferenceNumber();
        Reservation reservation = (Reservation) ListUtil.OneItemImmutableList.a(this.N.getParcelable("reservation_data"));
        if (reservation != null) {
            this.ai = reservation.getTxnType();
        }
        ReservasiListChosenPresenter reservasiListChosenPresenter = new ReservasiListChosenPresenter();
        this.T = reservasiListChosenPresenter;
        reservasiListChosenPresenter.e = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.Q = getHBPresenter;
        getHBPresenter.e = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.Z = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
        this.U = reRegistrationPresenter;
        reRegistrationPresenter.e = this;
        GetFundPurposePresenter getFundPurposePresenter = new GetFundPurposePresenter();
        this.O = getFundPurposePresenter;
        getFundPurposePresenter.e = this;
        BeneficiaryBankPresenter beneficiaryBankPresenter = new BeneficiaryBankPresenter();
        this.L = beneficiaryBankPresenter;
        beneficiaryBankPresenter.b = this;
        KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter = new KategoriTujuanTransaksiORPresenter();
        this.E = kategoriTujuanTransaksiORPresenter;
        kategoriTujuanTransaksiORPresenter.e = this;
        GetBankSpecialRelationPresenter getBankSpecialRelationPresenter = new GetBankSpecialRelationPresenter();
        this.J = getBankSpecialRelationPresenter;
        getBankSpecialRelationPresenter.b = this;
        GetCategoriesORPresenter getCategoriesORPresenter = new GetCategoriesORPresenter();
        this.S = getCategoriesORPresenter;
        getCategoriesORPresenter.a = this;
        DaftarTransferLoadDataORPresenter daftarTransferLoadDataORPresenter = new DaftarTransferLoadDataORPresenter();
        this.K = daftarTransferLoadDataORPresenter;
        daftarTransferLoadDataORPresenter.a = this;
        InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = new InquiryLoadDataBTPresenter();
        this.R = inquiryLoadDataBTPresenter;
        inquiryLoadDataBTPresenter.e = this;
        DaftarTransferSetunFromUbahReservasiPresenter daftarTransferSetunFromUbahReservasiPresenter = new DaftarTransferSetunFromUbahReservasiPresenter();
        this.M = daftarTransferSetunFromUbahReservasiPresenter;
        daftarTransferSetunFromUbahReservasiPresenter.e = this;
        KliringPresenter kliringPresenter = new KliringPresenter();
        this.W = kliringPresenter;
        kliringPresenter.d = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(2131821745);
        DaftarTransferPresenter daftarTransferPresenter = new DaftarTransferPresenter();
        this.u = daftarTransferPresenter;
        daftarTransferPresenter.c = this;
        GetCustAcctListPresenter getCustAcctListPresenter = new GetCustAcctListPresenter();
        this.P = getCustAcctListPresenter;
        getCustAcctListPresenter.e = this;
        this.t = new DataReservasiAdapter();
        this.rvData.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvData.setAdapter(this.t);
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void d(CategoriesORResponse categoriesORResponse) {
        this.p = categoriesORResponse;
        if (this.m == null || !this.m.getVerified().equals("Y")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Email", this.m.getEmail());
                jSONObject.put("SessionId", this.m.getSessionId());
                jSONObject.put("IMEI", this.m.getImei());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.E.d(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString());
            return;
        }
        G();
    }

    @Override // com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(TxnTellerResponse txnTellerResponse, String str) {
        this.k.executeTransaction(new Realm.Transaction(txnTellerResponse, str) { // from class: o.DetailBerhasilBTActivity_ViewBinding
            public final /* synthetic */ String b;
            public final /* synthetic */ TxnTellerResponse e;

            {
                this.e = r5;
                this.b = r6;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ReservasiListChosenActivity reservasiListChosenActivity = ReservasiListChosenActivity.this;
                TxnTellerResponse txnTellerResponse2 = this.e;
                String str2 = this.b;
                reservasiListChosenActivity.n = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                reservasiListChosenActivity.t();
                Intent intent = new Intent(reservasiListChosenActivity, ReservasiTellerSuccessActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(txnTellerResponse2));
                intent.putExtra("email_success", str2);
                bundle.putParcelable("reservasi", ListUtil.OneItemImmutableList.e(reservasiListChosenActivity.f));
                bundle.putBoolean("is_single_process", false);
                bundle.putString("title", reservasiListChosenActivity.getString(2131822081));
                intent.putExtras(bundle);
                reservasiListChosenActivity.startActivity(intent);
                reservasiListChosenActivity.finish();
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void d(List<clikedKeyHilang> list) {
        this.G.clear();
        for (clikedKeyHilang clikedkeyhilang : list) {
            if (clikedkeyhilang.d.equals("Y")) {
                this.G.add(Long.valueOf(clikedkeyhilang.e));
            }
        }
        if (this.C) {
            x();
            Intent intent = new Intent(this, subscribeUbahVisaCardEvent.class);
            intent.putExtra("is_draft", false);
            intent.putExtra("hide_save_draft", true);
            intent.putExtra("is_from_reservation", true);
            intent.putExtra("isUbahFormEnabled", true);
            intent.putExtra("id_reservation", this.A);
            intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.G));
            intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.ag));
            intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.ak));
            intent.putExtra("isAutoFill", true);
            intent.putExtra("isUbahForm", true);
            Kliring kliring = (Kliring) this.k.where(Kliring.class).equalTo("id", Long.valueOf(this.A)).findFirst();
            if (kliring != null) {
                intent.putExtra("kliring_pos", this.q);
                intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e((Kliring) this.k.copyFromRealm((Realm) kliring)));
                startActivity(intent);
                return;
            }
            return;
        }
        x();
        if (this.m.getVerified().equals("Y")) {
            Intent intent2 = new Intent(this, subscribeUbahVisaCardEvent.class);
            intent2.putExtra("is_draft", false);
            intent2.putExtra("hide_save_draft", true);
            intent2.putExtra("kliring_pos", this.q);
            intent2.putExtra("list_acct", ListUtil.OneItemImmutableList.e(this.B));
            intent2.putExtra("is_from_reservation", true);
            intent2.putExtra("id_reservation", this.A);
            intent2.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.G));
            intent2.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.ag));
            intent2.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.ak));
            this.k.executeTransaction(new Realm.Transaction(intent2) { // from class: o.DetailBerhasilBTActivity
                public final /* synthetic */ Intent e;

                {
                    this.e = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ReservasiListChosenActivity.this.d(this.e, realm);
                }
            });
            return;
        }
        Intent intent3 = new Intent(this, subscribeUbahVisaCardEvent.class);
        intent3.putExtra("is_draft", false);
        intent3.putExtra("hide_save_draft", true);
        intent3.putExtra("is_from_reservation", true);
        intent3.putExtra("id_reservation", this.A);
        intent3.putExtra("kliring_pos", this.q);
        intent3.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.G));
        intent3.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.ag));
        intent3.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.ak));
        this.k.executeTransaction(new Realm.Transaction(intent3) { // from class: o.DetailBerhasilBTNotificationActivity
            public final /* synthetic */ Intent e;

            {
                this.e = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ReservasiListChosenActivity.this.b(this.e, realm);
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        C(str);
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void e(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse) {
        this.aa = masterFundSourcePurposeResponse;
        x();
        if (this.m != null) {
            this.M.a(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), true);
            return;
        }
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormReservasiUbahTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("id", this.A);
        intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("old_cust", this.Y);
        intent.putExtra("is_from_reservation", true);
        intent.putExtra("id_reservation", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        x();
        this.y = new ArrayList();
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
            DaftarTransfer daftarTransfer = new DaftarTransfer();
            daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
            daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
            daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
            this.y.add(daftarTransfer);
        }
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(this.y));
        intent.putExtra("old_cust", this.Y);
        intent.putExtra("is_from_reservation", true);
        intent.putExtra("id_reservation", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void e(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2) {
        this.ag.add(list);
        this.ak.add(list2);
        if (this.ag.size() >= 2 || this.ak.size() >= 2 || this.m.getVerified().equals("Y")) {
            this.W.a(this.m, DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(0).getTimeInMillis()), DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(14).getTimeInMillis()));
            return;
        }
        this.W.d(this.m, "Perusahaan");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("old_cust", this.Y);
        intent.putExtra("is_from_reservation", true);
        intent.putExtra("id_reservation", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void f(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void g(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("old_cust", this.Y);
        intent.putExtra("is_from_reservation", true);
        intent.putExtra("id_reservation", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void h_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void j(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
    @butterknife.OnClick({2131296396})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void lanjut(android.view.View r15) {
        /*
        // Method dump skipped, instructions count: 2138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiListChosenActivity.lanjut(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void m(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void o(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void o_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAktivasiUlangEvent(onChooseBankTujuan onchoosebanktujuan) {
        this.U.e(new LandingActivity(this.m != null ? this.m.getEmail() : ""));
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DaftarTransferPresenter daftarTransferPresenter = this.u;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call = daftarTransferPresenter.a;
        if (call != null) {
            call.cancel();
        }
        daftarTransferPresenter.c = null;
        GetCustAcctListPresenter getCustAcctListPresenter = this.P;
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call2 = getCustAcctListPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        getCustAcctListPresenter.e = null;
        ReservasiListChosenPresenter reservasiListChosenPresenter = this.T;
        Call<OpenAccountSuccessActivity<AccountOpeningResponse>> call3 = reservasiListChosenPresenter.b;
        if (call3 != null) {
            call3.cancel();
        }
        Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> call4 = reservasiListChosenPresenter.d;
        if (call4 != null) {
            call4.cancel();
        }
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call5 = reservasiListChosenPresenter.c;
        if (call5 != null) {
            call5.cancel();
        }
        Call<OpenAccountSuccessActivity<UpdateRefNumberResponse>> call6 = reservasiListChosenPresenter.a;
        if (call6 != null) {
            call6.cancel();
        }
        reservasiListChosenPresenter.e = null;
        GetHBPresenter getHBPresenter = this.Q;
        Call<OpenAccountSuccessActivity<Object>> call7 = getHBPresenter.b;
        if (call7 != null) {
            call7.cancel();
        }
        getHBPresenter.e = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.Z;
        Call<OpenAccountSuccessActivity<Object>> call8 = sendEmailTransactionSuccessPresenter.a;
        if (call8 != null) {
            call8.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
        ReRegistrationPresenter reRegistrationPresenter = this.U;
        Call<OpenAccountSuccessActivity<Object>> call9 = reRegistrationPresenter.b;
        if (call9 != null) {
            call9.cancel();
        }
        reRegistrationPresenter.e = null;
        GetFundPurposePresenter getFundPurposePresenter = this.O;
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call10 = getFundPurposePresenter.c;
        if (call10 != null) {
            call10.cancel();
        }
        getFundPurposePresenter.e = null;
        BeneficiaryBankPresenter beneficiaryBankPresenter = this.L;
        Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> call11 = beneficiaryBankPresenter.e;
        if (call11 != null) {
            call11.cancel();
        }
        beneficiaryBankPresenter.e = null;
        KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter = this.E;
        Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call12 = kategoriTujuanTransaksiORPresenter.c;
        if (call12 != null) {
            call12.cancel();
        }
        kategoriTujuanTransaksiORPresenter.c = null;
        GetBankSpecialRelationPresenter getBankSpecialRelationPresenter = this.J;
        Call<OpenAccountSuccessActivity<GetBankSpecialRelationResponse>> call13 = getBankSpecialRelationPresenter.c;
        if (call13 != null) {
            call13.cancel();
        }
        getBankSpecialRelationPresenter.c = null;
        GetCategoriesORPresenter getCategoriesORPresenter = this.S;
        Call<OpenAccountSuccessActivity<CategoriesORResponse>> call14 = getCategoriesORPresenter.d;
        if (call14 != null) {
            call14.cancel();
        }
        getCategoriesORPresenter.d = null;
        DaftarTransferLoadDataORPresenter daftarTransferLoadDataORPresenter = this.K;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call15 = daftarTransferLoadDataORPresenter.e;
        if (call15 != null) {
            call15.cancel();
        }
        daftarTransferLoadDataORPresenter.a = null;
        this.R.e();
        DaftarTransferSetunFromUbahReservasiPresenter daftarTransferSetunFromUbahReservasiPresenter = this.M;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call16 = daftarTransferSetunFromUbahReservasiPresenter.c;
        if (call16 != null) {
            call16.cancel();
        }
        daftarTransferSetunFromUbahReservasiPresenter.e = null;
        this.W.b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onExitForm(onUbahFormReservasiEvent onubahformreservasievent) {
        if (onubahformreservasievent.b.equals("Y")) {
            this.H = true;
            this.Z.c(new LoginSessionActivity_ViewBinding(this.m.getEmail(), this.X));
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onIsiFormReservasiEvent(onClickUbahTransferBerkala onclickubahtransferberkala) {
        GetHBPresenter getHBPresenter = this.Q;
        Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
        getHBPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE  
              (r0v5 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x0035: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v1 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.ReservasiListChosenActivity.onIsiFormReservasiEvent(o.onClickUbahTransferBerkala):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiListChosenActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            	... 15 more
            */
        /*
        // Method dump skipped, instructions count: 827
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiListChosenActivity.onIsiFormReservasiEvent(o.onClickUbahTransferBerkala):void");
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
            new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        onPointerCaptureChanged(z);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, android.app.Activity
    public void onResume() {
        onResume();
        this.V = this.k.where(ReservasiOnline.class).findAll();
        RealmResults findAll = this.k.where(ReservasiOnline.class).sort("editable", Sort.DESCENDING).findAll();
        ArrayList arrayList = new ArrayList();
        this.ah = arrayList;
        arrayList.addAll(this.k.copyFromRealm(findAll));
        DataReservasiAdapter dataReservasiAdapter = this.t;
        List<ReservasiOnline> list = this.ah;
        dataReservasiAdapter.e = false;
        dataReservasiAdapter.b = list;
        dataReservasiAdapter.a.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Stetho$Initializer$RealSocketHandlerFactory
    public void onUbahFormReservasiEvent(ChooseSubVisaAdapter$ViewHolder_ViewBinding chooseSubVisaAdapter$ViewHolder_ViewBinding) {
        char c;
        char c2;
        GetHBPresenter getHBPresenter = this.Q;
        Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
        getHBPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE  
              (r0v5 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x0035: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v1 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.ReservasiListChosenActivity.onUbahFormReservasiEvent(o.ChooseSubVisaAdapter$ViewHolder_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiListChosenActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            	... 15 more
            */
        /*
        // Method dump skipped, instructions count: 1120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiListChosenActivity.onUbahFormReservasiEvent(o.ChooseSubVisaAdapter$ViewHolder_ViewBinding):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "ReservasiListChosenActivity";
        this.j = "ReservasiListChosenActivity";
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void p(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492991;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void r(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void s(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    public void t() {
        ListFormTeller listFormTeller = this.n;
        if (listFormTeller != null) {
            if (listFormTeller.getSetoranList() != null && this.n.getSetoranList().isValid()) {
                this.n.getSetoranList().deleteAllFromRealm();
            }
            if (this.n.getTarikanList() != null && this.n.getTarikanList().isValid()) {
                this.n.getTarikanList().deleteAllFromRealm();
            }
            if (this.n.getKirimanUangList() != null && this.n.getKirimanUangList().isValid()) {
                this.n.getKirimanUangList().deleteAllFromRealm();
            }
            if (this.n.getKliringList() != null && this.n.getKliringList().isValid()) {
                this.n.getKliringList().deleteAllFromRealm();
            }
            ListFormTeller listFormTeller2 = this.n;
            if (listFormTeller2 != null && listFormTeller2.isValid()) {
                this.n.deleteFromRealm();
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void t(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void t_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferSetunFromUbahReservasiPresenter.IconCompatParcelizer
    public final void u() {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormReservasiUbahTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("id", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void u(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void u_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferSetunFromUbahReservasiPresenter.IconCompatParcelizer
    public final void v() {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormReservasiUbahTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("id", this.A);
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.aa;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void v(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void v_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void x(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void y() {
        x();
        Intent intent = new Intent(this, ReRegistrationSuccessActivity.class);
        intent.putExtra("email", this.m != null ? this.m.getEmail() : "");
        startActivity(intent);
        finishAffinity();
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void y(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void y_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void z(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void z_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }
}
