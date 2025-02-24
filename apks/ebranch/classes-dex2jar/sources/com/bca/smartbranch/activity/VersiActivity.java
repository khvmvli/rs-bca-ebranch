package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/VersiActivity.class */
public class VersiActivity extends BaseActivityPostLogin {
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvTitleToolbar;
    @BindView(2131299735)
    TextView tvVersi;
    @BindString(2131822290)
    String txtToolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvTitleToolbar.setText(this.txtToolbarTitle);
        TextView textView = this.tvVersi;
        StringBuilder sb = new StringBuilder("V. ");
        sb.append(getPromotion.b(this));
        textView.setText(sb.toString());
        setResult(-1);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "VersiActivity";
        this.j = "VersiActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493017;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
