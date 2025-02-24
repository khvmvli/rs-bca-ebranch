package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.adapter.ChooseSubMastercardAdapter;
import com.bca.smartbranch.adapter.ChooseSubVisaAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.BenefitAdapter$MyViewHolder_ViewBinding;
import o.BidangPekerjaanAdapter$BidangPekerjaanVH;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseProvinsiRes;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC23CFormKartuKreditFragment.class */
public class CC23CFormKartuKreditFragment extends BaseFragment {
    private List<CreditCardOptions> a;
    @BindView(2131296396)
    Button btnLanjut;
    private List<CreditCardOptions> f;
    private CreditCardSupplement g;
    private ChooseSubMastercardAdapter h;
    private CreditCard i;
    private ChooseSubVisaAdapter j;
    private List<CreditCardOptions> l;
    @BindView(2131298330)
    setOnStartEnterTransitionListener rvMastercard;
    @BindView(2131298341)
    setOnStartEnterTransitionListener rvVisa;
    private List<CardType> d = new ArrayList();
    private List<CreditCardOptions> n = new ArrayList();

    /* renamed from: o */
    private List<CreditCardOptions> f35o = new ArrayList();

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493179;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23CFormKartuKreditFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC23CFormKartuKreditFragment.this.g.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).or().equalTo("cardGroupType", CardType.VISA).findAll().deleteAllFromRealm();
            }
        });
        e(2131296811, new CC21CFormKartuKreditFragment(), "CC21CFormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        if (!this.a.isEmpty() || !this.f.isEmpty() || !this.l.isEmpty()) {
            c(2131296811, new CC25CFormKartuKreditFragment(), "CC25CFormKartuKreditFragment");
            return;
        }
        LinearLayout linearLayout = ((CC8FormKartuKreditActivity) getActivity()).llMain;
        KeluarFormReservationDialog_ViewBinding.a(null, linearLayout, linearLayout.getResources().getText(2131821007), -1).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23CFormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC23CFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
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
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23CFormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC23CFormKartuKreditFragment.this.g.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).or().equalTo("cardGroupType", CardType.VISA).findAll().deleteAllFromRealm();
                }
            });
            e(2131296811, new CC21CFormKartuKreditFragment(), "CC21CFormKartuKreditFragment");
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
                    this.f35o.add(creditCardOptions);
                }
                if (cardType.getCardGroupType().equals(CardType.VISA)) {
                    this.n.add(creditCardOptions);
                }
            }
        }
        CreditCardSupplement creditCardSupplement = this.i.getCreditCardSupplements().get(2);
        this.g = creditCardSupplement;
        this.a = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
        this.f = this.g.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).findAll();
        this.l = this.g.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.VISA).findAll();
        for (int i = 0; i < this.f35o.size(); i++) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                if (this.f35o.get(i).getCardID().equals(this.f.get(i2).getCardID())) {
                    this.f35o.get(i).setChecked(true);
                }
            }
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            for (int i4 = 0; i4 < this.l.size(); i4++) {
                if (this.n.get(i3).getCardID().equals(this.l.get(i4).getCardID())) {
                    this.n.get(i3).setChecked(true);
                }
            }
        }
        String email = ((CC8FormKartuKreditActivity) getActivity()).p.getEmail();
        long longValue = ((CC8FormKartuKreditActivity) getActivity()).n.getId().longValue();
        this.h = new ChooseSubMastercardAdapter();
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvMastercard;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvMastercard.setAdapter(this.h);
        this.rvMastercard.setNestedScrollingEnabled(false);
        ChooseSubMastercardAdapter chooseSubMastercardAdapter = this.h;
        chooseSubMastercardAdapter.g = this.f35o;
        chooseSubMastercardAdapter.a.b();
        this.h.i = email;
        this.h.b = longValue;
        this.j = new ChooseSubVisaAdapter();
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.rvVisa;
        getContext();
        setonstartentertransitionlistener2.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvVisa.setAdapter(this.j);
        this.rvVisa.setNestedScrollingEnabled(false);
        ChooseSubVisaAdapter chooseSubVisaAdapter = this.j;
        chooseSubVisaAdapter.j = this.n;
        chooseSubVisaAdapter.a.b();
        this.j.g = email;
        this.j.b = longValue;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseSubMastercardVisaEvent(final onChooseProvinsiRes onchooseprovinsires) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23CFormKartuKreditFragment.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                String str = onchooseprovinsires.c;
                str.hashCode();
                if (str.equals("type_mastercard")) {
                    if (onchooseprovinsires.a) {
                        ((CreditCardOptions) CC23CFormKartuKreditFragment.this.f35o.get(onchooseprovinsires.e)).setChecked(true);
                        CC23CFormKartuKreditFragment.this.g.getSupplementCardOptions().add((CreditCardOptions) CC23CFormKartuKreditFragment.this.f35o.get(onchooseprovinsires.e));
                    } else {
                        ((CreditCardOptions) CC23CFormKartuKreditFragment.this.f35o.get(onchooseprovinsires.e)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC23CFormKartuKreditFragment.this.g.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC23CFormKartuKreditFragment.this.f35o.get(onchooseprovinsires.e)).getCardID()).findFirst())).deleteFromRealm();
                    }
                    ChooseSubMastercardAdapter chooseSubMastercardAdapter = CC23CFormKartuKreditFragment.this.h;
                    chooseSubMastercardAdapter.a.d(onchooseprovinsires.e, 1, null);
                } else if (str.equals("type_visa")) {
                    if (onchooseprovinsires.a) {
                        ((CreditCardOptions) CC23CFormKartuKreditFragment.this.n.get(onchooseprovinsires.e)).setChecked(true);
                        CC23CFormKartuKreditFragment.this.g.getSupplementCardOptions().add((CreditCardOptions) CC23CFormKartuKreditFragment.this.n.get(onchooseprovinsires.e));
                    } else {
                        ((CreditCardOptions) CC23CFormKartuKreditFragment.this.n.get(onchooseprovinsires.e)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC23CFormKartuKreditFragment.this.g.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC23CFormKartuKreditFragment.this.n.get(onchooseprovinsires.e)).getCardID()).findFirst())).deleteFromRealm();
                    }
                    ChooseSubVisaAdapter chooseSubVisaAdapter = CC23CFormKartuKreditFragment.this.j;
                    chooseSubVisaAdapter.a.d(onchooseprovinsires.e, 1, null);
                }
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveMasterCardEvent(BenefitAdapter$MyViewHolder_ViewBinding benefitAdapter$MyViewHolder_ViewBinding) {
        for (CreditCardOptions creditCardOptions : this.f35o) {
            if (creditCardOptions.getCardID().equals(benefitAdapter$MyViewHolder_ViewBinding.a)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.h.a.b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveVisaCardEvent(BidangPekerjaanAdapter$BidangPekerjaanVH bidangPekerjaanAdapter$BidangPekerjaanVH) {
        for (CreditCardOptions creditCardOptions : this.n) {
            if (creditCardOptions.getCardID().equals(bidangPekerjaanAdapter$BidangPekerjaanVH.c)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.j.a.b();
    }
}
