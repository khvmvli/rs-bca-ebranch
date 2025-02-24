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
import android.text.TextUtils;
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
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC23CFormKartuKreditFragment_ViewBinding;
import o.InfoDocumentUnderlyingActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getCardDescription;
import o.getPromotion;
import o.onUpdateReceiver;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.updateProfil;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanActivity.class */
public class BN7PengambilanActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read {
    private static int E;
    private static char[] G = {38967, 51880, 15647, 28611, 53882, 1256, 30535, 55935, 3263, 32530, 41355, 5239, 18116, 43329, 7212, 20136, 45322, 58356, 22122, 47251, 60248, 24105, 32921, 62231, 9717, 34923, 64223, 11687};
    private static long H = -7258732697246870893L;
    private static int K;
    private String A;
    private String B;
    private String C;
    private String D;
    private boolean F;
    private ViewAnimator I;
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
    private Bitmap p;
    private QRCodeDialog r;
    private boolean t;
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
    private DetailTransactionPresenter v;
    private String w;
    private String x;
    private String y;
    setMessage f = new setMessage();
    private String q = "";
    private String z = "";
    private String s = "";

    public static void a(LogRedirector.Logger logger) {
        try {
            int i = K + 87;
            E = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '8' : 'S') != '8') {
                logger.a();
                return;
            }
            try {
                logger.a();
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static void b(int i, int i2, char c, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment_ViewBinding.b) {
            char[] cArr = new char[i2];
            CC23CFormKartuKreditFragment_ViewBinding.a = 0;
            while (CC23CFormKartuKreditFragment_ViewBinding.a < i2) {
                cArr[CC23CFormKartuKreditFragment_ViewBinding.a] = (char) ((char) ((int) ((((long) G[CC23CFormKartuKreditFragment_ViewBinding.a + i]) ^ (((long) CC23CFormKartuKreditFragment_ViewBinding.a) * H)) ^ ((long) c))));
                CC23CFormKartuKreditFragment_ViewBinding.a++;
            }
            str = new String(cArr);
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0235, code lost:
        if ((r8 % 2) != 0) goto L_0x025d;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c6 A[Catch: Exception -> 0x0213, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0213, blocks: (B:53:0x01d4, B:126:0x03c6), top: B:160:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0301  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail r6) {
        /*
        // Method dump skipped, instructions count: 1168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanActivity.b(com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail):void");
    }

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.C);
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT >= 29) {
            int i = K + 7;
            E = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 3 : '=') != '=') {
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
            if (file2.exists()) {
                int i2 = K + 23;
                E = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    file2.delete();
                    throw new NullPointerException();
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
            b(getResources().getString(2131821267).substring(2, 4).codePointAt(0) - 36, getApplicationInfo().targetSdkVersion - 6, (char) (getPackageName().codePointAt(9) + 38887), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (this.F) {
            int i3 = E + 57;
            K = i3 % Property.TYPE_ARRAY;
            if ((i3 % 2 == 0 ? 'V' : '_') != '_') {
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
        QRCodeDialog qRCodeDialog = this.r;
        if (qRCodeDialog != null) {
            qRCodeDialog.dismiss();
        }
        E = (K + 65) % Property.TYPE_ARRAY;
    }

    private static Bitmap d(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = K + 89;
        E = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return createBitmap;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return createBitmap;
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 'K' : '\r') != 'K') {
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
            b(getResources().getString(2131822451).substring(0, 4).length() - 4, 28 - TextUtils.indexOf("", "", 0), (char) (getResources().getString(2131822451).substring(0, 4).length() + 38992), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            int i = E + 81;
            K = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            } else {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[0];
                strArr[1] = uri.getPath();
                String[] strArr2 = new String[0];
                strArr2[1] = "image/jpeg";
                MediaScannerConnection.scanFile(this, strArr, strArr2, null);
            }
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        E = (K + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
    }

    private void u() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.C;
        infoDocumentUnderlyingActivity.d = "TUNDA";
        infoDocumentUnderlyingActivity.b = this.B;
        infoDocumentUnderlyingActivity.a = this.A;
        this.v.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        E = (K + 65) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        int i = K + 21;
        E = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '_' : 16) != '_') {
            try {
                this.tvErrorMessage.setText(str);
                this.I.setDisplayedChild(1);
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.tvErrorMessage.setText(str);
            this.I.setDisplayedChild(1);
        }
        K = (E + 81) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a_(java.util.List<com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail> r5) {
        /*
        // Method dump skipped, instructions count: 572
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanActivity.a_(java.util.List):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("imei", this.m.getImei());
            bundle.putString("email", this.m.getEmail());
            bundle.putString("message", str);
            boolean z = true;
            bundle.putBoolean("is_multiple_login", true);
            AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
            autoLogoutDialog.setArguments(bundle);
            autoLogoutDialog.show(l(), "AutoLogoutDialog");
            int i = K + 85;
            E = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                z = false;
            }
            if (z) {
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
        E = (K + 7) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.I = (ViewAnimator) findViewById(2131299751);
        DetailTransactionPresenter detailTransactionPresenter = new DetailTransactionPresenter();
        this.v = detailTransactionPresenter;
        detailTransactionPresenter.e = this;
        Bundle extras = getIntent().getExtras();
        this.C = extras.getString("no_reff", "");
        this.B = extras.getString("token", "");
        this.D = extras.getString("TUNDA", "");
        this.A = extras.getString("TYPE", "");
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
        u();
        E = (K + 41) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        K = (E + 23) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        K = (E + 113) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        ViewAnimator viewAnimator;
        int i;
        int i2 = E + 35;
        K = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? 'c' : 15) != 'c') {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.I;
            i = 1;
        } else {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.I;
            i = 0;
        }
        viewAnimator.setDisplayedChild(i);
        E = (K + 27) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        int i = K + 85;
        E = i % Property.TYPE_ARRAY;
        boolean z = false;
        if ((i % 2 != 0 ? '*' : 28) != 28) {
            this.I.setDisplayedChild(1);
        } else {
            try {
                this.I.setDisplayedChild(0);
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = E + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
        K = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        int i = K + 39;
        E = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'R' : 'O') != 'R') {
            getMenuInflater().inflate(2131558409, menu);
            z = true;
        } else {
            getMenuInflater().inflate(2131558409, menu);
            z = false;
        }
        return z;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = K + 47;
        E = i % Property.TYPE_ARRAY;
        try {
            if ((i % 2 != 0 ? '\b' : '\\') != '\b') {
                onDestroy();
                DetailTransactionPresenter detailTransactionPresenter = this.v;
                Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
                DetailTransactionPresenter detailTransactionPresenter2 = detailTransactionPresenter;
                if (!(call == null)) {
                    call.cancel();
                    E = (K + 31) % Property.TYPE_ARRAY;
                    detailTransactionPresenter2 = detailTransactionPresenter;
                }
                detailTransactionPresenter2.e = null;
                E = (K + 111) % Property.TYPE_ARRAY;
                return;
            }
            onDestroy();
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call2 = this.v.c;
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            int i = K + 61;
            E = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'U' : '2') != '2') {
                onBackPressed();
                return false;
            }
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == 2131298038) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        } else {
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            K = (E + 57) % Property.TYPE_ARRAY;
            return onOptionsItemSelected;
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        E = (K + 61) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        onUpdateReceiver.b(this, i, iArr);
        E = (K + 37) % Property.TYPE_ARRAY;
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
        K = (E + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = K + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        E = i % Property.TYPE_ARRAY;
        boolean z = true;
        if (i % 2 == 0) {
            setCardSlogan.e().b = "BN7PengambilanActivity";
            this.j = "BN7PengambilanActivity";
            int i2 = E + 85;
            K = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                z = false;
            }
            if (z) {
                throw new ArithmeticException("divide by zero");
            }
            return;
        }
        setCardSlogan.e().b = "BN7PengambilanActivity";
        this.j = "BN7PengambilanActivity";
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = E + 91;
        K = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'Q' : '!') != 'Q') {
            return 2131492899;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        K = (E + 89) % Property.TYPE_ARRAY;
        K = (E + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        try {
            int i = E + 21;
            K = i % Property.TYPE_ARRAY;
            boolean z = i % 2 != 0;
            u();
            if (!z) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        K = (E + 93) % Property.TYPE_ARRAY;
        this.F = branchMapItemBNAdapter$BranchMapItemVH.c;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 33) {
            E = (K + 77) % Property.TYPE_ARRAY;
            try {
                t();
                int i = K + 23;
                E = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    z = true;
                }
                if (z) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            onUpdateReceiver.d(this);
        }
    }

    @OnClick({2131296447})
    public void selesai() {
        int i = E + 13;
        K = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            this.t = false;
        } else {
            this.t = true;
        }
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r6 != true) goto L_0x008f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r5.llDetail.getVisibility() == 8) goto L_0x0051;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        r0 = com.bca.smartbranch.activity.BN7PengambilanActivity.K + 35;
        com.bca.smartbranch.activity.BN7PengambilanActivity.E = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        if ((r0 % 2) == 0) goto L_0x0080;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        r5.f.b(r5.llDetail, r5.ivDetail);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        r5.f.b(r5.llDetail, r5.ivDetail);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        z();
        new android.os.Handler().postDelayed(new com.bca.smartbranch.activity.BN7PengambilanActivity.AnonymousClass2(), 500);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share() {
        /*
            r5 = this;
            int r0 = com.bca.smartbranch.activity.BN7PengambilanActivity.E
            r1 = 33
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanActivity.K = r0
            r0 = 0
            r7 = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001c
            r0 = 0
            r6 = r0
            goto L_0x001e
        L_0x001c:
            r0 = 1
            r6 = r0
        L_0x001e:
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L_0x0040
            r0 = r5
            r1 = 0
            r0.t = r1
            r0 = r7
            r6 = r0
            r0 = r5
            android.widget.RelativeLayout r0 = r0.llDetail
            int r0 = r0.getVisibility()
            r1 = 68
            if (r0 != r1) goto L_0x0038
            r0 = 1
            r6 = r0
        L_0x0038:
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L_0x0051
            goto L_0x008f
        L_0x0040:
            r0 = r5
            r1 = 1
            r0.t = r1
            r0 = r5
            android.widget.RelativeLayout r0 = r0.llDetail
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x008f
        L_0x0051:
            int r0 = com.bca.smartbranch.activity.BN7PengambilanActivity.K
            r1 = 35
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.BN7PengambilanActivity.E = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0080
            r0 = r5
            o.setMessage r0 = r0.f
            r1 = r5
            android.widget.RelativeLayout r1 = r1.llDetail
            r2 = r5
            android.widget.ImageView r2 = r2.ivDetail
            r0.b(r1, r2)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x007d
            r1 = r0
            r1.<init>()     // Catch: all -> 0x007d
            throw r0     // Catch: all -> 0x007d
        L_0x007d:
            r8 = move-exception
            r0 = r8
            throw r0
        L_0x0080:
            r0 = r5
            o.setMessage r0 = r0.f
            r1 = r5
            android.widget.RelativeLayout r1 = r1.llDetail
            r2 = r5
            android.widget.ImageView r2 = r2.ivDetail
            r0.b(r1, r2)
        L_0x008f:
            r0 = r5
            r0.z()
            android.os.Handler r0 = new android.os.Handler
            r1 = r0
            r1.<init>()
            com.bca.smartbranch.activity.BN7PengambilanActivity$2 r1 = new com.bca.smartbranch.activity.BN7PengambilanActivity$2
            r2 = r1
            r3 = r5
            r2.<init>()
            r2 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r0.postDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanActivity.share():void");
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        K = (E + 31) % Property.TYPE_ARRAY;
        this.f.b(this.llDetail, this.ivDetail);
        K = (E + 97) % Property.TYPE_ARRAY;
    }

    public final void t() {
        int i = K + 69;
        E = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            try {
                c(this.p);
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            c(this.p);
        }
        K = (E + 29) % Property.TYPE_ARRAY;
    }

    @OnClick({2131299700})
    public void ubahData() {
        Intent intent = new Intent(this, BN7PengambilanUpdateReceiverActivity.class);
        try {
            intent.putExtra("token", this.B);
            intent.putExtra("cabang", this.s);
            startActivity(intent);
            E = (K + 71) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void y() {
        int i = E + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        K = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            e(d(this.llMain));
            throw new NullPointerException();
        }
        e(d(this.llMain));
        int i2 = K + 65;
        E = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 'Q' : '\f') != '\f') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnClick({2131297408})
    public void zoomQRCode() {
        int i = E + 51;
        K = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'O' : 'K') != 'O') {
            try {
                if (this.r == null) {
                    this.r = new QRCodeDialog();
                    K = (E + 53) % Property.TYPE_ARRAY;
                }
                QRCodeDialog qRCodeDialog = this.r;
                try {
                    Bitmap bitmap = this.p;
                    String str = this.C;
                    qRCodeDialog.b = bitmap;
                    qRCodeDialog.d = str;
                    this.r.show(l(), "QRCodeDialog");
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            QRCodeDialog qRCodeDialog2 = this.r;
            throw new NullPointerException();
        }
    }
}
