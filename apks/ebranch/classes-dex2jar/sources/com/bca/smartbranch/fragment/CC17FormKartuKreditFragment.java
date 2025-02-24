package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC17FormKartuKreditFragment.class */
public class CC17FormKartuKreditFragment extends BaseFragment {
    @BindView(2131298183)
    RadioButton rbTidak;
    @BindView(2131298194)
    RadioButton rbYa;
    @BindView(2131298227)
    RadioGroup rgPenambahanFasilitas;

    private void d() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493174;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC17FormKartuKreditFragment.this.getActivity()).n.setFlagAgreeLifeInsurance("");
            }
        });
        e(2131296811, new CC16FormKartuKreditFragment(), "CC16FormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        c(2131296811, new CC18FormKartuKreditFragment(), "CC18FormKartuKreditFragment");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC17FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            d();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC17FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            d();
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
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC17FormKartuKreditFragment.this.getActivity()).n.setFlagAgreeLifeInsurance("");
                }
            });
            e(2131296811, new CC16FormKartuKreditFragment(), "CC16FormKartuKreditFragment");
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
        String flagAgreeLifeInsurance = ((CC8FormKartuKreditActivity) getActivity()).n.getFlagAgreeLifeInsurance();
        flagAgreeLifeInsurance.hashCode();
        if (flagAgreeLifeInsurance.equals("N")) {
            this.rbTidak.setChecked(true);
        } else if (!flagAgreeLifeInsurance.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC17FormKartuKreditFragment.this.getActivity()).n.setFlagAgreeLifeInsurance("Y");
                }
            });
        } else {
            this.rbYa.setChecked(true);
        }
        this.rgPenambahanFasilitas.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment.4
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                CC17FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment.4.1
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        int i2 = i;
                        if (i2 == 2131298183) {
                            ((CC8FormKartuKreditActivity) CC17FormKartuKreditFragment.this.getActivity()).n.setFlagAgreeLifeInsurance("N");
                        } else if (i2 == 2131298194) {
                            ((CC8FormKartuKreditActivity) CC17FormKartuKreditFragment.this.getActivity()).n.setFlagAgreeLifeInsurance("Y");
                        }
                    }
                });
            }
        });
    }
}
