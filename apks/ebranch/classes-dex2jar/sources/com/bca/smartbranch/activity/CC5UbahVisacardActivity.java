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
import com.bca.smartbranch.activity.CC5UbahVisacardActivity;
import com.bca.smartbranch.adapter.UbahVisaCardAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.ChooseVisaAdapter$ViewHolder;
import o.ListUtil;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.onChooseTujuanTransaksi;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5UbahVisacardActivity.class */
public class CC5UbahVisacardActivity extends BaseActivityPostLogin {
    public CreditCard f;
    @BindView(2131298341)
    setOnStartEnterTransitionListener rvVisacard;
    private UbahVisaCardAdapter s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private List<CardType> r = new ArrayList();
    private List<CreditCardOptions> t = new ArrayList();
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
        this.r = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        this.k.executeTransaction(new Realm.Transaction(extras) { // from class: o.onChooseBranchMapItem
            public final /* synthetic */ Bundle a;

            {
                this.a = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC5UbahVisacardActivity cC5UbahVisacardActivity = CC5UbahVisacardActivity.this;
                CreditCard creditCard = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(this.a.getLong("CREDIT_CARD_ID"))).findFirst();
                cC5UbahVisacardActivity.f = creditCard;
                cC5UbahVisacardActivity.n = creditCard.getCreditCardOptions().where().equalTo("cardGroupType", CardType.VISA).findAll();
            }
        });
        List<CardType> list = this.r;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.r) {
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
                    this.t.add(creditCardOptions);
                }
            }
        }
        for (int i = 0; i < this.t.size(); i++) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                if (this.t.get(i).getCardID().equals(this.n.get(i2).getCardID())) {
                    this.t.get(i).setChecked(true);
                }
            }
        }
        this.s = new UbahVisaCardAdapter();
        this.rvVisacard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvVisacard.setAdapter(this.s);
        this.rvVisacard.setNestedScrollingEnabled(false);
        UbahVisaCardAdapter ubahVisaCardAdapter = this.s;
        ubahVisaCardAdapter.g = this.t;
        ubahVisaCardAdapter.a.b();
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
        setCardSlogan.e().b = "CC5UbahVisacardActivity";
        this.j = "CC5UbahVisacardActivity";
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
    public void subscribeChooseUbahVisaCardEvent(final onChooseTujuanTransaksi onchoosetujuantransaksi) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC5UbahVisacardActivity.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (onchoosetujuantransaksi.c) {
                    ((CreditCardOptions) CC5UbahVisacardActivity.this.t.get(onchoosetujuantransaksi.e)).setChecked(true);
                    CC5UbahVisacardActivity.this.f.getCreditCardOptions().add((CreditCardOptions) CC5UbahVisacardActivity.this.t.get(onchoosetujuantransaksi.e));
                } else {
                    ((CreditCardOptions) CC5UbahVisacardActivity.this.t.get(onchoosetujuantransaksi.e)).setChecked(false);
                    ((CreditCardOptions) Objects.requireNonNull(CC5UbahVisacardActivity.this.f.getCreditCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC5UbahVisacardActivity.this.t.get(onchoosetujuantransaksi.e)).getCardID()).findFirst())).deleteFromRealm();
                }
                UbahVisaCardAdapter ubahVisaCardAdapter = CC5UbahVisacardActivity.this.s;
                ubahVisaCardAdapter.a.d(onchoosetujuantransaksi.e, 1, null);
            }
        });
        documentProvider.b().d(new ChooseVisaAdapter$ViewHolder());
    }
}
