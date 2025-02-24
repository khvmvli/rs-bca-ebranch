package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.CC3UbahBCACardActivity;
import com.bca.smartbranch.adapter.UbahBCACardAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.ChooseSubVisaAdapter$ViewHolder;
import o.ListUtil;
import o.PilihProvinsiActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC3UbahBCACardActivity.class */
public class CC3UbahBCACardActivity extends BaseActivityPostLogin {
    @BindView(2131296396)
    Button btnLanjut;
    @BindString(2131820743)
    String errorBcaCardEmpty;
    @BindView(2131297766)
    LinearLayout llMain;
    public CreditCard n;
    private UbahBCACardAdapter r;
    @BindView(2131298323)
    setOnStartEnterTransitionListener rvData;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private List<CreditCardOptions> t = new ArrayList();
    public List<CreditCardOptions> f = new ArrayList();
    private List<CardType> p = new ArrayList();

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822011);
        Bundle extras = getIntent().getExtras();
        this.p = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        this.k.executeTransaction(new Realm.Transaction(extras) { // from class: o.BaseActivityPreLogin
            public final /* synthetic */ Bundle c;

            {
                this.c = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC3UbahBCACardActivity cC3UbahBCACardActivity = CC3UbahBCACardActivity.this;
                CreditCard creditCard = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(this.c.getLong("CREDIT_CARD_ID"))).findFirst();
                cC3UbahBCACardActivity.n = creditCard;
                cC3UbahBCACardActivity.f = creditCard.getCreditCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
            }
        });
        List<CardType> list = this.p;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.p) {
                if (cardType.getCardGroupType().equals(CardType.BCA_CARD)) {
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
                    this.t.add(creditCardOptions);
                }
            }
        }
        for (int i = 0; i < this.t.size(); i++) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                if (this.t.get(i).getCardID().equals(this.f.get(i2).getCardID())) {
                    this.t.get(i).setChecked(true);
                }
            }
        }
        this.r = new UbahBCACardAdapter();
        this.rvData.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvData.setAdapter(this.r);
        UbahBCACardAdapter ubahBCACardAdapter = this.r;
        ubahBCACardAdapter.e = this.t;
        ubahBCACardAdapter.a.b();
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
        setCardSlogan.e().b = "CC3UbahBCACardActivity";
        this.j = "CC3UbahBCACardActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492907;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseUbahBCACardEvent(final PilihProvinsiActivity_ViewBinding pilihProvinsiActivity_ViewBinding) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC3UbahBCACardActivity.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (pilihProvinsiActivity_ViewBinding.b) {
                    ((CreditCardOptions) CC3UbahBCACardActivity.this.t.get(pilihProvinsiActivity_ViewBinding.e)).setChecked(true);
                    CC3UbahBCACardActivity.this.n.getCreditCardOptions().add((CreditCardOptions) CC3UbahBCACardActivity.this.t.get(pilihProvinsiActivity_ViewBinding.e));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (CreditCardOptions creditCardOptions : CC3UbahBCACardActivity.this.t) {
                        if (creditCardOptions.isChecked()) {
                            arrayList.add(creditCardOptions);
                        }
                    }
                    if (arrayList.size() > 1) {
                        ((CreditCardOptions) CC3UbahBCACardActivity.this.t.get(pilihProvinsiActivity_ViewBinding.e)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC3UbahBCACardActivity.this.n.getCreditCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC3UbahBCACardActivity.this.t.get(pilihProvinsiActivity_ViewBinding.e)).getCardID()).findFirst())).deleteFromRealm();
                    }
                }
                UbahBCACardAdapter ubahBCACardAdapter = CC3UbahBCACardActivity.this.r;
                ubahBCACardAdapter.a.d(pilihProvinsiActivity_ViewBinding.e, 1, null);
            }
        });
        documentProvider.b().d(new ChooseSubVisaAdapter$ViewHolder());
    }
}
