package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.dialog.MessageDialog;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoProductActivity.class */
public class InfoProductActivity extends BaseActivityPostLogin {
    private Bundle f;
    private boolean n;
    private long p;
    @BindView(2131298110)
    ProgressBar pb;
    private String s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822214)
    String toolbarTitleBCADollar;
    @BindString(2131822216)
    String toolbarTitleDeposito;
    @BindString(2131822222)
    String toolbarTitleTahapanBCA;
    @BindString(2131822223)
    String toolbarTitleTahapanBerjangka;
    @BindString(2131822224)
    String toolbarTitleTahapanXpresi;
    @BindString(2131822225)
    String toolbarTitleTapres;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299811)
    WebView wvContent;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoProductActivity$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer extends WebViewClient {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(InfoProductActivity infoProductActivity, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            onPageFinished(webView, str);
            InfoProductActivity.this.pb.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            InfoProductActivity.this.pb.setVisibility(8);
            InfoProductActivity.this.tvErrorMessage.setVisibility(0);
            InfoProductActivity.this.tvErrorMessage.setText(2131822124);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0113, code lost:
        if (r0.equals("Tahapan BCA") != false) goto L_0x011b;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 457
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.InfoProductActivity.d(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @OnClick({2131296386})
    public void fillForm(View view) {
        char c;
        String string = this.f.getString("product_type");
        string.hashCode();
        String str = "BCA Dollar";
        switch (string.hashCode()) {
            case -748993769:
                if (string.equals("Tahapan BCA")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -245309302:
                if (string.equals("Tahapan Xpresi")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 164545469:
                if (string.equals("Tapres BCA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1076132060:
                if (string.equals("BCA Dollar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1269943660:
                if (string.equals("Tahapan Berjangka")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1726066065:
                if (string.equals("DEPOSITO")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            str = "Tahapan BCA";
        } else if (c == 1) {
            str = "Tahapan Xpresi";
        } else if (c == 2) {
            str = "Tapres BCA";
        } else if (c != 3) {
            str = c != 4 ? c != 5 ? "" : "DEPOSITO" : "Tahapan Berjangka";
        }
        this.sharedPreferences.edit().putBoolean("from_info_product", true).commit();
        if (str.equals("Tahapan Berjangka")) {
            if (this.m == null) {
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", getString(2131822440));
                bundle.putString("MessageDialogTitle", getString(2131822223));
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
                return;
            }
            Intent intent = new Intent(this, FormActivity.class);
            intent.putExtra("product_type", str);
            intent.putExtra("old_cust", "Y");
            boolean z = this.n;
            if (z) {
                intent.putExtra("is_from_reservation", z);
                intent.putExtra("id_reservation", this.p);
            }
            startActivity(intent);
        } else if (this.m == null) {
            Intent intent2 = new Intent(this, FormActivity.class);
            intent2.putExtra("product_type", str);
            intent2.putExtra("old_cust", "N");
            boolean z2 = this.n;
            if (z2) {
                intent2.putExtra("is_from_reservation", z2);
                intent2.putExtra("id_reservation", this.p);
            }
            startActivity(intent2);
        } else if (this.s.equals("Y")) {
            Intent intent3 = new Intent(this, FormActivity.class);
            intent3.putExtra("product_type", str);
            intent3.putExtra("old_cust", "Y");
            boolean z3 = this.n;
            if (z3) {
                intent3.putExtra("is_from_reservation", z3);
                intent3.putExtra("id_reservation", this.p);
            }
            startActivity(intent3);
        } else {
            Intent intent4 = new Intent(this, AskAccountActivity.class);
            intent4.putExtra("product_type", str);
            boolean z4 = this.n;
            if (z4) {
                intent4.putExtra("is_from_reservation", z4);
                intent4.putExtra("id_reservation", this.p);
            }
            startActivity(intent4);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.n) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        this.wvContent.destroy();
        onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            k();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "InfoProductActivity";
        this.j = "InfoProductActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492961;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
