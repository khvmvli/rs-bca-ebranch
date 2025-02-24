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
import com.bca.smartbranch.activity.CC21UbahSubBCACardActivity;
import com.bca.smartbranch.adapter.UbahSubBCACardAdapter;
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
import o.ChooseSubVisaAdapter$ViewHolder;
import o.ListUtil;
import o.PilihTujuanTransaksiORActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC21UbahSubBCACardActivity.class */
public class CC21UbahSubBCACardActivity extends BaseActivityPostLogin {
    @BindView(2131296396)
    Button btnLanjut;
    @BindString(2131820743)
    String errorBcaCardEmpty;
    public CreditCard f;
    @BindView(2131297766)
    LinearLayout llMain;
    private int r;
    @BindView(2131298323)
    setOnStartEnterTransitionListener rvData;
    private UbahSubBCACardAdapter s;
    private CreditCardSupplement t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private List<CreditCardOptions> p = new ArrayList();
    private List<CardType> n = new ArrayList();

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
        this.r = extras.getInt("INDEX_CARD_SUPPLEMENT");
        this.k.executeTransaction(new Realm.Transaction(extras) { // from class: o.BaseActivityPostLogin
            public final /* synthetic */ Bundle e;

            {
                this.e = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC21UbahSubBCACardActivity.this.f = (CreditCard) realm.where(CreditCard.class).equalTo("id", Long.valueOf(this.e.getLong("CREDIT_CARD_ID"))).findFirst();
            }
        });
        List<CardType> list = this.n;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.n) {
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
                    this.p.add(creditCardOptions);
                }
            }
        }
        CreditCardSupplement creditCardSupplement = this.f.getCreditCardSupplements().get(this.r);
        this.t = creditCardSupplement;
        RealmResults<CreditCardOptions> findAll = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
        for (int i = 0; i < this.p.size(); i++) {
            for (int i2 = 0; i2 < findAll.size(); i2++) {
                if (this.p.get(i).getCardID().equals(findAll.get(i2).getCardID())) {
                    this.p.get(i).setChecked(true);
                }
            }
        }
        this.s = new UbahSubBCACardAdapter();
        this.rvData.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvData.setAdapter(this.s);
        UbahSubBCACardAdapter ubahSubBCACardAdapter = this.s;
        ubahSubBCACardAdapter.e = this.p;
        ubahSubBCACardAdapter.a.b();
        String string = extras.getString("EMAIL");
        long j = extras.getLong("CREDIT_CARD_ID");
        this.s.f = string;
        this.s.b = j;
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
        setCardSlogan.e().b = "CC21UbahSubBCACardActivity";
        this.j = "CC21UbahSubBCACardActivity";
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
    public void subscribeChooseUbahBCACardEvent(final PilihTujuanTransaksiORActivity pilihTujuanTransaksiORActivity) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC21UbahSubBCACardActivity.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (pilihTujuanTransaksiORActivity.e) {
                    ((CreditCardOptions) CC21UbahSubBCACardActivity.this.p.get(pilihTujuanTransaksiORActivity.c)).setChecked(true);
                    CC21UbahSubBCACardActivity.this.t.getSupplementCardOptions().add((CreditCardOptions) CC21UbahSubBCACardActivity.this.p.get(pilihTujuanTransaksiORActivity.c));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (CreditCardOptions creditCardOptions : CC21UbahSubBCACardActivity.this.p) {
                        if (creditCardOptions.isChecked()) {
                            arrayList.add(creditCardOptions);
                        }
                    }
                    if (arrayList.size() > 1) {
                        ((CreditCardOptions) CC21UbahSubBCACardActivity.this.p.get(pilihTujuanTransaksiORActivity.c)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC21UbahSubBCACardActivity.this.t.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC21UbahSubBCACardActivity.this.p.get(pilihTujuanTransaksiORActivity.c)).getCardID()).findFirst())).deleteFromRealm();
                    }
                }
                UbahSubBCACardAdapter ubahSubBCACardAdapter = CC21UbahSubBCACardActivity.this.s;
                ubahSubBCACardAdapter.a.d(pilihTujuanTransaksiORActivity.c, 1, null);
            }
        });
        documentProvider.b().d(new ChooseSubVisaAdapter$ViewHolder());
    }
}
