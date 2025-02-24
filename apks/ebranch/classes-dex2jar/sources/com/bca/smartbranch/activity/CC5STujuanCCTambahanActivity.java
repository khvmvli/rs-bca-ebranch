package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.List;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5STujuanCCTambahanActivity.class */
public class CC5STujuanCCTambahanActivity extends BaseActivityPostLogin implements Validator.ValidationListener {
    private Validator f;
    @Checked(messageResId = 2131821025, sequence = 1)
    @BindView(2131298233)
    @Order(1)
    RadioGroup rgTujuanPembukaan;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Validator validator = new Validator(this);
        this.f = validator;
        validator.setValidationListener(this);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822011);
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC5STujuanCCTambahanActivity";
        this.j = "CC5STujuanCCTambahanActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492911;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
