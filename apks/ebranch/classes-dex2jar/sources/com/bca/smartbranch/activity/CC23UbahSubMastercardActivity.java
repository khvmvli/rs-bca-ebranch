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
import com.bca.smartbranch.activity.CC23UbahSubMastercardActivity;
import com.bca.smartbranch.adapter.UbahSubMasterCardAdapter;
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
import o.CityReservationAdapter$CityReservationVH;
import o.ListUtil;
import o.PilihSumberSetoranActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC23UbahSubMastercardActivity.class */
public class CC23UbahSubMastercardActivity extends BaseActivityPostLogin {
    public CreditCard f;
    private UbahSubMasterCardAdapter p;
    private int q;
    private CreditCardSupplement r;
    @BindView(2131298330)
    setOnStartEnterTransitionListener rvMastercard;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private List<CardType> n = new ArrayList();
    private List<CreditCardOptions> t = new ArrayList();

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
        this.q = extras.getInt("INDEX_CARD_SUPPLEMENT");
        this.k.executeTransaction(new Realm.Transaction(extras) { // from class: o.onSessionExpiredEvent
            public final /* synthetic */ Bundle d;

            {
                this.d = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC23UbahSubMastercardActivity.this.f = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(this.d.getLong("CREDIT_CARD_ID"))).findFirst();
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
                if (cardType.getCardGroupType().equals(CardType.MASTER)) {
                    this.t.add(creditCardOptions);
                }
            }
        }
        CreditCardSupplement creditCardSupplement = this.f.getCreditCardSupplements().get(this.q);
        this.r = creditCardSupplement;
        RealmResults<CreditCardOptions> findAll = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).findAll();
        for (int i = 0; i < this.t.size(); i++) {
            for (int i2 = 0; i2 < findAll.size(); i2++) {
                if (this.t.get(i).getCardID().equals(findAll.get(i2).getCardID())) {
                    this.t.get(i).setChecked(true);
                }
            }
        }
        this.p = new UbahSubMasterCardAdapter();
        this.rvMastercard.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvMastercard.setAdapter(this.p);
        this.rvMastercard.setNestedScrollingEnabled(false);
        UbahSubMasterCardAdapter ubahSubMasterCardAdapter = this.p;
        ubahSubMasterCardAdapter.j = this.t;
        ubahSubMasterCardAdapter.a.b();
        String string = extras.getString("EMAIL");
        long j = extras.getLong("CREDIT_CARD_ID");
        this.p.g = string;
        this.p.b = j;
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
        setCardSlogan.e().b = "CC23UbahSubMastercardActivity";
        this.j = "CC23UbahSubMastercardActivity";
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
    public void subscribeChooseUbahMastercardEvent(final PilihSumberSetoranActivity_ViewBinding pilihSumberSetoranActivity_ViewBinding) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC23UbahSubMastercardActivity.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (pilihSumberSetoranActivity_ViewBinding.a) {
                    ((CreditCardOptions) CC23UbahSubMastercardActivity.this.t.get(pilihSumberSetoranActivity_ViewBinding.b)).setChecked(true);
                    CC23UbahSubMastercardActivity.this.r.getSupplementCardOptions().add((CreditCardOptions) CC23UbahSubMastercardActivity.this.t.get(pilihSumberSetoranActivity_ViewBinding.b));
                } else {
                    ((CreditCardOptions) CC23UbahSubMastercardActivity.this.t.get(pilihSumberSetoranActivity_ViewBinding.b)).setChecked(false);
                    ((CreditCardOptions) Objects.requireNonNull(CC23UbahSubMastercardActivity.this.r.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC23UbahSubMastercardActivity.this.t.get(pilihSumberSetoranActivity_ViewBinding.b)).getCardID()).findFirst())).deleteFromRealm();
                }
                UbahSubMasterCardAdapter ubahSubMasterCardAdapter = CC23UbahSubMastercardActivity.this.p;
                ubahSubMasterCardAdapter.a.d(pilihSumberSetoranActivity_ViewBinding.b, 1, null);
            }
        });
        documentProvider.b().d(new CityReservationAdapter$CityReservationVH());
    }
}
