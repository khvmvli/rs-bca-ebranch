package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BidangPekerjaanDialog_ViewBinding.class */
public class BidangPekerjaanDialog_ViewBinding implements Unbinder {
    private BidangPekerjaanDialog b;
    private View c;
    private View d;

    public BidangPekerjaanDialog_ViewBinding(final BidangPekerjaanDialog bidangPekerjaanDialog, View view) {
        this.b = bidangPekerjaanDialog;
        bidangPekerjaanDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        bidangPekerjaanDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BidangPekerjaanDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bidangPekerjaanDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BidangPekerjaanDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bidangPekerjaanDialog.close();
            }
        });
        bidangPekerjaanDialog.title = view.getContext().getResources().getString(2131822199);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BidangPekerjaanDialog bidangPekerjaanDialog = this.b;
        if (bidangPekerjaanDialog != null) {
            this.b = null;
            bidangPekerjaanDialog.tvTitle = null;
            bidangPekerjaanDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
