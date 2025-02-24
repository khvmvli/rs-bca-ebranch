package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/WaktuHabisDialog_ViewBinding.class */
public class WaktuHabisDialog_ViewBinding implements Unbinder {
    private View d;
    private WaktuHabisDialog e;

    public WaktuHabisDialog_ViewBinding(final WaktuHabisDialog waktuHabisDialog, View view) {
        this.e = waktuHabisDialog;
        waktuHabisDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        waktuHabisDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.WaktuHabisDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                waktuHabisDialog.close(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        WaktuHabisDialog waktuHabisDialog = this.e;
        if (waktuHabisDialog != null) {
            this.e = null;
            waktuHabisDialog.tvTitle = null;
            waktuHabisDialog.tvContent = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
