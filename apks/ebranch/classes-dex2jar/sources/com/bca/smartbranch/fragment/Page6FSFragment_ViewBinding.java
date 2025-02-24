package com.bca.smartbranch.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.copyWindowDataInto;
import o.getAnnualFeeAddOnAmount;
import o.setCurrentItem;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FSFragment_ViewBinding.class */
public class Page6FSFragment_ViewBinding implements Unbinder {
    private View a;
    private Page6FSFragment b;
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
    private View n;

    /* renamed from: o  reason: collision with root package name */
    private View f50o;

    public Page6FSFragment_ViewBinding(final Page6FSFragment page6FSFragment, View view) {
        this.b = page6FSFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297092, "field 'etNoATM' and method 'onFocusChangeDataDiri'");
        page6FSFragment.etNoATM = (setCurrentItem) Utils.castView(findRequiredView, 2131297092, "field 'etNoATM'", setCurrentItem.class);
        this.i = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FSFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296977, "field 'etEmailAddr' and method 'onFocusChangeDataDiri'");
        page6FSFragment.etEmailAddr = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView2, 2131296977, "field 'etEmailAddr'", getAnnualFeeAddOnAmount.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FSFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        page6FSFragment.etPurposePemRek = (TextView) Utils.findRequiredViewAsType(view, 2131297228, "field 'etPurposePemRek'", TextView.class);
        page6FSFragment.etLanguage = (TextView) Utils.findRequiredViewAsType(view, 2131296946, "field 'etLanguage'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296996, "field 'etTypeCard' and method 'onClickDataRekening'");
        page6FSFragment.etTypeCard = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView3, 2131296996, "field 'etTypeCard'", getAnnualFeeAddOnAmount.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.onClickDataRekening(view2);
            }
        });
        page6FSFragment.etDollarCurrCode = (TextView) Utils.findRequiredViewAsType(view, 2131297047, "field 'etDollarCurrCode'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296990, "field 'etInternetBanking' and method 'onFocusChangeDataRekening'");
        page6FSFragment.etInternetBanking = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView4, 2131296990, "field 'etInternetBanking'", getAnnualFeeAddOnAmount.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FSFragment.onFocusChangeDataRekening(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297053, "field 'etMobileBanking' and method 'onFocusChangeDataRekening'");
        page6FSFragment.etMobileBanking = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView5, 2131297053, "field 'etMobileBanking'", getAnnualFeeAddOnAmount.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FSFragment.onFocusChangeDataRekening(view2, z);
            }
        });
        page6FSFragment.cbxAgree = (CheckBox) Utils.findRequiredViewAsType(view, 2131296469, "field 'cbxAgree'", CheckBox.class);
        page6FSFragment.llDetailDataDiri = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297447, "field 'llDetailDataDiri'", LinearLayout.class);
        page6FSFragment.llDetailDataRekening = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297476, "field 'llDetailDataRekening'", LinearLayout.class);
        page6FSFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        page6FSFragment.llFasilitasBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297639, "field 'llFasilitasBanking'", LinearLayout.class);
        page6FSFragment.tilInternetBanking = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298539, "field 'tilInternetBanking'", LogoutDialog_ViewBinding.class);
        page6FSFragment.tilMobileBanking = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298600, "field 'tilMobileBanking'", LogoutDialog_ViewBinding.class);
        page6FSFragment.tilJenisKartu = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298544, "field 'tilJenisKartu'", LogoutDialog_ViewBinding.class);
        page6FSFragment.tilMataUang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298594, "field 'tilMataUang'", LogoutDialog_ViewBinding.class);
        page6FSFragment.llHeaderDataDiri = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297656, "field 'llHeaderDataDiri'", LinearLayout.class);
        page6FSFragment.llHeaderDataRekening = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297672, "field 'llHeaderDataRekening'", LinearLayout.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131299604, "field 'tvTermCondition' and method 'clickedTermsCondition'");
        page6FSFragment.tvTermCondition = (TextView) Utils.castView(findRequiredView6, 2131299604, "field 'tvTermCondition'", TextView.class);
        this.n = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.clickedTermsCondition(view2);
            }
        });
        page6FSFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        page6FSFragment.tilBahasaPetunjuk = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298496, "field 'tilBahasaPetunjuk'", LogoutDialog_ViewBinding.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'next'");
        page6FSFragment.btnProses = (Button) Utils.castView(findRequiredView7, 2131296440, "field 'btnProses'", Button.class);
        this.d = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.next(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297334, "field 'ivDataDiri' and method 'showDataDiri'");
        page6FSFragment.ivDataDiri = (ImageView) Utils.castView(findRequiredView8, 2131297334, "field 'ivDataDiri'", ImageView.class);
        this.f = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.showDataDiri(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297352, "field 'ivDataRekening' and method 'showDataRekening'");
        page6FSFragment.ivDataRekening = (ImageView) Utils.castView(findRequiredView9, 2131297352, "field 'ivDataRekening'", ImageView.class);
        this.h = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.showDataRekening(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131299705, "field 'tvUbahDataDiri' and method 'ubahDataDiri'");
        page6FSFragment.tvUbahDataDiri = (TextView) Utils.castView(findRequiredView10, 2131299705, "field 'tvUbahDataDiri'", TextView.class);
        this.l = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.ubahDataDiri(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131299721, "field 'tvUbahDataRekening' and method 'ubahDataRekening'");
        page6FSFragment.tvUbahDataRekening = (TextView) Utils.castView(findRequiredView11, 2131299721, "field 'tvUbahDataRekening'", TextView.class);
        this.f50o = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.ubahDataRekening(view2);
            }
        });
        page6FSFragment.llLayoutDataDiriUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297449, "field 'llLayoutDataDiriUneditable'", LinearLayout.class);
        page6FSFragment.llLayoutDataDiriEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297448, "field 'llLayoutDataDiriEditable'", LinearLayout.class);
        page6FSFragment.llLayoutDataRekeningUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297478, "field 'llLayoutDataRekeningUneditable'", LinearLayout.class);
        page6FSFragment.llLayoutDataRekeningEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297477, "field 'llLayoutDataRekeningEditable'", LinearLayout.class);
        page6FSFragment.llNoAtmDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297816, "field 'llNoAtmDisabled'", LinearLayout.class);
        page6FSFragment.llEmailDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297633, "field 'llEmailDisabled'", LinearLayout.class);
        page6FSFragment.tvNoAtm = (TextView) Utils.findRequiredViewAsType(view, 2131299452, "field 'tvNoAtm'", TextView.class);
        page6FSFragment.tvEmail = (TextView) Utils.findRequiredViewAsType(view, 2131298950, "field 'tvEmail'", TextView.class);
        page6FSFragment.llTujuanPemrekDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297926, "field 'llTujuanPemrekDisabled'", LinearLayout.class);
        page6FSFragment.llBahasaPetunjukDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297533, "field 'llBahasaPetunjukDisabled'", LinearLayout.class);
        page6FSFragment.llJenisKartuAtmDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297699, "field 'llJenisKartuAtmDisabled'", LinearLayout.class);
        page6FSFragment.llMataUangDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297772, "field 'llMataUangDisabled'", LinearLayout.class);
        page6FSFragment.llFasilitasKlikBcaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297640, "field 'llFasilitasKlikBcaDisabled'", LinearLayout.class);
        page6FSFragment.llFasilitasMBcaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297641, "field 'llFasilitasMBcaDisabled'", LinearLayout.class);
        page6FSFragment.tvTujuanPemrek = (TextView) Utils.findRequiredViewAsType(view, 2131299695, "field 'tvTujuanPemrek'", TextView.class);
        page6FSFragment.tvBahasaPetunjuk = (TextView) Utils.findRequiredViewAsType(view, 2131298834, "field 'tvBahasaPetunjuk'", TextView.class);
        page6FSFragment.tvJenisKartuAtm = (TextView) Utils.findRequiredViewAsType(view, 2131299303, "field 'tvJenisKartuAtm'", TextView.class);
        page6FSFragment.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        page6FSFragment.tvFasilitasKlikBca = (TextView) Utils.findRequiredViewAsType(view, 2131299255, "field 'tvFasilitasKlikBca'", TextView.class);
        page6FSFragment.tvFasilitasMBca = (TextView) Utils.findRequiredViewAsType(view, 2131299256, "field 'tvFasilitasMBca'", TextView.class);
        View findRequiredView12 = Utils.findRequiredView(view, 2131298895, "method 'showDataDiri'");
        this.j = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.showDataDiri(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131298911, "method 'showDataRekening'");
        this.k = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FSFragment.showDataRekening(view2);
            }
        });
        page6FSFragment.viewGroupDataDiri = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297092, "field 'viewGroupDataDiri'"), Utils.findRequiredView(view, 2131296977, "field 'viewGroupDataDiri'"));
        page6FSFragment.tilFormDataDiri = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298638, "field 'tilFormDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilFormDataDiri'", LogoutDialog_ViewBinding.class));
        page6FSFragment.tvErrorDataDiri = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299114, "field 'tvErrorDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrorDataDiri'", TextView.class));
        page6FSFragment.viewGroupDataRekening = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296996, "field 'viewGroupDataRekening'"), Utils.findRequiredView(view, 2131296990, "field 'viewGroupDataRekening'"), Utils.findRequiredView(view, 2131297053, "field 'viewGroupDataRekening'"));
        page6FSFragment.tilFormDataRekening = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298544, "field 'tilFormDataRekening'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298539, "field 'tilFormDataRekening'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298600, "field 'tilFormDataRekening'", LogoutDialog_ViewBinding.class));
        page6FSFragment.tvErrorDataRekening = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299020, "field 'tvErrorDataRekening'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299015, "field 'tvErrorDataRekening'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299077, "field 'tvErrorDataRekening'", TextView.class));
        Context context = view.getContext();
        Resources resources = context.getResources();
        page6FSFragment.colorDataGrey = copyWindowDataInto.a(context, 2131099763);
        page6FSFragment.colorDataGreyDarker = copyWindowDataInto.a(context, 2131099762);
        page6FSFragment.txtTermCondition = resources.getString(2131821427);
        page6FSFragment.retry = resources.getString(2131822092);
        page6FSFragment.hintAtm = resources.getString(2131821161);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6FSFragment page6FSFragment = this.b;
        if (page6FSFragment != null) {
            this.b = null;
            page6FSFragment.etNoATM = null;
            page6FSFragment.etEmailAddr = null;
            page6FSFragment.etPurposePemRek = null;
            page6FSFragment.etLanguage = null;
            page6FSFragment.etTypeCard = null;
            page6FSFragment.etDollarCurrCode = null;
            page6FSFragment.etInternetBanking = null;
            page6FSFragment.etMobileBanking = null;
            page6FSFragment.cbxAgree = null;
            page6FSFragment.llDetailDataDiri = null;
            page6FSFragment.llDetailDataRekening = null;
            page6FSFragment.svMain = null;
            page6FSFragment.llFasilitasBanking = null;
            page6FSFragment.tilInternetBanking = null;
            page6FSFragment.tilMobileBanking = null;
            page6FSFragment.tilJenisKartu = null;
            page6FSFragment.tilMataUang = null;
            page6FSFragment.llHeaderDataDiri = null;
            page6FSFragment.llHeaderDataRekening = null;
            page6FSFragment.tvTermCondition = null;
            page6FSFragment.llSyaratKetentuan = null;
            page6FSFragment.tilBahasaPetunjuk = null;
            page6FSFragment.btnProses = null;
            page6FSFragment.ivDataDiri = null;
            page6FSFragment.ivDataRekening = null;
            page6FSFragment.tvUbahDataDiri = null;
            page6FSFragment.tvUbahDataRekening = null;
            page6FSFragment.llLayoutDataDiriUneditable = null;
            page6FSFragment.llLayoutDataDiriEditable = null;
            page6FSFragment.llLayoutDataRekeningUneditable = null;
            page6FSFragment.llLayoutDataRekeningEditable = null;
            page6FSFragment.llNoAtmDisabled = null;
            page6FSFragment.llEmailDisabled = null;
            page6FSFragment.tvNoAtm = null;
            page6FSFragment.tvEmail = null;
            page6FSFragment.llTujuanPemrekDisabled = null;
            page6FSFragment.llBahasaPetunjukDisabled = null;
            page6FSFragment.llJenisKartuAtmDisabled = null;
            page6FSFragment.llMataUangDisabled = null;
            page6FSFragment.llFasilitasKlikBcaDisabled = null;
            page6FSFragment.llFasilitasMBcaDisabled = null;
            page6FSFragment.tvTujuanPemrek = null;
            page6FSFragment.tvBahasaPetunjuk = null;
            page6FSFragment.tvJenisKartuAtm = null;
            page6FSFragment.tvMataUang = null;
            page6FSFragment.tvFasilitasKlikBca = null;
            page6FSFragment.tvFasilitasMBca = null;
            page6FSFragment.viewGroupDataDiri = null;
            page6FSFragment.tilFormDataDiri = null;
            page6FSFragment.tvErrorDataDiri = null;
            page6FSFragment.viewGroupDataRekening = null;
            page6FSFragment.tilFormDataRekening = null;
            page6FSFragment.tvErrorDataRekening = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.f50o.setOnClickListener(null);
            this.f50o = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.k.setOnClickListener(null);
            this.k = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
