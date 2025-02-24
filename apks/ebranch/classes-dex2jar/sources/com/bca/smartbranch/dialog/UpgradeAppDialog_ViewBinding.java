package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UpgradeAppDialog_ViewBinding.class */
public class UpgradeAppDialog_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private UpgradeAppDialog e;

    public UpgradeAppDialog_ViewBinding(final UpgradeAppDialog upgradeAppDialog, View view) {
        this.e = upgradeAppDialog;
        upgradeAppDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296451, "field 'btnSkip' and method 'skip'");
        upgradeAppDialog.btnSkip = (Button) Utils.castView(findRequiredView, 2131296451, "field 'btnSkip'", Button.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UpgradeAppDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                upgradeAppDialog.skip(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296417, "field 'btnOk' and method 'ok'");
        upgradeAppDialog.btnOk = (Button) Utils.castView(findRequiredView2, 2131296417, "field 'btnOk'", Button.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UpgradeAppDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                upgradeAppDialog.ok(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UpgradeAppDialog upgradeAppDialog = this.e;
        if (upgradeAppDialog != null) {
            this.e = null;
            upgradeAppDialog.tvContent = null;
            upgradeAppDialog.btnSkip = null;
            upgradeAppDialog.btnOk = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
