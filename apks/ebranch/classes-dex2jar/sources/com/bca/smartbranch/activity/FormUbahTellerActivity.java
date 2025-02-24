package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.ReviewSetoranUbahFragment;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.List;
import o.InfoProductORActivity_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.getUserVisibleHint;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormUbahTellerActivity.class */
public class FormUbahTellerActivity extends BaseActivityPostLogin implements GetHBPresenter.write {
    public Setoran f;
    @BindView(2131297766)
    public LinearLayout llMain;
    @BindView(2131297767)
    LinearLayout llMainIndicator;
    public User n;
    private Bundle p;
    public String q;
    public List<DaftarTransfer> r;
    public String[] s;
    public String[] t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822281)
    String toolbarTitle;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private String u;
    private GetHBPresenter x;

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.x = getHBPresenter;
        getHBPresenter.e = this;
        Bundle extras = getIntent().getExtras();
        this.p = extras;
        this.u = extras.getString("title", "");
        GetTxnTellerDetailResponse getTxnTellerDetailResponse = (GetTxnTellerDetailResponse) ListUtil.OneItemImmutableList.a(this.p.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.r = (List) ListUtil.OneItemImmutableList.a(this.p.getParcelable("daftar_transfer"));
        this.q = this.p.getString("token");
        this.llMainIndicator.setVisibility(8);
        if (this.p.getParcelable("fund_purpose") != null) {
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = (MasterFundSourcePurposeResponse) ListUtil.OneItemImmutableList.a(this.p.getParcelable("fund_purpose"));
            this.t = masterFundSourcePurposeResponse.getFundSource();
            this.s = masterFundSourcePurposeResponse.getTransactionPurpose();
        }
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        if (this.m != null) {
            this.n = this.m;
        } else {
            this.n = new User();
        }
        this.tvToolbarTitle.setText(Html.fromHtml(getString(2131822282)));
        Setoran setoran = new Setoran();
        this.f = setoran;
        setoran.setId(System.currentTimeMillis());
        this.f.setCreatedAt(System.currentTimeMillis());
        this.f.setSenderName(getTxnTellerDetailResponse.getTxnDetail().getSenderName());
        this.f.setSenderPhone(getTxnTellerDetailResponse.getTxnDetail().getSenderPhone());
        this.f.setSenderIdType(getTxnTellerDetailResponse.getTxnDetail().getSenderIdType());
        this.f.setSenderIdNumber(getTxnTellerDetailResponse.getTxnDetail().getSenderIdNumber());
        this.f.setSenderAddress(getTxnTellerDetailResponse.getTxnDetail().getSenderAddress());
        this.f.setReceiverName(getTxnTellerDetailResponse.getTxnDetail().getReceiverName());
        this.f.setReceiverAccount(getTxnTellerDetailResponse.getTxnDetail().getReceiverAccount());
        this.f.setReceiverAlias(getTxnTellerDetailResponse.getTxnDetail().getReceiverAlias());
        this.f.setTxnAmount(String.valueOf(getTxnTellerDetailResponse.getTxnDetail().getTxnAmount()));
        this.f.setTxnSource(getTxnTellerDetailResponse.getTxnDetail().getTxnSource());
        this.f.setTxnPurpose(getTxnTellerDetailResponse.getTxnDetail().getTxnPurpose());
        this.f.setTxnNotes(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes());
        this.f.setType(getTxnTellerDetailResponse.getTxnDetail().getType());
        this.f.setCurrency(getTxnTellerDetailResponse.getTxnDetail().getCurrency());
        this.f.setSenderEmail(getTxnTellerDetailResponse.getTxnDetail().getEmail());
        if (getTxnTellerDetailResponse.getTxnDetail().getFlagRepresentativeTransaction().equalsIgnoreCase("N")) {
            this.f.setFlagRepresentativeTransaction("Y");
        } else {
            this.f.setFlagRepresentativeTransaction("N");
        }
        if (getTxnTellerDetailResponse.getTxnDetail().getSourceAccountOwnerType().equalsIgnoreCase("MSF")) {
            this.f.setSourceAccountOwnerType("Saya Sendiri");
        } else if (getTxnTellerDetailResponse.getTxnDetail().getSourceAccountOwnerType().equalsIgnoreCase("OTH")) {
            this.f.setSourceAccountOwnerType("Orang Lain");
        } else if (getTxnTellerDetailResponse.getTxnDetail().getSourceAccountOwnerType().equalsIgnoreCase("ORG")) {
            this.f.setSourceAccountOwnerType("Perusahaan");
        }
        if (getTxnTellerDetailResponse.getTxnDetail().getRepresentative() != null) {
            this.f.setRepresentativeName(getTxnTellerDetailResponse.getTxnDetail().getRepresentative().getRepresentativeName());
            this.f.setRepresentativeIdType(getTxnTellerDetailResponse.getTxnDetail().getRepresentative().getRepresentativeIdType());
            this.f.setRepresentativeIdNumber(getTxnTellerDetailResponse.getTxnDetail().getRepresentative().getRepresentativeIdNumber());
            this.f.setRepresentativeRelationship(getTxnTellerDetailResponse.getTxnDetail().getRepresentative().getRepresentativeRelationship());
        }
        if (getTxnTellerDetailResponse.getTxnDetail().getRecurringVar() == null || getTxnTellerDetailResponse.getTxnDetail().getRecurringValue() == null || getTxnTellerDetailResponse.getTxnDetail().getRecurringEndDate() == null) {
            this.f.setFlagTxnBerkala("N");
        } else {
            this.f.setFlagTxnBerkala("Y");
            this.f.setRecurringEndDate(getTxnTellerDetailResponse.getTxnDetail().getRecurringEndDate());
            this.f.setRecurringValue(getTxnTellerDetailResponse.getTxnDetail().getRecurringValue());
            this.f.setRecurringVar(getTxnTellerDetailResponse.getTxnDetail().getRecurringVar());
        }
        if (getTxnTellerDetailResponse.getTxnDetail().getReceiverAlias() != null) {
            this.f.setFlagDaftarTransfer("Y");
            this.f.setReceiverAlias(getTxnTellerDetailResponse.getTxnDetail().getReceiverAlias());
        }
        if (!getTxnTellerDetailResponse.getTxnDetail().getSenderAddress().isEmpty()) {
            this.f.setOldCustFlag("N");
        } else if (getTxnTellerDetailResponse.getTxnDetail().getSenderIdType().equalsIgnoreCase("Rekening")) {
            this.f.setOldCustFlag("Y");
        } else {
            this.f.setOldCustFlag("Y");
        }
        ReviewSetoranUbahFragment reviewSetoranUbahFragment = new ReviewSetoranUbahFragment();
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, reviewSetoranUbahFragment, "ReviewSetoranUbahFragment", 2);
        getuservisiblehint.b();
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
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetHBPresenter getHBPresenter = this.x;
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetHBEvent(onClickUbahDataOrangDatangKeCabang onclickubahdataorangdatangkecabang) {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.x;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.FormUbahTellerActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/FormUbahTellerActivity.class
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
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.x
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormUbahTellerActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void");
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908332) {
                onBackPressed();
                return true;
            } else if (itemId != 2131298038) {
                return onOptionsItemSelected(menuItem);
            } else {
                YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                yakinKeluarDialog.d = "transaction_teller";
                yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                return true;
            }
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "FormUbahTellerActivity";
            this.j = "FormUbahTellerActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492955;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }
    }
