package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/Tarikan100JutaMemberDialog_ViewBinding.class */
public class Tarikan100JutaMemberDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private Tarikan100JutaMemberDialog d;

    public Tarikan100JutaMemberDialog_ViewBinding(final Tarikan100JutaMemberDialog tarikan100JutaMemberDialog, View view) {
        this.d = tarikan100JutaMemberDialog;
        tarikan100JutaMemberDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tarikan100JutaMemberDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "field 'btnYes' and method 'clickedLanjut'");
        tarikan100JutaMemberDialog.btnYes = (Button) Utils.castView(findRequiredView, 2131296462, "field 'btnYes'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.Tarikan100JutaMemberDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tarikan100JutaMemberDialog.clickedLanjut(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'clickedClose'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.Tarikan100JutaMemberDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tarikan100JutaMemberDialog.clickedClose(view2);
            }
        });
        tarikan100JutaMemberDialog.txtContent = view.getContext().getResources().getString(2131822164);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Tarikan100JutaMemberDialog tarikan100JutaMemberDialog = this.d;
        if (tarikan100JutaMemberDialog != null) {
            this.d = null;
            tarikan100JutaMemberDialog.tvTitle = null;
            tarikan100JutaMemberDialog.tvDesc = null;
            tarikan100JutaMemberDialog.btnYes = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
