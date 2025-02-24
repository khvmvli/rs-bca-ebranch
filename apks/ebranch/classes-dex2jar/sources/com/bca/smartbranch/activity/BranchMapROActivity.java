package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.BranchMapROItemAdapter;
import com.bca.smartbranch.adapter.CityReservationAdapter;
import com.bca.smartbranch.adapter.KantorCabangROAdapter;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.ErrorGetBranchDialog;
import com.bca.smartbranch.dialog.ErrorGetCityListDialog;
import com.bca.smartbranch.presenter.GetBranchByCityPresenter;
import com.bca.smartbranch.presenter.GetBranchROPresenter;
import com.bca.smartbranch.presenter.GetCitySearchPresenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BN7PengambilanUpdateReceiverActivity_ViewBinding;
import o.CC14FormKartuKreditFragment_ViewBinding;
import o.InfoJenisKartuActivity_ViewBinding;
import o.InfoKursORActivity;
import o.InfoProductORActivity;
import o.InfoProductORActivity_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.OpenAccountSuccessActivity;
import o.PenggantianKartuATMActivity_ViewBinding;
import o.PenggantianKeyBCAActivity;
import o.PilihKantorCabangActivity_ViewBinding;
import o.PilihKecamatanActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanTransaksiActivity;
import o.TarikanTransaksiActivity_ViewBinding;
import o.chooseValueAskOrangDatangKeCabangEvent;
import o.clickJenisIdentitas;
import o.documentProvider;
import o.getPromotion;
import o.realmGet$hasManyPenerima;
import o.realmGet$jobValue;
import o.realmGet$language;
import o.realmGet$occupation;
import o.realmGet$officeName;
import o.realmSet$AlamatLengkapPenerima;
import o.realmSet$CodewordBankPenerima;
import o.realmSet$FlagBicCode;
import o.realmSet$FlagHubunganKeuanganTransaksi;
import o.realmSet$FlagHubunganKeuanganTransaksi$MediaBrowserCompat$CustomActionResultReceiver;
import o.realmSet$NamaPenerima;
import o.realmSet$NegaraTujuanPenerimaISO;
import o.realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver;
import o.realmSet$NegaraTujuanTransaksi;
import o.realmSet$NoIBANPenerima;
import o.realmSet$NorekPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setKodePosPenerima;
import o.setKodeSwiftBankPenerima;
import o.setKotaBankPenerima;
import o.setLimitMaxNominalTransaksi;
import o.setNamaBankPenerima;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BranchMapROActivity.class */
public class BranchMapROActivity extends BaseActivityPostLogin implements realmSet$NegaraTujuanTransaksi, GetBranchROPresenter.read, realmSet$CodewordBankPenerima, realmGet$occupation.IconCompatParcelizer, realmGet$occupation.read, realmSet$NegaraTujuanPenerimaISO.IconCompatParcelizer, realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver, realmGet$officeName<realmSet$FlagBicCode>, TextWatcher, GetCitySearchPresenter.write, GetBranchByCityPresenter.RemoteActionCompatParcelizer, GetHBPresenter.write {
    private realmGet$occupation A;
    private GetBranchByCityPresenter B;
    private GetHBPresenter C;
    private GetBranchROPresenter D;
    private GetBranchROResponse.DetailBranch E;
    private LocationRequest F;
    private List<GetBranchROResponse.DetailBranch> G;
    private realmSet$NegaraTujuanPenerimaISO H;
    private List<PenggantianKeyBCAActivity.RemoteActionCompatParcelizer> I;
    private ViewAnimator J;
    private List<GetBranchROResponse.DetailBranch> K;
    private List<DetailTransactionResponse.TxnDataDetail> L;
    private Reservation M;
    private String N;
    @BindView(2131298420)
    CoordinatorLayout clMain;
    @BindView(2131296980)
    EditText etFilter;
    @BindView(2131297176)
    EditText etSearch;
    private BottomSheetBehavior<LinearLayout> f;
    @BindView(2131296374)
    LinearLayout llBottomSheetMain;
    @BindView(2131296375)
    LinearLayout llBottomSheetSearch;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297842)
    LinearLayout llPeekSheet;
    private BottomSheetBehavior<LinearLayout> n;
    private KantorCabangROAdapter p;
    private setKodePosPenerima q;
    private LatLng r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298318)
    setOnStartEnterTransitionListener rvBranchItem;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvKantorCabang;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvError;
    @BindView(2131299179)
    TextView tvErrorSearch;
    @BindView(2131299627)
    TextView tvTitleCabang;
    @BindView(2131298790)
    TextView tvToolbar;
    @BindString(2131822254)
    String txtToolbar;
    private CityReservationAdapter v;
    private BranchMapROItemAdapter w;
    private Location x;
    private setLimitMaxNominalTransaksi y;
    private GetCitySearchPresenter z;
    private List<setLimitMaxNominalTransaksi> u = new ArrayList();
    private boolean t = true;
    private int s = 0;

    public static void d(LogRedirector.Logger logger) {
        logger.a();
    }

    private List<GetBranchROResponse.DetailBranch> e(List<GetBranchROResponse.DetailBranch> list) {
        ArrayList arrayList = new ArrayList();
        if (this.M.getTxnType().equalsIgnoreCase("Transaksi Teller")) {
            for (GetBranchROResponse.DetailBranch detailBranch : list) {
                String lowerCase = this.m.getMembership().toLowerCase();
                lowerCase.hashCode();
                if (!lowerCase.equals("p")) {
                    if (!lowerCase.equals("s")) {
                        if (detailBranch.getFlagReservationTellerReguler().equals("Y")) {
                            arrayList.add(detailBranch);
                        }
                    } else if (detailBranch.getFlagReservationTellerReguler().equals("Y") || detailBranch.getFlagReservationTellerPrioritas().equals("Y") || detailBranch.getFlagReservationTellerSolitaire().equals("Y")) {
                        arrayList.add(detailBranch);
                    }
                } else if (detailBranch.getFlagReservationTellerReguler().equals("Y") || detailBranch.getFlagReservationTellerPrioritas().equals("Y")) {
                    arrayList.add(detailBranch);
                }
            }
        } else {
            for (GetBranchROResponse.DetailBranch detailBranch2 : list) {
                String lowerCase2 = this.m.getMembership().toLowerCase();
                lowerCase2.hashCode();
                if (!lowerCase2.equals("p")) {
                    if (!lowerCase2.equals("s")) {
                        if (detailBranch2.getFlagReservationCsoReguler().equals("Y")) {
                            arrayList.add(detailBranch2);
                        }
                    } else if (detailBranch2.getFlagReservationCsoReguler().equals("Y") || detailBranch2.getFlagReservationCsoPrioritas().equals("Y") || detailBranch2.getFlagReservationCsoSolitaire().equals("Y")) {
                        arrayList.add(detailBranch2);
                    }
                } else if (detailBranch2.getFlagReservationCsoReguler().equals("Y") || detailBranch2.getFlagReservationCsoPrioritas().equals("Y")) {
                    arrayList.add(detailBranch2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write, com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void B() {
        this.J.setDisplayedChild(0);
    }

    public final void D() {
        realmSet$AlamatLengkapPenerima.b.d(this.A, this.F, this);
        realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso = this.H;
        if (realmset_negaratujuanpenerimaiso != null) {
            try {
                realmset_negaratujuanpenerimaiso.e.e(true);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // o.realmSet$NegaraTujuanTransaksi
    public final void a(realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso) {
        this.H = realmset_negaratujuanpenerimaiso;
        try {
            realmset_negaratujuanpenerimaiso.e.a(1);
            try {
                this.H.c().e.d(true);
                this.H.d(this);
                this.H.a(this);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.I != null) {
            ArrayList arrayList = new ArrayList();
            if (editable.length() > 2) {
                for (PenggantianKeyBCAActivity.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.I) {
                    if (remoteActionCompatParcelizer.c.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                        arrayList.add(remoteActionCompatParcelizer);
                    }
                }
            }
            CityReservationAdapter cityReservationAdapter = this.v;
            cityReservationAdapter.e = arrayList;
            cityReservationAdapter.a.b();
            this.rvKantorCabang.setAdapter(this.v);
            if (editable.length() <= 2 || arrayList.size() > 0) {
                this.J.setDisplayedChild(2);
            } else {
                this.J.setDisplayedChild(3);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read, com.bca.smartbranch.presenter.GetCitySearchPresenter.write, com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void b(List<GetBranchROResponse.DetailBranch> list) {
        List<GetBranchROResponse.DetailBranch> e = e(list);
        this.K = e;
        if (e.size() > 0) {
            if (this.p == null) {
                this.p = new KantorCabangROAdapter(this, this.K, this.x);
            }
            this.p.a(this.K);
            this.rvKantorCabang.setAdapter(this.p);
            this.J.setDisplayedChild(2);
            return;
        }
        this.J.setDisplayedChild(1);
    }

    @Override // o.realmGet$resProvince
    public void b(realmGet$jobValue realmget_jobvalue) {
        Toast.makeText(this, "Connection failed", 0).show();
    }

    @Override // o.realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi) {
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read, com.bca.smartbranch.presenter.GetCitySearchPresenter.write, com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetBranchDialog errorGetBranchDialog = new ErrorGetBranchDialog();
        errorGetBranchDialog.setArguments(bundle);
        errorGetBranchDialog.show(l(), "ErrorGetBranchDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write
    public final void c(PenggantianKartuATMActivity_ViewBinding penggantianKartuATMActivity_ViewBinding) {
        this.t = false;
        this.J.setDisplayedChild(2);
        x();
        this.v = new CityReservationAdapter(this);
        this.rvKantorCabang.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvKantorCabang.setAdapter(this.v);
        if (!(penggantianKartuATMActivity_ViewBinding.c == null || penggantianKartuATMActivity_ViewBinding.c.isEmpty())) {
            this.I = new ArrayList();
            for (String str : penggantianKartuATMActivity_ViewBinding.c) {
                PenggantianKeyBCAActivity.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new PenggantianKeyBCAActivity.RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer.c = str;
                this.I.add(remoteActionCompatParcelizer);
            }
        }
    }

    @Override // o.realmGet$officeName
    public /* synthetic */ void c(realmSet$FlagBicCode realmset_flagbiccode) {
        Status e = realmset_flagbiccode.e();
        int i = e.h;
        if (i == 0) {
            BN7PengambilanUpdateReceiverActivity_ViewBinding.d(this);
        } else if (i == 6) {
            try {
                e.c(this, 1);
            } catch (IntentSender.SendIntentException e2) {
                Log.i("EBRANCH", String.valueOf(e2));
            }
        }
    }

    @Override // o.realmSet$NegaraTujuanPenerimaISO.IconCompatParcelizer
    public final boolean c(setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi) {
        setlimitmaxnominaltransaksi.e();
        setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi2 = this.y;
        if (setlimitmaxnominaltransaksi2 != null) {
            setlimitmaxnominaltransaksi2.b(setKodeSwiftBankPenerima.b(2131231069));
        }
        setlimitmaxnominaltransaksi.b(setKodeSwiftBankPenerima.b(2131231074));
        this.y = setlimitmaxnominaltransaksi;
        LatLng b = setlimitmaxnominaltransaksi.b();
        int i = 0;
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            if (new LatLng(Double.parseDouble(this.G.get(i2).getLatitude()), Double.parseDouble(this.G.get(i2).getLongitude())).equals(b)) {
                this.E = this.G.get(i2);
            }
        }
        for (GetBranchROResponse.DetailBranch detailBranch : this.G) {
            if (setlimitmaxnominaltransaksi.b().c == Double.valueOf(detailBranch.getLatitude()).doubleValue() && setlimitmaxnominaltransaksi.b().a == Double.valueOf(detailBranch.getLongitude()).doubleValue()) {
                this.w.a(i);
                this.rvBranchItem.c(i);
                return true;
            }
            i++;
        }
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        this.J = (ViewAnimator) findViewById(2131299750);
        boolean z = false;
        this.f10o = false;
        GetBranchROPresenter getBranchROPresenter = new GetBranchROPresenter();
        this.D = getBranchROPresenter;
        getBranchROPresenter.e = this;
        GetCitySearchPresenter getCitySearchPresenter = new GetCitySearchPresenter();
        this.z = getCitySearchPresenter;
        getCitySearchPresenter.a = this;
        GetBranchByCityPresenter getBranchByCityPresenter = new GetBranchByCityPresenter();
        this.B = getBranchByCityPresenter;
        getBranchByCityPresenter.b = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.C = getHBPresenter;
        getHBPresenter.e = this;
        this.K = new ArrayList();
        this.G = new ArrayList();
        this.M = (Reservation) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_data"));
        this.N = extras.getString("estimation", "");
        if (extras.getParcelable("txn_data_tunda") != null) {
            this.L = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("txn_data_tunda"));
        }
        this.etFilter.addTextChangedListener(this);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText(this.txtToolbar);
        this.f = BottomSheetBehavior.a(this.llBottomSheetMain);
        this.n = BottomSheetBehavior.a(this.llBottomSheetSearch);
        this.tvTitleCabang.setText(2131821417);
        this.llPeekSheet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bca.smartbranch.activity.BranchMapROActivity.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BranchMapROActivity.this.f.e(BranchMapROActivity.this.llPeekSheet.getHeight(), false);
                BranchMapROActivity.this.llPeekSheet.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.llBottomSheetSearch.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bca.smartbranch.activity.BranchMapROActivity.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BranchMapROActivity.this.n.e(BranchMapROActivity.this.llBottomSheetSearch.getHeight(), false);
                BranchMapROActivity.this.llBottomSheetSearch.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.f.e(false);
        this.n.e(true);
        this.n.b(5);
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.f;
        AnonymousClass4 r0 = new BottomSheetBehavior.read() { // from class: com.bca.smartbranch.activity.BranchMapROActivity.4
            public final void d(View view) {
            }

            public final void e(View view, int i) {
            }
        };
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        bottomSheetBehavior.d.clear();
        bottomSheetBehavior.d.add(r0);
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.n;
        AnonymousClass2 r02 = new BottomSheetBehavior.read() { // from class: com.bca.smartbranch.activity.BranchMapROActivity.2
            public final void d(View view) {
            }

            public final void e(View view, int i) {
                if (i == 5) {
                    BranchMapROActivity.this.etFilter.setText("");
                } else if (i == 3 && BranchMapROActivity.this.I == null) {
                    GetCitySearchPresenter getCitySearchPresenter2 = BranchMapROActivity.this.z;
                    String e = getPromotion.e(BranchMapROActivity.this.m);
                    new InfoProductORActivity(BranchMapROActivity.this.m.getEmail(), BranchMapROActivity.this.m.getSessionId(), "");
                    getCitySearchPresenter2.a(e);
                }
            }
        };
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        bottomSheetBehavior2.d.clear();
        bottomSheetBehavior2.d.add(r02);
        this.J.setDisplayedChild(2);
        int isGooglePlayServicesAvailable = realmGet$language.isGooglePlayServicesAvailable(this);
        if (isGooglePlayServicesAvailable == 0) {
            z = true;
        } else if (realmGet$language.isUserRecoverableError(isGooglePlayServicesAvailable)) {
            realmGet$language.getErrorDialog(isGooglePlayServicesAvailable, this, 12376).show();
        } else {
            Toast.makeText(this, "Cannot connnect to mapping Service", 0).show();
        }
        if (z) {
            realmSet$NorekPenerima realmset_norekpenerima = (realmSet$NorekPenerima) l().findFragmentById(2131297980);
            if (realmGet$hasManyPenerima.b()) {
                realmset_norekpenerima.a.d(this);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f = true;
                this.F = locationRequest;
                locationRequest.c = 100;
                realmGet$occupation.RemoteActionCompatParcelizer e = new realmGet$occupation.RemoteActionCompatParcelizer(this).e(realmSet$AlamatLengkapPenerima.d);
                e.d.add(this);
                e.b.add(this);
                this.A = e.a();
                return;
            }
            throw new IllegalStateException("getMapAsync must be called on the main thread.");
        }
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
    public final void d(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetBranchDialog errorGetBranchDialog = new ErrorGetBranchDialog();
        errorGetBranchDialog.setArguments(bundle);
        errorGetBranchDialog.show(l(), "ErrorGetBranchDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
    public final void d(List<GetBranchROResponse.DetailBranch> list) {
        this.G = e(list);
        x();
        this.t = false;
        if (!this.u.isEmpty()) {
            this.u.clear();
        }
        for (GetBranchROResponse.DetailBranch detailBranch : this.G) {
            LatLng latLng = new LatLng(Double.parseDouble(detailBranch.getLatitude()), Double.parseDouble(detailBranch.getLongitude()));
            setNamaBankPenerima setnamabankpenerima = new setNamaBankPenerima();
            setnamabankpenerima.b(latLng).a(setKodeSwiftBankPenerima.b(2131231069));
            setnamabankpenerima.d(detailBranch.getBranchName());
            setnamabankpenerima.c(detailBranch.getAddress());
            this.u.add(this.H.a(setnamabankpenerima));
        }
        this.p = new KantorCabangROAdapter(this, this.K, this.x);
        this.w.a(this.G);
        if (this.f.u != 3) {
            this.f.b(3);
        }
        setKotaBankPenerima setkotabankpenerima = new setKotaBankPenerima();
        LatLng latLng2 = this.r;
        if (latLng2 != null) {
            setkotabankpenerima.b = latLng2;
            setkotabankpenerima.c = 1.0f;
            setkotabankpenerima.d = -16776961;
            setkotabankpenerima.e = 10000.0d;
            setkotabankpenerima.a = Color.parseColor("#200084d3");
            setKodePosPenerima setkodepospenerima = this.q;
            if (setkodepospenerima != null) {
                try {
                    setkodepospenerima.b.d();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            this.q = this.H.c(setkotabankpenerima);
            this.H.a(realmSet$NamaPenerima.c(new LatLngBounds(CC14FormKartuKreditFragment_ViewBinding.a(this.r, Math.sqrt(2.0d) * 10000.0d, 225.0d), CC14FormKartuKreditFragment_ViewBinding.a(this.r, Math.sqrt(2.0d) * 10000.0d, 45.0d)), 175));
            realmSet$NoIBANPenerima e2 = this.H.e();
            Point c = e2.c(this.r);
            this.H.b(realmSet$NamaPenerima.c(e2.e(new Point(c.x, c.y + (this.clMain.getHeight() / 4)))));
            return;
        }
        throw new NullPointerException("center must not be null.");
    }

    @Override // o.realmGet$resCountry
    public void e(int i) {
        Toast.makeText(this, "Suspended", 0).show();
    }

    @Override // o.realmSet$CodewordBankPenerima
    public final void e(Location location) {
        if (location != null) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            this.r = new LatLng(latitude, longitude);
            Location location2 = new Location("");
            this.x = location2;
            location2.setLatitude(this.r.c);
            this.x.setLongitude(this.r.a);
            this.w = new BranchMapROItemAdapter(this, this.G, this.x);
            this.rvBranchItem.setLayoutManager(new LinearLayoutManager(0, false));
            this.rvBranchItem.setAdapter(this.w);
            if (this.s <= 0) {
                CameraPosition.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new CameraPosition.RemoteActionCompatParcelizer();
                LatLng latLng = this.r;
                if (latLng != null) {
                    remoteActionCompatParcelizer.a = latLng;
                    remoteActionCompatParcelizer.b = 15.0f;
                    this.H.a(realmSet$NamaPenerima.a(new CameraPosition(remoteActionCompatParcelizer.a, remoteActionCompatParcelizer.b, remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.d)));
                    this.D.a(getPromotion.e(this.m), new InfoKursORActivity(this.m.getEmail(), this.m.getSessionId(), String.valueOf(longitude), String.valueOf(latitude), "", this.M.getTxnType().equalsIgnoreCase("Transaksi Teller") ? "T" : "C"));
                    this.s++;
                    return;
                }
                throw new NullPointerException("location must not be null.");
            }
        }
    }

    @Override // o.realmGet$resCountry
    public void e(Bundle bundle) {
        realmSet$FlagHubunganKeuanganTransaksi$MediaBrowserCompat$CustomActionResultReceiver realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver = new realmSet$FlagHubunganKeuanganTransaksi$MediaBrowserCompat$CustomActionResultReceiver();
        LocationRequest locationRequest = this.F;
        if (locationRequest != null) {
            realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.d.add(locationRequest);
        }
        realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.e = true;
        realmSet$AlamatLengkapPenerima.e.c(this.A, new realmSet$FlagHubunganKeuanganTransaksi(realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.d, realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.e, realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.b, null)).e(this);
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
    public final void e(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetBranchDialog errorGetBranchDialog = new ErrorGetBranchDialog();
        errorGetBranchDialog.setArguments(bundle);
        errorGetBranchDialog.show(l(), "ErrorGetBranchDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write
    public final void g(String str) {
        this.J.setDisplayedChild(2);
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetCityListDialog errorGetCityListDialog = new ErrorGetCityListDialog();
        errorGetCityListDialog.setArguments(bundle);
        errorGetCityListDialog.show(l(), "ErrorGetCityListDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
    public final void g_() {
        if (this.t) {
            z();
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write
    public final void i(String str) {
        this.J.setDisplayedChild(2);
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetCityListDialog errorGetCityListDialog = new ErrorGetCityListDialog();
        errorGetCityListDialog.setArguments(bundle);
        errorGetCityListDialog.show(l(), "ErrorGetCityListDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write
    public final void j(String str) {
        this.J.setDisplayedChild(2);
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetCityListDialog errorGetCityListDialog = new ErrorGetCityListDialog();
        errorGetCityListDialog.setArguments(bundle);
        errorGetCityListDialog.show(l(), "ErrorGetCityListDialog");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            BN7PengambilanUpdateReceiverActivity_ViewBinding.d(this);
        } else {
            k();
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        if (this.n.u == 3) {
            this.n.e(true);
            this.n.b(5);
            return;
        }
        onBackPressed();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBranch(final PilihKecamatanActivity pilihKecamatanActivity) {
        getPromotion.d(this);
        new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.BranchMapROActivity.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                BranchMapROActivity.this.E = pilihKecamatanActivity.c;
                if (BranchMapROActivity.this.G.size() > 0) {
                    Iterator it = BranchMapROActivity.this.G.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        GetBranchROResponse.DetailBranch detailBranch = (GetBranchROResponse.DetailBranch) it.next();
                        if (detailBranch.getAddress().equals(BranchMapROActivity.this.E.getAddress())) {
                            BranchMapROActivity.this.E = detailBranch;
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        BranchMapROActivity.this.G.add(pilihKecamatanActivity.c);
                        BranchMapROActivity.this.w.a(BranchMapROActivity.this.G);
                    }
                } else {
                    BranchMapROActivity.this.G.add(pilihKecamatanActivity.c);
                    BranchMapROActivity.this.w.a(BranchMapROActivity.this.G);
                }
                BranchMapROActivity.this.w.a(BranchMapROActivity.this.G.indexOf(BranchMapROActivity.this.E));
                BranchMapROActivity.this.rvBranchItem.c(BranchMapROActivity.this.G.indexOf(BranchMapROActivity.this.E));
                GetHBPresenter getHBPresenter = BranchMapROActivity.this.C;
                Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(BranchMapROActivity.this.h, BranchMapROActivity.this.m.getSessionId(), BranchMapROActivity.this.m.getImei()));
                getHBPresenter.b = e;
                e.enqueue(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0131: INVOKE  
                      (r0v19 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                      (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x012e: CONSTRUCTOR  (r1v14 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v15 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                     type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.BranchMapROActivity.1.run():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/BranchMapROActivity$1.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                    	... 15 more
                    */
                /*
                // Method dump skipped, instructions count: 544
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BranchMapROActivity.AnonymousClass1.run():void");
            }
        }, 200);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBranchMapItem(PilihKantorCabangActivity_ViewBinding pilihKantorCabangActivity_ViewBinding) {
        this.E = this.G.get(pilihKantorCabangActivity_ViewBinding.a);
        this.tvErrorSearch.setVisibility(8);
        this.etSearch.setBackgroundResource(2131230847);
        LatLng latLng = new LatLng(Double.valueOf(this.E.getLatitude()).doubleValue(), Double.valueOf(this.E.getLongitude()).doubleValue());
        this.H.a(realmSet$NamaPenerima.c(new LatLngBounds(CC14FormKartuKreditFragment_ViewBinding.a(latLng, Math.sqrt(2.0d) * 10000.0d, 225.0d), CC14FormKartuKreditFragment_ViewBinding.a(latLng, Math.sqrt(2.0d) * 10000.0d, 45.0d)), 175));
        realmSet$NoIBANPenerima e = this.H.e();
        Point c = e.c(latLng);
        this.H.b(realmSet$NamaPenerima.c(e.e(new Point(c.x, c.y + (this.clMain.getHeight() / 4)))));
        setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi = this.y;
        if (setlimitmaxnominaltransaksi != null) {
            setlimitmaxnominaltransaksi.c();
            this.y.b(setKodeSwiftBankPenerima.b(2131231069));
            this.y = null;
        }
        Iterator<setLimitMaxNominalTransaksi> it = this.u.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            setLimitMaxNominalTransaksi next = it.next();
            if (next.b().c == Double.valueOf(this.E.getLatitude()).doubleValue() && next.b().a == Double.valueOf(this.E.getLongitude()).doubleValue()) {
                next.b(setKodeSwiftBankPenerima.b(2131231074));
                next.e();
                this.y = next;
                break;
            }
        }
        if (this.y == null) {
            setNamaBankPenerima setnamabankpenerima = new setNamaBankPenerima();
            setnamabankpenerima.b(latLng).a(setKodeSwiftBankPenerima.b(2131231074));
            setnamabankpenerima.d(this.E.getBranchName());
            setnamabankpenerima.c(this.E.getAddress());
            this.u.add(this.H.a(setnamabankpenerima));
            List<setLimitMaxNominalTransaksi> list = this.u;
            this.y = list.get(list.size() - 1);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onCityReservationChosenEvent(TarikanTransaksiActivity tarikanTransaksiActivity) {
        getPromotion.d(this);
        this.etFilter.setText(tarikanTransaksiActivity.d);
        this.etFilter.setSelection(tarikanTransaksiActivity.d.length());
        this.B.c(getPromotion.e(this.m), new InfoJenisKartuActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), tarikanTransaksiActivity.d, "", this.M.getTxnType().equalsIgnoreCase("Transaksi Teller") ? "T" : "C"));
    }

    @OnClick({2131296396})
    public void onClickLanjut(View view) {
        documentProvider.b().d(new TarikanTransaksiActivity_ViewBinding());
        if (this.E != null) {
            GetHBPresenter getHBPresenter = this.C;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004c: INVOKE  
                  (r0v12 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x0049: CONSTRUCTOR  (r1v6 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v8 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.BranchMapROActivity.onClickLanjut(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/BranchMapROActivity.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 23 more
                */
            /*
            // Method dump skipped, instructions count: 252
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BranchMapROActivity.onClickLanjut(android.view.View):void");
        }

        @OnClick({2131297176})
        public void onClickSearch(View view) {
            this.n.b(3);
            this.n.e(false);
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
        public void onDestroy() {
            onDestroy();
            GetBranchROPresenter getBranchROPresenter = this.D;
            Call<OpenAccountSuccessActivity<GetBranchROResponse>> call = getBranchROPresenter.b;
            if (call != null) {
                call.cancel();
            }
            getBranchROPresenter.e = null;
            GetCitySearchPresenter getCitySearchPresenter = this.z;
            Call<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> call2 = getCitySearchPresenter.b;
            if (call2 != null) {
                call2.cancel();
            }
            getCitySearchPresenter.a = null;
            GetBranchByCityPresenter getBranchByCityPresenter = this.B;
            Call<OpenAccountSuccessActivity<GetBranchROResponse>> call3 = getBranchByCityPresenter.c;
            if (call3 != null) {
                call3.cancel();
            }
            getBranchByCityPresenter.b = null;
            GetHBPresenter getHBPresenter = this.C;
            Call<OpenAccountSuccessActivity<Object>> call4 = getHBPresenter.b;
            if (call4 != null) {
                call4.cancel();
            }
            getHBPresenter.e = null;
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onGetBranchEvent(chooseValueAskOrangDatangKeCabangEvent choosevalueaskorangdatangkecabangevent) {
            this.D.a(getPromotion.e(this.m), new InfoKursORActivity(this.m.getEmail(), this.m.getSessionId(), String.valueOf(this.r.a), String.valueOf(this.r.c), "", this.M.getTxnType().equalsIgnoreCase("Transaksi Teller") ? "T" : "C"));
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onGetCityListEvent(clickJenisIdentitas clickjenisidentitas) {
            if (this.I == null) {
                GetCitySearchPresenter getCitySearchPresenter = this.z;
                String e = getPromotion.e(this.m);
                new InfoProductORActivity(this.m.getEmail(), this.m.getSessionId(), "");
                getCitySearchPresenter.a(e);
            }
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return onOptionsItemSelected(menuItem);
            }
            onBackPressed();
            return true;
        }

        @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            onRequestPermissionsResult(i, strArr, iArr);
            BN7PengambilanUpdateReceiverActivity_ViewBinding.a(this, i, iArr);
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
        public void onStart() {
            onStart();
            realmGet$occupation realmget_occupation = this.A;
            if (realmget_occupation != null) {
                realmget_occupation.d();
            }
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
        public void onStop() {
            onStop();
            realmGet$occupation realmget_occupation = this.A;
            if (realmget_occupation != null && realmget_occupation.c()) {
                this.A.a();
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "BranchMapActivity";
            this.j = "BranchMapActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492901;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        @OnClick({2131296446})
        public void retry(View view) {
            GetCitySearchPresenter getCitySearchPresenter = this.z;
            String e = getPromotion.e(this.m);
            new InfoProductORActivity(this.m.getEmail(), this.m.getSessionId(), "");
            getCitySearchPresenter.a(e);
        }

        @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        public final void t() {
            this.J.setDisplayedChild(1);
        }

        @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
        public final void u() {
            x();
        }

        @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        public final void v() {
            this.J.setDisplayedChild(1);
        }

        @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        public final void y() {
            this.J.setDisplayedChild(1);
        }
    }
