package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ChooseMastercardAdapter;
import com.bca.smartbranch.adapter.ChooseVisaAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.BenefitAdapter$MyViewHolder_ViewBinding;
import o.BidangPekerjaanAdapter$BidangPekerjaanVH;
import o.ListUtil;
import o.PilihKotaActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5ChooseMastercardVisaActivity.class */
public class CC5ChooseMastercardVisaActivity extends BaseActivityPostLogin {
    private ChooseMastercardAdapter n;
    private CreditCard p;
    private ChooseVisaAdapter q;
    @BindView(2131298330)
    setOnStartEnterTransitionListener rvMastercard;
    @BindView(2131298341)
    setOnStartEnterTransitionListener rvVisa;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private List<CardType> f = new ArrayList();
    private List<CreditCardOptions> r = new ArrayList();
    private List<CreditCardOptions> s = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822011);
        List<CardType> list = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        this.f = list;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.f) {
                CreditCardOptions creditCardOptions = new CreditCardOptions();
                creditCardOptions.setCardGroupType(cardType.getCardGroupType());
                creditCardOptions.setCardID(cardType.getCardID());
                creditCardOptions.setCardCode(cardType.getCardCode());
                creditCardOptions.setCardType(cardType.getCardType());
                creditCardOptions.setCardName(cardType.getCardName());
                creditCardOptions.setCardImagePath(cardType.getCardImagePath());
                creditCardOptions.setCardImageOrientation(cardType.getCardImageOrientation());
                creditCardOptions.setCardSlogan(cardType.getCardSlogan());
                creditCardOptions.setCardDescription(cardType.getCardDescription());
                creditCardOptions.setAnnualFeeBasicAmount(cardType.getAnnualFeeBasicAmount());
                creditCardOptions.setAnnualFeeBasicDisplayAmount(cardType.getAnnualFeeBasicDisplayAmount());
                creditCardOptions.setAnnualFeeAddOnAmount(cardType.getAnnualFeeAddOnAmount());
                creditCardOptions.setAnnualFeeAddOnDisplayAmount(cardType.getAnnualFeeAddOnDisplayAmount());
                creditCardOptions.setIncomeAmount(cardType.getIncomeAmount());
                creditCardOptions.setIncomeDisplayAmount(cardType.getIncomeDisplayAmount());
                creditCardOptions.setPromotion(cardType.getPromotion());
                creditCardOptions.setBenefit(new RealmList<>((String[]) cardType.getBenefit().toArray(new String[cardType.getBenefit().size()])));
                if (cardType.getCardGroupType().equals(CardType.MASTER)) {
                    this.s.add(creditCardOptions);
                }
                if (cardType.getCardGroupType().equals(CardType.VISA)) {
                    this.r.add(creditCardOptions);
                }
            }
        }
        this.n = new ChooseMastercardAdapter();
        this.rvMastercard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvMastercard.setAdapter(this.n);
        this.rvMastercard.setNestedScrollingEnabled(false);
        ChooseMastercardAdapter chooseMastercardAdapter = this.n;
        chooseMastercardAdapter.g = this.s;
        chooseMastercardAdapter.a.b();
        this.q = new ChooseVisaAdapter();
        this.rvVisa.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvVisa.setAdapter(this.q);
        this.rvVisa.setNestedScrollingEnabled(false);
        ChooseVisaAdapter chooseVisaAdapter = this.q;
        chooseVisaAdapter.f = this.r;
        chooseVisaAdapter.a.b();
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC5ChooseMastercardVisaActivity.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                long longExtra = CC5ChooseMastercardVisaActivity.this.getIntent().getLongExtra("CREDIT_CARD_ID", 0);
                CC5ChooseMastercardVisaActivity.this.p = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(longExtra)).findFirst();
                CC5ChooseMastercardVisaActivity.this.p.getCreditCardOptions().where().equalTo("cardGroupType", CardType.MASTER).or().equalTo("cardGroupType", CardType.VISA).findAll().deleteAllFromRealm();
            }
        });
    }

    @OnClick({2131296396})
    public void onCLickedLanjut() {
        Intent intent = new Intent(this, CC7ReviewCreditCardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.f));
        intent.putExtra("CREDIT_CARD_ID", this.p.getId());
        intent.setFlags(67108864);
        startActivity(intent);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
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
        setCardSlogan.e().b = "CC5ChooseMastercardVisaActivity";
        this.j = "CC5ChooseMastercardVisaActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492910;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseMastercardVisaEvent(final PilihKotaActivity pilihKotaActivity) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC5ChooseMastercardVisaActivity.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                String str = pilihKotaActivity.a;
                str.hashCode();
                if (str.equals("type_mastercard")) {
                    if (pilihKotaActivity.e) {
                        ((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.s.get(pilihKotaActivity.b)).setChecked(true);
                        CC5ChooseMastercardVisaActivity.this.p.getCreditCardOptions().add((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.s.get(pilihKotaActivity.b));
                    } else {
                        ((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.s.get(pilihKotaActivity.b)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC5ChooseMastercardVisaActivity.this.p.getCreditCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.s.get(pilihKotaActivity.b)).getCardID()).findFirst())).deleteFromRealm();
                    }
                    ChooseMastercardAdapter chooseMastercardAdapter = CC5ChooseMastercardVisaActivity.this.n;
                    chooseMastercardAdapter.a.d(pilihKotaActivity.b, 1, null);
                } else if (str.equals("type_visa")) {
                    if (pilihKotaActivity.e) {
                        ((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.r.get(pilihKotaActivity.b)).setChecked(true);
                        CC5ChooseMastercardVisaActivity.this.p.getCreditCardOptions().add((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.r.get(pilihKotaActivity.b));
                    } else {
                        ((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.r.get(pilihKotaActivity.b)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC5ChooseMastercardVisaActivity.this.p.getCreditCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC5ChooseMastercardVisaActivity.this.r.get(pilihKotaActivity.b)).getCardID()).findFirst())).deleteFromRealm();
                    }
                    ChooseVisaAdapter chooseVisaAdapter = CC5ChooseMastercardVisaActivity.this.q;
                    chooseVisaAdapter.a.d(pilihKotaActivity.b, 1, null);
                }
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveMasterCardEvent(BenefitAdapter$MyViewHolder_ViewBinding benefitAdapter$MyViewHolder_ViewBinding) {
        for (CreditCardOptions creditCardOptions : this.s) {
            if (creditCardOptions.getCardID().equals(benefitAdapter$MyViewHolder_ViewBinding.a)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.n.a.b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveVisaCardEvent(BidangPekerjaanAdapter$BidangPekerjaanVH bidangPekerjaanAdapter$BidangPekerjaanVH) {
        for (CreditCardOptions creditCardOptions : this.r) {
            if (creditCardOptions.getCardID().equals(bidangPekerjaanAdapter$BidangPekerjaanVH.c)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.q.a.b();
    }
}
