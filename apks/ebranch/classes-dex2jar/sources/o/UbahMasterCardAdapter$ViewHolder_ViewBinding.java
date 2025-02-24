package o;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SumberDanaAdapter$SumberDanaVH_ViewBinding;
import o.UbahSubMasterCardAdapter$ViewHolder;
import o.showInfoValueTodayOR;
/* loaded from: classes-dex2jar.jar:o/UbahMasterCardAdapter$ViewHolder_ViewBinding.class */
public final class UbahMasterCardAdapter$ViewHolder_ViewBinding extends BaseFragmentKotlin implements View.OnFocusChangeListener, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver {
    public static final write e = new write((byte) 0);
    private static final String g = "BankTransferDataTransaksi";
    List<? extends EditText> b;
    List<? extends LogoutDialog_ViewBinding> c;
    List<? extends TextView> d;
    private KantorCabangROAdapter$KantorCabangROVH_ViewBinding n;
    public Map<Integer, View> a = new LinkedHashMap();
    private final BigDecimal h = new BigDecimal(100000000);

    /* loaded from: classes-dex2jar.jar:o/UbahMasterCardAdapter$ViewHolder_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(1);
            UbahMasterCardAdapter$ViewHolder_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding = UbahMasterCardAdapter$ViewHolder_ViewBinding.this;
            String string = ubahMasterCardAdapter$ViewHolder_ViewBinding.getResources().getString(2131820599);
            subscribeReservationRescheduleEvent.d(string, "");
            ubahMasterCardAdapter$ViewHolder_ViewBinding.e(0, string);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/UbahMasterCardAdapter$ViewHolder_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(1);
            UbahMasterCardAdapter$ViewHolder_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding = UbahMasterCardAdapter$ViewHolder_ViewBinding.this;
            String string = ubahMasterCardAdapter$ViewHolder_ViewBinding.getResources().getString(2131820590);
            subscribeReservationRescheduleEvent.d(string, "");
            ubahMasterCardAdapter$ViewHolder_ViewBinding.e(2, string);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/UbahMasterCardAdapter$ViewHolder_ViewBinding$read.class */
    public static final class read extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read() {
            super(1);
            UbahMasterCardAdapter$ViewHolder_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding = UbahMasterCardAdapter$ViewHolder_ViewBinding.this;
            String string = ubahMasterCardAdapter$ViewHolder_ViewBinding.getResources().getString(2131820603);
            subscribeReservationRescheduleEvent.d(string, "");
            ubahMasterCardAdapter$ViewHolder_ViewBinding.e(1, string);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/UbahMasterCardAdapter$ViewHolder_ViewBinding$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public static final /* synthetic */ String a() {
        return g;
    }

    public static /* synthetic */ void a(UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(ubahMasterCardAdapter$ViewHolder_ViewBinding, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = ubahMasterCardAdapter$ViewHolder_ViewBinding.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        String obj = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.i.getText().toString();
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = ubahMasterCardAdapter$ViewHolder_ViewBinding.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
        SumberDanaAdapter$SumberDanaVH_ViewBinding sumberDanaAdapter$SumberDanaVH_ViewBinding = new SumberDanaAdapter$SumberDanaVH_ViewBinding(obj, kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.j.getText().toString());
        isDetached parentFragmentManager = ubahMasterCardAdapter$ViewHolder_ViewBinding.getParentFragmentManager();
        SumberDanaAdapter$SumberDanaVH_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer = SumberDanaAdapter$SumberDanaVH_ViewBinding.e;
        sumberDanaAdapter$SumberDanaVH_ViewBinding.show(parentFragmentManager, SumberDanaAdapter$SumberDanaVH_ViewBinding.c);
    }

    public static /* synthetic */ void b(UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(ubahMasterCardAdapter$ViewHolder_ViewBinding, "");
        Bundle bundle = new Bundle();
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = ubahMasterCardAdapter$ViewHolder_ViewBinding.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, kantorCabangROAdapter$KantorCabangROVH_ViewBinding.f.getText().toString());
        SexAdapter$SexVH_ViewBinding sexAdapter$SexVH_ViewBinding = new SexAdapter$SexVH_ViewBinding(((ubahData) ubahMasterCardAdapter$ViewHolder_ViewBinding.requireActivity()).v);
        sexAdapter$SexVH_ViewBinding.setArguments(bundle);
        sexAdapter$SexVH_ViewBinding.show(ubahMasterCardAdapter$ViewHolder_ViewBinding.getParentFragmentManager(), "TujuanTransaksiBankTransferDialog");
    }

