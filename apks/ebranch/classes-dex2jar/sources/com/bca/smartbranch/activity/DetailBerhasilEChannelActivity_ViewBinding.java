package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.onAcceptKetentuanOR;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilEChannelActivity_ViewBinding.class */
public class DetailBerhasilEChannelActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private DetailBerhasilEChannelActivity c;
    private View d;
    private View e;

    public DetailBerhasilEChannelActivity_ViewBinding(final DetailBerhasilEChannelActivity detailBerhasilEChannelActivity, View view) {
        this.c = detailBerhasilEChannelActivity;
        detailBerhasilEChannelActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilEChannelActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilEChannelActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilEChannelActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.b = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilEChannelActivity.inputChange(view2, z);
            }
        });
        detailBerhasilEChannelActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilEChannelActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilEChannelActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilEChannelActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilEChannelActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilEChannelActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilEChannelActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilEChannelActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilEChannelActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilEChannelActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilEChannelActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilEChannelActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilEChannelActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilEChannelActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilEChannelActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilEChannelActivity.share(view2);
            }
        });
        detailBerhasilEChannelActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBerhasilEChannelActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilEChannelActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilEChannelActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailBerhasilEChannelActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilEChannelActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBerhasilEChannelActivity.retry = resources.getString(2131822092);
        detailBerhasilEChannelActivity.toolbarTitle = resources.getString(2131822201);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilEChannelActivity detailBerhasilEChannelActivity = this.c;
        if (detailBerhasilEChannelActivity != null) {
            this.c = null;
            detailBerhasilEChannelActivity.toolbar = null;
            detailBerhasilEChannelActivity.txtToolbarTitle = null;
            detailBerhasilEChannelActivity.tvErrorMessage = null;
            detailBerhasilEChannelActivity.etKomentar = null;
            detailBerhasilEChannelActivity.tilKomentar = null;
            detailBerhasilEChannelActivity.etAlasan = null;
            detailBerhasilEChannelActivity.tilAlasan = null;
            detailBerhasilEChannelActivity.tvTransaksi = null;
            detailBerhasilEChannelActivity.tvNoReferensi = null;
            detailBerhasilEChannelActivity.tvWaktu = null;
            detailBerhasilEChannelActivity.tvCabang = null;
            detailBerhasilEChannelActivity.tvStatus = null;
            detailBerhasilEChannelActivity.llMain = null;
            detailBerhasilEChannelActivity.ratingBar = null;
            detailBerhasilEChannelActivity.trCabang = null;
            detailBerhasilEChannelActivity.llRating = null;
            detailBerhasilEChannelActivity.btnProses = null;
            detailBerhasilEChannelActivity.btnShare = null;
            detailBerhasilEChannelActivity.tvNama = null;
            detailBerhasilEChannelActivity.tvErrorKomentar = null;
            detailBerhasilEChannelActivity.llShare = null;
            detailBerhasilEChannelActivity.llRuangan = null;
            detailBerhasilEChannelActivity.tvJenisRuangan = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
