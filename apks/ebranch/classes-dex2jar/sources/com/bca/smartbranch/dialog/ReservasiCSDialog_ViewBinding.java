package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ReservasiCSDialog_ViewBinding.class */
public class ReservasiCSDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private View d;
    private ReservasiCSDialog e;

    public ReservasiCSDialog_ViewBinding(final ReservasiCSDialog reservasiCSDialog, View view) {
        this.e = reservasiCSDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ReservasiCSDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296416, "method 'onClickNo'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ReservasiCSDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSDialog.onClickNo(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296462, "method 'onClickYes'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ReservasiCSDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSDialog.onClickYes(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.e != null) {
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
