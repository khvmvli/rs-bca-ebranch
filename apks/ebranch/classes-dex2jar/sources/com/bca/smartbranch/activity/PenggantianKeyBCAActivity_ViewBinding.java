package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PenggantianKeyBCAActivity_ViewBinding.class */
public class PenggantianKeyBCAActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private PenggantianKeyBCAActivity e;

    public PenggantianKeyBCAActivity_ViewBinding(final PenggantianKeyBCAActivity penggantianKeyBCAActivity, View view) {
        this.e = penggantianKeyBCAActivity;
        penggantianKeyBCAActivity.tbKeyRusak = (ToggleButton) Utils.findRequiredViewAsType(view, 2131298447, "field 'tbKeyRusak'", ToggleButton.class);
        penggantianKeyBCAActivity.tbKeyHilang = (ToggleButton) Utils.findRequiredViewAsType(view, 2131298446, "field 'tbKeyHilang'", ToggleButton.class);
        penggantianKeyBCAActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        penggantianKeyBCAActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        penggantianKeyBCAActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299359, "method 'clikedKeyRusak'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PenggantianKeyBCAActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penggantianKeyBCAActivity.clikedKeyRusak(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299358, "method 'clikedKeyHilang'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PenggantianKeyBCAActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penggantianKeyBCAActivity.clikedKeyHilang(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'clickedLanjut'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PenggantianKeyBCAActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penggantianKeyBCAActivity.clickedLanjut(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PenggantianKeyBCAActivity penggantianKeyBCAActivity = this.e;
        if (penggantianKeyBCAActivity != null) {
            this.e = null;
            penggantianKeyBCAActivity.tbKeyRusak = null;
            penggantianKeyBCAActivity.tbKeyHilang = null;
            penggantianKeyBCAActivity.toolbar = null;
            penggantianKeyBCAActivity.tvToolbar = null;
            penggantianKeyBCAActivity.llMain = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
