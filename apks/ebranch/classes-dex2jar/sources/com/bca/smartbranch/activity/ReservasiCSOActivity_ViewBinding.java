package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiCSOActivity_ViewBinding.class */
public class ReservasiCSOActivity_ViewBinding implements Unbinder {
    private ReservasiCSOActivity a;
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
    private View f23o;
    private View p;
    private View q;
    private View r;
    private View t;

    public ReservasiCSOActivity_ViewBinding(final ReservasiCSOActivity reservasiCSOActivity, View view) {
        this.a = reservasiCSOActivity;
        reservasiCSOActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        reservasiCSOActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        reservasiCSOActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        reservasiCSOActivity.llPembukaanRekening = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297846, "field 'llPembukaanRekening'", LinearLayout.class);
        reservasiCSOActivity.viewPembukaanRekening = Utils.findRequiredView(view, 2131299769, "field 'viewPembukaanRekening'");
        reservasiCSOActivity.llPengajuanKartuKredit = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297851, "field 'llPengajuanKartuKredit'", LinearLayout.class);
        reservasiCSOActivity.viewPengajuanKartuKredit = Utils.findRequiredView(view, 2131299771, "field 'viewPengajuanKartuKredit'");
        reservasiCSOActivity.llInternetBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternetBanking'", LinearLayout.class);
        reservasiCSOActivity.viewInternetBanking = Utils.findRequiredView(view, 2131299761, "field 'viewInternetBanking'");
        reservasiCSOActivity.llPenggantianKeyBca = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297853, "field 'llPenggantianKeyBca'", LinearLayout.class);
        reservasiCSOActivity.viewPenggantianKeyBca = Utils.findRequiredView(view, 2131299773, "field 'viewPenggantianKeyBca'");
        reservasiCSOActivity.llDeposito = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297614, "field 'llDeposito'", LinearLayout.class);
        reservasiCSOActivity.viewDeposito = Utils.findRequiredView(view, 2131299758, "field 'viewDeposito'");
        reservasiCSOActivity.llLayananGiro = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297759, "field 'llLayananGiro'", LinearLayout.class);
        reservasiCSOActivity.viewLayananGiro = Utils.findRequiredView(view, 2131299764, "field 'viewLayananGiro'");
        reservasiCSOActivity.llPembukaanBlokir = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297845, "field 'llPembukaanBlokir'", LinearLayout.class);
        reservasiCSOActivity.viewPembukaanBlokir = Utils.findRequiredView(view, 2131299768, "field 'viewPembukaanBlokir'");
        reservasiCSOActivity.llPengajuanSuratReferensi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297852, "field 'llPengajuanSuratReferensi'", LinearLayout.class);
        reservasiCSOActivity.viewPengajuanSuratReferensi = Utils.findRequiredView(view, 2131299772, "field 'viewPengajuanSuratReferensi'");
        reservasiCSOActivity.tvEstimasiPemrek = (TextView) Utils.findRequiredViewAsType(view, 2131299246, "field 'tvEstimasiPemrek'", TextView.class);
        reservasiCSOActivity.tvEstimasiCC = (TextView) Utils.findRequiredViewAsType(view, 2131299237, "field 'tvEstimasiCC'", TextView.class);
        reservasiCSOActivity.tvEstimasiEChannel = (TextView) Utils.findRequiredViewAsType(view, 2131299239, "field 'tvEstimasiEChannel'", TextView.class);
        reservasiCSOActivity.tvEstimasiPenggantianKeyBCA = (TextView) Utils.findRequiredViewAsType(view, 2131299248, "field 'tvEstimasiPenggantianKeyBCA'", TextView.class);
        reservasiCSOActivity.tvEstimasiDeposito = (TextView) Utils.findRequiredViewAsType(view, 2131299238, "field 'tvEstimasiDeposito'", TextView.class);
        reservasiCSOActivity.tvEstimasiGiro = (TextView) Utils.findRequiredViewAsType(view, 2131299240, "field 'tvEstimasiGiro'", TextView.class);
        reservasiCSOActivity.tvEstimasiPembukaanBlokir = (TextView) Utils.findRequiredViewAsType(view, 2131299244, "field 'tvEstimasiPembukaanBlokir'", TextView.class);
        reservasiCSOActivity.tvEstimasiSuratReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299247, "field 'tvEstimasiSuratReferensi'", TextView.class);
        reservasiCSOActivity.tvJumlahPemrek = (TextView) Utils.findRequiredViewAsType(view, 2131299330, "field 'tvJumlahPemrek'", TextView.class);
        reservasiCSOActivity.tvJumlahCC = (TextView) Utils.findRequiredViewAsType(view, 2131299320, "field 'tvJumlahCC'", TextView.class);
        reservasiCSOActivity.tvJumlahEChannel = (TextView) Utils.findRequiredViewAsType(view, 2131299322, "field 'tvJumlahEChannel'", TextView.class);
        reservasiCSOActivity.tvJumlahPenggantianKeyBCA = (TextView) Utils.findRequiredViewAsType(view, 2131299332, "field 'tvJumlahPenggantianKeyBCA'", TextView.class);
        reservasiCSOActivity.tvJumlahDeposito = (TextView) Utils.findRequiredViewAsType(view, 2131299321, "field 'tvJumlahDeposito'", TextView.class);
        reservasiCSOActivity.tvJumlahGiro = (TextView) Utils.findRequiredViewAsType(view, 2131299323, "field 'tvJumlahGiro'", TextView.class);
        reservasiCSOActivity.tvJumlahPembukaanBlokir = (TextView) Utils.findRequiredViewAsType(view, 2131299328, "field 'tvJumlahPembukaanBlokir'", TextView.class);
        reservasiCSOActivity.tvJumlahSuratReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299331, "field 'tvJumlahSuratReferensi'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296409, "field 'btnMinusPemrek' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusPemrek = (ImageButton) Utils.castView(findRequiredView, 2131296409, "field 'btnMinusPemrek'", ImageButton.class);
        this.g = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296400, "field 'btnMinusCC' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusCC = (ImageButton) Utils.castView(findRequiredView2, 2131296400, "field 'btnMinusCC'", ImageButton.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296402, "field 'btnMinusEChannel' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusEChannel = (ImageButton) Utils.castView(findRequiredView3, 2131296402, "field 'btnMinusEChannel'", ImageButton.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296411, "field 'btnMinusPenggantianKeyBCA' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusPenggantianKeyBCA = (ImageButton) Utils.castView(findRequiredView4, 2131296411, "field 'btnMinusPenggantianKeyBCA'", ImageButton.class);
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296401, "field 'btnMinusDeposito' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusDeposito = (ImageButton) Utils.castView(findRequiredView5, 2131296401, "field 'btnMinusDeposito'", ImageButton.class);
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296403, "field 'btnMinusGiro' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusGiro = (ImageButton) Utils.castView(findRequiredView6, 2131296403, "field 'btnMinusGiro'", ImageButton.class);
        this.e = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296407, "field 'btnMinusPembukaanBlokir' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusPembukaanBlokir = (ImageButton) Utils.castView(findRequiredView7, 2131296407, "field 'btnMinusPembukaanBlokir'", ImageButton.class);
        this.h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131296410, "field 'btnMinusSuratReferensi' and method 'onClickMinus'");
        reservasiCSOActivity.btnMinusSuratReferensi = (ImageButton) Utils.castView(findRequiredView8, 2131296410, "field 'btnMinusSuratReferensi'", ImageButton.class);
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickMinus(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131296432, "field 'btnPlusPemrek' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusPemrek = (ImageButton) Utils.castView(findRequiredView9, 2131296432, "field 'btnPlusPemrek'", ImageButton.class);
        this.n = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131296423, "field 'btnPlusCC' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusCC = (ImageButton) Utils.castView(findRequiredView10, 2131296423, "field 'btnPlusCC'", ImageButton.class);
        this.j = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131296425, "field 'btnPlusEChannel' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusEChannel = (ImageButton) Utils.castView(findRequiredView11, 2131296425, "field 'btnPlusEChannel'", ImageButton.class);
        this.l = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131296434, "field 'btnPlusPenggantianKeyBCA' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusPenggantianKeyBCA = (ImageButton) Utils.castView(findRequiredView12, 2131296434, "field 'btnPlusPenggantianKeyBCA'", ImageButton.class);
        this.t = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131296424, "field 'btnPlusDeposito' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusDeposito = (ImageButton) Utils.castView(findRequiredView13, 2131296424, "field 'btnPlusDeposito'", ImageButton.class);
        this.f23o = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131296426, "field 'btnPlusGiro' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusGiro = (ImageButton) Utils.castView(findRequiredView14, 2131296426, "field 'btnPlusGiro'", ImageButton.class);
        this.k = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131296430, "field 'btnPlusPembukaanBlokir' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusPembukaanBlokir = (ImageButton) Utils.castView(findRequiredView15, 2131296430, "field 'btnPlusPembukaanBlokir'", ImageButton.class);
        this.m = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131296433, "field 'btnPlusSuratReferensi' and method 'onClickPlus'");
        reservasiCSOActivity.btnPlusSuratReferensi = (ImageButton) Utils.castView(findRequiredView16, 2131296433, "field 'btnPlusSuratReferensi'", ImageButton.class);
        this.q = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onClickPlus(view2);
            }
        });
        reservasiCSOActivity.tvTotalTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299686, "field 'tvTotalTransaksi'", TextView.class);
        reservasiCSOActivity.tvTotalEstimasiTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299680, "field 'tvTotalEstimasiTransaksi'", TextView.class);
        reservasiCSOActivity.tvErrorMessageTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299226, "field 'tvErrorMessageTransaksi'", TextView.class);
        View findRequiredView17 = Utils.findRequiredView(view, 2131296446, "method 'onRetry'");
        this.p = findRequiredView17;
        findRequiredView17.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onRetry(view2);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131296452, "method 'onSubmit'");
        this.r = findRequiredView18;
        findRequiredView18.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiCSOActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiCSOActivity.onSubmit(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiCSOActivity reservasiCSOActivity = this.a;
        if (reservasiCSOActivity != null) {
            this.a = null;
            reservasiCSOActivity.toolbar = null;
            reservasiCSOActivity.tvToolbar = null;
            reservasiCSOActivity.tvErrorMessage = null;
            reservasiCSOActivity.llPembukaanRekening = null;
            reservasiCSOActivity.viewPembukaanRekening = null;
            reservasiCSOActivity.llPengajuanKartuKredit = null;
            reservasiCSOActivity.viewPengajuanKartuKredit = null;
            reservasiCSOActivity.llInternetBanking = null;
            reservasiCSOActivity.viewInternetBanking = null;
            reservasiCSOActivity.llPenggantianKeyBca = null;
            reservasiCSOActivity.viewPenggantianKeyBca = null;
            reservasiCSOActivity.llDeposito = null;
            reservasiCSOActivity.viewDeposito = null;
            reservasiCSOActivity.llLayananGiro = null;
            reservasiCSOActivity.viewLayananGiro = null;
            reservasiCSOActivity.llPembukaanBlokir = null;
            reservasiCSOActivity.viewPembukaanBlokir = null;
            reservasiCSOActivity.llPengajuanSuratReferensi = null;
            reservasiCSOActivity.viewPengajuanSuratReferensi = null;
            reservasiCSOActivity.tvEstimasiPemrek = null;
            reservasiCSOActivity.tvEstimasiCC = null;
            reservasiCSOActivity.tvEstimasiEChannel = null;
            reservasiCSOActivity.tvEstimasiPenggantianKeyBCA = null;
            reservasiCSOActivity.tvEstimasiDeposito = null;
            reservasiCSOActivity.tvEstimasiGiro = null;
            reservasiCSOActivity.tvEstimasiPembukaanBlokir = null;
            reservasiCSOActivity.tvEstimasiSuratReferensi = null;
            reservasiCSOActivity.tvJumlahPemrek = null;
            reservasiCSOActivity.tvJumlahCC = null;
            reservasiCSOActivity.tvJumlahEChannel = null;
            reservasiCSOActivity.tvJumlahPenggantianKeyBCA = null;
            reservasiCSOActivity.tvJumlahDeposito = null;
            reservasiCSOActivity.tvJumlahGiro = null;
            reservasiCSOActivity.tvJumlahPembukaanBlokir = null;
            reservasiCSOActivity.tvJumlahSuratReferensi = null;
            reservasiCSOActivity.btnMinusPemrek = null;
            reservasiCSOActivity.btnMinusCC = null;
            reservasiCSOActivity.btnMinusEChannel = null;
            reservasiCSOActivity.btnMinusPenggantianKeyBCA = null;
            reservasiCSOActivity.btnMinusDeposito = null;
            reservasiCSOActivity.btnMinusGiro = null;
            reservasiCSOActivity.btnMinusPembukaanBlokir = null;
            reservasiCSOActivity.btnMinusSuratReferensi = null;
            reservasiCSOActivity.btnPlusPemrek = null;
            reservasiCSOActivity.btnPlusCC = null;
            reservasiCSOActivity.btnPlusEChannel = null;
            reservasiCSOActivity.btnPlusPenggantianKeyBCA = null;
            reservasiCSOActivity.btnPlusDeposito = null;
            reservasiCSOActivity.btnPlusGiro = null;
            reservasiCSOActivity.btnPlusPembukaanBlokir = null;
            reservasiCSOActivity.btnPlusSuratReferensi = null;
            reservasiCSOActivity.tvTotalTransaksi = null;
            reservasiCSOActivity.tvTotalEstimasiTransaksi = null;
            reservasiCSOActivity.tvErrorMessageTransaksi = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.t.setOnClickListener(null);
            this.t = null;
            this.f23o.setOnClickListener(null);
            this.f23o = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.q.setOnClickListener(null);
            this.q = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.r.setOnClickListener(null);
            this.r = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
