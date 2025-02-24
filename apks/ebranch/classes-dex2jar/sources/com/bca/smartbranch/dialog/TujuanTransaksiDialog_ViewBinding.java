package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TujuanTransaksiDialog_ViewBinding.class */
public class TujuanTransaksiDialog_ViewBinding implements Unbinder {
    private View c;
    private TujuanTransaksiDialog d;
    private View e;

    public TujuanTransaksiDialog_ViewBinding(final TujuanTransaksiDialog tujuanTransaksiDialog, View view) {
        this.d = tujuanTransaksiDialog;
        tujuanTransaksiDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tujuanTransaksiDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanTransaksiDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanTransaksiDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanTransaksiDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanTransaksiDialog.close();
            }
        });
        tujuanTransaksiDialog.title = view.getContext().getResources().getString(2131822287);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TujuanTransaksiDialog tujuanTransaksiDialog = this.d;
        if (tujuanTransaksiDialog != null) {
            this.d = null;
            tujuanTransaksiDialog.tvTitle = null;
            tujuanTransaksiDialog.rvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
