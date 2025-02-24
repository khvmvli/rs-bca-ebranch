package com.bca.smartbranch.fragment;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TarikanUbahInfoBiayaFragment$MediaBrowserCompat$CustomActionResultReceiver.class */
final class TarikanUbahInfoBiayaFragment$MediaBrowserCompat$CustomActionResultReceiver extends WebViewClient {
    final /* synthetic */ TarikanUbahInfoBiayaFragment b;

    private TarikanUbahInfoBiayaFragment$MediaBrowserCompat$CustomActionResultReceiver(TarikanUbahInfoBiayaFragment tarikanUbahInfoBiayaFragment) {
        this.b = tarikanUbahInfoBiayaFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ TarikanUbahInfoBiayaFragment$MediaBrowserCompat$CustomActionResultReceiver(TarikanUbahInfoBiayaFragment tarikanUbahInfoBiayaFragment, byte b) {
        this(tarikanUbahInfoBiayaFragment);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        onPageFinished(webView, str);
        this.b.pb.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        this.b.pb.setVisibility(8);
        this.b.tvErrorMessage.setVisibility(0);
        this.b.tvErrorMessage.setText(2131822124);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.loadUrl("https://www.bca.co.id/teller-smartbranch");
        return true;
    }
}
