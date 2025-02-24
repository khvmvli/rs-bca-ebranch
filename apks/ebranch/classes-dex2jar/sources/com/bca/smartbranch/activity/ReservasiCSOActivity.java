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
import com.bca.smartbranch.activity.ReservasiCSOActivity;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiCSOActivity.class */
public class ReservasiCSOActivity extends BaseActivityPostLogin implements GetEstimasiReservasiPresenter.read, GetHBPresenter.write {
    @BindView(2131296400)
    ImageButton btnMinusCC;
    @BindView(2131296401)
    ImageButton btnMinusDeposito;
    @BindView(2131296402)
    ImageButton btnMinusEChannel;
    @BindView(2131296403)
    ImageButton btnMinusGiro;
    @BindView(2131296407)
    ImageButton btnMinusPembukaanBlokir;
    @BindView(2131296409)
    ImageButton btnMinusPemrek;
    @BindView(2131296411)
    ImageButton btnMinusPenggantianKeyBCA;
    @BindView(2131296410)
    ImageButton btnMinusSuratReferensi;
    @BindView(2131296423)
    ImageButton btnPlusCC;
    @BindView(2131296424)
    ImageButton btnPlusDeposito;
    @BindView(2131296425)
    ImageButton btnPlusEChannel;
    @BindView(2131296426)
    ImageButton btnPlusGiro;
    @BindView(2131296430)
    ImageButton btnPlusPembukaanBlokir;
    @BindView(2131296432)
    ImageButton btnPlusPemrek;
    @BindView(2131296434)
    ImageButton btnPlusPenggantianKeyBCA;
    @BindView(2131296433)
    ImageButton btnPlusSuratReferensi;
    int f;
    @BindView(2131297614)
    LinearLayout llDeposito;
    @BindView(2131297691)
    LinearLayout llInternetBanking;
    @BindView(2131297759)
    LinearLayout llLayananGiro;
    @BindView(2131297845)
    LinearLayout llPembukaanBlokir;
    @BindView(2131297846)
    LinearLayout llPembukaanRekening;
    @BindView(2131297851)
    LinearLayout llPengajuanKartuKredit;
    @BindView(2131297852)
    LinearLayout llPengajuanSuratReferensi;
    @BindView(2131297853)
    LinearLayout llPenggantianKeyBca;
    int n;
    private GetEstimasiReservasiPresenter p;
    private GetHBPresenter q;
    private String r = "001";
    private ViewAnimator t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299226)
    TextView tvErrorMessageTransaksi;
    @BindView(2131299237)
    TextView tvEstimasiCC;
    @BindView(2131299238)
    TextView tvEstimasiDeposito;
    @BindView(2131299239)
    TextView tvEstimasiEChannel;
    @BindView(2131299240)
    TextView tvEstimasiGiro;
    @BindView(2131299244)
    TextView tvEstimasiPembukaanBlokir;
    @BindView(2131299246)
    TextView tvEstimasiPemrek;
    @BindView(2131299248)
    TextView tvEstimasiPenggantianKeyBCA;
    @BindView(2131299247)
    TextView tvEstimasiSuratReferensi;
    @BindView(2131299320)
    TextView tvJumlahCC;
    @BindView(2131299321)
    TextView tvJumlahDeposito;
    @BindView(2131299322)
    TextView tvJumlahEChannel;
    @BindView(2131299323)
    TextView tvJumlahGiro;
    @BindView(2131299328)
    TextView tvJumlahPembukaanBlokir;
    @BindView(2131299330)
    TextView tvJumlahPemrek;
    @BindView(2131299332)
    TextView tvJumlahPenggantianKeyBCA;
    @BindView(2131299331)
    TextView tvJumlahSuratReferensi;
    @BindView(2131298790)
    TextView tvToolbar;
    @BindView(2131299680)
    TextView tvTotalEstimasiTransaksi;
    @BindView(2131299686)
    TextView tvTotalTransaksi;
    @BindView(2131299758)
    View viewDeposito;
    @BindView(2131299761)
    View viewInternetBanking;
    @BindView(2131299764)
    View viewLayananGiro;
    @BindView(2131299768)
    View viewPembukaanBlokir;
    @BindView(2131299769)
    View viewPembukaanRekening;
    @BindView(2131299771)
    View viewPengajuanKartuKredit;
    @BindView(2131299772)
    View viewPengajuanSuratReferensi;
    @BindView(2131299773)
    View viewPenggantianKeyBca;

    public static /* synthetic */ void b(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PENGGANTIAN_KEY_BCA).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void c(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PEMBUKAAN_REKENING).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void d(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.INTERNET_MOBILE_BANKING).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void e(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PENGAJUAN_KARTU_KREDIT).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void g(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.LAYANAN_GIRO).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void h(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.DEPOSITO).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void i(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PENGAJUAN_SURAT_REFERENSI).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    public static /* synthetic */ void j(Realm realm) {
        ReservasiOnline reservasiOnline = (ReservasiOnline) realm.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PEMBUKAAN_BLOKIR).findFirst();
        if (reservasiOnline != null) {
            reservasiOnline.deleteFromRealm();
        }
    }

    private void t() {
        this.f = (Integer.parseInt(this.tvEstimasiPemrek.getText().toString()) * Integer.parseInt(this.tvJumlahPemrek.getText().toString())) + (Integer.parseInt(this.tvEstimasiCC.getText().toString()) * Integer.parseInt(this.tvJumlahCC.getText().toString())) + (Integer.parseInt(this.tvEstimasiEChannel.getText().toString()) * Integer.parseInt(this.tvJumlahEChannel.getText().toString())) + (Integer.parseInt(this.tvEstimasiPenggantianKeyBCA.getText().toString()) * Integer.parseInt(this.tvJumlahPenggantianKeyBCA.getText().toString())) + (Integer.parseInt(this.tvEstimasiDeposito.getText().toString()) * Integer.parseInt(this.tvJumlahDeposito.getText().toString())) + (Integer.parseInt(this.tvEstimasiGiro.getText().toString()) * Integer.parseInt(this.tvJumlahGiro.getText().toString())) + (Integer.parseInt(this.tvEstimasiPembukaanBlokir.getText().toString()) * Integer.parseInt(this.tvJumlahPembukaanBlokir.getText().toString())) + (Integer.parseInt(this.tvEstimasiSuratReferensi.getText().toString()) * Integer.parseInt(this.tvJumlahSuratReferensi.getText().toString()));
        int parseInt = Integer.parseInt(this.tvJumlahPemrek.getText().toString()) + Integer.parseInt(this.tvJumlahCC.getText().toString()) + Integer.parseInt(this.tvJumlahEChannel.getText().toString()) + Integer.parseInt(this.tvJumlahPenggantianKeyBCA.getText().toString()) + Integer.parseInt(this.tvJumlahDeposito.getText().toString()) + Integer.parseInt(this.tvJumlahGiro.getText().toString()) + Integer.parseInt(this.tvJumlahPembukaanBlokir.getText().toString()) + Integer.parseInt(this.tvJumlahSuratReferensi.getText().toString());
        this.n = parseInt;
        this.tvTotalTransaksi.setText(String.valueOf(parseInt));
        TextView textView = this.tvTotalEstimasiTransaksi;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" menit");
        textView.setText(sb.toString());
        if (this.n < 5) {
            this.btnPlusPemrek.setClickable(true);
            this.btnPlusCC.setClickable(true);
            this.btnPlusEChannel.setClickable(true);
            this.btnPlusPenggantianKeyBCA.setClickable(true);
            this.btnPlusDeposito.setClickable(true);
            this.btnPlusGiro.setClickable(true);
            this.btnPlusPembukaanBlokir.setClickable(true);
            this.btnPlusSuratReferensi.setClickable(true);
            this.btnPlusPemrek.setImageResource(2131231291);
            this.btnPlusCC.setImageResource(2131231291);
            this.btnPlusEChannel.setImageResource(2131231291);
            this.btnPlusPenggantianKeyBCA.setImageResource(2131231291);
            this.btnPlusDeposito.setImageResource(2131231291);
            this.btnPlusGiro.setImageResource(2131231291);
            this.btnPlusPembukaanBlokir.setImageResource(2131231291);
            this.btnPlusSuratReferensi.setImageResource(2131231291);
            return;
        }
        this.btnPlusPemrek.setClickable(false);
        this.btnPlusCC.setClickable(false);
        this.btnPlusEChannel.setClickable(false);
        this.btnPlusPenggantianKeyBCA.setClickable(false);
        this.btnPlusDeposito.setClickable(false);
        this.btnPlusGiro.setClickable(false);
        this.btnPlusPembukaanBlokir.setClickable(false);
        this.btnPlusSuratReferensi.setClickable(false);
        this.btnPlusPemrek.setImageResource(2131231292);
        this.btnPlusCC.setImageResource(2131231292);
        this.btnPlusEChannel.setImageResource(2131231292);
        this.btnPlusPenggantianKeyBCA.setImageResource(2131231292);
        this.btnPlusDeposito.setImageResource(2131231292);
        this.btnPlusGiro.setImageResource(2131231292);
        this.btnPlusPembukaanBlokir.setImageResource(2131231292);
        this.btnPlusSuratReferensi.setImageResource(2131231292);
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
        this.t.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void b(List<detailMultiCurrencyBCA.IconCompatParcelizer> list) {
        boolean z = false;
        for (detailMultiCurrencyBCA.IconCompatParcelizer iconCompatParcelizer : list) {
            boolean z2 = z;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.PEMBUKAAN_REKENING)) {
                z2 = z;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llPembukaanRekening.setVisibility(0);
                    this.viewPembukaanRekening.setVisibility(0);
                    this.tvEstimasiPemrek.setText(iconCompatParcelizer.e.b);
                    z2 = true;
                }
            }
            boolean z3 = z2;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.PENGAJUAN_KARTU_KREDIT)) {
                z3 = z2;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llPengajuanKartuKredit.setVisibility(0);
                    this.viewPengajuanKartuKredit.setVisibility(0);
                    this.tvEstimasiCC.setText(iconCompatParcelizer.e.b);
                    z3 = true;
                }
            }
            boolean z4 = z3;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.INTERNET_MOBILE_BANKING)) {
                z4 = z3;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llInternetBanking.setVisibility(0);
                    this.viewInternetBanking.setVisibility(0);
                    this.tvEstimasiEChannel.setText(iconCompatParcelizer.e.b);
                    z4 = true;
                }
            }
            boolean z5 = z4;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.PENGGANTIAN_KEY_BCA)) {
                z5 = z4;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llPenggantianKeyBca.setVisibility(0);
                    this.viewPenggantianKeyBca.setVisibility(0);
                    this.tvEstimasiPenggantianKeyBCA.setText(iconCompatParcelizer.e.b);
                    z5 = true;
                }
            }
            boolean z6 = z5;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.DEPOSITO)) {
                z6 = z5;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llDeposito.setVisibility(0);
                    this.viewDeposito.setVisibility(0);
                    this.tvEstimasiDeposito.setText(iconCompatParcelizer.e.b);
                    z6 = true;
                }
            }
            boolean z7 = z6;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.LAYANAN_GIRO)) {
                z7 = z6;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llLayananGiro.setVisibility(0);
                    this.viewLayananGiro.setVisibility(0);
                    this.tvEstimasiGiro.setText(iconCompatParcelizer.e.b);
                    z7 = true;
                }
            }
            boolean z8 = z7;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.PEMBUKAAN_BLOKIR)) {
                z8 = z7;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llPembukaanBlokir.setVisibility(0);
                    this.viewPembukaanBlokir.setVisibility(0);
                    this.tvEstimasiPembukaanBlokir.setText(iconCompatParcelizer.e.b);
                    z8 = true;
                }
            }
            z = z8;
            if (iconCompatParcelizer.e.e.equalsIgnoreCase(ReservasiOnline.PENGAJUAN_SURAT_REFERENSI)) {
                z = z8;
                if (!iconCompatParcelizer.e.b.isEmpty()) {
                    this.llPengajuanSuratReferensi.setVisibility(0);
                    this.viewPengajuanSuratReferensi.setVisibility(0);
                    this.tvEstimasiSuratReferensi.setText(iconCompatParcelizer.e.b);
                    z = z8;
                }
            }
        }
        if (z) {
            this.t.setDisplayedChild(2);
            return;
        }
        this.tvErrorMessage.setText("Reservasi CS Online kosong");
        this.t.setDisplayedChild(1);
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
        this.t = (ViewAnimator) findViewById(2131299749);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText("Reservasi CS");
        this.btnMinusPemrek.setClickable(false);
        this.btnMinusCC.setClickable(false);
        this.btnMinusEChannel.setClickable(false);
        this.btnMinusPenggantianKeyBCA.setClickable(false);
        this.btnMinusDeposito.setClickable(false);
        this.btnMinusGiro.setClickable(false);
        this.btnMinusPembukaanBlokir.setClickable(false);
        this.btnMinusSuratReferensi.setClickable(false);
        GetEstimasiReservasiPresenter getEstimasiReservasiPresenter = new GetEstimasiReservasiPresenter();
        this.p = getEstimasiReservasiPresenter;
        getEstimasiReservasiPresenter.d = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.q = getHBPresenter;
        getHBPresenter.e = this;
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBNPengembalianDanaActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                realm.where(ReservasiOnline.class).findAll().deleteAllFromRealm();
            }
        });
        this.p.b(new InfoCodewordORActivity_ViewBinding(this.h, this.m.getImei(), this.m.getSessionId(), "CS"));
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.t.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void e(String str) {
        this.tvErrorMessage.setText(str);
        this.t.setDisplayedChild(1);
    }

    @OnClick({2131296409, 2131296400, 2131296402, 2131296411, 2131296401, 2131296403, 2131296407, 2131296410})
    public void onClickMinus(View view) {
        switch (view.getId()) {
            case 2131296400:
                if (this.btnMinusCC.isClickable()) {
                    int parseInt = Integer.parseInt(this.tvJumlahCC.getText().toString()) - 1;
                    this.tvJumlahCC.setText(String.valueOf(parseInt));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBNPengembalianDanaNotificationActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.e(realm);
                        }
                    });
                    if (parseInt == 0) {
                        this.btnMinusCC.setClickable(false);
                        this.btnMinusCC.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296401:
                if (this.btnMinusDeposito.isClickable()) {
                    int parseInt2 = Integer.parseInt(this.tvJumlahDeposito.getText().toString()) - 1;
                    this.tvJumlahDeposito.setText(String.valueOf(parseInt2));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DeleteAccountActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.h(realm);
                        }
                    });
                    if (parseInt2 == 0) {
                        this.btnMinusDeposito.setClickable(false);
                        this.btnMinusDeposito.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296402:
                if (this.btnMinusEChannel.isClickable()) {
                    int parseInt3 = Integer.parseInt(this.tvJumlahEChannel.getText().toString()) - 1;
                    this.tvJumlahEChannel.setText(String.valueOf(parseInt3));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBNBerhasilNotificationActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.d(realm);
                        }
                    });
                    if (parseInt3 == 0) {
                        this.btnMinusEChannel.setClickable(false);
                        this.btnMinusEChannel.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296403:
                if (this.btnMinusGiro.isClickable()) {
                    int parseInt4 = Integer.parseInt(this.tvJumlahGiro.getText().toString()) - 1;
                    this.tvJumlahGiro.setText(String.valueOf(parseInt4));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DaftarTransferORActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.g(realm);
                        }
                    });
                    if (parseInt4 == 0) {
                        this.btnMinusGiro.setClickable(false);
                        this.btnMinusGiro.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296407:
                if (this.btnMinusPembukaanBlokir.isClickable()) {
                    int parseInt5 = Integer.parseInt(this.tvJumlahPembukaanBlokir.getText().toString()) - 1;
                    this.tvJumlahPembukaanBlokir.setText(String.valueOf(parseInt5));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DeleteAccountActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.j(realm);
                        }
                    });
                    if (parseInt5 == 0) {
                        this.btnMinusPembukaanBlokir.setClickable(false);
                        this.btnMinusPembukaanBlokir.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296409:
                if (this.btnMinusPemrek.isClickable()) {
                    int parseInt6 = Integer.parseInt(this.tvJumlahPemrek.getText().toString()) - 1;
                    this.tvJumlahPemrek.setText(String.valueOf(parseInt6));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DaftarTransferMenuActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.c(realm);
                        }
                    });
                    if (parseInt6 == 0) {
                        this.btnMinusPemrek.setClickable(false);
                        this.btnMinusPemrek.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296410:
                if (this.btnMinusSuratReferensi.isClickable()) {
                    int parseInt7 = Integer.parseInt(this.tvJumlahSuratReferensi.getText().toString()) - 1;
                    this.tvJumlahSuratReferensi.setText(String.valueOf(parseInt7));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.onSubmit
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.i(realm);
                        }
                    });
                    if (parseInt7 == 0) {
                        this.btnMinusSuratReferensi.setClickable(false);
                        this.btnMinusSuratReferensi.setImageResource(2131231250);
                        break;
                    }
                }
                break;
            case 2131296411:
                if (this.btnMinusPenggantianKeyBCA.isClickable()) {
                    int parseInt8 = Integer.parseInt(this.tvJumlahPenggantianKeyBCA.getText().toString()) - 1;
                    this.tvJumlahPenggantianKeyBCA.setText(String.valueOf(parseInt8));
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DeleteAccountConfirmationActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ReservasiCSOActivity.b(realm);
                        }
                    });
                    if (parseInt8 == 0) {
                        this.btnMinusPenggantianKeyBCA.setClickable(false);
                        this.btnMinusPenggantianKeyBCA.setImageResource(2131231250);
                        break;
                    }
                }
                break;
        }
        t();
    }

    @OnClick({2131296432, 2131296423, 2131296425, 2131296434, 2131296424, 2131296426, 2131296430, 2131296433})
    public void onClickPlus(View view) {
        switch (view.getId()) {
            case 2131296423:
                if (this.btnPlusCC.isClickable()) {
                    this.tvJumlahCC.setText(String.valueOf(Integer.parseInt(this.tvJumlahCC.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline = new ReservasiOnline();
                    reservasiOnline.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline.setCodeTransaksi(ReservasiOnline.PENGAJUAN_KARTU_KREDIT);
                    reservasiOnline.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline.setNameTransaksi(getResources().getString(2131822014));
                    reservasiOnline.setSystemAppId(this.r);
                    reservasiOnline.setImage(2131231163);
                    reservasiOnline.setHasDone(false);
                    reservasiOnline.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.onFocus
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusCC.isClickable()) {
                        this.btnMinusCC.setClickable(true);
                        this.btnMinusCC.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296424:
                if (this.btnPlusDeposito.isClickable()) {
                    this.tvJumlahDeposito.setText(String.valueOf(Integer.parseInt(this.tvJumlahDeposito.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline2 = new ReservasiOnline();
                    reservasiOnline2.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline2.setCodeTransaksi(ReservasiOnline.DEPOSITO);
                    reservasiOnline2.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline2.setNameTransaksi(getResources().getString(2131821602));
                    reservasiOnline2.setSystemAppId(this.r);
                    reservasiOnline2.setImage(2131231161);
                    reservasiOnline2.setHasDone(false);
                    reservasiOnline2.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBNBerhasilNotificationActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusDeposito.isClickable()) {
                        this.btnMinusDeposito.setClickable(true);
                        this.btnMinusDeposito.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296425:
                if (this.btnPlusEChannel.isClickable()) {
                    this.tvJumlahEChannel.setText(String.valueOf(Integer.parseInt(this.tvJumlahEChannel.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline3 = new ReservasiOnline();
                    reservasiOnline3.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline3.setCodeTransaksi(ReservasiOnline.INTERNET_MOBILE_BANKING);
                    reservasiOnline3.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline3.setNameTransaksi(getResources().getString(2131821742));
                    reservasiOnline3.setSystemAppId(this.r);
                    reservasiOnline3.setImage(2131231056);
                    reservasiOnline3.setHasDone(false);
                    reservasiOnline3.setEditable(true);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DaftarTransferORActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusEChannel.isClickable()) {
                        this.btnMinusEChannel.setClickable(true);
                        this.btnMinusEChannel.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296426:
                if (this.btnPlusGiro.isClickable()) {
                    this.tvJumlahGiro.setText(String.valueOf(Integer.parseInt(this.tvJumlahGiro.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline4 = new ReservasiOnline();
                    reservasiOnline4.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline4.setCodeTransaksi(ReservasiOnline.LAYANAN_GIRO);
                    reservasiOnline4.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline4.setNameTransaksi(getResources().getString(2131821829));
                    reservasiOnline4.setSystemAppId(this.r);
                    reservasiOnline4.setImage(2131231167);
                    reservasiOnline4.setHasDone(false);
                    reservasiOnline4.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DeleteAccountConfirmationActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusGiro.isClickable()) {
                        this.btnMinusGiro.setClickable(true);
                        this.btnMinusGiro.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296430:
                if (this.btnPlusPembukaanBlokir.isClickable()) {
                    this.tvJumlahPembukaanBlokir.setText(String.valueOf(Integer.parseInt(this.tvJumlahPembukaanBlokir.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline5 = new ReservasiOnline();
                    reservasiOnline5.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline5.setCodeTransaksi(ReservasiOnline.PEMBUKAAN_BLOKIR);
                    reservasiOnline5.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline5.setNameTransaksi(getResources().getString(2131821998));
                    reservasiOnline5.setSystemAppId(this.r);
                    reservasiOnline5.setImage(2131231170);
                    reservasiOnline5.setHasDone(false);
                    reservasiOnline5.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBNPengembalianDanaActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusPembukaanBlokir.isClickable()) {
                        this.btnMinusPembukaanBlokir.setClickable(true);
                        this.btnMinusPembukaanBlokir.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296432:
                if (this.btnPlusPemrek.isClickable()) {
                    this.tvJumlahPemrek.setText(String.valueOf(Integer.parseInt(this.tvJumlahPemrek.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline6 = new ReservasiOnline();
                    reservasiOnline6.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline6.setCodeTransaksi(ReservasiOnline.PEMBUKAAN_REKENING);
                    reservasiOnline6.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline6.setNameTransaksi(getResources().getString(2131822000));
                    reservasiOnline6.setSystemAppId(this.r);
                    reservasiOnline6.setImage(2131231280);
                    reservasiOnline6.setHasDone(false);
                    reservasiOnline6.setEditable(true);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBNBerhasilActivity
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusPemrek.isClickable()) {
                        this.btnMinusPemrek.setClickable(true);
                        this.btnMinusPemrek.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296433:
                if (this.btnPlusSuratReferensi.isClickable()) {
                    this.tvJumlahSuratReferensi.setText(String.valueOf(Integer.parseInt(this.tvJumlahSuratReferensi.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline7 = new ReservasiOnline();
                    reservasiOnline7.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline7.setCodeTransaksi(ReservasiOnline.PENGAJUAN_SURAT_REFERENSI);
                    reservasiOnline7.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline7.setNameTransaksi(getResources().getString(2131822019));
                    reservasiOnline7.setSystemAppId(this.r);
                    reservasiOnline7.setImage(2131231173);
                    reservasiOnline7.setHasDone(false);
                    reservasiOnline7.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.onToggleTransaksi
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusSuratReferensi.isClickable()) {
                        this.btnMinusSuratReferensi.setClickable(true);
                        this.btnMinusSuratReferensi.setImageResource(2131231249);
                        break;
                    }
                }
                break;
            case 2131296434:
                if (this.btnPlusPenggantianKeyBCA.isClickable()) {
                    this.tvJumlahPenggantianKeyBCA.setText(String.valueOf(Integer.parseInt(this.tvJumlahPenggantianKeyBCA.getText().toString()) + 1));
                    ReservasiOnline reservasiOnline8 = new ReservasiOnline();
                    reservasiOnline8.setId(Long.valueOf(System.currentTimeMillis()));
                    reservasiOnline8.setCodeTransaksi(ReservasiOnline.PENGGANTIAN_KEY_BCA);
                    reservasiOnline8.setTypeTransksi(ReservasiOnline.RESERVASI_CSO);
                    reservasiOnline8.setNameTransaksi(getResources().getString(2131822024));
                    reservasiOnline8.setSystemAppId(this.r);
                    reservasiOnline8.setImage(2131231164);
                    reservasiOnline8.setHasDone(false);
                    reservasiOnline8.setEditable(false);
                    this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBNBerhasilActivity_ViewBinding
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            realm.copyToRealm((Realm) ReservasiOnline.this, new ImportFlag[0]);
                        }
                    });
                    if (!this.btnMinusPenggantianKeyBCA.isClickable()) {
                        this.btnMinusPenggantianKeyBCA.setClickable(true);
                        this.btnMinusPenggantianKeyBCA.setImageResource(2131231249);
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
        GetEstimasiReservasiPresenter getEstimasiReservasiPresenter = this.p;
        Call<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> call = getEstimasiReservasiPresenter.e;
        if (call != null) {
            call.cancel();
        }
        getEstimasiReservasiPresenter.d = null;
        GetHBPresenter getHBPresenter = this.q;
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
        this.p.b(new InfoCodewordORActivity_ViewBinding(this.h, this.m.getImei(), this.m.getSessionId(), "CS"));
    }

    @OnClick({2131296452})
    public void onSubmit(View view) {
        GetHBPresenter getHBPresenter = this.q;
        Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
        getHBPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE  
              (r0v5 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x0035: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v1 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.ReservasiCSOActivity.onSubmit(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiCSOActivity.class
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
            com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.q
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
            r7 = r0
            com.bca.smartbranch.data.global.Reservation r0 = new com.bca.smartbranch.data.global.Reservation
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "RESERVASI ONLINE"
            r0.setTypeTransaction(r1)
            r0 = r8
            java.lang.String r1 = "NEW_RESERVATION"
            r0.setTypeReservation(r1)
            r0 = r8
            r1 = 1
            r0.setFromForm(r1)
            r0 = r8
            java.lang.String r1 = ""
            r0.setNoReff(r1)
            r0 = r8
            java.lang.String r1 = "1"
            r0.setTnxStatus(r1)
            r0 = r8
            java.lang.String r1 = "Transaksi CS"
            r0.setTxnType(r1)
            r0 = r7
            java.lang.String r1 = "reservation_data"
            r2 = r8
            android.os.Parcelable r2 = o.ListUtil.OneItemImmutableList.e(r2)
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r7
            java.lang.String r1 = "estimation"
            r2 = r6
            int r2 = r2.f
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r6
            r1 = r7
            r0.startActivity(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiCSOActivity.onSubmit(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "ReservasiCSOActivity";
        this.j = "ReservasiCSOActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492990;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.read
    public final void s() {
        this.t.setDisplayedChild(0);
    }
}
