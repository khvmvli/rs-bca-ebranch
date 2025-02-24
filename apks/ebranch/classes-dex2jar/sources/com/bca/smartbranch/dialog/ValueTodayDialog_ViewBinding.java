package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ValueTodayDialog_ViewBinding.class */
public class ValueTodayDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private ValueTodayDialog e;

    public ValueTodayDialog_ViewBinding(final ValueTodayDialog valueTodayDialog, View view) {
        this.e = valueTodayDialog;
        valueTodayDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        valueTodayDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ValueTodayDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                valueTodayDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ValueTodayDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                valueTodayDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        valueTodayDialog.data = resources.getStringArray(2130903110);
        valueTodayDialog.title = resources.getString(2131822289);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ValueTodayDialog valueTodayDialog = this.e;
        if (valueTodayDialog != null) {
            this.e = null;
            valueTodayDialog.tvTitle = null;
            valueTodayDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
