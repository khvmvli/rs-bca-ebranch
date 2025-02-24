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
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23AFormKartuKreditFragment_ViewBinding;
import o.CC23UbahSubVisacardActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilORNotificationActivity.class */
public class DetailBerhasilORNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int A;
    private static int D;
    private static int G;
    private String B;
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
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    @BindString(2131822137)
    String sumberDana1English;
    @BindString(2131822139)
    String sumberDana2English;
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
    private ViewAnimator z;
    private String r = "";
    private setMessage f = new setMessage();
    private boolean t = false;
    private String x = "";
    private String q = "";
    private String C = "";
    private String s = "";
    private String y = "";

    public static void a(LogRedirector.Logger logger) {
        G = (D + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
        try {
            logger.a();
            D = (G + 5) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    private static Bitmap b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = D + 21;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'T' : 'Z') != 'T') {
            return createBitmap;
        }
        throw new NullPointerException();
    }

    private static void b(int i, char[] cArr, int i2, int i3, boolean z, Object[] objArr) {
        String str;
        synchronized (CC23AFormKartuKreditFragment_ViewBinding.e) {
            char[] cArr2 = new char[i];
            CC23AFormKartuKreditFragment_ViewBinding.c = 0;
            while (CC23AFormKartuKreditFragment_ViewBinding.c < i) {
                CC23AFormKartuKreditFragment_ViewBinding.a = cArr[CC23AFormKartuKreditFragment_ViewBinding.c];
                cArr2[CC23AFormKartuKreditFragment_ViewBinding.c] = (char) ((char) (CC23AFormKartuKreditFragment_ViewBinding.a + i2));
                int i4 = CC23AFormKartuKreditFragment_ViewBinding.c;
                cArr2[i4] = (char) ((char) (cArr2[i4] - A));
                CC23AFormKartuKreditFragment_ViewBinding.c++;
            }
            if (i3 > 0) {
                CC23AFormKartuKreditFragment_ViewBinding.b = i3;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - CC23AFormKartuKreditFragment_ViewBinding.b, CC23AFormKartuKreditFragment_ViewBinding.b);
                System.arraycopy(cArr3, CC23AFormKartuKreditFragment_ViewBinding.b, cArr2, 0, i - CC23AFormKartuKreditFragment_ViewBinding.b);
            }
            char[] cArr4 = cArr2;
            if (z) {
                cArr4 = new char[i];
                CC23AFormKartuKreditFragment_ViewBinding.c = 0;
                while (CC23AFormKartuKreditFragment_ViewBinding.c < i) {
                    cArr4[CC23AFormKartuKreditFragment_ViewBinding.c] = (char) cArr2[(i - CC23AFormKartuKreditFragment_ViewBinding.c) - 1];
                    CC23AFormKartuKreditFragment_ViewBinding.c++;
                }
            }
            str = new String(cArr4);
        }
        objArr[0] = str;
    }

    static /* synthetic */ void c(DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity) {
        try {
            int i = D + 75;
            try {
                G = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 'a' : 'X') != 'a') {
                    detailBerhasilORNotificationActivity.u();
                    int i2 = D + setHasDecor$MediaBrowserCompat$MediaItem.aD;
                    G = i2 % Property.TYPE_ARRAY;
                    if ((i2 % 2 == 0 ? '/' : 23) != 23) {
                        Object[] objArr = null;
                        int length = objArr.length;
                        return;
                    }
                    return;
                }
                detailBerhasilORNotificationActivity.u();
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void c(List<FirebaseResponse.TxnDataDetail> list) {
        G = (D + 113) % Property.TYPE_ARRAY;
        for (FirebaseResponse.TxnDataDetail txnDataDetail : list) {
            e(txnDataDetail);
        }
        TextView textView = this.tvNominal;
        StringBuilder sb = new StringBuilder();
        sb.append(getPromotion.j(this.u.replace(".", ",")));
        sb.append(" ");
        sb.append(this.n);
        textView.setText(sb.toString());
        boolean z = false;
        if (this.y.equals("0")) {
            if ((!this.x.isEmpty() ? 'W' : '*') == 'W') {
                String[] split = this.x.split(" ");
                float parseFloat = Float.parseFloat(split[0]);
                if (parseFloat <= 0.0f) {
                    this.llSumberDana1.setVisibility(8);
                } else {
                    this.llSumberDana1.setVisibility(0);
                    if (split.length > 1) {
                        try {
                            TextView textView2 = this.tvSumberDana1;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(getPromotion.j(Float.toString(parseFloat).replace(".", ",")));
                            sb2.append(" ");
                            sb2.append(split[1]);
                            sb2.append(" - ");
                            sb2.append(getPromotion.j(this.q.replace(".", ",")));
                            textView2.setText(sb2.toString());
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        TextView textView3 = this.tvSumberDana1;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(getPromotion.j(Float.toString(parseFloat).replace(".", ",")));
                        sb3.append(" IDR - ");
                        sb3.append(getPromotion.j(this.q.replace(".", ",")));
                        textView3.setText(sb3.toString());
                    }
                }
            }
            if (!this.C.isEmpty()) {
                String[] split2 = this.C.split(" ");
                float parseFloat2 = Float.parseFloat(split2[0]);
                if (parseFloat2 > 0.0f) {
                    try {
                        this.llSumberDana2.setVisibility(0);
                        if (split2.length > 1) {
                            TextView textView4 = this.tvSumberDana2;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(getPromotion.j(Float.toString(parseFloat2).replace(".", ",")));
                            sb4.append(" ");
                            sb4.append(split2[1]);
                            sb4.append(" - ");
                            sb4.append(getPromotion.j(this.s.replace(".", ",")));
                            textView4.setText(sb4.toString());
                        } else {
                            TextView textView5 = this.tvSumberDana2;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(getPromotion.j(Float.toString(parseFloat2).replace(".", ",")));
                            sb5.append(" IDR - ");
                            sb5.append(getPromotion.j(this.s.replace(".", ",")));
                            textView5.setText(sb5.toString());
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    this.llSumberDana2.setVisibility(8);
                }
            }
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH.mm");
            Date parse = simpleDateFormat.parse(this.p);
            TextView textView6 = this.tvWaktu;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.B);
            sb6.append(", ");
            sb6.append(simpleDateFormat2.format(parse));
            sb6.append(" WIB");
            textView6.setText(sb6.toString());
        } catch (Exception e3) {
            TextView textView7 = this.tvWaktu;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(this.B);
            sb7.append(", ");
            sb7.append(this.p);
            sb7.append(" WIB");
            textView7.setText(sb7.toString());
        }
        this.z.setDisplayedChild(2);
        int i = D + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            z = true;
        }
        if (z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT >= 29) {
            int i = G + 23;
            D = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'L' : 'W') != 'W') {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[0];
                strArr[0] = uri.getPath();
                MediaScannerConnection.scanFile(this, strArr, new String[]{"image/jpeg"}, null);
            } else {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            }
            D = (G + 59) % Property.TYPE_ARRAY;
        } else {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                int i2 = G + 79;
                D = i2 % Property.TYPE_ARRAY;
                if (!(i2 % 2 != 0)) {
                    file2.delete();
                } else {
                    file2.delete();
                    throw new ArithmeticException("divide by zero");
                }
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
            b(getResources().getString(2131821267).substring(2, 4).length() + 26, new char[]{65535, 65483, '\n', '\f', 0, 15, 2, 1, 6, 19, '\f', 15, '\r', 65483, 5, 0, 11, 65534, 15, 65535, 17, 15, 65534, '\n', 16, 65483, 65534, 0}, getPackageName().length() + 167, getResources().getString(2131821267).substring(2, 4).codePointAt(0) - 31, true, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void e(FirebaseResponse.TxnDataDetail txnDataDetail) {
        char c;
        char c2;
        String key = txnDataDetail.getKey();
        key.hashCode();
        char c3 = ')';
        switch (key.hashCode()) {
            case -2126560350:
                if (key.equals("Biaya Today dan Telex")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2126271420:
                if (key.equals("Nomor Ppu")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -2053478804:
                if (key.equals("StatusType")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1990226152:
                if (key.equals("Kode Swift")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1854235203:
                if (key.equals("Rating")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1808614382:
                if (key.equals("Status")) {
                    G = (D + 41) % Property.TYPE_ARRAY;
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1800708348:
                if (key.equals("Mata Uang")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1714803651:
                if (key.equals("Sumber Dana 1")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1714803650:
                if (key.equals("Sumber Dana 2")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1679915457:
                if (key.equals("Comment")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1238485368:
                if (key.equals("Transaksi")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -507420484:
                if (key.equals("Nominal")) {
                    int i = G + setHasDecor$MediaBrowserCompat$MediaItem.aN;
                    D = i % Property.TYPE_ARRAY;
                    if (i % 2 == 0) {
                        c = 11;
                        break;
                    } else {
                        c = 'C';
                        break;
                    }
                }
                c = 65535;
                break;
            case 74230:
                if (key.equals("Jam")) {
                    int i2 = G + 71;
                    D = i2 % Property.TYPE_ARRAY;
                    if ((i2 % 2 != 0 ? 'J' : ';') == ';') {
                        c = '\f';
                        break;
                    } else {
                        c = '*';
                        break;
                    }
                }
                c = 65535;
                break;
            case 80988633:
                if (key.equals("Token")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 122683404:
                if (key.equals("Tanggal")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 380447383:
                if (key.equals("Penerima")) {
                    G = (D + 111) % Property.TYPE_ARRAY;
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 382034843:
                if (key.equals("Pengirim")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 443063848:
                if (key.equals("Kurs Sumber Dana 1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 443063849:
                if (key.equals("Kurs Sumber Dana 2")) {
                    G = (D + 53) % Property.TYPE_ARRAY;
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 474576859:
                if (key.equals("Bank Penerima")) {
                    c3 = 'L';
                }
                if (c3 == 'L') {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 791299234:
                if (key.equals("Nomor Telepon Cabang")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1112467787:
                if (key.equals("Biaya Full Amount")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1260938190:
                if ((key.equals("Nomor Referensi") ? '1' : 'a') != 'a') {
                    int i3 = G + 47;
                    D = i3 % Property.TYPE_ARRAY;
                    if (i3 % 2 == 0) {
                        c = 22;
                        break;
                    } else {
                        c = 16;
                        break;
                    }
                }
                c = 65535;
                break;
            case 1950516649:
                if (key.equals("Kode Mata Uang")) {
                    c = 23;
                    G = (D + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
                    break;
                }
                c = 65535;
                break;
            case 1963638442:
                if ((key.equals("Alasan") ? '=' : '\b') != '\b') {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1986300359:
                if (key.equals("Berita")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 2010750902:
                if (key.equals("Cabang")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
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
                        c2 = 65535;
                        if (value.equals("0")) {
                            G = (D + 15) % Property.TYPE_ARRAY;
                            c2 = 0;
                            break;
                        }
                        break;
                    case 49:
                        if ((value.equals("1") ? 27 : '#') == 27) {
                            c2 = 1;
                            break;
                        } else {
                            c2 = 65535;
                            break;
                        }
                    case 50:
                        c2 = 65535;
                        if (value.equals("2")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 51:
                        if (value.equals("3")) {
                            c2 = 3;
                            break;
                        } else {
                            c2 = 65535;
                            break;
                        }
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    this.t = true;
                    this.llRating.setVisibility(0);
                    this.btnShare.setVisibility(0);
                    this.btnProses.setEnabled(true);
                    y();
                    this.llCatatan.setVisibility(0);
                    return;
                } else if (c2 == 1) {
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
                    y();
                    this.llCatatan.setVisibility(8);
                    return;
                } else if (c2 == 2) {
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
                    y();
                    this.llCatatan.setVisibility(8);
                    return;
                } else if (c2 == 3) {
                    this.cvInfo.setVisibility(0);
                    this.llKodeSwift.setVisibility(8);
                    this.llSumberDana1.setVisibility(8);
                    this.llSumberDana2.setVisibility(8);
                    this.llFullAmount.setVisibility(8);
                    this.llTodayTelex.setVisibility(8);
                    this.llBerita.setVisibility(8);
                    this.llRating.setVisibility(8);
                    this.btnShare.setVisibility(8);
                    y();
                    this.llCatatan.setVisibility(8);
                    return;
                } else {
                    return;
                }
            case 3:
                this.tvKodeSwift.setText(txnDataDetail.getValue());
                return;
            case 4:
                if (!txnDataDetail.getValue().isEmpty()) {
                    try {
                        this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                        this.ratingBar.setClickable(false);
                        this.ratingBar.setScrollable(false);
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    return;
                }
            case 5:
                this.tvStatus.setText(txnDataDetail.getValue());
                return;
            case 6:
                this.tvMataUang.setText(txnDataDetail.getValue());
                return;
            case 7:
                this.x = txnDataDetail.getValue();
                return;
            case '\b':
                this.C = txnDataDetail.getValue();
                return;
            case '\t':
                if (!txnDataDetail.getValue().isEmpty()) {
                    int i4 = D + 39;
                    G = i4 % Property.TYPE_ARRAY;
                    if (i4 % 2 == 0) {
                        this.etKomentar.setText(txnDataDetail.getValue());
                        this.etKomentar.setFocusable(true);
                        this.etKomentar.setFocusableInTouchMode(true);
                        this.etKomentar.setLongClickable(false);
                        this.tilKomentar.setHintEnabled(false);
                        return;
                    }
                    this.etKomentar.setText(txnDataDetail.getValue());
                    this.etKomentar.setFocusable(false);
                    this.etKomentar.setFocusableInTouchMode(false);
                    this.etKomentar.setLongClickable(false);
                    this.tilKomentar.setHintEnabled(true);
                    return;
                }
                return;
            case '\n':
                this.tvTransaksi.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case 11:
                this.u = txnDataDetail.getValue();
                return;
            case '\f':
                this.p = txnDataDetail.getValue();
                return;
            case '\r':
                this.w = txnDataDetail.getValue();
                return;
            case 14:
                this.B = txnDataDetail.getValue();
                return;
            case 15:
                this.tvNamaPenerima.setText(txnDataDetail.getValue());
                return;
            case 16:
                this.tvNamaPengirim.setText(txnDataDetail.getValue());
                return;
            case 17:
                this.q = txnDataDetail.getValue();
                return;
            case 18:
                this.s = txnDataDetail.getValue();
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

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.r;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.w;
        this.v.d(loginasguest);
        G = (D + 5) % Property.TYPE_ARRAY;
    }

    private void y() {
        G = (D + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
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
        int i = D + 45;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
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
        try {
            try {
                G = (D + 37) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.z = (ViewAnimator) findViewById(2131299751);
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.v = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        boolean z = false;
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if ((firebaseResponse == null ? '#' : 6) != 6) {
            G = (D + 17) % Property.TYPE_ARRAY;
            Bundle extras = getIntent().getExtras();
            firebaseResponse2 = firebaseResponse;
            if (extras != null) {
                firebaseResponse2 = new FirebaseResponse();
                firebaseResponse2.setType(extras.getString("Type"));
                firebaseResponse2.setAlert(extras.getString("Alert"));
                firebaseResponse2.setRefNo(extras.getString("RefNo"));
                try {
                    JSONArray jSONArray = new JSONArray(extras.getString("TxnDataDetail"));
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
                        txnDataDetail.setKey(optJSONObject.optString("Key"));
                        txnDataDetail.setValue(optJSONObject.optString("Value"));
                        arrayList.add(txnDataDetail);
                    }
                    firebaseResponse2.setTxnDataDetailList(arrayList);
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
            }
        }
        if (firebaseResponse2 != null) {
            z = true;
        }
        if (z) {
            int i2 = D + 61;
            G = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                this.r = firebaseResponse2.getRefNo();
                throw new NullPointerException();
            }
            this.r = firebaseResponse2.getRefNo();
        }
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0181: INVOKE  
              (wrap: o.LogoutDialog : 0x0177: IGET  (r0v27 o.LogoutDialog A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x017e: CONSTRUCTOR  (r1v15 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilORNotificationActivity.class
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
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        try {
            int i = D + 33;
            G = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
                return;
            }
            try {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void i(String str) {
        try {
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
            D = (G + 17) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        if (!(!z)) {
            int i = G + 73;
            D = i % Property.TYPE_ARRAY;
            int id = view.getId();
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            } else if (id == 2131297031) {
                this.tilKomentar.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297031) {
            if (this.etKomentar.getText().toString().isEmpty()) {
                G = (D + 17) % Property.TYPE_ARRAY;
                this.tilKomentar.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilORNotificationActivity.c(DetailBerhasilORNotificationActivity.this);
            }
        }).g();
        D = (G + 19) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        RateTransactionPresenter rateTransactionPresenter = this.v;
        Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
        if (call != null) {
            D = (G + 45) % Property.TYPE_ARRAY;
            call.cancel();
        }
        try {
            rateTransactionPresenter.e = null;
            int i = D + 5;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '1' : 'W') == '1') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = D + 115;
        G = i % Property.TYPE_ARRAY;
        boolean z = false;
        if ((i % 2 == 0 ? ',' : '_') != ',') {
            if (menuItem.getItemId() == 16908332) {
                z = true;
            }
            if (z) {
                onBackPressed();
                return true;
            }
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            G = (D + 49) % Property.TYPE_ARRAY;
            return onOptionsItemSelected;
        }
        menuItem.getItemId();
        throw new ArithmeticException("divide by zero");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        D = (G + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        CC23UbahSubVisacardActivity.e(this, i, iArr);
        int i2 = G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        D = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = G + 33;
        D = i % Property.TYPE_ARRAY;
        boolean z = true;
        if (i % 2 != 0) {
            setCardSlogan.e().b = "DetailBerhasilORNotificationActivity";
            this.j = "DetailBerhasilORNotificationActivity";
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            setCardSlogan.e().b = "DetailBerhasilORNotificationActivity";
            this.j = "DetailBerhasilORNotificationActivity";
        }
        int i2 = G + 93;
        D = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            z = false;
        }
        if (z) {
            Object[] objArr2 = null;
            int length2 = objArr2.length;
        }
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (!(((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a > 0.0f)) {
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820982);
            return;
        }
        if ((this.etKomentar.getText().toString().isEmpty() ? '!' : 'H') != 'H') {
            G = (D + 7) % Property.TYPE_ARRAY;
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
            return;
        }
        u();
        G = (D + 15) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = D + 111;
        G = i % Property.TYPE_ARRAY;
        boolean z = true;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = D + 93;
        G = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return 2131492926;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = D + 1;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'G' : '8') != '8') {
            throw new NullPointerException();
        }
        G = (D + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        return this;
    }

    public final void s() {
        D = (G + 3) % Property.TYPE_ARRAY;
        char c = 2;
        try {
            e(b(this.llShare));
            int i = G + 79;
            D = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                c = 11;
            }
            if (c != 11) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296448})
    public void share(View view) {
        if ((Build.VERSION.SDK_INT >= 33 ? (char) 17 : 23) != 17) {
            try {
                CC23UbahSubVisacardActivity.c(this);
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i = D + 1;
            G = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                try {
                    s();
                    throw new NullPointerException();
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                s();
                D = (G + 3) % Property.TYPE_ARRAY;
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        int i = D + 99;
        G = i % Property.TYPE_ARRAY;
        char c = i % 2 == 0 ? '.' : '>';
        z();
        if (c == '.') {
            throw new NullPointerException();
        }
    }
}
