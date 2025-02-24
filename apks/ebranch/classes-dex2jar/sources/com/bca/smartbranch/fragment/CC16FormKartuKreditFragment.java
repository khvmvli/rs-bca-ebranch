package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
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
import com.bca.smartbranch.dialog.CategoryListDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC16FormKartuKreditFragment.class */
public class CC16FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private List<CategoryResponse> a;
    private List<CategoryResponse> d;
    @BindView(2131296930)
    @NotEmpty(messageResId = 2131820728, trim = true)
    @Order(3)
    EditText etAlamatDomisili;
    @BindView(2131296979)
    EditText etExtKantor;
    @BindViews({2131297062, 2131296987, 2131296930, 2131297033, 2131297022, 2131297094})
    List<View> etFields;
    @BindView(2131296987)
    @NotEmpty(messageResId = 2131820803, trim = true)
    @Order(2)
    EditText etHubungan;
    @Order(4)
    @BindView(2131297022)
    @NotEmpty(messageResId = 2131820977, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    EditText etKodePos;
    @BindView(2131297033)
    @NotEmpty(messageResId = 2131820760, trim = true)
    @Order(4)
    getCardCode etKota;
    @BindView(2131297062)
    @NotEmpty(messageResId = 2131820798, trim = true)
    @Order(1)
    EditText etNamaLengkap;
    @BindView(2131297094)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(8)
    EditText etNoHP;
    @BindView(2131297219)
    EditText etTlpKantor;
    @BindView(2131297220)
    EditText etTlpRumah;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindString(2131820953)
    String invalidTeleponMessage;
    private Validator j;
    @BindView(2131298479)
    LogoutDialog_ViewBinding tilAlamatDomisili;
    @BindView(2131298529)
    LogoutDialog_ViewBinding tilExtKantor;
    @BindViews({2131298609, 2131298536, 2131298479, 2131298580, 2131298568, 2131298640})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298536)
    LogoutDialog_ViewBinding tilHubungan;
    @BindView(2131298568)
    LogoutDialog_ViewBinding tilKodePos;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKota;
    @BindView(2131298609)
    LogoutDialog_ViewBinding tilNamaLengkap;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298750)
    LogoutDialog_ViewBinding tilTlpKantor;
    @BindView(2131298751)
    LogoutDialog_ViewBinding tilTlpRumah;
    @BindViews({2131299086, 2131299013, 2131298959, 2131299056, 2131299045, 2131299115})
    List<TextView> tvErrors;

    static /* synthetic */ void c(CC16FormKartuKreditFragment cC16FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC16FormKartuKreditFragment.tvErrors, cC16FormKartuKreditFragment.tilForms, cC16FormKartuKreditFragment.etFields, editText);
    }

    private void d() {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactName("");
                if (((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.getEmergencyContactRelation() != null) {
                    ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.getEmergencyContactRelation().deleteFromRealm();
                }
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactAddress("");
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactCity("");
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactPostalCode("");
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactPhoneNumber("");
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactOfficePhone("");
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactOfficeExt("");
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactMobileNumber("");
            }
        });
        if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Ibu Rumah Tangga") || ((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Pelajar")) {
            e(2131296811, new CC14FormKartuKreditPekerjaanFragment(), "CC14FormKartuKreditPekerjaanFragment");
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Wiraswasta")) {
            e(2131296811, new CC15WiraswastaFormKartuKreditFragment(), "CC15WiraswastaFormKartuKreditFragment");
        } else {
            e(2131296811, new CC15FormKartuKreditFragment(), "CC15FormKartuKreditFragment");
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC16FormKartuKreditFragment.this.etNamaLengkap.getEditableText()) {
                        CC16FormKartuKreditFragment cC16FormKartuKreditFragment = CC16FormKartuKreditFragment.this;
                        CC16FormKartuKreditFragment.c(cC16FormKartuKreditFragment, cC16FormKartuKreditFragment.etNamaLengkap);
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactName(editable.toString());
                    } else if (editable == CC16FormKartuKreditFragment.this.etAlamatDomisili.getEditableText()) {
                        CC16FormKartuKreditFragment cC16FormKartuKreditFragment2 = CC16FormKartuKreditFragment.this;
                        CC16FormKartuKreditFragment.c(cC16FormKartuKreditFragment2, cC16FormKartuKreditFragment2.etAlamatDomisili);
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactAddress(editable.toString());
                    } else if (editable == CC16FormKartuKreditFragment.this.etTlpRumah.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactPhoneNumber(editable.toString());
                    } else if (editable == CC16FormKartuKreditFragment.this.etKota.getEditableText()) {
                        CC16FormKartuKreditFragment cC16FormKartuKreditFragment3 = CC16FormKartuKreditFragment.this;
                        CC16FormKartuKreditFragment.c(cC16FormKartuKreditFragment3, cC16FormKartuKreditFragment3.etKota);
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactCity(editable.toString());
                    } else if (editable == CC16FormKartuKreditFragment.this.etKodePos.getEditableText()) {
                        if (CC16FormKartuKreditFragment.this.tvErrors.get(CC16FormKartuKreditFragment.this.etFields.indexOf(CC16FormKartuKreditFragment.this.etKodePos)).getVisibility() == 0) {
                            if (CC16FormKartuKreditFragment.this.tvErrors.get(CC16FormKartuKreditFragment.this.etFields.indexOf(CC16FormKartuKreditFragment.this.etKodePos)).getText().toString().equals(CC16FormKartuKreditFragment.this.getString(2131820979))) {
                                if (CC16FormKartuKreditFragment.this.etKodePos.getText().toString().length() == 5) {
                                    List<TextView> list = CC16FormKartuKreditFragment.this.tvErrors;
                                    List<LogoutDialog_ViewBinding> list2 = CC16FormKartuKreditFragment.this.tilForms;
                                    int indexOf = CC16FormKartuKreditFragment.this.etFields.indexOf(CC16FormKartuKreditFragment.this.etKodePos);
                                    list.get(indexOf).setVisibility(8);
                                    list2.get(indexOf).setBackgroundResource(2131230847);
                                }
                            } else if (!CC16FormKartuKreditFragment.this.etKodePos.getText().toString().isEmpty()) {
                                List<TextView> list3 = CC16FormKartuKreditFragment.this.tvErrors;
                                List<LogoutDialog_ViewBinding> list4 = CC16FormKartuKreditFragment.this.tilForms;
                                int indexOf2 = CC16FormKartuKreditFragment.this.etFields.indexOf(CC16FormKartuKreditFragment.this.etKodePos);
                                list3.get(indexOf2).setVisibility(8);
                                list4.get(indexOf2).setBackgroundResource(2131230847);
                            }
                        }
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactPostalCode(editable.toString());
                    } else if (editable == CC16FormKartuKreditFragment.this.etTlpKantor.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactOfficePhone(editable.toString());
                    } else if (editable == CC16FormKartuKreditFragment.this.etExtKantor.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactOfficeExt(editable.toString());
                    } else if (editable == CC16FormKartuKreditFragment.this.etNoHP.getEditableText()) {
                        CC16FormKartuKreditFragment cC16FormKartuKreditFragment4 = CC16FormKartuKreditFragment.this;
                        CC16FormKartuKreditFragment.c(cC16FormKartuKreditFragment4, cC16FormKartuKreditFragment4.etNoHP);
                        ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactMobileNumber(editable.toString());
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
        return 2131493173;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        d();
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
        this.j.validate();
    }

    @OnFocusChange({2131297062, 2131296930, 2131297033, 2131297022, 2131297094, 2131297220, 2131297219, 2131296979})
    public void onChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296930:
                    this.tilAlamatDomisili.setHintEnabled(true);
                    return;
                case 2131296979:
                    this.tilExtKantor.setHintEnabled(true);
                    return;
                case 2131297022:
                    this.tilKodePos.setHintEnabled(true);
                    return;
                case 2131297033:
                    this.tilKota.setHintEnabled(true);
                    return;
                case 2131297062:
                    this.tilNamaLengkap.setHintEnabled(true);
                    return;
                case 2131297094:
                    this.tilNoHp.setHintEnabled(true);
                    return;
                case 2131297219:
                    this.tilTlpKantor.setHintEnabled(true);
                    return;
                case 2131297220:
                    this.tilTlpRumah.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296930:
                    if (this.etAlamatDomisili.getText().toString().isEmpty()) {
                        this.tilAlamatDomisili.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296979:
                    if (this.etExtKantor.getText().toString().isEmpty()) {
                        this.tilExtKantor.setHintEnabled(false);
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
                case 2131297219:
                    if (this.etTlpKantor.getText().toString().isEmpty()) {
                        this.tilTlpKantor.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297220:
                    if (this.etTlpRumah.getText().toString().isEmpty()) {
                        this.tilTlpRumah.setHintEnabled(false);
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
        this.etHubungan.setError(null);
        this.etHubungan.setText(write.a.getDescription());
        this.tilHubungan.setHintEnabled(true);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.getEmergencyContactRelation() != null) {
                    ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.getEmergencyContactRelation().deleteFromRealm();
                }
                Category category = (Category) realm.createObject(Category.class);
                category.setCode(write.a.getCode());
                category.setDescription(write.a.getDescription());
                ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactRelation(category);
            }
        });
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etHubungan);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC16FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @OnClick({2131296987})
    public void onClickedHubungan() {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "relationship");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.d));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etHubungan.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "relationship");
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
            d();
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
                    case 2131296930:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilAlamatDomisili.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296987:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilHubungan.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297022:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilKodePos.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297033:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilKota.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297062:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilNamaLengkap.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297094:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
                        this.tilNoHp.setBackgroundResource(2131230870);
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
        c(2131296811, new CC17FormKartuKreditFragment(), "CC17FormKartuKreditFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.j = validator;
        validator.setValidationListener(this);
        if (this.etNoHP.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
            Validator validator2 = this.j;
            EditText editText = this.etNoHP;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: INVOKE  
                  (r0v95 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v97 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v17 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x0070: CONSTRUCTOR  
                  (r0v97 'editText' android.widget.EditText)
                  (r0v89 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC16FormKartuKreditFragment.class
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
            // Method dump skipped, instructions count: 699
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }
    }
