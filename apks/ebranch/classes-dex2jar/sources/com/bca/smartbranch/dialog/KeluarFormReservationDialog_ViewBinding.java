package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/KeluarFormReservationDialog_ViewBinding.class */
public class KeluarFormReservationDialog_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private KeluarFormReservationDialog d;
    private View e;

    public KeluarFormReservationDialog_ViewBinding(final KeluarFormReservationDialog keluarFormReservationDialog, View view) {
        this.d = keluarFormReservationDialog;
        keluarFormReservationDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KeluarFormReservationDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                keluarFormReservationDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KeluarFormReservationDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                keluarFormReservationDialog.clickedYes(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296416, "method 'clickedNo'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KeluarFormReservationDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                keluarFormReservationDialog.clickedNo(view2);
            }
        });
        keluarFormReservationDialog.txtContent = view.getContext().getResources().getString(2131821785);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        KeluarFormReservationDialog keluarFormReservationDialog = this.d;
        if (keluarFormReservationDialog != null) {
            this.d = null;
            keluarFormReservationDialog.tvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
