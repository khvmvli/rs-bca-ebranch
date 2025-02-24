package com.bca.smartbranch.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.Page6CSFragment;
import o.copyWindowDataInto;
import o.getIncomeDisplayAmount;
import o.getResources;
import o.setCurrencyName;
import o.setInputType;
import o.setSelected;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/HapusTransaksiBerkalaActivity_ViewBinding.class */
public class HapusTransaksiBerkalaActivity_ViewBinding implements Unbinder {
    private HapusTransaksiBerkalaActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;

    /* renamed from: o  reason: collision with root package name */
    private View f15o;

    public HapusTransaksiBerkalaActivity_ViewBinding(final HapusTransaksiBerkalaActivity hapusTransaksiBerkalaActivity, View view) {
        this.a = hapusTransaksiBerkalaActivity;
        hapusTransaksiBerkalaActivity.drawerLayout = (getResources) Utils.findRequiredViewAsType(view, 2131296893, "field 'drawerLayout'", getResources.class);
        hapusTransaksiBerkalaActivity.navView = (HapusTransaksiBerkalaDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298078, "field 'navView'", HapusTransaksiBerkalaDialog_ViewBinding.class);
        hapusTransaksiBerkalaActivity.tvUserName = (TextView) Utils.findRequiredViewAsType(view, 2131299730, "field 'tvUserName'", TextView.class);
        hapusTransaksiBerkalaActivity.ivUserPhoto = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297422, "field 'ivUserPhoto'", Page6CSFragment.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297802, "field 'navRingkasan' and method 'openRingkasanActivity'");
        hapusTransaksiBerkalaActivity.navRingkasan = (LinearLayout) Utils.castView(findRequiredView, 2131297802, "field 'navRingkasan'", LinearLayout.class);
        this.j = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.openRingkasanActivity(view2);
            }
        });
        hapusTransaksiBerkalaActivity.dvdRingkasan = Utils.findRequiredView(view, 2131296904, "field 'dvdRingkasan'");
        hapusTransaksiBerkalaActivity.navSubPengaturan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297800, "field 'navSubPengaturan'", LinearLayout.class);
        hapusTransaksiBerkalaActivity.navSubHelloBCA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297794, "field 'navSubHelloBCA'", LinearLayout.class);
        hapusTransaksiBerkalaActivity.navFingerprint = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297792, "field 'navFingerprint'", LinearLayout.class);
        hapusTransaksiBerkalaActivity.dvdFingerprint = Utils.findRequiredView(view, 2131296897, "field 'dvdFingerprint'");
        View findRequiredView2 = Utils.findRequiredView(view, 2131297795, "field 'navHapusDaftarTransfer' and method 'chooseHapusDaftarTransfer'");
        hapusTransaksiBerkalaActivity.navHapusDaftarTransfer = (LinearLayout) Utils.castView(findRequiredView2, 2131297795, "field 'navHapusDaftarTransfer'", LinearLayout.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.chooseHapusDaftarTransfer(view2);
            }
        });
        hapusTransaksiBerkalaActivity.dvdHapusDaftarTransfer = Utils.findRequiredView(view, 2131296899, "field 'dvdHapusDaftarTransfer'");
        View findRequiredView3 = Utils.findRequiredView(view, 2131297796, "field 'navHapusTransaksiBerkala' and method 'chooseHapusTransaksiBerkala'");
        hapusTransaksiBerkalaActivity.navHapusTransaksiBerkala = (LinearLayout) Utils.castView(findRequiredView3, 2131297796, "field 'navHapusTransaksiBerkala'", LinearLayout.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.chooseHapusTransaksiBerkala(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297799, "field 'navPengaturan' and method 'showSubPengaturan'");
        hapusTransaksiBerkalaActivity.navPengaturan = (LinearLayout) Utils.castView(findRequiredView4, 2131297799, "field 'navPengaturan'", LinearLayout.class);
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.showSubPengaturan(view2);
            }
        });
        hapusTransaksiBerkalaActivity.dvdPengaturan = Utils.findRequiredView(view, 2131296903, "field 'dvdPengaturan'");
        hapusTransaksiBerkalaActivity.swFingerprint = (setSelected) Utils.findRequiredViewAsType(view, 2131298421, "field 'swFingerprint'", setSelected.class);
        hapusTransaksiBerkalaActivity.ivArrowPengaturan = (ImageView) Utils.findRequiredViewAsType(view, 2131297310, "field 'ivArrowPengaturan'", ImageView.class);
        hapusTransaksiBerkalaActivity.ivArrowHubungi = (ImageView) Utils.findRequiredViewAsType(view, 2131297307, "field 'ivArrowHubungi'", ImageView.class);
        hapusTransaksiBerkalaActivity.tvVersi = (TextView) Utils.findRequiredViewAsType(view, 2131299735, "field 'tvVersi'", TextView.class);
        hapusTransaksiBerkalaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        hapusTransaksiBerkalaActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        hapusTransaksiBerkalaActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        hapusTransaksiBerkalaActivity.rvHapusTransaksiBerkala = (getIncomeDisplayAmount) Utils.findRequiredViewAsType(view, 2131298325, "field 'rvHapusTransaksiBerkala'", getIncomeDisplayAmount.class);
        hapusTransaksiBerkalaActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        hapusTransaksiBerkalaActivity.tvTransaksiEmpty = (TextView) Utils.findRequiredViewAsType(view, 2131299690, "field 'tvTransaksiEmpty'", TextView.class);
        hapusTransaksiBerkalaActivity.llEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297634, "field 'llEmpty'", LinearLayout.class);
        hapusTransaksiBerkalaActivity.ivVerified = (ImageView) Utils.findRequiredViewAsType(view, 2131297423, "field 'ivVerified'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131299539, "method 'chooseProfile'");
        this.n = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.chooseProfile(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297797, "method 'chooseHome'");
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.chooseHome(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297793, "method 'showSubHalloBCA'");
        this.e = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.showSubHalloBCA(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297803, "method 'chooseSyaratKetentuan'");
        this.k = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.chooseSyaratKetentuan(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297804, "method 'clikedTeleponHalloBCA'");
        this.m = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.clikedTeleponHalloBCA(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297805, "method 'clikedTwitterHalloBCA'");
        this.f15o = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.clikedTwitterHalloBCA(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297791, "method 'clikedEmailHalloBCA'");
        this.b = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.clikedEmailHalloBCA(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297798, "method 'clickedKeluar'");
        this.i = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.clickedKeluar(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297266, "method 'clickProfileVerify'");
        this.d = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.clickProfileVerify();
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131299258, "method 'clickedTvFinger'");
        this.l = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                hapusTransaksiBerkalaActivity.clickedTvFinger(view2);
            }
        });
        Context context = view.getContext();
        Resources resources = context.getResources();
        hapusTransaksiBerkalaActivity.btnBurger = copyWindowDataInto.b(context, 2131231312);
        hapusTransaksiBerkalaActivity.menuIndicator = copyWindowDataInto.b(context, 2131231154);
        hapusTransaksiBerkalaActivity.labelHome = resources.getString(2131821707);
        hapusTransaksiBerkalaActivity.toolbarTitleHapusTransaksiBerkala = resources.getString(2131822208);
        hapusTransaksiBerkalaActivity.retry = resources.getString(2131822092);
        hapusTransaksiBerkalaActivity.hapusTransaksiBerkalaBerhasil = resources.getString(2131821702);
        hapusTransaksiBerkalaActivity.verifMessage = resources.getString(2131822339);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        HapusTransaksiBerkalaActivity hapusTransaksiBerkalaActivity = this.a;
        if (hapusTransaksiBerkalaActivity != null) {
            this.a = null;
            hapusTransaksiBerkalaActivity.drawerLayout = null;
            hapusTransaksiBerkalaActivity.navView = null;
            hapusTransaksiBerkalaActivity.tvUserName = null;
            hapusTransaksiBerkalaActivity.ivUserPhoto = null;
            hapusTransaksiBerkalaActivity.navRingkasan = null;
            hapusTransaksiBerkalaActivity.dvdRingkasan = null;
            hapusTransaksiBerkalaActivity.navSubPengaturan = null;
            hapusTransaksiBerkalaActivity.navSubHelloBCA = null;
            hapusTransaksiBerkalaActivity.navFingerprint = null;
            hapusTransaksiBerkalaActivity.dvdFingerprint = null;
            hapusTransaksiBerkalaActivity.navHapusDaftarTransfer = null;
            hapusTransaksiBerkalaActivity.dvdHapusDaftarTransfer = null;
            hapusTransaksiBerkalaActivity.navHapusTransaksiBerkala = null;
            hapusTransaksiBerkalaActivity.navPengaturan = null;
            hapusTransaksiBerkalaActivity.dvdPengaturan = null;
            hapusTransaksiBerkalaActivity.swFingerprint = null;
            hapusTransaksiBerkalaActivity.ivArrowPengaturan = null;
            hapusTransaksiBerkalaActivity.ivArrowHubungi = null;
            hapusTransaksiBerkalaActivity.tvVersi = null;
            hapusTransaksiBerkalaActivity.toolbar = null;
            hapusTransaksiBerkalaActivity.txtToolbarTitle = null;
            hapusTransaksiBerkalaActivity.lnMain = null;
            hapusTransaksiBerkalaActivity.rvHapusTransaksiBerkala = null;
            hapusTransaksiBerkalaActivity.tvErrorMessage = null;
            hapusTransaksiBerkalaActivity.tvTransaksiEmpty = null;
            hapusTransaksiBerkalaActivity.llEmpty = null;
            hapusTransaksiBerkalaActivity.ivVerified = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.f15o.setOnClickListener(null);
            this.f15o = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.l.setOnClickListener(null);
            this.l = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
