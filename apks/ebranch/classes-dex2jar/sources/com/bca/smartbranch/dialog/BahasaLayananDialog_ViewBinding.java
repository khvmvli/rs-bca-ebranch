package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BahasaLayananDialog_ViewBinding.class */
public class BahasaLayananDialog_ViewBinding implements Unbinder {
    private View b;
    private BahasaLayananDialog c;
    private View e;

    public BahasaLayananDialog_ViewBinding(final BahasaLayananDialog bahasaLayananDialog, View view) {
        this.c = bahasaLayananDialog;
        bahasaLayananDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        bahasaLayananDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BahasaLayananDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bahasaLayananDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BahasaLayananDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bahasaLayananDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        bahasaLayananDialog.bahasaLayanan = resources.getStringArray(2130903048);
        bahasaLayananDialog.title = resources.getString(2131822197);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BahasaLayananDialog bahasaLayananDialog = this.c;
        if (bahasaLayananDialog != null) {
            this.c = null;
            bahasaLayananDialog.tvTitle = null;
            bahasaLayananDialog.rvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
