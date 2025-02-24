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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC22SubBCACardInfoActivity_ViewBinding.class */
public class CC22SubBCACardInfoActivity_ViewBinding implements Unbinder {
    private View d;
    private CC22SubBCACardInfoActivity e;

    public CC22SubBCACardInfoActivity_ViewBinding(final CC22SubBCACardInfoActivity cC22SubBCACardInfoActivity, View view) {
        this.e = cC22SubBCACardInfoActivity;
        cC22SubBCACardInfoActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC22SubBCACardInfoActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC22SubBCACardInfoActivity.cvImageLandscape = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296836, "field 'cvImageLandscape'", setSplitTrack.class);
        cC22SubBCACardInfoActivity.ivImageLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297374, "field 'ivImageLandscape'", ImageView.class);
        cC22SubBCACardInfoActivity.cvImagePortrait = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296837, "field 'cvImagePortrait'", setSplitTrack.class);
        cC22SubBCACardInfoActivity.ivImagePortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297375, "field 'ivImagePortrait'", ImageView.class);
        cC22SubBCACardInfoActivity.tvJudul = (TextView) Utils.findRequiredViewAsType(view, 2131299315, "field 'tvJudul'", TextView.class);
        cC22SubBCACardInfoActivity.rvKeuntungan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298327, "field 'rvKeuntungan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296421, "field 'btnPilihKartu' and method 'onCLickedPilihKartu'");
        cC22SubBCACardInfoActivity.btnPilihKartu = (Button) Utils.castView(findRequiredView, 2131296421, "field 'btnPilihKartu'", Button.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC22SubBCACardInfoActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC22SubBCACardInfoActivity.onCLickedPilihKartu();
            }
        });
        cC22SubBCACardInfoActivity.nsvMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298093, "field 'nsvMain'", getLifecycle.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC22SubBCACardInfoActivity cC22SubBCACardInfoActivity = this.e;
        if (cC22SubBCACardInfoActivity != null) {
            this.e = null;
            cC22SubBCACardInfoActivity.toolbar = null;
            cC22SubBCACardInfoActivity.tvToolbarTitle = null;
            cC22SubBCACardInfoActivity.cvImageLandscape = null;
            cC22SubBCACardInfoActivity.ivImageLandscape = null;
            cC22SubBCACardInfoActivity.cvImagePortrait = null;
            cC22SubBCACardInfoActivity.ivImagePortrait = null;
            cC22SubBCACardInfoActivity.tvJudul = null;
            cC22SubBCACardInfoActivity.rvKeuntungan = null;
            cC22SubBCACardInfoActivity.btnPilihKartu = null;
            cC22SubBCACardInfoActivity.nsvMain = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
