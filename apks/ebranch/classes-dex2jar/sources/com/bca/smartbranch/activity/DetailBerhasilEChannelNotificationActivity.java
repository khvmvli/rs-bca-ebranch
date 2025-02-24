package com.bca.smartbranch.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnFocusChange;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23BFormKartuKreditFragment;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.consumeDisplayCutout;
import o.documentProvider;
import o.equals;
import o.getPromotion;
import o.loginAsGuest;
import o.onAcceptKetentuanOR;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.subscribeChooseUbahVisaCardEvent;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilEChannelNotificationActivity.class */
public class DetailBerhasilEChannelNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int A;
    private static int u;
    private static int[] w = {-1219965556, -1127279850, -114103070, 746690373, 946278198, 1436465796, 1345529477, -589906897, -189250631, 1316109503, 2128577064, -445229794, -1830737349, 941953244, -917882786, -1763592889, -824607703, 1685276929};
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296448)
    Button btnShare;
    @BindView(2131296945)
    LogoutDialog etAlasan;
    @BindView(2131297031)
    LogoutDialog etKomentar;
    setMessage f;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297875)
    LinearLayout llRuangan;
    @BindView(2131297887)
    LinearLayout llShare;
    private String n;
    private RateTransactionPresenter p;
    private String q;
    private boolean r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private String s;
    private String t;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822201)
    String toolbarTitle;
    @BindView(2131297559)
    LinearLayout trCabang;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299416)
    TextView tvNama;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299689)
    TextView tvTransaksi;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private ViewAnimator v;
    private String x;
    private String y;

    public DetailBerhasilEChannelNotificationActivity() {
        try {
            this.t = "";
            try {
                this.f = new setMessage();
                this.r = false;
                this.y = "";
                this.n = "";
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static Bitmap a(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            try {
                u = (A + 61) % Property.TYPE_ARRAY;
                return createBitmap;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void b(LogRedirector.Logger logger) {
        try {
            A = (u + 71) % Property.TYPE_ARRAY;
            try {
                logger.a();
                A = (u + 19) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 3 : 'Z') != 3) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                A = (u + 61) % Property.TYPE_ARRAY;
                file2.delete();
                u = (A + 111) % Property.TYPE_ARRAY;
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
            e(new int[]{2058478706, -2096808842, -1016972491, 1848715735, 2095292983, -1897962039, -1720297726, -1597248108, 1992130229, -87751215, 615992331, 2100085676, -455139591, 862394763}, getResources().getString(2131822451).substring(0, 4).length() + 24, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            A = (u + 11) % Property.TYPE_ARRAY;
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            A = (u + 57) % Property.TYPE_ARRAY;
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    static /* synthetic */ void d(DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity) {
        A = (u + 43) % Property.TYPE_ARRAY;
        detailBerhasilEChannelNotificationActivity.y();
        int i = u + 33;
        A = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '*' : 'X') != 'X') {
            throw new NullPointerException();
        }
    }

    private void d(FirebaseResponse.TxnDataDetail txnDataDetail) {
        char c;
        String key = txnDataDetail.getKey();
        key.hashCode();
        char c2 = 3;
        switch (key.hashCode()) {
            case -2053478804:
                if ((key.equals("StatusType") ? '^' : 'a') != '^') {
                    c = 65535;
                    break;
                }
                c = 0;
                break;
            case -1854235203:
                c = 65535;
                if (key.equals("Rating")) {
                    int i = A + 47;
                    u = i % Property.TYPE_ARRAY;
                    if (i % 2 == 0) {
                        c = 1;
                        break;
                    }
                    c = 0;
                    break;
                }
                break;
            case -1808614382:
                c = 65535;
                if (key.equals("Status")) {
                    A = (u + 29) % Property.TYPE_ARRAY;
                    c = 2;
                    break;
                }
                break;
            case -1679915457:
                c = 65535;
                if (key.equals("Comment")) {
                    c = 3;
                    break;
                }
                break;
            case -1238485368:
                if (key.equals("Transaksi")) {
                    c2 = 'I';
                }
                if (c2 == 'I') {
                    c = 4;
                    break;
                } else {
                    c = 65535;
                    break;
                }
            case -1091538172:
                c = 65535;
                if (key.equals("Ruangan")) {
                    int i2 = A + 73;
                    u = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 == 0) {
                        c = 5;
                        break;
                    }
                    c = 2;
                    break;
                }
                break;
            case 74230:
                c = 65535;
                if (key.equals("Jam")) {
                    c = 6;
                    break;
                }
                break;
            case 80988633:
                c = 65535;
                if (!(!key.equals("Token"))) {
                    u = (A + 61) % Property.TYPE_ARRAY;
                    c = 7;
                    break;
                }
                break;
            case 122683404:
                c = 65535;
                if (key.equals("Tanggal")) {
                    A = (u + 85) % Property.TYPE_ARRAY;
                    c = '\b';
                    break;
                }
                break;
            case 1260938190:
                if (key.equals("Nomor Referensi")) {
                    c = '\t';
                    break;
                } else {
                    c = 65535;
                    break;
                }
            case 1963638442:
                c = 65535;
                if (key.equals("Alasan")) {
                    c = '\n';
                    break;
                }
                break;
            case 2010750902:
                c = 65535;
                if ((key.equals("Cabang") ? 'F' : '$') != '$') {
                    c = 11;
                    break;
                }
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                String value = txnDataDetail.getValue();
                value.hashCode();
                if (value.equals("0")) {
                    try {
                        this.r = true;
                        this.llRating.setVisibility(0);
                        this.btnShare.setVisibility(0);
                        this.btnProses.setEnabled(true);
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    return;
                }
            case 1:
                this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                this.ratingBar.setClickable(false);
                this.ratingBar.setScrollable(false);
                return;
            case 2:
                this.tvStatus.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case 3:
                this.etKomentar.setText(txnDataDetail.getValue());
                this.etKomentar.setFocusable(false);
                this.etKomentar.setFocusableInTouchMode(false);
                this.etKomentar.setLongClickable(false);
                this.tilKomentar.setHintEnabled(true);
                return;
            case 4:
                try {
                    this.tvTransaksi.setText(Html.fromHtml(txnDataDetail.getValue()));
                    return;
                } catch (Exception e2) {
                    throw e2;
                }
            case 5:
                this.y = txnDataDetail.getValue();
                return;
            case 6:
                this.s = txnDataDetail.getValue();
                return;
            case 7:
                this.q = txnDataDetail.getValue();
                return;
            case '\b':
                this.x = txnDataDetail.getValue();
                return;
            case '\t':
                this.tvNoReferensi.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case '\n':
                this.etAlasan.setText(txnDataDetail.getValue());
                this.tilAlasan.setHintEnabled(true);
                return;
            case 11:
                this.n = txnDataDetail.getValue();
                return;
            default:
                return;
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (CC23BFormKartuKreditFragment.c) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) w.clone();
            CC23BFormKartuKreditFragment.e = 0;
            while (CC23BFormKartuKreditFragment.e < iArr.length) {
                cArr[0] = (char) ((char) (iArr[CC23BFormKartuKreditFragment.e] >> 16));
                cArr[1] = (char) ((char) iArr[CC23BFormKartuKreditFragment.e]);
                cArr[2] = (char) ((char) (iArr[CC23BFormKartuKreditFragment.e + 1] >> 16));
                cArr[3] = (char) ((char) iArr[CC23BFormKartuKreditFragment.e + 1]);
                CC23BFormKartuKreditFragment.d = (cArr[0] << 16) + cArr[1];
                CC23BFormKartuKreditFragment.b = (cArr[2] << 16) + cArr[3];
                CC23BFormKartuKreditFragment.d(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = CC23BFormKartuKreditFragment.d ^ iArr2[i2];
                    CC23BFormKartuKreditFragment.d = i3;
                    CC23BFormKartuKreditFragment.b = CC23BFormKartuKreditFragment.a(i3) ^ CC23BFormKartuKreditFragment.b;
                    int i4 = CC23BFormKartuKreditFragment.d;
                    CC23BFormKartuKreditFragment.d = CC23BFormKartuKreditFragment.b;
                    CC23BFormKartuKreditFragment.b = i4;
                }
                int i5 = CC23BFormKartuKreditFragment.d;
                CC23BFormKartuKreditFragment.d = CC23BFormKartuKreditFragment.b;
                CC23BFormKartuKreditFragment.b = i5;
                CC23BFormKartuKreditFragment.b = i5 ^ iArr2[16];
                CC23BFormKartuKreditFragment.d ^= iArr2[17];
                int i6 = CC23BFormKartuKreditFragment.d;
                int i7 = CC23BFormKartuKreditFragment.b;
                cArr[0] = (char) ((char) (CC23BFormKartuKreditFragment.d >>> 16));
                cArr[1] = (char) ((char) CC23BFormKartuKreditFragment.d);
                cArr[2] = (char) ((char) (CC23BFormKartuKreditFragment.b >>> 16));
                cArr[3] = (char) ((char) CC23BFormKartuKreditFragment.b);
                CC23BFormKartuKreditFragment.d(iArr2);
                cArr2[CC23BFormKartuKreditFragment.e << 1] = (char) cArr[0];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 1] = (char) cArr[1];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 2] = (char) cArr[2];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 3] = (char) cArr[3];
                CC23BFormKartuKreditFragment.e += 2;
            }
            str = new String(cArr2, 0, i);
        }
        objArr[0] = str;
    }

    private void y() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.t;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.q;
        this.p.d(loginasguest);
        try {
            int i = A + 115;
            u = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '\\' : 19) == '\\') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        u = (A + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        int i = u + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        A = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            try {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            } catch (Exception e) {
                throw e;
            }
        } else {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void i(String str) {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setEnabled(false);
        u = (A + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        A = (u + 37) % Property.TYPE_ARRAY;
        if (z) {
            int i = u + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
            A = i % Property.TYPE_ARRAY;
            int id = view.getId();
            if (i % 2 == 0) {
                Object[] objArr = null;
                int length = objArr.length;
                if ((id == 2131297031 ? '\n' : '>') != '\n') {
                    return;
                }
            } else {
                if ((id == 2131297031 ? 16 : 'I') == 'I') {
                    return;
                }
            }
            this.tilKomentar.setHintEnabled(true);
            return;
        }
        if ((view.getId() == 2131297031 ? (char) 27 : 22) == 27) {
            int i2 = u + setHasDecor$MediaBrowserCompat$MediaItem.aN;
            A = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                this.etKomentar.getText().toString().isEmpty();
                throw new NullPointerException();
            } else if (this.etKomentar.getText().toString().isEmpty()) {
                this.tilKomentar.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        try {
            x();
            try {
                boolean z = false;
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DetailBerhasilEChannelNotificationActivity.d(DetailBerhasilEChannelNotificationActivity.this);
                    }
                }).g();
                int i = A + 69;
                u = i % Property.TYPE_ARRAY;
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
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0207, code lost:
        if (r0 == false) goto L_0x0229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0226, code lost:
        if ((r4.y.equals("Reguler")) != true) goto L_0x0229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0229, code lost:
        com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A = (com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % io.realm.internal.Property.TYPE_ARRAY;
        r4.llRuangan.setVisibility(0);
        r4.tvJenisRuangan.setText(r4.y);
        com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u = (com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A + 5) % io.realm.internal.Property.TYPE_ARRAY;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onCreate(android.os.Bundle r5) {
        /*
        // Method dump skipped, instructions count: 836
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        try {
            int i = u + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
            A = i % Property.TYPE_ARRAY;
            boolean z = false;
            if (i % 2 == 0) {
                onDestroy();
                Call<OpenAccountSuccessActivity<Object>> call = this.p.a;
                throw new ArithmeticException("divide by zero");
            }
            onDestroy();
            RateTransactionPresenter rateTransactionPresenter = this.p;
            Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
            if (call2 != null) {
                z = true;
            }
            if (z) {
                A = (u + 47) % Property.TYPE_ARRAY;
                call2.cancel();
                rateTransactionPresenter = rateTransactionPresenter;
            }
            rateTransactionPresenter.e = null;
            int i2 = u + setHasDecor$MediaBrowserCompat$MediaItem.aM;
            A = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 == 0 ? '@' : 'Y') != 'Y') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if ((menuItem.getItemId() == 16908332 ? '0' : '>') != '0') {
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            u = (A + 85) % Property.TYPE_ARRAY;
            return onOptionsItemSelected;
        }
        int i = A + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        u = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? 11 : 'G';
        onBackPressed();
        return c != 11;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            int i2 = A + 69;
            u = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '\"' : 'O') != 'O') {
                onRequestPermissionsResult(i, strArr, iArr);
                try {
                    subscribeChooseUbahVisaCardEvent.d(this, i, iArr);
                    throw new NullPointerException();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                onRequestPermissionsResult(i, strArr, iArr);
                subscribeChooseUbahVisaCardEvent.d(this, i, iArr);
                A = (u + 1) % Property.TYPE_ARRAY;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        try {
            int i = A + 101;
            u = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                setCardSlogan.e().b = "DetailBerhasilEChannelNotificationActivity";
                this.j = "DetailBerhasilEChannelNotificationActivity";
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                setCardSlogan.e().b = "DetailBerhasilEChannelNotificationActivity";
                this.j = "DetailBerhasilEChannelNotificationActivity";
            }
            int i2 = u + 45;
            A = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 == 0 ? '[' : '8') == '[') {
                Object[] objArr2 = null;
                int length2 = objArr2.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
        if (r3.etKomentar.getText().toString().isEmpty() == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
        r5 = '\\';
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
        r5 = 'F';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
        if (r5 == 'F') goto L_0x00c5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
        r0 = com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u + 7;
        com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
        if ((r0 % 2) != 0) goto L_0x00a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820765);
        r3.tilKomentar.setBackgroundResource(2131230870);
        r3.etKomentar.requestFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c4, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (((o.pilihTipeTujuanTransaksiPenerima) r3.ratingBar).a <= 0.0f) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
        if (((o.pilihTipeTujuanTransaksiPenerima) r3.ratingBar).a <= 0.0f) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820982);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
        return;
     */
    @butterknife.OnClick({2131296440})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void proses(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A
            r1 = 105(0x69, float:1.47E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0037
            r0 = r3
            android.widget.TextView r0 = r0.tvErrorKomentar
            r1 = 122(0x7a, float:1.71E-43)
            r0.setVisibility(r1)
            r0 = r3
            o.LogoutDialog_ViewBinding r0 = r0.tilKomentar
            r1 = 2131230847(0x7f08007f, float:1.8077758E38)
            r0.setBackgroundResource(r1)
            r0 = r3
            o.onAcceptKetentuanOR r0 = r0.ratingBar
            float r0 = r0.a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0069
            goto L_0x0056
        L_0x0037:
            r0 = r3
            android.widget.TextView r0 = r0.tvErrorKomentar
            r1 = 8
            r0.setVisibility(r1)
            r0 = r3
            o.LogoutDialog_ViewBinding r0 = r0.tilKomentar
            r1 = 2131230847(0x7f08007f, float:1.8077758E38)
            r0.setBackgroundResource(r1)
            r0 = r3
            o.onAcceptKetentuanOR r0 = r0.ratingBar
            float r0 = r0.a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0069
        L_0x0056:
            r0 = r3
            android.widget.TextView r0 = r0.tvErrorKomentar
            r1 = 0
            r0.setVisibility(r1)
            r0 = r3
            android.widget.TextView r0 = r0.tvErrorKomentar
            r1 = 2131820982(0x7f1101b6, float:1.9274694E38)
            r0.setText(r1)
            return
        L_0x0069:
            r0 = r3
            o.LogoutDialog r0 = r0.etKomentar
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007f
            r0 = 92
            r5 = r0
            goto L_0x0082
        L_0x007f:
            r0 = 70
            r5 = r0
        L_0x0082:
            r0 = r5
            r1 = 70
            if (r0 == r1) goto L_0x00c5
            int r0 = com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u
            r1 = 7
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a0
        L_0x00a0:
            r0 = r3
            android.widget.TextView r0 = r0.tvErrorKomentar
            r1 = 0
            r0.setVisibility(r1)
            r0 = r3
            android.widget.TextView r0 = r0.tvErrorKomentar
            r1 = 2131820765(0x7f1100dd, float:1.9274254E38)
            r0.setText(r1)
            r0 = r3
            o.LogoutDialog_ViewBinding r0 = r0.tilKomentar
            r1 = 2131230870(0x7f080096, float:1.8077805E38)
            r0.setBackgroundResource(r1)
            r0 = r3
            o.LogoutDialog r0 = r0.etKomentar
            boolean r0 = r0.requestFocus()
            return
        L_0x00c5:
            r0 = r3
            r0.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.proses(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        A = (u + 9) % Property.TYPE_ARRAY;
        int i = A + 61;
        u = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '+' : ':') == ':') {
            return 2131492923;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            A = (u + 11) % Property.TYPE_ARRAY;
            int i = A + 75;
            u = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 14 : ':') != 14) {
                return this;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void s() {
        try {
            u = (A + 1) % Property.TYPE_ARRAY;
            c(a(this.llShare));
            A = (u + 27) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r5 != false) goto L_0x0049;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r5 != true) goto L_0x0049;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        o.subscribeChooseUbahVisaCardEvent.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u = (com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A + 91) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u     // Catch: Exception -> 0x0062
            r5 = r0
            r0 = r5
            r1 = 55
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A = r0     // Catch: Exception -> 0x0062
            r0 = 0
            r7 = r0
            r0 = 0
            r5 = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0037
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0034
            r7 = r0
            r0 = r7
            r1 = 84
            if (r0 < r1) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = 1
            r5 = r0
        L_0x002d:
            r0 = r5
            if (r0 == 0) goto L_0x005d
            goto L_0x0049
        L_0x0034:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0037:
            r0 = r7
            r5 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0044
            r0 = 1
            r5 = r0
        L_0x0044:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x005d
        L_0x0049:
            r0 = r3
            o.subscribeChooseUbahVisaCardEvent.e(r0)     // Catch: Exception -> 0x0062
            int r0 = com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.A     // Catch: Exception -> 0x0062
            r1 = 91
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.u = r0
            return
        L_0x005d:
            r0 = r3
            r0.s()
            return
        L_0x0062:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        try {
            u = (A + 99) % Property.TYPE_ARRAY;
            z();
            u = (A + 77) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }
}
