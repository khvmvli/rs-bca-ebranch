package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormSuccessActivity_ViewBinding.class */
public class FormSuccessActivity_ViewBinding implements Unbinder {
    private FormSuccessActivity b;
    private View c;

    public FormSuccessActivity_ViewBinding(final FormSuccessActivity formSuccessActivity, View view) {
        this.b = formSuccessActivity;
        formSuccessActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        formSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onClickLanjut'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FormSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                formSuccessActivity.onClickLanjut(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FormSuccessActivity formSuccessActivity = this.b;
        if (formSuccessActivity != null) {
            this.b = null;
            formSuccessActivity.tvTransaksi = null;
            formSuccessActivity.llMain = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
