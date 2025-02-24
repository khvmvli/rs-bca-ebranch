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
import o.setOnStartEnterTransitionListener;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilKliringActivity_ViewBinding.class */
public class DetailBerhasilKliringActivity_ViewBinding implements Unbinder {
    private View a;
    private DetailBerhasilKliringActivity b;
    private View c;
    private View d;
    private View e;
    private View f;

    public DetailBerhasilKliringActivity_ViewBinding(final DetailBerhasilKliringActivity detailBerhasilKliringActivity, View view) {
        this.b = detailBerhasilKliringActivity;
        detailBerhasilKliringActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilKliringActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilKliringActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChangeKomentar'");
        detailBerhasilKliringActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilKliringActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilKliringActivity.inputChangeKomentar(view2, z);
            }
        });
        detailBerhasilKliringActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296945, "field 'etAlasan' and method 'inputChangeAlasan'");
        detailBerhasilKliringActivity.etAlasan = (LogoutDialog) Utils.castView(findRequiredView2, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilKliringActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilKliringActivity.inputChangeAlasan(view2, z);
            }
        });
        detailBerhasilKliringActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilKliringActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilKliringActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilKliringActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilKliringActivity.tvReceiverName = (TextView) Utils.findRequiredViewAsType(view, 2131299547, "field 'tvReceiverName'", TextView.class);
        detailBerhasilKliringActivity.tvAccountNumber = (TextView) Utils.findRequiredViewAsType(view, 2131298809, "field 'tvAccountNumber'", TextView.class);
        detailBerhasilKliringActivity.tvDueDate = (TextView) Utils.findRequiredViewAsType(view, 2131298949, "field 'tvDueDate'", TextView.class);
        detailBerhasilKliringActivity.tvCustomerType = (TextView) Utils.findRequiredViewAsType(view, 2131298888, "field 'tvCustomerType'", TextView.class);
        detailBerhasilKliringActivity.rvWarkat = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298343, "field 'rvWarkat'", setOnStartEnterTransitionListener.class);
        detailBerhasilKliringActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilKliringActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilKliringActivity.tvCaution = (TextView) Utils.findRequiredViewAsType(view, 2131298876, "field 'tvCaution'", TextView.class);
        detailBerhasilKliringActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilKliringActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilKliringActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilKliringActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilKliringActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilKliringActivity.btnProses = (Button) Utils.castView(findRequiredView3, 2131296440, "field 'btnProses'", Button.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilKliringActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilKliringActivity.proses(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilKliringActivity.btnShare = (Button) Utils.castView(findRequiredView4, 2131296448, "field 'btnShare'", Button.class);
        this.a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilKliringActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilKliringActivity.share(view2);
            }
        });
        detailBerhasilKliringActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilKliringActivity.cvInfo = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296838, "field 'cvInfo'", setSplitTrack.class);
        detailBerhasilKliringActivity.tvBuktiKirim = (TextView) Utils.findRequiredViewAsType(view, 2131298870, "field 'tvBuktiKirim'", TextView.class);
        detailBerhasilKliringActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilKliringActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilKliringActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBerhasilKliringActivity.retry = resources.getString(2131822092);
        detailBerhasilKliringActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilKliringActivity detailBerhasilKliringActivity = this.b;
        if (detailBerhasilKliringActivity != null) {
            this.b = null;
            detailBerhasilKliringActivity.toolbar = null;
            detailBerhasilKliringActivity.txtToolbarTitle = null;
            detailBerhasilKliringActivity.tvErrorMessage = null;
            detailBerhasilKliringActivity.etKomentar = null;
            detailBerhasilKliringActivity.tilKomentar = null;
            detailBerhasilKliringActivity.etAlasan = null;
            detailBerhasilKliringActivity.tilAlasan = null;
            detailBerhasilKliringActivity.tvTransaksi = null;
            detailBerhasilKliringActivity.tvWaktu = null;
            detailBerhasilKliringActivity.tvCabang = null;
            detailBerhasilKliringActivity.tvReceiverName = null;
            detailBerhasilKliringActivity.tvAccountNumber = null;
            detailBerhasilKliringActivity.tvDueDate = null;
            detailBerhasilKliringActivity.tvCustomerType = null;
            detailBerhasilKliringActivity.rvWarkat = null;
            detailBerhasilKliringActivity.tvNominal = null;
            detailBerhasilKliringActivity.tvNoReferensi = null;
            detailBerhasilKliringActivity.tvCaution = null;
            detailBerhasilKliringActivity.tvStatus = null;
            detailBerhasilKliringActivity.llMain = null;
            detailBerhasilKliringActivity.ratingBar = null;
            detailBerhasilKliringActivity.trCabang = null;
            detailBerhasilKliringActivity.llRating = null;
            detailBerhasilKliringActivity.btnProses = null;
            detailBerhasilKliringActivity.btnShare = null;
            detailBerhasilKliringActivity.tvErrorKomentar = null;
            detailBerhasilKliringActivity.cvInfo = null;
            detailBerhasilKliringActivity.tvBuktiKirim = null;
            detailBerhasilKliringActivity.llShare = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
