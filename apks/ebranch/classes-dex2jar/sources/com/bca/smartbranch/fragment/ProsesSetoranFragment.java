package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.activity.TransaksiTellerActivity;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.dialog.ReservasiTellerDialog;
import com.bca.smartbranch.fragment.ProsesSetoranFragment;
import io.realm.Realm;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickJenisIdentitasPemilikSumberDana;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.onClickUbahDataOrangDatangKeCabang;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesSetoranFragment.class */
public class ProsesSetoranFragment extends BaseFragment {
    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493213;
    }

    public final /* synthetic */ void d() {
        ReservasiOnline reservasiOnline = (ReservasiOnline) this.c.where(ReservasiOnline.class).equalTo("id", Long.valueOf(((FormTellerActivity) getActivity()).r)).findFirst();
        reservasiOnline.setHasDone(true);
        reservasiOnline.setNoRekeningTeller(((FormTellerActivity) getActivity()).f.getReceiverAccount());
        reservasiOnline.setNominalTransaksiTeller(((FormTellerActivity) getActivity()).f.getTxnAmount());
        reservasiOnline.setReceiverNameTeller(((FormTellerActivity) getActivity()).f.getReceiverName());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
    }

    @OnClick({2131296396})
    public void onClicedButton(View view) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.AccountOpeningResponse$TxnDataOutput$$Parcelable
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ProsesSetoranFragment prosesSetoranFragment = ProsesSetoranFragment.this;
                if (((FormTellerActivity) prosesSetoranFragment.getActivity()).f != null) {
                    Setoran findFirst = ((FormTellerActivity) prosesSetoranFragment.getActivity()).v.getSetoranList().where().equalTo("id", Long.valueOf(((FormTellerActivity) prosesSetoranFragment.getActivity()).f.getId())).findFirst();
                    if (findFirst != null) {
                        findFirst.deleteFromRealm();
                    }
                    ((FormTellerActivity) prosesSetoranFragment.getActivity()).v.getSetoranList().add(((FormTellerActivity) prosesSetoranFragment.getActivity()).f);
                }
            }
        });
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        if (((FormTellerActivity) getActivity()).t) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.setNote
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ProsesSetoranFragment.this.d();
                }
            });
            getActivity().overridePendingTransition(2130772009, 2130772012);
            documentProvider.b().d(new clickJenisIdentitasPemilikSumberDana());
            getActivity().finish();
        } else if (((FormTellerActivity) getActivity()).v.getCountAll() < 5) {
            Intent intent = new Intent(getContext(), TransaksiTellerActivity.class);
            intent.putExtra("is_multiple_transaction", true);
            startActivity(intent);
        } else {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.ActivateEChannelResponse$$Parcelable
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ProsesSetoranFragment prosesSetoranFragment = ProsesSetoranFragment.this;
                    if (((FormTellerActivity) prosesSetoranFragment.getActivity()).f != null && ((FormTellerActivity) prosesSetoranFragment.getActivity()).v.getSetoranList().where().equalTo("id", Long.valueOf(((FormTellerActivity) prosesSetoranFragment.getActivity()).f.getId())).findFirst() == null) {
                        ((FormTellerActivity) prosesSetoranFragment.getActivity()).v.getSetoranList().add(((FormTellerActivity) prosesSetoranFragment.getActivity()).f);
                    }
                }
            });
            if (this.e != null) {
                Bundle bundle = new Bundle();
                bundle.putString("product", "Transaksi Teller");
                ReservasiTellerDialog reservasiTellerDialog = new ReservasiTellerDialog();
                reservasiTellerDialog.setArguments(bundle);
                reservasiTellerDialog.show(getFragmentManager(), "ReservasiTellerDialog");
            } else if (((FormTellerActivity) getActivity()).v.getCountAll() > 0) {
                ((FormTellerActivity) getActivity()).a(false);
            }
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.c.close();
        onDestroyView();
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
        ((FormTellerActivity) getActivity()).rlToolbar.setVisibility(8);
        ((FormTellerActivity) getActivity()).llMainIndicator.setVisibility(8);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.ProsesSetoranFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormTellerActivity) ProsesSetoranFragment.this.getActivity()).f.setCurrentPage("ProsesSetoranFragment");
            }
        });
    }
}
