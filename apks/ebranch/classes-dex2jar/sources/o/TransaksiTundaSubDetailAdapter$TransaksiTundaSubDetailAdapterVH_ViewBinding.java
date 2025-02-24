package o;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.dialog.PilihRekeningDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import io.realm.RealmQuery;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.class */
public final class TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding extends BaseFragmentKotlin implements View.OnFocusChangeListener, RadioGroup.OnCheckedChangeListener {
    public static final IconCompatParcelizer a = new IconCompatParcelizer((byte) 0);
    private static final String e = "BankTransferDataPengirimA";
    private List<? extends EditText> b;
    public Map<Integer, View> c = new LinkedHashMap();
    private KantorCabangAdapter$KantorCabangVH_ViewBinding d;
    private List<? extends TextView> g;
    private List<? extends LogoutDialog_ViewBinding> h;

    /* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat() {
            super(1);
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this;
            String string = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getResources().getString(2131820602);
            subscribeReservationRescheduleEvent.d(string, "");
            transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a(4, string);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat() {
            super(1);
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this;
            String string = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getResources().getString(2131820598);
            subscribeReservationRescheduleEvent.d(string, "");
            transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a(5, string);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements TextWatcher {
        public RemoteActionCompatParcelizer() {
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this;
            EditText editText = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding).h;
            subscribeReservationRescheduleEvent.d(editText, "");
            transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a(editText);
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this.b().setNorekPengirim(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this).h.getText().toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding$read.class */
    public static final class read implements TextWatcher {
        public read() {
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this;
            AutoCompleteTextView autoCompleteTextView = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding).c;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a(autoCompleteTextView);
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this.b().setNamaPengirim(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this).c.getText().toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding$write.class */
    public static final class write extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write() {
            super(1);
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this;
            String string = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getResources().getString(2131820593);
            subscribeReservationRescheduleEvent.d(string, "");
            transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a(1, string);
            return onCLickStatusNpwp.e;
        }
    }