    public static final /* synthetic */ KantorCabangROAdapter$KantorCabangROVH_ViewBinding c(UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding) {
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = ubahMasterCardAdapter$ViewHolder_ViewBinding.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        return kantorCabangROAdapter$KantorCabangROVH_ViewBinding;
    }

    private void c(View view) {
        subscribeReservationRescheduleEvent.e(view, "");
        List<? extends TextView> list = this.d;
        List<? extends EditText> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        List<? extends EditText> list4 = this.b;
        List<? extends EditText> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        subscribeReservationRescheduleEvent.e(list5, "");
        ((TextView) list3.get(list5.indexOf(view))).setVisibility(8);
        List<? extends LogoutDialog_ViewBinding> list6 = this.c;
        List<? extends LogoutDialog_ViewBinding> list7 = list6;
        if (list6 == null) {
            subscribeReservationRescheduleEvent.e("");
            list7 = null;
        }
        list2 = this.b;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        subscribeReservationRescheduleEvent.e(list2, "");
        ((LogoutDialog_ViewBinding) list7.get(list2.indexOf(view))).setBackgroundResource(2131230847);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0262 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void c(o.UbahMasterCardAdapter$ViewHolder_ViewBinding r5, android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 611
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UbahMasterCardAdapter$ViewHolder_ViewBinding.c(o.UbahMasterCardAdapter$ViewHolder_ViewBinding, android.view.View):void");
    }

    public static /* synthetic */ void d(UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(ubahMasterCardAdapter$ViewHolder_ViewBinding, "");
        Bundle bundle = new Bundle();
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = ubahMasterCardAdapter$ViewHolder_ViewBinding.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, kantorCabangROAdapter$KantorCabangROVH_ViewBinding.b.getText().toString());
        ReviewSubMastercardAdapter$ViewHolder reviewSubMastercardAdapter$ViewHolder = new ReviewSubMastercardAdapter$ViewHolder(((ubahData) ubahMasterCardAdapter$ViewHolder_ViewBinding.requireActivity()).u);
        reviewSubMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewSubMastercardAdapter$ViewHolder.show(ubahMasterCardAdapter$ViewHolder_ViewBinding.getParentFragmentManager(), "SumberDanaBankTransferDialog");
    }

    public static /* synthetic */ void e(UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(ubahMasterCardAdapter$ViewHolder_ViewBinding, "");
        Calendar instance = Calendar.getInstance();
        showInfoValueTodayOR e2 = showInfoValueTodayOR.e((showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver) ubahMasterCardAdapter$ViewHolder_ViewBinding, instance.get(1), instance.get(2), instance.get(5));
        instance.set(5, instance.get(5) + 1);
        OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e2.b;
        Calendar calendar = (Calendar) instance.clone();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        oR2PilihProductFragment_ViewBinding.e = calendar;
        lewati lewati = e2.d;
        if (lewati != null) {
            lewati.c.h();
        }
        int color = ubahMasterCardAdapter$ViewHolder_ViewBinding.getResources().getColor(2131099765);
        e2.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
        e2.show(ubahMasterCardAdapter$ViewHolder_ViewBinding.requireActivity().getFragmentManager(), "");
    }

