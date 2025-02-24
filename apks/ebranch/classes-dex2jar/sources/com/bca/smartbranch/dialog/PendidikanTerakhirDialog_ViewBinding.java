package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PendidikanTerakhirDialog_ViewBinding.class */
public class PendidikanTerakhirDialog_ViewBinding implements Unbinder {
    private PendidikanTerakhirDialog a;
    private View d;
    private View e;

    public PendidikanTerakhirDialog_ViewBinding(final PendidikanTerakhirDialog pendidikanTerakhirDialog, View view) {
        this.a = pendidikanTerakhirDialog;
        pendidikanTerakhirDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        pendidikanTerakhirDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PendidikanTerakhirDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pendidikanTerakhirDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PendidikanTerakhirDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pendidikanTerakhirDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        pendidikanTerakhirDialog.listPendidikanPelajar = resources.getStringArray(2130903083);
        pendidikanTerakhirDialog.listPendidikan = resources.getStringArray(2130903082);
        pendidikanTerakhirDialog.title = resources.getString(2131822247);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PendidikanTerakhirDialog pendidikanTerakhirDialog = this.a;
        if (pendidikanTerakhirDialog != null) {
            this.a = null;
            pendidikanTerakhirDialog.tvTitle = null;
            pendidikanTerakhirDialog.rvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
