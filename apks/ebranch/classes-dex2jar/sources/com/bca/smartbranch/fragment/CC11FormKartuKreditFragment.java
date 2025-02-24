package com.bca.smartbranch.fragment;

import android.content.Context;
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
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.PilihNegaraActivity;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.dialog.CategoryListDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.CC11FormKartuKreditFragment;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.QuickRule;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.Calendar;
import java.util.List;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.PilihNegaraActivity_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.getCardCode;
import o.getPromotion;
import o.lewati;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import o.setReceiverName;
import o.setRecurringValue;
import o.showInfoValueTodayOR;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC11FormKartuKreditFragment.class */
public class CC11FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, TextWatcher {
    private setMessage a = new setMessage();
    private Calendar d;
    @BindViews({2131297208, 2131297207, 2131297197, 2131297105, 2131297044, 2131297141, 2131297058, 2131297080})
    List<View> etFields;
    @BindView(2131297044)
    @NotEmpty(messageResId = 2131820786, trim = true)
    @Order(5)
    public EditText etMasaBerlakuKitas;
    @BindView(2131297058)
    @NotEmpty(messageResId = 2131820854, trim = true)
    @Order(7)
    EditText etNamaIbu;
    @BindView(2131297080)
    @NotEmpty(messageResId = 2131820771, trim = true)
    @Order(8)
    public EditText etNegara;
    @BindView(2131297105)
    @NotEmpty(messageResId = 2131820828, trim = true)
    @Order(4)
    public EditText etNoKitas;
    @BindView(2131297141)
    @NotEmpty(messageResId = 2131820842, trim = true)
    @Order(6)
    EditText etPendidikanTerakhir;
    @BindView(2131297197)
    @NotEmpty(messageResId = 2131820844, trim = true)
    @Order(3)
    EditText etStatusPerkawinan;
    @BindView(2131297207)
    @NotEmpty(messageResId = 2131820746, trim = true)
    @Order(2)
    EditText etTanggalLahir;
    @BindView(2131297208)
    @NotEmpty(messageResId = 2131820747, trim = true)
    @Order(1)
    getCardCode etTempatLahir;
    private List<CategoryResponse> f;
    private Validator g;
    private List<CategoryResponse> h;
    private Calendar i;
    private Calendar j;
    @BindView(2131297865)
    public LinearLayout llKitas;
    @BindView(2131297934)
    public LinearLayout llWNA;

