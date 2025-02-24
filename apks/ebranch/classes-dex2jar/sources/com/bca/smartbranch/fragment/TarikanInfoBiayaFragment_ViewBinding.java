package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TarikanInfoBiayaFragment_ViewBinding.class */
public class TarikanInfoBiayaFragment_ViewBinding implements Unbinder {
    private TarikanInfoBiayaFragment e;

    public TarikanInfoBiayaFragment_ViewBinding(TarikanInfoBiayaFragment tarikanInfoBiayaFragment, View view) {
        this.e = tarikanInfoBiayaFragment;
        tarikanInfoBiayaFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        tarikanInfoBiayaFragment.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        tarikanInfoBiayaFragment.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        tarikanInfoBiayaFragment.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        Resources resources = view.getContext().getResources();
        tarikanInfoBiayaFragment.retry = resources.getString(2131822092);
        tarikanInfoBiayaFragment.infoBiaya = resources.getString(2131821254);
        tarikanInfoBiayaFragment.tarikanTunai = resources.getString(2131822499);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TarikanInfoBiayaFragment tarikanInfoBiayaFragment = this.e;
        if (tarikanInfoBiayaFragment != null) {
            this.e = null;
            tarikanInfoBiayaFragment.llMain = null;
            tarikanInfoBiayaFragment.tvErrorMessage = null;
            tarikanInfoBiayaFragment.wvContent = null;
            tarikanInfoBiayaFragment.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
