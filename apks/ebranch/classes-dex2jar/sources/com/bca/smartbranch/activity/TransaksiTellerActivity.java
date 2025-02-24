package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.TransaksiTellerActivity;
import com.bca.smartbranch.adapter.MenuTransactionAdapter;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.global.BranchDetail;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.ReservasiTellerDialog;
import com.bca.smartbranch.presenter.CheckCutOffPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.GetCustAcctListPresenter;
import com.bca.smartbranch.presenter.GetCustDataPresenter;
import com.bca.smartbranch.presenter.KliringPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding;
import o.InfoProductActivity;
import o.ListUtil;
import o.LoginSessionActivity;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.choose;
import o.clikedKeyHilang;
import o.documentProvider;
import o.fillForm;
import o.getCardGroupType;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
import o.setOnStartEnterTransitionListener;
import o.subscribeUbahVisaCardEvent;
import o.ubahData;
import org.joda.time.format.DateTimeFormat;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TransaksiTellerActivity.class */
public class TransaksiTellerActivity extends BaseActivityPostLogin implements DaftarTransferPresenter.RemoteActionCompatParcelizer, CheckCutOffPresenter.read, GetCustDataPresenter.write, GetCustAcctListPresenter.read, TxnTellerPresenter.IconCompatParcelizer, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer, KliringPresenter.RemoteActionCompatParcelizer {
    private GetCustDataPresenter A;
    private BranchDetail B;
    private TxnTellerPresenter C;
    private KliringPresenter D;
    private TxnTellerResponse F;
    private String G;
    @BindView(2131296397)
    Button btnLewati;
    @BindView(2131297766)
    LinearLayout llMain;
    public ListFormTeller n;
    private CheckCutOffPresenter p;
    private boolean q;
    private DaftarTransferPresenter r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298331)
    setOnStartEnterTransitionListener rvMenu;
    public String t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822285)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private MenuTransactionAdapter u;
    private GetCustAcctListPresenter v;
    private GetCustAcctListResponse x;
    private SendEmailTransactionSuccessPresenter z;
    private long y = 0;
    private ArrayList<Long> w = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> H = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> I = new ArrayList<>();
    private boolean s = false;
    private String E = "";
    public boolean f = false;

    private void c(boolean z, String str) {
        x();
        if (this.E.equals("kliring")) {
            TxnTellerPresenter txnTellerPresenter = this.C;
            txnTellerPresenter.d.b(txnTellerPresenter.c);
            return;
        }
        String noReff = this.F.getTxnDataOutput().getNoReff();
        if (this.F.getTxnDataOutput().getDescriptionList() != null) {
            this.F.getTxnDataOutput().getDescriptionList().get(0).getKey();
        }
        if (this.F.getTxnDataOutput().getDescriptionList() != null) {
            this.F.getTxnDataOutput().getDescriptionList().get(0).getValue();
        }
        this.F.getTxnDataOutput().getNote();
        String email = "";
        email = this.m != null ? this.m.getEmail() : "";
        try {
            ListFormTeller listFormTeller = this.n;
            if (!(listFormTeller == null || listFormTeller.getSetoranList() == null)) {
                if (!this.n.getSetoranList().isEmpty()) {
                    email = this.n.getSetoranList().get(0).getSenderEmail();
                } else if (!this.n.getTarikanList().isEmpty()) {
                    email = this.n.getTarikanList().get(0).getEmail();
                }
            }
        } catch (Exception e) {
            if (this.m != null) {
                email = this.m.getEmail();
            }
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.hapus
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TransaksiTellerActivity transaksiTellerActivity = TransaksiTellerActivity.this;
                ListFormTeller listFormTeller2 = transaksiTellerActivity.n;
                if (listFormTeller2 != null) {
                    if (listFormTeller2.getSetoranList() != null && transaksiTellerActivity.n.getSetoranList().isValid()) {
                        transaksiTellerActivity.n.getSetoranList().deleteAllFromRealm();
                    }
                    if (transaksiTellerActivity.n.getTarikanList() != null && transaksiTellerActivity.n.getTarikanList().isValid()) {
                        transaksiTellerActivity.n.getTarikanList().deleteAllFromRealm();
                    }
                    if (transaksiTellerActivity.n.getKirimanUangList() != null && transaksiTellerActivity.n.getKirimanUangList().isValid()) {
                        transaksiTellerActivity.n.getKirimanUangList().deleteAllFromRealm();
                    }
                    if (transaksiTellerActivity.n.getKliringList() != null && transaksiTellerActivity.n.getKliringList().isValid()) {
                        transaksiTellerActivity.n.getKliringList().deleteAllFromRealm();
                    }
                    if (transaksiTellerActivity.n.getBankTransferList() != null && transaksiTellerActivity.n.getBankTransferList().isValid()) {
                        transaksiTellerActivity.n.getBankTransferList().deleteAllFromRealm();
                    }
                    if (transaksiTellerActivity.n.getKliringList() != null && transaksiTellerActivity.n.getKliringList().isValid()) {
                        transaksiTellerActivity.n.getKliringList().deleteAllFromRealm();
                    }
                    ListFormTeller listFormTeller3 = transaksiTellerActivity.n;
                    if (listFormTeller3 != null && listFormTeller3.isValid()) {
                        transaksiTellerActivity.n.deleteFromRealm();
                    }
                }
            }
        });
        if (this.s) {
            Reservation reservation = new Reservation();
            reservation.setTypeTransaction("Transaksi Teller");
            reservation.setTypeReservation("NEW_RESERVATION");
            reservation.setTxnType("Transaksi Teller");
            reservation.setNoReff(noReff);
            reservation.setTnxStatus("8");
            reservation.setTransactionCode(this.t);
            Intent intent = new Intent(this, BranchMapActivity.class);
            intent.putExtra("reff_no", reservation.getNoReff());
            intent.putExtra("type_transaksi", reservation.getTypeTransaction());
            intent.putExtra("type_reservation", reservation.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
            intent.putExtra("txn_data", ListUtil.OneItemImmutableList.e(this.F.getTxnDataOutput()));
            intent.putExtra("is_tartun_jumbes", this.f);
            startActivity(intent);
            setOnHierarchyChangeListener.d((Activity) this);
            return;
        }
        Intent intent2 = new Intent(this, DetailOpenTellerActivity.class);
        intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.F.getTxnDataOutput()));
        intent2.putExtra("email", email);
        intent2.putExtra("no_reff", noReff);
        if (z) {
            intent2.putExtra("email_success", str);
        }
        startActivity(intent2);
        setOnHierarchyChangeListener.d((Activity) this);
    }

    private void v() {
        if (this.E.equals("tarikan")) {
            this.v.b(this.m, "Tarikan Tunai");
        } else if (this.E.equals("bank_transfer")) {
            this.v.b(this.m, "Kiriman Uang");
        } else if (this.E.equals("kliring")) {
            this.v.b(this.m, "Kliring");
        } else {
            this.v.b(this.m, "Transfer Valuta Asing");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d0b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0d58  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0ea6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0308  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void y() {
        /*
        // Method dump skipped, instructions count: 4844
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.TransaksiTellerActivity.y():void");
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

    public final /* synthetic */ void a(TxnTellerResponse txnTellerResponse) {
        RealmResults findAll = this.k.where(Kliring.class).findAll();
        if (findAll != null && findAll.size() > 0) {
            for (int i = 0; i < findAll.size() - 1; i++) {
                ((Kliring) findAll.get(i)).getListWarkat().deleteAllFromRealm();
                ((Kliring) findAll.get(i)).deleteFromRealm();
            }
        }
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
            if (this.n.getBankTransferList() != null && this.n.getBankTransferList().isValid()) {
                this.n.getBankTransferList().deleteAllFromRealm();
            }
            if (this.n.getKliringList() != null && this.n.getKliringList().isValid()) {
                this.n.getKliringList().deleteAllFromRealm();
            }
            ListFormTeller listFormTeller2 = this.n;
            if (listFormTeller2 != null && listFormTeller2.isValid()) {
                this.n.deleteFromRealm();
            }
        }
        if (txnTellerResponse != null) {
            Intent intent = new Intent(this, ReservasiTellerSuccessActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(txnTellerResponse));
            bundle.putBoolean("is_single_process", true);
            bundle.putString("title", getString(2131822033));
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return;
        }
        Toast.makeText(getApplicationContext(), "Response Kliring null", 1).show();
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        c(false, str);
    }

    @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        if (this.F != null) {
            c(false, "");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void b(GetCustAcctListResponse getCustAcctListResponse) {
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(TxnTellerResponse txnTellerResponse) {
        x();
        this.k.executeTransaction(new Realm.Transaction(txnTellerResponse) { // from class: o.hapusDaftarTransferEvent
            public final /* synthetic */ TxnTellerResponse d;

            {
                this.d = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TransaksiTellerActivity.this.a(this.d);
            }
        });
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
        x();
        if (this.E.equals("tarikan")) {
            Intent intent = new Intent(this, TarikanTransaksiActivity.class);
            intent.putExtra("id_draft", false);
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent);
        } else if (this.E.equals("kirim_uang")) {
            Intent intent2 = new Intent(this, OutwardRemittanceFormActivity.class);
            intent2.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent2);
        } else if (this.E.equals("bank_transfer")) {
            Intent intent3 = new Intent(this, ubahData.class);
            intent3.putExtra("id_draft", false);
            intent3.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent3);
        } else if (this.E.equals("kliring")) {
            this.x = getCustAcctListResponse;
            this.H.clear();
            this.I.clear();
            this.D.d(this.m, "Individu");
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        this.F = txnTellerResponse;
        String imei = this.m != null ? this.m.getImei() : Settings.Secure.getString(getContentResolver(), "android_id");
        if (this.m != null) {
            this.m.getSessionId();
        }
        String str = this.m != null ? "N" : "Y";
        String email = this.m != null ? this.m.getEmail() : "";
        String str2 = email;
        if (email.isEmpty()) {
            if (!this.n.getSetoranList().isEmpty()) {
                str2 = this.n.getSetoranList().get(0).getSenderEmail();
            } else {
                str2 = email;
                if (!this.n.getTarikanList().isEmpty()) {
                    str2 = this.n.getTarikanList().get(0).getEmail();
                }
            }
        }
        this.z.a(getPromotion.e(this.m, str, imei, str2), str2, new LoginSessionActivity(txnTellerResponse.getTxnDataOutput().getNoReff()));
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        c(false, str);
    }

    public final /* synthetic */ void d(Intent intent, Realm realm) {
        this.n = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        String str = (this.m.getNoHandphone() == null || this.m.getNoHandphone().isEmpty()) ? "" : "62";
        Kliring kliring = new Kliring();
        ListFormTeller listFormTeller = this.n;
        if (listFormTeller == null || listFormTeller.getKliringList().isEmpty()) {
            kliring.setId(System.currentTimeMillis());
            kliring.setNamaPenerima(this.m.getName());
            kliring.setKodeNegara(str);
            kliring.setNomorHp(this.m.getNoHandphone());
            kliring.setTipeNasabah("Individu");
            kliring.setTipeNasabahId("0");
        } else {
            kliring.setId(System.currentTimeMillis());
            kliring.setNamaPenerima(this.n.getKliringList().get(0).getNamaPenerima());
            kliring.setNomorRekening(this.n.getKliringList().get(0).getNomorRekening() == null ? this.m.getAcctNo() : this.n.getKliringList().get(0).getNomorRekening());
            kliring.setKodeNegara(str);
            kliring.setNomorHp(this.m.getNoHandphone());
            kliring.setTipeNasabah(this.n.getKliringList().get(0).getTipeNasabah());
            kliring.setTipeNasabahId(this.n.getKliringList().get(0).getTipeNasabahId());
        }
        intent.putExtra("kliring_pos", this.n.getKliringList().size() - 1);
        intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(kliring));
        intent.putExtra("isAutoFill", true);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.f10o = false;
        DaftarTransferPresenter daftarTransferPresenter = new DaftarTransferPresenter();
        this.r = daftarTransferPresenter;
        daftarTransferPresenter.c = this;
        CheckCutOffPresenter checkCutOffPresenter = new CheckCutOffPresenter();
        this.p = checkCutOffPresenter;
        checkCutOffPresenter.b = this;
        GetCustDataPresenter getCustDataPresenter = new GetCustDataPresenter();
        this.A = getCustDataPresenter;
        getCustDataPresenter.d = this;
        GetCustAcctListPresenter getCustAcctListPresenter = new GetCustAcctListPresenter();
        this.v = getCustAcctListPresenter;
        getCustAcctListPresenter.e = this;
        TxnTellerPresenter txnTellerPresenter = new TxnTellerPresenter();
        this.C = txnTellerPresenter;
        txnTellerPresenter.d = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.z = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        KliringPresenter kliringPresenter = new KliringPresenter();
        this.D = kliringPresenter;
        kliringPresenter.d = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        if (this.m == null || this.m.getAcctNo() == null || this.m.getAcctNo().isEmpty()) {
            this.G = "N";
        } else {
            this.G = "Y";
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.q = extras.getBoolean("is_multiple_transaction", false);
            if (extras.getParcelable("dataReservasi") != null) {
                this.B = (BranchDetail) ListUtil.OneItemImmutableList.a(extras.getParcelable("dataReservasi"));
            }
        }
        ArrayList arrayList = new ArrayList();
        choose choose = new choose();
        choose.a = 2131231369;
        choose.c = 2131822110;
        choose.d = "setoran";
        arrayList.add(choose);
        choose choose2 = new choose();
        choose2.a = 2131231283;
        choose2.c = 2131822165;
        choose2.d = "tarikan";
        arrayList.add(choose2);
        choose choose3 = new choose();
        choose3.c = 2131822338;
        choose3.d = "outward_remittance";
        if (this.m != null) {
            choose3.a = 2131231275;
            choose3.e = true;
        } else {
            choose3.a = 2131231169;
            choose3.e = false;
        }
        arrayList.add(choose3);
        choose choose4 = new choose();
        choose4.a = 2131230821;
        choose4.c = 2131821348;
        choose4.d = "bank_transfer";
        arrayList.add(choose4);
        if (this.m != null && !this.q) {
            choose choose5 = new choose();
            choose5.c = 2131821890;
            choose5.d = "bank_notes";
            choose5.a = 2131231231;
            arrayList.add(choose5);
        }
        choose choose6 = new choose();
        choose6.a = 2131231223;
        choose6.c = 2131821803;
        choose6.d = "kliring";
        arrayList.add(choose6);
        if (!this.q) {
            this.btnLewati.setVisibility(8);
        } else {
            this.toolbar.setVisibility(8);
        }
        MenuTransactionAdapter menuTransactionAdapter = new MenuTransactionAdapter();
        this.u = menuTransactionAdapter;
        menuTransactionAdapter.b = arrayList;
        menuTransactionAdapter.a.b();
        this.rvMenu.setLayoutManager(new GridLayoutManager(this, 3));
        this.rvMenu.e(new getCardGroupType(20));
        this.rvMenu.setAdapter(this.u);
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailDaftarTransferBTActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TransaksiTellerActivity.this.n = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void d(CustDataResponse custDataResponse) {
        x();
        Intent intent = new Intent(this, FormBankNotesActivity.class);
        intent.putExtra("data_cust", ListUtil.OneItemImmutableList.e(custDataResponse));
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void d(List<clikedKeyHilang> list) {
        x();
        this.w.clear();
        for (clikedKeyHilang clikedkeyhilang : list) {
            if (clikedkeyhilang.d.equals("Y")) {
                this.w.add(Long.valueOf(clikedkeyhilang.e));
            }
        }
        if (this.m.getVerified().equals("Y")) {
            Intent intent = new Intent(this, subscribeUbahVisaCardEvent.class);
            intent.putExtra("id_draft", false);
            intent.putExtra("is_from_reservation", false);
            intent.putExtra("list_acct", ListUtil.OneItemImmutableList.e(this.x));
            intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.H));
            intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.I));
            intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.w));
            this.k.executeTransaction(new Realm.Transaction(intent) { // from class: o.ubah
                public final /* synthetic */ Intent a;

                {
                    this.a = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    TransaksiTellerActivity.this.d(this.a, realm);
                }
            });
            return;
        }
        Intent intent2 = new Intent(this, subscribeUbahVisaCardEvent.class);
        intent2.putExtra("is_draft", false);
        intent2.putExtra("is_from_reservation", false);
        intent2.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.H));
        intent2.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.I));
        intent2.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.w));
        this.k.executeTransaction(new Realm.Transaction(intent2) { // from class: o.ubahKeterangan
            public final /* synthetic */ Intent b;

            {
                this.b = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TransaksiTellerActivity transaksiTellerActivity = TransaksiTellerActivity.this;
                Intent intent3 = this.b;
                ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                transaksiTellerActivity.n = listFormTeller;
                if (listFormTeller != null && !listFormTeller.getKliringList().isEmpty()) {
                    Kliring kliring = new Kliring();
                    kliring.setId(System.currentTimeMillis());
                    kliring.setNamaPenerima(transaksiTellerActivity.n.getKliringList().get(0).getNamaPenerima());
                    kliring.setNomorRekening(transaksiTellerActivity.n.getKliringList().get(0).getNomorRekening());
                    kliring.setTipeNasabah(transaksiTellerActivity.n.getKliringList().get(0).getTipeNasabah());
                    kliring.setTipeNasabahId(transaksiTellerActivity.n.getKliringList().get(0).getTipeNasabahId());
                    intent3.putExtra("kliring_pos", transaksiTellerActivity.n.getKliringList().size() - 1);
                    intent3.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(kliring));
                    intent3.putExtra("isAutoFill", true);
                }
            }
        });
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        c(true, str);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("old_cust", this.G);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        x();
        ArrayList arrayList = new ArrayList();
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
            DaftarTransfer daftarTransfer = new DaftarTransfer();
            daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
            daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
            daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
            arrayList.add(daftarTransfer);
        }
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("old_cust", this.G);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void e(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2) {
        this.H.add(list);
        this.I.add(list2);
        if (this.H.size() >= 2 || this.I.size() >= 2 || this.m.getVerified().equals("Y")) {
            this.D.a(this.m, DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(0).getTimeInMillis()), DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(14).getTimeInMillis()));
            return;
        }
        this.D.d(this.m, "Perusahaan");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        intent.putExtra("old_cust", this.G);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read
    public final void f(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
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
        intent.putExtra("old_cust", this.G);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void i(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
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
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read
    public final void m(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void n(String str) {
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

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
    }

    @OnClick({2131296397})
    public void onClicedButton(View view) {
        if (this.m != null) {
            Bundle bundle = new Bundle();
            bundle.putString("product", "Transaksi Teller");
            ReservasiTellerDialog reservasiTellerDialog = new ReservasiTellerDialog(true);
            reservasiTellerDialog.setArguments(bundle);
            reservasiTellerDialog.show(l(), "ReservasiTellerDialog");
            return;
        }
        y();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Stetho$Initializer$RealSocketHandlerFactory
    public void onClickMenu(choose choose) {
        char c;
        String str = choose.d;
        str.hashCode();
        switch (str.hashCode()) {
            case -1624430962:
                if (str.equals("bank_transfer")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1538212364:
                if (str.equals("tarikan")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -628935336:
                if (str.equals("kliring")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 426121982:
                if (str.equals("bank_notes")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 589614131:
                if (str.equals("outward_remittance")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1985800370:
                if (str.equals("setoran")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.E = "bank_transfer";
            if (this.m.getVerified().equals("Y")) {
                v();
                return;
            }
            Intent intent = new Intent(this, ubahData.class);
            intent.putExtra("id_draft", false);
            startActivity(intent);
        } else if (c == 1) {
            this.E = "tarikan";
            if (this.m == null || !this.m.getVerified().equals("Y")) {
                Intent intent2 = new Intent(this, TarikanTransaksiActivity.class);
                intent2.putExtra("id_draft", false);
                startActivity(intent2);
                return;
            }
            v();
        } else if (c == 2) {
            this.E = "kliring";
            if (SystemClock.elapsedRealtime() - this.y >= 3000) {
                this.y = SystemClock.elapsedRealtime();
                if (this.m == null || !this.m.getVerified().equals("Y")) {
                    this.H.clear();
                    this.I.clear();
                    this.D.d(this.m, "Individu");
                    return;
                }
                v();
            }
        } else if (c != 3) {
            if (c != 4) {
                if (c == 5) {
                    this.r.d(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), true);
                }
            } else if (this.m != null) {
                this.E = "kirim_uang";
                if (this.m.getVerified().equals("Y")) {
                    v();
                } else {
                    startActivity(new Intent(this, OutwardRemittanceFormActivity.class));
                }
            }
        } else if (this.m != null && !this.q) {
            this.p.b();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DaftarTransferPresenter daftarTransferPresenter = this.r;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call = daftarTransferPresenter.a;
        if (call != null) {
            call.cancel();
        }
        daftarTransferPresenter.c = null;
        CheckCutOffPresenter checkCutOffPresenter = this.p;
        Call<OpenAccountSuccessActivity> call2 = checkCutOffPresenter.d;
        if (call2 != null) {
            call2.cancel();
        }
        checkCutOffPresenter.b = null;
        GetCustDataPresenter getCustDataPresenter = this.A;
        Call<OpenAccountSuccessActivity<CustDataResponse>> call3 = getCustDataPresenter.b;
        if (call3 != null) {
            call3.cancel();
        }
        getCustDataPresenter.d = null;
        GetCustAcctListPresenter getCustAcctListPresenter = this.v;
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call4 = getCustAcctListPresenter.b;
        if (call4 != null) {
            call4.cancel();
        }
        getCustAcctListPresenter.e = null;
        TxnTellerPresenter txnTellerPresenter = this.C;
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call5 = txnTellerPresenter.e;
        if (call5 != null) {
            call5.cancel();
        }
        txnTellerPresenter.d = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.z;
        Call<OpenAccountSuccessActivity<Object>> call6 = sendEmailTransactionSuccessPresenter.a;
        if (call6 != null) {
            call6.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
        this.D.b();
        documentProvider.b().e(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        onPointerCaptureChanged(z);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onReservasiTellerEvent(BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding branchMapROItemAdapter$BranchMapROItemVH_ViewBinding) {
        if (branchMapROItemAdapter$BranchMapROItemVH_ViewBinding.a.equals("")) {
            this.s = branchMapROItemAdapter$BranchMapROItemVH_ViewBinding.d;
            String email = this.m != null ? this.m.getEmail() : "";
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailFailedEChannelActivity
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    TransaksiTellerActivity transaksiTellerActivity = TransaksiTellerActivity.this;
                    transaksiTellerActivity.n = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                    StringBuilder sb = new StringBuilder();
                    new ArrayList();
                    if (!transaksiTellerActivity.n.getSetoranList().isEmpty()) {
                        Iterator<Setoran> it = transaksiTellerActivity.n.getSetoranList().iterator();
                        while (it.hasNext()) {
                            it.next();
                            if (!sb.toString().isEmpty()) {
                                sb.append(",");
                            }
                            sb.append(ReservasiOnline.SETORAN_TUNAI);
                        }
                    }
                    if (!transaksiTellerActivity.n.getTarikanList().isEmpty()) {
                        Iterator<Tarikan> it2 = transaksiTellerActivity.n.getTarikanList().iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            if (!sb.toString().isEmpty()) {
                                sb.append(",");
                            }
                            sb.append(ReservasiOnline.TARIKAN_TUNAI);
                        }
                    }
                    if (!transaksiTellerActivity.n.getKirimanUangList().isEmpty()) {
                        Iterator<KirimanUang> it3 = transaksiTellerActivity.n.getKirimanUangList().iterator();
                        while (it3.hasNext()) {
                            it3.next();
                            if (!sb.toString().isEmpty()) {
                                sb.append(",");
                            }
                            sb.append(ReservasiOnline.OUTWARD_REMITTANCE);
                        }
                    }
                    if (!transaksiTellerActivity.n.getBankTransferList().isEmpty()) {
                        Iterator<BankTransfer> it4 = transaksiTellerActivity.n.getBankTransferList().iterator();
                        while (it4.hasNext()) {
                            it4.next();
                            if (!sb.toString().isEmpty()) {
                                sb.append(",");
                            }
                            sb.append(ReservasiOnline.KIRIMAN_UANG);
                        }
                    }
                    if (!transaksiTellerActivity.n.getKliringList().isEmpty()) {
                        Iterator<Kliring> it5 = transaksiTellerActivity.n.getKliringList().iterator();
                        while (it5.hasNext()) {
                            it5.next();
                            if (!sb.toString().isEmpty()) {
                                sb.append(",");
                            }
                            sb.append(ReservasiOnline.KLIRING);
                        }
                    }
                    transaksiTellerActivity.t = sb.toString();
                    if (transaksiTellerActivity.n.getTarikanList() != null && !transaksiTellerActivity.n.getTarikanList().isEmpty()) {
                        Iterator<Tarikan> it6 = transaksiTellerActivity.n.getTarikanList().iterator();
                        while (it6.hasNext()) {
                            Tarikan next = it6.next();
                            if (Long.parseLong(next.getJumlah().isEmpty() ? "0" : next.getJumlah()) > 100000000) {
                                transaksiTellerActivity.f = true;
                            }
                        }
                    }
                }
            });
            if (!this.f || this.s) {
                y();
                return;
            }
            Intent intent = new Intent(this, BranchMapTarikanActivity.class);
            intent.putExtra("email", email);
            intent.putExtra("no_reff", "");
            startActivity(intent);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "TransaksiTellerActivity";
        this.j = "TransaksiTellerActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493012;
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

    @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read
    public final void t() {
        if (this.m == null || !this.m.getVerified().equals("Y")) {
            x();
            startActivity(new Intent(this, FormBankNotesActivity.class));
            return;
        }
        fillForm fillform = new fillForm();
        fillform.e = "";
        fillform.c = this.m.getEmail();
        fillform.a = this.m.getImei();
        fillform.b = this.m.getSessionId();
        this.A.e(fillform);
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void u() {
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
}
