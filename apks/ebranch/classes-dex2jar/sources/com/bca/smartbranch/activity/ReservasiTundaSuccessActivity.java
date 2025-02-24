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
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ListDetailTransaksiROAdapter;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC23CFormKartuKreditFragment;
import o.DetailBerhasilTarikanNotificationActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getAnnualFeeBasicAmount;
import o.getLifecycle;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiTundaSuccessActivity.class */
public class ReservasiTundaSuccessActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static long A;
    private static int F;
    private static int H;
    private String B;
    private String C;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297625)
    LinearLayout llDetailTransaksi;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297858)
    LinearLayout llPhoneWrapper;
    @BindView(2131297875)
    LinearLayout llRuangan;
    private Bitmap n;
    @BindString(2131821358)
    String note;
    private QRCodeDialog q;
    private ListDetailTransaksiROAdapter r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298336)
    setOnStartEnterTransitionListener rvTransaksi;
    @BindView(2131298420)
    getLifecycle svMain;
    private String t;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298866)
    TextView tvBranchCityProvince;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298868)
    TextView tvBranchPhone;
    @BindView(2131298925)
    TextView tvDescriptionKey;
    @BindView(2131298928)
    TextView tvDescriptionValue;
    @BindView(2131299268)
    TextView tvHeaderTransaksi;
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
    private CreateQueueReservationResponse u;
    private List<DetailTransactionResponse.TxnDataDetail> v;
    private GetBranchROResponse.DetailBranch w;
    private SendEmailTransactionSuccessPresenter x;
    private String y;
    private boolean z;
    private setMessage f = new setMessage();
    private String D = "";
    private boolean s = false;
    private boolean p = false;

    public static void a(LogRedirector.Logger logger) {
        F = (H + 21) % Property.TYPE_ARRAY;
        logger.a();
        try {
            H = (F + 91) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter b(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
        try {
            int i = H + 111;
            try {
                F = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? 11 : 'Z') != 'Z') {
                    SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = reservasiTundaSuccessActivity.x;
                    throw new NullPointerException();
                }
                SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = reservasiTundaSuccessActivity.x;
                int i2 = F + 25;
                H = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? ' ' : '\r') != ' ') {
                    return sendEmailTransactionSuccessPresenter2;
                }
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ String c(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
        int i = F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            try {
                return reservasiTundaSuccessActivity.y;
            } catch (Exception e) {
                throw e;
            }
        } else {
            String str = reservasiTundaSuccessActivity.y;
            throw new NullPointerException();
        }
    }

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.y);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = false;
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
                F = (H + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
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
            e(new char[]{5599, 7940, 5564, 43448, 34788, 59951, 7417, 14510, 52977, 36216, 53111, 58130, 41780, 29186, 41915, 51098, 33871, 22481, 30748, 43717, 30849, 15204, 23898, 36222, 24019, 57401, 12713, 28794, 13950, 50683, 5871, 21706}, 1 - Color.blue(0), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (this.z) {
            int i = H + 57;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
                Object[] objArr2 = null;
                int length = objArr2.length;
                return;
            }
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.q;
        if (qRCodeDialog == null) {
            z = true;
        }
        if (!z) {
            qRCodeDialog.dismiss();
        }
    }

    private static Bitmap d(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            int i = F + 85;
            H = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 'X' : '`') == '`') {
                return createBitmap;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return createBitmap;
        } catch (Exception e) {
            throw e;
        }
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 'T' : ';') != ';') {
            int i = H + 47;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[0];
                strArr[1] = uri.getPath();
                String[] strArr2 = new String[0];
                strArr2[0] = "image/jpeg";
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
                int i2 = F + 99;
                H = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? (char) 3 : 22) != 3) {
                    file2.delete();
                    H = (F + 27) % Property.TYPE_ARRAY;
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
            e(new char[]{5599, 7940, 5564, 43448, 34788, 59951, 7417, 14510, 52977, 36216, 53111, 58130, 41780, 29186, 41915, 51098, 33871, 22481, 30748, 43717, 30849, 15204, 23898, 36222, 24019, 57401, 12713, 28794, 13950, 50683, 5871, 21706}, getApplicationInfo().targetSdkVersion - 33, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private static void e(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment.b) {
            char[] b = CC23CFormKartuKreditFragment.b(A, cArr, i);
            CC23CFormKartuKreditFragment.a = 4;
            while (CC23CFormKartuKreditFragment.a < b.length) {
                CC23CFormKartuKreditFragment.d = CC23CFormKartuKreditFragment.a - 4;
                b[CC23CFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (b[CC23CFormKartuKreditFragment.a] ^ b[CC23CFormKartuKreditFragment.a % 4])) ^ (((long) CC23CFormKartuKreditFragment.d) * A))));
                CC23CFormKartuKreditFragment.a++;
            }
            str = new String(b, 4, b.length - 4);
        }
        objArr[0] = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0318, code lost:
        r8.p = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ff, code lost:
        if (r0.getProductType().equals("L") != false) goto L_0x0318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0315, code lost:
        if (r0.getProductType().equals("L") != false) goto L_0x0318;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00be A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void u() {
        /*
        // Method dump skipped, instructions count: 1421
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity.u():void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        H = (F + 55) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReservasiTundaSuccessActivity.b(ReservasiTundaSuccessActivity.this).c(new LoginSessionActivity_ViewBinding(ReservasiTundaSuccessActivity.this.m.getEmail(), ReservasiTundaSuccessActivity.c(ReservasiTundaSuccessActivity.this)));
            }
        }).g();
        int i = F + 23;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'K' : '\t') == 'K') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        int i = H + 11;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            try {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
                int i2 = F + 89;
                H = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? 26 : 'H') != 'H') {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.x = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        this.w = (GetBranchROResponse.DetailBranch) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_cabang"));
        this.u = (CreateQueueReservationResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservasi"));
        this.B = extras.getString("type_reservation", "");
        this.y = this.u.getReferenceNumber();
        String string = extras.getString("jenis_ruangan", "");
        boolean z = true;
        if ((!string.isEmpty() ? 29 : '3') != '3') {
            if (!string.equals("Reguler")) {
                this.tvJenisRuangan.setText(string);
                this.llRuangan.setVisibility(0);
            }
        }
        String string2 = extras.getString("email_success", "");
        if (!string2.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("MessageDialogTitle", getString(2131821716));
            bundle2.putString("MessageDialogContent", string2);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle2);
            messageDialog.show(l(), "MessageDialog");
            F = (H + 11) % Property.TYPE_ARRAY;
        }
        this.tvTitle.setText(2131822033);
        this.tvNoReferensi.setText(this.y);
        this.tvNote.setText(Html.fromHtml(this.note));
        this.v = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        if (this.w != null) {
            TextView textView = this.tvBranchCityProvince;
            StringBuilder sb = new StringBuilder();
            sb.append(this.w.getCity());
            sb.append(", ");
            sb.append(this.w.getProvince());
            textView.setText(sb.toString());
            if (this.w.getPhone().isEmpty()) {
                int i = F + 43;
                H = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    z = false;
                }
                if (z) {
                    this.tvBranchPhone.setText("-");
                    throw new ArithmeticException("divide by zero");
                }
                this.tvBranchPhone.setText("-");
            } else {
                this.tvBranchPhone.setText(this.w.getPhone());
            }
        }
        this.tvBranchName.setText(this.u.getBranchName());
        this.tvBranchAddress.setText(this.u.getBranchAddress());
        TextView textView2 = this.tvReservasiDate;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.u.getReservationTime().replace(":", "."));
        sb2.append(" WIB - ");
        sb2.append(getAnnualFeeBasicAmount.f(this.u.getReservationDate()));
        textView2.setText(sb2.toString());
        Bitmap a = getPromotion.a(this.tvNoReferensi.getText().toString(), this);
        this.n = a;
        this.ivQrCode.setImageBitmap(a);
        u();
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
            F = (H + 23) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        int i = H + 53;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            try {
                z();
                int i2 = F + setHasDecor$MediaBrowserCompat$MediaItem.aM;
                try {
                    H = i2 % Property.TYPE_ARRAY;
                    if ((i2 % 2 == 0 ? 'K' : 19) != 19) {
                        throw new ArithmeticException("divide by zero");
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            z();
            throw new NullPointerException();
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        int i = H + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.x;
        Call<OpenAccountSuccessActivity<Object>> call = sendEmailTransactionSuccessPresenter.a;
        if (call != null) {
            int i = H + 3;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '6' : '^') != '^') {
                call.cancel();
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                try {
                    call.cancel();
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        sendEmailTransactionSuccessPresenter.b = null;
        int i2 = H + 13;
        F = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 'P' : 25) != 25) {
            Object[] objArr2 = null;
            int length2 = objArr2.length;
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        F = (H + 37) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        DetailBerhasilTarikanNotificationActivity.a(this, i, iArr);
        H = (F + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        H = (F + 19) % Property.TYPE_ARRAY;
        setCardSlogan.e().b = "ReservasiTundaSuccessActivity";
        this.j = "ReservasiTundaSuccessActivity";
        int i = F + 73;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '2' : '<') != '<') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = F + 47;
        H = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            return 2131492999;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            H = (F + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
            int i = H + 27;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                return this;
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        F = (H + 67) % Property.TYPE_ARRAY;
        this.z = branchMapItemBNAdapter$BranchMapItemVH.c;
        if ((Build.VERSION.SDK_INT >= 33 ? '\t' : '1') != '1') {
            int i = H + 65;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'N' : 'X') != 'N') {
                y();
                return;
            }
            y();
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        try {
            DetailBerhasilTarikanNotificationActivity.d(this);
            try {
                H = (F + 55) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        int i = F + 31;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'G' : 'c') != 'c') {
            onBackPressed();
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            onBackPressed();
        }
        F = (H + 93) % Property.TYPE_ARRAY;
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        F = (H + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
        this.f.b(this.llDetail, this.ivDetail);
        try {
            F = (H + 41) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        int i = H + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            boolean z = this.s;
            throw new ArithmeticException("divide by zero");
        } else if (this.s) {
            try {
                startActivity(new Intent(this, InfoDocumentUnderlyingActivity.class));
                try {
                    F = (H + 83) % Property.TYPE_ARRAY;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    @OnClick({2131296448})
    public void simpanGallery(View view) {
        try {
            F = (H + 55) % Property.TYPE_ARRAY;
            if ((this.llDetail.getVisibility() == 8 ? 'Z' : 'W') != 'W') {
                this.f.b(this.llDetail, this.ivDetail);
                F = (H + 75) % Property.TYPE_ARRAY;
            }
            z();
            new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (Build.VERSION.SDK_INT >= 33) {
                        ReservasiTundaSuccessActivity.this.t();
                    } else {
                        DetailBerhasilTarikanNotificationActivity.b(ReservasiTundaSuccessActivity.this);
                    }
                }
            }, 500);
        } catch (Exception e) {
            throw e;
        }
    }

    public final void t() {
        int i = H + 97;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '%' : '9') != '9') {
            try {
                e(d(this.llMain));
                throw new ArithmeticException("divide by zero");
            } catch (Exception e) {
                throw e;
            }
        } else {
            e(d(this.llMain));
        }
    }

    public final void y() {
        int i = H + 21;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'M' : 20) != 20) {
            try {
                c(this.n);
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            c(this.n);
        }
    }

    @OnClick({2131297409})
    public void zoomQRCode() {
        H = (F + 41) % Property.TYPE_ARRAY;
        if (this.q == null) {
            this.q = new QRCodeDialog();
        }
        QRCodeDialog qRCodeDialog = this.q;
        Bitmap bitmap = this.n;
        String charSequence = this.tvNoReferensi.getText().toString();
        qRCodeDialog.b = bitmap;
        qRCodeDialog.d = charSequence;
        this.q.show(l(), "QRCodeDialog");
        int i = H + 25;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
    }
}
