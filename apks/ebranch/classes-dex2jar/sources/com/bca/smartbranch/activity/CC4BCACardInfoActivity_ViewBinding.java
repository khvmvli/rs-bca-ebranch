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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC4BCACardInfoActivity_ViewBinding.class */
public class CC4BCACardInfoActivity_ViewBinding implements Unbinder {
    private View a;
    private CC4BCACardInfoActivity d;

    public CC4BCACardInfoActivity_ViewBinding(final CC4BCACardInfoActivity cC4BCACardInfoActivity, View view) {
        this.d = cC4BCACardInfoActivity;
        cC4BCACardInfoActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC4BCACardInfoActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC4BCACardInfoActivity.cvImageLandscape = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296836, "field 'cvImageLandscape'", setSplitTrack.class);
        cC4BCACardInfoActivity.ivImageLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297374, "field 'ivImageLandscape'", ImageView.class);
        cC4BCACardInfoActivity.cvImagePortrait = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296837, "field 'cvImagePortrait'", setSplitTrack.class);
        cC4BCACardInfoActivity.ivImagePortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297375, "field 'ivImagePortrait'", ImageView.class);
        cC4BCACardInfoActivity.tvJudul = (TextView) Utils.findRequiredViewAsType(view, 2131299315, "field 'tvJudul'", TextView.class);
        cC4BCACardInfoActivity.rvKeuntungan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298327, "field 'rvKeuntungan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296421, "field 'btnPilihKartu' and method 'onCLickedPilihKartu'");
        cC4BCACardInfoActivity.btnPilihKartu = (Button) Utils.castView(findRequiredView, 2131296421, "field 'btnPilihKartu'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC4BCACardInfoActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC4BCACardInfoActivity.onCLickedPilihKartu();
            }
        });
        cC4BCACardInfoActivity.nsvMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298093, "field 'nsvMain'", getLifecycle.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC4BCACardInfoActivity cC4BCACardInfoActivity = this.d;
        if (cC4BCACardInfoActivity != null) {
            this.d = null;
            cC4BCACardInfoActivity.toolbar = null;
            cC4BCACardInfoActivity.tvToolbarTitle = null;
            cC4BCACardInfoActivity.cvImageLandscape = null;
            cC4BCACardInfoActivity.ivImageLandscape = null;
            cC4BCACardInfoActivity.cvImagePortrait = null;
            cC4BCACardInfoActivity.ivImagePortrait = null;
            cC4BCACardInfoActivity.tvJudul = null;
            cC4BCACardInfoActivity.rvKeuntungan = null;
            cC4BCACardInfoActivity.btnPilihKartu = null;
            cC4BCACardInfoActivity.nsvMain = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
