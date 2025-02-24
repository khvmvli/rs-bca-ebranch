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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC6MastercardInfoActivity_ViewBinding.class */
public class CC6MastercardInfoActivity_ViewBinding implements Unbinder {
    private View b;
    private CC6MastercardInfoActivity c;

    public CC6MastercardInfoActivity_ViewBinding(final CC6MastercardInfoActivity cC6MastercardInfoActivity, View view) {
        this.c = cC6MastercardInfoActivity;
        cC6MastercardInfoActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC6MastercardInfoActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC6MastercardInfoActivity.cvImageLandscape = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296836, "field 'cvImageLandscape'", setSplitTrack.class);
        cC6MastercardInfoActivity.ivImageLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297374, "field 'ivImageLandscape'", ImageView.class);
        cC6MastercardInfoActivity.cvImagePortrait = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296837, "field 'cvImagePortrait'", setSplitTrack.class);
        cC6MastercardInfoActivity.ivImagePortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297375, "field 'ivImagePortrait'", ImageView.class);
        cC6MastercardInfoActivity.tvJudul = (TextView) Utils.findRequiredViewAsType(view, 2131299315, "field 'tvJudul'", TextView.class);
        cC6MastercardInfoActivity.rvKeuntungan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298327, "field 'rvKeuntungan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296421, "field 'btnPilihKartu' and method 'onCLickedPilihKartu'");
        cC6MastercardInfoActivity.btnPilihKartu = (Button) Utils.castView(findRequiredView, 2131296421, "field 'btnPilihKartu'", Button.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC6MastercardInfoActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC6MastercardInfoActivity.onCLickedPilihKartu();
            }
        });
        cC6MastercardInfoActivity.nsvMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298093, "field 'nsvMain'", getLifecycle.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC6MastercardInfoActivity cC6MastercardInfoActivity = this.c;
        if (cC6MastercardInfoActivity != null) {
            this.c = null;
            cC6MastercardInfoActivity.toolbar = null;
            cC6MastercardInfoActivity.tvToolbarTitle = null;
            cC6MastercardInfoActivity.cvImageLandscape = null;
            cC6MastercardInfoActivity.ivImageLandscape = null;
            cC6MastercardInfoActivity.cvImagePortrait = null;
            cC6MastercardInfoActivity.ivImagePortrait = null;
            cC6MastercardInfoActivity.tvJudul = null;
            cC6MastercardInfoActivity.rvKeuntungan = null;
            cC6MastercardInfoActivity.btnPilihKartu = null;
            cC6MastercardInfoActivity.nsvMain = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
