package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FullAmountDialog_ViewBinding.class */
public class FullAmountDialog_ViewBinding implements Unbinder {
    private FullAmountDialog c;
    private View d;
    private View e;

    public FullAmountDialog_ViewBinding(final FullAmountDialog fullAmountDialog, View view) {
        this.c = fullAmountDialog;
        fullAmountDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        fullAmountDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FullAmountDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fullAmountDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FullAmountDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fullAmountDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        fullAmountDialog.data = resources.getStringArray(2130903110);
        fullAmountDialog.title = resources.getString(2131822206);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FullAmountDialog fullAmountDialog = this.c;
        if (fullAmountDialog != null) {
            this.c = null;
            fullAmountDialog.tvTitle = null;
            fullAmountDialog.rvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
