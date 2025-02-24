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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihTujuanTransaksiORActivity_ViewBinding.class */
public class PilihTujuanTransaksiORActivity_ViewBinding implements Unbinder {
    private View c;
    private PilihTujuanTransaksiORActivity e;

    public PilihTujuanTransaksiORActivity_ViewBinding(final PilihTujuanTransaksiORActivity pilihTujuanTransaksiORActivity, View view) {
        this.e = pilihTujuanTransaksiORActivity;
        pilihTujuanTransaksiORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihTujuanTransaksiORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihTujuanTransaksiORActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihTujuanTransaksiORActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihTujuanTransaksiORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihTujuanTransaksiORActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
        pilihTujuanTransaksiORActivity.llTujuanTransaksiTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297605, "field 'llTujuanTransaksiTidakDitemukan'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihTujuanTransaksiORActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihTujuanTransaksiORActivity.retry(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihTujuanTransaksiORActivity pilihTujuanTransaksiORActivity = this.e;
        if (pilihTujuanTransaksiORActivity != null) {
            this.e = null;
            pilihTujuanTransaksiORActivity.toolbar = null;
            pilihTujuanTransaksiORActivity.txtToolbarTitle = null;
            pilihTujuanTransaksiORActivity.etFilter = null;
            pilihTujuanTransaksiORActivity.rvListItem = null;
            pilihTujuanTransaksiORActivity.tvErrorMessage = null;
            pilihTujuanTransaksiORActivity.va = null;
            pilihTujuanTransaksiORActivity.llTujuanTransaksiTidakDitemukan = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
