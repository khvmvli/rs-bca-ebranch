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
import o.setSelected;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarTransferMenuActivity_ViewBinding.class */
public class DaftarTransferMenuActivity_ViewBinding implements Unbinder {
    private DaftarTransferMenuActivity a;
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
    private View f13o;
    private View p;
    private View q;
    private View r;
    private View s;
    private View t;
    private View v;

    public DaftarTransferMenuActivity_ViewBinding(final DaftarTransferMenuActivity daftarTransferMenuActivity, View view) {
        this.a = daftarTransferMenuActivity;
        daftarTransferMenuActivity.drawerLayout = (getResources) Utils.findRequiredViewAsType(view, 2131296893, "field 'drawerLayout'", getResources.class);
        daftarTransferMenuActivity.navView = (HapusTransaksiBerkalaDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298078, "field 'navView'", HapusTransaksiBerkalaDialog_ViewBinding.class);
        daftarTransferMenuActivity.tvUserName = (TextView) Utils.findRequiredViewAsType(view, 2131299730, "field 'tvUserName'", TextView.class);
        daftarTransferMenuActivity.ivUserPhoto = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297422, "field 'ivUserPhoto'", Page6CSFragment.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297802, "field 'navRingkasan' and method 'openRingkasanActivity'");
        daftarTransferMenuActivity.navRingkasan = (LinearLayout) Utils.castView(findRequiredView, 2131297802, "field 'navRingkasan'", LinearLayout.class);
        this.k = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.openRingkasanActivity(view2);
            }
        });
        daftarTransferMenuActivity.dvdRingkasan = Utils.findRequiredView(view, 2131296904, "field 'dvdRingkasan'");
        daftarTransferMenuActivity.navSubPengaturan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297800, "field 'navSubPengaturan'", LinearLayout.class);
        daftarTransferMenuActivity.navSubHelloBCA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297794, "field 'navSubHelloBCA'", LinearLayout.class);
        daftarTransferMenuActivity.navFingerprint = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297792, "field 'navFingerprint'", LinearLayout.class);
        daftarTransferMenuActivity.dvdFingerprint = Utils.findRequiredView(view, 2131296897, "field 'dvdFingerprint'");
        View findRequiredView2 = Utils.findRequiredView(view, 2131297795, "field 'navHapusDaftarTransfer' and method 'chooseHapusDaftarTransfer'");
        daftarTransferMenuActivity.navHapusDaftarTransfer = (LinearLayout) Utils.castView(findRequiredView2, 2131297795, "field 'navHapusDaftarTransfer'", LinearLayout.class);
        this.j = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.chooseHapusDaftarTransfer(view2);
            }
        });
        daftarTransferMenuActivity.dvdHapusDaftarTransfer = Utils.findRequiredView(view, 2131296899, "field 'dvdHapusDaftarTransfer'");
        View findRequiredView3 = Utils.findRequiredView(view, 2131297796, "field 'navHapusTransaksiBerkala' and method 'chooseHapusTransaksiBerkala'");
        daftarTransferMenuActivity.navHapusTransaksiBerkala = (LinearLayout) Utils.castView(findRequiredView3, 2131297796, "field 'navHapusTransaksiBerkala'", LinearLayout.class);
        this.m = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.chooseHapusTransaksiBerkala(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297799, "field 'navPengaturan' and method 'showSubPengaturan'");
        daftarTransferMenuActivity.navPengaturan = (LinearLayout) Utils.castView(findRequiredView4, 2131297799, "field 'navPengaturan'", LinearLayout.class);
        this.n = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.showSubPengaturan(view2);
            }
        });
        daftarTransferMenuActivity.dvdPengaturan = Utils.findRequiredView(view, 2131296903, "field 'dvdPengaturan'");
        daftarTransferMenuActivity.swFingerprint = (setSelected) Utils.findRequiredViewAsType(view, 2131298421, "field 'swFingerprint'", setSelected.class);
        daftarTransferMenuActivity.ivArrowPengaturan = (ImageView) Utils.findRequiredViewAsType(view, 2131297310, "field 'ivArrowPengaturan'", ImageView.class);
        daftarTransferMenuActivity.ivArrowHubungi = (ImageView) Utils.findRequiredViewAsType(view, 2131297307, "field 'ivArrowHubungi'", ImageView.class);
        daftarTransferMenuActivity.tvVersi = (TextView) Utils.findRequiredViewAsType(view, 2131299735, "field 'tvVersi'", TextView.class);
        daftarTransferMenuActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        daftarTransferMenuActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        daftarTransferMenuActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        daftarTransferMenuActivity.ivVerified = (ImageView) Utils.findRequiredViewAsType(view, 2131297423, "field 'ivVerified'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296853, "method 'onClickSetun'");
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.onClickSetun(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297884, "method 'onClickSetun'");
        this.t = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.17
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.onClickSetun(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296840, "method 'onClickKirimanUang'");
        this.c = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.onClickKirimanUang(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297725, "method 'onClickKirimanUang'");
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.onClickKirimanUang(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131296830, "method 'onClickBankTransfer'");
        this.b = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.onClickBankTransfer(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297538, "method 'onClickBankTransfer'");
        this.f = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.onClickBankTransfer(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297266, "method 'clickProfileVerify'");
        this.d = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.clickProfileVerify();
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131299539, "method 'chooseProfile'");
        this.v = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.chooseProfile(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297797, "method 'chooseHome'");
        this.f13o = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.chooseHome(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297793, "method 'showSubHalloBCA'");
        this.h = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.showSubHalloBCA(view2);
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131297803, "method 'chooseSyaratKetentuan'");
        this.s = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.chooseSyaratKetentuan(view2);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131297804, "method 'clikedTeleponHalloBCA'");
        this.r = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.clikedTeleponHalloBCA(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131297805, "method 'clikedTwitterHalloBCA'");
        this.p = findRequiredView17;
        findRequiredView17.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.clikedTwitterHalloBCA(view2);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297791, "method 'clikedEmailHalloBCA'");
        this.g = findRequiredView18;
        findRequiredView18.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.clikedEmailHalloBCA(view2);
            }
        });
        View findRequiredView19 = Utils.findRequiredView(view, 2131297798, "method 'clickedKeluar'");
        this.l = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.clickedKeluar(view2);
            }
        });
        View findRequiredView20 = Utils.findRequiredView(view, 2131299258, "method 'clickedTvFinger'");
        this.q = findRequiredView20;
        findRequiredView20.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DaftarTransferMenuActivity_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                daftarTransferMenuActivity.clickedTvFinger(view2);
            }
        });
        Context context = view.getContext();
        Resources resources = context.getResources();
        daftarTransferMenuActivity.btnBurger = copyWindowDataInto.b(context, 2131231312);
        daftarTransferMenuActivity.menuIndicator = copyWindowDataInto.b(context, 2131231154);
        daftarTransferMenuActivity.toolbarTitle = resources.getString(2131822321);
        daftarTransferMenuActivity.retry = resources.getString(2131822092);
        daftarTransferMenuActivity.verifMessage = resources.getString(2131822339);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DaftarTransferMenuActivity daftarTransferMenuActivity = this.a;
        if (daftarTransferMenuActivity != null) {
            this.a = null;
            daftarTransferMenuActivity.drawerLayout = null;
            daftarTransferMenuActivity.navView = null;
            daftarTransferMenuActivity.tvUserName = null;
            daftarTransferMenuActivity.ivUserPhoto = null;
            daftarTransferMenuActivity.navRingkasan = null;
            daftarTransferMenuActivity.dvdRingkasan = null;
            daftarTransferMenuActivity.navSubPengaturan = null;
            daftarTransferMenuActivity.navSubHelloBCA = null;
            daftarTransferMenuActivity.navFingerprint = null;
            daftarTransferMenuActivity.dvdFingerprint = null;
            daftarTransferMenuActivity.navHapusDaftarTransfer = null;
            daftarTransferMenuActivity.dvdHapusDaftarTransfer = null;
            daftarTransferMenuActivity.navHapusTransaksiBerkala = null;
            daftarTransferMenuActivity.navPengaturan = null;
            daftarTransferMenuActivity.dvdPengaturan = null;
            daftarTransferMenuActivity.swFingerprint = null;
            daftarTransferMenuActivity.ivArrowPengaturan = null;
            daftarTransferMenuActivity.ivArrowHubungi = null;
            daftarTransferMenuActivity.tvVersi = null;
            daftarTransferMenuActivity.toolbar = null;
            daftarTransferMenuActivity.txtToolbarTitle = null;
            daftarTransferMenuActivity.lnMain = null;
            daftarTransferMenuActivity.ivVerified = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.t.setOnClickListener(null);
            this.t = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.v.setOnClickListener(null);
            this.v = null;
            this.f13o.setOnClickListener(null);
            this.f13o = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.s.setOnClickListener(null);
            this.s = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.q.setOnClickListener(null);
            this.q = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
