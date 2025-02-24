package o;

import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.bca.smartbranch.presenter.CategoriesKUPresenter;
import com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.NomorOTPAdapter$NomorOTPVH;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.PecahanUangAdapter$PecahanUangVH;
import o.StatusNPWPAdapter$StatusNPWPVH_ViewBinding;
import o.SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding;
import o.UbahMasterCardAdapter$ViewHolder_ViewBinding;
import o.UbahSubMasterCardAdapter$ViewHolder;
import o.onClickDetail;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.class */
public final class TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding extends BaseFragmentKotlin implements View.OnFocusChangeListener, RadioGroup.OnCheckedChangeListener, AdapterView.OnItemClickListener, CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver, CheckDaftarTransferORPresenter.read, UpdateDeleteDaftarTransferPresenter.write, DaftarTransferPresenter.RemoteActionCompatParcelizer {
    public static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer((byte) 0);
    private static final String g = "BankTransferDataPenerima";
    private int A;
    private int C;
    private String D;
    KantorCabangROAdapter$KantorCabangROVH a;
    public String c;
    List<? extends TextView> d;
    public Map<Integer, View> e = new LinkedHashMap();
    private DetailTundaCCActivity h;
    private String k;
    private String l;
    private boolean m;
    private List<? extends DaftarTransferResponse.DaftarTransferOutput> n;

