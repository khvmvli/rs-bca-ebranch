package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TujuanPembelianBNDialog_ViewBinding.class */
public class TujuanPembelianBNDialog_ViewBinding implements Unbinder {
    private TujuanPembelianBNDialog a;
    private View c;
    private View d;

    public TujuanPembelianBNDialog_ViewBinding(final TujuanPembelianBNDialog tujuanPembelianBNDialog, View view) {
        this.a = tujuanPembelianBNDialog;
        tujuanPembelianBNDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tujuanPembelianBNDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanPembelianBNDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanPembelianBNDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TujuanPembelianBNDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tujuanPembelianBNDialog.close();
            }
        });
        tujuanPembelianBNDialog.title = view.getContext().getResources().getString(2131822188);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TujuanPembelianBNDialog tujuanPembelianBNDialog = this.a;
        if (tujuanPembelianBNDialog != null) {
            this.a = null;
            tujuanPembelianBNDialog.tvTitle = null;
            tujuanPembelianBNDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
