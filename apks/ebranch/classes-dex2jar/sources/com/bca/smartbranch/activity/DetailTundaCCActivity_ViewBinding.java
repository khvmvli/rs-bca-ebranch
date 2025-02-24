package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaCCActivity_ViewBinding.class */
public class DetailTundaCCActivity_ViewBinding implements Unbinder {
    private DetailTundaCCActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View g;

    public DetailTundaCCActivity_ViewBinding(final DetailTundaCCActivity detailTundaCCActivity, View view) {
        this.a = detailTundaCCActivity;
        detailTundaCCActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailTundaCCActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailTundaCCActivity.tvJenisProduk = (TextView) Utils.findRequiredViewAsType(view, 2131299310, "field 'tvJenisProduk'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        detailTundaCCActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.g = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaCCActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaCCActivity.showWebView(view2);
            }
        });
        detailTundaCCActivity.llReservasi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297869, "field 'llReservasi'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296380, "field 'btnBatal' and method 'batal'");
        detailTundaCCActivity.btnBatal = (Button) Utils.castView(findRequiredView2, 2131296380, "field 'btnBatal'", Button.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaCCActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaCCActivity.batal(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296444, "field 'btnReservasi' and method 'clickedReservation'");
        detailTundaCCActivity.btnReservasi = (Button) Utils.castView(findRequiredView3, 2131296444, "field 'btnReservasi'", Button.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaCCActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaCCActivity.clickedReservation(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaCCActivity.btnReschedule = (Button) Utils.castView(findRequiredView4, 2131296443, "field 'btnReschedule'", Button.class);
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaCCActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaCCActivity.clickedReservation(view2);
            }
        });
        detailTundaCCActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailTundaCCActivity.tvKuponDescription = (TextView) Utils.findRequiredViewAsType(view, 2131299384, "field 'tvKuponDescription'", TextView.class);
        detailTundaCCActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailTundaCCActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaCCActivity.tvBrancahAddres = (TextView) Utils.findRequiredViewAsType(view, 2131298863, "field 'tvBrancahAddres'", TextView.class);
        detailTundaCCActivity.tvReservationDate = (TextView) Utils.findRequiredViewAsType(view, 2131299554, "field 'tvReservationDate'", TextView.class);
        detailTundaCCActivity.tvReservationTime = (TextView) Utils.findRequiredViewAsType(view, 2131299557, "field 'tvReservationTime'", TextView.class);
        detailTundaCCActivity.tvResevationNote = (TextView) Utils.findRequiredViewAsType(view, 2131299555, "field 'tvResevationNote'", TextView.class);
        detailTundaCCActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaCCActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaCCActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaCCActivity.toolbarTitle = resources.getString(2131822262);
        detailTundaCCActivity.labelKuponDesc = resources.getString(2131821817);
        detailTundaCCActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaCCActivity detailTundaCCActivity = this.a;
        if (detailTundaCCActivity != null) {
            this.a = null;
            detailTundaCCActivity.toolbar = null;
            detailTundaCCActivity.tvNoReferensi = null;
            detailTundaCCActivity.tvJenisProduk = null;
            detailTundaCCActivity.tvNote = null;
            detailTundaCCActivity.llReservasi = null;
            detailTundaCCActivity.btnBatal = null;
            detailTundaCCActivity.btnReservasi = null;
            detailTundaCCActivity.btnReschedule = null;
            detailTundaCCActivity.txtToolbarTitle = null;
            detailTundaCCActivity.tvKuponDescription = null;
            detailTundaCCActivity.tvErrorMessage = null;
            detailTundaCCActivity.tvBranchName = null;
            detailTundaCCActivity.tvBrancahAddres = null;
            detailTundaCCActivity.tvReservationDate = null;
            detailTundaCCActivity.tvReservationTime = null;
            detailTundaCCActivity.tvResevationNote = null;
            detailTundaCCActivity.llMain = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
