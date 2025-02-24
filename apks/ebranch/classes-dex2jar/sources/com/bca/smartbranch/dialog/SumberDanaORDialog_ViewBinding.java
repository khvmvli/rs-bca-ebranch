package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SumberDanaORDialog_ViewBinding.class */
public class SumberDanaORDialog_ViewBinding implements Unbinder {
    private View b;
    private SumberDanaORDialog c;
    private View e;

    public SumberDanaORDialog_ViewBinding(final SumberDanaORDialog sumberDanaORDialog, View view) {
        this.c = sumberDanaORDialog;
        sumberDanaORDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        sumberDanaORDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SumberDanaORDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaORDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SumberDanaORDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaORDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        sumberDanaORDialog.dataSumberDana = resources.getStringArray(2130903095);
        sumberDanaORDialog.title = resources.getString(2131822272);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SumberDanaORDialog sumberDanaORDialog = this.c;
        if (sumberDanaORDialog != null) {
            this.c = null;
            sumberDanaORDialog.tvTitle = null;
            sumberDanaORDialog.rvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
