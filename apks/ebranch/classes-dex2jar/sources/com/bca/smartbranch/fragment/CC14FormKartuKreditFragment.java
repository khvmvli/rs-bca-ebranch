package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
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
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.CC14FormKartuKreditFragment;
import com.bca.smartbranch.presenter.OcrPresenter;
import com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bumptech.glide.Glide;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.GetPPUNumberResponse;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PhotoCardActivity_ViewBinding;
import o.PilihKantorCabangActivity;
import o.ReRegistrationSuccessActivity_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCurrencyCode;
import o.getPromotion;
import o.getRelationCode;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC14FormKartuKreditFragment.class */
public class CC14FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private List<CategoryResponse> a;
    public String d;
    @BindViews({2131297106, 2131296983})
    List<View> etFields;
    @BindView(2131296983)
    EditText etFotoNPWP;
    @BindView(2131297106)
    @NotEmpty(messageResId = 2131820940, sequence = 1, trim = true)
    @Order(1)
    EditText etNoNpwp;
    private Validator f;
    private OcrPresenter i;
    @BindString(2131820964)
    String invalidFotoNpwp;
    @BindView(2131297365)
    Page6CSFragment ivFotoNPWP;
    private int j;
    @BindViews({2131298652, 2131298532})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298532)
    LogoutDialog_ViewBinding tilFotoNpwp;
    @BindView(2131298652)
    LogoutDialog_ViewBinding tilNoNpwp;
    @BindView(2131299010)
    TextView tvErrorFotoNpwp;
    @BindViews({2131299125, 2131299010})
    List<TextView> tvErrors;

    private void a() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    static /* synthetic */ void d(CC14FormKartuKreditFragment cC14FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC14FormKartuKreditFragment.tvErrors, cC14FormKartuKreditFragment.tilForms, cC14FormKartuKreditFragment.etFields, editText);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC14FormKartuKreditFragment.this.etNoNpwp.getEditableText()) {
                        CC14FormKartuKreditFragment cC14FormKartuKreditFragment = CC14FormKartuKreditFragment.this;
                        CC14FormKartuKreditFragment.d(cC14FormKartuKreditFragment, cC14FormKartuKreditFragment.etNoNpwp);
                        ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setNpwp(editable.toString());
                    }
                }
            });
        }
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        h();
        this.etNoNpwp.setText(str);
        if (!this.etNoNpwp.getText().toString().isEmpty()) {
            this.tilNoNpwp.setHintEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493169;
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setNpwpImg("");
                ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setNpwp("");
                if (((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.getOfficePosition() != null) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.getOfficePosition().deleteFromRealm();
                }
                ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setMonthlyIncome("");
                ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setFlagNPWP("");
            }
        });
        e(2131296811, new CC12FormKartuKreditFragment(), "CC12FormKartuKreditFragment");
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((CC8FormKartuKreditActivity) getActivity()).llMain, str, -1).g();
    }

    @OnFocusChange({2131297106})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297106) {
                this.tilNoNpwp.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297106 && this.etNoNpwp.getText().toString().isEmpty()) {
            this.tilNoNpwp.setHintEnabled(false);
        }
    }

    @OnClick({2131296983, 2131297365})
    public void ivfotoNPWP(View view) {
        Intent intent = new Intent(getActivity(), PhotoCardActivity.class);
        intent.putExtra("TAKE_FOTO", 3);
        startActivity(intent);
    }

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getActivity());
        this.tilFotoNpwp.setBackgroundResource(2131230847);
        this.tvErrorFotoNpwp.setVisibility(8);
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.f.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
    public void onChooseCameraEvent(PilihKantorCabangActivity pilihKantorCabangActivity) {
        if (pilihKantorCabangActivity.c) {
            Intent intent = new Intent(getActivity(), PhotoCardActivity.class);
            intent.putExtra("TAKE_FOTO", 3);
            startActivity(intent);
            return;
        }
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment.9
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setNpwpImg("");
            }
        });
        this.etFotoNPWP.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231142, 0);
        this.ivFotoNPWP.setVisibility(8);
        this.tilFotoNpwp.setHintEnabled(false);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueFotoNPWP(ReRegistrationSuccessActivity_ViewBinding reRegistrationSuccessActivity_ViewBinding) {
        this.tvErrorFotoNpwp.setVisibility(8);
        this.tilFotoNpwp.setBackgroundResource(2131230847);
        this.etFotoNPWP.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.ivFotoNPWP.setVisibility(0);
        this.etFotoNPWP.setText("  ");
        this.tilFotoNpwp.setHintEnabled(true);
        Glide.d(getContext()).e(reRegistrationSuccessActivity_ViewBinding.e).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoNPWP);
        this.d = getPromotion.b(reRegistrationSuccessActivity_ViewBinding.e);
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.setSenderCustomerType
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC14FormKartuKreditFragment cC14FormKartuKreditFragment = CC14FormKartuKreditFragment.this;
                ((CC8FormKartuKreditActivity) cC14FormKartuKreditFragment.getActivity()).n.setNpwpImg(cC14FormKartuKreditFragment.d);
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            a();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            a();
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
        OcrPresenter ocrPresenter = this.i;
        Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> call = ocrPresenter.a;
        if (call != null) {
            call.cancel();
        }
        ocrPresenter.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setNpwpImg("");
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setNpwp("");
                    if (((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.getOfficePosition() != null) {
                        ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.getOfficePosition().deleteFromRealm();
                    }
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setMonthlyIncome("");
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setFlagNPWP("");
                }
            });
            e(2131296811, new CC12FormKartuKreditFragment(), "CC12FormKartuKreditFragment");
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
            this.j = i + 1;
        } else {
            this.j = i;
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
                if (view.getId() != 2131297106) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilNoNpwp.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else {
                b(((CC8FormKartuKreditActivity) getActivity()).llMain, message);
            }
        }
        if (((CC8FormKartuKreditActivity) getActivity()).n.getNpwpImg().isEmpty()) {
            this.tvErrorFotoNpwp.setVisibility(0);
            this.tvErrorFotoNpwp.setText(this.invalidFotoNpwp);
            this.tilFotoNpwp.setBackgroundResource(2131230870);
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        getPromotion.d(getContext());
        if (((CC8FormKartuKreditActivity) getActivity()).n.getNpwpImg().isEmpty()) {
            this.tvErrorFotoNpwp.setVisibility(0);
            this.tvErrorFotoNpwp.setText(this.invalidFotoNpwp);
            this.tilFotoNpwp.setBackgroundResource(2131230870);
            return;
        }
        c(2131296811, new CC14FormKartuKreditPekerjaanFragment(), "CC14FormKartuKreditPekerjaanFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bitmap bitmap;
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        OcrPresenter ocrPresenter = new OcrPresenter();
        this.i = ocrPresenter;
        ocrPresenter.c = this;
        this.a = ((CC8FormKartuKreditActivity) getActivity()).u;
        Validator validator = new Validator(this);
        this.f = validator;
        validator.setValidationListener(this);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if ("".equals(((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.getFlagNPWP())) {
                    ((CC8FormKartuKreditActivity) CC14FormKartuKreditFragment.this.getActivity()).n.setFlagNPWP("Y");
                }
            }
        });
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getNpwpImg().isEmpty()) {
            String npwpImg = ((CC8FormKartuKreditActivity) getActivity()).n.getNpwpImg();
            if (!"".equalsIgnoreCase(npwpImg)) {
                byte[] decode = Base64.decode(npwpImg.getBytes(), 2);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            } else {
                bitmap = null;
            }
            this.ivFotoNPWP.setVisibility(0);
            this.ivFotoNPWP.setImageBitmap(bitmap);
            this.etFotoNPWP.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.etFotoNPWP.setText("  ");
            this.tilFotoNpwp.setHintEnabled(true);
        }
        this.etNoNpwp.setText(((CC8FormKartuKreditActivity) getActivity()).n.getNpwp());
        this.tilNoNpwp.setHintEnabled(true ^ this.etNoNpwp.getText().toString().isEmpty());
        this.etNoNpwp.addTextChangedListener(this);
    }
}
