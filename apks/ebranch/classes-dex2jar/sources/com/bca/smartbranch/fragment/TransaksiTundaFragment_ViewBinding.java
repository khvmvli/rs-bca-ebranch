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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiTundaFragment_ViewBinding.class */
public class TransaksiTundaFragment_ViewBinding implements Unbinder {
    private TransaksiTundaFragment a;
    private View d;

    public TransaksiTundaFragment_ViewBinding(final TransaksiTundaFragment transaksiTundaFragment, View view) {
        this.a = transaksiTundaFragment;
        transaksiTundaFragment.rvTransaksiTertunda = (getIncomeDisplayAmount) Utils.findRequiredViewAsType(view, 2131298338, "field 'rvTransaksiTertunda'", getIncomeDisplayAmount.class);
        transaksiTundaFragment.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        transaksiTundaFragment.tvTransaksiEmpty = (TextView) Utils.findRequiredViewAsType(view, 2131299690, "field 'tvTransaksiEmpty'", TextView.class);
        transaksiTundaFragment.llEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297634, "field 'llEmpty'", LinearLayout.class);
        transaksiTundaFragment.swipeRefreshLayout = (setBackgroundColorRes) Utils.findRequiredViewAsType(view, 2131298422, "field 'swipeRefreshLayout'", setBackgroundColorRes.class);
        transaksiTundaFragment.svMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", getLifecycle.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TransaksiTundaFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transaksiTundaFragment.retry(view2);
            }
        });
        transaksiTundaFragment.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TransaksiTundaFragment transaksiTundaFragment = this.a;
        if (transaksiTundaFragment != null) {
            this.a = null;
            transaksiTundaFragment.rvTransaksiTertunda = null;
            transaksiTundaFragment.tvErrorMessage = null;
            transaksiTundaFragment.tvTransaksiEmpty = null;
            transaksiTundaFragment.llEmpty = null;
            transaksiTundaFragment.swipeRefreshLayout = null;
            transaksiTundaFragment.svMain = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
