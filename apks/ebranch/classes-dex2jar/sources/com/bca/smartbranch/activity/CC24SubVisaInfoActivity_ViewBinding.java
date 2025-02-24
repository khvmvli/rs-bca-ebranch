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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC24SubVisaInfoActivity_ViewBinding.class */
public class CC24SubVisaInfoActivity_ViewBinding implements Unbinder {
    private View d;
    private CC24SubVisaInfoActivity e;

    public CC24SubVisaInfoActivity_ViewBinding(final CC24SubVisaInfoActivity cC24SubVisaInfoActivity, View view) {
        this.e = cC24SubVisaInfoActivity;
        cC24SubVisaInfoActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC24SubVisaInfoActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC24SubVisaInfoActivity.cvImageLandscape = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296836, "field 'cvImageLandscape'", setSplitTrack.class);
        cC24SubVisaInfoActivity.ivImageLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297374, "field 'ivImageLandscape'", ImageView.class);
        cC24SubVisaInfoActivity.cvImagePortrait = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296837, "field 'cvImagePortrait'", setSplitTrack.class);
        cC24SubVisaInfoActivity.ivImagePortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297375, "field 'ivImagePortrait'", ImageView.class);
        cC24SubVisaInfoActivity.tvJudul = (TextView) Utils.findRequiredViewAsType(view, 2131299315, "field 'tvJudul'", TextView.class);
        cC24SubVisaInfoActivity.rvKeuntungan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298327, "field 'rvKeuntungan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296421, "field 'btnPilihKartu' and method 'onCLickedPilihKartu'");
        cC24SubVisaInfoActivity.btnPilihKartu = (Button) Utils.castView(findRequiredView, 2131296421, "field 'btnPilihKartu'", Button.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC24SubVisaInfoActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC24SubVisaInfoActivity.onCLickedPilihKartu();
            }
        });
        cC24SubVisaInfoActivity.nsvMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298093, "field 'nsvMain'", getLifecycle.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC24SubVisaInfoActivity cC24SubVisaInfoActivity = this.e;
        if (cC24SubVisaInfoActivity != null) {
            this.e = null;
            cC24SubVisaInfoActivity.toolbar = null;
            cC24SubVisaInfoActivity.tvToolbarTitle = null;
            cC24SubVisaInfoActivity.cvImageLandscape = null;
            cC24SubVisaInfoActivity.ivImageLandscape = null;
            cC24SubVisaInfoActivity.cvImagePortrait = null;
            cC24SubVisaInfoActivity.ivImagePortrait = null;
            cC24SubVisaInfoActivity.tvJudul = null;
            cC24SubVisaInfoActivity.rvKeuntungan = null;
            cC24SubVisaInfoActivity.btnPilihKartu = null;
            cC24SubVisaInfoActivity.nsvMain = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
