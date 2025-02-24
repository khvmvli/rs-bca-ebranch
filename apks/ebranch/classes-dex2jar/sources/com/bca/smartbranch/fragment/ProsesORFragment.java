package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import butterknife.OnClick;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.activity.TransaksiTellerActivity;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.ReservasiTellerDialog;
import com.bca.smartbranch.fragment.ProsesORFragment;
import com.bca.smartbranch.fragment.ReviewSetoranFragment;
import io.realm.Realm;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesORFragment.class */
public class ProsesORFragment extends BaseFragment {
    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493212;
    }

    public final /* synthetic */ void d() {
        ReservasiOnline reservasiOnline = (ReservasiOnline) this.c.where(ReservasiOnline.class).equalTo("id", Long.valueOf(((OutwardRemittanceFormActivity) getActivity()).t)).findFirst();
        reservasiOnline.setHasDone(true);
        reservasiOnline.setNoRekeningTeller(((OutwardRemittanceFormActivity) getActivity()).n.getNorekPenerima());
        reservasiOnline.setNominalTransaksiTeller(((OutwardRemittanceFormActivity) getActivity()).n.getNominalTransaksi());
        reservasiOnline.setCodeCurrencyTeller(((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3));
        reservasiOnline.setDescTransaksi(((OutwardRemittanceFormActivity) getActivity()).n.getTypeOfProduct());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        ((OutwardRemittanceFormActivity) getActivity()).e(true);
    }

    @OnClick({2131296396})
    public void onClicedButton(View view) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.getDescriptionList
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ProsesORFragment prosesORFragment = ProsesORFragment.this;
                if (((OutwardRemittanceFormActivity) prosesORFragment.getActivity()).n != null) {
                    KirimanUang findFirst = ((OutwardRemittanceFormActivity) prosesORFragment.getActivity()).u.getKirimanUangList().where().equalTo("id", Long.valueOf(((OutwardRemittanceFormActivity) prosesORFragment.getActivity()).n.getId())).findFirst();
                    if (findFirst != null) {
                        findFirst.deleteFromRealm();
                    }
                    ((OutwardRemittanceFormActivity) prosesORFragment.getActivity()).u.getKirimanUangList().add(((OutwardRemittanceFormActivity) prosesORFragment.getActivity()).n);
                }
            }
        });
        ((OutwardRemittanceFormActivity) getActivity()).t();
        if (((OutwardRemittanceFormActivity) getActivity()).s) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.ActivateEChannelResponse

                /* loaded from: classes-dex2jar.jar:o/ActivateEChannelResponse$Description.class */
                public final /* synthetic */ class Description implements Runnable {
                    public final /* synthetic */ ReviewSetoranFragment a;

                    public /* synthetic */ Description(ReviewSetoranFragment reviewSetoranFragment) {
                        this.a = reviewSetoranFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ReviewSetoranFragment reviewSetoranFragment = this.a;
                        EditText editText = null;
                        for (int size = reviewSetoranFragment.viewGroupOrangDatangKeCabang.size() - 1; size >= 0; size--) {
                            editText = editText;
                            if (reviewSetoranFragment.viewGroupPengirim.get(size).getVisibility() == 0) {
                                editText = editText;
                                if (reviewSetoranFragment.viewGroupOrangDatangKeCabang.get(size).isFocusable()) {
                                    editText = editText;
                                    if (reviewSetoranFragment.viewGroupOrangDatangKeCabang.get(size).isEnabled()) {
                                        editText = (EditText) reviewSetoranFragment.viewGroupOrangDatangKeCabang.get(size);
                                    }
                                }
                            }
                        }
                        if (editText != null) {
                            editText.requestFocus();
                        }
                    }
                }

                /* loaded from: classes-dex2jar.jar:o/ActivateEChannelResponse$TxnDataOutput.class */
                public final /* synthetic */ class TxnDataOutput implements Runnable {
                    public final /* synthetic */ ReviewSetoranFragment d;

                    public /* synthetic */ TxnDataOutput(ReviewSetoranFragment reviewSetoranFragment) {
                        this.d = reviewSetoranFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ReviewSetoranFragment reviewSetoranFragment = this.d;
                        EditText editText = null;
                        for (int size = reviewSetoranFragment.viewGroupTransaksiBerkala.size() - 1; size >= 0; size--) {
                            editText = editText;
                            if (reviewSetoranFragment.viewGroupTransaksiBerkala.get(size).getVisibility() == 0) {
                                editText = editText;
                                if (reviewSetoranFragment.viewGroupTransaksiBerkala.get(size).isFocusable()) {
                                    editText = editText;
                                    if (reviewSetoranFragment.viewGroupTransaksiBerkala.get(size).isEnabled()) {
                                        editText = (EditText) reviewSetoranFragment.viewGroupTransaksiBerkala.get(size);
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
                    ProsesORFragment.this.d();
                }
            });
            getActivity().overridePendingTransition(2130772009, 2130772012);
            getActivity().finish();
        } else if (((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() < 5) {
            Intent intent = new Intent(getContext(), TransaksiTellerActivity.class);
            intent.putExtra("is_multiple_transaction", true);
            startActivity(intent);
        } else {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.ProsesORFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((OutwardRemittanceFormActivity) ProsesORFragment.this.getActivity()).u.getKirimanUangList().where().equalTo("id", Long.valueOf(((OutwardRemittanceFormActivity) ProsesORFragment.this.getActivity()).n.getId())).findFirst() == null) {
                        ((OutwardRemittanceFormActivity) ProsesORFragment.this.getActivity()).u.getKirimanUangList().add(((OutwardRemittanceFormActivity) ProsesORFragment.this.getActivity()).n);
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
            ((OutwardRemittanceFormActivity) getActivity()).d(false);
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.c.close();
        documentProvider.b().e(this);
        onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        ((OutwardRemittanceFormActivity) getActivity()).rlToolbar.setVisibility(8);
        ((OutwardRemittanceFormActivity) getActivity()).llMainIndicator.setVisibility(8);
        ((OutwardRemittanceFormActivity) getActivity()).e(false);
    }
}
