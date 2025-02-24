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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PenggantianKartuATMActivity_ViewBinding.class */
public class PenggantianKartuATMActivity_ViewBinding implements Unbinder {
    private View a;
    private PenggantianKartuATMActivity b;
    private View c;
    private View e;

    public PenggantianKartuATMActivity_ViewBinding(final PenggantianKartuATMActivity penggantianKartuATMActivity, View view) {
        this.b = penggantianKartuATMActivity;
        penggantianKartuATMActivity.tbKartuRusak = (ToggleButton) Utils.findRequiredViewAsType(view, 2131298445, "field 'tbKartuRusak'", ToggleButton.class);
        penggantianKartuATMActivity.tbKartuHilang = (ToggleButton) Utils.findRequiredViewAsType(view, 2131298444, "field 'tbKartuHilang'", ToggleButton.class);
        penggantianKartuATMActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        penggantianKartuATMActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        penggantianKartuATMActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299338, "method 'clikedKartuRusak'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PenggantianKartuATMActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penggantianKartuATMActivity.clikedKartuRusak(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299337, "method 'clikedKartuHilang'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PenggantianKartuATMActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penggantianKartuATMActivity.clikedKartuHilang(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'clickedLanjut'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PenggantianKartuATMActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penggantianKartuATMActivity.clickedLanjut(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PenggantianKartuATMActivity penggantianKartuATMActivity = this.b;
        if (penggantianKartuATMActivity != null) {
            this.b = null;
            penggantianKartuATMActivity.tbKartuRusak = null;
            penggantianKartuATMActivity.tbKartuHilang = null;
            penggantianKartuATMActivity.toolbar = null;
            penggantianKartuATMActivity.tvToolbar = null;
            penggantianKartuATMActivity.llMain = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
