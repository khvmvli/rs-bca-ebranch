package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DraftBerhasilDialog_ViewBinding.class */
public class DraftBerhasilDialog_ViewBinding implements Unbinder {
    private View a;
    private DraftBerhasilDialog d;

    public DraftBerhasilDialog_ViewBinding(final DraftBerhasilDialog draftBerhasilDialog, View view) {
        this.d = draftBerhasilDialog;
        draftBerhasilDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DraftBerhasilDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                draftBerhasilDialog.close(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        draftBerhasilDialog.messageContent = resources.getString(2131821638);
        draftBerhasilDialog.messageContentTeller = resources.getString(2131821639);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DraftBerhasilDialog draftBerhasilDialog = this.d;
        if (draftBerhasilDialog != null) {
            this.d = null;
            draftBerhasilDialog.tvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
