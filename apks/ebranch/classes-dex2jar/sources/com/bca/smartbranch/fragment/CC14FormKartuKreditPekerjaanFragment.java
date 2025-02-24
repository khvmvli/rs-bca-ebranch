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
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC14FormKartuKreditPekerjaanFragment.class */
public class CC14FormKartuKreditPekerjaanFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private Validator a;
    private List<CategoryResponse> d;
    @BindViews({2131297140, 2131297145})
    List<View> etFields;
    @BindView(2131297140)
    @NotEmpty(messageResId = 2131820817, trim = true)
    @Order(1)
    EditText etPekerjaan;
    @BindView(2131297145)
    @NotEmpty(messageResId = 2131820848, trim = true)
    @Order(2)
    EditText etPenghasilan;
    private int h;
    @BindViews({2131298684, 2131298687})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298684)
    LogoutDialog_ViewBinding tilPekerjaan;
    @BindView(2131298687)
    LogoutDialog_ViewBinding tilPenghasilan;
    @BindViews({2131299153, 2131299155})
    List<TextView> tvErrors;

    static /* synthetic */ void e(CC14FormKartuKreditPekerjaanFragment cC14FormKartuKreditPekerjaanFragment, EditText editText) {
        getPromotion.b(cC14FormKartuKreditPekerjaanFragment.tvErrors, cC14FormKartuKreditPekerjaanFragment.tilForms, cC14FormKartuKreditPekerjaanFragment.etFields, editText);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.getEditableText()) {
                        CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.removeTextChangedListener(CC14FormKartuKreditPekerjaanFragment.this);
                        int length = CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.length();
                        CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.setText(getPromotion.i(CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.getText().toString()));
                        int length2 = CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.length();
                        if ((CC14FormKartuKreditPekerjaanFragment.this.h + length2) - length > 0) {
                            CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.setSelection((CC14FormKartuKreditPekerjaanFragment.this.h + length2) - length);
                        } else {
                            CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.setSelection(0);
                        }
                        CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.addTextChangedListener(CC14FormKartuKreditPekerjaanFragment.this);
                        ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.setMonthlyIncome(CC14FormKartuKreditPekerjaanFragment.this.etPenghasilan.getText().toString().replaceAll("\\.", ""));
                        CC14FormKartuKreditPekerjaanFragment cC14FormKartuKreditPekerjaanFragment = CC14FormKartuKreditPekerjaanFragment.this;
                        CC14FormKartuKreditPekerjaanFragment.e(cC14FormKartuKreditPekerjaanFragment, cC14FormKartuKreditPekerjaanFragment.etPenghasilan);
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
        return 2131493170;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.getOfficePosition() != null) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.getOfficePosition().deleteFromRealm();
                }
                ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.setMonthlyIncome("");
            }
        });
        e(2131296811, new CC14FormKartuKreditFragment(), "CC14FormKartuKreditFragment");
    }

    @OnFocusChange({2131297145})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297145) {
                this.tilPenghasilan.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297145 && this.etPenghasilan.getText().toString().isEmpty()) {
            this.tilPenghasilan.setHintEnabled(false);
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
        this.a.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCategoryEvent(final CategoryListDialog.write write) {
        this.etPekerjaan.setError(null);
        this.etPekerjaan.setText(write.a.getDescription());
        this.tilPekerjaan.setHintEnabled(true);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.getOfficePosition() != null) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.getOfficePosition().deleteFromRealm();
                }
                Category category = (Category) realm.createObject(Category.class);
                category.setCode(write.a.getCode());
                category.setDescription(write.a.getDescription());
                ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.setOfficePosition(category);
            }
        });
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etPekerjaan);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
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
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.getOfficePosition() != null) {
                        ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.getOfficePosition().deleteFromRealm();
                    }
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditPekerjaanFragment.this.getActivity()).n.setMonthlyIncome("");
                }
            });
            e(2131296811, new CC14FormKartuKreditFragment(), "CC14FormKartuKreditFragment");
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
        if (i2 == 0) {
            this.h = i + 1;
        } else {
            this.h = i;
        }
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
                if (id == 2131297140) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilPekerjaan.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297145) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilPenghasilan.setBackgroundResource(2131230870);
                    editText = editText2;
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
        if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Ibu Rumah Tangga") || ((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Pelajar")) {
            c(2131296811, new CC16FormKartuKreditFragment(), "CC16FormKartuKreditFragment");
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Wiraswasta")) {
            c(2131296811, new CC15WiraswastaFormKartuKreditFragment(), "CC15WiraswastaFormKartuKreditFragment");
        } else {
            c(2131296811, new CC15FormKartuKreditFragment(), "CC15FormKartuKreditFragment");
        }
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
        this.d = ((CC8FormKartuKreditActivity) getActivity()).u;
        this.etPekerjaan.setText(((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition() == null ? "" : ((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription());
        this.etPenghasilan.setText(getPromotion.i(((CC8FormKartuKreditActivity) getActivity()).n.getMonthlyIncome()));
        this.tilPekerjaan.setHintEnabled(!this.etPekerjaan.getText().toString().isEmpty());
        this.tilPenghasilan.setHintEnabled(true ^ this.etPenghasilan.getText().toString().isEmpty());
        this.etPenghasilan.addTextChangedListener(this);
    }

    @OnClick({2131297140})
    public void showPekerjaanDialog(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "occupation");
        bundle.putString("TYPE_OCCUPATION", "pekerjaan");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.d));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPekerjaan.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "occupation");
    }
}
