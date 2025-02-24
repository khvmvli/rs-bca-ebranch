package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.CC21UbahSubBCACardActivity;
import com.bca.smartbranch.activity.CC23UbahSubMastercardActivity;
import com.bca.smartbranch.activity.CC23UbahSubVisacardActivity;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.adapter.ReviewBCACardAdapter;
import com.bca.smartbranch.adapter.ReviewMastercardAdapter;
import com.bca.smartbranch.adapter.ReviewVisaAdapter;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import io.realm.Realm;
import io.realm.RealmResults;
import java.util.List;
import java.util.Objects;
import o.BenefitAdapter$MyViewHolder;
import o.BenefitAdapter$MyViewHolder_ViewBinding;
import o.BidangPekerjaanAdapter$BidangPekerjaanVH;
import o.ChooseSubVisaAdapter$ViewHolder;
import o.ChooseVisaAdapter$ViewHolder;
import o.CityReservationAdapter$CityReservationVH;
import o.ListUtil;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC25AFormKartuKreditFragment.class */
public class CC25AFormKartuKreditFragment extends BaseFragment {
    private List<CardType> a;
    private RealmResults<CreditCardOptions> d;
    @BindView(2131296901)
    View dvdMastercard;
    @BindView(2131296908)
    View dvdVisacard;
    private ReviewBCACardAdapter f;
    private RealmResults<CreditCardOptions> g;
    private String h;
    private CreditCard i;
    private CreditCardSupplement j;
    private RealmResults<CreditCardOptions> k;
    private ReviewMastercardAdapter l;
    @BindView(2131297545)
    LinearLayout llBcaCard;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297771)
    LinearLayout llMasterCard;
    @BindView(2131297931)
    LinearLayout llVisaCard;
    private ReviewVisaAdapter m;
    @BindView(2131298317)
    setOnStartEnterTransitionListener rvBcaCard;
    @BindView(2131298330)
    setOnStartEnterTransitionListener rvMasterCard;
    @BindView(2131298342)
    setOnStartEnterTransitionListener rvVisaCard;

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493180;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        e(2131296811, new CC23AFormKartuKreditFragment(), "CC23AFormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        c(2131296811, new CC26AFormKartuKreditFragment(), "CC26AFormKartuKreditFragment");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC25AFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC25AFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
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
            e(2131296811, new CC23AFormKartuKreditFragment(), "CC23AFormKartuKreditFragment");
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
        this.i = ((CC8FormKartuKreditActivity) getActivity()).n;
        this.h = ((CC8FormKartuKreditActivity) getActivity()).p.getEmail();
        if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() > 0) {
            CreditCardSupplement creditCardSupplement = this.i.getCreditCardSupplements().get(0);
            this.j = creditCardSupplement;
            this.d = creditCardSupplement.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.BCA_CARD).findAll();
            this.g = this.j.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.MASTER).findAll();
            this.k = this.j.getSupplementCardOptions().where().equalTo("cardGroupType", CardType.VISA).findAll();
        }
        this.f = new ReviewBCACardAdapter();
        this.l = new ReviewMastercardAdapter();
        this.m = new ReviewVisaAdapter();
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvBcaCard;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.rvMasterCard;
        getContext();
        setonstartentertransitionlistener2.setLayoutManager(new LinearLayoutManager(1, false));
        setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.rvVisaCard;
        getContext();
        setonstartentertransitionlistener3.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvBcaCard.setAdapter(this.f);
        this.rvMasterCard.setAdapter(this.l);
        this.rvVisaCard.setAdapter(this.m);
        ReviewBCACardAdapter reviewBCACardAdapter = this.f;
        reviewBCACardAdapter.b = this.d;
        reviewBCACardAdapter.a.b();
        ReviewMastercardAdapter reviewMastercardAdapter = this.l;
        reviewMastercardAdapter.e = this.g;
        reviewMastercardAdapter.a.b();
        ReviewVisaAdapter reviewVisaAdapter = this.m;
        reviewVisaAdapter.e = this.k;
        reviewVisaAdapter.a.b();
        if (this.l.c() <= 0) {
            this.llMasterCard.setVisibility(8);
            this.dvdMastercard.setVisibility(8);
        } else {
            this.llMasterCard.setVisibility(0);
            this.dvdMastercard.setVisibility(0);
        }
        if (this.m.c() <= 0) {
            this.llVisaCard.setVisibility(8);
            this.dvdVisacard.setVisibility(8);
            return;
        }
        this.llVisaCard.setVisibility(0);
        this.dvdVisacard.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveBCACardEvent(final BenefitAdapter$MyViewHolder benefitAdapter$MyViewHolder) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CreditCardOptions) Objects.requireNonNull((CreditCardOptions) CC25AFormKartuKreditFragment.this.d.where().equalTo("cardID", benefitAdapter$MyViewHolder.a).findFirst())).deleteFromRealm();
                CC25AFormKartuKreditFragment.this.f.a.b();
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveMasterCardEvent(final BenefitAdapter$MyViewHolder_ViewBinding benefitAdapter$MyViewHolder_ViewBinding) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CreditCardOptions) Objects.requireNonNull((CreditCardOptions) CC25AFormKartuKreditFragment.this.g.where().equalTo("cardID", benefitAdapter$MyViewHolder_ViewBinding.a).findFirst())).deleteFromRealm();
                CC25AFormKartuKreditFragment.this.l.a.b();
            }
        });
        if (this.l.c() <= 0) {
            this.llMasterCard.setVisibility(8);
            this.dvdMastercard.setVisibility(8);
            return;
        }
        this.llMasterCard.setVisibility(0);
        this.dvdMastercard.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeRemoveVisaCardEvent(final BidangPekerjaanAdapter$BidangPekerjaanVH bidangPekerjaanAdapter$BidangPekerjaanVH) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CreditCardOptions) Objects.requireNonNull((CreditCardOptions) CC25AFormKartuKreditFragment.this.k.where().equalTo("cardID", bidangPekerjaanAdapter$BidangPekerjaanVH.c).findFirst())).deleteFromRealm();
                CC25AFormKartuKreditFragment.this.m.a.b();
            }
        });
        if (this.m.c() <= 0) {
            this.llVisaCard.setVisibility(8);
            this.dvdVisacard.setVisibility(8);
            return;
        }
        this.llVisaCard.setVisibility(0);
        this.dvdVisacard.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeUbahBCACardEvent(ChooseSubVisaAdapter$ViewHolder chooseSubVisaAdapter$ViewHolder) {
        this.f.a.b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeUbahMasterCardEvent(CityReservationAdapter$CityReservationVH cityReservationAdapter$CityReservationVH) {
        this.l.a.b();
        if (this.l.c() <= 0) {
            this.llMasterCard.setVisibility(8);
            this.dvdMastercard.setVisibility(8);
            return;
        }
        this.llMasterCard.setVisibility(0);
        this.dvdMastercard.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeUbahVisaCardEvent(ChooseVisaAdapter$ViewHolder chooseVisaAdapter$ViewHolder) {
        this.m.a.b();
        if (this.m.c() <= 0) {
            this.llVisaCard.setVisibility(8);
            this.dvdVisacard.setVisibility(8);
            return;
        }
        this.llVisaCard.setVisibility(0);
        this.dvdVisacard.setVisibility(0);
    }

    @OnClick({2131299698})
    public void ubahBcaCard() {
        Intent intent = new Intent(getContext(), CC21UbahSubBCACardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.a));
        intent.putExtra("CREDIT_CARD_ID", this.i.getId());
        intent.putExtra("INDEX_CARD_SUPPLEMENT", 0);
        intent.putExtra("EMAIL", this.h);
        startActivity(intent);
    }

    @OnClick({2131299725})
    public void ubahMasterCard() {
        Intent intent = new Intent(getContext(), CC23UbahSubMastercardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.a));
        intent.putExtra("CREDIT_CARD_ID", this.i.getId());
        intent.putExtra("INDEX_CARD_SUPPLEMENT", 0);
        intent.putExtra("EMAIL", this.h);
        startActivity(intent);
    }

    @OnClick({2131299729})
    public void ubahVisaCard() {
        Intent intent = new Intent(getContext(), CC23UbahSubVisacardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.a));
        intent.putExtra("CREDIT_CARD_ID", this.i.getId());
        intent.putExtra("INDEX_CARD_SUPPLEMENT", 0);
        intent.putExtra("EMAIL", this.h);
        startActivity(intent);
    }
}
