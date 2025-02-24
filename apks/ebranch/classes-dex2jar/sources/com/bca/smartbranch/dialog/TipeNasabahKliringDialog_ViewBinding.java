package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TipeNasabahKliringDialog_ViewBinding.class */
public class TipeNasabahKliringDialog_ViewBinding implements Unbinder {
    private TipeNasabahKliringDialog a;
    private View d;
    private View e;

    public TipeNasabahKliringDialog_ViewBinding(final TipeNasabahKliringDialog tipeNasabahKliringDialog, View view) {
        this.a = tipeNasabahKliringDialog;
        tipeNasabahKliringDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        tipeNasabahKliringDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TipeNasabahKliringDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tipeNasabahKliringDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TipeNasabahKliringDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tipeNasabahKliringDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        tipeNasabahKliringDialog.data = resources.getStringArray(2130903098);
        tipeNasabahKliringDialog.title = resources.getString(2131822278);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TipeNasabahKliringDialog tipeNasabahKliringDialog = this.a;
        if (tipeNasabahKliringDialog != null) {
            this.a = null;
            tipeNasabahKliringDialog.tvTitle = null;
            tipeNasabahKliringDialog.rvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
