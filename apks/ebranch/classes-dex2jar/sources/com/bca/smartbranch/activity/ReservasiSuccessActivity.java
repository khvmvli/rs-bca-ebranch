package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC23AFormKartuKreditFragment_ViewBinding;
import o.DetailBerhasilBTNotificationActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiSuccessActivity.class */
public class ReservasiSuccessActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static int D;
    private static int u;
    private static int w;
    private setMessage f = new setMessage();
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297875)
    LinearLayout llRuangan;
    private Bitmap n;
    @BindString(2131821358)
    String note;
    private CreateQueueReservationResponse p;
    private SendEmailTransactionSuccessPresenter q;
    private QRCodeDialog r;
    @BindString(2131822092)
    String retry;
    private String s;
    @BindView(2131298420)
    ScrollView svMain;
    private String t;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298925)
    TextView tvDescriptionKey;
    @BindView(2131298928)
    TextView tvDescriptionValue;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299554)
    TextView tvReservasiDate;
    @BindView(2131299615)
    TextView tvTitle;
    private String v;
    private String x;
    private boolean y;

    static /* synthetic */ String a(ReservasiSuccessActivity reservasiSuccessActivity) {
        w = (D + 65) % Property.TYPE_ARRAY;
        String str = reservasiSuccessActivity.s;
        w = (D + 69) % Property.TYPE_ARRAY;
        return str;
    }

    public static void b(LogRedirector.Logger logger) {
        int i = w + 77;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'b' : '\t') != '\t') {
            logger.a();
            throw new NullPointerException();
        }
        logger.a();
        int i2 = w + 87;
        D = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter c(ReservasiSuccessActivity reservasiSuccessActivity) {
        int i = D + 1;
        w = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 23 : '5') != '5') {
            try {
                SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = reservasiSuccessActivity.q;
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } else {
            SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = reservasiSuccessActivity.q;
            int i2 = D + 101;
            w = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? (char) 6 : '\r') != 6) {
                return sendEmailTransactionSuccessPresenter2;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return sendEmailTransactionSuccessPresenter2;
        }
    }

    private static void c(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) {
        String str;
        synchronized (CC23AFormKartuKreditFragment_ViewBinding.e) {
            char[] cArr2 = new char[i3];
            CC23AFormKartuKreditFragment_ViewBinding.c = 0;
            while (CC23AFormKartuKreditFragment_ViewBinding.c < i3) {
                CC23AFormKartuKreditFragment_ViewBinding.a = cArr[CC23AFormKartuKreditFragment_ViewBinding.c];
                cArr2[CC23AFormKartuKreditFragment_ViewBinding.c] = (char) ((char) (CC23AFormKartuKreditFragment_ViewBinding.a + i2));
                int i4 = CC23AFormKartuKreditFragment_ViewBinding.c;
                cArr2[i4] = (char) ((char) (cArr2[i4] - u));
                CC23AFormKartuKreditFragment_ViewBinding.c++;
            }
            if (i > 0) {
                CC23AFormKartuKreditFragment_ViewBinding.b = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - CC23AFormKartuKreditFragment_ViewBinding.b, CC23AFormKartuKreditFragment_ViewBinding.b);
                System.arraycopy(cArr3, CC23AFormKartuKreditFragment_ViewBinding.b, cArr2, 0, i3 - CC23AFormKartuKreditFragment_ViewBinding.b);
            }
            char[] cArr4 = cArr2;
            if (z) {
                cArr4 = new char[i3];
                CC23AFormKartuKreditFragment_ViewBinding.c = 0;
                while (CC23AFormKartuKreditFragment_ViewBinding.c < i3) {
                    cArr4[CC23AFormKartuKreditFragment_ViewBinding.c] = (char) cArr2[(i3 - CC23AFormKartuKreditFragment_ViewBinding.c) - 1];
                    CC23AFormKartuKreditFragment_ViewBinding.c++;
                }
            }
            str = new String(cArr4);
        }
        objArr[0] = str;
    }

    private static Bitmap d(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            D = (w + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
            return createBitmap;
        } catch (Exception e) {
            throw e;
        }
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if (!(Build.VERSION.SDK_INT >= 29)) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if ((file2.exists() ? '+' : 'G') == '+') {
                int i = w + 111;
                D = i % Property.TYPE_ARRAY;
                if (!(i % 2 == 0)) {
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
            c(false, 24 - Color.blue(0), new char[]{65535, 0, 65534, 65483, 16, '\n', 65534, 15, 17, 65535, 15, 65534, 11, 0, 5, 65483, '\r', 15, '\f', 19, 6, 1, 2, 15, 0, '\f', '\n', 65483}, getResources().getString(2131821267).substring(2, 4).length() + 165, getPackageName().codePointAt(18) - 76, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            D = (w + 61) % Property.TYPE_ARRAY;
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.s);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            int i = D + 89;
            w = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[0];
                strArr[1] = uri.getPath();
                String[] strArr2 = new String[1];
                strArr2[1] = "image/jpeg";
                MediaScannerConnection.scanFile(this, strArr, strArr2, null);
            } else {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            }
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
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            c(false, getPackageName().length() + 5, new char[]{65535, 0, 65534, 65483, 16, '\n', 65534, 15, 17, 65535, 15, 65534, 11, 0, 5, 65483, '\r', 15, '\f', 19, 6, 1, 2, 15, 0, '\f', '\n', 65483}, getResources().getString(2131821267).substring(2, 4).length() + 165, getResources().getString(2131822451).substring(0, 4).codePointAt(2) - 8, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if ((this.y ? ')' : '6') != '6') {
            w = (D + 95) % Property.TYPE_ARRAY;
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.r;
        if (qRCodeDialog == null) {
            z = true;
        }
        if (!z) {
            qRCodeDialog.dismiss();
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        D = (w + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReservasiSuccessActivity.c(ReservasiSuccessActivity.this).c(new LoginSessionActivity_ViewBinding(ReservasiSuccessActivity.this.m.getEmail(), ReservasiSuccessActivity.a(ReservasiSuccessActivity.this)));
            }
        }).g();
        int i = w + 89;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 11 : '=') == 11) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        int i = w + 27;
        D = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
            throw new ArithmeticException("divide by zero");
        }
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x015e, code lost:
        if (r0.equals("Tahapan Berjangka") != false) goto L_0x0161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0228, code lost:
        if ((r0.equals("Tahapan BCA") ? 24 : 'X') != 24) goto L_0x022b;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 856
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiSuccessActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            int i = w + 37;
            D = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        try {
            try {
                w = (D + 101) % Property.TYPE_ARRAY;
                z();
                int i = D + 43;
                w = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? '<' : '5') != '5') {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        int i = w + 57;
        D = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = w + 9;
        D = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            onDestroy();
            Call<OpenAccountSuccessActivity<Object>> call = this.q.a;
            throw new ArithmeticException("divide by zero");
        }
        onDestroy();
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.q;
        Call<OpenAccountSuccessActivity<Object>> call2 = sendEmailTransactionSuccessPresenter.a;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
        if (call2 != null) {
            int i2 = D + 79;
            w = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? (char) 6 : 27) != 6) {
                call2.cancel();
                sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
            } else {
                call2.cancel();
                Object[] objArr = null;
                int length = objArr.length;
                sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
            }
        }
        try {
            sendEmailTransactionSuccessPresenter2.b = null;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = D + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        w = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 'J' : 5) != 'J') {
            onRequestPermissionsResult(i, strArr, iArr);
            try {
                DetailBerhasilBTNotificationActivity_ViewBinding.c(this, i, iArr);
                int i3 = w + 75;
                D = i3 % Property.TYPE_ARRAY;
                if ((i3 % 2 == 0 ? 31 : '$') == 31) {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            onRequestPermissionsResult(i, strArr, iArr);
            DetailBerhasilBTNotificationActivity_ViewBinding.c(this, i, iArr);
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = w + 37;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'E' : 6) != 'E') {
            setCardSlogan.e().b = "ReservasiSuccessActivity";
            this.j = "ReservasiSuccessActivity";
            try {
                w = (D + 71) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            setCardSlogan.e().b = "ReservasiSuccessActivity";
            this.j = "ReservasiSuccessActivity";
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        w = (D + 65) % Property.TYPE_ARRAY;
        int i = D + 91;
        w = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return 2131492994;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            w = (D + 93) % Property.TYPE_ARRAY;
            D = (w + 115) % Property.TYPE_ARRAY;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        D = (w + 111) % Property.TYPE_ARRAY;
        this.y = branchMapItemBNAdapter$BranchMapItemVH.c;
        if ((Build.VERSION.SDK_INT >= 33 ? '/' : 2) != 2) {
            int i = w + 93;
            D = i % Property.TYPE_ARRAY;
            char c = i % 2 == 0 ? 22 : 'M';
            u();
            if (c != 'M') {
                throw new NullPointerException();
            }
            return;
        }
        try {
            DetailBerhasilBTNotificationActivity_ViewBinding.a(this);
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        try {
            int i = D + 57;
            w = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                try {
                    onBackPressed();
                    throw new NullPointerException();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                onBackPressed();
                w = (D + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            try {
                w = (D + 79) % Property.TYPE_ARRAY;
                this.f.b(this.llDetail, this.ivDetail);
                D = (w + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", this.x);
        startActivity(intent);
        int i = w + 21;
        D = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnClick({2131296448})
    public void simpanGallery(View view) {
        w = (D + 27) % Property.TYPE_ARRAY;
        try {
            try {
                if (this.llDetail.getVisibility() == 8) {
                    int i = w + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
                    D = i % Property.TYPE_ARRAY;
                    if ((i % 2 == 0 ? 28 : '<') != '<') {
                        this.f.b(this.llDetail, this.ivDetail);
                        Object[] objArr = null;
                        int length = objArr.length;
                    } else {
                        this.f.b(this.llDetail, this.ivDetail);
                    }
                }
                z();
                new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (Build.VERSION.SDK_INT >= 33) {
                            ReservasiSuccessActivity.this.t();
                        } else {
                            DetailBerhasilBTNotificationActivity_ViewBinding.d(ReservasiSuccessActivity.this);
                        }
                    }
                }, 500);
                int i2 = w + 37;
                D = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? '\"' : ']') != ']') {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void t() {
        w = (D + 111) % Property.TYPE_ARRAY;
        d(d(this.llMain));
        int i = D + 87;
        w = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '+' : '.') != '.') {
            throw new NullPointerException();
        }
    }

    public final void u() {
        int i = w + 97;
        D = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            e(this.n);
            throw new ArithmeticException("divide by zero");
        }
        e(this.n);
        try {
            try {
                D = (w + 111) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        r4.r = new com.bca.smartbranch.dialog.QRCodeDialog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        r0 = r4.r;
        r0 = r4.n;
        r0 = r4.tvNoReferensi.getText().toString();
        r0.b = r0;
        r0.d = r0;
        r4.r.show(l(), "QRCodeDialog");
        r0 = com.bca.smartbranch.activity.ReservasiSuccessActivity.w + 81;
        com.bca.smartbranch.activity.ReservasiSuccessActivity.D = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
        if ((r0 % 2) != 0) goto L_0x0090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
        if (r5 == false) goto L_0x0097;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r4.r == null) goto L_0x003a;
     */
    @butterknife.OnClick({2131297409})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void zoomQRCode() {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.ReservasiSuccessActivity.D
            r1 = 47
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiSuccessActivity.w = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 22
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 51
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 22
            if (r0 == r1) goto L_0x002e
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r
            if (r0 != 0) goto L_0x0045
            goto L_0x003a
        L_0x002e:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r     // Catch: Exception -> 0x00a8
            r6 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x00a5
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0045
        L_0x003a:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r1 = new com.bca.smartbranch.dialog.QRCodeDialog
            r2 = r1
            r2.<init>()
            r0.r = r1
        L_0x0045:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r     // Catch: Exception -> 0x00a2
            r6 = r0
            r0 = r4
            android.graphics.Bitmap r0 = r0.n     // Catch: Exception -> 0x00a2
            r7 = r0
            r0 = r4
            android.widget.TextView r0 = r0.tvNoReferensi     // Catch: Exception -> 0x00a2
            java.lang.CharSequence r0 = r0.getText()     // Catch: Exception -> 0x00a2
            java.lang.String r0 = r0.toString()     // Catch: Exception -> 0x00a2
            r8 = r0
            r0 = r6
            r1 = r7
            r0.b = r1     // Catch: Exception -> 0x00a2
            r0 = r6
            r1 = r8
            r0.d = r1     // Catch: Exception -> 0x00a2
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r     // Catch: Exception -> 0x00a2
            r1 = r4
            o.isDetached r1 = r1.l()     // Catch: Exception -> 0x00a2
            java.lang.String r2 = "QRCodeDialog"
            r0.show(r1, r2)     // Catch: Exception -> 0x00a2
            int r0 = com.bca.smartbranch.activity.ReservasiSuccessActivity.w     // Catch: Exception -> 0x00a2
            r1 = 81
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiSuccessActivity.D = r0     // Catch: Exception -> 0x00a2
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0090
            r0 = 0
            r5 = r0
            goto L_0x0092
        L_0x0090:
            r0 = 1
            r5 = r0
        L_0x0092:
            r0 = r5
            if (r0 == 0) goto L_0x0097
            return
        L_0x0097:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x009f
            r1 = r0
            r1.<init>()     // Catch: all -> 0x009f
            throw r0     // Catch: all -> 0x009f
        L_0x009f:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x00a2:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x00a5:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x00a8:
            r6 = move-exception
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiSuccessActivity.zoomQRCode():void");
    }
}
