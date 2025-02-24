package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraBagianActivity_ViewBinding.class */
public class PilihNegaraBagianActivity_ViewBinding implements Unbinder {
    private PilihNegaraBagianActivity b;
    private View c;

    public PilihNegaraBagianActivity_ViewBinding(final PilihNegaraBagianActivity pilihNegaraBagianActivity, View view) {
        this.b = pilihNegaraBagianActivity;
        pilihNegaraBagianActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihNegaraBagianActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihNegaraBagianActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihNegaraBagianActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihNegaraBagianActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihNegaraBagianActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
        pilihNegaraBagianActivity.llNegaraTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297813, "field 'llNegaraTidakDitemukan'", LinearLayout.class);
        pilihNegaraBagianActivity.tvData = (TextView) Utils.findRequiredViewAsType(view, 2131298890, "field 'tvData'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihNegaraBagianActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihNegaraBagianActivity.retry(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihNegaraBagianActivity pilihNegaraBagianActivity = this.b;
        if (pilihNegaraBagianActivity != null) {
            this.b = null;
            pilihNegaraBagianActivity.toolbar = null;
            pilihNegaraBagianActivity.txtToolbarTitle = null;
            pilihNegaraBagianActivity.etFilter = null;
            pilihNegaraBagianActivity.rvListItem = null;
            pilihNegaraBagianActivity.tvErrorMessage = null;
            pilihNegaraBagianActivity.va = null;
            pilihNegaraBagianActivity.llNegaraTidakDitemukan = null;
            pilihNegaraBagianActivity.tvData = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
