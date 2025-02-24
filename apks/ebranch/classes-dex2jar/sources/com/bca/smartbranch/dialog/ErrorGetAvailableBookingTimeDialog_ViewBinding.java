package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ErrorGetAvailableBookingTimeDialog_ViewBinding.class */
public class ErrorGetAvailableBookingTimeDialog_ViewBinding implements Unbinder {
    private View a;
    private ErrorGetAvailableBookingTimeDialog b;
    private View c;
    private View e;

    public ErrorGetAvailableBookingTimeDialog_ViewBinding(final ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog, View view) {
        this.b = errorGetAvailableBookingTimeDialog;
        errorGetAvailableBookingTimeDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetAvailableBookingTimeDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetAvailableBookingTimeDialog.close();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296380, "method 'clickedNo'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetAvailableBookingTimeDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetAvailableBookingTimeDialog.clickedNo();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296458, "method 'clickedYes'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetAvailableBookingTimeDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetAvailableBookingTimeDialog.clickedYes();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = this.b;
        if (errorGetAvailableBookingTimeDialog != null) {
            this.b = null;
            errorGetAvailableBookingTimeDialog.tvDesc = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
