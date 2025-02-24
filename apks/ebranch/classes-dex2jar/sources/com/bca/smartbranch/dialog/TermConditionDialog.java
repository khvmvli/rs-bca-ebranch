package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.dialog.TermConditionDialog;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TermConditionDialog.class */
public class TermConditionDialog extends BaseDialog {
    private Unbinder d;
    @BindView(2131298110)
    ProgressBar pb;
    @BindString(2131821633)
    String termConditionTitle;
    @BindView(2131299615)
    TextView tvTitle;
    @BindView(2131299811)
    public WebView wvContent;

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493110;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(Html.fromHtml(this.termConditionTitle));
        new Handler().postDelayed(new Runnable() { // from class: o.ReviewSubMastercardAdapter$ViewHolder_ViewBinding
            @Override // java.lang.Runnable
            public final void run() {
                TermConditionDialog termConditionDialog = TermConditionDialog.this;
                termConditionDialog.wvContent.setBackgroundColor(0);
                termConditionDialog.wvContent.setLayerType(1, null);
                termConditionDialog.wvContent.setWebViewClient(new WebViewClient() { // from class: com.bca.smartbranch.dialog.TermConditionDialog.4
                    @Override // android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView, String str) {
                        onPageFinished(webView, str);
                        TermConditionDialog.this.pb.setVisibility(8);
                        TermConditionDialog.this.wvContent.setVisibility(0);
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        return true;
                    }
                });
                termConditionDialog.wvContent.loadUrl("file:///android_asset/ketentuan.html");
            }
        }, 200);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
