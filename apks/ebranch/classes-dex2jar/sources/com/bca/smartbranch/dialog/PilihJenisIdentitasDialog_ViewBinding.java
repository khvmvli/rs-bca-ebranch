package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihJenisIdentitasDialog_ViewBinding.class */
public class PilihJenisIdentitasDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private PilihJenisIdentitasDialog e;

    public PilihJenisIdentitasDialog_ViewBinding(final PilihJenisIdentitasDialog pilihJenisIdentitasDialog, View view) {
        this.e = pilihJenisIdentitasDialog;
        pilihJenisIdentitasDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        pilihJenisIdentitasDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihJenisIdentitasDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihJenisIdentitasDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihJenisIdentitasDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihJenisIdentitasDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        pilihJenisIdentitasDialog.data = resources.getStringArray(2130903067);
        pilihJenisIdentitasDialog.title = resources.getString(2131822050);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihJenisIdentitasDialog pilihJenisIdentitasDialog = this.e;
        if (pilihJenisIdentitasDialog != null) {
            this.e = null;
            pilihJenisIdentitasDialog.tvTitle = null;
            pilihJenisIdentitasDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
