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
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.CC23CFormKartuKreditFragment_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LoginSessionActivity_ViewBinding;
import o.clikedTeleponHalloBCA;
import o.consumeDisplayCutout;
import o.equals;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OpenAccountSuccessActivity.class */
public class OpenAccountSuccessActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static int B;
    private static int z;
    @BindView(2131296447)
    Button btnSelesai;
    private setMessage f = new setMessage();
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    private Bitmap n;
    @BindString(2131821358)
    String note;
    private String p;
    private String q;
    private String r;
    @BindString(2131822092)
    String retry;
    private QRCodeDialog s;
    private String t;
    @BindView(2131298925)
    TextView tvDescriptionKey;
    @BindView(2131298928)
    TextView tvDescriptionValue;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    private String u;
    private String v;
    private String w;
    private SendEmailTransactionSuccessPresenter x;
    private boolean y;
    private static char[] D = {53417, 5698, 23913, 33873, 52020, 12842, 31169, 41141, 59265, 11960, 5549, 23381, 33386, 51475, 12314, 30498, 48852, 58878, 11420, 5057, 23222, 32843, 51071, 3709, 29963, 48161, 58329, 10981};
    private static long C = -4997210407600470297L;

    static /* synthetic */ String a(OpenAccountSuccessActivity openAccountSuccessActivity) {
        int i = z + 53;
        B = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? 21 : '4';
        String str = openAccountSuccessActivity.v;
        if (c != '4') {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = z + 89;
        B = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new ArithmeticException("divide by zero");
    }

    private static Bitmap b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        B = (z + 3) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.v);
        sb.append(".jpg");
        String obj = sb.toString();
        char c = 0;
        if (Build.VERSION.SDK_INT < 29) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (!(!file2.exists())) {
                int i = B + 51;
                z = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 11 : '_') != '_') {
                    file2.delete();
                    throw new ArithmeticException("divide by zero");
                }
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
            e(getPackageName().codePointAt(13) - 70, getPackageName().length() - 19, (char) (getApplicationInfo().targetSdkVersion + 53416), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            B = (z + 1) % Property.TYPE_ARRAY;
        }
        x();
        if (this.y) {
            c = 22;
        }
        if (c != 22) {
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            QRCodeDialog qRCodeDialog = this.s;
            if (qRCodeDialog != null) {
                qRCodeDialog.dismiss();
                return;
            }
            return;
        }
        z = (B + 79) % Property.TYPE_ARRAY;
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    public static void c(LogRedirector.Logger logger) {
        z = (B + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
        logger.a();
        z = (B + 13) % Property.TYPE_ARRAY;
    }

    static /* synthetic */ String d(OpenAccountSuccessActivity openAccountSuccessActivity) {
        try {
            int i = z + 87;
            B = i % Property.TYPE_ARRAY;
            boolean z2 = i % 2 != 0;
            String str = openAccountSuccessActivity.t;
            if (!z2) {
                return str;
            }
            throw new ArithmeticException("divide by zero");
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
        if (!(Build.VERSION.SDK_INT < 29)) {
            z = (B + 15) % Property.TYPE_ARRAY;
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
                B = (z + 81) % Property.TYPE_ARRAY;
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
            e(getResources().getString(2131822451).substring(0, 4).codePointAt(2) - 8, getApplicationInfo().targetSdkVersion - 34, (char) (53450 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
            z = (B + 81) % Property.TYPE_ARRAY;
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter e(OpenAccountSuccessActivity openAccountSuccessActivity) {
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter;
        int i = B + 89;
        z = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'R' : 1) != 1) {
            try {
                sendEmailTransactionSuccessPresenter = openAccountSuccessActivity.x;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            sendEmailTransactionSuccessPresenter = openAccountSuccessActivity.x;
        }
        return sendEmailTransactionSuccessPresenter;
    }

    private static void e(int i, int i2, char c, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment_ViewBinding.b) {
            char[] cArr = new char[i];
            CC23CFormKartuKreditFragment_ViewBinding.a = 0;
            while (CC23CFormKartuKreditFragment_ViewBinding.a < i) {
                cArr[CC23CFormKartuKreditFragment_ViewBinding.a] = (char) ((char) ((int) ((((long) D[CC23CFormKartuKreditFragment_ViewBinding.a + i2]) ^ (((long) CC23CFormKartuKreditFragment_ViewBinding.a) * C)) ^ ((long) c))));
                CC23CFormKartuKreditFragment_ViewBinding.a++;
            }
            str = new String(cArr);
        }
        objArr[0] = str;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = z + setHasDecor$MediaBrowserCompat$MediaItem.aI;
        B = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'E' : '3') == 'E') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        try {
            x();
            try {
                boolean z2 = false;
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OpenAccountSuccessActivity.e(OpenAccountSuccessActivity.this).d(new LoginSessionActivity_ViewBinding(OpenAccountSuccessActivity.d(OpenAccountSuccessActivity.this), OpenAccountSuccessActivity.a(OpenAccountSuccessActivity.this)));
                    }
                }).g();
                int i = B + 23;
                z = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z2 = true;
                }
                if (z2) {
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

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        B = (z + 63) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        int i = z + 111;
        B = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.x = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        this.w = extras.getString("service_type", "");
        this.t = extras.getString("email", "");
        this.v = extras.getString("no_referensi", "");
        this.r = extras.getString("description_key", "");
        this.q = extras.getString("description_value", "");
        this.u = extras.getString("product", "");
        String string = extras.getString("email_success", "");
        this.p = string;
        if (!string.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("MessageDialogTitle", getString(2131821716));
            bundle2.putString("MessageDialogContent", this.p);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle2);
            messageDialog.show(l(), "MessageDialog");
            B = (z + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
        }
        this.tvNoReferensi.setText(Html.fromHtml(this.v));
        this.tvDescriptionKey.setText(Html.fromHtml(this.r));
        this.tvDescriptionValue.setText(Html.fromHtml(this.q));
        this.tvNote.setText(Html.fromHtml(this.note));
        Bitmap a = getPromotion.a(this.tvNoReferensi.getText().toString(), this);
        this.n = a;
        this.ivQrCode.setImageBitmap(a);
        B = (z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
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
            int i = B + 43;
            try {
                z = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 22 : '%') != '%') {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        B = (z + 93) % Property.TYPE_ARRAY;
        z();
        z = (B + 17) % Property.TYPE_ARRAY;
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        int i = B + 47;
        z = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 11 : 'Y') != 'Y') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = B + 9;
        z = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'X' : 'P') != 'P') {
            onDestroy();
            Call<o.OpenAccountSuccessActivity<Object>> call = this.x.a;
            throw new NullPointerException();
        }
        onDestroy();
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.x;
        Call<o.OpenAccountSuccessActivity<Object>> call2 = sendEmailTransactionSuccessPresenter.a;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
        if (call2 != null) {
            z = (B + 85) % Property.TYPE_ARRAY;
            try {
                call2.cancel();
                z = (B + 87) % Property.TYPE_ARRAY;
                sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
            } catch (Exception e) {
                throw e;
            }
        }
        sendEmailTransactionSuccessPresenter2.b = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        z = (B + 49) % Property.TYPE_ARRAY;
        boolean z2 = false;
        if (menuItem.getItemId() != 16908332) {
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            int i = z + 49;
            B = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                z2 = true;
            }
            if (z2) {
                return onOptionsItemSelected;
            }
            throw new NullPointerException();
        }
        z = (B + 7) % Property.TYPE_ARRAY;
        onBackPressed();
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = z + 63;
        B = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            onRequestPermissionsResult(i, strArr, iArr);
            clikedTeleponHalloBCA.b(this, i, iArr);
            try {
                B = (z + 91) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            onRequestPermissionsResult(i, strArr, iArr);
            clikedTeleponHalloBCA.b(this, i, iArr);
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        try {
            try {
                B = (z + 47) % Property.TYPE_ARRAY;
                setCardSlogan.e().b = "OpenAccountSuccessActivity";
                this.j = "OpenAccountSuccessActivity";
                int i = z + 19;
                B = i % Property.TYPE_ARRAY;
                if (!(i % 2 == 0)) {
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = B + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
        z = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'B' : '%') != 'B') {
            return 2131492969;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        z = (B + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
        z = (B + 69) % Property.TYPE_ARRAY;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r5 != true) goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r5 != true) goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        o.clikedTeleponHalloBCA.c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        com.bca.smartbranch.activity.OpenAccountSuccessActivity.z = (com.bca.smartbranch.activity.OpenAccountSuccessActivity.B + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        throw r4;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.OpenAccountSuccessActivity.z
            r1 = 79
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.OpenAccountSuccessActivity.B = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001f
            r0 = 1
            r5 = r0
            goto L_0x0021
        L_0x001f:
            r0 = 0
            r5 = r0
        L_0x0021:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x004b
            r0 = r3
            r1 = r4
            boolean r1 = r1.c     // Catch: Exception -> 0x0048
            r0.y = r1     // Catch: Exception -> 0x0048
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0048
            r5 = r0
            r0 = r5
            r1 = 33
            if (r0 < r1) goto L_0x003e
            r0 = r7
            r5 = r0
            goto L_0x0040
        L_0x003e:
            r0 = 1
            r5 = r0
        L_0x0040:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x006c
            goto L_0x0067
        L_0x0048:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x004b:
            r0 = r3
            r1 = r4
            boolean r1 = r1.c
            r0.y = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 86
            if (r0 < r1) goto L_0x0060
            r0 = r6
            r5 = r0
            goto L_0x0062
        L_0x0060:
            r0 = 1
            r5 = r0
        L_0x0062:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x006c
        L_0x0067:
            r0 = r3
            r0.v()
            return
        L_0x006c:
            r0 = r3
            o.clikedTeleponHalloBCA.c(r0)     // Catch: Exception -> 0x0080
            int r0 = com.bca.smartbranch.activity.OpenAccountSuccessActivity.B     // Catch: Exception -> 0x0080
            r1 = 103(0x67, float:1.44E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.OpenAccountSuccessActivity.z = r0
            return
        L_0x0080:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.OpenAccountSuccessActivity.saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH):void");
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        int i = z + 79;
        B = i % Property.TYPE_ARRAY;
        boolean z2 = i % 2 != 0;
        onBackPressed();
        if (z2) {
            throw new NullPointerException();
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            int i = B + 57;
            z = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? ';' : '<') != '<') {
                this.f.b(this.llDetail, this.ivDetail);
                throw new NullPointerException();
            } else {
                this.f.b(this.llDetail, this.ivDetail);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", this.u);
        startActivity(intent);
        z = (B + 55) % Property.TYPE_ARRAY;
    }

    @OnClick({2131296448})
    public void simpanGallery(View view) {
        z = (B + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        try {
            if (!(this.llDetail.getVisibility() != 8)) {
                int i = B + 67;
                z = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '8' : 23) != 23) {
                    this.f.b(this.llDetail, this.ivDetail);
                    throw new ArithmeticException("divide by zero");
                }
                this.f.b(this.llDetail, this.ivDetail);
            }
            try {
                z();
                new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.OpenAccountSuccessActivity.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (Build.VERSION.SDK_INT >= 33) {
                            OpenAccountSuccessActivity.this.t();
                        } else {
                            clikedTeleponHalloBCA.a(OpenAccountSuccessActivity.this);
                        }
                    }
                }, 500);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void t() {
        int i = z + 19;
        B = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            d(b(this.llMain));
            return;
        }
        try {
            d(b(this.llMain));
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void v() {
        int i = z + 63;
        B = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'W' : 3) != 'W') {
            try {
                b(this.n);
                z = (B + 43) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                b(this.n);
                throw new ArithmeticException("divide by zero");
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    @OnClick({2131297409})
    public void zoomQRCode() {
        z = (B + 13) % Property.TYPE_ARRAY;
        if (this.s == null) {
            this.s = new QRCodeDialog();
        }
        QRCodeDialog qRCodeDialog = this.s;
        Bitmap bitmap = this.n;
        String charSequence = this.tvNoReferensi.getText().toString();
        qRCodeDialog.b = bitmap;
        qRCodeDialog.d = charSequence;
        this.s.show(l(), "QRCodeDialog");
        int i = B + 17;
        z = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }
}
