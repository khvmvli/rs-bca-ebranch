package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceMenuActivity.class */
public class OutwardRemittanceMenuActivity extends BaseActivityPostLogin {
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822238)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
    }

    @OnClick({2131298927})
    public void detailBCAFullPayment(View view) {
        Intent intent = new Intent(this, InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822215));
        startActivity(intent);
    }

    @OnClick({2131298931})
    public void detailKirimanUangNormal(View view) {
        Intent intent = new Intent(this, InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822218));
        startActivity(intent);
    }

    @OnClick({2131298932})
    public void detailLCS(View view) {
        Intent intent = new Intent(this, InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822219));
        startActivity(intent);
    }

    @OnClick({2131298933})
    public void detailMultiCurrencyBCA(View view) {
        Intent intent = new Intent(this, InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822220));
        startActivity(intent);
    }

    @OnClick({2131298934})
    public void detailRTGSCNY(View view) {
        Intent intent = new Intent(this, InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822221));
        startActivity(intent);
    }

    @OnClick({2131297726, 2131297541, 2131297775})
    public void onChooseMenu(View view) {
        Intent intent = new Intent(this, OutwardRemittanceFormActivity.class);
        int id = view.getId();
        if (id == 2131297541) {
            intent.putExtra("product", "F");
        } else if (id == 2131297726) {
            intent.putExtra("product", "O");
        } else if (id == 2131297775) {
            intent.putExtra("product", "M");
        }
        startActivity(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "OutwardRemittanceMenuActivity";
        this.j = "OutwardRemittanceMenuActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492971;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
