package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding.class */
public class PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding implements Unbinder {
    private View a;
    private PilihJenisIdentitasPemilikSumberDanaDialog b;
    private View c;

    public PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding(final PilihJenisIdentitasPemilikSumberDanaDialog pilihJenisIdentitasPemilikSumberDanaDialog, View view) {
        this.b = pilihJenisIdentitasPemilikSumberDanaDialog;
        pilihJenisIdentitasPemilikSumberDanaDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        pilihJenisIdentitasPemilikSumberDanaDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihJenisIdentitasPemilikSumberDanaDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihJenisIdentitasPemilikSumberDanaDialog.close();
            }
        });
        pilihJenisIdentitasPemilikSumberDanaDialog.title = view.getContext().getResources().getString(2131822050);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihJenisIdentitasPemilikSumberDanaDialog pilihJenisIdentitasPemilikSumberDanaDialog = this.b;
        if (pilihJenisIdentitasPemilikSumberDanaDialog != null) {
            this.b = null;
            pilihJenisIdentitasPemilikSumberDanaDialog.tvTitle = null;
            pilihJenisIdentitasPemilikSumberDanaDialog.rvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
