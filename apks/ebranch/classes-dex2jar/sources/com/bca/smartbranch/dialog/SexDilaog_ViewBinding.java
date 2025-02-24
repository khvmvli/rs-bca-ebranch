package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SexDilaog_ViewBinding.class */
public class SexDilaog_ViewBinding implements Unbinder {
    private View c;
    private View d;
    private SexDilaog e;

    public SexDilaog_ViewBinding(final SexDilaog sexDilaog, View view) {
        this.e = sexDilaog;
        sexDilaog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        sexDilaog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SexDilaog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sexDilaog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SexDilaog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sexDilaog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        sexDilaog.listDataJenkel = resources.getStringArray(2130903088);
        sexDilaog.title = resources.getString(2131822230);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SexDilaog sexDilaog = this.e;
        if (sexDilaog != null) {
            this.e = null;
            sexDilaog.tvTitle = null;
            sexDilaog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
