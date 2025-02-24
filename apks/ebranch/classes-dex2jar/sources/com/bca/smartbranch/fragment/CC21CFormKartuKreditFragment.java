package com.bca.smartbranch.fragment;

import android.app.Activity;
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
import o.setOnHierarchyChangeListener;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC21CFormKartuKreditFragment.class */
public class CC21CFormKartuKreditFragment extends BaseFragment {
    private List<CardType> a;
    @BindView(2131296396)
    Button btnLanjut;
    private List<CreditCardOptions> d = new ArrayList();
    private ChooseSubBCACardAdapter f;
    private CreditCard g;
    private CreditCardSupplement j;
    @BindView(2131298323)
    setOnStartEnterTransitionListener rvData;

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493178;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21CFormKartuKreditFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC21CFormKartuKreditFragment.this.j.cascadeDelete();
            }
        });
        e(2131296811, new CC26BFormKartuKreditFragment(), "CC26BFormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        c(2131296811, new CC23CFormKartuKreditFragment(), "CC23CFormKartuKreditFragment");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21CFormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC21CFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) getActivity());
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
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21CFormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC21CFormKartuKreditFragment.this.j.cascadeDelete();
                }
            });
            e(2131296811, new CC26BFormKartuKreditFragment(), "CC26BFormKartuKreditFragment");
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
        this.a = ((CC8FormKartuKreditActivity) getActivity()).f;
        this.g = ((CC8FormKartuKreditActivity) getActivity()).n;
        List<CardType> list = this.a;
        if (list != null && !list.isEmpty()) {
            for (CardType cardType : this.a) {
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
                    this.d.add(creditCardOptions);
                }
            }
        }
        if (this.g.getCreditCardSupplements().size() >= 3) {
            CreditCardSupplement creditCardSupplement = this.g.getCreditCardSupplements().get(2);
            this.j = creditCardSupplement;
            RealmResults<CreditCardOptions> findAll = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
            for (int i = 0; i < this.d.size(); i++) {
                for (int i2 = 0; i2 < findAll.size(); i2++) {
                    if (this.d.get(i).getCardID().equals(findAll.get(i2).getCardID())) {
                        this.d.get(i).setChecked(true);
                    }
                }
            }
        } else {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21CFormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC21CFormKartuKreditFragment.this.j = (CreditCardSupplement) realm.createObject(CreditCardSupplement.class, Long.valueOf(System.currentTimeMillis()));
                    CC21CFormKartuKreditFragment.this.g.getCreditCardSupplements().add(CC21CFormKartuKreditFragment.this.j);
                }
            });
        }
        this.f = new ChooseSubBCACardAdapter();
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvData;
        getActivity();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvData.setAdapter(this.f);
        this.rvData.setNestedScrollingEnabled(false);
        ChooseSubBCACardAdapter chooseSubBCACardAdapter = this.f;
        chooseSubBCACardAdapter.e = this.d;
        chooseSubBCACardAdapter.a.b();
        String email = ((CC8FormKartuKreditActivity) getActivity()).p.getEmail();
        long longValue = ((CC8FormKartuKreditActivity) getActivity()).n.getId().longValue();
        this.f.h = email;
        this.f.b = longValue;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseSubBCACardEvent(final onChooseProvinsi onchooseprovinsi) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC21CFormKartuKreditFragment.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (onchooseprovinsi.c) {
                    ((CreditCardOptions) CC21CFormKartuKreditFragment.this.d.get(onchooseprovinsi.e)).setChecked(true);
                    CC21CFormKartuKreditFragment.this.j.getSupplementCardOptions().add((CreditCardOptions) CC21CFormKartuKreditFragment.this.d.get(onchooseprovinsi.e));
                } else {
                    ((CreditCardOptions) CC21CFormKartuKreditFragment.this.d.get(onchooseprovinsi.e)).setChecked(false);
                    ((CreditCardOptions) Objects.requireNonNull(CC21CFormKartuKreditFragment.this.j.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC21CFormKartuKreditFragment.this.d.get(onchooseprovinsi.e)).getCardID()).findFirst())).deleteFromRealm();
                }
                ChooseSubBCACardAdapter chooseSubBCACardAdapter = CC21CFormKartuKreditFragment.this.f;
                chooseSubBCACardAdapter.a.d(onchooseprovinsi.e, 1, null);
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveBCACardEvent(BenefitAdapter$MyViewHolder benefitAdapter$MyViewHolder) {
        for (CreditCardOptions creditCardOptions : this.d) {
            if (creditCardOptions.getCardID().equals(benefitAdapter$MyViewHolder.a)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.f.a.b();
    }
}
