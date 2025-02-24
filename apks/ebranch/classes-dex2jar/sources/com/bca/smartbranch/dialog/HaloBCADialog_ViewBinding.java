package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HaloBCADialog_ViewBinding.class */
public class HaloBCADialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private HaloBCADialog b;
    private View e;

    public HaloBCADialog_ViewBinding(final HaloBCADialog haloBCADialog, View view) {
        super(haloBCADialog, view);
        this.b = haloBCADialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.HaloBCADialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                haloBCADialog.clickedYes();
            }
        });
        Resources resources = view.getContext().getResources();
        haloBCADialog.nomorHalloBCA = resources.getString(2131822477);
        haloBCADialog.title = resources.getString(2131821335);
        haloBCADialog.desc = resources.getString(2131821692);
        haloBCADialog.yes = resources.getString(2131822354);
        haloBCADialog.no = resources.getString(2131822169);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.b != null) {
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
