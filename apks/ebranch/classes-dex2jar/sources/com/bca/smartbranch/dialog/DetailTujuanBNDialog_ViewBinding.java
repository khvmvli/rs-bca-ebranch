package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DetailTujuanBNDialog_ViewBinding.class */
public class DetailTujuanBNDialog_ViewBinding implements Unbinder {
    private View b;
    private DetailTujuanBNDialog c;
    private View e;

    public DetailTujuanBNDialog_ViewBinding(final DetailTujuanBNDialog detailTujuanBNDialog, View view) {
        this.c = detailTujuanBNDialog;
        detailTujuanBNDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        detailTujuanBNDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DetailTujuanBNDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTujuanBNDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DetailTujuanBNDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTujuanBNDialog.close();
            }
        });
        detailTujuanBNDialog.title = view.getContext().getResources().getString(2131822187);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTujuanBNDialog detailTujuanBNDialog = this.c;
        if (detailTujuanBNDialog != null) {
            this.c = null;
            detailTujuanBNDialog.tvTitle = null;
            detailTujuanBNDialog.rvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
