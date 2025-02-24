package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.PhotoCardActivity;
import com.bca.smartbranch.dialog.CameraDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment;
import com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter;
import com.bca.smartbranch.presenter.OcrPresenter;
import com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bumptech.glide.Glide;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.FotoActivity_ViewBinding;
import o.GetPPUNumberResponse;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PhotoCardActivity_ViewBinding;
import o.PilihKantorCabangActivity;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeAddOnAmount;
import o.getCurrencyCode;
import o.getPromotion;
import o.getRelationCode;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
import o.ubahProfil;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC10KTPFormKartuKreditFragment.class */
public class CC10KTPFormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer, OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private CheckCCValidApplicantPresenter a;
    public String d;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(5)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    getAnnualFeeAddOnAmount etEmail;
    @BindViews({2131297103, 2131297060, 2131297062, 2131297094, 2131296976})
    List<View> etFields;
    @BindView(2131296982)
    EditText etFotoID;
    @BindView(2131297060)
    @NotEmpty(messageResId = 2131820865, trim = true)
    @Order(2)
    EditText etNamaIdentitas;
    @BindView(2131297062)
    @NotEmpty(messageResId = 2131820855, trim = true)
    @Order(3)
    EditText etNamaLengkap;
    @BindView(2131297094)
    @NotEmpty(messageResId = 2131820902, sequence = 3, trim = true)
    @Order(4)
    EditText etNoHP;
    @Order(1)
    @BindView(2131297103)
    @NotEmpty(messageResId = 2131820937, sequence = 1, trim = true)
    @Length(messageResId = 2131820938, min = 16, sequence = 2)
    EditText etNoIdentitas;
    private int f;
    private Validator h;
    @BindString(2131820963)
    String invalidFotoKtp;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindView(2131297363)
    Page6CSFragment ivFotoID;
    private OcrPresenter j;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298649, 2131298607, 2131298609, 2131298640, 2131298527})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298531)
    LogoutDialog_ViewBinding tilFotoKtp;
    @BindView(2131298607)
    LogoutDialog_ViewBinding tilNamaIdentitas;
    @BindView(2131298609)
    LogoutDialog_ViewBinding tilNamaLengkap;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298649)
    LogoutDialog_ViewBinding tilNoIdentitas;
    @BindView(2131299009)
    TextView tvErrorFotoId;
    @BindViews({2131299122, 2131299084, 2131299086, 2131299115, 2131299006})
    List<TextView> tvErrors;

    private void b() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    static /* synthetic */ void b(CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC10KTPFormKartuKreditFragment.tvErrors, cC10KTPFormKartuKreditFragment.tilForms, cC10KTPFormKartuKreditFragment.etFields, editText);
    }

    static /* synthetic */ void d(CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment, EditText editText) {
        getPromotion.c(cC10KTPFormKartuKreditFragment.getContext(), cC10KTPFormKartuKreditFragment.tvErrors, cC10KTPFormKartuKreditFragment.tilForms, cC10KTPFormKartuKreditFragment.etFields, editText);
    }

    static /* synthetic */ void e(CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment, EditText editText) {
        getPromotion.d(cC10KTPFormKartuKreditFragment.getContext(), cC10KTPFormKartuKreditFragment.tvErrors, cC10KTPFormKartuKreditFragment.tilForms, cC10KTPFormKartuKreditFragment.etFields, editText);
    }

    private void j() {
        Intent intent = new Intent(getActivity(), PhotoCardActivity.class);
        intent.putExtra("TAKE_FOTO", this.f);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void a() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        h();
        c(2131296811, new CC11FormKartuKreditFragment(), "CC11FormKartuKreditFragment");
    }

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC10KTPFormKartuKreditFragment.this.etNoIdentitas.getEditableText()) {
                        CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment = CC10KTPFormKartuKreditFragment.this;
                        CC10KTPFormKartuKreditFragment.e(cC10KTPFormKartuKreditFragment, cC10KTPFormKartuKreditFragment.etNoIdentitas);
                        ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setIdentityCardNumber(editable.toString());
                    } else if (editable == CC10KTPFormKartuKreditFragment.this.etNamaIdentitas.getEditableText()) {
                        CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment2 = CC10KTPFormKartuKreditFragment.this;
                        CC10KTPFormKartuKreditFragment.b(cC10KTPFormKartuKreditFragment2, cC10KTPFormKartuKreditFragment2.etNamaIdentitas);
                        ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setCustomerName(editable.toString());
                    } else if (editable == CC10KTPFormKartuKreditFragment.this.etNamaLengkap.getEditableText()) {
                        CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment3 = CC10KTPFormKartuKreditFragment.this;
                        CC10KTPFormKartuKreditFragment.b(cC10KTPFormKartuKreditFragment3, cC10KTPFormKartuKreditFragment3.etNamaLengkap);
                        ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setCustomerFullName(editable.toString());
                    } else if (editable == CC10KTPFormKartuKreditFragment.this.etNoHP.getEditableText()) {
                        CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment4 = CC10KTPFormKartuKreditFragment.this;
                        CC10KTPFormKartuKreditFragment.b(cC10KTPFormKartuKreditFragment4, cC10KTPFormKartuKreditFragment4.etNoHP);
                        ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setMobileNumber(editable.toString());
                    } else if (editable == CC10KTPFormKartuKreditFragment.this.etEmail.getEditableText()) {
                        CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment5 = CC10KTPFormKartuKreditFragment.this;
                        CC10KTPFormKartuKreditFragment.d(cC10KTPFormKartuKreditFragment5, cC10KTPFormKartuKreditFragment5.etEmail);
                        ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setEmailAddr(editable.toString());
                    }
                }
            });
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
        return 2131493165;
    }

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((CC8FormKartuKreditActivity) getActivity()).llMain, str, 0).g();
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

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void e() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((CC8FormKartuKreditActivity) getActivity()).llMain, str, -1).g();
    }

    @OnClick({2131296982, 2131297363})
    public void fotoID(View view) {
        this.f = 1;
        if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardImg().isEmpty()) {
            j();
        } else {
            new CameraDialog().show(getFragmentManager(), "CameraDialog");
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setIdentityCardImg("");
                ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setIdentityCardNumber("");
                ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setCustomerName("");
                ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setCustomerFullName("");
                ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setMobileNumber("");
                ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setEmailAddr("");
            }
        });
        e(2131296811, new CC9FormKartuKreditFragment(), "CC9FormKartuKreditFragment");
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((CC8FormKartuKreditActivity) getActivity()).llMain, str, -1).g();
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        getPromotion.d(getContext());
        this.tilFotoKtp.setBackgroundResource(2131230847);
        this.tvErrorFotoId.setVisibility(8);
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.h.validate();
    }

    @OnFocusChange({2131297103, 2131297060, 2131297062, 2131297094, 2131296976})
    public void onChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296976:
                    this.tilEmail.setHintEnabled(true);
                    return;
                case 2131297060:
                    this.tilNamaIdentitas.setHintEnabled(true);
                    return;
                case 2131297062:
                    this.tilNamaLengkap.setHintEnabled(true);
                    return;
                case 2131297094:
                    this.tilNoHp.setHintEnabled(true);
                    return;
                case 2131297103:
                    this.tilNoIdentitas.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296976:
                    if (this.etEmail.getText().toString().isEmpty()) {
                        this.tilEmail.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297060:
                    if (this.etNamaIdentitas.getText().toString().isEmpty()) {
                        this.tilNamaIdentitas.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297062:
                    if (this.etNamaLengkap.getText().toString().isEmpty()) {
                        this.tilNamaLengkap.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297094:
                    if (this.etNoHP.getText().toString().isEmpty()) {
                        this.tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297103:
                    if (this.etNoIdentitas.getText().toString().isEmpty()) {
                        this.tilNoIdentitas.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
    public void onChooseCameraEvent(PilihKantorCabangActivity pilihKantorCabangActivity) {
        if (pilihKantorCabangActivity.c) {
            j();
        } else {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.8
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (CC10KTPFormKartuKreditFragment.this.f == 1) {
                        ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setIdentityCardImg("");
                        CC10KTPFormKartuKreditFragment.this.etFotoID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231142, 0);
                        CC10KTPFormKartuKreditFragment.this.ivFotoID.setVisibility(8);
                        CC10KTPFormKartuKreditFragment.this.tilFotoKtp.setHintEnabled(false);
                        CC10KTPFormKartuKreditFragment.this.etFotoID.setText("");
                    }
                }
            });
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueFotoID(ubahProfil ubahprofil) {
        this.tvErrorFotoId.setVisibility(8);
        this.tilFotoKtp.setBackgroundResource(2131230847);
        this.etFotoID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.ivFotoID.setVisibility(0);
        this.tilFotoKtp.setHintEnabled(true);
        this.etFotoID.setText("  ");
        Glide.d(getContext()).e(ubahprofil.e).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoID);
        this.d = getPromotion.b(ubahprofil.e);
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.setPromotionCode
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment = CC10KTPFormKartuKreditFragment.this;
                ((CC8FormKartuKreditActivity) cC10KTPFormKartuKreditFragment.getActivity()).n.setIdentityCardImg(cC10KTPFormKartuKreditFragment.d);
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            b();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558409, menu);
        onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        documentProvider.b().e(this);
        CheckCCValidApplicantPresenter checkCCValidApplicantPresenter = this.a;
        Call<OpenAccountSuccessActivity<Object>> call = checkCCValidApplicantPresenter.a;
        if (call != null) {
            call.cancel();
        }
        checkCCValidApplicantPresenter.d = null;
        OcrPresenter ocrPresenter = this.j;
        Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> call2 = ocrPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        ocrPresenter.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setIdentityCardImg("");
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setIdentityCardNumber("");
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setCustomerName("");
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setCustomerFullName("");
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setMobileNumber("");
                    ((CC8FormKartuKreditActivity) CC10KTPFormKartuKreditFragment.this.getActivity()).n.setEmailAddr("");
                }
            });
            e(2131296811, new CC9FormKartuKreditFragment(), "CC9FormKartuKreditFragment");
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (((CC8FormKartuKreditActivity) getActivity()).p.isMember()) {
                new SimpanDraftDialog().show(getFragmentManager(), "SimpanDraftDialog");
                return true;
            }
            new YakinKeluarDialog().show(getFragmentManager(), "YakinKeluarDialog");
            return true;
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
                    case 2131296976:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilEmail.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297060:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilNamaIdentitas.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297062:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilNamaLengkap.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297094:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilNoHp.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297103:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilNoIdentitas.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    default:
                        editText = editText2;
                        continue;
                }
            } else {
                b(((CC8FormKartuKreditActivity) getActivity()).llMain, message);
            }
        }
        if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardImg().isEmpty()) {
            this.tvErrorFotoId.setVisibility(0);
            this.tvErrorFotoId.setText(this.invalidFotoKtp);
            this.tilFotoKtp.setBackgroundResource(2131230870);
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardImg().isEmpty()) {
            this.tvErrorFotoId.setVisibility(0);
            this.tvErrorFotoId.setText(this.invalidFotoKtp);
            this.tilFotoKtp.setBackgroundResource(2131230870);
            return;
        }
        this.a.b(new FotoActivity_ViewBinding(this.etNoIdentitas.getText().toString(), "KTP"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bitmap bitmap;
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        CheckCCValidApplicantPresenter checkCCValidApplicantPresenter = new CheckCCValidApplicantPresenter();
        this.a = checkCCValidApplicantPresenter;
        checkCCValidApplicantPresenter.d = this;
        OcrPresenter ocrPresenter = new OcrPresenter();
        this.j = ocrPresenter;
        ocrPresenter.c = this;
        Validator validator = new Validator(this);
        this.h = validator;
        validator.setValidationListener(this);
        if (this.etNoHP.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
            Validator validator2 = this.h;
            EditText editText = this.etNoHP;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0091: INVOKE  
                  (r0v116 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v118 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v7 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x008d: CONSTRUCTOR  
                  (r0v118 'editText' android.widget.EditText)
                  (r0v110 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC10KTPFormKartuKreditFragment.class
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
            // Method dump skipped, instructions count: 571
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }
    }
