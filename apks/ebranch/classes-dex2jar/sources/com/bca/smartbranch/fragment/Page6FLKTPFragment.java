package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.FotoActivity;
import com.bca.smartbranch.activity.PhotoCardActivity;
import com.bca.smartbranch.dialog.CameraDialog;
import com.bca.smartbranch.dialog.MasaBerlakuKTPDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.OcrPresenter;
import com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bumptech.glide.Glide;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH_ViewBinding;
import o.GetPPUNumberResponse;
import o.InfoValueTodayORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PhotoCardActivity_ViewBinding;
import o.PilihKantorCabangActivity;
import o.ReRegistrationSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCurrencyCode;
import o.getPromotion;
import o.getRelationCode;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setPadding;
import o.ubahProfil;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FLKTPFragment.class */
public class Page6FLKTPFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver, RadioGroup.OnCheckedChangeListener {
    private String a;
    private Validator d;
    @BindViews({2131297077, 2131297103, 2131297044})
    List<View> etFields;
    @BindView(2131296981)
    EditText etFotoDiri;
    @BindView(2131296982)
    EditText etFotoID;
    @BindView(2131297044)
    @NotEmpty(messageResId = 2131820784, trim = true)
    @Order(3)
    EditText etMasaBerlaku;
    @BindView(2131297077)
    @NotEmpty(messageResId = 2131820872, trim = true)
    @Order(1)
    EditText etNamaSesuai;
    @Order(2)
    @BindView(2131297103)
    @NotEmpty(messageResId = 2131820914, sequence = 1, trim = true)
    @Length(messageResId = 2131820916, min = 16, sequence = 2)
    EditText etNoIdentitas;
    private int f;
    private OcrPresenter i;
    @BindView(2131297362)
    Page6CSFragment ivFotoDiri;
    @BindView(2131297364)
    Page6CSFragment ivFotoID;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindString(2131822369)
    String masaBerlakuEKTP;
    @BindView(2131298148)
    RadioButton rbLakiLaki;
    @BindView(2131298149)
    RadioButton rbPerempuan;
    @BindView(2131298217)
    RadioGroup rgJenisKelamin;
    @BindViews({2131298623, 2131298649, 2131298591})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298530)
    LogoutDialog_ViewBinding tilFotoDiri;
    @BindView(2131298531)
    LogoutDialog_ViewBinding tilFotoIdentitas;
    @BindView(2131298591)
    LogoutDialog_ViewBinding tilMasaBerlaku;
    @BindView(2131298623)
    LogoutDialog_ViewBinding tilNamaSesuai;
    @BindView(2131298649)
    LogoutDialog_ViewBinding tilNoIdentitas;
    @BindViews({2131299099, 2131299122, 2131299067})
    List<TextView> tvErrors;

    private void a(int i) {
        this.f = i;
        if ((!((FormActivity) getActivity()).n.getFotoPribadi().isEmpty() || i != 2) && (!((FormActivity) getActivity()).n.getFotoKtp().isEmpty() || i != 1)) {
            new CameraDialog().show(getFragmentManager(), "CameraDialog");
        } else {
            e();
        }
    }

    private void d(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    private void e() {
        if (this.f == 2) {
            Intent intent = new Intent(getActivity(), FotoActivity.class);
            intent.putExtra("TAKE_FOTO", this.f);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(getActivity(), PhotoCardActivity.class);
        intent2.putExtra("TAKE_FOTO", this.f);
        startActivity(intent2);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNoIdentitas.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoIdentitas)).getVisibility() == 0 && getPromotion.d(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etNoIdentitas)).getText().toString(), this.etNoIdentitas)) {
                d(this.etFields.indexOf(this.etNoIdentitas));
            }
            ((FormActivity) getActivity()).n.setNumberID(editable.toString());
        } else if (editable == this.etNamaSesuai.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNamaSesuai)).getVisibility() == 0 && !this.etNamaSesuai.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etNamaSesuai));
            }
            ((FormActivity) getActivity()).n.setName(editable.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        h();
        this.etNoIdentitas.setText(str);
        if (!this.etNoIdentitas.getText().toString().isEmpty()) {
            this.tilNoIdentitas.setHintEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493123;
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @OnClick({2131296981, 2131297362})
    public void fotoDiri(View view) {
        a(2);
    }

    @OnClick({2131296982, 2131297364})
    public void fotoID(View view) {
        a(1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6FLKTPFragment.this.getActivity()).n.setFotoKtp("");
                ((FormActivity) Page6FLKTPFragment.this.getActivity()).n.setNumberID("");
                ((FormActivity) Page6FLKTPFragment.this.getActivity()).n.setName("");
                ((FormActivity) Page6FLKTPFragment.this.getActivity()).n.setFlagEKTP("");
                ((FormActivity) Page6FLKTPFragment.this.getActivity()).n.setExpID("");
                ((FormActivity) Page6FLKTPFragment.this.getActivity()).n.setFotoPribadi("");
            }
        });
        e(2131296811, new Page6ELFragment(), "Page6ELFragment");
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @OnFocusChange({2131297077, 2131297103})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131297077) {
                this.tilNamaSesuai.setHintEnabled(true);
            } else if (id == 2131297103) {
                this.tilNoIdentitas.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131297077) {
                if (id2 == 2131297103 && this.etNoIdentitas.getText().toString().isEmpty()) {
                    this.tilNoIdentitas.setHintEnabled(false);
                }
            } else if (this.etNamaSesuai.getText().toString().isEmpty()) {
                this.tilNamaSesuai.setHintEnabled(false);
            }
        }
    }

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getActivity());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.d.validate();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case 2131298148:
                ((FormActivity) getActivity()).n.setSex("L");
                return;
            case 2131298149:
                ((FormActivity) getActivity()).n.setSex("P");
                return;
            default:
                return;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
    public void onChooseCameraEvent(PilihKantorCabangActivity pilihKantorCabangActivity) {
        if (pilihKantorCabangActivity.c) {
            e();
            return;
        }
        int i = this.f;
        if (i == 2) {
            ((FormActivity) getActivity()).n.setFotoPribadi("");
            this.etFotoDiri.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231142, 0);
            this.ivFotoDiri.setVisibility(8);
            this.etFotoDiri.setText((CharSequence) null);
            this.tilFotoDiri.setHintEnabled(false);
        } else if (i == 1) {
            ((FormActivity) getActivity()).n.setFotoKtp("");
            this.etFotoID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231142, 0);
            this.ivFotoID.setVisibility(8);
            this.etFotoID.setText((CharSequence) null);
            this.tilFotoIdentitas.setHintEnabled(false);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueFotoDiri(ReRegistrationSuccessActivity reRegistrationSuccessActivity) {
        this.etFotoDiri.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.ivFotoDiri.setVisibility(0);
        this.tilFotoDiri.setHintEnabled(true);
        this.etFotoDiri.setText("  ");
        Glide.d(getContext()).e(reRegistrationSuccessActivity.e).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoDiri);
        ((FormActivity) getActivity()).n.setFotoPribadi(getPromotion.b(reRegistrationSuccessActivity.e));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueFotoID(ubahProfil ubahprofil) {
        this.etFotoID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.ivFotoID.setVisibility(0);
        this.tilFotoIdentitas.setHintEnabled(true);
        this.etFotoID.setText("  ");
        Glide.d(getContext()).e(ubahprofil.e).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoID);
        this.a = getPromotion.b(ubahprofil.e);
        ((FormActivity) getActivity()).n.setFotoKtp(this.a);
        this.i.d(new InfoValueTodayORActivity_ViewBinding("KTP", this.a));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        documentProvider.b().e(this);
        OcrPresenter ocrPresenter = this.i;
        Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> call = ocrPresenter.a;
        if (call != null) {
            call.cancel();
        }
        ocrPresenter.c = null;
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
                if (id == 2131297044) {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilMasaBerlaku.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297077) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilNamaSesuai.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297103) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilNoIdentitas.setBackgroundResource(2131230870);
                    editText = editText2;
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
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new Page6GLFragment(), "Page6GLFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bitmap bitmap;
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        OcrPresenter ocrPresenter = new OcrPresenter();
        this.i = ocrPresenter;
        ocrPresenter.c = this;
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.d = validator;
        validator.setValidationListener(this);
        ((FormActivity) getActivity()).n.setCurrentPage("Page6FLKTPFragment");
        this.etNamaSesuai.setText(((FormActivity) getActivity()).n.getName());
        if (!((FormActivity) getActivity()).n.getName().isEmpty()) {
            this.tilNamaSesuai.setHintEnabled(true);
        }
        this.etNoIdentitas.setText(((FormActivity) getActivity()).n.getNumberID());
        if (!((FormActivity) getActivity()).n.getNumberID().isEmpty()) {
            this.tilNoIdentitas.setHintEnabled(true);
        }
        if (!((FormActivity) getActivity()).n.getExpID().isEmpty()) {
            if (((FormActivity) getActivity()).n.getFlagEKTP().equalsIgnoreCase("1")) {
                this.etMasaBerlaku.setText("Seumur hidup");
            } else {
                this.etMasaBerlaku.setText(((FormActivity) getActivity()).n.getExpID());
            }
            this.tilMasaBerlaku.setHintEnabled(true);
        }
        String sex = ((FormActivity) getActivity()).n.getSex();
        sex.hashCode();
        if (sex.equals("L")) {
            this.rbLakiLaki.setChecked(true);
        } else if (!sex.equals("P")) {
            ((FormActivity) getActivity()).n.setSex("L");
        } else {
            this.rbPerempuan.setChecked(true);
        }
        Bitmap bitmap2 = null;
        if (!((FormActivity) getActivity()).n.getFotoKtp().isEmpty()) {
            String fotoKtp = ((FormActivity) getActivity()).n.getFotoKtp();
            if (!"".equalsIgnoreCase(fotoKtp)) {
                byte[] decode = Base64.decode(fotoKtp.getBytes(), 2);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            } else {
                bitmap = null;
            }
            this.ivFotoID.setVisibility(0);
            this.ivFotoID.setImageBitmap(bitmap);
            this.etFotoID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.tilFotoIdentitas.setHintEnabled(true);
        }
        if (!((FormActivity) getActivity()).n.getFotoPribadi().isEmpty()) {
            String fotoPribadi = ((FormActivity) getActivity()).n.getFotoPribadi();
            if (!"".equalsIgnoreCase(fotoPribadi)) {
                byte[] decode2 = Base64.decode(fotoPribadi.getBytes(), 2);
                bitmap2 = BitmapFactory.decodeByteArray(decode2, 0, decode2.length);
            }
            this.ivFotoDiri.setVisibility(0);
            this.ivFotoDiri.setImageBitmap(bitmap2);
            this.etFotoDiri.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.tilFotoDiri.setHintEnabled(true);
        }
        this.etNoIdentitas.addTextChangedListener(this);
        this.etNamaSesuai.addTextChangedListener(this);
        this.rgJenisKelamin.setOnCheckedChangeListener(this);
    }

    @OnClick({2131297044})
    public void showDatePicker(View view) {
        new MasaBerlakuKTPDialog().show(getFragmentManager(), "MasaBerlakuKTPDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribePilihMasaBerlakuEvent(BahasaLayananAdapter$BahasaLayananVH_ViewBinding bahasaLayananAdapter$BahasaLayananVH_ViewBinding) {
        d(this.etFields.indexOf(this.etMasaBerlaku));
        this.tilMasaBerlaku.setHintEnabled(true);
        this.etMasaBerlaku.setError(null);
        if (bahasaLayananAdapter$BahasaLayananVH_ViewBinding.e.equalsIgnoreCase("1")) {
            this.etMasaBerlaku.setText("Seumur hidup");
            ((FormActivity) getActivity()).n.setFlagEKTP("1");
            ((FormActivity) getActivity()).n.setExpID("9999-12-31");
            return;
        }
        this.etMasaBerlaku.setText(bahasaLayananAdapter$BahasaLayananVH_ViewBinding.a);
        ((FormActivity) getActivity()).n.setFlagEKTP("0");
        ((FormActivity) getActivity()).n.setExpID(bahasaLayananAdapter$BahasaLayananVH_ViewBinding.a);
    }
}
