package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiListChosenActivity_ViewBinding.class */
public class ReservasiListChosenActivity_ViewBinding implements Unbinder {
    private ReservasiListChosenActivity a;
    private View d;

    public ReservasiListChosenActivity_ViewBinding(final ReservasiListChosenActivity reservasiListChosenActivity, View view) {
        this.a = reservasiListChosenActivity;
        reservasiListChosenActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        reservasiListChosenActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        reservasiListChosenActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        reservasiListChosenActivity.rvData = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298323, "field 'rvData'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiListChosenActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiListChosenActivity.lanjut(view2);
            }
        });
        reservasiListChosenActivity.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiListChosenActivity reservasiListChosenActivity = this.a;
        if (reservasiListChosenActivity != null) {
            this.a = null;
            reservasiListChosenActivity.toolbar = null;
            reservasiListChosenActivity.txtToolbarTitle = null;
            reservasiListChosenActivity.llMain = null;
            reservasiListChosenActivity.rvData = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
