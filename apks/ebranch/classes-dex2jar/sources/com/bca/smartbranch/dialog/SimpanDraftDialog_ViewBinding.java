package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SimpanDraftDialog_ViewBinding.class */
public class SimpanDraftDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View d;
    private SimpanDraftDialog e;

    public SimpanDraftDialog_ViewBinding(final SimpanDraftDialog simpanDraftDialog, View view) {
        this.e = simpanDraftDialog;
        simpanDraftDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SimpanDraftDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                simpanDraftDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SimpanDraftDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                simpanDraftDialog.clickedYes(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296416, "method 'clickedNo'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SimpanDraftDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                simpanDraftDialog.clickedNo(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        simpanDraftDialog.txtContentCS = resources.getString(2131822117);
        simpanDraftDialog.txtContentTeller = resources.getString(2131822119);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SimpanDraftDialog simpanDraftDialog = this.e;
        if (simpanDraftDialog != null) {
            this.e = null;
            simpanDraftDialog.tvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
