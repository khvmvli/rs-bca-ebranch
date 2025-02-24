package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OpenCCSuccessActivity_ViewBinding.class */
public class OpenCCSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private OpenCCSuccessActivity b;
    private View c;
    private View d;

    public OpenCCSuccessActivity_ViewBinding(final OpenCCSuccessActivity openCCSuccessActivity, View view) {
        this.b = openCCSuccessActivity;
        openCCSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        openCCSuccessActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        openCCSuccessActivity.lvNotes = (ListView) Utils.findRequiredViewAsType(view, 2131297978, "field 'lvNotes'", ListView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        openCCSuccessActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenCCSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openCCSuccessActivity.zoomQRCode();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenCCSuccessActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openCCSuccessActivity.selesai();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "method 'simpanGallery'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OpenCCSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                openCCSuccessActivity.simpanGallery(view2);
            }
        });
        openCCSuccessActivity.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OpenCCSuccessActivity openCCSuccessActivity = this.b;
        if (openCCSuccessActivity != null) {
            this.b = null;
            openCCSuccessActivity.llMain = null;
            openCCSuccessActivity.tvNoReferensi = null;
            openCCSuccessActivity.lvNotes = null;
            openCCSuccessActivity.ivQrCode = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