    /* renamed from: o */
    private Calendar f33o;
    @BindView(2131298170)
    public RadioButton rbKitasTidak;
    @BindView(2131298171)
    public RadioButton rbKitasYa;
    @BindView(2131298148)
    RadioButton rbLakiLaki;
    @BindView(2131298149)
    RadioButton rbPerempuan;
    @BindView(2131298153)
    RadioButton rbWargaWNA;
    @BindView(2131298154)
    RadioButton rbWargaWNI;
    @BindView(2131298217)
    RadioGroup rgJenisKelamin;
    @BindView(2131298228)
    RadioGroup rgKITAS;
    @BindView(2131298219)
    RadioGroup rgKewarganegaraan;
    @BindViews({2131298740, 2131298739, 2131298729, 2131298651, 2131298591, 2131298686, 2131298605, 2131298626})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298591)
    public LogoutDialog_ViewBinding tilMasaBerlaku;
    @BindView(2131298605)
    LogoutDialog_ViewBinding tilNamaIbu;
    @BindView(2131298626)
    public LogoutDialog_ViewBinding tilNegara;
    @BindView(2131298651)
    public LogoutDialog_ViewBinding tilNoKitas;
    @BindView(2131298686)
    LogoutDialog_ViewBinding tilPendidikanTerakhir;
    @BindView(2131298729)
    LogoutDialog_ViewBinding tilStatusPerkawinan;
    @BindView(2131298739)
    LogoutDialog_ViewBinding tilTanggalLahir;
    @BindView(2131298740)
    LogoutDialog_ViewBinding tilTempatLahir;
    @BindViews({2131299208, 2131299207, 2131299197, 2131299124, 2131299067, 2131299154, 2131299082, 2131299102})
    List<TextView> tvErrors;

    private void d() {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.9
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setMotherMaidenName("");
                if (((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.getLastEducation() != null) {
                    ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.getLastEducation().deleteFromRealm();
                }
                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setBirthPlace("");
                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setBirthDate("");
                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setNationality("");
                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setKitasKitapFlag("");
                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setKitasKitapNumber("");
                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setKitasKitapExpDate("");
                if (((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.getMaritalStatus() != null) {
                    ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.getMaritalStatus().deleteFromRealm();
                }
            }
        });
        if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("KTP")) {
            e(2131296811, new CC10KTPFormKartuKreditFragment(), "CC10KTPFormKartuKreditFragment");
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("Paspor")) {
            e(2131296811, new CC10PasporFormKartuKreditFragment(), "CC10PasporFormKartuKreditFragment");
        }
    }

    static /* synthetic */ void d(CC11FormKartuKreditFragment cC11FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC11FormKartuKreditFragment.tvErrors, cC11FormKartuKreditFragment.tilForms, cC11FormKartuKreditFragment.etFields, editText);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.8
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC11FormKartuKreditFragment.this.etNamaIbu.getEditableText()) {
                        CC11FormKartuKreditFragment cC11FormKartuKreditFragment = CC11FormKartuKreditFragment.this;
                        CC11FormKartuKreditFragment.d(cC11FormKartuKreditFragment, cC11FormKartuKreditFragment.etNamaIbu);
                        ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setMotherMaidenName(editable.toString());
                    } else if (editable == CC11FormKartuKreditFragment.this.etTempatLahir.getEditableText()) {
                        CC11FormKartuKreditFragment cC11FormKartuKreditFragment2 = CC11FormKartuKreditFragment.this;
                        CC11FormKartuKreditFragment.d(cC11FormKartuKreditFragment2, cC11FormKartuKreditFragment2.etTempatLahir);
                        ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setBirthPlace(editable.toString());
                    } else if (editable == CC11FormKartuKreditFragment.this.etNoKitas.getEditableText()) {
                        CC11FormKartuKreditFragment cC11FormKartuKreditFragment3 = CC11FormKartuKreditFragment.this;
                        CC11FormKartuKreditFragment.d(cC11FormKartuKreditFragment3, cC11FormKartuKreditFragment3.etNoKitas);
                        ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setKitasKitapNumber(editable.toString());
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
        return 2131493167;
    }

    @OnClick({2131297080})
    public void clickNegara(View view) {
        startActivity(new Intent(getContext(), PilihNegaraActivity.class));
    }

    @OnClick({2131297207, 2131297044})
    public void clickTanggalLahir(View view) {
        int id = view.getId();
        if (id == 2131297044) {
            if (this.d == null) {
                this.d = Calendar.getInstance();
            }
            if (this.i == null) {
                this.i = Calendar.getInstance();
            }
            showInfoValueTodayOR e = showInfoValueTodayOR.e(this, this.d.get(1), this.d.get(2), this.d.get(5));
            Calendar calendar = this.i;
            OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            oR2PilihProductFragment_ViewBinding.e = calendar2;
            lewati lewati = e.d;
            if (lewati != null) {
                lewati.c.h();
            }
            int color = getResources().getColor(2131099765);
            e.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
            e.show(getActivity().getFragmentManager(), "DatePickerDialogMasaBerlakuKitas");
        } else if (id == 2131297207) {
            if (this.j == null) {
                this.j = Calendar.getInstance();
            }
            if (this.f33o == null) {
                this.f33o = Calendar.getInstance();
            }
            showInfoValueTodayOR e2 = showInfoValueTodayOR.e(this, this.j.get(1), this.j.get(2), this.j.get(5));
            Calendar calendar3 = this.f33o;
            OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding2 = e2.b;
            Calendar calendar4 = (Calendar) calendar3.clone();
            calendar4.set(11, 0);
            calendar4.set(12, 0);
            calendar4.set(13, 0);
            calendar4.set(14, 0);
            oR2PilihProductFragment_ViewBinding2.b = calendar4;
            lewati lewati2 = e2.d;
            if (lewati2 != null) {
                lewati2.c.h();
            }
            int color2 = getResources().getColor(2131099765);
            e2.a = Color.argb(255, Color.red(color2), Color.green(color2), Color.blue(color2));
            e2.show(getActivity().getFragmentManager(), "DatePickerDialogTanggalLahir");
        }
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        String str;
        String str2;
        String tag = showinfovaluetodayor.getTag();
        tag.hashCode();
        if (tag.equals("DatePickerDialogTanggalLahir")) {
            this.j.set(i, i2, i3);
            this.etTanggalLahir.setError(null);
            this.tilTanggalLahir.setHintEnabled(true);
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
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etTanggalLahir);
            this.c.executeTransaction(new Realm.Transaction(i, i2, i3) { // from class: o.setPic
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int e;

                {
                    this.b = r5;
                    this.e = r6;
                    this.c = r7;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setBirthDate(getAnnualFeeBasicAmount.c(this.b, this.e, this.c));
                }
            });
            if (this.tvErrors.get(this.etFields.indexOf(this.etTanggalLahir)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrors.get(this.etFields.indexOf(this.etTanggalLahir)).getText().toString().equals(getString(2131821013))) {
                try {
                    DateTime parseDateTime = DateTimeFormat.forPattern("ddMMyyyy").parseDateTime(((CC8FormKartuKreditActivity) getActivity()).n.getBirthDate());
                    if (parseDateTime.isBefore(DateTime.now().minusYears(21)) && parseDateTime.isAfter(DateTime.now().minusYears(65))) {
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
        } else if (tag.equals("DatePickerDialogMasaBerlakuKitas")) {
            this.d.set(i, i2, i3);
            this.etMasaBerlakuKitas.setError(null);
            this.tilMasaBerlaku.setHintEnabled(true);
            EditText editText2 = this.etMasaBerlakuKitas;
            StringBuilder sb3 = new StringBuilder();
            if (String.valueOf(i3).length() < 2) {
                StringBuilder sb4 = new StringBuilder("0");
                sb4.append(String.valueOf(i3));
                str2 = sb4.toString();
            } else {
                str2 = String.valueOf(i3);
            }
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(getAnnualFeeBasicAmount.a(i2));
            sb3.append(" ");
            sb3.append(i);
            editText2.setText(sb3.toString());
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etMasaBerlakuKitas);
            this.c.executeTransaction(new Realm.Transaction(i, i2, i3) { // from class: o.setReceiverAccount
                public final /* synthetic */ int a;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;

                {
                    this.d = r5;
                    this.c = r6;
                    this.a = r7;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setKitasKitapExpDate(getAnnualFeeBasicAmount.c(this.d, this.c, this.a));
                }
            });
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        d();
    }

    @OnFocusChange({2131297058, 2131297208, 2131297105})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131297058) {
                this.tilNamaIbu.setHintEnabled(true);
            } else if (id == 2131297105) {
                this.tilNoKitas.setHintEnabled(true);
            } else if (id == 2131297208) {
                this.tilTempatLahir.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131297058) {
                if (id2 != 2131297105) {
                    if (id2 == 2131297208 && this.etTempatLahir.getText().toString().isEmpty()) {
                        this.tilTempatLahir.setHintEnabled(false);
                    }
                } else if (this.etNoKitas.getText().toString().isEmpty()) {
                    this.tilNoKitas.setHintEnabled(false);
                }
            } else if (this.etNamaIbu.getText().toString().isEmpty()) {
                this.tilNamaIbu.setHintEnabled(false);
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
        if (write.c.equals("maritalstatus")) {
            this.etStatusPerkawinan.setError(null);
            this.etStatusPerkawinan.setText(write.a.getDescription());
            this.tilStatusPerkawinan.setHintEnabled(true);
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setReceiverCity
                public final /* synthetic */ CategoryListDialog.write c;

                {
                    this.c = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC11FormKartuKreditFragment cC11FormKartuKreditFragment = CC11FormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.c;
                    if (((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.getMaritalStatus() != null) {
                        ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.getMaritalStatus().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.setMaritalStatus(category);
                }
            });
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etStatusPerkawinan);
        } else if (write.c.equals("education")) {
            this.etPendidikanTerakhir.setError(null);
            this.etPendidikanTerakhir.setText(write.a.getDescription());
            this.tilPendidikanTerakhir.setHintEnabled(true);
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setReceiverAlias
                public final /* synthetic */ CategoryListDialog.write e;

                {
                    this.e = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC11FormKartuKreditFragment cC11FormKartuKreditFragment = CC11FormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.e;
                    if (((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.getLastEducation() != null) {
                        ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.getLastEducation().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.setLastEducation(category);
                }
            });
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etPendidikanTerakhir);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegara(PilihNegaraActivity_ViewBinding pilihNegaraActivity_ViewBinding) {
        this.etNegara.setError(null);
        this.tilNegara.setHintEnabled(true);
        this.etNegara.setText(pilihNegaraActivity_ViewBinding.e);
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etNegara);
        this.c.executeTransaction(new Realm.Transaction(pilihNegaraActivity_ViewBinding) { // from class: o.setReceiverCountryName
            public final /* synthetic */ PilihNegaraActivity_ViewBinding c;

            {
                this.c = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC11FormKartuKreditFragment cC11FormKartuKreditFragment = CC11FormKartuKreditFragment.this;
                PilihNegaraActivity_ViewBinding pilihNegaraActivity_ViewBinding2 = this.c;
                ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.setNationality(pilihNegaraActivity_ViewBinding2.a);
                ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.setCountry(pilihNegaraActivity_ViewBinding2.e);
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.10
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.6
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
        }
    }

    @OnClick({2131297141})
    public void onClickedPendidikanTerakhir() {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "education");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.h));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPendidikanTerakhir.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "education");
    }

    @OnClick({2131297197})
    public void onClickedStatusPerkawinan() {
        Bundle bundle = new Bundle();
        bundle.putString("type_category", "maritalstatus");
        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.f));
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etStatusPerkawinan.getText().toString());
        CategoryListDialog categoryListDialog = new CategoryListDialog();
        categoryListDialog.setArguments(bundle);
        categoryListDialog.show(getFragmentManager(), "maritalstatus");
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
                    case 2131297044:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilMasaBerlaku.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297058:
                        this.tvErrors.get(6).setVisibility(0);
                        this.tvErrors.get(6).setText(message);
                        this.tilNamaIbu.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297080:
                        this.tvErrors.get(7).setVisibility(0);
                        this.tvErrors.get(7).setText(message);
                        this.tilNegara.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297105:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilNoKitas.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297141:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
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
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilTanggalLahir.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297208:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilTempatLahir.setBackgroundResource(2131230870);
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
        c(2131296811, new CC12FormKartuKreditFragment(), "CC12FormKartuKreditFragment");
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
        this.h = ((CC8FormKartuKreditActivity) getActivity()).q;
        this.f = ((CC8FormKartuKreditActivity) getActivity()).v;
        this.etTempatLahir.setText(((CC8FormKartuKreditActivity) getActivity()).n.getBirthPlace());
        String str = "";
        this.etTanggalLahir.setText(((CC8FormKartuKreditActivity) getActivity()).n.getBirthDate().isEmpty() ? "" : getAnnualFeeBasicAmount.e(((CC8FormKartuKreditActivity) getActivity()).n.getBirthDate()));
        String gender = ((CC8FormKartuKreditActivity) getActivity()).n.getGender();
        gender.hashCode();
        if (gender.equals("L")) {
            this.rbLakiLaki.setChecked(true);
        } else if (!gender.equals("P")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setGender("L");
                }
            });
        } else {
            this.rbPerempuan.setChecked(true);
        }
        this.etStatusPerkawinan.setText(((CC8FormKartuKreditActivity) getActivity()).n.getMaritalStatus() == null ? "" : ((CC8FormKartuKreditActivity) getActivity()).n.getMaritalStatus().getDescription());
        if (((CC8FormKartuKreditActivity) getActivity()).n.getNationality().isEmpty()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.setReceiverCitizenship
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC11FormKartuKreditFragment cC11FormKartuKreditFragment = CC11FormKartuKreditFragment.this;
                    ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.setNationality("ID");
                    cC11FormKartuKreditFragment.llWNA.setVisibility(8);
                }
            });
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getNationality().equals("ID")) {
            this.rbWargaWNI.setChecked(true);
            this.llWNA.setVisibility(8);
        } else {
            this.rbWargaWNA.setChecked(true);
            this.llWNA.setVisibility(0);
            this.etNegara.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCountry());
            this.tilNegara.setHintEnabled(true);
        }
        String kitasKitapFlag = ((CC8FormKartuKreditActivity) getActivity()).n.getKitasKitapFlag();
        kitasKitapFlag.hashCode();
        if (kitasKitapFlag.equals("1")) {
            this.rbKitasTidak.setChecked(true);
            this.llKitas.setVisibility(8);
        } else if (!kitasKitapFlag.equals("2")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.setReceiverCountry
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC11FormKartuKreditFragment cC11FormKartuKreditFragment = CC11FormKartuKreditFragment.this;
                    ((CC8FormKartuKreditActivity) cC11FormKartuKreditFragment.getActivity()).n.setKitasKitapFlag("2");
                    cC11FormKartuKreditFragment.rbKitasYa.setChecked(true);
                    cC11FormKartuKreditFragment.llKitas.setVisibility(0);
                }
            });
        } else {
            this.rbKitasYa.setChecked(true);
            this.llKitas.setVisibility(0);
            this.etNoKitas.setText(((CC8FormKartuKreditActivity) getActivity()).n.getKitasKitapNumber());
            this.etMasaBerlakuKitas.setText(((CC8FormKartuKreditActivity) getActivity()).n.getKitasKitapExpDate().isEmpty() ? "" : getAnnualFeeBasicAmount.e(((CC8FormKartuKreditActivity) getActivity()).n.getKitasKitapExpDate()));
            if (!((CC8FormKartuKreditActivity) getActivity()).n.getKitasKitapNumber().isEmpty()) {
                this.tilNoKitas.setHintEnabled(true);
            }
            if (!((CC8FormKartuKreditActivity) getActivity()).n.getKitasKitapExpDate().isEmpty()) {
                this.tilMasaBerlaku.setHintEnabled(true);
            }
        }
        EditText editText = this.etPendidikanTerakhir;
        if (((CC8FormKartuKreditActivity) getActivity()).n.getLastEducation() != null) {
            str = ((CC8FormKartuKreditActivity) getActivity()).n.getLastEducation().getDescription();
        }
        editText.setText(str);
        this.etNamaIbu.setText(((CC8FormKartuKreditActivity) getActivity()).n.getMotherMaidenName());
        this.etTempatLahir.addTextChangedListener(this);
        this.etNamaIbu.addTextChangedListener(this);
        this.etNoKitas.addTextChangedListener(this);
        this.rgKewarganegaraan.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.5
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                CC11FormKartuKreditFragment.this.c.executeTransaction(new setReceiverName(this, i));
            }
        });
        this.rgKITAS.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                CC11FormKartuKreditFragment.this.c.executeTransaction(new setRecurringValue(this, i));
            }
        });
        this.rgJenisKelamin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                CC11FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.2.4
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        switch (i) {
                            case 2131298148:
                                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setGender("L");
                                return;
                            case 2131298149:
                                ((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.setGender("P");
                                return;
                            default:
                                return;
                        }
                    }
                });
            }
        });
        this.g.put(this.etTanggalLahir, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.3
            private boolean b() {
                boolean z;
                try {
                    DateTime parseDateTime = DateTimeFormat.forPattern("ddMMyyyy").parseDateTime(((CC8FormKartuKreditActivity) CC11FormKartuKreditFragment.this.getActivity()).n.getBirthDate());
                    z = false;
                    if (parseDateTime.isBefore(DateTime.now().minusYears(21))) {
                        z = false;
                        if (parseDateTime.isAfter(DateTime.now().minusYears(65))) {
                            z = true;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    z = false;
                }
                return z;
            }

            public final String getMessage(Context context) {
                return CC11FormKartuKreditFragment.this.getString(2131821013);
            }

            public final /* synthetic */ boolean isValid(View view2) {
                return b();
            }

            public final /* synthetic */ boolean isValid(Object obj) {
                return b();
            }
        });
        if (!this.etTempatLahir.getText().toString().isEmpty()) {
            this.tilTempatLahir.setHintEnabled(true);
        }
        if (!this.etTanggalLahir.getText().toString().isEmpty()) {
            this.tilTanggalLahir.setHintEnabled(true);
        }
        if (!this.etStatusPerkawinan.getText().toString().isEmpty()) {
            this.tilStatusPerkawinan.setHintEnabled(true);
        }
        if (!this.etPendidikanTerakhir.getText().toString().isEmpty()) {
            this.tilPendidikanTerakhir.setHintEnabled(true);
        }
        if (!this.etNamaIbu.getText().toString().isEmpty()) {
            this.tilNamaIbu.setHintEnabled(true);
        }
        if (!this.etNegara.getText().toString().isEmpty()) {
            this.tilNegara.setHintEnabled(true);
        }
        if (!this.etNoKitas.getText().toString().isEmpty()) {
            this.tilNoKitas.setHintEnabled(true);
        }
        if (!this.etMasaBerlakuKitas.getText().toString().isEmpty()) {
            this.tilMasaBerlaku.setHintEnabled(true);
        }
    }
}
