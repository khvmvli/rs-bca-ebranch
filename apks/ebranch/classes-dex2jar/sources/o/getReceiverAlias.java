package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.dialog.PilihRekeningDialog;
import com.bca.smartbranch.dialog.StatusKewarganegaraanDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.RealmList;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SumberDanaAdapter$SumberDanaVH_ViewBinding;
import o.onClickBankTransfer;
import o.showInfoValueTodayOR;
/* loaded from: classes-dex2jar.jar:o/getReceiverAlias.class */
public final class getReceiverAlias extends BaseFragmentKotlin implements showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, View.OnFocusChangeListener, AdapterView.OnItemClickListener {
    private ListKelurahanAdapter$ListKelurahanAdapterVH A;
    private ListKecamatanAdapter$ListKecamatanAdapterVH B;
    private ListKodePosAdapter$ListKodePosAdapterVH C;
    private DetailTundaCCActivity D;
    private DetailTundaCCActivity E;
    private DetailTundaCCActivity F;
    private DetailTundaCCActivity G;
    private DetailTundaCCActivity H;
    private DetailTundaCCActivity I;
    private DetailTundaCCActivity K;
    private DetailTundaCCActivity L;
    private DetailTundaCCActivity M;
    private DetailTundaCCActivity N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private String S;
    private List<? extends DaftarTransferResponse.DaftarTransferOutput> X;
    private DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver ao;
    private ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding c;
    private ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding g;
    private ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH h;
    private onUbah k;
    private ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding l;
    private ListDetailTransaksiAdapter$ListDetailTransaksiVH m;
    private ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH n;

