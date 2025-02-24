package com.bca.smartbranch.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.KetentuanORDialog_ViewBinding;
import o.Page6CSFragment;
import o.copyWindowDataInto;
import o.getResources;
import o.setCurrencyName;
import o.setInputType;
import o.setSelected;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TransactionActivity_ViewBinding.class */
public class TransactionActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private TransactionActivity e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;

    /* renamed from: o  reason: collision with root package name */
    private View f26o;

    public TransactionActivity_ViewBinding(final TransactionActivity transactionActivity, View view) {
        this.e = transactionActivity;
        transactionActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        transactionActivity.drawerLayout = (getResources) Utils.findRequiredViewAsType(view, 2131296893, "field 'drawerLayout'", getResources.class);
        transactionActivity.navView = (HapusTransaksiBerkalaDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298078, "field 'navView'", HapusTransaksiBerkalaDialog_ViewBinding.class);
        transactionActivity.tvUserName = (TextView) Utils.findRequiredViewAsType(view, 2131299730, "field 'tvUserName'", TextView.class);
        transactionActivity.ivUserPhoto = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297422, "field 'ivUserPhoto'", Page6CSFragment.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297802, "field 'navRingkasan' and method 'openRingkasanActivity'");
        transactionActivity.navRingkasan = (LinearLayout) Utils.castView(findRequiredView, 2131297802, "field 'navRingkasan'", LinearLayout.class);
        this.f = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.openRingkasanActivity(view2);
            }
        });
        transactionActivity.dvdRingkasan = Utils.findRequiredView(view, 2131296904, "field 'dvdRingkasan'");
        transactionActivity.navSubPengaturan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297800, "field 'navSubPengaturan'", LinearLayout.class);
        transactionActivity.navSubHelloBCA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297794, "field 'navSubHelloBCA'", LinearLayout.class);
        transactionActivity.navFingerprint = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297792, "field 'navFingerprint'", LinearLayout.class);
        transactionActivity.dvdFingerprint = Utils.findRequiredView(view, 2131296897, "field 'dvdFingerprint'");
        View findRequiredView2 = Utils.findRequiredView(view, 2131297795, "field 'navHapusDaftarTransfer' and method 'chooseHapusDaftarTransfer'");
        transactionActivity.navHapusDaftarTransfer = (LinearLayout) Utils.castView(findRequiredView2, 2131297795, "field 'navHapusDaftarTransfer'", LinearLayout.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.chooseHapusDaftarTransfer(view2);
            }
        });
        transactionActivity.dvdHapusDaftarTransfer = Utils.findRequiredView(view, 2131296899, "field 'dvdHapusDaftarTransfer'");
        View findRequiredView3 = Utils.findRequiredView(view, 2131297796, "field 'navHapusTransaksiBerkala' and method 'chooseHapusTransaksiBerkala'");
        transactionActivity.navHapusTransaksiBerkala = (LinearLayout) Utils.castView(findRequiredView3, 2131297796, "field 'navHapusTransaksiBerkala'", LinearLayout.class);
        this.j = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.chooseHapusTransaksiBerkala(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297799, "field 'navPengaturan' and method 'showSubPengaturan'");
        transactionActivity.navPengaturan = (LinearLayout) Utils.castView(findRequiredView4, 2131297799, "field 'navPengaturan'", LinearLayout.class);
        this.h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.showSubPengaturan(view2);
            }
        });
        transactionActivity.dvdPengaturan = Utils.findRequiredView(view, 2131296903, "field 'dvdPengaturan'");
        transactionActivity.swFingerprint = (setSelected) Utils.findRequiredViewAsType(view, 2131298421, "field 'swFingerprint'", setSelected.class);
        transactionActivity.ivArrowPengaturan = (ImageView) Utils.findRequiredViewAsType(view, 2131297310, "field 'ivArrowPengaturan'", ImageView.class);
        transactionActivity.ivArrowHubungi = (ImageView) Utils.findRequiredViewAsType(view, 2131297307, "field 'ivArrowHubungi'", ImageView.class);
        transactionActivity.clMain = (CoordinatorLayout) Utils.findRequiredViewAsType(view, 2131296799, "field 'clMain'", CoordinatorLayout.class);
        transactionActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        transactionActivity.tabRingkasan = (KetentuanORDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298425, "field 'tabRingkasan'", KetentuanORDialog_ViewBinding.class);
        transactionActivity.tvCount = (TextView) Utils.findRequiredViewAsType(view, 2131298884, "field 'tvCount'", TextView.class);
        transactionActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        transactionActivity.tvVersi = (TextView) Utils.findRequiredViewAsType(view, 2131299735, "field 'tvVersi'", TextView.class);
        transactionActivity.ivVerified = (ImageView) Utils.findRequiredViewAsType(view, 2131297423, "field 'ivVerified'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131299539, "method 'chooseProfile'");
        this.l = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.chooseProfile(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297797, "method 'chooseHome'");
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.chooseHome(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297793, "method 'showSubHalloBCA'");
        this.c = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.showSubHalloBCA(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297803, "method 'chooseSyaratKetentuan'");
        this.f26o = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.chooseSyaratKetentuan(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297804, "method 'clikedTeleponHalloBCA'");
        this.m = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.clikedTeleponHalloBCA(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297805, "method 'clikedTwitterHalloBCA'");
        this.k = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.clikedTwitterHalloBCA(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297791, "method 'clikedEmailHalloBCA'");
        this.b = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.clikedEmailHalloBCA(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297798, "method 'clickedKeluar'");
        this.g = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.clickedKeluar(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297266, "method 'clickProfileVerify'");
        this.a = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                transactionActivity.clickProfileVerify();
            }
        });
        Context context = view.getContext();
        Resources resources = context.getResources();
        transactionActivity.btnBurger = copyWindowDataInto.b(context, 2131231312);
        transactionActivity.menuIndicator = copyWindowDataInto.b(context, 2131231154);
        transactionActivity.retry = resources.getString(2131822092);
        transactionActivity.txtTitle = resources.getString(2131822256);
        transactionActivity.toolbarTitle = resources.getString(2131822262);
        transactionActivity.verifMessage = resources.getString(2131822339);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TransactionActivity transactionActivity = this.e;
        if (transactionActivity != null) {
            this.e = null;
            transactionActivity.toolbar = null;
            transactionActivity.drawerLayout = null;
            transactionActivity.navView = null;
            transactionActivity.tvUserName = null;
            transactionActivity.ivUserPhoto = null;
            transactionActivity.navRingkasan = null;
            transactionActivity.dvdRingkasan = null;
            transactionActivity.navSubPengaturan = null;
            transactionActivity.navSubHelloBCA = null;
            transactionActivity.navFingerprint = null;
            transactionActivity.dvdFingerprint = null;
            transactionActivity.navHapusDaftarTransfer = null;
            transactionActivity.dvdHapusDaftarTransfer = null;
            transactionActivity.navHapusTransaksiBerkala = null;
            transactionActivity.navPengaturan = null;
            transactionActivity.dvdPengaturan = null;
            transactionActivity.swFingerprint = null;
            transactionActivity.ivArrowPengaturan = null;
            transactionActivity.ivArrowHubungi = null;
            transactionActivity.clMain = null;
            transactionActivity.txtToolbarTitle = null;
            transactionActivity.tabRingkasan = null;
            transactionActivity.tvCount = null;
            transactionActivity.llMain = null;
            transactionActivity.tvVersi = null;
            transactionActivity.ivVerified = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f26o.setOnClickListener(null);
            this.f26o = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
