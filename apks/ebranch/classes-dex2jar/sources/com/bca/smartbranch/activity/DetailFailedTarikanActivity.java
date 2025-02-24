package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC23AFormKartuKreditFragment_ViewBinding;
import o.CC3ChooseBCACardActivity_ViewBinding;
import o.InfoDocumentUnderlyingActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailFailedTarikanActivity.class */
public class DetailFailedTarikanActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read {
    private static int v;
    private static int x;
    private static int y;
    private setMessage f = new setMessage();
    @BindView(2131297626)
    LinearLayout llBatal;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297836)
    LinearLayout llNoref;
    private Bitmap n;
    private boolean p;
    private ViewAnimator q;
    private String r;
    @BindString(2131822092)
    String retry;
    private DetailTransactionPresenter s;
    private String t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822262)
    String toolbarTitle;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299299)
    TextView tvJam;
    @BindView(2131299349)
    TextView tvKeterangan;
    @BindView(2131299497)
    TextView tvNoReferensi;
    @BindView(2131299316)
    TextView tvNominal;
    @BindView(2131299289)
    TextView tvNominalInfo;
    @BindView(2131299475)
    TextView tvPenarik;
    @BindView(2131299291)
    TextView tvPenarikInfo;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299594)
    TextView tvTanggal;
    @BindView(2131299672)
    TextView tvTitleTransaksi;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    private void a(DetailTransactionResponse.TxnDataDetail txnDataDetail) {
        String key = txnDataDetail.getKey();
        key.hashCode();
        char c = 65535;
        switch (key.hashCode()) {
            case -2053478804:
                if (key.equals("StatusType")) {
                    c = 0;
                    break;
                }
                break;
            case -1808614382:
                if (key.equals("Status")) {
                    x = (v + 93) % Property.TYPE_ARRAY;
                    c = 1;
                    break;
                }
                break;
            case -1238485368:
                if ((key.equals("Transaksi") ? 'H' : 'U') != 'U') {
                    x = (v + 9) % Property.TYPE_ARRAY;
                    c = 2;
                    break;
                }
                break;
            case -507420484:
                try {
                    if (key.equals("Nominal")) {
                        c = 3;
                        break;
                    }
                } catch (Exception e) {
                    throw e;
                }
                break;
            case 74230:
                if (key.equals("Jam")) {
                    c = 4;
                    break;
                }
                break;
            case 122683404:
                if (key.equals("Tanggal")) {
                    c = 5;
                    break;
                }
                break;
            case 981984652:
                if (key.equals("Penarik")) {
                    c = 6;
                    break;
                }
                break;
            case 1260938190:
                if (!(!key.equals("Nomor Referensi"))) {
                    int i = v + 11;
                    x = i % Property.TYPE_ARRAY;
                    if (i % 2 != 0) {
                        c = 7;
                        break;
                    } else {
                        c = 25;
                        break;
                    }
                }
                break;
            case 1963638442:
                if (!(!key.equals("Alasan"))) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String value = txnDataDetail.getValue();
                value.hashCode();
                if (!value.equals("1")) {
                    int i2 = v + 65;
                    x = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 == 0) {
                        boolean equals = value.equals("2");
                        Object[] objArr = null;
                        int length = objArr.length;
                        if (!equals) {
                            return;
                        }
                    } else if (!value.equals("2")) {
                        return;
                    }
                    int i3 = v + 85;
                    x = i3 % Property.TYPE_ARRAY;
                    if (i3 % 2 == 0) {
                        this.llBatal.setVisibility(0);
                        return;
                    } else {
                        this.llBatal.setVisibility(0);
                        return;
                    }
                } else {
                    try {
                        this.llBatal.setVisibility(8);
                        return;
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            case 1:
                this.tvStatus.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case 2:
                this.tvTitleTransaksi.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case 3:
                TextView textView = this.tvNominal;
                StringBuilder sb = new StringBuilder("Rp ");
                sb.append(getPromotion.i(txnDataDetail.getValue()));
                sb.append(" ,-");
                textView.setText(sb.toString());
                return;
            case 4:
                this.tvJam.setText(Html.fromHtml(txnDataDetail.getValue()));
                int i4 = x + 91;
                v = i4 % Property.TYPE_ARRAY;
                if (i4 % 2 != 0) {
                    throw new NullPointerException();
                }
                return;
            case 5:
                this.tvTanggal.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case 6:
                String[] split = txnDataDetail.getValue().split("-");
                if (split.length > 1) {
                    this.tvPenarik.setText(split[1].trim());
                    return;
                } else {
                    this.tvPenarik.setText(split[0].trim());
                    return;
                }
            case 7:
                this.tvNoReferensi.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case '\b':
                this.tvKeterangan.setText(txnDataDetail.getValue());
                return;
            default:
                return;
        }
    }

    public static void a(LogRedirector.Logger logger) {
        v = (x + 21) % Property.TYPE_ARRAY;
        try {
            logger.a();
            x = (v + 49) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void a(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) {
        String str;
        synchronized (CC23AFormKartuKreditFragment_ViewBinding.e) {
            char[] cArr2 = new char[i3];
            CC23AFormKartuKreditFragment_ViewBinding.c = 0;
            while (CC23AFormKartuKreditFragment_ViewBinding.c < i3) {
                CC23AFormKartuKreditFragment_ViewBinding.a = cArr[CC23AFormKartuKreditFragment_ViewBinding.c];
                cArr2[CC23AFormKartuKreditFragment_ViewBinding.c] = (char) ((char) (CC23AFormKartuKreditFragment_ViewBinding.a + i2));
                int i4 = CC23AFormKartuKreditFragment_ViewBinding.c;
                cArr2[i4] = (char) ((char) (cArr2[i4] - y));
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

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.t);
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? ']' : '8') != ']') {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                int i = x + 63;
                v = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
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
            a(true, getApplicationInfo().targetSdkVersion - 32, new char[]{'\f', 0, 15, 2, 1, 6, 19, '\f', 15, '\r', 65483, 5, 0, 11, 65534, 15, 65535, 17, 15, 65534, '\n', 16, 65483, 65534, 0, 65535, 65483, '\n'}, getResources().getString(2131821267).substring(2, 4).length() + 127, getResources().getString(2131821267).substring(2, 4).length() + 26, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            int i2 = x + 115;
            v = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[1];
                strArr[1] = uri.getPath();
                String[] strArr2 = new String[1];
                strArr2[1] = "image/jpeg";
                MediaScannerConnection.scanFile(this, strArr, strArr2, null);
            } else {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            }
        }
        x();
        if ((this.p ? 'c' : 26) != 26) {
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        } else {
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, "QR Code berhasil disimpan", -1).g();
        }
    }

    private void v() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.t;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.r;
        this.s.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        int i = x + 89;
        v = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'B' : 'Z') == 'B') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        v = (x + 9) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.q.setDisplayedChild(1);
        int i = v + 49;
        x = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        x = (v + 25) % Property.TYPE_ARRAY;
        Iterator<DetailTransactionResponse.TxnDataDetail> it = list.iterator();
        try {
            x = (v + 5) % Property.TYPE_ARRAY;
            while (true) {
                try {
                    if ((it.hasNext() ? '&' : 'E') != '&') {
                        this.q.setDisplayedChild(2);
                        return;
                    } else {
                        a(it.next());
                        v = (x + 31) % Property.TYPE_ARRAY;
                    }
                } catch (Exception e) {
                    throw e;
                }
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
        boolean z = true;
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
        try {
            int i = x + 3;
            try {
                v = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z = false;
                }
                if (z) {
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
                int i = x + 51;
                v = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? '_' : 'B') != 'B') {
                    throw new ArithmeticException("divide by zero");
                }
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
        this.q = (ViewAnimator) findViewById(2131299751);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        Bundle extras = getIntent().getExtras();
        this.t = extras.getString("no_reff", "");
        this.r = extras.getString("token", "");
        DetailTransactionPresenter detailTransactionPresenter = new DetailTransactionPresenter();
        this.s = detailTransactionPresenter;
        detailTransactionPresenter.e = this;
        v();
        v = (x + 77) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        try {
            v = (x + 9) % Property.TYPE_ARRAY;
            this.tvErrorMessage.setText(str);
            this.q.setDisplayedChild(1);
            x = (v + 67) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        v = (x + 7) % Property.TYPE_ARRAY;
        try {
            this.tvErrorMessage.setText(str);
            this.q.setDisplayedChild(1);
            int i = v + 77;
            x = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        int i = x + 53;
        v = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '&' : '2') != '2') {
            this.q.setDisplayedChild(1);
            return;
        }
        try {
            this.q.setDisplayedChild(0);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        int i = v + 95;
        x = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'Z' : '3') != 'Z') {
            getMenuInflater().inflate(2131558410, menu);
            z = true;
        } else {
            getMenuInflater().inflate(2131558410, menu);
            z = false;
        }
        return z;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        DetailTransactionPresenter detailTransactionPresenter;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call;
        try {
            int i = x + setHasDecor$MediaBrowserCompat$MediaItem.aM;
            v = i % Property.TYPE_ARRAY;
            boolean z = false;
            boolean z2 = false;
            if ((i % 2 != 0 ? 28 : 'T') != 28) {
                onDestroy();
                DetailTransactionPresenter detailTransactionPresenter2 = this.s;
                call = detailTransactionPresenter2.c;
                if (call == null) {
                    z2 = true;
                }
                detailTransactionPresenter = detailTransactionPresenter2;
                if (!z2) {
                    detailTransactionPresenter = detailTransactionPresenter2;
                    call.cancel();
                }
                detailTransactionPresenter.e = null;
                try {
                    v = (x + 91) % Property.TYPE_ARRAY;
                    return;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                onDestroy();
                DetailTransactionPresenter detailTransactionPresenter3 = this.s;
                call = detailTransactionPresenter3.c;
                Object[] objArr = null;
                int length = objArr.length;
                if (call == null) {
                    z = true;
                }
                detailTransactionPresenter = detailTransactionPresenter3;
                if (!z) {
                    detailTransactionPresenter = detailTransactionPresenter3;
                    call.cancel();
                }
                detailTransactionPresenter.e = null;
                v = (x + 91) % Property.TYPE_ARRAY;
                return;
            }
        } catch (Exception e2) {
            throw e2;
        }
        throw e2;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = x + 15;
        v = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            menuItem.getItemId();
            throw new NullPointerException();
        }
        if ((menuItem.getItemId() == 16908332 ? 'W' : '2') != '2') {
            v = (x + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            int i2 = x + 101;
            v = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? 1 : '?') != '?') {
                onRequestPermissionsResult(i, strArr, iArr);
                CC3ChooseBCACardActivity_ViewBinding.b(this, i, iArr);
                throw new NullPointerException();
            }
            onRequestPermissionsResult(i, strArr, iArr);
            CC3ChooseBCACardActivity_ViewBinding.b(this, i, iArr);
            int i3 = x + 27;
            v = i3 % Property.TYPE_ARRAY;
            if ((i3 % 2 != 0 ? ';' : '+') == ';') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        v = (x + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        setCardSlogan.e().b = "DetailFailedTarikanActivity";
        this.j = "DetailFailedTarikanActivity";
        char c = ']';
        int i = x + 93;
        v = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            c = '[';
        }
        if (c != '[') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        v = (x + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
        int i = v + 31;
        x = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? ']' : '?') == '?') {
            return 2131492936;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492936;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        x = (v + 51) % Property.TYPE_ARRAY;
        try {
            v = (x + 47) % Property.TYPE_ARRAY;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296446})
    public void retry(View view) {
        x = (v + 7) % Property.TYPE_ARRAY;
        v();
        v = (x + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        this.p = branchMapItemBNAdapter$BranchMapItemVH.c;
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                CC3ChooseBCACardActivity_ViewBinding.b(this);
                x = (v + 65) % Property.TYPE_ARRAY;
                return;
            }
            try {
                int i = x + 41;
                v = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z = false;
                }
                if (z) {
                    t();
                    throw new ArithmeticException("divide by zero");
                } else {
                    t();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void t() {
        int i = v + 31;
        x = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'M' : '>') != 'M') {
            try {
                b(this.n);
                try {
                    x = (v + 87) % Property.TYPE_ARRAY;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            b(this.n);
            throw new ArithmeticException("divide by zero");
        }
    }
}
