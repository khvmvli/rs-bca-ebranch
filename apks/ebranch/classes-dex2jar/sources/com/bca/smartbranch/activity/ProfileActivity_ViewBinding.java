package com.bca.smartbranch.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
import o.copyWindowDataInto;
import o.getResources;
import o.setCurrencyName;
import o.setInputType;
import o.setSelected;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ProfileActivity_ViewBinding.class */
public class ProfileActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private ProfileActivity c;
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
    private View f20o;
    private View q;
    private View r;
    private View t;

    public ProfileActivity_ViewBinding(final ProfileActivity profileActivity, View view) {
        this.c = profileActivity;
        profileActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        profileActivity.drawerLayout = (getResources) Utils.findRequiredViewAsType(view, 2131296893, "field 'drawerLayout'", getResources.class);
        profileActivity.navView = (HapusTransaksiBerkalaDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298078, "field 'navView'", HapusTransaksiBerkalaDialog_ViewBinding.class);
        profileActivity.tvUserName = (TextView) Utils.findRequiredViewAsType(view, 2131299730, "field 'tvUserName'", TextView.class);
        profileActivity.tvMembership = (TextView) Utils.findRequiredViewAsType(view, 2131299405, "field 'tvMembership'", TextView.class);
        profileActivity.ivUserPhoto = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297422, "field 'ivUserPhoto'", Page6CSFragment.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297802, "field 'navRingkasan' and method 'openRingkasanActivity'");
        profileActivity.navRingkasan = (LinearLayout) Utils.castView(findRequiredView, 2131297802, "field 'navRingkasan'", LinearLayout.class);
        this.k = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.openRingkasanActivity(view2);
            }
        });
        profileActivity.dvdRingkasan = Utils.findRequiredView(view, 2131296904, "field 'dvdRingkasan'");
        profileActivity.navSubPengaturan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297800, "field 'navSubPengaturan'", LinearLayout.class);
        profileActivity.navSubHelloBCA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297794, "field 'navSubHelloBCA'", LinearLayout.class);
        profileActivity.navFingerprint = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297792, "field 'navFingerprint'", LinearLayout.class);
        profileActivity.dvdFingerprint = Utils.findRequiredView(view, 2131296897, "field 'dvdFingerprint'");
        View findRequiredView2 = Utils.findRequiredView(view, 2131297795, "field 'navHapusDaftarTransfer' and method 'chooseHapusDaftarTransfer'");
        profileActivity.navHapusDaftarTransfer = (LinearLayout) Utils.castView(findRequiredView2, 2131297795, "field 'navHapusDaftarTransfer'", LinearLayout.class);
        this.j = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.chooseHapusDaftarTransfer(view2);
            }
        });
        profileActivity.dvdHapusDaftarTransfer = Utils.findRequiredView(view, 2131296899, "field 'dvdHapusDaftarTransfer'");
        View findRequiredView3 = Utils.findRequiredView(view, 2131297796, "field 'navHapusTransaksiBerkala' and method 'chooseHapusTransaksiBerkala'");
        profileActivity.navHapusTransaksiBerkala = (LinearLayout) Utils.castView(findRequiredView3, 2131297796, "field 'navHapusTransaksiBerkala'", LinearLayout.class);
        this.f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.chooseHapusTransaksiBerkala(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297799, "field 'navPengaturan' and method 'showSubPengaturan'");
        profileActivity.navPengaturan = (LinearLayout) Utils.castView(findRequiredView4, 2131297799, "field 'navPengaturan'", LinearLayout.class);
        this.l = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.showSubPengaturan(view2);
            }
        });
        profileActivity.dvdPengaturan = Utils.findRequiredView(view, 2131296903, "field 'dvdPengaturan'");
        profileActivity.tvVersi = (TextView) Utils.findRequiredViewAsType(view, 2131299735, "field 'tvVersi'", TextView.class);
        profileActivity.swFingerprint = (setSelected) Utils.findRequiredViewAsType(view, 2131298421, "field 'swFingerprint'", setSelected.class);
        profileActivity.ivArrowPengaturan = (ImageView) Utils.findRequiredViewAsType(view, 2131297310, "field 'ivArrowPengaturan'", ImageView.class);
        profileActivity.ivArrowHubungi = (ImageView) Utils.findRequiredViewAsType(view, 2131297307, "field 'ivArrowHubungi'", ImageView.class);
        profileActivity.clMain = (CoordinatorLayout) Utils.findRequiredViewAsType(view, 2131296799, "field 'clMain'", CoordinatorLayout.class);
        profileActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvTitle'", TextView.class);
        profileActivity.ivFotoDiri = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297366, "field 'ivFotoDiri'", Page6CSFragment.class);
        profileActivity.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        profileActivity.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        profileActivity.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298676, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        profileActivity.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        profileActivity.tilNomorId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298672, "field 'tilNomorId'", LogoutDialog_ViewBinding.class);
        profileActivity.etEmail = (EditText) Utils.findRequiredViewAsType(view, 2131296976, "field 'etEmail'", EditText.class);
        profileActivity.etNoHP = (EditText) Utils.findRequiredViewAsType(view, 2131297094, "field 'etNoHP'", EditText.class);
        profileActivity.etNorek = (EditText) Utils.findRequiredViewAsType(view, 2131297131, "field 'etNorek'", EditText.class);
        profileActivity.etJenisId = (EditText) Utils.findRequiredViewAsType(view, 2131296993, "field 'etJenisId'", EditText.class);
        profileActivity.etNomorId = (EditText) Utils.findRequiredViewAsType(view, 2131297126, "field 'etNomorId'", EditText.class);
        profileActivity.tvName = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvName'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297927, "field 'llPin' and method 'goChangePIN'");
        profileActivity.llPin = (LinearLayout) Utils.castView(findRequiredView5, 2131297927, "field 'llPin'", LinearLayout.class);
        this.t = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.goChangePIN(view2);
            }
        });
        profileActivity.lnActivityMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296324, "field 'lnActivityMain'", LinearLayout.class);
        profileActivity.ivVerified = (ImageView) Utils.findRequiredViewAsType(view, 2131297423, "field 'ivVerified'", ImageView.class);
        profileActivity.ivProfileVerified = (ImageView) Utils.findRequiredViewAsType(view, 2131297407, "field 'ivProfileVerified'", ImageView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131296387, "method 'fillNoHp'");
        this.b = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.fillNoHp(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297648, "method 'goDeleteAccount'");
        this.e = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.goDeleteAccount(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297421, "method 'ubahProfil'");
        this.a = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.ubahProfil(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297267, "method 'clickProfileVerify'");
        this.d = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.clickProfileVerify();
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131299539, "method 'chooseProfile'");
        this.r = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.chooseProfile(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297797, "method 'chooseHome'");
        this.h = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.chooseHome(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297793, "method 'showSubHalloBCA'");
        this.g = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.showSubHalloBCA(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297803, "method 'chooseSyaratKetentuan'");
        this.n = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.chooseSyaratKetentuan(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297804, "method 'clikedTeleponHalloBCA'");
        this.f20o = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.clikedTeleponHalloBCA(view2);
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131297805, "method 'clikedTwitterHalloBCA'");
        this.q = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.clikedTwitterHalloBCA(view2);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131297791, "method 'clikedEmailHalloBCA'");
        this.i = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.clikedEmailHalloBCA(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131297798, "method 'clickedKeluar'");
        this.m = findRequiredView17;
        findRequiredView17.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                profileActivity.clickedKeluar(view2);
            }
        });
        Context context = view.getContext();
        Resources resources = context.getResources();
        profileActivity.btnBurger = copyWindowDataInto.b(context, 2131231312);
        profileActivity.menuIndicator = copyWindowDataInto.b(context, 2131231154);
        profileActivity.retry = resources.getString(2131822092);
        profileActivity.txtTitle = resources.getString(2131822256);
        profileActivity.invalidHandphoneMessage = resources.getString(2131820903);
        profileActivity.verifMessage = resources.getString(2131822339);
        profileActivity.nomorKtp = resources.getString(2131821553);
        profileActivity.nomorPaspor = resources.getString(2131821556);
        profileActivity.labelRekening = resources.getString(2131822074);
        profileActivity.labelKtp = resources.getString(2131821815);
        profileActivity.labelPaspor = resources.getString(2131821986);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ProfileActivity profileActivity = this.c;
        if (profileActivity != null) {
            this.c = null;
            profileActivity.toolbar = null;
            profileActivity.drawerLayout = null;
            profileActivity.navView = null;
            profileActivity.tvUserName = null;
            profileActivity.tvMembership = null;
            profileActivity.ivUserPhoto = null;
            profileActivity.navRingkasan = null;
            profileActivity.dvdRingkasan = null;
            profileActivity.navSubPengaturan = null;
            profileActivity.navSubHelloBCA = null;
            profileActivity.navFingerprint = null;
            profileActivity.dvdFingerprint = null;
            profileActivity.navHapusDaftarTransfer = null;
            profileActivity.dvdHapusDaftarTransfer = null;
            profileActivity.navHapusTransaksiBerkala = null;
            profileActivity.navPengaturan = null;
            profileActivity.dvdPengaturan = null;
            profileActivity.tvVersi = null;
            profileActivity.swFingerprint = null;
            profileActivity.ivArrowPengaturan = null;
            profileActivity.ivArrowHubungi = null;
            profileActivity.clMain = null;
            profileActivity.tvTitle = null;
            profileActivity.ivFotoDiri = null;
            profileActivity.tilEmail = null;
            profileActivity.tilNoHp = null;
            profileActivity.tilNorek = null;
            profileActivity.tilJenisId = null;
            profileActivity.tilNomorId = null;
            profileActivity.etEmail = null;
            profileActivity.etNoHP = null;
            profileActivity.etNorek = null;
            profileActivity.etJenisId = null;
            profileActivity.etNomorId = null;
            profileActivity.tvName = null;
            profileActivity.llPin = null;
            profileActivity.lnActivityMain = null;
            profileActivity.ivVerified = null;
            profileActivity.ivProfileVerified = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.t.setOnClickListener(null);
            this.t = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.f20o.setOnClickListener(null);
            this.f20o = null;
            this.q.setOnClickListener(null);
            this.q = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.m.setOnClickListener(null);
            this.m = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
