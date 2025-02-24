package o;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.bca.smartbranch.presenter.AdminFeesPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import io.realm.ImportFlag;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.NomorRekeningBNAdapter$NomorRekeningBNVH;
import o.TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding;
import o.UbahSubMasterCardAdapter$ViewHolder;
import o.onClickDetail;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:o/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.class */
public final class TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding extends BaseFragmentKotlin implements View.OnFocusChangeListener, AdminFeesPresenter.read, DaftarTransferPresenter.RemoteActionCompatParcelizer {
    public Map<Integer, View> a = new LinkedHashMap();
    private onChoose d;
    private List<? extends EditText> e;
    private List<? extends LogoutDialog_ViewBinding> g;
    private List<? extends TextView> h;
    private final onChooseValueSumberPenghasilan l;
    private final onChooseValueSumberPenghasilan m;
    public static final TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver c = new TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    private static final String b = "BankTransferDataPengirimB";

    /* loaded from: classes-dex2jar.jar:o/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<DaftarTransferPresenter> {
        public static final IconCompatParcelizer d = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ DaftarTransferPresenter invoke() {
            return new DaftarTransferPresenter();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat() {
            super(1);
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this;
            String string = tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.getResources().getString(2131820584);
            subscribeReservationRescheduleEvent.d(string, "");
            tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.e(0, string);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat implements TextWatcher {
        public MediaMetadataCompat() {
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this;
            EditText editText = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.a(tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding).b;
            subscribeReservationRescheduleEvent.d(editText, "");
            tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b(editText);
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this.a().setNoTelpKontakPengirim(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.a(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this).b.getText().toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends ClickableSpan {
        RemoteActionCompatParcelizer() {
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this = r4;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            subscribeReservationRescheduleEvent.e(view, "");
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this.b(false);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$read.class */
    public static final class read implements TextWatcher {
        public read() {
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this;
            AutoCompleteTextView autoCompleteTextView = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.a(tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding).d;
            subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
            tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b(autoCompleteTextView);
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this.a().setNamaKontakPengirim(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.a(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this).d.getText().toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$write.class */
    public static final class write extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<AdminFeesPresenter> {
        public static final write d = new write();

        write() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ AdminFeesPresenter invoke() {
            return new AdminFeesPresenter();
        }
    }

    public TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding() {
        write write2 = write.d;
        subscribeReservationRescheduleEvent.e(write2, "");
        this.m = new Page6KLFragment_ViewBinding(write2, null, 2);
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.d;
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        this.l = new Page6KLFragment_ViewBinding(iconCompatParcelizer, null, 2);
    }

    public static final /* synthetic */ onChoose a(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding) {
        onChoose onchoose = tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.d;
        subscribeReservationRescheduleEvent.c(onchoose);
        return onchoose;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0262 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void b(o.TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding r7, android.view.View r8) {
        /*
        // Method dump skipped, instructions count: 611
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b(o.TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding, android.view.View):void");
    }

    public static /* synthetic */ void b(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding, Realm realm) {
        subscribeReservationRescheduleEvent.e(tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding, "");
        tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.g().setFlagContactKU(true);
        realm.copyToRealmOrUpdate((Realm) tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.g(), new ImportFlag[0]);
    }

    public final void b(boolean z) {
        Bundle bundle = new Bundle();
        NomorRekeningBNAdapter$NomorRekeningBNVH.RemoteActionCompatParcelizer remoteActionCompatParcelizer = NomorRekeningBNAdapter$NomorRekeningBNVH.b;
        bundle.putBoolean(NomorRekeningBNAdapter$NomorRekeningBNVH.e, z);
        NomorRekeningBNAdapter$NomorRekeningBNVH nomorRekeningBNAdapter$NomorRekeningBNVH = new NomorRekeningBNAdapter$NomorRekeningBNVH();
        nomorRekeningBNAdapter$NomorRekeningBNVH.setArguments(bundle);
        isDetached parentFragmentManager = getParentFragmentManager();
        NomorRekeningBNAdapter$NomorRekeningBNVH.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = NomorRekeningBNAdapter$NomorRekeningBNVH.b;
        nomorRekeningBNAdapter$NomorRekeningBNVH.show(parentFragmentManager, NomorRekeningBNAdapter$NomorRekeningBNVH.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void d(com.bca.smartbranch.data.localdb.BankTransfer r5) {
        /*
        // Method dump skipped, instructions count: 449
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.d(com.bca.smartbranch.data.localdb.BankTransfer):void");
    }

    public final BankTransfer a() {
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

    @Override // com.bca.smartbranch.presenter.AdminFeesPresenter.read
    public final void b() {
        h();
    }

    public final void b(EditText editText) {
        subscribeReservationRescheduleEvent.e(editText, "");
        List<? extends TextView> list = this.h;
        List<? extends EditText> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        List<? extends LogoutDialog_ViewBinding> list4 = this.g;
        List<? extends LogoutDialog_ViewBinding> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        List<? extends EditText> list6 = this.e;
        if (list6 == null) {
            subscribeReservationRescheduleEvent.e("");
        } else {
            list2 = list6;
        }
        getPromotion.b(list3, list5, list2, editText);
    }

    @Override // com.bca.smartbranch.presenter.AdminFeesPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
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

    @Override // com.bca.smartbranch.presenter.AdminFeesPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
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
        getView activity = getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            subscribeReservationRescheduleEvent.e(bankTransfer, "");
            bankTransfer.setNamaKontakPengirim("");
            bankTransfer.setNoHpKontakPengirim("");
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding = new TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding();
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.IconCompatParcelizer iconCompatParcelizer = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a;
            b(2131296811, transaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding, TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.e);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    @Override // com.bca.smartbranch.presenter.AdminFeesPresenter.read
    public final void d(onClickDetail onclickdetail) {
        List<onClickDetail.RemoteActionCompatParcelizer> list;
        if (!(onclickdetail == null || (list = onclickdetail.a) == null)) {
            ubahData ubahdata = (ubahData) requireActivity();
            List<onClickDetail.RemoteActionCompatParcelizer> list2 = list;
            subscribeReservationRescheduleEvent.e(list2, "");
            ArrayList arrayList = new ArrayList(list2);
            subscribeReservationRescheduleEvent.e(arrayList, "");
            ubahdata.n = arrayList;
        }
        f();
        if (((ubahData) requireActivity()).I() || ((ubahData) requireActivity()).q) {
            TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding = new TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding();
            Bundle bundle = new Bundle();
            bundle.putString("type", "add");
            bundle.putInt("position", 0);
            transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.setArguments(bundle);
            e(2131296811, transaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding, "BankTransferDataPenerima");
            return;
        }
        UbahSubMasterCardAdapter$ViewHolder ubahSubMasterCardAdapter$ViewHolder = new UbahSubMasterCardAdapter$ViewHolder();
        UbahSubMasterCardAdapter$ViewHolder.write write2 = UbahSubMasterCardAdapter$ViewHolder.e;
        e(2131296811, ubahSubMasterCardAdapter$ViewHolder, UbahSubMasterCardAdapter$ViewHolder.d);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.a.clear();
    }

    public final void e(int i, String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        List<? extends TextView> list = this.h;
        List<? extends LogoutDialog_ViewBinding> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        ((TextView) list3.get(i)).setVisibility(0);
        List<? extends TextView> list4 = this.h;
        List<? extends TextView> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        ((TextView) list5.get(i)).setText(str);
        list2 = this.g;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        ((LogoutDialog_ViewBinding) list2.get(i)).setBackgroundResource(2131230870);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        ((AdminFeesPresenter) this.m.d()).b(g());
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<? extends DaftarTransferResponse.DaftarTransferOutput> list) {
        subscribeReservationRescheduleEvent.e(list, "");
        ubahData ubahdata = (ubahData) getActivity();
        subscribeReservationRescheduleEvent.c(ubahdata);
        ubahdata.l = list;
        ((AdminFeesPresenter) this.m.d()).b(g());
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        ((AdminFeesPresenter) this.m.d()).b(g());
    }

    @Override // com.bca.smartbranch.presenter.AdminFeesPresenter.read
    public final void f(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.AdminFeesPresenter.read
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
        ((AdminFeesPresenter) this.m.d()).b(g());
    }

    @Override // com.bca.smartbranch.presenter.AdminFeesPresenter.read
    public final void i(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void infoContactPersonDialogEvent(onClickUbahTransaksiSetoran onclickubahtransaksisetoran) {
        subscribeReservationRescheduleEvent.e(onclickubahtransaksisetoran, "");
        i().executeTransaction(new Realm.Transaction() { // from class: o.UbahSubBCACardAdapter$ViewHolder_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this, realm);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493155, viewGroup, false);
        int i = 2131296396;
        Button button = (Button) setRotation.a(inflate, 2131296396);
        if (button != null) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) setRotation.a(inflate, 2131297054);
            if (autoCompleteTextView != null) {
                EditText editText = (EditText) setRotation.a(inflate, 2131297094);
                if (editText != null) {
                    EditText editText2 = (EditText) setRotation.a(inflate, 2131297115);
                    if (editText2 != null) {
                        ScrollView scrollView = (ScrollView) inflate;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298601);
                        if (logoutDialog_ViewBinding != null) {
                            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298640);
                            if (logoutDialog_ViewBinding2 != null) {
                                LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298661);
                                if (logoutDialog_ViewBinding3 != null) {
                                    TextView textView = (TextView) setRotation.a(inflate, 2131299078);
                                    if (textView != null) {
                                        TextView textView2 = (TextView) setRotation.a(inflate, 2131299115);
                                        if (textView2 != null) {
                                            TextView textView3 = (TextView) setRotation.a(inflate, 2131299134);
                                            if (textView3 != null) {
                                                TextView textView4 = (TextView) setRotation.a(inflate, 2131299388);
                                                if (textView4 != null) {
                                                    onChoose onchoose = new onChoose(scrollView, button, autoCompleteTextView, editText, editText2, scrollView, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, textView, textView2, textView3, textView4);
                                                    this.d = onchoose;
                                                    subscribeReservationRescheduleEvent.c(onchoose);
                                                    ScrollView scrollView2 = onchoose.e;
                                                    subscribeReservationRescheduleEvent.d(scrollView2, "");
                                                    return scrollView2;
                                                }
                                                i = 2131299388;
                                            } else {
                                                i = 2131299134;
                                            }
                                        } else {
                                            i = 2131299115;
                                        }
                                    } else {
                                        i = 2131299078;
                                    }
                                } else {
                                    i = 2131298661;
                                }
                            } else {
                                i = 2131298640;
                            }
                        } else {
                            i = 2131298601;
                        }
                    } else {
                        i = 2131297115;
                    }
                } else {
                    i = 2131297094;
                }
            } else {
                i = 2131297054;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AdminFeesPresenter adminFeesPresenter = (AdminFeesPresenter) this.m.d();
        Call<OpenAccountSuccessActivity<onClickDetail>> call = adminFeesPresenter.d;
        if (call != null) {
            call.cancel();
        }
        adminFeesPresenter.c = null;
        DaftarTransferPresenter daftarTransferPresenter = (DaftarTransferPresenter) this.l.d();
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call2 = daftarTransferPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        daftarTransferPresenter.c = null;
        documentProvider.b().e(this);
        onDestroyView();
        this.d = null;
        this.a.clear();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        if (z) {
            subscribeReservationRescheduleEvent.c(view);
            int id = view.getId();
            if (id == 2131297054) {
                onChoose onchoose = this.d;
                subscribeReservationRescheduleEvent.c(onchoose);
                onchoose.f.setHintEnabled(true);
            } else if (id == 2131297094) {
                onChoose onchoose2 = this.d;
                subscribeReservationRescheduleEvent.c(onchoose2);
                onchoose2.i.setHintEnabled(true);
            } else if (id == 2131297115) {
                onChoose onchoose3 = this.d;
                subscribeReservationRescheduleEvent.c(onchoose3);
                onchoose3.j.setHintEnabled(true);
            }
        } else {
            subscribeReservationRescheduleEvent.c(view);
            int id2 = view.getId();
            if (id2 == 2131297054) {
                onChoose onchoose4 = this.d;
                subscribeReservationRescheduleEvent.c(onchoose4);
                if (onchoose4.d.getText().toString().length() != 0) {
                    z3 = false;
                }
                if (z3) {
                    onChoose onchoose5 = this.d;
                    subscribeReservationRescheduleEvent.c(onchoose5);
                    onchoose5.f.setHintEnabled(false);
                }
            } else if (id2 == 2131297094) {
                onChoose onchoose6 = this.d;
                subscribeReservationRescheduleEvent.c(onchoose6);
                if (onchoose6.a.getText().toString().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    onChoose onchoose7 = this.d;
                    subscribeReservationRescheduleEvent.c(onchoose7);
                    onchoose7.i.setHintEnabled(false);
                }
            } else if (id2 == 2131297115) {
                onChoose onchoose8 = this.d;
                subscribeReservationRescheduleEvent.c(onchoose8);
                if (onchoose8.b.getText().toString().length() != 0) {
                    z4 = false;
                }
                if (z4) {
                    onChoose onchoose9 = this.d;
                    subscribeReservationRescheduleEvent.c(onchoose9);
                    onchoose9.j.setHintEnabled(false);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        ((AdminFeesPresenter) this.m.d()).c = this;
        ((DaftarTransferPresenter) this.l.d()).c = this;
        onChoose onchoose = this.d;
        subscribeReservationRescheduleEvent.c(onchoose);
        AutoCompleteTextView autoCompleteTextView = onchoose.d;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView, "");
        onChoose onchoose2 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose2);
        EditText editText = onchoose2.a;
        subscribeReservationRescheduleEvent.d(editText, "");
        onChoose onchoose3 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose3);
        EditText editText2 = onchoose3.b;
        subscribeReservationRescheduleEvent.d(editText2, "");
        EditText[] editTextArr = {autoCompleteTextView, editText, editText2};
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        List<? extends EditText> asList = Arrays.asList(editTextArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        this.e = asList;
        onChoose onchoose4 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose4);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = onchoose4.f;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
        onChoose onchoose5 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose5);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = onchoose5.i;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
        onChoose onchoose6 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose6);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = onchoose6.j;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
        LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3};
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
        subscribeReservationRescheduleEvent.d(asList2, "");
        this.g = asList2;
        onChoose onchoose7 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose7);
        TextView textView = onchoose7.h;
        subscribeReservationRescheduleEvent.d(textView, "");
        onChoose onchoose8 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose8);
        TextView textView2 = onchoose8.l;
        subscribeReservationRescheduleEvent.d(textView2, "");
        onChoose onchoose9 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose9);
        TextView textView3 = onchoose9.k;
        subscribeReservationRescheduleEvent.d(textView3, "");
        TextView[] textViewArr = {textView, textView2, textView3};
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        List<? extends TextView> asList3 = Arrays.asList(textViewArr);
        subscribeReservationRescheduleEvent.d(asList3, "");
        this.h = asList3;
        onChoose onchoose10 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose10);
        TextView textView4 = onchoose10.f166o;
        subscribeReservationRescheduleEvent.d(textView4, "");
        String string = getResources().getString(2131821838);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(textView4, "");
        subscribeReservationRescheduleEvent.e(string, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(' ');
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new StyleSpan(1), 9, 28, 34);
        spannableStringBuilder.setSpan(new ImageSpan(textView4.getContext(), 2131231204, 0), string.length(), string.length() + 1, 33);
        spannableStringBuilder.setSpan(remoteActionCompatParcelizer, string.length(), string.length() + 1, 33);
        textView4.setText(spannableStringBuilder);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        onChoose onchoose11 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose11);
        AutoCompleteTextView autoCompleteTextView2 = onchoose11.d;
        subscribeReservationRescheduleEvent.d(autoCompleteTextView2, "");
        autoCompleteTextView2.addTextChangedListener(new read());
        onChoose onchoose12 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose12);
        EditText editText3 = onchoose12.a;
        subscribeReservationRescheduleEvent.d(editText3, "");
        editText3.addTextChangedListener(new TextWatcher() { // from class: o.TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$MediaItem
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this;
                EditText editText4 = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.a(tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding).a;
                subscribeReservationRescheduleEvent.d(editText4, "");
                tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b(editText4);
                TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this.a().setNoHpKontakPengirim(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.a(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this).a.getText().toString());
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        onChoose onchoose13 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose13);
        EditText editText4 = onchoose13.b;
        subscribeReservationRescheduleEvent.d(editText4, "");
        editText4.addTextChangedListener(new MediaMetadataCompat());
        onChoose onchoose14 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose14);
        onchoose14.c.setOnClickListener(new View.OnClickListener() { // from class: o.TujuanTransaksiAdapter$TujuanTransaksiVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.this, view2);
            }
        });
        onChoose onchoose15 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose15);
        AutoCompleteTextView autoCompleteTextView3 = onchoose15.d;
        TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding = this;
        autoCompleteTextView3.setOnFocusChangeListener(tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding);
        onChoose onchoose16 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose16);
        onchoose16.a.setOnFocusChangeListener(tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding);
        onChoose onchoose17 = this.d;
        subscribeReservationRescheduleEvent.c(onchoose17);
        onchoose17.b.setOnFocusChangeListener(tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding);
        getView activity = getActivity();
        if (activity != null) {
            BankTransfer bankTransfer = ((ubahData) activity).f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer = null;
            }
            d(bankTransfer);
            if (!g().isFlagContactKU()) {
                b(true);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.BankTransferFormActivity");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
        h();
    }
}
