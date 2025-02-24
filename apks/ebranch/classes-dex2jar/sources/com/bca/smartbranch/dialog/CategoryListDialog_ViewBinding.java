package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CategoryListDialog_ViewBinding.class */
public class CategoryListDialog_ViewBinding implements Unbinder {
    private CategoryListDialog b;
    private View c;
    private View d;

    public CategoryListDialog_ViewBinding(final CategoryListDialog categoryListDialog, View view) {
        this.b = categoryListDialog;
        categoryListDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        categoryListDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CategoryListDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                categoryListDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'clickClose'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CategoryListDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                categoryListDialog.clickClose(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        categoryListDialog.titleOccupationPekerjaan = resources.getString(2131822239);
        categoryListDialog.titleOccupationJabatan = resources.getString(2131822228);
        categoryListDialog.titleHomeStatus = resources.getString(2131822270);
        categoryListDialog.titleEducation = resources.getString(2131822247);
        categoryListDialog.titleBusinessField = resources.getString(2131822200);
        categoryListDialog.titleBankName = resources.getString(2131822198);
        categoryListDialog.titleMaritalStatus = resources.getString(2131822269);
        categoryListDialog.titleRelationship = resources.getString(2131822211);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CategoryListDialog categoryListDialog = this.b;
        if (categoryListDialog != null) {
            this.b = null;
            categoryListDialog.tvTitle = null;
            categoryListDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
