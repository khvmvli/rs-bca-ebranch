package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.adapter.ChooseSubBCACardAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.BenefitAdapter$MyViewHolder;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseProvinsi;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC21BFormKartuKreditFragment.class */
public class CC21BFormKartuKreditFragment extends BaseFragment {
    private List<CreditCardOptions> a = new ArrayList();
    @BindView(2131296396)
    Button btnLanjut;
    private List<CardType> d;
    private ChooseSubBCACardAdapter g;
    private CreditCardSupplement h;
    private CreditCard i;
    @BindView(2131298323)
    setOnStartEnterTransitionListener rvData;

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493178;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21BFormKartuKreditFragment.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC21BFormKartuKreditFragment.this.h.cascadeDelete();
            }
        });
        e(2131296811, new CC26AFormKartuKreditFragment(), "CC26AFormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        c(2131296811, new CC23BFormKartuKreditFragment(), "CC23BFormKartuKreditFragment");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21BFormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC21BFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558409, menu);
        onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21BFormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC21BFormKartuKreditFragment.this.h.cascadeDelete();
                }
            });
            e(2131296811, new CC26AFormKartuKreditFragment(), "CC26AFormKartuKreditFragment");
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            new SimpanDraftDialog().show(getFragmentManager(), "SimpanDraftDialog");
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.d = ((CC8FormKartuKreditActivity) getActivity()).f;
        this.i = ((CC8FormKartuKreditActivity) getActivity()).n;
        List<CardType> list = this.d;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.d) {
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
                    this.a.add(creditCardOptions);
                }
            }
        }
        if (this.i.getCreditCardSupplements().size() >= 2) {
            CreditCardSupplement creditCardSupplement = this.i.getCreditCardSupplements().get(1);
            this.h = creditCardSupplement;
            RealmResults<CreditCardOptions> findAll = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
            for (int i = 0; i < this.a.size(); i++) {
                for (int i2 = 0; i2 < findAll.size(); i2++) {
                    if (this.a.get(i).getCardID().equals(findAll.get(i2).getCardID())) {
                        this.a.get(i).setChecked(true);
                    }
                }
            }
        } else {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21BFormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC21BFormKartuKreditFragment.this.h = (CreditCardSupplement) realm.createObject(CreditCardSupplement.class, Long.valueOf(System.currentTimeMillis()));
                    CC21BFormKartuKreditFragment.this.i.getCreditCardSupplements().add(CC21BFormKartuKreditFragment.this.h);
                }
            });
        }
        this.g = new ChooseSubBCACardAdapter();
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvData;
        getActivity();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvData.setAdapter(this.g);
        this.rvData.setNestedScrollingEnabled(false);
        ChooseSubBCACardAdapter chooseSubBCACardAdapter = this.g;
        chooseSubBCACardAdapter.e = this.a;
        chooseSubBCACardAdapter.a.b();
        String email = ((CC8FormKartuKreditActivity) getActivity()).p.getEmail();
        long longValue = ((CC8FormKartuKreditActivity) getActivity()).n.getId().longValue();
        this.g.h = email;
        this.g.b = longValue;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseSubBCACardEvent(final onChooseProvinsi onchooseprovinsi) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21BFormKartuKreditFragment.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (onchooseprovinsi.c) {
                    ((CreditCardOptions) CC21BFormKartuKreditFragment.this.a.get(onchooseprovinsi.e)).setChecked(true);
                    CC21BFormKartuKreditFragment.this.h.getSupplementCardOptions().add((CreditCardOptions) CC21BFormKartuKreditFragment.this.a.get(onchooseprovinsi.e));
                } else {
                    ((CreditCardOptions) CC21BFormKartuKreditFragment.this.a.get(onchooseprovinsi.e)).setChecked(false);
                    ((CreditCardOptions) Objects.requireNonNull(CC21BFormKartuKreditFragment.this.h.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC21BFormKartuKreditFragment.this.a.get(onchooseprovinsi.e)).getCardID()).findFirst())).deleteFromRealm();
                }
                ChooseSubBCACardAdapter chooseSubBCACardAdapter = CC21BFormKartuKreditFragment.this.g;
                chooseSubBCACardAdapter.a.d(onchooseprovinsi.e, 1, null);
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveBCACardEvent(BenefitAdapter$MyViewHolder benefitAdapter$MyViewHolder) {
        for (CreditCardOptions creditCardOptions : this.a) {
            if (creditCardOptions.getCardID().equals(benefitAdapter$MyViewHolder.a)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.g.a.b();
    }
}
