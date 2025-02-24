package com.bca.smartbranch.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FingerprintActivity_ViewBinding.class */
public class FingerprintActivity_ViewBinding implements Unbinder {
    private FingerprintActivity b;
    private View c;
    private View d;
    private View e;

    public FingerprintActivity_ViewBinding(final FingerprintActivity fingerprintActivity, View view) {
        this.b = fingerprintActivity;
        View findRequiredView = Utils.findRequiredView(view, 2131296461, "method 'clickedYa'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FingerprintActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fingerprintActivity.clickedYa(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296455, "method 'clickedTidak'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FingerprintActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fingerprintActivity.clickedTidak(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131299348, "method 'clickedKetentuan'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FingerprintActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fingerprintActivity.clickedKetentuan(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.b != null) {
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
