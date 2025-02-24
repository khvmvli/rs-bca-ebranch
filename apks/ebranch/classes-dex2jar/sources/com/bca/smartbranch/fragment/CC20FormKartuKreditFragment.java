package com.bca.smartbranch.fragment;

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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC20FormKartuKreditFragment.class */
public class CC20FormKartuKreditFragment extends BaseFragment {
    @BindView(2131298150)
    RadioButton rbKantor;
    @BindView(2131298176)
    RadioButton rbRumah;
    @BindView(2131298183)
    RadioButton rbTidak;
    @BindView(2131298194)
    RadioButton rbYa;
    @BindView(2131298211)
    RadioGroup rgAddCC;
    @BindView(2131298214)
    RadioGroup rgDestination;

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493177;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.8
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setPreferredMailingAddress("");
                ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setFlagSubmitSupplement("");
            }
        });
        e(2131296811, new CC19FormKartuKreditFragment(), "CC19FormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void onCLickedLanjut(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        if (this.rbYa.isChecked()) {
            c(2131296811, new CC21AFormKartuKreditFragment(), "CC21AFormKartuKreditFragment");
            return;
        }
        if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() > 0) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().clear();
                }
            });
        }
        c(2131296811, new CC27FormKartuKreditFragment(), "cc27FormKartuKreditFragment");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.6
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.10
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
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
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.8
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setPreferredMailingAddress("");
                    ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setFlagSubmitSupplement("");
                }
            });
            e(2131296811, new CC19FormKartuKreditFragment(), "CC19FormKartuKreditFragment");
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
        String preferredMailingAddress = ((CC8FormKartuKreditActivity) getActivity()).n.getPreferredMailingAddress();
        preferredMailingAddress.hashCode();
        if (preferredMailingAddress.equals("Kantor")) {
            this.rbKantor.setChecked(true);
        } else if (!preferredMailingAddress.equals("Rumah")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setPreferredMailingAddress("Rumah");
                    CC20FormKartuKreditFragment.this.rbRumah.setChecked(true);
                }
            });
        } else {
            this.rbRumah.setChecked(true);
        }
        String flagSubmitSupplement = ((CC8FormKartuKreditActivity) getActivity()).n.getFlagSubmitSupplement();
        flagSubmitSupplement.hashCode();
        if (flagSubmitSupplement.equals("N")) {
            this.rbTidak.setChecked(true);
        } else if (!flagSubmitSupplement.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setFlagSubmitSupplement("N");
                    CC20FormKartuKreditFragment.this.rbTidak.setChecked(true);
                }
            });
        } else {
            this.rbYa.setChecked(true);
        }
        this.rgDestination.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                CC20FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.3.5
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        int i2 = i;
                        if (i2 == 2131298150) {
                            ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setPreferredMailingAddress("Kantor");
                        } else if (i2 == 2131298176) {
                            ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setPreferredMailingAddress("Rumah");
                        }
                    }
                });
            }
        });
        this.rgAddCC.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                CC20FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment.2.2
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        int i2 = i;
                        if (i2 == 2131298183) {
                            ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setFlagSubmitSupplement("N");
                        } else if (i2 == 2131298194) {
                            ((CC8FormKartuKreditActivity) CC20FormKartuKreditFragment.this.getActivity()).n.setFlagSubmitSupplement("Y");
                        }
                    }
                });
            }
        });
        if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Ibu Rumah Tangga") || ((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Pelajar") || ((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().equalsIgnoreCase("Pensiunan")) {
            this.rbKantor.setEnabled(false);
        }
    }
}
