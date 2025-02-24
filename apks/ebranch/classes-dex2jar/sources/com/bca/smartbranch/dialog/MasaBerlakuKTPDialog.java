package com.bca.smartbranch.dialog;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.FormActivity;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.Calendar;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.lewati;
import o.showInfoValueTodayOR;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/MasaBerlakuKTPDialog.class */
public class MasaBerlakuKTPDialog extends BaseDialog implements showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, Validator.ValidationListener {
    private String a;
    private Validator b;
    private Unbinder c;
    private String d;
    @BindView(2131297044)
    @NotEmpty(messageResId = 2131820784, trim = true)
    @Order(1)
    EditText etMasaBerlaku;
    @BindView(2131298139)
    RadioButton rbEktp;
    @BindView(2131298161)
    RadioButton rbKtp;
    @BindView(2131298591)
    LogoutDialog_ViewBinding tilMasaBerlaku;
    @BindView(2131299067)
    TextView tvErrorMasaBerlaku;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
    }

    @OnClick({2131297631, 2131297753, 2131298139, 2131298161})
    public void chooseTypeKtp(View view) {
        if (view.getId() == 2131297631 || view.getId() == 2131298139) {
            this.rbEktp.setChecked(true);
            this.rbKtp.setChecked(false);
            this.tilMasaBerlaku.setVisibility(8);
            this.tvErrorMasaBerlaku.setVisibility(8);
            this.tilMasaBerlaku.setBackgroundResource(2131230847);
            return;
        }
        this.rbKtp.setChecked(true);
        this.rbEktp.setChecked(false);
        this.tilMasaBerlaku.setVisibility(0);
    }

    @OnClick({2131296419})
    public void clickedPilih() {
        if (this.rbEktp.isChecked()) {
            this.a = "1";
            this.d = "31129999";
            documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH_ViewBinding(this.a, this.d));
            dismiss();
            return;
        }
        this.a = "0";
        this.b.validate();
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        this.tvErrorMasaBerlaku.setVisibility(8);
        this.tilMasaBerlaku.setBackgroundResource(2131230847);
        this.etMasaBerlaku.setError(null);
        this.etMasaBerlaku.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
        this.tilMasaBerlaku.setHintEnabled(true);
        this.d = getAnnualFeeBasicAmount.a(i, i2, i3);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493091;
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
                if (view.getId() != 2131297044) {
                    editText = editText2;
                } else {
                    this.tvErrorMasaBerlaku.setVisibility(0);
                    this.tvErrorMasaBerlaku.setText(message);
                    this.tilMasaBerlaku.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH_ViewBinding(this.a, this.d));
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Validator validator = new Validator(this);
        this.b = validator;
        validator.setValidationListener(this);
        if (((FormActivity) getActivity()).n.getFlagEKTP().equalsIgnoreCase("1") || ((FormActivity) getActivity()).n.getFlagEKTP().equalsIgnoreCase("")) {
            this.rbEktp.setChecked(true);
            this.tilMasaBerlaku.setVisibility(8);
            return;
        }
        this.rbKtp.setChecked(true);
        this.tilMasaBerlaku.setVisibility(0);
        String expID = ((FormActivity) getActivity()).n.getExpID();
        this.d = expID;
        this.etMasaBerlaku.setText(expID);
        String str = this.d;
        if (str != null && !str.isEmpty()) {
            this.tilMasaBerlaku.setHintEnabled(true);
        }
    }

    @OnClick({2131297044})
    public void showDatePicker(View view) {
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
        e.show(getActivity().getFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.c.unbind();
    }
}
