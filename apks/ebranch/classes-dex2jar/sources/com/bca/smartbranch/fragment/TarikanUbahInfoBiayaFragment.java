package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.TarikanTransaksiActivity;
import com.bca.smartbranch.activity.TarikanUbahTransaksiActivity;
import o.PilihSetoranActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TarikanUbahInfoBiayaFragment.class */
public class TarikanUbahInfoBiayaFragment extends BaseFragment {
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

    @Override // com.bca.smartbranch.fragment.BaseFragment
    public final void b(View view) {
        b(view);
        documentProvider.b().c(this);
        ((TarikanUbahTransaksiActivity) getActivity()).llMainIndicator.setVisibility(8);
        ((TarikanUbahTransaksiActivity) getActivity()).txtToolbarTitle.setText(this.infoBiaya);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493276;
    }

    @OnClick({2131296420})
    public void lanjut() {
        documentProvider.b().d(new PilihSetoranActivity_ViewBinding());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        e(2131296811, new T1TransaksiTarikanFragment(), "T1TransaksiTarikanFragment");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.wvContent.destroy();
        onDestroyView();
        ((TarikanUbahTransaksiActivity) getActivity()).llMainIndicator.setVisibility(0);
        ((TarikanUbahTransaksiActivity) getActivity()).txtToolbarTitle.setText(this.tarikanTunai);
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        ((TarikanTransaksiActivity) getActivity()).f.setCurrentPage("TarikanUbahInfoBiayaFragment");
        this.wvContent.getSettings().setJavaScriptEnabled(true);
        this.wvContent.setWebViewClient(new TarikanUbahInfoBiayaFragment$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
        this.wvContent.loadUrl("https://www.bca.co.id/teller-smartbranch");
    }
}
