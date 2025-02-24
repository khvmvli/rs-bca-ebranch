package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TransaksiTellerActivity_ViewBinding.class */
public class TransaksiTellerActivity_ViewBinding implements Unbinder {
    private TransaksiTellerActivity b;
    private View d;

    public TransaksiTellerActivity_ViewBinding(final TransaksiTellerActivity transaksiTellerActivity, View view) {
        this.b = transaksiTellerActivity;
        transaksiTellerActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        transaksiTellerActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        transaksiTellerActivity.rvMenu = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298331, "field 'rvMenu'", setOnStartEnterTransitionListener.class);
        transaksiTellerActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296397, "field 'btnLewati' and method 'onClicedButton'");
        transaksiTellerActivity.btnLewati = (Button) Utils.castView(findRequiredView, 2131296397, "field 'btnLewati'", Button.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransaksiTellerActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transaksiTellerActivity.onClicedButton(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        transaksiTellerActivity.toolbarTitle = resources.getString(2131822285);
        transaksiTellerActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TransaksiTellerActivity transaksiTellerActivity = this.b;
        if (transaksiTellerActivity != null) {
            this.b = null;
            transaksiTellerActivity.toolbar = null;
            transaksiTellerActivity.txtToolbarTitle = null;
            transaksiTellerActivity.rvMenu = null;
            transaksiTellerActivity.llMain = null;
            transaksiTellerActivity.btnLewati = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
