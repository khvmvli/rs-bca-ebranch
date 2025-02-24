package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bca.smartbranch.activity.TransaksiTellerActivity;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Warkat;
import com.bca.smartbranch.dialog.ReservasiTellerDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.class */
public final class BeneficiaryBankResponse$BeneficiaryBank$$Parcelable extends BaseFragmentKotlin {
    public static final read d = new read((byte) 0);
    public Map<Integer, View> a = new LinkedHashMap();
    private ListKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding e;

    /* loaded from: classes-dex2jar.jar:o/BeneficiaryBankResponse$BeneficiaryBank$$Parcelable$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public static /* synthetic */ void a(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable beneficiaryBankResponse$BeneficiaryBank$$Parcelable, Realm realm) {
        subscribeReservationRescheduleEvent.e(beneficiaryBankResponse$BeneficiaryBank$$Parcelable, "");
        subscribeReservationRescheduleEvent.e(realm, "");
        RealmResults findAll = realm.where(ListFormTeller.class).findAll();
        if (findAll != null && findAll.size() > 0) {
            RealmResults<ListFormTeller> realmResults = findAll;
            subscribeReservationRescheduleEvent.e(realmResults, "");
            ArrayList arrayList = new ArrayList(realmResults instanceof Collection ? realmResults.size() : 10);
            for (ListFormTeller listFormTeller : realmResults) {
                RealmList<Kliring> kliringList = listFormTeller.getKliringList();
                subscribeReservationRescheduleEvent.d(kliringList, "");
                RealmList<Kliring> realmList = kliringList;
                subscribeReservationRescheduleEvent.e(realmList, "");
                ArrayList arrayList2 = new ArrayList(realmList instanceof Collection ? realmList.size() : 10);
                int i = 0;
                for (Kliring kliring : realmList) {
                    if (i >= 0) {
                        Kliring kliring2 = kliring;
                        if (d(kliring2)) {
                            listFormTeller.getKliringList().remove(kliring2);
                        }
                        arrayList2.add(onCLickStatusNpwp.e);
                        i++;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                arrayList.add(arrayList2);
            }
        }
    }

    public static /* synthetic */ void b(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable beneficiaryBankResponse$BeneficiaryBank$$Parcelable, Kliring kliring, Realm realm) {
        subscribeReservationRescheduleEvent.e(beneficiaryBankResponse$BeneficiaryBank$$Parcelable, "");
        subscribeReservationRescheduleEvent.e(realm, "");
        RealmQuery where = realm.where(ReservasiOnline.class);
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.requireActivity();
        String str = null;
        ReservasiOnline reservasiOnline = (ReservasiOnline) where.equalTo("id", subscribeubahvisacardevent != null ? subscribeubahvisacardevent.k : null).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.setHasDone(true);
        }
        if (reservasiOnline != null) {
            reservasiOnline.setNominalTransaksiTeller(getPromotion.a(String.valueOf(kliring != null ? kliring.getTotalWarkat() : 0.0d)).toString());
        }
        if (reservasiOnline != null) {
            reservasiOnline.setCodeCurrencyTeller("IDR");
        }
        if (reservasiOnline != null) {
            if (kliring != null) {
                str = kliring.getNomorRekening();
            }
            reservasiOnline.setNoRekeningTeller(str);
        }
    }

    private final Kliring c(Kliring kliring, String str) {
        Kliring kliring2 = new Kliring();
        kliring2.setId(kliring.getId());
        String str2 = str;
        if (str == null) {
            str2 = kliring.getNamaPenerima();
        }
        kliring2.setNamaPenerima(str2);
        kliring2.setNomorRekening(kliring.getNomorRekening());
        kliring2.setKodeNegara(kliring.getKodeNegara());
        kliring2.setNomorHp(getPromotion.a(g(), kliring.getNomorHp()));
        kliring2.setBeritaAcara(kliring.getBeritaAcara());
        kliring2.setTanggalJatuhTempo(kliring.getTanggalJatuhTempo());
        kliring2.setTipeNasabah(kliring.getTipeNasabah());
        kliring2.setTipeNasabahId(kliring.getTipeNasabahId());
        kliring2.setSumberDana(kliring.getSumberDana());
        RealmList<Warkat> listWarkat = kliring.getListWarkat();
        if (listWarkat != null) {
            RealmList<Warkat> realmList = listWarkat;
            int i = 10;
            subscribeReservationRescheduleEvent.e(realmList, "");
            if (realmList instanceof Collection) {
                i = realmList.size();
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Warkat warkat : realmList) {
                if (i2 >= 0) {
                    Warkat warkat2 = warkat;
                    if (warkat2 != null) {
                        Warkat warkat3 = new Warkat();
                        warkat3.setId(warkat2.getId());
                        warkat3.setNomorWarkat(warkat2.getNomorWarkat());
                        warkat3.setNamaBank(warkat2.getNamaBank());
                        warkat3.setKodeBank(warkat2.getKodeBank());
                        warkat3.setLocalClearingCodeBank(warkat2.getLocalClearingCodeBank());
                        warkat3.setJenisWarkat(warkat2.getJenisWarkat());
                        warkat3.setKodeJenisWarkat(warkat2.getKodeJenisWarkat());
                        warkat3.setNominal(warkat2.getNominal());
                        warkat3.setJatuhTempo(warkat2.getJatuhTempo());
                        RealmList<Warkat> listWarkat2 = kliring2.getListWarkat();
                        if (listWarkat2 != null) {
                            listWarkat2.add(warkat3);
                        }
                    }
                    arrayList.add(onCLickStatusNpwp.e);
                    i2++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
        kliring2.setTotalWarkat(kliring.getTotalWarkat());
        kliring2.setTujuanTransaksi(kliring.getTujuanTransaksi());
        kliring2.setTujuanTransaksiCode(kliring.getTujuanTransaksiCode());
        kliring2.setSumberDanaCode(kliring.getSumberDanaCode());
        kliring2.setAccType(kliring.getAccType());
        kliring2.setSaranaPembayaranPengirim(kliring.getSaranaPembayaranPengirim());
        kliring2.setCreatedAt(kliring.getCreatedAt());
        kliring2.setCurrentPage(kliring.getCurrentPage());
        kliring2.setSequenceId(((Number) ((subscribeUbahVisaCardEvent) requireActivity()).w.d()).intValue());
        return kliring2;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void c(o.BeneficiaryBankResponse$BeneficiaryBank$$Parcelable r5, com.bca.smartbranch.data.localdb.Kliring r6, io.realm.Realm r7) {
        /*
        // Method dump skipped, instructions count: 891
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.c(o.BeneficiaryBankResponse$BeneficiaryBank$$Parcelable, com.bca.smartbranch.data.localdb.Kliring, io.realm.Realm):void");
    }

    public static /* synthetic */ void d(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable beneficiaryBankResponse$BeneficiaryBank$$Parcelable, View view) {
        subscribeReservationRescheduleEvent.e(beneficiaryBankResponse$BeneficiaryBank$$Parcelable, "");
        boolean z = true;
        ((subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.requireActivity()).t = true;
        ((subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.requireActivity()).r();
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.requireActivity();
        if (subscribeubahvisacardevent == null || !subscribeubahvisacardevent.p) {
            z = false;
        }
        if (z) {
            Kliring kliring = ((subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.requireActivity()).m;
            beneficiaryBankResponse$BeneficiaryBank$$Parcelable.i().executeTransaction(new Realm.Transaction(kliring) { // from class: o.getBranchAddress
                public final /* synthetic */ Kliring a;

                {
                    this.a = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.b(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.this, this.a, realm);
                }
            });
            beneficiaryBankResponse$BeneficiaryBank$$Parcelable.i().executeTransaction(new Realm.Transaction(kliring) { // from class: o.setCountryName
                public final /* synthetic */ Kliring d;

                {
                    this.d = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.c(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.this, this.d, realm);
                }
            });
            setOnHierarchyChangeListener.a((Activity) ((subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.requireActivity()));
            return;
        }
        beneficiaryBankResponse$BeneficiaryBank$$Parcelable.i().executeTransaction(new Realm.Transaction() { // from class: o.setNatidCode
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.e(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.this, realm);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x02cc, code lost:
        if ((r0 == null || r0.length() == 0) != false) goto L_0x02cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean d(com.bca.smartbranch.data.localdb.Kliring r5) {
        /*
        // Method dump skipped, instructions count: 723
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.d(com.bca.smartbranch.data.localdb.Kliring):boolean");
    }

    public static /* synthetic */ void e(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable beneficiaryBankResponse$BeneficiaryBank$$Parcelable, Realm realm) {
        RealmList<Kliring> kliringList;
        RealmList<Kliring> kliringList2;
        subscribeReservationRescheduleEvent.e(beneficiaryBankResponse$BeneficiaryBank$$Parcelable, "");
        subscribeReservationRescheduleEvent.e(realm, "");
        ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        Kliring kliring = null;
        if (listFormTeller == null || listFormTeller.getCountAll() >= 4) {
            subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.getActivity();
            if (!d(subscribeubahvisacardevent != null ? subscribeubahvisacardevent.m : null)) {
                subscribeReservationRescheduleEvent.c(listFormTeller);
                RealmQuery<Kliring> where = listFormTeller.getKliringList().where();
                subscribeUbahVisaCardEvent subscribeubahvisacardevent2 = (subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.getActivity();
                subscribeReservationRescheduleEvent.c(subscribeubahvisacardevent2);
                Kliring kliring2 = subscribeubahvisacardevent2.m;
                if (where.equalTo("id", kliring2 != null ? Long.valueOf(kliring2.getId()) : null).findFirst() == null && (kliringList = listFormTeller.getKliringList()) != null) {
                    subscribeUbahVisaCardEvent subscribeubahvisacardevent3 = (subscribeUbahVisaCardEvent) beneficiaryBankResponse$BeneficiaryBank$$Parcelable.getActivity();
                    if (subscribeubahvisacardevent3 != null) {
                        kliring = subscribeubahvisacardevent3.m;
                    }
                    kliringList.add(kliring);
                }
                getView activity = beneficiaryBankResponse$BeneficiaryBank$$Parcelable.getActivity();
                if (activity != null) {
                    subscribeUbahVisaCardEvent subscribeubahvisacardevent4 = (subscribeUbahVisaCardEvent) activity;
                    Bundle bundle = new Bundle();
                    bundle.putString("product", "Transaksi Teller");
                    ReservasiTellerDialog reservasiTellerDialog = new ReservasiTellerDialog(true);
                    reservasiTellerDialog.setArguments(bundle);
                    reservasiTellerDialog.show(subscribeubahvisacardevent4.l(), "ReservasiTellerDialog");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
            return;
        }
        getView activity2 = beneficiaryBankResponse$BeneficiaryBank$$Parcelable.getActivity();
        if (activity2 != null) {
            Kliring kliring3 = ((subscribeUbahVisaCardEvent) activity2).m;
            if (!d(kliring3)) {
                if (!(kliring3 == null || (kliringList2 = listFormTeller.getKliringList()) == null)) {
                    kliringList2.add(beneficiaryBankResponse$BeneficiaryBank$$Parcelable.c(kliring3, null));
                }
                Intent intent = new Intent(beneficiaryBankResponse$BeneficiaryBank$$Parcelable.getContext(), TransaksiTellerActivity.class);
                intent.putExtra("is_multiple_transaction", true);
                beneficiaryBankResponse$BeneficiaryBank$$Parcelable.startActivity(intent);
                beneficiaryBankResponse$BeneficiaryBank$$Parcelable.requireActivity().finishAffinity();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.a.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493270, viewGroup, false);
        int i = 2131296415;
        Button button = (Button) setRotation.a(inflate, 2131296415);
        if (button != null) {
            setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) setRotation.a(inflate, 2131297328);
            if (setdropdownhorizontaloffset != null) {
                TextView textView = (TextView) setRotation.a(inflate, 2131297506);
                if (textView != null) {
                    ListKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding listKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding = new ListKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding((setMaxHeight) inflate, button, setdropdownhorizontaloffset, textView);
                    this.e = listKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding;
                    subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding);
                    setMaxHeight setmaxheight = listKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding.a;
                    subscribeReservationRescheduleEvent.d(setmaxheight, "");
                    return setmaxheight;
                }
                i = 2131297506;
            } else {
                i = 2131297328;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
        this.a.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        ListKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding listKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding = this.e;
        subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding);
        listKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding.e.setOnClickListener(new View.OnClickListener() { // from class: o.getBranchName
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.d(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.this, view2);
            }
        });
        i().executeTransaction(new Realm.Transaction() { // from class: o.getBranchCode
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.a(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.this, realm);
            }
        });
    }
}
