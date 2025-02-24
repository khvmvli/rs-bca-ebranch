package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TransactionCSActivity_ViewBinding.class */
public class TransactionCSActivity_ViewBinding implements Unbinder {
    private TransactionCSActivity c;
    private View e;

    public TransactionCSActivity_ViewBinding(final TransactionCSActivity transactionCSActivity, View view) {
        this.c = transactionCSActivity;
        transactionCSActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        transactionCSActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        transactionCSActivity.rvMenu = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298331, "field 'rvMenu'", setOnStartEnterTransitionListener.class);
        transactionCSActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296397, "field 'btnLewati' and method 'onClickLanjut'");
        transactionCSActivity.btnLewati = (Button) Utils.castView(findRequiredView, 2131296397, "field 'btnLewati'", Button.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionCSActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionCSActivity.onClickLanjut(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        transactionCSActivity.toolbarTitle = resources.getString(2131822226);
        transactionCSActivity.mustMember = resources.getString(2131821918);
        transactionCSActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TransactionCSActivity transactionCSActivity = this.c;
        if (transactionCSActivity != null) {
            this.c = null;
            transactionCSActivity.toolbar = null;
            transactionCSActivity.txtToolbarTitle = null;
            transactionCSActivity.rvMenu = null;
            transactionCSActivity.llMain = null;
            transactionCSActivity.btnLewati = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
