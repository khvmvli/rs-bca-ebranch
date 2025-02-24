package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.adapter.BranchMapItemBNAdapter;
import com.bca.smartbranch.adapter.KantorCabangBNAdapter;
import com.bca.smartbranch.data.api.response.StockListBNResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.BN3PilihCabangFragment;
import com.bca.smartbranch.presenter.CheckOTPSessionPresenter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.CC14FormKartuKreditFragment_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.OpenAccountSuccessActivity;
import o.PilihKantorCabangActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH;
import o.TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH_ViewBinding;
import o.TransaksiBerkalaAdapter$TransaksiBerkalaVH;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseKecamatanHome;
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
import o.realmSet$NorekPenerima;
import o.retakePicture;
import o.setKodePosPenerima;
import o.setKodeSwiftBankPenerima;
import o.setKotaBankPenerima;
import o.setLimitMaxNominalTransaksi;
import o.setNamaBankPenerima;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN3PilihCabangFragment.class */
public class BN3PilihCabangFragment extends BaseFragment implements realmSet$NegaraTujuanTransaksi, realmSet$CodewordBankPenerima, realmGet$occupation.IconCompatParcelizer, realmGet$occupation.read, realmSet$NegaraTujuanPenerimaISO.IconCompatParcelizer, realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver, realmGet$officeName<realmSet$FlagBicCode>, CheckOTPSessionPresenter.RemoteActionCompatParcelizer, TextWatcher, FormBankNotesActivity.read {
    private BottomSheetBehavior<LinearLayout> a;
    private BottomSheetBehavior<LinearLayout> d;
    @BindView(2131296980)
    EditText etFilter;
    @BindView(2131297176)
    EditText etSearch;
    private StockListBNResponse.StockBranch f;
    private LatLng g;
    private setKodePosPenerima h;
    private KantorCabangBNAdapter j;
    private List<StockListBNResponse.StockBranch> l;
    @BindView(2131296374)
    LinearLayout llBottomSheetMain;
    @BindView(2131296375)
    LinearLayout llBottomSheetSearch;
    @BindView(2131297561)
    LinearLayout llCabangTidakDitemukan;
    @BindView(2131297842)
    LinearLayout llPeekSheet;
    private setLimitMaxNominalTransaksi n;

