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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihJenisMataUangActivity_ViewBinding.class */
public class PilihJenisMataUangActivity_ViewBinding implements Unbinder {
    private View a;
    private PilihJenisMataUangActivity e;

    public PilihJenisMataUangActivity_ViewBinding(final PilihJenisMataUangActivity pilihJenisMataUangActivity, View view) {
        this.e = pilihJenisMataUangActivity;
        pilihJenisMataUangActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihJenisMataUangActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihJenisMataUangActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihJenisMataUangActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihJenisMataUangActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihJenisMataUangActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
        pilihJenisMataUangActivity.llMataUangTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297605, "field 'llMataUangTidakDitemukan'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihJenisMataUangActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihJenisMataUangActivity.retry(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihJenisMataUangActivity pilihJenisMataUangActivity = this.e;
        if (pilihJenisMataUangActivity != null) {
            this.e = null;
            pilihJenisMataUangActivity.toolbar = null;
            pilihJenisMataUangActivity.txtToolbarTitle = null;
            pilihJenisMataUangActivity.etFilter = null;
            pilihJenisMataUangActivity.rvListItem = null;
            pilihJenisMataUangActivity.tvErrorMessage = null;
            pilihJenisMataUangActivity.va = null;
            pilihJenisMataUangActivity.llMataUangTidakDitemukan = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
