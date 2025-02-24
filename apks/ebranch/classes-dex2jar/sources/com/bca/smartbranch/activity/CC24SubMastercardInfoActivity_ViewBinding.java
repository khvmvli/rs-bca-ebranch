package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.getLifecycle;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC24SubMastercardInfoActivity_ViewBinding.class */
public class CC24SubMastercardInfoActivity_ViewBinding implements Unbinder {
    private CC24SubMastercardInfoActivity b;
    private View e;

    public CC24SubMastercardInfoActivity_ViewBinding(final CC24SubMastercardInfoActivity cC24SubMastercardInfoActivity, View view) {
        this.b = cC24SubMastercardInfoActivity;
        cC24SubMastercardInfoActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC24SubMastercardInfoActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC24SubMastercardInfoActivity.cvImageLandscape = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296836, "field 'cvImageLandscape'", setSplitTrack.class);
        cC24SubMastercardInfoActivity.ivImageLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297374, "field 'ivImageLandscape'", ImageView.class);
        cC24SubMastercardInfoActivity.cvImagePortrait = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296837, "field 'cvImagePortrait'", setSplitTrack.class);
        cC24SubMastercardInfoActivity.ivImagePortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297375, "field 'ivImagePortrait'", ImageView.class);
        cC24SubMastercardInfoActivity.tvJudul = (TextView) Utils.findRequiredViewAsType(view, 2131299315, "field 'tvJudul'", TextView.class);
        cC24SubMastercardInfoActivity.rvKeuntungan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298327, "field 'rvKeuntungan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296421, "field 'btnPilihKartu' and method 'onCLickedPilihKartu'");
        cC24SubMastercardInfoActivity.btnPilihKartu = (Button) Utils.castView(findRequiredView, 2131296421, "field 'btnPilihKartu'", Button.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC24SubMastercardInfoActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC24SubMastercardInfoActivity.onCLickedPilihKartu();
            }
        });
        cC24SubMastercardInfoActivity.nsvMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298093, "field 'nsvMain'", getLifecycle.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC24SubMastercardInfoActivity cC24SubMastercardInfoActivity = this.b;
        if (cC24SubMastercardInfoActivity != null) {
            this.b = null;
            cC24SubMastercardInfoActivity.toolbar = null;
            cC24SubMastercardInfoActivity.tvToolbarTitle = null;
            cC24SubMastercardInfoActivity.cvImageLandscape = null;
            cC24SubMastercardInfoActivity.ivImageLandscape = null;
            cC24SubMastercardInfoActivity.cvImagePortrait = null;
            cC24SubMastercardInfoActivity.ivImagePortrait = null;
            cC24SubMastercardInfoActivity.tvJudul = null;
            cC24SubMastercardInfoActivity.rvKeuntungan = null;
            cC24SubMastercardInfoActivity.btnPilihKartu = null;
            cC24SubMastercardInfoActivity.nsvMain = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
