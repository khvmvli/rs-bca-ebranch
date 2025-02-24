package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/UbahPINActivity_ViewBinding.class */
public class UbahPINActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private UbahPINActivity c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;

    public UbahPINActivity_ViewBinding(final UbahPINActivity ubahPINActivity, View view) {
        this.c = ubahPINActivity;
        View findRequiredView = Utils.findRequiredView(view, 2131297160, "field 'etPINLama' and method 'inputChange'");
        ubahPINActivity.etPINLama = (EditText) Utils.castView(findRequiredView, 2131297160, "field 'etPINLama'", EditText.class);
        this.b = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahPINActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297157, "field 'etPINBaru' and method 'inputChange'");
        ubahPINActivity.etPINBaru = (EditText) Utils.castView(findRequiredView2, 2131297157, "field 'etPINBaru'", EditText.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahPINActivity.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297158, "field 'etPINBaruConfirm' and method 'inputChange'");
        ubahPINActivity.etPINBaruConfirm = (EditText) Utils.castView(findRequiredView3, 2131297158, "field 'etPINBaruConfirm'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahPINActivity.inputChange(view2, z);
            }
        });
        ubahPINActivity.tilPinLama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298696, "field 'tilPinLama'", LogoutDialog_ViewBinding.class);
        ubahPINActivity.tilPinBaru = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298693, "field 'tilPinBaru'", LogoutDialog_ViewBinding.class);
        ubahPINActivity.tilPinBaruConfirm = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298694, "field 'tilPinBaruConfirm'", LogoutDialog_ViewBinding.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131298785, "field 'ivTogglePinLama' and method 'togglePINLama'");
        ubahPINActivity.ivTogglePinLama = (ImageView) Utils.castView(findRequiredView4, 2131298785, "field 'ivTogglePinLama'", ImageView.class);
        this.g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ubahPINActivity.togglePINLama();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131298782, "field 'ivTogglePinBaru' and method 'togglePINBaru'");
        ubahPINActivity.ivTogglePinBaru = (ImageView) Utils.castView(findRequiredView5, 2131298782, "field 'ivTogglePinBaru'", ImageView.class);
        this.f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ubahPINActivity.togglePINBaru();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131298783, "field 'ivToggleConfirmPinBaru' and method 'togglePINBaruConfirm'");
        ubahPINActivity.ivToggleConfirmPinBaru = (ImageView) Utils.castView(findRequiredView6, 2131298783, "field 'ivToggleConfirmPinBaru'", ImageView.class);
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ubahPINActivity.togglePINBaruConfirm();
            }
        });
        ubahPINActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131296457, "method 'update'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ubahPINActivity.update(view2);
            }
        });
        ubahPINActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297160, "field 'etFields'"), Utils.findRequiredView(view, 2131297157, "field 'etFields'"), Utils.findRequiredView(view, 2131297158, "field 'etFields'"));
        ubahPINActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299163, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299160, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299161, "field 'tvErrors'", TextView.class));
        ubahPINActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298696, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298693, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298694, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        ubahPINActivity.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UbahPINActivity ubahPINActivity = this.c;
        if (ubahPINActivity != null) {
            this.c = null;
            ubahPINActivity.etPINLama = null;
            ubahPINActivity.etPINBaru = null;
            ubahPINActivity.etPINBaruConfirm = null;
            ubahPINActivity.tilPinLama = null;
            ubahPINActivity.tilPinBaru = null;
            ubahPINActivity.tilPinBaruConfirm = null;
            ubahPINActivity.ivTogglePinLama = null;
            ubahPINActivity.ivTogglePinBaru = null;
            ubahPINActivity.ivToggleConfirmPinBaru = null;
            ubahPINActivity.svMain = null;
            ubahPINActivity.etFields = null;
            ubahPINActivity.tvErrors = null;
            ubahPINActivity.tilForms = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
