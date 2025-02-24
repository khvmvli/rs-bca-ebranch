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
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC25AFormKartuKreditFragment;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getPromotion;
import o.onChooseBidangUsaha;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.showDialogCaraPembayaran;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AktivasiEChannelSuccessActivity.class */
public class AktivasiEChannelSuccessActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static int A;
    private static boolean C;
    private static int z;
    @BindView(2131296447)
    Button btnSelesai;
    setMessage f = new setMessage();
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
    private ActivateEChannelResponse.TxnDataOutput p;
    private String q;
    private QRCodeDialog r;
    @BindString(2131822092)
    String retry;
    private String s;
    private String t;
    @BindView(2131298925)
    TextView tvDescriptionValue;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    private String u;
    private boolean v;
    private String w;
    private SendEmailTransactionSuccessPresenter y;
    private static char[] x = {158, 170, 168, 'i', 157, 156, 174, 173, 175, 169, 163, 171, 177, 164, 159, 160};
    private static boolean D = true;
    private static int B = 59;

    private static Bitmap b(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            z = (A + 61) % Property.TYPE_ARRAY;
            return createBitmap;
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
        if (!(Build.VERSION.SDK_INT >= 29)) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (!(!file2.exists())) {
                A = (z + 71) % Property.TYPE_ARRAY;
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
            e(null, null, getApplicationInfo().targetSdkVersion + 93, new byte[]{-120, -112, -113, -114, -115, -126, -120, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        A = (z + 1) % Property.TYPE_ARRAY;
    }

    static /* synthetic */ ActivateEChannelResponse.TxnDataOutput d(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity) {
        z = (A + 93) % Property.TYPE_ARRAY;
        ActivateEChannelResponse.TxnDataOutput txnDataOutput = aktivasiEChannelSuccessActivity.p;
        int i = A + 27;
        z = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            return txnDataOutput;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter e(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity) {
        z = (A + 35) % Property.TYPE_ARRAY;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = aktivasiEChannelSuccessActivity.y;
        try {
            z = (A + 9) % Property.TYPE_ARRAY;
            return sendEmailTransactionSuccessPresenter;
        } catch (Exception e) {
            throw e;
        }
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.u);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 29) {
            int i = A + 97;
            z = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[1];
                strArr[1] = uri.getPath();
                String[] strArr2 = new String[0];
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
            if ((file2.exists() ? ')' : 'V') != 'V') {
                A = (z + 91) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                A = (z + 81) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            e(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + Property.TYPE_ARRAY, new byte[]{-120, -112, -113, -114, -115, -126, -120, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (!this.v) {
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            QRCodeDialog qRCodeDialog = this.r;
            if (qRCodeDialog != null) {
                z2 = false;
            }
            if (!z2) {
                int i2 = z + 3;
                A = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 == 0) {
                    qRCodeDialog.dismiss();
                    Object[] objArr2 = null;
                    int length = objArr2.length;
                    return;
                }
                qRCodeDialog.dismiss();
                return;
            }
            return;
        }
        z = (A + 57) % Property.TYPE_ARRAY;
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    public static void e(LogRedirector.Logger logger) {
        try {
            try {
                A = (z + 101) % Property.TYPE_ARRAY;
                logger.a();
                int i = A + 15;
                z = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? 'U' : 'S') != 'S') {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static void e(int[] iArr, char[] cArr, int i, byte[] bArr, Object[] objArr) {
        synchronized (CC25AFormKartuKreditFragment.d) {
            char[] cArr2 = x;
            int i2 = B;
            if (C) {
                int length = bArr.length;
                CC25AFormKartuKreditFragment.b = length;
                char[] cArr3 = new char[length];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr3[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[bArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] + i] - i2));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr3);
            } else if (D) {
                int length2 = cArr.length;
                CC25AFormKartuKreditFragment.b = length2;
                char[] cArr4 = new char[length2];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr4[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[cArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] - i] - i2));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr4);
            } else {
                int length3 = iArr.length;
                CC25AFormKartuKreditFragment.b = length3;
                char[] cArr5 = new char[length3];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr5[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[iArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] - i] - i2));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr5);
            }
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
        try {
            z = (A + 73) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AktivasiEChannelSuccessActivity.e(AktivasiEChannelSuccessActivity.this).d(new LoginSessionActivity_ViewBinding(AktivasiEChannelSuccessActivity.this.m != null ? AktivasiEChannelSuccessActivity.this.m.getEmail() : "", AktivasiEChannelSuccessActivity.d(AktivasiEChannelSuccessActivity.this).getNoReff()));
            }
        }).g();
        try {
            A = (z + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        int i = A + 95;
        z = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8 A[SYNTHETIC] */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 817
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        A = (z + 25) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        A = (z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        try {
            z();
            A = (z + 31) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        z = (A + 17) % Property.TYPE_ARRAY;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        int i = z + 19;
        A = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '<' : '%') != '%') {
            finish();
            throw new NullPointerException();
        }
        finish();
        int i2 = z + 41;
        A = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.y;
        Call<OpenAccountSuccessActivity<Object>> call = sendEmailTransactionSuccessPresenter.a;
        if (call != null) {
            int i = A + 19;
            z = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '^' : 'N') != 'N') {
                call.cancel();
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                call.cancel();
            }
            A = (z + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        }
        sendEmailTransactionSuccessPresenter.b = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!(menuItem.getItemId() != 16908332)) {
            onBackPressed();
            A = (z + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
            return true;
        }
        z = (A + 17) % Property.TYPE_ARRAY;
        return onOptionsItemSelected(menuItem);
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            z = (A + 41) % Property.TYPE_ARRAY;
            onRequestPermissionsResult(i, strArr, iArr);
            try {
                showDialogCaraPembayaran.a(this, i, iArr);
                A = (z + 5) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = z + 49;
        A = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'Y' : 'b') != 'b') {
            try {
                setCardSlogan.e().b = "AktivasiEChannelSuccessActivity";
                this.j = "AktivasiEChannelSuccessActivity";
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } else {
            setCardSlogan.e().b = "AktivasiEChannelSuccessActivity";
            this.j = "AktivasiEChannelSuccessActivity";
            int i2 = z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
            A = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = A + 59;
        z = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'a' : '!') == '!') {
            return 2131492892;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            A = (z + 67) % Property.TYPE_ARRAY;
            A = (z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        this.v = branchMapItemBNAdapter$BranchMapItemVH.c;
        if ((Build.VERSION.SDK_INT >= 33 ? '6' : 24) != 24) {
            int i = A + 39;
            z = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'O' : 'A') != 'O') {
                u();
            } else {
                try {
                    u();
                    Object[] objArr = null;
                    int length = objArr.length;
                } catch (Exception e) {
                    throw e;
                }
            }
            A = (z + 1) % Property.TYPE_ARRAY;
            return;
        }
        showDialogCaraPembayaran.a(this);
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        int i = z + 7;
        A = i % Property.TYPE_ARRAY;
        boolean z2 = true;
        boolean z3 = i % 2 != 0;
        onBackPressed();
        if (!z3) {
            throw new ArithmeticException("divide by zero");
        }
        try {
            int i2 = A + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
            z = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                z2 = false;
            }
            if (z2) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296448})
    public void sendEmail(View view) {
        A = (z + 87) % Property.TYPE_ARRAY;
        if (!(this.llDetail.getVisibility() != 8)) {
            z = (A + 41) % Property.TYPE_ARRAY;
            this.f.b(this.llDetail, this.ivDetail);
        }
        z();
        new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity.5
            @Override // java.lang.Runnable
            public final void run() {
                if (Build.VERSION.SDK_INT >= 33) {
                    AktivasiEChannelSuccessActivity.this.t();
                } else {
                    showDialogCaraPembayaran.c(AktivasiEChannelSuccessActivity.this);
                }
            }
        }, 500);
        A = (z + 57) % Property.TYPE_ARRAY;
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        int i = A + 21;
        z = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '4' : '8') != '4') {
            this.f.b(this.llDetail, this.ivDetail);
        } else {
            this.f.b(this.llDetail, this.ivDetail);
            throw new NullPointerException();
        }
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", "7");
        startActivity(intent);
        try {
            z = (A + 37) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void t() {
        A = (z + 35) % Property.TYPE_ARRAY;
        b(b(this.llMain));
        try {
            z = (A + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void u() {
        try {
            z = (A + 95) % Property.TYPE_ARRAY;
            e(this.n);
            z = (A + 55) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131297409})
    public void zoomQRCode() {
        A = (z + 57) % Property.TYPE_ARRAY;
        if (this.r == null) {
            this.r = new QRCodeDialog();
            z = (A + 101) % Property.TYPE_ARRAY;
        }
        try {
            QRCodeDialog qRCodeDialog = this.r;
            Bitmap bitmap = this.n;
            String charSequence = this.tvNoReferensi.getText().toString();
            qRCodeDialog.b = bitmap;
            qRCodeDialog.d = charSequence;
            this.r.show(l(), "QRCodeDialog");
        } catch (Exception e) {
            throw e;
        }
    }
}
