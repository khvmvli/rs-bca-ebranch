package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihSetoranActivity_ViewBinding.class */
public class PilihSetoranActivity_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private PilihSetoranActivity e;

    public PilihSetoranActivity_ViewBinding(final PilihSetoranActivity pilihSetoranActivity, View view) {
        this.e = pilihSetoranActivity;
        pilihSetoranActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihSetoranActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297881, "method 'onClickTypeSetoran'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihSetoranActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihSetoranActivity.onClickTypeSetoran(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297882, "method 'onClickTypeSetoran'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PilihSetoranActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihSetoranActivity.onClickTypeSetoran(view2);
            }
        });
        pilihSetoranActivity.toolbarTitle = view.getContext().getResources().getString(2131822285);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihSetoranActivity pilihSetoranActivity = this.e;
        if (pilihSetoranActivity != null) {
            this.e = null;
            pilihSetoranActivity.toolbar = null;
            pilihSetoranActivity.txtToolbarTitle = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
