package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
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
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import com.bca.smartbranch.dialog.CategoryListDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.Calendar;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.getPromotion;
import o.lewati;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
import o.showInfoValueTodayOR;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC26AFormKartuKreditFragment.class */
public class CC26AFormKartuKreditFragment extends BaseFragment implements showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, Validator.ValidationListener, TextWatcher {
    private Calendar a;
    public CreditCardSupplement d;
    @BindString(2131820846)
    String errorMinimalLimitBlackPlatinum;
    @BindString(2131820847)
    String errorMinimalLimitOrdinary;
    @BindView(2131296967)
    @NotEmpty(messageResId = 2131820754, sequence = 3, trim = true)
    @Order(5)
    EditText etBidangUsaha;
    @BindViews({2131297054, 2131297207, 2131296987, 2131297094, 2131296967, 2131296992, 2131297043})
    List<View> etFields;
    @BindView(2131297054)
    @NotEmpty(messageResId = 2131820874, sequence = 1, trim = true)
    @Order(1)
    EditText etFullName;
    @BindView(2131296987)
    @NotEmpty(messageResId = 2131820803, trim = true)
    @Order(3)
    EditText etHubungan;
    @BindView(2131296992)
    @NotEmpty(messageResId = 2131820744, sequence = 2, trim = true)
    @Order(6)
    EditText etJabatan;
    @BindView(2131297043)
    @NotEmpty(messageResId = 2131820843, trim = true)
    @Order(7)
    EditText etLimit;
    @BindView(2131297094)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(4)
    EditText etNoHP;
    @BindView(2131297207)
    @NotEmpty(messageResId = 2131820746, trim = true)
    @Order(2)
    EditText etTanggalLahir;
    private List<CategoryResponse> f;
    private CreditCard g;
    private boolean h;
    private String i;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    private List<CategoryResponse> j;
    private List<CategoryResponse> k;
    private Validator l;
    @BindView(2131297705)
    LinearLayout llJob;
    @BindView(2131297516)
    LinearLayout llTambahKartu;
    private int m;
    private Calendar n;
    @BindView(2131298148)
    RadioButton rbLakiLaki;
    @BindView(2131298149)
    RadioButton rbPerempuan;
    @BindView(2131298217)
    RadioGroup rgJenisKelamin;
    @BindView(2131298517)
    LogoutDialog_ViewBinding tilBidangUsaha;
    @BindViews({2131298601, 2131298739, 2131298536, 2131298640, 2131298517, 2131298541, 2131298590})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298536)
    LogoutDialog_ViewBinding tilHubungan;
    @BindView(2131298541)
    LogoutDialog_ViewBinding tilJabatan;
    @BindView(2131298590)
    LogoutDialog_ViewBinding tilLimit;
    @BindView(2131298601)
    LogoutDialog_ViewBinding tilNama;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298739)
    LogoutDialog_ViewBinding tilTanggalLahir;
    @BindViews({2131299078, 2131299207, 2131299013, 2131299115, 2131298996, 2131299016, 2131299066})
    List<TextView> tvErrors;

    private void b() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    static /* synthetic */ void c(CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC26AFormKartuKreditFragment.tvErrors, cC26AFormKartuKreditFragment.tilForms, cC26AFormKartuKreditFragment.etFields, editText);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment.8
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC26AFormKartuKreditFragment.this.etFullName.getEditableText()) {
                        CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment = CC26AFormKartuKreditFragment.this;
                        CC26AFormKartuKreditFragment.c(cC26AFormKartuKreditFragment, cC26AFormKartuKreditFragment.etFullName);
                        CC26AFormKartuKreditFragment.this.d.setCustomerName(editable.toString());
                    } else if (editable == CC26AFormKartuKreditFragment.this.etNoHP.getEditableText()) {
                        CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment2 = CC26AFormKartuKreditFragment.this;
                        CC26AFormKartuKreditFragment.c(cC26AFormKartuKreditFragment2, cC26AFormKartuKreditFragment2.etNoHP);
                        CC26AFormKartuKreditFragment.this.d.setMobileNumber(editable.toString());
                    } else if (editable == CC26AFormKartuKreditFragment.this.etLimit.getEditableText()) {
                        CC26AFormKartuKreditFragment.this.etLimit.removeTextChangedListener(CC26AFormKartuKreditFragment.this);
                        int length = CC26AFormKartuKreditFragment.this.etLimit.length();
                        CC26AFormKartuKreditFragment.this.etLimit.setText(getPromotion.i(CC26AFormKartuKreditFragment.this.etLimit.getText().toString()));
                        int length2 = CC26AFormKartuKreditFragment.this.etLimit.length();
                        if ((CC26AFormKartuKreditFragment.this.m + length2) - length > 0) {
                            CC26AFormKartuKreditFragment.this.etLimit.setSelection((CC26AFormKartuKreditFragment.this.m + length2) - length);
                        } else {
                            CC26AFormKartuKreditFragment.this.etLimit.setSelection(0);
                        }
                        CC26AFormKartuKreditFragment.this.etLimit.addTextChangedListener(CC26AFormKartuKreditFragment.this);
                        CC26AFormKartuKreditFragment.this.d.setSupplementCardLimit(CC26AFormKartuKreditFragment.this.etLimit.getText().toString().replaceAll("\\.", ""));
                        if (CC26AFormKartuKreditFragment.this.tvErrors.get(CC26AFormKartuKreditFragment.this.etFields.indexOf(CC26AFormKartuKreditFragment.this.etLimit)).getVisibility() != 0) {
                            return;
                        }
                        if (CC26AFormKartuKreditFragment.this.tvErrors.get(CC26AFormKartuKreditFragment.this.etFields.indexOf(CC26AFormKartuKreditFragment.this.etLimit)).getText().toString().equals(CC26AFormKartuKreditFragment.this.errorMinimalLimitBlackPlatinum)) {
                            if (Long.parseLong(CC26AFormKartuKreditFragment.this.etLimit.getText().toString().replaceAll("\\.", "")) >= 5000000) {
                                List<TextView> list = CC26AFormKartuKreditFragment.this.tvErrors;
                                List<LogoutDialog_ViewBinding> list2 = CC26AFormKartuKreditFragment.this.tilForms;
                                int indexOf = CC26AFormKartuKreditFragment.this.etFields.indexOf(CC26AFormKartuKreditFragment.this.etLimit);
                                list.get(indexOf).setVisibility(8);
                                list2.get(indexOf).setBackgroundResource(2131230847);
                            }
                        } else if (!CC26AFormKartuKreditFragment.this.tvErrors.get(CC26AFormKartuKreditFragment.this.etFields.indexOf(CC26AFormKartuKreditFragment.this.etLimit)).getText().toString().equals(CC26AFormKartuKreditFragment.this.errorMinimalLimitOrdinary)) {
                            CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment3 = CC26AFormKartuKreditFragment.this;
                            CC26AFormKartuKreditFragment.c(cC26AFormKartuKreditFragment3, cC26AFormKartuKreditFragment3.etLimit);
                        } else if (Long.parseLong(CC26AFormKartuKreditFragment.this.etLimit.getText().toString().replaceAll("\\.", "")) >= 1000000) {
                            List<TextView> list3 = CC26AFormKartuKreditFragment.this.tvErrors;
                            List<LogoutDialog_ViewBinding> list4 = CC26AFormKartuKreditFragment.this.tilForms;
                            int indexOf2 = CC26AFormKartuKreditFragment.this.etFields.indexOf(CC26AFormKartuKreditFragment.this.etLimit);
                            list3.get(indexOf2).setVisibility(8);
                            list4.get(indexOf2).setBackgroundResource(2131230847);
                        }
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
        return 2131493181;
    }

    @OnClick({2131297207})
    public void clickTanggalLahir(View view) {
        if (this.a == null) {
            this.a = Calendar.getInstance();
        }
        if (this.n == null) {
            this.n = Calendar.getInstance();
        }
        showInfoValueTodayOR e = showInfoValueTodayOR.e(this, this.a.get(1), this.a.get(2), this.a.get(5));
        Calendar calendar = this.n;
        OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        oR2PilihProductFragment_ViewBinding.b = calendar2;
        lewati lewati = e.d;
        if (lewati != null) {
            lewati.c.h();
        }
        int color = getResources().getColor(2131099765);
        e.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
        e.show(getActivity().getFragmentManager(), "DatePickerDialogTanggalLahir");
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        String str;
        this.a.set(i, i2, i3);
        this.etTanggalLahir.setError(null);
        EditText editText = this.etTanggalLahir;
        StringBuilder sb = new StringBuilder();
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb2 = new StringBuilder("0");
            sb2.append(String.valueOf(i3));
            str = sb2.toString();
        } else {
            str = String.valueOf(i3);
        }
        sb.append(str);
        sb.append(" ");
        sb.append(getAnnualFeeBasicAmount.a(i2));
        sb.append(" ");
        sb.append(i);
        editText.setText(sb.toString());
        this.tilTanggalLahir.setHintEnabled(true);
        this.c.executeTransaction(new Realm.Transaction(i, i2, i3) { // from class: o.setRtgs
            public final /* synthetic */ int b;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;

            {
                this.b = r5;
                this.d = r6;
                this.e = r7;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC26AFormKartuKreditFragment.this.d.setBirthDate(getAnnualFeeBasicAmount.c(this.b, this.d, this.e));
            }
        });
        if (this.tvErrors.get(this.etFields.indexOf(this.etTanggalLahir)).getVisibility() != 0) {
            return;
        }
        if (this.tvErrors.get(this.etFields.indexOf(this.etTanggalLahir)).getText().toString().equals(getString(2131821014))) {
            try {
                if (DateTimeFormat.forPattern("ddMMyyyy").parseDateTime(this.d.getBirthDate()).isBefore(DateTime.now().minusYears(17))) {
                    List<TextView> list = this.tvErrors;
                    List<LogoutDialog_ViewBinding> list2 = this.tilForms;
                    int indexOf = this.etFields.indexOf(this.etTanggalLahir);
                    list.get(indexOf).setVisibility(8);
                    list2.get(indexOf).setBackgroundResource(2131230847);
                }
            } catch (IllegalArgumentException e) {
            }
        } else {
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etTanggalLahir);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC26AFormKartuKreditFragment.this.d.setCustomerName("");
                CC26AFormKartuKreditFragment.this.d.setBirthDate("");
                CC26AFormKartuKreditFragment.this.d.setGender("");
                if (CC26AFormKartuKreditFragment.this.d.getRelationship() != null) {
                    CC26AFormKartuKreditFragment.this.d.getRelationship().deleteFromRealm();
                }
                CC26AFormKartuKreditFragment.this.d.setMobileNumber("");
                if (CC26AFormKartuKreditFragment.this.d.getJobSector() != null) {
                    CC26AFormKartuKreditFragment.this.d.getJobSector().deleteFromRealm();
                }
                if (CC26AFormKartuKreditFragment.this.d.getOccupation() != null) {
                    CC26AFormKartuKreditFragment.this.d.getOccupation().deleteFromRealm();
                }
                CC26AFormKartuKreditFragment.this.d.setSupplementCardLimit("");
            }
        });
        e(2131296811, new CC25AFormKartuKreditFragment(), "CC25AFormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        this.h = false;
        getPromotion.d(getActivity());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.l.validate();
    }

    @OnFocusChange({2131297054, 2131296987, 2131297094, 2131297043})
    public void onChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296987:
                    this.tilHubungan.setHintEnabled(true);
                    return;
                case 2131297043:
                    this.tilLimit.setHintEnabled(true);
                    return;
                case 2131297054:
                    this.tilNama.setHintEnabled(true);
                    return;
                case 2131297094:
                    this.tilNoHp.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            int id = view.getId();
            if (id != 2131297043) {
                if (id != 2131297054) {
                    if (id == 2131297094 && this.etNoHP.getText().toString().isEmpty()) {
                        this.tilNoHp.setHintEnabled(false);
                    }
                } else if (this.etFullName.getText().toString().isEmpty()) {
                    this.tilNama.setHintEnabled(false);
                }
            } else if (this.etLimit.getText().toString().isEmpty()) {
                this.tilLimit.setHintEnabled(false);
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCategoryEvent(CategoryListDialog.write write) {
        if (write.c.equals("relationship")) {
            this.etHubungan.setError(null);
            this.etHubungan.setText(write.a.getDescription());
            this.tilHubungan.setHintEnabled(true);
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setSenderCitizenship
                public final /* synthetic */ CategoryListDialog.write c;

                {
                    this.c = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment = CC26AFormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.c;
                    if (cC26AFormKartuKreditFragment.d.getRelationship() != null) {
                        cC26AFormKartuKreditFragment.d.getRelationship().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    cC26AFormKartuKreditFragment.d.setRelationship(category);
                }
            });
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etHubungan);
        } else if (write.c.equals("businessfield")) {
            this.etBidangUsaha.setError(null);
            this.etBidangUsaha.setText(write.a.getDescription());
            this.tilBidangUsaha.setHintEnabled(true);
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setRecurringVar
                public final /* synthetic */ CategoryListDialog.write e;

                {
                    this.e = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment = CC26AFormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.e;
                    if (cC26AFormKartuKreditFragment.d.getJobSector() != null) {
                        cC26AFormKartuKreditFragment.d.getJobSector().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    cC26AFormKartuKreditFragment.d.setJobSector(category);
                }
            });
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etBidangUsaha);
        } else if (write.c.equals("occupation")) {
            this.etJabatan.setError(null);
            this.etJabatan.setText(write.a.getDescription());
            this.tilJabatan.setHintEnabled(true);
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setRepresentative
                public final /* synthetic */ CategoryListDialog.write b;

                {
                    this.b = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment = CC26AFormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.b;
                    if (cC26AFormKartuKreditFragment.d.getOccupation() != null) {
                        cC26AFormKartuKreditFragment.d.getOccupation().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    cC26AFormKartuKreditFragment.d.setOccupation(category);
                }
            });
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etJabatan);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment.10
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC26AFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            b();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment.7
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC26AFormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            b();
        }
    }

    @OnClick({2131296967})
    public void onClickBidangUsaha() {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "businessfield");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.j));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etBidangUsaha.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "businessfield");
    }

    @OnClick({2131296987})
    public void onClickHubungan() {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "relationship");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.k));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etHubungan.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "relationship");
    }

    @OnClick({2131296992})
    public void onClickJabatan() {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "occupation");
        bundle.putString("TYPE_OCCUPATION", "jabatan");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.f));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etJabatan.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "occupation");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558409, menu);
        onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC26AFormKartuKreditFragment.this.d.setCustomerName("");
                    CC26AFormKartuKreditFragment.this.d.setBirthDate("");
                    CC26AFormKartuKreditFragment.this.d.setGender("");
                    if (CC26AFormKartuKreditFragment.this.d.getRelationship() != null) {
                        CC26AFormKartuKreditFragment.this.d.getRelationship().deleteFromRealm();
                    }
                    CC26AFormKartuKreditFragment.this.d.setMobileNumber("");
                    if (CC26AFormKartuKreditFragment.this.d.getJobSector() != null) {
                        CC26AFormKartuKreditFragment.this.d.getJobSector().deleteFromRealm();
                    }
                    if (CC26AFormKartuKreditFragment.this.d.getOccupation() != null) {
                        CC26AFormKartuKreditFragment.this.d.getOccupation().deleteFromRealm();
                    }
                    CC26AFormKartuKreditFragment.this.d.setSupplementCardLimit("");
                }
            });
            e(2131296811, new CC25AFormKartuKreditFragment(), "CC25AFormKartuKreditFragment");
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
            this.m = i + 1;
        } else {
            this.m = i;
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
                switch (view.getId()) {
                    case 2131296967:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilBidangUsaha.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296987:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilHubungan.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296992:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
                        this.tilJabatan.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297043:
                        this.tvErrors.get(6).setVisibility(0);
                        this.tvErrors.get(6).setText(message);
                        this.tilLimit.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297054:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilNama.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297094:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilNoHp.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297207:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilTanggalLahir.setBackgroundResource(2131230870);
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
        if (this.h) {
            c(2131296811, new CC21BFormKartuKreditFragment(), "CC21BFormKartuKreditFragment");
        } else {
            c(2131296811, new CC27FormKartuKreditFragment(), "cc27FormKartuKreditFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.l = validator;
        validator.setValidationListener(this);
        if (this.etNoHP.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
            Validator validator2 = this.l;
            EditText editText = this.etNoHP;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006d: INVOKE  
                  (r0v147 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v149 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v20 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x0069: CONSTRUCTOR  
                  (r0v149 'editText' android.widget.EditText)
                  (r0v141 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC26AFormKartuKreditFragment.class
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
            // Method dump skipped, instructions count: 808
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @OnClick({2131297516})
        public void tambahPemegangKartu(View view) {
            this.h = true;
            getPromotion.d(getActivity());
            this.l.validate();
        }
    }
