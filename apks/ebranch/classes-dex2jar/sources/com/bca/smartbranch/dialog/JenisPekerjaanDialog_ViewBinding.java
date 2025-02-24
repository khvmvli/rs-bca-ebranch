package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/JenisPekerjaanDialog_ViewBinding.class */
public class JenisPekerjaanDialog_ViewBinding implements Unbinder {
    private JenisPekerjaanDialog b;
    private View c;
    private View d;

    public JenisPekerjaanDialog_ViewBinding(final JenisPekerjaanDialog jenisPekerjaanDialog, View view) {
        this.b = jenisPekerjaanDialog;
        jenisPekerjaanDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        jenisPekerjaanDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisPekerjaanDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisPekerjaanDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisPekerjaanDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisPekerjaanDialog.close();
            }
        });
        jenisPekerjaanDialog.title = view.getContext().getResources().getString(2131822231);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        JenisPekerjaanDialog jenisPekerjaanDialog = this.b;
        if (jenisPekerjaanDialog != null) {
            this.b = null;
            jenisPekerjaanDialog.tvTitle = null;
            jenisPekerjaanDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
