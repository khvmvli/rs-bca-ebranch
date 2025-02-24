package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/Tarikan100JutaGuestDialog_ViewBinding.class */
public class Tarikan100JutaGuestDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private Tarikan100JutaGuestDialog d;
    private View e;

    public Tarikan100JutaGuestDialog_ViewBinding(final Tarikan100JutaGuestDialog tarikan100JutaGuestDialog, View view) {
        super(tarikan100JutaGuestDialog, view);
        this.d = tarikan100JutaGuestDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedLogin'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.Tarikan100JutaGuestDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tarikan100JutaGuestDialog.clickedLogin(view2);
            }
        });
        tarikan100JutaGuestDialog.txtContent = view.getContext().getResources().getString(2131822163);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.d != null) {
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
