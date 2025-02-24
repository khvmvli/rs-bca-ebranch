package com.bca.smartbranch.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import o.setSelected;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/SyaratKetentuanActivity_ViewBinding.class */
public class SyaratKetentuanActivity_ViewBinding implements Unbinder {
    private View a;
    private SyaratKetentuanActivity b;
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
    private View f25o;

    public SyaratKetentuanActivity_ViewBinding(final SyaratKetentuanActivity syaratKetentuanActivity, View view) {
        this.b = syaratKetentuanActivity;
        syaratKetentuanActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        syaratKetentuanActivity.drawerLayout = (getResources) Utils.findRequiredViewAsType(view, 2131296893, "field 'drawerLayout'", getResources.class);
        syaratKetentuanActivity.navView = (HapusTransaksiBerkalaDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298078, "field 'navView'", HapusTransaksiBerkalaDialog_ViewBinding.class);
        syaratKetentuanActivity.tvUserName = (TextView) Utils.findRequiredViewAsType(view, 2131299730, "field 'tvUserName'", TextView.class);
        syaratKetentuanActivity.ivUserPhoto = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297422, "field 'ivUserPhoto'", Page6CSFragment.class);
        syaratKetentuanActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297802, "field 'navRingkasan' and method 'openRingkasanActivity'");
        syaratKetentuanActivity.navRingkasan = (LinearLayout) Utils.castView(findRequiredView, 2131297802, "field 'navRingkasan'", LinearLayout.class);
        this.f = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.openRingkasanActivity(view2);
            }
        });
        syaratKetentuanActivity.dvdRingkasan = Utils.findRequiredView(view, 2131296904, "field 'dvdRingkasan'");
        syaratKetentuanActivity.navSubPengaturan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297800, "field 'navSubPengaturan'", LinearLayout.class);
        syaratKetentuanActivity.navSubHelloBCA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297794, "field 'navSubHelloBCA'", LinearLayout.class);
        syaratKetentuanActivity.navFingerprint = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297792, "field 'navFingerprint'", LinearLayout.class);
        syaratKetentuanActivity.dvdFingerprint = Utils.findRequiredView(view, 2131296897, "field 'dvdFingerprint'");
        View findRequiredView2 = Utils.findRequiredView(view, 2131297795, "field 'navHapusDaftarTransfer' and method 'chooseHapusDaftarTransfer'");
        syaratKetentuanActivity.navHapusDaftarTransfer = (LinearLayout) Utils.castView(findRequiredView2, 2131297795, "field 'navHapusDaftarTransfer'", LinearLayout.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.chooseHapusDaftarTransfer(view2);
            }
        });
        syaratKetentuanActivity.dvdHapusDaftarTransfer = Utils.findRequiredView(view, 2131296899, "field 'dvdHapusDaftarTransfer'");
        View findRequiredView3 = Utils.findRequiredView(view, 2131297796, "field 'navHapusTransaksiBerkala' and method 'chooseHapusTransaksiBerkala'");
        syaratKetentuanActivity.navHapusTransaksiBerkala = (LinearLayout) Utils.castView(findRequiredView3, 2131297796, "field 'navHapusTransaksiBerkala'", LinearLayout.class);
        this.j = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.chooseHapusTransaksiBerkala(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297799, "field 'navPengaturan' and method 'showSubPengaturan'");
        syaratKetentuanActivity.navPengaturan = (LinearLayout) Utils.castView(findRequiredView4, 2131297799, "field 'navPengaturan'", LinearLayout.class);
        this.g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.showSubPengaturan(view2);
            }
        });
        syaratKetentuanActivity.dvdPengaturan = Utils.findRequiredView(view, 2131296903, "field 'dvdPengaturan'");
        syaratKetentuanActivity.swFingerprint = (setSelected) Utils.findRequiredViewAsType(view, 2131298421, "field 'swFingerprint'", setSelected.class);
        syaratKetentuanActivity.ivArrowPengaturan = (ImageView) Utils.findRequiredViewAsType(view, 2131297310, "field 'ivArrowPengaturan'", ImageView.class);
        syaratKetentuanActivity.ivArrowHubungi = (ImageView) Utils.findRequiredViewAsType(view, 2131297307, "field 'ivArrowHubungi'", ImageView.class);
        syaratKetentuanActivity.tvVersi = (TextView) Utils.findRequiredViewAsType(view, 2131299735, "field 'tvVersi'", TextView.class);
        syaratKetentuanActivity.tvTitleToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvTitleToolbar'", TextView.class);
        syaratKetentuanActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        syaratKetentuanActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        syaratKetentuanActivity.ivVerified = (ImageView) Utils.findRequiredViewAsType(view, 2131297423, "field 'ivVerified'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131299539, "method 'chooseProfile'");
        this.n = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.chooseProfile(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297797, "method 'chooseHome'");
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.chooseHome(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297793, "method 'showSubHalloBCA'");
        this.e = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.showSubHalloBCA(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297803, "method 'chooseSyaratKetentuan'");
        this.m = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.chooseSyaratKetentuan(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297804, "method 'clikedTeleponHalloBCA'");
        this.k = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.clikedTeleponHalloBCA(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297805, "method 'clikedTwitterHalloBCA'");
        this.l = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.clikedTwitterHalloBCA(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297791, "method 'clikedEmailHalloBCA'");
        this.c = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.clikedEmailHalloBCA(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297798, "method 'clickedKeluar'");
        this.h = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.clickedKeluar(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297266, "method 'clickProfileVerify'");
        this.a = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.clickProfileVerify();
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131299258, "method 'clickedTvFinger'");
        this.f25o = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.SyaratKetentuanActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                syaratKetentuanActivity.clickedTvFinger(view2);
            }
        });
        Context context = view.getContext();
        Resources resources = context.getResources();
        syaratKetentuanActivity.btnBurger = copyWindowDataInto.b(context, 2131231312);
        syaratKetentuanActivity.menuIndicator = copyWindowDataInto.b(context, 2131231154);
        syaratKetentuanActivity.labelHome = resources.getString(2131821707);
        syaratKetentuanActivity.txtToolbarTitle = resources.getString(2131822274);
        syaratKetentuanActivity.retry = resources.getString(2131822092);
        syaratKetentuanActivity.verifMessage = resources.getString(2131822339);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SyaratKetentuanActivity syaratKetentuanActivity = this.b;
        if (syaratKetentuanActivity != null) {
            this.b = null;
            syaratKetentuanActivity.toolbar = null;
            syaratKetentuanActivity.drawerLayout = null;
            syaratKetentuanActivity.navView = null;
            syaratKetentuanActivity.tvUserName = null;
            syaratKetentuanActivity.ivUserPhoto = null;
            syaratKetentuanActivity.pb = null;
            syaratKetentuanActivity.navRingkasan = null;
            syaratKetentuanActivity.dvdRingkasan = null;
            syaratKetentuanActivity.navSubPengaturan = null;
            syaratKetentuanActivity.navSubHelloBCA = null;
            syaratKetentuanActivity.navFingerprint = null;
            syaratKetentuanActivity.dvdFingerprint = null;
            syaratKetentuanActivity.navHapusDaftarTransfer = null;
            syaratKetentuanActivity.dvdHapusDaftarTransfer = null;
            syaratKetentuanActivity.navHapusTransaksiBerkala = null;
            syaratKetentuanActivity.navPengaturan = null;
            syaratKetentuanActivity.dvdPengaturan = null;
            syaratKetentuanActivity.swFingerprint = null;
            syaratKetentuanActivity.ivArrowPengaturan = null;
            syaratKetentuanActivity.ivArrowHubungi = null;
            syaratKetentuanActivity.tvVersi = null;
            syaratKetentuanActivity.tvTitleToolbar = null;
            syaratKetentuanActivity.wvContent = null;
            syaratKetentuanActivity.llMain = null;
            syaratKetentuanActivity.ivVerified = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.f25o.setOnClickListener(null);
            this.f25o = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
