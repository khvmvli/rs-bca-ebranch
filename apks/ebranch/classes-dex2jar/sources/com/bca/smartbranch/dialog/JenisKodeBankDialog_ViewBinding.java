package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/JenisKodeBankDialog_ViewBinding.class */
public class JenisKodeBankDialog_ViewBinding implements Unbinder {
    private JenisKodeBankDialog b;
    private View c;
    private View e;

    public JenisKodeBankDialog_ViewBinding(final JenisKodeBankDialog jenisKodeBankDialog, View view) {
        this.b = jenisKodeBankDialog;
        jenisKodeBankDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        jenisKodeBankDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisKodeBankDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisKodeBankDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisKodeBankDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisKodeBankDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        jenisKodeBankDialog.jenisKartus = resources.getStringArray(2130903069);
        jenisKodeBankDialog.title = resources.getString(2131821629);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        JenisKodeBankDialog jenisKodeBankDialog = this.b;
        if (jenisKodeBankDialog != null) {
            this.b = null;
            jenisKodeBankDialog.tvTitle = null;
            jenisKodeBankDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
