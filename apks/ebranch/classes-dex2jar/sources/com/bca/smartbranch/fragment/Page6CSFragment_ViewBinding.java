package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6CSFragment_ViewBinding.class */
public class Page6CSFragment_ViewBinding implements Unbinder {
    private Page6CSFragment b;

    public Page6CSFragment_ViewBinding(Page6CSFragment page6CSFragment, View view) {
        this.b = page6CSFragment;
        page6CSFragment.rgTujuanPembukaan = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298232, "field 'rgTujuanPembukaan'", RadioGroup.class);
        page6CSFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6CSFragment.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6CSFragment page6CSFragment = this.b;
        if (page6CSFragment != null) {
            this.b = null;
            page6CSFragment.rgTujuanPembukaan = null;
            page6CSFragment.llMain = null;
            page6CSFragment.tvNama = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
