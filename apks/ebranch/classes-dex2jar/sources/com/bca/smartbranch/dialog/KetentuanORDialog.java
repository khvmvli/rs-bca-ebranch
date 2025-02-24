package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.documentProvider;
import o.getLifecycle;
import o.onClickUbahDataPengirim;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/KetentuanORDialog.class */
public class KetentuanORDialog extends BaseDialog {
    private Unbinder b;
    @BindView(2131296416)
    Button btnNo;
    @BindView(2131296462)
    Button btnYes;
    @BindView(2131298110)
    ProgressBar pb;
    @BindView(2131298419)
    getLifecycle svContent;
    @BindView(2131299615)
    TextView tvTitle;
    @BindView(2131299811)
    WebView wvDesc;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296416})
    public void clickedNo() {
        getDialog().dismiss();
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493085;
    }

    @OnClick({2131296462})
    public void onClickYes(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new onClickUbahDataPengirim());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.wvDesc.setBackgroundColor(0);
        this.wvDesc.setWebViewClient(new WebViewClient() { // from class: com.bca.smartbranch.dialog.KetentuanORDialog.4
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                onPageFinished(webView, str);
                KetentuanORDialog.this.svContent.setVisibility(0);
                KetentuanORDialog.this.pb.setVisibility(8);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }
        });
        this.wvDesc.loadUrl("file:///android_asset/ketentuan_transfer.html");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
