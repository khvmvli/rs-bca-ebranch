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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/KetentuanBankTransferDialog_ViewBinding.class */
public class KetentuanBankTransferDialog_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private View d;
    private KetentuanBankTransferDialog e;

    public KetentuanBankTransferDialog_ViewBinding(final KetentuanBankTransferDialog ketentuanBankTransferDialog, View view) {
        this.e = ketentuanBankTransferDialog;
        ketentuanBankTransferDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296416, "field 'btnNo' and method 'clickedNo'");
        ketentuanBankTransferDialog.btnNo = (Button) Utils.castView(findRequiredView, 2131296416, "field 'btnNo'", Button.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KetentuanBankTransferDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ketentuanBankTransferDialog.clickedNo();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "field 'btnYes' and method 'onClickYes'");
        ketentuanBankTransferDialog.btnYes = (Button) Utils.castView(findRequiredView2, 2131296462, "field 'btnYes'", Button.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KetentuanBankTransferDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ketentuanBankTransferDialog.onClickYes(view2);
            }
        });
        ketentuanBankTransferDialog.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        ketentuanBankTransferDialog.svContent = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298419, "field 'svContent'", getLifecycle.class);
        ketentuanBankTransferDialog.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KetentuanBankTransferDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ketentuanBankTransferDialog.close();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        KetentuanBankTransferDialog ketentuanBankTransferDialog = this.e;
        if (ketentuanBankTransferDialog != null) {
            this.e = null;
            ketentuanBankTransferDialog.tvTitle = null;
            ketentuanBankTransferDialog.btnNo = null;
            ketentuanBankTransferDialog.btnYes = null;
            ketentuanBankTransferDialog.wvContent = null;
            ketentuanBankTransferDialog.svContent = null;
            ketentuanBankTransferDialog.pb = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
