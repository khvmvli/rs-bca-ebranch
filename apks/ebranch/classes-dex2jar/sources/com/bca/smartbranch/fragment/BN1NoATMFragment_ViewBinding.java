package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrentItem;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN1NoATMFragment_ViewBinding.class */
public class BN1NoATMFragment_ViewBinding implements Unbinder {
    private BN1NoATMFragment a;
    private View d;
    private View e;

    public BN1NoATMFragment_ViewBinding(final BN1NoATMFragment bN1NoATMFragment, View view) {
        this.a = bN1NoATMFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297092, "field 'etNoATM' and method 'inputChange'");
        bN1NoATMFragment.etNoATM = (setCurrentItem) Utils.castView(findRequiredView, 2131297092, "field 'etNoATM'", setCurrentItem.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.BN1NoATMFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                bN1NoATMFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'lanjut'");
        bN1NoATMFragment.btnLanjut = (Button) Utils.castView(findRequiredView2, 2131296396, "field 'btnLanjut'", Button.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN1NoATMFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN1NoATMFragment.lanjut();
            }
        });
        bN1NoATMFragment.svMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'svMain'", LinearLayout.class);
        bN1NoATMFragment.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvNama'", TextView.class);
        bN1NoATMFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297092, "field 'etFields'"));
        bN1NoATMFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299114, "field 'tvErrors'", TextView.class));
        bN1NoATMFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298638, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        bN1NoATMFragment.hintAtm = view.getContext().getResources().getString(2131821161);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN1NoATMFragment bN1NoATMFragment = this.a;
        if (bN1NoATMFragment != null) {
            this.a = null;
            bN1NoATMFragment.etNoATM = null;
            bN1NoATMFragment.btnLanjut = null;
            bN1NoATMFragment.svMain = null;
            bN1NoATMFragment.tvNama = null;
            bN1NoATMFragment.etFields = null;
            bN1NoATMFragment.tvErrors = null;
            bN1NoATMFragment.tilForms = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
