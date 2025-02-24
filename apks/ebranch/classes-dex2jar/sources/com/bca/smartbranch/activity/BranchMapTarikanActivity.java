package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.Point;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
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
import com.bca.smartbranch.activity.BranchMapTarikanActivity;
import com.bca.smartbranch.adapter.BranchMapROItemAdapter;
import com.bca.smartbranch.adapter.CityReservationAdapter;
import com.bca.smartbranch.adapter.KantorCabangROAdapter;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.ErrorGetBranchDialog;
import com.bca.smartbranch.dialog.ErrorGetCityListDialog;
import com.bca.smartbranch.dialog.KonfirmasiCallCabangDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.Tarikan100JutaMemberDialog;
import com.bca.smartbranch.presenter.GetBranchByCityPresenter;
import com.bca.smartbranch.presenter.GetBranchROPresenter;
import com.bca.smartbranch.presenter.GetCitySearchPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.CC14FormKartuKreditFragment_ViewBinding;
import o.InfoJenisKartuActivity_ViewBinding;
import o.InfoKursORActivity;
import o.InfoProductORActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LoginSessionActivity;
import o.OpenAccountSuccessActivity;
import o.PenggantianKartuATMActivity_ViewBinding;
import o.PenggantianKeyBCAActivity;
import o.PilihJabatanActivity;
import o.PilihKantorCabangActivity_ViewBinding;
import o.PilihKecamatanActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanTransaksiActivity;
import o.TransaksiTellerActivity;
import o.chooseValueAskOrangDatangKeCabangEvent;
import o.clickJenisIdentitas;
import o.documentProvider;
import o.getPromotion;
import o.onReservasiTellerEvent;
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
import o.setKodeSwiftBankPenerima;
import o.setKotaBankPenerima;
import o.setLimitMaxNominalTransaksi;
import o.setNamaBankPenerima;
import o.setOnHierarchyChangeListener;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BranchMapTarikanActivity.class */
public class BranchMapTarikanActivity extends BaseActivityPostLogin implements realmSet$NegaraTujuanTransaksi, GetBranchROPresenter.read, realmSet$CodewordBankPenerima, realmGet$occupation.IconCompatParcelizer, realmGet$occupation.read, realmSet$NegaraTujuanPenerimaISO.IconCompatParcelizer, realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver, realmGet$officeName<realmSet$FlagBicCode>, TextWatcher, GetCitySearchPresenter.write, GetBranchByCityPresenter.RemoteActionCompatParcelizer, TxnTellerPresenter.IconCompatParcelizer, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private Bundle B;
    private CityReservationAdapter C;
    private Location D;
    private GetBranchROPresenter E;
    private GetCitySearchPresenter F;
    private List<PenggantianKeyBCAActivity.RemoteActionCompatParcelizer> G;
    private GetBranchByCityPresenter H;
    private realmGet$occupation I;
    private LocationRequest J;
    private List<GetBranchROResponse.DetailBranch> K;
    private realmSet$NegaraTujuanPenerimaISO L;
    private GetBranchROResponse.DetailBranch M;
    private String N;
    private List<GetBranchROResponse.DetailBranch> O;
    private TxnTellerPresenter P;
    private String Q;
    private SendEmailTransactionSuccessPresenter R;
    private TxnTellerResponse.TxnDataOutput S;
    private ViewAnimator U;
    @BindView(2131296396)
    Button btnLanjut;
    @BindView(2131296799)
    CoordinatorLayout clMain;
    @BindView(2131296980)
    EditText etFilter;
    @BindView(2131297176)
    EditText etSearch;
    public ListFormTeller f;
    @BindView(2131296375)
    LinearLayout llBottomSheetSearch;
    @BindView(2131297561)
    LinearLayout llCabangTidakDitemukan;
    @BindView(2131297622)
    LinearLayout llDetailBranch;
    @BindView(2131296374)
    LinearLayout llListBranchMap;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297842)
    LinearLayout llPeekSheet;
    private BottomSheetBehavior<LinearLayout> n;
    private BottomSheetBehavior<LinearLayout> p;
    @BindString(2131822092)
    String retry;
    @BindView(2131298318)
    setOnStartEnterTransitionListener rvBranchItem;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvKantorCabang;
    private String s;
    private LatLng t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298939)
    TextView tvDistance;
    @BindView(2131299071)
    TextView tvError;
    @BindView(2131299179)
    TextView tvErrorSearch;
    @BindView(2131299476)
    TextView tvNoTelp;
    @BindView(2131298790)
    TextView tvToolbar;
    @BindString(2131822047)
    String txtToolbar;
    private KantorCabangROAdapter v;
    private setLimitMaxNominalTransaksi y;
    private BranchMapROItemAdapter z;
    private boolean u = false;
    private List<setLimitMaxNominalTransaksi> A = new ArrayList();
    private boolean q = false;
    private boolean x = true;
    private int r = 0;
    private boolean w = false;

    private void A() {
        this.llDetailBranch.setVisibility(0);
        this.llListBranchMap.setVisibility(8);
        this.p.b(5);
        TextView textView = this.tvBranchName;
        StringBuilder sb = new StringBuilder("BCA ");
        sb.append(this.M.getBranchName());
        sb.append(" (");
        sb.append(this.M.getBranchType());
        sb.append(")");
        textView.setText(sb.toString());
        this.tvBranchAddress.setText(this.M.getAddress());
        if (this.M.getPhone().isEmpty()) {
            this.tvNoTelp.setText("-");
        } else {
            this.tvNoTelp.setText(this.M.getPhone());
        }
        Location location = new Location("");
        location.setLongitude(Double.valueOf(this.M.getLongitude()).doubleValue());
        location.setLatitude(Double.valueOf(this.M.getLatitude()).doubleValue());
        Location location2 = new Location("");
        location2.setLatitude(this.t.c);
        location2.setLongitude(this.t.a);
        this.tvDistance.setText(String.format("%.02f km", Float.valueOf(location2.distanceTo(location) / 1000.0f)));
    }

    private void f(String str) {
        x();
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.onMultipleLogin
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                BranchMapTarikanActivity branchMapTarikanActivity = BranchMapTarikanActivity.this;
                ListFormTeller listFormTeller = branchMapTarikanActivity.f;
                if (listFormTeller != null) {
                    if (listFormTeller.getSetoranList() != null && branchMapTarikanActivity.f.getSetoranList().isValid()) {
                        branchMapTarikanActivity.f.getSetoranList().deleteAllFromRealm();
                    }
                    if (branchMapTarikanActivity.f.getTarikanList() != null && branchMapTarikanActivity.f.getTarikanList().isValid()) {
                        branchMapTarikanActivity.f.getTarikanList().deleteAllFromRealm();
                    }
                    if (branchMapTarikanActivity.f.getKirimanUangList() != null && branchMapTarikanActivity.f.getKirimanUangList().isValid()) {
                        branchMapTarikanActivity.f.getKirimanUangList().deleteAllFromRealm();
                    }
                    if (branchMapTarikanActivity.f.getKliringList() != null && branchMapTarikanActivity.f.getKliringList().isValid()) {
                        branchMapTarikanActivity.f.getKliringList().deleteAllFromRealm();
                    }
                    ListFormTeller listFormTeller2 = branchMapTarikanActivity.f;
                    if (listFormTeller2 != null && listFormTeller2.isValid()) {
                        branchMapTarikanActivity.f.deleteFromRealm();
                    }
                }
            }
        });
        Intent intent = new Intent(this, DetailOpenTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.S));
        intent.putExtra("email", this.s);
        intent.putExtra("no_reff", this.N);
        intent.putExtra("email_success", str);
        intent.putExtra("dataReservasiJumbes", ListUtil.OneItemImmutableList.e(this.M));
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) this);
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write, com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void B() {
        this.U.setDisplayedChild(0);
    }

    public final void C() {
        String phone = this.M.getPhone().contains(",") ? this.M.getPhone().split(",")[0] : this.M.getPhone().contains("(HUNTING)") ? this.M.getPhone().split(" ")[0] : this.M.getPhone();
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder("tel:");
        sb.append(phone);
        intent.setData(Uri.parse(sb.toString()));
        startActivity(intent);
    }

    public final void D() {
        realmSet$AlamatLengkapPenerima.b.d(this.I, this.J, this);
        realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso = this.L;
        if (realmset_negaratujuanpenerimaiso != null) {
            try {
                realmset_negaratujuanpenerimaiso.e.e(true);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        f("");
    }

    @Override // o.realmSet$NegaraTujuanTransaksi
    public final void a(realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso) {
        this.L = realmset_negaratujuanpenerimaiso;
        try {
            realmset_negaratujuanpenerimaiso.e.a(1);
            try {
                this.L.c().e.d(true);
                this.L.d(this);
                this.L.a(this);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.G != null) {
            ArrayList arrayList = new ArrayList();
            if (editable.length() > 2) {
                for (PenggantianKeyBCAActivity.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.G) {
                    if (remoteActionCompatParcelizer.c.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                        arrayList.add(remoteActionCompatParcelizer);
                    }
                }
            }
            CityReservationAdapter cityReservationAdapter = this.C;
            cityReservationAdapter.e = arrayList;
            cityReservationAdapter.a.b();
            this.rvKantorCabang.setAdapter(this.C);
            if (editable.length() <= 2 || arrayList.size() > 0) {
                this.U.setDisplayedChild(2);
            } else {
                this.U.setDisplayedChild(3);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(TxnTellerResponse txnTellerResponse) {
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
        this.O = list;
        if (list.size() > 0) {
            if (this.v == null) {
                this.v = new KantorCabangROAdapter(this, this.O, this.D);
            }
            this.v.a(this.O);
            this.rvKantorCabang.setAdapter(this.v);
            this.U.setDisplayedChild(2);
            return;
        }
        this.U.setDisplayedChild(1);
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

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        this.S = txnTellerResponse.getTxnDataOutput();
        String imei = this.m != null ? this.m.getImei() : Settings.Secure.getString(getContentResolver(), "android_id");
        if (this.m != null) {
            this.m.getSessionId();
        }
        String str = this.m != null ? "N" : "Y";
        String email = this.m != null ? this.m.getEmail() : "";
        String str2 = email;
        if (email.isEmpty()) {
            if (!this.f.getSetoranList().isEmpty()) {
                str2 = this.f.getSetoranList().get(0).getSenderEmail();
            } else {
                str2 = email;
                if (!this.f.getTarikanList().isEmpty()) {
                    str2 = this.f.getTarikanList().get(0).getEmail();
                }
            }
        }
        this.R.a(getPromotion.e(this.m, str, imei, str2), str2, new LoginSessionActivity(txnTellerResponse.getTxnDataOutput().getNoReff()));
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
        this.x = false;
        this.U.setDisplayedChild(2);
        x();
        this.C = new CityReservationAdapter(this);
        this.rvKantorCabang.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvKantorCabang.setAdapter(this.C);
        if (!(penggantianKartuATMActivity_ViewBinding.c == null || penggantianKartuATMActivity_ViewBinding.c.isEmpty())) {
            this.G = new ArrayList();
            for (String str : penggantianKartuATMActivity_ViewBinding.c) {
                PenggantianKeyBCAActivity.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new PenggantianKeyBCAActivity.RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer.c = str;
                this.G.add(remoteActionCompatParcelizer);
            }
        }
    }

    @Override // o.realmGet$officeName
    public /* synthetic */ void c(realmSet$FlagBicCode realmset_flagbiccode) {
        Status e = realmset_flagbiccode.e();
        int i = e.h;
        if (i == 0) {
            onReservasiTellerEvent.c(this);
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
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            if (new LatLng(Double.parseDouble(this.K.get(i2).getLatitude()), Double.parseDouble(this.K.get(i2).getLongitude())).equals(b)) {
                this.M = this.K.get(i2);
            }
        }
        Iterator<GetBranchROResponse.DetailBranch> it = this.K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GetBranchROResponse.DetailBranch next = it.next();
            if (setlimitmaxnominaltransaksi.b().c == Double.valueOf(next.getLatitude()).doubleValue() && setlimitmaxnominaltransaksi.b().a == Double.valueOf(next.getLongitude()).doubleValue()) {
                this.z.a(i);
                this.rvBranchItem.c(i);
                break;
            }
            i++;
        }
        A();
        return true;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        f("");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.B = getIntent().getExtras();
        this.U = (ViewAnimator) findViewById(2131299750);
        this.btnLanjut.setVisibility(8);
        this.n = BottomSheetBehavior.a(this.llListBranchMap);
        this.p = BottomSheetBehavior.a(this.llBottomSheetSearch);
        GetBranchROPresenter getBranchROPresenter = new GetBranchROPresenter();
        this.E = getBranchROPresenter;
        getBranchROPresenter.e = this;
        GetCitySearchPresenter getCitySearchPresenter = new GetCitySearchPresenter();
        this.F = getCitySearchPresenter;
        getCitySearchPresenter.a = this;
        GetBranchByCityPresenter getBranchByCityPresenter = new GetBranchByCityPresenter();
        this.H = getBranchByCityPresenter;
        getBranchByCityPresenter.b = this;
        TxnTellerPresenter txnTellerPresenter = new TxnTellerPresenter();
        this.P = txnTellerPresenter;
        txnTellerPresenter.d = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.R = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        this.O = new ArrayList();
        this.K = new ArrayList();
        this.etFilter.addTextChangedListener(this);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText(this.txtToolbar);
        this.s = this.B.getString("email");
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.simpan
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                BranchMapTarikanActivity.this.f = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
            }
        });
        this.llPeekSheet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BranchMapTarikanActivity.this.n.e(BranchMapTarikanActivity.this.llPeekSheet.getHeight(), false);
                BranchMapTarikanActivity.this.llPeekSheet.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.llBottomSheetSearch.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BranchMapTarikanActivity.this.p.e(BranchMapTarikanActivity.this.llBottomSheetSearch.getHeight(), false);
                BranchMapTarikanActivity.this.llBottomSheetSearch.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        boolean z = false;
        this.n.e(false);
        this.p.e(true);
        this.p.b(5);
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.n;
        AnonymousClass5 r0 = new BottomSheetBehavior.read() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity.5
            public final void d(View view) {
            }

            public final void e(View view, int i) {
            }
        };
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        bottomSheetBehavior.d.clear();
        bottomSheetBehavior.d.add(r0);
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.p;
        AnonymousClass1 r02 = new BottomSheetBehavior.read() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity.1
            public final void d(View view) {
            }

            public final void e(View view, int i) {
                if (i == 5) {
                    BranchMapTarikanActivity.this.etFilter.setText("");
                } else if (i == 3 && BranchMapTarikanActivity.this.G == null) {
                    GetCitySearchPresenter getCitySearchPresenter2 = BranchMapTarikanActivity.this.F;
                    String e = getPromotion.e(BranchMapTarikanActivity.this.m);
                    new InfoProductORActivity(BranchMapTarikanActivity.this.m.getEmail(), BranchMapTarikanActivity.this.m.getSessionId(), "");
                    getCitySearchPresenter2.a(e);
                }
            }
        };
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        bottomSheetBehavior2.d.clear();
        bottomSheetBehavior2.d.add(r02);
        this.U.setDisplayedChild(2);
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
                this.J = locationRequest;
                locationRequest.c = 100;
                realmGet$occupation.RemoteActionCompatParcelizer e = new realmGet$occupation.RemoteActionCompatParcelizer(this).e(realmSet$AlamatLengkapPenerima.d);
                e.d.add(this);
                e.b.add(this);
                this.I = e.a();
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
        x();
        if (this.x) {
            new Tarikan100JutaMemberDialog().show(l(), "Tarikan100JutaMemberDialog");
        }
        this.x = false;
        this.K = list;
        if (!this.A.isEmpty()) {
            this.A.clear();
        }
        for (GetBranchROResponse.DetailBranch detailBranch : this.K) {
            LatLng latLng = new LatLng(Double.parseDouble(detailBranch.getLatitude()), Double.parseDouble(detailBranch.getLongitude()));
            setNamaBankPenerima setnamabankpenerima = new setNamaBankPenerima();
            setnamabankpenerima.b(latLng).a(setKodeSwiftBankPenerima.b(2131231069));
            setnamabankpenerima.d(detailBranch.getBranchName());
            setnamabankpenerima.c(detailBranch.getAddress());
            this.A.add(this.L.a(setnamabankpenerima));
        }
        this.v = new KantorCabangROAdapter(this, this.O, this.D);
        this.z.a(this.K);
        if (!this.K.isEmpty() && this.n.u != 3) {
            this.n.b(3);
        }
        setKotaBankPenerima setkotabankpenerima = new setKotaBankPenerima();
        LatLng latLng2 = this.t;
        if (latLng2 != null) {
            setkotabankpenerima.b = latLng2;
            setkotabankpenerima.c = 0.0f;
            setkotabankpenerima.e = 10000.0d;
            setkotabankpenerima.a = Color.parseColor("#2b0d5cab");
            this.L.c(setkotabankpenerima);
            this.L.a(realmSet$NamaPenerima.c(new LatLngBounds(CC14FormKartuKreditFragment_ViewBinding.a(this.t, Math.sqrt(2.0d) * 10000.0d, 225.0d), CC14FormKartuKreditFragment_ViewBinding.a(this.t, Math.sqrt(2.0d) * 10000.0d, 45.0d)), 175));
            realmSet$NoIBANPenerima e = this.L.e();
            Point c = e.c(this.t);
            this.L.b(realmSet$NamaPenerima.c(e.e(new Point(c.x, c.y + (this.clMain.getHeight() / 4)))));
            if (this.M != null) {
                for (setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi : this.A) {
                    if (setlimitmaxnominaltransaksi.b().c == Double.valueOf(this.M.getLatitude()).doubleValue() && setlimitmaxnominaltransaksi.b().a == Double.valueOf(this.M.getLongitude()).doubleValue()) {
                        setlimitmaxnominaltransaksi.b(setKodeSwiftBankPenerima.b(2131231074));
                        this.y = setlimitmaxnominaltransaksi;
                    }
                }
                return;
            }
            return;
        }
        throw new NullPointerException("center must not be null.");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        f(str);
    }

    @Override // o.realmGet$resCountry
    public void e(int i) {
        Toast.makeText(this, "Suspended", 0).show();
    }

    @Override // o.realmSet$CodewordBankPenerima
    public final void e(Location location) {
        if (location != null) {
            this.t = new LatLng(location.getLatitude(), location.getLongitude());
            Location location2 = new Location("");
            this.D = location2;
            location2.setLatitude(this.t.c);
            this.D.setLongitude(this.t.a);
            this.z = new BranchMapROItemAdapter(this, this.K, this.D);
            this.rvBranchItem.setLayoutManager(new LinearLayoutManager(0, false));
            this.rvBranchItem.setAdapter(this.z);
            if (this.r <= 0) {
                CameraPosition.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new CameraPosition.RemoteActionCompatParcelizer();
                LatLng latLng = this.t;
                if (latLng != null) {
                    remoteActionCompatParcelizer.a = latLng;
                    remoteActionCompatParcelizer.b = 15.0f;
                    this.L.a(realmSet$NamaPenerima.a(new CameraPosition(remoteActionCompatParcelizer.a, remoteActionCompatParcelizer.b, remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.d)));
                    if (this.q) {
                        Location location3 = new Location("");
                        location3.setLongitude(Double.valueOf(this.M.getLongitude()).doubleValue());
                        location3.setLatitude(Double.valueOf(this.M.getLatitude()).doubleValue());
                        this.tvDistance.setText(String.format("%.02f km", Float.valueOf(this.D.distanceTo(location3) / 1000.0f)));
                        this.llDetailBranch.setVisibility(0);
                        this.llListBranchMap.setVisibility(8);
                        this.p.b(5);
                        TextView textView = this.tvBranchName;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.M.getBranchName());
                        sb.append(" (");
                        sb.append(this.M.getBranchType());
                        sb.append(")");
                        textView.setText(sb.toString());
                        this.tvBranchAddress.setText(this.M.getAddress());
                        if (this.M.getPhone().isEmpty()) {
                            this.tvNoTelp.setText("-");
                        } else {
                            this.tvNoTelp.setText(this.M.getPhone());
                        }
                        this.q = false;
                    }
                    this.E.a(getPromotion.e(this.m), new InfoKursORActivity(this.m.getEmail(), this.m.getSessionId(), String.valueOf(this.t.a), String.valueOf(this.t.c), "", ""));
                    this.r++;
                    return;
                }
                throw new NullPointerException("location must not be null.");
            }
        }
    }

    @Override // o.realmGet$resCountry
    public void e(Bundle bundle) {
        realmSet$FlagHubunganKeuanganTransaksi$MediaBrowserCompat$CustomActionResultReceiver realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver = new realmSet$FlagHubunganKeuanganTransaksi$MediaBrowserCompat$CustomActionResultReceiver();
        LocationRequest locationRequest = this.J;
        if (locationRequest != null) {
            realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.d.add(locationRequest);
        }
        realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.e = true;
        realmSet$AlamatLengkapPenerima.e.c(this.I, new realmSet$FlagHubunganKeuanganTransaksi(realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.d, realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.e, realmset_flaghubungankeuangantransaksi_mediabrowsercompat_customactionresultreceiver.b, null)).e(this);
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
        this.U.setDisplayedChild(2);
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetCityListDialog errorGetCityListDialog = new ErrorGetCityListDialog();
        errorGetCityListDialog.setArguments(bundle);
        errorGetCityListDialog.show(l(), "ErrorGetCityListDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
    public final void g_() {
        if (this.x) {
            z();
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write
    public final void i(String str) {
        this.U.setDisplayedChild(2);
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetCityListDialog errorGetCityListDialog = new ErrorGetCityListDialog();
        errorGetCityListDialog.setArguments(bundle);
        errorGetCityListDialog.show(l(), "ErrorGetCityListDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void i_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write
    public final void j(String str) {
        this.U.setDisplayedChild(2);
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetCityListDialog errorGetCityListDialog = new ErrorGetCityListDialog();
        errorGetCityListDialog.setArguments(bundle);
        errorGetCityListDialog.show(l(), "ErrorGetCityListDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void l(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            onReservasiTellerEvent.c(this);
        } else {
            k();
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        if (this.llDetailBranch.getVisibility() == 0) {
            this.llDetailBranch.setVisibility(8);
            this.llListBranchMap.setVisibility(0);
        } else if (this.p.u == 3) {
            this.p.e(true);
            this.p.b(5);
        } else {
            onBackPressed();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBranch(final PilihKecamatanActivity pilihKecamatanActivity) {
        getPromotion.d(this);
        new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = true;
                BranchMapTarikanActivity.this.p.e(true);
                BranchMapTarikanActivity.this.p.b(5);
                BranchMapTarikanActivity.this.M = pilihKecamatanActivity.c;
                if (BranchMapTarikanActivity.this.K.size() > 0) {
                    Iterator it = BranchMapTarikanActivity.this.K.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        GetBranchROResponse.DetailBranch detailBranch = (GetBranchROResponse.DetailBranch) it.next();
                        if (detailBranch.getAddress() != null && detailBranch.getAddress().equals(BranchMapTarikanActivity.this.M.getAddress())) {
                            BranchMapTarikanActivity.this.M = detailBranch;
                            break;
                        }
                    }
                    if (!z) {
                        BranchMapTarikanActivity.this.K.add(pilihKecamatanActivity.c);
                        BranchMapTarikanActivity.this.z.a(BranchMapTarikanActivity.this.K);
                    }
                } else {
                    BranchMapTarikanActivity.this.K.add(pilihKecamatanActivity.c);
                    BranchMapTarikanActivity.this.z.a(BranchMapTarikanActivity.this.K);
                }
                BranchMapTarikanActivity.this.z.a(BranchMapTarikanActivity.this.K.indexOf(BranchMapTarikanActivity.this.M));
                BranchMapTarikanActivity.this.rvBranchItem.c(BranchMapTarikanActivity.this.K.indexOf(BranchMapTarikanActivity.this.M));
                documentProvider.b().d(new PilihKantorCabangActivity_ViewBinding(BranchMapTarikanActivity.this.K.indexOf(BranchMapTarikanActivity.this.M)));
            }
        }, 200);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBranchMapItem(PilihKantorCabangActivity_ViewBinding pilihKantorCabangActivity_ViewBinding) {
        this.M = this.K.get(pilihKantorCabangActivity_ViewBinding.a);
        this.tvErrorSearch.setVisibility(8);
        this.etSearch.setBackgroundResource(2131230847);
        LatLng latLng = new LatLng(Double.valueOf(this.M.getLatitude()).doubleValue(), Double.valueOf(this.M.getLongitude()).doubleValue());
        this.L.a(realmSet$NamaPenerima.c(new LatLngBounds(CC14FormKartuKreditFragment_ViewBinding.a(latLng, Math.sqrt(2.0d) * 10000.0d, 225.0d), CC14FormKartuKreditFragment_ViewBinding.a(latLng, Math.sqrt(2.0d) * 10000.0d, 45.0d)), 175));
        realmSet$NoIBANPenerima e = this.L.e();
        Point c = e.c(latLng);
        this.L.b(realmSet$NamaPenerima.c(e.e(new Point(c.x, c.y + (this.clMain.getHeight() / 4)))));
        setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi = this.y;
        if (setlimitmaxnominaltransaksi != null) {
            setlimitmaxnominaltransaksi.c();
            this.y.b(setKodeSwiftBankPenerima.b(2131231069));
            this.y = null;
        }
        Iterator<setLimitMaxNominalTransaksi> it = this.A.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            setLimitMaxNominalTransaksi next = it.next();
            if (next.b().c == Double.valueOf(this.M.getLatitude()).doubleValue() && next.b().a == Double.valueOf(this.M.getLongitude()).doubleValue()) {
                next.b(setKodeSwiftBankPenerima.b(2131231074));
                next.e();
                this.y = next;
                break;
            }
        }
        if (this.y == null) {
            setNamaBankPenerima setnamabankpenerima = new setNamaBankPenerima();
            setnamabankpenerima.b(latLng).a(setKodeSwiftBankPenerima.b(2131231074));
            setnamabankpenerima.d(this.M.getBranchName());
            setnamabankpenerima.c(this.M.getAddress());
            this.A.add(this.L.a(setnamabankpenerima));
            List<setLimitMaxNominalTransaksi> list = this.A;
            this.y = list.get(list.size() - 1);
        }
        A();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onCityReservationChosenEvent(TarikanTransaksiActivity tarikanTransaksiActivity) {
        getPromotion.d(this);
        this.etFilter.setText(tarikanTransaksiActivity.d);
        this.etFilter.setSelection(tarikanTransaksiActivity.d.length());
        this.H.c(getPromotion.e(this.m), new InfoJenisKartuActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), tarikanTransaksiActivity.d, "", ""));
    }

    @OnClick({2131296390})
    public void onClickHubungiCabang() {
        new KonfirmasiCallCabangDialog().show(l(), "KonfirmasiCallCabangDialog");
    }

    @OnClick({2131297176})
    public void onClickSearch(View view) {
        this.p.b(3);
        this.p.e(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d28  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0e5f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0e84  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0eb8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0310  */
    @butterknife.OnClick({2131296447})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onClickSelesai(android.view.View r8) {
        /*
        // Method dump skipped, instructions count: 4708
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BranchMapTarikanActivity.onClickSelesai(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetBranchROPresenter getBranchROPresenter = this.E;
        Call<OpenAccountSuccessActivity<GetBranchROResponse>> call = getBranchROPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getBranchROPresenter.e = null;
        GetCitySearchPresenter getCitySearchPresenter = this.F;
        Call<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> call2 = getCitySearchPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        getCitySearchPresenter.a = null;
        GetBranchByCityPresenter getBranchByCityPresenter = this.H;
        Call<OpenAccountSuccessActivity<GetBranchROResponse>> call3 = getBranchByCityPresenter.c;
        if (call3 != null) {
            call3.cancel();
        }
        getBranchByCityPresenter.b = null;
        TxnTellerPresenter txnTellerPresenter = this.P;
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call4 = txnTellerPresenter.e;
        if (call4 != null) {
            call4.cancel();
        }
        txnTellerPresenter.d = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.R;
        Call<OpenAccountSuccessActivity<Object>> call5 = sendEmailTransactionSuccessPresenter.a;
        if (call5 != null) {
            call5.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onExitReservasi(TransaksiTellerActivity transaksiTellerActivity) {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetBranchEvent(chooseValueAskOrangDatangKeCabangEvent choosevalueaskorangdatangkecabangevent) {
        this.E.a(getPromotion.e(this.m), new InfoKursORActivity(this.m.getEmail(), this.m.getSessionId(), String.valueOf(this.t.a), String.valueOf(this.t.c), "", ""));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetCityListEvent(clickJenisIdentitas clickjenisidentitas) {
        if (this.G == null) {
            GetCitySearchPresenter getCitySearchPresenter = this.F;
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
        onReservasiTellerEvent.e(this, i, iArr);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onStart() {
        onStart();
        realmGet$occupation realmget_occupation = this.I;
        if (realmget_occupation != null) {
            realmget_occupation.d();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onStop() {
        onStop();
        realmGet$occupation realmget_occupation = this.I;
        if (realmget_occupation != null && realmget_occupation.c()) {
            this.I.a();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "BranchMapTarikanActivity";
        this.j = "BranchMapTarikanActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492902;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        GetCitySearchPresenter getCitySearchPresenter = this.F;
        String e = getPromotion.e(this.m);
        new InfoProductORActivity(this.m.getEmail(), this.m.getSessionId(), "");
        getCitySearchPresenter.a(e);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeCallCabangEvent(PilihJabatanActivity pilihJabatanActivity) {
        onReservasiTellerEvent.e(this);
    }

    @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void t() {
        this.U.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetBranchROPresenter.read
    public final void u() {
        x();
    }

    @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void v() {
        this.U.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
    public final void y() {
        this.U.setDisplayedChild(1);
    }
}
