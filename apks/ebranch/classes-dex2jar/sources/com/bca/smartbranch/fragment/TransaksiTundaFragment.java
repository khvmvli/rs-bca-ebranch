package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.BranchMapActivity;
import com.bca.smartbranch.activity.BranchMapROActivity;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.activity.FormUbahTellerActivity;
import com.bca.smartbranch.activity.NoAtmEChannelActivity;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.activity.OutwardRemittanceFormUbahActivity;
import com.bca.smartbranch.activity.TarikanTransaksiActivity;
import com.bca.smartbranch.activity.TarikanUbahTransaksiActivity;
import com.bca.smartbranch.activity.TransactionActivity;
import com.bca.smartbranch.activity.TxnBerkalaDetailActivity;
import com.bca.smartbranch.adapter.TransaksiTundaAdapter;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.global.DataTxnTeller;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.global.TransaksiTunda;
import com.bca.smartbranch.data.global.TransaksiTundaDetail;
import com.bca.smartbranch.data.global.TransaksiTundaSubDetail;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.EChannel;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.data.localdb.Warkat;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CancelAskTransaksiDialog;
import com.bca.smartbranch.dialog.CancelReservasiDialog;
import com.bca.smartbranch.dialog.CancelTransaksiDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.TransaksiTundaFragment;
import com.bca.smartbranch.presenter.BankListPresenter;
import com.bca.smartbranch.presenter.BeneficiaryBankPresenter;
import com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.CancelReservationPresenter;
import com.bca.smartbranch.presenter.CancelTundaPresenter;
import com.bca.smartbranch.presenter.DaftarTransferLoadDataORPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter;
import com.bca.smartbranch.presenter.GetBankSpecialRelationPresenter;
import com.bca.smartbranch.presenter.GetCategoriesORPresenter;
import com.bca.smartbranch.presenter.GetCategoryPresenter;
import com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter;
import com.bca.smartbranch.presenter.GetCustAcctListPresenter;
import com.bca.smartbranch.presenter.GetFundPurposePresenter;
import com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter;
import com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter;
import com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter;
import com.bca.smartbranch.presenter.InquiryEditDataORPresenter;
import com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter;
import com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter;
import com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter;
import com.bca.smartbranch.presenter.KliringPresenter;
import com.bca.smartbranch.presenter.TransactionPresenter;
import com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import io.realm.Sort;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.BN7PengambilanUpdateReceiverActivity;
import o.BranchMapROItemAdapter$BranchMapROItemVH;
import o.ChooseBCACardAdapter$ViewHolder;
import o.ChooseMastercardAdapter$ViewHolder_ViewBinding;
import o.ChooseSubBCACardAdapter$ViewHolder;
import o.ChooseSubBCACardAdapter$ViewHolder_ViewBinding;
import o.ChooseSubMastercardAdapter$ViewHolder;
import o.FormUbahTellerActivity_ViewBinding;
import o.InfoBiayaActivity;
import o.InfoDocumentUnderlyingActivity;
import o.InfoProductActivity;
import o.InfoTellerActivity_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.PenggantianKeyBCAActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TxnBerkalaDetailActivity_ViewBinding;
import o.choosePic;
import o.clikedKartuHilang;
import o.clikedKeyHilang;
import o.clikedKeyRusak;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.getIncomeDisplayAmount;
import o.getLifecycle;
import o.getLifecycle$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.inputChangePenerima;
import o.onChooseMenuCSEvent;
import o.onClickDetail;
import o.onClickMenu;
import o.onCreditCardRedirect;
import o.onRefreshListRingkasan;
import o.onTakePicture;
import o.onTakePicture$MediaBrowserCompat$CustomActionResultReceiver;
import o.setBackgroundColorRes;
import o.setIncomeDisplayAmount;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.showDataPenerima;
import o.showDataPengirim;
import o.showDataTransaksiBerkala;
import o.subscribeReservationRescheduleEvent;
import o.subscribeUbahVisaCardEvent;
import o.subsriberChooseValueHariEvent;
import o.tujuanTransaksiEvent;
import o.ubahData;
import o.updateDaftarTransfer;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiTundaFragment.class */
public class TransaksiTundaFragment extends BaseFragment implements TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver, GetTxnBerkalaDetailPresenter.IconCompatParcelizer, DeleteTxnBerkalaDraftPresenter.IconCompatParcelizer, GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver, GetCreditCardOptionsPresenter.read, GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, DaftarTransferPresenter.RemoteActionCompatParcelizer, CancelTundaPresenter.IconCompatParcelizer, CancelReservationPresenter.write, GetCustAcctListPresenter.read, GetFundPurposePresenter.IconCompatParcelizer, DetailTransactionPresenter.read, BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver, KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, GetBankSpecialRelationPresenter.read, GetCategoriesORPresenter.write, GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer, InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver, DaftarTransferLoadDataORPresenter.RemoteActionCompatParcelizer, GetTxnTellerDetailKUPresenter.write, InquiryLoadDataBTPresenter.IconCompatParcelizer, InquiryLoadDataSetunPresenter.write, KliringPresenter.RemoteActionCompatParcelizer, BankListPresenter.IconCompatParcelizer {
    private boolean D;
    private KategoriTujuanTransaksiORPresenter F;
    private BankListPresenter I;
    private CancelReservationPresenter J;
    private BeneficiaryBankPresenter L;
    private DaftarTransferLoadDataORPresenter M;
    private CancelTundaPresenter N;
    private GetCategoriesORPresenter O;
    private GetBankSpecialRelationPresenter P;
    private DetailTransactionPresenter Q;
    private DaftarTransferPresenter R;
    private GetAcctOpeningCategoryDataPresenter S;
    private GetTxnTellerDetailKUPresenter T;
    private GetCreditCardOptionsPresenter U;
    private GetCustAcctListPresenter V;
    private GetTxnTellerDetailPresenter W;
    private GetFundPurposePresenter X;
    private Realm Y;
    private InquiryLoadDataBTPresenter Z;
    public int a;
    private InquiryLoadDataSetunPresenter aa;
    private InquiryEditDataORPresenter ab;
    private KliringPresenter ac;
    private BeneficiaryBankResponse ad;
    private Reservation ae;
    private KategoriTujuanTransaksiORResponse af;
    private MasterFundSourcePurposeResponse ag;
    private String ah;
    private long ai;
    private long aj;
    private ViewAnimator ar;
    public TransaksiTundaAdapter d;
    public User g;
    public TransactionPresenter h;
    private long k;
    private CategoriesORResponse l;
    @BindView(2131297634)
    LinearLayout llEmpty;
    private List<CardType> n;
    private List<DaftarTransferResponse.DaftarTransferOutput> q;
    private DataTxnTeller r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298338)
    getIncomeDisplayAmount rvTransaksiTertunda;
    @BindView(2131298420)
    getLifecycle svMain;
    @BindView(2131298422)
    setBackgroundColorRes swipeRefreshLayout;
    private DeleteTxnBerkalaDraftPresenter t;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299690)
    TextView tvTransaksiEmpty;
    private GetCategoryPresenter u;
    private GetTxnTellerDetailKUResponse v;
    private GetTxnBerkalaDetailPresenter w;
    private GetTxnTellerDetailResponse x;
    private GetCustAcctListResponse y;
    public List<TransaksiTunda> m = new ArrayList();
    private String E = "";
    private String am = "";
    private long G = 0;

    /* renamed from: o */
    List<DetailTransactionResponse.ValueTxnDataDetail> f60o = new ArrayList();
    private Integer s = -1;
    private boolean z = false;
    private ArrayList<Long> H = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> ak = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> aq = new ArrayList<>();
    private long al = 0;
    private long p = 0;
    public String i = "";
    public boolean f = false;
    private boolean C = false;
    public int j = 2;
    private String K = "";
    private boolean A = false;
    private boolean B = false;

    private void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", this.g.getEmail());
            jSONObject.put("SessionId", this.g.getSessionId());
            jSONObject.put("IMEI", this.g.getImei());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.F.d(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString());
    }

    private Kliring b(GetTxnTellerDetailResponse getTxnTellerDetailResponse) {
        if (this.x == null) {
            x("Response Teller Tunda is success but the value is empty");
            return new Kliring();
        }
        Kliring kliring = new Kliring();
        kliring.setId(System.currentTimeMillis());
        kliring.setNamaPenerima(getTxnTellerDetailResponse.getTxnDetail().getReceiverName());
        kliring.setNomorRekening(getTxnTellerDetailResponse.getTxnDetail().getReceiverAccount());
        kliring.setKodeNegara(getTxnTellerDetailResponse.getTxnDetail().getHandphoneNumberCountryCd());
        kliring.setNomorHp(getTxnTellerDetailResponse.getTxnDetail().getHandphoneNumber());
        StringBuilder sb = new StringBuilder();
        if (getTxnTellerDetailResponse.getTxnDetail().getTxnNotes() != null && !getTxnTellerDetailResponse.getTxnDetail().getTxnNotes().isEmpty()) {
            sb.append(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes());
            if (getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2() != null && !getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2().isEmpty()) {
                sb.append(" ");
                sb.append(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2());
            }
        } else if (getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2() != null && !getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2().isEmpty()) {
            sb.append(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2());
        }
        kliring.setBeritaAcara(sb.toString());
        kliring.setTanggalJatuhTempo(getTxnTellerDetailResponse.getTxnDetail().getWarkatDueDate());
        kliring.setTipeNasabahId(getTxnTellerDetailResponse.getTxnDetail().getCustomerType());
        kliring.setTipeNasabah(getTxnTellerDetailResponse.getTxnDetail().getCustomerType());
        kliring.setSumberDana(getTxnTellerDetailResponse.getTxnDetail().getTxnSource());
        kliring.setSumberDanaCode(getTxnTellerDetailResponse.getTxnDetail().getTxnSource());
        kliring.setTujuanTransaksi(getTxnTellerDetailResponse.getTxnDetail().getTxnPurpose());
        kliring.setTujuanTransaksiCode(getTxnTellerDetailResponse.getTxnDetail().getTxnPurpose());
        kliring.setTotalWarkat(Double.parseDouble(getTxnTellerDetailResponse.getTxnDetail().getTotalAmountWarkat()));
        kliring.setCurrentPage("K3KonfirmasiWarkatFragment");
        kliring.setSequenceId(0);
        kliring.setCreatedAt(System.currentTimeMillis());
        RealmList<Warkat> realmList = new RealmList<>();
        for (int i = 0; i < getTxnTellerDetailResponse.getTxnDetail().getWarkat().size(); i++) {
            Warkat warkat = new Warkat();
            warkat.setId(System.currentTimeMillis());
            warkat.setNomorWarkat(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i).getWarkatNumber());
            warkat.setNamaBank(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i).getBankName());
            warkat.setKodeBank(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i).getBankName());
            warkat.setLocalClearingCodeBank(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i).getClearingCode());
            warkat.setJenisWarkat(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i).getWarkatType());
            warkat.setKodeJenisWarkat(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i).getWarkatType());
            warkat.setNominal(Double.valueOf(Double.parseDouble(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i).getAmount())));
            warkat.setJatuhTempo(getTxnTellerDetailResponse.getTxnDetail().getWarkatDueDate());
            realmList.add(warkat);
        }
        kliring.setListWarkat(realmList);
        return kliring;
    }

    public void b() {
        this.E = "";
        this.al = 0;
        this.p = 0;
        this.a = 0;
        this.m = new ArrayList();
        ((TransactionActivity) getActivity()).n = this.a;
        ((TransactionActivity) getActivity()).q = this.m;
        this.C = true;
        this.i = "";
        this.h.d(getPromotion.b(this.g, ""), new onCreditCardRedirect("TUNDA"));
        this.svMain.scrollTo(0, 0);
        this.B = false;
    }

    private void b(int i) {
        InfoTellerActivity_ViewBinding infoTellerActivity_ViewBinding = new InfoTellerActivity_ViewBinding();
        infoTellerActivity_ViewBinding.a = this.g.getEmail();
        infoTellerActivity_ViewBinding.e = this.g.getImei();
        infoTellerActivity_ViewBinding.d = this.g.getSessionId();
        infoTellerActivity_ViewBinding.c = this.m.get(i).getToken();
        GetTxnBerkalaDetailPresenter getTxnBerkalaDetailPresenter = this.w;
        getTxnBerkalaDetailPresenter.c.g_();
        Call<OpenAccountSuccessActivity<PenggantianKeyBCAActivity_ViewBinding>> e = getTxnBerkalaDetailPresenter.apiService.e(infoTellerActivity_ViewBinding);
        getTxnBerkalaDetailPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0064: INVOKE  
              (r0v11 'e' retrofit2.Call<o.OpenAccountSuccessActivity<o.PenggantianKeyBCAActivity_ViewBinding>>)
              (wrap: com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter$5 : 0x0061: CONSTRUCTOR  (r1v17 com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter$5 A[REMOVE]) = (r0v6 'getTxnBerkalaDetailPresenter' com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter) call: com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter.5.<init>(com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.TransaksiTundaFragment.b(int):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiTundaFragment.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter, state: GENERATED_AND_UNLOADED
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
            this = this;
            o.InfoTellerActivity_ViewBinding r0 = new o.InfoTellerActivity_ViewBinding
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            com.bca.smartbranch.data.localdb.User r1 = r1.g
            java.lang.String r1 = r1.getEmail()
            r0.a = r1
            r0 = r7
            r1 = r5
            com.bca.smartbranch.data.localdb.User r1 = r1.g
            java.lang.String r1 = r1.getImei()
            r0.e = r1
            r0 = r7
            r1 = r5
            com.bca.smartbranch.data.localdb.User r1 = r1.g
            java.lang.String r1 = r1.getSessionId()
            r0.d = r1
            r0 = r7
            r1 = r5
            java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> r1 = r1.m
            r2 = r6
            java.lang.Object r1 = r1.get(r2)
            com.bca.smartbranch.data.global.TransaksiTunda r1 = (com.bca.smartbranch.data.global.TransaksiTunda) r1
            java.lang.String r1 = r1.getToken()
            r0.c = r1
            r0 = r5
            com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter r0 = r0.w
            r8 = r0
            r0 = r8
            com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter$IconCompatParcelizer r0 = r0.c
            r0.g_()
            r0 = r8
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r7
            retrofit2.Call r0 = r0.e(r1)
            r7 = r0
            r0 = r8
            r1 = r7
            r0.b = r1
            r0 = r7
            com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter$5 r1 = new com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter$5
            r2 = r1
            r3 = r8
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TransaksiTundaFragment.b(int):void");
    }

    public static /* synthetic */ void d(Realm realm) {
        ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        if (listFormTeller != null) {
            if (listFormTeller.getSetoranList() != null && listFormTeller.getSetoranList().isValid()) {
                listFormTeller.getSetoranList().deleteAllFromRealm();
            }
            if (listFormTeller.getTarikanList() != null && listFormTeller.getTarikanList().isValid()) {
                listFormTeller.getTarikanList().deleteAllFromRealm();
            }
            if (listFormTeller.getKirimanUangList() != null && listFormTeller.getKirimanUangList().isValid()) {
                listFormTeller.getKirimanUangList().deleteAllFromRealm();
            }
            if (listFormTeller.getKliringList() != null && listFormTeller.getKliringList().isValid()) {
                listFormTeller.getKliringList().deleteAllFromRealm();
            }
            if (listFormTeller.getBankTransferList() != null && listFormTeller.getBankTransferList().isValid()) {
                listFormTeller.getBankTransferList().deleteAllFromRealm();
            }
            if (listFormTeller != null && listFormTeller.isValid()) {
                listFormTeller.deleteFromRealm();
            }
        }
    }

    private void e() {
        if (this.am.equals("kirim_uang")) {
            this.V.b(this.g, "Transfer Valuta Asing");
        } else if (this.am.equals("bank_transfer")) {
            this.V.b(this.g, "Kiriman Uang");
        } else if (this.am.equals("kliring")) {
            this.V.b(this.g, "Kliring");
        } else {
            this.V.b(this.g, "Tarikan Tunai");
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void A(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void B(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void B_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    public final void C(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void C_(String str) {
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        this.d.d();
        if (this.C) {
            this.ar.setDisplayedChild(1);
            this.tvErrorMessage.setText(str);
        }
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter.IconCompatParcelizer
    public final void D(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void D_(String str) {
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        this.d.d();
        if (this.C) {
            this.ar.setDisplayedChild(1);
            this.tvErrorMessage.setText(str);
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter.write
    public final void E(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter.write
    public final void F(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter.IconCompatParcelizer
    public final void G(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter.write
    public final void H(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter.IconCompatParcelizer
    public final void I(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter.IconCompatParcelizer
    public final void M(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void a(GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse) {
        h();
        Intent intent = new Intent(getActivity(), FormActivity.class);
        intent.putExtra("id_draft", true);
        intent.putExtra("account_id", this.ai);
        intent.putExtra("category_data", ListUtil.OneItemImmutableList.e(getAcctOpeningCategoryDataResponse));
        getActivity().startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void a(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse, GetCustAcctListResponse getCustAcctListResponse, List<onClickDetail.RemoteActionCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list3, List<? extends DaftarTransferResponse.DaftarTransferOutput> list4, String str) {
        h();
        if (str == null) {
            return;
        }
        if (str.equals("EDIT_DATA")) {
            Intent intent = new Intent(getActivity(), BN7PengambilanUpdateReceiverActivity.class);
            BN7PengambilanUpdateReceiverActivity.write write = BN7PengambilanUpdateReceiverActivity.j;
            intent.putExtra(BN7PengambilanUpdateReceiverActivity.v, ListUtil.OneItemImmutableList.e(getTxnTellerDetailKUResponse));
            if (getCustAcctListResponse != null) {
                BN7PengambilanUpdateReceiverActivity.write write2 = BN7PengambilanUpdateReceiverActivity.j;
                intent.putExtra(BN7PengambilanUpdateReceiverActivity.w, ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            }
            BN7PengambilanUpdateReceiverActivity.write write3 = BN7PengambilanUpdateReceiverActivity.j;
            intent.putExtra(BN7PengambilanUpdateReceiverActivity.y, ListUtil.OneItemImmutableList.e(list));
            BN7PengambilanUpdateReceiverActivity.write write4 = BN7PengambilanUpdateReceiverActivity.j;
            intent.putExtra(BN7PengambilanUpdateReceiverActivity.z, ListUtil.OneItemImmutableList.e(list2));
            BN7PengambilanUpdateReceiverActivity.write write5 = BN7PengambilanUpdateReceiverActivity.j;
            intent.putExtra(BN7PengambilanUpdateReceiverActivity.I, ListUtil.OneItemImmutableList.e(list3));
            BN7PengambilanUpdateReceiverActivity.write write6 = BN7PengambilanUpdateReceiverActivity.j;
            intent.putExtra(BN7PengambilanUpdateReceiverActivity.u, ListUtil.OneItemImmutableList.e(list4));
            BN7PengambilanUpdateReceiverActivity.write write7 = BN7PengambilanUpdateReceiverActivity.j;
            intent.putExtra(BN7PengambilanUpdateReceiverActivity.A, this.K);
            startActivity(intent);
        } else if (str.equals("LOAD_DATA")) {
            Intent intent2 = new Intent(getActivity(), ubahData.class);
            ubahData.write write8 = ubahData.h;
            intent2.putExtra(ubahData.G, true);
            ubahData.write write9 = ubahData.h;
            intent2.putExtra(ubahData.J, this.aj);
            ubahData.write write10 = ubahData.h;
            intent2.putExtra(ubahData.M, "bank_transfer");
            if (getCustAcctListResponse != null) {
                ubahData.write write11 = ubahData.h;
                intent2.putExtra(ubahData.H, ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            }
            ubahData.write write12 = ubahData.h;
            intent2.putExtra(ubahData.A, ListUtil.OneItemImmutableList.e(list));
            ubahData.write write13 = ubahData.h;
            intent2.putExtra(ubahData.I, ListUtil.OneItemImmutableList.e(list2));
            ubahData.write write14 = ubahData.h;
            intent2.putExtra(ubahData.L, ListUtil.OneItemImmutableList.e(list3));
            ubahData.write write15 = ubahData.h;
            intent2.putExtra(ubahData.z, ListUtil.OneItemImmutableList.e(list4));
            startActivity(intent2);
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0234, code lost:
        if (r0.equals("TxnAmount") != false) goto L_0x023d;
     */
    @Override // com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter.IconCompatParcelizer
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a(java.util.List<o.PenggantianKeyBCAActivity_ViewBinding.read> r9) {
        /*
        // Method dump skipped, instructions count: 1011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TransaksiTundaFragment.a(java.util.List):void");
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a_(String str) {
        h();
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        this.d.d();
        if (this.C) {
            this.ar.setDisplayedChild(1);
            this.tvErrorMessage.setText(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        char c;
        h();
        if (this.ae == null) {
            this.ae = new Reservation();
        }
        boolean z = false;
        for (DetailTransactionResponse.TxnDataDetail txnDataDetail : list) {
            if ("TxnDetail".equals(txnDataDetail.getKey())) {
                this.f60o.addAll(txnDataDetail.getValueArray());
                if (this.f60o.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < this.f60o.size(); i++) {
                        if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Setoran Tunai")) {
                            sb.append(ReservasiOnline.SETORAN_TUNAI);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Tarikan Tunai")) {
                            sb.append(ReservasiOnline.TARIKAN_TUNAI);
                            z = z;
                            if (Long.parseLong(this.f60o.get(i).getAmount().isEmpty() ? "0" : this.f60o.get(i).getAmount()) > 100000000) {
                                z = true;
                            }
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Pemesanan Mata Uang Asing")) {
                            sb.append(ReservasiOnline.PEMESANAN_MATA_UANG_ASING);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Kiriman Uang") || this.f60o.get(i).getTxnType().equals("Transfer ke Bank Lain")) {
                            sb.append(ReservasiOnline.KIRIMAN_UANG);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Kliring")) {
                            sb.append(ReservasiOnline.KLIRING);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Outward Remittance") || this.f60o.get(i).getTxnType().equalsIgnoreCase("Transfer Valuta Asing")) {
                            sb.append(ReservasiOnline.OUTWARD_REMITTANCE);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Pemindahbukuan")) {
                            sb.append(ReservasiOnline.PEMINDAHBUKUAN);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Setoran Pajak")) {
                            sb.append(ReservasiOnline.SETORAN_PAJAK);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Pembukaan Rekening Individu")) {
                            sb.append(ReservasiOnline.PEMBUKAAN_REKENING);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Pengajuan Kartu Kredit")) {
                            sb.append(ReservasiOnline.PENGAJUAN_KARTU_KREDIT);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Internet/Mobile Banking")) {
                            sb.append(ReservasiOnline.INTERNET_MOBILE_BANKING);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Penggantian Key BCA")) {
                            sb.append(ReservasiOnline.PENGGANTIAN_KEY_BCA);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Deposito")) {
                            sb.append(ReservasiOnline.DEPOSITO);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Layanan Giro")) {
                            sb.append(ReservasiOnline.LAYANAN_GIRO);
                            z = z;
                        } else if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Pembukaan Blokir")) {
                            sb.append(ReservasiOnline.PEMBUKAAN_BLOKIR);
                            z = z;
                        } else {
                            z = z;
                            if (this.f60o.get(i).getTxnType().equalsIgnoreCase("Pengajuan Surat Referensi")) {
                                sb.append(ReservasiOnline.PENGAJUAN_SURAT_REFERENSI);
                                z = z;
                            }
                        }
                        if (i != this.f60o.size() - 1) {
                            sb.append(",");
                        }
                    }
                    this.ae.setTransactionCode(sb.toString());
                } else if ("TxnStatus".equals(txnDataDetail.getKey())) {
                    String value = txnDataDetail.getValue();
                    value.hashCode();
                    switch (value.hashCode()) {
                        case 49:
                            if (value.equals("1")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 50:
                            if (value.equals("2")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 51:
                            if (value.equals("3")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                            if (value.equals("4")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 53:
                            if (value.equals("5")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 54:
                            if (value.equals("6")) {
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
                        this.ae.setTypeTransaction("Tahapan BCA");
                    } else if (c == 1) {
                        this.ae.setTypeTransaction("Tahapan BCA");
                    } else if (c == 2) {
                        this.ae.setTypeTransaction("Tapres BCA");
                    } else if (c == 3) {
                        this.ae.setTypeTransaction("BCA Dollar");
                    } else if (c == 4) {
                        this.ae.setTypeTransaction("Tahapan Berjangka");
                    } else if (c == 5) {
                        this.ae.setTypeTransaction("DEPOSITO");
                    }
                }
            }
        }
        if (this.ae.getTypeTransaction() != null) {
            Intent intent = this.ae.getTypeTransaction().equals("RESERVASI ONLINE") ? new Intent(getContext(), BranchMapROActivity.class) : new Intent(getContext(), BranchMapActivity.class);
            intent.putExtra("reff_no", this.ae.getNoReff());
            intent.putExtra("type_transaksi", this.ae.getTypeTransaction());
            intent.putExtra("type_reservation", this.ae.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(this.ae));
            intent.putExtra("txn_data_tunda", ListUtil.OneItemImmutableList.e(list));
            intent.putExtra("is_tartun_jumbes", z);
            startActivity(intent);
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    public final void b(View view) {
        b(view);
        this.ar = (ViewAnimator) view.findViewById(2131299749);
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(BeneficiaryBankResponse beneficiaryBankResponse) {
        this.ad = beneficiaryBankResponse;
        h();
        documentProvider.b().d(new o.TransactionActivity());
        Intent intent = new Intent(getActivity(), OutwardRemittanceFormActivity.class);
        intent.putExtra("id_draft", true);
        intent.putExtra("transaksi_teller_id", this.aj);
        intent.putExtra("TellerType", "kirim_uang");
        intent.putExtra("data_beneficiary", ListUtil.OneItemImmutableList.e(this.ad));
        intent.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(this.af));
        intent.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(this.l));
        intent.putExtra("data_daftar_transfer", ListUtil.OneItemImmutableList.e(this.q));
        GetCustAcctListResponse getCustAcctListResponse = this.y;
        if (getCustAcctListResponse != null) {
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void b(GetCustAcctListResponse getCustAcctListResponse) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [double] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [double] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Unknown variable types count: 3 */
    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse r8) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TransaksiTundaFragment.b(com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse):void");
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        h();
        getActivity().setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.g.getImei());
        bundle.putString("email", this.g.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferLoadDataORPresenter.RemoteActionCompatParcelizer
    public final void b(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        if (list != null) {
            this.q = list;
        }
        this.O.c(getPromotion.e(this.g), "C015");
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(List<onTakePicture.write> list, List<onTakePicture.IconCompatParcelizer> list2, int i) {
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        if (this.C) {
            TransaksiTundaAdapter transaksiTundaAdapter = this.d;
            transaksiTundaAdapter.g.clear();
            transaksiTundaAdapter.a.b();
            this.ar.setDisplayedChild(0);
        }
        ((TransactionActivity) getActivity()).d(i);
        if (this.al == 0) {
            this.al = System.currentTimeMillis();
        }
        if (list.size() > 0) {
            this.p = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseMillis(list.get(list.size() - 1).t);
            this.i = list.get(list.size() - 1).t;
        } else {
            this.a = this.j;
        }
        String str = "createdAt";
        RealmResults sort = this.g.getAccounts().where().between("createdAt", this.p, this.al).findAll().sort("createdAt", Sort.DESCENDING);
        RealmResults sort2 = this.g.getSetorans().where().between("createdAt", this.p, this.al).findAll().sort("createdAt", Sort.DESCENDING);
        RealmResults sort3 = this.g.getTarikans().where().between("createdAt", this.p, this.al).findAll().sort("createdAt", Sort.DESCENDING);
        RealmResults sort4 = this.g.getKirimanUangs().where().between("createdAt", this.p, this.al).findAll().sort("createdAt", Sort.DESCENDING);
        RealmResults sort5 = this.g.getKlirings().where().between("createdAt", this.p, this.al).findAll().sort("createdAt", Sort.DESCENDING);
        RealmResults sort6 = this.g.getCreditCards().where().between("createdAt", this.p, this.al).and().equalTo("isDraft", Boolean.TRUE).findAll().sort("createdAt", Sort.DESCENDING);
        RealmResults sort7 = this.g.geteChannels().where().between("createdAt", this.p, this.al).findAll().sort("createdAt", Sort.DESCENDING);
        RealmResults sort8 = this.g.getBankTransfers().where().between("createdAt", this.p, this.al).findAll().sort("createdAt", Sort.DESCENDING);
        this.al = this.p;
        ArrayList arrayList = new ArrayList();
        for (onTakePicture.write write : list) {
            TransaksiTunda transaksiTunda = new TransaksiTunda();
            transaksiTunda.setType(write.p);
            transaksiTunda.setTxbDate(write.t);
            transaksiTunda.setNoReff(write.h);
            transaksiTunda.setTxnType(write.s);
            transaksiTunda.setServiceType(write.k);
            transaksiTunda.setToken(write.n);
            transaksiTunda.setSubToken(write.l);
            transaksiTunda.setFlagRating(write.i);
            transaksiTunda.setDraft(false);
            transaksiTunda.setStatus(write.m);
            transaksiTunda.setStatusType(write.f174o);
            transaksiTunda.setFlagBooking(write.e);
            transaksiTunda.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(write.t)));
            transaksiTunda.setAmount(write.c);
            transaksiTunda.setCurrencyCode(write.d);
            transaksiTunda.setBanknoteCondition(write.b);
            transaksiTunda.setReceiverName(write.j);
            transaksiTunda.setFee(write.a);
            ArrayList arrayList2 = new ArrayList();
            str = str;
            if (write.q != null) {
                Iterator<onTakePicture$MediaBrowserCompat$CustomActionResultReceiver> it = write.q.iterator();
                while (true) {
                    str = str;
                    if (it.hasNext()) {
                        onTakePicture$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
                        TransaksiTundaDetail transaksiTundaDetail = new TransaksiTundaDetail();
                        transaksiTundaDetail.setAccountNumber(next.e);
                        transaksiTundaDetail.setAmount(next.d);
                        transaksiTundaDetail.setCurrency(next.a);
                        transaksiTundaDetail.setToken(next.j);
                        transaksiTundaDetail.setTxbType(next.f);
                        transaksiTundaDetail.setTransaksiTunda(transaksiTunda);
                        transaksiTundaDetail.setFlagReservasi(next.b);
                        transaksiTundaDetail.setReceiverName(next.g);
                        transaksiTundaDetail.setFee(next.c);
                        transaksiTundaDetail.setNoReffAnak(next.i);
                        ArrayList arrayList3 = new ArrayList();
                        if (next.h != null) {
                            for (onTakePicture.read read : next.h) {
                                TransaksiTundaSubDetail transaksiTundaSubDetail = new TransaksiTundaSubDetail();
                                transaksiTundaSubDetail.setAccountNumber(read.b);
                                transaksiTundaSubDetail.setAmount(read.d);
                                transaksiTundaSubDetail.setCurrency(read.c);
                                transaksiTundaSubDetail.setBankName(read.a);
                                transaksiTundaSubDetail.setReceiverName(read.i);
                                transaksiTundaSubDetail.setFee(read.e);
                                transaksiTundaSubDetail.setTransaksiTundaDetail(transaksiTundaDetail);
                                transaksiTundaSubDetail.setNoReffAnak(read.f);
                                arrayList3.add(transaksiTundaSubDetail);
                            }
                        }
                        transaksiTundaDetail.setTransaksiTundaSubDetailList(arrayList3);
                        arrayList2.add(transaksiTundaDetail);
                    }
                }
            }
            transaksiTunda.setTransaksiTundaDetailList(arrayList2);
            arrayList.add(transaksiTunda);
        }
        for (onTakePicture.IconCompatParcelizer iconCompatParcelizer : list2) {
            TransaksiTunda transaksiTunda2 = new TransaksiTunda();
            transaksiTunda2.setTxbDate(iconCompatParcelizer.a);
            transaksiTunda2.setNoReff("");
            transaksiTunda2.setTxnType(iconCompatParcelizer.d);
            transaksiTunda2.setServiceType("TLTXNBERKALA");
            transaksiTunda2.setToken(iconCompatParcelizer.b);
            transaksiTunda2.setFlagRating("");
            transaksiTunda2.setDraft(false);
            transaksiTunda2.setFlagBooking("");
            transaksiTunda2.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(iconCompatParcelizer.a)));
            arrayList.add(transaksiTunda2);
        }
        Iterator<E> it2 = sort.iterator();
        while (it2.hasNext()) {
            Account account = (Account) it2.next();
            TransaksiTunda transaksiTunda3 = new TransaksiTunda();
            transaksiTunda3.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(account.getCreatedAt()));
            transaksiTunda3.setNoReff("");
            StringBuilder sb = new StringBuilder("Pembukaan Rekening ");
            sb.append(account.getAcctType().equals("Tahaka") ? "Tahapan Berjangka" : account.getAcctType());
            transaksiTunda3.setTxnType(sb.toString());
            transaksiTunda3.setServiceType("");
            transaksiTunda3.setToken("");
            transaksiTunda3.setFlagRating("");
            transaksiTunda3.setDraft(true);
            transaksiTunda3.setTypeDraft("PEMREK");
            transaksiTunda3.setDataId(account.getId());
            transaksiTunda3.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(account.getCreatedAt()))));
            arrayList.add(transaksiTunda3);
        }
        Iterator<E> it3 = sort2.iterator();
        while (it3.hasNext()) {
            Setoran setoran = (Setoran) it3.next();
            TransaksiTunda transaksiTunda4 = new TransaksiTunda();
            transaksiTunda4.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(setoran.getCreatedAt()));
            transaksiTunda4.setNoReff("");
            transaksiTunda4.setTxnType("Setoran Tunai");
            transaksiTunda4.setServiceType("");
            transaksiTunda4.setToken("");
            transaksiTunda4.setFlagRating("");
            transaksiTunda4.setDraft(true);
            transaksiTunda4.setTypeDraft("SETORAN");
            transaksiTunda4.setDataId(setoran.getId());
            transaksiTunda4.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(setoran.getCreatedAt()))));
            transaksiTunda4.setAmount("");
            arrayList.add(transaksiTunda4);
        }
        Iterator<E> it4 = sort3.iterator();
        while (it4.hasNext()) {
            Tarikan tarikan = (Tarikan) it4.next();
            TransaksiTunda transaksiTunda5 = new TransaksiTunda();
            transaksiTunda5.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(tarikan.getCreatedAt()));
            transaksiTunda5.setNoReff("");
            transaksiTunda5.setTxnType("Tarikan Tunai");
            transaksiTunda5.setServiceType("");
            transaksiTunda5.setToken("");
            transaksiTunda5.setFlagRating("");
            transaksiTunda5.setDraft(true);
            transaksiTunda5.setTypeDraft("TARIKAN");
            transaksiTunda5.setDataId(tarikan.getId());
            transaksiTunda5.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(tarikan.getCreatedAt()))));
            arrayList.add(transaksiTunda5);
        }
        Iterator<E> it5 = sort4.iterator();
        while (it5.hasNext()) {
            KirimanUang kirimanUang = (KirimanUang) it5.next();
            TransaksiTunda transaksiTunda6 = new TransaksiTunda();
            transaksiTunda6.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kirimanUang.getCreatedAt()));
            transaksiTunda6.setNoReff("");
            transaksiTunda6.setTxnType("Transfer Valuta Asing");
            transaksiTunda6.setServiceType("");
            transaksiTunda6.setToken("");
            transaksiTunda6.setFlagRating("");
            transaksiTunda6.setDraft(true);
            transaksiTunda6.setTypeDraft("KIRIMANUANG");
            transaksiTunda6.setDataId(kirimanUang.getId());
            transaksiTunda6.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kirimanUang.getCreatedAt()))));
            arrayList.add(transaksiTunda6);
        }
        Iterator<E> it6 = sort5.iterator();
        while (it6.hasNext()) {
            Kliring kliring = (Kliring) it6.next();
            TransaksiTunda transaksiTunda7 = new TransaksiTunda();
            transaksiTunda7.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kliring.getCreatedAt()));
            transaksiTunda7.setNoReff("");
            transaksiTunda7.setTxnType("Kliring");
            transaksiTunda7.setServiceType("");
            transaksiTunda7.setToken("");
            transaksiTunda7.setFlagRating("");
            transaksiTunda7.setDraft(true);
            transaksiTunda7.setTypeDraft("KLIRING");
            transaksiTunda7.setDataId(kliring.getId());
            transaksiTunda7.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kliring.getCreatedAt()))));
            arrayList.add(transaksiTunda7);
        }
        Iterator<E> it7 = sort6.iterator();
        while (it7.hasNext()) {
            CreditCard creditCard = (CreditCard) it7.next();
            TransaksiTunda transaksiTunda8 = new TransaksiTunda();
            transaksiTunda8.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(creditCard.getCreatedAt().longValue()));
            transaksiTunda8.setNoReff("");
            transaksiTunda8.setTxnType("Pengajuan Kartu Kredit BCA");
            transaksiTunda8.setServiceType("");
            transaksiTunda8.setToken("");
            transaksiTunda8.setFlagRating("");
            transaksiTunda8.setDraft(true);
            transaksiTunda8.setTypeDraft("CC");
            transaksiTunda8.setDataId(creditCard.getId().longValue());
            transaksiTunda8.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(creditCard.getCreatedAt().longValue()))));
            arrayList.add(transaksiTunda8);
        }
        Iterator<E> it8 = sort7.iterator();
        while (it8.hasNext()) {
            EChannel eChannel = (EChannel) it8.next();
            TransaksiTunda transaksiTunda9 = new TransaksiTunda();
            transaksiTunda9.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(eChannel.getCreatedAt().longValue()));
            transaksiTunda9.setNoReff("");
            transaksiTunda9.setTxnType("Internet/Mobile Banking");
            transaksiTunda9.setServiceType("");
            transaksiTunda9.setToken("");
            transaksiTunda9.setFlagRating("");
            transaksiTunda9.setDraft(true);
            transaksiTunda9.setTypeDraft("ECHANNEL");
            transaksiTunda9.setDataId(eChannel.getId().longValue());
            transaksiTunda9.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(eChannel.getCreatedAt().longValue()))));
            arrayList.add(transaksiTunda9);
        }
        Iterator<E> it9 = sort8.iterator();
        while (it9.hasNext()) {
            BankTransfer bankTransfer = (BankTransfer) it9.next();
            TransaksiTunda transaksiTunda10 = new TransaksiTunda();
            transaksiTunda10.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(bankTransfer.getCreatedAt()));
            transaksiTunda10.setNoReff("");
            transaksiTunda10.setTxnType("Transfer ke Bank Lain");
            transaksiTunda10.setServiceType("");
            transaksiTunda10.setToken("");
            transaksiTunda10.setFlagRating("");
            transaksiTunda10.setDraft(true);
            transaksiTunda10.setTypeDraft("BANKTRANSFER");
            transaksiTunda10.setDataId(bankTransfer.getId());
            transaksiTunda10.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(bankTransfer.getCreatedAt()))));
            arrayList.add(transaksiTunda10);
        }
        if ((this.a >= this.j - 1 || list.size() < 15) && !this.B) {
            this.B = true;
            RealmResults sort9 = this.g.getAccounts().where().between("createdAt", 0L, this.p).findAll().sort(str, Sort.DESCENDING);
            RealmResults sort10 = this.g.getSetorans().where().between("createdAt", 0L, this.p).findAll().sort(str, Sort.DESCENDING);
            RealmResults sort11 = this.g.getTarikans().where().between("createdAt", 0L, this.p).findAll().sort(str, Sort.DESCENDING);
            RealmResults sort12 = this.g.getKirimanUangs().where().between("createdAt", 0L, this.p).findAll().sort(str, Sort.DESCENDING);
            RealmResults sort13 = this.g.getKlirings().where().between("createdAt", 0L, this.p).findAll().sort(str, Sort.DESCENDING);
            RealmResults sort14 = this.g.getCreditCards().where().between("createdAt", 0L, this.p).and().equalTo("isDraft", Boolean.TRUE).findAll().sort(str, Sort.DESCENDING);
            RealmResults sort15 = this.g.geteChannels().where().between("createdAt", 0L, this.p).findAll().sort(str, Sort.DESCENDING);
            RealmResults sort16 = this.g.getBankTransfers().where().between("createdAt", 0L, this.p).findAll().sort(str, Sort.DESCENDING);
            Iterator<E> it10 = sort9.iterator();
            while (it10.hasNext()) {
                Account account2 = (Account) it10.next();
                TransaksiTunda transaksiTunda11 = new TransaksiTunda();
                transaksiTunda11.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(account2.getCreatedAt()));
                transaksiTunda11.setNoReff("");
                StringBuilder sb2 = new StringBuilder("Pembukaan Rekening ");
                sb2.append(account2.getAcctType().equals("Tahaka") ? "Tahapan Berjangka" : account2.getAcctType());
                transaksiTunda11.setTxnType(sb2.toString());
                transaksiTunda11.setServiceType("");
                transaksiTunda11.setToken("");
                transaksiTunda11.setFlagRating("");
                transaksiTunda11.setDraft(true);
                transaksiTunda11.setTypeDraft("PEMREK");
                transaksiTunda11.setDataId(account2.getId());
                transaksiTunda11.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(account2.getCreatedAt()))));
                arrayList.add(transaksiTunda11);
            }
            Iterator<E> it11 = sort10.iterator();
            while (it11.hasNext()) {
                Setoran setoran2 = (Setoran) it11.next();
                TransaksiTunda transaksiTunda12 = new TransaksiTunda();
                transaksiTunda12.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(setoran2.getCreatedAt()));
                transaksiTunda12.setNoReff("");
                transaksiTunda12.setTxnType("Setoran Tunai");
                transaksiTunda12.setServiceType("");
                transaksiTunda12.setToken("");
                transaksiTunda12.setFlagRating("");
                transaksiTunda12.setDraft(true);
                transaksiTunda12.setTypeDraft("SETORAN");
                transaksiTunda12.setDataId(setoran2.getId());
                transaksiTunda12.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(setoran2.getCreatedAt()))));
                transaksiTunda12.setAmount("");
                arrayList.add(transaksiTunda12);
            }
            Iterator<E> it12 = sort11.iterator();
            while (it12.hasNext()) {
                Tarikan tarikan2 = (Tarikan) it12.next();
                TransaksiTunda transaksiTunda13 = new TransaksiTunda();
                transaksiTunda13.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(tarikan2.getCreatedAt()));
                transaksiTunda13.setNoReff("");
                transaksiTunda13.setTxnType("Tarikan Tunai");
                transaksiTunda13.setServiceType("");
                transaksiTunda13.setToken("");
                transaksiTunda13.setFlagRating("");
                transaksiTunda13.setDraft(true);
                transaksiTunda13.setTypeDraft("TARIKAN");
                transaksiTunda13.setDataId(tarikan2.getId());
                transaksiTunda13.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(tarikan2.getCreatedAt()))));
                arrayList.add(transaksiTunda13);
            }
            Iterator<E> it13 = sort12.iterator();
            while (it13.hasNext()) {
                KirimanUang kirimanUang2 = (KirimanUang) it13.next();
                TransaksiTunda transaksiTunda14 = new TransaksiTunda();
                transaksiTunda14.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kirimanUang2.getCreatedAt()));
                transaksiTunda14.setNoReff("");
                transaksiTunda14.setTxnType("Transfer Valuta Asing");
                transaksiTunda14.setServiceType("");
                transaksiTunda14.setToken("");
                transaksiTunda14.setFlagRating("");
                transaksiTunda14.setDraft(true);
                transaksiTunda14.setTypeDraft("KIRIMANUANG");
                transaksiTunda14.setDataId(kirimanUang2.getId());
                transaksiTunda14.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kirimanUang2.getCreatedAt()))));
                arrayList.add(transaksiTunda14);
            }
            Iterator<E> it14 = sort13.iterator();
            while (it14.hasNext()) {
                Kliring kliring2 = (Kliring) it14.next();
                TransaksiTunda transaksiTunda15 = new TransaksiTunda();
                transaksiTunda15.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kliring2.getCreatedAt()));
                transaksiTunda15.setNoReff("");
                transaksiTunda15.setTxnType("Kliring");
                transaksiTunda15.setServiceType("");
                transaksiTunda15.setToken("");
                transaksiTunda15.setFlagRating("");
                transaksiTunda15.setDraft(true);
                transaksiTunda15.setTypeDraft("KLIRING");
                transaksiTunda15.setDataId(kliring2.getId());
                transaksiTunda15.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(kliring2.getCreatedAt()))));
                arrayList.add(transaksiTunda15);
            }
            Iterator<E> it15 = sort14.iterator();
            while (it15.hasNext()) {
                CreditCard creditCard2 = (CreditCard) it15.next();
                TransaksiTunda transaksiTunda16 = new TransaksiTunda();
                transaksiTunda16.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(creditCard2.getCreatedAt().longValue()));
                transaksiTunda16.setNoReff("");
                transaksiTunda16.setTxnType("Pengajuan Kartu Kredit BCA");
                transaksiTunda16.setServiceType("");
                transaksiTunda16.setToken("");
                transaksiTunda16.setFlagRating("");
                transaksiTunda16.setDraft(true);
                transaksiTunda16.setTypeDraft("CC");
                transaksiTunda16.setDataId(creditCard2.getId().longValue());
                transaksiTunda16.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(creditCard2.getCreatedAt().longValue()))));
                arrayList.add(transaksiTunda16);
            }
            Iterator<E> it16 = sort15.iterator();
            while (it16.hasNext()) {
                EChannel eChannel2 = (EChannel) it16.next();
                TransaksiTunda transaksiTunda17 = new TransaksiTunda();
                transaksiTunda17.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(eChannel2.getCreatedAt().longValue()));
                transaksiTunda17.setNoReff("");
                transaksiTunda17.setTxnType("Internet/Mobile Banking");
                transaksiTunda17.setServiceType("");
                transaksiTunda17.setToken("");
                transaksiTunda17.setFlagRating("");
                transaksiTunda17.setDraft(true);
                transaksiTunda17.setTypeDraft("ECHANNEL");
                transaksiTunda17.setDataId(eChannel2.getId().longValue());
                transaksiTunda17.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(eChannel2.getCreatedAt().longValue()))));
                arrayList.add(transaksiTunda17);
            }
            Iterator<E> it17 = sort16.iterator();
            while (it17.hasNext()) {
                BankTransfer bankTransfer2 = (BankTransfer) it17.next();
                TransaksiTunda transaksiTunda18 = new TransaksiTunda();
                transaksiTunda18.setTxbDate(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(bankTransfer2.getCreatedAt()));
                transaksiTunda18.setNoReff("");
                transaksiTunda18.setTxnType("Transfer ke Bank Lain");
                transaksiTunda18.setServiceType("");
                transaksiTunda18.setToken("");
                transaksiTunda18.setFlagRating("");
                transaksiTunda18.setDraft(true);
                transaksiTunda18.setTypeDraft("BANKTRANSFER");
                transaksiTunda18.setDataId(bankTransfer2.getId());
                transaksiTunda18.setTxbDateFormatted(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").print(bankTransfer2.getCreatedAt()))));
                arrayList.add(transaksiTunda18);
            }
        }
        Collections.sort(arrayList, new Comparator<TransaksiTunda>() { // from class: com.bca.smartbranch.fragment.TransaksiTundaFragment.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(TransaksiTunda transaksiTunda19, TransaksiTunda transaksiTunda20) {
                return DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(transaksiTunda20.getTxbDate()).compareTo((ReadableInstant) DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(transaksiTunda19.getTxbDate()));
            }
        });
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String e = getAnnualFeeBasicAmount.e(((TransaksiTunda) arrayList.get(i2)).getTxbDate());
            if (!this.E.equals(e)) {
                TransaksiTunda transaksiTunda19 = new TransaksiTunda();
                transaksiTunda19.setTxbDate(((TransaksiTunda) arrayList.get(i2)).getTxbDate());
                transaksiTunda19.setTxbDateFormatted(e);
                transaksiTunda19.setHeader(true);
                arrayList4.add(transaksiTunda19);
            }
            arrayList4.add((TransaksiTunda) arrayList.get(i2));
            this.E = e;
        }
        this.a++;
        if (!this.C) {
            this.d.d();
        }
        TransaksiTundaAdapter transaksiTundaAdapter2 = this.d;
        transaksiTundaAdapter2.g.addAll(arrayList4);
        transaksiTundaAdapter2.a.b();
        this.m.addAll(arrayList4);
        this.f = false;
        this.C = false;
        ((TransactionActivity) getActivity()).q = this.m;
        ((TransactionActivity) getActivity()).n = this.a;
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(List<CategoryResponse> list, List<CategoryResponse> list2, List<CategoryResponse> list3, List<CategoryResponse> list4, List<CategoryResponse> list5, List<CategoryResponse> list6, List<CategoryResponse> list7, List<CategoryResponse> list8) {
        h();
        Intent intent = new Intent(getContext(), CC8FormKartuKreditActivity.class);
        intent.putExtra("id_draft", true);
        intent.putExtra("cc_id", this.k);
        intent.putExtra("listOccupation", ListUtil.OneItemImmutableList.e(list));
        intent.putExtra("listHomeStatus", ListUtil.OneItemImmutableList.e(list2));
        intent.putExtra("listEducation", ListUtil.OneItemImmutableList.e(list3));
        intent.putExtra("listBussinessField", ListUtil.OneItemImmutableList.e(list4));
        intent.putExtra("listBankName", ListUtil.OneItemImmutableList.e(list5));
        intent.putExtra("listMaritalStatus", ListUtil.OneItemImmutableList.e(list6));
        intent.putExtra("listRelationship", ListUtil.OneItemImmutableList.e(list7));
        intent.putExtra("listCity", ListUtil.OneItemImmutableList.e(list8));
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.n));
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b_(String str) {
        h();
        getActivity().setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.g.getImei());
        bundle.putString("email", this.g.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493280;
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void c(GetCustAcctListResponse getCustAcctListResponse) {
        this.y = getCustAcctListResponse;
        if (!this.z) {
            if (this.am.equals("kirim_uang")) {
                a();
                return;
            }
            h();
            Intent intent = new Intent(getContext(), TarikanTransaksiActivity.class);
            intent.putExtra("id_draft", true);
            intent.putExtra("transaksi_teller_id", this.aj);
            intent.putExtra("TellerType", "tarikan");
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent);
        } else if (this.am.equals("kirim_uang")) {
            a();
        } else if (this.x.getTxnDetail().getType().equals("Kliring")) {
            this.ak.clear();
            this.aq.clear();
            this.ac.d(this.g, "Individu");
        } else {
            h();
            Intent intent2 = new Intent(getContext(), TarikanUbahTransaksiActivity.class);
            intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
            intent2.putExtra("token", this.ah);
            intent2.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent2);
        }
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void c(KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse) {
        this.af = kategoriTujuanTransaksiORResponse;
        if (!this.z) {
            String iSONegaraTujuanTransaksi = ((KirimanUang) this.Y.where(KirimanUang.class).equalTo("id", Long.valueOf(this.aj)).findFirst()).getISONegaraTujuanTransaksi();
            if (!iSONegaraTujuanTransaksi.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("Email", this.g.getEmail());
                    jSONObject.put("SessionId", this.g.getSessionId());
                    jSONObject.put("IMEI", this.g.getImei());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.L.d(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), iSONegaraTujuanTransaksi, "BIC");
                return;
            }
            h();
            documentProvider.b().d(new o.TransactionActivity());
            Intent intent = new Intent(getActivity(), OutwardRemittanceFormActivity.class);
            intent.putExtra("id_draft", true);
            intent.putExtra("transaksi_teller_id", this.aj);
            intent.putExtra("TellerType", "kirim_uang");
            intent.putExtra("data_beneficiary", ListUtil.OneItemImmutableList.e(this.ad));
            intent.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(this.af));
            intent.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(this.l));
            intent.putExtra("data_daftar_transfer", ListUtil.OneItemImmutableList.e(this.q));
            GetCustAcctListResponse getCustAcctListResponse = this.y;
            if (getCustAcctListResponse != null) {
                intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            }
            startActivity(intent);
            return;
        }
        h();
        Intent intent2 = new Intent(getActivity(), OutwardRemittanceFormUbahActivity.class);
        intent2.putExtra("TellerType", "kirim_uang");
        intent2.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(this.af));
        intent2.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(this.l));
        intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        GetCustAcctListResponse getCustAcctListResponse2 = this.y;
        if (getCustAcctListResponse2 != null) {
            intent2.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse2));
        }
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter.IconCompatParcelizer
    public final void d() {
        h();
        b();
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void d(CategoriesORResponse categoriesORResponse) {
        this.l = categoriesORResponse;
        User user = this.g;
        if (user == null || !user.getVerified().equals("Y")) {
            a();
        } else {
            e();
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(GetTxnTellerDetailResponse getTxnTellerDetailResponse, GetCustAcctListResponse getCustAcctListResponse, KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse, CategoriesORResponse categoriesORResponse, List<DaftarTransferResponse.DaftarTransferOutput> list) {
        h();
        Intent intent = new Intent(getActivity(), OutwardRemittanceFormUbahActivity.class);
        intent.putExtra("TellerType", "kirim_uang");
        intent.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(kategoriTujuanTransaksiORResponse));
        intent.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(categoriesORResponse));
        intent.putExtra("data_daftar_transfer", ListUtil.OneItemImmutableList.e(list));
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(getTxnTellerDetailResponse));
        intent.putExtra("token", this.ah);
        if (getCustAcctListResponse != null) {
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final <T> void d(T t) {
        h();
        onClickMenu onclickmenu = (onClickMenu) t;
        if (!this.z) {
            Intent intent = new Intent(getActivity(), subscribeUbahVisaCardEvent.class);
            intent.putExtra("is_draft", true);
            intent.putExtra("transaksi_kliring_id", this.ai);
            intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.H));
            intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.ak));
            intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.aq));
            intent.putExtra("isAutoFill", this.g.getVerified().equals("Y"));
            startActivity(intent);
        } else if (this.g.getVerified().equals("Y")) {
            Intent intent2 = new Intent(getContext(), subscribeUbahVisaCardEvent.class);
            intent2.putExtra("is_draft", false);
            intent2.putExtra("isUbahForm", true);
            intent2.putExtra("isUbahFormEnabled", true);
            intent2.putExtra("list_acct", ListUtil.OneItemImmutableList.e(this.y));
            intent2.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.H));
            intent2.putExtra("BANK_LOCAL_LIST", ListUtil.OneItemImmutableList.e(onclickmenu));
            intent2.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.ak));
            intent2.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.aq));
            intent2.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(b(this.x)));
            intent2.putExtra("token_ubah_tunda", this.ah);
            intent2.putExtra("isAutoFill", true);
            startActivity(intent2);
        } else {
            Intent intent3 = new Intent(getContext(), subscribeUbahVisaCardEvent.class);
            intent3.putExtra("is_draft", false);
            intent3.putExtra("isUbahForm", true);
            intent3.putExtra("isUbahFormEnabled", true);
            intent3.putExtra("token_ubah_tunda", this.ah);
            intent3.putExtra("BANK_LOCAL_LIST", ListUtil.OneItemImmutableList.e(onclickmenu));
            intent3.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.H));
            intent3.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.ak));
            intent3.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.aq));
            intent3.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(b(this.x)));
            intent3.putExtra("isAutoFill", true);
            startActivity(intent3);
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void d(List<clikedKeyHilang> list) {
        this.H.clear();
        for (clikedKeyHilang clikedkeyhilang : list) {
            if (clikedkeyhilang.d.equals("Y")) {
                this.H.add(Long.valueOf(clikedkeyhilang.e));
            }
        }
        this.I.e(this.g);
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter.write
    public final void d(List<? extends DaftarTransferResponse.DaftarTransferOutput> list, MasterFundSourcePurposeResponse masterFundSourcePurposeResponse, String str) {
        h();
        if (str != null && str.equals("LOAD_DATA")) {
            this.ag = masterFundSourcePurposeResponse;
            ArrayList arrayList = new ArrayList();
            for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
                DaftarTransfer daftarTransfer = new DaftarTransfer();
                daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
                daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
                daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
                arrayList.add(daftarTransfer);
            }
            Intent intent = new Intent(getContext(), FormTellerActivity.class);
            intent.putExtra("id_draft", true);
            intent.putExtra("transaksi_teller_id", this.aj);
            intent.putExtra("TellerType", "setoran");
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = this.ag;
            if (masterFundSourcePurposeResponse2 != null) {
                intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse2));
            }
            startActivity(intent);
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void d(clikedKartuHilang clikedkartuhilang) {
        this.n = clikedkartuhilang.a;
        GetCategoryPresenter getCategoryPresenter = this.u;
        getCategoryPresenter.b.g_();
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("occupation");
        getCategoryPresenter.e = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0031: INVOKE  
              (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<o.clikedKeyRusak>>)
              (wrap: com.bca.smartbranch.presenter.GetCategoryPresenter$4 : 0x002e: CONSTRUCTOR  (r1v4 com.bca.smartbranch.presenter.GetCategoryPresenter$4 A[REMOVE]) = (r0v2 'getCategoryPresenter' com.bca.smartbranch.presenter.GetCategoryPresenter) call: com.bca.smartbranch.presenter.GetCategoryPresenter.4.<init>(com.bca.smartbranch.presenter.GetCategoryPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.TransaksiTundaFragment.d(o.clikedKartuHilang):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiTundaFragment.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetCategoryPresenter, state: GENERATED_AND_UNLOADED
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
            this = this;
            r0 = r5
            r1 = r6
            java.util.List<com.bca.smartbranch.data.api.response.CardType> r1 = r1.a
            r0.n = r1
            r0 = r5
            com.bca.smartbranch.presenter.GetCategoryPresenter r0 = r0.u
            r6 = r0
            r0 = r6
            com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.b
            r0.g_()
            r0 = r6
            o.setIncomeDisplayAmount r0 = r0.apiService
            java.lang.String r1 = "occupation"
            retrofit2.Call r0 = r0.e(r1)
            r7 = r0
            r0 = r6
            r1 = r7
            r0.e = r1
            r0 = r7
            com.bca.smartbranch.presenter.GetCategoryPresenter$4 r1 = new com.bca.smartbranch.presenter.GetCategoryPresenter$4
            r2 = r1
            r3 = r6
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TransaksiTundaFragment.d(o.clikedKartuHilang):void");
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer
    public final void e(GetTxnTellerDetailResponse getTxnTellerDetailResponse) {
        this.x = getTxnTellerDetailResponse;
        this.z = true;
        if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Tarikan Tunai")) {
            User user = this.g;
            if (user == null || !user.getVerified().equals("Y")) {
                h();
                Intent intent = new Intent(getContext(), TarikanUbahTransaksiActivity.class);
                intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(getTxnTellerDetailResponse));
                intent.putExtra("token", this.ah);
                startActivity(intent);
                return;
            }
            e();
        } else if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Setoran Tunai")) {
            if (new BigInteger(getTxnTellerDetailResponse.getTxnDetail().getTxnAmount()).compareTo(BigInteger.valueOf(100000000)) >= 0) {
                boolean equalsIgnoreCase = getTxnTellerDetailResponse.getTxnDetail().getSourceAccountOwnerType().equalsIgnoreCase("ORG");
                GetFundPurposePresenter getFundPurposePresenter = this.X;
                String e = getPromotion.e(this.g);
                getFundPurposePresenter.e.g_();
                getFundPurposePresenter.b(e, "Y", equalsIgnoreCase);
                return;
            }
            this.R.d(new InfoProductActivity(this.g.getEmail(), this.g.getSessionId(), this.g.getImei(), "Setoran Tunai"), false);
        } else if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Transfer Valuta Asing")) {
            this.ab.a(this.g, this.x);
        } else if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Kliring")) {
            this.am = "kliring";
            if (SystemClock.elapsedRealtime() - this.G >= 3000) {
                this.G = SystemClock.elapsedRealtime();
                User user2 = this.g;
                if (user2 == null || !user2.getVerified().equals("Y")) {
                    this.ak.clear();
                    this.aq.clear();
                    this.ac.d(this.g, "Individu");
                    return;
                }
                e();
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void e(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse) {
        if (this.r != null) {
            this.ag = masterFundSourcePurposeResponse;
            this.R.d(new InfoProductActivity(this.g.getEmail(), this.g.getSessionId(), this.g.getImei(), "Setoran Tunai"), false);
        } else if (!this.z) {
            h();
            Intent intent = new Intent(getContext(), FormTellerActivity.class);
            intent.putExtra("id_draft", true);
            intent.putExtra("transaksi_teller_id", this.aj);
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
            intent.putExtra("TellerType", "setoran");
            getContext().startActivity(intent);
        } else {
            this.ag = masterFundSourcePurposeResponse;
            this.R.d(new InfoProductActivity(this.g.getEmail(), this.g.getSessionId(), this.g.getImei(), "Setoran Tunai"), false);
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        h();
        ArrayList arrayList = new ArrayList();
        if (this.r != null) {
            Intent intent = new Intent(getActivity(), TxnBerkalaDetailActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.r));
            intent.putExtra("token", this.ah);
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.ag;
            if (masterFundSourcePurposeResponse != null) {
                intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
            }
            startActivity(intent);
            this.r = null;
            return;
        }
        Intent intent2 = new Intent(getContext(), FormUbahTellerActivity.class);
        intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        intent2.putExtra("token", this.ah);
        intent2.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = this.ag;
        if (masterFundSourcePurposeResponse2 != null) {
            intent2.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse2));
        }
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        h();
        ArrayList arrayList = new ArrayList();
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
            DaftarTransfer daftarTransfer = new DaftarTransfer();
            daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
            daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
            daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
            arrayList.add(daftarTransfer);
        }
        if (this.r != null) {
            Intent intent = new Intent(getActivity(), TxnBerkalaDetailActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.r));
            intent.putExtra("token", this.ah);
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.ag;
            if (masterFundSourcePurposeResponse != null) {
                intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
            }
            startActivity(intent);
            this.r = null;
            return;
        }
        Intent intent2 = new Intent(getContext(), FormUbahTellerActivity.class);
        intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        intent2.putExtra("token", this.ah);
        intent2.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = this.ag;
        if (masterFundSourcePurposeResponse2 != null) {
            intent2.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse2));
        }
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void e(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2) {
        this.ak.add(list);
        this.aq.add(list2);
        if (this.ak.size() >= 2 || this.aq.size() >= 2 || this.g.getVerified().equals("Y")) {
            this.ac.a(this.g, DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(0).getTimeInMillis()), DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(14).getTimeInMillis()));
            return;
        }
        this.ac.d(this.g, "Perusahaan");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        h();
        ArrayList arrayList = new ArrayList();
        if (this.r != null) {
            Intent intent = new Intent(getActivity(), TxnBerkalaDetailActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.r));
            intent.putExtra("token", this.ah);
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.ag;
            if (masterFundSourcePurposeResponse != null) {
                intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
            }
            startActivity(intent);
            this.r = null;
            return;
        }
        Intent intent2 = new Intent(getContext(), FormUbahTellerActivity.class);
        intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        intent2.putExtra("token", this.ah);
        intent2.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = this.ag;
        if (masterFundSourcePurposeResponse2 != null) {
            intent2.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse2));
        }
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void f(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void g(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        h();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(getContext(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        intent.putExtra("token", this.ah);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.ag;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        startActivity(intent);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void getTxnBerkalDetailEvent(inputChangePenerima inputchangepenerima) {
        b(inputchangepenerima.a);
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void i(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void k(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    public final void l(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void m(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void m_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void n(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getChildFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void n_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void o(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void o_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        this.h = new TransactionPresenter();
        this.w = new GetTxnBerkalaDetailPresenter();
        this.t = new DeleteTxnBerkalaDraftPresenter();
        this.u = new GetCategoryPresenter();
        this.U = new GetCreditCardOptionsPresenter();
        GetTxnTellerDetailPresenter getTxnTellerDetailPresenter = new GetTxnTellerDetailPresenter();
        this.W = getTxnTellerDetailPresenter;
        getTxnTellerDetailPresenter.c = this;
        DaftarTransferPresenter daftarTransferPresenter = new DaftarTransferPresenter();
        this.R = daftarTransferPresenter;
        daftarTransferPresenter.c = this;
        CancelTundaPresenter cancelTundaPresenter = new CancelTundaPresenter();
        this.N = cancelTundaPresenter;
        cancelTundaPresenter.a = this;
        CancelReservationPresenter cancelReservationPresenter = new CancelReservationPresenter();
        this.J = cancelReservationPresenter;
        cancelReservationPresenter.a = this;
        GetCustAcctListPresenter getCustAcctListPresenter = new GetCustAcctListPresenter();
        this.V = getCustAcctListPresenter;
        getCustAcctListPresenter.e = this;
        GetFundPurposePresenter getFundPurposePresenter = new GetFundPurposePresenter();
        this.X = getFundPurposePresenter;
        getFundPurposePresenter.e = this;
        DetailTransactionPresenter detailTransactionPresenter = new DetailTransactionPresenter();
        this.Q = detailTransactionPresenter;
        detailTransactionPresenter.e = this;
        BeneficiaryBankPresenter beneficiaryBankPresenter = new BeneficiaryBankPresenter();
        this.L = beneficiaryBankPresenter;
        beneficiaryBankPresenter.b = this;
        KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter = new KategoriTujuanTransaksiORPresenter();
        this.F = kategoriTujuanTransaksiORPresenter;
        kategoriTujuanTransaksiORPresenter.e = this;
        GetBankSpecialRelationPresenter getBankSpecialRelationPresenter = new GetBankSpecialRelationPresenter();
        this.P = getBankSpecialRelationPresenter;
        getBankSpecialRelationPresenter.b = this;
        GetCategoriesORPresenter getCategoriesORPresenter = new GetCategoriesORPresenter();
        this.O = getCategoriesORPresenter;
        getCategoriesORPresenter.a = this;
        GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = new GetAcctOpeningCategoryDataPresenter();
        this.S = getAcctOpeningCategoryDataPresenter;
        getAcctOpeningCategoryDataPresenter.c = this;
        InquiryEditDataORPresenter inquiryEditDataORPresenter = new InquiryEditDataORPresenter();
        this.ab = inquiryEditDataORPresenter;
        inquiryEditDataORPresenter.b = this;
        DaftarTransferLoadDataORPresenter daftarTransferLoadDataORPresenter = new DaftarTransferLoadDataORPresenter();
        this.M = daftarTransferLoadDataORPresenter;
        daftarTransferLoadDataORPresenter.a = this;
        GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = new GetTxnTellerDetailKUPresenter();
        this.T = getTxnTellerDetailKUPresenter;
        getTxnTellerDetailKUPresenter.a = this;
        InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = new InquiryLoadDataBTPresenter();
        this.Z = inquiryLoadDataBTPresenter;
        inquiryLoadDataBTPresenter.e = this;
        InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter = new InquiryLoadDataSetunPresenter();
        this.aa = inquiryLoadDataSetunPresenter;
        inquiryLoadDataSetunPresenter.g = this;
        KliringPresenter kliringPresenter = new KliringPresenter();
        this.ac = kliringPresenter;
        kliringPresenter.d = this;
        BankListPresenter bankListPresenter = new BankListPresenter();
        this.I = bankListPresenter;
        bankListPresenter.d = this;
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.Y.close();
        this.h.c();
        GetTxnBerkalaDetailPresenter getTxnBerkalaDetailPresenter = this.w;
        Call<OpenAccountSuccessActivity<PenggantianKeyBCAActivity_ViewBinding>> call = getTxnBerkalaDetailPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getTxnBerkalaDetailPresenter.c = null;
        this.u.c();
        GetCreditCardOptionsPresenter getCreditCardOptionsPresenter = this.U;
        Call<OpenAccountSuccessActivity<clikedKartuHilang>> call2 = getCreditCardOptionsPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        getCreditCardOptionsPresenter.c = null;
        this.W.e();
        DaftarTransferPresenter daftarTransferPresenter = this.R;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call3 = daftarTransferPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        daftarTransferPresenter.c = null;
        CancelReservationPresenter cancelReservationPresenter = this.J;
        Call<OpenAccountSuccessActivity<Object>> call4 = cancelReservationPresenter.c;
        if (call4 != null) {
            call4.cancel();
        }
        cancelReservationPresenter.a = null;
        CancelTundaPresenter cancelTundaPresenter = this.N;
        Call<OpenAccountSuccessActivity<Object>> call5 = cancelTundaPresenter.d;
        if (call5 != null) {
            call5.cancel();
        }
        cancelTundaPresenter.a = null;
        GetCustAcctListPresenter getCustAcctListPresenter = this.V;
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call6 = getCustAcctListPresenter.b;
        if (call6 != null) {
            call6.cancel();
        }
        getCustAcctListPresenter.e = null;
        GetFundPurposePresenter getFundPurposePresenter = this.X;
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call7 = getFundPurposePresenter.c;
        if (call7 != null) {
            call7.cancel();
        }
        getFundPurposePresenter.e = null;
        DetailTransactionPresenter detailTransactionPresenter = this.Q;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call8 = detailTransactionPresenter.c;
        if (call8 != null) {
            call8.cancel();
        }
        detailTransactionPresenter.e = null;
        BeneficiaryBankPresenter beneficiaryBankPresenter = this.L;
        Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> call9 = beneficiaryBankPresenter.e;
        if (call9 != null) {
            call9.cancel();
        }
        beneficiaryBankPresenter.e = null;
        KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter = this.F;
        Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call10 = kategoriTujuanTransaksiORPresenter.c;
        if (call10 != null) {
            call10.cancel();
        }
        kategoriTujuanTransaksiORPresenter.c = null;
        GetBankSpecialRelationPresenter getBankSpecialRelationPresenter = this.P;
        Call<OpenAccountSuccessActivity<GetBankSpecialRelationResponse>> call11 = getBankSpecialRelationPresenter.c;
        if (call11 != null) {
            call11.cancel();
        }
        getBankSpecialRelationPresenter.c = null;
        GetCategoriesORPresenter getCategoriesORPresenter = this.O;
        Call<OpenAccountSuccessActivity<CategoriesORResponse>> call12 = getCategoriesORPresenter.d;
        if (call12 != null) {
            call12.cancel();
        }
        getCategoriesORPresenter.d = null;
        GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = this.S;
        Call<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> call13 = getAcctOpeningCategoryDataPresenter.a;
        if (call13 != null) {
            call13.cancel();
        }
        getAcctOpeningCategoryDataPresenter.a = null;
        this.ab.d();
        DaftarTransferLoadDataORPresenter daftarTransferLoadDataORPresenter = this.M;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call14 = daftarTransferLoadDataORPresenter.e;
        if (call14 != null) {
            call14.cancel();
        }
        daftarTransferLoadDataORPresenter.a = null;
        GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = this.T;
        Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> call15 = getTxnTellerDetailKUPresenter.c;
        if (call15 != null) {
            call15.cancel();
        }
        getTxnTellerDetailKUPresenter.a = null;
        this.Z.e();
        InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter = this.aa;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call16 = inquiryLoadDataSetunPresenter.d;
        if (call16 != null) {
            subscribeReservationRescheduleEvent.c(call16);
            call16.cancel();
        }
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call17 = inquiryLoadDataSetunPresenter.b;
        if (call17 != null) {
            subscribeReservationRescheduleEvent.c(call17);
            call17.cancel();
        }
        inquiryLoadDataSetunPresenter.g = null;
        this.ac.b();
        this.I.b();
        DeleteTxnBerkalaDraftPresenter deleteTxnBerkalaDraftPresenter = this.t;
        Call<OpenAccountSuccessActivity<Object>> call18 = deleteTxnBerkalaDraftPresenter.e;
        if (call18 != null) {
            call18.cancel();
        }
        deleteTxnBerkalaDraftPresenter.a = null;
        documentProvider.b().e(requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        documentProvider.b().c(this);
        List<TransaksiTunda> list = ((TransactionActivity) getActivity()).q;
        this.m = list;
        if (!list.isEmpty()) {
            this.a = ((TransactionActivity) getActivity()).n;
            this.C = false;
            List<TransaksiTunda> list2 = this.m;
            this.i = list2.get(list2.size() - 1).getTxbDate();
            TransaksiTundaAdapter transaksiTundaAdapter = this.d;
            transaksiTundaAdapter.g = this.m;
            transaksiTundaAdapter.a.b();
        } else {
            b();
        }
        h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        documentProvider.b().e(this);
        onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.h.d = this;
        this.w.c = this;
        this.t.a = this;
        this.u.b = this;
        this.U.c = this;
        Realm defaultInstance = Realm.getDefaultInstance();
        this.Y = defaultInstance;
        this.g = (User) defaultInstance.where(User.class).equalTo("email", this.b, Case.INSENSITIVE).findFirst();
        this.d = new TransaksiTundaAdapter(getActivity());
        getContext();
        this.rvTransaksiTertunda.setLayoutManager(new LinearLayoutManager(1, false));
        this.tvTransaksiEmpty.setText("Transaksi Tertunda");
        this.rvTransaksiTertunda.setEmptyView(this.llEmpty);
        this.rvTransaksiTertunda.setAdapter(this.d);
        this.swipeRefreshLayout.setOnRefreshListener(new setBackgroundColorRes.read() { // from class: com.bca.smartbranch.fragment.TransaksiTundaFragment.2
            @Override // o.setBackgroundColorRes.read
            public final void c() {
                TransaksiTundaFragment.this.b();
            }
        });
        this.svMain.setOnScrollChangeListener(new getLifecycle$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.BranchResponse$$Parcelable
            @Override // o.getLifecycle$MediaBrowserCompat$CustomActionResultReceiver
            public final void a(getLifecycle getlifecycle, int i, int i2, int i3, int i4) {
                TransaksiTundaFragment transaksiTundaFragment = TransaksiTundaFragment.this;
                if (getlifecycle.getChildAt(getlifecycle.getChildCount() - 1) != null && !transaksiTundaFragment.f && i2 >= getlifecycle.getChildAt(getlifecycle.getChildCount() - 1).getMeasuredHeight() - getlifecycle.getMeasuredHeight() && i2 > i4 && transaksiTundaFragment.a < transaksiTundaFragment.j) {
                    TransaksiTundaAdapter transaksiTundaAdapter = transaksiTundaFragment.d;
                    transaksiTundaAdapter.b = true;
                    transaksiTundaAdapter.g.add(new TransaksiTunda());
                    transaksiTundaAdapter.a.e(transaksiTundaAdapter.g.size() - 1, 1);
                    transaksiTundaFragment.h.d(getPromotion.b(transaksiTundaFragment.g, transaksiTundaFragment.i), new onCreditCardRedirect("TUNDA"));
                }
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void p(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void p_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void q(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void q_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void r(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getChildFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void r_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @OnClick({2131296446})
    public void retry(View view) {
        this.h.d(getPromotion.b(this.g, this.i), new onCreditCardRedirect("TUNDA"));
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void s() {
        this.f = true;
        if (!this.swipeRefreshLayout.j && this.C) {
            this.ar.setDisplayedChild(2);
        }
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void s(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getChildFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void s_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeDraftEvent(onChooseMenuCSEvent onchoosemenucsevent) {
        if ("open_draft".equals(onchoosemenucsevent.a)) {
            String typeDraft = this.m.get(onchoosemenucsevent.c).getTypeDraft();
            typeDraft.hashCode();
            char c = 65535;
            switch (typeDraft.hashCode()) {
                case -1938537344:
                    if (typeDraft.equals("PEMREK")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1591184238:
                    if (typeDraft.equals("SETORAN")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1045391414:
                    if (typeDraft.equals("KIRIMANUANG")) {
                        c = 2;
                        break;
                    }
                    break;
                case -820229676:
                    if (typeDraft.equals("TARIKAN")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2124:
                    if (typeDraft.equals("BN")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2144:
                    if (typeDraft.equals("CC")) {
                        c = 5;
                        break;
                    }
                    break;
                case 89047352:
                    if (typeDraft.equals("KLIRING")) {
                        c = 6;
                        break;
                    }
                    break;
                case 592030247:
                    if (typeDraft.equals("BANKTRANSFER")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1451761918:
                    if (typeDraft.equals("ECHANNEL")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    documentProvider.b().d(new tujuanTransaksiEvent(this.m.get(onchoosemenucsevent.c).getDataId()));
                    return;
                case 1:
                    documentProvider.b().d(new o.TransactionActivity());
                    documentProvider.b().d(new updateDaftarTransfer(this.m.get(onchoosemenucsevent.c).getDataId()));
                    return;
                case 2:
                    documentProvider.b().d(new showDataPengirim(this.m.get(onchoosemenucsevent.c).getDataId()));
                    return;
                case 3:
                    documentProvider.b().d(new o.TransactionActivity());
                    documentProvider.b().d(new TxnBerkalaDetailActivity_ViewBinding(this.m.get(onchoosemenucsevent.c).getDataId()));
                    return;
                case 4:
                    documentProvider.b().d(new o.TransactionActivity());
                    startActivity(new Intent(getActivity(), FormBankNotesActivity.class));
                    break;
                case 5:
                    break;
                case 6:
                    documentProvider.b().d(new o.TransactionActivity());
                    documentProvider.b().d(new showDataTransaksiBerkala(this.m.get(onchoosemenucsevent.c).getDataId(), false));
                    return;
                case 7:
                    documentProvider.b().d(new o.TransactionActivity());
                    documentProvider.b().d(new subsriberChooseValueHariEvent(this.m.get(onchoosemenucsevent.c).getDataId()));
                    return;
                case '\b':
                    Intent intent = new Intent(getContext(), NoAtmEChannelActivity.class);
                    intent.putExtra("is_draft", true);
                    intent.putExtra("draft_id", this.m.get(onchoosemenucsevent.c).getDataId());
                    startActivity(intent);
                    return;
                default:
                    return;
            }
            documentProvider.b().d(new showDataPenerima(this.m.get(onchoosemenucsevent.c).getDataId()));
        } else if ("delete_draft".equals(onchoosemenucsevent.a)) {
            this.Y.executeTransaction(new Realm.Transaction(onchoosemenucsevent) { // from class: o.setLongitude
                public final /* synthetic */ onChooseMenuCSEvent c;

                {
                    this.c = r5;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    char c2;
                    TransaksiTundaFragment transaksiTundaFragment = TransaksiTundaFragment.this;
                    onChooseMenuCSEvent onchoosemenucsevent2 = this.c;
                    String typeDraft2 = transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getTypeDraft();
                    typeDraft2.hashCode();
                    switch (typeDraft2.hashCode()) {
                        case -1938537344:
                            if (typeDraft2.equals("PEMREK")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1591184238:
                            if (typeDraft2.equals("SETORAN")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1045391414:
                            if (typeDraft2.equals("KIRIMANUANG")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -820229676:
                            if (typeDraft2.equals("TARIKAN")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2144:
                            if (typeDraft2.equals("CC")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 89047352:
                            if (typeDraft2.equals("KLIRING")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 592030247:
                            if (typeDraft2.equals("BANKTRANSFER")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1451761918:
                            if (typeDraft2.equals("ECHANNEL")) {
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
                            transaksiTundaFragment.g.getAccounts().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        case 1:
                            transaksiTundaFragment.g.getSetorans().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        case 2:
                            transaksiTundaFragment.g.getKirimanUangs().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        case 3:
                            transaksiTundaFragment.g.getTarikans().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        case 4:
                            transaksiTundaFragment.g.getCreditCards().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        case 5:
                            transaksiTundaFragment.g.getKlirings().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        case 6:
                            transaksiTundaFragment.g.getBankTransfers().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        case 7:
                            transaksiTundaFragment.g.geteChannels().where().equalTo("id", Long.valueOf(transaksiTundaFragment.m.get(onchoosemenucsevent2.c).getDataId())).findFirst().deleteFromRealm();
                            return;
                        default:
                            return;
                    }
                }
            });
            b();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeDraftTxnBerkalaEvent(onRefreshListRingkasan onrefreshlistringkasan) {
        if (onrefreshlistringkasan.e.equals("open_draft")) {
            b(onrefreshlistringkasan.c);
        } else if (onrefreshlistringkasan.e.equals("delete_draft")) {
            int i = onrefreshlistringkasan.c;
            InfoBiayaActivity infoBiayaActivity = new InfoBiayaActivity();
            infoBiayaActivity.e = this.g.getEmail();
            infoBiayaActivity.b = this.g.getSessionId();
            infoBiayaActivity.a = this.g.getImei();
            infoBiayaActivity.d = this.m.get(i).getToken();
            DeleteTxnBerkalaDraftPresenter deleteTxnBerkalaDraftPresenter = this.t;
            deleteTxnBerkalaDraftPresenter.a.g_();
            Call<OpenAccountSuccessActivity<Object>> d = deleteTxnBerkalaDraftPresenter.apiService.d(infoBiayaActivity);
            deleteTxnBerkalaDraftPresenter.e = d;
            d.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008c: INVOKE  
                  (r0v19 'd' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter$1 : 0x0089: CONSTRUCTOR  (r1v19 com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter$1 A[REMOVE]) = (r0v14 'deleteTxnBerkalaDraftPresenter' com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter) call: com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter.1.<init>(com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.TransaksiTundaFragment.subscribeDraftTxnBerkalaEvent(o.onRefreshListRingkasan):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiTundaFragment.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter, state: GENERATED_AND_UNLOADED
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
                java.lang.String r0 = r0.e
                java.lang.String r1 = "open_draft"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0016
                r0 = r5
                r1 = r6
                int r1 = r1.c
                r0.b(r1)
                return
            L_0x0016:
                r0 = r6
                java.lang.String r0 = r0.e
                java.lang.String r1 = "delete_draft"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0091
                r0 = r6
                int r0 = r0.c
                r7 = r0
                o.InfoBiayaActivity r0 = new o.InfoBiayaActivity
                r1 = r0
                r1.<init>()
                r8 = r0
                r0 = r8
                r1 = r5
                com.bca.smartbranch.data.localdb.User r1 = r1.g
                java.lang.String r1 = r1.getEmail()
                r0.e = r1
                r0 = r8
                r1 = r5
                com.bca.smartbranch.data.localdb.User r1 = r1.g
                java.lang.String r1 = r1.getSessionId()
                r0.b = r1
                r0 = r8
                r1 = r5
                com.bca.smartbranch.data.localdb.User r1 = r1.g
                java.lang.String r1 = r1.getImei()
                r0.a = r1
                r0 = r8
                r1 = r5
                java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> r1 = r1.m
                r2 = r7
                java.lang.Object r1 = r1.get(r2)
                com.bca.smartbranch.data.global.TransaksiTunda r1 = (com.bca.smartbranch.data.global.TransaksiTunda) r1
                java.lang.String r1 = r1.getToken()
                r0.d = r1
                r0 = r5
                com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter r0 = r0.t
                r6 = r0
                r0 = r6
                com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter$IconCompatParcelizer r0 = r0.a
                r0.g_()
                r0 = r6
                o.setIncomeDisplayAmount r0 = r0.apiService
                r1 = r8
                retrofit2.Call r0 = r0.d(r1)
                r8 = r0
                r0 = r6
                r1 = r8
                r0.e = r1
                r0 = r8
                com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter$1 r1 = new com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter$1
                r2 = r1
                r3 = r6
                r2.<init>()
                r0.enqueue(r1)
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TransaksiTundaFragment.subscribeDraftTxnBerkalaEvent(o.onRefreshListRingkasan):void");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void subscribeReservationRescheduleEvent(BranchMapROItemAdapter$BranchMapROItemVH branchMapROItemAdapter$BranchMapROItemVH) {
            Reservation reservation = branchMapROItemAdapter$BranchMapROItemVH.e;
            this.ae = reservation;
            if (reservation == null) {
                return;
            }
            if (reservation.getTypeTransaction().equals("Transaksi Teller") || this.ae.getTypeTransaction().equals("RESERVASI ONLINE") || this.ae.getTypeTransaction().contains("Pembukaan Rekening")) {
                InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
                infoDocumentUnderlyingActivity.e = this.ae.getNoReff();
                infoDocumentUnderlyingActivity.d = "TUNDA";
                infoDocumentUnderlyingActivity.b = branchMapROItemAdapter$BranchMapROItemVH.b;
                infoDocumentUnderlyingActivity.a = branchMapROItemAdapter$BranchMapROItemVH.d;
                this.Q.d(getPromotion.b(this.g, ""), infoDocumentUnderlyingActivity);
                return;
            }
            Intent intent = new Intent(getContext(), BranchMapActivity.class);
            intent.putExtra("reff_no", this.ae.getNoReff());
            intent.putExtra("type_transaksi", this.ae.getTypeTransaction());
            intent.putExtra("type_reservation", this.ae.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(this.ae));
            startActivity(intent);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
            if (chooseBCACardAdapter$ViewHolder.e) {
                this.J.e(new FormUbahTellerActivity_ViewBinding(this.g.getEmail(), this.g.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.g.getImei()));
            } else {
                this.N.a(new choosePic(this.g.getEmail(), this.g.getImei(), this.g.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void subscribeTransaksiBatalEvent(ChooseSubBCACardAdapter$ViewHolder chooseSubBCACardAdapter$ViewHolder) {
            if (chooseSubBCACardAdapter$ViewHolder.b.equals("Y")) {
                CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
                Bundle bundle = new Bundle();
                bundle.putString("token", chooseSubBCACardAdapter$ViewHolder.a);
                bundle.putString("noref", chooseSubBCACardAdapter$ViewHolder.c);
                cancelAskTransaksiDialog.setArguments(bundle);
                cancelAskTransaksiDialog.show(getFragmentManager(), "CancelAskTransaksiDialog");
                return;
            }
            CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
            Bundle bundle2 = new Bundle();
            bundle2.putString("token", chooseSubBCACardAdapter$ViewHolder.a);
            bundle2.putString("noref", chooseSubBCACardAdapter$ViewHolder.c);
            cancelTransaksiDialog.setArguments(bundle2);
            cancelTransaksiDialog.show(getFragmentManager(), "CancelTransaksiDialog");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void subscribeTransaksiBatalROEvent(ChooseMastercardAdapter$ViewHolder_ViewBinding chooseMastercardAdapter$ViewHolder_ViewBinding) {
            this.D = chooseMastercardAdapter$ViewHolder_ViewBinding.d;
            if (chooseMastercardAdapter$ViewHolder_ViewBinding.d) {
                CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
                Bundle bundle = new Bundle();
                bundle.putString("token", chooseMastercardAdapter$ViewHolder_ViewBinding.a);
                bundle.putString("noref", chooseMastercardAdapter$ViewHolder_ViewBinding.e);
                cancelTransaksiDialog.setArguments(bundle);
                cancelTransaksiDialog.show(getFragmentManager(), "CancelTransaksiDialog");
            } else if (chooseMastercardAdapter$ViewHolder_ViewBinding.e.substring(0, 3).equalsIgnoreCase("E98") || chooseMastercardAdapter$ViewHolder_ViewBinding.e.substring(0, 3).equalsIgnoreCase("E99")) {
                CancelReservasiDialog cancelReservasiDialog = new CancelReservasiDialog();
                Bundle bundle2 = new Bundle();
                bundle2.putString("token", chooseMastercardAdapter$ViewHolder_ViewBinding.a);
                bundle2.putString("noref", chooseMastercardAdapter$ViewHolder_ViewBinding.e);
                cancelReservasiDialog.setArguments(bundle2);
                cancelReservasiDialog.show(getFragmentManager(), "CancelReservasiDialog");
            } else {
                CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
                Bundle bundle3 = new Bundle();
                bundle3.putString("token", chooseMastercardAdapter$ViewHolder_ViewBinding.a);
                bundle3.putString("noref", chooseMastercardAdapter$ViewHolder_ViewBinding.e);
                cancelAskTransaksiDialog.setArguments(bundle3);
                cancelAskTransaksiDialog.show(getFragmentManager(), "CancelAskTransaksiDialog");
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void subscribeTransaksiBatalTellerEvent(ChooseSubMastercardAdapter$ViewHolder chooseSubMastercardAdapter$ViewHolder) {
            CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", chooseSubMastercardAdapter$ViewHolder.b);
            bundle.putString("noref", chooseSubMastercardAdapter$ViewHolder.a);
            cancelTransaksiDialog.setArguments(bundle);
            cancelTransaksiDialog.show(getFragmentManager(), "CancelTransaksiDialog");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void subscribeTransaksiUbahTellerEvent(ChooseSubBCACardAdapter$ViewHolder_ViewBinding chooseSubBCACardAdapter$ViewHolder_ViewBinding) {
            this.ah = chooseSubBCACardAdapter$ViewHolder_ViewBinding.c;
            this.K = chooseSubBCACardAdapter$ViewHolder_ViewBinding.a;
            this.s = Integer.valueOf(chooseSubBCACardAdapter$ViewHolder_ViewBinding.b);
            if (chooseSubBCACardAdapter$ViewHolder_ViewBinding.e.equals("Transfer ke Bank Lain")) {
                GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = this.T;
                String str = this.ah;
                String e = getPromotion.e(this.g);
                getTxnTellerDetailKUPresenter.a.g_();
                Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> l = getTxnTellerDetailKUPresenter.apiService.l(e, str);
                getTxnTellerDetailKUPresenter.c = l;
                l.enqueue(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005d: INVOKE  
                      (r0v48 'l' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse>>)
                      (wrap: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter$4 : 0x005a: CONSTRUCTOR  (r1v17 com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter$4 A[REMOVE]) = (r0v38 'getTxnTellerDetailKUPresenter' com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter) call: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.4.<init>(com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter):void type: CONSTRUCTOR)
                     type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.TransaksiTundaFragment.subscribeTransaksiUbahTellerEvent(o.ChooseSubBCACardAdapter$ViewHolder_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiTundaFragment.class
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter, state: GENERATED_AND_UNLOADED
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
                    	... 21 more
                    */
                /*
                // Method dump skipped, instructions count: 230
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TransaksiTundaFragment.subscribeTransaksiUbahTellerEvent(o.ChooseSubBCACardAdapter$ViewHolder_ViewBinding):void");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberDeleteTmpListTeller(o.TransactionActivity transactionActivity) {
                this.Y.executeTransaction(new Realm.Transaction() { // from class: o.setFlag
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        TransaksiTundaFragment.d(realm);
                    }
                });
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberLoadDraftBankTransferEvent(subsriberChooseValueHariEvent subsriberchoosevalueharievent) {
                this.aj = subsriberchoosevalueharievent.a;
                this.z = false;
                BankTransfer bankTransfer = (BankTransfer) this.Y.where(BankTransfer.class).equalTo("id", Long.valueOf(this.aj)).findFirst();
                this.Z.e(this.g, this.v, bankTransfer.getTipeNasabahPengirim(), bankTransfer.getTotalPembayaran(), "LOAD_DATA");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberLoadDraftCC(showDataPenerima showdatapenerima) {
                this.k = showdatapenerima.e;
                this.U.c();
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberLoadDraftKirimanUangEvent(showDataPengirim showdatapengirim) {
                this.aj = showdatapengirim.e;
                this.z = false;
                this.am = "kirim_uang";
                getPromotion.d(getContext());
                this.M.e(new InfoProductActivity(this.g.getEmail(), this.g.getSessionId(), this.g.getImei(), "Transfer Valuta Asing"));
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberLoadDraftKliringEvent(showDataTransaksiBerkala showdatatransaksiberkala) {
                this.am = "kliring";
                this.ai = showdatatransaksiberkala.c;
                this.z = false;
                if (showdatatransaksiberkala.b) {
                    Intent intent = new Intent(getActivity(), FormTellerActivity.class);
                    intent.putExtra("id_draft", true);
                    intent.putExtra("transaksi_teller_id", this.ai);
                    intent.putExtra("TellerType", "kliring");
                    startActivity(intent);
                } else if (SystemClock.elapsedRealtime() - this.G >= 3000) {
                    this.G = SystemClock.elapsedRealtime();
                    this.ak.clear();
                    this.aq.clear();
                    this.ac.d(this.g, "Individu");
                }
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberLoadDraftPemrekEvent(tujuanTransaksiEvent tujuantransaksievent) {
                this.ai = tujuantransaksievent.d;
                this.z = false;
                if (((Account) this.Y.where(Account.class).equalTo("id", Long.valueOf(tujuantransaksievent.d)).findFirst()).getOldCustFlag().equals("Y")) {
                    Intent intent = new Intent(getActivity(), FormActivity.class);
                    intent.putExtra("id_draft", true);
                    intent.putExtra("account_id", tujuantransaksievent.d);
                    getActivity().startActivity(intent);
                    return;
                }
                this.S.b();
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberLoadDraftSetoranEvent(updateDaftarTransfer updatedaftartransfer) {
                this.aj = updatedaftartransfer.a;
                this.z = false;
                Setoran setoran = (Setoran) this.Y.where(Setoran.class).equalTo("id", Long.valueOf(this.aj)).findFirst();
                boolean equalsIgnoreCase = setoran.getSourceAccountOwnerType().equalsIgnoreCase("ORG");
                InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter = this.aa;
                User user = this.g;
                String txnAmount = setoran.getTxnAmount();
                GetTxnTellerDetailResponse getTxnTellerDetailResponse = this.x;
                subscribeReservationRescheduleEvent.e(user, "");
                subscribeReservationRescheduleEvent.e(txnAmount, "");
                subscribeReservationRescheduleEvent.e("LOAD_DATA", "");
                inquiryLoadDataSetunPresenter.e = getTxnTellerDetailResponse;
                inquiryLoadDataSetunPresenter.f = "LOAD_DATA";
                inquiryLoadDataSetunPresenter.j = txnAmount;
                inquiryLoadDataSetunPresenter.c = equalsIgnoreCase;
                inquiryLoadDataSetunPresenter.l = user;
                inquiryLoadDataSetunPresenter.a = getPromotion.e(user);
                InfoProductActivity infoProductActivity = new InfoProductActivity(user.getEmail(), user.getSessionId(), user.getImei(), "Setoran Tunai");
                subscribeReservationRescheduleEvent.e(infoProductActivity, "");
                InquiryLoadDataSetunPresenter.write write = inquiryLoadDataSetunPresenter.g;
                subscribeReservationRescheduleEvent.c(write);
                write.g_();
                setIncomeDisplayAmount setincomedisplayamount = inquiryLoadDataSetunPresenter.apiService;
                if (setincomedisplayamount == null) {
                    subscribeReservationRescheduleEvent.e("");
                    setincomedisplayamount = null;
                }
                Call<OpenAccountSuccessActivity<DaftarTransferResponse>> n = setincomedisplayamount.n(inquiryLoadDataSetunPresenter.a, infoProductActivity.e);
                inquiryLoadDataSetunPresenter.d = n;
                if (n != null) {
                    n.enqueue((Callback) new InquiryLoadDataSetunPresenter.read());
                }
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscriberLoadDraftTarikanEvent(TxnBerkalaDetailActivity_ViewBinding txnBerkalaDetailActivity_ViewBinding) {
                this.aj = txnBerkalaDetailActivity_ViewBinding.e;
                this.z = false;
                User user = this.g;
                if (user == null || !user.getVerified().equals("Y")) {
                    Intent intent = new Intent(getContext(), TarikanTransaksiActivity.class);
                    intent.putExtra("id_draft", true);
                    intent.putExtra("transaksi_teller_id", this.aj);
                    intent.putExtra("TellerType", "tarikan");
                    startActivity(intent);
                    return;
                }
                e();
            }

            @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
            public final void t() {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", getString(2131822441));
                bundle.putString("MessageDialogTitle", getString(2131822128));
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(getFragmentManager(), "MessageDialog");
                b();
            }

            @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
            public final void t(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(getFragmentManager(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
            public final void t_(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(getActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
            public final void u() {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", getString(2131822441));
                bundle.putString("MessageDialogTitle", getString(2131822128));
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(getFragmentManager(), "MessageDialog");
                b();
            }

            @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
            public final void u(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(getChildFragmentManager(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
            public final void u_(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(getFragmentManager(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
            public final void v(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
            public final void v_(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
            public final void w(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
            public final void w_(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
            public final void x(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
            public final void x_(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
            public final void y(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
            public final void y_(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter.IconCompatParcelizer
            public final void z(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(getActivity().l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
            public final void z_(String str) {
                h();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(requireActivity().l(), "MessageDialog");
            }
        }
