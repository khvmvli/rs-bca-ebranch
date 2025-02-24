package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6CFragment_ViewBinding.class */
public class Page6CFragment_ViewBinding implements Unbinder {
    private Page6CFragment b;

    public Page6CFragment_ViewBinding(Page6CFragment page6CFragment, View view) {
        this.b = page6CFragment;
        page6CFragment.rgTujuanPembukaan = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298232, "field 'rgTujuanPembukaan'", RadioGroup.class);
        page6CFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6CFragment.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6CFragment page6CFragment = this.b;
        if (page6CFragment != null) {
            this.b = null;
            page6CFragment.rgTujuanPembukaan = null;
            page6CFragment.llMain = null;
            page6CFragment.tvNama = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
