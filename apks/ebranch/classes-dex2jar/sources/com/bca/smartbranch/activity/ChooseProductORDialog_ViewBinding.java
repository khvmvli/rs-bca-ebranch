package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ChooseProductORDialog_ViewBinding.class */
public class ChooseProductORDialog_ViewBinding implements Unbinder {
    private ChooseProductORDialog a;
    private View b;
    private View d;
    private View e;

    public ChooseProductORDialog_ViewBinding(final ChooseProductORDialog chooseProductORDialog, View view) {
        this.a = chooseProductORDialog;
        chooseProductORDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ChooseProductORDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                chooseProductORDialog.close();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296380, "method 'clickedNo'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ChooseProductORDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                chooseProductORDialog.clickedNo();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'clickedYes'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ChooseProductORDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                chooseProductORDialog.clickedYes();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ChooseProductORDialog chooseProductORDialog = this.a;
        if (chooseProductORDialog != null) {
            this.a = null;
            chooseProductORDialog.tvDesc = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
