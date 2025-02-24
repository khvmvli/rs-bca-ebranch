package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.onAcceptKetentuanOR;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilROActivity_ViewBinding.class */
public class DetailBerhasilROActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private DetailBerhasilROActivity e;

    public DetailBerhasilROActivity_ViewBinding(final DetailBerhasilROActivity detailBerhasilROActivity, View view) {
        this.e = detailBerhasilROActivity;
        detailBerhasilROActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilROActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilROActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilROActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilROActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilROActivity.inputChange(view2, z);
            }
        });
        detailBerhasilROActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilROActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilROActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilROActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilROActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilROActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilROActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilROActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilROActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilROActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilROActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilROActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilROActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilROActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilROActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilROActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilROActivity.share(view2);
            }
        });
        detailBerhasilROActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBerhasilROActivity.lvTransaksi = (ListView) Utils.findRequiredViewAsType(view, 2131297977, "field 'lvTransaksi'", ListView.class);
        detailBerhasilROActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilROActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilROActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilROActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailBerhasilROActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilROActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilROActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBerhasilROActivity.retry = resources.getString(2131822092);
        detailBerhasilROActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilROActivity detailBerhasilROActivity = this.e;
        if (detailBerhasilROActivity != null) {
            this.e = null;
            detailBerhasilROActivity.toolbar = null;
            detailBerhasilROActivity.txtToolbarTitle = null;
            detailBerhasilROActivity.tvErrorMessage = null;
            detailBerhasilROActivity.etKomentar = null;
            detailBerhasilROActivity.tilKomentar = null;
            detailBerhasilROActivity.etAlasan = null;
            detailBerhasilROActivity.tilAlasan = null;
            detailBerhasilROActivity.tvNoReferensi = null;
            detailBerhasilROActivity.tvWaktu = null;
            detailBerhasilROActivity.tvCabang = null;
            detailBerhasilROActivity.tvStatus = null;
            detailBerhasilROActivity.llMain = null;
            detailBerhasilROActivity.ratingBar = null;
            detailBerhasilROActivity.trCabang = null;
            detailBerhasilROActivity.llRating = null;
            detailBerhasilROActivity.btnProses = null;
            detailBerhasilROActivity.btnShare = null;
            detailBerhasilROActivity.tvNama = null;
            detailBerhasilROActivity.lvTransaksi = null;
            detailBerhasilROActivity.tvTransaksi = null;
            detailBerhasilROActivity.tvErrorKomentar = null;
            detailBerhasilROActivity.llShare = null;
            detailBerhasilROActivity.llRuangan = null;
            detailBerhasilROActivity.tvJenisRuangan = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
