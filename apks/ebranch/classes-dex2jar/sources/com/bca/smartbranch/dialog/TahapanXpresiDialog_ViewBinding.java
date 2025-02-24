package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TahapanXpresiDialog_ViewBinding.class */
public class TahapanXpresiDialog_ViewBinding implements Unbinder {
    private TahapanXpresiDialog b;
    private View c;
    private View d;
    private View e;

    public TahapanXpresiDialog_ViewBinding(final TahapanXpresiDialog tahapanXpresiDialog, View view) {
        this.b = tahapanXpresiDialog;
        tahapanXpresiDialog.tvInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299282, "field 'tvInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanXpresiDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanXpresiDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296392, "method 'infoProduct'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanXpresiDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanXpresiDialog.infoProduct(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296386, "method 'fillForm'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanXpresiDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanXpresiDialog.fillForm(view2);
            }
        });
        tahapanXpresiDialog.txtInfo = view.getContext().getResources().getString(2131822149);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TahapanXpresiDialog tahapanXpresiDialog = this.b;
        if (tahapanXpresiDialog != null) {
            this.b = null;
            tahapanXpresiDialog.tvInfo = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
