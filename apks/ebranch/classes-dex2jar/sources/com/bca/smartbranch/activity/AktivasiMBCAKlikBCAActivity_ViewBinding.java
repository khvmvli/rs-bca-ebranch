package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AktivasiMBCAKlikBCAActivity_ViewBinding.class */
public class AktivasiMBCAKlikBCAActivity_ViewBinding implements Unbinder {
    private AktivasiMBCAKlikBCAActivity a;
    private View b;
    private View c;
    private View d;

    public AktivasiMBCAKlikBCAActivity_ViewBinding(final AktivasiMBCAKlikBCAActivity aktivasiMBCAKlikBCAActivity, View view) {
        this.a = aktivasiMBCAKlikBCAActivity;
        aktivasiMBCAKlikBCAActivity.tbAktivasiKlikBCA = (ToggleButton) Utils.findRequiredViewAsType(view, 2131298440, "field 'tbAktivasiKlikBCA'", ToggleButton.class);
        aktivasiMBCAKlikBCAActivity.tbAktivasiMBCA = (ToggleButton) Utils.findRequiredViewAsType(view, 2131298441, "field 'tbAktivasiMBCA'", ToggleButton.class);
        aktivasiMBCAKlikBCAActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        aktivasiMBCAKlikBCAActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        aktivasiMBCAKlikBCAActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131298811, "method 'clikedAktivasiKlikBCA'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiMBCAKlikBCAActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiMBCAKlikBCAActivity.clikedAktivasiKlikBCA(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131298812, "method 'clikedAktivasiMBCA'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiMBCAKlikBCAActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiMBCAKlikBCAActivity.clikedAktivasiMBCA(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'clickedLanjut'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiMBCAKlikBCAActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiMBCAKlikBCAActivity.clickedLanjut(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AktivasiMBCAKlikBCAActivity aktivasiMBCAKlikBCAActivity = this.a;
        if (aktivasiMBCAKlikBCAActivity != null) {
            this.a = null;
            aktivasiMBCAKlikBCAActivity.tbAktivasiKlikBCA = null;
            aktivasiMBCAKlikBCAActivity.tbAktivasiMBCA = null;
            aktivasiMBCAKlikBCAActivity.toolbar = null;
            aktivasiMBCAKlikBCAActivity.tvToolbar = null;
            aktivasiMBCAKlikBCAActivity.llMain = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
