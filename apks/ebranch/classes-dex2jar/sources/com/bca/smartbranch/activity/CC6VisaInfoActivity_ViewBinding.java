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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC6VisaInfoActivity_ViewBinding.class */
public class CC6VisaInfoActivity_ViewBinding implements Unbinder {
    private CC6VisaInfoActivity c;
    private View d;

    public CC6VisaInfoActivity_ViewBinding(final CC6VisaInfoActivity cC6VisaInfoActivity, View view) {
        this.c = cC6VisaInfoActivity;
        cC6VisaInfoActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC6VisaInfoActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC6VisaInfoActivity.cvImageLandscape = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296836, "field 'cvImageLandscape'", setSplitTrack.class);
        cC6VisaInfoActivity.ivImageLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297374, "field 'ivImageLandscape'", ImageView.class);
        cC6VisaInfoActivity.cvImagePortrait = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296837, "field 'cvImagePortrait'", setSplitTrack.class);
        cC6VisaInfoActivity.ivImagePortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297375, "field 'ivImagePortrait'", ImageView.class);
        cC6VisaInfoActivity.tvJudul = (TextView) Utils.findRequiredViewAsType(view, 2131299315, "field 'tvJudul'", TextView.class);
        cC6VisaInfoActivity.rvKeuntungan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298327, "field 'rvKeuntungan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296421, "field 'btnPilihKartu' and method 'onCLickedPilihKartu'");
        cC6VisaInfoActivity.btnPilihKartu = (Button) Utils.castView(findRequiredView, 2131296421, "field 'btnPilihKartu'", Button.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC6VisaInfoActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC6VisaInfoActivity.onCLickedPilihKartu();
            }
        });
        cC6VisaInfoActivity.nsvMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298093, "field 'nsvMain'", getLifecycle.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC6VisaInfoActivity cC6VisaInfoActivity = this.c;
        if (cC6VisaInfoActivity != null) {
            this.c = null;
            cC6VisaInfoActivity.toolbar = null;
            cC6VisaInfoActivity.tvToolbarTitle = null;
            cC6VisaInfoActivity.cvImageLandscape = null;
            cC6VisaInfoActivity.ivImageLandscape = null;
            cC6VisaInfoActivity.cvImagePortrait = null;
            cC6VisaInfoActivity.ivImagePortrait = null;
            cC6VisaInfoActivity.tvJudul = null;
            cC6VisaInfoActivity.rvKeuntungan = null;
            cC6VisaInfoActivity.btnPilihKartu = null;
            cC6VisaInfoActivity.nsvMain = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
