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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OpenAccountSuccessActivity_ViewBinding.class */
public class OpenAccountSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private OpenAccountSuccessActivity d;
    private View e;
    private View f;
    private View h;
    private View j;

    public OpenAccountSuccessActivity_ViewBinding(final OpenAccountSuccessActivity openAccountSuccessActivity, View view) {
        this.d = openAccountSuccessActivity;
        openAccountSuccessActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        openAccountSuccessActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        openAccountSuccessActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        openAccountSuccessActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.h = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openAccountSuccessActivity.showWebView(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296447, "field 'btnSelesai' and method 'selesai'");
        openAccountSuccessActivity.btnSelesai = (Button) Utils.castView(findRequiredView2, 2131296447, "field 'btnSelesai'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openAccountSuccessActivity.selesai(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        openAccountSuccessActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView3, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openAccountSuccessActivity.zoomQRCode();
            }
        });
        openAccountSuccessActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        openAccountSuccessActivity.ivDetail = (ImageView) Utils.castView(findRequiredView4, 2131297355, "field 'ivDetail'", ImageView.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openAccountSuccessActivity.showDetail();
            }
        });
        openAccountSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296448, "method 'simpanGallery'");
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openAccountSuccessActivity.simpanGallery(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openAccountSuccessActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.f = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openAccountSuccessActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        openAccountSuccessActivity.note = resources.getString(2131821358);
        openAccountSuccessActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OpenAccountSuccessActivity openAccountSuccessActivity = this.d;
        if (openAccountSuccessActivity != null) {
            this.d = null;
            openAccountSuccessActivity.tvNoReferensi = null;
            openAccountSuccessActivity.tvDescriptionKey = null;
            openAccountSuccessActivity.tvDescriptionValue = null;
            openAccountSuccessActivity.tvNote = null;
            openAccountSuccessActivity.btnSelesai = null;
            openAccountSuccessActivity.ivQrCode = null;
            openAccountSuccessActivity.llDetail = null;
            openAccountSuccessActivity.ivDetail = null;
            openAccountSuccessActivity.llMain = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.f.setOnClickListener(null);
            this.f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
