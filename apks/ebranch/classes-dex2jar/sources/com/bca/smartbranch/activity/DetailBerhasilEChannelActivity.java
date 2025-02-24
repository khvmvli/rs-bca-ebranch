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
import o.CC22SubBCACardInfoActivity_ViewBinding;
import o.InfoDocumentUnderlyingActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
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
import o.subscribeChooseSubMastercardVisaEvent;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilEChannelActivity.class */
public class DetailBerhasilEChannelActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static char B;
    private static char C;
    private static int E;
    private static char G;
    private static int I;
    private static char z;
    private ViewAnimator A;
    private String D;
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
    private String p;
    private DetailTransactionPresenter q;
    private String r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private boolean s;
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
    private RateTransactionPresenter u;
    private String v;
    private String w;
    private String x;
    private String y;

    public DetailBerhasilEChannelActivity() {
        try {
            this.f = new setMessage();
            this.s = false;
            this.w = "";
            this.n = "";
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(DetailTransactionResponse.TxnDataDetail txnDataDetail) {
        char c;
        char c2;
        String key = txnDataDetail.getKey();
        key.hashCode();
        try {
            switch (key.hashCode()) {
                case -2053478804:
                    if (key.equals("StatusType")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1854235203:
                    try {
                        if (key.equals("Rating")) {
                            E = (I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    } catch (Exception e) {
                        throw e;
                    }
                case -1808614382:
                    if ((key.equals("Status") ? '=' : 'V') == '=') {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1679915457:
                    if (key.equals("Comment")) {
                        E = (I + 27) % Property.TYPE_ARRAY;
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1238485368:
                    if (key.equals("Transaksi")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1091538172:
                    if (key.equals("Ruangan")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 74230:
                    if (key.equals("Jam")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 80988633:
                    if ((key.equals("Token") ? '/' : '>') == '/') {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 122683404:
                    if (key.equals("Tanggal")) {
                        E = (I + 69) % Property.TYPE_ARRAY;
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1260938190:
                    if ((key.equals("Nomor Referensi") ? '_' : 1) != 1) {
                        int i = I + 63;
                        E = i % Property.TYPE_ARRAY;
                        if (i % 2 != 0) {
                            c = '\t';
                            break;
                        } else {
                            c = 28;
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case 1963638442:
                    if (key.equals("Alasan")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2010750902:
                    if (key.equals("Cabang")) {
                        E = (I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String value = txnDataDetail.getValue();
                    value.hashCode();
                    switch (value.hashCode()) {
                        case 48:
                            c2 = 65535;
                            if (!(!value.equals("0"))) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 49:
                            if (!(!value.equals("1"))) {
                                c2 = 1;
                                break;
                            } else {
                                c2 = 65535;
                                break;
                            }
                        case 50:
                            if (value.equals("2")) {
                                c2 = 2;
                                break;
                            } else {
                                c2 = 65535;
                                break;
                            }
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        this.s = true;
                        if (this.r.equals("N")) {
                            I = (E + 83) % Property.TYPE_ARRAY;
                            this.llRating.setVisibility(0);
                            this.btnShare.setVisibility(0);
                            this.btnProses.setEnabled(true);
                        } else {
                            this.btnProses.setEnabled(false);
                        }
                        this.llRating.setVisibility(0);
                        I = (E + 53) % Property.TYPE_ARRAY;
                        return;
                    } else if (c2 == 1) {
                        this.trCabang.setVisibility(8);
                        this.llRating.setVisibility(8);
                        this.btnShare.setVisibility(8);
                        return;
                    } else if (c2 == 2) {
                        this.trCabang.setVisibility(8);
                        this.llRating.setVisibility(8);
                        this.btnShare.setVisibility(8);
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
                    return;
                case 5:
                    this.w = txnDataDetail.getValue();
                    return;
                case 6:
                    this.t = txnDataDetail.getValue();
                    return;
                case 7:
                    this.x = txnDataDetail.getValue();
                    return;
                case '\b':
                    this.v = txnDataDetail.getValue();
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
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ void c(DetailBerhasilEChannelActivity detailBerhasilEChannelActivity) {
        int i = I + 9;
        E = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            detailBerhasilEChannelActivity.u();
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            detailBerhasilEChannelActivity.u();
        }
        I = (E + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
    }

    private static void c(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (subscribeChooseSubMastercardVisaEvent.d) {
            char[] cArr2 = new char[cArr.length];
            subscribeChooseSubMastercardVisaEvent.b = 0;
            char[] cArr3 = new char[2];
            while (subscribeChooseSubMastercardVisaEvent.b < cArr.length) {
                cArr3[0] = (char) cArr[subscribeChooseSubMastercardVisaEvent.b];
                cArr3[1] = (char) cArr[subscribeChooseSubMastercardVisaEvent.b + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) ((char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + C)) ^ ((cArr3[0] >>> 5) + G))));
                    cArr3[0] = (char) ((char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + B)) ^ ((cArr3[1] >>> 5) + z))));
                    i2 -= 40503;
                }
                cArr2[subscribeChooseSubMastercardVisaEvent.b] = (char) cArr3[0];
                cArr2[subscribeChooseSubMastercardVisaEvent.b + 1] = (char) cArr3[1];
                subscribeChooseSubMastercardVisaEvent.b += 2;
            }
            str = new String(cArr2, 0, i);
        }
        objArr[0] = str;
    }

    private static Bitmap d(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = I + 21;
        E = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            return createBitmap;
        }
        throw new NullPointerException();
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z2 = false;
        if ((Build.VERSION.SDK_INT >= 29 ? 'U' : '$') != 'U') {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (!(!file2.exists())) {
                int i = E + 61;
                I = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    file2.delete();
                    throw new ArithmeticException("divide by zero");
                }
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
            c(new char[]{55834, 49609, 15495, 54706, 4323, 12775, 11696, 14052, 36479, 45488, 42208, 38193, 54587, 39155, 24596, 17165, 60833, 47140, 44532, 46880, 53110, 61374, 20222, 7960, 50639, 47872, 22297, 10834}, getResources().getString(2131822451).substring(0, 4).length() + 24, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            I = (E + 101) % Property.TYPE_ARRAY;
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        int i2 = E + 31;
        I = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            z2 = true;
        }
        if (!z2) {
            Object[] objArr2 = null;
            int length = objArr2.length;
        }
    }

    public static void e(LogRedirector.Logger logger) {
        I = (E + 9) % Property.TYPE_ARRAY;
        logger.a();
        E = (I + 57) % Property.TYPE_ARRAY;
    }

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.p;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.x;
        this.u.d(loginasguest);
        int i = E + 93;
        I = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            throw new NullPointerException();
        }
    }

    private void v() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.p;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.y;
        infoDocumentUnderlyingActivity.a = this.D;
        this.q.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        int i = I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        E = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        try {
            I = (E + 69) % Property.TYPE_ARRAY;
            this.tvErrorMessage.setText(str);
            this.A.setDisplayedChild(1);
            try {
                I = (E + 73) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if ((r0) != true) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r4.w.isEmpty() == false) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (r4.w.equals("Reguler") != false) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
        r7 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        r7 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r7 == '?') goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
        r4.llRuangan.setVisibility(0);
        r4.tvJenisRuangan.setText(r4.w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r4.n.isEmpty() != false) goto L_0x00e4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
        com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.I = (com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.E + 49) % io.realm.internal.Property.TYPE_ARRAY;
        r4.trCabang.setVisibility(0);
        r4.tvCabang.setText(android.text.Html.fromHtml(r4.n));
     */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a_(java.util.List<com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail> r5) {
        /*
        // Method dump skipped, instructions count: 405
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.a_(java.util.List):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("imei", this.m.getImei());
                bundle.putString("email", this.m.getEmail());
                bundle.putString("message", str);
                bundle.putBoolean("is_multiple_login", true);
                AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
                autoLogoutDialog.setArguments(bundle);
                autoLogoutDialog.show(l(), "AutoLogoutDialog");
                I = (E + 35) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
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
        E = (I + 51) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            int i = E + 111;
            try {
                I = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
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
    public final void d(Bundle bundle) {
        d(bundle);
        this.A = (ViewAnimator) findViewById(2131299751);
        this.q = new DetailTransactionPresenter();
        this.u = new RateTransactionPresenter();
        this.q.e = this;
        this.u.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        Bundle extras = getIntent().getExtras();
        this.p = extras.getString("no_reff", "");
        this.y = extras.getString("token", "");
        this.r = extras.getString("flag_rating", "");
        this.D = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: INVOKE  
              (wrap: o.LogoutDialog : 0x00a2: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilEChannelActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00a9: CONSTRUCTOR  (r1v23 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilEChannelActivity.class
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
            r0.A = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r1 = new com.bca.smartbranch.presenter.DetailTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.q = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r1 = new com.bca.smartbranch.presenter.RateTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.u = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r0 = r0.q
            r1 = r5
            r0.e = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r0 = r0.u
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
            r1 = r5
            java.lang.String r1 = r1.toolbarTitle
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
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
            r0.p = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "token"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.y = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "flag_rating"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.r = r1
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
            int r0 = com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.E
            r1 = 3
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        E = (I + 67) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.A.setDisplayedChild(1);
        try {
            int i = I + 77;
            try {
                E = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '5' : 25) != 25) {
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

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        I = (E + 79) % Property.TYPE_ARRAY;
        try {
            this.tvErrorMessage.setText(str);
            this.A.setDisplayedChild(1);
            int i = E + 33;
            I = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '`' : '\"') != '\"') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        try {
            int i = E + 3;
            I = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '>' : 'a') != '>') {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
                int i2 = E + 35;
                I = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 != 0 ? 11 : '+') == 11) {
                    throw new ArithmeticException("divide by zero");
                }
                return;
            }
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        ViewAnimator viewAnimator;
        int i;
        int i2 = I + 59;
        E = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? ':' : '>') != ':') {
            viewAnimator = this.A;
            i = 0;
        } else {
            viewAnimator = this.A;
            i = 1;
        }
        viewAnimator.setDisplayedChild(i);
        I = (E + 15) % Property.TYPE_ARRAY;
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
        boolean z2 = false;
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setEnabled(false);
        int i = I + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        E = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            z2 = true;
        }
        if (z2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z2) {
        int i = I + 49;
        E = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'R' : '%') != '%') {
            throw new ArithmeticException("divide by zero");
        } else if (z2) {
            if ((view.getId() == 2131297031 ? 'V' : 31) != 31) {
                int i2 = E + 59;
                I = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    this.tilKomentar.setHintEnabled(false);
                } else {
                    this.tilKomentar.setHintEnabled(true);
                }
            }
        } else {
            if ((view.getId() == 2131297031 ? 31 : '\"') == 31 && this.etKomentar.getText().toString().isEmpty()) {
                E = (I + 1) % Property.TYPE_ARRAY;
                this.tilKomentar.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilEChannelActivity.c(DetailBerhasilEChannelActivity.this);
            }
        }).g();
        int i = I + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        E = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'B' : '\"') == 'B') {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r4 != false) goto L_0x006d;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onDestroy() {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilEChannelActivity.onDestroy():void");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        I = (E + 81) % Property.TYPE_ARRAY;
        if ((menuItem.getItemId() == 16908332 ? 'Q' : '4') != 'Q') {
            return onOptionsItemSelected(menuItem);
        }
        int i = E + 37;
        I = i % Property.TYPE_ARRAY;
        boolean z2 = true;
        boolean z3 = i % 2 != 0;
        onBackPressed();
        if (z3) {
            z2 = false;
        }
        return z2;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        I = (E + 5) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        CC22SubBCACardInfoActivity_ViewBinding.a(this, i, iArr);
        I = (E + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        char c = '7';
        int i = E + 55;
        I = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            c = 'Y';
        }
        if (c != 'Y') {
            setCardSlogan.e().b = "DetailBerhasilEChannelActivity";
            this.j = "DetailBerhasilEChannelActivity";
            E = (I + 69) % Property.TYPE_ARRAY;
            return;
        }
        try {
            setCardSlogan.e().b = "DetailBerhasilEChannelActivity";
            this.j = "DetailBerhasilEChannelActivity";
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296440})
    public void proses(View view) {
        E = (I + 73) % Property.TYPE_ARRAY;
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a > 0.0f) {
            if ((this.etKomentar.getText().toString().isEmpty() ? 'E' : ']') != ']') {
                int i = E + 13;
                I = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? ' ' : '\b') != '\b') {
                    this.tvErrorKomentar.setVisibility(1);
                } else {
                    this.tvErrorKomentar.setVisibility(0);
                }
                this.tvErrorKomentar.setText(2131820765);
                this.tilKomentar.setBackgroundResource(2131230870);
                this.etKomentar.requestFocus();
                return;
            }
            u();
            return;
        }
        this.tvErrorKomentar.setVisibility(0);
        this.tvErrorKomentar.setText(2131820982);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = E + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? (char) '\t' : 4) == 4) {
            return 2131492923;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        E = (I + 43) % Property.TYPE_ARRAY;
        int i = E + 27;
        I = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return this;
        }
        throw new NullPointerException();
    }

    @OnClick({2131296446})
    public void retry(View view) {
        int i = E + 43;
        I = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? (char) 16 : 4;
        v();
        if (c != 4) {
            throw new NullPointerException();
        }
    }

    @OnClick({2131296448})
    public void share(View view) {
        I = (E + 99) % Property.TYPE_ARRAY;
        if (!(Build.VERSION.SDK_INT < 33)) {
            y();
            return;
        }
        CC22SubBCACardInfoActivity_ViewBinding.a(this);
        try {
            int i = I + 31;
            E = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        try {
            int i = I + 49;
            E = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '!' : 5) != 5) {
                try {
                    z();
                    throw new ArithmeticException("divide by zero");
                } catch (Exception e) {
                    throw e;
                }
            } else {
                z();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void y() {
        E = (I + 61) % Property.TYPE_ARRAY;
        d(d(this.llShare));
        I = (E + 99) % Property.TYPE_ARRAY;
    }
}
