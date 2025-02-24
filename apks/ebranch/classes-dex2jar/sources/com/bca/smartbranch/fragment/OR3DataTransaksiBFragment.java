package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.activity.PilihTujuanTransaksiORActivity;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.KategoriTujuanTransaksiORDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SumberDanaORDialog;
import com.bca.smartbranch.presenter.BeneficiaryBankPresenter;
import com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.GetBankSpecialRelationPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.ReservasiTellerOActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onExitForm;
import o.togglePINBaruConfirm;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR3DataTransaksiBFragment.class */
public class OR3DataTransaksiBFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, RadioGroup.OnCheckedChangeListener, BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver, GetBankSpecialRelationPresenter.read {
    private List<KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR> a;
    private BeneficiaryBankPresenter d;
    @BindView(2131296954)
    EditText etBerita;
    @BindViews({2131297009, 2131297226, 2131297199, 2131296954})
    List<View> etForms;
    @BindView(2131297009)
    @NotEmpty(messageResId = 2131820825, sequence = 1, trim = true)
    @Order(1)
    EditText etKategori;
    @BindView(2131297199)
    @NotEmpty(messageResId = 2131821006, sequence = 3, trim = true)
    @Order(3)
    EditText etSumberDana;
    @BindView(2131297226)
    @NotEmpty(messageResId = 2131821027, sequence = 2, trim = true)
    @Order(2)
    EditText etTujuan;
    private GetBankSpecialRelationPresenter f;
    private Validator h;
    private KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR j;
    @BindView(2131298144)
    RadioButton rbHubunganKeuanganTidak;
    @BindView(2131298145)
    RadioButton rbHubunganKeuanganYa;
    @BindView(2131298216)
    RadioGroup rgHubunganKeuangan;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298504)
    LogoutDialog_ViewBinding tilBerita;
    @BindViews({2131298555, 2131298757, 2131298731, 2131298504})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298555)
    LogoutDialog_ViewBinding tilKategori;
    @BindView(2131298731)
    LogoutDialog_ViewBinding tilSumberDana;
    @BindView(2131298757)
    LogoutDialog_ViewBinding tilTujuan;
    @BindViews({2131299032, 2131299228, 2131299199})
    List<TextView> tvErrors;
    @BindView(2131299286)
    TextView tvInfoHubunganKeuangan;

    private void e(View view) {
        this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(8);
        this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etBerita.getEditableText()) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setBeritaTransaksi(this.etBerita.getText().toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(BeneficiaryBankResponse beneficiaryBankResponse) {
        h();
        ((OutwardRemittanceFormActivity) getActivity()).t();
        ((OutwardRemittanceFormActivity) getActivity()).f = beneficiaryBankResponse.getListData();
        c(2131296811, new OR4DataBankPenerimaFragment(), "OR4DataBankPenerimaFragment");
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
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

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493195;
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void f(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((OutwardRemittanceFormActivity) getActivity()).n.setKategoriTujuanTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setTujuanTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setSumberDanaTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setBeritaTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagHubunganKeuanganTransaksi("");
        List asList = Arrays.asList(((OutwardRemittanceFormActivity) getActivity()).n.getProdukRekomendasi().split(","));
        if (asList.size() != 1 || !((String) asList.get(0)).equalsIgnoreCase("O")) {
            e(2131296811, new OR2PilihProductFragment(), "OR2PilihProductFragment");
        } else {
            e(2131296811, new OR2DataTransaksiAFragment(), "OR2DataTransaksiAFragment");
        }
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @OnFocusChange({2131296954})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131296954) {
                this.tilBerita.setHintEnabled(true);
            }
        } else if (view.getId() == 2131296954 && this.etBerita.getText().toString().isEmpty()) {
            this.tilBerita.setHintEnabled(false);
        }
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.h.validate();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case 2131298144:
                ((OutwardRemittanceFormActivity) getActivity()).n.setFlagHubunganKeuanganTransaksi("N");
                return;
            case 2131298145:
                ((OutwardRemittanceFormActivity) getActivity()).n.setFlagHubunganKeuanganTransaksi("A");
                return;
            default:
                return;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKategoriTujuanTransaksiOR(onExitForm onexitform) {
        e(this.etKategori);
        e(this.etTujuan);
        this.j = this.a.get(onexitform.e);
        this.etKategori.setError(null);
        this.tilKategori.setHintEnabled(true);
        this.etKategori.setText(this.j.getCategorySttDesc());
        this.etTujuan.setText("");
        this.tilTujuan.setHintEnabled(false);
        this.tilTujuan.setVisibility(0);
        ((OutwardRemittanceFormActivity) getActivity()).n.setKategoriTujuanTransaksiKode(this.j.getCategorySttCode());
        ((OutwardRemittanceFormActivity) getActivity()).n.setKategoriTujuanTransaksi(this.j.getCategorySttDesc());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseSumberDanaOR(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
        e(this.etSumberDana);
        this.etSumberDana.setError(null);
        this.tilSumberDana.setHintEnabled(true);
        this.etSumberDana.setText(reservasiTellerOActivity_ViewBinding.a);
        ((OutwardRemittanceFormActivity) getActivity()).n.setSumberDanaTransaksi(reservasiTellerOActivity_ViewBinding.a);
        ((OutwardRemittanceFormActivity) getActivity()).n.setSumberDanaTransaksiKode(reservasiTellerOActivity_ViewBinding.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseTujuanTransaksiOR(togglePINBaruConfirm togglepinbaruconfirm) {
        e(this.etTujuan);
        this.etTujuan.setError(null);
        this.tilTujuan.setHintEnabled(true);
        this.etTujuan.setText(togglepinbaruconfirm.c);
        ((OutwardRemittanceFormActivity) getActivity()).n.setTujuanTransaksiKode(togglepinbaruconfirm.e);
        ((OutwardRemittanceFormActivity) getActivity()).n.setTujuanTransaksi(togglepinbaruconfirm.c);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        documentProvider.b().e(this);
        BeneficiaryBankPresenter beneficiaryBankPresenter = this.d;
        Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> call = beneficiaryBankPresenter.e;
        if (call != null) {
            call.cancel();
        }
        beneficiaryBankPresenter.e = null;
        GetBankSpecialRelationPresenter getBankSpecialRelationPresenter = this.f;
        Call<OpenAccountSuccessActivity<GetBankSpecialRelationResponse>> call2 = getBankSpecialRelationPresenter.c;
        if (call2 != null) {
            call2.cancel();
        }
        getBankSpecialRelationPresenter.c = null;
        onDestroyView();
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
                int id = view.getId();
                if (id == 2131297009) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilKategori.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297199) {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilSumberDana.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297226) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilTujuan.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else {
                b(this.svMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        ((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", this.e.getEmail());
            jSONObject.put("SessionId", this.e.getSessionId());
            jSONObject.put("IMEI", this.e.getImei());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.d.d(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), ((OutwardRemittanceFormActivity) getActivity()).n.getISONegaraTujuanTransaksi(), "BIC");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a4, code lost:
        if (r0.equals("JPY") == false) goto L_0x01d7;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b0 A[LOOP:1: B:95:0x04a3->B:97:0x04b0, LOOP_END] */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 1277
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @OnClick({2131297009})
    public void pilihKategoriTujuanTransaksiOR(View view) {
        ArrayList arrayList = new ArrayList();
        for (KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR kategoriTujuanTransaksiOR : this.a) {
            arrayList.add(kategoriTujuanTransaksiOR.getCategorySttDesc());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        Bundle bundle = new Bundle();
        bundle.putStringArray("listdata", strArr);
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etKategori.getText().toString());
        KategoriTujuanTransaksiORDialog kategoriTujuanTransaksiORDialog = new KategoriTujuanTransaksiORDialog();
        kategoriTujuanTransaksiORDialog.setArguments(bundle);
        kategoriTujuanTransaksiORDialog.show(getFragmentManager(), "KategoriTujuanTransaksiORDialog");
    }

    @OnClick({2131297199})
    public void pilihSumberDanaOR(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSumberDana.getText().toString());
        SumberDanaORDialog sumberDanaORDialog = new SumberDanaORDialog(((OutwardRemittanceFormActivity) getActivity()).w);
        sumberDanaORDialog.setArguments(bundle);
        sumberDanaORDialog.show(getFragmentManager(), "SumberDanaORDialog");
    }

    @OnClick({2131297226})
    public void pilihTujuanTransaksi(View view) {
        Intent intent = new Intent(getContext(), PilihTujuanTransaksiORActivity.class);
        intent.putExtra("code", this.j.getCategorySttCode());
        intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
        intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
        startActivity(intent);
    }

    @OnClick({2131299287, 2131297390})
    public void showInfoHubunganKeuanganOR(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131821258));
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void v_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).g();
    }
}
