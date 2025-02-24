package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SetiapTanggalDialog_ViewBinding.class */
public class SetiapTanggalDialog_ViewBinding implements Unbinder {
    private View a;
    private SetiapTanggalDialog c;
    private View e;

    public SetiapTanggalDialog_ViewBinding(final SetiapTanggalDialog setiapTanggalDialog, View view) {
        this.c = setiapTanggalDialog;
        setiapTanggalDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        setiapTanggalDialog.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131298952, "field 'tvError'", TextView.class);
        setiapTanggalDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'onClickOk'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SetiapTanggalDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                setiapTanggalDialog.onClickOk(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296383, "method 'onClickCancel'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SetiapTanggalDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                setiapTanggalDialog.onClickCancel(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        setiapTanggalDialog.data = resources.getStringArray(2130903097);
        setiapTanggalDialog.title = resources.getString(2131822264);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SetiapTanggalDialog setiapTanggalDialog = this.c;
        if (setiapTanggalDialog != null) {
            this.c = null;
            setiapTanggalDialog.tvTitle = null;
            setiapTanggalDialog.tvError = null;
            setiapTanggalDialog.rvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
