package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TujuanTransaksiORDialog_ViewBinding.class */
public class TujuanTransaksiORDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private TujuanTransaksiORDialog d;

    public TujuanTransaksiORDialog_ViewBinding(final TujuanTransaksiORDialog tujuanTransaksiORDialog, View view) {
        this.d = tujuanTransaksiORDialog;
        tujuanTransaksiORDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tujuanTransaksiORDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanTransaksiORDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanTransaksiORDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanTransaksiORDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanTransaksiORDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        tujuanTransaksiORDialog.dataTujuanTransaksi = resources.getStringArray(2130903107);
        tujuanTransaksiORDialog.title = resources.getString(2131822314);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TujuanTransaksiORDialog tujuanTransaksiORDialog = this.d;
        if (tujuanTransaksiORDialog != null) {
            this.d = null;
            tujuanTransaksiORDialog.tvTitle = null;
            tujuanTransaksiORDialog.rvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
