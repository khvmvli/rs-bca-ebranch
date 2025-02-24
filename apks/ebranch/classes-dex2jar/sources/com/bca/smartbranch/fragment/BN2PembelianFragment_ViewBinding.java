package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setTypeface;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN2PembelianFragment_ViewBinding.class */
public class BN2PembelianFragment_ViewBinding implements Unbinder {
    private BN2PembelianFragment b;
    private View c;

    public BN2PembelianFragment_ViewBinding(final BN2PembelianFragment bN2PembelianFragment, View view) {
        this.b = bN2PembelianFragment;
        bN2PembelianFragment.spMataUang = (Spinner) Utils.findRequiredViewAsType(view, 2131298394, "field 'spMataUang'", Spinner.class);
        bN2PembelianFragment.etJumlahBeli = (EditText) Utils.findRequiredViewAsType(view, 2131297007, "field 'etJumlahBeli'", EditText.class);
        bN2PembelianFragment.lnPecahanUang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297967, "field 'lnPecahanUang'", LinearLayout.class);
        bN2PembelianFragment.tvTotal = (setTypeface) Utils.findRequiredViewAsType(view, 2131299677, "field 'tvTotal'", setTypeface.class);
        bN2PembelianFragment.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299401, "field 'tvMataUang'", TextView.class);
        bN2PembelianFragment.ivMataUang = (ImageView) Utils.findRequiredViewAsType(view, 2131297396, "field 'ivMataUang'", ImageView.class);
        bN2PembelianFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        bN2PembelianFragment.tvKurs = (TextView) Utils.findRequiredViewAsType(view, 2131299385, "field 'tvKurs'", TextView.class);
        bN2PembelianFragment.llKurs = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297754, "field 'llKurs'", LinearLayout.class);
        bN2PembelianFragment.tvErrorNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299137, "field 'tvErrorNominal'", TextView.class);
        bN2PembelianFragment.llPesan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297558, "field 'llPesan'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN2PembelianFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN2PembelianFragment.lanjut();
            }
        });
        Resources resources = view.getContext().getResources();
        bN2PembelianFragment.listMataUangKode = resources.getStringArray(2130903080);
        bN2PembelianFragment.listMataUangImage = resources.obtainTypedArray(2130903079);
        bN2PembelianFragment.listMataUang = resources.getStringArray(2130903078);
        bN2PembelianFragment.listTujuanPembelianKode = resources.getStringArray(2130903103);
        bN2PembelianFragment.listTujuanPembelian = resources.getStringArray(2130903102);
        bN2PembelianFragment.messageMaxTotalPembelian = resources.getString(2131821021);
        bN2PembelianFragment.messageNominalEmpty = resources.getString(2131820906);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN2PembelianFragment bN2PembelianFragment = this.b;
        if (bN2PembelianFragment != null) {
            this.b = null;
            bN2PembelianFragment.spMataUang = null;
            bN2PembelianFragment.etJumlahBeli = null;
            bN2PembelianFragment.lnPecahanUang = null;
            bN2PembelianFragment.tvTotal = null;
            bN2PembelianFragment.tvMataUang = null;
            bN2PembelianFragment.ivMataUang = null;
            bN2PembelianFragment.svMain = null;
            bN2PembelianFragment.tvKurs = null;
            bN2PembelianFragment.llKurs = null;
            bN2PembelianFragment.tvErrorNominal = null;
            bN2PembelianFragment.llPesan = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
