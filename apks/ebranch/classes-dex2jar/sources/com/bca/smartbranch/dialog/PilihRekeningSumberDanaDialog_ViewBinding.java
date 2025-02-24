package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihRekeningSumberDanaDialog_ViewBinding.class */
public class PilihRekeningSumberDanaDialog_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private View d;
    private PilihRekeningSumberDanaDialog e;

    public PilihRekeningSumberDanaDialog_ViewBinding(final PilihRekeningSumberDanaDialog pilihRekeningSumberDanaDialog, View view) {
        this.e = pilihRekeningSumberDanaDialog;
        pilihRekeningSumberDanaDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        pilihRekeningSumberDanaDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        pilihRekeningSumberDanaDialog.etSearch = (EditText) Utils.findRequiredViewAsType(view, 2131297176, "field 'etSearch'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296852, "method 'search'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihRekeningSumberDanaDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihRekeningSumberDanaDialog.search();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296419, "method 'onClickPilih'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihRekeningSumberDanaDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihRekeningSumberDanaDialog.onClickPilih(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'onClickClose'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PilihRekeningSumberDanaDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                pilihRekeningSumberDanaDialog.onClickClose(view2);
            }
        });
        pilihRekeningSumberDanaDialog.title = view.getContext().getResources().getString(2131822255);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihRekeningSumberDanaDialog pilihRekeningSumberDanaDialog = this.e;
        if (pilihRekeningSumberDanaDialog != null) {
            this.e = null;
            pilihRekeningSumberDanaDialog.tvTitle = null;
            pilihRekeningSumberDanaDialog.rvContent = null;
            pilihRekeningSumberDanaDialog.etSearch = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