    public final BankTransfer b() {
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void backEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        subscribeReservationRescheduleEvent.e(clickorangsamadenganpemilik, "");
        getView activity = getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            subscribeReservationRescheduleEvent.e(bankTransfer, "");
            bankTransfer.setSumberDanaTransaksi("");
            bankTransfer.setTujuanTransaksi("");
            bankTransfer.setJenisWarkatTransaksi("");
            bankTransfer.setNoWarkatTransaksi("");
            bankTransfer.setWaktuPengirimanTransaksi("");
            bankTransfer.setTanggalJatuhTempoTransaksi("");
            if (((ubahData) requireActivity()).I() || ((ubahData) requireActivity()).q) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = new TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding();
                Bundle bundle = new Bundle();
                bundle.putString("type", "edit");
                bundle.putInt("position", 0);
                transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.setArguments(bundle);
                b(2131296811, transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "BankTransferDataPenerima");
                return;
            }
            UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder = new UbahSubMasterCardAdapter$ViewHolder();
            UbahSubMasterCardAdapter$ViewHolder.write write2 = UbahSubMasterCardAdapter$ViewHolder.e;
            b(2131296811, ubahSubMasterCardAdapter$ViewHolder, UbahSubMasterCardAdapter$ViewHolder.d);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.j;
        subscribeReservationRescheduleEvent.d(editText, "");
        c(editText);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.j.setText(getAnnualFeeBasicAmount.e(i, i2, i3));
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding3 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding3);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding3.m.setHintEnabled(true);
        BankTransfer b = b();
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding4 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding4);
        b.setTanggalJatuhTempoTransaksi(kantorCabangROAdapter$KantorCabangROVH_ViewBinding4.j.getText().toString());
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.a.clear();
    }

    public final void e(int i, String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        List<? extends TextView> list = this.d;
        List<? extends LogoutDialog_ViewBinding> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        ((TextView) list3.get(i)).setVisibility(0);
        List<? extends TextView> list4 = this.d;
        List<? extends TextView> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        ((TextView) list5.get(i)).setText(str);
        list2 = this.c;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        ((LogoutDialog_ViewBinding) list2.get(i)).setBackgroundResource(2131230870);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseSaranaPembayaran(ReservasiROSuccessActivity_ViewBinding reservasiROSuccessActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiROSuccessActivity_ViewBinding, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.c;
        subscribeReservationRescheduleEvent.d(editText, "");
        c(editText);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.f96o.setHintEnabled(true);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding3 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding3);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding3.c.setText(reservasiROSuccessActivity_ViewBinding.e);
        b().setSaranaPembayaranPengirim(reservasiROSuccessActivity_ViewBinding.e);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseSumberDana(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiTellerOActivity_ViewBinding, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.b;
        subscribeReservationRescheduleEvent.d(editText, "");
        c(editText);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.n.setHintEnabled(true);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding3 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding3);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding3.b.setText(reservasiTellerOActivity_ViewBinding.a);
        b().setSumberDanaTransaksi(reservasiTellerOActivity_ViewBinding.a);
        b().setSumberDanaTransaksiCode(reservasiTellerOActivity_ViewBinding.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTujuanTransaksi(SyaratKetentuanActivity syaratKetentuanActivity) {
        subscribeReservationRescheduleEvent.e(syaratKetentuanActivity, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.f;
        subscribeReservationRescheduleEvent.d(editText, "");
        c(editText);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.p.setHintEnabled(true);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding3 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding3);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding3.f.setText(syaratKetentuanActivity.c);
        b().setTujuanTransaksi(syaratKetentuanActivity.c);
        b().setTujuanTransaksiCode(syaratKetentuanActivity.a);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseWaktuPengiriman(TarikanReservasiUbahTransaksiActivity tarikanReservasiUbahTransaksiActivity) {
        subscribeReservationRescheduleEvent.e(tarikanReservasiUbahTransaksiActivity, "");
        boolean z = false;
        if (!(tarikanReservasiUbahTransaksiActivity.d.length() == 0)) {
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
            EditText editText = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.i;
            subscribeReservationRescheduleEvent.d(editText, "");
            c(editText);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
            EditText editText2 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.j;
            subscribeReservationRescheduleEvent.d(editText2, "");
            c(editText2);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding3 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding3);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding3.r.setHintEnabled(true);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding4 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding4);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding4.i.setText(tarikanReservasiUbahTransaksiActivity.d);
            b().setWaktuPengirimanTransaksi(tarikanReservasiUbahTransaksiActivity.d);
            String str = tarikanReservasiUbahTransaksiActivity.d;
            if (subscribeReservationRescheduleEvent.b((Object) str, (Object) getString(2131821704))) {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding5 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding5);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding5.m.setVisibility(8);
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding6 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding6);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding6.j.setText("");
                b().setTanggalJatuhTempoTransaksi("");
            } else if (subscribeReservationRescheduleEvent.b((Object) str, (Object) getString(2131822178))) {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding7 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding7);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding7.m.setVisibility(0);
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding8 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding8);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding8.j.setText(tarikanReservasiUbahTransaksiActivity.e);
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding9 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding9);
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = kantorCabangROAdapter$KantorCabangROVH_ViewBinding9.m;
                if (tarikanReservasiUbahTransaksiActivity.e.length() > 0) {
                    z = true;
                }
                logoutDialog_ViewBinding.setHintEnabled(z);
                b().setTanggalJatuhTempoTransaksi(tarikanReservasiUbahTransaksiActivity.e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493156, viewGroup, false);
        Button button = (Button) setRotation.a(inflate, 2131296396);
        int i = 2131297233;
        if (button != null) {
            EditText editText = (EditText) setRotation.a(inflate, 2131297107);
            if (editText != null) {
                EditText editText2 = (EditText) setRotation.a(inflate, 2131297129);
                if (editText2 != null) {
                    EditText editText3 = (EditText) setRotation.a(inflate, 2131297174);
                    if (editText3 != null) {
                        EditText editText4 = (EditText) setRotation.a(inflate, 2131297199);
                        if (editText4 != null) {
                            EditText editText5 = (EditText) setRotation.a(inflate, 2131297205);
                            if (editText5 != null) {
                                EditText editText6 = (EditText) setRotation.a(inflate, 2131297223);
                                if (editText6 != null) {
                                    EditText editText7 = (EditText) setRotation.a(inflate, 2131297229);
                                    if (editText7 != null) {
                                        EditText editText8 = (EditText) setRotation.a(inflate, 2131297233);
                                        if (editText8 != null) {
                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298653);
                                            if (logoutDialog_ViewBinding != null) {
                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298674);
                                                if (logoutDialog_ViewBinding2 != null) {
                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298710);
                                                    if (logoutDialog_ViewBinding3 != null) {
                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298731);
                                                        if (logoutDialog_ViewBinding4 != null) {
                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298737);
                                                            if (logoutDialog_ViewBinding5 != null) {
                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298754);
                                                                if (logoutDialog_ViewBinding6 != null) {
                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298760);
                                                                    if (logoutDialog_ViewBinding7 != null) {
                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298764);
                                                                        if (logoutDialog_ViewBinding8 != null) {
                                                                            TextView textView = (TextView) setRotation.a(inflate, 2131298772);
                                                                            if (textView != null) {
                                                                                TextView textView2 = (TextView) setRotation.a(inflate, 2131299126);
                                                                                if (textView2 != null) {
                                                                                    TextView textView3 = (TextView) setRotation.a(inflate, 2131299144);
                                                                                    if (textView3 != null) {
                                                                                        TextView textView4 = (TextView) setRotation.a(inflate, 2131299177);
                                                                                        if (textView4 != null) {
                                                                                            TextView textView5 = (TextView) setRotation.a(inflate, 2131299199);
                                                                                            if (textView5 != null) {
                                                                                                TextView textView6 = (TextView) setRotation.a(inflate, 2131299205);
                                                                                                if (textView6 != null) {
                                                                                                    TextView textView7 = (TextView) setRotation.a(inflate, 2131299223);
                                                                                                    if (textView7 != null) {
                                                                                                        TextView textView8 = (TextView) setRotation.a(inflate, 2131299231);
                                                                                                        if (textView8 != null) {
                                                                                                            TextView textView9 = (TextView) setRotation.a(inflate, 2131299234);
                                                                                                            if (textView9 != null) {
                                                                                                                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = new KantorCabangROAdapter$KantorCabangROVH_ViewBinding((ScrollView) inflate, button, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                                this.n = kantorCabangROAdapter$KantorCabangROVH_ViewBinding;
                                                                                                                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
                                                                                                                ScrollView scrollView = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.g;
                                                                                                                subscribeReservationRescheduleEvent.d(scrollView, "");
                                                                                                                return scrollView;
                                                                                                            }
                                                                                                            i = 2131299234;
                                                                                                        } else {
                                                                                                            i = 2131299231;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = 2131299223;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = 2131299205;
                                                                                                }
                                                                                            } else {
                                                                                                i = 2131299199;
                                                                                            }
                                                                                        } else {
                                                                                            i = 2131299177;
                                                                                        }
                                                                                    } else {
                                                                                        i = 2131299144;
                                                                                    }
                                                                                } else {
                                                                                    i = 2131299126;
                                                                                }
                                                                            } else {
                                                                                i = 2131298772;
                                                                            }
                                                                        } else {
                                                                            i = 2131298764;
                                                                        }
                                                                    } else {
                                                                        i = 2131298760;
                                                                    }
                                                                } else {
                                                                    i = 2131298754;
                                                                }
                                                            } else {
                                                                i = 2131298737;
                                                            }
                                                        } else {
                                                            i = 2131298731;
                                                        }
                                                    } else {
                                                        i = 2131298710;
                                                    }
                                                } else {
                                                    i = 2131298674;
                                                }
                                            } else {
                                                i = 2131298653;
                                            }
                                        }
                                    } else {
                                        i = 2131297229;
                                    }
                                } else {
                                    i = 2131297223;
                                }
                            } else {
                                i = 2131297205;
                            }
                        } else {
                            i = 2131297199;
                        }
                    } else {
                        i = 2131297174;
                    }
                } else {
                    i = 2131297129;
                }
            } else {
                i = 2131297107;
            }
        } else {
            i = 2131296396;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        documentProvider.b().e(this);
        onDestroyView();
        this.n = null;
        this.a.clear();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        if (z) {
            subscribeReservationRescheduleEvent.c(view);
            int id = view.getId();
            if (id == 2131297107) {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding.k.setHintEnabled(true);
            } else if (id == 2131297129) {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.l.setHintEnabled(true);
            }
        } else {
            subscribeReservationRescheduleEvent.c(view);
            int id2 = view.getId();
            if (id2 == 2131297107) {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding3 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding3);
                if (kantorCabangROAdapter$KantorCabangROVH_ViewBinding3.d.getText().toString().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding4 = this.n;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding4);
                    kantorCabangROAdapter$KantorCabangROVH_ViewBinding4.k.setHintEnabled(false);
                }
            } else if (id2 == 2131297129) {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding5 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding5);
                if (kantorCabangROAdapter$KantorCabangROVH_ViewBinding5.e.getText().toString().length() != 0) {
                    z3 = false;
                }
                if (z3) {
                    KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding6 = this.n;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding6);
                    kantorCabangROAdapter$KantorCabangROVH_ViewBinding6.l.setHintEnabled(false);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH_ViewBinding.b;
        subscribeReservationRescheduleEvent.d(editText, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding2 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding2);
        EditText editText2 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding2.f;
        subscribeReservationRescheduleEvent.d(editText2, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding3 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding3);
        EditText editText3 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding3.e;
        subscribeReservationRescheduleEvent.d(editText3, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding4 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding4);
        EditText editText4 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding4.i;
        subscribeReservationRescheduleEvent.d(editText4, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding5 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding5);
        EditText editText5 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding5.j;
        subscribeReservationRescheduleEvent.d(editText5, "");
        EditText[] editTextArr = {editText, editText2, editText3, editText4, editText5};
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        List<? extends EditText> asList = Arrays.asList(editTextArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        this.b = asList;
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding6 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding6);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = kantorCabangROAdapter$KantorCabangROVH_ViewBinding6.n;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding7 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding7);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding7.p;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding8 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding8);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding8.l;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding9 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding9);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding9.r;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding10 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding10);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding10.m;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
        LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5};
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
        subscribeReservationRescheduleEvent.d(asList2, "");
        this.c = asList2;
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding11 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding11);
        TextView textView = kantorCabangROAdapter$KantorCabangROVH_ViewBinding11.v;
        subscribeReservationRescheduleEvent.d(textView, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding12 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding12);
        TextView textView2 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding12.A;
        subscribeReservationRescheduleEvent.d(textView2, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding13 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding13);
        TextView textView3 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding13.y;
        subscribeReservationRescheduleEvent.d(textView3, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding14 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding14);
        TextView textView4 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding14.z;
        subscribeReservationRescheduleEvent.d(textView4, "");
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding15 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding15);
        TextView textView5 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding15.x;
        subscribeReservationRescheduleEvent.d(textView5, "");
        TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5};
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        List<? extends TextView> asList3 = Arrays.asList(textViewArr);
        subscribeReservationRescheduleEvent.d(asList3, "");
        this.d = asList3;
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding16 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding16);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding16.b.setOnClickListener(new View.OnClickListener() { // from class: o.UbahBCACardAdapter$ViewHolder_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahMasterCardAdapter$ViewHolder_ViewBinding.d(UbahMasterCardAdapter$ViewHolder_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding17 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding17);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding17.f.setOnClickListener(new View.OnClickListener() { // from class: o.UbahMasterCardAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahMasterCardAdapter$ViewHolder_ViewBinding.b(UbahMasterCardAdapter$ViewHolder_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding18 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding18);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding18.i.setOnClickListener(new View.OnClickListener() { // from class: o.UbahSubBCACardAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahMasterCardAdapter$ViewHolder_ViewBinding.a(UbahMasterCardAdapter$ViewHolder_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding19 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding19);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding19.j.setOnClickListener(new View.OnClickListener() { // from class: o.UbahSubVisaCardAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahMasterCardAdapter$ViewHolder_ViewBinding.e(UbahMasterCardAdapter$ViewHolder_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding20 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding20);
        EditText editText6 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding20.d;
        UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding = this;
        editText6.setOnFocusChangeListener(ubahMasterCardAdapter$ViewHolder_ViewBinding);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding21 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding21);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding21.e.setOnFocusChangeListener(ubahMasterCardAdapter$ViewHolder_ViewBinding);
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding22 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding22);
        EditText editText7 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding22.e;
        subscribeReservationRescheduleEvent.d(editText7, "");
        editText7.addTextChangedListener(new TextWatcher() { // from class: o.UbahMasterCardAdapter$ViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding2 = UbahMasterCardAdapter$ViewHolder_ViewBinding.this;
                EditText editText8 = UbahMasterCardAdapter$ViewHolder_ViewBinding.c(ubahMasterCardAdapter$ViewHolder_ViewBinding2).e;
                subscribeReservationRescheduleEvent.d(editText8, "");
                subscribeReservationRescheduleEvent.e(editText8, "");
                List<? extends TextView> list = ubahMasterCardAdapter$ViewHolder_ViewBinding2.d;
                List<? extends EditText> list2 = null;
                List<? extends TextView> list3 = list;
                if (list == null) {
                    subscribeReservationRescheduleEvent.e("");
                    list3 = null;
                }
                List<? extends LogoutDialog_ViewBinding> list4 = ubahMasterCardAdapter$ViewHolder_ViewBinding2.c;
                List<? extends LogoutDialog_ViewBinding> list5 = list4;
                if (list4 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    list5 = null;
                }
                List<? extends EditText> list6 = ubahMasterCardAdapter$ViewHolder_ViewBinding2.b;
                if (list6 == null) {
                    subscribeReservationRescheduleEvent.e("");
                } else {
                    list2 = list6;
                }
                getPromotion.b(list3, list5, list2, editText8);
                UbahMasterCardAdapter$ViewHolder_ViewBinding.this.b().setNoWarkatTransaksi(UbahMasterCardAdapter$ViewHolder_ViewBinding.c(UbahMasterCardAdapter$ViewHolder_ViewBinding.this).e.getText().toString());
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding23 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding23);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding23.a.setOnClickListener(new View.OnClickListener() { // from class: o.UbahVisaCardAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UbahMasterCardAdapter$ViewHolder_ViewBinding.c(UbahMasterCardAdapter$ViewHolder_ViewBinding.this, view2);
            }
        });
        BankTransfer b = b();
        subscribeReservationRescheduleEvent.e(b, "");
        BigDecimal bigDecimal = new BigDecimal(0.0d);
        BigDecimal bigDecimal2 = new BigDecimal(0.0d);
        int size = b().getPenerimaList().size();
        for (int i = 0; i < size; i++) {
            BankTransferPenerima bankTransferPenerima = b().getPenerimaList().get(i);
            subscribeReservationRescheduleEvent.c(bankTransferPenerima);
            String nominalPenerima = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima, "");
            BigDecimal valueOf = BigDecimal.valueOf(Double.parseDouble(nominalPenerima));
            subscribeReservationRescheduleEvent.d(valueOf, "");
            bigDecimal = bigDecimal.add(valueOf);
            subscribeReservationRescheduleEvent.d(bigDecimal, "");
            BankTransferPenerima bankTransferPenerima2 = b().getPenerimaList().get(i);
            subscribeReservationRescheduleEvent.c(bankTransferPenerima2);
            bigDecimal2 = bigDecimal2.add(new BigDecimal(bankTransferPenerima2.getBiayaTransfer()));
            subscribeReservationRescheduleEvent.d(bigDecimal2, "");
        }
        BigDecimal add = bigDecimal.add(bigDecimal2);
        b().setTotalNominal(bigDecimal.toString());
        b().setTotalBiayaTransfer(bigDecimal2.toString());
        b().setTotalPembayaran(add.toString());
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding24 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding24);
        EditText editText8 = kantorCabangROAdapter$KantorCabangROVH_ViewBinding24.h;
        StringBuilder sb = new StringBuilder();
        String totalPembayaran = b.getTotalPembayaran();
        subscribeReservationRescheduleEvent.d(totalPembayaran, "");
        sb.append(getPromotion.j(CheckOTPSessionPresenter.a(totalPembayaran, ".", ",", false)));
        sb.append(" IDR");
        editText8.setText(sb.toString());
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding25 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding25);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding25.c.setText(b.getSaranaPembayaranPengirim());
        KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding26 = this.n;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding26);
        kantorCabangROAdapter$KantorCabangROVH_ViewBinding26.d.setText(b.getNorekPengirim());
        if (add.compareTo(this.h) > 0) {
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding27 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding27);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding27.n.setVisibility(0);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding28 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding28);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding28.p.setVisibility(0);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding29 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding29);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding29.b.setText(b.getSumberDanaTransaksi());
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding30 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding30);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding30.f.setText(b.getTujuanTransaksi());
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding31 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding31);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding31.q.setText(getDialog.c(getString(2131821852), 0));
        } else {
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding32 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding32);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding32.n.setVisibility(8);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding33 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding33);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding33.p.setVisibility(8);
        }
        if (b.getAccType().equals("GIRO")) {
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding34 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding34);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding34.q.setText(getDialog.c(getString(2131821852), 0));
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding35 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding35);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding35.c.setText(b.getSaranaPembayaranPengirim());
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding36 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding36);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding36.c.setEnabled(false);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding37 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding37);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding37.f96o.setHintEnabled(true);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding38 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding38);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding38.l.setVisibility(0);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding39 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding39);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding39.e.setText(b.getNoWarkatTransaksi());
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding40 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding40);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding40.r.setVisibility(0);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding41 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding41);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding41.i.setText(b.getWaktuPengirimanTransaksi());
            if (b.getWaktuPengirimanTransaksi().equals("Titipan")) {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding42 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding42);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding42.m.setVisibility(0);
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding43 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding43);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding43.j.setText(b.getTanggalJatuhTempoTransaksi());
            } else {
                KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding44 = this.n;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding44);
                kantorCabangROAdapter$KantorCabangROVH_ViewBinding44.m.setVisibility(8);
            }
        } else {
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding45 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding45);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding45.l.setVisibility(8);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding46 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding46);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding46.r.setVisibility(8);
            KantorCabangROAdapter$KantorCabangROVH_ViewBinding kantorCabangROAdapter$KantorCabangROVH_ViewBinding47 = this.n;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH_ViewBinding47);
            kantorCabangROAdapter$KantorCabangROVH_ViewBinding47.m.setVisibility(8);
        }
        List<? extends EditText> list = this.b;
        List<? extends EditText> list2 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list2 = null;
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            List<? extends LogoutDialog_ViewBinding> list3 = this.c;
            List<? extends LogoutDialog_ViewBinding> list4 = list3;
            if (list3 == null) {
                subscribeReservationRescheduleEvent.e("");
                list4 = null;
            }
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = (LogoutDialog_ViewBinding) list4.get(i2);
            List<? extends EditText> list5 = this.b;
            List<? extends EditText> list6 = list5;
            if (list5 == null) {
                subscribeReservationRescheduleEvent.e("");
                list6 = null;
            }
            logoutDialog_ViewBinding6.setHintEnabled(!(((EditText) list6.get(i2)).getText().toString().length() == 0));
        }
    }
}
