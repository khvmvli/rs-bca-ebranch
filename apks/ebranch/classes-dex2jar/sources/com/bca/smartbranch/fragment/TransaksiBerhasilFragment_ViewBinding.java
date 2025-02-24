package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.getIncomeDisplayAmount;
import o.getLifecycle;
import o.setBackgroundColorRes;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiBerhasilFragment_ViewBinding.class */
public class TransaksiBerhasilFragment_ViewBinding implements Unbinder {
    private View c;
    private TransaksiBerhasilFragment d;

    public TransaksiBerhasilFragment_ViewBinding(final TransaksiBerhasilFragment transaksiBerhasilFragment, View view) {
        this.d = transaksiBerhasilFragment;
        transaksiBerhasilFragment.rvTransaksiBerhasil = (getIncomeDisplayAmount) Utils.findRequiredViewAsType(view, 2131298337, "field 'rvTransaksiBerhasil'", getIncomeDisplayAmount.class);
        transaksiBerhasilFragment.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        transaksiBerhasilFragment.tvTransaksiEmpty = (TextView) Utils.findRequiredViewAsType(view, 2131299690, "field 'tvTransaksiEmpty'", TextView.class);
        transaksiBerhasilFragment.llEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297634, "field 'llEmpty'", LinearLayout.class);
        transaksiBerhasilFragment.swipeRefreshLayout = (setBackgroundColorRes) Utils.findRequiredViewAsType(view, 2131298422, "field 'swipeRefreshLayout'", setBackgroundColorRes.class);
        transaksiBerhasilFragment.nsvMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298093, "field 'nsvMain'", getLifecycle.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TransaksiBerhasilFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transaksiBerhasilFragment.retry(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TransaksiBerhasilFragment transaksiBerhasilFragment = this.d;
        if (transaksiBerhasilFragment != null) {
            this.d = null;
            transaksiBerhasilFragment.rvTransaksiBerhasil = null;
            transaksiBerhasilFragment.tvErrorMessage = null;
            transaksiBerhasilFragment.tvTransaksiEmpty = null;
            transaksiBerhasilFragment.llEmpty = null;
            transaksiBerhasilFragment.swipeRefreshLayout = null;
            transaksiBerhasilFragment.nsvMain = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