    /* renamed from: o */
    private DetailTundaCCActivity f128o;
    private List<? extends LogoutDialog_ViewBinding> p;
    private List<? extends EditText> q;
    private boolean r;
    private final onChooseValueSumberPenghasilan s;
    private boolean t;
    private final onChooseValueSumberPenghasilan u;
    private Long v;
    private DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver w;
    private final onChooseValueSumberPenghasilan x;
    private final onChooseValueSumberPenghasilan y;

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<CategoriesKUPresenter> {
        public static final IconCompatParcelizer d = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ CategoriesKUPresenter invoke() {
            return new CategoriesKUPresenter();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat implements TextWatcher {
        MediaDescriptionCompat() {
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            r6 = "";
            subscribeReservationRescheduleEvent.e(editable, "");
            MediaDescriptionCompat mediaDescriptionCompat = this;
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this).n.removeTextChangedListener(mediaDescriptionCompat);
            String replaceAll = String.valueOf(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this).n.getText()).replaceAll("[^0-9.,]", "");
            subscribeReservationRescheduleEvent.d(replaceAll, "");
            if (subscribeReservationRescheduleEvent.b((Object) replaceAll, (Object) "0")) {
            }
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this).n.length();
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this).n.setText(getPromotion.e(replaceAll, 12, 2));
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this).n.setSelection(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this).n.length());
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this).n.addTextChangedListener(mediaDescriptionCompat);
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this;
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
            if (kantorCabangROAdapter$KantorCabangROVH.aa.getVisibility() == 0) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
                if (!(String.valueOf(kantorCabangROAdapter$KantorCabangROVH2.n.getText()).length() == 0)) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
                    kantorCabangROAdapter$KantorCabangROVH3.aa.setVisibility(8);
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
                    kantorCabangROAdapter$KantorCabangROVH4.f95o.setBackgroundResource(2131230847);
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            subscribeReservationRescheduleEvent.e(charSequence, "");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            subscribeReservationRescheduleEvent.e(charSequence, "");
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat implements TextWatcher {
        public MediaMetadataCompat() {
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this;
            AutoCompleteTextView autoCompleteTextView = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding).h;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(autoCompleteTextView);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$RatingCompat.class */
    public static final class RatingCompat extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat() {
            super(1);
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this;
            String string = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.getResources().getString(2131820591);
            subscribeReservationRescheduleEvent.d(string, "");
            subscribeReservationRescheduleEvent.e(string, "");
            List<? extends TextView> list = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.d;
            List<? extends TextView> list2 = null;
            List<? extends TextView> list3 = list;
            if (list == null) {
                subscribeReservationRescheduleEvent.e("");
                list3 = null;
            }
            ((TextView) list3.get(3)).setVisibility(0);
            list2 = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.d;
            if (list2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            ((TextView) list2.get(3)).setText(string);
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
            kantorCabangROAdapter$KantorCabangROVH.f95o.setBackgroundResource(2131230870);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$read.class */
    public static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<CheckDaftarTransferORPresenter> {
        public static final read a = new read();

        read() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ CheckDaftarTransferORPresenter invoke() {
            return new CheckDaftarTransferORPresenter();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$write.class */
    public static final class write extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<DaftarTransferPresenter> {
        public static final write a = new write();

        write() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ DaftarTransferPresenter invoke() {
            return new DaftarTransferPresenter();
        }
    }

    public TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding() {
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.d;
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        this.s = new Page6KLFragment_ViewBinding(iconCompatParcelizer, null, 2);
        read read2 = read.a;
        subscribeReservationRescheduleEvent.e(read2, "");
        this.x = new Page6KLFragment_ViewBinding(read2, null, 2);
        TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b;
        subscribeReservationRescheduleEvent.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "");
        this.y = new Page6KLFragment_ViewBinding(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, null, 2);
        write write2 = write.a;
        subscribeReservationRescheduleEvent.e(write2, "");
        this.u = new Page6KLFragment_ViewBinding(write2, null, 2);
    }

    public static /* synthetic */ void a(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "");
        Bundle bundle = new Bundle();
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, kantorCabangROAdapter$KantorCabangROVH.l.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.getParentFragmentManager(), "TipeNasabahBankTransferDialog");
    }

    private final void b() {
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        String str = kantorCabangROAdapter$KantorCabangROVH.y.isChecked() ? "1" : "2";
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
        String str2 = CheckOTPSessionPresenter.d(kantorCabangROAdapter$KantorCabangROVH2.m.getText().toString(), "Penduduk", true) ? "R" : "N";
        UpdateDeleteDaftarTransferPresenter updateDeleteDaftarTransferPresenter = (UpdateDeleteDaftarTransferPresenter) this.y.d();
        InfoProductActivity infoProductActivity = new InfoProductActivity(g().getEmail(), g().getSessionId(), g().getImei(), "Transfer ke Bank Lain");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
        String obj = kantorCabangROAdapter$KantorCabangROVH3.i.getText().toString();
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
        String obj2 = kantorCabangROAdapter$KantorCabangROVH4.h.getText().toString();
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
        String obj3 = kantorCabangROAdapter$KantorCabangROVH5.e.getText().toString();
        int i = this.C;
        DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver = this.w;
        subscribeReservationRescheduleEvent.c(detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver);
        String str3 = detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.c;
        DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver2 = this.w;
        subscribeReservationRescheduleEvent.c(detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver2);
        String str4 = detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver2.e;
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
        String obj4 = kantorCabangROAdapter$KantorCabangROVH6.d.getText().toString();
        DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver3 = this.w;
        subscribeReservationRescheduleEvent.c(detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver3);
        updateDeleteDaftarTransferPresenter.e(infoProductActivity, new MainActivity(obj, obj2, obj3, String.valueOf(i), str3, str4, obj4, str, str2, detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver3.l));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0323  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void b(o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding r6, android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 1099
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.b(o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, android.view.View):void");
    }

    public static final /* synthetic */ String c() {
        return g;
    }

    public static /* synthetic */ void c(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "");
        PecahanUangAdapter$PecahanUangVH pecahanUangAdapter$PecahanUangVH = new PecahanUangAdapter$PecahanUangVH();
        isDetached parentFragmentManager = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.getParentFragmentManager();
        PecahanUangAdapter$PecahanUangVH.read read2 = PecahanUangAdapter$PecahanUangVH.c;
        pecahanUangAdapter$PecahanUangVH.show(parentFragmentManager, PecahanUangAdapter$PecahanUangVH.b);
    }

    private final void d() {
        f();
        UbahMasterCardAdapter$ViewHolder_ViewBinding ubahMasterCardAdapter$ViewHolder_ViewBinding = new UbahMasterCardAdapter$ViewHolder_ViewBinding();
        UbahMasterCardAdapter$ViewHolder_ViewBinding.write write2 = UbahMasterCardAdapter$ViewHolder_ViewBinding.e;
        e(2131296811, ubahMasterCardAdapter$ViewHolder_ViewBinding, UbahMasterCardAdapter$ViewHolder_ViewBinding.g);
    }

    private void d(int i) {
        BankTransferPenerima bankTransferPenerima = new BankTransferPenerima();
        Long l = this.v;
        if (l == null || (l != null && l.longValue() == 0)) {
            this.v = Long.valueOf(System.currentTimeMillis());
        }
        Long l2 = this.v;
        bankTransferPenerima.setId(l2 != null ? l2.longValue() : System.currentTimeMillis());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        bankTransferPenerima.setNamaPenerima(kantorCabangROAdapter$KantorCabangROVH.i.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
        bankTransferPenerima.setNorekPenerima(kantorCabangROAdapter$KantorCabangROVH2.h.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
        bankTransferPenerima.setBankTujuanPenerima(kantorCabangROAdapter$KantorCabangROVH3.d.getText().toString());
        String str = this.k;
        if (str != null) {
            String substring = str.substring(0, 3);
            subscribeReservationRescheduleEvent.d(substring, "");
            bankTransferPenerima.setBankTujuanCode(substring);
            String substring2 = str.substring(3);
            subscribeReservationRescheduleEvent.d(substring2, "");
            bankTransferPenerima.setBankTujuanOfficeCode(substring2);
        }
        String str2 = this.l;
        if (str2 != null && !subscribeReservationRescheduleEvent.b((Object) "", (Object) str2)) {
            bankTransferPenerima.setBankTujuanBIC(this.l);
        }
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
        bankTransferPenerima.setNominalPenerima(getPromotion.c(String.valueOf(kantorCabangROAdapter$KantorCabangROVH4.n.getText())));
        boolean z = this.r;
        if (z) {
            bankTransferPenerima.setMetodePengirimanPenerima(((ubahData) requireActivity()).f);
        } else if (!z) {
            bankTransferPenerima.setMetodePengirimanPenerima(((ubahData) requireActivity()).j);
        }
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
        bankTransferPenerima.setBiayaTransfer(kantorCabangROAdapter$KantorCabangROVH5.O.getText().toString().replaceAll("\\.", "").replace(",", "."));
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
        bankTransferPenerima.setBeritaPenerima(kantorCabangROAdapter$KantorCabangROVH6.a.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH7 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH7);
        bankTransferPenerima.setAlamatPenerima(kantorCabangROAdapter$KantorCabangROVH7.e.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH8 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH8);
        bankTransferPenerima.setTipeNasabahPenerima(kantorCabangROAdapter$KantorCabangROVH8.l.getText().toString());
        bankTransferPenerima.setTipeNasabahPenerimaId(String.valueOf(this.C));
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH9 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH9);
        bankTransferPenerima.setStatusPendudukPenerima(kantorCabangROAdapter$KantorCabangROVH9.m.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH10 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH10);
        switch (kantorCabangROAdapter$KantorCabangROVH10.B.getCheckedRadioButtonId()) {
            case 2131298153:
                bankTransferPenerima.setStatusKewarganegaraanPenerima("WNA");
                break;
            case 2131298154:
                bankTransferPenerima.setStatusKewarganegaraanPenerima("WNI");
                break;
        }
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH11 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH11);
        if (!kantorCabangROAdapter$KantorCabangROVH11.b.isChecked() || !this.m) {
            bankTransferPenerima.setFlagDaftarTransfer("N");
        } else {
            bankTransferPenerima.setFlagDaftarTransfer("Y");
        }
        bankTransferPenerima.setToken(this.D);
        l().getPenerimaList().set(i, bankTransferPenerima);
    }

    private void d(View view) {
        subscribeReservationRescheduleEvent.e(view, "");
        List<? extends TextView> list = this.d;
        List<? extends EditText> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        List<? extends EditText> list4 = this.q;
        List<? extends EditText> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        subscribeReservationRescheduleEvent.e(list5, "");
        ((TextView) list3.get(list5.indexOf(view))).setVisibility(8);
        List<? extends LogoutDialog_ViewBinding> list6 = this.p;
        List<? extends LogoutDialog_ViewBinding> list7 = list6;
        if (list6 == null) {
            subscribeReservationRescheduleEvent.e("");
            list7 = null;
        }
        list2 = this.q;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        subscribeReservationRescheduleEvent.e(list2, "");
        ((LogoutDialog_ViewBinding) list7.get(list2.indexOf(view))).setBackgroundResource(2131230847);
    }

    public static /* synthetic */ void d(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "");
        Bundle bundle = new Bundle();
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, kantorCabangROAdapter$KantorCabangROVH.m.getText().toString());
        ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
        reviewMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewMastercardAdapter$ViewHolder.show(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.getParentFragmentManager(), "StatusPendudukBankTransferDialog");
    }

    public static final /* synthetic */ KantorCabangROAdapter$KantorCabangROVH e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding) {
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        return kantorCabangROAdapter$KantorCabangROVH;
    }

    private void e(int i) {
        BankTransferPenerima bankTransferPenerima;
        if (!(l().getPenerimaList() == null || l().getPenerimaList().size() <= 0 || (bankTransferPenerima = l().getPenerimaList().get(i)) == null)) {
            this.v = Long.valueOf(bankTransferPenerima.getId());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
            kantorCabangROAdapter$KantorCabangROVH.i.setText(bankTransferPenerima.getNamaPenerima());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
            kantorCabangROAdapter$KantorCabangROVH2.h.setText(bankTransferPenerima.getNorekPenerima());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
            kantorCabangROAdapter$KantorCabangROVH3.d.setText(bankTransferPenerima.getBankTujuanPenerima());
            StringBuilder sb = new StringBuilder();
            sb.append(bankTransferPenerima.getBankTujuanCode());
            sb.append(bankTransferPenerima.getBankTujuanOfficeCode());
            this.k = sb.toString();
            this.l = bankTransferPenerima.getBankTujuanBIC();
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
            setAnnualFeeAddOnDisplayAmount setannualfeeaddondisplayamount = kantorCabangROAdapter$KantorCabangROVH4.n;
            String nominalPenerima = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima, "");
            setannualfeeaddondisplayamount.setText(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima, ".", ",", false)));
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
            if (String.valueOf(kantorCabangROAdapter$KantorCabangROVH5.n.getText()).length() > 0) {
                if (subscribeReservationRescheduleEvent.b((Object) bankTransferPenerima.getMetodePengirimanPenerima(), (Object) ((ubahData) requireActivity()).f)) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
                    kantorCabangROAdapter$KantorCabangROVH6.C.setChecked(true);
                } else {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH7 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH7);
                    kantorCabangROAdapter$KantorCabangROVH7.w.setChecked(true);
                }
                String nominalPenerima2 = bankTransferPenerima.getNominalPenerima();
                subscribeReservationRescheduleEvent.d(nominalPenerima2, "");
                k(nominalPenerima2);
            }
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH8 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH8);
            kantorCabangROAdapter$KantorCabangROVH8.a.setText(bankTransferPenerima.getBeritaPenerima());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH9 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH9);
            kantorCabangROAdapter$KantorCabangROVH9.e.setText(bankTransferPenerima.getAlamatPenerima());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH10 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH10);
            kantorCabangROAdapter$KantorCabangROVH10.l.setText(bankTransferPenerima.getTipeNasabahPenerima());
            String tipeNasabahPenerimaId = bankTransferPenerima.getTipeNasabahPenerimaId();
            subscribeReservationRescheduleEvent.d(tipeNasabahPenerimaId, "");
            this.C = Integer.parseInt(tipeNasabahPenerimaId);
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH11 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH11);
            kantorCabangROAdapter$KantorCabangROVH11.m.setText(bankTransferPenerima.getStatusPendudukPenerima());
            String statusKewarganegaraanPenerima = bankTransferPenerima.getStatusKewarganegaraanPenerima();
            subscribeReservationRescheduleEvent.d(statusKewarganegaraanPenerima, "");
            if (statusKewarganegaraanPenerima.length() == 0) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH12 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH12);
                kantorCabangROAdapter$KantorCabangROVH12.y.setChecked(true);
            } else if (bankTransferPenerima.getStatusKewarganegaraanPenerima().equals("WNI")) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH13 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH13);
                kantorCabangROAdapter$KantorCabangROVH13.y.setChecked(true);
            } else {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH14 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH14);
                kantorCabangROAdapter$KantorCabangROVH14.u.setChecked(true);
            }
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH15 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH15);
            kantorCabangROAdapter$KantorCabangROVH15.b.setChecked(bankTransferPenerima.getFlagDaftarTransfer().equals("Y"));
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH16 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH16);
            this.m = kantorCabangROAdapter$KantorCabangROVH16.b.isChecked();
            DetailTundaCCActivity detailTundaCCActivity = this.f128o;
            DetailTundaCCActivity detailTundaCCActivity2 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity2 = null;
            }
            detailTundaCCActivity2.b = this.l;
            DetailTundaCCActivity detailTundaCCActivity3 = this.h;
            DetailTundaCCActivity detailTundaCCActivity4 = detailTundaCCActivity3;
            if (detailTundaCCActivity3 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity4 = null;
            }
            detailTundaCCActivity4.b = this.l;
            this.D = bankTransferPenerima.getToken();
            DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver = new DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver();
            detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.c = this.l;
            detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.a = bankTransferPenerima.getBankTujuanPenerima();
            detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.e = bankTransferPenerima.getBankTujuanOfficeCode();
            detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.l = this.D;
            this.w = detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver;
        }
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH17 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH17);
        if (!(kantorCabangROAdapter$KantorCabangROVH17.d.getText().toString().length() == 0)) {
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH18 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH18);
            kantorCabangROAdapter$KantorCabangROVH18.t.setVisibility(0);
        } else {
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH19 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH19);
            kantorCabangROAdapter$KantorCabangROVH19.t.setVisibility(8);
        }
        List<? extends EditText> list = this.q;
        List<? extends EditText> list2 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list2 = null;
        }
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends LogoutDialog_ViewBinding> list3 = this.p;
            List<? extends LogoutDialog_ViewBinding> list4 = list3;
            if (list3 == null) {
                subscribeReservationRescheduleEvent.e("");
                list4 = null;
            }
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) list4.get(i2);
            List<? extends EditText> list5 = this.q;
            List<? extends EditText> list6 = list5;
            if (list5 == null) {
                subscribeReservationRescheduleEvent.e("");
                list6 = null;
            }
            logoutDialog_ViewBinding.setHintEnabled(!(((EditText) list6.get(i2)).getText().toString().length() == 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
        if (r0.getCountAll() != 0) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void e(o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding r5, android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, android.view.View):void");
    }

    public static /* synthetic */ void g(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "");
        PecahanUangAdapter$PecahanUangVH pecahanUangAdapter$PecahanUangVH = new PecahanUangAdapter$PecahanUangVH();
        isDetached parentFragmentManager = transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.getParentFragmentManager();
        PecahanUangAdapter$PecahanUangVH.read read2 = PecahanUangAdapter$PecahanUangVH.c;
        pecahanUangAdapter$PecahanUangVH.show(parentFragmentManager, PecahanUangAdapter$PecahanUangVH.b);
    }

    private final void j() {
        String str = this.c;
        BankTransfer bankTransfer = null;
        if (str == null) {
            subscribeReservationRescheduleEvent.e("");
            str = null;
        }
        if (CheckOTPSessionPresenter.d(str, "edit", true)) {
            d(this.A);
        } else {
            m();
        }
        getView activity = getActivity();
        if (activity != null) {
            ((ubahData) activity).z();
            if (((ubahData) requireActivity()).I()) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
                BigDecimal bigDecimal = new BigDecimal(getPromotion.c(String.valueOf(kantorCabangROAdapter$KantorCabangROVH.n.getText())));
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
                if (bigDecimal.add(new BigDecimal(getPromotion.c(kantorCabangROAdapter$KantorCabangROVH2.O.getText().toString()))).compareTo(BigDecimal.valueOf(100000000L)) > 0) {
                    CategoriesKUPresenter categoriesKUPresenter = (CategoriesKUPresenter) this.s.d();
                    User g2 = g();
                    getView activity2 = getActivity();
                    if (activity2 != null) {
                        bankTransfer = ((ubahData) activity2).f296o;
                        if (bankTransfer == null) {
                            subscribeReservationRescheduleEvent.e("");
                        }
                        String tipeNasabahPengirim = bankTransfer.getTipeNasabahPengirim();
                        subscribeReservationRescheduleEvent.d(tipeNasabahPengirim, "");
                        categoriesKUPresenter.a(g2, tipeNasabahPengirim);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
                }
                d();
                return;
            }
            f();
            UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder = new UbahSubMasterCardAdapter$ViewHolder();
            UbahSubMasterCardAdapter$ViewHolder.write write2 = UbahSubMasterCardAdapter$ViewHolder.e;
            e(2131296811, ubahSubMasterCardAdapter$ViewHolder, UbahSubMasterCardAdapter$ViewHolder.d);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void k(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 813
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.k(java.lang.String):void");
    }

    private BankTransfer l() {
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

    private void m() {
        BankTransferPenerima bankTransferPenerima = new BankTransferPenerima();
        bankTransferPenerima.setId(System.currentTimeMillis());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        bankTransferPenerima.setNamaPenerima(kantorCabangROAdapter$KantorCabangROVH.i.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
        bankTransferPenerima.setNorekPenerima(kantorCabangROAdapter$KantorCabangROVH2.h.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
        bankTransferPenerima.setBankTujuanPenerima(kantorCabangROAdapter$KantorCabangROVH3.d.getText().toString());
        String str = this.k;
        if (str != null) {
            String substring = str.substring(0, 3);
            subscribeReservationRescheduleEvent.d(substring, "");
            bankTransferPenerima.setBankTujuanCode(substring);
            String substring2 = str.substring(3);
            subscribeReservationRescheduleEvent.d(substring2, "");
            bankTransferPenerima.setBankTujuanOfficeCode(substring2);
        }
        bankTransferPenerima.setBankTujuanBIC(this.l);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
        bankTransferPenerima.setNominalPenerima(getPromotion.c(String.valueOf(kantorCabangROAdapter$KantorCabangROVH4.n.getText())));
        boolean z = this.r;
        if (z) {
            bankTransferPenerima.setMetodePengirimanPenerima(((ubahData) requireActivity()).f);
        } else if (!z) {
            bankTransferPenerima.setMetodePengirimanPenerima(((ubahData) requireActivity()).j);
        }
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
        bankTransferPenerima.setBiayaTransfer(kantorCabangROAdapter$KantorCabangROVH5.O.getText().toString().replaceAll("\\.", "").replace(",", "."));
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
        bankTransferPenerima.setBeritaPenerima(kantorCabangROAdapter$KantorCabangROVH6.a.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH7 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH7);
        bankTransferPenerima.setAlamatPenerima(kantorCabangROAdapter$KantorCabangROVH7.e.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH8 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH8);
        bankTransferPenerima.setTipeNasabahPenerima(kantorCabangROAdapter$KantorCabangROVH8.l.getText().toString());
        bankTransferPenerima.setTipeNasabahPenerimaId(String.valueOf(this.C));
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH9 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH9);
        bankTransferPenerima.setStatusPendudukPenerima(kantorCabangROAdapter$KantorCabangROVH9.m.getText().toString());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH10 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH10);
        switch (kantorCabangROAdapter$KantorCabangROVH10.B.getCheckedRadioButtonId()) {
            case 2131298153:
                bankTransferPenerima.setStatusKewarganegaraanPenerima("WNA");
                break;
            case 2131298154:
                bankTransferPenerima.setStatusKewarganegaraanPenerima("WNI");
                break;
        }
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH11 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH11);
        if (!kantorCabangROAdapter$KantorCabangROVH11.b.isChecked() || !this.m) {
            bankTransferPenerima.setFlagDaftarTransfer("N");
        } else {
            bankTransferPenerima.setFlagDaftarTransfer("Y");
        }
        bankTransferPenerima.setToken(this.D);
        getView activity = getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            bankTransfer.getPenerimaList().add(bankTransferPenerima);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void a() {
        j();
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
        if (((ubahData) requireActivity()).I() || ((ubahData) requireActivity()).q) {
            getView activity = getActivity();
            if (activity != null) {
                BankTransfer bankTransfer = ((ubahData) activity).f296o;
                if (bankTransfer == null) {
                    subscribeReservationRescheduleEvent.e("");
                    bankTransfer = null;
                }
                bankTransfer.getPenerimaList().clear();
                b(2131296811, new TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding(), "BankTransferDataPengirimB");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
        }
        UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder = new UbahSubMasterCardAdapter$ViewHolder();
        UbahSubMasterCardAdapter$ViewHolder.write write2 = UbahSubMasterCardAdapter$ViewHolder.e;
        b(2131296811, ubahSubMasterCardAdapter$ViewHolder, UbahSubMasterCardAdapter$ViewHolder.d);
    }

    public final void c(int i, String str) {
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
        list2 = this.p;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        ((LogoutDialog_ViewBinding) list2.get(i)).setBackgroundResource(2131230870);
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void c(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
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
        d();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void d(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.e.clear();
    }

    public final void e(EditText editText) {
        subscribeReservationRescheduleEvent.e(editText, "");
        List<? extends TextView> list = this.d;
        List<? extends EditText> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        List<? extends LogoutDialog_ViewBinding> list4 = this.p;
        List<? extends LogoutDialog_ViewBinding> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        List<? extends EditText> list6 = this.q;
        if (list6 == null) {
            subscribeReservationRescheduleEvent.e("");
        } else {
            list2 = list6;
        }
        getPromotion.b(list3, list5, list2, editText);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        f();
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        f();
        ubahData ubahdata = (ubahData) getActivity();
        subscribeReservationRescheduleEvent.c(ubahdata);
        ubahdata.l = list;
        if (this.t) {
            this.t = false;
            return;
        }
        SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding sumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding = new SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding();
        isDetached parentFragmentManager = getParentFragmentManager();
        SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.IconCompatParcelizer iconCompatParcelizer = SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.d;
        sumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.show(parentFragmentManager, SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.e);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        f();
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void f(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
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

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        f();
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

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void i(String str) {
        f();
        StatusNPWPAdapter$StatusNPWPVH_ViewBinding statusNPWPAdapter$StatusNPWPVH_ViewBinding = new StatusNPWPAdapter$StatusNPWPVH_ViewBinding();
        isDetached parentFragmentManager = getParentFragmentManager();
        StatusNPWPAdapter$StatusNPWPVH_ViewBinding.IconCompatParcelizer iconCompatParcelizer = StatusNPWPAdapter$StatusNPWPVH_ViewBinding.e;
        statusNPWPAdapter$StatusNPWPVH_ViewBinding.show(parentFragmentManager, StatusNPWPAdapter$StatusNPWPVH_ViewBinding.c);
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void j(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void l_(String str) {
        f();
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        subscribeReservationRescheduleEvent.c((Object) str);
        KeluarFormReservationDialog_ViewBinding a = KeluarFormReservationDialog_ViewBinding.a(null, kantorCabangROAdapter$KantorCabangROVH.G, str, 0);
        subscribeReservationRescheduleEvent.d(a, "");
        a.g();
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onBankNameKUChangeEvent(PilihBidangUsahaActivity pilihBidangUsahaActivity) {
        subscribeReservationRescheduleEvent.e(pilihBidangUsahaActivity, "");
        b();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        if (i == 2131298185) {
            this.r = false;
            Iterator<T> it = ((ubahData) requireActivity()).n.iterator();
            while (it.hasNext()) {
                obj3 = it.next();
                if (CheckOTPSessionPresenter.d(((onClickDetail.RemoteActionCompatParcelizer) obj3).b, "KU_LLG", true)) {
                    break;
                }
            }
            onClickDetail.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (onClickDetail.RemoteActionCompatParcelizer) obj3;
            if (remoteActionCompatParcelizer != null) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
                kantorCabangROAdapter$KantorCabangROVH.O.setText(getPromotion.b(remoteActionCompatParcelizer.d));
            }
        } else if (i == 2131298195) {
            this.r = true;
            if (CheckOTPSessionPresenter.d(g().getMembership(), "s", true)) {
                Iterator<T> it2 = ((ubahData) requireActivity()).n.iterator();
                while (it2.hasNext()) {
                    obj4 = it2.next();
                    onClickDetail.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (onClickDetail.RemoteActionCompatParcelizer) obj4;
                    String str = remoteActionCompatParcelizer2.b;
                    if ((str != null && CheckOTPSessionPresenter.d((CharSequence) str, (CharSequence) "RTGS", true)) && CheckOTPSessionPresenter.d((CharSequence) remoteActionCompatParcelizer2.b, (CharSequence) "Soli", true)) {
                        break;
                    }
                }
                onClickDetail.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = (onClickDetail.RemoteActionCompatParcelizer) obj4;
                if (remoteActionCompatParcelizer3 != null) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
                    kantorCabangROAdapter$KantorCabangROVH2.O.setText(getPromotion.b(remoteActionCompatParcelizer3.d));
                }
            } else if (CheckOTPSessionPresenter.d(g().getMembership(), "p", true)) {
                Iterator<T> it3 = ((ubahData) requireActivity()).n.iterator();
                while (it3.hasNext()) {
                    obj = it3.next();
                    onClickDetail.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = (onClickDetail.RemoteActionCompatParcelizer) obj;
                    String str2 = remoteActionCompatParcelizer4.b;
                    if ((str2 != null && CheckOTPSessionPresenter.d((CharSequence) str2, (CharSequence) "RTGS", true)) && CheckOTPSessionPresenter.d((CharSequence) remoteActionCompatParcelizer4.b, (CharSequence) "Prio", true)) {
                        break;
                    }
                }
                onClickDetail.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = (onClickDetail.RemoteActionCompatParcelizer) obj;
                if (remoteActionCompatParcelizer5 != null) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
                    kantorCabangROAdapter$KantorCabangROVH3.O.setText(getPromotion.b(remoteActionCompatParcelizer5.d));
                }
            } else {
                Iterator<T> it4 = ((ubahData) requireActivity()).n.iterator();
                while (it4.hasNext()) {
                    obj2 = it4.next();
                    onClickDetail.RemoteActionCompatParcelizer remoteActionCompatParcelizer6 = (onClickDetail.RemoteActionCompatParcelizer) obj2;
                    String str3 = remoteActionCompatParcelizer6.b;
                    if ((str3 != null && CheckOTPSessionPresenter.d((CharSequence) str3, (CharSequence) "RTGS", true)) && CheckOTPSessionPresenter.d((CharSequence) remoteActionCompatParcelizer6.b, (CharSequence) "Reg", true)) {
                        break;
                    }
                }
                onClickDetail.RemoteActionCompatParcelizer remoteActionCompatParcelizer7 = (onClickDetail.RemoteActionCompatParcelizer) obj2;
                if (remoteActionCompatParcelizer7 != null) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
                    kantorCabangROAdapter$KantorCabangROVH4.O.setText(getPromotion.b(remoteActionCompatParcelizer7.d));
                }
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseBankTujuan(goDeleteAccount godeleteaccount) {
        subscribeReservationRescheduleEvent.e(godeleteaccount, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH.d;
        subscribeReservationRescheduleEvent.d(editText, "");
        d(editText);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
        kantorCabangROAdapter$KantorCabangROVH2.H.setHintEnabled(true);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
        kantorCabangROAdapter$KantorCabangROVH3.d.setText(godeleteaccount.a);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
        kantorCabangROAdapter$KantorCabangROVH4.t.setVisibility(0);
        this.k = godeleteaccount.d;
        this.l = godeleteaccount.c;
        DetailTundaCCActivity detailTundaCCActivity = this.h;
        DetailTundaCCActivity detailTundaCCActivity2 = null;
        DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
        if (detailTundaCCActivity == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaCCActivity3 = null;
        }
        detailTundaCCActivity3.b = this.l;
        detailTundaCCActivity2 = this.f128o;
        if (detailTundaCCActivity2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        detailTundaCCActivity2.b = this.l;
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
        kantorCabangROAdapter$KantorCabangROVH5.h.setText("");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
        kantorCabangROAdapter$KantorCabangROVH6.J.setHintEnabled(false);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH7 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH7);
        kantorCabangROAdapter$KantorCabangROVH7.i.setText("");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH8 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH8);
        kantorCabangROAdapter$KantorCabangROVH8.M.setHintEnabled(false);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH9 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH9);
        kantorCabangROAdapter$KantorCabangROVH9.n.setText("");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH10 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH10);
        kantorCabangROAdapter$KantorCabangROVH10.K.setHintEnabled(false);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH11 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH11);
        kantorCabangROAdapter$KantorCabangROVH11.s.setVisibility(8);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH12 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH12);
        kantorCabangROAdapter$KantorCabangROVH12.q.setVisibility(8);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH13 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH13);
        kantorCabangROAdapter$KantorCabangROVH13.w.setChecked(true);
        this.r = false;
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH14 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH14);
        kantorCabangROAdapter$KantorCabangROVH14.a.setText("");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH15 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH15);
        kantorCabangROAdapter$KantorCabangROVH15.E.setHintEnabled(false);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH16 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH16);
        kantorCabangROAdapter$KantorCabangROVH16.e.setText("");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH17 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH17);
        kantorCabangROAdapter$KantorCabangROVH17.F.setHintEnabled(false);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH18 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH18);
        kantorCabangROAdapter$KantorCabangROVH18.l.setText("");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH19 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH19);
        kantorCabangROAdapter$KantorCabangROVH19.Q.setHintEnabled(false);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH20 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH20);
        kantorCabangROAdapter$KantorCabangROVH20.m.setText("");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH21 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH21);
        kantorCabangROAdapter$KantorCabangROVH21.R.setHintEnabled(false);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH22 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH22);
        kantorCabangROAdapter$KantorCabangROVH22.y.setChecked(true);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH23 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH23);
        kantorCabangROAdapter$KantorCabangROVH23.u.setChecked(false);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseStatusPenduduk(ReservasiSuccessAskNextActivity reservasiSuccessAskNextActivity) {
        subscribeReservationRescheduleEvent.e(reservasiSuccessAskNextActivity, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH.m;
        subscribeReservationRescheduleEvent.d(editText, "");
        d(editText);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
        kantorCabangROAdapter$KantorCabangROVH2.R.setHintEnabled(true);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
        kantorCabangROAdapter$KantorCabangROVH3.m.setText(reservasiSuccessAskNextActivity.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTipeNasabah(resetAccount resetaccount) {
        subscribeReservationRescheduleEvent.e(resetaccount, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH.l;
        subscribeReservationRescheduleEvent.d(editText, "");
        d(editText);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
        kantorCabangROAdapter$KantorCabangROVH2.Q.setHintEnabled(true);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
        kantorCabangROAdapter$KantorCabangROVH3.l.setText(resetaccount.d);
        this.C = resetaccount.e;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseUpdateDaftarTransfer(CityReservationAdapter$CityReservationVH_ViewBinding cityReservationAdapter$CityReservationVH_ViewBinding) {
        subscribeReservationRescheduleEvent.e(cityReservationAdapter$CityReservationVH_ViewBinding, "");
        Boolean bool = cityReservationAdapter$CityReservationVH_ViewBinding.e;
        subscribeReservationRescheduleEvent.d(bool, "");
        if (bool.booleanValue()) {
            b();
        } else {
            j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493153, viewGroup, false);
        Button button = (Button) setRotation.a(inflate, 2131296396);
        int i = 2131297105;
        if (button != null) {
            CheckBox checkBox = (CheckBox) setRotation.a(inflate, 2131296473);
            if (checkBox != null) {
                EditText editText = (EditText) setRotation.a(inflate, 2131296927);
                if (editText != null) {
                    EditText editText2 = (EditText) setRotation.a(inflate, 2131296948);
                    if (editText2 != null) {
                        EditText editText3 = (EditText) setRotation.a(inflate, 2131296954);
                        if (editText3 != null) {
                            EditText editText4 = (EditText) setRotation.a(inflate, 2131297044);
                            if (editText4 != null) {
                                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) setRotation.a(inflate, 2131297054);
                                if (autoCompleteTextView != null) {
                                    EditText editText5 = (EditText) setRotation.a(inflate, 2131297080);
                                    if (editText5 != null) {
                                        EditText editText6 = (EditText) setRotation.a(inflate, 2131297105);
                                        if (editText6 != null) {
                                            AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) setRotation.a(inflate, 2131297107);
                                            if (autoCompleteTextView2 != null) {
                                                setAnnualFeeAddOnDisplayAmount setannualfeeaddondisplayamount = (setAnnualFeeAddOnDisplayAmount) setRotation.a(inflate, 2131297119);
                                                if (setannualfeeaddondisplayamount != null) {
                                                    EditText editText7 = (EditText) setRotation.a(inflate, 2131297190);
                                                    if (editText7 != null) {
                                                        EditText editText8 = (EditText) setRotation.a(inflate, 2131297209);
                                                        if (editText8 != null) {
                                                            ImageView imageView = (ImageView) setRotation.a(inflate, 2131297391);
                                                            if (imageView != null) {
                                                                LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297830);
                                                                if (linearLayout != null) {
                                                                    LinearLayout linearLayout2 = (LinearLayout) setRotation.a(inflate, 2131297865);
                                                                    if (linearLayout2 != null) {
                                                                        LinearLayout linearLayout3 = (LinearLayout) setRotation.a(inflate, 2131297934);
                                                                        if (linearLayout3 != null) {
                                                                            LinearLayout linearLayout4 = (LinearLayout) setRotation.a(inflate, 2131297936);
                                                                            if (linearLayout4 != null) {
                                                                                LinearLayout linearLayout5 = (LinearLayout) setRotation.a(inflate, 2131297957);
                                                                                if (linearLayout5 != null) {
                                                                                    LinearLayout linearLayout6 = (LinearLayout) setRotation.a(inflate, 2131297961);
                                                                                    if (linearLayout6 != null) {
                                                                                        RadioButton radioButton = (RadioButton) setRotation.a(inflate, 2131298153);
                                                                                        if (radioButton != null) {
                                                                                            RadioButton radioButton2 = (RadioButton) setRotation.a(inflate, 2131298154);
                                                                                            if (radioButton2 != null) {
                                                                                                RadioButton radioButton3 = (RadioButton) setRotation.a(inflate, 2131298170);
                                                                                                if (radioButton3 != null) {
                                                                                                    RadioButton radioButton4 = (RadioButton) setRotation.a(inflate, 2131298171);
                                                                                                    if (radioButton4 != null) {
                                                                                                        RadioButton radioButton5 = (RadioButton) setRotation.a(inflate, 2131298185);
                                                                                                        if (radioButton5 != null) {
                                                                                                            RadioButton radioButton6 = (RadioButton) setRotation.a(inflate, 2131298195);
                                                                                                            if (radioButton6 != null) {
                                                                                                                RadioGroup radioGroup = (RadioGroup) setRotation.a(inflate, 2131298219);
                                                                                                                if (radioGroup != null) {
                                                                                                                    RadioGroup radioGroup2 = (RadioGroup) setRotation.a(inflate, 2131298228);
                                                                                                                    if (radioGroup2 != null) {
                                                                                                                        RadioGroup radioGroup3 = (RadioGroup) setRotation.a(inflate, 2131298230);
                                                                                                                        if (radioGroup3 != null) {
                                                                                                                            ScrollView scrollView = (ScrollView) inflate;
                                                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298476);
                                                                                                                            if (logoutDialog_ViewBinding != null) {
                                                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298498);
                                                                                                                                if (logoutDialog_ViewBinding2 != null) {
                                                                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298504);
                                                                                                                                    if (logoutDialog_ViewBinding3 != null) {
                                                                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298591);
                                                                                                                                        if (logoutDialog_ViewBinding4 != null) {
                                                                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298601);
                                                                                                                                            if (logoutDialog_ViewBinding5 != null) {
                                                                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298626);
                                                                                                                                                if (logoutDialog_ViewBinding6 != null) {
                                                                                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298651);
                                                                                                                                                    if (logoutDialog_ViewBinding7 != null) {
                                                                                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298653);
                                                                                                                                                        if (logoutDialog_ViewBinding8 != null) {
                                                                                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298665);
                                                                                                                                                            if (logoutDialog_ViewBinding9 != null) {
                                                                                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298722);
                                                                                                                                                                if (logoutDialog_ViewBinding10 != null) {
                                                                                                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298741);
                                                                                                                                                                    if (logoutDialog_ViewBinding11 != null) {
                                                                                                                                                                        TextView textView = (TextView) setRotation.a(inflate, 2131298774);
                                                                                                                                                                        if (textView != null) {
                                                                                                                                                                            setTypeface settypeface = (setTypeface) setRotation.a(inflate, 2131298859);
                                                                                                                                                                            if (settypeface != null) {
                                                                                                                                                                                TextView textView2 = (TextView) setRotation.a(inflate, 2131298956);
                                                                                                                                                                                if (textView2 != null) {
                                                                                                                                                                                    TextView textView3 = (TextView) setRotation.a(inflate, 2131298977);
                                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                                        TextView textView4 = (TextView) setRotation.a(inflate, 2131298984);
                                                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                                                            TextView textView5 = (TextView) setRotation.a(inflate, 2131299067);
                                                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                                                TextView textView6 = (TextView) setRotation.a(inflate, 2131299078);
                                                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                                                    TextView textView7 = (TextView) setRotation.a(inflate, 2131299102);
                                                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                                                        TextView textView8 = (TextView) setRotation.a(inflate, 2131299124);
                                                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                                                            TextView textView9 = (TextView) setRotation.a(inflate, 2131299126);
                                                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                                                TextView textView10 = (TextView) setRotation.a(inflate, 2131299137);
                                                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                                                    TextView textView11 = (TextView) setRotation.a(inflate, 2131299190);
                                                                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                                                                        TextView textView12 = (TextView) setRotation.a(inflate, 2131299209);
                                                                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                                                                            TextView textView13 = (TextView) setRotation.a(inflate, 2131299400);
                                                                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                                                                TextView textView14 = (TextView) setRotation.a(inflate, 2131299572);
                                                                                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                                                                                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = new KantorCabangROAdapter$KantorCabangROVH(scrollView, button, checkBox, editText, editText2, editText3, editText4, autoCompleteTextView, editText5, editText6, autoCompleteTextView2, setannualfeeaddondisplayamount, editText7, editText8, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioGroup, radioGroup2, radioGroup3, scrollView, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, logoutDialog_ViewBinding10, logoutDialog_ViewBinding11, textView, settypeface, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
                                                                                                                                                                                                                                    this.a = kantorCabangROAdapter$KantorCabangROVH;
                                                                                                                                                                                                                                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
                                                                                                                                                                                                                                    ScrollView scrollView2 = kantorCabangROAdapter$KantorCabangROVH.A;
                                                                                                                                                                                                                                    subscribeReservationRescheduleEvent.d(scrollView2, "");
                                                                                                                                                                                                                                    return scrollView2;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                i = 2131299572;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                i = 2131299400;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            i = 2131299209;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        i = 2131299190;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    i = 2131299137;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                i = 2131299126;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            i = 2131299124;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        i = 2131299102;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    i = 2131299078;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                i = 2131299067;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i = 2131298984;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i = 2131298977;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i = 2131298956;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                i = 2131298859;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i = 2131298774;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i = 2131298741;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i = 2131298722;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = 2131298665;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = 2131298653;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = 2131298651;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = 2131298626;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = 2131298601;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = 2131298591;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = 2131298504;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = 2131298498;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = 2131298476;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = 2131298230;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = 2131298228;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = 2131298219;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = 2131298195;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = 2131298185;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = 2131298171;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = 2131298170;
                                                                                                }
                                                                                            } else {
                                                                                                i = 2131298154;
                                                                                            }
                                                                                        } else {
                                                                                            i = 2131298153;
                                                                                        }
                                                                                    } else {
                                                                                        i = 2131297961;
                                                                                    }
                                                                                } else {
                                                                                    i = 2131297957;
                                                                                }
                                                                            } else {
                                                                                i = 2131297936;
                                                                            }
                                                                        } else {
                                                                            i = 2131297934;
                                                                        }
                                                                    } else {
                                                                        i = 2131297865;
                                                                    }
                                                                } else {
                                                                    i = 2131297830;
                                                                }
                                                            } else {
                                                                i = 2131297391;
                                                            }
                                                        } else {
                                                            i = 2131297209;
                                                        }
                                                    } else {
                                                        i = 2131297190;
                                                    }
                                                } else {
                                                    i = 2131297119;
                                                }
                                            } else {
                                                i = 2131297107;
                                            }
                                        }
                                    } else {
                                        i = 2131297080;
                                    }
                                } else {
                                    i = 2131297054;
                                }
                            } else {
                                i = 2131297044;
                            }
                        } else {
                            i = 2131296954;
                        }
                    } else {
                        i = 2131296948;
                    }
                } else {
                    i = 2131296927;
                }
            } else {
                i = 2131296473;
            }
        } else {
            i = 2131296396;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        documentProvider.b().e(this);
        CategoriesKUPresenter categoriesKUPresenter = (CategoriesKUPresenter) this.s.d();
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call = categoriesKUPresenter.c;
        if (call != null) {
            call.cancel();
        }
        categoriesKUPresenter.b = null;
        CheckDaftarTransferORPresenter checkDaftarTransferORPresenter = (CheckDaftarTransferORPresenter) this.x.d();
        Call<OpenAccountSuccessActivity<Object>> call2 = checkDaftarTransferORPresenter.e;
        if (call2 != null) {
            call2.cancel();
        }
        checkDaftarTransferORPresenter.a = null;
        DaftarTransferPresenter daftarTransferPresenter = (DaftarTransferPresenter) this.u.d();
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call3 = daftarTransferPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        daftarTransferPresenter.c = null;
        ((UpdateDeleteDaftarTransferPresenter) this.y.d()).c();
        onDestroyView();
        this.a = null;
        this.e.clear();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onDismissUpdateDaftarTransfer(ConfirmBCACardAdapter$ViewHolder_ViewBinding confirmBCACardAdapter$ViewHolder_ViewBinding) {
        subscribeReservationRescheduleEvent.e(confirmBCACardAdapter$ViewHolder_ViewBinding, "");
        if (!this.t) {
            j();
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        if (z) {
            subscribeReservationRescheduleEvent.c(view);
            switch (view.getId()) {
                case 2131296927:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
                    kantorCabangROAdapter$KantorCabangROVH.F.setHintEnabled(true);
                    return;
                case 2131296954:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
                    kantorCabangROAdapter$KantorCabangROVH2.E.setHintEnabled(true);
                    return;
                case 2131297054:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
                    kantorCabangROAdapter$KantorCabangROVH3.M.setHintEnabled(true);
                    return;
                case 2131297107:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
                    kantorCabangROAdapter$KantorCabangROVH4.J.setHintEnabled(true);
                    return;
                case 2131297119:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
                    kantorCabangROAdapter$KantorCabangROVH5.K.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            subscribeReservationRescheduleEvent.c(view);
            switch (view.getId()) {
                case 2131296927:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
                    if (kantorCabangROAdapter$KantorCabangROVH6.e.getText().toString().length() != 0) {
                        z5 = false;
                    }
                    if (z5) {
                        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH7 = this.a;
                        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH7);
                        kantorCabangROAdapter$KantorCabangROVH7.F.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296954:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH8 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH8);
                    if (kantorCabangROAdapter$KantorCabangROVH8.a.getText().toString().length() != 0) {
                        z4 = false;
                    }
                    if (z4) {
                        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH9 = this.a;
                        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH9);
                        kantorCabangROAdapter$KantorCabangROVH9.E.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297054:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH10 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH10);
                    if (kantorCabangROAdapter$KantorCabangROVH10.i.getText().toString().length() != 0) {
                        z3 = false;
                    }
                    if (z3) {
                        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH11 = this.a;
                        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH11);
                        kantorCabangROAdapter$KantorCabangROVH11.M.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297107:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH12 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH12);
                    if (kantorCabangROAdapter$KantorCabangROVH12.h.getText().toString().length() != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH13 = this.a;
                        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH13);
                        kantorCabangROAdapter$KantorCabangROVH13.J.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297119:
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH14 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH14);
                    if (String.valueOf(kantorCabangROAdapter$KantorCabangROVH14.n.getText()).length() != 0) {
                        z6 = false;
                    }
                    if (z6) {
                        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH15 = this.a;
                        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH15);
                        kantorCabangROAdapter$KantorCabangROVH15.K.setHintEnabled(false);
                        String c = getPromotion.c("0");
                        subscribeReservationRescheduleEvent.d(c, "");
                        k(c);
                        return;
                    }
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH16 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH16);
                    String c2 = getPromotion.c(String.valueOf(kantorCabangROAdapter$KantorCabangROVH16.n.getText()));
                    subscribeReservationRescheduleEvent.d(c2, "");
                    k(c2);
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH17 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH17);
                    setAnnualFeeAddOnDisplayAmount setannualfeeaddondisplayamount = kantorCabangROAdapter$KantorCabangROVH17.n;
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH18 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH18);
                    setannualfeeaddondisplayamount.setText(getPromotion.b(String.valueOf(kantorCabangROAdapter$KantorCabangROVH18.n.getText()).replaceAll("[^0-9.,]", "")));
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        getPromotion.d(getActivity());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        if (kantorCabangROAdapter$KantorCabangROVH.i.isFocused()) {
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
            kantorCabangROAdapter$KantorCabangROVH2.i.setAdapter(null);
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
            AutoCompleteTextView autoCompleteTextView = kantorCabangROAdapter$KantorCabangROVH3.i;
            DetailTundaCCActivity detailTundaCCActivity = this.h;
            DetailTundaCCActivity detailTundaCCActivity2 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity2 = null;
            }
            autoCompleteTextView.setText(detailTundaCCActivity2.d.get(i).d);
            try {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
                AutoCompleteTextView autoCompleteTextView2 = kantorCabangROAdapter$KantorCabangROVH4.i;
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
                autoCompleteTextView2.setSelection(kantorCabangROAdapter$KantorCabangROVH5.i.length());
            } catch (Exception e) {
                e.printStackTrace();
            }
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
            AutoCompleteTextView autoCompleteTextView3 = kantorCabangROAdapter$KantorCabangROVH6.i;
            DetailTundaCCActivity detailTundaCCActivity3 = this.h;
            DetailTundaCCActivity detailTundaCCActivity4 = detailTundaCCActivity3;
            if (detailTundaCCActivity3 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity4 = null;
            }
            autoCompleteTextView3.setAdapter(detailTundaCCActivity4);
            DetailTundaCCActivity detailTundaCCActivity5 = this.h;
            DetailTundaCCActivity detailTundaCCActivity6 = detailTundaCCActivity5;
            if (detailTundaCCActivity5 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity6 = null;
            }
            this.w = detailTundaCCActivity6.d.get(i);
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH7 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH7);
            AutoCompleteTextView autoCompleteTextView4 = kantorCabangROAdapter$KantorCabangROVH7.h;
            DetailTundaCCActivity detailTundaCCActivity7 = this.h;
            DetailTundaCCActivity detailTundaCCActivity8 = detailTundaCCActivity7;
            if (detailTundaCCActivity7 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity8 = null;
            }
            autoCompleteTextView4.setText(detailTundaCCActivity8.d.get(i).b);
            try {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH8 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH8);
                AutoCompleteTextView autoCompleteTextView5 = kantorCabangROAdapter$KantorCabangROVH8.h;
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH9 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH9);
                autoCompleteTextView5.setSelection(kantorCabangROAdapter$KantorCabangROVH9.h.length());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH10 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH10);
            kantorCabangROAdapter$KantorCabangROVH10.J.setHintEnabled(true);
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH11 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH11);
            EditText editText = kantorCabangROAdapter$KantorCabangROVH11.e;
            DetailTundaCCActivity detailTundaCCActivity9 = this.h;
            DetailTundaCCActivity detailTundaCCActivity10 = detailTundaCCActivity9;
            if (detailTundaCCActivity9 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity10 = null;
            }
            editText.setText(detailTundaCCActivity10.d.get(i).i);
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH12 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH12);
            EditText editText2 = kantorCabangROAdapter$KantorCabangROVH12.e;
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH13 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH13);
            editText2.setSelection(kantorCabangROAdapter$KantorCabangROVH13.e.length());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH14 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH14);
            kantorCabangROAdapter$KantorCabangROVH14.F.setHintEnabled(true);
            DetailTundaCCActivity detailTundaCCActivity11 = this.h;
            DetailTundaCCActivity detailTundaCCActivity12 = detailTundaCCActivity11;
            if (detailTundaCCActivity11 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity12 = null;
            }
            String str = detailTundaCCActivity12.d.get(i).f;
            if (str != null) {
                switch (str.hashCode()) {
                    case 49:
                        if (str.equals("1")) {
                            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH15 = this.a;
                            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH15);
                            kantorCabangROAdapter$KantorCabangROVH15.l.setText("Perorangan");
                            this.C = 1;
                            break;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH16 = this.a;
                            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH16);
                            kantorCabangROAdapter$KantorCabangROVH16.l.setText("Perusahaan");
                            this.C = 2;
                            break;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH17 = this.a;
                            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH17);
                            kantorCabangROAdapter$KantorCabangROVH17.l.setText("Pemerintah");
                            this.C = 3;
                            break;
                        }
                        break;
                }
            }
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH18 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH18);
            EditText editText3 = kantorCabangROAdapter$KantorCabangROVH18.l;
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH19 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH19);
            editText3.setSelection(kantorCabangROAdapter$KantorCabangROVH19.l.length());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH20 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH20);
            kantorCabangROAdapter$KantorCabangROVH20.Q.setHintEnabled(true);
            DetailTundaCCActivity detailTundaCCActivity13 = this.h;
            DetailTundaCCActivity detailTundaCCActivity14 = detailTundaCCActivity13;
            if (detailTundaCCActivity13 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity14 = null;
            }
            String str2 = detailTundaCCActivity14.d.get(i).g;
            if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "R")) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH21 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH21);
                kantorCabangROAdapter$KantorCabangROVH21.m.setText("Penduduk");
            } else if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "N")) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH22 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH22);
                kantorCabangROAdapter$KantorCabangROVH22.m.setText("Non Penduduk");
            }
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH23 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH23);
            EditText editText4 = kantorCabangROAdapter$KantorCabangROVH23.m;
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH24 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH24);
            editText4.setSelection(kantorCabangROAdapter$KantorCabangROVH24.m.length());
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH25 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH25);
            kantorCabangROAdapter$KantorCabangROVH25.R.setHintEnabled(true);
            DetailTundaCCActivity detailTundaCCActivity15 = this.h;
            DetailTundaCCActivity detailTundaCCActivity16 = detailTundaCCActivity15;
            if (detailTundaCCActivity15 == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity16 = null;
            }
            String str3 = detailTundaCCActivity16.d.get(i).h;
            if (subscribeReservationRescheduleEvent.b((Object) str3, (Object) "1")) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH26 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH26);
                kantorCabangROAdapter$KantorCabangROVH26.y.setChecked(true);
            } else if (subscribeReservationRescheduleEvent.b((Object) str3, (Object) "2")) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH27 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH27);
                kantorCabangROAdapter$KantorCabangROVH27.u.setChecked(true);
            }
        } else {
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH28 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH28);
            if (kantorCabangROAdapter$KantorCabangROVH28.h.isFocused()) {
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH29 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH29);
                kantorCabangROAdapter$KantorCabangROVH29.h.setAdapter(null);
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH30 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH30);
                AutoCompleteTextView autoCompleteTextView6 = kantorCabangROAdapter$KantorCabangROVH30.h;
                DetailTundaCCActivity detailTundaCCActivity17 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity18 = detailTundaCCActivity17;
                if (detailTundaCCActivity17 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity18 = null;
                }
                autoCompleteTextView6.setText(detailTundaCCActivity18.d.get(i).b);
                try {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH31 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH31);
                    AutoCompleteTextView autoCompleteTextView7 = kantorCabangROAdapter$KantorCabangROVH31.h;
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH32 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH32);
                    autoCompleteTextView7.setSelection(kantorCabangROAdapter$KantorCabangROVH32.h.length());
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH33 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH33);
                AutoCompleteTextView autoCompleteTextView8 = kantorCabangROAdapter$KantorCabangROVH33.h;
                DetailTundaCCActivity detailTundaCCActivity19 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity20 = detailTundaCCActivity19;
                if (detailTundaCCActivity19 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity20 = null;
                }
                autoCompleteTextView8.setAdapter(detailTundaCCActivity20);
                DetailTundaCCActivity detailTundaCCActivity21 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity22 = detailTundaCCActivity21;
                if (detailTundaCCActivity21 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity22 = null;
                }
                this.w = detailTundaCCActivity22.d.get(i);
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH34 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH34);
                AutoCompleteTextView autoCompleteTextView9 = kantorCabangROAdapter$KantorCabangROVH34.i;
                DetailTundaCCActivity detailTundaCCActivity23 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity24 = detailTundaCCActivity23;
                if (detailTundaCCActivity23 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity24 = null;
                }
                autoCompleteTextView9.setText(detailTundaCCActivity24.d.get(i).d);
                try {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH35 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH35);
                    AutoCompleteTextView autoCompleteTextView10 = kantorCabangROAdapter$KantorCabangROVH35.i;
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH36 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH36);
                    autoCompleteTextView10.setSelection(kantorCabangROAdapter$KantorCabangROVH36.i.length());
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH37 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH37);
                kantorCabangROAdapter$KantorCabangROVH37.M.setHintEnabled(true);
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH38 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH38);
                EditText editText5 = kantorCabangROAdapter$KantorCabangROVH38.e;
                DetailTundaCCActivity detailTundaCCActivity25 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity26 = detailTundaCCActivity25;
                if (detailTundaCCActivity25 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity26 = null;
                }
                editText5.setText(detailTundaCCActivity26.d.get(i).i);
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH39 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH39);
                EditText editText6 = kantorCabangROAdapter$KantorCabangROVH39.e;
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH40 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH40);
                editText6.setSelection(kantorCabangROAdapter$KantorCabangROVH40.e.length());
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH41 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH41);
                kantorCabangROAdapter$KantorCabangROVH41.F.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity27 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity28 = detailTundaCCActivity27;
                if (detailTundaCCActivity27 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity28 = null;
                }
                String str4 = detailTundaCCActivity28.d.get(i).f;
                if (str4 != null) {
                    switch (str4.hashCode()) {
                        case 49:
                            if (str4.equals("1")) {
                                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH42 = this.a;
                                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH42);
                                kantorCabangROAdapter$KantorCabangROVH42.l.setText("Perorangan");
                                this.C = 1;
                                break;
                            }
                            break;
                        case 50:
                            if (str4.equals("2")) {
                                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH43 = this.a;
                                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH43);
                                kantorCabangROAdapter$KantorCabangROVH43.l.setText("Perusahaan");
                                this.C = 2;
                                break;
                            }
                            break;
                        case 51:
                            if (str4.equals("3")) {
                                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH44 = this.a;
                                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH44);
                                kantorCabangROAdapter$KantorCabangROVH44.l.setText("Pemerintah");
                                this.C = 3;
                                break;
                            }
                            break;
                    }
                }
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH45 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH45);
                EditText editText7 = kantorCabangROAdapter$KantorCabangROVH45.l;
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH46 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH46);
                editText7.setSelection(kantorCabangROAdapter$KantorCabangROVH46.l.length());
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH47 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH47);
                kantorCabangROAdapter$KantorCabangROVH47.Q.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity29 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity30 = detailTundaCCActivity29;
                if (detailTundaCCActivity29 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity30 = null;
                }
                String str5 = detailTundaCCActivity30.d.get(i).g;
                if (subscribeReservationRescheduleEvent.b((Object) str5, (Object) "R")) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH48 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH48);
                    kantorCabangROAdapter$KantorCabangROVH48.m.setText("Penduduk");
                } else if (subscribeReservationRescheduleEvent.b((Object) str5, (Object) "N")) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH49 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH49);
                    kantorCabangROAdapter$KantorCabangROVH49.m.setText("Non Penduduk");
                }
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH50 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH50);
                EditText editText8 = kantorCabangROAdapter$KantorCabangROVH50.m;
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH51 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH51);
                editText8.setSelection(kantorCabangROAdapter$KantorCabangROVH51.m.length());
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH52 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH52);
                kantorCabangROAdapter$KantorCabangROVH52.R.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity31 = this.f128o;
                DetailTundaCCActivity detailTundaCCActivity32 = detailTundaCCActivity31;
                if (detailTundaCCActivity31 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity32 = null;
                }
                String str6 = detailTundaCCActivity32.d.get(i).h;
                if (subscribeReservationRescheduleEvent.b((Object) str6, (Object) "1")) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH53 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH53);
                    kantorCabangROAdapter$KantorCabangROVH53.y.setChecked(true);
                } else if (subscribeReservationRescheduleEvent.b((Object) str6, (Object) "2")) {
                    KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH54 = this.a;
                    subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH54);
                    kantorCabangROAdapter$KantorCabangROVH54.u.setChecked(true);
                }
            }
        }
        DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver = this.w;
        subscribeReservationRescheduleEvent.c(detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver);
        if (detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.c.equals(this.l)) {
            DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver2 = this.w;
            subscribeReservationRescheduleEvent.c(detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver2);
            String str7 = detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver2.a;
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH55 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH55);
            if (!str7.equals(kantorCabangROAdapter$KantorCabangROVH55.d.getText().toString())) {
                this.t = true;
                Bundle bundle = new Bundle();
                NomorOTPAdapter$NomorOTPVH.IconCompatParcelizer iconCompatParcelizer = NomorOTPAdapter$NomorOTPVH.c;
                String str8 = NomorOTPAdapter$NomorOTPVH.i;
                DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver3 = this.w;
                subscribeReservationRescheduleEvent.c(detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver3);
                bundle.putString(str8, detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver3.a);
                NomorOTPAdapter$NomorOTPVH.IconCompatParcelizer iconCompatParcelizer2 = NomorOTPAdapter$NomorOTPVH.c;
                String str9 = NomorOTPAdapter$NomorOTPVH.d;
                KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH56 = this.a;
                subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH56);
                bundle.putString(str9, kantorCabangROAdapter$KantorCabangROVH56.d.getText().toString());
                NomorOTPAdapter$NomorOTPVH nomorOTPAdapter$NomorOTPVH = new NomorOTPAdapter$NomorOTPVH();
                nomorOTPAdapter$NomorOTPVH.setArguments(bundle);
                isDetached parentFragmentManager = getParentFragmentManager();
                NomorOTPAdapter$NomorOTPVH.IconCompatParcelizer iconCompatParcelizer3 = NomorOTPAdapter$NomorOTPVH.c;
                nomorOTPAdapter$NomorOTPVH.show(parentFragmentManager, NomorOTPAdapter$NomorOTPVH.h);
            }
        }
        DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver4 = this.w;
        this.D = detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver4 != null ? detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver4.l : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        ((CategoriesKUPresenter) this.s.d()).b = this;
        ((CheckDaftarTransferORPresenter) this.x.d()).a = this;
        ((UpdateDeleteDaftarTransferPresenter) this.y.d()).a = this;
        ((DaftarTransferPresenter) this.u.d()).c = this;
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH);
        EditText editText = kantorCabangROAdapter$KantorCabangROVH.d;
        subscribeReservationRescheduleEvent.d(editText, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH2 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH2);
        AutoCompleteTextView autoCompleteTextView = kantorCabangROAdapter$KantorCabangROVH2.h;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH3 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH3);
        AutoCompleteTextView autoCompleteTextView2 = kantorCabangROAdapter$KantorCabangROVH3.i;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH4 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH4);
        setAnnualFeeAddOnDisplayAmount setannualfeeaddondisplayamount = kantorCabangROAdapter$KantorCabangROVH4.n;
        subscribeReservationRescheduleEvent.d(setannualfeeaddondisplayamount, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH5 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH5);
        EditText editText2 = kantorCabangROAdapter$KantorCabangROVH5.a;
        subscribeReservationRescheduleEvent.d(editText2, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH6 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH6);
        EditText editText3 = kantorCabangROAdapter$KantorCabangROVH6.e;
        subscribeReservationRescheduleEvent.d(editText3, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH7 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH7);
        EditText editText4 = kantorCabangROAdapter$KantorCabangROVH7.l;
        subscribeReservationRescheduleEvent.d(editText4, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH8 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH8);
        EditText editText5 = kantorCabangROAdapter$KantorCabangROVH8.m;
        subscribeReservationRescheduleEvent.d(editText5, "");
        EditText[] editTextArr = {editText, autoCompleteTextView, autoCompleteTextView2, setannualfeeaddondisplayamount, editText2, editText3, editText4, editText5};
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        List<? extends EditText> asList = Arrays.asList(editTextArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        this.q = asList;
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH9 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH9);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = kantorCabangROAdapter$KantorCabangROVH9.H;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH10 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH10);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = kantorCabangROAdapter$KantorCabangROVH10.J;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH11 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH11);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = kantorCabangROAdapter$KantorCabangROVH11.M;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH12 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH12);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = kantorCabangROAdapter$KantorCabangROVH12.K;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH13 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH13);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = kantorCabangROAdapter$KantorCabangROVH13.E;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH14 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH14);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = kantorCabangROAdapter$KantorCabangROVH14.F;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH15 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH15);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = kantorCabangROAdapter$KantorCabangROVH15.Q;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH16 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH16);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = kantorCabangROAdapter$KantorCabangROVH16.R;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
        LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8};
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
        subscribeReservationRescheduleEvent.d(asList2, "");
        this.p = asList2;
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH17 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH17);
        TextView textView = kantorCabangROAdapter$KantorCabangROVH17.W;
        subscribeReservationRescheduleEvent.d(textView, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH18 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH18);
        TextView textView2 = kantorCabangROAdapter$KantorCabangROVH18.ac;
        subscribeReservationRescheduleEvent.d(textView2, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH19 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH19);
        TextView textView3 = kantorCabangROAdapter$KantorCabangROVH19.X;
        subscribeReservationRescheduleEvent.d(textView3, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH20 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH20);
        TextView textView4 = kantorCabangROAdapter$KantorCabangROVH20.aa;
        subscribeReservationRescheduleEvent.d(textView4, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH21 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH21);
        TextView textView5 = kantorCabangROAdapter$KantorCabangROVH21.T;
        subscribeReservationRescheduleEvent.d(textView5, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH22 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH22);
        TextView textView6 = kantorCabangROAdapter$KantorCabangROVH22.S;
        subscribeReservationRescheduleEvent.d(textView6, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH23 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH23);
        TextView textView7 = kantorCabangROAdapter$KantorCabangROVH23.Z;
        subscribeReservationRescheduleEvent.d(textView7, "");
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH24 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH24);
        TextView textView8 = kantorCabangROAdapter$KantorCabangROVH24.Y;
        subscribeReservationRescheduleEvent.d(textView8, "");
        TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8};
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        List<? extends TextView> asList3 = Arrays.asList(textViewArr);
        subscribeReservationRescheduleEvent.d(asList3, "");
        this.d = asList3;
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH25 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH25);
        kantorCabangROAdapter$KantorCabangROVH25.d.setOnClickListener(new View.OnClickListener() { // from class: o.TransaksiTundaAdapter$HeaderTransaksiTertundaVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH26 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH26);
        kantorCabangROAdapter$KantorCabangROVH26.l.setOnClickListener(new View.OnClickListener() { // from class: o.TransaksiTundaDetailAdapter$TransaksiTundaDetailAdapterVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.a(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH27 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH27);
        kantorCabangROAdapter$KantorCabangROVH27.m.setOnClickListener(new View.OnClickListener() { // from class: o.TransaksiTundaAdapter$TransaksiTertundaVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.d(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH28 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH28);
        AutoCompleteTextView autoCompleteTextView3 = kantorCabangROAdapter$KantorCabangROVH28.i;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView3, "");
        autoCompleteTextView3.addTextChangedListener(new TextWatcher() { // from class: o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$MediaItem
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this;
                AutoCompleteTextView autoCompleteTextView4 = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding).i;
                subscribeReservationRescheduleEvent.d(autoCompleteTextView4, "");
                transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(autoCompleteTextView4);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH29 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH29);
        AutoCompleteTextView autoCompleteTextView4 = kantorCabangROAdapter$KantorCabangROVH29.h;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView4, "");
        autoCompleteTextView4.addTextChangedListener(new MediaMetadataCompat());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH30 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH30);
        kantorCabangROAdapter$KantorCabangROVH30.n.addTextChangedListener(new MediaDescriptionCompat());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH31 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH31);
        EditText editText6 = kantorCabangROAdapter$KantorCabangROVH31.a;
        subscribeReservationRescheduleEvent.d(editText6, "");
        editText6.addTextChangedListener(new TextWatcher() { // from class: o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$SearchResultReceiver
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this;
                EditText editText7 = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding).a;
                subscribeReservationRescheduleEvent.d(editText7, "");
                transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(editText7);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH32 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH32);
        EditText editText7 = kantorCabangROAdapter$KantorCabangROVH32.e;
        subscribeReservationRescheduleEvent.d(editText7, "");
        editText7.addTextChangedListener(new TextWatcher() { // from class: o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding$MediaBrowserCompat$ItemReceiver
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this;
                EditText editText8 = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding).e;
                subscribeReservationRescheduleEvent.d(editText8, "");
                transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.e(editText8);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH33 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH33);
        kantorCabangROAdapter$KantorCabangROVH33.c.setOnClickListener(new View.OnClickListener() { // from class: o.TransaksiTundaAdapter$TransaksiTertundaVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.b(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH34 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH34);
        kantorCabangROAdapter$KantorCabangROVH34.D.setOnCheckedChangeListener(this);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH35 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH35);
        kantorCabangROAdapter$KantorCabangROVH35.k.setOnClickListener(new View.OnClickListener() { // from class: o.TransaksiTundaAdapter$HeaderTransaksiTertundaVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.c(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH36 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH36);
        kantorCabangROAdapter$KantorCabangROVH36.P.setOnClickListener(new View.OnClickListener() { // from class: o.TujuanPembelianBNAdapter$TujuanPembelianBNVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.g(TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.this, view2);
            }
        });
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH37 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH37);
        AutoCompleteTextView autoCompleteTextView5 = kantorCabangROAdapter$KantorCabangROVH37.i;
        TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = this;
        autoCompleteTextView5.setOnFocusChangeListener(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH38 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH38);
        kantorCabangROAdapter$KantorCabangROVH38.h.setOnFocusChangeListener(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH39 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH39);
        kantorCabangROAdapter$KantorCabangROVH39.n.setOnFocusChangeListener(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH40 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH40);
        kantorCabangROAdapter$KantorCabangROVH40.a.setOnFocusChangeListener(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH41 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH41);
        kantorCabangROAdapter$KantorCabangROVH41.e.setOnFocusChangeListener(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH42 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH42);
        kantorCabangROAdapter$KantorCabangROVH42.e.setOnEditorActionListener(new setCardDescription());
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH43 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH43);
        kantorCabangROAdapter$KantorCabangROVH43.a.setOnEditorActionListener(new setCardDescription());
        String string = Settings.Secure.getString(requireContext().getContentResolver(), "default_input_method");
        subscribeReservationRescheduleEvent.d(string, "");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        subscribeReservationRescheduleEvent.d(lowerCase, "");
        if (CheckOTPSessionPresenter.d((CharSequence) lowerCase, (CharSequence) "samsung", false)) {
            KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH44 = this.a;
            subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH44);
            kantorCabangROAdapter$KantorCabangROVH44.n.setInputType(3);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string2 = arguments.getString("type", "");
            subscribeReservationRescheduleEvent.d(string2, "");
            subscribeReservationRescheduleEvent.e(string2, "");
            this.c = string2;
            this.A = arguments.getInt("position");
        }
        ubahData ubahdata = (ubahData) getActivity();
        subscribeReservationRescheduleEvent.c(ubahdata);
        List<? extends DaftarTransferResponse.DaftarTransferOutput> list = ubahdata.l;
        this.n = list;
        if (list == null) {
            this.n = new ArrayList();
        }
        this.h = new DetailTundaCCActivity(getActivity(), this.n, 0);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH45 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH45);
        AutoCompleteTextView autoCompleteTextView6 = kantorCabangROAdapter$KantorCabangROVH45.i;
        DetailTundaCCActivity detailTundaCCActivity = this.h;
        String str = null;
        DetailTundaCCActivity detailTundaCCActivity2 = detailTundaCCActivity;
        if (detailTundaCCActivity == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaCCActivity2 = null;
        }
        autoCompleteTextView6.setAdapter(detailTundaCCActivity2);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH46 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH46);
        AutoCompleteTextView autoCompleteTextView7 = kantorCabangROAdapter$KantorCabangROVH46.i;
        TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding2 = this;
        autoCompleteTextView7.setOnItemClickListener(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding2);
        this.f128o = new DetailTundaCCActivity(getActivity(), this.n, 1);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH47 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH47);
        AutoCompleteTextView autoCompleteTextView8 = kantorCabangROAdapter$KantorCabangROVH47.h;
        DetailTundaCCActivity detailTundaCCActivity3 = this.f128o;
        DetailTundaCCActivity detailTundaCCActivity4 = detailTundaCCActivity3;
        if (detailTundaCCActivity3 == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaCCActivity4 = null;
        }
        autoCompleteTextView8.setAdapter(detailTundaCCActivity4);
        KantorCabangROAdapter$KantorCabangROVH kantorCabangROAdapter$KantorCabangROVH48 = this.a;
        subscribeReservationRescheduleEvent.c(kantorCabangROAdapter$KantorCabangROVH48);
        kantorCabangROAdapter$KantorCabangROVH48.h.setOnItemClickListener(transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding2);
        str = this.c;
        if (str == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        if (CheckOTPSessionPresenter.d(str, "edit", true)) {
            e(this.A);
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void t() {
    }

    @Override // com.bca.smartbranch.presenter.CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void u() {
        h();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void v() {
        ((DaftarTransferPresenter) this.u.d()).d(new InfoProductActivity(g().getEmail(), g().getSessionId(), g().getImei(), "Transfer ke Bank Lain"), true);
    }
}
