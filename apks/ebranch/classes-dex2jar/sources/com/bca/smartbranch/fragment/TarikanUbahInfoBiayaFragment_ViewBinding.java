package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TarikanUbahInfoBiayaFragment_ViewBinding.class */
public class TarikanUbahInfoBiayaFragment_ViewBinding implements Unbinder {
    private TarikanUbahInfoBiayaFragment a;
    private View d;

    public TarikanUbahInfoBiayaFragment_ViewBinding(final TarikanUbahInfoBiayaFragment tarikanUbahInfoBiayaFragment, View view) {
        this.a = tarikanUbahInfoBiayaFragment;
        tarikanUbahInfoBiayaFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        tarikanUbahInfoBiayaFragment.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        tarikanUbahInfoBiayaFragment.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        tarikanUbahInfoBiayaFragment.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296420, "method 'lanjut'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TarikanUbahInfoBiayaFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tarikanUbahInfoBiayaFragment.lanjut();
            }
        });
        Resources resources = view.getContext().getResources();
        tarikanUbahInfoBiayaFragment.retry = resources.getString(2131822092);
        tarikanUbahInfoBiayaFragment.infoBiaya = resources.getString(2131821254);
        tarikanUbahInfoBiayaFragment.tarikanTunai = resources.getString(2131822499);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TarikanUbahInfoBiayaFragment tarikanUbahInfoBiayaFragment = this.a;
        if (tarikanUbahInfoBiayaFragment != null) {
            this.a = null;
            tarikanUbahInfoBiayaFragment.llMain = null;
            tarikanUbahInfoBiayaFragment.tvErrorMessage = null;
            tarikanUbahInfoBiayaFragment.wvContent = null;
            tarikanUbahInfoBiayaFragment.pb = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
