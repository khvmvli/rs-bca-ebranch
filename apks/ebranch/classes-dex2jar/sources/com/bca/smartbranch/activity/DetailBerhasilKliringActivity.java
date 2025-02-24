package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.adapter.TransaksiBerhasilWarkatLIstAdapter;
import com.bca.smartbranch.adapter.TransaksiBerhasilWarkatLIstPushNotifAdapter;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23UbahSubMastercardActivity_ViewBinding;
import o.CC25CFormKartuKreditFragment;
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
import o.setOnStartEnterTransitionListener;
import o.setSplitTrack;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilKliringActivity.class */
public class DetailBerhasilKliringActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static char[] F = {'9', 'k', 'd', 'f', 'o', 'r', 'p', 'q', 'O', 'K', 'e', 'h', 'g', 'i', 'j', 'k', 's', 'i', 'g', 'p', 'P', 'G', 'b', 'b', 'H', 'M', 'n', 'i'};
    private static int H;
    private static int I;
    private String A;
    private String B;
    private String C;
    private String D;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296448)
    Button btnShare;
    @BindView(2131296838)
    setSplitTrack cvInfo;
    @BindView(2131296945)
    LogoutDialog etAlasan;
    @BindView(2131297031)
    LogoutDialog etKomentar;
    private setMessage f;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297887)
    LinearLayout llShare;
    private String n;
    private TransaksiBerhasilWarkatLIstPushNotifAdapter p;
    private String q;
    private String r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    @BindView(2131298343)
    setOnStartEnterTransitionListener rvWarkat;
    private boolean s;
    private TransaksiBerhasilWarkatLIstAdapter t;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822262)
    String toolbarTitle;
    @BindView(2131297559)
    LinearLayout trCabang;
    @BindView(2131298809)
    TextView tvAccountNumber;
    @BindView(2131298870)
    TextView tvBuktiKirim;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131298876)
    TextView tvCaution;
    @BindView(2131298888)
    TextView tvCustomerType;
    @BindView(2131298949)
    TextView tvDueDate;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299485)
    TextView tvNominal;
    @BindView(2131299547)
    TextView tvReceiverName;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299689)
    TextView tvTransaksi;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private RateTransactionPresenter v;
    private DetailTransactionPresenter w;
    private String x;
    private String y;
    private ViewAnimator z;

    public DetailBerhasilKliringActivity() {
        try {
            this.f = new setMessage();
            this.s = false;
            this.B = "";
            this.q = "";
            this.r = "IDR";
            this.D = "";
            this.n = "";
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void C() {
        /*
        // Method dump skipped, instructions count: 562
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilKliringActivity.C():void");
    }

    private Context D() {
        I = (H + 93) % Property.TYPE_ARRAY;
        I = (H + 83) % Property.TYPE_ARRAY;
        return this;
    }

    private static Bitmap a(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            H = (I + 17) % Property.TYPE_ARRAY;
            return createBitmap;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cc, code lost:
        if (r0.equals("Tanggal Jatuh Tempo") != false) goto L_0x027c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d9, code lost:
        if (r0.equals("Comment") != false) goto L_0x01dc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0218, code lost:
        if (r0.equals("Rating") != false) goto L_0x021b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021b, code lost:
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x024b, code lost:
        if (r8 != '_') goto L_0x021b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail r7) {
        /*
        // Method dump skipped, instructions count: 1381
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilKliringActivity.b(com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail):void");
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        String str;
        synchronized (CC25CFormKartuKreditFragment.b) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(F, i, cArr, 0, i2);
            char[] cArr2 = cArr;
            if (bArr != null) {
                cArr2 = new char[i2];
                CC25CFormKartuKreditFragment.d = 0;
                char c = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    if (bArr[CC25CFormKartuKreditFragment.d] == 1) {
                        cArr2[CC25CFormKartuKreditFragment.d] = (char) ((char) (((cArr[CC25CFormKartuKreditFragment.d] << 1) + 1) - c));
                    } else {
                        cArr2[CC25CFormKartuKreditFragment.d] = (char) ((char) ((cArr[CC25CFormKartuKreditFragment.d] << 1) - c));
                    }
                    c = cArr2[CC25CFormKartuKreditFragment.d];
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr2, i5, i4);
                System.arraycopy(cArr3, i4, cArr2, 0, i5);
            }
            char[] cArr4 = cArr2;
            if (z) {
                cArr4 = new char[i2];
                CC25CFormKartuKreditFragment.d = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    cArr4[CC25CFormKartuKreditFragment.d] = (char) cArr2[(i2 - CC25CFormKartuKreditFragment.d) - 1];
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            if (i3 > 0) {
                CC25CFormKartuKreditFragment.d = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    cArr4[CC25CFormKartuKreditFragment.d] = (char) ((char) (cArr4[CC25CFormKartuKreditFragment.d] - iArr[2]));
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            str = new String(cArr4);
        }
        objArr[0] = str;
    }

    static /* synthetic */ void c(DetailBerhasilKliringActivity detailBerhasilKliringActivity) {
        I = (H + 15) % Property.TYPE_ARRAY;
        detailBerhasilKliringActivity.y();
        I = (H + 25) % Property.TYPE_ARRAY;
    }

    public static void c(LogRedirector.Logger logger) {
        int i = H + 35;
        I = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? ']' : '[';
        logger.a();
        if (c != '[') {
            throw new NullPointerException();
        }
        I = (H + 21) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void d(FirebaseResponse.TxnDataDetail txnDataDetail) {
        char c;
        char c2;
        I = (H + 59) % Property.TYPE_ARRAY;
        String key = txnDataDetail.getKey();
        key.hashCode();
        char c3 = 6;
        try {
            switch (key.hashCode()) {
                case -2074861248:
                    if (key.equals("Nama Penerima Dana")) {
                        I = (H + 51) % Property.TYPE_ARRAY;
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2073122997:
                    if (key.equals("Caution")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -2053478804:
                    if ((key.equals("StatusType") ? '\"' : 'V') != 'V') {
                        try {
                            I = (H + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
                            c = 2;
                            break;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    c = 65535;
                    break;
                case -1854235203:
                    if ((key.equals("Rating") ? 'O' : '1') != '1') {
                        int i = H + 115;
                        I = i % Property.TYPE_ARRAY;
                        if (i % 2 == 0) {
                            c = 3;
                            break;
                        } else {
                            c = 5;
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case -1808614382:
                    if (key.equals("Status")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1679915457:
                    if (key.equals("Comment")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1351172585:
                    if (key.equals("Tanggal Jatuh Tempo")) {
                        int i2 = H + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
                        I = i2 % Property.TYPE_ARRAY;
                        if (i2 % 2 == 0) {
                            c = 6;
                            break;
                        } else {
                            c = 'a';
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case -1238485368:
                    if (key.equals("Transaksi")) {
                        int i3 = H + 53;
                        I = i3 % Property.TYPE_ARRAY;
                        if (i3 % 2 == 0) {
                            c = 7;
                            break;
                        } else {
                            c = 18;
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case -1114849742:
                    if (key.equals("Tipe Nasabah")) {
                        I = (H + 101) % Property.TYPE_ARRAY;
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -558824660:
                    if (key.equals("Data Warkat")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 80988633:
                    if (key.equals("Token")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 83342594:
                    if (key.equals("Waktu")) {
                        c = 11;
                        H = (I + 31) % Property.TYPE_ARRAY;
                        break;
                    }
                    c = 65535;
                    break;
                case 188711872:
                    if (key.equals("Total Nominal")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 703629202:
                    if (key.equals("Nomor Rekening BCA")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1260938190:
                    if (key.equals("Nomor Referensi")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1963638442:
                    if (key.equals("Alasan")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2010750902:
                    if (key.equals("Cabang")) {
                        c = 16;
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
                    this.tvReceiverName.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                case 1:
                    this.tvCaution.setVisibility(0);
                    try {
                        Spanned fromHtml = Html.fromHtml(txnDataDetail.getValue());
                        this.tvCaution.setText(fromHtml.subSequence(0, new String(fromHtml.toString()).trim().length()));
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                case 2:
                    String value = txnDataDetail.getValue();
                    value.hashCode();
                    switch (value.hashCode()) {
                        case 48:
                            c2 = 65535;
                            if (value.equals("0")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 49:
                            if (value.equals("1")) {
                                c3 = '@';
                            }
                            if (c3 == '@') {
                                c2 = 1;
                                break;
                            } else {
                                c2 = 65535;
                                break;
                            }
                        case 50:
                            if (value.equals("2")) {
                                c2 = 2;
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
                        this.cvInfo.setVisibility(0);
                        this.s = true;
                        this.trCabang.setVisibility(0);
                        this.llRating.setVisibility(0);
                        this.btnShare.setVisibility(0);
                        this.btnProses.setEnabled(true);
                        return;
                    } else if (c2 == 1) {
                        this.trCabang.setVisibility(8);
                        this.llRating.setVisibility(8);
                        this.btnShare.setVisibility(8);
                        return;
                    } else if (c2 == 2) {
                        this.trCabang.setVisibility(8);
                        this.llRating.setVisibility(8);
                        this.btnShare.setVisibility(8);
                        this.tilAlasan.setVisibility(0);
                        return;
                    } else {
                        return;
                    }
                case 3:
                    this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                    this.ratingBar.setClickable(false);
                    this.ratingBar.setScrollable(false);
                    return;
                case 4:
                    this.tvStatus.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                case 5:
                    this.etKomentar.setText(txnDataDetail.getValue());
                    this.etKomentar.setFocusable(false);
                    this.etKomentar.setFocusableInTouchMode(false);
                    this.etKomentar.setLongClickable(false);
                    this.tilKomentar.setHintEnabled(true);
                    return;
                case 6:
                    this.tvDueDate.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                case 7:
                    this.tvTransaksi.setText(txnDataDetail.getValue());
                    return;
                case '\b':
                    this.tvCustomerType.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                case '\t':
                    this.p = new TransaksiBerhasilWarkatLIstPushNotifAdapter(D(), txnDataDetail.getValueArray());
                    this.rvWarkat.setLayoutManager(new LinearLayoutManager(1, false));
                    this.rvWarkat.setAdapter(this.p);
                    return;
                case '\n':
                    this.u = txnDataDetail.getValue();
                    return;
                case 11:
                    this.tvWaktu.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                case '\f':
                    this.tvNominal.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                case '\r':
                    this.tvAccountNumber.setText(Html.fromHtml(txnDataDetail.getValue()));
                    int i4 = H + 85;
                    I = i4 % Property.TYPE_ARRAY;
                    if (i4 % 2 != 0) {
                        Object[] objArr = null;
                        int length = objArr.length;
                        return;
                    }
                    return;
                case 14:
                    String value2 = txnDataDetail.getValue();
                    this.y = value2;
                    this.tvNoReferensi.setText(Html.fromHtml(value2));
                    return;
                case 15:
                    this.etAlasan.setText(txnDataDetail.getValue());
                    this.etAlasan.setFocusable(false);
                    this.etAlasan.setFocusableInTouchMode(false);
                    this.etAlasan.setLongClickable(false);
                    this.tilAlasan.setHintEnabled(true);
                    return;
                case 16:
                    this.tvCabang.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                default:
                    return;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT >= 29) {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                int i = I + 57;
                H = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    file2.delete();
                } else {
                    file2.delete();
                    throw new NullPointerException();
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
            b(true, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0}, new int[]{0, 28, 0, 0}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        I = (H + 101) % Property.TYPE_ARRAY;
    }

    private void u() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.y;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.C;
        infoDocumentUnderlyingActivity.a = this.A;
        this.w.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        int i = I + 111;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 11 : '!') != '!') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private void y() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.y;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.u;
        this.v.d(loginasguest);
        H = (I + 25) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        H = (I + 13) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.z.setDisplayedChild(1);
        int i = I + 5;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '\t' : 'Y') == '\t') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        try {
            Iterator<DetailTransactionResponse.TxnDataDetail> it = list.iterator();
            try {
                H = (I + 61) % Property.TYPE_ARRAY;
                while (true) {
                    if (!(it.hasNext())) {
                        break;
                    }
                    b(it.next());
                }
                this.z.setDisplayedChild(2);
                int i = I + setHasDecor$MediaBrowserCompat$MediaItem.aN;
                H = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '#' : 20) == '#') {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
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
            int i = H + 83;
            I = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
        int i = I + 29;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            int i = I + 37;
            H = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '/' : '_') == '/') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        boolean z;
        d(bundle);
        this.z = (ViewAnimator) findViewById(2131299751);
        this.w = new DetailTransactionPresenter();
        this.v = new RateTransactionPresenter();
        this.w.e = this;
        this.v.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(getString(2131822201));
        Bundle extras = getIntent().getExtras();
        this.y = extras.getString("no_reff", "");
        this.C = extras.getString("token", "");
        this.x = extras.getString("flag_rating", "");
        this.A = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: INVOKE  
              (wrap: o.LogoutDialog : 0x00a2: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilKliringActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilKliringActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00a9: CONSTRUCTOR  (r1v22 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilKliringActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilKliringActivity.class
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
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilKliringActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        int i = H + 77;
        I = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            this.tvErrorMessage.setText(str);
            this.z.setDisplayedChild(1);
            return;
        }
        this.tvErrorMessage.setText(str);
        this.z.setDisplayedChild(0);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        int i;
        ViewAnimator viewAnimator;
        try {
            int i2 = H + setHasDecor$MediaBrowserCompat$MediaItem.aN;
            I = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '\r' : 'G') != '\r') {
                this.tvErrorMessage.setText(str);
                viewAnimator = this.z;
                i = 1;
            } else {
                this.tvErrorMessage.setText(str);
                viewAnimator = this.z;
                i = 0;
            }
            viewAnimator.setDisplayedChild(i);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        try {
            I = (H + 83) % Property.TYPE_ARRAY;
            try {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
                int i = H + 41;
                I = i % Property.TYPE_ARRAY;
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

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        int i = I + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        H = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            try {
                this.z.setDisplayedChild(0);
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.z.setDisplayedChild(0);
        }
        int i2 = I + 35;
        H = i2 % Property.TYPE_ARRAY;
        if (!(i2 % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
        }
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
        boolean z = false;
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setEnabled(false);
        int i = I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            z = true;
        }
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnFocusChange({2131296945})
    public void inputChangeAlasan(View view, boolean z) {
        char c = 'Q';
        int i = H + 81;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'N' : ')') != ')') {
            throw new NullPointerException();
        }
        if (z) {
            if ((view.getId() == 2131296945 ? 'U' : 23) == 'U') {
                this.tilAlasan.setHintEnabled(true);
                I = (H + 59) % Property.TYPE_ARRAY;
                return;
            }
        } else {
            if (view.getId() != 2131296945) {
                c = '*';
            }
            if (c != '*' && this.etAlasan.getText().toString().isEmpty()) {
                this.tilAlasan.setHintEnabled(false);
                I = (H + 5) % Property.TYPE_ARRAY;
            }
        }
        H = (I + 19) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ((r6) != true) goto L_0x0039;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r5.getId() != 2131297031) goto L_0x00a6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = com.bca.smartbranch.activity.DetailBerhasilKliringActivity.H + 13;
        com.bca.smartbranch.activity.DetailBerhasilKliringActivity.I = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if ((r0 % 2) == 0) goto L_0x0073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        r4.etKomentar.getText().toString().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r4.etKomentar.getText().toString().isEmpty() == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        r4.tilKomentar.setHintEnabled(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r5.getId() != 2131297031) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        r7 = '\n';
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        r7 = '!';
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r7 == '\n') goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r4.tilKomentar.setHintEnabled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r6 != false) goto L_0x008e;
     */
    @butterknife.OnFocusChange({2131297031})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void inputChangeKomentar(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilKliringActivity.H
            r1 = 5
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilKliringActivity.I = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0019
            r0 = 0
            r7 = r0
            goto L_0x001b
        L_0x0019:
            r0 = 1
            r7 = r0
        L_0x001b:
            r0 = r7
            if (r0 == 0) goto L_0x0026
            r0 = r6
            if (r0 == 0) goto L_0x0039
            goto L_0x008e
        L_0x0026:
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x00b0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0032
            r0 = 1
            r7 = r0
            goto L_0x0034
        L_0x0032:
            r0 = 0
            r7 = r0
        L_0x0034:
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x008e
        L_0x0039:
            r0 = r5
            int r0 = r0.getId()
            r1 = 2131297031(0x7f090307, float:1.8211995E38)
            if (r0 != r1) goto L_0x00a6
            int r0 = com.bca.smartbranch.activity.DetailBerhasilKliringActivity.H
            r1 = 13
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilKliringActivity.I = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0073
            r0 = r4
            o.LogoutDialog r0 = r0.etKomentar
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: all -> 0x0070
            r1 = r0
            java.lang.String r2 = "divide by zero"
            r1.<init>(r2)     // Catch: all -> 0x0070
            throw r0     // Catch: all -> 0x0070
        L_0x0070:
            r5 = move-exception
            r0 = r5
            throw r0
        L_0x0073:
            r0 = r4
            o.LogoutDialog r0 = r0.etKomentar
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a6
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.tilKomentar
            r1 = 0
            r0.setHintEnabled(r1)
            goto L_0x00a6
        L_0x008e:
            r0 = r5
            int r0 = r0.getId()
            r1 = 2131297031(0x7f090307, float:1.8211995E38)
            if (r0 != r1) goto L_0x009d
            r0 = 10
            r7 = r0
            goto L_0x00a0
        L_0x009d:
            r0 = 33
            r7 = r0
        L_0x00a0:
            r0 = r7
            r1 = 10
            if (r0 == r1) goto L_0x00a7
        L_0x00a6:
            return
        L_0x00a7:
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.tilKomentar
            r1 = 1
            r0.setHintEnabled(r1)
            return
        L_0x00b0:
            r5 = move-exception
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilKliringActivity.inputChangeKomentar(android.view.View, boolean):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        try {
            x();
            try {
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilKliringActivity.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DetailBerhasilKliringActivity.c(DetailBerhasilKliringActivity.this);
                    }
                }).g();
                I = (H + 31) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = I + 61;
        H = i % Property.TYPE_ARRAY;
        boolean z = true;
        if (i % 2 == 0) {
            onDestroy();
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = this.w.c;
            throw new ArithmeticException("divide by zero");
        }
        onDestroy();
        try {
            DetailTransactionPresenter detailTransactionPresenter = this.w;
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call2 = detailTransactionPresenter.c;
            DetailTransactionPresenter detailTransactionPresenter2 = detailTransactionPresenter;
            if (!(call2 == null)) {
                int i2 = H + 31;
                I = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    call2.cancel();
                    Object[] objArr = null;
                    int length = objArr.length;
                    detailTransactionPresenter2 = detailTransactionPresenter;
                } else {
                    try {
                        call2.cancel();
                        detailTransactionPresenter2 = detailTransactionPresenter;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            detailTransactionPresenter2.e = null;
            RateTransactionPresenter rateTransactionPresenter = this.v;
            Call<OpenAccountSuccessActivity<Object>> call3 = rateTransactionPresenter.a;
            if (call3 != null) {
                z = false;
            }
            if (!z) {
                call3.cancel();
            }
            rateTransactionPresenter.e = null;
            I = (H + 11) % Property.TYPE_ARRAY;
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        H = (I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        if ((menuItem.getItemId() == 16908332 ? '5' : '`') == '`') {
            return onOptionsItemSelected(menuItem);
        }
        int i = I + 49;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            onBackPressed();
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = H + 7;
        I = i2 % Property.TYPE_ARRAY;
        if (!(i2 % 2 == 0)) {
            onRequestPermissionsResult(i, strArr, iArr);
            CC23UbahSubMastercardActivity_ViewBinding.b(this, i, iArr);
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        onRequestPermissionsResult(i, strArr, iArr);
        CC23UbahSubMastercardActivity_ViewBinding.b(this, i, iArr);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'H' : 'B') != 'H') {
            setCardSlogan.e().b = "DetailBerhasilKliringActivity";
            this.j = "DetailBerhasilKliringActivity";
            int i2 = I + 15;
            H = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 == 0 ? '\r' : '`') != '`') {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        setCardSlogan.e().b = "DetailBerhasilKliringActivity";
        this.j = "DetailBerhasilKliringActivity";
        throw new NullPointerException();
    }

    @OnClick({2131296440})
    public void proses(View view) {
        H = (I + 71) % Property.TYPE_ARRAY;
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (!(((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a > 0.0f)) {
            int i = I + 5;
            H = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                this.tvErrorKomentar.setVisibility(1);
            } else {
                this.tvErrorKomentar.setVisibility(0);
            }
            this.tvErrorKomentar.setText(2131820982);
            return;
        }
        if ((this.etKomentar.getText().toString().isEmpty() ? 27 : '1') != 27) {
            y();
            return;
        }
        this.tvErrorKomentar.setVisibility(0);
        this.tvErrorKomentar.setText(2131820765);
        this.tilKomentar.setBackgroundResource(2131230870);
        this.etKomentar.requestFocus();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        H = (I + 21) % Property.TYPE_ARRAY;
        H = (I + 97) % Property.TYPE_ARRAY;
        return 2131492924;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        H = (I + 77) % Property.TYPE_ARRAY;
        I = (H + 61) % Property.TYPE_ARRAY;
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        int i = I + 31;
        H = i % Property.TYPE_ARRAY;
        char c = i % 2 == 0 ? 'b' : 19;
        u();
        if (c != 'b') {
            I = (H + 95) % Property.TYPE_ARRAY;
            return;
        }
        throw new ArithmeticException("divide by zero");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 66) != false) goto L_0x0042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        r0 = com.bca.smartbranch.activity.DetailBerhasilKliringActivity.I + 69;
        com.bca.smartbranch.activity.DetailBerhasilKliringActivity.H = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        if ((r0 % 2) != 0) goto L_0x0062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        r0 = null;
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        o.CC23UbahSubMastercardActivity_ViewBinding.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilKliringActivity.I     // Catch: Exception -> 0x006c
            r1 = 91
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilKliringActivity.H = r0     // Catch: Exception -> 0x006c
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001b
            r0 = 80
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 45
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 45
            if (r0 == r1) goto L_0x003a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 66
            if (r0 < r1) goto L_0x0031
            r0 = 1
            r5 = r0
            goto L_0x0033
        L_0x0031:
            r0 = 0
            r5 = r0
        L_0x0033:
            r0 = r5
            if (r0 == 0) goto L_0x0067
            goto L_0x0042
        L_0x003a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0067
        L_0x0042:
            int r0 = com.bca.smartbranch.activity.DetailBerhasilKliringActivity.I
            r1 = 69
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilKliringActivity.H = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0062
            r0 = r3
            r0.v()
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x005f
            r5 = r0
            return
        L_0x005f:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0062:
            r0 = r3
            r0.v()     // Catch: Exception -> 0x006c
            return
        L_0x0067:
            r0 = r3
            o.CC23UbahSubMastercardActivity_ViewBinding.d(r0)
            return
        L_0x006c:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilKliringActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        try {
            int i = I + 37;
            H = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                z();
                int i2 = I + 47;
                H = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? '`' : '&') != '&') {
                    throw new ArithmeticException("divide by zero");
                }
                return;
            }
            z();
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    public final void v() {
        int i = I + 19;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            e(a(this.llShare));
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        e(a(this.llShare));
    }
}
