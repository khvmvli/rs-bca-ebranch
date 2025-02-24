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
import com.bca.smartbranch.activity.CC5UbahMastercardActivity;
import com.bca.smartbranch.adapter.UbahMasterCardAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.CityReservationAdapter$CityReservationVH;
import o.ListUtil;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickSumberSetoran;
import o.documentProvider;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5UbahMastercardActivity.class */
public class CC5UbahMastercardActivity extends BaseActivityPostLogin {
    public CreditCard f;
    private UbahMasterCardAdapter q;
    @BindView(2131298330)
    setOnStartEnterTransitionListener rvMastercard;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private List<CardType> t = new ArrayList();
    private List<CreditCardOptions> r = new ArrayList();
    public List<CreditCardOptions> n = new ArrayList();

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822011);
        Bundle extras = getIntent().getExtras();
        this.t = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        this.k.executeTransaction(new Realm.Transaction(extras) { // from class: o.BaseActivityPostLoginKotlin
            public final /* synthetic */ Bundle c;

            {
                this.c = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC5UbahMastercardActivity cC5UbahMastercardActivity = CC5UbahMastercardActivity.this;
                CreditCard creditCard = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(this.c.getLong("CREDIT_CARD_ID"))).findFirst();
                cC5UbahMastercardActivity.f = creditCard;
                cC5UbahMastercardActivity.n = creditCard.getCreditCardOptions().where().equalTo("cardGroupType", CardType.MASTER).findAll();
            }
        });
        List<CardType> list = this.t;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.t) {
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
                    this.r.add(creditCardOptions);
                }
            }
        }
        for (int i = 0; i < this.r.size(); i++) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                if (this.r.get(i).getCardID().equals(this.n.get(i2).getCardID())) {
                    this.r.get(i).setChecked(true);
                }
            }
        }
        this.q = new UbahMasterCardAdapter();
        this.rvMastercard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvMastercard.setAdapter(this.q);
        this.rvMastercard.setNestedScrollingEnabled(false);
        UbahMasterCardAdapter ubahMasterCardAdapter = this.q;
        ubahMasterCardAdapter.g = this.r;
        ubahMasterCardAdapter.a.b();
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
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC5UbahMastercardActivity";
        this.j = "CC5UbahMastercardActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492912;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseUbahMastercardEvent(final clickSumberSetoran clicksumbersetoran) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC5UbahMastercardActivity.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (clicksumbersetoran.b) {
                    ((CreditCardOptions) CC5UbahMastercardActivity.this.r.get(clicksumbersetoran.e)).setChecked(true);
                    CC5UbahMastercardActivity.this.f.getCreditCardOptions().add((CreditCardOptions) CC5UbahMastercardActivity.this.r.get(clicksumbersetoran.e));
                } else {
                    ((CreditCardOptions) CC5UbahMastercardActivity.this.r.get(clicksumbersetoran.e)).setChecked(false);
                    ((CreditCardOptions) Objects.requireNonNull(CC5UbahMastercardActivity.this.f.getCreditCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC5UbahMastercardActivity.this.r.get(clicksumbersetoran.e)).getCardID()).findFirst())).deleteFromRealm();
                }
                UbahMasterCardAdapter ubahMasterCardAdapter = CC5UbahMastercardActivity.this.q;
                ubahMasterCardAdapter.a.d(clicksumbersetoran.e, 1, null);
            }
        });
        documentProvider.b().d(new CityReservationAdapter$CityReservationVH());
    }
}
