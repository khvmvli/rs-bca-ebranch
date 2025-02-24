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
import com.bca.smartbranch.dialog.YakinKeluarDialog;
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
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseProvinsiRes;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC23AFormKartuKreditFragment.class */
public class CC23AFormKartuKreditFragment extends BaseFragment {
    @BindView(2131296396)
    Button btnLanjut;
    private List<CreditCardOptions> d;
    private ChooseSubMastercardAdapter f;
    private CreditCard g;
    private CreditCardSupplement h;
    private ChooseSubVisaAdapter i;
    private List<CreditCardOptions> j;
    private List<CreditCardOptions> l;
    @BindView(2131298330)
    setOnStartEnterTransitionListener rvMastercard;
    @BindView(2131298341)
    setOnStartEnterTransitionListener rvVisa;
    private List<CardType> a = new ArrayList();
    private List<CreditCardOptions> m = new ArrayList();
    private List<CreditCardOptions> n = new ArrayList();

    private void a() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493179;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23AFormKartuKreditFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC23AFormKartuKreditFragment.this.h.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).or().equalTo("cardGroupType", CardType.VISA).findAll().deleteAllFromRealm();
            }
        });
        e(2131296811, new CC21AFormKartuKreditFragment(), "CC21AFormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        if (!this.d.isEmpty() || !this.j.isEmpty() || !this.l.isEmpty()) {
            c(2131296811, new CC25AFormKartuKreditFragment(), "CC25AFormKartuKreditFragment");
            return;
        }
        LinearLayout linearLayout = ((CC8FormKartuKreditActivity) getActivity()).llMain;
        KeluarFormReservationDialog_ViewBinding.a(null, linearLayout, linearLayout.getResources().getText(2131821007), -1).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23AFormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC23AFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            a();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23AFormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC23AFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            a();
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
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23AFormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC23AFormKartuKreditFragment.this.h.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).or().equalTo("cardGroupType", CardType.VISA).findAll().deleteAllFromRealm();
                }
            });
            e(2131296811, new CC21AFormKartuKreditFragment(), "CC21AFormKartuKreditFragment");
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (((CC8FormKartuKreditActivity) getActivity()).p.isMember()) {
                new SimpanDraftDialog().show(getFragmentManager(), "SimpanDraftDialog");
                return true;
            }
            new YakinKeluarDialog().show(getFragmentManager(), "YakinKeluarDialog");
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
                    this.n.add(creditCardOptions);
                }
                if (cardType.getCardGroupType().equals(CardType.VISA)) {
                    this.m.add(creditCardOptions);
                }
            }
        }
        CreditCardSupplement creditCardSupplement = this.g.getCreditCardSupplements().get(0);
        this.h = creditCardSupplement;
        this.d = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
        this.j = this.h.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).findAll();
        this.l = this.h.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.VISA).findAll();
        for (int i = 0; i < this.n.size(); i++) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (this.n.get(i).getCardID().equals(this.j.get(i2).getCardID())) {
                    this.n.get(i).setChecked(true);
                }
            }
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            for (int i4 = 0; i4 < this.l.size(); i4++) {
                if (this.m.get(i3).getCardID().equals(this.l.get(i4).getCardID())) {
                    this.m.get(i3).setChecked(true);
                }
            }
        }
        String email = ((CC8FormKartuKreditActivity) getActivity()).p.getEmail();
        long longValue = ((CC8FormKartuKreditActivity) getActivity()).n.getId().longValue();
        this.f = new ChooseSubMastercardAdapter();
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvMastercard;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvMastercard.setAdapter(this.f);
        this.rvMastercard.setNestedScrollingEnabled(false);
        ChooseSubMastercardAdapter chooseSubMastercardAdapter = this.f;
        chooseSubMastercardAdapter.g = this.n;
        chooseSubMastercardAdapter.a.b();
        this.f.i = email;
        this.f.b = longValue;
        this.i = new ChooseSubVisaAdapter();
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.rvVisa;
        getContext();
        setonstartentertransitionlistener2.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvVisa.setAdapter(this.i);
        this.rvVisa.setNestedScrollingEnabled(false);
        ChooseSubVisaAdapter chooseSubVisaAdapter = this.i;
        chooseSubVisaAdapter.j = this.m;
        chooseSubVisaAdapter.a.b();
        this.i.g = email;
        this.i.b = longValue;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeChooseSubMastercardVisaEvent(final onChooseProvinsiRes onchooseprovinsires) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC23AFormKartuKreditFragment.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                String str = onchooseprovinsires.c;
                str.hashCode();
                if (str.equals("type_mastercard")) {
                    if (onchooseprovinsires.a) {
                        ((CreditCardOptions) CC23AFormKartuKreditFragment.this.n.get(onchooseprovinsires.e)).setChecked(true);
                        CC23AFormKartuKreditFragment.this.h.getSupplementCardOptions().add((CreditCardOptions) CC23AFormKartuKreditFragment.this.n.get(onchooseprovinsires.e));
                    } else {
                        ((CreditCardOptions) CC23AFormKartuKreditFragment.this.n.get(onchooseprovinsires.e)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC23AFormKartuKreditFragment.this.h.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC23AFormKartuKreditFragment.this.n.get(onchooseprovinsires.e)).getCardID()).findFirst())).deleteFromRealm();
                    }
                    ChooseSubMastercardAdapter chooseSubMastercardAdapter = CC23AFormKartuKreditFragment.this.f;
                    chooseSubMastercardAdapter.a.d(onchooseprovinsires.e, 1, null);
                } else if (str.equals("type_visa")) {
                    if (onchooseprovinsires.a) {
                        ((CreditCardOptions) CC23AFormKartuKreditFragment.this.m.get(onchooseprovinsires.e)).setChecked(true);
                        CC23AFormKartuKreditFragment.this.h.getSupplementCardOptions().add((CreditCardOptions) CC23AFormKartuKreditFragment.this.m.get(onchooseprovinsires.e));
                    } else {
                        ((CreditCardOptions) CC23AFormKartuKreditFragment.this.m.get(onchooseprovinsires.e)).setChecked(false);
                        ((CreditCardOptions) Objects.requireNonNull(CC23AFormKartuKreditFragment.this.h.getSupplementCardOptions().where().equalTo("cardID", ((CreditCardOptions) CC23AFormKartuKreditFragment.this.m.get(onchooseprovinsires.e)).getCardID()).findFirst())).deleteFromRealm();
                    }
                    ChooseSubVisaAdapter chooseSubVisaAdapter = CC23AFormKartuKreditFragment.this.i;
                    chooseSubVisaAdapter.a.d(onchooseprovinsires.e, 1, null);
                }
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveMasterCardEvent(BenefitAdapter$MyViewHolder_ViewBinding benefitAdapter$MyViewHolder_ViewBinding) {
        for (CreditCardOptions creditCardOptions : this.n) {
            if (creditCardOptions.getCardID().equals(benefitAdapter$MyViewHolder_ViewBinding.a)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.f.a.b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveVisaCardEvent(BidangPekerjaanAdapter$BidangPekerjaanVH bidangPekerjaanAdapter$BidangPekerjaanVH) {
        for (CreditCardOptions creditCardOptions : this.m) {
            if (creditCardOptions.getCardID().equals(bidangPekerjaanAdapter$BidangPekerjaanVH.c)) {
                creditCardOptions.setChecked(false);
            }
        }
        this.i.a.b();
    }
}
