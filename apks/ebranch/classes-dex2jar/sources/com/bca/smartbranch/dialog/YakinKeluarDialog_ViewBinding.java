package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/YakinKeluarDialog_ViewBinding.class */
public class YakinKeluarDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private View d;
    private YakinKeluarDialog e;

    public YakinKeluarDialog_ViewBinding(final YakinKeluarDialog yakinKeluarDialog, View view) {
        this.e = yakinKeluarDialog;
        yakinKeluarDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.YakinKeluarDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                yakinKeluarDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.YakinKeluarDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                yakinKeluarDialog.clickedYes(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296416, "method 'clickedNo'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.YakinKeluarDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                yakinKeluarDialog.clickedNo(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        yakinKeluarDialog.txtContent = resources.getString(2131822358);
        yakinKeluarDialog.txtContentTeller = resources.getString(2131822361);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        YakinKeluarDialog yakinKeluarDialog = this.e;
        if (yakinKeluarDialog != null) {
            this.e = null;
            yakinKeluarDialog.tvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
