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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraPemrekActivity_ViewBinding.class */
public class PilihNegaraPemrekActivity_ViewBinding implements Unbinder {
    private View b;
    private PilihNegaraPemrekActivity e;

    public PilihNegaraPemrekActivity_ViewBinding(final PilihNegaraPemrekActivity pilihNegaraPemrekActivity, View view) {
        this.e = pilihNegaraPemrekActivity;
        pilihNegaraPemrekActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihNegaraPemrekActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihNegaraPemrekActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihNegaraPemrekActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihNegaraPemrekActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihNegaraPemrekActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
        pilihNegaraPemrekActivity.llNegaraTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297813, "field 'llNegaraTidakDitemukan'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihNegaraPemrekActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihNegaraPemrekActivity.retry(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihNegaraPemrekActivity pilihNegaraPemrekActivity = this.e;
        if (pilihNegaraPemrekActivity != null) {
            this.e = null;
            pilihNegaraPemrekActivity.toolbar = null;
            pilihNegaraPemrekActivity.txtToolbarTitle = null;
            pilihNegaraPemrekActivity.etFilter = null;
            pilihNegaraPemrekActivity.rvListItem = null;
            pilihNegaraPemrekActivity.tvErrorMessage = null;
            pilihNegaraPemrekActivity.va = null;
            pilihNegaraPemrekActivity.llNegaraTidakDitemukan = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
