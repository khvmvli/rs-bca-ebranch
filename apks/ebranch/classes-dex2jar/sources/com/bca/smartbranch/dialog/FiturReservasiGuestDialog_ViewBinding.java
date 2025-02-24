package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FiturReservasiGuestDialog_ViewBinding.class */
public class FiturReservasiGuestDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private View a;
    private FiturReservasiGuestDialog b;
    private View e;

    public FiturReservasiGuestDialog_ViewBinding(final FiturReservasiGuestDialog fiturReservasiGuestDialog, View view) {
        super(fiturReservasiGuestDialog, view);
        this.b = fiturReservasiGuestDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FiturReservasiGuestDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fiturReservasiGuestDialog.clickedYes();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296416, "method 'clickedNo'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FiturReservasiGuestDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fiturReservasiGuestDialog.clickedNo();
            }
        });
        Resources resources = view.getContext().getResources();
        fiturReservasiGuestDialog.title = resources.getString(2131821716);
        fiturReservasiGuestDialog.desc = resources.getString(2131822086);
        fiturReservasiGuestDialog.yes = resources.getString(2131821402);
        fiturReservasiGuestDialog.no = resources.getString(2131821388);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.b != null) {
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
