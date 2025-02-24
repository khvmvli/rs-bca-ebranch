package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HubunganKeuanganDialog_ViewBinding.class */
public class HubunganKeuanganDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private HubunganKeuanganDialog d;

    public HubunganKeuanganDialog_ViewBinding(final HubunganKeuanganDialog hubunganKeuanganDialog, View view) {
        this.d = hubunganKeuanganDialog;
        hubunganKeuanganDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        hubunganKeuanganDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HubunganKeuanganDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hubunganKeuanganDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HubunganKeuanganDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hubunganKeuanganDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        hubunganKeuanganDialog.data = resources.getStringArray(2130903110);
        hubunganKeuanganDialog.title = resources.getString(2131822212);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        HubunganKeuanganDialog hubunganKeuanganDialog = this.d;
        if (hubunganKeuanganDialog != null) {
            this.d = null;
            hubunganKeuanganDialog.tvTitle = null;
            hubunganKeuanganDialog.rvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
