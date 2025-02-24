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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC19FormKartuKreditFragment.class */
public class CC19FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private Validator a;
    private setMessage d = new setMessage();
    @BindViews({2131297040, 2131297027, 2131297028, 2131297063, 2131297173, 2131297020})
    List<View> etFields;
    @BindView(2131297020)
    @NotEmpty(messageResId = 2131820829)
    @Order(6)
    EditText etKodeCabang;
    @BindView(2131297027)
    @NotEmpty(messageResId = 2131820889)
    @Order(2)
    EditText etKodePromosi;
    @BindView(2131297028)
    @NotEmpty(messageResId = 2131820891)
    @Order(3)
    EditText etKodeReferal;
    @BindView(2131297040)
    @NotEmpty(messageResId = 2131820838)
    @Order(1)
    EditText etKrisFlyer;
    @BindView(2131297063)
    @NotEmpty(messageResId = 2131820858)
    @Order(4)
    EditText etNamaMarketing;
    @BindView(2131297173)
    @NotEmpty(messageResId = 2131820884)
    @Order(5)
    EditText etSalesNIP;
    @BindView(2131297769)
    LinearLayout llMarketing;
    @BindView(2131297958)
    LinearLayout llWrapperKrisFlyer;
    @BindView(2131298159)
    RadioButton rbKrisFlyerTidak;
    @BindView(2131298160)
    RadioButton rbKrisFlyerYa;
    @BindView(2131298155)
    RadioButton rbPromoCodeTidak;
    @BindView(2131298156)
    RadioButton rbPromoCodeYa;
    @BindView(2131298157)
    RadioButton rbReferalCodeTidak;
    @BindView(2131298158)
    RadioButton rbReferalCodeYa;
    @BindView(2131298183)
    RadioButton rbTidak;
    @BindView(2131298194)
    RadioButton rbYa;
    @BindView(2131298222)
    RadioGroup rgKrisFlyer;
    @BindView(2131298224)
    RadioGroup rgMarketing;
    @BindView(2131298220)
    RadioGroup rgPromoCode;
    @BindView(2131298221)
    RadioGroup rgReferalCode;
    @BindViews({2131298587, 2131298573, 2131298575, 2131298610, 2131298709, 2131298566})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298566)
    LogoutDialog_ViewBinding tilKodeCabang;
    @BindView(2131298573)
    LogoutDialog_ViewBinding tilKodePromosi;
    @BindView(2131298575)
    LogoutDialog_ViewBinding tilKodeReferal;
    @BindView(2131298587)
    LogoutDialog_ViewBinding tilKrisFlyer;
    @BindView(2131298610)
    LogoutDialog_ViewBinding tilNamaMarketing;
    @BindView(2131298709)
    LogoutDialog_ViewBinding tilSalesNIP;
    @BindViews({2131299063, 2131299050, 2131299051, 2131299087, 2131299113, 2131299042})
    List<TextView> tvErrors;

    static /* synthetic */ void b(CC19FormKartuKreditFragment cC19FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC19FormKartuKreditFragment.tvErrors, cC19FormKartuKreditFragment.tilForms, cC19FormKartuKreditFragment.etFields, editText);
    }

    private void d() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC19FormKartuKreditFragment.this.etKodePromosi.getEditableText()) {
                        CC19FormKartuKreditFragment cC19FormKartuKreditFragment = CC19FormKartuKreditFragment.this;
                        CC19FormKartuKreditFragment.b(cC19FormKartuKreditFragment, cC19FormKartuKreditFragment.etKodePromosi);
                        ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setPromotionCode(editable.toString());
                    } else if (editable == CC19FormKartuKreditFragment.this.etNamaMarketing.getEditableText()) {
                        CC19FormKartuKreditFragment cC19FormKartuKreditFragment2 = CC19FormKartuKreditFragment.this;
                        CC19FormKartuKreditFragment.b(cC19FormKartuKreditFragment2, cC19FormKartuKreditFragment2.etNamaMarketing);
                        ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesName(editable.toString());
                    } else if (editable == CC19FormKartuKreditFragment.this.etSalesNIP.getEditableText()) {
                        CC19FormKartuKreditFragment cC19FormKartuKreditFragment3 = CC19FormKartuKreditFragment.this;
                        CC19FormKartuKreditFragment.b(cC19FormKartuKreditFragment3, cC19FormKartuKreditFragment3.etSalesNIP);
                        ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesCode(editable.toString());
                    } else if (editable == CC19FormKartuKreditFragment.this.etKodeCabang.getEditableText()) {
                        CC19FormKartuKreditFragment cC19FormKartuKreditFragment4 = CC19FormKartuKreditFragment.this;
                        CC19FormKartuKreditFragment.b(cC19FormKartuKreditFragment4, cC19FormKartuKreditFragment4.etKodeCabang);
                        ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceBranchCode(editable.toString());
                    } else if (editable == CC19FormKartuKreditFragment.this.etKodeReferal.getEditableText()) {
                        CC19FormKartuKreditFragment cC19FormKartuKreditFragment5 = CC19FormKartuKreditFragment.this;
                        CC19FormKartuKreditFragment.b(cC19FormKartuKreditFragment5, cC19FormKartuKreditFragment5.etKodeReferal);
                        ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferalCode(editable.toString());
                    } else if (editable == CC19FormKartuKreditFragment.this.etKrisFlyer.getEditableText()) {
                        CC19FormKartuKreditFragment cC19FormKartuKreditFragment6 = CC19FormKartuKreditFragment.this;
                        CC19FormKartuKreditFragment.b(cC19FormKartuKreditFragment6, cC19FormKartuKreditFragment6.etKrisFlyer);
                        ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setNoCardKrisFlyer(editable.toString());
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
        return 2131493176;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.13
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagCardKrisFlyer("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setNoCardKrisFlyer("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagPromotionCode("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setPromotionCode("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagReferalCode("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferalCode("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagReferenceSales("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesName("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesCode("");
                ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceBranchCode("");
            }
        });
        e(2131296811, new CC18FormKartuKreditFragment(), "CC18FormKartuKreditFragment");
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
        this.a.validate();
    }

    @OnFocusChange({2131297040, 2131297027, 2131297028, 2131297063, 2131297173, 2131297020})
    public void onChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131297020:
                    this.tilKodeCabang.setHintEnabled(true);
                    return;
                case 2131297027:
                    this.tilKodePromosi.setHintEnabled(true);
                    return;
                case 2131297028:
                    this.tilKodeReferal.setHintEnabled(true);
                    return;
                case 2131297040:
                    this.tilKrisFlyer.setHintEnabled(true);
                    return;
                case 2131297063:
                    this.tilNamaMarketing.setHintEnabled(true);
                    return;
                case 2131297173:
                    this.tilSalesNIP.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131297020:
                    if (this.etKodeCabang.getText().toString().isEmpty()) {
                        this.tilKodeCabang.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297027:
                    if (this.etKodePromosi.getText().toString().isEmpty()) {
                        this.tilKodePromosi.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297028:
                    if (this.etKodeReferal.getText().toString().isEmpty()) {
                        this.tilKodeReferal.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297040:
                    if (this.etKrisFlyer.getText().toString().isEmpty()) {
                        this.tilKrisFlyer.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297063:
                    if (this.etNamaMarketing.getText().toString().isEmpty()) {
                        this.tilNamaMarketing.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297173:
                    if (this.etSalesNIP.getText().toString().isEmpty()) {
                        this.tilSalesNIP.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            d();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            d();
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
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.13
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagCardKrisFlyer("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setNoCardKrisFlyer("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagPromotionCode("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setPromotionCode("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagReferalCode("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferalCode("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagReferenceSales("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesName("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesCode("");
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setReferenceBranchCode("");
                }
            });
            e(2131296811, new CC18FormKartuKreditFragment(), "CC18FormKartuKreditFragment");
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
                    case 2131297020:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
                        this.tilKodeCabang.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297027:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilKodePromosi.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297028:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilKodeReferal.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297040:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilKrisFlyer.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297063:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilNamaMarketing.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297173:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilSalesNIP.setBackgroundResource(2131230870);
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
        c(2131296811, new CC20FormKartuKreditFragment(), "CC20FormKartuKreditFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.a = validator;
        validator.setValidationListener(this);
        this.etKodePromosi.setText(((CC8FormKartuKreditActivity) getActivity()).n.getPromotionCode());
        if (((CC8FormKartuKreditActivity) getActivity()).n.isKrisFlyer()) {
            this.llWrapperKrisFlyer.setVisibility(0);
        } else {
            this.llWrapperKrisFlyer.setVisibility(8);
        }
        String flagCardKrisFlyer = ((CC8FormKartuKreditActivity) getActivity()).n.getFlagCardKrisFlyer();
        flagCardKrisFlyer.hashCode();
        if (flagCardKrisFlyer.equals("N")) {
            this.rbKrisFlyerTidak.setChecked(true);
            this.tilKrisFlyer.setVisibility(8);
        } else if (!flagCardKrisFlyer.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagCardKrisFlyer("N");
                    CC19FormKartuKreditFragment.this.rbKrisFlyerTidak.setChecked(true);
                    CC19FormKartuKreditFragment.this.tilKrisFlyer.setVisibility(8);
                }
            });
        } else {
            this.rbKrisFlyerYa.setChecked(true);
            this.tilKrisFlyer.setVisibility(0);
            this.etKrisFlyer.setText(((CC8FormKartuKreditActivity) getActivity()).n.getNoCardKrisFlyer());
            this.tilKrisFlyer.setHintEnabled(!this.etKrisFlyer.getText().toString().isEmpty());
        }
        String flagReferenceSales = ((CC8FormKartuKreditActivity) getActivity()).n.getFlagReferenceSales();
        flagReferenceSales.hashCode();
        if (flagReferenceSales.equals("N")) {
            this.rbTidak.setChecked(true);
            this.llMarketing.setVisibility(8);
        } else if (!flagReferenceSales.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagReferenceSales("N");
                    CC19FormKartuKreditFragment.this.rbTidak.setChecked(true);
                    CC19FormKartuKreditFragment.this.llMarketing.setVisibility(8);
                }
            });
        } else {
            this.rbYa.setChecked(true);
            this.llMarketing.setVisibility(0);
            this.etNamaMarketing.setText(((CC8FormKartuKreditActivity) getActivity()).n.getReferenceSalesName());
            this.etSalesNIP.setText(((CC8FormKartuKreditActivity) getActivity()).n.getReferenceSalesCode());
            this.etKodeCabang.setText(((CC8FormKartuKreditActivity) getActivity()).n.getReferenceBranchCode());
            this.tilNamaMarketing.setHintEnabled(!this.etNamaMarketing.getText().toString().isEmpty());
            this.tilSalesNIP.setHintEnabled(!this.etSalesNIP.getText().toString().isEmpty());
            this.tilKodeCabang.setHintEnabled(!this.etKodeCabang.getText().toString().isEmpty());
        }
        String flagPromotionCode = ((CC8FormKartuKreditActivity) getActivity()).n.getFlagPromotionCode();
        flagPromotionCode.hashCode();
        if (flagPromotionCode.equals("N")) {
            this.rbPromoCodeTidak.setChecked(true);
            this.tilKodePromosi.setVisibility(8);
        } else if (!flagPromotionCode.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.6
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagPromotionCode("N");
                    CC19FormKartuKreditFragment.this.rbPromoCodeTidak.setChecked(true);
                    CC19FormKartuKreditFragment.this.tilKodePromosi.setVisibility(8);
                }
            });
        } else {
            this.rbPromoCodeYa.setChecked(true);
            this.tilKodePromosi.setVisibility(0);
            this.etKodePromosi.setText(((CC8FormKartuKreditActivity) getActivity()).n.getPromotionCode());
            this.tilKodePromosi.setHintEnabled(!this.etKodePromosi.getText().toString().isEmpty());
        }
        String flagReferalCode = ((CC8FormKartuKreditActivity) getActivity()).n.getFlagReferalCode();
        flagReferalCode.hashCode();
        if (flagReferalCode.equals("N")) {
            this.rbReferalCodeTidak.setChecked(true);
            this.tilKodeReferal.setVisibility(8);
        } else if (!flagReferalCode.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.9
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC19FormKartuKreditFragment.this.getActivity()).n.setFlagReferalCode("N");
                    CC19FormKartuKreditFragment.this.rbReferalCodeTidak.setChecked(true);
                    CC19FormKartuKreditFragment.this.tilKodeReferal.setVisibility(8);
                }
            });
        } else {
            this.rbReferalCodeYa.setChecked(true);
            this.tilKodeReferal.setVisibility(0);
            this.etKodeReferal.setText(((CC8FormKartuKreditActivity) getActivity()).n.getReferalCode());
            this.tilKodeReferal.setHintEnabled(true ^ this.etKodeReferal.getText().toString().isEmpty());
        }
        this.rgMarketing.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.8
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                CC19FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.8.4
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        int i2 = i;
                        if (i2 == 2131298183) {
                            setMessage setmessage = CC19FormKartuKreditFragment.this.d;
                            LinearLayout linearLayout = CC19FormKartuKreditFragment.this.llMarketing;
                            setmessage.a = linearLayout.getMeasuredHeight();
                            setmessage.b = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0066: IPUT  
                                  (wrap: o.setMessage$1 : 0x0063: CONSTRUCTOR  (r1v3 o.setMessage$1 A[REMOVE]) = (r0v6 'setmessage' o.setMessage), (r0v10 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                  (r0v6 'setmessage' o.setMessage)
                                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.8.4.execute(io.realm.Realm):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC19FormKartuKreditFragment$8$4.class
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
                                r0 = r6
                                int r0 = r8
                                r8 = r0
                                r0 = r8
                                r1 = 2131298183(0x7f090787, float:1.8214332E38)
                                if (r0 == r1) goto L_0x003e
                                r0 = r8
                                r1 = 2131298194(0x7f090792, float:1.8214354E38)
                                if (r0 != r1) goto L_0x00da
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                r1 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                android.widget.LinearLayout r1 = r1.llMarketing
                                r0.c(r1)
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                o.getView r0 = r0.getActivity()
                                com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                java.lang.String r1 = "Y"
                                r0.setFlagReferenceSales(r1)
                                return
                            L_0x003e:
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                r7 = r0
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                android.widget.LinearLayout r0 = r0.llMarketing
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
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                android.widget.EditText r0 = r0.etNamaMarketing
                                java.lang.String r1 = ""
                                r0.setText(r1)
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                android.widget.EditText r0 = r0.etSalesNIP
                                java.lang.String r1 = ""
                                r0.setText(r1)
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                android.widget.EditText r0 = r0.etKodeCabang
                                java.lang.String r1 = ""
                                r0.setText(r1)
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                o.LogoutDialog_ViewBinding r0 = r0.tilNamaMarketing
                                r1 = 0
                                r0.setHintEnabled(r1)
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                o.LogoutDialog_ViewBinding r0 = r0.tilSalesNIP
                                r1 = 0
                                r0.setHintEnabled(r1)
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                o.LogoutDialog_ViewBinding r0 = r0.tilKodeCabang
                                r1 = 0
                                r0.setHintEnabled(r1)
                                r0 = r6
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$8 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.this
                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                o.getView r0 = r0.getActivity()
                                com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                java.lang.String r1 = "N"
                                r0.setFlagReferenceSales(r1)
                            L_0x00da:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass8.AnonymousClass4.execute(io.realm.Realm):void");
                        }
                    });
                }
            });
            this.rgPromoCode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.10
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                    CC19FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.10.2
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            switch (i) {
                                case 2131298155:
                                    setMessage setmessage = CC19FormKartuKreditFragment.this.d;
                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding = CC19FormKartuKreditFragment.this.tilKodePromosi;
                                    setmessage.a = logoutDialog_ViewBinding.getMeasuredHeight();
                                    setmessage.b = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: IPUT  
                                          (wrap: o.setMessage$1 : 0x006f: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage' o.setMessage), (r0v9 'logoutDialog_ViewBinding' o.LogoutDialog_ViewBinding) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                          (r0v5 'setmessage' o.setMessage)
                                         o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.10.2.execute(io.realm.Realm):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC19FormKartuKreditFragment$10$2.class
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
                                        r0 = r6
                                        int r0 = r8
                                        switch(r0) {
                                            case 2131298155: goto L_0x004a;
                                            case 2131298156: goto L_0x001d;
                                            default: goto L_0x001c;
                                        }
                                    L_0x001c:
                                        return
                                    L_0x001d:
                                        r0 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                        r1 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        o.LogoutDialog_ViewBinding r1 = r1.tilKodePromosi
                                        r0.c(r1)
                                        r0 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        o.getView r0 = r0.getActivity()
                                        com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                        com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                        java.lang.String r1 = "Y"
                                        r0.setFlagPromotionCode(r1)
                                        return
                                    L_0x004a:
                                        r0 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                        r7 = r0
                                        r0 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        o.LogoutDialog_ViewBinding r0 = r0.tilKodePromosi
                                        r8 = r0
                                        r0 = r7
                                        r1 = r8
                                        int r1 = r1.getMeasuredHeight()
                                        r0.a = r1
                                        r0 = r7
                                        o.setMessage$1 r1 = new o.setMessage$1
                                        r2 = r1
                                        r3 = r7
                                        r4 = r8
                                        r2.<init>(r4)
                                        r0.b = r1
                                        r0 = r7
                                        r1 = r8
                                        r0.b(r1)
                                        r0 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        android.widget.EditText r0 = r0.etKodePromosi
                                        java.lang.String r1 = ""
                                        r0.setText(r1)
                                        r0 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        o.LogoutDialog_ViewBinding r0 = r0.tilKodePromosi
                                        r1 = 0
                                        r0.setHintEnabled(r1)
                                        r0 = r6
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$10 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.this
                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                        o.getView r0 = r0.getActivity()
                                        com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                        com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                        java.lang.String r1 = "N"
                                        r0.setFlagPromotionCode(r1)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass10.AnonymousClass2.execute(io.realm.Realm):void");
                                }
                            });
                        }
                    });
                    this.rgReferalCode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.7
                        @Override // android.widget.RadioGroup.OnCheckedChangeListener
                        public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                            CC19FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.7.1
                                @Override // io.realm.Realm.Transaction
                                public final void execute(Realm realm) {
                                    switch (i) {
                                        case 2131298157:
                                            setMessage setmessage = CC19FormKartuKreditFragment.this.d;
                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding = CC19FormKartuKreditFragment.this.tilKodeReferal;
                                            setmessage.a = logoutDialog_ViewBinding.getMeasuredHeight();
                                            setmessage.b = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: IPUT  
                                                  (wrap: o.setMessage$1 : 0x006f: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage' o.setMessage), (r0v9 'logoutDialog_ViewBinding' o.LogoutDialog_ViewBinding) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                                  (r0v5 'setmessage' o.setMessage)
                                                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.7.1.execute(io.realm.Realm):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC19FormKartuKreditFragment$7$1.class
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
                                                r0 = r6
                                                int r0 = r8
                                                switch(r0) {
                                                    case 2131298157: goto L_0x004a;
                                                    case 2131298158: goto L_0x001d;
                                                    default: goto L_0x001c;
                                                }
                                            L_0x001c:
                                                return
                                            L_0x001d:
                                                r0 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                                r1 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                o.LogoutDialog_ViewBinding r1 = r1.tilKodeReferal
                                                r0.c(r1)
                                                r0 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                o.getView r0 = r0.getActivity()
                                                com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                                com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                                java.lang.String r1 = "Y"
                                                r0.setFlagReferalCode(r1)
                                                return
                                            L_0x004a:
                                                r0 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                                r7 = r0
                                                r0 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                o.LogoutDialog_ViewBinding r0 = r0.tilKodeReferal
                                                r8 = r0
                                                r0 = r7
                                                r1 = r8
                                                int r1 = r1.getMeasuredHeight()
                                                r0.a = r1
                                                r0 = r7
                                                o.setMessage$1 r1 = new o.setMessage$1
                                                r2 = r1
                                                r3 = r7
                                                r4 = r8
                                                r2.<init>(r4)
                                                r0.b = r1
                                                r0 = r7
                                                r1 = r8
                                                r0.b(r1)
                                                r0 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                android.widget.EditText r0 = r0.etKodeReferal
                                                java.lang.String r1 = ""
                                                r0.setText(r1)
                                                r0 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                o.LogoutDialog_ViewBinding r0 = r0.tilKodeReferal
                                                r1 = 0
                                                r0.setHintEnabled(r1)
                                                r0 = r6
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$7 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.this
                                                com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                o.getView r0 = r0.getActivity()
                                                com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                                com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                                java.lang.String r1 = "N"
                                                r0.setFlagReferalCode(r1)
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass7.AnonymousClass1.execute(io.realm.Realm):void");
                                        }
                                    });
                                }
                            });
                            this.rgKrisFlyer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.15
                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                                    CC19FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.15.4
                                        @Override // io.realm.Realm.Transaction
                                        public final void execute(Realm realm) {
                                            switch (i) {
                                                case 2131298159:
                                                    setMessage setmessage = CC19FormKartuKreditFragment.this.d;
                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding = CC19FormKartuKreditFragment.this.tilKrisFlyer;
                                                    setmessage.a = logoutDialog_ViewBinding.getMeasuredHeight();
                                                    setmessage.b = 
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: IPUT  
                                                          (wrap: o.setMessage$1 : 0x006f: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage' o.setMessage), (r0v9 'logoutDialog_ViewBinding' o.LogoutDialog_ViewBinding) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                                          (r0v5 'setmessage' o.setMessage)
                                                         o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.15.4.execute(io.realm.Realm):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC19FormKartuKreditFragment$15$4.class
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
                                                        r0 = r6
                                                        int r0 = r8
                                                        switch(r0) {
                                                            case 2131298159: goto L_0x004a;
                                                            case 2131298160: goto L_0x001d;
                                                            default: goto L_0x001c;
                                                        }
                                                    L_0x001c:
                                                        return
                                                    L_0x001d:
                                                        r0 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                                        r1 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r1 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        o.LogoutDialog_ViewBinding r1 = r1.tilKrisFlyer
                                                        r0.c(r1)
                                                        r0 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        o.getView r0 = r0.getActivity()
                                                        com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                                        com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                                        java.lang.String r1 = "Y"
                                                        r0.setFlagCardKrisFlyer(r1)
                                                        return
                                                    L_0x004a:
                                                        r0 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        o.setMessage r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.e(r0)
                                                        r7 = r0
                                                        r0 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        o.LogoutDialog_ViewBinding r0 = r0.tilKrisFlyer
                                                        r8 = r0
                                                        r0 = r7
                                                        r1 = r8
                                                        int r1 = r1.getMeasuredHeight()
                                                        r0.a = r1
                                                        r0 = r7
                                                        o.setMessage$1 r1 = new o.setMessage$1
                                                        r2 = r1
                                                        r3 = r7
                                                        r4 = r8
                                                        r2.<init>(r4)
                                                        r0.b = r1
                                                        r0 = r7
                                                        r1 = r8
                                                        r0.b(r1)
                                                        r0 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        android.widget.EditText r0 = r0.etKrisFlyer
                                                        java.lang.String r1 = ""
                                                        r0.setText(r1)
                                                        r0 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        o.LogoutDialog_ViewBinding r0 = r0.tilKrisFlyer
                                                        r1 = 0
                                                        r0.setHintEnabled(r1)
                                                        r0 = r6
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment$15 r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.this
                                                        com.bca.smartbranch.fragment.CC19FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.this
                                                        o.getView r0 = r0.getActivity()
                                                        com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                                                        com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                                                        java.lang.String r1 = "N"
                                                        r0.setFlagCardKrisFlyer(r1)
                                                        return
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment.AnonymousClass15.AnonymousClass4.execute(io.realm.Realm):void");
                                                }
                                            });
                                        }
                                    });
                                    this.etKrisFlyer.addTextChangedListener(this);
                                    this.etKodePromosi.addTextChangedListener(this);
                                    this.etNamaMarketing.addTextChangedListener(this);
                                    this.etSalesNIP.addTextChangedListener(this);
                                    this.etKodeReferal.addTextChangedListener(this);
                                    this.etKodeCabang.addTextChangedListener(this);
                                }
                            }
