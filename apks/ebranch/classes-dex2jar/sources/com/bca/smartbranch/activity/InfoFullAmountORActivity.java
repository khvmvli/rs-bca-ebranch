package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoFullAmountORActivity.class */
public class InfoFullAmountORActivity extends BaseActivityPostLogin {
    private Bundle f;
    @BindString(2131821257)
    String infoFullAmountOR;
    @BindView(2131298110)
    ProgressBar pb;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299811)
    WebView wvContent;

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.infoFullAmountOR);
        this.f = getIntent().getExtras();
        this.wvContent.getSettings().setJavaScriptEnabled(true);
        this.wvContent.setWebViewClient(new InfoFullAmountORActivity$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
        this.wvContent.loadUrl("https://www.bca.co.id/id/individu/layanan/pengiriman-uang/remittance/outward-remittance");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        this.wvContent.destroy();
        onDestroy();
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
        setCardSlogan.e().b = "InfoFullAmountORActivity";
        this.j = "InfoFullAmountORActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493019;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
