package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.bca.smartbranch.activity.TransaksiTellerActivity;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.ReservasiTellerDialog;
import com.bca.smartbranch.fragment.ProsesBankTransferFragment;
import io.realm.Realm;
import io.realm.RealmList;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.subscribeReservationRescheduleEvent;
import o.ubahData;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesBankTransferFragment.class */
public class ProsesBankTransferFragment extends BaseFragment {
    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493211;
    }

    public final /* synthetic */ void e() {
        ReservasiOnline reservasiOnline = (ReservasiOnline) this.c.where(ReservasiOnline.class).equalTo("id", Long.valueOf(((ubahData) getActivity()).s)).findFirst();
        reservasiOnline.setHasDone(true);
        BankTransfer bankTransfer = ((ubahData) getActivity()).f296o;
        BankTransfer bankTransfer2 = null;
        if (bankTransfer == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer = null;
        }
        reservasiOnline.setNominalTransaksiTeller(bankTransfer.getTotalNominal());
        reservasiOnline.getPenerimaList().clear();
        RealmList<BankTransferPenerima> penerimaList = reservasiOnline.getPenerimaList();
        bankTransfer2 = ((ubahData) getActivity()).f296o;
        if (bankTransfer2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        penerimaList.addAll(bankTransfer2.getPenerimaList());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((ubahData) getActivity()).c(true);
    }

    @OnClick({2131296396})
    public void onClicedButton(View view) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.getNote
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ProsesBankTransferFragment prosesBankTransferFragment = ProsesBankTransferFragment.this;
                if (((ubahData) prosesBankTransferFragment.getActivity()).f296o != null) {
                    BankTransfer findFirst = ((ubahData) prosesBankTransferFragment.getActivity()).y.getBankTransferList().where().equalTo("id", Long.valueOf(((ubahData) prosesBankTransferFragment.getActivity()).f296o.getId())).findFirst();
                    if (findFirst != null) {
                        findFirst.deleteFromRealm();
                    }
                    ((ubahData) prosesBankTransferFragment.getActivity()).y.getBankTransferList().add(((ubahData) prosesBankTransferFragment.getActivity()).f296o);
                }
            }
        });
        ((ubahData) getActivity()).z();
        if (((ubahData) getActivity()).q) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.AccountOpeningResponse$Description$$Parcelable
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ProsesBankTransferFragment.this.e();
                }
            });
            getActivity().overridePendingTransition(2130772009, 2130772012);
            getActivity().finish();
        } else if (((ubahData) getActivity()).y.getCountAll() < 5) {
            Intent intent = new Intent(getContext(), TransaksiTellerActivity.class);
            intent.putExtra("is_multiple_transaction", true);
            startActivity(intent);
        } else {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.ProsesBankTransferFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((ubahData) ProsesBankTransferFragment.this.getActivity()).y.getBankTransferList().where().equalTo("id", Long.valueOf(((ubahData) ProsesBankTransferFragment.this.getActivity()).f296o.getId())).findFirst() == null) {
                        ((ubahData) ProsesBankTransferFragment.this.getActivity()).y.getBankTransferList().add(((ubahData) ProsesBankTransferFragment.this.getActivity()).f296o);
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
            ((ubahData) getActivity()).b(false);
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.c.close();
        documentProvider.b().e(this);
        ((ubahData) getActivity()).C().setVisibility(0);
        ((ubahData) getActivity()).B().setVisibility(0);
        onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        onResume();
        ((ubahData) getActivity()).C().setVisibility(8);
        ((ubahData) getActivity()).B().setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        documentProvider.b().c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.ProsesBankTransferFragment.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((ubahData) ProsesBankTransferFragment.this.getActivity()).f296o.setCurrentPage("ProsesBankTransferFragment");
            }
        });
        ((ubahData) getActivity()).c(false);
    }
}
