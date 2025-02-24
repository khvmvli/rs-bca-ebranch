package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/JenisKartuDialog_ViewBinding.class */
public class JenisKartuDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private JenisKartuDialog e;

    public JenisKartuDialog_ViewBinding(final JenisKartuDialog jenisKartuDialog, View view) {
        this.e = jenisKartuDialog;
        jenisKartuDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        jenisKartuDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisKartuDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisKartuDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.JenisKartuDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                jenisKartuDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        jenisKartuDialog.jenisKartus = resources.getStringArray(2130903068);
        jenisKartuDialog.title = resources.getString(2131822229);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        JenisKartuDialog jenisKartuDialog = this.e;
        if (jenisKartuDialog != null) {
            this.e = null;
            jenisKartuDialog.tvTitle = null;
            jenisKartuDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
