package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindArray;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.CC25BFormKartuKreditFragment;
import o.LogRedirector;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getCardDescription;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.share;
import o.updateProfil;
import org.joda.time.format.DateTimeFormat;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanNotificationActivity.class */
public class BN7PengambilanNotificationActivity extends BaseActivityPostLogin {
    private static long F;
    private static int I;
    private static int N;
    private String A;
    private String B;
    private Menu C;
    private MenuItem D;
    private boolean E;
    private ViewAnimator G;
    private String H;
    setMessage f;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297408)
    ImageView ivQRCode;
    @BindArray(2130903064)
    String[] listJenisID;
    @BindView(2131297621)
    RelativeLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    private String n;
    private boolean p;
    private Bitmap q;
    private QRCodeDialog r;
    private boolean s;
    private String t;
    @BindView(2131298864)
    TextView tvALamat;
    @BindView(2131298843)
    TextView tvBatasWaktuPengambilan;
    @BindView(2131298867)
    TextView tvCabang;
    @BindView(2131298917)
    TextView tvDenom;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299275)
    TextView tvIdPengambil;
    @BindView(2131299327)
    TextView tvJumlahPembelian;
    @BindView(2131299364)
    TextView tvKodeOtorisasi;
    @BindView(2131299433)
    TextView tvNamaPengambil;
    @BindView(2131299467)
    TextView tvNoRef;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299684)
    TextView tvTotalPembayaran;
    @BindView(2131299700)
    TextView tvUbahData;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public BN7PengambilanNotificationActivity() {
        try {
            this.f = new setMessage();
            try {
                this.A = "";
                this.p = false;
                this.w = "";
                this.H = "";
                this.u = "";
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static Bitmap a(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        N = (I + 89) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 14 : 'a') != 14) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                file2.delete();
                N = (I + 53) % Property.TYPE_ARRAY;
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
            b(new char[]{18701, 35750, 52301, 3765, 17296, 33870, 50917, 7121, 23589, 40668, 54153, 5169, 22222, 43895, 60478, 11974, 25456, 42010, 59064, 15141, 31762, 48815, 62299, 13337, 30383, 19269, 36349, 52865}, getResources().getString(2131822451).substring(0, 4).length() + 49827, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            N = (I + 87) % Property.TYPE_ARRAY;
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC25BFormKartuKreditFragment.b) {
            CC25BFormKartuKreditFragment.d = i;
            char[] cArr2 = new char[cArr.length];
            CC25BFormKartuKreditFragment.a = 0;
            while (CC25BFormKartuKreditFragment.a < cArr.length) {
                cArr2[CC25BFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (cArr[CC25BFormKartuKreditFragment.a] ^ (CC25BFormKartuKreditFragment.a * CC25BFormKartuKreditFragment.d))) ^ F)));
                CC25BFormKartuKreditFragment.a++;
            }
            str = new String(cArr2);
        }
        objArr[0] = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void c(FirebaseResponse.TxnDataDetail txnDataDetail) {
        int i = N + 39;
        I = i % Property.TYPE_ARRAY;
        char c = 2;
        boolean z = false;
        boolean z2 = false;
        char c2 = '\f';
        if (!(i % 2 == 0)) {
            String key = txnDataDetail.getKey();
            key.hashCode();
            key.hashCode();
            throw new ArithmeticException("divide by zero");
        }
        String key2 = txnDataDetail.getKey();
        key2.hashCode();
        switch (key2.hashCode()) {
            case -2065004047:
                if (key2.equals("Jumlah")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -932588989:
                if (key2.equals("Pecahan Uang")) {
                    I = (N + 57) % Property.TYPE_ARRAY;
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -539248321:
                if (key2.equals("Batas Pengambilan")) {
                    N = (I + 87) % Property.TYPE_ARRAY;
                    break;
                }
                c = 65535;
                break;
            case 2350411:
                if (key2.equals("Kurs")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 67066748:
                if (key2.equals("Email")) {
                    z = true;
                }
                if (z) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 80988633:
                if (key2.equals("Token")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 80997156:
                if (key2.equals("Total")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 757473618:
                if (key2.equals("Nama Pengambil")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1115319260:
                if (key2.equals("Tipe ID Pengambil")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125806085:
                if (key2.equals("Kondisi")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1260938190:
                if (key2.equals("Nomor Referensi")) {
                    I = (N + 57) % Property.TYPE_ARRAY;
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1300694455:
                if (key2.equals("Nomor ID Pengambil")) {
                    N = (I + 47) % Property.TYPE_ARRAY;
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1796688394:
                if (key2.equals("Kode Otorisasi")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1950516649:
                if (!key2.equals("Kode Mata Uang")) {
                    c2 = 'c';
                }
                if (c2 != 'c') {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1963632682:
                if (key2.equals("Alamat")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2010750902:
                if (!key2.equals("Cabang")) {
                    z2 = true;
                }
                if (!z2) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                    this.v = txnDataDetail.getValue();
                    return;
                case 1:
                    this.y = txnDataDetail.getValue();
                    return;
                case 2:
                    this.tvBatasWaktuPengambilan.setText(DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy").parseDateTime(txnDataDetail.getValue())));
                    return;
                case 3:
                    this.z = txnDataDetail.getValue();
                    return;
                case 4:
                    this.t = txnDataDetail.getValue();
                    return;
                case 5:
                    try {
                        this.B = txnDataDetail.getValue();
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                case 6:
                    TextView textView = this.tvTotalPembayaran;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getPromotion.a(txnDataDetail.getValue()));
                    sb.append(" IDR");
                    textView.setText(sb.toString());
                    return;
                case 7:
                    if (!txnDataDetail.getValue().isEmpty()) {
                        this.tvNamaPengambil.setText(txnDataDetail.getValue());
                        return;
                    }
                    return;
                case '\b':
                    if (!txnDataDetail.getValue().isEmpty()) {
                        String value = txnDataDetail.getValue();
                        value.hashCode();
                        if (value.equals("1")) {
                            this.w = "KTP";
                            return;
                        } else if (value.equals("3")) {
                            this.w = "Paspor";
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case '\t':
                    this.n = txnDataDetail.getValue();
                    return;
                case '\n':
                    this.tvNoRef.setText(txnDataDetail.getValue());
                    String value2 = txnDataDetail.getValue();
                    this.A = value2;
                    Bitmap a = getPromotion.a(value2, this);
                    this.q = a;
                    this.ivQRCode.setImageBitmap(a);
                    return;
                case 11:
                    if (!txnDataDetail.getValue().isEmpty()) {
                        this.H = txnDataDetail.getValue();
                        return;
                    }
                    return;
                case '\f':
                    this.tvKodeOtorisasi.setText(txnDataDetail.getValue());
                    return;
                case '\r':
                    this.x = txnDataDetail.getValue();
                    return;
                case 14:
                    this.tvALamat.setText(txnDataDetail.getValue());
                    return;
                case 15:
                    this.u = txnDataDetail.getValue();
                    this.tvCabang.setText(txnDataDetail.getValue());
                    return;
                default:
                    return;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void c(LogRedirector.Logger logger) {
        try {
            int i = I + setHasDecor$MediaBrowserCompat$MediaItem.aI;
            N = i % Property.TYPE_ARRAY;
            boolean z = i % 2 != 0;
            logger.a();
            if (!z) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.A);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = false;
        if ((Build.VERSION.SDK_INT >= 29 ? 'K' : 18) != 'K') {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                I = (N + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
                file2.delete();
                N = (I + 75) % Property.TYPE_ARRAY;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            b(new char[]{18701, 35750, 52301, 3765, 17296, 33870, 50917, 7121, 23589, 40668, 54153, 5169, 22222, 43895, 60478, 11974, 25456, 42010, 59064, 15141, 31762, 48815, 62299, 13337, 30383, 19269, 36349, 52865}, getResources().getString(2131822451).substring(0, 4).codePointAt(2) + 49795, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (this.E) {
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            int i = N + 93;
            I = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                Object[] objArr2 = null;
                int length = objArr2.length;
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.r;
        if (qRCodeDialog != null) {
            z = true;
        }
        if (z) {
            qRCodeDialog.dismiss();
        }
    }

    private void u() {
        if (this.h.isEmpty() || this.C == null) {
            try {
                try {
                    if (this.h.isEmpty()) {
                        if (this.C != null) {
                            int i = N + 29;
                            I = i % Property.TYPE_ARRAY;
                            if (i % 2 != 0) {
                            }
                            this.D.setVisible(false);
                        }
                    }
                    int i2 = I + 15;
                    N = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 == 0) {
                        Object[] objArr = null;
                        int length = objArr.length;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            N = (I + 15) % Property.TYPE_ARRAY;
            this.D.setVisible(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ff A[LOOP:1: B:34:0x012d->B:83:0x02ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0145 A[EDGE_INSN: B:95:0x0145->B:40:0x0145 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void y() {
        /*
        // Method dump skipped, instructions count: 783
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.y():void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.G = (ViewAnimator) findViewById(2131299751);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "Jika ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "melewati batas waktu pengambilan");
        spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) ", dana akan dikembalikan sesuai kurs yang berlaku.\n");
        spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length, spannableStringBuilder.length(), 33);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "Pecahan uang yang didapat menyesuaikan ");
        int length4 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "ketersediaan stok tiap cabang.");
        spannableStringBuilder.setSpan(new StyleSpan(1), length4, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length3, spannableStringBuilder.length(), 33);
        this.tvNote.setText(spannableStringBuilder);
        y();
        int i = I + 23;
        N = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'D' : 21) != 21) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r6.h.equalsIgnoreCase("") != false) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        startActivity(new android.content.Intent(r6, com.bca.smartbranch.activity.LandingActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        o.setOnHierarchyChangeListener.d((android.app.Activity) r6);
        com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = (com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N + 43) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        onBackPressed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        return;
     */
    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onBackPressed() {
        /*
            r6 = this;
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N
            r1 = 75
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001a
            r0 = 1
            r7 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r7 = r0
        L_0x001c:
            r0 = r7
            if (r0 == 0) goto L_0x0037
            r0 = r6
            java.lang.String r0 = r0.h
            java.lang.String r1 = ""
            boolean r0 = r0.equalsIgnoreCase(r1)
            r8 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0034
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0070
            goto L_0x0043
        L_0x0034:
            r9 = move-exception
            r0 = r9
            throw r0
        L_0x0037:
            r0 = r6
            java.lang.String r0 = r0.h
            java.lang.String r1 = ""
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0070
        L_0x0043:
            r0 = r6
            android.content.Intent r1 = new android.content.Intent
            r2 = r1
            r3 = r6
            java.lang.Class<com.bca.smartbranch.activity.LandingActivity> r4 = com.bca.smartbranch.activity.LandingActivity.class
            r2.<init>(r3, r4)
            r0.startActivity(r1)
            r0 = r6
            r1 = 2130772009(0x7f010029, float:1.7147124E38)
            r2 = 2130772012(0x7f01002c, float:1.714713E38)
            r0.overridePendingTransition(r1, r2)
            r0 = r6
            o.setOnHierarchyChangeListener.d(r0)
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N
            r1 = 43
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = r0
            return
        L_0x0070:
            r0 = r6
            r0.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.onBackPressed():void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = I + 49;
        N = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
        }
        getMenuInflater().inflate(2131558409, menu);
        this.C = menu;
        this.D = menu.findItem(2131298038);
        u();
        int i2 = I + 87;
        N = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? '0' : 'A') == 'A') {
            return true;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = I + 51;
        N = i % Property.TYPE_ARRAY;
        char c = i % 2 == 0 ? 'O' : ',';
        onDestroy();
        if (c != ',') {
            throw new ArithmeticException("divide by zero");
        }
        N = (I + 23) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if ((r7.getItemId() == 16908332) != true) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0 == 16908332) goto L_0x0050;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        onBackPressed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r7.getItemId() != 2131298038) goto L_0x007d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        startActivity(new android.content.Intent(r6, com.bca.smartbranch.activity.MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0 = onOptionsItemSelected(r7);
        r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I + 95;
        com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        if ((r0 % 2) != 0) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        return r0;
     */
    @Override // android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            r6 = this;
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N
            r1 = 105(0x69, float:1.47E-43)
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = r0
            r0 = r8
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 46
            r8 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 86
            r8 = r0
        L_0x001e:
            r0 = r8
            r1 = 46
            if (r0 == r1) goto L_0x003f
            r0 = r7
            int r0 = r0.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto L_0x0035
            r0 = 1
            r8 = r0
            goto L_0x0037
        L_0x0035:
            r0 = 0
            r8 = r0
        L_0x0037:
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L_0x0050
            goto L_0x0056
        L_0x003f:
            r0 = r7
            int r0 = r0.getItemId()
            r8 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x00aa
            r9 = r0
            r0 = r8
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto L_0x0056
        L_0x0050:
            r0 = r6
            r0.onBackPressed()
            r0 = 1
            return r0
        L_0x0056:
            r0 = r7
            int r0 = r0.getItemId()
            r1 = 2131298038(0x7f0906f6, float:1.8214038E38)
            if (r0 != r1) goto L_0x007d
            r0 = r6
            android.content.Intent r1 = new android.content.Intent
            r2 = r1
            r3 = r6
            java.lang.Class<com.bca.smartbranch.activity.MainActivity> r4 = com.bca.smartbranch.activity.MainActivity.class
            r2.<init>(r3, r4)
            r0.startActivity(r1)
            r0 = r6
            r1 = 2130772009(0x7f010029, float:1.7147124E38)
            r2 = 2130772012(0x7f01002c, float:1.714713E38)
            r0.overridePendingTransition(r1, r2)
            r0 = 1
            return r0
        L_0x007d:
            r0 = r6
            r1 = r7
            boolean r0 = r0.onOptionsItemSelected(r1)
            r10 = r0
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I
            r1 = 95
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N = r0
            r0 = r8
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x00a7
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: all -> 0x00a4
            r1 = r0
            java.lang.String r2 = "divide by zero"
            r1.<init>(r2)     // Catch: all -> 0x00a4
            throw r0     // Catch: all -> 0x00a4
        L_0x00a4:
            r7 = move-exception
            r0 = r7
            throw r0
        L_0x00a7:
            r0 = r10
            return r0
        L_0x00aa:
            r7 = move-exception
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = N + 65;
        I = i2 % Property.TYPE_ARRAY;
        if (!(i2 % 2 != 0)) {
            onRequestPermissionsResult(i, strArr, iArr);
            share.b(this, i, iArr);
            I = (N + 83) % Property.TYPE_ARRAY;
            return;
        }
        onRequestPermissionsResult(i, strArr, iArr);
        share.b(this, i, iArr);
        throw new NullPointerException();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onUpdateReceiver(updateProfil updateprofil) {
        this.tvNamaPengambil.setText(updateprofil.a);
        StringBuilder sb = new StringBuilder();
        sb.append(updateprofil.e);
        sb.append(" - ");
        sb.append(updateprofil.d);
        this.tvIdPengambil.setText(sb);
        this.tvIdPengambil.setVisibility(0);
        this.tvUbahData.setVisibility(8);
        N = (I + 19) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        try {
            N = (I + 99) % Property.TYPE_ARRAY;
            setCardSlogan.e().b = "BN7PengambilanNotificationActivity";
            this.j = "BN7PengambilanNotificationActivity";
            int i = N + 85;
            I = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        N = (I + 81) % Property.TYPE_ARRAY;
        int i = N + 21;
        I = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return 2131492899;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492899;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        N = (I + 99) % Property.TYPE_ARRAY;
        int i = N + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        I = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            return this;
        }
        throw new ArithmeticException("divide by zero");
    }

    public final void s() {
        I = (N + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        e(this.q);
        N = (I + 15) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 57 ? 'G' : 16) != 16) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N + 3;
        com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        if ((r0 % 2) == 0) goto L_0x006c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r6 == true) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
        o.share.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        return;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH r5) {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I     // Catch: Exception -> 0x008f
            r1 = 9
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N = r0     // Catch: Exception -> 0x008f
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001a
            r0 = 0
            r6 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 1
            r6 = r0
        L_0x001c:
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L_0x0043
            r0 = r4
            r1 = r5
            boolean r1 = r1.c
            r0.E = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 57
            if (r0 < r1) goto L_0x0037
            r0 = 71
            r6 = r0
            goto L_0x003a
        L_0x0037:
            r0 = 16
            r6 = r0
        L_0x003a:
            r0 = r6
            r1 = 16
            if (r0 == r1) goto L_0x008a
            goto L_0x0053
        L_0x0043:
            r0 = r4
            r1 = r5
            boolean r1 = r1.c
            r0.E = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x008a
        L_0x0053:
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N
            r1 = 3
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x006c
            r0 = 1
            r6 = r0
            goto L_0x006e
        L_0x006c:
            r0 = 0
            r6 = r0
        L_0x006e:
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L_0x0078
            r0 = r4
            r0.s()
            return
        L_0x0078:
            r0 = r4
            r0.s()     // Catch: Exception -> 0x008f
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: Exception -> 0x008f, all -> 0x0087
            r1 = r0
            java.lang.String r2 = "divide by zero"
            r1.<init>(r2)     // Catch: all -> 0x0087
            throw r0     // Catch: all -> 0x0087
        L_0x0087:
            r5 = move-exception
            r0 = r5
            throw r0
        L_0x008a:
            r0 = r4
            o.share.d(r0)
            return
        L_0x008f:
            r5 = move-exception
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH):void");
    }

    @OnClick({2131296447})
    public void selesai() {
        int i = I + 113;
        N = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '#' : 'O') != '#') {
            try {
                this.s = false;
                finish();
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.s = false;
            finish();
        }
        try {
            I = (N + 31) % Property.TYPE_ARRAY;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r6 != true) goto L_0x0071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r5.llDetail.getVisibility() == 11) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        r5.f.b(r5.llDetail, r5.ivDetail);
        com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = (com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % io.realm.internal.Property.TYPE_ARRAY;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share() {
        /*
            r5 = this;
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I
            r1 = 11
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001b
            r0 = 38
            r6 = r0
            goto L_0x001d
        L_0x001b:
            r0 = 3
            r6 = r0
        L_0x001d:
            r0 = 0
            r7 = r0
            r0 = r6
            r1 = 38
            if (r0 == r1) goto L_0x0042
            r0 = r5
            r1 = 1
            r0.s = r1
            r0 = r7
            r6 = r0
            r0 = r5
            android.widget.RelativeLayout r0 = r0.llDetail
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x003a
            r0 = 1
            r6 = r0
        L_0x003a:
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L_0x0053
            goto L_0x0071
        L_0x0042:
            r0 = r5
            r1 = 0
            r0.s = r1
            r0 = r5
            android.widget.RelativeLayout r0 = r0.llDetail
            int r0 = r0.getVisibility()
            r1 = 11
            if (r0 != r1) goto L_0x0071
        L_0x0053:
            r0 = r5
            o.setMessage r0 = r0.f
            r1 = r5
            android.widget.RelativeLayout r1 = r1.llDetail
            r2 = r5
            android.widget.ImageView r2 = r2.ivDetail
            r0.b(r1, r2)
            int r0 = com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.N
            r1 = 103(0x67, float:1.44E-43)
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.I = r0
        L_0x0071:
            r0 = r5
            r0.z()
            android.os.Handler r0 = new android.os.Handler
            r1 = r0
            r1.<init>()
            com.bca.smartbranch.activity.BN7PengambilanNotificationActivity$2 r1 = new com.bca.smartbranch.activity.BN7PengambilanNotificationActivity$2
            r2 = r1
            r3 = r5
            r2.<init>()
            r2 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r0.postDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity.share():void");
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            N = (I + 43) % Property.TYPE_ARRAY;
            this.f.b(this.llDetail, this.ivDetail);
            I = (N + 31) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void t() {
        try {
            N = (I + 49) % Property.TYPE_ARRAY;
            b(a(this.llMain));
            try {
                N = (I + 19) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131299700})
    public void ubahData() {
        Intent intent = new Intent(this, BN7PengambilanUpdateReceiverActivity.class);
        try {
            intent.putExtra("token", this.B);
            intent.putExtra("cabang", this.u);
            startActivity(intent);
            int i = N + 9;
            I = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131297408})
    public void zoomQRCode() {
        N = (I + 95) % Property.TYPE_ARRAY;
        if (this.r == null) {
            this.r = new QRCodeDialog();
            try {
                N = (I + 9) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        }
        QRCodeDialog qRCodeDialog = this.r;
        Bitmap bitmap = this.q;
        String str = this.A;
        qRCodeDialog.b = bitmap;
        qRCodeDialog.d = str;
        this.r.show(l(), "QRCodeDialog");
    }
}