    /* renamed from: o */
    private BranchMapItemBNAdapter f32o;
    private LocationRequest p;
    private realmGet$occupation q;
    private CheckOTPSessionPresenter r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298318)
    setOnStartEnterTransitionListener rvBranchItem;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvKantorCabang;
    private realmSet$NegaraTujuanPenerimaISO s;
    @BindView(2131299179)
    TextView tvErrorSearch;
    private List<StockListBNResponse.StockBranch> m = new ArrayList();
    private List<setLimitMaxNominalTransaksi> k = new ArrayList();
    private int i = -1;

    public static void a(LogRedirector.Logger logger) {
        logger.a();
    }

    static /* synthetic */ void b(BN3PilihCabangFragment bN3PilihCabangFragment, List list) {
        Collections.sort(list, new TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH_ViewBinding());
    }

    public static /* synthetic */ int d(StockListBNResponse.StockBranch stockBranch, StockListBNResponse.StockBranch stockBranch2) {
        int compare = Float.compare(stockBranch.getDistanceToBranch(), stockBranch2.getDistanceToBranch());
        if (stockBranch.getDistanceToBranch() == stockBranch2.getDistanceToBranch()) {
            compare = stockBranch.getBranchName().compareTo(stockBranch2.getBranchName());
        }
        return compare;
    }

    public void f() {
        retakePicture retakepicture = new retakePicture();
        retakepicture.e = this.e.getEmail();
        retakepicture.c = this.e.getImei();
        retakepicture.d = this.e.getSessionId();
        this.r.e(retakepicture);
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void a() {
        h();
        this.rvBranchItem.c(this.i);
        d(2131296811, this, new BN5PilihNomorOTPFragment(), "BN5PilihNomorOTPFragment");
    }

    @Override // o.realmSet$NegaraTujuanTransaksi
    public final void a(realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso) {
        this.s = realmset_negaratujuanpenerimaiso;
        try {
            realmset_negaratujuanpenerimaiso.e.a(1);
            try {
                this.s.c().e.d(true);
                this.s.d(this);
                this.s.a(this);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (StockListBNResponse.StockBranch stockBranch : this.l) {
            if (stockBranch.getBranchName().toLowerCase().contains(this.etFilter.getText().toString().toLowerCase()) || stockBranch.getBranchAddress().toLowerCase().contains(this.etFilter.getText().toString().toLowerCase()) || stockBranch.getCity().toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(stockBranch);
            }
        }
        KantorCabangBNAdapter kantorCabangBNAdapter = this.j;
        kantorCabangBNAdapter.e = arrayList;
        kantorCabangBNAdapter.a.b();
        if (arrayList.size() <= 0) {
            this.llCabangTidakDitemukan.setVisibility(0);
        } else {
            this.llCabangTidakDitemukan.setVisibility(8);
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void b() {
        h();
        this.rvBranchItem.c(this.i);
        d(2131296811, this, new BN5PilihRekeningFragment(), "BN5PilihRekeningFragment");
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // o.realmGet$resProvince
    public void b(realmGet$jobValue realmget_jobvalue) {
        Toast.makeText(getContext(), "Connection failed", 0).show();
    }

    @Override // o.realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi) {
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void backFragment(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment.9
            @Override // java.lang.Runnable
            public final void run() {
                BN3PilihCabangFragment.this.a.e(true);
                BN3PilihCabangFragment.this.a.b(5);
            }
        }, 200);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493161;
    }

    @Override // o.realmGet$officeName
    public /* synthetic */ void c(realmSet$FlagBicCode realmset_flagbiccode) {
        Status e = realmset_flagbiccode.e();
        int i = e.h;
        if (i == 0) {
            TransaksiBerkalaAdapter$TransaksiBerkalaVH.b(this);
        } else if (i == 6) {
            try {
                e.c(getActivity(), 1);
            } catch (IntentSender.SendIntentException e2) {
                Log.i("EBRANCH", String.valueOf(e2));
            }
        }
    }

    @Override // o.realmSet$NegaraTujuanPenerimaISO.IconCompatParcelizer
    public final boolean c(setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi) {
        setlimitmaxnominaltransaksi.e();
        setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi2 = this.n;
        if (setlimitmaxnominaltransaksi2 != null) {
            setlimitmaxnominaltransaksi2.b(setKodeSwiftBankPenerima.b(2131231069));
        }
        setlimitmaxnominaltransaksi.b(setKodeSwiftBankPenerima.b(2131231074));
        this.n = setlimitmaxnominaltransaksi;
        LatLng b = setlimitmaxnominaltransaksi.b();
        int i = 0;
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (new LatLng(Double.parseDouble(this.l.get(i2).getLatitude()), Double.parseDouble(this.l.get(i2).getLongitude())).equals(b)) {
                this.f = this.l.get(i2);
                this.tvErrorSearch.setVisibility(8);
                this.etSearch.setBackgroundResource(2131230847);
            }
        }
        if (!this.m.contains(this.f)) {
            if (this.m.size() >= 10) {
                List<StockListBNResponse.StockBranch> list = this.m;
                list.remove(list.size() - 1);
            }
            this.m.add(this.f);
            Collections.sort(this.m, new TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH_ViewBinding());
            BranchMapItemBNAdapter branchMapItemBNAdapter = this.f32o;
            branchMapItemBNAdapter.e = this.m;
            branchMapItemBNAdapter.a.b();
        }
        for (StockListBNResponse.StockBranch stockBranch : this.m) {
            if (setlimitmaxnominaltransaksi.b().c != Double.valueOf(stockBranch.getLatitude()).doubleValue() || setlimitmaxnominaltransaksi.b().a != Double.valueOf(stockBranch.getLongitude()).doubleValue()) {
                i++;
            } else if (this.f32o.c() <= 0) {
                return true;
            } else {
                this.f32o.a(i);
                this.rvBranchItem.c(i);
                return true;
            }
        }
        return true;
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void d() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // o.realmGet$resCountry
    public void e(int i) {
        Toast.makeText(getContext(), "Suspended", 0).show();
    }

    @Override // o.realmSet$CodewordBankPenerima
    public final void e(Location location) {
        if (location != null) {
            this.g = new LatLng(location.getLatitude(), location.getLongitude());
            CameraPosition.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new CameraPosition.RemoteActionCompatParcelizer();
            LatLng latLng = this.g;
            if (latLng != null) {
                remoteActionCompatParcelizer.a = latLng;
                remoteActionCompatParcelizer.b = 15.0f;
                this.s.a(realmSet$NamaPenerima.a(new CameraPosition(remoteActionCompatParcelizer.a, remoteActionCompatParcelizer.b, remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.d)));
                this.d.b(3);
                if (!this.k.isEmpty()) {
                    this.k.clear();
                }
                Location location2 = new Location("");
                location2.setLatitude(this.g.c);
                location2.setLongitude(this.g.a);
                if (!this.m.isEmpty()) {
                    this.m.clear();
                }
                for (StockListBNResponse.StockBranch stockBranch : this.l) {
                    Location location3 = new Location("");
                    location3.setLatitude(Double.valueOf(stockBranch.getLatitude()).doubleValue());
                    location3.setLongitude(Double.valueOf(stockBranch.getLongitude()).doubleValue());
                    float distanceTo = location2.distanceTo(location3) / 1000.0f;
                    stockBranch.setDistanceToBranch(distanceTo);
                    if (distanceTo < 7.0f) {
                        this.m.add(stockBranch);
                    }
                }
                if (!this.m.isEmpty()) {
                    Collections.sort(this.m, new TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH_ViewBinding());
                    if (this.m.size() > 10) {
                        List<StockListBNResponse.StockBranch> list = this.m;
                        list.subList(10, list.size()).clear();
                    }
                    for (StockListBNResponse.StockBranch stockBranch2 : this.m) {
                        LatLng latLng2 = new LatLng(Double.parseDouble(stockBranch2.getLatitude()), Double.parseDouble(stockBranch2.getLongitude()));
                        setNamaBankPenerima setnamabankpenerima = new setNamaBankPenerima();
                        setnamabankpenerima.b(latLng2).a(setKodeSwiftBankPenerima.b(2131231069));
                        setnamabankpenerima.d(stockBranch2.getBranchName());
                        setnamabankpenerima.c(stockBranch2.getBranchAddress());
                        this.k.add(this.s.a(setnamabankpenerima));
                    }
                } else {
                    for (StockListBNResponse.StockBranch stockBranch3 : this.l) {
                        LatLng latLng3 = new LatLng(Double.parseDouble(stockBranch3.getLatitude()), Double.parseDouble(stockBranch3.getLongitude()));
                        setNamaBankPenerima setnamabankpenerima2 = new setNamaBankPenerima();
                        setnamabankpenerima2.b(latLng3).a(setKodeSwiftBankPenerima.b(2131231069));
                        setnamabankpenerima2.d(stockBranch3.getBranchName());
                        setnamabankpenerima2.c(stockBranch3.getBranchAddress());
                        this.k.add(this.s.a(setnamabankpenerima2));
                    }
                }
                this.j = new KantorCabangBNAdapter(getContext(), this.m, location2);
                setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvKantorCabang;
                getContext();
                setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
                this.rvKantorCabang.setAdapter(this.j);
                this.f32o = new BranchMapItemBNAdapter(getContext(), this.m, location2);
                setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.rvBranchItem;
                getContext();
                setonstartentertransitionlistener2.setLayoutManager(new LinearLayoutManager(0, false));
                this.rvBranchItem.setAdapter(this.f32o);
                setKotaBankPenerima setkotabankpenerima = new setKotaBankPenerima();
                LatLng latLng4 = this.g;
                if (latLng4 != null) {
                    setkotabankpenerima.b = latLng4;
                    setkotabankpenerima.c = 1.0f;
                    setkotabankpenerima.d = -16776961;
                    setkotabankpenerima.e = 7000.0d;
                    setkotabankpenerima.a = Color.parseColor("#200084d3");
                    setKodePosPenerima setkodepospenerima = this.h;
                    if (setkodepospenerima != null) {
                        try {
                            setkodepospenerima.b.d();
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        }
                    }
                    this.h = this.s.c(setkotabankpenerima);
                    this.s.b(realmSet$NamaPenerima.c(new LatLngBounds(CC14FormKartuKreditFragment_ViewBinding.a(this.g, Math.sqrt(2.0d) * 7000.0d, 225.0d), CC14FormKartuKreditFragment_ViewBinding.a(this.g, Math.sqrt(2.0d) * 7000.0d, 45.0d)), 16));
                    return;
                }
                throw new NullPointerException("center must not be null.");
            }
            throw new NullPointerException("location must not be null.");
        }
    }

    @Override // o.realmGet$resCountry
    public void e(Bundle bundle) {
        realmSet$FlagHubunganKeuanganTransaksi$MediaBrowserCompat$CustomActionResultReceiver realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver = new realmSet$FlagHubunganKeuanganTransaksi$MediaBrowserCompat$CustomActionResultReceiver();
        LocationRequest locationRequest = this.p;
        if (locationRequest != null) {
            realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.d.add(locationRequest);
        }
        realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.e = true;
        realmSet$AlamatLengkapPenerima.e.c(this.q, new realmSet$FlagHubunganKeuanganTransaksi(realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.d, realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.e, realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.b, null)).e(this);
    }

    @Override // com.bca.smartbranch.activity.FormBankNotesActivity.read
    public final boolean e() {
        if (this.a.u == 3) {
            this.a.e(true);
            this.a.b(5);
            return true;
        } else if (this.d.u != 3) {
            return false;
        } else {
            this.d.e(true);
            this.d.b(5);
            return false;
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void h(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    public final void j() {
        realmSet$AlamatLengkapPenerima.b.d(this.q, this.p, this);
        realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso = this.s;
        if (realmset_negaratujuanpenerimaiso != null) {
            try {
                realmset_negaratujuanpenerimaiso.e.e(true);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void j_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BN3PilihCabangFragment.this.f();
            }
        }).g();
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void k_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                TransaksiBerkalaAdapter$TransaksiBerkalaVH.b(this);
            } else {
                getActivity().onBackPressed();
            }
        } else if (i == 500 && intent != null) {
            if (intent.getBooleanExtra("result", false)) {
                e(2131296811, this, new BN5PilihRekeningFragment(), "BN5PilihRekeningFragment");
            } else {
                e(2131296811, this, new BN5PilihNomorOTPFragment(), "BN5PilihNomorOTPFragment");
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBranch(final onChooseKecamatanHome onchoosekecamatanhome) {
        getPromotion.d(getContext());
        new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment.3
            @Override // java.lang.Runnable
            public final void run() {
                BN3PilihCabangFragment.this.a.e(true);
                BN3PilihCabangFragment.this.a.b(5);
                if (!BN3PilihCabangFragment.this.m.contains(onchoosekecamatanhome.c)) {
                    if (BN3PilihCabangFragment.this.m.size() >= 10) {
                        BN3PilihCabangFragment.this.m.remove(BN3PilihCabangFragment.this.m.size() - 1);
                    }
                    BN3PilihCabangFragment.this.m.add(onchoosekecamatanhome.c);
                    BN3PilihCabangFragment bN3PilihCabangFragment = BN3PilihCabangFragment.this;
                    BN3PilihCabangFragment.b(bN3PilihCabangFragment, bN3PilihCabangFragment.m);
                    BranchMapItemBNAdapter branchMapItemBNAdapter = BN3PilihCabangFragment.this.f32o;
                    branchMapItemBNAdapter.e = BN3PilihCabangFragment.this.m;
                    branchMapItemBNAdapter.a.b();
                }
                BN3PilihCabangFragment.this.f32o.a(BN3PilihCabangFragment.this.m.indexOf(onchoosekecamatanhome.c));
                BN3PilihCabangFragment.this.rvBranchItem.c(BN3PilihCabangFragment.this.m.indexOf(onchoosekecamatanhome.c));
                documentProvider.b().d(new PilihKantorCabangActivity_ViewBinding(BN3PilihCabangFragment.this.m.indexOf(onchoosekecamatanhome.c)));
            }
        }, 200);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBranchMapItem(PilihKantorCabangActivity_ViewBinding pilihKantorCabangActivity_ViewBinding) {
        this.f = this.m.get(pilihKantorCabangActivity_ViewBinding.a);
        this.i = pilihKantorCabangActivity_ViewBinding.a;
        this.tvErrorSearch.setVisibility(8);
        this.etSearch.setBackgroundResource(2131230847);
        LatLng latLng = new LatLng(Double.valueOf(this.f.getLatitude()).doubleValue(), Double.valueOf(this.f.getLongitude()).doubleValue());
        this.s.b(realmSet$NamaPenerima.c(new LatLngBounds(CC14FormKartuKreditFragment_ViewBinding.a(latLng, Math.sqrt(2.0d) * 15000.0d, 225.0d), CC14FormKartuKreditFragment_ViewBinding.a(latLng, Math.sqrt(2.0d) * 15000.0d, 45.0d)), 16));
        setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi = this.n;
        if (setlimitmaxnominaltransaksi != null) {
            setlimitmaxnominaltransaksi.c();
            this.n.b(setKodeSwiftBankPenerima.b(2131231069));
            this.n = null;
        }
        Iterator<setLimitMaxNominalTransaksi> it = this.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            setLimitMaxNominalTransaksi next = it.next();
            if (next.b().c == Double.valueOf(this.f.getLatitude()).doubleValue() && next.b().a == Double.valueOf(this.f.getLongitude()).doubleValue()) {
                next.b(setKodeSwiftBankPenerima.b(2131231074));
                next.e();
                this.n = next;
                break;
            }
        }
        if (this.n == null) {
            if (this.k.size() >= 10) {
                List<setLimitMaxNominalTransaksi> list = this.k;
                list.get(list.size() - 1).d();
            }
            setNamaBankPenerima setnamabankpenerima = new setNamaBankPenerima();
            setnamabankpenerima.b(latLng).a(setKodeSwiftBankPenerima.b(2131231074));
            setnamabankpenerima.d(this.f.getBranchName());
            setnamabankpenerima.c(this.f.getBranchAddress());
            this.k.add(this.s.a(setnamabankpenerima));
            List<setLimitMaxNominalTransaksi> list2 = this.k;
            this.n = list2.get(list2.size() - 1);
        }
    }

    @OnClick({2131296396})
    public void onClickLanjut(View view) {
        if (this.f != null) {
            ((FormBankNotesActivity) getActivity()).n.c = this.f.getBranchCode();
            this.tvErrorSearch.setVisibility(8);
            this.etSearch.setBackgroundResource(2131230847);
            f();
            return;
        }
        this.tvErrorSearch.setVisibility(0);
        this.etSearch.setBackgroundResource(2131230870);
    }

    @OnClick({2131297176})
    public void onClickSearch(View view) {
        this.a.b(3);
        this.a.e(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        documentProvider.b().e(this);
        CheckOTPSessionPresenter checkOTPSessionPresenter = this.r;
        Call<OpenAccountSuccessActivity> call = checkOTPSessionPresenter.c;
        if (call != null) {
            call.cancel();
        }
        checkOTPSessionPresenter.a = null;
        onDestroy();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        ((FormBankNotesActivity) getActivity()).llMainIndicator.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i, strArr, iArr);
        TransaksiBerkalaAdapter$TransaksiBerkalaVH.c(this, i, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        realmGet$occupation realmget_occupation = this.q;
        if (realmget_occupation != null) {
            realmget_occupation.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        onStop();
        realmGet$occupation realmget_occupation = this.q;
        if (realmget_occupation != null && realmget_occupation.c()) {
            this.q.a();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        CheckOTPSessionPresenter checkOTPSessionPresenter = new CheckOTPSessionPresenter();
        this.r = checkOTPSessionPresenter;
        checkOTPSessionPresenter.a = this;
        this.l = (List) ListUtil.OneItemImmutableList.a(getArguments().getParcelable("branch"));
        ((FormBankNotesActivity) getActivity()).llMainIndicator.setVisibility(8);
        this.etFilter.addTextChangedListener(this);
        this.d = BottomSheetBehavior.a(this.llBottomSheetMain);
        this.a = BottomSheetBehavior.a(this.llBottomSheetSearch);
        this.llPeekSheet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BN3PilihCabangFragment.this.d.e(BN3PilihCabangFragment.this.llPeekSheet.getHeight(), false);
                BN3PilihCabangFragment.this.llPeekSheet.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.llBottomSheetSearch.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BN3PilihCabangFragment.this.a.e(BN3PilihCabangFragment.this.llBottomSheetSearch.getHeight(), false);
                BN3PilihCabangFragment.this.llBottomSheetSearch.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        boolean z = false;
        this.d.e(false);
        this.a.e(true);
        this.a.b(5);
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.d;
        AnonymousClass5 r0 = new BottomSheetBehavior.read() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment.5
            public final void d(View view2) {
            }

            public final void e(View view2, int i) {
            }
        };
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        bottomSheetBehavior.d.clear();
        bottomSheetBehavior.d.add(r0);
        this.etSearch.setHint(2131822059);
        int isGooglePlayServicesAvailable = realmGet$language.isGooglePlayServicesAvailable(getActivity());
        if (isGooglePlayServicesAvailable == 0) {
            z = true;
        } else if (realmGet$language.isUserRecoverableError(isGooglePlayServicesAvailable)) {
            realmGet$language.getErrorDialog(isGooglePlayServicesAvailable, getActivity(), 12376).show();
        } else {
            Toast.makeText(getContext(), "Cannot connnect to mapping Service", 0).show();
        }
        if (z) {
            realmSet$NorekPenerima realmset_norekpenerima = (realmSet$NorekPenerima) getChildFragmentManager().findFragmentById(2131297980);
            TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH transaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH = new realmSet$NegaraTujuanTransaksi() { // from class: o.TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH
                @Override // o.realmSet$NegaraTujuanTransaksi
                public final void a(realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso) {
                    BN3PilihCabangFragment.this.a(realmset_negaratujuanpenerimaiso);
                }
            };
            if (realmGet$hasManyPenerima.b()) {
                realmset_norekpenerima.a.d(transaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f = true;
                this.p = locationRequest;
                locationRequest.c = 100;
                realmGet$occupation.RemoteActionCompatParcelizer e = new realmGet$occupation.RemoteActionCompatParcelizer(getContext()).e(realmSet$AlamatLengkapPenerima.d);
                e.d.add(this);
                e.b.add(this);
                this.q = e.a();
                return;
            }
            throw new IllegalStateException("getMapAsync must be called on the main thread.");
        }
    }
}
