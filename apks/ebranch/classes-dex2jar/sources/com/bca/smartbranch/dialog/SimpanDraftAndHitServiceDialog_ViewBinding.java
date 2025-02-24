package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SimpanDraftAndHitServiceDialog_ViewBinding.class */
public class SimpanDraftAndHitServiceDialog_ViewBinding implements Unbinder {
    private SimpanDraftAndHitServiceDialog a;
    private View b;
    private View d;
    private View e;

    public SimpanDraftAndHitServiceDialog_ViewBinding(final SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog, View view) {
        this.a = simpanDraftAndHitServiceDialog;
        simpanDraftAndHitServiceDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                simpanDraftAndHitServiceDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                simpanDraftAndHitServiceDialog.clickedYes(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296416, "method 'clickedNo'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                simpanDraftAndHitServiceDialog.clickedNo(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = this.a;
        if (simpanDraftAndHitServiceDialog != null) {
            this.a = null;
            simpanDraftAndHitServiceDialog.tvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
