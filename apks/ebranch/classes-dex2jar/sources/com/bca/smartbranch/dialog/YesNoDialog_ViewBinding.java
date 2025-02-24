package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/YesNoDialog_ViewBinding.class */
public class YesNoDialog_ViewBinding implements Unbinder {
    private View b;
    private YesNoDialog d;
    private View e;

    public YesNoDialog_ViewBinding(final YesNoDialog yesNoDialog, View view) {
        this.d = yesNoDialog;
        yesNoDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        yesNoDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.YesNoDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                yesNoDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.YesNoDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                yesNoDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        yesNoDialog.data = resources.getStringArray(2130903110);
        yesNoDialog.title = resources.getString(2131822292);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        YesNoDialog yesNoDialog = this.d;
        if (yesNoDialog != null) {
            this.d = null;
            yesNoDialog.tvTitle = null;
            yesNoDialog.rvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
