package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/AskOrangDatangKeCabangDialog_ViewBinding.class */
public class AskOrangDatangKeCabangDialog_ViewBinding implements Unbinder {
    private AskOrangDatangKeCabangDialog b;
    private View c;
    private View e;

    public AskOrangDatangKeCabangDialog_ViewBinding(final AskOrangDatangKeCabangDialog askOrangDatangKeCabangDialog, View view) {
        this.b = askOrangDatangKeCabangDialog;
        askOrangDatangKeCabangDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        askOrangDatangKeCabangDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.AskOrangDatangKeCabangDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                askOrangDatangKeCabangDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.AskOrangDatangKeCabangDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                askOrangDatangKeCabangDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        askOrangDatangKeCabangDialog.data = resources.getStringArray(2130903110);
        askOrangDatangKeCabangDialog.title = resources.getString(2131821330);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AskOrangDatangKeCabangDialog askOrangDatangKeCabangDialog = this.b;
        if (askOrangDatangKeCabangDialog != null) {
            this.b = null;
            askOrangDatangKeCabangDialog.tvTitle = null;
            askOrangDatangKeCabangDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
