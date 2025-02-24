package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihRekeningDialog_ViewBinding.class */
public class PilihRekeningDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private PilihRekeningDialog d;
    private View e;

    public PilihRekeningDialog_ViewBinding(final PilihRekeningDialog pilihRekeningDialog, View view) {
        this.d = pilihRekeningDialog;
        pilihRekeningDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        pilihRekeningDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        pilihRekeningDialog.etSearch = (EditText) Utils.findRequiredViewAsType(view, 2131297176, "field 'etSearch'", EditText.class);
        pilihRekeningDialog.tilRekeningLain = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298702, "field 'tilRekeningLain'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297166, "field 'etRekeningLain' and method 'inputChange'");
        pilihRekeningDialog.etRekeningLain = (EditText) Utils.castView(findRequiredView, 2131297166, "field 'etRekeningLain'", EditText.class);
        this.b = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.dialog.PilihRekeningDialog_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                pilihRekeningDialog.inputChange(view2, z);
            }
        });
        pilihRekeningDialog.tvErrorRekeningLain = (TextView) Utils.findRequiredViewAsType(view, 2131299170, "field 'tvErrorRekeningLain'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296852, "method 'search'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihRekeningDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihRekeningDialog.search();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296419, "method 'onClickPilih'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihRekeningDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihRekeningDialog.onClickPilih(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296385, "method 'onClickClose'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihRekeningDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihRekeningDialog.onClickClose(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        pilihRekeningDialog.title = resources.getString(2131822257);
        pilihRekeningDialog.nomorRekeningTidakAda = resources.getString(2131821966);
        pilihRekeningDialog.errorNomorRekeningBaruEmpty = resources.getString(2131820918);
        pilihRekeningDialog.errorNomorRekeningBaruNotValid = resources.getString(2131820919);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihRekeningDialog pilihRekeningDialog = this.d;
        if (pilihRekeningDialog != null) {
            this.d = null;
            pilihRekeningDialog.tvTitle = null;
            pilihRekeningDialog.rvContent = null;
            pilihRekeningDialog.etSearch = null;
            pilihRekeningDialog.tilRekeningLain = null;
            pilihRekeningDialog.etRekeningLain = null;
            pilihRekeningDialog.tvErrorRekeningLain = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
