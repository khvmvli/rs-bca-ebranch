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
import com.bca.smartbranch.activity.CC23UbahSubVisacardActivity;
import com.bca.smartbranch.adapter.UbahSubVisaCardAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.ChooseVisaAdapter$ViewHolder;
import o.ListUtil;
import o.PilihSumberSetoranActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.onHiddenChanged;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC23UbahSubVisacardActivity.class */
public class CC23UbahSubVisacardActivity extends BaseActivityPostLogin {
    public CreditCard f;
    private int p;
    private CreditCardSupplement r;
    @BindView(2131298341)
    setOnStartEnterTransitionListener rvVisacard;
    private UbahSubVisaCardAdapter t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private List<CardType> n = new ArrayList();
    private List<CreditCardOptions> s = new ArrayList();

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822011);
        Bundle extras = getIntent().getExtras();
        this.n = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        this.p = extras.getInt("INDEX_CARD_SUPPLEMENT");
        this.k.executeTransaction(new Realm.Transaction(extras) { // from class: o.onChooseValueYakinKeluar
            public final /* synthetic */ Bundle b;

            {
                this.b = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC23UbahSubVisacardActivity.this.f = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(this.b.getLong("CREDIT_CARD_ID"))).findFirst();
            }
        });
        List<CardType> list = this.n;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.n) {
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
                if (cardType.getCardGroupType().equals(CardType.VISA)) {
                    this.s.add(creditCardOptions);
                }
            }
        }
        CreditCardSupplement creditCardSupplement = this.f.getCreditCardSupplements().get(this.p);
        this.r = creditCardSupplement;
        RealmResults<CreditCardOptions> findAll = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.VISA).findAll();
        for (int i = 0; i < this.s.size(); i++) {
            for (int i2 = 0; i2 < findAll.size(); i2++) {
                if (this.s.get(i).getCardID().equals(findAll.get(i2).getCardID())) {
                    this.s.get(i).setChecked(true);
                }
            }
        }
        this.t = new UbahSubVisaCardAdapter();
        this.rvVisacard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvVisacard.setAdapter(this.t);
        this.rvVisacard.setNestedScrollingEnabled(false);
        UbahSubVisaCardAdapter ubahSubVisaCardAdapter = this.t;
        ubahSubVisaCardAdapter.g = this.s;
        ubahSubVisaCardAdapter.a.b();
        String string = extras.getString("EMAIL");
        long j = extras.getLong("CREDIT_CARD_ID");
        this.t.f = string;
        this.t.b = j;
    }

    @OnClick({2131296396})
    public void onCLickedLanjut() {
        finish();
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
            onHiddenChanged.d((Activity) this);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC23UbahSubVisacardActivity";
        this.j = "CC23UbahSubVisacardActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492913;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseUbahVisaCardEvent(final PilihSumberSetoranActivity pilihSumberSetoranActivity) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC23UbahSubVisacardActivity.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (pilihSumberSetoranActivity.d) {
                    ((CreditCardOptions) CC23UbahSubVisacardActivity.this.s.get(pilihSumberSetoranActivity.b)).setChecked(true);
                    CC23UbahSubVisacardActivity.this.r.getSupplementCardOptions().add((CreditCardOptions) CC23UbahSubVisacardActivity.this.s.get(pilihSumberSetoranActivity.b));
                } else {
                    ((CreditCardOptions) CC23UbahSubVisacardActivity.this.s.get(pilihSumberSetoranActivity.b)).setChecked(false);
                    ((CreditCardOptions) Objects.requireNonNull(CC23UbahSubVisacardActivity.this.r.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC23UbahSubVisacardActivity.this.s.get(pilihSumberSetoranActivity.b)).getCardID()).findFirst())).deleteFromRealm();
                }
                UbahSubVisaCardAdapter ubahSubVisaCardAdapter = CC23UbahSubVisacardActivity.this.t;
                ubahSubVisaCardAdapter.a.d(pilihSumberSetoranActivity.b, 1, null);
            }
        });
        documentProvider.b().d(new ChooseVisaAdapter$ViewHolder());
    }
}
