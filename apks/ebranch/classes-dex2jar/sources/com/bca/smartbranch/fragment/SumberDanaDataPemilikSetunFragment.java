package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.data.api.response.CISNResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.SumberDanaDialog;
import com.bca.smartbranch.dialog.TujuanTransaksiDialog;
import com.bca.smartbranch.presenter.CheckCISNPresenter;
import com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.CollectionUtils;
import io.realm.Realm;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.DetailTundaEChannelActivity_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.ReservasiTellerOActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.SyaratKetentuanActivity;
import o.clickOrangSamaDenganPemilik;
import o.detailBCAFullPayment;
import o.documentProvider;
import o.getPromotion;
import o.getText;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaDataPemilikSetunFragment.class */
public class SumberDanaDataPemilikSetunFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, DaftarPemilikSumberDanaPresenter.read, AdapterView.OnItemClickListener, CheckCISNPresenter.write {
    private DetailTundaEChannelActivity_ViewBinding a;
    @BindView(2131296472)
    CheckBox cbxSimpanDaftarPemilik;
    private DetailTundaEChannelActivity_ViewBinding d;
    @BindView(2131296934)
    @NotEmpty(messageResId = 2131820805, sequence = 1, trim = true)
    @Order(4)
    EditText etAlamatPemilik;
    @BindViews({2131297065, 2131297133, 2131296989, 2131296934, 2131297097, 2131297200, 2131297230})
    List<View> etFields;
    @BindView(2131296989)
    @Order(3)
    AutoCompleteTextView etIdPemilik;
    @BindView(2131297065)
    @NotEmpty(messageResId = 2131820869, sequence = 1, trim = true)
    @Order(1)
    AutoCompleteTextView etNamaPemilik;
    @BindView(2131297097)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(5)
    EditText etNoHpPemilik;
    @Order(2)
    @BindView(2131297133)
    @NotEmpty(messageResId = 2131820947, sequence = 1, trim = true)
    @Length(messageResId = 2131820948, min = 10, sequence = 2)
    AutoCompleteTextView etNorekPemilik;
    @BindView(2131297200)
    @NotEmpty(messageResId = 2131821006, sequence = 1, trim = true)
    @Order(6)
    EditText etSumberDanaPemilik;
    @BindView(2131297230)
    @NotEmpty(messageResId = 2131821027, sequence = 1, trim = true)
    @Order(7)
    EditText etTujuanTransaksiPemilik;
    private Handler f;
    private setMessage g = new setMessage();
    private CheckCISNPresenter h;
    private Validator i;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    private DaftarPemilikSumberDanaPresenter j;
    @BindView(2131297571)
    LinearLayout llDaftarPemilikSumberDana;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298483)
    LogoutDialog_ViewBinding tilAlamatPemilik;
    @BindViews({2131298612, 2131298678, 2131298538, 2131298483, 2131298643, 2131298732, 2131298761})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298538)
    LogoutDialog_ViewBinding tilIdPemilik;
    @BindView(2131298612)
    LogoutDialog_ViewBinding tilNamaPemilik;
    @BindView(2131298643)
    LogoutDialog_ViewBinding tilNoHpPemilik;
    @BindView(2131298678)
    LogoutDialog_ViewBinding tilNorekPemilik;
    @BindView(2131298732)
    LogoutDialog_ViewBinding tilSumberDanaPemilik;
    @BindView(2131298761)
    LogoutDialog_ViewBinding tilTujuanTransaksiPemilik;
    @BindString(2131821287)
    String titleDataPemilikSumberDana;
    @BindViews({2131299088, 2131299147, 2131299014, 2131298962, 2131299117, 2131299200, 2131299232})
    List<TextView> tvErrors;
    @BindView(2131299615)
    TextView tvTitle;
    @BindColor(17170443)
    int white;

    private void b(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020e  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void f() {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment.f():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
        if (r7 != 2) goto L_0x00b4;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.lang.String i() {
        /*
            r3 = this;
            java.lang.String r0 = "SIUP"
            r4 = r0
            r0 = r3
            android.widget.AutoCompleteTextView r0 = r0.etNamaPemilik     // Catch: Exception -> 0x00af
            boolean r0 = r0.hasFocus()     // Catch: Exception -> 0x00af
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "NAME"
            r4 = r0
            goto L_0x00b7
        L_0x0015:
            r0 = r3
            android.widget.AutoCompleteTextView r0 = r0.etNorekPemilik     // Catch: Exception -> 0x00af
            boolean r0 = r0.hasFocus()     // Catch: Exception -> 0x00af
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "REKENING"
            r4 = r0
            goto L_0x00b7
        L_0x0027:
            r0 = r3
            android.widget.AutoCompleteTextView r0 = r0.etIdPemilik     // Catch: Exception -> 0x00af
            boolean r0 = r0.hasFocus()     // Catch: Exception -> 0x00af
            if (r0 == 0) goto L_0x00b4
            r0 = r3
            o.getView r0 = r0.getActivity()     // Catch: Exception -> 0x00af
            com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0     // Catch: Exception -> 0x00af
            com.bca.smartbranch.data.localdb.Setoran r0 = r0.f     // Catch: Exception -> 0x00af
            java.lang.String r0 = r0.getSenderIdType()     // Catch: Exception -> 0x00af
            r6 = r0
            r0 = r6
            int r0 = r0.hashCode()     // Catch: Exception -> 0x00af
            r7 = r0
            r0 = r7
            r1 = -1911516527(0xffffffff8e109291, float:-1.781994E-30)
            if (r0 == r1) goto L_0x007b
            r0 = r7
            r1 = 74759(0x12407, float:1.0476E-40)
            if (r0 == r1) goto L_0x006c
            r0 = r7
            r1 = 2545521(0x26d771, float:3.567035E-39)
            if (r0 != r1) goto L_0x008c
            r0 = r6
            java.lang.String r1 = "SIUP"
            boolean r0 = r0.equals(r1)     // Catch: Exception -> 0x00af
            if (r0 == 0) goto L_0x008c
            r0 = 2
            r7 = r0
            goto L_0x008f
        L_0x006c:
            r0 = r6
            java.lang.String r1 = "KTP"
            boolean r0 = r0.equals(r1)     // Catch: Exception -> 0x00af
            if (r0 == 0) goto L_0x008c
            r0 = 0
            r7 = r0
            goto L_0x008f
        L_0x007b:
            r0 = r6
            java.lang.String r1 = "Paspor"
            boolean r0 = r0.equals(r1)     // Catch: Exception -> 0x00af
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x008c
            r0 = 1
            r7 = r0
            goto L_0x008f
        L_0x008c:
            r0 = -1
            r7 = r0
        L_0x008f:
            r0 = r7
            if (r0 == 0) goto L_0x00a9
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x00a3
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L_0x00b7
            goto L_0x00b4
        L_0x00a3:
            java.lang.String r0 = "PASPOR"
            r4 = r0
            goto L_0x00b7
        L_0x00a9:
            java.lang.String r0 = "KTP"
            r4 = r0
            goto L_0x00b7
        L_0x00af:
            r4 = move-exception
            r0 = r4
            r0.printStackTrace()
        L_0x00b4:
            java.lang.String r0 = ""
            r4 = r0
        L_0x00b7:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment.i():java.lang.String");
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void a() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void a(String str) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNamaPemilik.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNamaPemilik)).getVisibility() == 0) {
                b(this.etFields.indexOf(this.etNamaPemilik));
            }
            this.f.removeMessages(100);
            this.f.sendEmptyMessageDelayed(100, 300);
            ((FormTellerActivity) getActivity()).f.setSenderName(editable.toString());
        } else if (editable == this.etNorekPemilik.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNorekPemilik)).getVisibility() == 0) {
                if (this.tvErrors.get(this.etFields.indexOf(this.etNorekPemilik)).getText().equals(getString(2131820920))) {
                    if (!this.etNorekPemilik.getText().toString().isEmpty()) {
                        b(this.etFields.indexOf(this.etNorekPemilik));
                    }
                } else if (this.tvErrors.get(this.etFields.indexOf(this.etNorekPemilik)).getText().equals(getString(2131820923)) && this.etNorekPemilik.getText().toString().length() >= 10) {
                    b(this.etFields.indexOf(this.etNorekPemilik));
                }
            }
            this.f.removeMessages(100);
            this.f.sendEmptyMessageDelayed(100, 300);
            ((FormTellerActivity) getActivity()).f.setSenderIdNumber(editable.toString());
        } else if (editable == this.etIdPemilik.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etIdPemilik)).getVisibility() == 0 && !this.etIdPemilik.getText().toString().isEmpty()) {
                b(this.etFields.indexOf(this.etIdPemilik));
            }
            this.f.removeMessages(100);
            this.f.sendEmptyMessageDelayed(100, 300);
            ((FormTellerActivity) getActivity()).f.setSenderIdNumber(editable.toString());
        } else if (editable == this.etAlamatPemilik.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etAlamatPemilik)).getVisibility() == 0 && !this.etAlamatPemilik.getText().toString().isEmpty()) {
                b(this.etFields.indexOf(this.etAlamatPemilik));
            }
            ((FormTellerActivity) getActivity()).f.setSenderAddress(editable.toString());
        } else if (editable == this.etNoHpPemilik.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoHpPemilik)).getVisibility() == 0 && !this.etNoHpPemilik.getText().toString().isEmpty()) {
                b(this.etFields.indexOf(this.etNoHpPemilik));
            }
            ((FormTellerActivity) getActivity()).f.setSenderPhone(editable.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void b() {
        h();
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new SumberDanaOrangDatangKeCabangSetunFragment(), "SumberDanaOrangDatangKeCabangSetunFragment");
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void b(String str) {
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void b(List<detailBCAFullPayment.read> list) {
        String i = i();
        if (i.equalsIgnoreCase("NAME")) {
            DetailTundaEChannelActivity_ViewBinding detailTundaEChannelActivity_ViewBinding = this.a;
            detailTundaEChannelActivity_ViewBinding.e.clear();
            detailTundaEChannelActivity_ViewBinding.e.addAll(list);
            AutoCompleteTextView autoCompleteTextView = this.etNamaPemilik;
            if (autoCompleteTextView != null && !autoCompleteTextView.getText().toString().isEmpty()) {
                this.a.getFilter().filter(this.etNamaPemilik.getText().toString());
                return;
            }
            return;
        }
        DetailTundaEChannelActivity_ViewBinding detailTundaEChannelActivity_ViewBinding2 = this.d;
        detailTundaEChannelActivity_ViewBinding2.e.clear();
        detailTundaEChannelActivity_ViewBinding2.e.addAll(list);
        if (i.equalsIgnoreCase("REKENING")) {
            AutoCompleteTextView autoCompleteTextView2 = this.etNorekPemilik;
            if (autoCompleteTextView2 != null && !autoCompleteTextView2.getText().toString().isEmpty()) {
                this.d.getFilter().filter(this.etNorekPemilik.getText().toString());
                return;
            }
            return;
        }
        AutoCompleteTextView autoCompleteTextView3 = this.etIdPemilik;
        if (autoCompleteTextView3 != null && !autoCompleteTextView3.getText().toString().isEmpty()) {
            this.d.getFilter().filter(this.etIdPemilik.getText().toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493271;
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read, com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @OnClick({2131296396})
    public void clickLanjut(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            if (!logoutDialog_ViewBinding.isEnabled()) {
                logoutDialog_ViewBinding.setBackgroundColor(this.white);
            } else {
                logoutDialog_ViewBinding.setBackgroundResource(2131230847);
            }
        }
        this.i.validate();
    }

    @OnClick({2131297200, 2131297230})
    public void clickView(View view) {
        String str;
        Bundle bundle = new Bundle();
        int id = view.getId();
        getText gettext = null;
        if (id == 2131297200) {
            gettext = new SumberDanaDialog();
            bundle.putStringArray(CollectionUtils.LIST_TYPE, ((FormTellerActivity) getActivity()).q);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSumberDanaPemilik.getText().toString());
            str = "SumberDanaDialog";
        } else if (id != 2131297230) {
            str = null;
        } else {
            gettext = new TujuanTransaksiDialog();
            bundle.putStringArray(CollectionUtils.LIST_TYPE, ((FormTellerActivity) getActivity()).s);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTujuanTransaksiPemilik.getText().toString());
            str = "TujuanTransaksiDialog";
        }
        if (gettext != null) {
            gettext.setArguments(bundle);
            gettext.show(getFragmentManager(), str);
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void d() {
        h();
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new SumberDanaOrangDatangKeCabangSetunFragment(), "SumberDanaOrangDatangKeCabangSetunFragment");
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void d(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: Exception -> 0x00a3, TRY_ENTER, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0016, B:6:0x001f, B:11:0x0037, B:15:0x0045, B:24:0x005e, B:26:0x006e, B:27:0x0075, B:29:0x0085, B:30:0x008c, B:32:0x009c), top: B:36:0x0000 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final /* synthetic */ boolean d(android.os.Message r4) {
        /*
            r3 = this;
            r0 = r3
            o.getView r0 = r0.getActivity()     // Catch: Exception -> 0x00a3
            com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0     // Catch: Exception -> 0x00a3
            com.bca.smartbranch.data.localdb.Setoran r0 = r0.f     // Catch: Exception -> 0x00a3
            java.lang.String r0 = r0.getSourceAccountOwnerType()     // Catch: Exception -> 0x00a3
            java.lang.String r1 = "Saya Sendiri"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: Exception -> 0x00a3
            if (r0 != 0) goto L_0x00a8
            r0 = r4
            int r0 = r0.what     // Catch: Exception -> 0x00a3
            r1 = 100
            if (r0 != r1) goto L_0x00a8
            r0 = r3
            java.lang.String r0 = r0.i()     // Catch: Exception -> 0x00a3
            r4 = r0
            r0 = r4
            int r0 = r0.hashCode()     // Catch: Exception -> 0x00a3
            r5 = r0
            r0 = r5
            r1 = 2388619(0x24728b, float:3.347168E-39)
            if (r0 == r1) goto L_0x0045
            r0 = r5
            r1 = 203076865(0xc1ab501, float:1.1918197E-31)
            if (r0 != r1) goto L_0x0053
            r0 = r4
            java.lang.String r1 = "REKENING"
            boolean r0 = r0.equals(r1)     // Catch: Exception -> 0x00a3
            if (r0 == 0) goto L_0x0053
            r0 = 1
            r5 = r0
            goto L_0x0055
        L_0x0045:
            r0 = r4
            java.lang.String r1 = "NAME"
            boolean r0 = r0.equals(r1)     // Catch: Exception -> 0x00a3
            if (r0 == 0) goto L_0x0053
            r0 = 0
            r5 = r0
            goto L_0x0055
        L_0x0053:
            r0 = -1
            r5 = r0
        L_0x0055:
            r0 = r5
            if (r0 == 0) goto L_0x008c
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x0075
            r0 = r3
            android.widget.AutoCompleteTextView r0 = r0.etIdPemilik     // Catch: Exception -> 0x00a3
            android.text.Editable r0 = r0.getText()     // Catch: Exception -> 0x00a3
            java.lang.String r0 = r0.toString()     // Catch: Exception -> 0x00a3
            boolean r0 = r0.isEmpty()     // Catch: Exception -> 0x00a3
            if (r0 != 0) goto L_0x00a8
            r0 = r3
            r0.f()     // Catch: Exception -> 0x00a3
            goto L_0x00a8
        L_0x0075:
            r0 = r3
            android.widget.AutoCompleteTextView r0 = r0.etNorekPemilik     // Catch: Exception -> 0x00a3
            android.text.Editable r0 = r0.getText()     // Catch: Exception -> 0x00a3
            java.lang.String r0 = r0.toString()     // Catch: Exception -> 0x00a3
            boolean r0 = r0.isEmpty()     // Catch: Exception -> 0x00a3
            if (r0 != 0) goto L_0x00a8
            r0 = r3
            r0.f()     // Catch: Exception -> 0x00a3
            goto L_0x00a8
        L_0x008c:
            r0 = r3
            android.widget.AutoCompleteTextView r0 = r0.etNamaPemilik     // Catch: Exception -> 0x00a3
            android.text.Editable r0 = r0.getText()     // Catch: Exception -> 0x00a3
            java.lang.String r0 = r0.toString()     // Catch: Exception -> 0x00a3
            boolean r0 = r0.isEmpty()     // Catch: Exception -> 0x00a3
            if (r0 != 0) goto L_0x00a8
            r0 = r3
            r0.f()     // Catch: Exception -> 0x00a3
            goto L_0x00a8
        L_0x00a3:
            r4 = move-exception
            r0 = r4
            r0.printStackTrace()
        L_0x00a8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment.d(android.os.Message):boolean");
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void e() {
        h();
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new SumberDanaOrangDatangKeCabangSetunFragment(), "SumberDanaOrangDatangKeCabangSetunFragment");
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read, com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void e(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void h(String str) {
        h();
        if (str.equalsIgnoreCase("true")) {
            this.etIdPemilik.setText("");
            this.tilIdPemilik.setVisibility(8);
            this.etAlamatPemilik.setText("");
            this.tilAlamatPemilik.setVisibility(8);
            this.tilNamaPemilik.setHint(2131821919);
            this.etNamaPemilik.setHint(getResources().getString(2131821919));
            this.tilNorekPemilik.setVisibility(0);
            this.etNorekPemilik.setText("");
            ((FormTellerActivity) getActivity()).f.setSenderIdType("Rekening");
            this.i.validate();
            return;
        }
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new SumberDanaOrangDatangKeCabangSetunFragment(), "SumberDanaOrangDatangKeCabangSetunFragment");
    }

    @OnFocusChange({2131297065, 2131297133, 2131296989, 2131296934, 2131297097})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296934:
                    this.tilAlamatPemilik.setHintEnabled(true);
                    return;
                case 2131296989:
                    this.tilIdPemilik.setHintEnabled(true);
                    return;
                case 2131297065:
                    this.tilNamaPemilik.setHintEnabled(true);
                    return;
                case 2131297097:
                    this.tilNoHpPemilik.setHintEnabled(true);
                    return;
                case 2131297133:
                    this.tilNorekPemilik.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296934:
                    if (this.etAlamatPemilik.getText().toString().isEmpty()) {
                        this.tilAlamatPemilik.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296989:
                    if (this.etIdPemilik.getText().toString().isEmpty()) {
                        this.tilIdPemilik.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297065:
                    if (this.etNamaPemilik.getText().toString().isEmpty()) {
                        this.tilNamaPemilik.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297097:
                    if (this.etNoHpPemilik.getText().toString().isEmpty()) {
                        this.tilNoHpPemilik.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297133:
                    if (this.etNorekPemilik.getText().toString().isEmpty()) {
                        this.tilNorekPemilik.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        ((FormTellerActivity) getActivity()).f.setSenderName("");
        ((FormTellerActivity) getActivity()).f.setSenderIdNumber("");
        ((FormTellerActivity) getActivity()).f.setSenderAddress("");
        ((FormTellerActivity) getActivity()).f.setSenderPhone("");
        ((FormTellerActivity) getActivity()).f.setSenderEmail("");
        ((FormTellerActivity) getActivity()).f.setSenderIdType("");
        ((FormTellerActivity) getActivity()).f.setFlagSaveToSourceAccountList("");
        ((FormTellerActivity) getActivity()).f.setTxnSource("");
        ((FormTellerActivity) getActivity()).f.setTxnPurpose("");
        if (this.e.getVerified().equalsIgnoreCase("Y")) {
            e(2131296811, new PenerimaFragment(), "PenerimaFragment");
        } else {
            e(2131296811, new SumberDanaPilihIdentitasSetunFragment(), "SumberDanaPilihIdentitasSetunFragment");
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        CheckCISNPresenter checkCISNPresenter = this.h;
        Call<OpenAccountSuccessActivity<CISNResponse>> call = checkCISNPresenter.a;
        if (call != null) {
            call.cancel();
        }
        checkCISNPresenter.d = null;
        documentProvider.b().e(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        DetailTundaEChannelActivity_ViewBinding.write write = (DetailTundaEChannelActivity_ViewBinding.write) adapterView.getItemAtPosition(i);
        String i2 = i();
        i2.hashCode();
        if (i2.equals("NAME")) {
            this.etNamaPemilik.setText(write.d);
            AutoCompleteTextView autoCompleteTextView = this.etNamaPemilik;
            autoCompleteTextView.setSelection(autoCompleteTextView.length());
            if (this.tilNorekPemilik.getVisibility() == 0) {
                this.etNorekPemilik.setText(write.a);
                AutoCompleteTextView autoCompleteTextView2 = this.etNorekPemilik;
                autoCompleteTextView2.setSelection(autoCompleteTextView2.length());
                this.tilNorekPemilik.setHintEnabled(true);
            } else if (this.tilIdPemilik.getVisibility() == 0) {
                this.etIdPemilik.setText(write.a);
                AutoCompleteTextView autoCompleteTextView3 = this.etIdPemilik;
                autoCompleteTextView3.setSelection(autoCompleteTextView3.length());
                this.tilIdPemilik.setHintEnabled(true);
            }
            if (write.e != null) {
                this.etAlamatPemilik.setText(write.e);
                this.etAlamatPemilik.setSelection(write.e.length());
                this.tilAlamatPemilik.setHintEnabled(true);
            }
            if (write.b != null) {
                this.etNoHpPemilik.setText(write.b);
                this.etNoHpPemilik.setSelection(write.b.length());
                this.tilNoHpPemilik.setHintEnabled(true);
            }
        } else if (!i2.equals("REKENING")) {
            this.etNamaPemilik.setText(write.d);
            AutoCompleteTextView autoCompleteTextView4 = this.etNamaPemilik;
            autoCompleteTextView4.setSelection(autoCompleteTextView4.length());
            this.tilNamaPemilik.setHintEnabled(true);
            this.etIdPemilik.setText(write.a);
            AutoCompleteTextView autoCompleteTextView5 = this.etIdPemilik;
            autoCompleteTextView5.setSelection(autoCompleteTextView5.length());
            if (write.e != null) {
                this.etAlamatPemilik.setText(write.e);
                this.etAlamatPemilik.setSelection(write.e.length());
                this.tilAlamatPemilik.setHintEnabled(true);
            }
            if (write.b != null) {
                this.etNoHpPemilik.setText(write.b);
                this.etNoHpPemilik.setSelection(write.b.length());
                this.tilNoHpPemilik.setHintEnabled(true);
            }
        } else {
            this.etNamaPemilik.setText(write.d);
            AutoCompleteTextView autoCompleteTextView6 = this.etNamaPemilik;
            autoCompleteTextView6.setSelection(autoCompleteTextView6.length());
            this.tilNamaPemilik.setHintEnabled(true);
            this.etNorekPemilik.setText(write.a);
            AutoCompleteTextView autoCompleteTextView7 = this.etNorekPemilik;
            autoCompleteTextView7.setSelection(autoCompleteTextView7.length());
            if (write.e != null) {
                this.etAlamatPemilik.setText(write.e);
                this.etAlamatPemilik.setSelection(write.e.length());
                this.tilAlamatPemilik.setHintEnabled(true);
            }
            if (write.b != null) {
                this.etNoHpPemilik.setText(write.b);
                this.etNoHpPemilik.setSelection(write.b.length());
                this.tilNoHpPemilik.setHintEnabled(true);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        EditText editText = null;
        for (ValidationError validationError : list) {
            View view = validationError.getView();
            String message = validationError.getFailedRules().get(0).getMessage(getContext());
            if (view instanceof EditText) {
                EditText editText2 = editText;
                if (editText == null) {
                    editText2 = (EditText) view;
                }
                switch (view.getId()) {
                    case 2131296934:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilAlamatPemilik.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296989:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilIdPemilik.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297065:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilNamaPemilik.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297097:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilNoHpPemilik.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297133:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilNorekPemilik.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297200:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
                        this.tilSumberDanaPemilik.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297230:
                        this.tvErrors.get(6).setVisibility(0);
                        this.tvErrors.get(6).setText(message);
                        this.tilTujuanTransaksiPemilik.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    default:
                        editText = editText2;
                        continue;
                }
            } else {
                b(this.llMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (((FormTellerActivity) getActivity()).f.getSenderIdType().equals("Rekening")) {
            documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
            c(2131296811, new SumberDanaOrangDatangKeCabangSetunFragment(), "SumberDanaOrangDatangKeCabangSetunFragment");
            return;
        }
        this.h.d(this.e, this.etIdPemilik.getText().toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        Validator validator = new Validator(this);
        this.i = validator;
        validator.setValidationListener(this);
        if (this.etNoHpPemilik.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
            Validator validator2 = this.i;
            EditText editText = this.etNoHpPemilik;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: INVOKE  
                  (r0v351 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v353 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v32 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x0070: CONSTRUCTOR  
                  (r0v353 'editText' android.widget.EditText)
                  (r0v345 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaDataPemilikSetunFragment.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:998)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:971)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 21 more
                */
            /*
            // Method dump skipped, instructions count: 1836
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
        public final void p() {
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void sumberDanaEvent(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
            b(this.etFields.indexOf(this.etSumberDanaPemilik));
            this.tilSumberDanaPemilik.setHintEnabled(true);
            this.etSumberDanaPemilik.setText(reservasiTellerOActivity_ViewBinding.a);
            ((FormTellerActivity) getActivity()).f.setTxnSource(this.etSumberDanaPemilik.getText().toString());
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void tujuanTransaksiEvent(SyaratKetentuanActivity syaratKetentuanActivity) {
            b(this.etFields.indexOf(this.etTujuanTransaksiPemilik));
            this.tilTujuanTransaksiPemilik.setHintEnabled(true);
            this.etTujuanTransaksiPemilik.setText(syaratKetentuanActivity.c);
            ((FormTellerActivity) getActivity()).f.setTxnPurpose(this.etTujuanTransaksiPemilik.getText().toString());
        }
    }
