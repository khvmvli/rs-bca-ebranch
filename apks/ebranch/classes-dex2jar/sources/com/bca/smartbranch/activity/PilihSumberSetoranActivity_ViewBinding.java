package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihSumberSetoranActivity_ViewBinding.class */
public class PilihSumberSetoranActivity_ViewBinding implements Unbinder {
    private View d;
    private PilihSumberSetoranActivity e;

    public PilihSumberSetoranActivity_ViewBinding(final PilihSumberSetoranActivity pilihSumberSetoranActivity, View view) {
        this.e = pilihSumberSetoranActivity;
        pilihSumberSetoranActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihSumberSetoranActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296456, "method 'clickSumberSetoran'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihSumberSetoranActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihSumberSetoranActivity.clickSumberSetoran(view2);
            }
        });
        pilihSumberSetoranActivity.toolbarTitle = view.getContext().getResources().getString(2131822281);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihSumberSetoranActivity pilihSumberSetoranActivity = this.e;
        if (pilihSumberSetoranActivity != null) {
            this.e = null;
            pilihSumberSetoranActivity.toolbar = null;
            pilihSumberSetoranActivity.txtToolbarTitle = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
