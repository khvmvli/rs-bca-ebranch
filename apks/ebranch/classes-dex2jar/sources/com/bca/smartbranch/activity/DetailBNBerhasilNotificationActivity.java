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
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23AFormKartuKreditFragment;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.consumeDisplayCutout;
import o.documentProvider;
import o.equals;
import o.getPromotion;
import o.loginAsGuest;
import o.onAcceptKetentuanOR;
import o.onCLickedPilihKartu;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNBerhasilNotificationActivity.class */
public class DetailBNBerhasilNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static char[] B = {13748, 13816, 13813, 13812, 13817, 13822, 13806, 13823, 13811, 13802, 13800, 13819, 13801, 13810, 13815, 13804};
    private static char C = (char) 4;
    private static int D;
    private static int F;
    private ViewAnimator A;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296448)
    Button btnShare;
    @BindView(2131297031)
    EditText etKomentar;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297841)
    LinearLayout llPecahanUang;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297887)
    LinearLayout llShare;
    @BindArray(2130903078)
    String[] mataUangBankNotes;
    private String n;
    private String p;
    private String q;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private String s;
    private String t;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822201)
    String toolbarTitle;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299168)
    TextView tvErrorRating;
    @BindView(2131299327)
    TextView tvJumlahPembelian;
    @BindView(2131299385)
    TextView tvKurs;
    @BindView(2131299400)
    TextView tvMataUang;
    @BindView(2131299416)
    TextView tvNama;
    @BindView(2131299467)
    TextView tvNoRef;
    @BindView(2131299510)
    TextView tvPecahanUang;
    @BindView(2131299536)
    TextView tvPenilaian;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299659)
    TextView tvTitlePecahanUang;
    @BindView(2131299684)
    TextView tvTotalPembayaran;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private String v;
    private String w;
    private String x;
    private RateTransactionPresenter y;
    private String z;
    private setMessage f = new setMessage();
    private String r = "";

    private static Bitmap a(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            D = (F + 29) % Property.TYPE_ARRAY;
            return createBitmap;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fe, code lost:
        if (r0.equals("Pecahan Uang") != false) goto L_0x0201;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a(com.bca.smartbranch.data.api.response.FirebaseResponse.TxnDataDetail r6) {
        /*
        // Method dump skipped, instructions count: 1244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.a(com.bca.smartbranch.data.api.response.FirebaseResponse$TxnDataDetail):void");
    }

    static /* synthetic */ void b(DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity) {
        int i = F + 83;
        D = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? 'J' : '0';
        detailBNBerhasilNotificationActivity.v();
        if (c != '0') {
            throw new ArithmeticException("divide by zero");
        }
    }

    private static void b(char[] cArr, byte b, int i, Object[] objArr) {
        int i2;
        String str;
        synchronized (CC23AFormKartuKreditFragment.i) {
            char[] cArr2 = B;
            char c = C;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) ((char) (cArr[i2] - b));
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                CC23AFormKartuKreditFragment.d = 0;
                while (CC23AFormKartuKreditFragment.d < i2) {
                    CC23AFormKartuKreditFragment.a = (char) cArr[CC23AFormKartuKreditFragment.d];
                    CC23AFormKartuKreditFragment.c = (char) cArr[CC23AFormKartuKreditFragment.d + 1];
                    if (CC23AFormKartuKreditFragment.a == CC23AFormKartuKreditFragment.c) {
                        cArr3[CC23AFormKartuKreditFragment.d] = (char) ((char) (CC23AFormKartuKreditFragment.a - b));
                        cArr3[CC23AFormKartuKreditFragment.d + 1] = (char) ((char) (CC23AFormKartuKreditFragment.c - b));
                    } else {
                        CC23AFormKartuKreditFragment.b = CC23AFormKartuKreditFragment.a / c;
                        CC23AFormKartuKreditFragment.j = CC23AFormKartuKreditFragment.a % c;
                        CC23AFormKartuKreditFragment.e = CC23AFormKartuKreditFragment.c / c;
                        CC23AFormKartuKreditFragment.f = CC23AFormKartuKreditFragment.c % c;
                        if (CC23AFormKartuKreditFragment.j == CC23AFormKartuKreditFragment.f) {
                            CC23AFormKartuKreditFragment.b = ((CC23AFormKartuKreditFragment.b + c) - 1) % c;
                            CC23AFormKartuKreditFragment.e = ((CC23AFormKartuKreditFragment.e + c) - 1) % c;
                            int i3 = CC23AFormKartuKreditFragment.b;
                            int i4 = CC23AFormKartuKreditFragment.j;
                            int i5 = CC23AFormKartuKreditFragment.e;
                            int i6 = CC23AFormKartuKreditFragment.f;
                            cArr3[CC23AFormKartuKreditFragment.d] = (char) cArr2[(i3 * c) + i4];
                            cArr3[CC23AFormKartuKreditFragment.d + 1] = (char) cArr2[(i5 * c) + i6];
                        } else if (CC23AFormKartuKreditFragment.b == CC23AFormKartuKreditFragment.e) {
                            CC23AFormKartuKreditFragment.j = ((CC23AFormKartuKreditFragment.j + c) - 1) % c;
                            CC23AFormKartuKreditFragment.f = ((CC23AFormKartuKreditFragment.f + c) - 1) % c;
                            int i7 = CC23AFormKartuKreditFragment.b;
                            int i8 = CC23AFormKartuKreditFragment.j;
                            int i9 = CC23AFormKartuKreditFragment.e;
                            int i10 = CC23AFormKartuKreditFragment.f;
                            cArr3[CC23AFormKartuKreditFragment.d] = (char) cArr2[(i7 * c) + i8];
                            cArr3[CC23AFormKartuKreditFragment.d + 1] = (char) cArr2[(i9 * c) + i10];
                        } else {
                            int i11 = CC23AFormKartuKreditFragment.b;
                            int i12 = CC23AFormKartuKreditFragment.f;
                            int i13 = CC23AFormKartuKreditFragment.e;
                            int i14 = CC23AFormKartuKreditFragment.j;
                            cArr3[CC23AFormKartuKreditFragment.d] = (char) cArr2[(i11 * c) + i12];
                            cArr3[CC23AFormKartuKreditFragment.d + 1] = (char) cArr2[(i13 * c) + i14];
                        }
                    }
                    CC23AFormKartuKreditFragment.d += 2;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr3[i15] = (char) ((char) (cArr3[i15] ^ 13722));
            }
            str = new String(cArr3);
        }
        objArr[0] = str;
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = true;
        if ((Build.VERSION.SDK_INT >= 29 ? 18 : 'W') != 'W') {
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
                int i = D + 29;
                F = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    file2.delete();
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    file2.delete();
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
            Object[] objArr2 = new Object[1];
            b(new char[]{6, 0, '\f', 2, 0, 5, '\b', 3, '\r', 15, '\b', 11, 5, 2, 11, '\b', 0, 7, '\f', 1, '\n', 11, 3, 14, '\t', 4, 6, 11}, (byte) (getResources().getString(2131822451).substring(0, 4).length() + 2), 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), objArr2);
            uri = equals.d(this, ((String) objArr2[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        int i2 = F + 27;
        D = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            z = false;
        }
        if (!z) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public static void d(LogRedirector.Logger logger) {
        try {
            int i = F + 7;
            D = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                logger.a();
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            logger.a();
        } catch (Exception e) {
            throw e;
        }
    }

    private void v() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.u;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.w;
        this.y.d(loginasguest);
        D = (F + 11) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0339 A[LOOP:1: B:38:0x0176->B:50:0x0339, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b A[EDGE_INSN: B:58:0x018b->B:44:0x018b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void y() {
        /*
        // Method dump skipped, instructions count: 857
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.y():void");
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
            int i = F + 45;
            D = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.A = (ViewAnimator) findViewById(2131299751);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.y = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        y();
        D = (F + 27) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        int i = D + 69;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) '\f' : 14) != 14) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            throw new NullPointerException();
        }
        try {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            int i2 = D + 99;
            F = i2 % Property.TYPE_ARRAY;
            if (!(i2 % 2 != 0)) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void i(String str) {
        try {
            x();
            try {
                documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                bundle.putBoolean("isMessageSuccess", true);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
                this.ratingBar.setClickable(false);
                this.ratingBar.setScrollable(false);
                this.etKomentar.setFocusable(false);
                this.etKomentar.setFocusableInTouchMode(false);
                this.etKomentar.setLongClickable(false);
                this.etKomentar.setEnabled(false);
                this.btnProses.setVisibility(8);
                this.tvPenilaian.setText("Penilaian kamu");
                F = (D + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBNBerhasilNotificationActivity.b(DetailBNBerhasilNotificationActivity.this);
            }
        }).g();
        D = (F + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        F = (D + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        getMenuInflater().inflate(2131558409, menu);
        D = (F + 15) % Property.TYPE_ARRAY;
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = D + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        F = i % Property.TYPE_ARRAY;
        boolean z = false;
        if (!(i % 2 != 0)) {
            onDestroy();
            Call<OpenAccountSuccessActivity<Object>> call = this.y.a;
            throw new NullPointerException();
        }
        onDestroy();
        RateTransactionPresenter rateTransactionPresenter = this.y;
        Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
        if (call2 != null) {
            z = true;
        }
        RateTransactionPresenter rateTransactionPresenter2 = rateTransactionPresenter;
        if (z) {
            int i2 = F + 9;
            D = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '?' : 'a') != 'a') {
                call2.cancel();
                throw new NullPointerException();
            } else {
                call2.cancel();
                rateTransactionPresenter2 = rateTransactionPresenter;
            }
        }
        rateTransactionPresenter2.e = null;
    }

    @OnFocusChange({2131297031})
    public void onFocus(View view, boolean z) {
        D = (F + 93) % Property.TYPE_ARRAY;
        if (z) {
            int i = D + 43;
            F = i % Property.TYPE_ARRAY;
            int id = view.getId();
            if (i % 2 == 0) {
                throw new NullPointerException();
            }
            if ((id == 2131297031 ? 1 : 'Q') != 'Q') {
                this.tilKomentar.setHintEnabled(true);
                return;
            }
            return;
        }
        if ((view.getId() == 2131297031 ? 'A' : '6') == 'A' && this.etKomentar.getText().toString().isEmpty()) {
            this.tilKomentar.setHintEnabled(false);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if ((menuItem.getItemId() == 16908332 ? 'X' : 'N') != 'N') {
            int i = D + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                onBackPressed();
                return false;
            }
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            int i2 = D + 45;
            F = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                return true;
            }
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            int i2 = F + setHasDecor$MediaBrowserCompat$MediaItem.aI;
            D = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '\f' : '[') != '[') {
                onRequestPermissionsResult(i, strArr, iArr);
                onCLickedPilihKartu.d(this, i, iArr);
                throw new NullPointerException();
            }
            onRequestPermissionsResult(i, strArr, iArr);
            try {
                onCLickedPilihKartu.d(this, i, iArr);
                int i3 = F + 69;
                D = i3 % Property.TYPE_ARRAY;
                if ((i3 % 2 != 0 ? 'Z' : '3') == 'Z') {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = D + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 19 : '\b') != 19) {
            setCardSlogan.e().b = "DetailBNBerhasilNotificationActivity";
            this.j = "DetailBNBerhasilNotificationActivity";
            return;
        }
        setCardSlogan.e().b = "DetailBNBerhasilNotificationActivity";
        this.j = "DetailBNBerhasilNotificationActivity";
        throw new NullPointerException();
    }

    @OnClick({2131296440})
    public void proses(View view) {
        F = (D + 95) % Property.TYPE_ARRAY;
        this.tvErrorRating.setVisibility(8);
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        boolean z = true;
        if (!(((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f)) {
            int i = F + 57;
            D = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                this.etKomentar.getText().toString().isEmpty();
                throw new NullPointerException();
            }
            if (!(this.etKomentar.getText().toString().isEmpty())) {
                v();
                return;
            }
        }
        if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f) {
            z = false;
        }
        if (!z) {
            F = (D + 83) % Property.TYPE_ARRAY;
            this.tvErrorRating.setVisibility(0);
            this.tvErrorRating.setText(2131820982);
        }
        if (this.etKomentar.getText().toString().isEmpty()) {
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        D = (F + 13) % Property.TYPE_ARRAY;
        int i = F + 41;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'b' : 'S') != 'b') {
            return 2131492929;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            F = (D + 31) % Property.TYPE_ARRAY;
            try {
                D = (F + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
                return this;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void s() {
        int i = F + 53;
        D = i % Property.TYPE_ARRAY;
        boolean z = false;
        if (i % 2 != 0) {
            try {
                d(a(this.llShare));
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } else {
            d(a(this.llShare));
            int i2 = D + 111;
            F = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                z = true;
            }
            if (!z) {
                throw new NullPointerException();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if ((android.os.Build.VERSION.SDK_INT < 33) != true) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 7) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.D = (com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.F + 33) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        o.onCLickedPilihKartu.c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.D     // Catch: Exception -> 0x0061
            r1 = 45
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.F = r0     // Catch: Exception -> 0x0061
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001b
            r0 = 99
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 44
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 99
            if (r0 == r1) goto L_0x003b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0031
            r0 = 0
            r5 = r0
            goto L_0x0033
        L_0x0031:
            r0 = 1
            r5 = r0
        L_0x0033:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x005c
            goto L_0x0045
        L_0x003b:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0061
            r5 = r0
            r0 = r5
            r1 = 7
            if (r0 < r1) goto L_0x005c
        L_0x0045:
            r0 = r3
            r0.s()
            int r0 = com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.F     // Catch: Exception -> 0x0059
            r1 = 33
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.D = r0     // Catch: Exception -> 0x0059
            return
        L_0x0059:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x005c:
            r0 = r3
            o.onCLickedPilihKartu.c(r0)
            return
        L_0x0061:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        try {
            F = (D + 19) % Property.TYPE_ARRAY;
            z();
            D = (F + 13) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }
}
