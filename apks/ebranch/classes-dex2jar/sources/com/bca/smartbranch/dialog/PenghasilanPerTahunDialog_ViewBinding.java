package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PenghasilanPerTahunDialog_ViewBinding.class */
public class PenghasilanPerTahunDialog_ViewBinding implements Unbinder {
    private PenghasilanPerTahunDialog b;
    private View c;
    private View e;

    public PenghasilanPerTahunDialog_ViewBinding(final PenghasilanPerTahunDialog penghasilanPerTahunDialog, View view) {
        this.b = penghasilanPerTahunDialog;
        penghasilanPerTahunDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        penghasilanPerTahunDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PenghasilanPerTahunDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penghasilanPerTahunDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PenghasilanPerTahunDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penghasilanPerTahunDialog.close();
            }
        });
        penghasilanPerTahunDialog.titleRes = view.getContext().getResources().getString(2131822252);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PenghasilanPerTahunDialog penghasilanPerTahunDialog = this.b;
        if (penghasilanPerTahunDialog != null) {
            this.b = null;
            penghasilanPerTahunDialog.tvTitle = null;
            penghasilanPerTahunDialog.rvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
