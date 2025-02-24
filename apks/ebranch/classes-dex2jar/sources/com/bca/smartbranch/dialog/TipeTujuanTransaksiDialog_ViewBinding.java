package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TipeTujuanTransaksiDialog_ViewBinding.class */
public class TipeTujuanTransaksiDialog_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private TipeTujuanTransaksiDialog d;

    public TipeTujuanTransaksiDialog_ViewBinding(final TipeTujuanTransaksiDialog tipeTujuanTransaksiDialog, View view) {
        this.d = tipeTujuanTransaksiDialog;
        tipeTujuanTransaksiDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tipeTujuanTransaksiDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TipeTujuanTransaksiDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tipeTujuanTransaksiDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TipeTujuanTransaksiDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tipeTujuanTransaksiDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        tipeTujuanTransaksiDialog.data = resources.getStringArray(2130903100);
        tipeTujuanTransaksiDialog.title = resources.getString(2131822279);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TipeTujuanTransaksiDialog tipeTujuanTransaksiDialog = this.d;
        if (tipeTujuanTransaksiDialog != null) {
            this.d = null;
            tipeTujuanTransaksiDialog.tvTitle = null;
            tipeTujuanTransaksiDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
