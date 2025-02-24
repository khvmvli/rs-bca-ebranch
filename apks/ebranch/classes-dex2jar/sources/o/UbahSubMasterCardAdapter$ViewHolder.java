package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.bca.smartbranch.presenter.CategoriesKUPresenter;
import com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.RealmList;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.PecahanUangAdapter$PecahanUangVH;
import o.UbahMasterCardAdapter$ViewHolder_ViewBinding;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:o/UbahSubMasterCardAdapter$ViewHolder.class */
public final class UbahSubMasterCardAdapter$ViewHolder extends BaseFragmentKotlin implements CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    public DetailTundaEChannelNotificationActivity a;
    public RealmList<BankTransferPenerima> b;
    public Map<Integer, View> c = new LinkedHashMap();
    private ListBidangUsahaAdapter$ListBidangUsahaVH g;
    private final onChooseValueSumberPenghasilan h;
    public static final write e = new write((byte) 0);
    private static final String d = "BankTransferInputDataPenerima";

    /* loaded from: classes-dex2jar.jar:o/UbahSubMasterCardAdapter$ViewHolder$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<CategoriesKUPresenter> {
        public static final IconCompatParcelizer c = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ CategoriesKUPresenter invoke() {
            return new CategoriesKUPresenter();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/UbahSubMasterCardAdapter$ViewHolder$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public UbahSubMasterCardAdapter$ViewHolder() {
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.c;
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        this.h = new Page6KLFragment_ViewBinding(iconCompatParcelizer, null, 2);
    }

    private BankTransfer a() {
        getView activity = getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer != null) {
                return bankTransfer;
            }
            subscribeReservationRescheduleEvent.e("");
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    public static /* synthetic */ void a(UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(ubahSubMasterCardAdapter$ViewHolder, "");
        ubahSubMasterCardAdapter$ViewHolder.n();
    }

    public static /* synthetic */ void b(UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(ubahSubMasterCardAdapter$ViewHolder, "");
        ubahSubMasterCardAdapter$ViewHolder.n();
    }

    private boolean b() {
        getView activity = getActivity();
        if (activity != null) {
            ListFormTeller listFormTeller = ((ubahData) activity).y;
            RealmList<BankTransfer> bankTransferList = listFormTeller != null ? listFormTeller.getBankTransferList() : null;
            if (bankTransferList == null) {
                return false;
            }
            int size = bankTransferList.size();
            for (int i = 0; i < size; i++) {
                BankTransfer bankTransfer = bankTransferList.get(i);
                if (bankTransfer != null && bankTransfer.isHasManyPenerima()) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    private final int c() {
        getView activity = getActivity();
        if (activity != null) {
            ListFormTeller listFormTeller = ((ubahData) activity).y;
            RealmList<BankTransfer> bankTransferList = listFormTeller != null ? listFormTeller.getBankTransferList() : null;
            getView activity2 = getActivity();
            if (activity2 != null) {
                ListFormTeller listFormTeller2 = ((ubahData) activity2).y;
                subscribeReservationRescheduleEvent.c(listFormTeller2);
                int size = listFormTeller2.getSetoranList().size();
                getView activity3 = getActivity();
                if (activity3 != null) {
                    ListFormTeller listFormTeller3 = ((ubahData) activity3).y;
                    subscribeReservationRescheduleEvent.c(listFormTeller3);
                    int size2 = listFormTeller3.getTarikanList().size();
                    getView activity4 = getActivity();
                    if (activity4 != null) {
                        ListFormTeller listFormTeller4 = ((ubahData) activity4).y;
                        subscribeReservationRescheduleEvent.c(listFormTeller4);
                        int size3 = listFormTeller4.getKirimanUangList().size();
                        getView activity5 = getActivity();
                        if (activity5 != null) {
                            ListFormTeller listFormTeller5 = ((ubahData) activity5).y;
                            subscribeReservationRescheduleEvent.c(listFormTeller5);
                            int size4 = listFormTeller5.getKliringList().size();
                            int i = 0;
                            if (bankTransferList != null) {
                                int size5 = bankTransferList.size();
                                i = 0;
                                for (int i2 = 0; i2 < size5; i2++) {
                                    BankTransfer bankTransfer = bankTransferList.get(i2);
                                    i = i;
                                    if (bankTransfer != null) {
                                        i += bankTransfer.getPenerimaList().size();
                                    }
                                }
                            }
                            return size + size2 + size3 + size4 + i;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    public static /* synthetic */ void c(UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(ubahSubMasterCardAdapter$ViewHolder, "");
        getView activity = ubahSubMasterCardAdapter$ViewHolder.getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            BankTransfer bankTransfer2 = null;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            RealmList<BankTransferPenerima> realmList = ubahSubMasterCardAdapter$ViewHolder.b;
            if (realmList == null) {
                subscribeReservationRescheduleEvent.e("");
                realmList = null;
            }
            int i = 0;
            boolean z = true;
            if (realmList.size() <= 1) {
                z = false;
            }
            bankTransfer.setHasManyPenerima(z);
            BigDecimal bigDecimal = new BigDecimal(0.0d);
            BigDecimal bigDecimal2 = new BigDecimal(0.0d);
            RealmList<BankTransferPenerima> realmList2 = ubahSubMasterCardAdapter$ViewHolder.b;
            if (realmList2 == null) {
                subscribeReservationRescheduleEvent.e("");
                realmList2 = null;
            }
            int size = realmList2.size();
            while (i < size) {
                RealmList<BankTransferPenerima> realmList3 = ubahSubMasterCardAdapter$ViewHolder.b;
                if (realmList3 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    realmList3 = null;
                }
                BankTransferPenerima bankTransferPenerima = realmList3.get(i);
                subscribeReservationRescheduleEvent.c(bankTransferPenerima);
                String nominalPenerima = bankTransferPenerima.getNominalPenerima();
                subscribeReservationRescheduleEvent.d(nominalPenerima, "");
                BigDecimal valueOf = BigDecimal.valueOf(Double.parseDouble(nominalPenerima));
                subscribeReservationRescheduleEvent.d(valueOf, "");
                BigDecimal add = bigDecimal.add(valueOf);
                subscribeReservationRescheduleEvent.d(add, "");
                getView activity2 = ubahSubMasterCardAdapter$ViewHolder.getActivity();
                if (activity2 != null) {
                    BankTransfer bankTransfer3 = ((ubahData) activity2).f296o;
                    if (bankTransfer3 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer3 = null;
                    }
                    BankTransferPenerima bankTransferPenerima2 = bankTransfer3.getPenerimaList().get(i);
                    subscribeReservationRescheduleEvent.c(bankTransferPenerima2);
                    String biayaTransfer = bankTransferPenerima2.getBiayaTransfer();
                    subscribeReservationRescheduleEvent.d(biayaTransfer, "");
                    bigDecimal2 = bigDecimal2.add(new BigDecimal(Double.parseDouble(biayaTransfer)));
                    subscribeReservationRescheduleEvent.d(bigDecimal2, "");
                    i++;
                    bigDecimal = add;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
                }
            }
            if (bigDecimal.add(bigDecimal2).compareTo(BigDecimal.valueOf(100000000L)) > 0) {
                CategoriesKUPresenter categoriesKUPresenter = (CategoriesKUPresenter) ubahSubMasterCardAdapter$ViewHolder.h.d();
                User g = ubahSubMasterCardAdapter$ViewHolder.g();
                getView activity3 = ubahSubMasterCardAdapter$ViewHolder.getActivity();
                if (activity3 != null) {
                    bankTransfer2 = ((ubahData) activity3).f296o;
                    if (bankTransfer2 == null) {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    String tipeNasabahPengirim = bankTransfer2.getTipeNasabahPengirim();
                    subscribeReservationRescheduleEvent.d(tipeNasabahPengirim, "");
                    categoriesKUPresenter.a(g, tipeNasabahPengirim);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
            }
            ubahSubMasterCardAdapter$ViewHolder.f();
            getView activity4 = ubahSubMasterCardAdapter$ViewHolder.getActivity();
            if (activity4 != null) {
                ((ubahData) activity4).z();
                UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding = new UbahMasterCardAdapter$ViewHolder_ViewBinding();
                UbahMasterCardAdapter$ViewHolder_ViewBinding.write write2 = UbahMasterCardAdapter$ViewHolder_ViewBinding.e;
                ubahSubMasterCardAdapter$ViewHolder.e(2131296811, ubahMasterCardAdapter$ViewHolder_ViewBinding, UbahMasterCardAdapter$ViewHolder_ViewBinding.g);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    public static final /* synthetic */ String d() {
        return d;
    }

    public static /* synthetic */ void d(UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(ubahSubMasterCardAdapter$ViewHolder, "");
        PecahanUangAdapter$PecahanUangVH pecahanUangAdapter$PecahanUangVH = new PecahanUangAdapter$PecahanUangVH();
        isDetached parentFragmentManager = ubahSubMasterCardAdapter$ViewHolder.getParentFragmentManager();
        PecahanUangAdapter$PecahanUangVH.read read = PecahanUangAdapter$PecahanUangVH.c;
        pecahanUangAdapter$PecahanUangVH.show(parentFragmentManager, PecahanUangAdapter$PecahanUangVH.b);
    }

    public static /* synthetic */ void e(UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(ubahSubMasterCardAdapter$ViewHolder, "");
        PecahanUangAdapter$PecahanUangVH pecahanUangAdapter$PecahanUangVH = new PecahanUangAdapter$PecahanUangVH();
        isDetached parentFragmentManager = ubahSubMasterCardAdapter$ViewHolder.getParentFragmentManager();
        PecahanUangAdapter$PecahanUangVH.read read = PecahanUangAdapter$PecahanUangVH.c;
        pecahanUangAdapter$PecahanUangVH.show(parentFragmentManager, PecahanUangAdapter$PecahanUangVH.b);
    }

    private boolean j() {
        if (b()) {
            return true;
        }
        int c = c();
        int i = ((ubahData) requireActivity()).q ? 1 : 5;
        RealmList<BankTransferPenerima> realmList = this.b;
        if (realmList == null) {
            subscribeReservationRescheduleEvent.e("");
            realmList = null;
        }
        return c + realmList.size() >= i;
    }

    private void m() {
        RealmList<BankTransferPenerima> realmList = this.b;
        if (realmList == null) {
            subscribeReservationRescheduleEvent.e("");
            realmList = null;
        }
        if (realmList.size() > 0) {
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH);
            listBidangUsahaAdapter$ListBidangUsahaVH.b.setVisibility(8);
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH2 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH2);
            listBidangUsahaAdapter$ListBidangUsahaVH2.f.setVisibility(0);
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH3 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH3);
            listBidangUsahaAdapter$ListBidangUsahaVH3.k.setVisibility(8);
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH4 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH4);
            listBidangUsahaAdapter$ListBidangUsahaVH4.d.setVisibility(0);
            BigDecimal bigDecimal = new BigDecimal(0.0d);
            BigDecimal bigDecimal2 = new BigDecimal(0.0d);
            RealmList<BankTransferPenerima> realmList2 = this.b;
            if (realmList2 == null) {
                subscribeReservationRescheduleEvent.e("");
                realmList2 = null;
            }
            int size = realmList2.size();
            int i = 0;
            while (i < size) {
                RealmList<BankTransferPenerima> realmList3 = this.b;
                if (realmList3 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    realmList3 = null;
                }
                BankTransferPenerima bankTransferPenerima = realmList3.get(i);
                subscribeReservationRescheduleEvent.c(bankTransferPenerima);
                String nominalPenerima = bankTransferPenerima.getNominalPenerima();
                subscribeReservationRescheduleEvent.d(nominalPenerima, "");
                BigDecimal valueOf = BigDecimal.valueOf(Double.parseDouble(nominalPenerima));
                subscribeReservationRescheduleEvent.d(valueOf, "");
                BigDecimal add = bigDecimal.add(valueOf);
                subscribeReservationRescheduleEvent.d(add, "");
                RealmList<BankTransferPenerima> realmList4 = this.b;
                if (realmList4 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    realmList4 = null;
                }
                BankTransferPenerima bankTransferPenerima2 = realmList4.get(i);
                subscribeReservationRescheduleEvent.c(bankTransferPenerima2);
                String biayaTransfer = bankTransferPenerima2.getBiayaTransfer();
                subscribeReservationRescheduleEvent.d(biayaTransfer, "");
                bigDecimal2 = bigDecimal2.add(new BigDecimal(Double.parseDouble(biayaTransfer)));
                subscribeReservationRescheduleEvent.d(bigDecimal2, "");
                i++;
                bigDecimal = add;
            }
            BigDecimal add2 = bigDecimal.add(bigDecimal2);
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH5 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH5);
            setTypeface settypeface = listBidangUsahaAdapter$ListBidangUsahaVH5.p;
            StringBuilder sb = new StringBuilder();
            String obj = bigDecimal.toString();
            subscribeReservationRescheduleEvent.d(obj, "");
            sb.append(getPromotion.b(CheckOTPSessionPresenter.a(obj, ".", ",", false)));
            sb.append(" IDR");
            settypeface.setText(sb.toString());
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH6 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH6);
            setTypeface settypeface2 = listBidangUsahaAdapter$ListBidangUsahaVH6.n;
            StringBuilder sb2 = new StringBuilder();
            String obj2 = bigDecimal2.toString();
            subscribeReservationRescheduleEvent.d(obj2, "");
            sb2.append(getPromotion.b(CheckOTPSessionPresenter.a(obj2, ".", ",", false)));
            sb2.append(" IDR");
            settypeface2.setText(sb2.toString());
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH7 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH7);
            setTypeface settypeface3 = listBidangUsahaAdapter$ListBidangUsahaVH7.s;
            StringBuilder sb3 = new StringBuilder();
            String obj3 = add2.toString();
            subscribeReservationRescheduleEvent.d(obj3, "");
            sb3.append(getPromotion.b(CheckOTPSessionPresenter.a(obj3, ".", ",", false)));
            sb3.append(" IDR");
            settypeface3.setText(sb3.toString());
            if (j()) {
                ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH8 = this.g;
                subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH8);
                listBidangUsahaAdapter$ListBidangUsahaVH8.h.setVisibility(8);
                return;
            }
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH9 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH9);
            listBidangUsahaAdapter$ListBidangUsahaVH9.h.setVisibility(0);
            return;
        }
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH10 = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH10);
        listBidangUsahaAdapter$ListBidangUsahaVH10.b.setVisibility(0);
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH11 = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH11);
        listBidangUsahaAdapter$ListBidangUsahaVH11.f.setVisibility(8);
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH12 = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH12);
        listBidangUsahaAdapter$ListBidangUsahaVH12.d.setVisibility(8);
    }

    private void n() {
        TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = new TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding();
        Bundle bundle = new Bundle();
        bundle.putString("type", "add");
        bundle.putInt("position", 0);
        transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.setArguments(bundle);
        e(2131296811, transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "BankTransferDataPenerima");
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("imei", g().getImei());
        bundle.putString("email", g().getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getParentFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b_(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("imei", g().getImei());
        bundle.putString("email", g().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getParentFragmentManager(), "AutoLogoutDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void backEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        subscribeReservationRescheduleEvent.e(clickorangsamadenganpemilik, "");
        b(2131296811, new TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding(), "BankTransferDataPengirimB");
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2) {
        if (list != null) {
            ubahData ubahdata = (ubahData) requireActivity();
            List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list3 = list;
            subscribeReservationRescheduleEvent.e(list3, "");
            ArrayList arrayList = new ArrayList(list3);
            subscribeReservationRescheduleEvent.e(arrayList, "");
            ubahdata.u = arrayList;
        }
        if (list2 != null) {
            ubahData ubahdata2 = (ubahData) requireActivity();
            List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list4 = list2;
            subscribeReservationRescheduleEvent.e(list4, "");
            ArrayList arrayList2 = new ArrayList(list4);
            subscribeReservationRescheduleEvent.e(arrayList2, "");
            ubahdata2.v = arrayList2;
        }
        f();
        getView activity = getActivity();
        if (activity != null) {
            ((ubahData) activity).z();
            UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding = new UbahMasterCardAdapter$ViewHolder_ViewBinding();
            UbahMasterCardAdapter$ViewHolder_ViewBinding.write write2 = UbahMasterCardAdapter$ViewHolder_ViewBinding.e;
            e(2131296811, ubahMasterCardAdapter$ViewHolder_ViewBinding, UbahMasterCardAdapter$ViewHolder_ViewBinding.g);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void deleteDataPenerima(TarikanUbahTransaksiActivity_ViewBinding tarikanUbahTransaksiActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(tarikanUbahTransaksiActivity_ViewBinding, "");
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogTitle", "Penerima Berhasil Dihapus");
        StringBuilder sb = new StringBuilder("Data Penerima ");
        sb.append(tarikanUbahTransaksiActivity_ViewBinding.e + 1);
        sb.append(" telah terhapus");
        bundle.putString("MessageDialogContent", sb.toString());
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
        a().getPenerimaList().remove(tarikanUbahTransaksiActivity_ViewBinding.e);
        DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity = this.a;
        if (detailTundaEChannelNotificationActivity == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaEChannelNotificationActivity = null;
        }
        RealmList<BankTransferPenerima> penerimaList = a().getPenerimaList();
        subscribeReservationRescheduleEvent.d(penerimaList, "");
        subscribeReservationRescheduleEvent.e(penerimaList, "");
        detailTundaEChannelNotificationActivity.b = penerimaList;
        detailTundaEChannelNotificationActivity.a.b();
        m();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.c.clear();
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void g(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void konfirmasiDeleteDataPenerima(showDataTransaksiSetoran showdatatransaksisetoran) {
        subscribeReservationRescheduleEvent.e(showdatatransaksisetoran, "");
        Bundle bundle = new Bundle();
        bundle.putInt("position", showdatatransaksisetoran.e);
        MenuTransactionAdapter$ViewHolder menuTransactionAdapter$ViewHolder = new MenuTransactionAdapter$ViewHolder();
        menuTransactionAdapter$ViewHolder.setArguments(bundle);
        menuTransactionAdapter$ViewHolder.show(getParentFragmentManager(), "HapusDataPenerimaBTDialog");
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void m(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493157, viewGroup, false);
        Button button = (Button) setRotation.a(inflate, 2131296394);
        int i = 2131297623;
        if (button != null) {
            Button button2 = (Button) setRotation.a(inflate, 2131296396);
            if (button2 != null) {
                ImageView imageView = (ImageView) setRotation.a(inflate, 2131297391);
                if (imageView != null) {
                    LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297623);
                    if (linearLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) setRotation.a(inflate, 2131297692);
                        if (linearLayout2 != null) {
                            LinearLayout linearLayout3 = (LinearLayout) setRotation.a(inflate, 2131297764);
                            if (linearLayout3 != null) {
                                LinearLayout linearLayout4 = (LinearLayout) setRotation.a(inflate, 2131297905);
                                if (linearLayout4 != null) {
                                    setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(inflate, 2131298324);
                                    if (setonstartentertransitionlistener != null) {
                                        getLifecycle getlifecycle = (getLifecycle) inflate;
                                        TextView textView = (TextView) setRotation.a(inflate, 2131298774);
                                        if (textView != null) {
                                            TextView textView2 = (TextView) setRotation.a(inflate, 2131298775);
                                            if (textView2 != null) {
                                                TextView textView3 = (TextView) setRotation.a(inflate, 2131298776);
                                                if (textView3 != null) {
                                                    TextView textView4 = (TextView) setRotation.a(inflate, 2131299008);
                                                    if (textView4 != null) {
                                                        setTypeface settypeface = (setTypeface) setRotation.a(inflate, 2131299679);
                                                        if (settypeface != null) {
                                                            setTypeface settypeface2 = (setTypeface) setRotation.a(inflate, 2131299681);
                                                            if (settypeface2 != null) {
                                                                setTypeface settypeface3 = (setTypeface) setRotation.a(inflate, 2131299684);
                                                                if (settypeface3 != null) {
                                                                    TextView textView5 = (TextView) setRotation.a(inflate, 2131299686);
                                                                    if (textView5 != null) {
                                                                        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH = new ListBidangUsahaAdapter$ListBidangUsahaVH(getlifecycle, button, button2, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, setonstartentertransitionlistener, getlifecycle, textView, textView2, textView3, textView4, settypeface, settypeface2, settypeface3, textView5);
                                                                        this.g = listBidangUsahaAdapter$ListBidangUsahaVH;
                                                                        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH);
                                                                        getLifecycle getlifecycle2 = listBidangUsahaAdapter$ListBidangUsahaVH.i;
                                                                        subscribeReservationRescheduleEvent.d(getlifecycle2, "");
                                                                        return getlifecycle2;
                                                                    }
                                                                    i = 2131299686;
                                                                } else {
                                                                    i = 2131299684;
                                                                }
                                                            } else {
                                                                i = 2131299681;
                                                            }
                                                        } else {
                                                            i = 2131299679;
                                                        }
                                                    } else {
                                                        i = 2131299008;
                                                    }
                                                } else {
                                                    i = 2131298776;
                                                }
                                            } else {
                                                i = 2131298775;
                                            }
                                        } else {
                                            i = 2131298774;
                                        }
                                    } else {
                                        i = 2131298324;
                                    }
                                } else {
                                    i = 2131297905;
                                }
                            } else {
                                i = 2131297764;
                            }
                        } else {
                            i = 2131297692;
                        }
                    }
                } else {
                    i = 2131297391;
                }
            } else {
                i = 2131296396;
            }
        } else {
            i = 2131296394;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        CategoriesKUPresenter categoriesKUPresenter = (CategoriesKUPresenter) this.h.d();
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call = categoriesKUPresenter.c;
        if (call != null) {
            call.cancel();
        }
        categoriesKUPresenter.b = null;
        documentProvider.b().e(this);
        onDestroyView();
        this.g = null;
        this.c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        ((CategoriesKUPresenter) this.h.d()).b = this;
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH);
        listBidangUsahaAdapter$ListBidangUsahaVH.c.setOnClickListener(new View.OnClickListener() { // from class: o.UbahSubVisaCardAdapter$ViewHolder_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahSubMasterCardAdapter$ViewHolder.a(UbahSubMasterCardAdapter$ViewHolder.this, view2);
            }
        });
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH2 = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH2);
        listBidangUsahaAdapter$ListBidangUsahaVH2.h.setOnClickListener(new View.OnClickListener() { // from class: o.UbahSubMasterCardAdapter$ViewHolder_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahSubMasterCardAdapter$ViewHolder.b(UbahSubMasterCardAdapter$ViewHolder.this, view2);
            }
        });
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH3 = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH3);
        listBidangUsahaAdapter$ListBidangUsahaVH3.e.setOnClickListener(new View.OnClickListener() { // from class: o.WarkatListAdapter$JenisWarkat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahSubMasterCardAdapter$ViewHolder.e(UbahSubMasterCardAdapter$ViewHolder.this, view2);
            }
        });
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH4 = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH4);
        listBidangUsahaAdapter$ListBidangUsahaVH4.f100o.setOnClickListener(new View.OnClickListener() { // from class: o.onConfirmationFormReset
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahSubMasterCardAdapter$ViewHolder.d(UbahSubMasterCardAdapter$ViewHolder.this, view2);
            }
        });
        ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH5 = this.g;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH5);
        listBidangUsahaAdapter$ListBidangUsahaVH5.d.setOnClickListener(new View.OnClickListener() { // from class: o.WarkatListAdapter$JenisWarkat_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahSubMasterCardAdapter$ViewHolder.c(UbahSubMasterCardAdapter$ViewHolder.this, view2);
            }
        });
        getView activity = getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity = null;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            RealmList<BankTransferPenerima> penerimaList = bankTransfer.getPenerimaList();
            subscribeReservationRescheduleEvent.d(penerimaList, "");
            subscribeReservationRescheduleEvent.e(penerimaList, "");
            this.b = penerimaList;
            int c = b() ? 1 : 5 - c();
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH6 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH6);
            TextView textView = listBidangUsahaAdapter$ListBidangUsahaVH6.q;
            subscriberLoadDraftKirimanUangEvent subscriberloaddraftkirimanuangevent = subscriberLoadDraftKirimanUangEvent.d;
            String string = getString(2131821739);
            subscribeReservationRescheduleEvent.d(string, "");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(c)}, 1));
            subscribeReservationRescheduleEvent.d(format, "");
            textView.setText(getDialog.c(format, 0));
            m();
            Context requireContext = requireContext();
            subscribeReservationRescheduleEvent.d(requireContext, "");
            RealmList<BankTransferPenerima> realmList = this.b;
            if (realmList == null) {
                subscribeReservationRescheduleEvent.e("");
                realmList = null;
            }
            DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity2 = new DetailTundaEChannelNotificationActivity(requireContext, realmList);
            subscribeReservationRescheduleEvent.e(detailTundaEChannelNotificationActivity2, "");
            this.a = detailTundaEChannelNotificationActivity2;
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH7 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH7);
            setOnStartEnterTransitionListener setonstartentertransitionlistener = listBidangUsahaAdapter$ListBidangUsahaVH7.g;
            requireContext();
            setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
            ListBidangUsahaAdapter$ListBidangUsahaVH listBidangUsahaAdapter$ListBidangUsahaVH8 = this.g;
            subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH8);
            setOnStartEnterTransitionListener setonstartentertransitionlistener2 = listBidangUsahaAdapter$ListBidangUsahaVH8.g;
            detailTundaEChannelNotificationActivity = this.a;
            if (detailTundaEChannelNotificationActivity == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            setonstartentertransitionlistener2.setAdapter(detailTundaEChannelNotificationActivity);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void u() {
        h();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void ubahDataPenerima(ChooseVisaAdapter$ViewHolder_ViewBinding chooseVisaAdapter$ViewHolder_ViewBinding) {
        subscribeReservationRescheduleEvent.e(chooseVisaAdapter$ViewHolder_ViewBinding, "");
        int i = chooseVisaAdapter$ViewHolder_ViewBinding.d;
        TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = new TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding();
        Bundle bundle = new Bundle();
        bundle.putString("type", "edit");
        bundle.putInt("position", i);
        transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.setArguments(bundle);
        e(2131296811, transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "BankTransferDataPenerima");
    }
}
