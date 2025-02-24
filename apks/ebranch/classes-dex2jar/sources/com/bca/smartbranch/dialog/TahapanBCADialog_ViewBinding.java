package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TahapanBCADialog_ViewBinding.class */
public class TahapanBCADialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private TahapanBCADialog d;

    public TahapanBCADialog_ViewBinding(final TahapanBCADialog tahapanBCADialog, View view) {
        this.d = tahapanBCADialog;
        tahapanBCADialog.tvInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299282, "field 'tvInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanBCADialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanBCADialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296392, "method 'infoProduct'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanBCADialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanBCADialog.infoProduct(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296386, "method 'fillForm'");
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TahapanBCADialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tahapanBCADialog.fillForm(view2);
            }
        });
        tahapanBCADialog.txtInfo = view.getContext().getResources().getString(2131822144);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TahapanBCADialog tahapanBCADialog = this.d;
        if (tahapanBCADialog != null) {
            this.d = null;
            tahapanBCADialog.tvInfo = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
