package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ReservasiTellerDialog_ViewBinding.class */
public class ReservasiTellerDialog_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private ReservasiTellerDialog d;
    private View e;

    public ReservasiTellerDialog_ViewBinding(final ReservasiTellerDialog reservasiTellerDialog, View view) {
        this.d = reservasiTellerDialog;
        reservasiTellerDialog.ivIcon = (ImageView) Utils.findRequiredViewAsType(view, 2131297372, "field 'ivIcon'", ImageView.class);
        reservasiTellerDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "field 'ivClose' and method 'close'");
        reservasiTellerDialog.ivClose = (ImageView) Utils.castView(findRequiredView, 2131296385, "field 'ivClose'", ImageView.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ReservasiTellerDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296416, "method 'onClickNo'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ReservasiTellerDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerDialog.onClickNo(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296462, "method 'onClickYes'");
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ReservasiTellerDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerDialog.onClickYes(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiTellerDialog reservasiTellerDialog = this.d;
        if (reservasiTellerDialog != null) {
            this.d = null;
            reservasiTellerDialog.ivIcon = null;
            reservasiTellerDialog.tvTitle = null;
            reservasiTellerDialog.ivClose = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
