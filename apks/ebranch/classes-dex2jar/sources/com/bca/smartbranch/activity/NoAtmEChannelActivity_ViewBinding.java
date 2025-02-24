package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setCurrentItem;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/NoAtmEChannelActivity_ViewBinding.class */
public class NoAtmEChannelActivity_ViewBinding implements Unbinder {
    private View a;
    private NoAtmEChannelActivity b;
    private View c;
    private View e;

    public NoAtmEChannelActivity_ViewBinding(final NoAtmEChannelActivity noAtmEChannelActivity, View view) {
        this.b = noAtmEChannelActivity;
        noAtmEChannelActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        noAtmEChannelActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297092, "field 'etNoATM' and method 'inputChange'");
        noAtmEChannelActivity.etNoATM = (setCurrentItem) Utils.castView(findRequiredView, 2131297092, "field 'etNoATM'", setCurrentItem.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.NoAtmEChannelActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                noAtmEChannelActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'lanjut'");
        noAtmEChannelActivity.btnLanjut = (Button) Utils.castView(findRequiredView2, 2131296396, "field 'btnLanjut'", Button.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.NoAtmEChannelActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                noAtmEChannelActivity.lanjut();
            }
        });
        noAtmEChannelActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        noAtmEChannelActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvNama'", TextView.class);
        noAtmEChannelActivity.llEmail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297632, "field 'llEmail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        noAtmEChannelActivity.etEmail = (EditText) Utils.castView(findRequiredView3, 2131296976, "field 'etEmail'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.NoAtmEChannelActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                noAtmEChannelActivity.inputChange(view2, z);
            }
        });
        noAtmEChannelActivity.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        noAtmEChannelActivity.tilNoAtm = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298638, "field 'tilNoAtm'", LogoutDialog_ViewBinding.class);
        noAtmEChannelActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        noAtmEChannelActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297092, "field 'etFields'"), Utils.findRequiredView(view, 2131296976, "field 'etFields'"));
        noAtmEChannelActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299114, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class));
        noAtmEChannelActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298638, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        noAtmEChannelActivity.errorMessageEmptyATM = resources.getString(2131820933);
        noAtmEChannelActivity.masukanATMEChannel = resources.getString(2131821882);
        noAtmEChannelActivity.masukanATMEmailEChannel = resources.getString(2131821883);
        noAtmEChannelActivity.hintAtm = resources.getString(2131821161);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        NoAtmEChannelActivity noAtmEChannelActivity = this.b;
        if (noAtmEChannelActivity != null) {
            this.b = null;
            noAtmEChannelActivity.toolbar = null;
            noAtmEChannelActivity.tvToolbarTitle = null;
            noAtmEChannelActivity.etNoATM = null;
            noAtmEChannelActivity.btnLanjut = null;
            noAtmEChannelActivity.llMain = null;
            noAtmEChannelActivity.tvNama = null;
            noAtmEChannelActivity.llEmail = null;
            noAtmEChannelActivity.etEmail = null;
            noAtmEChannelActivity.tilEmail = null;
            noAtmEChannelActivity.tilNoAtm = null;
            noAtmEChannelActivity.tvTitle = null;
            noAtmEChannelActivity.etFields = null;
            noAtmEChannelActivity.tvErrors = null;
            noAtmEChannelActivity.tilForms = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
