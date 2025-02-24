package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AskAccountActivity_ViewBinding.class */
public class AskAccountActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private AskAccountActivity e;

    public AskAccountActivity_ViewBinding(final AskAccountActivity askAccountActivity, View view) {
        this.e = askAccountActivity;
        askAccountActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        askAccountActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        askAccountActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'yes'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AskAccountActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                askAccountActivity.yes(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296416, "method 'no'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AskAccountActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                askAccountActivity.no(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        askAccountActivity.toolbarTitleTahapanBCA = resources.getString(2131822244);
        askAccountActivity.toolbarTitleTahapanXpresi = resources.getString(2131822245);
        askAccountActivity.toolbarTitleTapres = resources.getString(2131822246);
        askAccountActivity.toolbarTitleBCADollar = resources.getString(2131822243);
        askAccountActivity.toolbarTitleSetoran = resources.getString(2131822281);
        askAccountActivity.toolbarTitleTahapanBerjangka = resources.getString(2131822275);
        askAccountActivity.toolbarTitleDeposito = resources.getString(2131822203);
        askAccountActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AskAccountActivity askAccountActivity = this.e;
        if (askAccountActivity != null) {
            this.e = null;
            askAccountActivity.toolbar = null;
            askAccountActivity.txtToolbarTitle = null;
            askAccountActivity.llMain = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
