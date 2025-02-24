package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SuratPernyataanBNDialog_ViewBinding.class */
public class SuratPernyataanBNDialog_ViewBinding implements Unbinder {
    private SuratPernyataanBNDialog a;
    private View b;
    private View c;
    private View e;

    public SuratPernyataanBNDialog_ViewBinding(final SuratPernyataanBNDialog suratPernyataanBNDialog, View view) {
        this.a = suratPernyataanBNDialog;
        suratPernyataanBNDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        suratPernyataanBNDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296416, "field 'btnNo' and method 'clickedNo'");
        suratPernyataanBNDialog.btnNo = (Button) Utils.castView(findRequiredView, 2131296416, "field 'btnNo'", Button.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SuratPernyataanBNDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                suratPernyataanBNDialog.clickedNo();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "field 'btnYes' and method 'clickedYes'");
        suratPernyataanBNDialog.btnYes = (Button) Utils.castView(findRequiredView2, 2131296462, "field 'btnYes'", Button.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SuratPernyataanBNDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                suratPernyataanBNDialog.clickedYes();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SuratPernyataanBNDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                suratPernyataanBNDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        suratPernyataanBNDialog.title = resources.getString(2131822142);
        suratPernyataanBNDialog.desc = resources.getString(2131821627);
        suratPernyataanBNDialog.yes = resources.getString(2131821401);
        suratPernyataanBNDialog.no = resources.getString(2131821406);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SuratPernyataanBNDialog suratPernyataanBNDialog = this.a;
        if (suratPernyataanBNDialog != null) {
            this.a = null;
            suratPernyataanBNDialog.tvTitle = null;
            suratPernyataanBNDialog.tvDesc = null;
            suratPernyataanBNDialog.btnNo = null;
            suratPernyataanBNDialog.btnYes = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
