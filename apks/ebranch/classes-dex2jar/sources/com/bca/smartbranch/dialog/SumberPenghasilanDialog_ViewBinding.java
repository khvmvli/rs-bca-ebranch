package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SumberPenghasilanDialog_ViewBinding.class */
public class SumberPenghasilanDialog_ViewBinding implements Unbinder {
    private View a;
    private SumberPenghasilanDialog b;
    private View d;

    public SumberPenghasilanDialog_ViewBinding(final SumberPenghasilanDialog sumberPenghasilanDialog, View view) {
        this.b = sumberPenghasilanDialog;
        sumberPenghasilanDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        sumberPenghasilanDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SumberPenghasilanDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberPenghasilanDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SumberPenghasilanDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberPenghasilanDialog.close();
            }
        });
        sumberPenghasilanDialog.title = view.getContext().getResources().getString(2131822273);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SumberPenghasilanDialog sumberPenghasilanDialog = this.b;
        if (sumberPenghasilanDialog != null) {
            this.b = null;
            sumberPenghasilanDialog.tvTitle = null;
            sumberPenghasilanDialog.rvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
