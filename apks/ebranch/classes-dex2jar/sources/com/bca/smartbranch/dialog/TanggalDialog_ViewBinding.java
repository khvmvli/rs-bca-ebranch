package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.DatePicker;
import butterknife.Unbinder;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TanggalDialog_ViewBinding.class */
public class TanggalDialog_ViewBinding implements Unbinder {
    private TanggalDialog b;

    public TanggalDialog_ViewBinding(TanggalDialog tanggalDialog, View view) {
        this.b = tanggalDialog;
        tanggalDialog.datePicker = (DatePicker) Utils.findRequiredViewAsType(view, 2131296858, "field 'datePicker'", DatePicker.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TanggalDialog tanggalDialog = this.b;
        if (tanggalDialog != null) {
            this.b = null;
            tanggalDialog.datePicker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
