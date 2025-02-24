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
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23CFormKartuKreditFragment;
import o.InfoDocumentUnderlyingActivity;
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
import o.onCLickedBelum;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTellerActivity.class */
public class DetailBerhasilTellerActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static long E;
    private static int F;
    private static int G;
    private String B;
    private String C;
    private String D;
    private ViewAnimator H;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296448)
    Button btnShare;
    @BindView(2131296945)
    LogoutDialog etAlasan;
    @BindView(2131297031)
    LogoutDialog etKomentar;
    @BindView(2131297548)
    LinearLayout llBerita;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297856)
    LinearLayout llNamaPengirim;
    @BindView(2131297847)
    LinearLayout llPemilikSumberDana;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297875)
    LinearLayout llRuangan;
    @BindView(2131297887)
    LinearLayout llShare;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private DetailTransactionPresenter s;
    private String t;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822262)
    String toolbarTitle;
    @BindView(2131297559)
    LinearLayout trCabang;
    @BindView(2131298847)
    TextView tvBerita;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299427)
    TextView tvNamaPenerima;
    @BindView(2131299434)
    TextView tvNamaPengirim;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299485)
    TextView tvNominal;
    @BindView(2131299515)
    TextView tvPemilikSumberDana;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299689)
    TextView tvTransaksi;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private RateTransactionPresenter v;
    private String w;
    private String x;
    private String y;
    private setMessage f = new setMessage();
    private boolean r = false;
    private String A = "";
    private String q = "";
    private String p = "IDR";
    private String z = "";
    private String n = "";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(DetailTransactionResponse.TxnDataDetail txnDataDetail) {
        char c;
        G = (F + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        String key = txnDataDetail.getKey();
        key.hashCode();
        char c2 = 'x';
        switch (key.hashCode()) {
            case -2053478804:
                if (key.equals("StatusType")) {
                    F = (G + 63) % Property.TYPE_ARRAY;
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1854235203:
                if (key.equals("Rating")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1808614382:
                if (key.equals("Status")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1679915457:
                if (!(!key.equals("Comment"))) {
                    F = (G + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1238485368:
                if (key.equals("Transaksi")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1091538172:
                if (key.equals("Ruangan")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -507420484:
                if (!(!key.equals("Nominal"))) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 74230:
                if (key.equals("Jam")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 80988633:
                if (key.equals("Token")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 122683404:
                if (key.equals("Tanggal")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 380447383:
                if ((key.equals("Penerima") ? '[' : '6') == '[') {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 382034843:
                if (key.equals("Pengirim")) {
                    int i = G + 53;
                    F = i % Property.TYPE_ARRAY;
                    if (i % 2 == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 1260938190:
                if (key.equals("Nomor Referensi")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 1472427529:
                if (key.equals("Pemilik Sumber Dana")) {
                    int i2 = F + 65;
                    G = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 != 0) {
                        c2 = '\r';
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 1950516649:
                if (key.equals("Kode Mata Uang")) {
                    int i3 = G + 21;
                    F = i3 % Property.TYPE_ARRAY;
                    if (i3 % 2 == 0) {
                        c2 = 14;
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 1963638442:
                if (key.equals("Alasan")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 1986300359:
                if (key.equals("Berita")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 2010750902:
                if (key.equals("Cabang")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                String value = txnDataDetail.getValue();
                value.hashCode();
                switch (value.hashCode()) {
                    case 48:
                        c = 65535;
                        if (value.equals("0")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 49:
                        c = 65535;
                        if (value.equals("1")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 50:
                        if (value.equals("2")) {
                            c = 2;
                            break;
                        } else {
                            c = 65535;
                            break;
                        }
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    this.r = true;
                    if (!(!this.w.equals("N"))) {
                        this.llRating.setVisibility(0);
                        this.btnShare.setVisibility(0);
                        this.btnProses.setEnabled(true);
                        return;
                    }
                    this.btnProses.setEnabled(false);
                    return;
                } else if (c == 1) {
                    this.trCabang.setVisibility(8);
                    this.llRating.setVisibility(8);
                    this.btnShare.setVisibility(8);
                    this.llBerita.setVisibility(8);
                    return;
                } else if (c == 2) {
                    this.trCabang.setVisibility(8);
                    this.llRating.setVisibility(8);
                    this.btnShare.setVisibility(8);
                    this.llBerita.setVisibility(8);
                    this.tilAlasan.setVisibility(0);
                    return;
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
                this.tvTransaksi.setText(Html.fromHtml(txnDataDetail.getValue()));
                this.z = txnDataDetail.getValue();
                return;
            case 5:
                this.A = txnDataDetail.getValue();
                return;
            case 6:
                this.B = txnDataDetail.getValue();
                return;
            case 7:
                this.t = txnDataDetail.getValue();
                return;
            case '\b':
                this.y = txnDataDetail.getValue();
                return;
            case '\t':
                this.C = txnDataDetail.getValue();
                return;
            case '\n':
                this.tvNamaPenerima.setText(txnDataDetail.getValue());
                return;
            case 11:
                this.tvNamaPengirim.setText(txnDataDetail.getValue());
                return;
            case '\f':
                this.tvNoReferensi.setText(Html.fromHtml(txnDataDetail.getValue()));
                G = (F + 9) % Property.TYPE_ARRAY;
                return;
            case '\r':
                if (txnDataDetail.getValue() != null && !txnDataDetail.getValue().isEmpty()) {
                    try {
                        try {
                            this.llPemilikSumberDana.setVisibility(0);
                            this.tvPemilikSumberDana.setText(txnDataDetail.getValue());
                            return;
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    return;
                }
            case 14:
                this.p = txnDataDetail.getValue();
                return;
            case 15:
                this.etAlasan.setText(txnDataDetail.getValue());
                this.tilAlasan.setHintEnabled(true);
                return;
            case 16:
                String value2 = txnDataDetail.getValue();
                this.n = value2;
                this.tvBerita.setText(value2);
                return;
            case 17:
                this.q = txnDataDetail.getValue();
                return;
            default:
                return;
        }
    }

    private static Bitmap b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        try {
            int i = G + 93;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                return createBitmap;
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ void b(DetailBerhasilTellerActivity detailBerhasilTellerActivity) {
        G = (F + 53) % Property.TYPE_ARRAY;
        detailBerhasilTellerActivity.u();
        try {
            int i = F + 73;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 11 : 'Y') == 11) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void c(LogRedirector.Logger logger) {
        G = (F + 101) % Property.TYPE_ARRAY;
        logger.a();
        F = (G + 39) % Property.TYPE_ARRAY;
    }

    private static void c(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment.b) {
            char[] b = CC23CFormKartuKreditFragment.b(E, cArr, i);
            CC23CFormKartuKreditFragment.a = 4;
            while (CC23CFormKartuKreditFragment.a < b.length) {
                CC23CFormKartuKreditFragment.d = CC23CFormKartuKreditFragment.a - 4;
                b[CC23CFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (b[CC23CFormKartuKreditFragment.a] ^ b[CC23CFormKartuKreditFragment.a % 4])) ^ (((long) CC23CFormKartuKreditFragment.d) * E))));
                CC23CFormKartuKreditFragment.a++;
            }
            str = new String(b, 4, b.length - 4);
        }
        objArr[0] = str;
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 'J' : 4) != 4) {
            int i = F + 93;
            G = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                uri = getPromotion.c(this, bitmap, obj);
                String path = uri.getPath();
                String[] strArr = new String[0];
                strArr[1] = "image/jpeg";
                MediaScannerConnection.scanFile(this, new String[]{path}, strArr, null);
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
                int i2 = F + 51;
                G = i2 % Property.TYPE_ARRAY;
                if (!(i2 % 2 != 0)) {
                    file2.delete();
                    throw new ArithmeticException("divide by zero");
                } else {
                    file2.delete();
                    G = (F + 9) % Property.TYPE_ARRAY;
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
            c(new char[]{48705, 48674, 25527, 55546, 28545, 32057, 58709, 13068, 50599, 59199, 23666, 60165, 18746, 26813, 53758, 24789, 52409, 60470, 21865, 64578, 20543, 29099, 52975, 31121, 55205, 62782, 17004, 62797, 23344, 32420, 51178, 29381}, getPackageName().codePointAt(17) - 98, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.x;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.y;
        this.v.d(loginasguest);
        G = (F + 9) % Property.TYPE_ARRAY;
    }

    private void v() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        try {
            infoDocumentUnderlyingActivity.e = this.x;
            infoDocumentUnderlyingActivity.d = "SUKSES";
            infoDocumentUnderlyingActivity.b = this.u;
            infoDocumentUnderlyingActivity.a = this.D;
            this.s.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
            F = (G + 89) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        try {
            F = (G + 53) % Property.TYPE_ARRAY;
            try {
                this.tvErrorMessage.setText(str);
                this.H.setDisplayedChild(1);
                G = (F + 21) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:73|2|(3:6|3|4)|79|7|(1:9)(1:10)|11|(10:13|(1:15)(1:16)|17|(1:21)|22|(1:24)(1:25)|26|(6:28|75|29|30|31|32)|33|(2:37|(1:39)(1:40)))|44|(4:46|(1:48)(1:49)|50|(2:52|(6:57|58|77|63|66|67))(4:54|71|55|56))|62|77|63|66|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
        r0 = r4.tvWaktu;
        r0 = new java.lang.StringBuilder();
        r0.append(r4.C);
        r0.append(", ");
        r0.append(r4.t);
        r0.append(" WIB");
        r0.setText(r0.toString());
     */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a_(java.util.List<com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail> r5) {
        /*
        // Method dump skipped, instructions count: 655
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerActivity.a_(java.util.List):void");
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
            int i = G + 51;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b_(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("imei", this.m.getImei());
            bundle.putString("email", this.m.getEmail());
            bundle.putString("message", str);
            AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
            autoLogoutDialog.setArguments(bundle);
            autoLogoutDialog.show(l(), "AutoLogoutDialog");
            int i = G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
            F = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
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
        int i = G + 51;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.H = (ViewAnimator) findViewById(2131299751);
        this.s = new DetailTransactionPresenter();
        this.v = new RateTransactionPresenter();
        this.s.e = this;
        this.v.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        Bundle extras = getIntent().getExtras();
        this.x = extras.getString("no_reff", "");
        this.u = extras.getString("token", "");
        this.w = extras.getString("flag_rating", "");
        this.D = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a8: INVOKE  
              (wrap: o.LogoutDialog : 0x009e: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilTellerActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilTellerActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00a5: CONSTRUCTOR  (r1v21 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilTellerActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTellerActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
            this = this;
            r0 = r5
            r1 = r6
            r0.d(r1)
            r0 = r5
            r1 = r5
            r2 = 2131299751(0x7f090da7, float:1.8217512E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ViewAnimator r1 = (android.widget.ViewAnimator) r1
            r0.H = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r1 = new com.bca.smartbranch.presenter.DetailTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.s = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r1 = new com.bca.smartbranch.presenter.RateTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.v = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r0 = r0.s
            r1 = r5
            r0.e = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r0 = r0.v
            r1 = r5
            r0.e = r1
            r0 = r5
            r1 = r5
            o.setInputType r1 = r1.toolbar
            r0.b(r1)
            r0 = r5
            o.setBackgroundResource r0 = r0.i()
            r0 = r5
            o.setBackgroundResource r0 = r0.i()
            r1 = 1
            r0.d(r1)
            r0 = r5
            o.setBackgroundResource r0 = r0.i()
            java.lang.String r1 = ""
            r0.d(r1)
            r0 = r5
            android.widget.TextView r0 = r0.txtToolbarTitle
            java.lang.String r1 = "Bukti Transaksi"
            r0.setText(r1)
            r0 = r5
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.String r2 = "no_reff"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.x = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "token"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.u = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "flag_rating"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.w = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "TYPE"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.D = r1
            r0 = r5
            o.LogoutDialog r0 = r0.etKomentar
            o.getPromotion$3 r1 = new o.getPromotion$3
            r2 = r1
            r2.<init>()
            r0.addTextChangedListener(r1)
            r0 = r5
            o.LogoutDialog r0 = r0.etKomentar
            o.getPromotion$4 r1 = new o.getPromotion$4
            r2 = r1
            r2.<init>()
            r0.setOnTouchListener(r1)
            r0 = r5
            r0.v()
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerActivity.F
            r1 = 3
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerActivity.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        int i;
        ViewAnimator viewAnimator;
        try {
            int i2 = F + 97;
            try {
                G = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? '8' : ')') != ')') {
                    this.tvErrorMessage.setText(str);
                    viewAnimator = this.H;
                    i = 0;
                } else {
                    this.tvErrorMessage.setText(str);
                    viewAnimator = this.H;
                    i = 1;
                }
                viewAnimator.setDisplayedChild(i);
                G = (F + 57) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        int i = F + 69;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 29 : 15) != 15) {
            try {
                this.tvErrorMessage.setText(str);
                this.H.setDisplayedChild(1);
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.tvErrorMessage.setText(str);
            this.H.setDisplayedChild(1);
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        int i = G + 79;
        F = i % Property.TYPE_ARRAY;
        boolean z = false;
        if (!(i % 2 != 0)) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        } else {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = G + 77;
        F = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            z = true;
        }
        if (!z) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        int i = F + 29;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
        }
        this.H.setDisplayedChild(0);
        F = (G + 15) % Property.TYPE_ARRAY;
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
        G = (F + 27) % Property.TYPE_ARRAY;
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        G = (F + 1) % Property.TYPE_ARRAY;
        char c = '!';
        if (z) {
            if ((view.getId() == 2131297031 ? (char) '\n' : '\t') == '\n') {
                this.tilKomentar.setHintEnabled(true);
                return;
            }
        } else if (view.getId() == 2131297031) {
            int i = G + 75;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 22 : '!') != '!') {
                this.etKomentar.getText().toString().isEmpty();
                throw new ArithmeticException("divide by zero");
            } else if (this.etKomentar.getText().toString().isEmpty()) {
                F = (G + 97) % Property.TYPE_ARRAY;
                this.tilKomentar.setHintEnabled(false);
            }
        }
        int i2 = G + 51;
        F = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            c = 'X';
        }
        if (c != 'X') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        boolean z = false;
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilTellerActivity.b(DetailBerhasilTellerActivity.this);
            }
        }).g();
        int i = G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = F + 3;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 2 : '^') != 2) {
            onDestroy();
            DetailTransactionPresenter detailTransactionPresenter = this.s;
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
            if ((call != null ? '`' : 24) == '`') {
                int i2 = G + 33;
                F = i2 % Property.TYPE_ARRAY;
                call.cancel();
                detailTransactionPresenter = detailTransactionPresenter;
                if (i2 % 2 != 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    detailTransactionPresenter = detailTransactionPresenter;
                }
            }
            detailTransactionPresenter.e = null;
            RateTransactionPresenter rateTransactionPresenter = this.v;
            Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
            if (call2 != null) {
                call2.cancel();
            }
            try {
                rateTransactionPresenter.e = null;
                G = (F + 21) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            onDestroy();
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call3 = this.s.c;
            throw new NullPointerException();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        G = (F + 11) % Property.TYPE_ARRAY;
        if ((menuItem.getItemId() == 16908332 ? (char) 5 : 4) == 4) {
            return onOptionsItemSelected(menuItem);
        }
        G = (F + 115) % Property.TYPE_ARRAY;
        onBackPressed();
        int i = F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '9' : ' ') == ' ') {
            return true;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        F = (G + 35) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        onCLickedBelum.e(this, i, iArr);
        int i2 = G + 61;
        F = i2 % Property.TYPE_ARRAY;
        if (!(i2 % 2 == 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = F + 71;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '?' : 'V') != 'V') {
            try {
                setCardSlogan.e().b = "DetailBerhasilTellerActivity";
                this.j = "DetailBerhasilTellerActivity";
                throw new ArithmeticException("divide by zero");
            } catch (Exception e) {
                throw e;
            }
        } else {
            setCardSlogan.e().b = "DetailBerhasilTellerActivity";
            this.j = "DetailBerhasilTellerActivity";
            int i2 = F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
            G = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 == 0 ? ')' : 27) != 27) {
                throw new ArithmeticException("divide by zero");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        if ((((o.pilihTipeTujuanTransaksiPenerima) r3.ratingBar).a <= 0.0f ? 27 : 'U') != 27) goto L_0x0072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (r3.etKomentar.getText().toString().isEmpty() == false) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820765);
        r3.tilKomentar.setBackgroundResource(2131230870);
        r3.etKomentar.requestFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
        u();
        r0 = com.bca.smartbranch.activity.DetailBerhasilTellerActivity.G + 15;
        com.bca.smartbranch.activity.DetailBerhasilTellerActivity.F = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
        if ((r0 % 2) == 0) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
        if (r5 == false) goto L_0x00cc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820982);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        if ((((o.pilihTipeTujuanTransaksiPenerima) r3.ratingBar).a > 0.0f) != false) goto L_0x0072;
     */
    @butterknife.OnClick({2131296440})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void proses(android.view.View r4) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerActivity.proses(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = G + 27;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '2' : '%') == '%') {
            return 2131492928;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = G + 51;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'E' : '7') != '7') {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = G + 99;
        F = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            return this;
        }
        throw new ArithmeticException("divide by zero");
    }

    @OnClick({2131296446})
    public void retry(View view) {
        try {
            F = (G + 53) % Property.TYPE_ARRAY;
            v();
            G = (F + 75) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 56 ? '\r' : '?') != '?') goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 33 ? ';' : '\f') != ';') goto L_0x0051;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        o.onCLickedBelum.c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        y();
        com.bca.smartbranch.activity.DetailBerhasilTellerActivity.G = (com.bca.smartbranch.activity.DetailBerhasilTellerActivity.F + 21) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerActivity.F
            r1 = 93
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerActivity.G = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r5 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r5 = r0
        L_0x001c:
            r0 = r5
            if (r0 == 0) goto L_0x003a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 56
            if (r0 < r1) goto L_0x002e
            r0 = 13
            r5 = r0
            goto L_0x0031
        L_0x002e:
            r0 = 63
            r5 = r0
        L_0x0031:
            r0 = r5
            r1 = 63
            if (r0 == r1) goto L_0x0051
            goto L_0x0056
        L_0x003a:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x006a
            r1 = 33
            if (r0 < r1) goto L_0x0048
            r0 = 59
            r5 = r0
            goto L_0x004b
        L_0x0048:
            r0 = 12
            r5 = r0
        L_0x004b:
            r0 = r5
            r1 = 59
            if (r0 == r1) goto L_0x0056
        L_0x0051:
            r0 = r3
            o.onCLickedBelum.c(r0)     // Catch: Exception -> 0x006a
            return
        L_0x0056:
            r0 = r3
            r0.y()
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerActivity.F
            r1 = 21
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerActivity.G = r0
            return
        L_0x006a:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        G = (F + 5) % Property.TYPE_ARRAY;
        z();
        try {
            int i = F + 87;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 0 : '@') != '@') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void y() {
        G = (F + 69) % Property.TYPE_ARRAY;
        d(b(this.llShare));
        int i = G + 47;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '>' : 'M') != 'M') {
            throw new NullPointerException();
        }
    }
}
