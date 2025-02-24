package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailOpenTellerActivity_ViewBinding.class */
public class DetailOpenTellerActivity_ViewBinding implements Unbinder {
    private DetailOpenTellerActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;

    public DetailOpenTellerActivity_ViewBinding(final DetailOpenTellerActivity detailOpenTellerActivity, View view) {
        this.a = detailOpenTellerActivity;
        detailOpenTellerActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'onClickNote'");
        detailOpenTellerActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.i = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailOpenTellerActivity.onClickNote(view2);
            }
        });
        detailOpenTellerActivity.tvMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299409, "field 'tvMessage'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailOpenTellerActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView2, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailOpenTellerActivity.zoomQRCode();
            }
        });
        detailOpenTellerActivity.llKcp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297711, "field 'llKcp'", LinearLayout.class);
        detailOpenTellerActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailOpenTellerActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailOpenTellerActivity.tvBranchCityProvince = (TextView) Utils.findRequiredViewAsType(view, 2131298866, "field 'tvBranchCityProvince'", TextView.class);
        detailOpenTellerActivity.tvBranchPhone = (TextView) Utils.findRequiredViewAsType(view, 2131298868, "field 'tvBranchPhone'", TextView.class);
        detailOpenTellerActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailOpenTellerActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailOpenTellerActivity.showDetail();
            }
        });
        detailOpenTellerActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailOpenTellerActivity.rvListTransaksi = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298329, "field 'rvListTransaksi'", setOnStartEnterTransitionListener.class);
        detailOpenTellerActivity.tvNoReff = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReff'", TextView.class);
        detailOpenTellerActivity.llPhoneWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297858, "field 'llPhoneWrapper'", LinearLayout.class);
        detailOpenTellerActivity.llCapture = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297562, "field 'llCapture'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296448, "method 'sendEmail'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailOpenTellerActivity.sendEmail(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailOpenTellerActivity.selesai(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailOpenTellerActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailOpenTellerActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        detailOpenTellerActivity.tarikanTunai = resources.getString(2131822499);
        detailOpenTellerActivity.tarikanCek = resources.getString(2131822498);
        detailOpenTellerActivity.retry = resources.getString(2131822092);
        detailOpenTellerActivity.note = resources.getString(2131821357);
        detailOpenTellerActivity.buktiPengisianForm = resources.getString(2131820609);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailOpenTellerActivity detailOpenTellerActivity = this.a;
        if (detailOpenTellerActivity != null) {
            this.a = null;
            detailOpenTellerActivity.llMain = null;
            detailOpenTellerActivity.tvNote = null;
            detailOpenTellerActivity.tvMessage = null;
            detailOpenTellerActivity.ivQRCode = null;
            detailOpenTellerActivity.llKcp = null;
            detailOpenTellerActivity.tvBranchName = null;
            detailOpenTellerActivity.tvBranchAddress = null;
            detailOpenTellerActivity.tvBranchCityProvince = null;
            detailOpenTellerActivity.tvBranchPhone = null;
            detailOpenTellerActivity.llDetail = null;
            detailOpenTellerActivity.ivDetail = null;
            detailOpenTellerActivity.tvErrorMessage = null;
            detailOpenTellerActivity.rvListTransaksi = null;
            detailOpenTellerActivity.tvNoReff = null;
            detailOpenTellerActivity.llPhoneWrapper = null;
            detailOpenTellerActivity.llCapture = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