    /* renamed from: o */
    private ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding f153o;
    private ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding p;
    private ListDetailTransaksiROAdapter$ListDetailTransaksiVH q;
    private ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding r;
    private ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH s;
    private ListJabatanAdapter$ListJabatanVH t;
    private ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding u;
    private ListJenisMataUangAdapter$ListJenisMataUangAdapterVH v;
    private ListKantorCabangAdapter$ListKantorCabangVH w;
    private ListJabatanAdapter$ListJabatanVH_ViewBinding x;
    private ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding y;
    private ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding z;
    public static final read e = new read((byte) 0);
    private static final String d = "BankTransferReview";
    public Map<Integer, View> a = new LinkedHashMap();
    private List<? extends EditText> Z = PenerimaFragment.b;
    private List<? extends LogoutDialog_ViewBinding> ar = PenerimaFragment.b;
    private List<? extends TextView> ah = PenerimaFragment.b;
    private List<? extends EditText> W = PenerimaFragment.b;
    private List<? extends LogoutDialog_ViewBinding> ak = PenerimaFragment.b;
    private List<? extends TextView> aa = PenerimaFragment.b;
    private List<? extends EditText> T = PenerimaFragment.b;
    private List<? extends LogoutDialog_ViewBinding> al = PenerimaFragment.b;
    private List<? extends TextView> ab = PenerimaFragment.b;
    private List<? extends EditText> U = PenerimaFragment.b;
    private List<? extends LogoutDialog_ViewBinding> am = PenerimaFragment.b;
    private List<? extends TextView> af = PenerimaFragment.b;
    private List<? extends EditText> V = PenerimaFragment.b;
    private List<? extends LogoutDialog_ViewBinding> ai = PenerimaFragment.b;
    private List<? extends TextView> ag = PenerimaFragment.b;
    private List<? extends EditText> ac = PenerimaFragment.b;
    private List<? extends LogoutDialog_ViewBinding> aj = PenerimaFragment.b;
    private List<? extends TextView> ad = PenerimaFragment.b;
    private List<? extends EditText> Y = PenerimaFragment.b;
    private List<? extends LogoutDialog_ViewBinding> aq = PenerimaFragment.b;
    private List<? extends TextView> ae = PenerimaFragment.b;
    private String ap = "";
    private setMessage J = new setMessage();
    private final BigDecimal b = new BigDecimal(100000000);
    private String an = "";

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements TextWatcher {
        public IconCompatParcelizer() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = getReceiverAlias.e(getReceiverAlias.this).c;
            subscribeReservationRescheduleEvent.d(editText, "");
            getReceiverAlias.a(editText, (List<? extends EditText>) getReceiverAlias.this.W, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ak, (List<? extends TextView>) getReceiverAlias.this.aa);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$ImmLeaksCleaner.class */
    public static final class ImmLeaksCleaner implements TextWatcher {
        public ImmLeaksCleaner() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextView = getReceiverAlias.g(getReceiverAlias.this).a;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            getReceiverAlias.a((EditText) autoCompleteTextView, (List<? extends EditText>) getReceiverAlias.this.Z, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ar, (List<? extends TextView>) getReceiverAlias.this.ah);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$Keep.class */
    public static final class Keep extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Keep() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820593);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(1, string, getReceiverAlias.this.ar, getReceiverAlias.this.ah);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat implements TextWatcher {
        public MediaDescriptionCompat() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextView = getReceiverAlias.a(getReceiverAlias.this).f;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            getReceiverAlias.a((EditText) autoCompleteTextView, (List<? extends EditText>) getReceiverAlias.this.T, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.al, (List<? extends TextView>) getReceiverAlias.this.ab);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat implements TextWatcher {
        public MediaMetadataCompat() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = getReceiverAlias.a(getReceiverAlias.this).e;
            subscribeReservationRescheduleEvent.d(editText, "");
            getReceiverAlias.a(editText, (List<? extends EditText>) getReceiverAlias.this.T, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.al, (List<? extends TextView>) getReceiverAlias.this.ab);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$ParcelableVolumeInfo.class */
    public static final class ParcelableVolumeInfo implements TextWatcher {
        public ParcelableVolumeInfo() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = getReceiverAlias.b(getReceiverAlias.this).c;
            subscribeReservationRescheduleEvent.d(editText, "");
            getReceiverAlias.a(editText, (List<? extends EditText>) getReceiverAlias.this.V, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ai, (List<? extends TextView>) getReceiverAlias.this.ag);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$PlaybackStateCompat.class */
    public static final class PlaybackStateCompat implements TextWatcher {

        /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$PlaybackStateCompat$CustomAction.class */
        public static final class CustomAction implements TextWatcher {
            final /* synthetic */ getReceiverAlias b;

            public CustomAction(getReceiverAlias getreceiveralias) {
                this.b = getreceiveralias;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                EditText editText = getReceiverAlias.b(this.b).b;
                subscribeReservationRescheduleEvent.d(editText, "");
                getReceiverAlias.a(editText, (List<? extends EditText>) this.b.V, (List<? extends LogoutDialog_ViewBinding>) this.b.ai, (List<? extends TextView>) this.b.ag);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        public PlaybackStateCompat() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextView = getReceiverAlias.d(getReceiverAlias.this).i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            getReceiverAlias.a((EditText) autoCompleteTextView, (List<? extends EditText>) getReceiverAlias.this.ac, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.aj, (List<? extends TextView>) getReceiverAlias.this.ad);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$RatingCompat.class */
    public static final class RatingCompat implements TextWatcher {
        public RatingCompat() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextView = getReceiverAlias.b(getReceiverAlias.this).g;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            getReceiverAlias.a((EditText) autoCompleteTextView, (List<? extends EditText>) getReceiverAlias.this.V, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ai, (List<? extends TextView>) getReceiverAlias.this.ag);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements TextWatcher {
        public RemoteActionCompatParcelizer() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextView = getReceiverAlias.e(getReceiverAlias.this).h;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            getReceiverAlias.a((EditText) autoCompleteTextView, (List<? extends EditText>) getReceiverAlias.this.W, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ak, (List<? extends TextView>) getReceiverAlias.this.aa);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setActionBarHideOffset.class */
    public static final class setActionBarHideOffset extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setActionBarHideOffset() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820578);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(5, string, getReceiverAlias.this.am, getReceiverAlias.this.af);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setActionBarVisibilityCallback.class */
    public static final class setActionBarVisibilityCallback extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setActionBarVisibilityCallback() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820596);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(8, string, getReceiverAlias.this.am, getReceiverAlias.this.af);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setActivityChooserModel.class */
    public static final class setActivityChooserModel extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setActivityChooserModel() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820603);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(2, string, getReceiverAlias.this.aq, getReceiverAlias.this.ae);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setBackgroundResource.class */
    public static final class setBackgroundResource implements TextWatcher {
        public setBackgroundResource() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = getReceiverAlias.j(getReceiverAlias.this).a;
            subscribeReservationRescheduleEvent.d(editText, "");
            getReceiverAlias.a(editText, (List<? extends EditText>) getReceiverAlias.this.Y, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.aq, (List<? extends TextView>) getReceiverAlias.this.ae);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setCheckable.class */
    public static final class setCheckable implements TextWatcher {
        public setCheckable() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = getReceiverAlias.g(getReceiverAlias.this).c;
            subscribeReservationRescheduleEvent.d(editText, "");
            getReceiverAlias.a(editText, (List<? extends EditText>) getReceiverAlias.this.Z, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ar, (List<? extends TextView>) getReceiverAlias.this.ah);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setChecked.class */
    public static final class setChecked extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setChecked() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820584);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(7, string, getReceiverAlias.this.ar, getReceiverAlias.this.ah);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setContentHeight.class */
    public static final class setContentHeight extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setContentHeight() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820597);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(7, string, getReceiverAlias.this.ak, getReceiverAlias.this.aa);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setContentView.class */
    public static final class setContentView implements TextWatcher {
        public setContentView() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = getReceiverAlias.d(getReceiverAlias.this).b;
            subscribeReservationRescheduleEvent.d(editText, "");
            getReceiverAlias.a(editText, (List<? extends EditText>) getReceiverAlias.this.ac, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.aj, (List<? extends TextView>) getReceiverAlias.this.ad);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setCustomView.class */
    public static final class setCustomView extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setCustomView() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820602);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(4, string, getReceiverAlias.this.ar, getReceiverAlias.this.ah);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setDefaultActionButtonContentDescription.class */
    public static final class setDefaultActionButtonContentDescription extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setDefaultActionButtonContentDescription() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820601);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(6, string, getReceiverAlias.this.aj, getReceiverAlias.this.ad);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setExpandActivityOverflowButtonDrawable.class */
    public static final class setExpandActivityOverflowButtonDrawable extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setExpandActivityOverflowButtonDrawable() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820590);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(3, string, getReceiverAlias.this.aq, getReceiverAlias.this.ae);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setExpandedActionViewsExclusive.class */
    public static final class setExpandedActionViewsExclusive extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setExpandedActionViewsExclusive() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820598);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(5, string, getReceiverAlias.this.ar, getReceiverAlias.this.ah);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setExpandedFormat.class */
    public static final class setExpandedFormat extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setExpandedFormat() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820580);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(0, string, getReceiverAlias.this.ak, getReceiverAlias.this.aa);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setForceShowIcon.class */
    public static final class setForceShowIcon extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setForceShowIcon() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820580);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(0, string, getReceiverAlias.this.al, getReceiverAlias.this.ab);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setGroupDividerEnabled.class */
    public static final class setGroupDividerEnabled extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setGroupDividerEnabled() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820592);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(1, string, getReceiverAlias.this.al, getReceiverAlias.this.ab);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setHasDecor.class */
    public static final class setHasDecor implements TextWatcher {
        public setHasDecor() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = getReceiverAlias.g(getReceiverAlias.this).f;
            subscribeReservationRescheduleEvent.d(editText, "");
            getReceiverAlias.a(editText, (List<? extends EditText>) getReceiverAlias.this.Z, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ar, (List<? extends TextView>) getReceiverAlias.this.ah);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setHasNonEmbeddedTabs.class */
    public static final class setHasNonEmbeddedTabs extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setHasNonEmbeddedTabs() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820580);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(0, string, getReceiverAlias.this.ai, getReceiverAlias.this.ag);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setHideOnContentScrollEnabled.class */
    public static final class setHideOnContentScrollEnabled extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setHideOnContentScrollEnabled() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820601);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(6, string, getReceiverAlias.this.am, getReceiverAlias.this.af);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setIcon.class */
    public static final class setIcon extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setIcon() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820591);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(3, string, getReceiverAlias.this.ak, getReceiverAlias.this.aa);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setItemInvoker.class */
    public static final class setItemInvoker extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setItemInvoker() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820578);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(5, string, getReceiverAlias.this.ak, getReceiverAlias.this.aa);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setLogo.class */
    public static final class setLogo extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setLogo() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820597);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(7, string, getReceiverAlias.this.am, getReceiverAlias.this.af);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setMenu.class */
    public static final class setMenu extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setMenu() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820592);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(1, string, getReceiverAlias.this.ai, getReceiverAlias.this.ag);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setMenuCallbacks.class */
    public static final class setMenuCallbacks extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setMenuCallbacks() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820591);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(3, string, getReceiverAlias.this.aj, getReceiverAlias.this.ad);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setMenuPrepared.class */
    public static final class setMenuPrepared extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setMenuPrepared() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820591);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(3, string, getReceiverAlias.this.ai, getReceiverAlias.this.ag);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setOnDismissListener.class */
    public static final class setOnDismissListener extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setOnDismissListener() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820596);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(6, string, getReceiverAlias.this.ar, getReceiverAlias.this.ah);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setOnMenuItemClickListener.class */
    public static final class setOnMenuItemClickListener extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setOnMenuItemClickListener() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820592);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(1, string, getReceiverAlias.this.aj, getReceiverAlias.this.ad);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setOverflowIcon.class */
    public static final class setOverflowIcon extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setOverflowIcon() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820578);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(5, string, getReceiverAlias.this.aj, getReceiverAlias.this.ad);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setOverflowReserved.class */
    public static final class setOverflowReserved extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setOverflowReserved() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820596);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(8, string, getReceiverAlias.this.aj, getReceiverAlias.this.ad);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setOverlayMode.class */
    public static final class setOverlayMode extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setOverlayMode() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820578);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(5, string, getReceiverAlias.this.ai, getReceiverAlias.this.ag);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setPadding.class */
    public static final class setPadding extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setPadding() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820601);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(6, string, getReceiverAlias.this.ak, getReceiverAlias.this.aa);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setPopupCallback.class */
    public static final class setPopupCallback extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setPopupCallback() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820592);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(1, string, getReceiverAlias.this.ak, getReceiverAlias.this.aa);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setPopupTheme.class */
    public static final class setPopupTheme extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setPopupTheme() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820597);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(7, string, getReceiverAlias.this.aj, getReceiverAlias.this.ad);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setPresenter.class */
    public static final class setPresenter extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setPresenter() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820599);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(1, string, getReceiverAlias.this.aq, getReceiverAlias.this.ae);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setPrimaryBackground.class */
    public static final class setPrimaryBackground extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setPrimaryBackground() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820591);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(3, string, getReceiverAlias.this.al, getReceiverAlias.this.ab);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setProvider.class */
    public static final class setProvider extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setProvider() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820604);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(4, string, getReceiverAlias.this.aq, getReceiverAlias.this.ae);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setShortcut.class */
    public static final class setShortcut extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setShortcut() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820579);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(3, string, getReceiverAlias.this.ar, getReceiverAlias.this.ah);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setShowingForActionMode.class */
    public static final class setShowingForActionMode extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setShowingForActionMode() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820597);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(7, string, getReceiverAlias.this.ai, getReceiverAlias.this.ag);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setSplitBackground.class */
    public static final class setSplitBackground extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setSplitBackground() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820601);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(6, string, getReceiverAlias.this.al, getReceiverAlias.this.ab);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setStackedBackground.class */
    public static final class setStackedBackground extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setStackedBackground() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820596);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(8, string, getReceiverAlias.this.al, getReceiverAlias.this.ab);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setSubtitle.class */
    public static final class setSubtitle extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setSubtitle() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820591);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(3, string, getReceiverAlias.this.am, getReceiverAlias.this.af);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setTabContainer.class */
    public static final class setTabContainer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setTabContainer() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820578);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(5, string, getReceiverAlias.this.al, getReceiverAlias.this.ab);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setTitle.class */
    public static final class setTitle extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setTitle() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820596);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(8, string, getReceiverAlias.this.ak, getReceiverAlias.this.aa);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setTitleOptional.class */
    public static final class setTitleOptional extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setTitleOptional() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820592);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(1, string, getReceiverAlias.this.am, getReceiverAlias.this.af);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setTransitioning.class */
    public static final class setTransitioning extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setTransitioning() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820580);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(0, string, getReceiverAlias.this.am, getReceiverAlias.this.af);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setUiOptions.class */
    public static final class setUiOptions extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setUiOptions() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820601);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(6, string, getReceiverAlias.this.ai, getReceiverAlias.this.ag);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setVisibility.class */
    public static final class setVisibility extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setVisibility() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820597);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(7, string, getReceiverAlias.this.al, getReceiverAlias.this.ab);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setWindowCallback.class */
    public static final class setWindowCallback extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setWindowCallback() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820596);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(8, string, getReceiverAlias.this.ai, getReceiverAlias.this.ag);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$setWindowTitle.class */
    public static final class setWindowTitle extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setWindowTitle() {
            super(1);
            getReceiverAlias.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            String string = getReceiverAlias.this.getResources().getString(2131820580);
            subscribeReservationRescheduleEvent.d(string, "");
            getReceiverAlias.d(0, string, getReceiverAlias.this.aj, getReceiverAlias.this.ad);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getReceiverAlias$write.class */
    public static final class write implements TextWatcher {
        public write() {
            getReceiverAlias.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextView = getReceiverAlias.e(getReceiverAlias.this).i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            getReceiverAlias.a((EditText) autoCompleteTextView, (List<? extends EditText>) getReceiverAlias.this.W, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ak, (List<? extends TextView>) getReceiverAlias.this.aa);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static /* synthetic */ void A(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = getreceiveralias.v;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listJenisMataUangAdapter$ListJenisMataUangAdapterVH.n.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "TipeNasabahPenerima5");
    }

    public static /* synthetic */ void B(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.ap = "BankTujuanPenerima1";
        Intent intent = new Intent(getreceiveralias.getActivity(), onClickBankTransfer.class);
        onClickBankTransfer.IconCompatParcelizer iconCompatParcelizer = onClickBankTransfer.j;
        intent.putExtra(onClickBankTransfer.r, true);
        getreceiveralias.startActivity(intent);
    }

    public static /* synthetic */ void C(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.f106o.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "TipeNasabahPenerima3");
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0d76  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x1044  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1312  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x15bc  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x160a  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x1658  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x16a6  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x16eb  */
    /* JADX WARN: Removed duplicated region for block: B:584:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void D(o.getReceiverAlias r5, android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 5892
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReceiverAlias.D(o.getReceiverAlias, android.view.View):void");
    }

    public static /* synthetic */ void E(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.r();
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.r;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding);
        LinearLayout linearLayout = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding.b;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2 = getreceiveralias.r;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2);
        LinearLayout linearLayout2 = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2.c;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3 = getreceiveralias.r;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3);
        ImageView imageView = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3.d;
        subscribeReservationRescheduleEvent.d(imageView, "");
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
        LinearLayout linearLayout3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.n;
        subscribeReservationRescheduleEvent.d(linearLayout3, "");
        LinearLayout linearLayout4 = linearLayout3;
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding = getreceiveralias.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding);
        LinearLayout linearLayout5 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding.e;
        subscribeReservationRescheduleEvent.d(linearLayout5, "");
        LinearLayout linearLayout6 = linearLayout5;
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4 = getreceiveralias.r;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4);
        TextView textView = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4.j;
        subscribeReservationRescheduleEvent.d(textView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView, linearLayout4, linearLayout6, textView);
    }

    public static /* synthetic */ void F(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.ap = "BankTujuanPenerima4";
        Intent intent = new Intent(getreceiveralias.getActivity(), onClickBankTransfer.class);
        onClickBankTransfer.IconCompatParcelizer iconCompatParcelizer = onClickBankTransfer.j;
        intent.putExtra(onClickBankTransfer.r, true);
        getreceiveralias.startActivity(intent);
    }

    public static /* synthetic */ void G(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.y();
        ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH = getreceiveralias.C;
        subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH);
        LinearLayout linearLayout = listKodePosAdapter$ListKodePosAdapterVH.e;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH2 = getreceiveralias.C;
        subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH2);
        LinearLayout linearLayout2 = listKodePosAdapter$ListKodePosAdapterVH2.a;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH3 = getreceiveralias.C;
        subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH3);
        ImageView imageView = listKodePosAdapter$ListKodePosAdapterVH3.d;
        subscribeReservationRescheduleEvent.d(imageView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView);
    }

    public static /* synthetic */ void H(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.h.getText().toString());
        ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
        reviewMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewMastercardAdapter$ViewHolder.show(getreceiveralias.getParentFragmentManager(), "StatusPendudukPengirim");
    }

    public static /* synthetic */ void I(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = getreceiveralias.B;
        subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listKecamatanAdapter$ListKecamatanAdapterVH.b.getText().toString());
        ReviewSubMastercardAdapter$ViewHolder reviewSubMastercardAdapter$ViewHolder = new ReviewSubMastercardAdapter$ViewHolder(((BN7PengambilanUpdateReceiverActivity) getreceiveralias.requireActivity()).r);
        reviewSubMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewSubMastercardAdapter$ViewHolder.show(getreceiveralias.getParentFragmentManager(), "SumberDanaBankTransferDialog");
    }

    public static /* synthetic */ void J(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.i.getText().toString());
        ReviewAllCardAdapter$ViewHolder_ViewBinding reviewAllCardAdapter$ViewHolder_ViewBinding = new ReviewAllCardAdapter$ViewHolder_ViewBinding();
        reviewAllCardAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewAllCardAdapter$ViewHolder_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "SaranaPembayaranBankTransferDialog");
    }

    public static /* synthetic */ void K(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = getreceiveralias.q;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailTransaksiROAdapter$ListDetailTransaksiVH.k.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "TipeNasabahPenerima4");
    }

    public static /* synthetic */ void L(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        onUbah onubah = getreceiveralias.k;
        subscribeReservationRescheduleEvent.c(onubah);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, onubah.h.getText().toString());
        ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
        reviewMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewMastercardAdapter$ViewHolder.show(getreceiveralias.getParentFragmentManager(), "StatusPendudukPenerima2");
    }

    public static /* synthetic */ void M(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.ap = "BankTujuanPenerima5";
        Intent intent = new Intent(getreceiveralias.getActivity(), onClickBankTransfer.class);
        onClickBankTransfer.IconCompatParcelizer iconCompatParcelizer = onClickBankTransfer.j;
        intent.putExtra(onClickBankTransfer.r, true);
        getreceiveralias.startActivity(intent);
    }

    public static /* synthetic */ void N(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.x();
        ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH = getreceiveralias.t;
        subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH);
        LinearLayout linearLayout = listJabatanAdapter$ListJabatanVH.a;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH2 = getreceiveralias.t;
        subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH2);
        LinearLayout linearLayout2 = listJabatanAdapter$ListJabatanVH2.d;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH3 = getreceiveralias.t;
        subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH3);
        ImageView imageView = listJabatanAdapter$ListJabatanVH3.e;
        subscribeReservationRescheduleEvent.d(imageView, "");
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = getreceiveralias.q;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
        LinearLayout linearLayout3 = listDetailTransaksiROAdapter$ListDetailTransaksiVH.n;
        subscribeReservationRescheduleEvent.d(linearLayout3, "");
        LinearLayout linearLayout4 = linearLayout3;
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH = getreceiveralias.s;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH);
        LinearLayout linearLayout5 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH.d;
        subscribeReservationRescheduleEvent.d(linearLayout5, "");
        LinearLayout linearLayout6 = linearLayout5;
        ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH4 = getreceiveralias.t;
        subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH4);
        TextView textView = listJabatanAdapter$ListJabatanVH4.f;
        subscribeReservationRescheduleEvent.d(textView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView, linearLayout4, linearLayout6, textView);
    }

    public static /* synthetic */ void O(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.y();
        ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH = getreceiveralias.C;
        subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH);
        LinearLayout linearLayout = listKodePosAdapter$ListKodePosAdapterVH.e;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH2 = getreceiveralias.C;
        subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH2);
        LinearLayout linearLayout2 = listKodePosAdapter$ListKodePosAdapterVH2.a;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH3 = getreceiveralias.C;
        subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH3);
        ImageView imageView = listKodePosAdapter$ListKodePosAdapterVH3.d;
        subscribeReservationRescheduleEvent.d(imageView, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
        LinearLayout linearLayout3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.l;
        subscribeReservationRescheduleEvent.d(linearLayout3, "");
        LinearLayout linearLayout4 = linearLayout3;
        ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding = getreceiveralias.y;
        subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding);
        LinearLayout linearLayout5 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding.e;
        subscribeReservationRescheduleEvent.d(linearLayout5, "");
        LinearLayout linearLayout6 = linearLayout5;
        ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH4 = getreceiveralias.C;
        subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH4);
        TextView textView = listKodePosAdapter$ListKodePosAdapterVH4.g;
        subscribeReservationRescheduleEvent.d(textView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView, linearLayout4, linearLayout6, textView);
    }

    public static /* synthetic */ void P(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        onUbah onubah = getreceiveralias.k;
        subscribeReservationRescheduleEvent.c(onubah);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, onubah.m.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "TipeNasabahPenerima2");
    }

    public static /* synthetic */ void Q(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.f103o.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "TipeNasabahPenerima1");
    }

    public static /* synthetic */ void R(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.s();
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH = getreceiveralias.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH);
        LinearLayout linearLayout = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH.b;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2 = getreceiveralias.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2);
        LinearLayout linearLayout2 = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2.a;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3 = getreceiveralias.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3);
        ImageView imageView = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3.e;
        subscribeReservationRescheduleEvent.d(imageView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView);
    }

    public static /* synthetic */ void S(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.p();
        ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.m;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH);
        LinearLayout linearLayout = listDetailTransaksiAdapter$ListDetailTransaksiVH.c;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH2 = getreceiveralias.m;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH2);
        LinearLayout linearLayout2 = listDetailTransaksiAdapter$ListDetailTransaksiVH2.e;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH3 = getreceiveralias.m;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH3);
        ImageView imageView = listDetailTransaksiAdapter$ListDetailTransaksiVH3.a;
        subscribeReservationRescheduleEvent.d(imageView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView);
    }

    public static /* synthetic */ void T(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Calendar instance = Calendar.getInstance();
        showInfoValueTodayOR e2 = showInfoValueTodayOR.e((showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver) getreceiveralias, instance.get(1), instance.get(2), instance.get(5));
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
        int color = getreceiveralias.getResources().getColor(2131099765);
        e2.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
        e2.show(getreceiveralias.requireActivity().getFragmentManager(), "etTanggalJatuhTempoTransaksi");
    }

    public static /* synthetic */ void U(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.j.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "TipeNasabahPengirim");
    }

    public static /* synthetic */ void V(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.g.getText().toString());
        ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
        reviewMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewMastercardAdapter$ViewHolder.show(getreceiveralias.getParentFragmentManager(), "StatusPendudukPenerima1");
    }

    public static /* synthetic */ void W(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.x();
        ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH = getreceiveralias.t;
        subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH);
        LinearLayout linearLayout = listJabatanAdapter$ListJabatanVH.a;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH2 = getreceiveralias.t;
        subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH2);
        LinearLayout linearLayout2 = listJabatanAdapter$ListJabatanVH2.d;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH3 = getreceiveralias.t;
        subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH3);
        ImageView imageView = listJabatanAdapter$ListJabatanVH3.e;
        subscribeReservationRescheduleEvent.d(imageView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView);
    }

    public static /* synthetic */ void X(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        onUbah onubah = getreceiveralias.k;
        subscribeReservationRescheduleEvent.c(onubah);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, onubah.j.getText().toString());
        StatusKewarganegaraanDialog statusKewarganegaraanDialog = new StatusKewarganegaraanDialog();
        statusKewarganegaraanDialog.setArguments(bundle);
        statusKewarganegaraanDialog.show(getreceiveralias.getParentFragmentManager(), "StatusKewarganegaraanPenerima2");
    }

    public static /* synthetic */ void Z(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        getreceiveralias.s();
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH = getreceiveralias.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH);
        LinearLayout linearLayout = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH.b;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2 = getreceiveralias.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2);
        LinearLayout linearLayout2 = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2.a;
        subscribeReservationRescheduleEvent.d(linearLayout2, "");
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3 = getreceiveralias.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3);
        ImageView imageView = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3.e;
        subscribeReservationRescheduleEvent.d(imageView, "");
        onUbah onubah = getreceiveralias.k;
        subscribeReservationRescheduleEvent.c(onubah);
        LinearLayout linearLayout3 = onubah.k;
        subscribeReservationRescheduleEvent.d(linearLayout3, "");
        LinearLayout linearLayout4 = linearLayout3;
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding = getreceiveralias.f153o;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding);
        LinearLayout linearLayout5 = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.a;
        subscribeReservationRescheduleEvent.d(linearLayout5, "");
        LinearLayout linearLayout6 = linearLayout5;
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4 = getreceiveralias.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4);
        TextView textView = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4.h;
        subscribeReservationRescheduleEvent.d(textView, "");
        getreceiveralias.c(linearLayout, linearLayout2, imageView, linearLayout4, linearLayout6, textView);
    }

    private final ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH a() {
        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH = this.n;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH);
        return listDetailTransaksiAdapter$ListDetailMultiTransaksiVH;
    }

    public static final /* synthetic */ onUbah a(getReceiverAlias getreceiveralias) {
        onUbah onubah = getreceiveralias.k;
        subscribeReservationRescheduleEvent.c(onubah);
        return onubah;
    }

    private static void a(View view, List<? extends EditText> list, List<? extends LogoutDialog_ViewBinding> list2, List<? extends TextView> list3) {
        subscribeReservationRescheduleEvent.e(view, "");
        subscribeReservationRescheduleEvent.e(list, "");
        subscribeReservationRescheduleEvent.e(list2, "");
        subscribeReservationRescheduleEvent.e(list3, "");
        subscribeReservationRescheduleEvent.e(list, "");
        ((TextView) list3.get(list.indexOf(view))).setVisibility(8);
        subscribeReservationRescheduleEvent.e(list, "");
        ((LogoutDialog_ViewBinding) list2.get(list.indexOf(view))).setBackgroundResource(2131230847);
    }

    public static void a(EditText editText, List<? extends EditText> list, List<? extends LogoutDialog_ViewBinding> list2, List<? extends TextView> list3) {
        subscribeReservationRescheduleEvent.e(editText, "");
        subscribeReservationRescheduleEvent.e(list, "");
        subscribeReservationRescheduleEvent.e(list2, "");
        subscribeReservationRescheduleEvent.e(list3, "");
        getPromotion.b(list3, list2, list, editText);
    }

    private void a(BankTransferPenerima bankTransferPenerima) {
        subscribeReservationRescheduleEvent.e(bankTransferPenerima, "");
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.i.setText(bankTransferPenerima.getNamaPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.h.setText(bankTransferPenerima.getNorekPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.e.setText(bankTransferPenerima.getBankTujuanPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4);
        LogoutDialog logoutDialog = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4.j;
        StringBuilder sb = new StringBuilder();
        String nominalPenerima = bankTransferPenerima.getNominalPenerima();
        subscribeReservationRescheduleEvent.d(nominalPenerima, "");
        sb.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima, ".", ",", false)));
        sb.append(" IDR");
        logoutDialog.setText(sb.toString());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5.c.setText(bankTransferPenerima.getBeritaPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6.b.setText(bankTransferPenerima.getAlamatPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7.f103o.setText(bankTransferPenerima.getTipeNasabahPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8.f103o.setTag(bankTransferPenerima.getTipeNasabahPenerimaId());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9.g.setText(bankTransferPenerima.getStatusPendudukPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10.f.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11);
        String str = "Tidak";
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11.d.setText(bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS") ? "Ya" : "Tidak");
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12 = this.h;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12);
        EditText editText = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12.a;
        StringBuilder sb2 = new StringBuilder();
        String biayaTransfer = bankTransferPenerima.getBiayaTransfer();
        subscribeReservationRescheduleEvent.d(biayaTransfer, "");
        sb2.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer, ".", ",", false)));
        sb2.append(" IDR");
        editText.setText(sb2.toString());
        this.P = bankTransferPenerima.getBankTujuanBIC();
        DetailTundaCCActivity detailTundaCCActivity = this.D;
        DetailTundaCCActivity detailTundaCCActivity2 = null;
        DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
        if (detailTundaCCActivity == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaCCActivity3 = null;
        }
        detailTundaCCActivity3.b = bankTransferPenerima.getBankTujuanBIC();
        detailTundaCCActivity2 = this.G;
        if (detailTundaCCActivity2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        detailTundaCCActivity2.b = bankTransferPenerima.getBankTujuanBIC();
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            ((LogoutDialog_ViewBinding) this.ak.get(i)).setHintEnabled(!(((EditText) this.W.get(i)).getText().toString().length() == 0));
        }
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.n.setText(bankTransferPenerima.getNamaPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.s.setText(bankTransferPenerima.getNorekPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.f.setText(bankTransferPenerima.getBankTujuanPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4);
        TextView textView = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4.f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(bankTransferPenerima.getBankTujuanCode());
        sb3.append(bankTransferPenerima.getBankTujuanOfficeCode());
        textView.setTag(sb3.toString());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5);
        TextView textView2 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5.p;
        StringBuilder sb4 = new StringBuilder();
        String nominalPenerima2 = bankTransferPenerima.getNominalPenerima();
        subscribeReservationRescheduleEvent.d(nominalPenerima2, "");
        sb4.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima2, ".", ",", false)));
        sb4.append(" IDR");
        textView2.setText(sb4.toString());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6.l.setText(bankTransferPenerima.getBeritaPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7.j.setText(bankTransferPenerima.getAlamatPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8.q.setText(bankTransferPenerima.getTipeNasabahPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9.r.setText(bankTransferPenerima.getStatusPendudukPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10);
        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10.k.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11);
        TextView textView3 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11.f104o;
        if (bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS")) {
            str = "Ya";
        }
        textView3.setText(str);
        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12 = this.g;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12);
        TextView textView4 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12.m;
        StringBuilder sb5 = new StringBuilder();
        String biayaTransfer2 = bankTransferPenerima.getBiayaTransfer();
        subscribeReservationRescheduleEvent.d(biayaTransfer2, "");
        sb5.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer2, ".", ",", false)));
        sb5.append(" IDR");
        textView4.setText(sb5.toString());
    }

    public static /* synthetic */ void a(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = getreceiveralias.q;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailTransaksiROAdapter$ListDetailTransaksiVH.f.getText().toString());
        StatusKewarganegaraanDialog statusKewarganegaraanDialog = new StatusKewarganegaraanDialog();
        statusKewarganegaraanDialog.setArguments(bundle);
        statusKewarganegaraanDialog.show(getreceiveralias.getParentFragmentManager(), "StatusKewarganegaraanPenerima4");
    }

    public static /* synthetic */ void a(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH c = ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH.c(view);
        getreceiveralias.s = c;
        subscribeReservationRescheduleEvent.c(c);
        LinearLayout linearLayout = c.d;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        getreceiveralias.e(linearLayout);
    }

    private final ListDetailTransaksiAdapter$ListDetailTransaksiVH b() {
        ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH = this.m;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH);
        return listDetailTransaksiAdapter$ListDetailTransaksiVH;
    }

    public static final /* synthetic */ ListDetailTransaksiROAdapter$ListDetailTransaksiVH b(getReceiverAlias getreceiveralias) {
        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = getreceiveralias.q;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
        return listDetailTransaksiROAdapter$ListDetailTransaksiVH;
    }

    private void b(BankTransfer bankTransfer) {
        subscribeReservationRescheduleEvent.e(bankTransfer, "");
        getView activity = getActivity();
        if (activity != null) {
            String str = ((BN7PengambilanUpdateReceiverActivity) activity).l;
            RealmList<BankTransferPenerima> penerimaList = bankTransfer.getPenerimaList();
            int size = penerimaList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4 && penerimaList.get(i) != null) {
                                    ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH = this.w;
                                    subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH);
                                    listKantorCabangAdapter$ListKantorCabangVH.a.setVisibility(0);
                                }
                            } else if (penerimaList.get(i) != null) {
                                ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH = this.t;
                                subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH);
                                listJabatanAdapter$ListJabatanVH.c.setVisibility(0);
                            }
                        } else if (penerimaList.get(i) != null) {
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding = this.r;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding);
                            listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding.a.setVisibility(0);
                        }
                    } else if (penerimaList.get(i) != null) {
                        ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH = this.n;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH);
                        listDetailTransaksiAdapter$ListDetailMultiTransaksiVH.d.setVisibility(0);
                    }
                } else if (penerimaList.get(i) != null) {
                    ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH = this.m;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH);
                    listDetailTransaksiAdapter$ListDetailTransaksiVH.b.setVisibility(0);
                }
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormUbahActivity");
    }

    private void b(BankTransferPenerima bankTransferPenerima) {
        subscribeReservationRescheduleEvent.e(bankTransferPenerima, "");
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.g.setText(bankTransferPenerima.getNamaPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.i.setText(bankTransferPenerima.getNorekPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.b.setText(bankTransferPenerima.getBankTujuanPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4);
        LogoutDialog logoutDialog = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4.h;
        StringBuilder sb = new StringBuilder();
        String nominalPenerima = bankTransferPenerima.getNominalPenerima();
        subscribeReservationRescheduleEvent.d(nominalPenerima, "");
        sb.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima, ".", ",", false)));
        sb.append(" IDR");
        logoutDialog.setText(sb.toString());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5.a.setText(bankTransferPenerima.getBeritaPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6.e.setText(bankTransferPenerima.getAlamatPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7.f106o.setText(bankTransferPenerima.getTipeNasabahPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8.f106o.setTag(bankTransferPenerima.getTipeNasabahPenerimaId());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9.f.setText(bankTransferPenerima.getStatusPendudukPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10);
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10.j.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11);
        String str = "Tidak";
        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11.c.setText(bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS") ? "Ya" : "Tidak");
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12 = this.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12);
        EditText editText = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12.d;
        StringBuilder sb2 = new StringBuilder();
        String biayaTransfer = bankTransferPenerima.getBiayaTransfer();
        subscribeReservationRescheduleEvent.d(biayaTransfer, "");
        sb2.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer, ".", ",", false)));
        sb2.append(" IDR");
        editText.setText(sb2.toString());
        this.O = bankTransferPenerima.getBankTujuanBIC();
        DetailTundaCCActivity detailTundaCCActivity = this.E;
        DetailTundaCCActivity detailTundaCCActivity2 = null;
        DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
        if (detailTundaCCActivity == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaCCActivity3 = null;
        }
        detailTundaCCActivity3.b = bankTransferPenerima.getBankTujuanBIC();
        detailTundaCCActivity2 = this.N;
        if (detailTundaCCActivity2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        detailTundaCCActivity2.b = bankTransferPenerima.getBankTujuanBIC();
        int size = this.U.size();
        for (int i = 0; i < size; i++) {
            ((LogoutDialog_ViewBinding) this.am.get(i)).setHintEnabled(!(((EditText) this.U.get(i)).getText().toString().length() == 0));
        }
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding.m.setText(bankTransferPenerima.getNamaPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding2 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding2);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding2.r.setText(bankTransferPenerima.getNorekPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding3 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding3);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding3.i.setText(bankTransferPenerima.getBankTujuanPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding4 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding4);
        TextView textView = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding4.i;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(bankTransferPenerima.getBankTujuanCode());
        sb3.append(bankTransferPenerima.getBankTujuanOfficeCode());
        textView.setTag(sb3.toString());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding5 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding5);
        TextView textView2 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding5.p;
        StringBuilder sb4 = new StringBuilder();
        String nominalPenerima2 = bankTransferPenerima.getNominalPenerima();
        subscribeReservationRescheduleEvent.d(nominalPenerima2, "");
        sb4.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima2, ".", ",", false)));
        sb4.append(" IDR");
        textView2.setText(sb4.toString());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding6 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding6);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding6.k.setText(bankTransferPenerima.getBeritaPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding7 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding7);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding7.g.setText(bankTransferPenerima.getAlamatPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding8 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding8);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding8.q.setText(bankTransferPenerima.getTipeNasabahPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding9 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding9);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding9.s.setText(bankTransferPenerima.getStatusPendudukPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding10 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding10);
        listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding10.n.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding11 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding11);
        TextView textView3 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding11.f108o;
        if (bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS")) {
            str = "Ya";
        }
        textView3.setText(str);
        ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding12 = this.p;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding12);
        TextView textView4 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding12.l;
        StringBuilder sb5 = new StringBuilder();
        String biayaTransfer2 = bankTransferPenerima.getBiayaTransfer();
        subscribeReservationRescheduleEvent.d(biayaTransfer2, "");
        sb5.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer2, ".", ",", false)));
        sb5.append(" IDR");
        textView4.setText(sb5.toString());
    }

    public static /* synthetic */ void b(getReceiverAlias getreceiveralias, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        Bundle bundle = new Bundle();
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = getreceiveralias.v;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listJenisMataUangAdapter$ListJenisMataUangAdapterVH.g.getText().toString());
        ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
        reviewMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewMastercardAdapter$ViewHolder.show(getreceiveralias.getParentFragmentManager(), "StatusPendudukPenerima5");
    }

    public static /* synthetic */ void b(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
        subscribeReservationRescheduleEvent.e(getreceiveralias, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding a = ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.a(view);
        getreceiveralias.u = a;
        subscribeReservationRescheduleEvent.c(a);
        AutoCompleteTextView autoCompleteTextView = a.d;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
        EditText editText = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.b;
        subscribeReservationRescheduleEvent.d(editText, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
        EditText editText2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.i;
        subscribeReservationRescheduleEvent.d(editText2, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
        EditText editText3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.e;
        subscribeReservationRescheduleEvent.d(editText3, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4);
        EditText editText4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4.j;
        subscribeReservationRescheduleEvent.d(editText4, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5);
        EditText editText5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5.h;
        subscribeReservationRescheduleEvent.d(editText5, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6);
        EditText editText6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6.g;
        subscribeReservationRescheduleEvent.d(editText6, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7);
        AutoCompleteTextView autoCompleteTextView2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7.a;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8);
        EditText editText7 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8.c;
        subscribeReservationRescheduleEvent.d(editText7, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9);
        EditText editText8 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9.f;
        subscribeReservationRescheduleEvent.d(editText8, "");
        EditText[] editTextArr = {autoCompleteTextView, editText, editText2, editText3, editText4, editText5, editText6, autoCompleteTextView2, editText7, editText8};
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        List<? extends EditText> asList = Arrays.asList(editTextArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        getreceiveralias.Z = asList;
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10.f112o;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11.t;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12.r;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13.m;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14.w;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15.q;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16.p;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17.k;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18.n;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding19 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding19);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding19.s;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
        LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, logoutDialog_ViewBinding10};
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
        subscribeReservationRescheduleEvent.d(asList2, "");
        getreceiveralias.ar = asList2;
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding20 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding20);
        TextView textView = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding20.x;
        subscribeReservationRescheduleEvent.d(textView, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding21 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding21);
        TextView textView2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding21.C;
        subscribeReservationRescheduleEvent.d(textView2, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding22 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding22);
        TextView textView3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding22.A;
        subscribeReservationRescheduleEvent.d(textView3, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding23 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding23);
        TextView textView4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding23.v;
        subscribeReservationRescheduleEvent.d(textView4, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding24 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding24);
        TextView textView5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding24.H;
        subscribeReservationRescheduleEvent.d(textView5, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding25 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding25);
        TextView textView6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding25.z;
        subscribeReservationRescheduleEvent.d(textView6, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding26 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding26);
        TextView textView7 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding26.D;
        subscribeReservationRescheduleEvent.d(textView7, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding27 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding27);
        TextView textView8 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding27.u;
        subscribeReservationRescheduleEvent.d(textView8, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding28 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding28);
        TextView textView9 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding28.y;
        subscribeReservationRescheduleEvent.d(textView9, "");
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding29 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding29);
        TextView textView10 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding29.B;
        subscribeReservationRescheduleEvent.d(textView10, "");
        TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10};
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        List<? extends TextView> asList3 = Arrays.asList(textViewArr);
        subscribeReservationRescheduleEvent.d(asList3, "");
        getreceiveralias.ah = asList3;
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding30 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding30);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding30.e.setOnEditorActionListener(new setCardDescription());
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding31 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding31);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding31.i.setOnClickListener(new View.OnClickListener() { // from class: o.getWarkatType
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getReceiverAlias.J(getReceiverAlias.this, view2);
            }
        });
        if (getreceiveralias.g() != null && getreceiveralias.g().getVerified().equals("Y")) {
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding32 = getreceiveralias.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding32);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding32.b.setFocusable(false);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding33 = getreceiveralias.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding33);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding33.b.setHint(getreceiveralias.getResources().getString(2131821206));
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding34 = getreceiveralias.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding34);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding34.b.setOnClickListener(new View.OnClickListener() { // from class: o.setBankBICKey
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.j(getReceiverAlias.this, view2);
                }
            });
        }
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding35 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding35);
        AutoCompleteTextView autoCompleteTextView3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding35.d;
        getReceiverAlias getreceiveralias2 = getreceiveralias;
        autoCompleteTextView3.setOnFocusChangeListener(getreceiveralias2);
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding36 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding36);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding36.b.setOnFocusChangeListener(getreceiveralias2);
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding37 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding37);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding37.e.setOnFocusChangeListener(getreceiveralias2);
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding38 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding38);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding38.a.setOnFocusChangeListener(getreceiveralias2);
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding39 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding39);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding39.c.setOnFocusChangeListener(getreceiveralias2);
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding40 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding40);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding40.f.setOnFocusChangeListener(getreceiveralias2);
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding41 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding41);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding41.j.setOnClickListener(new View.OnClickListener() { // from class: o.setFlagRepresentativeTransaction
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getReceiverAlias.U(getReceiverAlias.this, view2);
            }
        });
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding42 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding42);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding42.h.setOnClickListener(new View.OnClickListener() { // from class: o.setFlagTxnBerkala
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getReceiverAlias.H(getReceiverAlias.this, view2);
            }
        });
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding43 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding43);
        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding43.g.setOnClickListener(new View.OnClickListener() { // from class: o.setFullAmount
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getReceiverAlias.c(getReceiverAlias.this, view2);
            }
        });
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding44 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding44);
        AutoCompleteTextView autoCompleteTextView4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding44.d;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView4, "");
        autoCompleteTextView4.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$ComponentActivity$5
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                AutoCompleteTextView autoCompleteTextView5 = getReceiverAlias.g(getReceiverAlias.this).d;
                subscribeReservationRescheduleEvent.d(autoCompleteTextView5, "");
                getReceiverAlias.a((EditText) autoCompleteTextView5, (List<? extends EditText>) getReceiverAlias.this.Z, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ar, (List<? extends TextView>) getReceiverAlias.this.ah);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding45 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding45);
        EditText editText9 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding45.e;
        subscribeReservationRescheduleEvent.d(editText9, "");
        editText9.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$ActivityResultRegistry$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                EditText editText10 = getReceiverAlias.g(getReceiverAlias.this).e;
                subscribeReservationRescheduleEvent.d(editText10, "");
                getReceiverAlias.a(editText10, (List<? extends EditText>) getReceiverAlias.this.Z, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ar, (List<? extends TextView>) getReceiverAlias.this.ah);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding46 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding46);
        EditText editText10 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding46.e;
        subscribeReservationRescheduleEvent.d(editText10, "");
        editText10.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$ComponentActivity$4
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                EditText editText11 = getReceiverAlias.g(getReceiverAlias.this).e;
                subscribeReservationRescheduleEvent.d(editText11, "");
                getReceiverAlias.a(editText11, (List<? extends EditText>) getReceiverAlias.this.Z, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ar, (List<? extends TextView>) getReceiverAlias.this.ah);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding47 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding47);
        AutoCompleteTextView autoCompleteTextView5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding47.a;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView5, "");
        autoCompleteTextView5.addTextChangedListener(new ImmLeaksCleaner());
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding48 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding48);
        EditText editText11 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding48.c;
        subscribeReservationRescheduleEvent.d(editText11, "");
        editText11.addTextChangedListener(new setCheckable());
        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding49 = getreceiveralias.u;
        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding49);
        EditText editText12 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding49.f;
        subscribeReservationRescheduleEvent.d(editText12, "");
        editText12.addTextChangedListener(new setHasDecor());
    }

    public static final /* synthetic */ ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding c(getReceiverAlias getreceiveralias) {
        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.l;
        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
        return listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding;
    }

    private final onUbah c() {
        onUbah onubah = this.k;
        subscribeReservationRescheduleEvent.c(onubah);
        return onubah;
    }

    private final void c(EditText editText) {
        ((TextView) this.ae.get(this.Y.indexOf(editText))).setVisibility(8);
        ((LogoutDialog_ViewBinding) this.aq.get(this.Y.indexOf(editText))).setBackgroundResource(2131230847);
    }

    private final void c(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView) {
        Drawable background = linearLayout2.getBackground();
        if (background != null) {
            TransitionDrawable transitionDrawable = (TransitionDrawable) background;
            transitionDrawable.setCrossFadeEnabled(true);
            if (linearLayout.getVisibility() == 8) {
                this.J.c(linearLayout);
                setMessage setmessage = this.J;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                return;
            }
            setMessage setmessage2 = this.J;
            LinearLayout linearLayout3 = linearLayout;
            setmessage2.a = linearLayout3.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0073: IPUT  
                  (wrap: o.setMessage$1 : 0x0070: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout3' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v10 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: o.getReceiverAlias.c(android.widget.LinearLayout, android.widget.LinearLayout, android.widget.ImageView):void, file: classes-dex2jar.jar:o/getReceiverAlias.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 27 more
                */
            /*
                this = this;
                r0 = r12
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L_0x00a8
                r0 = r12
                android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                r12 = r0
                r0 = r12
                r1 = 1
                r0.setCrossFadeEnabled(r1)
                r0 = r11
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x0053
                r0 = r10
                o.setMessage r0 = r0.J
                r1 = r11
                android.view.View r1 = (android.view.View) r1
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.J
                r11 = r0
                r0 = r13
                android.view.View r0 = (android.view.View) r0
                r13 = r0
                r0 = r11
                android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                r2 = r1
                r3 = 0
                r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                r5 = 1
                r6 = 1056964608(0x3f000000, float:0.5)
                r7 = 1
                r8 = 1056964608(0x3f000000, float:0.5)
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r0.c = r1
                r0 = r11
                r1 = r13
                r0.e(r1)
                r0 = r12
                r1 = 0
                r0.startTransition(r1)
                return
            L_0x0053:
                r0 = r10
                o.setMessage r0 = r0.J
                r14 = r0
                r0 = r11
                android.view.View r0 = (android.view.View) r0
                r11 = r0
                r0 = r14
                r1 = r11
                int r1 = r1.getMeasuredHeight()
                r0.a = r1
                r0 = r14
                o.setMessage$1 r1 = new o.setMessage$1
                r2 = r1
                r3 = r14
                r4 = r11
                r2.<init>(r4)
                r0.b = r1
                r0 = r14
                r1 = r11
                r0.b(r1)
                r0 = r10
                o.setMessage r0 = r0.J
                r11 = r0
                r0 = r13
                android.view.View r0 = (android.view.View) r0
                r13 = r0
                r0 = r11
                android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                r2 = r1
                r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                r4 = 0
                r5 = 1
                r6 = 1056964608(0x3f000000, float:0.5)
                r7 = 1
                r8 = 1056964608(0x3f000000, float:0.5)
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r0.c = r1
                r0 = r11
                r1 = r13
                r0.e(r1)
                r0 = r12
                r1 = 0
                r0.reverseTransition(r1)
                return
            L_0x00a8:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                java.lang.String r2 = "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getReceiverAlias.c(android.widget.LinearLayout, android.widget.LinearLayout, android.widget.ImageView):void");
        }

        private final void c(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, View view, View view2, TextView textView) {
            textView.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(0);
            Drawable background = linearLayout2.getBackground();
            if (background != null) {
                TransitionDrawable transitionDrawable = (TransitionDrawable) background;
                transitionDrawable.setCrossFadeEnabled(true);
                if (linearLayout.getVisibility() == 8) {
                    this.J.c(linearLayout);
                    setMessage setmessage = this.J;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
        }

        private void c(BankTransferPenerima bankTransferPenerima) {
            subscribeReservationRescheduleEvent.e(bankTransferPenerima, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH.g.setText(bankTransferPenerima.getNamaPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH2.i.setText(bankTransferPenerima.getNorekPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH3.d.setText(bankTransferPenerima.getBankTujuanPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH4 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH4);
            LogoutDialog logoutDialog = listDetailTransaksiROAdapter$ListDetailTransaksiVH4.j;
            StringBuilder sb = new StringBuilder();
            String nominalPenerima = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima, "");
            sb.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima, ".", ",", false)));
            sb.append(" IDR");
            logoutDialog.setText(sb.toString());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH5 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH5);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH5.b.setText(bankTransferPenerima.getBeritaPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH6 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH6);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH6.c.setText(bankTransferPenerima.getAlamatPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH7 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH7);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH7.k.setText(bankTransferPenerima.getTipeNasabahPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH8 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH8);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH8.k.setTag(bankTransferPenerima.getTipeNasabahPenerimaId());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH9 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH9);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH9.h.setText(bankTransferPenerima.getStatusPendudukPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH10 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH10);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH10.f.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH11 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH11);
            String str = "Tidak";
            listDetailTransaksiROAdapter$ListDetailTransaksiVH11.a.setText(bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS") ? "Ya" : "Tidak");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH12 = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH12);
            EditText editText = listDetailTransaksiROAdapter$ListDetailTransaksiVH12.e;
            StringBuilder sb2 = new StringBuilder();
            String biayaTransfer = bankTransferPenerima.getBiayaTransfer();
            subscribeReservationRescheduleEvent.d(biayaTransfer, "");
            sb2.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer, ".", ",", false)));
            sb2.append(" IDR");
            editText.setText(sb2.toString());
            this.R = bankTransferPenerima.getBankTujuanBIC();
            DetailTundaCCActivity detailTundaCCActivity = this.F;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            detailTundaCCActivity3.b = bankTransferPenerima.getBankTujuanBIC();
            detailTundaCCActivity2 = this.L;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            detailTundaCCActivity2.b = bankTransferPenerima.getBankTujuanBIC();
            int size = this.V.size();
            for (int i = 0; i < size; i++) {
                ((LogoutDialog_ViewBinding) this.ai.get(i)).setHintEnabled(!(((EditText) this.V.get(i)).getText().toString().length() == 0));
            }
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH.l.setText(bankTransferPenerima.getNamaPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH2 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH2);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH2.t.setText(bankTransferPenerima.getNorekPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH3 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH3);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH3.f.setText(bankTransferPenerima.getBankTujuanPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH4 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH4);
            TextView textView = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH4.f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(bankTransferPenerima.getBankTujuanCode());
            sb3.append(bankTransferPenerima.getBankTujuanOfficeCode());
            textView.setTag(sb3.toString());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH5 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH5);
            TextView textView2 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH5.s;
            StringBuilder sb4 = new StringBuilder();
            String nominalPenerima2 = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima2, "");
            sb4.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima2, ".", ",", false)));
            sb4.append(" IDR");
            textView2.setText(sb4.toString());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH6 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH6);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH6.m.setText(bankTransferPenerima.getBeritaPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH7 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH7);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH7.i.setText(bankTransferPenerima.getAlamatPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH8 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH8);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH8.q.setText(bankTransferPenerima.getTipeNasabahPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH9 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH9);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH9.r.setText(bankTransferPenerima.getStatusPendudukPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH10 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH10);
            listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH10.k.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH11 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH11);
            TextView textView3 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH11.n;
            if (bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS")) {
                str = "Ya";
            }
            textView3.setText(str);
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH12 = this.s;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH12);
            TextView textView4 = listDetailTransaksiROAdapter$ListDetailMultiTransaksiVH12.f107o;
            StringBuilder sb5 = new StringBuilder();
            String biayaTransfer2 = bankTransferPenerima.getBiayaTransfer();
            subscribeReservationRescheduleEvent.d(biayaTransfer2, "");
            sb5.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer2, ".", ",", false)));
            sb5.append(" IDR");
            textView4.setText(sb5.toString());
        }

        public static /* synthetic */ void c(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            Bundle bundle = new Bundle();
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.g.getText().toString());
            StatusKewarganegaraanDialog statusKewarganegaraanDialog = new StatusKewarganegaraanDialog();
            statusKewarganegaraanDialog.setArguments(bundle);
            statusKewarganegaraanDialog.show(getreceiveralias.getParentFragmentManager(), "StatusKewarganegaraanPengirim");
        }

        public static /* synthetic */ void c(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH d2 = ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH.d(view);
            getreceiveralias.h = d2;
            subscribeReservationRescheduleEvent.c(d2);
            EditText editText = d2.e;
            subscribeReservationRescheduleEvent.d(editText, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
            AutoCompleteTextView autoCompleteTextView = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.h;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
            AutoCompleteTextView autoCompleteTextView2 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
            LogoutDialog logoutDialog = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.j;
            subscribeReservationRescheduleEvent.d(logoutDialog, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4);
            EditText editText2 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4.c;
            subscribeReservationRescheduleEvent.d(editText2, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5);
            EditText editText3 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5.b;
            subscribeReservationRescheduleEvent.d(editText3, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6);
            EditText editText4 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6.f103o;
            subscribeReservationRescheduleEvent.d(editText4, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7);
            EditText editText5 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7.g;
            subscribeReservationRescheduleEvent.d(editText5, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8);
            EditText editText6 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8.f;
            subscribeReservationRescheduleEvent.d(editText6, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9);
            EditText editText7 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9.d;
            subscribeReservationRescheduleEvent.d(editText7, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10);
            EditText editText8 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10.a;
            subscribeReservationRescheduleEvent.d(editText8, "");
            EditText[] editTextArr = {editText, autoCompleteTextView, autoCompleteTextView2, (EditText) logoutDialog, editText2, editText3, editText4, editText5, editText6, editText7, editText8};
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            List<? extends EditText> asList = Arrays.asList(editTextArr);
            subscribeReservationRescheduleEvent.d(asList, "");
            getreceiveralias.W = asList;
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11.l;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12.t;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13.q;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14.s;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15.k;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH16 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH16);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH16.n;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH17 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH17);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH17.v;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH18 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH18);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH18.u;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH19 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH19);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH19.y;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH20 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH20);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH20.p;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH21 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH21);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH21.r;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
            LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, logoutDialog_ViewBinding10, logoutDialog_ViewBinding11};
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
            subscribeReservationRescheduleEvent.d(asList2, "");
            getreceiveralias.ak = asList2;
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH22 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH22);
            TextView textView = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH22.w;
            subscribeReservationRescheduleEvent.d(textView, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH23 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH23);
            TextView textView2 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH23.B;
            subscribeReservationRescheduleEvent.d(textView2, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH24 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH24);
            TextView textView3 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH24.A;
            subscribeReservationRescheduleEvent.d(textView3, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH25 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH25);
            TextView textView4 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH25.F;
            subscribeReservationRescheduleEvent.d(textView4, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH26 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH26);
            TextView textView5 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH26.D;
            subscribeReservationRescheduleEvent.d(textView5, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH27 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH27);
            TextView textView6 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH27.x;
            subscribeReservationRescheduleEvent.d(textView6, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH28 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH28);
            TextView textView7 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH28.I;
            subscribeReservationRescheduleEvent.d(textView7, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH29 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH29);
            TextView textView8 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH29.H;
            subscribeReservationRescheduleEvent.d(textView8, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH30 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH30);
            TextView textView9 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH30.E;
            subscribeReservationRescheduleEvent.d(textView9, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH31 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH31);
            TextView textView10 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH31.C;
            subscribeReservationRescheduleEvent.d(textView10, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH32 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH32);
            TextView textView11 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH32.z;
            subscribeReservationRescheduleEvent.d(textView11, "");
            TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11};
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            List<? extends TextView> asList3 = Arrays.asList(textViewArr);
            subscribeReservationRescheduleEvent.d(asList3, "");
            getreceiveralias.aa = asList3;
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH33 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH33);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH33.c.setOnEditorActionListener(new setCardDescription());
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH34 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH34);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH34.b.setOnEditorActionListener(new setCardDescription());
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH35 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH35);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH35.e.setOnClickListener(new View.OnClickListener() { // from class: o.setBankStates
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.B(getReceiverAlias.this, view2);
                }
            });
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH36 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH36);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH36.f103o.setOnClickListener(new View.OnClickListener() { // from class: o.setFinancialRelation
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.Q(getReceiverAlias.this, view2);
                }
            });
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH37 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH37);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH37.g.setOnClickListener(new View.OnClickListener() { // from class: o.setCreatedAt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.V(getReceiverAlias.this, view2);
                }
            });
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH38 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH38);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH38.f.setOnClickListener(new View.OnClickListener() { // from class: o.setCustomerType
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.i(getReceiverAlias.this, view2);
                }
            });
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH39 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH39);
            AutoCompleteTextView autoCompleteTextView3 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH39.i;
            DetailTundaCCActivity detailTundaCCActivity = getreceiveralias.D;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            autoCompleteTextView3.setAdapter(detailTundaCCActivity3);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH40 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH40);
            AutoCompleteTextView autoCompleteTextView4 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH40.i;
            getReceiverAlias getreceiveralias2 = getreceiveralias;
            autoCompleteTextView4.setOnItemClickListener(getreceiveralias2);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH41 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH41);
            AutoCompleteTextView autoCompleteTextView5 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH41.h;
            detailTundaCCActivity2 = getreceiveralias.G;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            autoCompleteTextView5.setAdapter(detailTundaCCActivity2);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH42 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH42);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH42.h.setOnItemClickListener(getreceiveralias2);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH43 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH43);
            AutoCompleteTextView autoCompleteTextView6 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH43.i;
            getReceiverAlias getreceiveralias3 = getreceiveralias;
            autoCompleteTextView6.setOnFocusChangeListener(getreceiveralias3);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH44 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH44);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH44.h.setOnFocusChangeListener(getreceiveralias3);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH45 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH45);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH45.j.setOnFocusChangeListener(getreceiveralias3);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH46 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH46);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH46.c.setOnFocusChangeListener(getreceiveralias3);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH47 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH47);
            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH47.b.setOnFocusChangeListener(getreceiveralias3);
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH48 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH48);
            AutoCompleteTextView autoCompleteTextView7 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH48.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView7, "");
            autoCompleteTextView7.addTextChangedListener(new write());
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH49 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH49);
            AutoCompleteTextView autoCompleteTextView8 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH49.h;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
            autoCompleteTextView8.addTextChangedListener(new RemoteActionCompatParcelizer());
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH50 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH50);
            EditText editText9 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH50.c;
            subscribeReservationRescheduleEvent.d(editText9, "");
            editText9.addTextChangedListener(new IconCompatParcelizer());
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH51 = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH51);
            EditText editText10 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH51.b;
            subscribeReservationRescheduleEvent.d(editText10, "");
            editText10.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaBrowserCompat$CustomActionResultReceiver
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    EditText editText11 = getReceiverAlias.e(getReceiverAlias.this).b;
                    subscribeReservationRescheduleEvent.d(editText11, "");
                    getReceiverAlias.a(editText11, (List<? extends EditText>) getReceiverAlias.this.W, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ak, (List<? extends TextView>) getReceiverAlias.this.aa);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
        }

        private final ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH d() {
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
            return listDetailOpenTransaksiAdapter$ListDetailTransaksiVH;
        }

        public static final /* synthetic */ ListJenisMataUangAdapter$ListJenisMataUangAdapterVH d(getReceiverAlias getreceiveralias) {
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
            return listJenisMataUangAdapter$ListJenisMataUangAdapterVH;
        }

        public static void d(int i, String str, List<? extends LogoutDialog_ViewBinding> list, List<? extends TextView> list2) {
            subscribeReservationRescheduleEvent.e(str, "");
            subscribeReservationRescheduleEvent.e(list, "");
            subscribeReservationRescheduleEvent.e(list2, "");
            ((TextView) list2.get(i)).setVisibility(0);
            ((TextView) list2.get(i)).setText(str);
            ((LogoutDialog_ViewBinding) list.get(i)).setBackgroundResource(2131230870);
        }

        private void d(BankTransfer bankTransfer) {
            subscribeReservationRescheduleEvent.e(bankTransfer, "");
            String totalPembayaran = bankTransfer.getTotalPembayaran();
            subscribeReservationRescheduleEvent.d(totalPembayaran, "");
            BigDecimal valueOf = BigDecimal.valueOf(Double.parseDouble(totalPembayaran));
            String totalNominal = bankTransfer.getTotalNominal();
            subscribeReservationRescheduleEvent.d(totalNominal, "");
            BigDecimal.valueOf(Double.parseDouble(totalNominal));
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            EditText editText = listKecamatanAdapter$ListKecamatanAdapterVH.c;
            StringBuilder sb = new StringBuilder();
            String totalNominal2 = bankTransfer.getTotalNominal();
            subscribeReservationRescheduleEvent.d(totalNominal2, "");
            sb.append(getPromotion.j(CheckOTPSessionPresenter.a(totalNominal2, ".", ",", false)));
            sb.append(" IDR");
            editText.setText(sb.toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
            EditText editText2 = listKecamatanAdapter$ListKecamatanAdapterVH2.e;
            StringBuilder sb2 = new StringBuilder();
            String totalBiayaTransfer = bankTransfer.getTotalBiayaTransfer();
            subscribeReservationRescheduleEvent.d(totalBiayaTransfer, "");
            sb2.append(getPromotion.j(CheckOTPSessionPresenter.a(totalBiayaTransfer, ".", ",", false)));
            sb2.append(" IDR");
            editText2.setText(sb2.toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
            EditText editText3 = listKecamatanAdapter$ListKecamatanAdapterVH3.h;
            StringBuilder sb3 = new StringBuilder();
            String totalPembayaran2 = bankTransfer.getTotalPembayaran();
            subscribeReservationRescheduleEvent.d(totalPembayaran2, "");
            sb3.append(getPromotion.j(CheckOTPSessionPresenter.a(totalPembayaran2, ".", ",", false)));
            sb3.append(" IDR");
            editText3.setText(sb3.toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH4 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH4);
            listKecamatanAdapter$ListKecamatanAdapterVH4.b.setText(bankTransfer.getSumberDanaTransaksi());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH5 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH5);
            listKecamatanAdapter$ListKecamatanAdapterVH5.b.setTag(bankTransfer.getSumberDanaTransaksiCode());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH6 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH6);
            listKecamatanAdapter$ListKecamatanAdapterVH6.i.setText(bankTransfer.getTujuanTransaksi());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH7 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH7);
            listKecamatanAdapter$ListKecamatanAdapterVH7.i.setTag(bankTransfer.getTujuanTransaksiCode());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH8 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH8);
            listKecamatanAdapter$ListKecamatanAdapterVH8.a.setText(bankTransfer.getNoWarkatTransaksi());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH9 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH9);
            listKecamatanAdapter$ListKecamatanAdapterVH9.g.setText(bankTransfer.getWaktuPengirimanTransaksi());
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH10 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH10);
            listKecamatanAdapter$ListKecamatanAdapterVH10.d.setText(bankTransfer.getTanggalJatuhTempoTransaksi());
            int size = this.Y.size();
            for (int i = 0; i < size; i++) {
                ((LogoutDialog_ViewBinding) this.aq.get(i)).setHintEnabled(!(((EditText) this.Y.get(i)).getText().toString().length() == 0));
            }
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding);
            TextView textView = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding.n;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH11 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH11);
            textView.setText(listKecamatanAdapter$ListKecamatanAdapterVH11.c.getText().toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding2 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding2);
            TextView textView2 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding2.f115o;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH12 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH12);
            textView2.setText(listKecamatanAdapter$ListKecamatanAdapterVH12.e.getText().toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding3 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding3);
            TextView textView3 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding3.m;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH13 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH13);
            textView3.setText(listKecamatanAdapter$ListKecamatanAdapterVH13.h.getText().toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding4 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding4);
            TextView textView4 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding4.k;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH14 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH14);
            textView4.setText(listKecamatanAdapter$ListKecamatanAdapterVH14.b.getText().toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding5 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding5);
            TextView textView5 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding5.s;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH15 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH15);
            textView5.setText(listKecamatanAdapter$ListKecamatanAdapterVH15.i.getText().toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding6 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding6);
            TextView textView6 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding6.j;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH16 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH16);
            textView6.setText(listKecamatanAdapter$ListKecamatanAdapterVH16.a.getText().toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding7 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding7);
            TextView textView7 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding7.t;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH17 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH17);
            textView7.setText(listKecamatanAdapter$ListKecamatanAdapterVH17.g.getText().toString());
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding8 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding8);
            TextView textView8 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding8.l;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH18 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH18);
            textView8.setText(listKecamatanAdapter$ListKecamatanAdapterVH18.d.getText().toString());
            if (valueOf.compareTo(this.b) > 0) {
                ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding9 = this.z;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding9);
                listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding9.c.setVisibility(0);
                ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding10 = this.z;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding10);
                listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding10.i.setVisibility(0);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH19 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH19);
                listKecamatanAdapter$ListKecamatanAdapterVH19.k.setVisibility(0);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH20 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH20);
                listKecamatanAdapter$ListKecamatanAdapterVH20.s.setVisibility(0);
            } else {
                ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding11 = this.z;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding11);
                listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding11.c.setVisibility(8);
                ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding12 = this.z;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding12);
                listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding12.i.setVisibility(8);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH21 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH21);
                listKecamatanAdapter$ListKecamatanAdapterVH21.k.setVisibility(8);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH22 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH22);
                listKecamatanAdapter$ListKecamatanAdapterVH22.s.setVisibility(8);
            }
            if (bankTransfer.getAccType().equals("GIRO")) {
                ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding13 = this.z;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding13);
                listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding13.e.setVisibility(0);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH23 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH23);
                listKecamatanAdapter$ListKecamatanAdapterVH23.f.setVisibility(0);
                ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding14 = this.z;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding14);
                listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding14.f.setVisibility(0);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH24 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH24);
                listKecamatanAdapter$ListKecamatanAdapterVH24.p.setVisibility(0);
                if (bankTransfer.getWaktuPengirimanTransaksi().equals("Titipan")) {
                    ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding15 = this.z;
                    subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding15);
                    listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding15.a.setVisibility(0);
                    ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH25 = this.B;
                    subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH25);
                    listKecamatanAdapter$ListKecamatanAdapterVH25.n.setVisibility(0);
                    return;
                }
                ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding16 = this.z;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding16);
                listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding16.a.setVisibility(8);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH26 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH26);
                listKecamatanAdapter$ListKecamatanAdapterVH26.n.setVisibility(8);
                return;
            }
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding17 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding17);
            listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding17.e.setVisibility(8);
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding18 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding18);
            listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding18.f.setVisibility(8);
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding19 = this.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding19);
            listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding19.a.setVisibility(8);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH27 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH27);
            listKecamatanAdapter$ListKecamatanAdapterVH27.f.setVisibility(8);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH28 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH28);
            listKecamatanAdapter$ListKecamatanAdapterVH28.p.setVisibility(8);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH29 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH29);
            listKecamatanAdapter$ListKecamatanAdapterVH29.n.setVisibility(8);
        }

        private void d(BankTransferPenerima bankTransferPenerima) {
            subscribeReservationRescheduleEvent.e(bankTransferPenerima, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH.h.setText(bankTransferPenerima.getNamaPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.i.setText(bankTransferPenerima.getNorekPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.d.setText(bankTransferPenerima.getBankTujuanPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH4 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH4);
            LogoutDialog logoutDialog = listJenisMataUangAdapter$ListJenisMataUangAdapterVH4.f;
            StringBuilder sb = new StringBuilder();
            String nominalPenerima = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima, "");
            sb.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima, ".", ",", false)));
            sb.append(" IDR");
            logoutDialog.setText(sb.toString());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH5 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH5);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH5.b.setText(bankTransferPenerima.getBeritaPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH6 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH6);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH6.e.setText(bankTransferPenerima.getAlamatPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH7 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH7);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH7.n.setText(bankTransferPenerima.getTipeNasabahPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH8 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH8);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH8.n.setTag(bankTransferPenerima.getTipeNasabahPenerimaId());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH9 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH9);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH9.g.setText(bankTransferPenerima.getStatusPendudukPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH10 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH10);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH10.j.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH11 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH11);
            String str = "Tidak";
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH11.a.setText(bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS") ? "Ya" : "Tidak");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH12 = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH12);
            EditText editText = listJenisMataUangAdapter$ListJenisMataUangAdapterVH12.c;
            StringBuilder sb2 = new StringBuilder();
            String biayaTransfer = bankTransferPenerima.getBiayaTransfer();
            subscribeReservationRescheduleEvent.d(biayaTransfer, "");
            sb2.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer, ".", ",", false)));
            sb2.append(" IDR");
            editText.setText(sb2.toString());
            this.Q = bankTransferPenerima.getBankTujuanBIC();
            DetailTundaCCActivity detailTundaCCActivity = this.H;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            detailTundaCCActivity3.b = bankTransferPenerima.getBankTujuanBIC();
            detailTundaCCActivity2 = this.K;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            detailTundaCCActivity2.b = bankTransferPenerima.getBankTujuanBIC();
            int size = this.ac.size();
            for (int i = 0; i < size; i++) {
                ((LogoutDialog_ViewBinding) this.aj.get(i)).setHintEnabled(!(((EditText) this.ac.get(i)).getText().toString().length() == 0));
            }
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding);
            listJabatanAdapter$ListJabatanVH_ViewBinding.k.setText(bankTransferPenerima.getNamaPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding2 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding2);
            listJabatanAdapter$ListJabatanVH_ViewBinding2.t.setText(bankTransferPenerima.getNorekPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding3 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding3);
            listJabatanAdapter$ListJabatanVH_ViewBinding3.i.setText(bankTransferPenerima.getBankTujuanPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding4 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding4);
            TextView textView = listJabatanAdapter$ListJabatanVH_ViewBinding4.i;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(bankTransferPenerima.getBankTujuanCode());
            sb3.append(bankTransferPenerima.getBankTujuanOfficeCode());
            textView.setTag(sb3.toString());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding5 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding5);
            TextView textView2 = listJabatanAdapter$ListJabatanVH_ViewBinding5.q;
            StringBuilder sb4 = new StringBuilder();
            String nominalPenerima2 = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima2, "");
            sb4.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima2, ".", ",", false)));
            sb4.append(" IDR");
            textView2.setText(sb4.toString());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding6 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding6);
            listJabatanAdapter$ListJabatanVH_ViewBinding6.n.setText(bankTransferPenerima.getBeritaPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding7 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding7);
            listJabatanAdapter$ListJabatanVH_ViewBinding7.h.setText(bankTransferPenerima.getAlamatPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding8 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding8);
            listJabatanAdapter$ListJabatanVH_ViewBinding8.s.setText(bankTransferPenerima.getTipeNasabahPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding9 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding9);
            listJabatanAdapter$ListJabatanVH_ViewBinding9.r.setText(bankTransferPenerima.getStatusPendudukPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding10 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding10);
            listJabatanAdapter$ListJabatanVH_ViewBinding10.m.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding11 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding11);
            TextView textView3 = listJabatanAdapter$ListJabatanVH_ViewBinding11.l;
            if (bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS")) {
                str = "Ya";
            }
            textView3.setText(str);
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding12 = this.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding12);
            TextView textView4 = listJabatanAdapter$ListJabatanVH_ViewBinding12.f110o;
            StringBuilder sb5 = new StringBuilder();
            String biayaTransfer2 = bankTransferPenerima.getBiayaTransfer();
            subscribeReservationRescheduleEvent.d(biayaTransfer2, "");
            sb5.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer2, ".", ",", false)));
            sb5.append(" IDR");
            textView4.setText(sb5.toString());
        }

        public static /* synthetic */ void d(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.y();
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH = getreceiveralias.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH);
            LinearLayout linearLayout = listKodePosAdapter$ListKodePosAdapterVH.e;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH2 = getreceiveralias.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH2);
            LinearLayout linearLayout2 = listKodePosAdapter$ListKodePosAdapterVH2.a;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH3 = getreceiveralias.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH3);
            ImageView imageView = listKodePosAdapter$ListKodePosAdapterVH3.d;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        public static /* synthetic */ void d(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding a = ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.a(view);
            getreceiveralias.f153o = a;
            subscribeReservationRescheduleEvent.c(a);
            LinearLayout linearLayout = a.a;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            getreceiveralias.e(linearLayout);
        }

        public static final /* synthetic */ ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH e(getReceiverAlias getreceiveralias) {
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
            return listDetailOpenTransaksiAdapter$ListDetailTransaksiVH;
        }

        private final void e(LinearLayout linearLayout) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                subscribeReservationRescheduleEvent.d(childAt, "");
                if (i % 2 != 0) {
                    childAt.setBackgroundColor(copyWindowDataInto.a(requireContext(), 2131099820));
                } else {
                    childAt.setBackgroundColor(copyWindowDataInto.a(requireContext(), 2131099821));
                }
            }
        }

        private void e(BankTransfer bankTransfer) {
            subscribeReservationRescheduleEvent.e(bankTransfer, "");
            String totalPembayaran = bankTransfer.getTotalPembayaran();
            subscribeReservationRescheduleEvent.d(totalPembayaran, "");
            BigDecimal valueOf = BigDecimal.valueOf(Double.parseDouble(totalPembayaran));
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.d.setText(bankTransfer.getNamaPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.b.setText(bankTransfer.getNorekPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.i.setText(bankTransfer.getSaranaPembayaranPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4.e.setText(bankTransfer.getAlamatPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5.j.setText(bankTransfer.getTipeNasabahPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6.j.setTag(bankTransfer.getTipeNasabahPengirimId());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7.h.setText(bankTransfer.getStatusPendudukPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8.g.setText(bankTransfer.getStatusKewarganegaraanPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9.a.setText(bankTransfer.getNamaKontakPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10.c.setText(bankTransfer.getNoHpKontakPengirim());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11.f.setText(bankTransfer.getNoTelpKontakPengirim());
            int size = this.Z.size();
            for (int i = 0; i < size; i++) {
                ((LogoutDialog_ViewBinding) this.ar.get(i)).setHintEnabled(true ^ (((EditText) this.Z.get(i)).getText().toString().length() == 0));
            }
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding);
            TextView textView = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding.m;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12);
            textView.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12.d.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding2 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding2);
            TextView textView2 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding2.l;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13);
            textView2.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13.b.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding3 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding3);
            TextView textView3 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding3.r;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14);
            textView3.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14.i.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding4 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding4);
            TextView textView4 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding4.j;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15);
            textView4.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15.e.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding5 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding5);
            TextView textView5 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding5.p;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16);
            textView5.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16.j.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding6 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding6);
            TextView textView6 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding6.q;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17);
            textView6.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17.h.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding7 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding7);
            TextView textView7 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding7.f113o;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18);
            textView7.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18.g.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding8 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding8);
            TextView textView8 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding8.n;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding19 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding19);
            textView8.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding19.a.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding9 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding9);
            TextView textView9 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding9.k;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding20 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding20);
            textView9.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding20.c.getText().toString());
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding listKantorCabangAdapter$ListKantorCabangVH_ViewBinding10 = this.y;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH_ViewBinding10);
            TextView textView10 = listKantorCabangAdapter$ListKantorCabangVH_ViewBinding10.s;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding21 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding21);
            textView10.setText(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding21.f.getText().toString());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding22 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding22);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding22.i.setEnabled(false);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding23 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding23);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding23.r.setHintEnabled(true);
            if (valueOf.compareTo(this.b) > 0) {
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding24 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding24);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding24.j.setEnabled(false);
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding25 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding25);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding25.w.setEnabled(false);
                return;
            }
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding26 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding26);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding26.j.setEnabled(true);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding27 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding27);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding27.w.setEnabled(true);
        }

        private void e(BankTransferPenerima bankTransferPenerima) {
            subscribeReservationRescheduleEvent.e(bankTransferPenerima, "");
            onUbah onubah = this.k;
            subscribeReservationRescheduleEvent.c(onubah);
            onubah.g.setText(bankTransferPenerima.getNamaPenerima());
            onUbah onubah2 = this.k;
            subscribeReservationRescheduleEvent.c(onubah2);
            onubah2.f.setText(bankTransferPenerima.getNorekPenerima());
            onUbah onubah3 = this.k;
            subscribeReservationRescheduleEvent.c(onubah3);
            onubah3.d.setText(bankTransferPenerima.getBankTujuanPenerima());
            onUbah onubah4 = this.k;
            subscribeReservationRescheduleEvent.c(onubah4);
            LogoutDialog logoutDialog = onubah4.i;
            StringBuilder sb = new StringBuilder();
            String nominalPenerima = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima, "");
            sb.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima, ".", ",", false)));
            sb.append(" IDR");
            logoutDialog.setText(sb.toString());
            onUbah onubah5 = this.k;
            subscribeReservationRescheduleEvent.c(onubah5);
            onubah5.e.setText(bankTransferPenerima.getBeritaPenerima());
            onUbah onubah6 = this.k;
            subscribeReservationRescheduleEvent.c(onubah6);
            onubah6.a.setText(bankTransferPenerima.getAlamatPenerima());
            onUbah onubah7 = this.k;
            subscribeReservationRescheduleEvent.c(onubah7);
            onubah7.m.setText(bankTransferPenerima.getTipeNasabahPenerima());
            onUbah onubah8 = this.k;
            subscribeReservationRescheduleEvent.c(onubah8);
            onubah8.m.setTag(bankTransferPenerima.getTipeNasabahPenerimaId());
            onUbah onubah9 = this.k;
            subscribeReservationRescheduleEvent.c(onubah9);
            onubah9.h.setText(bankTransferPenerima.getStatusPendudukPenerima());
            onUbah onubah10 = this.k;
            subscribeReservationRescheduleEvent.c(onubah10);
            onubah10.j.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
            onUbah onubah11 = this.k;
            subscribeReservationRescheduleEvent.c(onubah11);
            String str = "Tidak";
            onubah11.c.setText(bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS") ? "Ya" : "Tidak");
            onUbah onubah12 = this.k;
            subscribeReservationRescheduleEvent.c(onubah12);
            EditText editText = onubah12.b;
            StringBuilder sb2 = new StringBuilder();
            String biayaTransfer = bankTransferPenerima.getBiayaTransfer();
            subscribeReservationRescheduleEvent.d(biayaTransfer, "");
            sb2.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer, ".", ",", false)));
            sb2.append(" IDR");
            editText.setText(sb2.toString());
            this.S = bankTransferPenerima.getBankTujuanBIC();
            DetailTundaCCActivity detailTundaCCActivity = this.I;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            detailTundaCCActivity3.b = bankTransferPenerima.getBankTujuanBIC();
            detailTundaCCActivity2 = this.M;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            detailTundaCCActivity2.b = bankTransferPenerima.getBankTujuanBIC();
            int size = this.T.size();
            for (int i = 0; i < size; i++) {
                ((LogoutDialog_ViewBinding) this.al.get(i)).setHintEnabled(!(((EditText) this.T.get(i)).getText().toString().length() == 0));
            }
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.n.setText(bankTransferPenerima.getNamaPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding2 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding2);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding2.s.setText(bankTransferPenerima.getNorekPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding3 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding3);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding3.j.setText(bankTransferPenerima.getBankTujuanPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding4 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding4);
            TextView textView = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding4.j;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(bankTransferPenerima.getBankTujuanCode());
            sb3.append(bankTransferPenerima.getBankTujuanOfficeCode());
            textView.setTag(sb3.toString());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding5 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding5);
            TextView textView2 = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding5.r;
            StringBuilder sb4 = new StringBuilder();
            String nominalPenerima2 = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima2, "");
            sb4.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima2, ".", ",", false)));
            sb4.append(" IDR");
            textView2.setText(sb4.toString());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding6 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding6);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding6.k.setText(bankTransferPenerima.getBeritaPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding7 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding7);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding7.f.setText(bankTransferPenerima.getAlamatPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding8 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding8);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding8.p.setText(bankTransferPenerima.getTipeNasabahPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding9 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding9);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding9.q.setText(bankTransferPenerima.getStatusPendudukPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding10 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding10);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding10.l.setText(bankTransferPenerima.getStatusKewarganegaraanPenerima());
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding11 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding11);
            TextView textView3 = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding11.m;
            if (bankTransferPenerima.getMetodePengirimanPenerima().equals("RTGS")) {
                str = "Ya";
            }
            textView3.setText(str);
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding12 = this.f153o;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding12);
            TextView textView4 = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding12.f105o;
            StringBuilder sb5 = new StringBuilder();
            String biayaTransfer2 = bankTransferPenerima.getBiayaTransfer();
            subscribeReservationRescheduleEvent.d(biayaTransfer2, "");
            sb5.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer2, ".", ",", false)));
            sb5.append(" IDR");
            textView4.setText(sb5.toString());
        }

        public static /* synthetic */ void e(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            Bundle bundle = new Bundle();
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listKecamatanAdapter$ListKecamatanAdapterVH.i.getText().toString());
            SexAdapter$SexVH_ViewBinding sexAdapter$SexVH_ViewBinding = new SexAdapter$SexVH_ViewBinding(((BN7PengambilanUpdateReceiverActivity) getreceiveralias.requireActivity()).q);
            sexAdapter$SexVH_ViewBinding.setArguments(bundle);
            sexAdapter$SexVH_ViewBinding.show(getreceiveralias.getParentFragmentManager(), "TujuanTransaksiBankTransferDialog");
        }

        public static /* synthetic */ void e(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding a = ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding.a(view);
            getreceiveralias.p = a;
            subscribeReservationRescheduleEvent.c(a);
            LinearLayout linearLayout = a.e;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            getreceiveralias.e(linearLayout);
        }

        public static /* synthetic */ void f(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            String obj = listKecamatanAdapter$ListKecamatanAdapterVH.g.getText().toString();
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
            SumberDanaAdapter$SumberDanaVH_ViewBinding sumberDanaAdapter$SumberDanaVH_ViewBinding = new SumberDanaAdapter$SumberDanaVH_ViewBinding(obj, listKecamatanAdapter$ListKecamatanAdapterVH2.d.getText().toString());
            isDetached parentFragmentManager = getreceiveralias.getParentFragmentManager();
            SumberDanaAdapter$SumberDanaVH_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer = SumberDanaAdapter$SumberDanaVH_ViewBinding.e;
            sumberDanaAdapter$SumberDanaVH_ViewBinding.show(parentFragmentManager, SumberDanaAdapter$SumberDanaVH_ViewBinding.c);
        }

        public static /* synthetic */ void f(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH e2 = ListKecamatanAdapter$ListKecamatanAdapterVH.e(view);
            getreceiveralias.B = e2;
            subscribeReservationRescheduleEvent.c(e2);
            EditText editText = e2.h;
            subscribeReservationRescheduleEvent.d(editText, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            EditText editText2 = listKecamatanAdapter$ListKecamatanAdapterVH.b;
            subscribeReservationRescheduleEvent.d(editText2, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
            EditText editText3 = listKecamatanAdapter$ListKecamatanAdapterVH2.i;
            subscribeReservationRescheduleEvent.d(editText3, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
            EditText editText4 = listKecamatanAdapter$ListKecamatanAdapterVH3.a;
            subscribeReservationRescheduleEvent.d(editText4, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH4 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH4);
            EditText editText5 = listKecamatanAdapter$ListKecamatanAdapterVH4.g;
            subscribeReservationRescheduleEvent.d(editText5, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH5 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH5);
            EditText editText6 = listKecamatanAdapter$ListKecamatanAdapterVH5.d;
            subscribeReservationRescheduleEvent.d(editText6, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH6 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH6);
            EditText editText7 = listKecamatanAdapter$ListKecamatanAdapterVH6.c;
            subscribeReservationRescheduleEvent.d(editText7, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH7 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH7);
            EditText editText8 = listKecamatanAdapter$ListKecamatanAdapterVH7.e;
            subscribeReservationRescheduleEvent.d(editText8, "");
            EditText[] editTextArr = {editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8};
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            List<? extends EditText> asList = Arrays.asList(editTextArr);
            subscribeReservationRescheduleEvent.d(asList, "");
            getreceiveralias.Y = asList;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH8 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH8);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = listKecamatanAdapter$ListKecamatanAdapterVH8.f114o;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH9 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH9);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listKecamatanAdapter$ListKecamatanAdapterVH9.k;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH10 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH10);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listKecamatanAdapter$ListKecamatanAdapterVH10.s;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH11 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH11);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listKecamatanAdapter$ListKecamatanAdapterVH11.f;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH12 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH12);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listKecamatanAdapter$ListKecamatanAdapterVH12.p;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH13 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH13);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listKecamatanAdapter$ListKecamatanAdapterVH13.n;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH14 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH14);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listKecamatanAdapter$ListKecamatanAdapterVH14.m;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH15 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH15);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = listKecamatanAdapter$ListKecamatanAdapterVH15.l;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
            LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8};
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
            subscribeReservationRescheduleEvent.d(asList2, "");
            getreceiveralias.aq = asList2;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH16 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH16);
            TextView textView = listKecamatanAdapter$ListKecamatanAdapterVH16.x;
            subscribeReservationRescheduleEvent.d(textView, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH17 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH17);
            TextView textView2 = listKecamatanAdapter$ListKecamatanAdapterVH17.q;
            subscribeReservationRescheduleEvent.d(textView2, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH18 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH18);
            TextView textView3 = listKecamatanAdapter$ListKecamatanAdapterVH18.v;
            subscribeReservationRescheduleEvent.d(textView3, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH19 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH19);
            TextView textView4 = listKecamatanAdapter$ListKecamatanAdapterVH19.t;
            subscribeReservationRescheduleEvent.d(textView4, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH20 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH20);
            TextView textView5 = listKecamatanAdapter$ListKecamatanAdapterVH20.w;
            subscribeReservationRescheduleEvent.d(textView5, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH21 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH21);
            TextView textView6 = listKecamatanAdapter$ListKecamatanAdapterVH21.r;
            subscribeReservationRescheduleEvent.d(textView6, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH22 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH22);
            TextView textView7 = listKecamatanAdapter$ListKecamatanAdapterVH22.y;
            subscribeReservationRescheduleEvent.d(textView7, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH23 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH23);
            TextView textView8 = listKecamatanAdapter$ListKecamatanAdapterVH23.u;
            subscribeReservationRescheduleEvent.d(textView8, "");
            TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8};
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            List<? extends TextView> asList3 = Arrays.asList(textViewArr);
            subscribeReservationRescheduleEvent.d(asList3, "");
            getreceiveralias.ae = asList3;
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH24 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH24);
            listKecamatanAdapter$ListKecamatanAdapterVH24.b.setOnClickListener(new View.OnClickListener() { // from class: o.getRepresentative
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.I(getReceiverAlias.this, view2);
                }
            });
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH25 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH25);
            listKecamatanAdapter$ListKecamatanAdapterVH25.i.setOnClickListener(new View.OnClickListener() { // from class: o.getSenderCitizenship
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.e(getReceiverAlias.this, view2);
                }
            });
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH26 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH26);
            listKecamatanAdapter$ListKecamatanAdapterVH26.g.setOnClickListener(new View.OnClickListener() { // from class: o.getSwiftCode
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.f(getReceiverAlias.this, view2);
                }
            });
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH27 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH27);
            listKecamatanAdapter$ListKecamatanAdapterVH27.d.setOnClickListener(new View.OnClickListener() { // from class: o.getSenderResidency
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.T(getReceiverAlias.this, view2);
                }
            });
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH28 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH28);
            listKecamatanAdapter$ListKecamatanAdapterVH28.a.setOnFocusChangeListener(getreceiveralias);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH29 = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH29);
            EditText editText9 = listKecamatanAdapter$ListKecamatanAdapterVH29.a;
            subscribeReservationRescheduleEvent.d(editText9, "");
            editText9.addTextChangedListener(new setBackgroundResource());
        }

        public static final /* synthetic */ ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding g(getReceiverAlias getreceiveralias) {
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
            return listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding;
        }

        public static /* synthetic */ void g(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            Bundle bundle = new Bundle();
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.j.getText().toString());
            StatusKewarganegaraanDialog statusKewarganegaraanDialog = new StatusKewarganegaraanDialog();
            statusKewarganegaraanDialog.setArguments(bundle);
            statusKewarganegaraanDialog.show(getreceiveralias.getParentFragmentManager(), "StatusKewarganegaraanPenerima3");
        }

        public static /* synthetic */ void g(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding b = ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding.b(view);
            getreceiveralias.z = b;
            subscribeReservationRescheduleEvent.c(b);
            LinearLayout linearLayout = b.d;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            getreceiveralias.e(linearLayout);
        }

        public static /* synthetic */ void h(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            Bundle bundle = new Bundle();
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listJenisMataUangAdapter$ListJenisMataUangAdapterVH.j.getText().toString());
            StatusKewarganegaraanDialog statusKewarganegaraanDialog = new StatusKewarganegaraanDialog();
            statusKewarganegaraanDialog.setArguments(bundle);
            statusKewarganegaraanDialog.show(getreceiveralias.getParentFragmentManager(), "StatusKewarganegaraanPenerima5");
        }

        public static /* synthetic */ void h(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding e2 = ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.e(view);
            getreceiveralias.g = e2;
            subscribeReservationRescheduleEvent.c(e2);
            LinearLayout linearLayout = e2.e;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            getreceiveralias.e(linearLayout);
        }

        public static /* synthetic */ void i(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            Bundle bundle = new Bundle();
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.f.getText().toString());
            StatusKewarganegaraanDialog statusKewarganegaraanDialog = new StatusKewarganegaraanDialog();
            statusKewarganegaraanDialog.setArguments(bundle);
            statusKewarganegaraanDialog.show(getreceiveralias.getParentFragmentManager(), "StatusKewarganegaraanPenerima1");
        }

        public static /* synthetic */ void i(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding d2 = ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding.d(view);
            getreceiveralias.y = d2;
            subscribeReservationRescheduleEvent.c(d2);
            LinearLayout linearLayout = d2.e;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            getreceiveralias.e(linearLayout);
        }

        private final ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding j() {
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
            return listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding;
        }

        public static final /* synthetic */ ListKecamatanAdapter$ListKecamatanAdapterVH j(getReceiverAlias getreceiveralias) {
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            return listKecamatanAdapter$ListKecamatanAdapterVH;
        }

        public static /* synthetic */ void j(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            PilihRekeningDialog pilihRekeningDialog = new PilihRekeningDialog();
            BN7PengambilanUpdateReceiverActivity bN7PengambilanUpdateReceiverActivity = (BN7PengambilanUpdateReceiverActivity) getreceiveralias.getActivity();
            subscribeReservationRescheduleEvent.c(bN7PengambilanUpdateReceiverActivity);
            pilihRekeningDialog.e = bN7PengambilanUpdateReceiverActivity.s;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = getreceiveralias.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
            pilihRekeningDialog.c = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.b.getText().toString();
            pilihRekeningDialog.show(getreceiveralias.getParentFragmentManager(), "PilihRekeningDialog");
        }

        public static /* synthetic */ void j(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH e2 = ListJenisMataUangAdapter$ListJenisMataUangAdapterVH.e(view);
            getreceiveralias.v = e2;
            subscribeReservationRescheduleEvent.c(e2);
            EditText editText = e2.d;
            subscribeReservationRescheduleEvent.d(editText, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
            AutoCompleteTextView autoCompleteTextView = listJenisMataUangAdapter$ListJenisMataUangAdapterVH.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
            AutoCompleteTextView autoCompleteTextView2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.h;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
            LogoutDialog logoutDialog = listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.f;
            subscribeReservationRescheduleEvent.d(logoutDialog, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH4 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH4);
            EditText editText2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH4.b;
            subscribeReservationRescheduleEvent.d(editText2, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH5 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH5);
            EditText editText3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH5.e;
            subscribeReservationRescheduleEvent.d(editText3, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH6 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH6);
            EditText editText4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH6.n;
            subscribeReservationRescheduleEvent.d(editText4, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH7 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH7);
            EditText editText5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH7.g;
            subscribeReservationRescheduleEvent.d(editText5, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH8 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH8);
            EditText editText6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH8.j;
            subscribeReservationRescheduleEvent.d(editText6, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH9 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH9);
            EditText editText7 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH9.a;
            subscribeReservationRescheduleEvent.d(editText7, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH10 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH10);
            EditText editText8 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH10.c;
            subscribeReservationRescheduleEvent.d(editText8, "");
            EditText[] editTextArr = {editText, autoCompleteTextView, autoCompleteTextView2, (EditText) logoutDialog, editText2, editText3, editText4, editText5, editText6, editText7, editText8};
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            List<? extends EditText> asList = Arrays.asList(editTextArr);
            subscribeReservationRescheduleEvent.d(asList, "");
            getreceiveralias.ac = asList;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH11 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH11);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = listJenisMataUangAdapter$ListJenisMataUangAdapterVH11.f111o;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH12 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH12);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH12.t;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH13 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH13);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH13.q;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH14 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH14);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH14.r;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH15 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH15);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH15.k;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH16 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH16);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH16.l;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH17 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH17);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH17.y;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH18 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH18);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH18.x;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH19 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH19);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH19.v;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH20 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH20);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH20.s;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH21 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH21);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH21.p;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
            LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, logoutDialog_ViewBinding10, logoutDialog_ViewBinding11};
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
            subscribeReservationRescheduleEvent.d(asList2, "");
            getreceiveralias.aj = asList2;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH22 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH22);
            TextView textView = listJenisMataUangAdapter$ListJenisMataUangAdapterVH22.u;
            subscribeReservationRescheduleEvent.d(textView, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH23 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH23);
            TextView textView2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH23.D;
            subscribeReservationRescheduleEvent.d(textView2, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH24 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH24);
            TextView textView3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH24.A;
            subscribeReservationRescheduleEvent.d(textView3, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH25 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH25);
            TextView textView4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH25.F;
            subscribeReservationRescheduleEvent.d(textView4, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH26 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH26);
            TextView textView5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH26.B;
            subscribeReservationRescheduleEvent.d(textView5, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH27 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH27);
            TextView textView6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH27.w;
            subscribeReservationRescheduleEvent.d(textView6, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH28 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH28);
            TextView textView7 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH28.I;
            subscribeReservationRescheduleEvent.d(textView7, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH29 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH29);
            TextView textView8 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH29.G;
            subscribeReservationRescheduleEvent.d(textView8, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH30 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH30);
            TextView textView9 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH30.H;
            subscribeReservationRescheduleEvent.d(textView9, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH31 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH31);
            TextView textView10 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH31.z;
            subscribeReservationRescheduleEvent.d(textView10, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH32 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH32);
            TextView textView11 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH32.C;
            subscribeReservationRescheduleEvent.d(textView11, "");
            TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11};
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            List<? extends TextView> asList3 = Arrays.asList(textViewArr);
            subscribeReservationRescheduleEvent.d(asList3, "");
            getreceiveralias.ad = asList3;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH33 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH33);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH33.b.setOnEditorActionListener(new setCardDescription());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH34 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH34);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH34.e.setOnEditorActionListener(new setCardDescription());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH35 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH35);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH35.d.setOnClickListener(new View.OnClickListener() { // from class: o.setCurrency
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.M(getReceiverAlias.this, view2);
                }
            });
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH36 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH36);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH36.n.setOnClickListener(new View.OnClickListener() { // from class: o.setHandphoneNumber
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.A(getReceiverAlias.this, view2);
                }
            });
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH37 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH37);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH37.g.setOnClickListener(new View.OnClickListener() { // from class: o.setPhoneNumber
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.b(getReceiverAlias.this, view2);
                }
            });
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH38 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH38);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH38.j.setOnClickListener(new View.OnClickListener() { // from class: o.setPaymentMethod
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.h(getReceiverAlias.this, view2);
                }
            });
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH39 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH39);
            AutoCompleteTextView autoCompleteTextView3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH39.h;
            DetailTundaCCActivity detailTundaCCActivity = getreceiveralias.H;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            autoCompleteTextView3.setAdapter(detailTundaCCActivity3);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH40 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH40);
            AutoCompleteTextView autoCompleteTextView4 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH40.h;
            getReceiverAlias getreceiveralias2 = getreceiveralias;
            autoCompleteTextView4.setOnItemClickListener(getreceiveralias2);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH41 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH41);
            AutoCompleteTextView autoCompleteTextView5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH41.i;
            detailTundaCCActivity2 = getreceiveralias.K;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            autoCompleteTextView5.setAdapter(detailTundaCCActivity2);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH42 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH42);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH42.i.setOnItemClickListener(getreceiveralias2);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH43 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH43);
            AutoCompleteTextView autoCompleteTextView6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH43.h;
            getReceiverAlias getreceiveralias3 = getreceiveralias;
            autoCompleteTextView6.setOnFocusChangeListener(getreceiveralias3);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH44 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH44);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH44.i.setOnFocusChangeListener(getreceiveralias3);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH45 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH45);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH45.f.setOnFocusChangeListener(getreceiveralias3);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH46 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH46);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH46.b.setOnFocusChangeListener(getreceiveralias3);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH47 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH47);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH47.e.setOnFocusChangeListener(getreceiveralias3);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH48 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH48);
            AutoCompleteTextView autoCompleteTextView7 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH48.h;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView7, "");
            autoCompleteTextView7.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$ComponentActivity$3
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    AutoCompleteTextView autoCompleteTextView8 = getReceiverAlias.d(getReceiverAlias.this).h;
                    subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
                    getReceiverAlias.a((EditText) autoCompleteTextView8, (List<? extends EditText>) getReceiverAlias.this.ac, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.aj, (List<? extends TextView>) getReceiverAlias.this.ad);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH49 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH49);
            AutoCompleteTextView autoCompleteTextView8 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH49.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
            autoCompleteTextView8.addTextChangedListener(new PlaybackStateCompat());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH50 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH50);
            EditText editText9 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH50.b;
            subscribeReservationRescheduleEvent.d(editText9, "");
            editText9.addTextChangedListener(new setContentView());
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH51 = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH51);
            EditText editText10 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH51.e;
            subscribeReservationRescheduleEvent.d(editText10, "");
            editText10.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    EditText editText11 = getReceiverAlias.d(getReceiverAlias.this).e;
                    subscribeReservationRescheduleEvent.d(editText11, "");
                    getReceiverAlias.a(editText11, (List<? extends EditText>) getReceiverAlias.this.ac, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.aj, (List<? extends TextView>) getReceiverAlias.this.ad);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
        }

        private final ListDetailTransaksiROAdapter$ListDetailTransaksiVH k() {
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
            return listDetailTransaksiROAdapter$ListDetailTransaksiVH;
        }

        public static /* synthetic */ void k(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.x();
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH = getreceiveralias.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH);
            LinearLayout linearLayout = listJabatanAdapter$ListJabatanVH.a;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH2 = getreceiveralias.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH2);
            LinearLayout linearLayout2 = listJabatanAdapter$ListJabatanVH2.d;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH3 = getreceiveralias.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH3);
            ImageView imageView = listJabatanAdapter$ListJabatanVH3.e;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        private final ListJenisMataUangAdapter$ListJenisMataUangAdapterVH l() {
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
            return listJenisMataUangAdapter$ListJenisMataUangAdapterVH;
        }

        public static /* synthetic */ void l(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.u();
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH);
            LinearLayout linearLayout = listKelurahanAdapter$ListKelurahanAdapterVH.a;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH2 = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH2);
            LinearLayout linearLayout2 = listKelurahanAdapter$ListKelurahanAdapterVH2.d;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH3 = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH3);
            ImageView imageView = listKelurahanAdapter$ListKelurahanAdapterVH3.e;
            subscribeReservationRescheduleEvent.d(imageView, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = getreceiveralias.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            setMaxHeight setmaxheight = listKecamatanAdapter$ListKecamatanAdapterVH.j;
            subscribeReservationRescheduleEvent.d(setmaxheight, "");
            setMaxHeight setmaxheight2 = setmaxheight;
            ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding = getreceiveralias.z;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding);
            LinearLayout linearLayout3 = listKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding.d;
            subscribeReservationRescheduleEvent.d(linearLayout3, "");
            LinearLayout linearLayout4 = linearLayout3;
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH4 = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH4);
            TextView textView = listKelurahanAdapter$ListKelurahanAdapterVH4.i;
            subscribeReservationRescheduleEvent.d(textView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView, setmaxheight2, linearLayout4, textView);
        }

        public static /* synthetic */ void l(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            onUbah d2 = onUbah.d(view);
            getreceiveralias.k = d2;
            subscribeReservationRescheduleEvent.c(d2);
            EditText editText = d2.d;
            subscribeReservationRescheduleEvent.d(editText, "");
            onUbah onubah = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah);
            AutoCompleteTextView autoCompleteTextView = onubah.f;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            onUbah onubah2 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah2);
            AutoCompleteTextView autoCompleteTextView2 = onubah2.g;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
            onUbah onubah3 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah3);
            LogoutDialog logoutDialog = onubah3.i;
            subscribeReservationRescheduleEvent.d(logoutDialog, "");
            onUbah onubah4 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah4);
            EditText editText2 = onubah4.e;
            subscribeReservationRescheduleEvent.d(editText2, "");
            onUbah onubah5 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah5);
            EditText editText3 = onubah5.a;
            subscribeReservationRescheduleEvent.d(editText3, "");
            onUbah onubah6 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah6);
            EditText editText4 = onubah6.m;
            subscribeReservationRescheduleEvent.d(editText4, "");
            onUbah onubah7 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah7);
            EditText editText5 = onubah7.h;
            subscribeReservationRescheduleEvent.d(editText5, "");
            onUbah onubah8 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah8);
            EditText editText6 = onubah8.j;
            subscribeReservationRescheduleEvent.d(editText6, "");
            onUbah onubah9 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah9);
            EditText editText7 = onubah9.c;
            subscribeReservationRescheduleEvent.d(editText7, "");
            onUbah onubah10 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah10);
            EditText editText8 = onubah10.b;
            subscribeReservationRescheduleEvent.d(editText8, "");
            EditText[] editTextArr = {editText, autoCompleteTextView, autoCompleteTextView2, (EditText) logoutDialog, editText2, editText3, editText4, editText5, editText6, editText7, editText8};
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            List<? extends EditText> asList = Arrays.asList(editTextArr);
            subscribeReservationRescheduleEvent.d(asList, "");
            getreceiveralias.T = asList;
            onUbah onubah11 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah11);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = onubah11.n;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
            onUbah onubah12 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah12);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = onubah12.q;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
            onUbah onubah13 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah13);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = onubah13.t;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
            onUbah onubah14 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah14);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = onubah14.s;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
            onUbah onubah15 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah15);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = onubah15.l;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
            onUbah onubah16 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah16);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = onubah16.f175o;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
            onUbah onubah17 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah17);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = onubah17.u;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
            onUbah onubah18 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah18);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = onubah18.w;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
            onUbah onubah19 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah19);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = onubah19.x;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
            onUbah onubah20 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah20);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = onubah20.r;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
            onUbah onubah21 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah21);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = onubah21.p;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
            LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, logoutDialog_ViewBinding10, logoutDialog_ViewBinding11};
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
            subscribeReservationRescheduleEvent.d(asList2, "");
            getreceiveralias.al = asList2;
            onUbah onubah22 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah22);
            TextView textView = onubah22.v;
            subscribeReservationRescheduleEvent.d(textView, "");
            onUbah onubah23 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah23);
            TextView textView2 = onubah23.C;
            subscribeReservationRescheduleEvent.d(textView2, "");
            onUbah onubah24 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah24);
            TextView textView3 = onubah24.z;
            subscribeReservationRescheduleEvent.d(textView3, "");
            onUbah onubah25 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah25);
            TextView textView4 = onubah25.I;
            subscribeReservationRescheduleEvent.d(textView4, "");
            onUbah onubah26 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah26);
            TextView textView5 = onubah26.D;
            subscribeReservationRescheduleEvent.d(textView5, "");
            onUbah onubah27 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah27);
            TextView textView6 = onubah27.y;
            subscribeReservationRescheduleEvent.d(textView6, "");
            onUbah onubah28 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah28);
            TextView textView7 = onubah28.H;
            subscribeReservationRescheduleEvent.d(textView7, "");
            onUbah onubah29 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah29);
            TextView textView8 = onubah29.E;
            subscribeReservationRescheduleEvent.d(textView8, "");
            onUbah onubah30 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah30);
            TextView textView9 = onubah30.G;
            subscribeReservationRescheduleEvent.d(textView9, "");
            onUbah onubah31 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah31);
            TextView textView10 = onubah31.A;
            subscribeReservationRescheduleEvent.d(textView10, "");
            onUbah onubah32 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah32);
            TextView textView11 = onubah32.B;
            subscribeReservationRescheduleEvent.d(textView11, "");
            TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11};
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            List<? extends TextView> asList3 = Arrays.asList(textViewArr);
            subscribeReservationRescheduleEvent.d(asList3, "");
            getreceiveralias.ab = asList3;
            onUbah onubah33 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah33);
            onubah33.e.setOnEditorActionListener(new setCardDescription());
            onUbah onubah34 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah34);
            onubah34.a.setOnEditorActionListener(new setCardDescription());
            onUbah onubah35 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah35);
            onubah35.d.setOnClickListener(new View.OnClickListener() { // from class: o.getToken
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.v(getReceiverAlias.this, view2);
                }
            });
            onUbah onubah36 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah36);
            onubah36.m.setOnClickListener(new View.OnClickListener() { // from class: o.getTransactionNotes2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.P(getReceiverAlias.this, view2);
                }
            });
            onUbah onubah37 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah37);
            onubah37.h.setOnClickListener(new View.OnClickListener() { // from class: o.getTransactionPurpose
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.L(getReceiverAlias.this, view2);
                }
            });
            onUbah onubah38 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah38);
            onubah38.j.setOnClickListener(new View.OnClickListener() { // from class: o.getTransactionPurposeType
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.X(getReceiverAlias.this, view2);
                }
            });
            onUbah onubah39 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah39);
            AutoCompleteTextView autoCompleteTextView3 = onubah39.g;
            DetailTundaCCActivity detailTundaCCActivity = getreceiveralias.I;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            autoCompleteTextView3.setAdapter(detailTundaCCActivity3);
            onUbah onubah40 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah40);
            AutoCompleteTextView autoCompleteTextView4 = onubah40.g;
            getReceiverAlias getreceiveralias2 = getreceiveralias;
            autoCompleteTextView4.setOnItemClickListener(getreceiveralias2);
            onUbah onubah41 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah41);
            AutoCompleteTextView autoCompleteTextView5 = onubah41.f;
            detailTundaCCActivity2 = getreceiveralias.M;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            autoCompleteTextView5.setAdapter(detailTundaCCActivity2);
            onUbah onubah42 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah42);
            onubah42.f.setOnItemClickListener(getreceiveralias2);
            onUbah onubah43 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah43);
            AutoCompleteTextView autoCompleteTextView6 = onubah43.g;
            getReceiverAlias getreceiveralias3 = getreceiveralias;
            autoCompleteTextView6.setOnFocusChangeListener(getreceiveralias3);
            onUbah onubah44 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah44);
            onubah44.f.setOnFocusChangeListener(getreceiveralias3);
            onUbah onubah45 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah45);
            onubah45.i.setOnFocusChangeListener(getreceiveralias3);
            onUbah onubah46 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah46);
            onubah46.e.setOnFocusChangeListener(getreceiveralias3);
            onUbah onubah47 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah47);
            onubah47.a.setOnFocusChangeListener(getreceiveralias3);
            onUbah onubah48 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah48);
            AutoCompleteTextView autoCompleteTextView7 = onubah48.g;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView7, "");
            autoCompleteTextView7.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaBrowserCompat$MediaItem
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    AutoCompleteTextView autoCompleteTextView8 = getReceiverAlias.a(getReceiverAlias.this).g;
                    subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
                    getReceiverAlias.a((EditText) autoCompleteTextView8, (List<? extends EditText>) getReceiverAlias.this.T, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.al, (List<? extends TextView>) getReceiverAlias.this.ab);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            onUbah onubah49 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah49);
            AutoCompleteTextView autoCompleteTextView8 = onubah49.f;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
            autoCompleteTextView8.addTextChangedListener(new MediaDescriptionCompat());
            onUbah onubah50 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah50);
            EditText editText9 = onubah50.e;
            subscribeReservationRescheduleEvent.d(editText9, "");
            editText9.addTextChangedListener(new MediaMetadataCompat());
            onUbah onubah51 = getreceiveralias.k;
            subscribeReservationRescheduleEvent.c(onubah51);
            EditText editText10 = onubah51.a;
            subscribeReservationRescheduleEvent.d(editText10, "");
            editText10.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaBrowserCompat$ItemReceiver
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    EditText editText11 = getReceiverAlias.a(getReceiverAlias.this).a;
                    subscribeReservationRescheduleEvent.d(editText11, "");
                    getReceiverAlias.a(editText11, (List<? extends EditText>) getReceiverAlias.this.T, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.al, (List<? extends TextView>) getReceiverAlias.this.ab);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
        }

        private final ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding m() {
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding = this.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding);
            return listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding;
        }

        public static /* synthetic */ void m(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.w();
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH);
            LinearLayout linearLayout = listKantorCabangAdapter$ListKantorCabangVH.c;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH2 = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH2);
            LinearLayout linearLayout2 = listKantorCabangAdapter$ListKantorCabangVH2.d;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH3 = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH3);
            ImageView imageView = listKantorCabangAdapter$ListKantorCabangVH3.b;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        public static /* synthetic */ void m(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH c = ListDetailTransaksiROAdapter$ListDetailTransaksiVH.c(view);
            getreceiveralias.q = c;
            subscribeReservationRescheduleEvent.c(c);
            EditText editText = c.d;
            subscribeReservationRescheduleEvent.d(editText, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
            AutoCompleteTextView autoCompleteTextView = listDetailTransaksiROAdapter$ListDetailTransaksiVH.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
            AutoCompleteTextView autoCompleteTextView2 = listDetailTransaksiROAdapter$ListDetailTransaksiVH2.g;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
            LogoutDialog logoutDialog = listDetailTransaksiROAdapter$ListDetailTransaksiVH3.j;
            subscribeReservationRescheduleEvent.d(logoutDialog, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH4 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH4);
            EditText editText2 = listDetailTransaksiROAdapter$ListDetailTransaksiVH4.b;
            subscribeReservationRescheduleEvent.d(editText2, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH5 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH5);
            EditText editText3 = listDetailTransaksiROAdapter$ListDetailTransaksiVH5.c;
            subscribeReservationRescheduleEvent.d(editText3, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH6 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH6);
            EditText editText4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH6.k;
            subscribeReservationRescheduleEvent.d(editText4, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH7 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH7);
            EditText editText5 = listDetailTransaksiROAdapter$ListDetailTransaksiVH7.h;
            subscribeReservationRescheduleEvent.d(editText5, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH8 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH8);
            EditText editText6 = listDetailTransaksiROAdapter$ListDetailTransaksiVH8.f;
            subscribeReservationRescheduleEvent.d(editText6, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH9 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH9);
            EditText editText7 = listDetailTransaksiROAdapter$ListDetailTransaksiVH9.a;
            subscribeReservationRescheduleEvent.d(editText7, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH10 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH10);
            EditText editText8 = listDetailTransaksiROAdapter$ListDetailTransaksiVH10.e;
            subscribeReservationRescheduleEvent.d(editText8, "");
            EditText[] editTextArr = {editText, autoCompleteTextView, autoCompleteTextView2, (EditText) logoutDialog, editText2, editText3, editText4, editText5, editText6, editText7, editText8};
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            List<? extends EditText> asList = Arrays.asList(editTextArr);
            subscribeReservationRescheduleEvent.d(asList, "");
            getreceiveralias.V = asList;
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH11 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH11);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = listDetailTransaksiROAdapter$ListDetailTransaksiVH11.l;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH12 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH12);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listDetailTransaksiROAdapter$ListDetailTransaksiVH12.s;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH13 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH13);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listDetailTransaksiROAdapter$ListDetailTransaksiVH13.t;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH14 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH14);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH14.p;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH15 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH15);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listDetailTransaksiROAdapter$ListDetailTransaksiVH15.f109o;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH16 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH16);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listDetailTransaksiROAdapter$ListDetailTransaksiVH16.m;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH17 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH17);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listDetailTransaksiROAdapter$ListDetailTransaksiVH17.u;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH18 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH18);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = listDetailTransaksiROAdapter$ListDetailTransaksiVH18.w;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH19 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH19);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = listDetailTransaksiROAdapter$ListDetailTransaksiVH19.v;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH20 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH20);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = listDetailTransaksiROAdapter$ListDetailTransaksiVH20.r;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH21 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH21);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = listDetailTransaksiROAdapter$ListDetailTransaksiVH21.q;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
            LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, logoutDialog_ViewBinding10, logoutDialog_ViewBinding11};
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
            subscribeReservationRescheduleEvent.d(asList2, "");
            getreceiveralias.ai = asList2;
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH22 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH22);
            TextView textView = listDetailTransaksiROAdapter$ListDetailTransaksiVH22.y;
            subscribeReservationRescheduleEvent.d(textView, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH23 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH23);
            TextView textView2 = listDetailTransaksiROAdapter$ListDetailTransaksiVH23.z;
            subscribeReservationRescheduleEvent.d(textView2, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH24 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH24);
            TextView textView3 = listDetailTransaksiROAdapter$ListDetailTransaksiVH24.D;
            subscribeReservationRescheduleEvent.d(textView3, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH25 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH25);
            TextView textView4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH25.F;
            subscribeReservationRescheduleEvent.d(textView4, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH26 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH26);
            TextView textView5 = listDetailTransaksiROAdapter$ListDetailTransaksiVH26.A;
            subscribeReservationRescheduleEvent.d(textView5, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH27 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH27);
            TextView textView6 = listDetailTransaksiROAdapter$ListDetailTransaksiVH27.x;
            subscribeReservationRescheduleEvent.d(textView6, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH28 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH28);
            TextView textView7 = listDetailTransaksiROAdapter$ListDetailTransaksiVH28.H;
            subscribeReservationRescheduleEvent.d(textView7, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH29 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH29);
            TextView textView8 = listDetailTransaksiROAdapter$ListDetailTransaksiVH29.E;
            subscribeReservationRescheduleEvent.d(textView8, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH30 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH30);
            TextView textView9 = listDetailTransaksiROAdapter$ListDetailTransaksiVH30.G;
            subscribeReservationRescheduleEvent.d(textView9, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH31 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH31);
            TextView textView10 = listDetailTransaksiROAdapter$ListDetailTransaksiVH31.B;
            subscribeReservationRescheduleEvent.d(textView10, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH32 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH32);
            TextView textView11 = listDetailTransaksiROAdapter$ListDetailTransaksiVH32.C;
            subscribeReservationRescheduleEvent.d(textView11, "");
            TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11};
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            List<? extends TextView> asList3 = Arrays.asList(textViewArr);
            subscribeReservationRescheduleEvent.d(asList3, "");
            getreceiveralias.ag = asList3;
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH33 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH33);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH33.b.setOnEditorActionListener(new setCardDescription());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH34 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH34);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH34.c.setOnEditorActionListener(new setCardDescription());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH35 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH35);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH35.d.setOnClickListener(new View.OnClickListener() { // from class: o.setFlagIban
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.F(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH36 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH36);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH36.k.setOnClickListener(new View.OnClickListener() { // from class: o.setFlagMultiKu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.K(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH37 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH37);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH37.h.setOnClickListener(new View.OnClickListener() { // from class: o.setHandphoneNumberCountryCd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.z(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH38 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH38);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH38.f.setOnClickListener(new View.OnClickListener() { // from class: o.setFlagSaveToSourceAccountList
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.a(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH39 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH39);
            AutoCompleteTextView autoCompleteTextView3 = listDetailTransaksiROAdapter$ListDetailTransaksiVH39.g;
            DetailTundaCCActivity detailTundaCCActivity = getreceiveralias.D;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            autoCompleteTextView3.setAdapter(detailTundaCCActivity3);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH40 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH40);
            AutoCompleteTextView autoCompleteTextView4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH40.g;
            getReceiverAlias getreceiveralias2 = getreceiveralias;
            autoCompleteTextView4.setOnItemClickListener(getreceiveralias2);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH41 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH41);
            AutoCompleteTextView autoCompleteTextView5 = listDetailTransaksiROAdapter$ListDetailTransaksiVH41.i;
            detailTundaCCActivity2 = getreceiveralias.L;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            autoCompleteTextView5.setAdapter(detailTundaCCActivity2);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH42 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH42);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH42.i.setOnItemClickListener(getreceiveralias2);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH43 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH43);
            AutoCompleteTextView autoCompleteTextView6 = listDetailTransaksiROAdapter$ListDetailTransaksiVH43.g;
            getReceiverAlias getreceiveralias3 = getreceiveralias;
            autoCompleteTextView6.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH44 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH44);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH44.i.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH45 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH45);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH45.j.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH46 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH46);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH46.b.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH47 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH47);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH47.c.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH48 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH48);
            AutoCompleteTextView autoCompleteTextView7 = listDetailTransaksiROAdapter$ListDetailTransaksiVH48.g;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView7, "");
            autoCompleteTextView7.addTextChangedListener(new RatingCompat());
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH49 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH49);
            AutoCompleteTextView autoCompleteTextView8 = listDetailTransaksiROAdapter$ListDetailTransaksiVH49.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
            autoCompleteTextView8.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaSessionCompat$QueueItem
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    AutoCompleteTextView autoCompleteTextView9 = getReceiverAlias.b(getReceiverAlias.this).i;
                    subscribeReservationRescheduleEvent.d(autoCompleteTextView9, "");
                    getReceiverAlias.a((EditText) autoCompleteTextView9, (List<? extends EditText>) getReceiverAlias.this.V, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.ai, (List<? extends TextView>) getReceiverAlias.this.ag);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH50 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH50);
            EditText editText9 = listDetailTransaksiROAdapter$ListDetailTransaksiVH50.b;
            subscribeReservationRescheduleEvent.d(editText9, "");
            editText9.addTextChangedListener(new PlaybackStateCompat.CustomAction(getreceiveralias));
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH51 = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH51);
            EditText editText10 = listDetailTransaksiROAdapter$ListDetailTransaksiVH51.c;
            subscribeReservationRescheduleEvent.d(editText10, "");
            editText10.addTextChangedListener(new ParcelableVolumeInfo());
        }

        private final ListKantorCabangAdapter$ListKantorCabangVH n() {
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH = this.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH);
            return listKantorCabangAdapter$ListKantorCabangVH;
        }

        public static /* synthetic */ void n(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.ap = "BankTujuanPenerima3";
            Intent intent = new Intent(getreceiveralias.getActivity(), onClickBankTransfer.class);
            onClickBankTransfer.IconCompatParcelizer iconCompatParcelizer = onClickBankTransfer.j;
            intent.putExtra(onClickBankTransfer.r, true);
            getreceiveralias.startActivity(intent);
        }

        public static /* synthetic */ void n(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding d2 = ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.d(view);
            getreceiveralias.l = d2;
            subscribeReservationRescheduleEvent.c(d2);
            EditText editText = d2.b;
            subscribeReservationRescheduleEvent.d(editText, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
            AutoCompleteTextView autoCompleteTextView = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
            AutoCompleteTextView autoCompleteTextView2 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.g;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
            LogoutDialog logoutDialog = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.h;
            subscribeReservationRescheduleEvent.d(logoutDialog, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4);
            EditText editText2 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4.a;
            subscribeReservationRescheduleEvent.d(editText2, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5);
            EditText editText3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5.e;
            subscribeReservationRescheduleEvent.d(editText3, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6);
            EditText editText4 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6.f106o;
            subscribeReservationRescheduleEvent.d(editText4, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7);
            EditText editText5 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7.f;
            subscribeReservationRescheduleEvent.d(editText5, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8);
            EditText editText6 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8.j;
            subscribeReservationRescheduleEvent.d(editText6, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9);
            EditText editText7 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9.c;
            subscribeReservationRescheduleEvent.d(editText7, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10);
            EditText editText8 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10.d;
            subscribeReservationRescheduleEvent.d(editText8, "");
            EditText[] editTextArr = {editText, autoCompleteTextView, autoCompleteTextView2, (EditText) logoutDialog, editText2, editText3, editText4, editText5, editText6, editText7, editText8};
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            subscribeReservationRescheduleEvent.e(editTextArr, "");
            List<? extends EditText> asList = Arrays.asList(editTextArr);
            subscribeReservationRescheduleEvent.d(asList, "");
            getreceiveralias.U = asList;
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11.l;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12.s;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13.q;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14.t;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15.m;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding16 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding16);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding16.k;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding17 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding17);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding17.x;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding18 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding18);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding18.u;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding19 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding19);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding19.w;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding20 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding20);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding20.r;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding21 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding21);
            LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding21.p;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
            LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, logoutDialog_ViewBinding10, logoutDialog_ViewBinding11};
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
            List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
            subscribeReservationRescheduleEvent.d(asList2, "");
            getreceiveralias.am = asList2;
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding22 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding22);
            TextView textView = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding22.v;
            subscribeReservationRescheduleEvent.d(textView, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding23 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding23);
            TextView textView2 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding23.z;
            subscribeReservationRescheduleEvent.d(textView2, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding24 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding24);
            TextView textView3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding24.A;
            subscribeReservationRescheduleEvent.d(textView3, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding25 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding25);
            TextView textView4 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding25.G;
            subscribeReservationRescheduleEvent.d(textView4, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding26 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding26);
            TextView textView5 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding26.B;
            subscribeReservationRescheduleEvent.d(textView5, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding27 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding27);
            TextView textView6 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding27.y;
            subscribeReservationRescheduleEvent.d(textView6, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding28 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding28);
            TextView textView7 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding28.E;
            subscribeReservationRescheduleEvent.d(textView7, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding29 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding29);
            TextView textView8 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding29.H;
            subscribeReservationRescheduleEvent.d(textView8, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding30 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding30);
            TextView textView9 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding30.I;
            subscribeReservationRescheduleEvent.d(textView9, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding31 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding31);
            TextView textView10 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding31.C;
            subscribeReservationRescheduleEvent.d(textView10, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding32 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding32);
            TextView textView11 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding32.D;
            subscribeReservationRescheduleEvent.d(textView11, "");
            TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11};
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            subscribeReservationRescheduleEvent.e(textViewArr, "");
            List<? extends TextView> asList3 = Arrays.asList(textViewArr);
            subscribeReservationRescheduleEvent.d(asList3, "");
            getreceiveralias.af = asList3;
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding33 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding33);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding33.a.setOnEditorActionListener(new setCardDescription());
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding34 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding34);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding34.e.setOnEditorActionListener(new setCardDescription());
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding35 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding35);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding35.b.setOnClickListener(new View.OnClickListener() { // from class: o.getValueToday
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.n(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding36 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding36);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding36.f106o.setOnClickListener(new View.OnClickListener() { // from class: o.getTransactionSource
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.C(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding37 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding37);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding37.f.setOnClickListener(new View.OnClickListener() { // from class: o.getType
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.t(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding38 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding38);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding38.j.setOnClickListener(new View.OnClickListener() { // from class: o.getWarkatTime
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.g(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding39 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding39);
            AutoCompleteTextView autoCompleteTextView3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding39.g;
            DetailTundaCCActivity detailTundaCCActivity = getreceiveralias.E;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = detailTundaCCActivity;
            if (detailTundaCCActivity == null) {
                subscribeReservationRescheduleEvent.e("");
                detailTundaCCActivity3 = null;
            }
            autoCompleteTextView3.setAdapter(detailTundaCCActivity3);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding40 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding40);
            AutoCompleteTextView autoCompleteTextView4 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding40.g;
            getReceiverAlias getreceiveralias2 = getreceiveralias;
            autoCompleteTextView4.setOnItemClickListener(getreceiveralias2);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding41 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding41);
            AutoCompleteTextView autoCompleteTextView5 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding41.i;
            detailTundaCCActivity2 = getreceiveralias.N;
            if (detailTundaCCActivity2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            autoCompleteTextView5.setAdapter(detailTundaCCActivity2);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding42 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding42);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding42.i.setOnItemClickListener(getreceiveralias2);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding43 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding43);
            AutoCompleteTextView autoCompleteTextView6 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding43.g;
            getReceiverAlias getreceiveralias3 = getreceiveralias;
            autoCompleteTextView6.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding44 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding44);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding44.i.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding45 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding45);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding45.h.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding46 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding46);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding46.a.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding47 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding47);
            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding47.e.setOnFocusChangeListener(getreceiveralias3);
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding48 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding48);
            AutoCompleteTextView autoCompleteTextView7 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding48.g;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView7, "");
            autoCompleteTextView7.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaBrowserCompat$SearchResultReceiver
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    AutoCompleteTextView autoCompleteTextView8 = getReceiverAlias.c(getReceiverAlias.this).g;
                    subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
                    getReceiverAlias.a((EditText) autoCompleteTextView8, (List<? extends EditText>) getReceiverAlias.this.U, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.am, (List<? extends TextView>) getReceiverAlias.this.af);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding49 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding49);
            AutoCompleteTextView autoCompleteTextView8 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding49.i;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView8, "");
            autoCompleteTextView8.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaSessionCompat$Token
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    AutoCompleteTextView autoCompleteTextView9 = getReceiverAlias.c(getReceiverAlias.this).i;
                    subscribeReservationRescheduleEvent.d(autoCompleteTextView9, "");
                    getReceiverAlias.a((EditText) autoCompleteTextView9, (List<? extends EditText>) getReceiverAlias.this.U, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.am, (List<? extends TextView>) getReceiverAlias.this.af);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding50 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding50);
            EditText editText9 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding50.a;
            subscribeReservationRescheduleEvent.d(editText9, "");
            editText9.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaSessionCompat$ResultReceiverWrapper
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    EditText editText10 = getReceiverAlias.c(getReceiverAlias.this).a;
                    subscribeReservationRescheduleEvent.d(editText10, "");
                    getReceiverAlias.a(editText10, (List<? extends EditText>) getReceiverAlias.this.U, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.am, (List<? extends TextView>) getReceiverAlias.this.af);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding51 = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding51);
            EditText editText10 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding51.e;
            subscribeReservationRescheduleEvent.d(editText10, "");
            editText10.addTextChangedListener(new TextWatcher() { // from class: o.getReceiverAlias$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    EditText editText11 = getReceiverAlias.c(getReceiverAlias.this).e;
                    subscribeReservationRescheduleEvent.d(editText11, "");
                    getReceiverAlias.a(editText11, (List<? extends EditText>) getReceiverAlias.this.U, (List<? extends LogoutDialog_ViewBinding>) getReceiverAlias.this.am, (List<? extends TextView>) getReceiverAlias.this.af);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
        }

        private final ListJabatanAdapter$ListJabatanVH o() {
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH = this.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH);
            return listJabatanAdapter$ListJabatanVH;
        }

        public static /* synthetic */ void o(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.u();
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH);
            LinearLayout linearLayout = listKelurahanAdapter$ListKelurahanAdapterVH.a;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH2 = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH2);
            LinearLayout linearLayout2 = listKelurahanAdapter$ListKelurahanAdapterVH2.d;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH3 = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH3);
            ImageView imageView = listKelurahanAdapter$ListKelurahanAdapterVH3.e;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        public static /* synthetic */ void o(getReceiverAlias getreceiveralias, ViewStub viewStub, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            ListJabatanAdapter$ListJabatanVH_ViewBinding e2 = ListJabatanAdapter$ListJabatanVH_ViewBinding.e(view);
            getreceiveralias.x = e2;
            subscribeReservationRescheduleEvent.c(e2);
            LinearLayout linearLayout = e2.a;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            getreceiveralias.e(linearLayout);
        }

        private void p() {
            BankTransferPenerima bankTransferPenerima;
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH = this.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH);
            if (listDetailTransaksiAdapter$ListDetailTransaksiVH.i.getVisibility() == 8) {
                ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH2 = this.m;
                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH2);
                if (listDetailTransaksiAdapter$ListDetailTransaksiVH2.h.getVisibility() == 8 && t().getPenerimaList().size() > 0 && (bankTransferPenerima = t().getPenerimaList().get(0)) != null) {
                    ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH3 = this.m;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH3);
                    listDetailTransaksiAdapter$ListDetailTransaksiVH3.i.setVisibility(0);
                    ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH4 = this.m;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH4);
                    listDetailTransaksiAdapter$ListDetailTransaksiVH4.h.setVisibility(0);
                    a(bankTransferPenerima);
                }
            }
        }

        public static /* synthetic */ void p(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.w();
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH);
            LinearLayout linearLayout = listKantorCabangAdapter$ListKantorCabangVH.c;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH2 = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH2);
            LinearLayout linearLayout2 = listKantorCabangAdapter$ListKantorCabangVH2.d;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH3 = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH3);
            ImageView imageView = listKantorCabangAdapter$ListKantorCabangVH3.b;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        private final ListKecamatanAdapter$ListKecamatanAdapterVH q() {
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            return listKecamatanAdapter$ListKecamatanAdapterVH;
        }

        public static /* synthetic */ void q(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.r();
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding);
            LinearLayout linearLayout = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding.b;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2 = getreceiveralias.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2);
            LinearLayout linearLayout2 = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2.c;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3 = getreceiveralias.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3);
            ImageView imageView = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3.d;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        private void r() {
            BankTransferPenerima bankTransferPenerima;
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding = this.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding);
            if (listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding.h.getVisibility() == 8) {
                ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2 = this.r;
                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2);
                if (listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2.g.getVisibility() == 8 && t().getPenerimaList().size() >= 3 && (bankTransferPenerima = t().getPenerimaList().get(2)) != null) {
                    ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3 = this.r;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3);
                    listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3.h.setVisibility(0);
                    ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4 = this.r;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4);
                    listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4.g.setVisibility(0);
                    b(bankTransferPenerima);
                }
            }
        }

        public static /* synthetic */ void r(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.w();
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH);
            LinearLayout linearLayout = listKantorCabangAdapter$ListKantorCabangVH.c;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH2 = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH2);
            LinearLayout linearLayout2 = listKantorCabangAdapter$ListKantorCabangVH2.d;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH3 = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH3);
            ImageView imageView = listKantorCabangAdapter$ListKantorCabangVH3.b;
            subscribeReservationRescheduleEvent.d(imageView, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = getreceiveralias.v;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
            LinearLayout linearLayout3 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH.m;
            subscribeReservationRescheduleEvent.d(linearLayout3, "");
            LinearLayout linearLayout4 = linearLayout3;
            ListJabatanAdapter$ListJabatanVH_ViewBinding listJabatanAdapter$ListJabatanVH_ViewBinding = getreceiveralias.x;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH_ViewBinding);
            LinearLayout linearLayout5 = listJabatanAdapter$ListJabatanVH_ViewBinding.a;
            subscribeReservationRescheduleEvent.d(linearLayout5, "");
            LinearLayout linearLayout6 = linearLayout5;
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH4 = getreceiveralias.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH4);
            TextView textView = listKantorCabangAdapter$ListKantorCabangVH4.f;
            subscribeReservationRescheduleEvent.d(textView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView, linearLayout4, linearLayout6, textView);
        }

        private void s() {
            BankTransferPenerima bankTransferPenerima;
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH = this.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH);
            if (listDetailTransaksiAdapter$ListDetailMultiTransaksiVH.j.getVisibility() == 8) {
                ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.n;
                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2);
                if (listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2.i.getVisibility() == 8 && t().getPenerimaList().size() >= 2 && (bankTransferPenerima = t().getPenerimaList().get(1)) != null) {
                    ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.n;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3);
                    listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3.j.setVisibility(0);
                    ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4 = this.n;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4);
                    listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4.i.setVisibility(0);
                    e(bankTransferPenerima);
                }
            }
        }

        public static /* synthetic */ void s(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.u();
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH);
            LinearLayout linearLayout = listKelurahanAdapter$ListKelurahanAdapterVH.a;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH2 = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH2);
            LinearLayout linearLayout2 = listKelurahanAdapter$ListKelurahanAdapterVH2.d;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH3 = getreceiveralias.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH3);
            ImageView imageView = listKelurahanAdapter$ListKelurahanAdapterVH3.e;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        private BankTransfer t() {
            getView activity = getActivity();
            if (activity != null) {
                BankTransfer bankTransfer = ((BN7PengambilanUpdateReceiverActivity) activity).m;
                if (bankTransfer != null) {
                    return bankTransfer;
                }
                subscribeReservationRescheduleEvent.e("");
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormUbahActivity");
        }

        public static /* synthetic */ void t(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            Bundle bundle = new Bundle();
            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.l;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.f.getText().toString());
            ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
            reviewMastercardAdapter$ViewHolder.setArguments(bundle);
            reviewMastercardAdapter$ViewHolder.show(getreceiveralias.getParentFragmentManager(), "StatusPendudukPenerima3");
        }

        private void u() {
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH = this.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH);
            if (listKelurahanAdapter$ListKelurahanAdapterVH.g.getVisibility() == 8) {
                ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH2 = this.A;
                subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH2);
                if (listKelurahanAdapter$ListKelurahanAdapterVH2.f.getVisibility() == 8) {
                    ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH3 = this.A;
                    subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH3);
                    listKelurahanAdapter$ListKelurahanAdapterVH3.g.setVisibility(0);
                    ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH4 = this.A;
                    subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH4);
                    listKelurahanAdapter$ListKelurahanAdapterVH4.f.setVisibility(0);
                    d(t());
                }
            }
        }

        public static /* synthetic */ void u(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.p();
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH);
            LinearLayout linearLayout = listDetailTransaksiAdapter$ListDetailTransaksiVH.c;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH2 = getreceiveralias.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH2);
            LinearLayout linearLayout2 = listDetailTransaksiAdapter$ListDetailTransaksiVH2.e;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH3 = getreceiveralias.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH3);
            ImageView imageView = listDetailTransaksiAdapter$ListDetailTransaksiVH3.a;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        private void v() {
            BankTransferPenerima bankTransferPenerima;
            BankTransferPenerima bankTransferPenerima2;
            BankTransferPenerima bankTransferPenerima3;
            BankTransferPenerima bankTransferPenerima4;
            BankTransferPenerima bankTransferPenerima5;
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
            if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.l.getVisibility() == 0) {
                BankTransfer t = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
                t.setNamaPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.d.getText().toString());
                BankTransfer t2 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
                t2.setAlamatPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.e.getText().toString());
                BankTransfer t3 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4);
                t3.setTipeNasabahPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4.j.getText().toString());
                BankTransfer t4 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5);
                t4.setTipeNasabahPengirimId(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5.j.getTag().toString());
                BankTransfer t5 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6);
                t5.setStatusPendudukPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6.h.getText().toString());
                BankTransfer t6 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7);
                t6.setStatusKewarganegaraanPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7.g.getText().toString());
                BankTransfer t7 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8);
                t7.setNamaKontakPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8.a.getText().toString());
                BankTransfer t8 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9);
                t8.setNoHpKontakPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9.c.getText().toString());
                BankTransfer t9 = t();
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10);
                t9.setNoTelpKontakPengirim(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10.f.getText().toString());
            }
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
            if (listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.m.getVisibility() == 0) {
                BankTransferPenerima bankTransferPenerima6 = t().getPenerimaList().get(0);
                if (bankTransferPenerima6 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
                    bankTransferPenerima6.setNamaPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.i.getText().toString());
                }
                BankTransferPenerima bankTransferPenerima7 = t().getPenerimaList().get(0);
                if (bankTransferPenerima7 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
                    bankTransferPenerima7.setNorekPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.h.getText().toString());
                }
                BankTransferPenerima bankTransferPenerima8 = t().getPenerimaList().get(0);
                if (bankTransferPenerima8 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4);
                    bankTransferPenerima8.setBankTujuanPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4.e.getText().toString());
                }
                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5 = this.h;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5);
                Object tag = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5.e.getTag();
                if (tag != null) {
                    BankTransferPenerima bankTransferPenerima9 = t().getPenerimaList().get(0);
                    if (bankTransferPenerima9 != null) {
                        String substring = tag.toString().substring(0, 3);
                        subscribeReservationRescheduleEvent.d(substring, "");
                        bankTransferPenerima9.setBankTujuanCode(substring);
                    }
                    BankTransferPenerima bankTransferPenerima10 = t().getPenerimaList().get(0);
                    if (bankTransferPenerima10 != null) {
                        String substring2 = tag.toString().substring(3);
                        subscribeReservationRescheduleEvent.d(substring2, "");
                        bankTransferPenerima10.setBankTujuanOfficeCode(substring2);
                    }
                }
                BankTransferPenerima bankTransferPenerima11 = t().getPenerimaList().get(0);
                if (bankTransferPenerima11 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6);
                    bankTransferPenerima11.setBeritaPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6.c.getText().toString());
                }
                BankTransferPenerima bankTransferPenerima12 = t().getPenerimaList().get(0);
                if (bankTransferPenerima12 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7);
                    bankTransferPenerima12.setAlamatPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7.b.getText().toString());
                }
                BankTransferPenerima bankTransferPenerima13 = t().getPenerimaList().get(0);
                if (bankTransferPenerima13 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8);
                    bankTransferPenerima13.setTipeNasabahPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8.f103o.getText().toString());
                }
                BankTransferPenerima bankTransferPenerima14 = t().getPenerimaList().get(0);
                if (bankTransferPenerima14 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9);
                    bankTransferPenerima14.setTipeNasabahPenerimaId(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9.f103o.getTag().toString());
                }
                BankTransferPenerima bankTransferPenerima15 = t().getPenerimaList().get(0);
                if (bankTransferPenerima15 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10);
                    bankTransferPenerima15.setStatusPendudukPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10.g.getText().toString());
                }
                BankTransferPenerima bankTransferPenerima16 = t().getPenerimaList().get(0);
                if (bankTransferPenerima16 != null) {
                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11 = this.h;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11);
                    bankTransferPenerima16.setStatusKewarganegaraanPenerima(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11.f.getText().toString());
                }
                String str = this.P;
                if (!(str == null || subscribeReservationRescheduleEvent.b((Object) "", (Object) str) || (bankTransferPenerima5 = t().getPenerimaList().get(0)) == null)) {
                    bankTransferPenerima5.setBankTujuanBIC(this.P);
                }
            }
            if (t().getPenerimaList().size() >= 2) {
                onUbah onubah = this.k;
                subscribeReservationRescheduleEvent.c(onubah);
                if (onubah.k.getVisibility() == 0) {
                    BankTransferPenerima bankTransferPenerima17 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima17 != null) {
                        onUbah onubah2 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah2);
                        bankTransferPenerima17.setNamaPenerima(onubah2.g.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima18 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima18 != null) {
                        onUbah onubah3 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah3);
                        bankTransferPenerima18.setNorekPenerima(onubah3.f.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima19 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima19 != null) {
                        onUbah onubah4 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah4);
                        bankTransferPenerima19.setBankTujuanPenerima(onubah4.d.getText().toString());
                    }
                    onUbah onubah5 = this.k;
                    subscribeReservationRescheduleEvent.c(onubah5);
                    Object tag2 = onubah5.d.getTag();
                    if (tag2 != null) {
                        BankTransferPenerima bankTransferPenerima20 = t().getPenerimaList().get(1);
                        if (bankTransferPenerima20 != null) {
                            String substring3 = tag2.toString().substring(0, 3);
                            subscribeReservationRescheduleEvent.d(substring3, "");
                            bankTransferPenerima20.setBankTujuanCode(substring3);
                        }
                        BankTransferPenerima bankTransferPenerima21 = t().getPenerimaList().get(1);
                        if (bankTransferPenerima21 != null) {
                            String substring4 = tag2.toString().substring(3);
                            subscribeReservationRescheduleEvent.d(substring4, "");
                            bankTransferPenerima21.setBankTujuanOfficeCode(substring4);
                        }
                    }
                    BankTransferPenerima bankTransferPenerima22 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima22 != null) {
                        onUbah onubah6 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah6);
                        bankTransferPenerima22.setBeritaPenerima(onubah6.e.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima23 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima23 != null) {
                        onUbah onubah7 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah7);
                        bankTransferPenerima23.setAlamatPenerima(onubah7.a.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima24 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima24 != null) {
                        onUbah onubah8 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah8);
                        bankTransferPenerima24.setTipeNasabahPenerima(onubah8.m.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima25 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima25 != null) {
                        onUbah onubah9 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah9);
                        bankTransferPenerima25.setTipeNasabahPenerimaId(onubah9.m.getTag().toString());
                    }
                    BankTransferPenerima bankTransferPenerima26 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima26 != null) {
                        onUbah onubah10 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah10);
                        bankTransferPenerima26.setStatusPendudukPenerima(onubah10.h.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima27 = t().getPenerimaList().get(1);
                    if (bankTransferPenerima27 != null) {
                        onUbah onubah11 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah11);
                        bankTransferPenerima27.setStatusKewarganegaraanPenerima(onubah11.j.getText().toString());
                    }
                    String str2 = this.S;
                    if (!(str2 == null || subscribeReservationRescheduleEvent.b((Object) "", (Object) str2) || (bankTransferPenerima4 = t().getPenerimaList().get(1)) == null)) {
                        bankTransferPenerima4.setBankTujuanBIC(this.S);
                    }
                }
            }
            if (t().getPenerimaList().size() >= 3) {
                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
                if (listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.n.getVisibility() == 0) {
                    BankTransferPenerima bankTransferPenerima28 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima28 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
                        bankTransferPenerima28.setNamaPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.g.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima29 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima29 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
                        bankTransferPenerima29.setNorekPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.i.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima30 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima30 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4);
                        bankTransferPenerima30.setBankTujuanPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4.b.getText().toString());
                    }
                    ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5 = this.l;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5);
                    Object tag3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5.b.getTag();
                    if (tag3 != null) {
                        BankTransferPenerima bankTransferPenerima31 = t().getPenerimaList().get(2);
                        if (bankTransferPenerima31 != null) {
                            String substring5 = tag3.toString().substring(0, 3);
                            subscribeReservationRescheduleEvent.d(substring5, "");
                            bankTransferPenerima31.setBankTujuanCode(substring5);
                        }
                        BankTransferPenerima bankTransferPenerima32 = t().getPenerimaList().get(2);
                        if (bankTransferPenerima32 != null) {
                            String substring6 = tag3.toString().substring(3);
                            subscribeReservationRescheduleEvent.d(substring6, "");
                            bankTransferPenerima32.setBankTujuanOfficeCode(substring6);
                        }
                    }
                    BankTransferPenerima bankTransferPenerima33 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima33 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6);
                        bankTransferPenerima33.setBeritaPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6.a.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima34 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima34 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7);
                        bankTransferPenerima34.setAlamatPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7.e.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima35 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima35 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8);
                        bankTransferPenerima35.setTipeNasabahPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8.f106o.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima36 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima36 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9);
                        bankTransferPenerima36.setTipeNasabahPenerimaId(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9.f106o.getTag().toString());
                    }
                    BankTransferPenerima bankTransferPenerima37 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima37 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10);
                        bankTransferPenerima37.setStatusPendudukPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10.f.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima38 = t().getPenerimaList().get(2);
                    if (bankTransferPenerima38 != null) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11);
                        bankTransferPenerima38.setStatusKewarganegaraanPenerima(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11.j.getText().toString());
                    }
                    String str3 = this.O;
                    if (!(str3 == null || subscribeReservationRescheduleEvent.b((Object) "", (Object) str3) || (bankTransferPenerima3 = t().getPenerimaList().get(2)) == null)) {
                        bankTransferPenerima3.setBankTujuanBIC(this.O);
                    }
                }
            }
            if (t().getPenerimaList().size() >= 4) {
                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
                if (listDetailTransaksiROAdapter$ListDetailTransaksiVH.n.getVisibility() == 0) {
                    BankTransferPenerima bankTransferPenerima39 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima39 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
                        bankTransferPenerima39.setNamaPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH2.g.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima40 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima40 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
                        bankTransferPenerima40.setNorekPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH3.i.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima41 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima41 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH4 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH4);
                        bankTransferPenerima41.setBankTujuanPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH4.d.getText().toString());
                    }
                    ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH5 = this.q;
                    subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH5);
                    Object tag4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH5.d.getTag();
                    if (tag4 != null) {
                        BankTransferPenerima bankTransferPenerima42 = t().getPenerimaList().get(3);
                        if (bankTransferPenerima42 != null) {
                            String substring7 = tag4.toString().substring(0, 3);
                            subscribeReservationRescheduleEvent.d(substring7, "");
                            bankTransferPenerima42.setBankTujuanCode(substring7);
                        }
                        BankTransferPenerima bankTransferPenerima43 = t().getPenerimaList().get(3);
                        if (bankTransferPenerima43 != null) {
                            String substring8 = tag4.toString().substring(3);
                            subscribeReservationRescheduleEvent.d(substring8, "");
                            bankTransferPenerima43.setBankTujuanOfficeCode(substring8);
                        }
                    }
                    BankTransferPenerima bankTransferPenerima44 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima44 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH6 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH6);
                        bankTransferPenerima44.setBeritaPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH6.b.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima45 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima45 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH7 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH7);
                        bankTransferPenerima45.setAlamatPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH7.c.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima46 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima46 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH8 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH8);
                        bankTransferPenerima46.setTipeNasabahPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH8.k.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima47 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima47 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH9 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH9);
                        bankTransferPenerima47.setTipeNasabahPenerimaId(listDetailTransaksiROAdapter$ListDetailTransaksiVH9.k.getTag().toString());
                    }
                    BankTransferPenerima bankTransferPenerima48 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima48 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH10 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH10);
                        bankTransferPenerima48.setStatusPendudukPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH10.h.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima49 = t().getPenerimaList().get(3);
                    if (bankTransferPenerima49 != null) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH11 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH11);
                        bankTransferPenerima49.setStatusKewarganegaraanPenerima(listDetailTransaksiROAdapter$ListDetailTransaksiVH11.f.getText().toString());
                    }
                    String str4 = this.R;
                    if (!(str4 == null || subscribeReservationRescheduleEvent.b((Object) "", (Object) str4) || (bankTransferPenerima2 = t().getPenerimaList().get(3)) == null)) {
                        bankTransferPenerima2.setBankTujuanBIC(this.R);
                    }
                }
            }
            if (t().getPenerimaList().size() >= 5) {
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
                if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH.m.getVisibility() == 0) {
                    BankTransferPenerima bankTransferPenerima50 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima50 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
                        bankTransferPenerima50.setNamaPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.h.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima51 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima51 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
                        bankTransferPenerima51.setNorekPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.i.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima52 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima52 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH4 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH4);
                        bankTransferPenerima52.setBankTujuanPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH4.d.getText().toString());
                    }
                    ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH5 = this.v;
                    subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH5);
                    Object tag5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH5.d.getTag();
                    if (tag5 != null) {
                        BankTransferPenerima bankTransferPenerima53 = t().getPenerimaList().get(4);
                        if (bankTransferPenerima53 != null) {
                            String substring9 = tag5.toString().substring(0, 3);
                            subscribeReservationRescheduleEvent.d(substring9, "");
                            bankTransferPenerima53.setBankTujuanCode(substring9);
                        }
                        BankTransferPenerima bankTransferPenerima54 = t().getPenerimaList().get(4);
                        if (bankTransferPenerima54 != null) {
                            String substring10 = tag5.toString().substring(3);
                            subscribeReservationRescheduleEvent.d(substring10, "");
                            bankTransferPenerima54.setBankTujuanOfficeCode(substring10);
                        }
                    }
                    BankTransferPenerima bankTransferPenerima55 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima55 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH6 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH6);
                        bankTransferPenerima55.setBeritaPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH6.b.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima56 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima56 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH7 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH7);
                        bankTransferPenerima56.setAlamatPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH7.e.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima57 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima57 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH8 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH8);
                        bankTransferPenerima57.setTipeNasabahPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH8.n.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima58 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima58 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH9 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH9);
                        bankTransferPenerima58.setTipeNasabahPenerimaId(listJenisMataUangAdapter$ListJenisMataUangAdapterVH9.n.getTag().toString());
                    }
                    BankTransferPenerima bankTransferPenerima59 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima59 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH10 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH10);
                        bankTransferPenerima59.setStatusPendudukPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH10.g.getText().toString());
                    }
                    BankTransferPenerima bankTransferPenerima60 = t().getPenerimaList().get(4);
                    if (bankTransferPenerima60 != null) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH11 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH11);
                        bankTransferPenerima60.setStatusKewarganegaraanPenerima(listJenisMataUangAdapter$ListJenisMataUangAdapterVH11.j.getText().toString());
                    }
                    String str5 = this.Q;
                    if (!(str5 == null || subscribeReservationRescheduleEvent.b((Object) "", (Object) str5) || (bankTransferPenerima = t().getPenerimaList().get(4)) == null)) {
                        bankTransferPenerima.setBankTujuanBIC(this.Q);
                    }
                }
            }
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            if (listKecamatanAdapter$ListKecamatanAdapterVH.j.getVisibility() == 0) {
                BankTransfer t10 = t();
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
                t10.setSumberDanaTransaksi(listKecamatanAdapter$ListKecamatanAdapterVH2.b.getText().toString());
                BankTransfer t11 = t();
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
                t11.setSumberDanaTransaksiCode(listKecamatanAdapter$ListKecamatanAdapterVH3.b.getTag().toString());
                BankTransfer t12 = t();
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH4 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH4);
                t12.setTujuanTransaksi(listKecamatanAdapter$ListKecamatanAdapterVH4.i.getText().toString());
                BankTransfer t13 = t();
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH5 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH5);
                t13.setTujuanTransaksiCode(listKecamatanAdapter$ListKecamatanAdapterVH5.i.getTag().toString());
                BankTransfer t14 = t();
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH6 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH6);
                t14.setNoWarkatTransaksi(listKecamatanAdapter$ListKecamatanAdapterVH6.a.getText().toString());
            }
        }

        public static /* synthetic */ void v(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.ap = "BankTujuanPenerima2";
            Intent intent = new Intent(getreceiveralias.getActivity(), onClickBankTransfer.class);
            onClickBankTransfer.IconCompatParcelizer iconCompatParcelizer = onClickBankTransfer.j;
            intent.putExtra(onClickBankTransfer.r, true);
            getreceiveralias.startActivity(intent);
        }

        private void w() {
            BankTransferPenerima bankTransferPenerima;
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH = this.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH);
            if (listKantorCabangAdapter$ListKantorCabangVH.j.getVisibility() == 8) {
                ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH2 = this.w;
                subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH2);
                if (listKantorCabangAdapter$ListKantorCabangVH2.h.getVisibility() == 8 && t().getPenerimaList().size() >= 5 && (bankTransferPenerima = t().getPenerimaList().get(4)) != null) {
                    ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH3 = this.w;
                    subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH3);
                    listKantorCabangAdapter$ListKantorCabangVH3.j.setVisibility(0);
                    ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH4 = this.w;
                    subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH4);
                    listKantorCabangAdapter$ListKantorCabangVH4.h.setVisibility(0);
                    d(bankTransferPenerima);
                }
            }
        }

        public static /* synthetic */ void w(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.s();
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH = getreceiveralias.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH);
            LinearLayout linearLayout = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH.b;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2 = getreceiveralias.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2);
            LinearLayout linearLayout2 = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2.a;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3 = getreceiveralias.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3);
            ImageView imageView = listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3.e;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        private void x() {
            BankTransferPenerima bankTransferPenerima;
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH = this.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH);
            if (listJabatanAdapter$ListJabatanVH.i.getVisibility() == 8) {
                ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH2 = this.t;
                subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH2);
                if (listJabatanAdapter$ListJabatanVH2.j.getVisibility() == 8 && t().getPenerimaList().size() >= 4 && (bankTransferPenerima = t().getPenerimaList().get(3)) != null) {
                    ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH3 = this.t;
                    subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH3);
                    listJabatanAdapter$ListJabatanVH3.i.setVisibility(0);
                    ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH4 = this.t;
                    subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH4);
                    listJabatanAdapter$ListJabatanVH4.j.setVisibility(0);
                    c(bankTransferPenerima);
                }
            }
        }

        public static /* synthetic */ void x(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.r();
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding);
            LinearLayout linearLayout = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding.b;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2 = getreceiveralias.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2);
            LinearLayout linearLayout2 = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2.c;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3 = getreceiveralias.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3);
            ImageView imageView = listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3.d;
            subscribeReservationRescheduleEvent.d(imageView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView);
        }

        private void y() {
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH = this.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH);
            if (listKodePosAdapter$ListKodePosAdapterVH.j.getVisibility() == 8) {
                ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH2 = this.C;
                subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH2);
                if (listKodePosAdapter$ListKodePosAdapterVH2.f.getVisibility() == 8) {
                    ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH3 = this.C;
                    subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH3);
                    listKodePosAdapter$ListKodePosAdapterVH3.j.setVisibility(0);
                    ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH4 = this.C;
                    subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH4);
                    listKodePosAdapter$ListKodePosAdapterVH4.f.setVisibility(0);
                    e(t());
                }
            }
        }

        public static /* synthetic */ void y(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            getreceiveralias.p();
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH);
            LinearLayout linearLayout = listDetailTransaksiAdapter$ListDetailTransaksiVH.c;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH2 = getreceiveralias.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH2);
            LinearLayout linearLayout2 = listDetailTransaksiAdapter$ListDetailTransaksiVH2.e;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH3 = getreceiveralias.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH3);
            ImageView imageView = listDetailTransaksiAdapter$ListDetailTransaksiVH3.a;
            subscribeReservationRescheduleEvent.d(imageView, "");
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = getreceiveralias.h;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
            LinearLayout linearLayout3 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.m;
            subscribeReservationRescheduleEvent.d(linearLayout3, "");
            LinearLayout linearLayout4 = linearLayout3;
            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = getreceiveralias.g;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
            LinearLayout linearLayout5 = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.e;
            subscribeReservationRescheduleEvent.d(linearLayout5, "");
            LinearLayout linearLayout6 = linearLayout5;
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH4 = getreceiveralias.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH4);
            TextView textView = listDetailTransaksiAdapter$ListDetailTransaksiVH4.f;
            subscribeReservationRescheduleEvent.d(textView, "");
            getreceiveralias.c(linearLayout, linearLayout2, imageView, linearLayout4, linearLayout6, textView);
        }

        public static /* synthetic */ void z(getReceiverAlias getreceiveralias, View view) {
            subscribeReservationRescheduleEvent.e(getreceiveralias, "");
            Bundle bundle = new Bundle();
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = getreceiveralias.q;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, listDetailTransaksiROAdapter$ListDetailTransaksiVH.h.getText().toString());
            ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
            reviewMastercardAdapter$ViewHolder.setArguments(bundle);
            reviewMastercardAdapter$ViewHolder.show(getreceiveralias.getParentFragmentManager(), "StatusPendudukPenerima4");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void backEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
            subscribeReservationRescheduleEvent.e(clickorangsamadenganpemilik, "");
            requireActivity().finish();
        }

        public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            EditText editText = listKecamatanAdapter$ListKecamatanAdapterVH.d;
            subscribeReservationRescheduleEvent.d(editText, "");
            c(editText);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
            listKecamatanAdapter$ListKecamatanAdapterVH2.d.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
            listKecamatanAdapter$ListKecamatanAdapterVH3.n.setHintEnabled(true);
        }

        @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
        public final void e() {
            this.a.clear();
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void ketentuanBankTransfer(onClickUbahDataPenerima onclickubahdatapenerima) {
            subscribeReservationRescheduleEvent.e(onclickubahdatapenerima, "");
            v();
            getView activity = getActivity();
            if (activity != null) {
                ((BN7PengambilanUpdateReceiverActivity) activity).y();
                getView activity2 = getActivity();
                if (activity2 != null) {
                    ((BN7PengambilanUpdateReceiverActivity) activity2).z();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormUbahActivity");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormUbahActivity");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseBankTujuan(goDeleteAccount godeleteaccount) {
            subscribeReservationRescheduleEvent.e(godeleteaccount, "");
            String str = this.ap;
            DetailTundaCCActivity detailTundaCCActivity = null;
            DetailTundaCCActivity detailTundaCCActivity2 = null;
            DetailTundaCCActivity detailTundaCCActivity3 = null;
            DetailTundaCCActivity detailTundaCCActivity4 = null;
            DetailTundaCCActivity detailTundaCCActivity5 = null;
            switch (str.hashCode()) {
                case -1876637211:
                    if (str.equals("BankTujuanPenerima1")) {
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
                        EditText editText = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.e;
                        subscribeReservationRescheduleEvent.d(editText, "");
                        a((View) editText, this.W, this.ak, this.aa);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.l.setHintEnabled(true);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.e.setText(godeleteaccount.a);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4.e.setTag(godeleteaccount.d);
                        this.P = godeleteaccount.c;
                        DetailTundaCCActivity detailTundaCCActivity6 = this.D;
                        DetailTundaCCActivity detailTundaCCActivity7 = detailTundaCCActivity6;
                        if (detailTundaCCActivity6 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            detailTundaCCActivity7 = null;
                        }
                        detailTundaCCActivity7.b = this.P;
                        detailTundaCCActivity4 = this.G;
                        if (detailTundaCCActivity4 == null) {
                            subscribeReservationRescheduleEvent.e("");
                        }
                        detailTundaCCActivity4.b = this.P;
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5.i.setText("");
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6.q.setHintEnabled(false);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7.h.setText("");
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8.t.setHintEnabled(false);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9.c.setText("");
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10.k.setHintEnabled(false);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11.b.setText("");
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12.n.setHintEnabled(false);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13.f103o.setText("");
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14.v.setHintEnabled(false);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15.g.setText("");
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH16 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH16);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH16.u.setHintEnabled(false);
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH17 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH17);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH17.f.setText("");
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH18 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH18);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH18.y.setHintEnabled(false);
                        return;
                    }
                    return;
                case -1876637210:
                    if (str.equals("BankTujuanPenerima2")) {
                        onUbah onubah = this.k;
                        subscribeReservationRescheduleEvent.c(onubah);
                        EditText editText2 = onubah.d;
                        subscribeReservationRescheduleEvent.d(editText2, "");
                        a((View) editText2, this.T, this.al, this.ab);
                        onUbah onubah2 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah2);
                        onubah2.n.setHintEnabled(true);
                        onUbah onubah3 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah3);
                        onubah3.d.setText(godeleteaccount.a);
                        onUbah onubah4 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah4);
                        onubah4.d.setTag(godeleteaccount.d);
                        this.S = godeleteaccount.c;
                        DetailTundaCCActivity detailTundaCCActivity8 = this.I;
                        DetailTundaCCActivity detailTundaCCActivity9 = detailTundaCCActivity8;
                        if (detailTundaCCActivity8 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            detailTundaCCActivity9 = null;
                        }
                        detailTundaCCActivity9.b = this.S;
                        detailTundaCCActivity3 = this.M;
                        if (detailTundaCCActivity3 == null) {
                            subscribeReservationRescheduleEvent.e("");
                        }
                        detailTundaCCActivity3.b = this.S;
                        onUbah onubah5 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah5);
                        onubah5.g.setText("");
                        onUbah onubah6 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah6);
                        onubah6.t.setHintEnabled(false);
                        onUbah onubah7 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah7);
                        onubah7.f.setText("");
                        onUbah onubah8 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah8);
                        onubah8.q.setHintEnabled(false);
                        onUbah onubah9 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah9);
                        onubah9.e.setText("");
                        onUbah onubah10 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah10);
                        onubah10.l.setHintEnabled(false);
                        onUbah onubah11 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah11);
                        onubah11.a.setText("");
                        onUbah onubah12 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah12);
                        onubah12.f175o.setHintEnabled(false);
                        onUbah onubah13 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah13);
                        onubah13.m.setText("");
                        onUbah onubah14 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah14);
                        onubah14.u.setHintEnabled(false);
                        onUbah onubah15 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah15);
                        onubah15.h.setText("");
                        onUbah onubah16 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah16);
                        onubah16.w.setHintEnabled(false);
                        onUbah onubah17 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah17);
                        onubah17.j.setText("");
                        onUbah onubah18 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah18);
                        onubah18.x.setHintEnabled(false);
                        return;
                    }
                    return;
                case -1876637209:
                    if (str.equals("BankTujuanPenerima3")) {
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
                        EditText editText3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.b;
                        subscribeReservationRescheduleEvent.d(editText3, "");
                        a((View) editText3, this.U, this.am, this.af);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.l.setHintEnabled(true);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.b.setText(godeleteaccount.a);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4.b.setTag(godeleteaccount.d);
                        this.O = godeleteaccount.c;
                        DetailTundaCCActivity detailTundaCCActivity10 = this.E;
                        DetailTundaCCActivity detailTundaCCActivity11 = detailTundaCCActivity10;
                        if (detailTundaCCActivity10 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            detailTundaCCActivity11 = null;
                        }
                        detailTundaCCActivity11.b = this.O;
                        detailTundaCCActivity2 = this.N;
                        if (detailTundaCCActivity2 == null) {
                            subscribeReservationRescheduleEvent.e("");
                        }
                        detailTundaCCActivity2.b = this.O;
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5.g.setText("");
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6.q.setHintEnabled(false);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7.i.setText("");
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8.s.setHintEnabled(false);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9.a.setText("");
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10.m.setHintEnabled(false);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11.e.setText("");
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12.k.setHintEnabled(false);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13.f106o.setText("");
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14.x.setHintEnabled(false);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15.f.setText("");
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding16 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding16);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding16.u.setHintEnabled(false);
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding17 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding17);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding17.j.setText("");
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding18 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding18);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding18.w.setHintEnabled(false);
                        return;
                    }
                    return;
                case -1876637208:
                    if (str.equals("BankTujuanPenerima4")) {
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
                        EditText editText4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH.d;
                        subscribeReservationRescheduleEvent.d(editText4, "");
                        a((View) editText4, this.V, this.ai, this.ag);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH2.l.setHintEnabled(true);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH3.d.setText(godeleteaccount.a);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH4 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH4);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH4.d.setTag(godeleteaccount.d);
                        this.R = godeleteaccount.c;
                        DetailTundaCCActivity detailTundaCCActivity12 = this.F;
                        DetailTundaCCActivity detailTundaCCActivity13 = detailTundaCCActivity12;
                        if (detailTundaCCActivity12 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            detailTundaCCActivity13 = null;
                        }
                        detailTundaCCActivity13.b = this.R;
                        detailTundaCCActivity = this.L;
                        if (detailTundaCCActivity == null) {
                            subscribeReservationRescheduleEvent.e("");
                        }
                        detailTundaCCActivity.b = this.R;
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH5 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH5);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH5.g.setText("");
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH6 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH6);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH6.t.setHintEnabled(false);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH7 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH7);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH7.i.setText("");
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH8 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH8);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH8.s.setHintEnabled(false);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH9 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH9);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH9.b.setText("");
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH10 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH10);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH10.f109o.setHintEnabled(false);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH11 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH11);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH11.c.setText("");
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH12 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH12);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH12.m.setHintEnabled(false);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH13 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH13);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH13.k.setText("");
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH14 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH14);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH14.u.setHintEnabled(false);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH15 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH15);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH15.h.setText("");
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH16 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH16);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH16.w.setHintEnabled(false);
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH17 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH17);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH17.f.setText("");
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH18 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH18);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH18.v.setHintEnabled(false);
                        return;
                    }
                    return;
                case -1876637207:
                    if (str.equals("BankTujuanPenerima5")) {
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
                        EditText editText5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH.d;
                        subscribeReservationRescheduleEvent.d(editText5, "");
                        a((View) editText5, this.ac, this.aj, this.ad);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.f111o.setHintEnabled(true);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.d.setText(godeleteaccount.a);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH4 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH4);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH4.d.setTag(godeleteaccount.d);
                        this.Q = godeleteaccount.c;
                        DetailTundaCCActivity detailTundaCCActivity14 = this.H;
                        DetailTundaCCActivity detailTundaCCActivity15 = detailTundaCCActivity14;
                        if (detailTundaCCActivity14 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            detailTundaCCActivity15 = null;
                        }
                        detailTundaCCActivity15.b = this.Q;
                        detailTundaCCActivity5 = this.K;
                        if (detailTundaCCActivity5 == null) {
                            subscribeReservationRescheduleEvent.e("");
                        }
                        detailTundaCCActivity5.b = this.Q;
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH5 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH5);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH5.h.setText("");
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH6 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH6);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH6.q.setHintEnabled(false);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH7 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH7);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH7.i.setText("");
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH8 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH8);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH8.t.setHintEnabled(false);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH9 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH9);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH9.b.setText("");
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH10 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH10);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH10.k.setHintEnabled(false);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH11 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH11);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH11.e.setText("");
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH12 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH12);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH12.l.setHintEnabled(false);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH13 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH13);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH13.n.setText("");
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH14 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH14);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH14.y.setHintEnabled(false);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH15 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH15);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH15.g.setText("");
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH16 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH16);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH16.x.setHintEnabled(false);
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH17 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH17);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH17.j.setText("");
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH18 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH18);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH18.v.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseSaranaPembayaran(ReservasiROSuccessActivity_ViewBinding reservasiROSuccessActivity_ViewBinding) {
            subscribeReservationRescheduleEvent.e(reservasiROSuccessActivity_ViewBinding, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
            EditText editText = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.i;
            subscribeReservationRescheduleEvent.d(editText, "");
            c(editText);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.r.setHintEnabled(true);
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.i.setText(reservasiROSuccessActivity_ViewBinding.e);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseStatusKewarganegaraan(onChooseProvinsiKantor onchooseprovinsikantor) {
            subscribeReservationRescheduleEvent.e(onchooseprovinsikantor, "");
            String str = onchooseprovinsikantor.b;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 807369150) {
                    switch (hashCode) {
                        case -790571337:
                            if (str.equals("StatusKewarganegaraanPenerima1")) {
                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
                                listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.y.setHintEnabled(true);
                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = this.h;
                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
                                listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.f.setText(onchooseprovinsikantor.a);
                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = this.h;
                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
                                EditText editText = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.f;
                                subscribeReservationRescheduleEvent.d(editText, "");
                                a((View) editText, this.W, this.ak, this.aa);
                                return;
                            }
                            return;
                        case -790571336:
                            if (str.equals("StatusKewarganegaraanPenerima2")) {
                                onUbah onubah = this.k;
                                subscribeReservationRescheduleEvent.c(onubah);
                                onubah.x.setHintEnabled(true);
                                onUbah onubah2 = this.k;
                                subscribeReservationRescheduleEvent.c(onubah2);
                                onubah2.j.setText(onchooseprovinsikantor.a);
                                onUbah onubah3 = this.k;
                                subscribeReservationRescheduleEvent.c(onubah3);
                                EditText editText2 = onubah3.j;
                                subscribeReservationRescheduleEvent.d(editText2, "");
                                a((View) editText2, this.T, this.al, this.ab);
                                return;
                            }
                            return;
                        case -790571335:
                            if (str.equals("StatusKewarganegaraanPenerima3")) {
                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
                                listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.w.setHintEnabled(true);
                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.l;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
                                listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.j.setText(onchooseprovinsikantor.a);
                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.l;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
                                EditText editText3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.j;
                                subscribeReservationRescheduleEvent.d(editText3, "");
                                a((View) editText3, this.U, this.am, this.af);
                                return;
                            }
                            return;
                        case -790571334:
                            if (str.equals("StatusKewarganegaraanPenerima4")) {
                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
                                listDetailTransaksiROAdapter$ListDetailTransaksiVH.v.setHintEnabled(true);
                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = this.q;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
                                listDetailTransaksiROAdapter$ListDetailTransaksiVH2.f.setText(onchooseprovinsikantor.a);
                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = this.q;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
                                EditText editText4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH3.f;
                                subscribeReservationRescheduleEvent.d(editText4, "");
                                a((View) editText4, this.V, this.ai, this.ag);
                                return;
                            }
                            return;
                        case -790571333:
                            if (str.equals("StatusKewarganegaraanPenerima5")) {
                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
                                listJenisMataUangAdapter$ListJenisMataUangAdapterVH.v.setHintEnabled(true);
                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = this.v;
                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
                                listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.j.setText(onchooseprovinsikantor.a);
                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = this.v;
                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
                                EditText editText5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.j;
                                subscribeReservationRescheduleEvent.d(editText5, "");
                                a((View) editText5, this.ac, this.aj, this.ad);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else if (str.equals("StatusKewarganegaraanPengirim")) {
                    ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
                    subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
                    listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.p.setHintEnabled(true);
                    ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
                    subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
                    listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.g.setText(onchooseprovinsikantor.a);
                    ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
                    subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
                    EditText editText6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.g;
                    subscribeReservationRescheduleEvent.d(editText6, "");
                    a((View) editText6, this.Z, this.ar, this.ah);
                }
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseStatusPenduduk(ReservasiSuccessAskNextActivity reservasiSuccessAskNextActivity) {
            subscribeReservationRescheduleEvent.e(reservasiSuccessAskNextActivity, "");
            String str = reservasiSuccessAskNextActivity.a;
            int hashCode = str.hashCode();
            if (hashCode != -414930403) {
                switch (hashCode) {
                    case -27151816:
                        if (str.equals("StatusPendudukPenerima1")) {
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
                            EditText editText = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.g;
                            subscribeReservationRescheduleEvent.d(editText, "");
                            a((View) editText, this.W, this.ak, this.aa);
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
                            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.u.setHintEnabled(true);
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
                            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.g.setText(reservasiSuccessAskNextActivity.d);
                            return;
                        }
                        return;
                    case -27151815:
                        if (str.equals("StatusPendudukPenerima2")) {
                            onUbah onubah = this.k;
                            subscribeReservationRescheduleEvent.c(onubah);
                            EditText editText2 = onubah.h;
                            subscribeReservationRescheduleEvent.d(editText2, "");
                            a((View) editText2, this.T, this.al, this.ab);
                            onUbah onubah2 = this.k;
                            subscribeReservationRescheduleEvent.c(onubah2);
                            onubah2.w.setHintEnabled(true);
                            onUbah onubah3 = this.k;
                            subscribeReservationRescheduleEvent.c(onubah3);
                            onubah3.h.setText(reservasiSuccessAskNextActivity.d);
                            return;
                        }
                        return;
                    case -27151814:
                        if (str.equals("StatusPendudukPenerima3")) {
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
                            EditText editText3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.f;
                            subscribeReservationRescheduleEvent.d(editText3, "");
                            a((View) editText3, this.U, this.am, this.af);
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
                            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.u.setHintEnabled(true);
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
                            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.f.setText(reservasiSuccessAskNextActivity.d);
                            return;
                        }
                        return;
                    case -27151813:
                        if (str.equals("StatusPendudukPenerima4")) {
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
                            EditText editText4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH.h;
                            subscribeReservationRescheduleEvent.d(editText4, "");
                            a((View) editText4, this.V, this.ai, this.ag);
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
                            listDetailTransaksiROAdapter$ListDetailTransaksiVH2.w.setHintEnabled(true);
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
                            listDetailTransaksiROAdapter$ListDetailTransaksiVH3.h.setText(reservasiSuccessAskNextActivity.d);
                            return;
                        }
                        return;
                    case -27151812:
                        if (str.equals("StatusPendudukPenerima5")) {
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
                            EditText editText5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH.g;
                            subscribeReservationRescheduleEvent.d(editText5, "");
                            a((View) editText5, this.ac, this.aj, this.ad);
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.x.setHintEnabled(true);
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.g.setText(reservasiSuccessAskNextActivity.d);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else if (str.equals("StatusPendudukPengirim")) {
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
                EditText editText6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.h;
                subscribeReservationRescheduleEvent.d(editText6, "");
                a((View) editText6, this.Z, this.ar, this.ah);
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.q.setHintEnabled(true);
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.h.setText(reservasiSuccessAskNextActivity.d);
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseSumberDana(ReservasiROSuccessActivity reservasiROSuccessActivity) {
            subscribeReservationRescheduleEvent.e(reservasiROSuccessActivity, "");
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
            EditText editText = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.b;
            subscribeReservationRescheduleEvent.d(editText, "");
            a((View) editText, this.Z, this.ar, this.ah);
            String str = reservasiROSuccessActivity.d;
            subscribeReservationRescheduleEvent.d(str, "");
            if (!(str.length() == 0)) {
                String str2 = reservasiROSuccessActivity.d;
                subscribeReservationRescheduleEvent.d(str2, "");
                Object[] array = CheckOTPSessionPresenter.d((CharSequence) str2, new String[]{"-"}, false, 0).toArray(new String[0]);
                subscribeReservationRescheduleEvent.c(array);
                String[] strArr = (String[]) array;
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
                EditText editText2 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.b;
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
                editText2.setText(str3.subSequence(i, length + 1).toString());
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.t.setHintEnabled(true);
                return;
            }
            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4 = this.u;
            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4);
            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4.t.setHintEnabled(false);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseSumberDana(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
            subscribeReservationRescheduleEvent.e(reservasiTellerOActivity_ViewBinding, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            EditText editText = listKecamatanAdapter$ListKecamatanAdapterVH.b;
            subscribeReservationRescheduleEvent.d(editText, "");
            c(editText);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
            listKecamatanAdapter$ListKecamatanAdapterVH2.k.setHintEnabled(true);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
            listKecamatanAdapter$ListKecamatanAdapterVH3.b.setText(reservasiTellerOActivity_ViewBinding.a);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH4 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH4);
            listKecamatanAdapter$ListKecamatanAdapterVH4.b.setTag(reservasiTellerOActivity_ViewBinding.d);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseTipeNasabah(resetAccount resetaccount) {
            subscribeReservationRescheduleEvent.e(resetaccount, "");
            String str = resetaccount.a;
            int hashCode = str.hashCode();
            if (hashCode != 1268620313) {
                switch (hashCode) {
                    case 623312828:
                        if (str.equals("TipeNasabahPenerima1")) {
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
                            EditText editText = listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.f103o;
                            subscribeReservationRescheduleEvent.d(editText, "");
                            a((View) editText, this.W, this.ak, this.aa);
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
                            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.v.setHintEnabled(true);
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
                            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.f103o.setText(resetaccount.d);
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4 = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4);
                            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4.f103o.setTag(String.valueOf(resetaccount.e));
                            return;
                        }
                        return;
                    case 623312829:
                        if (str.equals("TipeNasabahPenerima2")) {
                            onUbah onubah = this.k;
                            subscribeReservationRescheduleEvent.c(onubah);
                            EditText editText2 = onubah.m;
                            subscribeReservationRescheduleEvent.d(editText2, "");
                            a((View) editText2, this.T, this.al, this.ab);
                            onUbah onubah2 = this.k;
                            subscribeReservationRescheduleEvent.c(onubah2);
                            onubah2.u.setHintEnabled(true);
                            onUbah onubah3 = this.k;
                            subscribeReservationRescheduleEvent.c(onubah3);
                            onubah3.m.setText(resetaccount.d);
                            onUbah onubah4 = this.k;
                            subscribeReservationRescheduleEvent.c(onubah4);
                            onubah4.m.setTag(String.valueOf(resetaccount.e));
                            return;
                        }
                        return;
                    case 623312830:
                        if (str.equals("TipeNasabahPenerima3")) {
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
                            EditText editText3 = listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.f106o;
                            subscribeReservationRescheduleEvent.d(editText3, "");
                            a((View) editText3, this.U, this.am, this.af);
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
                            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.x.setHintEnabled(true);
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
                            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.f106o.setText(resetaccount.d);
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4 = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4);
                            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4.f106o.setTag(String.valueOf(resetaccount.e));
                            return;
                        }
                        return;
                    case 623312831:
                        if (str.equals("TipeNasabahPenerima4")) {
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
                            EditText editText4 = listDetailTransaksiROAdapter$ListDetailTransaksiVH.k;
                            subscribeReservationRescheduleEvent.d(editText4, "");
                            a((View) editText4, this.V, this.ai, this.ag);
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
                            listDetailTransaksiROAdapter$ListDetailTransaksiVH2.u.setHintEnabled(true);
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
                            listDetailTransaksiROAdapter$ListDetailTransaksiVH3.k.setText(resetaccount.d);
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH4 = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH4);
                            listDetailTransaksiROAdapter$ListDetailTransaksiVH4.k.setTag(String.valueOf(resetaccount.e));
                            return;
                        }
                        return;
                    case 623312832:
                        if (str.equals("TipeNasabahPenerima5")) {
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
                            EditText editText5 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH.n;
                            subscribeReservationRescheduleEvent.d(editText5, "");
                            a((View) editText5, this.ac, this.aj, this.ad);
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.y.setHintEnabled(true);
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.n.setText(resetaccount.d);
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH4 = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH4);
                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH4.n.setTag(String.valueOf(resetaccount.e));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else if (str.equals("TipeNasabahPengirim")) {
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
                EditText editText6 = listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.j;
                subscribeReservationRescheduleEvent.d(editText6, "");
                a((View) editText6, this.Z, this.ar, this.ah);
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.w.setHintEnabled(true);
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.j.setText(resetaccount.d);
                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4 = this.u;
                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4);
                listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4.j.setTag(String.valueOf(resetaccount.e));
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseTujuanTransaksi(SyaratKetentuanActivity syaratKetentuanActivity) {
            subscribeReservationRescheduleEvent.e(syaratKetentuanActivity, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            EditText editText = listKecamatanAdapter$ListKecamatanAdapterVH.i;
            subscribeReservationRescheduleEvent.d(editText, "");
            c(editText);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
            listKecamatanAdapter$ListKecamatanAdapterVH2.s.setHintEnabled(true);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
            listKecamatanAdapter$ListKecamatanAdapterVH3.i.setText(syaratKetentuanActivity.c);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH4 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH4);
            listKecamatanAdapter$ListKecamatanAdapterVH4.i.setTag(syaratKetentuanActivity.a);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onChooseWaktuPengiriman(TarikanReservasiUbahTransaksiActivity tarikanReservasiUbahTransaksiActivity) {
            subscribeReservationRescheduleEvent.e(tarikanReservasiUbahTransaksiActivity, "");
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
            EditText editText = listKecamatanAdapter$ListKecamatanAdapterVH.g;
            subscribeReservationRescheduleEvent.d(editText, "");
            c(editText);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
            EditText editText2 = listKecamatanAdapter$ListKecamatanAdapterVH2.d;
            subscribeReservationRescheduleEvent.d(editText2, "");
            c(editText2);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
            boolean z = true;
            listKecamatanAdapter$ListKecamatanAdapterVH3.p.setHintEnabled(true);
            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH4 = this.B;
            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH4);
            listKecamatanAdapter$ListKecamatanAdapterVH4.g.setText(tarikanReservasiUbahTransaksiActivity.d);
            String str = tarikanReservasiUbahTransaksiActivity.d;
            if (subscribeReservationRescheduleEvent.b((Object) str, (Object) getString(2131821704))) {
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH5 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH5);
                listKecamatanAdapter$ListKecamatanAdapterVH5.n.setVisibility(8);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH6 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH6);
                listKecamatanAdapter$ListKecamatanAdapterVH6.d.setText("");
            } else if (subscribeReservationRescheduleEvent.b((Object) str, (Object) getString(2131822178))) {
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH7 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH7);
                listKecamatanAdapter$ListKecamatanAdapterVH7.n.setVisibility(0);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH8 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH8);
                listKecamatanAdapter$ListKecamatanAdapterVH8.d.setText(tarikanReservasiUbahTransaksiActivity.e);
                ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH9 = this.B;
                subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH9);
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = listKecamatanAdapter$ListKecamatanAdapterVH9.n;
                if (tarikanReservasiUbahTransaksiActivity.e.length() <= 0) {
                    z = false;
                }
                logoutDialog_ViewBinding.setHintEnabled(z);
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            subscribeReservationRescheduleEvent.e(layoutInflater, "");
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding d2 = ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.d(layoutInflater, viewGroup, false);
            this.c = d2;
            subscribeReservationRescheduleEvent.c(d2);
            this.C = d2.f;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding);
            this.m = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.a;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding2 = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding2);
            this.n = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding2.e;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding3 = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding3);
            this.r = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding3.b;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding4 = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding4);
            this.t = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding4.c;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding5 = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding5);
            this.w = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding5.i;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding6 = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding6);
            this.A = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding6.h;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding7 = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding7);
            ScrollView scrollView = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding7.j;
            subscribeReservationRescheduleEvent.d(scrollView, "");
            return scrollView;
        }

        @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
        public final void onDestroyView() {
            documentProvider.b().e(this);
            onDestroyView();
            this.c = null;
            this.a.clear();
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            boolean z5 = true;
            boolean z6 = true;
            boolean z7 = true;
            boolean z8 = true;
            boolean z9 = true;
            boolean z10 = true;
            boolean z11 = true;
            boolean z12 = true;
            boolean z13 = true;
            boolean z14 = true;
            boolean z15 = true;
            boolean z16 = true;
            boolean z17 = true;
            boolean z18 = true;
            boolean z19 = true;
            boolean z20 = true;
            boolean z21 = true;
            boolean z22 = true;
            boolean z23 = true;
            boolean z24 = true;
            boolean z25 = true;
            boolean z26 = true;
            boolean z27 = true;
            boolean z28 = true;
            boolean z29 = true;
            boolean z30 = true;
            boolean z31 = true;
            boolean z32 = true;
            boolean z33 = true;
            if (z) {
                subscribeReservationRescheduleEvent.c(view);
                int id = view.getId();
                switch (id) {
                    case 2131296936:
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH);
                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH.n.setHintEnabled(true);
                        return;
                    case 2131296937:
                        onUbah onubah = this.k;
                        subscribeReservationRescheduleEvent.c(onubah);
                        onubah.f175o.setHintEnabled(true);
                        return;
                    case 2131296938:
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding);
                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.k.setHintEnabled(true);
                        return;
                    case 2131296939:
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH);
                        listDetailTransaksiROAdapter$ListDetailTransaksiVH.m.setHintEnabled(true);
                        return;
                    case 2131296940:
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH.l.setHintEnabled(true);
                        return;
                    case 2131296941:
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding = this.u;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding);
                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.m.setHintEnabled(true);
                        return;
                    default:
                        switch (id) {
                            case 2131296955:
                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2 = this.h;
                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2);
                                listDetailOpenTransaksiAdapter$ListDetailTransaksiVH2.k.setHintEnabled(true);
                                return;
                            case 2131296956:
                                onUbah onubah2 = this.k;
                                subscribeReservationRescheduleEvent.c(onubah2);
                                onubah2.l.setHintEnabled(true);
                                return;
                            case 2131296957:
                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2 = this.l;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2);
                                listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding2.m.setHintEnabled(true);
                                return;
                            case 2131296958:
                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH2 = this.q;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH2);
                                listDetailTransaksiROAdapter$ListDetailTransaksiVH2.f109o.setHintEnabled(true);
                                return;
                            case 2131296959:
                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH2 = this.v;
                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH2);
                                listJenisMataUangAdapter$ListJenisMataUangAdapterVH2.k.setHintEnabled(true);
                                return;
                            default:
                                switch (id) {
                                    case 2131297057:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2);
                                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding2.k.setHintEnabled(true);
                                        return;
                                    case 2131297073:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3);
                                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding3.f112o.setHintEnabled(true);
                                        return;
                                    case 2131297095:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4);
                                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding4.n.setHintEnabled(true);
                                        return;
                                    case 2131297116:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5);
                                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding5.s.setHintEnabled(true);
                                        return;
                                    case 2131297130:
                                        ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH = this.B;
                                        subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH);
                                        listKecamatanAdapter$ListKecamatanAdapterVH.f.setHintEnabled(true);
                                        return;
                                    default:
                                        switch (id) {
                                            case 2131297067:
                                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3 = this.h;
                                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3);
                                                listDetailOpenTransaksiAdapter$ListDetailTransaksiVH3.q.setHintEnabled(true);
                                                return;
                                            case 2131297068:
                                                onUbah onubah3 = this.k;
                                                subscribeReservationRescheduleEvent.c(onubah3);
                                                onubah3.t.setHintEnabled(true);
                                                return;
                                            case 2131297069:
                                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3 = this.l;
                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3);
                                                listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding3.q.setHintEnabled(true);
                                                return;
                                            case 2131297070:
                                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH3 = this.q;
                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH3);
                                                listDetailTransaksiROAdapter$ListDetailTransaksiVH3.t.setHintEnabled(true);
                                                return;
                                            case 2131297071:
                                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH3 = this.v;
                                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH3);
                                                listJenisMataUangAdapter$ListJenisMataUangAdapterVH3.q.setHintEnabled(true);
                                                return;
                                            default:
                                                switch (id) {
                                                    case 2131297109:
                                                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4 = this.h;
                                                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4);
                                                        listDetailOpenTransaksiAdapter$ListDetailTransaksiVH4.t.setHintEnabled(true);
                                                        return;
                                                    case 2131297110:
                                                        onUbah onubah4 = this.k;
                                                        subscribeReservationRescheduleEvent.c(onubah4);
                                                        onubah4.q.setHintEnabled(true);
                                                        return;
                                                    case 2131297111:
                                                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4 = this.l;
                                                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4);
                                                        listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding4.s.setHintEnabled(true);
                                                        return;
                                                    case 2131297112:
                                                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH4 = this.q;
                                                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH4);
                                                        listDetailTransaksiROAdapter$ListDetailTransaksiVH4.s.setHintEnabled(true);
                                                        return;
                                                    case 2131297113:
                                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH4 = this.v;
                                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH4);
                                                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH4.t.setHintEnabled(true);
                                                        return;
                                                    case 2131297114:
                                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6 = this.u;
                                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6);
                                                        listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding6.t.setHintEnabled(true);
                                                        return;
                                                    default:
                                                        switch (id) {
                                                            case 2131297120:
                                                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5 = this.h;
                                                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5);
                                                                listDetailOpenTransaksiAdapter$ListDetailTransaksiVH5.s.setHintEnabled(true);
                                                                return;
                                                            case 2131297121:
                                                                onUbah onubah5 = this.k;
                                                                subscribeReservationRescheduleEvent.c(onubah5);
                                                                onubah5.s.setHintEnabled(true);
                                                                return;
                                                            case 2131297122:
                                                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5 = this.l;
                                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5);
                                                                listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding5.t.setHintEnabled(true);
                                                                return;
                                                            case 2131297123:
                                                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH5 = this.q;
                                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH5);
                                                                listDetailTransaksiROAdapter$ListDetailTransaksiVH5.p.setHintEnabled(true);
                                                                return;
                                                            case 2131297124:
                                                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH5 = this.v;
                                                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH5);
                                                                listJenisMataUangAdapter$ListJenisMataUangAdapterVH5.r.setHintEnabled(true);
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                subscribeReservationRescheduleEvent.c(view);
                int id2 = view.getId();
                switch (id2) {
                    case 2131296936:
                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6 = this.h;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6);
                        if (listDetailOpenTransaksiAdapter$ListDetailTransaksiVH6.b.getText().toString().length() != 0) {
                            z6 = false;
                        }
                        if (z6) {
                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7 = this.h;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7);
                            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH7.n.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131296937:
                        onUbah onubah6 = this.k;
                        subscribeReservationRescheduleEvent.c(onubah6);
                        if (onubah6.a.getText().toString().length() != 0) {
                            z5 = false;
                        }
                        if (z5) {
                            onUbah onubah7 = this.k;
                            subscribeReservationRescheduleEvent.c(onubah7);
                            onubah7.f175o.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131296938:
                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6 = this.l;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6);
                        if (listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding6.e.getText().toString().length() != 0) {
                            z4 = false;
                        }
                        if (z4) {
                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7 = this.l;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7);
                            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding7.k.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131296939:
                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH6 = this.q;
                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH6);
                        if (listDetailTransaksiROAdapter$ListDetailTransaksiVH6.c.getText().toString().length() != 0) {
                            z3 = false;
                        }
                        if (z3) {
                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH7 = this.q;
                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH7);
                            listDetailTransaksiROAdapter$ListDetailTransaksiVH7.m.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131296940:
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH6 = this.v;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH6);
                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH6.e.getText().toString().length() != 0) {
                            z2 = false;
                        }
                        if (z2) {
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH7 = this.v;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH7);
                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH7.l.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131296941:
                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7 = this.u;
                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7);
                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding7.e.getText().toString().length() != 0) {
                            z33 = false;
                        }
                        if (z33) {
                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8 = this.u;
                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8);
                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding8.m.setHintEnabled(false);
                            return;
                        }
                        return;
                    default:
                        switch (id2) {
                            case 2131296955:
                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8 = this.h;
                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8);
                                if (listDetailOpenTransaksiAdapter$ListDetailTransaksiVH8.c.getText().toString().length() != 0) {
                                    z11 = false;
                                }
                                if (z11) {
                                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9 = this.h;
                                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9);
                                    listDetailOpenTransaksiAdapter$ListDetailTransaksiVH9.k.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131296956:
                                onUbah onubah8 = this.k;
                                subscribeReservationRescheduleEvent.c(onubah8);
                                if (onubah8.e.getText().toString().length() != 0) {
                                    z10 = false;
                                }
                                if (z10) {
                                    onUbah onubah9 = this.k;
                                    subscribeReservationRescheduleEvent.c(onubah9);
                                    onubah9.l.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131296957:
                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8 = this.l;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8);
                                if (listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding8.a.getText().toString().length() != 0) {
                                    z9 = false;
                                }
                                if (z9) {
                                    ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9 = this.l;
                                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9);
                                    listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding9.m.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131296958:
                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH8 = this.q;
                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH8);
                                if (listDetailTransaksiROAdapter$ListDetailTransaksiVH8.b.getText().toString().length() != 0) {
                                    z8 = false;
                                }
                                if (z8) {
                                    ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH9 = this.q;
                                    subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH9);
                                    listDetailTransaksiROAdapter$ListDetailTransaksiVH9.f109o.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131296959:
                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH8 = this.v;
                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH8);
                                if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH8.b.getText().toString().length() != 0) {
                                    z7 = false;
                                }
                                if (z7) {
                                    ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH9 = this.v;
                                    subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH9);
                                    listJenisMataUangAdapter$ListJenisMataUangAdapterVH9.k.setHintEnabled(false);
                                    return;
                                }
                                return;
                            default:
                                switch (id2) {
                                    case 2131297057:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9);
                                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding9.a.getText().toString().length() != 0) {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10 = this.u;
                                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10);
                                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding10.k.setHintEnabled(false);
                                            return;
                                        }
                                        return;
                                    case 2131297073:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11);
                                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding11.d.getText().toString().length() != 0) {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12 = this.u;
                                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12);
                                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding12.f112o.setHintEnabled(false);
                                            return;
                                        }
                                        return;
                                    case 2131297095:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13);
                                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding13.c.getText().toString().length() != 0) {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14 = this.u;
                                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14);
                                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding14.n.setHintEnabled(false);
                                            return;
                                        }
                                        return;
                                    case 2131297116:
                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15 = this.u;
                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15);
                                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding15.f.getText().toString().length() != 0) {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16 = this.u;
                                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16);
                                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding16.s.setHintEnabled(false);
                                            return;
                                        }
                                        return;
                                    case 2131297130:
                                        ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH2 = this.B;
                                        subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH2);
                                        if (listKecamatanAdapter$ListKecamatanAdapterVH2.a.getText().toString().length() != 0) {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            ListKecamatanAdapter$ListKecamatanAdapterVH listKecamatanAdapter$ListKecamatanAdapterVH3 = this.B;
                                            subscribeReservationRescheduleEvent.c(listKecamatanAdapter$ListKecamatanAdapterVH3);
                                            listKecamatanAdapter$ListKecamatanAdapterVH3.f.setHintEnabled(false);
                                            return;
                                        }
                                        return;
                                    default:
                                        switch (id2) {
                                            case 2131297067:
                                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10 = this.h;
                                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10);
                                                if (listDetailOpenTransaksiAdapter$ListDetailTransaksiVH10.i.getText().toString().length() != 0) {
                                                    z21 = false;
                                                }
                                                if (z21) {
                                                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11 = this.h;
                                                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11);
                                                    listDetailOpenTransaksiAdapter$ListDetailTransaksiVH11.q.setHintEnabled(false);
                                                    return;
                                                }
                                                return;
                                            case 2131297068:
                                                onUbah onubah10 = this.k;
                                                subscribeReservationRescheduleEvent.c(onubah10);
                                                if (onubah10.g.getText().toString().length() != 0) {
                                                    z20 = false;
                                                }
                                                if (z20) {
                                                    onUbah onubah11 = this.k;
                                                    subscribeReservationRescheduleEvent.c(onubah11);
                                                    onubah11.t.setHintEnabled(false);
                                                    return;
                                                }
                                                return;
                                            case 2131297069:
                                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10 = this.l;
                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10);
                                                if (listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding10.g.getText().toString().length() != 0) {
                                                    z19 = false;
                                                }
                                                if (z19) {
                                                    ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11 = this.l;
                                                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11);
                                                    listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding11.q.setHintEnabled(false);
                                                    return;
                                                }
                                                return;
                                            case 2131297070:
                                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH10 = this.q;
                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH10);
                                                if (listDetailTransaksiROAdapter$ListDetailTransaksiVH10.g.getText().toString().length() != 0) {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH11 = this.q;
                                                    subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH11);
                                                    listDetailTransaksiROAdapter$ListDetailTransaksiVH11.t.setHintEnabled(false);
                                                    return;
                                                }
                                                return;
                                            case 2131297071:
                                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH10 = this.v;
                                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH10);
                                                if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH10.h.getText().toString().length() != 0) {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH11 = this.v;
                                                    subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH11);
                                                    listJenisMataUangAdapter$ListJenisMataUangAdapterVH11.q.setHintEnabled(false);
                                                    return;
                                                }
                                                return;
                                            default:
                                                switch (id2) {
                                                    case 2131297109:
                                                        ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12 = this.h;
                                                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12);
                                                        if (listDetailOpenTransaksiAdapter$ListDetailTransaksiVH12.h.getText().toString().length() != 0) {
                                                            z27 = false;
                                                        }
                                                        if (z27) {
                                                            ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13 = this.h;
                                                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13);
                                                            listDetailOpenTransaksiAdapter$ListDetailTransaksiVH13.t.setHintEnabled(false);
                                                            return;
                                                        }
                                                        return;
                                                    case 2131297110:
                                                        onUbah onubah12 = this.k;
                                                        subscribeReservationRescheduleEvent.c(onubah12);
                                                        if (onubah12.f.getText().toString().length() != 0) {
                                                            z26 = false;
                                                        }
                                                        if (z26) {
                                                            onUbah onubah13 = this.k;
                                                            subscribeReservationRescheduleEvent.c(onubah13);
                                                            onubah13.q.setHintEnabled(false);
                                                            return;
                                                        }
                                                        return;
                                                    case 2131297111:
                                                        ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12 = this.l;
                                                        subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12);
                                                        if (listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding12.i.getText().toString().length() != 0) {
                                                            z25 = false;
                                                        }
                                                        if (z25) {
                                                            ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13 = this.l;
                                                            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13);
                                                            listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding13.s.setHintEnabled(false);
                                                            return;
                                                        }
                                                        return;
                                                    case 2131297112:
                                                        ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH12 = this.q;
                                                        subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH12);
                                                        if (listDetailTransaksiROAdapter$ListDetailTransaksiVH12.i.getText().toString().length() != 0) {
                                                            z24 = false;
                                                        }
                                                        if (z24) {
                                                            ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH13 = this.q;
                                                            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH13);
                                                            listDetailTransaksiROAdapter$ListDetailTransaksiVH13.s.setHintEnabled(false);
                                                            return;
                                                        }
                                                        return;
                                                    case 2131297113:
                                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH12 = this.v;
                                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH12);
                                                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH12.i.getText().toString().length() != 0) {
                                                            z23 = false;
                                                        }
                                                        if (z23) {
                                                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH13 = this.v;
                                                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH13);
                                                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH13.t.setHintEnabled(false);
                                                            return;
                                                        }
                                                        return;
                                                    case 2131297114:
                                                        ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17 = this.u;
                                                        subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17);
                                                        if (listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding17.b.getText().toString().length() != 0) {
                                                            z22 = false;
                                                        }
                                                        if (z22) {
                                                            ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18 = this.u;
                                                            subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18);
                                                            listJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding18.t.setHintEnabled(false);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        switch (id2) {
                                                            case 2131297120:
                                                                ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14 = this.h;
                                                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14);
                                                                if (String.valueOf(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH14.j.getText()).length() != 0) {
                                                                    z32 = false;
                                                                }
                                                                if (z32) {
                                                                    ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15 = this.h;
                                                                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15);
                                                                    listDetailOpenTransaksiAdapter$ListDetailTransaksiVH15.s.setHintEnabled(false);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2131297121:
                                                                onUbah onubah14 = this.k;
                                                                subscribeReservationRescheduleEvent.c(onubah14);
                                                                if (String.valueOf(onubah14.i.getText()).length() != 0) {
                                                                    z31 = false;
                                                                }
                                                                if (z31) {
                                                                    onUbah onubah15 = this.k;
                                                                    subscribeReservationRescheduleEvent.c(onubah15);
                                                                    onubah15.s.setHintEnabled(false);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2131297122:
                                                                ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14 = this.l;
                                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14);
                                                                if (String.valueOf(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding14.h.getText()).length() != 0) {
                                                                    z30 = false;
                                                                }
                                                                if (z30) {
                                                                    ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15 = this.l;
                                                                    subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15);
                                                                    listDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding15.t.setHintEnabled(false);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2131297123:
                                                                ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH14 = this.q;
                                                                subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH14);
                                                                if (String.valueOf(listDetailTransaksiROAdapter$ListDetailTransaksiVH14.j.getText()).length() != 0) {
                                                                    z29 = false;
                                                                }
                                                                if (z29) {
                                                                    ListDetailTransaksiROAdapter$ListDetailTransaksiVH listDetailTransaksiROAdapter$ListDetailTransaksiVH15 = this.q;
                                                                    subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH15);
                                                                    listDetailTransaksiROAdapter$ListDetailTransaksiVH15.p.setHintEnabled(false);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2131297124:
                                                                ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH14 = this.v;
                                                                subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH14);
                                                                if (String.valueOf(listJenisMataUangAdapter$ListJenisMataUangAdapterVH14.f.getText()).length() != 0) {
                                                                    z28 = false;
                                                                }
                                                                if (z28) {
                                                                    ListJenisMataUangAdapter$ListJenisMataUangAdapterVH listJenisMataUangAdapter$ListJenisMataUangAdapterVH15 = this.v;
                                                                    subscribeReservationRescheduleEvent.c(listJenisMataUangAdapter$ListJenisMataUangAdapterVH15);
                                                                    listJenisMataUangAdapter$ListJenisMataUangAdapterVH15.r.setHintEnabled(false);
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (b().h.getVisibility() == 0) {
                if (d().i.isFocused()) {
                    this.an = "DataPenerima1";
                    d().i.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView = d().i;
                    DetailTundaCCActivity detailTundaCCActivity = this.D;
                    DetailTundaCCActivity detailTundaCCActivity2 = detailTundaCCActivity;
                    if (detailTundaCCActivity == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity2 = null;
                    }
                    autoCompleteTextView.setText(detailTundaCCActivity2.d(i).c());
                    try {
                        d().i.setSelection(d().i.length());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView2 = d().i;
                    DetailTundaCCActivity detailTundaCCActivity3 = this.D;
                    DetailTundaCCActivity detailTundaCCActivity4 = detailTundaCCActivity3;
                    if (detailTundaCCActivity3 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity4 = null;
                    }
                    autoCompleteTextView2.setAdapter(detailTundaCCActivity4);
                    DetailTundaCCActivity detailTundaCCActivity5 = this.D;
                    DetailTundaCCActivity detailTundaCCActivity6 = detailTundaCCActivity5;
                    if (detailTundaCCActivity5 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity6 = null;
                    }
                    this.ao = detailTundaCCActivity6.d(i);
                    AutoCompleteTextView autoCompleteTextView3 = d().h;
                    DetailTundaCCActivity detailTundaCCActivity7 = this.D;
                    DetailTundaCCActivity detailTundaCCActivity8 = detailTundaCCActivity7;
                    if (detailTundaCCActivity7 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity8 = null;
                    }
                    autoCompleteTextView3.setText(detailTundaCCActivity8.d(i).d());
                    try {
                        d().h.setSelection(d().h.length());
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    d().t.setHintEnabled(true);
                    EditText editText = d().b;
                    DetailTundaCCActivity detailTundaCCActivity9 = this.D;
                    DetailTundaCCActivity detailTundaCCActivity10 = detailTundaCCActivity9;
                    if (detailTundaCCActivity9 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity10 = null;
                    }
                    editText.setText(detailTundaCCActivity10.d(i).a());
                    d().b.setSelection(d().b.length());
                    d().n.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity11 = this.D;
                    DetailTundaCCActivity detailTundaCCActivity12 = detailTundaCCActivity11;
                    if (detailTundaCCActivity11 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity12 = null;
                    }
                    String b = detailTundaCCActivity12.d(i).b();
                    if (b != null) {
                        switch (b.hashCode()) {
                            case 49:
                                if (b.equals("1")) {
                                    d().f103o.setText("Perorangan");
                                    d().f103o.setTag("1");
                                    break;
                                }
                                break;
                            case 50:
                                if (b.equals("2")) {
                                    d().f103o.setText("Perusahaan");
                                    d().f103o.setTag("2");
                                    break;
                                }
                                break;
                            case 51:
                                if (b.equals("3")) {
                                    d().f103o.setText("Pemerintah");
                                    d().f103o.setTag("3");
                                    break;
                                }
                                break;
                        }
                    }
                    d().f103o.setSelection(d().f103o.length());
                    d().v.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity13 = this.D;
                    DetailTundaCCActivity detailTundaCCActivity14 = detailTundaCCActivity13;
                    if (detailTundaCCActivity13 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity14 = null;
                    }
                    String h = detailTundaCCActivity14.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h, (Object) "R")) {
                        d().g.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h, (Object) "N")) {
                        d().g.setText("Non Penduduk");
                    }
                    d().g.setSelection(d().g.length());
                    d().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity15 = this.D;
                    DetailTundaCCActivity detailTundaCCActivity16 = detailTundaCCActivity15;
                    if (detailTundaCCActivity15 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity16 = null;
                    }
                    String e4 = detailTundaCCActivity16.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e4, (Object) "1")) {
                        d().f.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e4, (Object) "2")) {
                        d().f.setText("WNA");
                    }
                } else if (d().h.isFocused()) {
                    this.an = "DataPenerima1";
                    d().h.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView4 = d().h;
                    DetailTundaCCActivity detailTundaCCActivity17 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity18 = detailTundaCCActivity17;
                    if (detailTundaCCActivity17 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity18 = null;
                    }
                    autoCompleteTextView4.setText(detailTundaCCActivity18.d(i).d());
                    try {
                        d().h.setSelection(d().h.length());
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView5 = d().h;
                    DetailTundaCCActivity detailTundaCCActivity19 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity20 = detailTundaCCActivity19;
                    if (detailTundaCCActivity19 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity20 = null;
                    }
                    autoCompleteTextView5.setAdapter(detailTundaCCActivity20);
                    DetailTundaCCActivity detailTundaCCActivity21 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity22 = detailTundaCCActivity21;
                    if (detailTundaCCActivity21 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity22 = null;
                    }
                    this.ao = detailTundaCCActivity22.d(i);
                    AutoCompleteTextView autoCompleteTextView6 = d().i;
                    DetailTundaCCActivity detailTundaCCActivity23 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity24 = detailTundaCCActivity23;
                    if (detailTundaCCActivity23 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity24 = null;
                    }
                    autoCompleteTextView6.setText(detailTundaCCActivity24.d(i).c());
                    try {
                        d().i.setSelection(d().i.length());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    d().q.setHintEnabled(true);
                    EditText editText2 = d().b;
                    DetailTundaCCActivity detailTundaCCActivity25 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity26 = detailTundaCCActivity25;
                    if (detailTundaCCActivity25 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity26 = null;
                    }
                    editText2.setText(detailTundaCCActivity26.d(i).a());
                    d().b.setSelection(d().b.length());
                    d().n.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity27 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity28 = detailTundaCCActivity27;
                    if (detailTundaCCActivity27 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity28 = null;
                    }
                    String b2 = detailTundaCCActivity28.d(i).b();
                    if (b2 != null) {
                        switch (b2.hashCode()) {
                            case 49:
                                if (b2.equals("1")) {
                                    d().f103o.setText("Perorangan");
                                    d().f103o.setTag("1");
                                    break;
                                }
                                break;
                            case 50:
                                if (b2.equals("2")) {
                                    d().f103o.setText("Perusahaan");
                                    d().f103o.setTag("2");
                                    break;
                                }
                                break;
                            case 51:
                                if (b2.equals("3")) {
                                    d().f103o.setText("Pemerintah");
                                    d().f103o.setTag("3");
                                    break;
                                }
                                break;
                        }
                    }
                    d().f103o.setSelection(d().f103o.length());
                    d().v.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity29 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity30 = detailTundaCCActivity29;
                    if (detailTundaCCActivity29 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity30 = null;
                    }
                    String h2 = detailTundaCCActivity30.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h2, (Object) "R")) {
                        d().g.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h2, (Object) "N")) {
                        d().g.setText("Non Penduduk");
                    }
                    d().g.setSelection(d().g.length());
                    d().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity31 = this.G;
                    DetailTundaCCActivity detailTundaCCActivity32 = detailTundaCCActivity31;
                    if (detailTundaCCActivity31 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity32 = null;
                    }
                    String e7 = detailTundaCCActivity32.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e7, (Object) "1")) {
                        d().f.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e7, (Object) "2")) {
                        d().f.setText("WNA");
                    }
                }
            }
            if (a().i.getVisibility() == 0) {
                if (c().g.isFocused()) {
                    this.an = "DataPenerima2";
                    c().g.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView7 = c().g;
                    DetailTundaCCActivity detailTundaCCActivity33 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity34 = detailTundaCCActivity33;
                    if (detailTundaCCActivity33 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity34 = null;
                    }
                    autoCompleteTextView7.setText(detailTundaCCActivity34.d(i).c());
                    try {
                        c().g.setSelection(c().g.length());
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView8 = c().g;
                    DetailTundaCCActivity detailTundaCCActivity35 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity36 = detailTundaCCActivity35;
                    if (detailTundaCCActivity35 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity36 = null;
                    }
                    autoCompleteTextView8.setAdapter(detailTundaCCActivity36);
                    DetailTundaCCActivity detailTundaCCActivity37 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity38 = detailTundaCCActivity37;
                    if (detailTundaCCActivity37 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity38 = null;
                    }
                    this.ao = detailTundaCCActivity38.d(i);
                    AutoCompleteTextView autoCompleteTextView9 = c().f;
                    DetailTundaCCActivity detailTundaCCActivity39 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity40 = detailTundaCCActivity39;
                    if (detailTundaCCActivity39 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity40 = null;
                    }
                    autoCompleteTextView9.setText(detailTundaCCActivity40.d(i).d());
                    try {
                        c().f.setSelection(c().f.length());
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    c().q.setHintEnabled(true);
                    EditText editText3 = c().a;
                    DetailTundaCCActivity detailTundaCCActivity41 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity42 = detailTundaCCActivity41;
                    if (detailTundaCCActivity41 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity42 = null;
                    }
                    editText3.setText(detailTundaCCActivity42.d(i).a());
                    c().a.setSelection(c().a.length());
                    c().f175o.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity43 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity44 = detailTundaCCActivity43;
                    if (detailTundaCCActivity43 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity44 = null;
                    }
                    String b3 = detailTundaCCActivity44.d(i).b();
                    if (b3 != null) {
                        switch (b3.hashCode()) {
                            case 49:
                                if (b3.equals("1")) {
                                    c().m.setText("Perorangan");
                                    c().m.setTag("2");
                                    break;
                                }
                                break;
                            case 50:
                                if (b3.equals("2")) {
                                    c().m.setText("Perusahaan");
                                    c().m.setTag("2");
                                    break;
                                }
                                break;
                            case 51:
                                if (b3.equals("3")) {
                                    c().m.setText("Pemerintah");
                                    c().m.setTag("3");
                                    break;
                                }
                                break;
                        }
                    }
                    c().m.setSelection(c().m.length());
                    c().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity45 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity46 = detailTundaCCActivity45;
                    if (detailTundaCCActivity45 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity46 = null;
                    }
                    String h3 = detailTundaCCActivity46.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h3, (Object) "R")) {
                        c().h.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h3, (Object) "N")) {
                        c().h.setText("Non Penduduk");
                    }
                    c().h.setSelection(c().h.length());
                    c().w.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity47 = this.I;
                    DetailTundaCCActivity detailTundaCCActivity48 = detailTundaCCActivity47;
                    if (detailTundaCCActivity47 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity48 = null;
                    }
                    String e10 = detailTundaCCActivity48.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e10, (Object) "1")) {
                        c().j.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e10, (Object) "2")) {
                        c().j.setText("WNA");
                    }
                } else if (c().f.isFocused()) {
                    this.an = "DataPenerima2";
                    c().f.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView10 = c().f;
                    DetailTundaCCActivity detailTundaCCActivity49 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity50 = detailTundaCCActivity49;
                    if (detailTundaCCActivity49 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity50 = null;
                    }
                    autoCompleteTextView10.setText(detailTundaCCActivity50.d(i).d());
                    try {
                        c().f.setSelection(c().f.length());
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView11 = c().f;
                    DetailTundaCCActivity detailTundaCCActivity51 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity52 = detailTundaCCActivity51;
                    if (detailTundaCCActivity51 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity52 = null;
                    }
                    autoCompleteTextView11.setAdapter(detailTundaCCActivity52);
                    DetailTundaCCActivity detailTundaCCActivity53 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity54 = detailTundaCCActivity53;
                    if (detailTundaCCActivity53 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity54 = null;
                    }
                    this.ao = detailTundaCCActivity54.d(i);
                    AutoCompleteTextView autoCompleteTextView12 = c().g;
                    DetailTundaCCActivity detailTundaCCActivity55 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity56 = detailTundaCCActivity55;
                    if (detailTundaCCActivity55 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity56 = null;
                    }
                    autoCompleteTextView12.setText(detailTundaCCActivity56.d(i).c());
                    try {
                        c().g.setSelection(c().g.length());
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    c().t.setHintEnabled(true);
                    EditText editText4 = c().a;
                    DetailTundaCCActivity detailTundaCCActivity57 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity58 = detailTundaCCActivity57;
                    if (detailTundaCCActivity57 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity58 = null;
                    }
                    editText4.setText(detailTundaCCActivity58.d(i).a());
                    c().a.setSelection(c().a.length());
                    c().f175o.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity59 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity60 = detailTundaCCActivity59;
                    if (detailTundaCCActivity59 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity60 = null;
                    }
                    String b4 = detailTundaCCActivity60.d(i).b();
                    if (b4 != null) {
                        switch (b4.hashCode()) {
                            case 49:
                                if (b4.equals("1")) {
                                    c().m.setText("Perorangan");
                                    c().m.setTag("2");
                                    break;
                                }
                                break;
                            case 50:
                                if (b4.equals("2")) {
                                    c().m.setText("Perusahaan");
                                    c().m.setTag("2");
                                    break;
                                }
                                break;
                            case 51:
                                if (b4.equals("3")) {
                                    c().m.setText("Pemerintah");
                                    c().m.setTag("3");
                                    break;
                                }
                                break;
                        }
                    }
                    c().m.setSelection(c().m.length());
                    c().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity61 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity62 = detailTundaCCActivity61;
                    if (detailTundaCCActivity61 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity62 = null;
                    }
                    String h4 = detailTundaCCActivity62.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h4, (Object) "R")) {
                        c().h.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h4, (Object) "N")) {
                        c().h.setText("Non Penduduk");
                    }
                    c().h.setSelection(c().h.length());
                    c().w.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity63 = this.M;
                    DetailTundaCCActivity detailTundaCCActivity64 = detailTundaCCActivity63;
                    if (detailTundaCCActivity63 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity64 = null;
                    }
                    String e13 = detailTundaCCActivity64.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e13, (Object) "1")) {
                        c().j.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e13, (Object) "2")) {
                        c().j.setText("WNA");
                    }
                }
            }
            if (m().g.getVisibility() == 0) {
                if (j().g.isFocused()) {
                    this.an = "DataPenerima3";
                    j().g.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView13 = j().g;
                    DetailTundaCCActivity detailTundaCCActivity65 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity66 = detailTundaCCActivity65;
                    if (detailTundaCCActivity65 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity66 = null;
                    }
                    autoCompleteTextView13.setText(detailTundaCCActivity66.d(i).c());
                    try {
                        j().g.setSelection(j().g.length());
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView14 = j().g;
                    DetailTundaCCActivity detailTundaCCActivity67 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity68 = detailTundaCCActivity67;
                    if (detailTundaCCActivity67 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity68 = null;
                    }
                    autoCompleteTextView14.setAdapter(detailTundaCCActivity68);
                    DetailTundaCCActivity detailTundaCCActivity69 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity70 = detailTundaCCActivity69;
                    if (detailTundaCCActivity69 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity70 = null;
                    }
                    this.ao = detailTundaCCActivity70.d(i);
                    AutoCompleteTextView autoCompleteTextView15 = j().i;
                    DetailTundaCCActivity detailTundaCCActivity71 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity72 = detailTundaCCActivity71;
                    if (detailTundaCCActivity71 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity72 = null;
                    }
                    autoCompleteTextView15.setText(detailTundaCCActivity72.d(i).d());
                    try {
                        j().i.setSelection(j().i.length());
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                    j().s.setHintEnabled(true);
                    EditText editText5 = j().e;
                    DetailTundaCCActivity detailTundaCCActivity73 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity74 = detailTundaCCActivity73;
                    if (detailTundaCCActivity73 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity74 = null;
                    }
                    editText5.setText(detailTundaCCActivity74.d(i).a());
                    j().e.setSelection(j().e.length());
                    j().k.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity75 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity76 = detailTundaCCActivity75;
                    if (detailTundaCCActivity75 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity76 = null;
                    }
                    String b5 = detailTundaCCActivity76.d(i).b();
                    if (b5 != null) {
                        switch (b5.hashCode()) {
                            case 49:
                                if (b5.equals("1")) {
                                    j().f106o.setText("Perorangan");
                                    j().f106o.setTag("3");
                                    break;
                                }
                                break;
                            case 50:
                                if (b5.equals("2")) {
                                    j().f106o.setText("Perusahaan");
                                    j().f106o.setTag("3");
                                    break;
                                }
                                break;
                            case 51:
                                if (b5.equals("3")) {
                                    j().f106o.setText("Pemerintah");
                                    j().f106o.setTag("3");
                                    break;
                                }
                                break;
                        }
                    }
                    j().f106o.setSelection(j().f106o.length());
                    j().x.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity77 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity78 = detailTundaCCActivity77;
                    if (detailTundaCCActivity77 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity78 = null;
                    }
                    String h5 = detailTundaCCActivity78.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h5, (Object) "R")) {
                        j().f.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h5, (Object) "N")) {
                        j().f.setText("Non Penduduk");
                    }
                    j().f.setSelection(j().f.length());
                    j().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity79 = this.E;
                    DetailTundaCCActivity detailTundaCCActivity80 = detailTundaCCActivity79;
                    if (detailTundaCCActivity79 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity80 = null;
                    }
                    String e16 = detailTundaCCActivity80.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e16, (Object) "1")) {
                        j().j.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e16, (Object) "2")) {
                        j().j.setText("WNA");
                    }
                } else if (j().i.isFocused()) {
                    this.an = "DataPenerima3";
                    j().i.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView16 = j().i;
                    DetailTundaCCActivity detailTundaCCActivity81 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity82 = detailTundaCCActivity81;
                    if (detailTundaCCActivity81 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity82 = null;
                    }
                    autoCompleteTextView16.setText(detailTundaCCActivity82.d(i).d());
                    try {
                        j().i.setSelection(j().i.length());
                    } catch (Exception e17) {
                        e17.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView17 = j().i;
                    DetailTundaCCActivity detailTundaCCActivity83 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity84 = detailTundaCCActivity83;
                    if (detailTundaCCActivity83 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity84 = null;
                    }
                    autoCompleteTextView17.setAdapter(detailTundaCCActivity84);
                    DetailTundaCCActivity detailTundaCCActivity85 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity86 = detailTundaCCActivity85;
                    if (detailTundaCCActivity85 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity86 = null;
                    }
                    this.ao = detailTundaCCActivity86.d(i);
                    AutoCompleteTextView autoCompleteTextView18 = j().g;
                    DetailTundaCCActivity detailTundaCCActivity87 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity88 = detailTundaCCActivity87;
                    if (detailTundaCCActivity87 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity88 = null;
                    }
                    autoCompleteTextView18.setText(detailTundaCCActivity88.d(i).c());
                    try {
                        j().g.setSelection(j().g.length());
                    } catch (Exception e18) {
                        e18.printStackTrace();
                    }
                    j().q.setHintEnabled(true);
                    EditText editText6 = j().e;
                    DetailTundaCCActivity detailTundaCCActivity89 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity90 = detailTundaCCActivity89;
                    if (detailTundaCCActivity89 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity90 = null;
                    }
                    editText6.setText(detailTundaCCActivity90.d(i).a());
                    j().e.setSelection(j().e.length());
                    j().k.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity91 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity92 = detailTundaCCActivity91;
                    if (detailTundaCCActivity91 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity92 = null;
                    }
                    String b6 = detailTundaCCActivity92.d(i).b();
                    if (b6 != null) {
                        switch (b6.hashCode()) {
                            case 49:
                                if (b6.equals("1")) {
                                    j().f106o.setText("Perorangan");
                                    j().f106o.setTag("3");
                                    break;
                                }
                                break;
                            case 50:
                                if (b6.equals("2")) {
                                    j().f106o.setText("Perusahaan");
                                    j().f106o.setTag("3");
                                    break;
                                }
                                break;
                            case 51:
                                if (b6.equals("3")) {
                                    j().f106o.setText("Pemerintah");
                                    j().f106o.setTag("3");
                                    break;
                                }
                                break;
                        }
                    }
                    j().f106o.setSelection(j().f106o.length());
                    j().x.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity93 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity94 = detailTundaCCActivity93;
                    if (detailTundaCCActivity93 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity94 = null;
                    }
                    String h6 = detailTundaCCActivity94.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h6, (Object) "R")) {
                        j().f.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h6, (Object) "N")) {
                        j().f.setText("Non Penduduk");
                    }
                    j().f.setSelection(j().f.length());
                    j().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity95 = this.N;
                    DetailTundaCCActivity detailTundaCCActivity96 = detailTundaCCActivity95;
                    if (detailTundaCCActivity95 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity96 = null;
                    }
                    String e19 = detailTundaCCActivity96.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e19, (Object) "1")) {
                        j().j.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e19, (Object) "2")) {
                        j().j.setText("WNA");
                    }
                }
            }
            if (o().j.getVisibility() == 0) {
                if (k().g.isFocused()) {
                    this.an = "DataPenerima4";
                    k().g.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView19 = k().g;
                    DetailTundaCCActivity detailTundaCCActivity97 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity98 = detailTundaCCActivity97;
                    if (detailTundaCCActivity97 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity98 = null;
                    }
                    autoCompleteTextView19.setText(detailTundaCCActivity98.d(i).c());
                    try {
                        k().g.setSelection(k().g.length());
                    } catch (Exception e20) {
                        e20.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView20 = k().g;
                    DetailTundaCCActivity detailTundaCCActivity99 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity100 = detailTundaCCActivity99;
                    if (detailTundaCCActivity99 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity100 = null;
                    }
                    autoCompleteTextView20.setAdapter(detailTundaCCActivity100);
                    DetailTundaCCActivity detailTundaCCActivity101 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity102 = detailTundaCCActivity101;
                    if (detailTundaCCActivity101 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity102 = null;
                    }
                    this.ao = detailTundaCCActivity102.d(i);
                    AutoCompleteTextView autoCompleteTextView21 = k().i;
                    DetailTundaCCActivity detailTundaCCActivity103 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity104 = detailTundaCCActivity103;
                    if (detailTundaCCActivity103 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity104 = null;
                    }
                    autoCompleteTextView21.setText(detailTundaCCActivity104.d(i).d());
                    try {
                        k().i.setSelection(k().i.length());
                    } catch (Exception e21) {
                        e21.printStackTrace();
                    }
                    k().s.setHintEnabled(true);
                    EditText editText7 = k().c;
                    DetailTundaCCActivity detailTundaCCActivity105 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity106 = detailTundaCCActivity105;
                    if (detailTundaCCActivity105 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity106 = null;
                    }
                    editText7.setText(detailTundaCCActivity106.d(i).a());
                    k().c.setSelection(k().c.length());
                    k().m.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity107 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity108 = detailTundaCCActivity107;
                    if (detailTundaCCActivity107 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity108 = null;
                    }
                    String b7 = detailTundaCCActivity108.d(i).b();
                    if (b7 != null) {
                        switch (b7.hashCode()) {
                            case 49:
                                if (b7.equals("1")) {
                                    k().k.setText("Perorangan");
                                    k().k.setTag("4");
                                    break;
                                }
                                break;
                            case 50:
                                if (b7.equals("2")) {
                                    k().k.setText("Perusahaan");
                                    k().k.setTag("4");
                                    break;
                                }
                                break;
                            case 51:
                                if (b7.equals("3")) {
                                    k().k.setText("Pemerintah");
                                    k().k.setTag("4");
                                    break;
                                }
                                break;
                        }
                    }
                    k().k.setSelection(k().k.length());
                    k().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity109 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity110 = detailTundaCCActivity109;
                    if (detailTundaCCActivity109 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity110 = null;
                    }
                    String h7 = detailTundaCCActivity110.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h7, (Object) "R")) {
                        k().h.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h7, (Object) "N")) {
                        k().h.setText("Non Penduduk");
                    }
                    k().h.setSelection(k().h.length());
                    k().w.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity111 = this.F;
                    DetailTundaCCActivity detailTundaCCActivity112 = detailTundaCCActivity111;
                    if (detailTundaCCActivity111 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity112 = null;
                    }
                    String e22 = detailTundaCCActivity112.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e22, (Object) "1")) {
                        k().f.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e22, (Object) "2")) {
                        k().f.setText("WNA");
                    }
                } else if (k().i.isFocused()) {
                    this.an = "DataPenerima4";
                    k().i.setAdapter(null);
                    AutoCompleteTextView autoCompleteTextView22 = k().i;
                    DetailTundaCCActivity detailTundaCCActivity113 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity114 = detailTundaCCActivity113;
                    if (detailTundaCCActivity113 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity114 = null;
                    }
                    autoCompleteTextView22.setText(detailTundaCCActivity114.d(i).d());
                    try {
                        k().i.setSelection(k().i.length());
                    } catch (Exception e23) {
                        e23.printStackTrace();
                    }
                    AutoCompleteTextView autoCompleteTextView23 = k().i;
                    DetailTundaCCActivity detailTundaCCActivity115 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity116 = detailTundaCCActivity115;
                    if (detailTundaCCActivity115 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity116 = null;
                    }
                    autoCompleteTextView23.setAdapter(detailTundaCCActivity116);
                    DetailTundaCCActivity detailTundaCCActivity117 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity118 = detailTundaCCActivity117;
                    if (detailTundaCCActivity117 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity118 = null;
                    }
                    this.ao = detailTundaCCActivity118.d(i);
                    AutoCompleteTextView autoCompleteTextView24 = k().g;
                    DetailTundaCCActivity detailTundaCCActivity119 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity120 = detailTundaCCActivity119;
                    if (detailTundaCCActivity119 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity120 = null;
                    }
                    autoCompleteTextView24.setText(detailTundaCCActivity120.d(i).c());
                    try {
                        k().g.setSelection(k().g.length());
                    } catch (Exception e24) {
                        e24.printStackTrace();
                    }
                    k().t.setHintEnabled(true);
                    EditText editText8 = k().c;
                    DetailTundaCCActivity detailTundaCCActivity121 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity122 = detailTundaCCActivity121;
                    if (detailTundaCCActivity121 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity122 = null;
                    }
                    editText8.setText(detailTundaCCActivity122.d(i).a());
                    k().c.setSelection(k().c.length());
                    k().m.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity123 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity124 = detailTundaCCActivity123;
                    if (detailTundaCCActivity123 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity124 = null;
                    }
                    String b8 = detailTundaCCActivity124.d(i).b();
                    if (b8 != null) {
                        switch (b8.hashCode()) {
                            case 49:
                                if (b8.equals("1")) {
                                    k().k.setText("Perorangan");
                                    k().k.setTag("4");
                                    break;
                                }
                                break;
                            case 50:
                                if (b8.equals("2")) {
                                    k().k.setText("Perusahaan");
                                    k().k.setTag("4");
                                    break;
                                }
                                break;
                            case 51:
                                if (b8.equals("3")) {
                                    k().k.setText("Pemerintah");
                                    k().k.setTag("4");
                                    break;
                                }
                                break;
                        }
                    }
                    k().k.setSelection(k().k.length());
                    k().u.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity125 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity126 = detailTundaCCActivity125;
                    if (detailTundaCCActivity125 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity126 = null;
                    }
                    String h8 = detailTundaCCActivity126.d(i).h();
                    if (subscribeReservationRescheduleEvent.b((Object) h8, (Object) "R")) {
                        k().h.setText("Penduduk");
                    } else if (subscribeReservationRescheduleEvent.b((Object) h8, (Object) "N")) {
                        k().h.setText("Non Penduduk");
                    }
                    k().h.setSelection(k().h.length());
                    k().w.setHintEnabled(true);
                    DetailTundaCCActivity detailTundaCCActivity127 = this.L;
                    DetailTundaCCActivity detailTundaCCActivity128 = detailTundaCCActivity127;
                    if (detailTundaCCActivity127 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        detailTundaCCActivity128 = null;
                    }
                    String e25 = detailTundaCCActivity128.d(i).e();
                    if (subscribeReservationRescheduleEvent.b((Object) e25, (Object) "1")) {
                        k().f.setText("WNI");
                    } else if (subscribeReservationRescheduleEvent.b((Object) e25, (Object) "2")) {
                        k().f.setText("WNA");
                    }
                }
            }
            if (n().h.getVisibility() != 0) {
                return;
            }
            if (l().h.isFocused()) {
                this.an = "DataPenerima5";
                l().h.setAdapter(null);
                AutoCompleteTextView autoCompleteTextView25 = l().h;
                DetailTundaCCActivity detailTundaCCActivity129 = this.H;
                DetailTundaCCActivity detailTundaCCActivity130 = detailTundaCCActivity129;
                if (detailTundaCCActivity129 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity130 = null;
                }
                autoCompleteTextView25.setText(detailTundaCCActivity130.d(i).c());
                try {
                    l().h.setSelection(l().h.length());
                } catch (Exception e26) {
                    e26.printStackTrace();
                }
                AutoCompleteTextView autoCompleteTextView26 = l().h;
                DetailTundaCCActivity detailTundaCCActivity131 = this.H;
                DetailTundaCCActivity detailTundaCCActivity132 = detailTundaCCActivity131;
                if (detailTundaCCActivity131 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity132 = null;
                }
                autoCompleteTextView26.setAdapter(detailTundaCCActivity132);
                DetailTundaCCActivity detailTundaCCActivity133 = this.H;
                DetailTundaCCActivity detailTundaCCActivity134 = detailTundaCCActivity133;
                if (detailTundaCCActivity133 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity134 = null;
                }
                this.ao = detailTundaCCActivity134.d(i);
                AutoCompleteTextView autoCompleteTextView27 = l().i;
                DetailTundaCCActivity detailTundaCCActivity135 = this.H;
                DetailTundaCCActivity detailTundaCCActivity136 = detailTundaCCActivity135;
                if (detailTundaCCActivity135 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity136 = null;
                }
                autoCompleteTextView27.setText(detailTundaCCActivity136.d(i).d());
                try {
                    l().i.setSelection(l().i.length());
                } catch (Exception e27) {
                    e27.printStackTrace();
                }
                l().t.setHintEnabled(true);
                EditText editText9 = l().e;
                DetailTundaCCActivity detailTundaCCActivity137 = this.H;
                DetailTundaCCActivity detailTundaCCActivity138 = detailTundaCCActivity137;
                if (detailTundaCCActivity137 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity138 = null;
                }
                editText9.setText(detailTundaCCActivity138.d(i).a());
                l().e.setSelection(l().e.length());
                l().l.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity139 = this.H;
                DetailTundaCCActivity detailTundaCCActivity140 = detailTundaCCActivity139;
                if (detailTundaCCActivity139 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity140 = null;
                }
                String b9 = detailTundaCCActivity140.d(i).b();
                if (b9 != null) {
                    switch (b9.hashCode()) {
                        case 49:
                            if (b9.equals("1")) {
                                l().n.setText("Perorangan");
                                l().n.setTag("5");
                                break;
                            }
                            break;
                        case 50:
                            if (b9.equals("2")) {
                                l().n.setText("Perusahaan");
                                l().n.setTag("5");
                                break;
                            }
                            break;
                        case 51:
                            if (b9.equals("3")) {
                                l().n.setText("Pemerintah");
                                l().n.setTag("5");
                                break;
                            }
                            break;
                    }
                }
                l().n.setSelection(l().n.length());
                l().y.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity141 = this.H;
                DetailTundaCCActivity detailTundaCCActivity142 = detailTundaCCActivity141;
                if (detailTundaCCActivity141 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity142 = null;
                }
                String h9 = detailTundaCCActivity142.d(i).h();
                if (subscribeReservationRescheduleEvent.b((Object) h9, (Object) "R")) {
                    l().g.setText("Penduduk");
                } else if (subscribeReservationRescheduleEvent.b((Object) h9, (Object) "N")) {
                    l().g.setText("Non Penduduk");
                }
                l().g.setSelection(l().g.length());
                l().x.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity143 = this.H;
                if (detailTundaCCActivity143 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity143 = null;
                }
                String e28 = detailTundaCCActivity143.d(i).e();
                if (subscribeReservationRescheduleEvent.b((Object) e28, (Object) "1")) {
                    l().j.setText("WNI");
                } else if (subscribeReservationRescheduleEvent.b((Object) e28, (Object) "2")) {
                    l().j.setText("WNA");
                }
            } else if (l().i.isFocused()) {
                this.an = "DataPenerima5";
                l().i.setAdapter(null);
                AutoCompleteTextView autoCompleteTextView28 = l().i;
                DetailTundaCCActivity detailTundaCCActivity144 = this.K;
                DetailTundaCCActivity detailTundaCCActivity145 = detailTundaCCActivity144;
                if (detailTundaCCActivity144 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity145 = null;
                }
                autoCompleteTextView28.setText(detailTundaCCActivity145.d(i).d());
                try {
                    l().i.setSelection(l().i.length());
                } catch (Exception e29) {
                    e29.printStackTrace();
                }
                AutoCompleteTextView autoCompleteTextView29 = l().i;
                DetailTundaCCActivity detailTundaCCActivity146 = this.K;
                DetailTundaCCActivity detailTundaCCActivity147 = detailTundaCCActivity146;
                if (detailTundaCCActivity146 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity147 = null;
                }
                autoCompleteTextView29.setAdapter(detailTundaCCActivity147);
                DetailTundaCCActivity detailTundaCCActivity148 = this.K;
                DetailTundaCCActivity detailTundaCCActivity149 = detailTundaCCActivity148;
                if (detailTundaCCActivity148 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity149 = null;
                }
                this.ao = detailTundaCCActivity149.d(i);
                AutoCompleteTextView autoCompleteTextView30 = l().h;
                DetailTundaCCActivity detailTundaCCActivity150 = this.K;
                DetailTundaCCActivity detailTundaCCActivity151 = detailTundaCCActivity150;
                if (detailTundaCCActivity150 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity151 = null;
                }
                autoCompleteTextView30.setText(detailTundaCCActivity151.d(i).c());
                try {
                    l().h.setSelection(l().h.length());
                } catch (Exception e30) {
                    e30.printStackTrace();
                }
                l().q.setHintEnabled(true);
                EditText editText10 = l().e;
                DetailTundaCCActivity detailTundaCCActivity152 = this.K;
                DetailTundaCCActivity detailTundaCCActivity153 = detailTundaCCActivity152;
                if (detailTundaCCActivity152 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity153 = null;
                }
                editText10.setText(detailTundaCCActivity153.d(i).a());
                l().e.setSelection(l().e.length());
                l().l.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity154 = this.K;
                DetailTundaCCActivity detailTundaCCActivity155 = detailTundaCCActivity154;
                if (detailTundaCCActivity154 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity155 = null;
                }
                String b10 = detailTundaCCActivity155.d(i).b();
                if (b10 != null) {
                    switch (b10.hashCode()) {
                        case 49:
                            if (b10.equals("1")) {
                                l().n.setText("Perorangan");
                                l().n.setTag("5");
                                break;
                            }
                            break;
                        case 50:
                            if (b10.equals("2")) {
                                l().n.setText("Perusahaan");
                                l().n.setTag("5");
                                break;
                            }
                            break;
                        case 51:
                            if (b10.equals("3")) {
                                l().n.setText("Pemerintah");
                                l().n.setTag("5");
                                break;
                            }
                            break;
                    }
                }
                l().n.setSelection(l().n.length());
                l().y.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity156 = this.K;
                DetailTundaCCActivity detailTundaCCActivity157 = detailTundaCCActivity156;
                if (detailTundaCCActivity156 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity157 = null;
                }
                String h10 = detailTundaCCActivity157.d(i).h();
                if (subscribeReservationRescheduleEvent.b((Object) h10, (Object) "R")) {
                    l().g.setText("Penduduk");
                } else if (subscribeReservationRescheduleEvent.b((Object) h10, (Object) "N")) {
                    l().g.setText("Non Penduduk");
                }
                l().g.setSelection(l().g.length());
                l().x.setHintEnabled(true);
                DetailTundaCCActivity detailTundaCCActivity158 = this.K;
                if (detailTundaCCActivity158 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    detailTundaCCActivity158 = null;
                }
                String e31 = detailTundaCCActivity158.d(i).e();
                if (subscribeReservationRescheduleEvent.b((Object) e31, (Object) "1")) {
                    l().j.setText("WNI");
                } else if (subscribeReservationRescheduleEvent.b((Object) e31, (Object) "2")) {
                    l().j.setText("WNA");
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            subscribeReservationRescheduleEvent.e(view, "");
            onViewCreated(view, bundle);
            documentProvider.b().c(this);
            BN7PengambilanUpdateReceiverActivity bN7PengambilanUpdateReceiverActivity = (BN7PengambilanUpdateReceiverActivity) getActivity();
            subscribeReservationRescheduleEvent.c(bN7PengambilanUpdateReceiverActivity);
            List<? extends DaftarTransferResponse.DaftarTransferOutput> list = bN7PengambilanUpdateReceiverActivity.k;
            this.X = list;
            if (list == null) {
                this.X = new ArrayList();
            }
            this.D = new DetailTundaCCActivity(getActivity(), this.X, 0);
            this.G = new DetailTundaCCActivity(getActivity(), this.X, 1);
            this.I = new DetailTundaCCActivity(getActivity(), this.X, 0);
            this.M = new DetailTundaCCActivity(getActivity(), this.X, 1);
            this.E = new DetailTundaCCActivity(getActivity(), this.X, 0);
            this.N = new DetailTundaCCActivity(getActivity(), this.X, 1);
            this.F = new DetailTundaCCActivity(getActivity(), this.X, 0);
            this.L = new DetailTundaCCActivity(getActivity(), this.X, 1);
            this.H = new DetailTundaCCActivity(getActivity(), this.X, 0);
            this.K = new DetailTundaCCActivity(getActivity(), this.X, 1);
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH = this.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH);
            listKodePosAdapter$ListKodePosAdapterVH.d.setOnClickListener(new View.OnClickListener() { // from class: o.getReceiverResidency
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.G(getReceiverAlias.this, view2);
                }
            });
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH2 = this.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH2);
            listKodePosAdapter$ListKodePosAdapterVH2.c.setOnClickListener(new View.OnClickListener() { // from class: o.getReceiverCountryName
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.d(getReceiverAlias.this, view2);
                }
            });
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH3 = this.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH3);
            listKodePosAdapter$ListKodePosAdapterVH3.g.setOnClickListener(new View.OnClickListener() { // from class: o.getTotalWarkat
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.O(getReceiverAlias.this, view2);
                }
            });
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH4 = this.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH4);
            listKodePosAdapter$ListKodePosAdapterVH4.j.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setAccountName
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.i(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListKodePosAdapter$ListKodePosAdapterVH listKodePosAdapter$ListKodePosAdapterVH5 = this.C;
            subscribeReservationRescheduleEvent.c(listKodePosAdapter$ListKodePosAdapterVH5);
            listKodePosAdapter$ListKodePosAdapterVH5.f.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setAdditionalBankInfo
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.b(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH = this.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH);
            listDetailTransaksiAdapter$ListDetailTransaksiVH.a.setOnClickListener(new View.OnClickListener() { // from class: o.setIbanAccountNumber
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.S(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH2 = this.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH2);
            listDetailTransaksiAdapter$ListDetailTransaksiVH2.d.setOnClickListener(new View.OnClickListener() { // from class: o.getRecurringEndDate
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.u(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH3 = this.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH3);
            listDetailTransaksiAdapter$ListDetailTransaksiVH3.f.setOnClickListener(new View.OnClickListener() { // from class: o.getReceiverName
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.y(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH4 = this.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH4);
            listDetailTransaksiAdapter$ListDetailTransaksiVH4.i.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setBankName
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.h(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailTransaksiVH listDetailTransaksiAdapter$ListDetailTransaksiVH5 = this.m;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailTransaksiVH5);
            listDetailTransaksiAdapter$ListDetailTransaksiVH5.h.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setBankCode
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.c(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH = this.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH.e.setOnClickListener(new View.OnClickListener() { // from class: o.getSenderNameKU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.w(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH2.c.setOnClickListener(new View.OnClickListener() { // from class: o.getSourceAccountOwnerType
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.R(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH3.h.setOnClickListener(new View.OnClickListener() { // from class: o.getTransactionNotes
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.Z(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4 = this.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH4.j.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setBankCodeType
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.d(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH listDetailTransaksiAdapter$ListDetailMultiTransaksiVH5 = this.n;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiAdapter$ListDetailMultiTransaksiVH5);
            listDetailTransaksiAdapter$ListDetailMultiTransaksiVH5.i.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setBankCity
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.l(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding = this.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding.d.setOnClickListener(new View.OnClickListener() { // from class: o.setLocalClearingCode
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.x(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2 = this.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding2.e.setOnClickListener(new View.OnClickListener() { // from class: o.setListWarkat
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.q(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3 = this.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding3.j.setOnClickListener(new View.OnClickListener() { // from class: o.getReceiverStates
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.E(getReceiverAlias.this, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4 = this.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding4.h.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setCountryCode
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.e(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding5 = this.r;
            subscribeReservationRescheduleEvent.c(listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding5);
            listDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding5.g.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setCodeword
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.n(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH = this.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH);
            listJabatanAdapter$ListJabatanVH.e.setOnClickListener(new View.OnClickListener() { // from class: o.getSenderCustomerType
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.W(getReceiverAlias.this, view2);
                }
            });
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH2 = this.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH2);
            listJabatanAdapter$ListJabatanVH2.b.setOnClickListener(new View.OnClickListener() { // from class: o.getWarkatDueDate
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.k(getReceiverAlias.this, view2);
                }
            });
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH3 = this.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH3);
            listJabatanAdapter$ListJabatanVH3.f.setOnClickListener(new View.OnClickListener() { // from class: o.setBankAddress
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.N(getReceiverAlias.this, view2);
                }
            });
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH4 = this.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH4);
            listJabatanAdapter$ListJabatanVH4.i.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setBankOfficeCode
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.a(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListJabatanAdapter$ListJabatanVH listJabatanAdapter$ListJabatanVH5 = this.t;
            subscribeReservationRescheduleEvent.c(listJabatanAdapter$ListJabatanVH5);
            listJabatanAdapter$ListJabatanVH5.j.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setBicCode
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.m(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH = this.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH);
            listKantorCabangAdapter$ListKantorCabangVH.b.setOnClickListener(new View.OnClickListener() { // from class: o.setFee
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.m(getReceiverAlias.this, view2);
                }
            });
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH2 = this.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH2);
            listKantorCabangAdapter$ListKantorCabangVH2.e.setOnClickListener(new View.OnClickListener() { // from class: o.setFlagDaftarSwift
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.p(getReceiverAlias.this, view2);
                }
            });
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH3 = this.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH3);
            listKantorCabangAdapter$ListKantorCabangVH3.f.setOnClickListener(new View.OnClickListener() { // from class: o.setFlagDaftarTransfer
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.r(getReceiverAlias.this, view2);
                }
            });
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH4 = this.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH4);
            listKantorCabangAdapter$ListKantorCabangVH4.j.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.getWarkatNumber
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.o(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListKantorCabangAdapter$ListKantorCabangVH listKantorCabangAdapter$ListKantorCabangVH5 = this.w;
            subscribeReservationRescheduleEvent.c(listKantorCabangAdapter$ListKantorCabangVH5);
            listKantorCabangAdapter$ListKantorCabangVH5.h.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setAccountNumber
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.j(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH = this.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH);
            listKelurahanAdapter$ListKelurahanAdapterVH.e.setOnClickListener(new View.OnClickListener() { // from class: o.getRtgs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.s(getReceiverAlias.this, view2);
                }
            });
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH2 = this.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH2);
            listKelurahanAdapter$ListKelurahanAdapterVH2.b.setOnClickListener(new View.OnClickListener() { // from class: o.getRecurringValue
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.o(getReceiverAlias.this, view2);
                }
            });
            BigDecimal bigDecimal = new BigDecimal(t().getTotalNominal());
            if (t().getAccType().equals("GIRO") || bigDecimal.compareTo(BigDecimal.valueOf(100000000L)) > 0) {
                ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH3 = this.A;
                subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH3);
                listKelurahanAdapter$ListKelurahanAdapterVH3.i.setVisibility(0);
            } else {
                ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH4 = this.A;
                subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH4);
                listKelurahanAdapter$ListKelurahanAdapterVH4.i.setVisibility(8);
            }
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH5 = this.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH5);
            listKelurahanAdapter$ListKelurahanAdapterVH5.i.setOnClickListener(new View.OnClickListener() { // from class: o.getRecurringVar
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.l(getReceiverAlias.this, view2);
                }
            });
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH6 = this.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH6);
            listKelurahanAdapter$ListKelurahanAdapterVH6.g.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setAddress2
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.g(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListKelurahanAdapter$ListKelurahanAdapterVH listKelurahanAdapter$ListKelurahanAdapterVH7 = this.A;
            subscribeReservationRescheduleEvent.c(listKelurahanAdapter$ListKelurahanAdapterVH7);
            listKelurahanAdapter$ListKelurahanAdapterVH7.f.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: o.setAddress
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view2) {
                    getReceiverAlias.f(getReceiverAlias.this, viewStub, view2);
                }
            });
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding = this.c;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding);
            listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.d.setOnClickListener(new View.OnClickListener() { // from class: o.setAmount
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    getReceiverAlias.D(getReceiverAlias.this, view2);
                }
            });
            b(t());
        }
    }
