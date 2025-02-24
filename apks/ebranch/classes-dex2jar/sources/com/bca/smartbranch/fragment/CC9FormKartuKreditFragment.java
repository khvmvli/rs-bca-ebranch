package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import io.realm.Realm;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
import o.setRepresentativeRelationship;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC9FormKartuKreditFragment.class */
public class CC9FormKartuKreditFragment extends BaseFragment {
    @BindView(2131296842)
    setSplitTrack cvKtp;
    @BindView(2131296847)
    setSplitTrack cvPaspor;

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493184;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new setRepresentativeRelationship(this));
        setOnHierarchyChangeListener.a((Activity) getActivity());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC9FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC9FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC9FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC9FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
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
        this.c.close();
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new setRepresentativeRelationship(this));
            setOnHierarchyChangeListener.a((Activity) getActivity());
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
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("KTP")) {
            this.cvKtp.setForeground(getResources().getDrawable(2131230841));
            this.cvPaspor.setForeground(getResources().getDrawable(2131230842));
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("Paspor")) {
            this.cvKtp.setForeground(getResources().getDrawable(2131230842));
            this.cvPaspor.setForeground(getResources().getDrawable(2131230841));
        }
    }

    @OnClick({2131297753})
    public void showKtpPage(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        this.cvKtp.setForeground(getResources().getDrawable(2131230841));
        this.cvPaspor.setForeground(getResources().getDrawable(2131230842));
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC9FormKartuKreditFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC9FormKartuKreditFragment.this.getActivity()).n.setIdentityCardType("KTP");
            }
        });
        c(2131296811, new CC10KTPFormKartuKreditFragment(), "CC10KTPFormKartuKreditFragment");
    }

    @OnClick({2131297840})
    public void showPasporPage(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        this.cvKtp.setForeground(getResources().getDrawable(2131230842));
        this.cvPaspor.setForeground(getResources().getDrawable(2131230841));
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC9FormKartuKreditFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC9FormKartuKreditFragment.this.getActivity()).n.setIdentityCardType("Paspor");
            }
        });
        c(2131296811, new CC10PasporFormKartuKreditFragment(), "CC10PasporFormKartuKreditFragment");
    }
}
