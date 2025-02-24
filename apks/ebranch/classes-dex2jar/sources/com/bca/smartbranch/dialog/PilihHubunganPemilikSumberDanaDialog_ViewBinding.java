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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihHubunganPemilikSumberDanaDialog_ViewBinding.class */
public class PilihHubunganPemilikSumberDanaDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private PilihHubunganPemilikSumberDanaDialog d;
    private View e;

    public PilihHubunganPemilikSumberDanaDialog_ViewBinding(final PilihHubunganPemilikSumberDanaDialog pilihHubunganPemilikSumberDanaDialog, View view) {
        this.d = pilihHubunganPemilikSumberDanaDialog;
        pilihHubunganPemilikSumberDanaDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        pilihHubunganPemilikSumberDanaDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        pilihHubunganPemilikSumberDanaDialog.tilKeterangan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298563, "field 'tilKeterangan'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297017, "field 'etKeterangan' and method 'inputChange'");
        pilihHubunganPemilikSumberDanaDialog.etKeterangan = (EditText) Utils.castView(findRequiredView, 2131297017, "field 'etKeterangan'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.dialog.PilihHubunganPemilikSumberDanaDialog_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                pilihHubunganPemilikSumberDanaDialog.inputChange(view2, z);
            }
        });
        pilihHubunganPemilikSumberDanaDialog.tvErrorKeterangan = (TextView) Utils.findRequiredViewAsType(view, 2131299040, "field 'tvErrorKeterangan'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihHubunganPemilikSumberDanaDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihHubunganPemilikSumberDanaDialog.clickPilih(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihHubunganPemilikSumberDanaDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihHubunganPemilikSumberDanaDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        pilihHubunganPemilikSumberDanaDialog.data = resources.getStringArray(2130903061);
        pilihHubunganPemilikSumberDanaDialog.title = resources.getString(2131822049);
        pilihHubunganPemilikSumberDanaDialog.labelLainnya = resources.getString(2131821822);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihHubunganPemilikSumberDanaDialog pilihHubunganPemilikSumberDanaDialog = this.d;
        if (pilihHubunganPemilikSumberDanaDialog != null) {
            this.d = null;
            pilihHubunganPemilikSumberDanaDialog.tvTitle = null;
            pilihHubunganPemilikSumberDanaDialog.rvContent = null;
            pilihHubunganPemilikSumberDanaDialog.tilKeterangan = null;
            pilihHubunganPemilikSumberDanaDialog.etKeterangan = null;
            pilihHubunganPemilikSumberDanaDialog.tvErrorKeterangan = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
