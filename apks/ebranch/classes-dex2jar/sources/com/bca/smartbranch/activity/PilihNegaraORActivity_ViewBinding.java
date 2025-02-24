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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraORActivity_ViewBinding.class */
public class PilihNegaraORActivity_ViewBinding implements Unbinder {
    private View a;
    private PilihNegaraORActivity b;

    public PilihNegaraORActivity_ViewBinding(final PilihNegaraORActivity pilihNegaraORActivity, View view) {
        this.b = pilihNegaraORActivity;
        pilihNegaraORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihNegaraORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihNegaraORActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihNegaraORActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihNegaraORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihNegaraORActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
        pilihNegaraORActivity.llNegaraTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297813, "field 'llNegaraTidakDitemukan'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihNegaraORActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihNegaraORActivity.retry(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihNegaraORActivity pilihNegaraORActivity = this.b;
        if (pilihNegaraORActivity != null) {
            this.b = null;
            pilihNegaraORActivity.toolbar = null;
            pilihNegaraORActivity.txtToolbarTitle = null;
            pilihNegaraORActivity.etFilter = null;
            pilihNegaraORActivity.rvListItem = null;
            pilihNegaraORActivity.tvErrorMessage = null;
            pilihNegaraORActivity.va = null;
            pilihNegaraORActivity.llNegaraTidakDitemukan = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
