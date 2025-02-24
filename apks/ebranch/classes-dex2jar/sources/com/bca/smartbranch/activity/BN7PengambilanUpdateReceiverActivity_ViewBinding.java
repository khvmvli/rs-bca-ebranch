package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanUpdateReceiverActivity_ViewBinding.class */
public class BN7PengambilanUpdateReceiverActivity_ViewBinding implements Unbinder {
    private BN7PengambilanUpdateReceiverActivity a;
    private View b;
    private View c;
    private View d;
    private View e;

    public BN7PengambilanUpdateReceiverActivity_ViewBinding(final BN7PengambilanUpdateReceiverActivity bN7PengambilanUpdateReceiverActivity, View view) {
        this.a = bN7PengambilanUpdateReceiverActivity;
        bN7PengambilanUpdateReceiverActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'llMain'", LinearLayout.class);
        bN7PengambilanUpdateReceiverActivity.tvTitlePage = (TextView) Utils.findRequiredViewAsType(view, 2131299658, "field 'tvTitlePage'", TextView.class);
        bN7PengambilanUpdateReceiverActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        bN7PengambilanUpdateReceiverActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296993, "field 'etJenisID' and method 'onClickJenisId'");
        bN7PengambilanUpdateReceiverActivity.etJenisID = (EditText) Utils.castView(findRequiredView, 2131296993, "field 'etJenisID'", EditText.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanUpdateReceiverActivity.onClickJenisId(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297127, "field 'etNomorIDPengambil' and method 'inputChange'");
        bN7PengambilanUpdateReceiverActivity.etNomorIDPengambil = (EditText) Utils.castView(findRequiredView2, 2131297127, "field 'etNomorIDPengambil'", EditText.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                bN7PengambilanUpdateReceiverActivity.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297072, "field 'etNamaPengambil' and method 'inputChange'");
        bN7PengambilanUpdateReceiverActivity.etNamaPengambil = (EditText) Utils.castView(findRequiredView3, 2131297072, "field 'etNamaPengambil'", EditText.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                bN7PengambilanUpdateReceiverActivity.inputChange(view2, z);
            }
        });
        bN7PengambilanUpdateReceiverActivity.tilJenisID = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisID'", LogoutDialog_ViewBinding.class);
        bN7PengambilanUpdateReceiverActivity.tilNomorID = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilNomorID'", LogoutDialog_ViewBinding.class);
        bN7PengambilanUpdateReceiverActivity.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296450, "method 'simpan'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanUpdateReceiverActivity.simpan();
            }
        });
        bN7PengambilanUpdateReceiverActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296993, "field 'etFields'"), Utils.findRequiredView(view, 2131297127, "field 'etFields'"), Utils.findRequiredView(view, 2131297072, "field 'etFields'"));
        bN7PengambilanUpdateReceiverActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299017, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299121, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrors'", TextView.class));
        bN7PengambilanUpdateReceiverActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        bN7PengambilanUpdateReceiverActivity.toolbarTitle = resources.getString(2131822324);
        bN7PengambilanUpdateReceiverActivity.retry = resources.getString(2131822092);
        bN7PengambilanUpdateReceiverActivity.title = resources.getString(2131822191);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN7PengambilanUpdateReceiverActivity bN7PengambilanUpdateReceiverActivity = this.a;
        if (bN7PengambilanUpdateReceiverActivity != null) {
            this.a = null;
            bN7PengambilanUpdateReceiverActivity.llMain = null;
            bN7PengambilanUpdateReceiverActivity.tvTitlePage = null;
            bN7PengambilanUpdateReceiverActivity.toolbar = null;
            bN7PengambilanUpdateReceiverActivity.txtToolbarTitle = null;
            bN7PengambilanUpdateReceiverActivity.etJenisID = null;
            bN7PengambilanUpdateReceiverActivity.etNomorIDPengambil = null;
            bN7PengambilanUpdateReceiverActivity.etNamaPengambil = null;
            bN7PengambilanUpdateReceiverActivity.tilJenisID = null;
            bN7PengambilanUpdateReceiverActivity.tilNomorID = null;
            bN7PengambilanUpdateReceiverActivity.tilNama = null;
            bN7PengambilanUpdateReceiverActivity.etFields = null;
            bN7PengambilanUpdateReceiverActivity.tvErrors = null;
            bN7PengambilanUpdateReceiverActivity.tilForms = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
