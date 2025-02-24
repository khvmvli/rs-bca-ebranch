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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraActivity_ViewBinding.class */
public class PilihNegaraActivity_ViewBinding implements Unbinder {
    private PilihNegaraActivity a;
    private View b;

    public PilihNegaraActivity_ViewBinding(final PilihNegaraActivity pilihNegaraActivity, View view) {
        this.a = pilihNegaraActivity;
        pilihNegaraActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihNegaraActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihNegaraActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihNegaraActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihNegaraActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihNegaraActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
        pilihNegaraActivity.llNegaraTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297813, "field 'llNegaraTidakDitemukan'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihNegaraActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihNegaraActivity.retry(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihNegaraActivity pilihNegaraActivity = this.a;
        if (pilihNegaraActivity != null) {
            this.a = null;
            pilihNegaraActivity.toolbar = null;
            pilihNegaraActivity.txtToolbarTitle = null;
            pilihNegaraActivity.etFilter = null;
            pilihNegaraActivity.rvListItem = null;
            pilihNegaraActivity.tvErrorMessage = null;
            pilihNegaraActivity.va = null;
            pilihNegaraActivity.llNegaraTidakDitemukan = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
