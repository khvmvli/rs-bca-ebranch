package com.bca.smartbranch.fragment;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.activity.TarikanTransaksiActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TarikanInfoBiayaFragment.class */
public class TarikanInfoBiayaFragment extends BaseFragment {
    @BindString(2131821254)
    String infoBiaya;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298110)
    ProgressBar pb;
    @BindString(2131822092)
    String retry;
    @BindString(2131822499)
    String tarikanTunai;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299811)
    WebView wvContent;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TarikanInfoBiayaFragment$write.class */
    final class write extends WebViewClient {
        private write() {
        }

        /* synthetic */ write(TarikanInfoBiayaFragment tarikanInfoBiayaFragment, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            onPageFinished(webView, str);
            TarikanInfoBiayaFragment.this.pb.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            TarikanInfoBiayaFragment.this.pb.setVisibility(8);
            TarikanInfoBiayaFragment.this.tvErrorMessage.setVisibility(0);
            TarikanInfoBiayaFragment.this.tvErrorMessage.setText(2131822124);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl("https://www.bca.co.id/teller-smartbranch");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.fragment.BaseFragment
    public final void b(View view) {
        b(view);
        documentProvider.b().c(this);
        ((TarikanTransaksiActivity) getActivity()).llMainIndicator.setVisibility(8);
        ((TarikanTransaksiActivity) getActivity()).txtToolbarTitle.setText(this.infoBiaya);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493276;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        e(2131296811, new T1TransaksiTarikanFragment(), "T1TransaksiTarikanFragment");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.wvContent.destroy();
        onDestroyView();
        ((TarikanTransaksiActivity) getActivity()).llMainIndicator.setVisibility(0);
        ((TarikanTransaksiActivity) getActivity()).txtToolbarTitle.setText(this.tarikanTunai);
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.wvContent.getSettings().setJavaScriptEnabled(true);
        this.wvContent.setWebViewClient(new write(this, (byte) 0));
        this.wvContent.loadUrl("https://www.bca.co.id/teller-smartbranch");
    }
}
