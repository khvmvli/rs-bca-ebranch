package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/KonfirmasiCallCabangDialog_ViewBinding.class */
public class KonfirmasiCallCabangDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private View d;
    private KonfirmasiCallCabangDialog e;

    public KonfirmasiCallCabangDialog_ViewBinding(final KonfirmasiCallCabangDialog konfirmasiCallCabangDialog, View view) {
        super(konfirmasiCallCabangDialog, view);
        this.e = konfirmasiCallCabangDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedLanjut'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KonfirmasiCallCabangDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                konfirmasiCallCabangDialog.clickedLanjut(view2);
            }
        });
        konfirmasiCallCabangDialog.txtContent = view.getContext().getResources().getString(2131821813);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.e != null) {
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
