package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HapusWarkatBerhasilDialog_ViewBinding.class */
public class HapusWarkatBerhasilDialog_ViewBinding implements Unbinder {
    private HapusWarkatBerhasilDialog b;
    private View e;

    public HapusWarkatBerhasilDialog_ViewBinding(final HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog, View view) {
        this.b = hapusWarkatBerhasilDialog;
        hapusWarkatBerhasilDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        hapusWarkatBerhasilDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HapusWarkatBerhasilDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusWarkatBerhasilDialog.close(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog = this.b;
        if (hapusWarkatBerhasilDialog != null) {
            this.b = null;
            hapusWarkatBerhasilDialog.tvContent = null;
            hapusWarkatBerhasilDialog.tvTitle = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
