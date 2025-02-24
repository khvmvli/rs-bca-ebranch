package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/JenisIdDialog_ViewBinding.class */
public class JenisIdDialog_ViewBinding implements Unbinder {
    private View b;
    private JenisIdDialog d;
    private View e;

    public JenisIdDialog_ViewBinding(final JenisIdDialog jenisIdDialog, View view) {
        this.d = jenisIdDialog;
        jenisIdDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "field 'btnSelanjutnya' and method 'clickPilih'");
        jenisIdDialog.btnSelanjutnya = (Button) Utils.castView(findRequiredView, 2131296419, "field 'btnSelanjutnya'", Button.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisIdDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisIdDialog.clickPilih(view2);
            }
        });
        jenisIdDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisIdDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisIdDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        jenisIdDialog.jenisId = resources.getStringArray(2130903063);
        jenisIdDialog.title = resources.getString(2131822227);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        JenisIdDialog jenisIdDialog = this.d;
        if (jenisIdDialog != null) {
            this.d = null;
            jenisIdDialog.tvTitle = null;
            jenisIdDialog.btnSelanjutnya = null;
            jenisIdDialog.rvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
