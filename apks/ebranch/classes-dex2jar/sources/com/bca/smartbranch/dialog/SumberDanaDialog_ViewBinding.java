package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SumberDanaDialog_ViewBinding.class */
public class SumberDanaDialog_ViewBinding implements Unbinder {
    private SumberDanaDialog b;
    private View c;
    private View d;

    public SumberDanaDialog_ViewBinding(final SumberDanaDialog sumberDanaDialog, View view) {
        this.b = sumberDanaDialog;
        sumberDanaDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        sumberDanaDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SumberDanaDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SumberDanaDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        sumberDanaDialog.sumberDana = resources.getStringArray(2130903094);
        sumberDanaDialog.title = resources.getString(2131822271);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SumberDanaDialog sumberDanaDialog = this.b;
        if (sumberDanaDialog != null) {
            this.b = null;
            sumberDanaDialog.tvTitle = null;
            sumberDanaDialog.rvContent = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
