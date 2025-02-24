package com.bca.smartbranch.dialog;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.getLifecycle;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/KetentuanORDialog_ViewBinding.class */
public class KetentuanORDialog_ViewBinding implements Unbinder {
    private View a;
    private KetentuanORDialog b;
    private View d;
    private View e;

    public KetentuanORDialog_ViewBinding(final KetentuanORDialog ketentuanORDialog, View view) {
        this.b = ketentuanORDialog;
        ketentuanORDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        ketentuanORDialog.wvDesc = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvDesc'", WebView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296416, "field 'btnNo' and method 'clickedNo'");
        ketentuanORDialog.btnNo = (Button) Utils.castView(findRequiredView, 2131296416, "field 'btnNo'", Button.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KetentuanORDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ketentuanORDialog.clickedNo();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "field 'btnYes' and method 'onClickYes'");
        ketentuanORDialog.btnYes = (Button) Utils.castView(findRequiredView2, 2131296462, "field 'btnYes'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KetentuanORDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ketentuanORDialog.onClickYes(view2);
            }
        });
        ketentuanORDialog.svContent = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298419, "field 'svContent'", getLifecycle.class);
        ketentuanORDialog.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KetentuanORDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ketentuanORDialog.close();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        KetentuanORDialog ketentuanORDialog = this.b;
        if (ketentuanORDialog != null) {
            this.b = null;
            ketentuanORDialog.tvTitle = null;
            ketentuanORDialog.wvDesc = null;
            ketentuanORDialog.btnNo = null;
            ketentuanORDialog.btnYes = null;
            ketentuanORDialog.svContent = null;
            ketentuanORDialog.pb = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
