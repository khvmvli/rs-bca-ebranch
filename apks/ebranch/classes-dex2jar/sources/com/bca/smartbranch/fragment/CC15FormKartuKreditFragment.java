package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.dialog.CategoryListDialog;
import com.bca.smartbranch.dialog.PilihTahunBulanDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import o.AgamaAdapter$AgamaVH_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCardCode;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC15FormKartuKreditFragment.class */
public class CC15FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private List<CategoryResponse> a;
    private List<CategoryResponse> d;
    @BindView(2131296931)
    @NotEmpty(messageResId = 2131820955, trim = true)
    @Order(6)
    EditText etAlamat;
    @BindView(2131296967)
    @NotEmpty(messageResId = 2131820754, trim = true)
    @Order(3)
    EditText etBidangUsaha;
    @BindView(2131296979)
    EditText etExtKantor;
    @BindViews({2131297074, 2131296992, 2131296967, 2131297004, 2131297041, 2131296931, 2131297033, 2131297022, 2131297219})
    List<View> etFields;
    @BindView(2131296992)
    @NotEmpty(messageResId = 2131820808, trim = true)
    @Order(2)
    EditText etJabatan;
    @BindView(2131297004)
    @NotEmpty(messageResId = 2131820816, trim = true)
    @Order(4)
    EditText etJenisUsaha;
    @Order(8)
    @BindView(2131297022)
    @NotEmpty(messageResId = 2131820977, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    EditText etKodePos;
    @BindView(2131297033)
    @NotEmpty(messageResId = 2131820760, trim = true)
    @Order(7)
    getCardCode etKota;
    @BindView(2131297041)
    @NotEmpty(messageResId = 2131820840, trim = true)
    @Order(5)
    EditText etLamaKerja;
    @BindView(2131297074)
    @NotEmpty(messageResId = 2131820766, trim = true)
    @Order(1)
    EditText etNama;
    @BindView(2131297219)
    @NotEmpty(messageResId = 2131821020, sequence = 1, trim = true)
    @Order(9)
    EditText etTlpKantor;
    private Validator h;
    @BindString(2131820953)
    String invalidTeleponMessage;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298480)
    LogoutDialog_ViewBinding tilAlamat;
    @BindView(2131298517)
    LogoutDialog_ViewBinding tilBidangUsaha;
    @BindView(2131298529)
    LogoutDialog_ViewBinding tilExtKantor;
    @BindViews({2131298620, 2131298541, 2131298517, 2131298552, 2131298588, 2131298480, 2131298580, 2131298568, 2131298750})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298541)
    LogoutDialog_ViewBinding tilJabatan;
    @BindView(2131298552)
    LogoutDialog_ViewBinding tilJenisUsaha;
    @BindView(2131298568)
    LogoutDialog_ViewBinding tilKodePos;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKota;
    @BindView(2131298588)
    LogoutDialog_ViewBinding tilLamaKerja;
    @BindView(2131298620)
    LogoutDialog_ViewBinding tilNama;
    @BindView(2131298750)
    LogoutDialog_ViewBinding tilTlpKantor;
    @BindViews({2131299096, 2131299016, 2131298996, 2131299028, 2131299064, 2131298960, 2131299056, 2131299045, 2131299219})
    List<TextView> tvErrors;

    private void a() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    static /* synthetic */ void b(CC15FormKartuKreditFragment cC15FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC15FormKartuKreditFragment.tvErrors, cC15FormKartuKreditFragment.tilForms, cC15FormKartuKreditFragment.etFields, editText);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void SubscribeExpired(final AgamaAdapter$AgamaVH_ViewBinding agamaAdapter$AgamaVH_ViewBinding) {
        this.etLamaKerja.setError(null);
        if (agamaAdapter$AgamaVH_ViewBinding.e > 0 && agamaAdapter$AgamaVH_ViewBinding.b > 0) {
            this.etLamaKerja.setText(getString(2131822367, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.e), Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.b)));
        } else if (agamaAdapter$AgamaVH_ViewBinding.e > 0) {
            this.etLamaKerja.setText(getString(2131822366, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.e)));
        } else {
            this.etLamaKerja.setText(getString(2131822364, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.b)));
        }
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CreditCard creditCard = ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n;
                StringBuilder sb = new StringBuilder();
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"));
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e), 2, "0"));
                creditCard.setCurrWorkPeriod(sb.toString());
            }
        });
        this.tilLamaKerja.setHintEnabled(true);
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etLamaKerja);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC15FormKartuKreditFragment.this.etNama.getEditableText()) {
                        CC15FormKartuKreditFragment cC15FormKartuKreditFragment = CC15FormKartuKreditFragment.this;
                        CC15FormKartuKreditFragment.b(cC15FormKartuKreditFragment, cC15FormKartuKreditFragment.etNama);
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyName(editable.toString());
                    } else if (editable == CC15FormKartuKreditFragment.this.etAlamat.getEditableText()) {
                        CC15FormKartuKreditFragment cC15FormKartuKreditFragment2 = CC15FormKartuKreditFragment.this;
                        CC15FormKartuKreditFragment.b(cC15FormKartuKreditFragment2, cC15FormKartuKreditFragment2.etAlamat);
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeAddress(editable.toString());
                    } else if (editable == CC15FormKartuKreditFragment.this.etKota.getEditableText()) {
                        CC15FormKartuKreditFragment cC15FormKartuKreditFragment3 = CC15FormKartuKreditFragment.this;
                        CC15FormKartuKreditFragment.b(cC15FormKartuKreditFragment3, cC15FormKartuKreditFragment3.etKota);
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeCity(editable.toString());
                    } else if (editable == CC15FormKartuKreditFragment.this.etKodePos.getEditableText()) {
                        if (CC15FormKartuKreditFragment.this.tvErrors.get(CC15FormKartuKreditFragment.this.etFields.indexOf(CC15FormKartuKreditFragment.this.etKodePos)).getVisibility() == 0) {
                            if (CC15FormKartuKreditFragment.this.tvErrors.get(CC15FormKartuKreditFragment.this.etFields.indexOf(CC15FormKartuKreditFragment.this.etKodePos)).getText().toString().equals(CC15FormKartuKreditFragment.this.getString(2131820979))) {
                                if (CC15FormKartuKreditFragment.this.etKodePos.getText().toString().length() == 5) {
                                    List<TextView> list = CC15FormKartuKreditFragment.this.tvErrors;
                                    List<LogoutDialog_ViewBinding> list2 = CC15FormKartuKreditFragment.this.tilForms;
                                    int indexOf = CC15FormKartuKreditFragment.this.etFields.indexOf(CC15FormKartuKreditFragment.this.etKodePos);
                                    list.get(indexOf).setVisibility(8);
                                    list2.get(indexOf).setBackgroundResource(2131230847);
                                }
                            } else if (!CC15FormKartuKreditFragment.this.etKodePos.getText().toString().isEmpty()) {
                                List<TextView> list3 = CC15FormKartuKreditFragment.this.tvErrors;
                                List<LogoutDialog_ViewBinding> list4 = CC15FormKartuKreditFragment.this.tilForms;
                                int indexOf2 = CC15FormKartuKreditFragment.this.etFields.indexOf(CC15FormKartuKreditFragment.this.etKodePos);
                                list3.get(indexOf2).setVisibility(8);
                                list4.get(indexOf2).setBackgroundResource(2131230847);
                            }
                        }
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePostCode(editable.toString());
                    } else if (editable == CC15FormKartuKreditFragment.this.etTlpKantor.getEditableText()) {
                        CC15FormKartuKreditFragment cC15FormKartuKreditFragment4 = CC15FormKartuKreditFragment.this;
                        CC15FormKartuKreditFragment.b(cC15FormKartuKreditFragment4, cC15FormKartuKreditFragment4.etTlpKantor);
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePhoneNumber(editable.toString());
                    } else if (editable == CC15FormKartuKreditFragment.this.etExtKantor.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeExtensionNumber(editable.toString());
                    } else if (editable == CC15FormKartuKreditFragment.this.etJabatan.getEditableText()) {
                        CC15FormKartuKreditFragment cC15FormKartuKreditFragment5 = CC15FormKartuKreditFragment.this;
                        CC15FormKartuKreditFragment.b(cC15FormKartuKreditFragment5, cC15FormKartuKreditFragment5.etJabatan);
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyPosition(editable.toString());
                    } else if (editable == CC15FormKartuKreditFragment.this.etJenisUsaha.getEditableText()) {
                        CC15FormKartuKreditFragment cC15FormKartuKreditFragment6 = CC15FormKartuKreditFragment.this;
                        CC15FormKartuKreditFragment.b(cC15FormKartuKreditFragment6, cC15FormKartuKreditFragment6.etJenisUsaha);
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyBusinessType(editable.toString());
                    }
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493171;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyName("");
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyBusinessType("");
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyPosition("");
                if (((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField() != null) {
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField().deleteFromRealm();
                }
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrWorkPeriod("");
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeAddress("");
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeCity("");
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePostCode("");
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePhoneNumber("");
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeExtensionNumber("");
            }
        });
        e(2131296811, new CC14FormKartuKreditPekerjaanFragment(), "CC14FormKartuKreditPekerjaanFragment");
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
        this.h.validate();
    }

    @OnFocusChange({2131297074, 2131296992, 2131297004, 2131296931, 2131297033, 2131297022, 2131297219, 2131296979})
    public void onChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296931:
                    this.tilAlamat.setHintEnabled(true);
                    return;
                case 2131296979:
                    this.tilExtKantor.setHintEnabled(true);
                    return;
                case 2131296992:
                    this.tilJabatan.setHintEnabled(true);
                    return;
                case 2131297004:
                    this.tilJenisUsaha.setHintEnabled(true);
                    return;
                case 2131297022:
                    this.tilKodePos.setHintEnabled(true);
                    return;
                case 2131297033:
                    this.tilKota.setHintEnabled(true);
                    return;
                case 2131297074:
                    this.tilNama.setHintEnabled(true);
                    return;
                case 2131297219:
                    this.tilTlpKantor.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296931:
                    if (this.etAlamat.getText().toString().isEmpty()) {
                        this.tilAlamat.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296979:
                    if (this.etExtKantor.getText().toString().isEmpty()) {
                        this.tilExtKantor.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296992:
                    if (this.etJabatan.getText().toString().isEmpty()) {
                        this.tilJabatan.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297004:
                    if (this.etJenisUsaha.getText().toString().isEmpty()) {
                        this.tilJenisUsaha.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297022:
                    if (this.etKodePos.getText().toString().isEmpty()) {
                        this.tilKodePos.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297033:
                    if (this.etKota.getText().toString().isEmpty()) {
                        this.tilKota.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297074:
                    if (this.etNama.getText().toString().isEmpty()) {
                        this.tilNama.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297219:
                    if (this.etTlpKantor.getText().toString().isEmpty()) {
                        this.tilTlpKantor.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCategoryEvent(final CategoryListDialog.write write) {
        this.etBidangUsaha.setError(null);
        this.etBidangUsaha.setText(write.a.getDescription());
        this.tilBidangUsaha.setHintEnabled(true);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment.6
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField() != null) {
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField().deleteFromRealm();
                }
                Category category = (Category) realm.createObject(Category.class);
                category.setCode(write.a.getCode());
                category.setDescription(write.a.getDescription());
                ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeBusinessField(category);
            }
        });
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etBidangUsaha);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            a();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            a();
        }
    }

    @OnClick({2131296967})
    public void onClickBidangUsaha() {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "businessfield");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.a));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etBidangUsaha.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "businessfield");
    }

    @OnClick({2131297041})
    public void onClickLamaTinggal() {
        String str;
        String str2 = "";
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().isEmpty()) {
            str = ((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().substring(0, 2);
            str2 = ((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().substring(2, 4);
        } else {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("title", getString(2131821824));
        bundle.putString("tahun", str2);
        bundle.putString("bulan", str);
        PilihTahunBulanDialog pilihTahunBulanDialog = new PilihTahunBulanDialog();
        pilihTahunBulanDialog.setArguments(bundle);
        pilihTahunBulanDialog.show(getFragmentManager(), "PilihTahunBulanDialog");
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
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyName("");
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyBusinessType("");
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyPosition("");
                    if (((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField() != null) {
                        ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField().deleteFromRealm();
                    }
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrWorkPeriod("");
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeAddress("");
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeCity("");
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePostCode("");
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePhoneNumber("");
                    ((CC8FormKartuKreditActivity) CC15FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeExtensionNumber("");
                }
            });
            e(2131296811, new CC14FormKartuKreditPekerjaanFragment(), "CC14FormKartuKreditPekerjaanFragment");
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
                    case 2131296931:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
                        this.tilAlamat.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296967:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilBidangUsaha.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296992:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilJabatan.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297004:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilJenisUsaha.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297022:
                        this.tvErrors.get(7).setVisibility(0);
                        this.tvErrors.get(7).setText(message);
                        this.tilKodePos.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297033:
                        this.tvErrors.get(6).setVisibility(0);
                        this.tvErrors.get(6).setText(message);
                        this.tilKota.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297041:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilLamaKerja.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297074:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilNama.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297219:
                        this.tvErrors.get(8).setVisibility(0);
                        this.tvErrors.get(8).setText(message);
                        this.tilTlpKantor.setBackgroundResource(2131230870);
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
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getActivity());
        c(2131296811, new CC16FormKartuKreditFragment(), "CC16FormKartuKreditFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.h = validator;
        validator.setValidationListener(this);
        this.a = ((CC8FormKartuKreditActivity) getActivity()).r;
        this.d = ((CC8FormKartuKreditActivity) getActivity()).t;
        ArrayList arrayList = new ArrayList();
        for (CategoryResponse categoryResponse : this.d) {
            arrayList.add(categoryResponse.getDescription());
        }
        this.etKota.setAdapter(new ArrayAdapter(getContext(), 2131493297, arrayList));
        this.etNama.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrCompanyName());
        this.etJabatan.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrCompanyPosition());
        this.etBidangUsaha.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrOfficeBusinessField() == null ? "" : ((CC8FormKartuKreditActivity) getActivity()).n.getCurrOfficeBusinessField().getDescription());
        this.etJenisUsaha.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrCompanyBusinessType());
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().isEmpty()) {
            int intValue = Integer.valueOf(((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().substring(0, 2)).intValue();
            int intValue2 = Integer.valueOf(((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().substring(2, 4)).intValue();
            if (intValue2 > 0 && intValue > 0) {
                this.etLamaKerja.setText(getString(2131822367, Integer.valueOf(intValue2), Integer.valueOf(intValue)));
            } else if (intValue2 > 0) {
                this.etLamaKerja.setText(getString(2131822366, Integer.valueOf(intValue2)));
            } else {
                this.etLamaKerja.setText(getString(2131822364, Integer.valueOf(intValue)));
            }
        }
        this.etAlamat.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrOfficeAddress());
        this.etKota.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrOfficeCity());
        this.etKodePos.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrOfficePostCode());
        this.etTlpKantor.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrOfficePhoneNumber());
        this.etExtKantor.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCurrOfficeExtensionNumber());
        if (!this.etNama.getText().toString().isEmpty()) {
            this.tilNama.setHintEnabled(true);
        }
        if (!this.etJabatan.getText().toString().isEmpty()) {
            this.tilJabatan.setHintEnabled(true);
        }
        if (!this.etJenisUsaha.getText().toString().isEmpty()) {
            this.tilJenisUsaha.setHintEnabled(true);
        }
        if (!this.etAlamat.getText().toString().isEmpty()) {
            this.tilAlamat.setHintEnabled(true);
        }
        if (!this.etBidangUsaha.getText().toString().isEmpty()) {
            this.tilBidangUsaha.setHintEnabled(true);
        }
        if (!this.etLamaKerja.getText().toString().isEmpty()) {
            this.tilLamaKerja.setHintEnabled(true);
        }
        if (!this.etKodePos.getText().toString().isEmpty()) {
            this.tilKodePos.setHintEnabled(true);
        }
        if (!this.etKota.getText().toString().isEmpty()) {
            this.tilKota.setHintEnabled(true);
        }
        if (!this.etTlpKantor.getText().toString().isEmpty()) {
            this.tilTlpKantor.setHintEnabled(true);
        }
        if (!this.etExtKantor.getText().toString().isEmpty()) {
            this.tilExtKantor.setHintEnabled(true);
        }
        this.etNama.addTextChangedListener(this);
        this.etJabatan.addTextChangedListener(this);
        this.etBidangUsaha.addTextChangedListener(this);
        this.etJenisUsaha.addTextChangedListener(this);
        this.etLamaKerja.addTextChangedListener(this);
        this.etAlamat.addTextChangedListener(this);
        this.etKota.addTextChangedListener(this);
        this.etKodePos.addTextChangedListener(this);
        this.etTlpKantor.addTextChangedListener(this);
        this.etExtKantor.addTextChangedListener(this);
    }
}
