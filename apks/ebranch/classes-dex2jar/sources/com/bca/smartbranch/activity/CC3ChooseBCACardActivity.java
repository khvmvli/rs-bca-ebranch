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
import com.bca.smartbranch.activity.CC3ChooseBCACardActivity;
import com.bca.smartbranch.adapter.ChooseBCACardAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.dialog.MessageDialog;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.BenefitAdapter$MyViewHolder;
import o.ListUtil;
import o.PilihJenisMataUangActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC3ChooseBCACardActivity.class */
public class CC3ChooseBCACardActivity extends BaseActivityPostLogin {
    @BindView(2131296396)
    Button btnLanjut;
    @BindString(2131820743)
    String errorBcaCardEmpty;
    public CreditCard f;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298323)
    setOnStartEnterTransitionListener rvData;
    private ChooseBCACardAdapter s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298983)
    TextView tvErrorBCACard;
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
        Bundle bundle2 = new Bundle();
        bundle2.putString("MessageDialogContent", this.errorBcaCardEmpty);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle2);
        messageDialog.show(l(), "MessageDialog");
        List<CardType> list = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        this.n = list;
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
        this.s = new ChooseBCACardAdapter();
        this.rvData.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvData.setAdapter(this.s);
        ChooseBCACardAdapter chooseBCACardAdapter = this.s;
        chooseBCACardAdapter.b = this.p;
        chooseBCACardAdapter.a.b();
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.BranchMapActivity
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC3ChooseBCACardActivity cC3ChooseBCACardActivity = CC3ChooseBCACardActivity.this;
                CreditCard creditCard = (CreditCard) realm.createObject(CreditCard.class, Long.valueOf(System.currentTimeMillis()));
                cC3ChooseBCACardActivity.f = creditCard;
                creditCard.setCreatedAt(Long.valueOf(System.currentTimeMillis()));
                cC3ChooseBCACardActivity.f.setDraft(Boolean.FALSE);
            }
        });
    }

    @OnClick({2131296396})
    public void onCLickedLanjut() {
        for (CreditCardOptions creditCardOptions : this.p) {
            if (creditCardOptions.isChecked()) {
                this.tvErrorBCACard.setVisibility(8);
                Intent intent = new Intent(this, CC5ChooseMastercardVisaActivity.class);
                intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.n));
                intent.putExtra("CREDIT_CARD_ID", this.f.getId());
                startActivity(intent);
                return;
            }
        }
        this.tvErrorBCACard.setVisibility(0);
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
        setCardSlogan.e().b = "CC3ChooseBCACardActivity";
        this.j = "CC3ChooseBCACardActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492905;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseBCACardEvent(final PilihJenisMataUangActivity pilihJenisMataUangActivity) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC3ChooseBCACardActivity.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (pilihJenisMataUangActivity.a) {
                    ((CreditCardOptions) CC3ChooseBCACardActivity.this.p.get(pilihJenisMataUangActivity.e)).setChecked(true);
                    CC3ChooseBCACardActivity.this.f.getCreditCardOptions().add((CreditCardOptions) CC3ChooseBCACardActivity.this.p.get(pilihJenisMataUangActivity.e));
                } else {
                    ((CreditCardOptions) CC3ChooseBCACardActivity.this.p.get(pilihJenisMataUangActivity.e)).setChecked(false);
                    ((CreditCardOptions) Objects.requireNonNull(CC3ChooseBCACardActivity.this.f.getCreditCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC3ChooseBCACardActivity.this.p.get(pilihJenisMataUangActivity.e)).getCardID()).findFirst())).deleteFromRealm();
                }
                ChooseBCACardAdapter chooseBCACardAdapter = CC3ChooseBCACardActivity.this.s;
                chooseBCACardAdapter.a.d(pilihJenisMataUangActivity.e, 1, null);
            }
        });
        this.tvErrorBCACard.setVisibility(8);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveBCACardEvent(BenefitAdapter$MyViewHolder benefitAdapter$MyViewHolder) {
        for (CreditCardOptions creditCardOptions : this.p) {
            if (creditCardOptions.getCardID().equals(benefitAdapter$MyViewHolder.a)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.s.a.b();
    }
}
