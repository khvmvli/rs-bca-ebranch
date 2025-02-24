package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HariDialog_ViewBinding.class */
public class HariDialog_ViewBinding implements Unbinder {
    private View a;
    private View d;
    private HariDialog e;

    public HariDialog_ViewBinding(final HariDialog hariDialog, View view) {
        this.e = hariDialog;
        hariDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        hariDialog.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131298952, "field 'tvError'", TextView.class);
        hariDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'onClickOk'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HariDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hariDialog.onClickOk(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296383, "method 'onClickCancel'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HariDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hariDialog.onClickCancel(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        hariDialog.data = resources.getStringArray(2130903059);
        hariDialog.title = resources.getString(2131822210);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        HariDialog hariDialog = this.e;
        if (hariDialog != null) {
            this.e = null;
            hariDialog.tvTitle = null;
            hariDialog.tvError = null;
            hariDialog.rvContent = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
