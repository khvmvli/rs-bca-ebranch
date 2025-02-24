package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TujuanPemrekDialog_ViewBinding.class */
public class TujuanPemrekDialog_ViewBinding implements Unbinder {
    private View a;
    private TujuanPemrekDialog c;
    private View d;

    public TujuanPemrekDialog_ViewBinding(final TujuanPemrekDialog tujuanPemrekDialog, View view) {
        this.c = tujuanPemrekDialog;
        tujuanPemrekDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tujuanPemrekDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanPemrekDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanPemrekDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanPemrekDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanPemrekDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        tujuanPemrekDialog.tujuanPemrek = resources.getStringArray(2130903105);
        tujuanPemrekDialog.title = resources.getString(2131822286);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TujuanPemrekDialog tujuanPemrekDialog = this.c;
        if (tujuanPemrekDialog != null) {
            this.c = null;
            tujuanPemrekDialog.tvTitle = null;
            tujuanPemrekDialog.rvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
