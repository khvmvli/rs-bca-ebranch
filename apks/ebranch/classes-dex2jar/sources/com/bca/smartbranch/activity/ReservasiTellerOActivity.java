package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.ReservasiTellerOActivity;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import io.realm.ImportFlag;
import io.realm.Realm;
import java.util.List;
import o.InfoCodewordORActivity_ViewBinding;
import o.InfoProductORActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailMultiCurrencyBCA;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiTellerOActivity.class */
public class ReservasiTellerOActivity extends BaseActivityPostLogin implements GetEstimasiReservasiPresenter.read, GetHBPresenter.write {
    @BindView(2131296399)
    ImageButton btnMinusBankNotes;
    @BindView(2131296404)
    ImageButton btnMinusKirimanUang;
    @BindView(2131296405)
    ImageButton btnMinusKliring;
    @BindView(2131296406)
    ImageButton btnMinusOutwardRemittance;
    @BindView(2131296408)
    ImageButton btnMinusPemindahbukuan;
    @BindView(2131296412)
    ImageButton btnMinusSetoran;
    @BindView(2131296413)
    ImageButton btnMinusSetoranPajak;
    @BindView(2131296414)
    ImageButton btnMinusTarikan;
    @BindView(2131296422)
    ImageButton btnPlusBankNotes;
    @BindView(2131296427)
    ImageButton btnPlusKirimanUang;
    @BindView(2131296428)
    ImageButton btnPlusKliring;
    @BindView(2131296429)
    ImageButton btnPlusOutwardRemittance;
    @BindView(2131296431)
    ImageButton btnPlusPemindahbukuan;
    @BindView(2131296435)
    ImageButton btnPlusSetoran;
    @BindView(2131296436)
    ImageButton btnPlusSetoranPajak;
    @BindView(2131296437)
    ImageButton btnPlusTarikan;
    public ListFormTeller f;
    @BindView(2131297534)
    LinearLayout llBankNotes;
    @BindView(2131297725)
    LinearLayout llKirimanUang;
    @BindView(2131297727)
    LinearLayout llKliring;
    @BindView(2131297839)
    LinearLayout llOutwardRemittance;
    @BindView(2131297848)
    LinearLayout llPemindahbukuan;
    @BindView(2131297880)
    LinearLayout llSetoran;
    @BindView(2131297883)
    LinearLayout llSetoranPajak;
    @BindView(2131297911)
    LinearLayout llTarikan;
    private GetEstimasiReservasiPresenter n;
    private int p;
    private int q;
    private String r = "001";
    private ViewAnimator s;
    private GetHBPresenter t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299226)
    TextView tvErrorMessageTransaksi;
    @BindView(2131299236)
    TextView tvEstimasiBankNotes;
    @BindView(2131299241)
    TextView tvEstimasiKirimanUang;
    @BindView(2131299242)
    TextView tvEstimasiKliring;
    @BindView(2131299243)
    TextView tvEstimasiOutwardRemittance;
    @BindView(2131299245)
    TextView tvEstimasiPemindahbukuan;
    @BindView(2131299249)
    TextView tvEstimasiSetoran;
    @BindView(2131299250)
    TextView tvEstimasiSetoranPajak;
    @BindView(2131299251)
    TextView tvEstimasiTarikan;
    @BindView(2131299319)
    TextView tvJumlahBankNotes;
    @BindView(2131299324)
    TextView tvJumlahKirimanUang;
    @BindView(2131299325)
    TextView tvJumlahKliring;
    @BindView(2131299326)
    TextView tvJumlahOutwardRemittance;
    @BindView(2131299329)
    TextView tvJumlahPemindahbukuan;
    @BindView(2131299333)
    TextView tvJumlahSetoran;
    @BindView(2131299334)
    TextView tvJumlahSetoranPajak;
    @BindView(2131299335)
    TextView tvJumlahTarikan;
    @BindView(2131298790)
    TextView tvToolbar;
    @BindView(2131299680)
    TextView tvTotalEstimasiTransaksi;
    @BindView(2131299686)
    TextView tvTotalTransaksi;
    @BindView(2131299755)
    View viewBankNotes;
    @BindView(2131299762)
    View viewKirimanUang;
    @BindView(2131299763)
    View viewKliring;
    @BindView(2131299766)
    View viewOutwardRemittance;
    @BindView(2131299770)
    View viewPemindahbukuan;
    @BindView(2131299777)
    View viewSetoran;
    @BindView(2131299778)
    View viewSetoranPajak;
    @BindView(2131299779)
    View viewTarikan;

    public static /* synthetic */ void a(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PEMESANAN_MATA_UANG_ASING).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void b(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.TARIKAN_TUNAI).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void d(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.KIRIMAN_UANG).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void e(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.SETORAN_TUNAI).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void g(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PEMINDAHBUKUAN).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void h(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.KLIRING).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void i(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.OUTWARD_REMITTANCE).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void j(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.SETORAN_PAJAK).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    private void t() {
        this.p = (Integer.parseInt(this.tvEstimasiSetoran.getText().toString()) * Integer.parseInt(this.tvJumlahSetoran.getText().toString())) + (Integer.parseInt(this.tvEstimasiTarikan.getText().toString()) * Integer.parseInt(this.tvJumlahTarikan.getText().toString())) + (Integer.parseInt(this.tvEstimasiBankNotes.getText().toString()) * Integer.parseInt(this.tvJumlahBankNotes.getText().toString())) + (Integer.parseInt(this.tvEstimasiKirimanUang.getText().toString()) * Integer.parseInt(this.tvJumlahKirimanUang.getText().toString())) + (Integer.parseInt(this.tvEstimasiKliring.getText().toString()) * Integer.parseInt(this.tvJumlahKliring.getText().toString())) + (Integer.parseInt(this.tvEstimasiOutwardRemittance.getText().toString()) * Integer.parseInt(this.tvJumlahOutwardRemittance.getText().toString())) + (Integer.parseInt(this.tvEstimasiPemindahbukuan.getText().toString()) * Integer.parseInt(this.tvJumlahPemindahbukuan.getText().toString())) + (Integer.parseInt(this.tvEstimasiSetoranPajak.getText().toString()) * Integer.parseInt(this.tvJumlahSetoranPajak.getText().toString()));
        int parseInt = Integer.parseInt(this.tvJumlahSetoran.getText().toString()) + Integer.parseInt(this.tvJumlahTarikan.getText().toString()) + Integer.parseInt(this.tvJumlahBankNotes.getText().toString()) + Integer.parseInt(this.tvJumlahKirimanUang.getText().toString()) + Integer.parseInt(this.tvJumlahKliring.getText().toString()) + Integer.parseInt(this.tvJumlahOutwardRemittance.getText().toString()) + Integer.parseInt(this.tvJumlahPemindahbukuan.getText().toString()) + Integer.parseInt(this.tvJumlahSetoranPajak.getText().toString());
        this.q = parseInt;
        this.tvTotalTransaksi.setText(String.valueOf(parseInt));
        TextView textView = this.tvTotalEstimasiTransaksi;
        StringBuilder sb = new StringBuilder();
        sb.append(this.p);
        sb.append(" menit");
        textView.setText(sb.toString());
        if (this.q < 5) {
            this.btnPlusSetoran.setClickable(true);
            this.btnPlusTarikan.setClickable(true);
            this.btnPlusBankNotes.setClickable(true);
            this.btnPlusKirimanUang.setClickable(true);
            this.btnPlusKliring.setClickable(true);
            this.btnPlusOutwardRemittance.setClickable(true);
            this.btnPlusPemindahbukuan.setClickable(true);
            this.btnPlusSetoranPajak.setClickable(true);
            this.btnPlusSetoran.setImageResource(2131231291);
            this.btnPlusTarikan.setImageResource(2131231291);
            this.btnPlusBankNotes.setImageResource(2131231291);
            this.btnPlusKirimanUang.setImageResource(2131231291);
            this.btnPlusKliring.setImageResource(2131231291);
            this.btnPlusOutwardRemittance.setImageResource(2131231291);
            this.btnPlusPemindahbukuan.setImageResource(2131231291);
            this.btnPlusSetoranPajak.setImageResource(2131231291);
            return;
        }
        this.btnPlusSetoran.setClickable(false);
        this.btnPlusTarikan.setClickable(false);
        this.btnPlusBankNotes.setClickable(false);
        this.btnPlusKirimanUang.setClickable(false);
        this.btnPlusKliring.setClickable(false);
        this.btnPlusOutwardRemittance.setClickable(false);
        this.btnPlusPemindahbukuan.setClickable(false);
        this.btnPlusSetoranPajak.setClickable(false);
        this.btnPlusSetoran.setImageResource(2131231292);
        this.btnPlusTarikan.setImageResource(2131231292);
        this.btnPlusBankNotes.setImageResource(2131231292);
        this.btnPlusKirimanUang.setImageResource(2131231292);
        this.btnPlusKliring.setImageResource(2131231292);
        this.btnPlusOutwardRemittance.setImageResource(2131231292);
        this.btnPlusPemindahbukuan.setImageResource(2131231292);
        this.btnPlusSetoranPajak.setImageResource(2131231292);
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void b(String str) {
        this.tvErrorMessage.setText(str);
        this.s.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void b(List<detailMultiCurrencyBCA.IconCompatParcelizer> list) {
        boolean z = false;
        for (detailMultiCurrencyBCA.IconCompatParcelizer iconCompatParcelizer : list) {
            boolean z2 = z;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.SETORAN_TUNAI)) {
                z2 = z;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llSetoran.setVisibility(0);
                    this.viewSetoran.setVisibility(0);
                    this.tvEstimasiSetoran.setText(iconCompatParcelizer.e.b);
                    z2 = true;
                }
            }
            boolean z3 = z2;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.TARIKAN_TUNAI)) {
                z3 = z2;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llTarikan.setVisibility(0);
                    this.viewTarikan.setVisibility(0);
                    this.tvEstimasiTarikan.setText(iconCompatParcelizer.e.b);
                    z3 = true;
                }
            }
            boolean z4 = z3;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.PEMESANAN_MATA_UANG_ASING)) {
                z4 = z3;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llBankNotes.setVisibility(0);
                    this.viewBankNotes.setVisibility(0);
                    this.tvEstimasiBankNotes.setText(iconCompatParcelizer.e.b);
                    z4 = true;
                }
            }
            boolean z5 = z4;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.KIRIMAN_UANG)) {
                z5 = z4;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llKirimanUang.setVisibility(0);
                    this.viewKirimanUang.setVisibility(0);
                    this.tvEstimasiKirimanUang.setText(iconCompatParcelizer.e.b);
                    z5 = true;
                }
            }
            boolean z6 = z5;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.KLIRING)) {
                z6 = z5;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llKliring.setVisibility(0);
                    this.viewKliring.setVisibility(0);
                    this.tvEstimasiKliring.setText(iconCompatParcelizer.e.b);
                    z6 = true;
                }
            }
            boolean z7 = z6;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.OUTWARD_REMITTANCE)) {
                z7 = z6;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llOutwardRemittance.setVisibility(0);
                    this.viewOutwardRemittance.setVisibility(0);
                    this.tvEstimasiOutwardRemittance.setText(iconCompatParcelizer.e.b);
                    z7 = true;
                }
            }
            boolean z8 = z7;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.PEMINDAHBUKUAN)) {
                z8 = z7;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llPemindahbukuan.setVisibility(0);
                    this.viewPemindahbukuan.setVisibility(0);
                    this.tvEstimasiPemindahbukuan.setText(iconCompatParcelizer.e.b);
                    z8 = true;
                }
            }
            z = z8;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.SETORAN_PAJAK)) {
                z = z8;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llSetoranPajak.setVisibility(0);
                    this.viewSetoranPajak.setVisibility(0);
                    this.tvEstimasiSetoranPajak.setText(iconCompatParcelizer.e.b);
                    z = true;
                }
            }
        }
        if (z) {
            this.s.setDisplayedChild(2);
            return;
        }
        this.tvErrorMessage.setText("Reservasi Teller Online kosong");
        this.s.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.s = (ViewAnimator) findViewById(2131299749);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText("Reservasi Teller");
        this.btnMinusSetoran.setClickable(false);
        this.btnMinusTarikan.setClickable(false);
        this.btnMinusBankNotes.setClickable(false);
        this.btnMinusKirimanUang.setClickable(false);
        this.btnMinusKliring.setClickable(false);
        this.btnMinusOutwardRemittance.setClickable(false);
        this.btnMinusPemindahbukuan.setClickable(false);
        this.btnMinusSetoranPajak.setClickable(false);
        GetEstimasiReservasiPresenter getEstimasiReservasiPresenter = new GetEstimasiReservasiPresenter();
        this.n = getEstimasiReservasiPresenter;
        getEstimasiReservasiPresenter.d = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.t = getHBPresenter;
        getHBPresenter.e = this;
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilTarikanActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                realm.where(ReservasiOnline.class).findAll().deleteAllFromRealm();
            }
        });
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilTarikanActivity
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ReservasiTellerOActivity reservasiTellerOActivity = ReservasiTellerOActivity.this;
                ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                reservasiTellerOActivity.f = listFormTeller;
                if (listFormTeller != null && listFormTeller.getCountAll() > 0 && reservasiTellerOActivity.f.isValid()) {
                    reservasiTellerOActivity.f.deleteFromRealm();
                }
            }
        });
        this.n.b(new InfoCodewordORActivity_ViewBinding(this.h, this.m.getImei(), this.m.getSessionId(), "Teller"));
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.s.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void e(String str) {
        this.tvErrorMessage.setText(str);
        this.s.setDisplayedChild(1);
    }

    @OnClick({2131296412, 2131296414, 2131296399, 2131296404, 2131296405, 2131296406, 2131296408, 2131296413})
    public void onClickMinus(View view) {
        switch (view.getId()) {
            case 2131296399:
                if (this.btnMinusBankNotes.isClickable()) {
                    int parseInt = Integer.parseInt(this.tvJumlahBankNotes.getText().toString()) - 1;
                    this.tvJumlahBankNotes.setText(String.valueOf(parseInt));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilEChannelNotificationActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.a(realm);
                        }
                    });
                    if (parseInt == 0) {
                        this.btnMinusBankNotes.setClickable(false);
                        this.btnMinusBankNotes.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296404:
                if (this.btnMinusKirimanUang.isClickable()) {
                    int parseInt2 = Integer.parseInt(this.tvJumlahKirimanUang.getText().toString()) - 1;
                    this.tvJumlahKirimanUang.setText(String.valueOf(parseInt2));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.inputChangeAlasan
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.d(realm);
                        }
                    });
                    if (parseInt2 == 0) {
                        this.btnMinusKirimanUang.setClickable(false);
                        this.btnMinusKirimanUang.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296405:
                if (this.btnMinusKliring.isClickable()) {
                    int parseInt3 = Integer.parseInt(this.tvJumlahKliring.getText().toString()) - 1;
                    this.tvJumlahKliring.setText(String.valueOf(parseInt3));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilKliringActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.h(realm);
                        }
                    });
                    if (parseInt3 == 0) {
                        this.btnMinusKliring.setClickable(false);
                        this.btnMinusKliring.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296406:
                if (this.btnMinusOutwardRemittance.isClickable()) {
                    int parseInt4 = Integer.parseInt(this.tvJumlahOutwardRemittance.getText().toString()) - 1;
                    this.tvJumlahOutwardRemittance.setText(String.valueOf(parseInt4));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilORActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.i(realm);
                        }
                    });
                    if (parseInt4 == 0) {
                        this.btnMinusOutwardRemittance.setClickable(false);
                        this.btnMinusOutwardRemittance.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296408:
                if (this.btnMinusPemindahbukuan.isClickable()) {
                    int parseInt5 = Integer.parseInt(this.tvJumlahPemindahbukuan.getText().toString()) - 1;
                    this.tvJumlahPemindahbukuan.setText(String.valueOf(parseInt5));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilNotificationActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.g(realm);
                        }
                    });
                    if (parseInt5 == 0) {
                        this.btnMinusPemindahbukuan.setClickable(false);
                        this.btnMinusPemindahbukuan.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296412:
                if (this.btnMinusSetoran.isClickable()) {
                    int parseInt6 = Integer.parseInt(this.tvJumlahSetoran.getText().toString()) - 1;
                    this.tvJumlahSetoran.setText(String.valueOf(parseInt6));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilKliringActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.e(realm);
                        }
                    });
                    if (parseInt6 == 0) {
                        this.btnMinusSetoran.setClickable(false);
                        this.btnMinusSetoran.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296413:
                if (this.btnMinusSetoranPajak.isClickable()) {
                    int parseInt7 = Integer.parseInt(this.tvJumlahSetoranPajak.getText().toString()) - 1;
                    this.tvJumlahSetoranPajak.setText(String.valueOf(parseInt7));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilORNotificationActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.j(realm);
                        }
                    });
                    if (parseInt7 == 0) {
                        this.btnMinusSetoranPajak.setClickable(false);
                        this.btnMinusSetoranPajak.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296414:
                if (this.btnMinusTarikan.isClickable()) {
                    int parseInt8 = Integer.parseInt(this.tvJumlahTarikan.getText().toString()) - 1;
                    this.tvJumlahTarikan.setText(String.valueOf(parseInt8));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilTellerActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiTellerOActivity.b(realm);
                        }
                    });
                    if (parseInt8 == 0) {
                        this.btnMinusTarikan.setClickable(false);
                        this.btnMinusTarikan.setImageResource(2131231250);
                        break;
                    }
                }
                break;
        }
        t();
    }

    @OnClick({2131296435, 2131296437, 2131296422, 2131296427, 2131296428, 2131296429, 2131296431, 2131296436})
    public void onClickPlus(View view) {
        switch (view.getId()) {
            case 2131296422:
                if (this.btnPlusBankNotes.isClickable()) {
                    this.tvJumlahBankNotes.setText(String.valueOf(Integer.parseInt(this.tvJumlahBankNotes.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline = new ReservasiOnline();
                    reservasiOnline.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline.setCodeTransaksi(ReservasiOnline.PEMESANAN_MATA_UANG_ASING);
                    reservasiOnline.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline.setNameTransaksi(getResources().getString(2131821995));
                    reservasiOnline.setSystemAppId(this.r);
                    reservasiOnline.setImage(2131231168);
                    reservasiOnline.setHasDone(false);
                    reservasiOnline.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.inputChangeKomentar
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusBankNotes.isClickable()) {
                        this.btnMinusBankNotes.setClickable(true);
                        this.btnMinusBankNotes.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296427:
                if (this.btnPlusKirimanUang.isClickable()) {
                    this.tvJumlahKirimanUang.setText(String.valueOf(Integer.parseInt(this.tvJumlahKirimanUang.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline2 = new ReservasiOnline();
                    reservasiOnline2.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline2.setCodeTransaksi(ReservasiOnline.KIRIMAN_UANG);
                    reservasiOnline2.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline2.setNameTransaksi(getResources().getString(2131820574));
                    reservasiOnline2.setSystemAppId(this.r);
                    reservasiOnline2.setImage(2131230821);
                    reservasiOnline2.setHasDone(false);
                    reservasiOnline2.setEditable(true);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilRONotificationActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusKirimanUang.isClickable()) {
                        this.btnMinusKirimanUang.setClickable(true);
                        this.btnMinusKirimanUang.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296428:
                if (this.btnPlusKliring.isClickable()) {
                    this.tvJumlahKliring.setText(String.valueOf(Integer.parseInt(this.tvJumlahKliring.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline3 = new ReservasiOnline();
                    reservasiOnline3.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline3.setCodeTransaksi(ReservasiOnline.KLIRING);
                    reservasiOnline3.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline3.setNameTransaksi(getResources().getString(2131821802));
                    reservasiOnline3.setSystemAppId(this.r);
                    reservasiOnline3.setImage(2131231223);
                    reservasiOnline3.setHasDone(false);
                    reservasiOnline3.setEditable(true);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilRONotificationActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusKliring.isClickable()) {
                        this.btnMinusKliring.setClickable(true);
                        this.btnMinusKliring.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296429:
                if (this.btnPlusOutwardRemittance.isClickable()) {
                    this.tvJumlahOutwardRemittance.setText(String.valueOf(Integer.parseInt(this.tvJumlahOutwardRemittance.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline4 = new ReservasiOnline();
                    reservasiOnline4.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline4.setCodeTransaksi(ReservasiOnline.OUTWARD_REMITTANCE);
                    reservasiOnline4.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline4.setNameTransaksi(getResources().getString(2131822311));
                    reservasiOnline4.setSystemAppId(this.r);
                    reservasiOnline4.setImage(2131231275);
                    reservasiOnline4.setHasDone(false);
                    reservasiOnline4.setEditable(true);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilORNotificationActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusOutwardRemittance.isClickable()) {
                        this.btnMinusOutwardRemittance.setClickable(true);
                        this.btnMinusOutwardRemittance.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296431:
                if (this.btnPlusPemindahbukuan.isClickable()) {
                    this.tvJumlahPemindahbukuan.setText(String.valueOf(Integer.parseInt(this.tvJumlahPemindahbukuan.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline5 = new ReservasiOnline();
                    reservasiOnline5.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline5.setCodeTransaksi(ReservasiOnline.PEMINDAHBUKUAN);
                    reservasiOnline5.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline5.setNameTransaksi(getResources().getString(2131822005));
                    reservasiOnline5.setSystemAppId(this.r);
                    reservasiOnline5.setImage(2131231172);
                    reservasiOnline5.setHasDone(false);
                    reservasiOnline5.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilROActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusPemindahbukuan.isClickable()) {
                        this.btnMinusPemindahbukuan.setClickable(true);
                        this.btnMinusPemindahbukuan.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296435:
                if (this.btnPlusSetoran.isClickable()) {
                    this.tvJumlahSetoran.setText(String.valueOf(Integer.parseInt(this.tvJumlahSetoran.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline6 = new ReservasiOnline();
                    reservasiOnline6.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline6.setCodeTransaksi(ReservasiOnline.SETORAN_TUNAI);
                    reservasiOnline6.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline6.setNameTransaksi(getResources().getString(2131822109));
                    reservasiOnline6.setSystemAppId(this.r);
                    reservasiOnline6.setImage(2131231369);
                    reservasiOnline6.setHasDone(false);
                    reservasiOnline6.setEditable(true);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilORActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusSetoran.isClickable()) {
                        this.btnMinusSetoran.setClickable(true);
                        this.btnMinusSetoran.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296436:
                if (this.btnPlusSetoranPajak.isClickable()) {
                    this.tvJumlahSetoranPajak.setText(String.valueOf(Integer.parseInt(this.tvJumlahSetoranPajak.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline7 = new ReservasiOnline();
                    reservasiOnline7.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline7.setCodeTransaksi(ReservasiOnline.SETORAN_PAJAK);
                    reservasiOnline7.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline7.setNameTransaksi(getResources().getString(2131822108));
                    reservasiOnline7.setSystemAppId(this.r);
                    reservasiOnline7.setImage(2131231174);
                    reservasiOnline7.setHasDone(false);
                    reservasiOnline7.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilROActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusSetoranPajak.isClickable()) {
                        this.btnMinusSetoranPajak.setClickable(true);
                        this.btnMinusSetoranPajak.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296437:
                if (this.btnPlusTarikan.isClickable()) {
                    this.tvJumlahTarikan.setText(String.valueOf(Integer.parseInt(this.tvJumlahTarikan.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline8 = new ReservasiOnline();
                    reservasiOnline8.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline8.setCodeTransaksi(ReservasiOnline.TARIKAN_TUNAI);
                    reservasiOnline8.setTypeTransksi(ReservasiOnline.RESERVASI_TELLER);
                    reservasiOnline8.setNameTransaksi(getResources().getString(2131822499));
                    reservasiOnline8.setSystemAppId(this.r);
                    reservasiOnline8.setImage(2131231412);
                    reservasiOnline8.setHasDone(false);
                    reservasiOnline8.setEditable(true);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilNotificationActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusTarikan.isClickable()) {
                        this.btnMinusTarikan.setClickable(true);
                        this.btnMinusTarikan.setImageResource(2131231249);
                        break;
                    }
                }
                break;
        }
        t();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetEstimasiReservasiPresenter getEstimasiReservasiPresenter = this.n;
        Call<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> call = getEstimasiReservasiPresenter.e;
        if (call != null) {
            call.cancel();
        }
        getEstimasiReservasiPresenter.d = null;
        GetHBPresenter getHBPresenter = this.t;
        Call<OpenAccountSuccessActivity<Object>> call2 = getHBPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        getHBPresenter.e = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    @OnClick({2131296446})
    public void onRetry(View view) {
        this.n.b(new InfoCodewordORActivity_ViewBinding(this.h, this.m.getImei(), this.m.getSessionId(), "Teller"));
    }

    @OnClick({2131296452})
    public void onSubmit(View view) {
        GetHBPresenter getHBPresenter = this.t;
        Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
        getHBPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE  
              (r0v5 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x0035: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v1 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.ReservasiTellerOActivity.onSubmit(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiTellerOActivity.class
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
            this = this;
            r0 = r6
            com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.t
            r7 = r0
            o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.h
            r3 = r6
            com.bca.smartbranch.data.localdb.User r3 = r3.m
            java.lang.String r3 = r3.getSessionId()
            r4 = r6
            com.bca.smartbranch.data.localdb.User r4 = r4.m
            java.lang.String r4 = r4.getImei()
            r1.<init>(r2, r3, r4)
            r8 = r0
            r0 = r7
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r8
            retrofit2.Call r0 = r0.e(r1)
            r8 = r0
            r0 = r7
            r1 = r8
            r0.b = r1
            r0 = r8
            com.bca.smartbranch.presenter.GetHBPresenter$5 r1 = new com.bca.smartbranch.presenter.GetHBPresenter$5
            r2 = r1
            r3 = r7
            r2.<init>()
            r0.enqueue(r1)
            r0 = r6
            android.widget.TextView r0 = r0.tvErrorMessageTransaksi
            r1 = 8
            r0.setVisibility(r1)
            r0 = r6
            android.widget.TextView r0 = r0.tvTotalTransaksi
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 != 0) goto L_0x0061
            r0 = r6
            android.widget.TextView r0 = r0.tvErrorMessageTransaksi
            r1 = 0
            r0.setVisibility(r1)
            return
        L_0x0061:
            android.content.Intent r0 = new android.content.Intent
            r1 = r0
            r2 = r6
            java.lang.Class<com.bca.smartbranch.activity.BranchMapROActivity> r3 = com.bca.smartbranch.activity.BranchMapROActivity.class
            r1.<init>(r2, r3)
            r8 = r0
            com.bca.smartbranch.data.global.Reservation r0 = new com.bca.smartbranch.data.global.Reservation
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RESERVASI ONLINE"
            r0.setTypeTransaction(r1)
            r0 = r7
            java.lang.String r1 = "NEW_RESERVATION"
            r0.setTypeReservation(r1)
            r0 = r7
            r1 = 1
            r0.setFromForm(r1)
            r0 = r7
            java.lang.String r1 = ""
            r0.setNoReff(r1)
            r0 = r7
            java.lang.String r1 = "1"
            r0.setTnxStatus(r1)
            r0 = r7
            java.lang.String r1 = "Transaksi Teller"
            r0.setTxnType(r1)
            r0 = r8
            java.lang.String r1 = "reservation_data"
            r2 = r7
            android.os.Parcelable r2 = o.ListUtil.OneItemImmutableList.e(r2)
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r8
            java.lang.String r1 = "estimation"
            r2 = r6
            int r2 = r2.p
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r6
            r1 = r8
            r0.startActivity(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiTellerOActivity.onSubmit(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "ReservasiTellerOActivity";
        this.j = "ReservasiTellerOActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492998;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void s() {
        this.s.setDisplayedChild(0);
    }
}
