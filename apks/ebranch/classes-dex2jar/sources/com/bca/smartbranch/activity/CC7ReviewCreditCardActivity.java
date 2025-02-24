package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ReviewBCACardAdapter;
import com.bca.smartbranch.adapter.ReviewMastercardAdapter;
import com.bca.smartbranch.adapter.ReviewVisaAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.GetCategoryPresenter;
import com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.Realm;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.BenefitAdapter$MyViewHolder;
import o.BenefitAdapter$MyViewHolder_ViewBinding;
import o.BidangPekerjaanAdapter$BidangPekerjaanVH;
import o.ChooseSubVisaAdapter$ViewHolder;
import o.ChooseVisaAdapter$ViewHolder;
import o.CityReservationAdapter$CityReservationVH;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clikedKeyRusak;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC7ReviewCreditCardActivity.class */
public class CC7ReviewCreditCardActivity extends BaseActivityPostLogin implements GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    @BindView(2131296901)
    View dvdMastercard;
    @BindView(2131296908)
    View dvdVisacard;
    private List<CardType> f = new ArrayList();
    @BindView(2131297545)
    LinearLayout llBcaCard;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297771)
    LinearLayout llMasterCard;
    @BindView(2131297931)
    LinearLayout llVisaCard;
    private RealmResults<CreditCardOptions> n;
    private ReviewBCACardAdapter p;
    private CreditCard q;
    private ReviewMastercardAdapter r;
    @BindView(2131298317)
    setOnStartEnterTransitionListener rvBcaCard;
    @BindView(2131298330)
    setOnStartEnterTransitionListener rvMasterCard;
    @BindView(2131298342)
    setOnStartEnterTransitionListener rvVisaCard;
    private GetCategoryPresenter s;
    private RealmResults<CreditCardOptions> t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private RealmResults<CreditCardOptions> w;
    private ReviewVisaAdapter y;

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, "", -1).g();
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(List<CategoryResponse> list, List<CategoryResponse> list2, List<CategoryResponse> list3, List<CategoryResponse> list4, List<CategoryResponse> list5, List<CategoryResponse> list6, List<CategoryResponse> list7, List<CategoryResponse> list8) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CreditCardOptions creditCardOptions = (CreditCardOptions) CC7ReviewCreditCardActivity.this.n.where().contains("cardName", "Singapore Airlines").findFirst();
                CreditCardOptions creditCardOptions2 = (CreditCardOptions) CC7ReviewCreditCardActivity.this.t.where().contains("cardName", "Singapore Airlines").findFirst();
                CreditCardOptions creditCardOptions3 = (CreditCardOptions) CC7ReviewCreditCardActivity.this.w.where().contains("cardName", "Singapore Airlines").findFirst();
                if (creditCardOptions != null || creditCardOptions2 != null || creditCardOptions3 != null) {
                    CC7ReviewCreditCardActivity.this.q.setKrisFlyer(true);
                }
            }
        });
        x();
        Intent intent = new Intent(this, CC8FormKartuKreditActivity.class);
        intent.putExtra("id_draft", false);
        intent.putExtra("cc_id", this.q.getId());
        intent.putExtra("listOccupation", ListUtil.OneItemImmutableList.e(list));
        intent.putExtra("listHomeStatus", ListUtil.OneItemImmutableList.e(list2));
        intent.putExtra("listEducation", ListUtil.OneItemImmutableList.e(list3));
        intent.putExtra("listBussinessField", ListUtil.OneItemImmutableList.e(list4));
        intent.putExtra("listBankName", ListUtil.OneItemImmutableList.e(list5));
        intent.putExtra("listMaritalStatus", ListUtil.OneItemImmutableList.e(list6));
        intent.putExtra("listRelationship", ListUtil.OneItemImmutableList.e(list7));
        intent.putExtra("listCity", ListUtil.OneItemImmutableList.e(list8));
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.f));
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822011);
        GetCategoryPresenter getCategoryPresenter = new GetCategoryPresenter();
        this.s = getCategoryPresenter;
        getCategoryPresenter.b = this;
        this.f = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                long longExtra = CC7ReviewCreditCardActivity.this.getIntent().getLongExtra("CREDIT_CARD_ID", 0);
                CC7ReviewCreditCardActivity.this.q = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(longExtra)).findFirst();
                if (CC7ReviewCreditCardActivity.this.q != null) {
                    CC7ReviewCreditCardActivity cC7ReviewCreditCardActivity = CC7ReviewCreditCardActivity.this;
                    cC7ReviewCreditCardActivity.n = cC7ReviewCreditCardActivity.q.getCreditCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
                    CC7ReviewCreditCardActivity cC7ReviewCreditCardActivity2 = CC7ReviewCreditCardActivity.this;
                    cC7ReviewCreditCardActivity2.t = cC7ReviewCreditCardActivity2.q.getCreditCardOptions().where().equalTo("cardGroupType", CardType.MASTER).findAll();
                    CC7ReviewCreditCardActivity cC7ReviewCreditCardActivity3 = CC7ReviewCreditCardActivity.this;
                    cC7ReviewCreditCardActivity3.w = cC7ReviewCreditCardActivity3.q.getCreditCardOptions().where().equalTo("cardGroupType", CardType.VISA).findAll();
                }
            }
        });
        this.p = new ReviewBCACardAdapter();
        this.r = new ReviewMastercardAdapter();
        this.y = new ReviewVisaAdapter();
        this.rvBcaCard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvMasterCard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvVisaCard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvBcaCard.setAdapter(this.p);
        this.rvMasterCard.setAdapter(this.r);
        this.rvVisaCard.setAdapter(this.y);
        ReviewBCACardAdapter reviewBCACardAdapter = this.p;
        reviewBCACardAdapter.b = this.n;
        reviewBCACardAdapter.a.b();
        ReviewMastercardAdapter reviewMastercardAdapter = this.r;
        reviewMastercardAdapter.e = this.t;
        reviewMastercardAdapter.a.b();
        ReviewVisaAdapter reviewVisaAdapter = this.y;
        reviewVisaAdapter.e = this.w;
        reviewVisaAdapter.a.b();
        if (this.r.c() <= 0) {
            this.llMasterCard.setVisibility(8);
            this.dvdMastercard.setVisibility(8);
        } else {
            this.llMasterCard.setVisibility(0);
            this.dvdMastercard.setVisibility(0);
        }
        if (this.y.c() <= 0) {
            this.llVisaCard.setVisibility(8);
            this.dvdVisacard.setVisibility(8);
            return;
        }
        this.llVisaCard.setVisibility(0);
        this.dvdVisacard.setVisibility(0);
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g_() {
        z();
    }

    @OnClick({2131296396})
    public void onCLickedLanjut() {
        GetCategoryPresenter getCategoryPresenter = this.s;
        getCategoryPresenter.b.g_();
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("occupation");
        getCategoryPresenter.e = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: INVOKE  
              (r0v6 'e' retrofit2.Call<o.OpenAccountSuccessActivity<o.clikedKeyRusak>>)
              (wrap: com.bca.smartbranch.presenter.GetCategoryPresenter$4 : 0x0026: CONSTRUCTOR  (r1v2 com.bca.smartbranch.presenter.GetCategoryPresenter$4 A[REMOVE]) = (r0v1 'getCategoryPresenter' com.bca.smartbranch.presenter.GetCategoryPresenter) call: com.bca.smartbranch.presenter.GetCategoryPresenter.4.<init>(com.bca.smartbranch.presenter.GetCategoryPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity.onCLickedLanjut():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/CC7ReviewCreditCardActivity.class
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
            com.bca.smartbranch.presenter.GetCategoryPresenter r0 = r0.s
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity.onCLickedLanjut():void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        this.s.c();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            k();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC7ReviewCreditCardActivity";
        this.j = "CC7ReviewCreditCardActivity";
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void p_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492915;
    }

    @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void q_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, "", 0).g();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveBCACardEvent(final BenefitAdapter$MyViewHolder benefitAdapter$MyViewHolder) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CreditCardOptions) Objects.requireNonNull((CreditCardOptions) CC7ReviewCreditCardActivity.this.n.where().equalTo("cardID", benefitAdapter$MyViewHolder.a).findFirst())).deleteFromRealm();
                CC7ReviewCreditCardActivity.this.p.a.b();
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveMasterCardEvent(final BenefitAdapter$MyViewHolder_ViewBinding benefitAdapter$MyViewHolder_ViewBinding) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CreditCardOptions) Objects.requireNonNull((CreditCardOptions) CC7ReviewCreditCardActivity.this.t.where().equalTo("cardID", benefitAdapter$MyViewHolder_ViewBinding.a).findFirst())).deleteFromRealm();
                CC7ReviewCreditCardActivity.this.r.a.b();
            }
        });
        if (this.r.c() <= 0) {
            this.llMasterCard.setVisibility(8);
            this.dvdMastercard.setVisibility(8);
            return;
        }
        this.llMasterCard.setVisibility(0);
        this.dvdMastercard.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveVisaCardEvent(final BidangPekerjaanAdapter$BidangPekerjaanVH bidangPekerjaanAdapter$BidangPekerjaanVH) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CreditCardOptions) Objects.requireNonNull((CreditCardOptions) CC7ReviewCreditCardActivity.this.w.where().equalTo("cardID", bidangPekerjaanAdapter$BidangPekerjaanVH.c).findFirst())).deleteFromRealm();
                CC7ReviewCreditCardActivity.this.y.a.b();
            }
        });
        if (this.y.c() <= 0) {
            this.llVisaCard.setVisibility(8);
            this.dvdVisacard.setVisibility(8);
            return;
        }
        this.llVisaCard.setVisibility(0);
        this.dvdVisacard.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeUbahBCACardEvent(ChooseSubVisaAdapter$ViewHolder chooseSubVisaAdapter$ViewHolder) {
        this.p.a.b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeUbahMasterCardEvent(CityReservationAdapter$CityReservationVH cityReservationAdapter$CityReservationVH) {
        this.r.a.b();
        if (this.r.c() <= 0) {
            this.llMasterCard.setVisibility(8);
            this.dvdMastercard.setVisibility(8);
            return;
        }
        this.llMasterCard.setVisibility(0);
        this.dvdMastercard.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeUbahVisaCardEvent(ChooseVisaAdapter$ViewHolder chooseVisaAdapter$ViewHolder) {
        this.y.a.b();
        if (this.y.c() <= 0) {
            this.llVisaCard.setVisibility(8);
            this.dvdVisacard.setVisibility(8);
            return;
        }
        this.llVisaCard.setVisibility(0);
        this.dvdVisacard.setVisibility(0);
    }

    @OnClick({2131299698})
    public void ubahBcaCard() {
        Intent intent = new Intent(this, CC3UbahBCACardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.f));
        intent.putExtra("CREDIT_CARD_ID", this.q.getId());
        startActivity(intent);
    }

    @OnClick({2131299725})
    public void ubahMasterCard() {
        Intent intent = new Intent(this, CC5UbahMastercardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.f));
        intent.putExtra("CREDIT_CARD_ID", this.q.getId());
        startActivity(intent);
    }

    @OnClick({2131299729})
    public void ubahVisaCard() {
        Intent intent = new Intent(this, CC5UbahVisacardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.f));
        intent.putExtra("CREDIT_CARD_ID", this.q.getId());
        startActivity(intent);
    }
}
