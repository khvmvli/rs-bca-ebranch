package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiSuccessAskNextActivity_ViewBinding.class */
public class ReservasiSuccessAskNextActivity_ViewBinding implements Unbinder {
    private ReservasiSuccessAskNextActivity b;
    private View d;
    private View e;

    public ReservasiSuccessAskNextActivity_ViewBinding(final ReservasiSuccessAskNextActivity reservasiSuccessAskNextActivity, View view) {
        this.b = reservasiSuccessAskNextActivity;
        reservasiSuccessAskNextActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        reservasiSuccessAskNextActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        reservasiSuccessAskNextActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'yes'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessAskNextActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessAskNextActivity.yes(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296416, "method 'no'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessAskNextActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessAskNextActivity.no(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiSuccessAskNextActivity reservasiSuccessAskNextActivity = this.b;
        if (reservasiSuccessAskNextActivity != null) {
            this.b = null;
            reservasiSuccessAskNextActivity.toolbar = null;
            reservasiSuccessAskNextActivity.txtToolbarTitle = null;
            reservasiSuccessAskNextActivity.llMain = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
