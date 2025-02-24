package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.getMessage;
import o.getPromotion;
import o.onChooseBranch;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC3SKartuUtamaActivity.class */
public class CC3SKartuUtamaActivity extends BaseActivityPostLogin implements Validator.ValidationListener {
    @BindView(2131296396)
    Button btnLanjut;
    @BindView(2131297093)
    @NotEmpty(messageResId = 2131820928, sequence = 1, trim = true)
    EditText etNoCC;
    private Validator f;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298639)
    LogoutDialog_ViewBinding tilNoCC;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299440)
    TextView tvNama;
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
        if (this.m != null) {
            this.tvNama.setVisibility(0);
            if (this.m.getName().split(" ").length > 2) {
                String[] split = this.m.getName().split(" ");
                TextView textView = this.tvNama;
                StringBuilder sb = new StringBuilder("Hi ");
                sb.append(split[0]);
                sb.append(" ");
                sb.append(split[1]);
                sb.append("....,");
                textView.setText(sb.toString());
            } else {
                TextView textView2 = this.tvNama;
                StringBuilder sb2 = new StringBuilder("Hi ");
                sb2.append(this.m.getName());
                sb2.append(",");
                textView2.setText(sb2.toString());
            }
        } else {
            this.tvNama.setVisibility(8);
        }
        EditText editText = this.etNoCC;
        editText.addTextChangedListener(new getMessage(editText));
    }

    @OnFocusChange({2131297093})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297093) {
                this.tilNoCC.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297093 && this.etNoCC.getText().toString().isEmpty()) {
            this.tilNoCC.setHintEnabled(false);
        }
    }

    @OnClick({2131296396})
    public void lanjut() {
        getPromotion.d(this);
        this.f.validate();
    }

    @OnClick({2131296396})
    public void onClickLanjut(View view) {
        startActivity(new Intent(this, onChooseBranch.class));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC3SKartuUtamaActivity";
        this.j = "CC3SKartuUtamaActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492906;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
