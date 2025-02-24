package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TipeNasabahDialog_ViewBinding.class */
public class TipeNasabahDialog_ViewBinding implements Unbinder {
    private View a;
    private TipeNasabahDialog b;
    private View c;

    public TipeNasabahDialog_ViewBinding(final TipeNasabahDialog tipeNasabahDialog, View view) {
        this.b = tipeNasabahDialog;
        tipeNasabahDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tipeNasabahDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TipeNasabahDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tipeNasabahDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TipeNasabahDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tipeNasabahDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        tipeNasabahDialog.data = resources.getStringArray(2130903098);
        tipeNasabahDialog.title = resources.getString(2131822277);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TipeNasabahDialog tipeNasabahDialog = this.b;
        if (tipeNasabahDialog != null) {
            this.b = null;
            tipeNasabahDialog.tvTitle = null;
            tipeNasabahDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
