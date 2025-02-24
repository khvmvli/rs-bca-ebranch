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
import o.getResources;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import o.setSelected;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/MainActivity_ViewBinding.class */
public class MainActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private MainActivity d;
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
    private View f19o;
    private View p;
    private View r;

    public MainActivity_ViewBinding(final MainActivity mainActivity, View view) {
        this.d = mainActivity;
        mainActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        mainActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvTitle'", TextView.class);
        mainActivity.drawerLayout = (getResources) Utils.findRequiredViewAsType(view, 2131296893, "field 'drawerLayout'", getResources.class);
        mainActivity.navView = (HapusTransaksiBerkalaDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298078, "field 'navView'", HapusTransaksiBerkalaDialog_ViewBinding.class);
        mainActivity.tvUserName = (TextView) Utils.findRequiredViewAsType(view, 2131299730, "field 'tvUserName'", TextView.class);
        mainActivity.ivUserPhoto = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297422, "field 'ivUserPhoto'", Page6CSFragment.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297802, "field 'navRingkasan' and method 'openRingkasanActivity'");
        mainActivity.navRingkasan = (LinearLayout) Utils.castView(findRequiredView, 2131297802, "field 'navRingkasan'", LinearLayout.class);
        this.h = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.openRingkasanActivity(view2);
            }
        });
        mainActivity.dvdRingkasan = Utils.findRequiredView(view, 2131296904, "field 'dvdRingkasan'");
        mainActivity.navSubPengaturan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297800, "field 'navSubPengaturan'", LinearLayout.class);
        mainActivity.navSubHelloBCA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297794, "field 'navSubHelloBCA'", LinearLayout.class);
        mainActivity.navFingerprint = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297792, "field 'navFingerprint'", LinearLayout.class);
        mainActivity.dvdFingerprint = Utils.findRequiredView(view, 2131296897, "field 'dvdFingerprint'");
        View findRequiredView2 = Utils.findRequiredView(view, 2131297795, "field 'navHapusDaftarTransfer' and method 'chooseHapusDaftarTransfer'");
        mainActivity.navHapusDaftarTransfer = (LinearLayout) Utils.castView(findRequiredView2, 2131297795, "field 'navHapusDaftarTransfer'", LinearLayout.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.chooseHapusDaftarTransfer(view2);
            }
        });
        mainActivity.dvdHapusDaftarTransfer = Utils.findRequiredView(view, 2131296899, "field 'dvdHapusDaftarTransfer'");
        View findRequiredView3 = Utils.findRequiredView(view, 2131297796, "field 'navHapusTransaksiBerkala' and method 'chooseHapusTransaksiBerkala'");
        mainActivity.navHapusTransaksiBerkala = (LinearLayout) Utils.castView(findRequiredView3, 2131297796, "field 'navHapusTransaksiBerkala'", LinearLayout.class);
        this.j = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.chooseHapusTransaksiBerkala(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297799, "field 'navPengaturan' and method 'showSubPengaturan'");
        mainActivity.navPengaturan = (LinearLayout) Utils.castView(findRequiredView4, 2131297799, "field 'navPengaturan'", LinearLayout.class);
        this.i = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.showSubPengaturan(view2);
            }
        });
        mainActivity.dvdPengaturan = Utils.findRequiredView(view, 2131296903, "field 'dvdPengaturan'");
        mainActivity.swFingerprint = (setSelected) Utils.findRequiredViewAsType(view, 2131298421, "field 'swFingerprint'", setSelected.class);
        mainActivity.ivArrowPengaturan = (ImageView) Utils.findRequiredViewAsType(view, 2131297310, "field 'ivArrowPengaturan'", ImageView.class);
        mainActivity.ivArrowHubungi = (ImageView) Utils.findRequiredViewAsType(view, 2131297307, "field 'ivArrowHubungi'", ImageView.class);
        mainActivity.rvMenu = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298331, "field 'rvMenu'", setOnStartEnterTransitionListener.class);
        mainActivity.tvVersi = (TextView) Utils.findRequiredViewAsType(view, 2131299735, "field 'tvVersi'", TextView.class);
        mainActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        mainActivity.ivVerified = (ImageView) Utils.findRequiredViewAsType(view, 2131297423, "field 'ivVerified'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131298300, "method 'chooseReservasiTeller'");
        this.f19o = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.chooseReservasiTeller();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131298299, "method 'chooseReservasiCS'");
        this.l = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.chooseReservasiCS();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131299539, "method 'chooseProfile'");
        this.p = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.chooseProfile(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297797, "method 'chooseHome'");
        this.g = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.chooseHome(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297793, "method 'showSubHalloBCA'");
        this.b = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.showSubHalloBCA(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297803, "method 'chooseSyaratKetentuan'");
        this.m = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.chooseSyaratKetentuan(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297804, "method 'clikedTeleponHalloBCA'");
        this.k = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.clikedTeleponHalloBCA(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297805, "method 'clikedTwitterHalloBCA'");
        this.n = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.clikedTwitterHalloBCA(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297791, "method 'clikedEmailHalloBCA'");
        this.c = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.clikedEmailHalloBCA(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297798, "method 'clickedKeluar'");
        this.f = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.clickedKeluar(view2);
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131297266, "method 'clickProfileVerify'");
        this.a = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.clickProfileVerify();
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131299258, "method 'clickedTvFinger'");
        this.r = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                mainActivity.clickedTvFinger(view2);
            }
        });
        Context context = view.getContext();
        Resources resources = context.getResources();
        mainActivity.btnBurger = copyWindowDataInto.b(context, 2131231312);
        mainActivity.menuIndicator = copyWindowDataInto.b(context, 2131231154);
        mainActivity.labelHome = resources.getString(2131821707);
        mainActivity.retry = resources.getString(2131822092);
        mainActivity.verifMessage = resources.getString(2131822339);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MainActivity mainActivity = this.d;
        if (mainActivity != null) {
            this.d = null;
            mainActivity.toolbar = null;
            mainActivity.tvTitle = null;
            mainActivity.drawerLayout = null;
            mainActivity.navView = null;
            mainActivity.tvUserName = null;
            mainActivity.ivUserPhoto = null;
            mainActivity.navRingkasan = null;
            mainActivity.dvdRingkasan = null;
            mainActivity.navSubPengaturan = null;
            mainActivity.navSubHelloBCA = null;
            mainActivity.navFingerprint = null;
            mainActivity.dvdFingerprint = null;
            mainActivity.navHapusDaftarTransfer = null;
            mainActivity.dvdHapusDaftarTransfer = null;
            mainActivity.navHapusTransaksiBerkala = null;
            mainActivity.navPengaturan = null;
            mainActivity.dvdPengaturan = null;
            mainActivity.swFingerprint = null;
            mainActivity.ivArrowPengaturan = null;
            mainActivity.ivArrowHubungi = null;
            mainActivity.rvMenu = null;
            mainActivity.tvVersi = null;
            mainActivity.llMain = null;
            mainActivity.ivVerified = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.f19o.setOnClickListener(null);
            this.f19o = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.r.setOnClickListener(null);
            this.r = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
