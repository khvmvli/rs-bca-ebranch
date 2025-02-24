package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TahapanBerjangkaDialog_ViewBinding.class */
public class TahapanBerjangkaDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private TahapanBerjangkaDialog c;
    private View e;

    public TahapanBerjangkaDialog_ViewBinding(final TahapanBerjangkaDialog tahapanBerjangkaDialog, View view) {
        this.c = tahapanBerjangkaDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanBerjangkaDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanBerjangkaDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296392, "method 'infoProduct'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanBerjangkaDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanBerjangkaDialog.infoProduct(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296386, "method 'fillForm'");
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanBerjangkaDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanBerjangkaDialog.fillForm(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.c != null) {
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