    private final void a() {
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        kantorCabangAdapter$KantorCabangVH_ViewBinding.j.setEnabled(true);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
        kantorCabangAdapter$KantorCabangVH_ViewBinding2.A.setHintEnabled(false);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
        kantorCabangAdapter$KantorCabangVH_ViewBinding3.A.setBackgroundResource(2131230847);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding4 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding4);
        kantorCabangAdapter$KantorCabangVH_ViewBinding4.A.setHintTextAppearance(2131886846);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding5 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding5);
        kantorCabangAdapter$KantorCabangVH_ViewBinding5.A.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
    }

    public static /* synthetic */ void a(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, "");
        PilihRekeningDialog pilihRekeningDialog = new PilihRekeningDialog();
        ubahData ubahdata = (ubahData) transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getActivity();
        subscribeReservationRescheduleEvent.c(ubahdata);
        pilihRekeningDialog.e = ubahdata.p;
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        pilihRekeningDialog.c = kantorCabangAdapter$KantorCabangVH_ViewBinding.h.getText().toString();
        pilihRekeningDialog.show(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getParentFragmentManager(), "PilihRekeningDialog");
    }

    public static /* synthetic */ void b(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, "");
        Bundle bundle = new Bundle();
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, kantorCabangAdapter$KantorCabangVH_ViewBinding.j.getText().toString());
        getView activity = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            bundle.putString("type", bankTransfer.getAccType());
            bundle.putString("flag_verified", transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.g().getVerified());
            ReviewAllCardAdapter$ViewHolder reviewAllCardAdapter$ViewHolder = new ReviewAllCardAdapter$ViewHolder();
            reviewAllCardAdapter$ViewHolder.setArguments(bundle);
            reviewAllCardAdapter$ViewHolder.show(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getParentFragmentManager(), "SaranaPembayaranPengirimBankTransferDialog");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    public static final /* synthetic */ KantorCabangAdapter$KantorCabangVH_ViewBinding c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding) {
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        return kantorCabangAdapter$KantorCabangVH_ViewBinding;
    }

    private final void c() {
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        kantorCabangAdapter$KantorCabangVH_ViewBinding.j.setEnabled(false);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
        kantorCabangAdapter$KantorCabangVH_ViewBinding2.A.setHintEnabled(true);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
        kantorCabangAdapter$KantorCabangVH_ViewBinding3.A.setBackgroundResource(0);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding4 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding4);
        kantorCabangAdapter$KantorCabangVH_ViewBinding4.A.setHintTextAppearance(2131886845);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding5 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding5);
        kantorCabangAdapter$KantorCabangVH_ViewBinding5.A.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099773)));
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding6 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding6);
        EditText editText = kantorCabangAdapter$KantorCabangVH_ViewBinding6.j;
        subscribeReservationRescheduleEvent.d(editText, "");
        e(editText);
    }

    public static /* synthetic */ void c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, "");
        Bundle bundle = new Bundle();
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, kantorCabangAdapter$KantorCabangVH_ViewBinding.i.getText().toString());
        ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
        reviewMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewMastercardAdapter$ViewHolder.show(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getParentFragmentManager(), "StatusPendudukBankTransferDialog");
    }

    public static /* synthetic */ void c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, Realm realm) {
        subscribeReservationRescheduleEvent.e(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, "");
        RealmQuery where = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.i().where(BankTransfer.class);
        getView activity = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            BankTransfer bankTransfer2 = (BankTransfer) where.equalTo("id", Long.valueOf(bankTransfer.getId())).findFirst();
            if (bankTransfer2 != null && bankTransfer2.isValid()) {
                bankTransfer2.deleteFromRealm();
                documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    public static /* synthetic */ void d(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, "");
        Bundle bundle = new Bundle();
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, kantorCabangAdapter$KantorCabangVH_ViewBinding.g.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.getParentFragmentManager(), "TipeNasabahBankTransferDialog");
    }

    private void e(View view) {
        subscribeReservationRescheduleEvent.e(view, "");
        List<? extends TextView> list = this.g;
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
        List<? extends LogoutDialog_ViewBinding> list6 = this.h;
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0336 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void e(o.TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding r5, android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 823
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.e(o.TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, android.view.View):void");
    }

    public final void a(int i, String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        List<? extends TextView> list = this.g;
        List<? extends LogoutDialog_ViewBinding> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        ((TextView) list3.get(i)).setVisibility(0);
        List<? extends TextView> list4 = this.g;
        List<? extends TextView> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        ((TextView) list5.get(i)).setText(str);
        list2 = this.h;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        ((LogoutDialog_ViewBinding) list2.get(i)).setBackgroundResource(2131230870);
    }

    public final void a(EditText editText) {
        subscribeReservationRescheduleEvent.e(editText, "");
        List<? extends TextView> list = this.g;
        List<? extends EditText> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        List<? extends LogoutDialog_ViewBinding> list4 = this.h;
        List<? extends LogoutDialog_ViewBinding> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        List<? extends EditText> list6 = this.b;
        if (list6 == null) {
            subscribeReservationRescheduleEvent.e("");
        } else {
            list2 = list6;
        }
        getPromotion.b(list3, list5, list2, editText);
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
        getPromotion.d(getContext());
        ubahData ubahdata = (ubahData) getActivity();
        subscribeReservationRescheduleEvent.c(ubahdata);
        if (!ubahdata.q) {
            i().executeTransaction(new Realm.Transaction() { // from class: o.TujuanPemrekAdapter$TujuanPemrekVH
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this, realm);
                }
            });
        }
        setOnHierarchyChangeListener.a((Activity) requireActivity());
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.c.clear();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case 2131298153:
                b().setStatusKewarganegaraanPengirim("WNA");
                return;
            case 2131298154:
                b().setStatusKewarganegaraanPengirim("WNI");
                return;
            default:
                return;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseSaranaPembayaran(ReservasiSuccessActivity_ViewBinding reservasiSuccessActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiSuccessActivity_ViewBinding, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        EditText editText = kantorCabangAdapter$KantorCabangVH_ViewBinding.j;
        subscribeReservationRescheduleEvent.d(editText, "");
        e(editText);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
        kantorCabangAdapter$KantorCabangVH_ViewBinding2.A.setHintEnabled(true);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
        kantorCabangAdapter$KantorCabangVH_ViewBinding3.j.setText(reservasiSuccessActivity_ViewBinding.a);
        b().setSaranaPembayaranPengirim(reservasiSuccessActivity_ViewBinding.a);
        if (CheckOTPSessionPresenter.d(reservasiSuccessActivity_ViewBinding.a, "Cek BCA", true)) {
            b().setAccType("GIRO");
        } else {
            b().setAccType("NONGIRO");
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseStatusPenduduk(ReservasiSuccessAskNextActivity reservasiSuccessAskNextActivity) {
        subscribeReservationRescheduleEvent.e(reservasiSuccessAskNextActivity, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        EditText editText = kantorCabangAdapter$KantorCabangVH_ViewBinding.i;
        subscribeReservationRescheduleEvent.d(editText, "");
        e(editText);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
        kantorCabangAdapter$KantorCabangVH_ViewBinding2.C.setHintEnabled(true);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
        kantorCabangAdapter$KantorCabangVH_ViewBinding3.i.setText(reservasiSuccessAskNextActivity.d);
        b().setStatusPendudukPengirim(reservasiSuccessAskNextActivity.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseSumberDana(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        subscribeReservationRescheduleEvent.e(reservasiROSuccessActivity, "");
        String str = reservasiROSuccessActivity.d;
        subscribeReservationRescheduleEvent.d(str, "");
        if (!(str.length() == 0)) {
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
            kantorCabangAdapter$KantorCabangVH_ViewBinding.A.setVisibility(0);
            String str2 = reservasiROSuccessActivity.d;
            subscribeReservationRescheduleEvent.d(str2, "");
            Object[] array = CheckOTPSessionPresenter.d((CharSequence) str2, new String[]{"-"}, false, 0).toArray(new String[0]);
            subscribeReservationRescheduleEvent.c(array);
            String[] strArr = (String[]) array;
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
            EditText editText = kantorCabangAdapter$KantorCabangVH_ViewBinding2.h;
            String str3 = strArr[0];
            int length = str3.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = subscribeReservationRescheduleEvent.d(str3.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            editText.setText(str3.subSequence(i, length + 1).toString());
            BankTransfer b = b();
            String str4 = strArr[0];
            int length2 = str4.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length2) {
                boolean z4 = subscribeReservationRescheduleEvent.d(str4.charAt(!z3 ? i2 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    }
                    length2--;
                } else if (!z4) {
                    z3 = true;
                } else {
                    i2++;
                }
            }
            b.setNorekPengirim(str4.subSequence(i2, length2 + 1).toString());
            if (CheckOTPSessionPresenter.d((CharSequence) strArr[1], (CharSequence) "GIRO", true)) {
                b().setAccType("GIRO");
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
                kantorCabangAdapter$KantorCabangVH_ViewBinding3.j.setText("Cek BCA");
                BankTransfer b2 = b();
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding4 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding4);
                b2.setSaranaPembayaranPengirim(kantorCabangAdapter$KantorCabangVH_ViewBinding4.j.getText().toString());
                c();
            } else {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding5 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding5);
                kantorCabangAdapter$KantorCabangVH_ViewBinding5.j.setText("");
                b().setAccType("NONGIRO");
                a();
            }
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding6 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding6);
            kantorCabangAdapter$KantorCabangVH_ViewBinding6.z.setHintEnabled(true);
            return;
        }
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding7 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding7);
        kantorCabangAdapter$KantorCabangVH_ViewBinding7.z.setHintEnabled(false);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTipeNasabah(resetAccount resetaccount) {
        subscribeReservationRescheduleEvent.e(resetaccount, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        EditText editText = kantorCabangAdapter$KantorCabangVH_ViewBinding.g;
        subscribeReservationRescheduleEvent.d(editText, "");
        e(editText);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
        kantorCabangAdapter$KantorCabangVH_ViewBinding2.B.setHintEnabled(true);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
        kantorCabangAdapter$KantorCabangVH_ViewBinding3.g.setText(resetaccount.d);
        b().setTipeNasabahPengirim(resetaccount.d);
        b().setTipeNasabahPengirimId(String.valueOf(resetaccount.e));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493154, viewGroup, false);
        Button button = (Button) setRotation.a(inflate, 2131296396);
        int i = 2131297190;
        if (button != null) {
            EditText editText = (EditText) setRotation.a(inflate, 2131296927);
            if (editText != null) {
                EditText editText2 = (EditText) setRotation.a(inflate, 2131297044);
                if (editText2 != null) {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) setRotation.a(inflate, 2131297054);
                    if (autoCompleteTextView != null) {
                        EditText editText3 = (EditText) setRotation.a(inflate, 2131297080);
                        if (editText3 != null) {
                            EditText editText4 = (EditText) setRotation.a(inflate, 2131297105);
                            if (editText4 != null) {
                                EditText editText5 = (EditText) setRotation.a(inflate, 2131297107);
                                if (editText5 != null) {
                                    EditText editText6 = (EditText) setRotation.a(inflate, 2131297174);
                                    if (editText6 != null) {
                                        EditText editText7 = (EditText) setRotation.a(inflate, 2131297190);
                                        if (editText7 != null) {
                                            EditText editText8 = (EditText) setRotation.a(inflate, 2131297209);
                                            if (editText8 != null) {
                                                LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297865);
                                                if (linearLayout != null) {
                                                    LinearLayout linearLayout2 = (LinearLayout) setRotation.a(inflate, 2131297934);
                                                    if (linearLayout2 != null) {
                                                        RadioButton radioButton = (RadioButton) setRotation.a(inflate, 2131298153);
                                                        if (radioButton != null) {
                                                            RadioButton radioButton2 = (RadioButton) setRotation.a(inflate, 2131298154);
                                                            if (radioButton2 != null) {
                                                                RadioButton radioButton3 = (RadioButton) setRotation.a(inflate, 2131298170);
                                                                if (radioButton3 != null) {
                                                                    RadioButton radioButton4 = (RadioButton) setRotation.a(inflate, 2131298171);
                                                                    if (radioButton4 != null) {
                                                                        RadioGroup radioGroup = (RadioGroup) setRotation.a(inflate, 2131298219);
                                                                        if (radioGroup != null) {
                                                                            RadioGroup radioGroup2 = (RadioGroup) setRotation.a(inflate, 2131298228);
                                                                            if (radioGroup2 != null) {
                                                                                ScrollView scrollView = (ScrollView) inflate;
                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298476);
                                                                                if (logoutDialog_ViewBinding != null) {
                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298591);
                                                                                    if (logoutDialog_ViewBinding2 != null) {
                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298601);
                                                                                        if (logoutDialog_ViewBinding3 != null) {
                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298626);
                                                                                            if (logoutDialog_ViewBinding4 != null) {
                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298651);
                                                                                                if (logoutDialog_ViewBinding5 != null) {
                                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298653);
                                                                                                    if (logoutDialog_ViewBinding6 != null) {
                                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298710);
                                                                                                        if (logoutDialog_ViewBinding7 != null) {
                                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298722);
                                                                                                            if (logoutDialog_ViewBinding8 != null) {
                                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298741);
                                                                                                                if (logoutDialog_ViewBinding9 != null) {
                                                                                                                    TextView textView = (TextView) setRotation.a(inflate, 2131298956);
                                                                                                                    if (textView != null) {
                                                                                                                        TextView textView2 = (TextView) setRotation.a(inflate, 2131299067);
                                                                                                                        if (textView2 != null) {
                                                                                                                            TextView textView3 = (TextView) setRotation.a(inflate, 2131299078);
                                                                                                                            if (textView3 != null) {
                                                                                                                                TextView textView4 = (TextView) setRotation.a(inflate, 2131299102);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    TextView textView5 = (TextView) setRotation.a(inflate, 2131299124);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        TextView textView6 = (TextView) setRotation.a(inflate, 2131299126);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            TextView textView7 = (TextView) setRotation.a(inflate, 2131299177);
                                                                                                                                            if (textView7 != null) {
                                                                                                                                                TextView textView8 = (TextView) setRotation.a(inflate, 2131299190);
                                                                                                                                                if (textView8 != null) {
                                                                                                                                                    TextView textView9 = (TextView) setRotation.a(inflate, 2131299209);
                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = new KantorCabangAdapter$KantorCabangVH_ViewBinding(scrollView, button, editText, editText2, autoCompleteTextView, editText3, editText4, editText5, editText6, editText7, editText8, linearLayout, linearLayout2, radioButton, radioButton2, radioButton3, radioButton4, radioGroup, radioGroup2, scrollView, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                                                                        this.d = kantorCabangAdapter$KantorCabangVH_ViewBinding;
                                                                                                                                                        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
                                                                                                                                                        ScrollView scrollView2 = kantorCabangAdapter$KantorCabangVH_ViewBinding.t;
                                                                                                                                                        subscribeReservationRescheduleEvent.d(scrollView2, "");
                                                                                                                                                        return scrollView2;
                                                                                                                                                    }
                                                                                                                                                    i = 2131299209;
                                                                                                                                                } else {
                                                                                                                                                    i = 2131299190;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = 2131299177;
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
                                                                                                                        i = 2131298956;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = 2131298741;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = 2131298722;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = 2131298710;
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
                                                                                    i = 2131298476;
                                                                                }
                                                                            } else {
                                                                                i = 2131298228;
                                                                            }
                                                                        } else {
                                                                            i = 2131298219;
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
                                                        i = 2131297934;
                                                    }
                                                } else {
                                                    i = 2131297865;
                                                }
                                            } else {
                                                i = 2131297209;
                                            }
                                        }
                                    } else {
                                        i = 2131297174;
                                    }
                                } else {
                                    i = 2131297107;
                                }
                            } else {
                                i = 2131297105;
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
                i = 2131296927;
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
        this.d = null;
        this.c.clear();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        if (z) {
            subscribeReservationRescheduleEvent.c(view);
            int id = view.getId();
            if (id == 2131296927) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
                kantorCabangAdapter$KantorCabangVH_ViewBinding.u.setHintEnabled(true);
            } else if (id == 2131297054) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
                kantorCabangAdapter$KantorCabangVH_ViewBinding2.v.setHintEnabled(true);
            } else if (id == 2131297107) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
                kantorCabangAdapter$KantorCabangVH_ViewBinding3.z.setHintEnabled(true);
            }
        } else {
            subscribeReservationRescheduleEvent.c(view);
            int id2 = view.getId();
            if (id2 == 2131296927) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding4 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding4);
                if (kantorCabangAdapter$KantorCabangVH_ViewBinding4.d.getText().toString().length() != 0) {
                    z3 = false;
                }
                if (z3) {
                    KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding5 = this.d;
                    subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding5);
                    kantorCabangAdapter$KantorCabangVH_ViewBinding5.u.setHintEnabled(false);
                }
            } else if (id2 == 2131297054) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding6 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding6);
                if (kantorCabangAdapter$KantorCabangVH_ViewBinding6.c.getText().toString().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding7 = this.d;
                    subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding7);
                    kantorCabangAdapter$KantorCabangVH_ViewBinding7.v.setHintEnabled(false);
                }
            } else if (id2 == 2131297107) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding8 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding8);
                if (kantorCabangAdapter$KantorCabangVH_ViewBinding8.h.getText().toString().length() != 0) {
                    z4 = false;
                }
                if (z4) {
                    KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding9 = this.d;
                    subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding9);
                    kantorCabangAdapter$KantorCabangVH_ViewBinding9.z.setHintEnabled(false);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding);
        AutoCompleteTextView autoCompleteTextView = kantorCabangAdapter$KantorCabangVH_ViewBinding.c;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding2 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding2);
        EditText editText = kantorCabangAdapter$KantorCabangVH_ViewBinding2.h;
        subscribeReservationRescheduleEvent.d(editText, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding3 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding3);
        EditText editText2 = kantorCabangAdapter$KantorCabangVH_ViewBinding3.j;
        subscribeReservationRescheduleEvent.d(editText2, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding4 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding4);
        EditText editText3 = kantorCabangAdapter$KantorCabangVH_ViewBinding4.d;
        subscribeReservationRescheduleEvent.d(editText3, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding5 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding5);
        EditText editText4 = kantorCabangAdapter$KantorCabangVH_ViewBinding5.g;
        subscribeReservationRescheduleEvent.d(editText4, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding6 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding6);
        EditText editText5 = kantorCabangAdapter$KantorCabangVH_ViewBinding6.i;
        subscribeReservationRescheduleEvent.d(editText5, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding7 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding7);
        EditText editText6 = kantorCabangAdapter$KantorCabangVH_ViewBinding7.b;
        subscribeReservationRescheduleEvent.d(editText6, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding8 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding8);
        EditText editText7 = kantorCabangAdapter$KantorCabangVH_ViewBinding8.f;
        subscribeReservationRescheduleEvent.d(editText7, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding9 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding9);
        EditText editText8 = kantorCabangAdapter$KantorCabangVH_ViewBinding9.a;
        subscribeReservationRescheduleEvent.d(editText8, "");
        EditText[] editTextArr = {autoCompleteTextView, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8};
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        List<? extends EditText> asList = Arrays.asList(editTextArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        this.b = asList;
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding10 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding10);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = kantorCabangAdapter$KantorCabangVH_ViewBinding10.v;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding11 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding11);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = kantorCabangAdapter$KantorCabangVH_ViewBinding11.z;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding12 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding12);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = kantorCabangAdapter$KantorCabangVH_ViewBinding12.A;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding13 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding13);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = kantorCabangAdapter$KantorCabangVH_ViewBinding13.u;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding14 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding14);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = kantorCabangAdapter$KantorCabangVH_ViewBinding14.B;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding15 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding15);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = kantorCabangAdapter$KantorCabangVH_ViewBinding15.C;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding16 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding16);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = kantorCabangAdapter$KantorCabangVH_ViewBinding16.x;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding17 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding17);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = kantorCabangAdapter$KantorCabangVH_ViewBinding17.y;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding18 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding18);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = kantorCabangAdapter$KantorCabangVH_ViewBinding18.w;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
        LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9};
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
        subscribeReservationRescheduleEvent.d(asList2, "");
        this.h = asList2;
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding19 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding19);
        TextView textView = kantorCabangAdapter$KantorCabangVH_ViewBinding19.G;
        subscribeReservationRescheduleEvent.d(textView, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding20 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding20);
        TextView textView2 = kantorCabangAdapter$KantorCabangVH_ViewBinding20.F;
        subscribeReservationRescheduleEvent.d(textView2, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding21 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding21);
        TextView textView3 = kantorCabangAdapter$KantorCabangVH_ViewBinding21.M;
        subscribeReservationRescheduleEvent.d(textView3, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding22 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding22);
        TextView textView4 = kantorCabangAdapter$KantorCabangVH_ViewBinding22.D;
        subscribeReservationRescheduleEvent.d(textView4, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding23 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding23);
        TextView textView5 = kantorCabangAdapter$KantorCabangVH_ViewBinding23.K;
        subscribeReservationRescheduleEvent.d(textView5, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding24 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding24);
        TextView textView6 = kantorCabangAdapter$KantorCabangVH_ViewBinding24.L;
        subscribeReservationRescheduleEvent.d(textView6, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding25 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding25);
        TextView textView7 = kantorCabangAdapter$KantorCabangVH_ViewBinding25.I;
        subscribeReservationRescheduleEvent.d(textView7, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding26 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding26);
        TextView textView8 = kantorCabangAdapter$KantorCabangVH_ViewBinding26.H;
        subscribeReservationRescheduleEvent.d(textView8, "");
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding27 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding27);
        TextView textView9 = kantorCabangAdapter$KantorCabangVH_ViewBinding27.E;
        subscribeReservationRescheduleEvent.d(textView9, "");
        TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9};
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        List<? extends TextView> asList3 = Arrays.asList(textViewArr);
        subscribeReservationRescheduleEvent.d(asList3, "");
        this.g = asList3;
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding28 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding28);
        kantorCabangAdapter$KantorCabangVH_ViewBinding28.j.setOnClickListener(new View.OnClickListener() { // from class: o.TujuanPembelianBNAdapter$TujuanPembelianBNVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.b(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this, view2);
            }
        });
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding29 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding29);
        kantorCabangAdapter$KantorCabangVH_ViewBinding29.g.setOnClickListener(new View.OnClickListener() { // from class: o.TransaksiTundaDetailAdapter$TransaksiTundaDetailAdapterVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.d(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this, view2);
            }
        });
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding30 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding30);
        kantorCabangAdapter$KantorCabangVH_ViewBinding30.i.setOnClickListener(new View.OnClickListener() { // from class: o.TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this, view2);
            }
        });
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding31 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding31);
        AutoCompleteTextView autoCompleteTextView2 = kantorCabangAdapter$KantorCabangVH_ViewBinding31.c;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
        autoCompleteTextView2.addTextChangedListener(new read());
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding32 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding32);
        EditText editText9 = kantorCabangAdapter$KantorCabangVH_ViewBinding32.h;
        subscribeReservationRescheduleEvent.d(editText9, "");
        editText9.addTextChangedListener(new RemoteActionCompatParcelizer());
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding33 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding33);
        EditText editText10 = kantorCabangAdapter$KantorCabangVH_ViewBinding33.d;
        subscribeReservationRescheduleEvent.d(editText10, "");
        editText10.addTextChangedListener(new TextWatcher() { // from class: o.TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this;
                EditText editText11 = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding).d;
                subscribeReservationRescheduleEvent.d(editText11, "");
                transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a(editText11);
                TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this.b().setAlamatPengirim(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.c(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this).d.getText().toString());
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding34 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding34);
        kantorCabangAdapter$KantorCabangVH_ViewBinding34.e.setOnClickListener(new View.OnClickListener() { // from class: o.TujuanTransaksiAdapter$TujuanTransaksiVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.e(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this, view2);
            }
        });
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding35 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding35);
        kantorCabangAdapter$KantorCabangVH_ViewBinding35.d.setOnEditorActionListener(new setCardDescription());
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding36 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding36);
        AutoCompleteTextView autoCompleteTextView3 = kantorCabangAdapter$KantorCabangVH_ViewBinding36.c;
        TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = this;
        autoCompleteTextView3.setOnFocusChangeListener(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding37 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding37);
        kantorCabangAdapter$KantorCabangVH_ViewBinding37.h.setOnFocusChangeListener(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding38 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding38);
        kantorCabangAdapter$KantorCabangVH_ViewBinding38.d.setOnFocusChangeListener(transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding);
        KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding39 = this.d;
        subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding39);
        kantorCabangAdapter$KantorCabangVH_ViewBinding39.r.setOnCheckedChangeListener(this);
        getView activity = getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            subscribeReservationRescheduleEvent.e(bankTransfer, "");
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding40 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding40);
            kantorCabangAdapter$KantorCabangVH_ViewBinding40.c.setText(bankTransfer.getNamaPengirim());
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding41 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding41);
            kantorCabangAdapter$KantorCabangVH_ViewBinding41.h.setText(bankTransfer.getNorekPengirim());
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding42 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding42);
            kantorCabangAdapter$KantorCabangVH_ViewBinding42.j.setText(bankTransfer.getSaranaPembayaranPengirim());
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding43 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding43);
            kantorCabangAdapter$KantorCabangVH_ViewBinding43.d.setText(bankTransfer.getAlamatPengirim());
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding44 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding44);
            kantorCabangAdapter$KantorCabangVH_ViewBinding44.g.setText(bankTransfer.getTipeNasabahPengirim());
            KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding45 = this.d;
            subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding45);
            kantorCabangAdapter$KantorCabangVH_ViewBinding45.i.setText(bankTransfer.getStatusPendudukPengirim());
            String statusKewarganegaraanPengirim = bankTransfer.getStatusKewarganegaraanPengirim();
            subscribeReservationRescheduleEvent.d(statusKewarganegaraanPengirim, "");
            if (statusKewarganegaraanPengirim.length() == 0) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding46 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding46);
                kantorCabangAdapter$KantorCabangVH_ViewBinding46.k.setChecked(true);
                bankTransfer.setStatusKewarganegaraanPengirim("WNI");
            } else if (bankTransfer.getStatusKewarganegaraanPengirim().equals("WNI")) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding47 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding47);
                kantorCabangAdapter$KantorCabangVH_ViewBinding47.k.setChecked(true);
            } else {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding48 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding48);
                kantorCabangAdapter$KantorCabangVH_ViewBinding48.n.setChecked(true);
            }
            if (g().getVerified().equals("Y")) {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding49 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding49);
                kantorCabangAdapter$KantorCabangVH_ViewBinding49.h.setFocusable(false);
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding50 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding50);
                kantorCabangAdapter$KantorCabangVH_ViewBinding50.h.setHint(getResources().getString(2131821206));
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding51 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding51);
                kantorCabangAdapter$KantorCabangVH_ViewBinding51.h.setOnClickListener(new View.OnClickListener() { // from class: o.UbahBCACardAdapter$ViewHolder
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.this, view2);
                    }
                });
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding52 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding52);
                if (kantorCabangAdapter$KantorCabangVH_ViewBinding52.h.getText().toString().length() == 0) {
                    KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding53 = this.d;
                    subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding53);
                    kantorCabangAdapter$KantorCabangVH_ViewBinding53.A.setVisibility(8);
                } else {
                    KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding54 = this.d;
                    subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding54);
                    kantorCabangAdapter$KantorCabangVH_ViewBinding54.A.setVisibility(0);
                    if (b().getAccType().equals("NONGIRO")) {
                        a();
                    } else {
                        c();
                    }
                }
            } else {
                KantorCabangAdapter$KantorCabangVH_ViewBinding kantorCabangAdapter$KantorCabangVH_ViewBinding55 = this.d;
                subscribeReservationRescheduleEvent.c(kantorCabangAdapter$KantorCabangVH_ViewBinding55);
                kantorCabangAdapter$KantorCabangVH_ViewBinding55.A.setVisibility(0);
            }
            List<? extends EditText> list = this.b;
            List<? extends EditText> list2 = list;
            if (list == null) {
                subscribeReservationRescheduleEvent.e("");
                list2 = null;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<? extends LogoutDialog_ViewBinding> list3 = this.h;
                List<? extends LogoutDialog_ViewBinding> list4 = list3;
                if (list3 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    list4 = null;
                }
                LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = (LogoutDialog_ViewBinding) list4.get(i);
                List<? extends EditText> list5 = this.b;
                List<? extends EditText> list6 = list5;
                if (list5 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    list6 = null;
                }
                logoutDialog_ViewBinding10.setHintEnabled(!(((EditText) list6.get(i)).getText().toString().length() == 0));
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }
}
