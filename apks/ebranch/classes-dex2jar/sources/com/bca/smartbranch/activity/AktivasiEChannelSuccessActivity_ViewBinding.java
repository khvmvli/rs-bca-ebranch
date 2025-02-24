package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AktivasiEChannelSuccessActivity_ViewBinding.class */
public class AktivasiEChannelSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private AktivasiEChannelSuccessActivity b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;

    public AktivasiEChannelSuccessActivity_ViewBinding(final AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity, View view) {
        this.b = aktivasiEChannelSuccessActivity;
        aktivasiEChannelSuccessActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        aktivasiEChannelSuccessActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionValue'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        aktivasiEChannelSuccessActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.g = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiEChannelSuccessActivity.showWebView(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296447, "field 'btnSelesai' and method 'selesai'");
        aktivasiEChannelSuccessActivity.btnSelesai = (Button) Utils.castView(findRequiredView2, 2131296447, "field 'btnSelesai'", Button.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiEChannelSuccessActivity.selesai(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        aktivasiEChannelSuccessActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView3, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiEChannelSuccessActivity.zoomQRCode();
            }
        });
        aktivasiEChannelSuccessActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        aktivasiEChannelSuccessActivity.ivDetail = (ImageView) Utils.castView(findRequiredView4, 2131297355, "field 'ivDetail'", ImageView.class);
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiEChannelSuccessActivity.showDetail();
            }
        });
        aktivasiEChannelSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296448, "method 'sendEmail'");
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiEChannelSuccessActivity.sendEmail(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiEChannelSuccessActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                aktivasiEChannelSuccessActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        aktivasiEChannelSuccessActivity.note = resources.getString(2131821358);
        aktivasiEChannelSuccessActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity = this.b;
        if (aktivasiEChannelSuccessActivity != null) {
            this.b = null;
            aktivasiEChannelSuccessActivity.tvNoReferensi = null;
            aktivasiEChannelSuccessActivity.tvDescriptionValue = null;
            aktivasiEChannelSuccessActivity.tvNote = null;
            aktivasiEChannelSuccessActivity.btnSelesai = null;
            aktivasiEChannelSuccessActivity.ivQrCode = null;
            aktivasiEChannelSuccessActivity.llDetail = null;
            aktivasiEChannelSuccessActivity.ivDetail = null;
            aktivasiEChannelSuccessActivity.llMain = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
