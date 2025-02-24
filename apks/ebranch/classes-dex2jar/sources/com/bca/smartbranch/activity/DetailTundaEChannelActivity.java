package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.global.TransaksiTunda;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CancelAskTransaksiDialog;
import com.bca.smartbranch.dialog.CancelTransaksiDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.CancelReservationPresenter;
import com.bca.smartbranch.presenter.CancelTundaPresenter;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC25AFormKartuKreditFragment;
import o.CC4BCACardInfoActivity;
import o.InfoDocumentUnderlyingActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.documentProvider;
import o.equals;
import o.getPromotion;
import o.onChooseBidangUsaha;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaEChannelActivity.class */
public class DetailTundaEChannelActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, CancelTundaPresenter.IconCompatParcelizer, CancelReservationPresenter.write {
    private static int F;
    private static boolean I;
    private static int K;
    private ViewAnimator A;
    private TransaksiTunda B;
    private String C;
    private String D;
    @BindView(2131296380)
    Button btnBatal;
    @BindView(2131296443)
    Button btnReschedule;
    @BindView(2131296444)
    Button btnReservasi;
    @BindString(2131820609)
    String buktiPengisianForm;
    setMessage f;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297408)
    ImageView ivQRCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297711)
    LinearLayout llKcp;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297875)
    LinearLayout llRuangan;
    private Bitmap n;
    @BindString(2131821357)
    String note;
    private View p;
    private CancelReservationPresenter q;
    private String r;
    @BindString(2131822092)
    String retry;
    private QRCodeDialog s;
    private String t;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298925)
    TextView tvDescriptionKey;
    @BindView(2131298928)
    TextView tvDescriptionValue;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299557)
    TextView tvWaktu;
    private CancelTundaPresenter u;
    private String v;
    private String w;
    private DetailTransactionPresenter x;
    private String y;
    private boolean z;
    private static char[] H = {205, 217, 215, 152, 204, 203, 221, 220, 222, 216, 210, 218, 224, 211, 206, 207};
    private static boolean E = true;
    private static int G = 106;

    public DetailTundaEChannelActivity() {
        try {
            this.f = new setMessage();
            this.C = "";
            this.r = "";
        } catch (Exception e) {
            throw e;
        }
    }

    public static void a(LogRedirector.Logger logger) {
        int i = K + 59;
        F = i % Property.TYPE_ARRAY;
        boolean z = true;
        if (!(i % 2 != 0)) {
            logger.a();
            int i2 = K + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
            F = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                z = false;
            }
            if (!z) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        logger.a();
        throw new ArithmeticException("divide by zero");
    }

    private static void c(int i, int[] iArr, char[] cArr, byte[] bArr, Object[] objArr) {
        synchronized (CC25AFormKartuKreditFragment.d) {
            char[] cArr2 = H;
            int i2 = G;
            if (I) {
                int length = bArr.length;
                CC25AFormKartuKreditFragment.b = length;
                char[] cArr3 = new char[length];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr3[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[bArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] + i] - i2));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr3);
            } else if (E) {
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

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.y);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = false;
        if ((Build.VERSION.SDK_INT >= 29 ? '_' : 'Q') != '_') {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                K = (F + 47) % Property.TYPE_ARRAY;
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
            c(getApplicationInfo().targetSdkVersion + 93, null, null, new byte[]{-120, -112, -113, -114, -115, -126, -120, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (this.z) {
            z = true;
        }
        if (z) {
            F = (K + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.s;
        if (qRCodeDialog != null) {
            qRCodeDialog.dismiss();
        }
    }

    private void y() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.y;
        infoDocumentUnderlyingActivity.d = "TUNDA";
        infoDocumentUnderlyingActivity.b = this.w;
        infoDocumentUnderlyingActivity.a = this.B.getType();
        this.x.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        try {
            int i = F + 113;
            try {
                K = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        K = (F + 27) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.A, str, -1).g();
        F = (K + 19) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        F = (K + 95) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.A.setDisplayedChild(1);
        try {
            int i = K + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'K' : 0) != 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03c1, code lost:
        if (r0.equals("3") == false) goto L_0x040c;
     */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a_(java.util.List<com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail> r6) {
        /*
        // Method dump skipped, instructions count: 1287
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaEChannelActivity.a_(java.util.List):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("imei", this.m.getImei());
            bundle.putString("email", this.m.getEmail());
            bundle.putString("message", str);
            bundle.putBoolean("is_multiple_login", true);
            AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
            autoLogoutDialog.setArguments(bundle);
            autoLogoutDialog.show(l(), "AutoLogoutDialog");
            int i = K + 63;
            F = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
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
        int i = K + 97;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 19 : '@') != '@') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131296380})
    public void batal(View view) {
        F = (K + 83) % Property.TYPE_ARRAY;
        if (this.v.equals("Y")) {
            CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", this.w);
            bundle.putString("noref", this.y);
            cancelAskTransaksiDialog.setArguments(bundle);
            cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
            return;
        }
        CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
        Bundle bundle2 = new Bundle();
        bundle2.putString("token", this.w);
        bundle2.putString("noref", this.y);
        cancelTransaksiDialog.setArguments(bundle2);
        cancelTransaksiDialog.show(l(), "CancelTransaksiDialog");
        F = (K + 63) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        F = (K + 29) % Property.TYPE_ARRAY;
    }

    @OnClick({2131296444, 2131296443})
    public void clickedReservation(View view) {
        String str;
        this.p = view;
        Reservation reservation = new Reservation();
        reservation.setNoReff(this.B.getNoReff());
        reservation.setTypeTransaction(this.t);
        reservation.setTxnType(this.t);
        reservation.setTransactionCode(ReservasiOnline.INTERNET_MOBILE_BANKING);
        if (this.p.getId() == 2131296444) {
            K = (F + 57) % Property.TYPE_ARRAY;
            str = "NEW_RESERVATION";
        } else {
            str = "RESCHEDULE_RESERVATION";
        }
        reservation.setTypeReservation(str);
        reservation.setTnxStatus(this.D);
        Intent intent = new Intent(this, BranchMapActivity.class);
        intent.putExtra("reff_no", reservation.getNoReff());
        intent.putExtra("type_transaksi", reservation.getTypeTransaction());
        intent.putExtra("type_reservation", reservation.getTypeReservation());
        intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        startActivity(intent);
        K = (F + 67) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.A = (ViewAnimator) findViewById(2131299752);
        this.x = new DetailTransactionPresenter();
        this.q = new CancelReservationPresenter();
        this.u = new CancelTundaPresenter();
        this.x.e = this;
        this.q.a = this;
        this.u.a = this;
        TransaksiTunda transaksiTunda = (TransaksiTunda) ListUtil.OneItemImmutableList.a(getIntent().getExtras().getParcelable("transaksi_tunda"));
        this.B = transaksiTunda;
        this.y = transaksiTunda.getNoReff();
        this.v = this.B.getFlagBooking();
        this.w = this.B.getToken();
        boolean z = false;
        if (this.v.equals("Y")) {
            this.btnReservasi.setVisibility(8);
            this.btnReschedule.setVisibility(0);
            this.llKcp.setVisibility(0);
        }
        if (this.B.getServiceType() == null) {
            z = true;
        }
        if (!z) {
            K = (F + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
            if ((this.B.getServiceType().equals("TL") ? 'S' : ']') != ']') {
                K = (F + 67) % Property.TYPE_ARRAY;
                this.btnReservasi.setVisibility(8);
                this.btnReschedule.setVisibility(8);
                this.btnBatal.setBackgroundResource(2131231309);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.btnBatal.getLayoutParams();
                layoutParams.width = -2;
                int dimensionPixelSize = getResources().getDimensionPixelSize(2131165353);
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                layoutParams.weight = 0.0f;
                this.btnBatal.setLayoutParams(layoutParams);
            }
        }
        y();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        int i = F + 83;
        K = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            this.tvErrorMessage.setText(str);
            this.A.setDisplayedChild(1);
            return;
        }
        try {
            this.tvErrorMessage.setText(str);
            this.A.setDisplayedChild(1);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        int i;
        ViewAnimator viewAnimator;
        int i2 = F + 73;
        K = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? ']' : 24) != 24) {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.A;
            i = 0;
        } else {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.A;
            i = 1;
        }
        viewAnimator.setDisplayedChild(i);
        K = (F + 25) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        K = (F + 75) % Property.TYPE_ARRAY;
        z();
        int i = F + 89;
        K = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        int i = K + 63;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            this.A.setDisplayedChild(0);
        } else {
            try {
                try {
                    this.A.setDisplayedChild(0);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        F = (K + 59) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void i(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            F = (K + 73) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        K = (F + 65) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.A, str, -1).g();
        K = (F + 41) % Property.TYPE_ARRAY;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        K = (F + 81) % Property.TYPE_ARRAY;
        try {
            finish();
            try {
                int i = F + 29;
                K = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? (char) 25 : 5) == 25) {
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        try {
            DetailTransactionPresenter detailTransactionPresenter = this.x;
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
            if ((call != null ? 'V' : '#') == 'V') {
                K = (F + 31) % Property.TYPE_ARRAY;
                try {
                    call.cancel();
                } catch (Exception e) {
                    throw e;
                }
            }
            detailTransactionPresenter.e = null;
            CancelTundaPresenter cancelTundaPresenter = this.u;
            Call<OpenAccountSuccessActivity<Object>> call2 = cancelTundaPresenter.d;
            if (call2 != null) {
                int i = F + 57;
                K = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 22 : 'C') != 22) {
                    call2.cancel();
                } else {
                    call2.cancel();
                    throw new ArithmeticException("divide by zero");
                }
            }
            cancelTundaPresenter.a = null;
            CancelReservationPresenter cancelReservationPresenter = this.q;
            Call<OpenAccountSuccessActivity<Object>> call3 = cancelReservationPresenter.c;
            if (call3 != null) {
                call3.cancel();
            }
            cancelReservationPresenter.a = null;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0 != 16908332) goto L_0x006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if ((r4.getItemId() != 16908332 ? '\t' : 'S') != '\t') goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        onBackPressed();
        com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = (com.bca.smartbranch.activity.DetailTundaEChannelActivity.K + 91) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        return onOptionsItemSelected(r4);
     */
    @Override // android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onOptionsItemSelected(android.view.MenuItem r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.K
            r1 = 113(0x71, float:1.58E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 81
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 53
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 53
            if (r0 == r1) goto L_0x003b
            r0 = r4
            int r0 = r0.getItemId()
            r6 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0038
            r5 = r0
            r0 = r6
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 == r1) goto L_0x0056
            goto L_0x006b
        L_0x0038:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x003b:
            r0 = r4
            int r0 = r0.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 == r1) goto L_0x004d
            r0 = 9
            r5 = r0
            goto L_0x0050
        L_0x004d:
            r0 = 83
            r5 = r0
        L_0x0050:
            r0 = r5
            r1 = 9
            if (r0 == r1) goto L_0x006b
        L_0x0056:
            r0 = r3
            r0.onBackPressed()
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.K
            r1 = 91
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = r0
            r0 = 1
            return r0
        L_0x006b:
            r0 = r3
            r1 = r4
            boolean r0 = r0.onOptionsItemSelected(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaEChannelActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = F + 75;
        K = i2 % Property.TYPE_ARRAY;
        if (!(i2 % 2 != 0)) {
            onRequestPermissionsResult(i, strArr, iArr);
            CC4BCACardInfoActivity.a(this, i, iArr);
            throw new ArithmeticException("divide by zero");
        }
        onRequestPermissionsResult(i, strArr, iArr);
        try {
            CC4BCACardInfoActivity.a(this, i, iArr);
            F = (K + 49) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = K + 39;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'P' : 19) != 19) {
            setCardSlogan.e().b = "DetailTundaEChannelActivity";
            this.j = "DetailTundaEChannelActivity";
            throw new ArithmeticException("divide by zero");
        }
        setCardSlogan.e().b = "DetailTundaEChannelActivity";
        this.j = "DetailTundaEChannelActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        K = (F + 51) % Property.TYPE_ARRAY;
        int i = K + 29;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '6' : 22) != '6') {
            return 2131492941;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            int i = F + 1;
            K = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '\"' : 'O') != '\"') {
                return this;
            }
            throw new ArithmeticException("divide by zero");
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296446})
    public void retry(View view) {
        F = (K + 1) % Property.TYPE_ARRAY;
        y();
        K = (F + 27) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 112 ? (char) 4 : 6) != 6) goto L_0x0096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        if ((android.os.Build.VERSION.SDK_INT < 33) != false) goto L_0x0062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        o.CC4BCACardInfoActivity.e(r3);
        r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.F + 77;
        com.bca.smartbranch.activity.DetailTundaEChannelActivity.K = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
        if ((r0 % 2) != 0) goto L_0x0081;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
        r5 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        r5 = '`';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r5 == 21) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
        com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = (com.bca.smartbranch.activity.DetailTundaEChannelActivity.K + 41) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
        throw r4;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.F
            r1 = 29
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelActivity.K = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001b
            r0 = 58
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 40
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 40
            if (r0 == r1) goto L_0x0045
            r0 = r3
            r1 = r4
            boolean r1 = r1.c
            r0.z = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 112(0x70, float:1.57E-43)
            if (r0 < r1) goto L_0x0039
            r0 = 4
            r5 = r0
            goto L_0x003c
        L_0x0039:
            r0 = 6
            r5 = r0
        L_0x003c:
            r0 = r5
            r1 = 6
            if (r0 == r1) goto L_0x0062
            goto L_0x0096
        L_0x0045:
            r0 = r3
            r1 = r4
            boolean r1 = r1.c     // Catch: Exception -> 0x00ad
            r0.z = r1     // Catch: Exception -> 0x00ad
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x00ad
            r5 = r0
            r0 = r5
            r1 = 33
            if (r0 < r1) goto L_0x005c
            r0 = 0
            r5 = r0
            goto L_0x005e
        L_0x005c:
            r0 = 1
            r5 = r0
        L_0x005e:
            r0 = r5
            if (r0 == 0) goto L_0x0096
        L_0x0062:
            r0 = r3
            o.CC4BCACardInfoActivity.e(r0)
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.F
            r1 = 77
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelActivity.K = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0081
            r0 = 21
            r5 = r0
            goto L_0x0084
        L_0x0081:
            r0 = 96
            r5 = r0
        L_0x0084:
            r0 = r5
            r1 = 21
            if (r0 == r1) goto L_0x008b
            return
        L_0x008b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x0093
            r1 = r0
            r1.<init>()     // Catch: all -> 0x0093
            throw r0     // Catch: all -> 0x0093
        L_0x0093:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0096:
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.K     // Catch: Exception -> 0x00ad
            r5 = r0
            int r5 = r5 + 41
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = r0     // Catch: Exception -> 0x00aa
            r0 = r3
            r0.v()
            return
        L_0x00aa:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x00ad:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaEChannelActivity.saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH):void");
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        F = (K + 99) % Property.TYPE_ARRAY;
        this.f.b(this.llDetail, this.ivDetail);
        F = (K + 31) % Property.TYPE_ARRAY;
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", this.D);
        startActivity(intent);
        try {
            try {
                F = (K + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r0 != false) goto L_0x003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.e != false) goto L_0x003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        r9.q.e(new o.FormUbahTellerActivity_ViewBinding(r9.m.getEmail(), r9.m.getSessionId(), r10.b, r10.d, r9.m.getImei()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.u.a(new o.choosePic(r9.m.getEmail(), r9.m.getImei(), r9.m.getSessionId(), r10.b, r10.a, r10.d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
        r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.F + 21;
        com.bca.smartbranch.activity.DetailTundaEChannelActivity.K = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
        if ((r0 % 2) != 0) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
        if (r11 == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
        throw r10;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void subscribeSubmitBatalEvent(o.ChooseBCACardAdapter$ViewHolder r10) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaEChannelActivity.subscribeSubmitBatalEvent(o.ChooseBCACardAdapter$ViewHolder):void");
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void t() {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131822441));
        bundle.putString("MessageDialogTitle", getString(2131822128));
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        F = (K + 49) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void u() {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131822441));
        bundle.putString("MessageDialogTitle", getString(2131822128));
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        K = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '6' : 'J') == '6') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public final void v() {
        try {
            int i = F + 51;
            K = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 'K' : ',') != ',') {
                c(this.n);
                throw new NullPointerException();
            }
            c(this.n);
            int i2 = K + 13;
            F = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void w_(String str) {
        F = (K + 101) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.A, str, 0).g();
        K = (F + 75) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void x_(String str) {
        K = (F + 41) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.A, str, 0).g();
        int i = K + 81;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '_' : 1) != 1) {
            throw new NullPointerException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r4.s == null) goto L_0x003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        r4.s = new com.bca.smartbranch.dialog.QRCodeDialog();
        com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = (com.bca.smartbranch.activity.DetailTundaEChannelActivity.K + 75) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        r0 = r4.s;
        r0 = r4.n;
        r0 = r4.y;
        r0.b = r0;
        r0.d = r0;
        r4.s.show(l(), "QRCodeDialog");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
        return;
     */
    @butterknife.OnClick({2131297408})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void zoomQRCode() {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.K
            r1 = 111(0x6f, float:1.56E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 69
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 31
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 31
            if (r0 == r1) goto L_0x0036
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.s
            r6 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0033
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0057
            goto L_0x003d
        L_0x0033:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x0036:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.s
            if (r0 != 0) goto L_0x0057
        L_0x003d:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r1 = new com.bca.smartbranch.dialog.QRCodeDialog
            r2 = r1
            r2.<init>()
            r0.s = r1
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelActivity.K
            r1 = 75
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelActivity.F = r0
        L_0x0057:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.s
            r7 = r0
            r0 = r4
            android.graphics.Bitmap r0 = r0.n
            r8 = r0
            r0 = r4
            java.lang.String r0 = r0.y
            r6 = r0
            r0 = r7
            r1 = r8
            r0.b = r1
            r0 = r7
            r1 = r6
            r0.d = r1
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.s
            r1 = r4
            o.isDetached r1 = r1.l()
            java.lang.String r2 = "QRCodeDialog"
            r0.show(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaEChannelActivity.zoomQRCode():void");
    }
}
