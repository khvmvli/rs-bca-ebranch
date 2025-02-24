package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DeskripsiPekerjaanDialog_ViewBinding.class */
public class DeskripsiPekerjaanDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private DeskripsiPekerjaanDialog c;

    public DeskripsiPekerjaanDialog_ViewBinding(final DeskripsiPekerjaanDialog deskripsiPekerjaanDialog, View view) {
        this.c = deskripsiPekerjaanDialog;
        deskripsiPekerjaanDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        deskripsiPekerjaanDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DeskripsiPekerjaanDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                deskripsiPekerjaanDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DeskripsiPekerjaanDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                deskripsiPekerjaanDialog.close();
            }
        });
        deskripsiPekerjaanDialog.title = view.getContext().getResources().getString(2131822204);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DeskripsiPekerjaanDialog deskripsiPekerjaanDialog = this.c;
        if (deskripsiPekerjaanDialog != null) {
            this.c = null;
            deskripsiPekerjaanDialog.tvTitle = null;
            deskripsiPekerjaanDialog.rvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
