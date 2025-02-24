package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/KliringInfoBiayaFragment_ViewBinding.class */
public class KliringInfoBiayaFragment_ViewBinding implements Unbinder {
    private KliringInfoBiayaFragment e;

    public KliringInfoBiayaFragment_ViewBinding(KliringInfoBiayaFragment kliringInfoBiayaFragment, View view) {
        this.e = kliringInfoBiayaFragment;
        kliringInfoBiayaFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        kliringInfoBiayaFragment.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        kliringInfoBiayaFragment.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        kliringInfoBiayaFragment.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        Resources resources = view.getContext().getResources();
        kliringInfoBiayaFragment.retry = resources.getString(2131822092);
        kliringInfoBiayaFragment.infoBiaya = resources.getString(2131821254);
        kliringInfoBiayaFragment.tarikanTunai = resources.getString(2131821802);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        KliringInfoBiayaFragment kliringInfoBiayaFragment = this.e;
        if (kliringInfoBiayaFragment != null) {
            this.e = null;
            kliringInfoBiayaFragment.llMain = null;
            kliringInfoBiayaFragment.tvErrorMessage = null;
            kliringInfoBiayaFragment.wvContent = null;
            kliringInfoBiayaFragment.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
