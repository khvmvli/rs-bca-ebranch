package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN1TujuanPembelian_ViewBinding.class */
public class BN1TujuanPembelian_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private BN1TujuanPembelian c;
    private View d;

    public BN1TujuanPembelian_ViewBinding(final BN1TujuanPembelian bN1TujuanPembelian, View view) {
        this.c = bN1TujuanPembelian;
        View findRequiredView = Utils.findRequiredView(view, 2131297227, "field 'etTujuanPembelian' and method 'onClick'");
        bN1TujuanPembelian.etTujuanPembelian = (EditText) Utils.castView(findRequiredView, 2131297227, "field 'etTujuanPembelian'", EditText.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN1TujuanPembelian_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN1TujuanPembelian.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296974, "field 'etDetailTujuan' and method 'onClickDetailTujuan'");
        bN1TujuanPembelian.etDetailTujuan = (EditText) Utils.castView(findRequiredView2, 2131296974, "field 'etDetailTujuan'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN1TujuanPembelian_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN1TujuanPembelian.onClickDetailTujuan(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'lanjut'");
        bN1TujuanPembelian.btnLanjut = (Button) Utils.castView(findRequiredView3, 2131296396, "field 'btnLanjut'", Button.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN1TujuanPembelian_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN1TujuanPembelian.lanjut(view2);
            }
        });
        bN1TujuanPembelian.svMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'svMain'", LinearLayout.class);
        bN1TujuanPembelian.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299229, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299004, "field 'tvErrors'", TextView.class));
        bN1TujuanPembelian.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298758, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298525, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        bN1TujuanPembelian.listTujuanPembelianKode = resources.getStringArray(2130903103);
        bN1TujuanPembelian.listTujuanPembelian = resources.getStringArray(2130903102);
        bN1TujuanPembelian.listDetailKegiatanUsahaKode = resources.getStringArray(2130903054);
        bN1TujuanPembelian.listDetailKegiatanUsaha = resources.getStringArray(2130903075);
        bN1TujuanPembelian.listDetailInvestasiKode = resources.getStringArray(2130903053);
        bN1TujuanPembelian.listDetailInvestasi = resources.getStringArray(2130903062);
        bN1TujuanPembelian.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN1TujuanPembelian bN1TujuanPembelian = this.c;
        if (bN1TujuanPembelian != null) {
            this.c = null;
            bN1TujuanPembelian.etTujuanPembelian = null;
            bN1TujuanPembelian.etDetailTujuan = null;
            bN1TujuanPembelian.btnLanjut = null;
            bN1TujuanPembelian.svMain = null;
            bN1TujuanPembelian.tvErrors = null;
            bN1TujuanPembelian.tilForms = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
