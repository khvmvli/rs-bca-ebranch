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
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ListMultipleReservasiAdapter;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import io.realm.RealmResults;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.CC25BFormKartuKreditFragment;
import o.DetailBerhasilEChannelNotificationActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.consumeDisplayCutout;
import o.equals;
import o.getLifecycle;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiROSuccessActivity.class */
public class ReservasiROSuccessActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static int C;
    private static int D;
    private static long z;
    private boolean A;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297858)
    LinearLayout llPhoneWrapper;
    @BindView(2131297875)
    LinearLayout llRuangan;
    private Bitmap n;
    @BindString(2131821358)
    String note;
    private CreateQueueReservationResponse p;
    private String q;
    @BindString(2131822092)
    String retry;
    @BindView(2131298336)
    setOnStartEnterTransitionListener rvTransaksi;
    private ListMultipleReservasiAdapter s;
    @BindView(2131298420)
    getLifecycle svMain;
    private QRCodeDialog t;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298866)
    TextView tvBranchCityProvince;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298868)
    TextView tvBranchPhone;
    @BindView(2131299268)
    TextView tvHeader;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299409)
    TextView tvMessage;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299554)
    TextView tvReservasiDate;
    @BindView(2131299615)
    TextView tvTitle;
    private String u;
    private String v;
    private RealmResults<ReservasiOnline> w;
    private SendEmailTransactionSuccessPresenter x;
    private GetBranchROResponse.DetailBranch y;
    private setMessage f = new setMessage();
    private boolean r = false;

    static /* synthetic */ String b(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        int i = D + 77;
        C = i % Property.TYPE_ARRAY;
        boolean z2 = i % 2 != 0;
        String str = reservasiROSuccessActivity.u;
        if (!z2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        D = (C + 35) % Property.TYPE_ARRAY;
        return str;
    }

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT < 29) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (!(!file2.exists())) {
                C = (D + 1) % Property.TYPE_ARRAY;
                file2.delete();
                D = (C + 113) % Property.TYPE_ARRAY;
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
            d(new char[]{9054, 25269, 41118, 59046, 9411, 27357, 43062, 60994, 11382, 29263, 45146, 63394, 13725, 31716, 47597, 65493, 15651, 17161, 33131, 50998, 1345, 17596, 35464, 51338, 3836, 19670, 37422, 53266}, getApplicationInfo().targetSdkVersion + 16837, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private static Bitmap d(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        C = (D + 19) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter d(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter;
        try {
            int i = D + 81;
            C = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                sendEmailTransactionSuccessPresenter = reservasiROSuccessActivity.x;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                sendEmailTransactionSuccessPresenter = reservasiROSuccessActivity.x;
            }
            try {
                D = (C + 39) % Property.TYPE_ARRAY;
                return sendEmailTransactionSuccessPresenter;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static void d(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC25BFormKartuKreditFragment.b) {
            CC25BFormKartuKreditFragment.d = i;
            char[] cArr2 = new char[cArr.length];
            CC25BFormKartuKreditFragment.a = 0;
            while (CC25BFormKartuKreditFragment.a < cArr.length) {
                cArr2[CC25BFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (cArr[CC25BFormKartuKreditFragment.a] ^ (CC25BFormKartuKreditFragment.a * CC25BFormKartuKreditFragment.d))) ^ z)));
                CC25BFormKartuKreditFragment.a++;
            }
            str = new String(cArr2);
        }
        objArr[0] = str;
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.u);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z2 = true;
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
            if (!(!file2.exists())) {
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
            d(new char[]{9054, 25269, 41118, 59046, 9411, 27357, 43062, 60994, 11382, 29263, 45146, 63394, 13725, 31716, 47597, 65493, 15651, 17161, 33131, 50998, 1345, 17596, 35464, 51338, 3836, 19670, 37422, 53266}, getApplicationInfo().targetSdkVersion + 16837, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (!(!this.A)) {
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.t;
        if (qRCodeDialog != null) {
            z2 = false;
        }
        if (!z2) {
            int i = D + 17;
            C = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                qRCodeDialog.dismiss();
                throw new ArithmeticException("divide by zero");
            } else {
                qRCodeDialog.dismiss();
                C = (D + 59) % Property.TYPE_ARRAY;
            }
        }
        C = (D + 31) % Property.TYPE_ARRAY;
    }

    public static void e(LogRedirector.Logger logger) {
        C = (D + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        try {
            logger.a();
            D = (C + 87) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
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
        int i = C + 69;
        D = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReservasiROSuccessActivity.d(ReservasiROSuccessActivity.this).c(new LoginSessionActivity_ViewBinding(ReservasiROSuccessActivity.this.m.getEmail(), ReservasiROSuccessActivity.b(ReservasiROSuccessActivity.this)));
            }
        }).g();
        D = (C + 57) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        C = (D + 39) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
        try {
            try {
                D = (C + 49) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028b A[SYNTHETIC] */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 1295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiROSuccessActivity.d(android.os.Bundle):void");
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
            D = (C + 73) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        try {
            int i = C + 73;
            D = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 24 : '^') != '^') {
                z();
                throw new NullPointerException();
            } else {
                z();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        int i = C + 43;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? ')' : '(') != '(') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = C + 81;
        D = i % Property.TYPE_ARRAY;
        boolean z2 = true;
        if (i % 2 == 0) {
            onDestroy();
            SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.x;
            Call<OpenAccountSuccessActivity<Object>> call = sendEmailTransactionSuccessPresenter.a;
            if (call != null) {
                z2 = false;
            }
            SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
            if (z2) {
                sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
            } else {
                call.cancel();
            }
            sendEmailTransactionSuccessPresenter2.b = null;
            try {
                try {
                    C = (D + 7) % Property.TYPE_ARRAY;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            onDestroy();
            Call<OpenAccountSuccessActivity<Object>> call2 = this.x.a;
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = C + 59;
        D = i2 % Property.TYPE_ARRAY;
        try {
            if ((i2 % 2 != 0 ? '3' : ' ') != '3') {
                onRequestPermissionsResult(i, strArr, iArr);
                DetailBerhasilEChannelNotificationActivity.e(this, i, iArr);
                try {
                    C = (D + 25) % Property.TYPE_ARRAY;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                onRequestPermissionsResult(i, strArr, iArr);
                DetailBerhasilEChannelNotificationActivity.e(this, i, iArr);
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = C + 79;
        D = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            setCardSlogan.e().b = "ReservasiROSuccessActivity";
            this.j = "ReservasiROSuccessActivity";
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        try {
            setCardSlogan.e().b = "ReservasiROSuccessActivity";
            this.j = "ReservasiROSuccessActivity";
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = C + 9;
        D = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        C = (D + 91) % Property.TYPE_ARRAY;
        return 2131492993;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        D = (C + 69) % Property.TYPE_ARRAY;
        C = (D + 27) % Property.TYPE_ARRAY;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0049;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        com.bca.smartbranch.activity.ReservasiROSuccessActivity.C = (com.bca.smartbranch.activity.ReservasiROSuccessActivity.D + 65) % io.realm.internal.Property.TYPE_ARRAY;
        v();
        r0 = com.bca.smartbranch.activity.ReservasiROSuccessActivity.C + 73;
        com.bca.smartbranch.activity.ReservasiROSuccessActivity.D = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        if ((r0 % 2) == 0) goto L_0x0077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        r5 = '`';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        r5 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (r5 == 15) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
        o.DetailBerhasilEChannelNotificationActivity.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 99) goto L_0x0049;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.ReservasiROSuccessActivity.D
            r1 = 25
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiROSuccessActivity.C = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001b
            r0 = 80
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 83
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 83
            if (r0 == r1) goto L_0x0037
            r0 = r3
            r1 = r4
            boolean r1 = r1.c
            r0.A = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 99
            if (r0 < r1) goto L_0x008c
            goto L_0x0049
        L_0x0037:
            r0 = r3
            r1 = r4
            boolean r1 = r1.c     // Catch: Exception -> 0x0094
            r0.A = r1     // Catch: Exception -> 0x0094
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0091, Exception -> 0x0094
            r5 = r0
            r0 = r5
            r1 = 33
            if (r0 < r1) goto L_0x008c
        L_0x0049:
            int r0 = com.bca.smartbranch.activity.ReservasiROSuccessActivity.D
            r1 = 65
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiROSuccessActivity.C = r0
            r0 = r3
            r0.v()
            int r0 = com.bca.smartbranch.activity.ReservasiROSuccessActivity.C
            r1 = 73
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiROSuccessActivity.D = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0077
            r0 = 96
            r5 = r0
            goto L_0x007a
        L_0x0077:
            r0 = 15
            r5 = r0
        L_0x007a:
            r0 = r5
            r1 = 15
            if (r0 == r1) goto L_0x008b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x0088
            r1 = r0
            r1.<init>()     // Catch: all -> 0x0088
            throw r0     // Catch: all -> 0x0088
        L_0x0088:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x008b:
            return
        L_0x008c:
            r0 = r3
            o.DetailBerhasilEChannelNotificationActivity.a(r0)
            return
        L_0x0091:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0094:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiROSuccessActivity.saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH):void");
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        int i = D + 49;
        C = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            try {
                onBackPressed();
            } catch (Exception e) {
                throw e;
            }
        } else {
            onBackPressed();
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            int i = C + 95;
            try {
                D = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    this.f.b(this.llDetail, this.ivDetail);
                    D = (C + 115) % Property.TYPE_ARRAY;
                    return;
                }
                this.f.b(this.llDetail, this.ivDetail);
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        try {
            D = (C + 75) % Property.TYPE_ARRAY;
            try {
                if (this.r) {
                    startActivity(new Intent(this, InfoDocumentUnderlyingActivity.class));
                    D = (C + 7) % Property.TYPE_ARRAY;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if ((r5.llDetail.getVisibility() == 8) != false) goto L_0x0064;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        if ((r5.llDetail.getVisibility() == 1 ? ' ' : 'c') != ' ') goto L_0x0073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        r5.f.b(r5.llDetail, r5.ivDetail);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        z();
        new android.os.Handler().postDelayed(new com.bca.smartbranch.activity.ReservasiROSuccessActivity.AnonymousClass5(), 500);
        r0 = com.bca.smartbranch.activity.ReservasiROSuccessActivity.D + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
        com.bca.smartbranch.activity.ReservasiROSuccessActivity.C = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if ((r0 % 2) != 0) goto L_0x00a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r7 == true) goto L_0x00af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        throw new java.lang.NullPointerException();
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void simpanGallery(android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiROSuccessActivity.simpanGallery(android.view.View):void");
    }

    public final void t() {
        int i = D + 13;
        C = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            c(d(this.llMain));
        } else {
            c(d(this.llMain));
            Object[] objArr = null;
            int length = objArr.length;
        }
        C = (D + 13) % Property.TYPE_ARRAY;
    }

    public final void v() {
        D = (C + 59) % Property.TYPE_ARRAY;
        try {
            e(this.n);
            C = (D + 71) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131297409})
    public void zoomQRCode() {
        try {
            D = (C + 83) % Property.TYPE_ARRAY;
            if (this.t == null) {
                this.t = new QRCodeDialog();
            }
            QRCodeDialog qRCodeDialog = this.t;
            Bitmap bitmap = this.n;
            String charSequence = this.tvNoReferensi.getText().toString();
            qRCodeDialog.b = bitmap;
            qRCodeDialog.d = charSequence;
            this.t.show(l(), "QRCodeDialog");
            int i = C + 101;
            D = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
