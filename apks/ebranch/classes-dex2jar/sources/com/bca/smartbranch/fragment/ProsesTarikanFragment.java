package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import butterknife.OnClick;
import com.bca.smartbranch.activity.TarikanTransaksiActivity;
import com.bca.smartbranch.activity.TransaksiTellerActivity;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.dialog.ReservasiTellerDialog;
import com.bca.smartbranch.fragment.ProsesTarikanFragment;
import com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment;
import io.realm.Realm;
import o.ListUtil;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesTarikanFragment.class */
public class ProsesTarikanFragment extends BaseFragment {
    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493214;
    }

    public final /* synthetic */ void d() {
        ReservasiOnline reservasiOnline = (ReservasiOnline) this.c.where(ReservasiOnline.class).equalTo("id", Long.valueOf(((TarikanTransaksiActivity) getActivity()).n)).findFirst();
        reservasiOnline.setHasDone(true);
        reservasiOnline.setNoRekeningTeller(((TarikanTransaksiActivity) getActivity()).f.getNoRekening());
        reservasiOnline.setNominalTransaksiTeller(((TarikanTransaksiActivity) getActivity()).f.getJumlah());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
    }

    @OnClick({2131296396})
    public void onClicedButton(View view) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.setDescriptionList
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ProsesTarikanFragment prosesTarikanFragment = ProsesTarikanFragment.this;
                if (((TarikanTransaksiActivity) prosesTarikanFragment.getActivity()).f != null) {
                    Tarikan findFirst = ((TarikanTransaksiActivity) prosesTarikanFragment.getActivity()).w.getTarikanList().where().equalTo("id", Long.valueOf(((TarikanTransaksiActivity) prosesTarikanFragment.getActivity()).f.getId())).findFirst();
                    if (findFirst != null) {
                        findFirst.deleteFromRealm();
                    }
                    ((TarikanTransaksiActivity) prosesTarikanFragment.getActivity()).w.getTarikanList().add(((TarikanTransaksiActivity) prosesTarikanFragment.getActivity()).f);
                }
            }
        });
        ((TarikanTransaksiActivity) getActivity()).t();
        if (((TarikanTransaksiActivity) getActivity()).p) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.BeneficiaryBankResponse

                /* loaded from: classes-dex2jar.jar:o/BeneficiaryBankResponse$BeneficiaryBank.class */
                public final /* synthetic */ class BeneficiaryBank implements Runnable {
                    public final /* synthetic */ ReviewSetoranReservasiUbahFragment e;

                    public /* synthetic */ BeneficiaryBank(ReviewSetoranReservasiUbahFragment reviewSetoranReservasiUbahFragment) {
                        this.e = reviewSetoranReservasiUbahFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ReviewSetoranReservasiUbahFragment reviewSetoranReservasiUbahFragment = this.e;
                        EditText editText = null;
                        for (int size = reviewSetoranReservasiUbahFragment.viewGroupPenerima.size() - 1; size >= 0; size--) {
                            editText = editText;
                            if (reviewSetoranReservasiUbahFragment.viewGroupPenerima.get(size).getVisibility() == 0) {
                                editText = editText;
                                if (reviewSetoranReservasiUbahFragment.viewGroupPenerima.get(size).isFocusable()) {
                                    editText = editText;
                                    if (reviewSetoranReservasiUbahFragment.viewGroupPenerima.get(size).isEnabled()) {
                                        editText = (EditText) reviewSetoranReservasiUbahFragment.viewGroupPenerima.get(size);
                                    }
                                }
                            }
                        }
                        if (editText != null) {
                            editText.requestFocus();
                        }
                    }
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ProsesTarikanFragment.this.d();
                }
            });
            getActivity().overridePendingTransition(2130772009, 2130772012);
            getActivity().finish();
        } else if (((TarikanTransaksiActivity) getActivity()).w.getCountAll() < 5) {
            Intent intent = new Intent(getContext(), TransaksiTellerActivity.class);
            intent.putExtra("is_multiple_transaction", true);
            if (((TarikanTransaksiActivity) getActivity()).r != null) {
                intent.putExtra("dataReservasi", ListUtil.OneItemImmutableList.e(((TarikanTransaksiActivity) getActivity()).r));
            }
            startActivity(intent);
        } else {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.ProsesTarikanFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((TarikanTransaksiActivity) ProsesTarikanFragment.this.getActivity()).w.getTarikanList().where().equalTo("id", Long.valueOf(((TarikanTransaksiActivity) ProsesTarikanFragment.this.getActivity()).f.getId())).findFirst() == null) {
                        ((TarikanTransaksiActivity) ProsesTarikanFragment.this.getActivity()).w.getTarikanList().add(((TarikanTransaksiActivity) ProsesTarikanFragment.this.getActivity()).f);
                    }
                }
            });
            if (this.e != null) {
                Bundle bundle = new Bundle();
                bundle.putString("product", "Transaksi Teller");
                ReservasiTellerDialog reservasiTellerDialog = new ReservasiTellerDialog();
                reservasiTellerDialog.setArguments(bundle);
                reservasiTellerDialog.show(getFragmentManager(), "ReservasiTellerDialog");
                return;
            }
            ((TarikanTransaksiActivity) getActivity()).a(false);
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.c.close();
        documentProvider.b().e(this);
        ((TarikanTransaksiActivity) getActivity()).toolbar.setVisibility(0);
        ((TarikanTransaksiActivity) getActivity()).llMainIndicator.setVisibility(0);
        onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        onResume();
        ((TarikanTransaksiActivity) getActivity()).toolbar.setVisibility(8);
        ((TarikanTransaksiActivity) getActivity()).llMainIndicator.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        documentProvider.b().c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        documentProvider.b().e(this);
        onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.ProsesTarikanFragment.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((TarikanTransaksiActivity) ProsesTarikanFragment.this.getActivity()).f.setCurrentPage("ProsesTarikanFragment");
            }
        });
    }
}
