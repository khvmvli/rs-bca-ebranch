package com.bca.smartbranch.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23UbahSubVisacardActivity_ViewBinding;
import o.CC25BFormKartuKreditFragment;
import o.InfoDocumentUnderlyingActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.consumeDisplayCutout;
import o.documentProvider;
import o.equals;
import o.getPromotion;
import o.loginAsGuest;
import o.onAcceptKetentuanOR;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setSplitTrack;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilORActivity.class */
public class DetailBerhasilORActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int F;
    private static long G;
    private static int H;
    private String A;
    private String B;
    private String C;
    private String D;
    private ViewAnimator E;
    private String I;
    @BindString(2131821350)
    String bankPenerimaEnglish;
    @BindString(2131821370)
    String beritaEnglish;
    @BindString(2131821373)
    String biayaFullAmountEnglish;
    @BindString(2131821375)
    String biayaTodayTelexEnglish;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296448)
    Button btnShare;
    @BindString(2131821416)
    String cabangEnglish;
    @BindView(2131296838)
    setSplitTrack cvInfo;
    @BindView(2131296945)
    LogoutDialog etAlasan;
    @BindView(2131297031)
    LogoutDialog etKomentar;
    private setMessage f;
    @BindString(2131821809)
    String kodeSwiftEnglish;
    @BindView(2131297548)
    LinearLayout llBerita;
    @BindView(2131297559)
    LinearLayout llCabang;
    @BindView(2131297566)
    LinearLayout llCatatan;
    @BindView(2131297646)
    LinearLayout llFullAmount;
    @BindView(2131297738)
    LinearLayout llKodeSwift;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297822)
    LinearLayout llNoPpu;
    @BindView(2131297825)
    LinearLayout llNoTelpCabang;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297887)
    LinearLayout llShare;
    @BindView(2131297898)
    LinearLayout llSumberDana1;
    @BindView(2131297899)
    LinearLayout llSumberDana2;
    @BindView(2131297918)
    LinearLayout llTodayTelex;
    @BindString(2131821891)
    String mataUangEnglish;
    private String n;
    @BindString(2131821948)
    String noReferensiEnglish;
    @BindString(2131821951)
    String noTelpEnglish;
    @BindString(2131821956)
    String nominalEnglish;
    @BindString(2131821963)
    String nomorPPUEnglish;
    private String p;
    @BindString(2131822010)
    String penerimaEnglish;
    @BindString(2131822029)
    String pengirimEnglish;
    private String q;
    private String r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private DetailTransactionPresenter s;
    @BindString(2131822137)
    String sumberDana1English;
    @BindString(2131822139)
    String sumberDana2English;
    private boolean t;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822262)
    String toolbarTitle;
    @BindView(2131298836)
    TextView tvBankPenerima;
    @BindView(2131298847)
    TextView tvBerita;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299262)
    TextView tvFullAmount;
    @BindView(2131299373)
    TextView tvKodeSwift;
    @BindView(2131299400)
    TextView tvMataUang;
    @BindView(2131298904)
    TextView tvNamaPenerima;
    @BindView(2131298910)
    TextView tvNamaPengirim;
    @BindView(2131299493)
    TextView tvNoPpu;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299495)
    TextView tvNoTelpCabang;
    @BindView(2131299485)
    TextView tvNominal;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299589)
    TextView tvSumberDana1;
    @BindView(2131299590)
    TextView tvSumberDana2;
    @BindView(2131299620)
    TextView tvTitleBankPenerima;
    @BindView(2131299623)
    TextView tvTitleBerita;
    @BindView(2131299627)
    TextView tvTitleCabang;
    @BindView(2131299624)
    TextView tvTitleFullAmount;
    @BindView(2131299634)
    TextView tvTitleKodeSwift;
    @BindView(2131299640)
    TextView tvTitleMataUang;
    @BindView(2131299652)
    TextView tvTitleNoPpu;
    @BindView(2131299653)
    TextView tvTitleNoReferensi;
    @BindView(2131299654)
    TextView tvTitleNoTelpCabang;
    @BindView(2131299655)
    TextView tvTitleNominal;
    @BindView(2131299660)
    TextView tvTitlePenerima;
    @BindView(2131299666)
    TextView tvTitleSumberDana1;
    @BindView(2131299667)
    TextView tvTitleSumberDana2;
    @BindView(2131299625)
    TextView tvTitleTodayTelex;
    @BindView(2131299674)
    TextView tvTitleWaktu;
    @BindView(2131299676)
    TextView tvTodayTelex;
    @BindView(2131299689)
    TextView tvTransaksi;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131299662)
    TextView tvtitlePengirim;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private RateTransactionPresenter v;
    private String w;
    @BindString(2131822345)
    String waktuEnglish;
    private String x;
    private String y;
    private String z;

    public DetailBerhasilORActivity() {
        try {
            this.f = new setMessage();
            this.t = false;
            this.D = "";
            this.p = "";
            this.C = "";
            this.r = "";
            this.y = "";
        } catch (Exception e) {
            throw e;
        }
    }

    private void D() {
        H = (F + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
        this.tvTitleWaktu.setText(Html.fromHtml(this.waktuEnglish));
        this.tvtitlePengirim.setText(Html.fromHtml(this.pengirimEnglish));
        this.tvTitlePenerima.setText(Html.fromHtml(this.penerimaEnglish));
        this.tvTitleCabang.setText(Html.fromHtml(this.cabangEnglish));
        this.tvTitleNoTelpCabang.setText(Html.fromHtml(this.noTelpEnglish));
        this.tvTitleKodeSwift.setText(Html.fromHtml(this.kodeSwiftEnglish));
        this.tvTitleBankPenerima.setText(Html.fromHtml(this.bankPenerimaEnglish));
        this.tvTitleMataUang.setText(Html.fromHtml(this.mataUangEnglish));
        this.tvTitleNominal.setText(Html.fromHtml(this.nominalEnglish));
        this.tvTitleSumberDana1.setText(Html.fromHtml(this.sumberDana1English));
        this.tvTitleSumberDana2.setText(Html.fromHtml(this.sumberDana2English));
        this.tvTitleFullAmount.setText(Html.fromHtml(this.biayaFullAmountEnglish));
        this.tvTitleTodayTelex.setText(Html.fromHtml(this.biayaTodayTelexEnglish));
        this.tvTitleBerita.setText(Html.fromHtml(this.beritaEnglish));
        this.tvTitleNoPpu.setText(Html.fromHtml(this.nomorPPUEnglish));
        this.tvTitleNoReferensi.setText(Html.fromHtml(this.noReferensiEnglish));
        int i = H + 53;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new NullPointerException();
        }
    }

    static /* synthetic */ void a(DetailBerhasilORActivity detailBerhasilORActivity) {
        try {
            int i = F + 71;
            H = i % Property.TYPE_ARRAY;
            char c = i % 2 != 0 ? '\t' : 'U';
            detailBerhasilORActivity.y();
            if (c == '\t') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(DetailTransactionResponse.TxnDataDetail txnDataDetail) {
        char c;
        String key = txnDataDetail.getKey();
        key.hashCode();
        char c2 = 23;
        char c3 = 25;
        char c4 = 'H';
        char c5 = 11;
        char c6 = 24;
        switch (key.hashCode()) {
            case -2126560350:
                if (key.equals("Biaya Today dan Telex")) {
                    H = (F + 101) % Property.TYPE_ARRAY;
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2126271420:
                if (key.equals("Nomor Ppu")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -2053478804:
                if (key.equals("StatusType")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1990226152:
                if (key.equals("Kode Swift")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1854235203:
                if (key.equals("Rating")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1808614382:
                if (key.equals("Status")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1800708348:
                if (key.equals("Mata Uang")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1714803651:
                if (key.equals("Sumber Dana 1")) {
                    H = (F + 9) % Property.TYPE_ARRAY;
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1714803650:
                if (key.equals("Sumber Dana 2")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1679915457:
                if (key.equals("Comment")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1238485368:
                if (!key.equals("Transaksi")) {
                    c5 = 24;
                }
                if (c5 != 24) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -507420484:
                if (key.equals("Nominal")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 74230:
                if (key.equals("Jam")) {
                    int i = F + setHasDecor$MediaBrowserCompat$MediaItem.aI;
                    H = i % Property.TYPE_ARRAY;
                    if (i % 2 == 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 'W';
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 80988633:
                if (key.equals("Token")) {
                    c4 = '=';
                }
                if (c4 == '=') {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 122683404:
                if (key.equals("Tanggal")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 380447383:
                if (key.equals("Penerima")) {
                    c3 = '_';
                }
                if (c3 == '_') {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 382034843:
                if (!(!key.equals("Pengirim"))) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 443063848:
                if (key.equals("Kurs Sumber Dana 1")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 443063849:
                if (key.equals("Kurs Sumber Dana 2")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 474576859:
                if ((key.equals("Bank Penerima") ? '&' : 26) != 26) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 791299234:
                if (key.equals("Nomor Telepon Cabang")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 1112467787:
                if (key.equals("Biaya Full Amount")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1260938190:
                if (key.equals("Nomor Referensi")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1950516649:
                if (key.equals("Kode Mata Uang")) {
                    break;
                }
                c2 = 65535;
                break;
            case 1963638442:
                if (key.equals("Alasan")) {
                    int i2 = H + 23;
                    F = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 != 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 'H';
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 1986300359:
                if (key.equals("Berita")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 2010750902:
                if (!key.equals("Cabang")) {
                    c6 = '<';
                }
                if (c6 != '<') {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                String[] split = txnDataDetail.getValue().split(" ");
                if (split.length > 1) {
                    TextView textView = this.tvTodayTelex;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getPromotion.j(split[0].replace(".", ",")));
                    sb.append(" ");
                    sb.append(split[1]);
                    textView.setText(sb.toString());
                    return;
                }
                TextView textView2 = this.tvTodayTelex;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getPromotion.j(txnDataDetail.getValue().replace(".", ",")));
                sb2.append(" IDR");
                textView2.setText(sb2.toString());
                return;
            case 1:
                this.tvNoPpu.setText(txnDataDetail.getValue());
                return;
            case 2:
                this.y = txnDataDetail.getValue();
                String value = txnDataDetail.getValue();
                value.hashCode();
                switch (value.hashCode()) {
                    case 48:
                        c = 65535;
                        if (value.equals("0")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 49:
                        c = 65535;
                        if (!(!value.equals("1"))) {
                            H = (F + 37) % Property.TYPE_ARRAY;
                            c = 1;
                            break;
                        }
                        break;
                    case 50:
                        c = 65535;
                        if (value.equals("2")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 51:
                        if (value.equals("3")) {
                            c = 3;
                            break;
                        } else {
                            c = 65535;
                            break;
                        }
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    this.t = true;
                    if (this.w.equals("N")) {
                        int i3 = H + 47;
                        F = i3 % Property.TYPE_ARRAY;
                        if (i3 % 2 == 0) {
                            this.llRating.setVisibility(1);
                            this.btnShare.setVisibility(0);
                            this.btnProses.setEnabled(false);
                        } else {
                            this.llRating.setVisibility(0);
                            this.btnShare.setVisibility(0);
                            this.btnProses.setEnabled(true);
                        }
                    } else {
                        this.btnProses.setEnabled(false);
                    }
                    D();
                    this.llCatatan.setVisibility(0);
                    return;
                } else if (c == 1) {
                    this.llCabang.setVisibility(8);
                    this.llNoTelpCabang.setVisibility(8);
                    this.llKodeSwift.setVisibility(8);
                    this.llSumberDana1.setVisibility(8);
                    this.llSumberDana2.setVisibility(8);
                    this.llFullAmount.setVisibility(8);
                    this.llTodayTelex.setVisibility(8);
                    this.llBerita.setVisibility(8);
                    this.llNoPpu.setVisibility(8);
                    this.llRating.setVisibility(8);
                    this.btnShare.setVisibility(8);
                    D();
                    this.llCatatan.setVisibility(8);
                    return;
                } else if (c == 2) {
                    this.llCabang.setVisibility(8);
                    this.llNoTelpCabang.setVisibility(8);
                    this.llKodeSwift.setVisibility(8);
                    this.llSumberDana1.setVisibility(8);
                    this.llSumberDana2.setVisibility(8);
                    this.llFullAmount.setVisibility(8);
                    this.llTodayTelex.setVisibility(8);
                    this.llBerita.setVisibility(8);
                    this.llNoPpu.setVisibility(8);
                    this.llRating.setVisibility(8);
                    this.btnShare.setVisibility(8);
                    this.tilAlasan.setVisibility(0);
                    D();
                    this.llCatatan.setVisibility(8);
                    return;
                } else if (c != 3) {
                    int i4 = H + 99;
                    F = i4 % Property.TYPE_ARRAY;
                    if (i4 % 2 == 0) {
                        Object[] objArr = null;
                        int length = objArr.length;
                        return;
                    }
                    return;
                } else {
                    this.cvInfo.setVisibility(0);
                    this.llKodeSwift.setVisibility(8);
                    this.llSumberDana1.setVisibility(8);
                    this.llSumberDana2.setVisibility(8);
                    this.llFullAmount.setVisibility(8);
                    this.llTodayTelex.setVisibility(8);
                    this.llBerita.setVisibility(8);
                    this.llRating.setVisibility(8);
                    this.btnShare.setVisibility(8);
                    D();
                    this.llCatatan.setVisibility(8);
                    return;
                }
            case 3:
                this.tvKodeSwift.setText(txnDataDetail.getValue());
                return;
            case 4:
                if (!txnDataDetail.getValue().isEmpty()) {
                    int i5 = H + 71;
                    F = i5 % Property.TYPE_ARRAY;
                    if ((i5 % 2 == 0 ? 'R' : '#') != '#') {
                        this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                        this.ratingBar.setClickable(false);
                        this.ratingBar.setScrollable(false);
                        return;
                    }
                    this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                    this.ratingBar.setClickable(false);
                    this.ratingBar.setScrollable(false);
                    return;
                }
                return;
            case 5:
                this.tvStatus.setText(txnDataDetail.getValue());
                return;
            case 6:
                this.tvMataUang.setText(txnDataDetail.getValue());
                return;
            case 7:
                this.D = txnDataDetail.getValue();
                return;
            case '\b':
                this.C = txnDataDetail.getValue();
                return;
            case '\t':
                if (!txnDataDetail.getValue().isEmpty()) {
                    try {
                        this.etKomentar.setText(txnDataDetail.getValue());
                        this.etKomentar.setFocusable(false);
                        this.etKomentar.setFocusableInTouchMode(false);
                        this.etKomentar.setLongClickable(false);
                        this.tilKomentar.setHintEnabled(true);
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    return;
                }
            case '\n':
                this.tvTransaksi.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case 11:
                this.z = txnDataDetail.getValue();
                return;
            case '\f':
                this.q = txnDataDetail.getValue();
                return;
            case '\r':
                this.u = txnDataDetail.getValue();
                return;
            case 14:
                this.A = txnDataDetail.getValue();
                return;
            case 15:
                this.tvNamaPenerima.setText(txnDataDetail.getValue());
                return;
            case 16:
                this.tvNamaPengirim.setText(txnDataDetail.getValue());
                return;
            case 17:
                this.p = txnDataDetail.getValue();
                return;
            case 18:
                this.r = txnDataDetail.getValue();
                return;
            case 19:
                this.tvBankPenerima.setText(txnDataDetail.getValue());
                return;
            case 20:
                this.tvNoTelpCabang.setText(txnDataDetail.getValue());
                return;
            case 21:
                String[] split2 = txnDataDetail.getValue().split(" ");
                if (split2.length > 1) {
                    TextView textView3 = this.tvFullAmount;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(getPromotion.j(split2[0].replace(".", ",")));
                    sb3.append(" ");
                    sb3.append(split2[1]);
                    textView3.setText(sb3.toString());
                    return;
                }
                TextView textView4 = this.tvFullAmount;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(getPromotion.j(txnDataDetail.getValue().replace(".", ",")));
                sb4.append(" IDR");
                textView4.setText(sb4.toString());
                return;
            case 22:
                this.tvNoReferensi.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case 23:
                this.n = txnDataDetail.getValue();
                return;
            case 24:
                this.etAlasan.setText(txnDataDetail.getValue());
                this.tilAlasan.setHintEnabled(true);
                return;
            case 25:
                this.tvBerita.setText(txnDataDetail.getValue());
                return;
            case 26:
                this.tvCabang.setText(txnDataDetail.getValue());
                return;
            default:
                return;
        }
    }

    private static Bitmap b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        try {
            int i = H + 81;
            F = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                return createBitmap;
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? (char) 5 : 2) != 2) {
            int i = F + 91;
            H = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            } else {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            }
            H = (F + 19) % Property.TYPE_ARRAY;
        } else {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            e(new char[]{61225, 61088, 60461, 60395, 59708, 59568, 58933, 58823, 58129, 57994, 57369, 65423, 64770, 64745, 64126, 63968, 63348, 63228, 62584, 62395, 61790, 61649, 52811, 52687, 52059, 51923, 51373, 50751}, 389 - View.combineMeasuredStates(0, 0), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    public static void c(LogRedirector.Logger logger) {
        H = (F + 99) % Property.TYPE_ARRAY;
        logger.a();
        int i = F + 35;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? ')' : ']') == ')') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC25BFormKartuKreditFragment.b) {
            CC25BFormKartuKreditFragment.d = i;
            char[] cArr2 = new char[cArr.length];
            CC25BFormKartuKreditFragment.a = 0;
            while (CC25BFormKartuKreditFragment.a < cArr.length) {
                cArr2[CC25BFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (cArr[CC25BFormKartuKreditFragment.a] ^ (CC25BFormKartuKreditFragment.a * CC25BFormKartuKreditFragment.d))) ^ G)));
                CC25BFormKartuKreditFragment.a++;
            }
            str = new String(cArr2);
        }
        objArr[0] = str;
    }

    private void v() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.x;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.B;
        infoDocumentUnderlyingActivity.a = this.I;
        this.s.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        F = (H + 7) % Property.TYPE_ARRAY;
    }

    private void y() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.x;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.u;
        this.v.d(loginasguest);
        int i = H + 3;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '3' : 'C') != 'C') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        F = (H + 73) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.E.setDisplayedChild(1);
        H = (F + 55) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
        if ((r10 <= 0.0f) != true) goto L_0x00f5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
        if ((r10 <= 1.0f) != true) goto L_0x00f5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
        r5.llSumberDana1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
        if (r6.length <= 1) goto L_0x0160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
        r0 = r5.tvSumberDana1;
        r0 = new java.lang.StringBuilder();
        r0.append(o.getPromotion.j(java.lang.Float.toString(r10).replace(".", ",")));
        r0.append(" ");
        r0.append(r6[1]);
        r0.append(" - ");
        r0.append(o.getPromotion.j(r5.p.replace(".", ",")));
        r0.setText(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0160, code lost:
        r0 = r5.tvSumberDana1;
        r0 = new java.lang.StringBuilder();
        r0.append(o.getPromotion.j(java.lang.Float.toString(r10).replace(".", ",")));
        r0.append(" IDR - ");
        r0.append(o.getPromotion.j(r5.p.replace(".", ",")));
        r0.setText(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ab, code lost:
        r5.llSumberDana1.setVisibility(8);
     */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a_(java.util.List<com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail> r6) {
        /*
        // Method dump skipped, instructions count: 875
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilORActivity.a_(java.util.List):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
        try {
            H = (F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b_(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("imei", this.m.getImei());
                bundle.putString("email", this.m.getEmail());
                bundle.putString("message", str);
                AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
                autoLogoutDialog.setArguments(bundle);
                autoLogoutDialog.show(l(), "AutoLogoutDialog");
                int i = F + 21;
                H = i % Property.TYPE_ARRAY;
                if (!(i % 2 == 0)) {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        F = (H + 49) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.E = (ViewAnimator) findViewById(2131299751);
        this.s = new DetailTransactionPresenter();
        this.v = new RateTransactionPresenter();
        this.s.e = this;
        this.v.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        Bundle extras = getIntent().getExtras();
        this.x = extras.getString("no_reff", "");
        this.B = extras.getString("token", "");
        this.w = extras.getString("flag_rating", "");
        this.I = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a8: INVOKE  
              (wrap: o.LogoutDialog : 0x009e: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilORActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilORActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00a5: CONSTRUCTOR  (r1v21 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilORActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilORActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
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
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilORActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        F = (H + 75) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.E.setDisplayedChild(1);
        int i = F + 27;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 25 : '$') == 25) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        F = (H + 43) % Property.TYPE_ARRAY;
        try {
            this.tvErrorMessage.setText(str);
            this.E.setDisplayedChild(1);
            F = (H + 13) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        int i = F + 53;
        H = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            int i2 = F + 101;
            H = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '<' : '9') == '<') {
                throw new NullPointerException();
            }
            return;
        }
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        H = (F + 25) % Property.TYPE_ARRAY;
        this.E.setDisplayedChild(0);
        F = (H + 19) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void i(String str) {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setEnabled(false);
        int i = F + 29;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? ';' : 'E') != 'E') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        int i = F + 79;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '`' : 'I') == '`') {
            throw new ArithmeticException("divide by zero");
        } else if (z) {
            int i2 = H + 101;
            F = i2 % Property.TYPE_ARRAY;
            if (!(i2 % 2 != 0)) {
                view.getId();
                throw new NullPointerException();
            } else if (view.getId() == 2131297031) {
                F = (H + 11) % Property.TYPE_ARRAY;
                this.tilKomentar.setHintEnabled(true);
                int i3 = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
                F = i3 % Property.TYPE_ARRAY;
                if (i3 % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
            }
        } else if (view.getId() == 2131297031 && this.etKomentar.getText().toString().isEmpty()) {
            H = (F + 25) % Property.TYPE_ARRAY;
            this.tilKomentar.setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilORActivity.a(DetailBerhasilORActivity.this);
            }
        }).g();
        int i = F + 115;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'N' : 'R') != 'R') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        try {
            F = (H + 41) % Property.TYPE_ARRAY;
            onDestroy();
            DetailTransactionPresenter detailTransactionPresenter = this.s;
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
            if (!(call == null)) {
                call.cancel();
            }
            detailTransactionPresenter.e = null;
            RateTransactionPresenter rateTransactionPresenter = this.v;
            Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
            if ((call2 != null ? (char) 22 : 11) == 22) {
                H = (F + 53) % Property.TYPE_ARRAY;
                call2.cancel();
            }
            rateTransactionPresenter.e = null;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if ((menuItem.getItemId() == 16908332 ? 1 : '@') != '@') {
            F = (H + 33) % Property.TYPE_ARRAY;
            onBackPressed();
            return true;
        }
        boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
        H = (F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        return onOptionsItemSelected;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        F = (H + 101) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        CC23UbahSubVisacardActivity_ViewBinding.a(this, i, iArr);
        H = (F + 83) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        H = (F + 25) % Property.TYPE_ARRAY;
        try {
            setCardSlogan.e().b = "DetailBerhasilORActivity";
            this.j = "DetailBerhasilORActivity";
            int i = H + 41;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '1' : 22) == '1') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if ((((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f ? 'V' : 15) != 15) {
            F = (H + 73) % Property.TYPE_ARRAY;
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820982);
            return;
        }
        if ((this.etKomentar.getText().toString().isEmpty() ? '(' : 'Y') != 'Y') {
            H = (F + 47) % Property.TYPE_ARRAY;
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
            return;
        }
        y();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = H + 45;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            return 2131492926;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = F + 65;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
        try {
            try {
                H = (F + 29) % Property.TYPE_ARRAY;
                return this;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296446})
    public void retry(View view) {
        int i = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            v();
            throw new NullPointerException();
        } else {
            v();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 33) != true) goto L_0x0069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 17 ? '6' : 'Z') != 'Z') goto L_0x0052;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        u();
        com.bca.smartbranch.activity.DetailBerhasilORActivity.H = (com.bca.smartbranch.activity.DetailBerhasilORActivity.F + 101) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        o.CC23UbahSubVisacardActivity_ViewBinding.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilORActivity.H
            r1 = 115(0x73, float:1.61E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilORActivity.F = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001b
            r0 = 71
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 79
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 71
            if (r0 == r1) goto L_0x003b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0031
            r0 = 1
            r5 = r0
            goto L_0x0033
        L_0x0031:
            r0 = 0
            r5 = r0
        L_0x0033:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x0052
            goto L_0x0069
        L_0x003b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x0049
            r0 = 54
            r5 = r0
            goto L_0x004c
        L_0x0049:
            r0 = 90
            r5 = r0
        L_0x004c:
            r0 = r5
            r1 = 90
            if (r0 == r1) goto L_0x0069
        L_0x0052:
            r0 = r3
            r0.u()     // Catch: Exception -> 0x0066
            int r0 = com.bca.smartbranch.activity.DetailBerhasilORActivity.F     // Catch: Exception -> 0x0066
            r1 = 101(0x65, float:1.42E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilORActivity.H = r0     // Catch: Exception -> 0x0066
            return
        L_0x0066:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0069:
            r0 = r3
            o.CC23UbahSubVisacardActivity_ViewBinding.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilORActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        int i = F + 9;
        H = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? 'B' : '*';
        z();
        if (c != 'B') {
            int i2 = F + 83;
            H = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? 16 : '\\') == 16) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        throw new ArithmeticException("divide by zero");
    }

    public final void u() {
        try {
            H = (F + 29) % Property.TYPE_ARRAY;
            b(b(this.llShare));
            try {
                int i = F + 13;
                H = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? 'X' : '?') == 'X') {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
