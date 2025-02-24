package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment;
import com.bca.smartbranch.presenter.GetHBPresenter;
import io.realm.Realm;
import java.util.List;
import o.InfoProductORActivity_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getUserVisibleHint;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormReservasiUbahTellerActivity.class */
public class FormReservasiUbahTellerActivity extends BaseActivityPostLogin implements GetHBPresenter.write {
    public Setoran f;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297767)
    LinearLayout llMainIndicator;
    public User n;
    public String[] p;
    public String[] q;
    public List<DaftarTransfer> r;
    private Bundle s;
    private GetHBPresenter t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822281)
    String toolbarTitle;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private String v;
    private ListFormTeller w;
    private long y;

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.t = getHBPresenter;
        getHBPresenter.e = this;
        Bundle extras = getIntent().getExtras();
        this.s = extras;
        this.v = extras.getString("title", "");
        this.r = (List) ListUtil.OneItemImmutableList.a(this.s.getParcelable("daftar_transfer"));
        this.llMainIndicator.setVisibility(8);
        this.y = this.s.getLong("id", 0);
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.FormReservasiUbahTellerActivity.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                FormReservasiUbahTellerActivity.this.w = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                Setoran findFirst = FormReservasiUbahTellerActivity.this.w.getSetoranList().where().equalTo("id", Long.valueOf(FormReservasiUbahTellerActivity.this.y)).findFirst();
                if (findFirst != null) {
                    FormReservasiUbahTellerActivity.this.f = new Setoran();
                    FormReservasiUbahTellerActivity.this.f.setId(findFirst.getId());
                    FormReservasiUbahTellerActivity.this.f.setCurrentPage(findFirst.getCurrentPage());
                    FormReservasiUbahTellerActivity.this.f.setCreatedAt(findFirst.getCreatedAt());
                    FormReservasiUbahTellerActivity.this.f.setUpdatedAt(findFirst.getUpdatedAt());
                    FormReservasiUbahTellerActivity.this.f.setFlagGuest(findFirst.getFlagGuest());
                    FormReservasiUbahTellerActivity.this.f.setOldCustFlag(findFirst.getOldCustFlag());
                    FormReservasiUbahTellerActivity.this.f.setSenderName(findFirst.getSenderName());
                    FormReservasiUbahTellerActivity.this.f.setSenderPhone(findFirst.getSenderPhone());
                    FormReservasiUbahTellerActivity.this.f.setSenderIdType(findFirst.getSenderIdType());
                    FormReservasiUbahTellerActivity.this.f.setSenderIdNumber(findFirst.getSenderIdNumber());
                    FormReservasiUbahTellerActivity.this.f.setSenderAddress(findFirst.getSenderAddress());
                    FormReservasiUbahTellerActivity.this.f.setReceiverName(findFirst.getReceiverName());
                    FormReservasiUbahTellerActivity.this.f.setReceiverAccount(findFirst.getReceiverAccount());
                    FormReservasiUbahTellerActivity.this.f.setTxnAmount(findFirst.getTxnAmount());
                    FormReservasiUbahTellerActivity.this.f.setTxnSource(findFirst.getTxnSource());
                    FormReservasiUbahTellerActivity.this.f.setTxnPurpose(findFirst.getTxnPurpose());
                    FormReservasiUbahTellerActivity.this.f.setTxnNotes(findFirst.getTxnNotes());
                    FormReservasiUbahTellerActivity.this.f.setType(findFirst.getType());
                    FormReservasiUbahTellerActivity.this.f.setCurrency(findFirst.getCurrency());
                    FormReservasiUbahTellerActivity.this.f.setSenderEmail(findFirst.getSenderEmail());
                    FormReservasiUbahTellerActivity.this.f.setRecurringVar(findFirst.getRecurringVar());
                    FormReservasiUbahTellerActivity.this.f.setRecurringValue(findFirst.getRecurringValue());
                    FormReservasiUbahTellerActivity.this.f.setRecurringEndDate(findFirst.getRecurringEndDate());
                    FormReservasiUbahTellerActivity.this.f.setFlagRepresentativeTransaction(findFirst.getFlagRepresentativeTransaction());
                    FormReservasiUbahTellerActivity.this.f.setSourceAccountOwnerType(findFirst.getSourceAccountOwnerType());
                    FormReservasiUbahTellerActivity.this.f.setRepresentativeName(findFirst.getRepresentativeName());
                    FormReservasiUbahTellerActivity.this.f.setRepresentativeIdType(findFirst.getRepresentativeIdType());
                    FormReservasiUbahTellerActivity.this.f.setRepresentativeIdNumber(findFirst.getRepresentativeIdNumber());
                    FormReservasiUbahTellerActivity.this.f.setRepresentativeRelationship(findFirst.getRepresentativeRelationship());
                    FormReservasiUbahTellerActivity.this.f.setFlagDaftarTransfer(findFirst.getFlagDaftarTransfer());
                    FormReservasiUbahTellerActivity.this.f.setFlagTxnBerkala(findFirst.getFlagTxnBerkala());
                    FormReservasiUbahTellerActivity.this.f.setReceiverAlias(findFirst.getReceiverAlias());
                }
            }
        });
        if (this.s.getParcelable("fund_purpose") != null) {
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = (MasterFundSourcePurposeResponse) ListUtil.OneItemImmutableList.a(this.s.getParcelable("fund_purpose"));
            this.q = masterFundSourcePurposeResponse.getFundSource();
            this.p = masterFundSourcePurposeResponse.getTransactionPurpose();
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
        ReviewSetoranReservasiUbahFragment reviewSetoranReservasiUbahFragment = new ReviewSetoranReservasiUbahFragment();
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, reviewSetoranReservasiUbahFragment, "ReviewSetoranReservasiUbahFragment", 2);
        getuservisiblehint.b();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetHBPresenter getHBPresenter = this.t;
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetHBEvent(onClickUbahDataOrangDatangKeCabang onclickubahdataorangdatangkecabang) {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.t;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.FormReservasiUbahTellerActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/FormReservasiUbahTellerActivity.class
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
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.t
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormReservasiUbahTellerActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void");
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return onOptionsItemSelected(menuItem);
            }
            onBackPressed();
            return true;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "FormReservasiUbahTellerActivity";
            this.j = "FormReservasiUbahTellerActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492955;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        public final void t() {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.FormReservasiUbahTellerActivity.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    FormReservasiUbahTellerActivity.this.w = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                    for (int i = 0; i < FormReservasiUbahTellerActivity.this.w.getSetoranList().size(); i++) {
                        Setoran setoran = FormReservasiUbahTellerActivity.this.w.getSetoranList().get(i);
                        if (setoran.getId() == FormReservasiUbahTellerActivity.this.y) {
                            FormReservasiUbahTellerActivity.this.w.getSetoranList().set(i, FormReservasiUbahTellerActivity.this.f);
                        } else {
                            setoran.setSenderName(FormReservasiUbahTellerActivity.this.f.getSenderName());
                            setoran.setSenderIdType(FormReservasiUbahTellerActivity.this.f.getSenderIdType());
                            setoran.setSenderIdNumber(FormReservasiUbahTellerActivity.this.f.getSenderIdNumber());
                            setoran.setSenderAddress(FormReservasiUbahTellerActivity.this.f.getSenderAddress());
                            setoran.setSenderPhone(FormReservasiUbahTellerActivity.this.f.getSenderPhone());
                            setoran.setFlagSameReceiverSenderData(FormReservasiUbahTellerActivity.this.f.getFlagSameReceiverSenderData());
                            setoran.setSourceAccountOwnerType(FormReservasiUbahTellerActivity.this.f.getSourceAccountOwnerType());
                            setoran.setFlagRepresentativeTransaction(FormReservasiUbahTellerActivity.this.f.getFlagRepresentativeTransaction());
                            setoran.setRepresentativeIdType(FormReservasiUbahTellerActivity.this.f.getRepresentativeIdType());
                            setoran.setRepresentativeIdNumber(FormReservasiUbahTellerActivity.this.f.getRepresentativeIdNumber());
                            setoran.setRepresentativeName(FormReservasiUbahTellerActivity.this.f.getRepresentativeName());
                            setoran.setRepresentativeRelationship(FormReservasiUbahTellerActivity.this.f.getRepresentativeRelationship());
                            FormReservasiUbahTellerActivity.this.w.getSetoranList().set(i, setoran);
                        }
                    }
                }
            });
            finish();
        }
    }
