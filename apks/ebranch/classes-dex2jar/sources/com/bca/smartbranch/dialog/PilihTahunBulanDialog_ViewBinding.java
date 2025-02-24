package com.bca.smartbranch.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.copyWindowDataInto;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihTahunBulanDialog_ViewBinding.class */
public class PilihTahunBulanDialog_ViewBinding implements Unbinder {
    private View b;
    private PilihTahunBulanDialog c;
    private View e;

    public PilihTahunBulanDialog_ViewBinding(final PilihTahunBulanDialog pilihTahunBulanDialog, View view) {
        this.c = pilihTahunBulanDialog;
        pilihTahunBulanDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        pilihTahunBulanDialog.rvTahun = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298335, "field 'rvTahun'", setOnStartEnterTransitionListener.class);
        pilihTahunBulanDialog.rvBulan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298319, "field 'rvBulan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299503, "method 'onClickBtnOk'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihTahunBulanDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihTahunBulanDialog.onClickBtnOk();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131298874, "method 'onClickBtnCancel'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihTahunBulanDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihTahunBulanDialog.onClickBtnCancel();
            }
        });
        Context context = view.getContext();
        pilihTahunBulanDialog.textColor = copyWindowDataInto.a(context, 2131099803);
        pilihTahunBulanDialog.textSelectedColor = copyWindowDataInto.a(context, 2131099804);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihTahunBulanDialog pilihTahunBulanDialog = this.c;
        if (pilihTahunBulanDialog != null) {
            this.c = null;
            pilihTahunBulanDialog.tvTitle = null;
            pilihTahunBulanDialog.rvTahun = null;
            pilihTahunBulanDialog.rvBulan = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
