package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/KategoriTujuanTransaksiORDialog_ViewBinding.class */
public class KategoriTujuanTransaksiORDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private KategoriTujuanTransaksiORDialog e;

    public KategoriTujuanTransaksiORDialog_ViewBinding(final KategoriTujuanTransaksiORDialog kategoriTujuanTransaksiORDialog, View view) {
        this.e = kategoriTujuanTransaksiORDialog;
        kategoriTujuanTransaksiORDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        kategoriTujuanTransaksiORDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KategoriTujuanTransaksiORDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                kategoriTujuanTransaksiORDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.KategoriTujuanTransaksiORDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                kategoriTujuanTransaksiORDialog.close();
            }
        });
        kategoriTujuanTransaksiORDialog.title = view.getContext().getResources().getString(2131822233);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        KategoriTujuanTransaksiORDialog kategoriTujuanTransaksiORDialog = this.e;
        if (kategoriTujuanTransaksiORDialog != null) {
            this.e = null;
            kategoriTujuanTransaksiORDialog.tvTitle = null;
            kategoriTujuanTransaksiORDialog.rvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
