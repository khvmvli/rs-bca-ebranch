package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
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
import com.bca.smartbranch.activity.PilihNegaraActivity;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import com.bca.smartbranch.dialog.AgamaDialog;
import com.bca.smartbranch.dialog.PendidikanTerakhirDialog;
import com.bca.smartbranch.dialog.StatusPerkawinanDialog;
import com.bca.smartbranch.fragment.Page6GLFragment;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.PilihNegaraActivity_ViewBinding;
import o.ProfileActivity;
import o.ReservasiCSOActivity_ViewBinding;
import o.ReservasiListChosenActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.getPromotion;
import o.lewati;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import o.setPadding;
import o.showInfoValueTodayOR;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6GLFragment.class */
public class Page6GLFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver {
    private setMessage a = new setMessage();
    private Validator d;
    @BindView(2131296925)
    @NotEmpty(messageResId = 2131820983, trim = true)
    @Order(6)
    EditText etAgama;
    @BindView(2131296926)
    @NotEmpty(messageResId = 2131820984, trim = true)
    @Order(7)
    EditText etAgamaLainnya;
    @BindViews({2131297141, 2131297058, 2131297197, 2131296925, 2131296926, 2131297080, 2131297033, 2131297207, 2131297105, 2131297044})
    public List<View> etFields;
    @BindView(2131297033)
    @NotEmpty(messageResId = 2131820758, trim = true)
    @Order(2)
    EditText etKotaLahir;
    @BindView(2131297044)
    @NotEmpty(messageResId = 2131820827, trim = true)
    @Order(10)
    public EditText etMasaBerlakuKitas;
    @BindView(2131297058)
    @NotEmpty(messageResId = 2131820849, trim = true)
    @Order(8)
    EditText etNamaIbu;
    @BindView(2131297080)
    @NotEmpty(messageResId = 2131820769, trim = true)
    @Order(1)
    EditText etNegaraLahir;
    @BindView(2131297105)
    @NotEmpty(messageResId = 2131820828, trim = true)
    @Order(9)
    public EditText etNoKitas;
    @BindView(2131297141)
    @NotEmpty(messageResId = 2131820842, trim = true)
    @Order(4)
    EditText etPendidikanTerakhir;
    @BindView(2131297197)
    @NotEmpty(messageResId = 2131820844, trim = true)
    @Order(5)
    EditText etStatusPerkawinan;
    @BindView(2131297207)
    @NotEmpty(messageResId = 2131820746, trim = true)
    @Order(3)
    EditText etTanggalLahir;
    @BindView(2131297865)
    LinearLayout llKitas;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297934)
    LinearLayout llWNA;
    @BindView(2131298170)
    RadioButton rbKitasTidak;
    @BindView(2131298171)
    RadioButton rbKitasYa;
    @BindView(2131298228)
    RadioGroup rgKITAS;
    @BindView(2131298474)
    LogoutDialog_ViewBinding tilAgama;
    @BindView(2131298475)
    LogoutDialog_ViewBinding tilAgamaLainnya;
    @BindViews({2131298686, 2131298605, 2131298729, 2131298474, 2131298475, 2131298626, 2131298580, 2131298739, 2131298651, 2131298591})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKotaLahir;
    @BindView(2131298591)
    public LogoutDialog_ViewBinding tilMasaBerlaku;
    @BindView(2131298605)
    LogoutDialog_ViewBinding tilNamaIbu;
    @BindView(2131298626)
    LogoutDialog_ViewBinding tilNegaraLahir;
    @BindView(2131298651)
    public LogoutDialog_ViewBinding tilNoKitas;
    @BindView(2131298686)
    LogoutDialog_ViewBinding tilPendidikanTerakhir;
    @BindView(2131298729)
    LogoutDialog_ViewBinding tilStatusPerkawinan;
    @BindView(2131298739)
    LogoutDialog_ViewBinding tilTanggalLahir;
    @BindViews({2131299154, 2131299082, 2131299197, 2131298954, 2131298955, 2131299102, 2131299056, 2131299207, 2131299124, 2131299067})
    List<TextView> tvErrors;
    @BindString(2131822363)
    String txtLainnya;

    public void a(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etAgamaLainnya.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etAgamaLainnya)).getVisibility() == 0 && !this.etAgamaLainnya.getText().toString().isEmpty()) {
                a(this.etFields.indexOf(this.etAgamaLainnya));
            }
            ((FormActivity) getActivity()).n.setReligionOthers(editable.toString());
        } else if (editable == this.etNamaIbu.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNamaIbu)).getVisibility() == 0 && !this.etNamaIbu.getText().toString().isEmpty()) {
                a(this.etFields.indexOf(this.etNamaIbu));
            }
            ((FormActivity) getActivity()).n.setMotherMaidenName(editable.toString());
        } else if (editable == this.etKotaLahir.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etKotaLahir)).getVisibility() == 0 && !this.etKotaLahir.getText().toString().isEmpty()) {
                a(this.etFields.indexOf(this.etKotaLahir));
            }
            ((FormActivity) getActivity()).n.setPob(editable.toString());
        } else if (editable == this.etNoKitas.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoKitas)).getVisibility() == 0 && !this.etNoKitas.getText().toString().isEmpty()) {
                a(this.etFields.indexOf(this.etNoKitas));
            }
            ((FormActivity) getActivity()).n.setKitasKitapNumber(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493130;
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        if (showinfovaluetodayor.getTag().equals("DatePickerDialogTanggalLahir")) {
            a(this.etFields.indexOf(this.etTanggalLahir));
            this.tilTanggalLahir.setHintEnabled(true);
            this.etTanggalLahir.setError(null);
            this.etTanggalLahir.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
            ((FormActivity) getActivity()).n.setDob(getAnnualFeeBasicAmount.a(i, i2, i3));
        } else if (showinfovaluetodayor.getTag().equals("DatePickerDialogMasaBerlaku")) {
            a(this.etFields.indexOf(this.etMasaBerlakuKitas));
            this.tilMasaBerlaku.setHintEnabled(true);
            this.etMasaBerlakuKitas.setError(null);
            this.etMasaBerlakuKitas.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
            ((FormActivity) getActivity()).n.setKitasKitapExpDate(getAnnualFeeBasicAmount.a(i, i2, i3));
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.setNoReff
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                Page6GLFragment page6GLFragment = Page6GLFragment.this;
                ((FormActivity) page6GLFragment.getActivity()).n.setLastEducation("");
                ((FormActivity) page6GLFragment.getActivity()).n.setMotherMaidenName("");
                ((FormActivity) page6GLFragment.getActivity()).n.setMaritalStatus("");
                ((FormActivity) page6GLFragment.getActivity()).n.setMaritalStatusValue("");
                ((FormActivity) page6GLFragment.getActivity()).n.setReligion("");
                ((FormActivity) page6GLFragment.getActivity()).n.setReligionValue("");
                ((FormActivity) page6GLFragment.getActivity()).n.setReligionOthers("");
                ((FormActivity) page6GLFragment.getActivity()).n.setCob("");
                ((FormActivity) page6GLFragment.getActivity()).n.setCobIsoCode("");
                ((FormActivity) page6GLFragment.getActivity()).n.setPob("");
                ((FormActivity) page6GLFragment.getActivity()).n.setDob("");
                ((FormActivity) page6GLFragment.getActivity()).n.setKitasKitapFlag("");
                ((FormActivity) page6GLFragment.getActivity()).n.setKitasKitapNumber("");
                ((FormActivity) page6GLFragment.getActivity()).n.setKitasKitapExpDate("");
            }
        });
        if (((FormActivity) getActivity()).n.getTypeID().equals("KTP")) {
            e(2131296811, new Page6FLKTPFragment(), "Page6FLKTPFragment");
        } else if (((FormActivity) getActivity()).n.getTypeID().equals("Paspor")) {
            e(2131296811, new Page6FLPasporFragment(), "Page6FLPasporFragment");
        } else if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
            e(2131296811, new Page6FLKartuPelajarFragment(), "Page6FLKartuPelajarFragment");
        }
    }

    @OnFocusChange({2131297058, 2131296926, 2131297033, 2131297105})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296926:
                    this.tilAgamaLainnya.setHintEnabled(true);
                    return;
                case 2131297033:
                    this.tilKotaLahir.setHintEnabled(true);
                    return;
                case 2131297058:
                    this.tilNamaIbu.setHintEnabled(true);
                    return;
                case 2131297105:
                    this.tilNoKitas.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296926:
                    if (this.etAgamaLainnya.getText().toString().isEmpty()) {
                        this.tilAgamaLainnya.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297033:
                    if (this.etKotaLahir.getText().toString().isEmpty()) {
                        this.tilKotaLahir.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297058:
                    if (this.etNamaIbu.getText().toString().isEmpty()) {
                        this.tilNamaIbu.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297105:
                    if (this.etNoKitas.getText().toString().isEmpty()) {
                        this.tilNoKitas.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
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

    @OnClick({2131297141, 2131297197, 2131296925, 2131297080, 2131297207, 2131297044})
    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case 2131296925:
                AgamaDialog agamaDialog = new AgamaDialog(((FormActivity) getActivity()).y);
                Bundle bundle = new Bundle();
                bundle.putString("agama", this.etAgama.getText().toString());
                agamaDialog.setArguments(bundle);
                agamaDialog.show(getFragmentManager(), "AgamaDialog");
                return;
            case 2131297044:
                Calendar instance = Calendar.getInstance();
                showInfoValueTodayOR e = showInfoValueTodayOR.e(this, instance.get(1), instance.get(2), instance.get(5));
                OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
                Calendar calendar = (Calendar) instance.clone();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                oR2PilihProductFragment_ViewBinding.e = calendar;
                lewati lewati = e.d;
                if (lewati != null) {
                    lewati.c.h();
                }
                int color = getResources().getColor(2131099765);
                e.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
                e.show(getActivity().getFragmentManager(), "DatePickerDialogMasaBerlaku");
                return;
            case 2131297080:
                startActivity(new Intent(getContext(), PilihNegaraActivity.class));
                return;
            case 2131297141:
                PendidikanTerakhirDialog pendidikanTerakhirDialog = new PendidikanTerakhirDialog();
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPendidikanTerakhir.getText().toString());
                pendidikanTerakhirDialog.setArguments(bundle2);
                pendidikanTerakhirDialog.show(getFragmentManager(), "PendidikanTerakhirDialog");
                return;
            case 2131297197:
                StatusPerkawinanDialog statusPerkawinanDialog = new StatusPerkawinanDialog(((FormActivity) getActivity()).s);
                Bundle bundle3 = new Bundle();
                bundle3.putString("status", this.etStatusPerkawinan.getText().toString());
                statusPerkawinanDialog.setArguments(bundle3);
                statusPerkawinanDialog.show(getFragmentManager(), "StatusPerkawinanDialog");
                return;
            case 2131297207:
                Calendar instance2 = Calendar.getInstance();
                GregorianCalendar gregorianCalendar = new GregorianCalendar(1901, 0, 1);
                showInfoValueTodayOR e2 = showInfoValueTodayOR.e(this, instance2.get(1), instance2.get(2), instance2.get(5));
                OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding2 = e2.b;
                Calendar calendar2 = (Calendar) instance2.clone();
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                oR2PilihProductFragment_ViewBinding2.b = calendar2;
                lewati lewati2 = e2.d;
                if (lewati2 != null) {
                    lewati2.c.h();
                }
                OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding3 = e2.b;
                Calendar calendar3 = (Calendar) gregorianCalendar.clone();
                calendar3.set(11, 0);
                calendar3.set(12, 0);
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                oR2PilihProductFragment_ViewBinding3.e = calendar3;
                lewati lewati3 = e2.d;
                if (lewati3 != null) {
                    lewati3.c.h();
                }
                int color2 = getResources().getColor(2131099765);
                e2.a = Color.argb(255, Color.red(color2), Color.green(color2), Color.blue(color2));
                e2.show(getActivity().getFragmentManager(), "DatePickerDialogTanggalLahir");
                return;
            default:
                return;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegara(PilihNegaraActivity_ViewBinding pilihNegaraActivity_ViewBinding) {
        a(this.etFields.indexOf(this.etNegaraLahir));
        this.etNegaraLahir.setError(null);
        this.tilNegaraLahir.setHintEnabled(true);
        this.etNegaraLahir.setText(pilihNegaraActivity_ViewBinding.e);
        ((FormActivity) getActivity()).n.setCob(pilihNegaraActivity_ViewBinding.e);
        ((FormActivity) getActivity()).n.setCobIsoCode(pilihNegaraActivity_ViewBinding.a);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueAgamaEvent(ProfileActivity profileActivity) {
        a(this.etFields.indexOf(this.etAgama));
        this.etAgama.setError(null);
        this.tilAgama.setHintEnabled(true);
        this.etAgama.setText(profileActivity.b);
        ((FormActivity) getActivity()).n.setReligion(profileActivity.c);
        ((FormActivity) getActivity()).n.setReligionValue(profileActivity.b);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValuePendidikanEvent(ReservasiCSOActivity_ViewBinding reservasiCSOActivity_ViewBinding) {
        a(this.etFields.indexOf(this.etPendidikanTerakhir));
        this.etPendidikanTerakhir.setError(null);
        this.tilPendidikanTerakhir.setHintEnabled(true);
        this.etPendidikanTerakhir.setText(reservasiCSOActivity_ViewBinding.d);
        ((FormActivity) getActivity()).n.setLastEducation(reservasiCSOActivity_ViewBinding.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValuePerkawinanEvent(ReservasiListChosenActivity_ViewBinding reservasiListChosenActivity_ViewBinding) {
        a(this.etFields.indexOf(this.etStatusPerkawinan));
        this.etStatusPerkawinan.setError(null);
        this.tilStatusPerkawinan.setHintEnabled(true);
        this.etStatusPerkawinan.setText(reservasiListChosenActivity_ViewBinding.d);
        ((FormActivity) getActivity()).n.setMaritalStatus(reservasiListChosenActivity_ViewBinding.c);
        ((FormActivity) getActivity()).n.setMaritalStatusValue(reservasiListChosenActivity_ViewBinding.d);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        documentProvider.b().e(this);
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
                    case 2131296925:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilAgama.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296926:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilAgamaLainnya.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297033:
                        this.tvErrors.get(6).setVisibility(0);
                        this.tvErrors.get(6).setText(message);
                        this.tilKotaLahir.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297044:
                        this.tvErrors.get(9).setVisibility(0);
                        this.tvErrors.get(9).setText(message);
                        this.tilMasaBerlaku.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297058:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilNamaIbu.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297080:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
                        this.tilNegaraLahir.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297105:
                        this.tvErrors.get(8).setVisibility(0);
                        this.tvErrors.get(8).setText(message);
                        this.tilNoKitas.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297141:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilPendidikanTerakhir.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297197:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilStatusPerkawinan.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297207:
                        this.tvErrors.get(7).setVisibility(0);
                        this.tvErrors.get(7).setText(message);
                        this.tilTanggalLahir.setBackgroundResource(2131230870);
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
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new Page6HLFragment(), "Page6HLFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.d = validator;
        validator.setValidationListener(this);
        ((FormActivity) getActivity()).n.setCurrentPage("Page6GLFragment");
        this.etPendidikanTerakhir.setText(((FormActivity) getActivity()).n.getLastEducation());
        if (!((FormActivity) getActivity()).n.getLastEducation().isEmpty()) {
            this.tilPendidikanTerakhir.setHintEnabled(true);
        }
        this.etNamaIbu.setText(((FormActivity) getActivity()).n.getMotherMaidenName());
        if (!((FormActivity) getActivity()).n.getMotherMaidenName().isEmpty()) {
            this.tilNamaIbu.setHintEnabled(true);
        }
        this.etNegaraLahir.setText(((FormActivity) getActivity()).n.getCob());
        if (!((FormActivity) getActivity()).n.getCob().isEmpty()) {
            this.tilNegaraLahir.setHintEnabled(true);
        }
        this.etKotaLahir.setText(((FormActivity) getActivity()).n.getPob());
        if (!((FormActivity) getActivity()).n.getPob().isEmpty()) {
            this.tilKotaLahir.setHintEnabled(true);
        }
        this.etTanggalLahir.setText(((FormActivity) getActivity()).n.getDob());
        if (!((FormActivity) getActivity()).n.getDob().isEmpty()) {
            this.tilTanggalLahir.setHintEnabled(true);
        }
        this.etStatusPerkawinan.setText(((FormActivity) getActivity()).n.getMaritalStatusValue());
        if (!((FormActivity) getActivity()).n.getMaritalStatus().isEmpty()) {
            this.tilStatusPerkawinan.setHintEnabled(true);
        }
        this.etAgama.setText(((FormActivity) getActivity()).n.getReligionValue());
        if (!((FormActivity) getActivity()).n.getReligion().isEmpty()) {
            this.tilAgama.setHintEnabled(true);
        }
        if (((FormActivity) getActivity()).n.getTypeID().equals("Paspor")) {
            this.llWNA.setVisibility(0);
        }
        if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
            for (GetAcctOpeningCategoryDataResponse.Content content : ((FormActivity) getActivity()).s) {
                if (content.getContentName().getIndonesian().equalsIgnoreCase("Lajang")) {
                    this.etStatusPerkawinan.setText(content.getContentName().getIndonesian());
                    this.tilStatusPerkawinan.setHintEnabled(true);
                    ((FormActivity) getActivity()).n.setMaritalStatus(content.getContentOrder());
                    ((FormActivity) getActivity()).n.setMaritalStatusValue(content.getContentName().getIndonesian());
                }
            }
        } else {
            this.etStatusPerkawinan.setEnabled(true);
            this.tilStatusPerkawinan.setBackgroundResource(2131230847);
            this.tilStatusPerkawinan.setHintTextAppearance(2131886846);
            this.tilStatusPerkawinan.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
        }
        String kitasKitapFlag = ((FormActivity) getActivity()).n.getKitasKitapFlag();
        kitasKitapFlag.hashCode();
        if (!kitasKitapFlag.equals("1")) {
            if (!kitasKitapFlag.equals("2")) {
                ((FormActivity) getActivity()).n.setKitasKitapFlag("1");
            } else {
                this.rbKitasYa.setChecked(true);
                this.llKitas.setVisibility(0);
                this.etNoKitas.setText(((FormActivity) getActivity()).n.getKitasKitapNumber());
                this.etMasaBerlakuKitas.setText(((FormActivity) getActivity()).n.getKitasKitapExpDate());
                if (!((FormActivity) getActivity()).n.getKitasKitapNumber().isEmpty()) {
                    this.tilNoKitas.setHintEnabled(true);
                }
                if (!((FormActivity) getActivity()).n.getKitasKitapExpDate().isEmpty()) {
                    this.tilMasaBerlaku.setHintEnabled(true);
                }
                this.rgKITAS.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment.5
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                        switch (i) {
                            case 2131298170:
                                getPromotion.d(Page6GLFragment.this.getActivity());
                                setMessage setmessage = Page6GLFragment.this.a;
                                LinearLayout linearLayout = Page6GLFragment.this.llKitas;
                                setmessage.a = linearLayout.getMeasuredHeight();
                                setmessage.b = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: IPUT  
                                      (wrap: o.setMessage$1 : 0x0066: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v6 'setmessage' o.setMessage), (r0v9 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                      (r0v6 'setmessage' o.setMessage)
                                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6GLFragment.5.onCheckedChanged(android.widget.RadioGroup, int):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6GLFragment$5.class
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:266)
                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
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
                                    	... 21 more
                                    */
                                /*
                                    this = this;
                                    r0 = r8
                                    switch(r0) {
                                        case 2131298170: goto L_0x003d;
                                        case 2131298171: goto L_0x0019;
                                        default: goto L_0x0018;
                                    }
                                L_0x0018:
                                    return
                                L_0x0019:
                                    r0 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    o.setMessage r0 = com.bca.smartbranch.fragment.Page6GLFragment.a(r0)
                                    r1 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r1 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    android.widget.LinearLayout r1 = r1.llKitas
                                    r0.c(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    o.getView r0 = r0.getActivity()
                                    com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                                    com.bca.smartbranch.data.localdb.Account r0 = r0.n
                                    java.lang.String r1 = "2"
                                    r0.setKitasKitapFlag(r1)
                                    return
                                L_0x003d:
                                    r0 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    o.getView r0 = r0.getActivity()
                                    o.getPromotion.d(r0)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    o.setMessage r0 = com.bca.smartbranch.fragment.Page6GLFragment.a(r0)
                                    r7 = r0
                                    r0 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    android.widget.LinearLayout r0 = r0.llKitas
                                    r9 = r0
                                    r0 = r7
                                    r1 = r9
                                    int r1 = r1.getMeasuredHeight()
                                    r0.a = r1
                                    r0 = r7
                                    o.setMessage$1 r1 = new o.setMessage$1
                                    r2 = r1
                                    r3 = r7
                                    r4 = r9
                                    r2.<init>(r4)
                                    r0.b = r1
                                    r0 = r7
                                    r1 = r9
                                    r0.b(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    o.getView r0 = r0.getActivity()
                                    com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                                    com.bca.smartbranch.data.localdb.Account r0 = r0.n
                                    java.lang.String r1 = "1"
                                    r0.setKitasKitapFlag(r1)
                                    android.os.Handler r0 = new android.os.Handler
                                    r1 = r0
                                    r1.<init>()
                                    o.UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable r1 = new o.UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable
                                    r2 = r1
                                    r3 = r6
                                    r2.<init>(r3)
                                    r2 = r6
                                    com.bca.smartbranch.fragment.Page6GLFragment r2 = com.bca.smartbranch.fragment.Page6GLFragment.this
                                    o.setMessage r2 = com.bca.smartbranch.fragment.Page6GLFragment.a(r2)
                                    int r2 = r2.e
                                    long r2 = (long) r2
                                    boolean r0 = r0.postDelayed(r1, r2)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6GLFragment.AnonymousClass5.onCheckedChanged(android.widget.RadioGroup, int):void");
                            }
                        });
                        this.etNamaIbu.addTextChangedListener(this);
                        this.etAgamaLainnya.addTextChangedListener(this);
                        this.etKotaLahir.addTextChangedListener(this);
                        this.etNoKitas.addTextChangedListener(this);
                    }
                }
                this.rbKitasTidak.setChecked(true);
                this.llKitas.setVisibility(8);
                this.rgKITAS.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment.5
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: IPUT  
                          (wrap: o.setMessage$1 : 0x0066: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v6 'setmessage' o.setMessage), (r0v9 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                          (r0v6 'setmessage' o.setMessage)
                         o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6GLFragment.5.onCheckedChanged(android.widget.RadioGroup, int):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6GLFragment$5.class
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:266)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 16 more
                        */
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.RadioGroup r7, int r8) {
                        /*
                            r6 = this;
                            r0 = r8
                            switch(r0) {
                                case 2131298170: goto L_0x003d;
                                case 2131298171: goto L_0x0019;
                                default: goto L_0x0018;
                            }
                        L_0x0018:
                            return
                        L_0x0019:
                            r0 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            o.setMessage r0 = com.bca.smartbranch.fragment.Page6GLFragment.a(r0)
                            r1 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r1 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            android.widget.LinearLayout r1 = r1.llKitas
                            r0.c(r1)
                            r0 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            o.getView r0 = r0.getActivity()
                            com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                            com.bca.smartbranch.data.localdb.Account r0 = r0.n
                            java.lang.String r1 = "2"
                            r0.setKitasKitapFlag(r1)
                            return
                        L_0x003d:
                            r0 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            o.getView r0 = r0.getActivity()
                            o.getPromotion.d(r0)
                            r0 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            o.setMessage r0 = com.bca.smartbranch.fragment.Page6GLFragment.a(r0)
                            r7 = r0
                            r0 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            android.widget.LinearLayout r0 = r0.llKitas
                            r9 = r0
                            r0 = r7
                            r1 = r9
                            int r1 = r1.getMeasuredHeight()
                            r0.a = r1
                            r0 = r7
                            o.setMessage$1 r1 = new o.setMessage$1
                            r2 = r1
                            r3 = r7
                            r4 = r9
                            r2.<init>(r4)
                            r0.b = r1
                            r0 = r7
                            r1 = r9
                            r0.b(r1)
                            r0 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r0 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            o.getView r0 = r0.getActivity()
                            com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                            com.bca.smartbranch.data.localdb.Account r0 = r0.n
                            java.lang.String r1 = "1"
                            r0.setKitasKitapFlag(r1)
                            android.os.Handler r0 = new android.os.Handler
                            r1 = r0
                            r1.<init>()
                            o.UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable r1 = new o.UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable
                            r2 = r1
                            r3 = r6
                            r2.<init>(r3)
                            r2 = r6
                            com.bca.smartbranch.fragment.Page6GLFragment r2 = com.bca.smartbranch.fragment.Page6GLFragment.this
                            o.setMessage r2 = com.bca.smartbranch.fragment.Page6GLFragment.a(r2)
                            int r2 = r2.e
                            long r2 = (long) r2
                            boolean r0 = r0.postDelayed(r1, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6GLFragment.AnonymousClass5.onCheckedChanged(android.widget.RadioGroup, int):void");
                    }
                });
                this.etNamaIbu.addTextChangedListener(this);
                this.etAgamaLainnya.addTextChangedListener(this);
                this.etKotaLahir.addTextChangedListener(this);
                this.etNoKitas.addTextChangedListener(this);
            }
        }
