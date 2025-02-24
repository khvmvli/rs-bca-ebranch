package com.bca.smartbranch.fragment;

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
import com.bca.smartbranch.fragment.CC12FormKartuKreditFragment;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC12FormKartuKreditFragment.class */
public class CC12FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private List<CategoryResponse> a;
    private List<CategoryResponse> d;
    @BindView(2131296927)
    @NotEmpty(messageResId = 2131820732, trim = true)
    @Order(1)
    EditText etAlamat;
    @BindViews({2131296927, 2131297033, 2131297022, 2131297198, 2131297042})
    List<View> etFields;
    @Order(3)
    @BindView(2131297022)
    @NotEmpty(messageResId = 2131820977, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    EditText etKodePos;
    @BindView(2131297033)
    @NotEmpty(messageResId = 2131820760, trim = true)
    @Order(2)
    getCardCode etKota;
    @BindView(2131297042)
    @NotEmpty(messageResId = 2131820841, trim = true)
    @Order(5)
    EditText etLamaMenempati;
    @BindView(2131297118)
    EditText etNoTelepon;
    @BindView(2131297198)
    @NotEmpty(messageResId = 2131820801, trim = true)
    @Order(4)
    EditText etStatusTempat;
    private Validator g;
    @BindString(2131820953)
    String invalidTeleponMessage;
    @BindView(2131298476)
    LogoutDialog_ViewBinding tilAlamat;
    @BindViews({2131298476, 2131298580, 2131298568, 2131298730, 2131298589})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298568)
    LogoutDialog_ViewBinding tilKodePos;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKota;
    @BindView(2131298589)
    LogoutDialog_ViewBinding tilLamaMenempati;
    @BindView(2131298664)
    LogoutDialog_ViewBinding tilNoTelepon;
    @BindView(2131298730)
    LogoutDialog_ViewBinding tilStatusTempat;
    @BindViews({2131298956, 2131299056, 2131299045, 2131299198, 2131299065})
    List<TextView> tvErrors;

    static /* synthetic */ void e(CC12FormKartuKreditFragment cC12FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC12FormKartuKreditFragment.tvErrors, cC12FormKartuKreditFragment.tilForms, cC12FormKartuKreditFragment.etFields, editText);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void SubscribeLamaMenempati(final AgamaAdapter$AgamaVH_ViewBinding agamaAdapter$AgamaVH_ViewBinding) {
        this.etLamaMenempati.setError(null);
        if (agamaAdapter$AgamaVH_ViewBinding.e > 0 && agamaAdapter$AgamaVH_ViewBinding.b > 0) {
            this.etLamaMenempati.setText(getString(2131822367, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.e), Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.b)));
        } else if (agamaAdapter$AgamaVH_ViewBinding.e > 0) {
            this.etLamaMenempati.setText(getString(2131822366, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.e)));
        } else {
            this.etLamaMenempati.setText(getString(2131822364, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.b)));
        }
        this.tilLamaMenempati.setHintEnabled(true);
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etLamaMenempati);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CreditCard creditCard = ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n;
                StringBuilder sb = new StringBuilder();
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"));
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e), 2, "0"));
                creditCard.setHmStayPeriod(sb.toString());
            }
        });
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC12FormKartuKreditFragment.this.etAlamat.getEditableText()) {
                        CC12FormKartuKreditFragment cC12FormKartuKreditFragment = CC12FormKartuKreditFragment.this;
                        CC12FormKartuKreditFragment.e(cC12FormKartuKreditFragment, cC12FormKartuKreditFragment.etAlamat);
                        ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmAddress(editable.toString());
                    } else if (editable == CC12FormKartuKreditFragment.this.etKota.getEditableText()) {
                        CC12FormKartuKreditFragment cC12FormKartuKreditFragment2 = CC12FormKartuKreditFragment.this;
                        CC12FormKartuKreditFragment.e(cC12FormKartuKreditFragment2, cC12FormKartuKreditFragment2.etKota);
                        ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmCity(editable.toString());
                    } else if (editable == CC12FormKartuKreditFragment.this.etKodePos.getEditableText()) {
                        CC12FormKartuKreditFragment cC12FormKartuKreditFragment3 = CC12FormKartuKreditFragment.this;
                        CC12FormKartuKreditFragment.e(cC12FormKartuKreditFragment3, cC12FormKartuKreditFragment3.etKodePos);
                        ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmPostCode(editable.toString());
                    } else if (editable == CC12FormKartuKreditFragment.this.etNoTelepon.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setPhoneNumber(editable.toString());
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
        return 2131493168;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmAddress("");
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmKelurahan("");
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmKecamatan("");
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmRT("");
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmRW("");
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmCity("");
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmPostCode("");
                if (((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.getHmHouseStatus() != null) {
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.getHmHouseStatus().deleteFromRealm();
                }
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setPhoneNumber("");
                ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmStayPeriod("");
            }
        });
        e(2131296811, new CC11FormKartuKreditFragment(), "CC11FormKartuKreditFragment");
    }

    @OnFocusChange({2131296927, 2131297033, 2131297022, 2131297118})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296927:
                    this.tilAlamat.setHintEnabled(true);
                    return;
                case 2131297022:
                    this.tilKodePos.setHintEnabled(true);
                    return;
                case 2131297033:
                    this.tilKota.setHintEnabled(true);
                    return;
                case 2131297118:
                    this.tilNoTelepon.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296927:
                    if (this.etAlamat.getText().toString().isEmpty()) {
                        this.tilAlamat.setHintEnabled(false);
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
                case 2131297118:
                    if (this.etNoTelepon.getText().toString().isEmpty()) {
                        this.tilNoTelepon.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
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
        this.g.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCategoryEvent(CategoryListDialog.write write) {
        if (write.c.equals("homestatus")) {
            this.etStatusTempat.setError(null);
            this.etStatusTempat.setText(write.a.getDescription());
            this.tilStatusTempat.setHintEnabled(true);
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etStatusTempat);
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setRecurringEndDate
                public final /* synthetic */ CategoryListDialog.write d;

                {
                    this.d = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC12FormKartuKreditFragment cC12FormKartuKreditFragment = CC12FormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.d;
                    if (((CC8FormKartuKreditActivity) cC12FormKartuKreditFragment.getActivity()).n.getHmHouseStatus() != null) {
                        ((CC8FormKartuKreditActivity) cC12FormKartuKreditFragment.getActivity()).n.getHmHouseStatus().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    ((CC8FormKartuKreditActivity) cC12FormKartuKreditFragment.getActivity()).n.setHmHouseStatus(category);
                }
            });
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @OnClick({2131297042})
    public void onClickLamaTinggal() {
        String str;
        String str2 = "";
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().isEmpty()) {
            str = ((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().substring(0, 2);
            str2 = ((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().substring(2, 4);
        } else {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("title", getString(2131821825));
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
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmAddress("");
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmKelurahan("");
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmKecamatan("");
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmRT("");
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmRW("");
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmCity("");
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmPostCode("");
                    if (((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.getHmHouseStatus() != null) {
                        ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.getHmHouseStatus().deleteFromRealm();
                    }
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setPhoneNumber("");
                    ((CC8FormKartuKreditActivity) CC12FormKartuKreditFragment.this.getActivity()).n.setHmStayPeriod("");
                }
            });
            e(2131296811, new CC11FormKartuKreditFragment(), "CC11FormKartuKreditFragment");
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
                    case 2131296927:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilAlamat.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297022:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilKodePos.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297033:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilKota.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297042:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilLamaMenempati.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297198:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilStatusTempat.setBackgroundResource(2131230870);
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
        c(2131296811, new CC14FormKartuKreditFragment(), "CC14FormKartuKreditFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.g = validator;
        validator.setValidationListener(this);
        this.d = ((CC8FormKartuKreditActivity) getActivity()).y;
        this.a = ((CC8FormKartuKreditActivity) getActivity()).t;
        ArrayList arrayList = new ArrayList();
        for (CategoryResponse categoryResponse : this.a) {
            arrayList.add(categoryResponse.getDescription());
        }
        this.etKota.setAdapter(new ArrayAdapter(getContext(), 2131493297, arrayList));
        this.etAlamat.setText(((CC8FormKartuKreditActivity) getActivity()).n.getHmAddress());
        this.etKota.setText(((CC8FormKartuKreditActivity) getActivity()).n.getHmCity());
        this.etKodePos.setText(((CC8FormKartuKreditActivity) getActivity()).n.getHmPostCode());
        this.etStatusTempat.setText(((CC8FormKartuKreditActivity) getActivity()).n.getHmHouseStatus() == null ? "" : ((CC8FormKartuKreditActivity) getActivity()).n.getHmHouseStatus().getDescription());
        this.etNoTelepon.setText(((CC8FormKartuKreditActivity) getActivity()).n.getPhoneNumber());
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().isEmpty()) {
            int intValue = Integer.valueOf(((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().substring(0, 2)).intValue();
            int intValue2 = Integer.valueOf(((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().substring(2, 4)).intValue();
            if (intValue2 > 0 && intValue > 0) {
                this.etLamaMenempati.setText(getString(2131822367, Integer.valueOf(intValue2), Integer.valueOf(intValue)));
            } else if (intValue2 > 0) {
                this.etLamaMenempati.setText(getString(2131822366, Integer.valueOf(intValue2)));
            } else {
                this.etLamaMenempati.setText(getString(2131822364, Integer.valueOf(intValue)));
            }
        }
        this.tilAlamat.setHintEnabled(!this.etAlamat.getText().toString().isEmpty());
        this.tilKota.setHintEnabled(!this.etKota.getText().toString().isEmpty());
        this.tilKodePos.setHintEnabled(!this.etKodePos.getText().toString().isEmpty());
        this.tilStatusTempat.setHintEnabled(!this.etStatusTempat.getText().toString().isEmpty());
        this.tilNoTelepon.setHintEnabled(!this.etNoTelepon.getText().toString().isEmpty());
        this.tilLamaMenempati.setHintEnabled(true ^ this.etLamaMenempati.getText().toString().isEmpty());
        this.etAlamat.addTextChangedListener(this);
        this.etKota.addTextChangedListener(this);
        this.etKodePos.addTextChangedListener(this);
        this.etNoTelepon.addTextChangedListener(this);
        this.etLamaMenempati.addTextChangedListener(this);
    }

    @OnClick({2131297198})
    public void showStatusTempatTinggalDialog(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "homestatus");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.d));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etStatusTempat.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "homestatus");
    }
}
