package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import o.LogoutDialog_ViewBinding;
import o.copyWindowDataInto;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DeleteAccountActivity.class */
public class DeleteAccountActivity extends BaseActivityPostLogin implements View.OnClickListener, View.OnFocusChangeListener {
    @BindView(2131296793)
    setMaxHeight clAlasan;
    @BindView(2131296945)
    EditText etAlasan;
    private int f = 50;
    @BindView(2131297532)
    LinearLayout llAlasan;
    @BindView(2131297546)
    LinearLayout llBelumTersedia;
    @BindView(2131297723)
    LinearLayout llKesulitan;
    @BindView(2131297895)
    LinearLayout llStoragePenuh;
    @BindView(2131297913)
    LinearLayout llTidakMenggunakan;
    @BindView(2131298133)
    RadioButton rbAlasan;
    @BindView(2131298135)
    RadioButton rbBelumTersedia;
    @BindView(2131298152)
    RadioButton rbKesulitan;
    @BindView(2131298180)
    RadioButton rbStoragePenuh;
    @BindView(2131298184)
    RadioButton rbTidakMenggunakan;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView toolbarTitle;
    @BindView(2131298826)
    TextView tvAlasan;
    @BindView(2131298844)
    TextView tvBelumTersedia;
    @BindView(2131298885)
    TextView tvCountAlasan;
    @BindView(2131298973)
    TextView tvErrorAlasan;
    @BindView(2131299347)
    TextView tvKesulitan;
    @BindView(2131299584)
    TextView tvStoragePenuh;
    @BindView(2131299605)
    TextView tvTidakMenggunakan;

    private void d(int i) {
        this.rbTidakMenggunakan.setChecked(false);
        this.rbStoragePenuh.setChecked(false);
        this.rbKesulitan.setChecked(false);
        this.rbBelumTersedia.setChecked(false);
        this.rbAlasan.setChecked(false);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && !this.rbAlasan.isChecked()) {
                            this.rbAlasan.setChecked(true);
                            this.etAlasan.setText("");
                            this.tvErrorAlasan.setVisibility(8);
                            this.tilAlasan.setBackgroundResource(2131230847);
                            this.clAlasan.setVisibility(0);
                        }
                    } else if (!this.rbBelumTersedia.isChecked()) {
                        this.rbBelumTersedia.setChecked(true);
                        this.clAlasan.setVisibility(8);
                    }
                } else if (!this.rbKesulitan.isChecked()) {
                    this.rbKesulitan.setChecked(true);
                    this.clAlasan.setVisibility(8);
                }
            } else if (!this.rbStoragePenuh.isChecked()) {
                this.rbStoragePenuh.setChecked(true);
                this.clAlasan.setVisibility(8);
            }
        } else if (!this.rbTidakMenggunakan.isChecked()) {
            this.rbTidakMenggunakan.setChecked(true);
            this.clAlasan.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.toolbarTitle.setText(getString(2131821696));
        this.llTidakMenggunakan.setOnClickListener(this);
        this.llStoragePenuh.setOnClickListener(this);
        this.llKesulitan.setOnClickListener(this);
        this.llBelumTersedia.setOnClickListener(this);
        this.llAlasan.setOnClickListener(this);
        this.rbTidakMenggunakan.setOnClickListener(this);
        this.rbStoragePenuh.setOnClickListener(this);
        this.rbKesulitan.setOnClickListener(this);
        this.rbBelumTersedia.setOnClickListener(this);
        this.rbAlasan.setOnClickListener(this);
        this.tvTidakMenggunakan.setOnClickListener(this);
        this.tvStoragePenuh.setOnClickListener(this);
        this.tvKesulitan.setOnClickListener(this);
        this.tvBelumTersedia.setOnClickListener(this);
        this.tvAlasan.setOnClickListener(this);
        this.etAlasan.addTextChangedListener(new TextWatcher() { // from class: com.bca.smartbranch.activity.DeleteAccountActivity.3
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (DeleteAccountActivity.this.tvErrorAlasan.getVisibility() == 0 && !DeleteAccountActivity.this.etAlasan.getText().toString().isEmpty()) {
                    DeleteAccountActivity.this.tvErrorAlasan.setVisibility(8);
                    DeleteAccountActivity.this.tilAlasan.setBackgroundResource(2131230847);
                }
                int length = DeleteAccountActivity.this.f - DeleteAccountActivity.this.etAlasan.getText().toString().length();
                if (length > 0) {
                    DeleteAccountActivity.this.tvCountAlasan.setTextColor(copyWindowDataInto.a(DeleteAccountActivity.this, 2131099731));
                } else {
                    DeleteAccountActivity.this.tvCountAlasan.setTextColor(copyWindowDataInto.a(DeleteAccountActivity.this, 2131099826));
                }
                TextView textView = DeleteAccountActivity.this.tvCountAlasan;
                StringBuilder sb = new StringBuilder();
                sb.append(length);
                sb.append("/");
                sb.append(DeleteAccountActivity.this.f);
                textView.setText(sb.toString());
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.etAlasan.setOnFocusChangeListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131297532:
            case 2131298133:
            case 2131298826:
                d(4);
                return;
            case 2131297546:
            case 2131298135:
            case 2131298844:
                d(3);
                return;
            case 2131297723:
            case 2131298152:
            case 2131299347:
                d(2);
                return;
            case 2131297895:
            case 2131298180:
            case 2131299584:
                d(1);
                return;
            case 2131297913:
            case 2131298184:
            case 2131299605:
                d(0);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131296945) {
                this.tilAlasan.setHintEnabled(true);
            }
        } else if (view.getId() == 2131296945 && this.etAlasan.getText().toString().isEmpty()) {
            this.tilAlasan.setHintEnabled(false);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @OnClick({2131296452})
    public void onSubmit(View view) {
        boolean z = false;
        if (!this.rbAlasan.isChecked() || !this.etAlasan.getText().toString().isEmpty()) {
            z = true;
        } else {
            this.tilAlasan.setBackgroundResource(2131230870);
            this.tvErrorAlasan.setText(getString(2131820735));
            this.tvErrorAlasan.setVisibility(0);
        }
        if (z) {
            Intent intent = new Intent(this, DeleteAccountConfirmationActivity.class);
            intent.putExtra("REASON", this.rbTidakMenggunakan.isChecked() ? this.tvTidakMenggunakan.getText().toString() : this.rbStoragePenuh.isChecked() ? this.tvStoragePenuh.getText().toString() : this.rbKesulitan.isChecked() ? this.tvKesulitan.getText().toString() : this.rbBelumTersedia.isChecked() ? this.tvBelumTersedia.getText().toString() : this.etAlasan.getText().toString());
            startActivity(intent);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DeleteAccountActivity";
        this.j = "DeleteAccountActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492920;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
