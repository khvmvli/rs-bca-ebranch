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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC24SubVisaInfoActivity;
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
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.subscribeChooseSubMastercardVisaEvent;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTarikanActivity.class */
public class DetailBerhasilTarikanActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static char C;
    private static char E;
    private static int F;
    private static char G;
    private static int H;
    private static char I;
    private String A;
    private String D;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296448)
    Button btnShare;
    @BindView(2131296945)
    LogoutDialog etAlasan;
    @BindView(2131297031)
    LogoutDialog etKomentar;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297875)
    LinearLayout llRuangan;
    @BindView(2131297887)
    LinearLayout llShare;
    private String r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private String s;
    private DetailTransactionPresenter t;
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
    @BindView(2131299485)
    TextView tvNominal;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299689)
    TextView tvTransaksi;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private String v;
    private String w;
    private String x;
    private RateTransactionPresenter y;
    private ViewAnimator z;
    private setMessage f = new setMessage();
    private boolean q = false;
    private String B = "";
    private String n = "";
    private String p = "IDR";

    private void a(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT < 29) {
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
                H = (F + 81) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            c(new char[]{16850, 30461, 42912, 64296, 43030, 37844, 27672, 20964, 62827, 17166, 18405, 57306, 36674, 6883, 22032, 3330, 16095, 40654, 50353, 30926, 46141, 18225, 57300, 24750, 48279, 13673, 50893, 22567}, getResources().getString(2131822451).substring(0, 4).length() + 24, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
            H = (F + 31) % Property.TYPE_ARRAY;
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    public static void b(LogRedirector.Logger logger) {
        int i = H + 93;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'W' : '\f') != 'W') {
            logger.a();
            return;
        }
        try {
            logger.a();
            throw new ArithmeticException("divide by zero");
        } catch (Exception e) {
            throw e;
        }
    }

    private static Bitmap c(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        try {
            H = (F + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
            return createBitmap;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ void c(DetailBerhasilTarikanActivity detailBerhasilTarikanActivity) {
        int i = H + 25;
        F = i % Property.TYPE_ARRAY;
        boolean z = i % 2 != 0;
        detailBerhasilTarikanActivity.u();
        if (!z) {
            try {
                H = (F + 91) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new NullPointerException();
        }
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
                    cArr3[1] = (char) ((char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + G)) ^ ((cArr3[0] >>> 5) + I))));
                    cArr3[0] = (char) ((char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + C)) ^ ((cArr3[1] >>> 5) + E))));
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03d3, code lost:
        if ((r0.equals("1") ? 'C' : 28) != 28) goto L_0x03d6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a4, code lost:
        if (r0.equals("Ruangan") != false) goto L_0x01a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00a6, code lost:
        if (r0.equals("Cabang") != false) goto L_0x0212;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void d(com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail r4) {
        /*
        // Method dump skipped, instructions count: 1181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.d(com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail):void");
    }

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.v;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.w;
        this.y.d(loginasguest);
        int i = F + 21;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    private void v() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        try {
            try {
                infoDocumentUnderlyingActivity.e = this.v;
                infoDocumentUnderlyingActivity.d = "SUKSES";
                infoDocumentUnderlyingActivity.b = this.x;
                infoDocumentUnderlyingActivity.a = this.D;
                this.t.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
                F = (H + 93) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        ViewAnimator viewAnimator;
        int i;
        int i2 = H + 39;
        F = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? '^' : '.') != '^') {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.z;
            i = 1;
        } else {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.z;
            i = 0;
        }
        viewAnimator.setDisplayedChild(i);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        try {
            int i = H + 69;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                list.iterator();
                throw new NullPointerException();
            }
            for (DetailTransactionResponse.TxnDataDetail txnDataDetail : list) {
                d(txnDataDetail);
            }
            boolean z = false;
            if (this.q) {
                int i2 = H + 29;
                F = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    this.B.isEmpty();
                    throw new NullPointerException();
                }
                if (!this.B.isEmpty()) {
                    if (!this.B.equals("Reguler")) {
                        F = (H + 41) % Property.TYPE_ARRAY;
                        this.llRuangan.setVisibility(0);
                        this.tvJenisRuangan.setText(this.B);
                    }
                }
                if (!this.n.isEmpty()) {
                    this.trCabang.setVisibility(0);
                    this.tvCabang.setText(Html.fromHtml(this.n));
                }
            }
            TextView textView = this.tvNominal;
            StringBuilder sb = new StringBuilder();
            sb.append(getPromotion.i(this.u));
            sb.append(" ");
            sb.append(this.p);
            textView.setText(sb.toString());
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH.mm");
                Date parse = simpleDateFormat.parse(this.s);
                TextView textView2 = this.tvWaktu;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.A);
                sb2.append(", ");
                sb2.append(simpleDateFormat2.format(parse));
                sb2.append(" WIB");
                textView2.setText(sb2.toString());
            } catch (Exception e) {
                TextView textView3 = this.tvWaktu;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.A);
                sb3.append(", ");
                sb3.append(this.s);
                sb3.append(" WIB");
                textView3.setText(sb3.toString());
            }
            this.z.setDisplayedChild(2);
            int i3 = F + 25;
            H = i3 % Property.TYPE_ARRAY;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (z) {
                Object[] objArr = null;
                int length = objArr.length;
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
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
        H = (F + 49) % Property.TYPE_ARRAY;
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
        try {
            H = (F + 41) % Property.TYPE_ARRAY;
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
        int i = F + 41;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.z = (ViewAnimator) findViewById(2131299751);
        this.t = new DetailTransactionPresenter();
        this.y = new RateTransactionPresenter();
        this.t.e = this;
        this.y.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        Bundle extras = getIntent().getExtras();
        this.v = extras.getString("no_reff", "");
        this.x = extras.getString("token", "");
        this.r = extras.getString("flag_rating", "");
        this.D = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a8: INVOKE  
              (wrap: o.LogoutDialog : 0x009e: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilTarikanActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00a5: CONSTRUCTOR  (r1v21 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTarikanActivity.class
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
            r0.z = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r1 = new com.bca.smartbranch.presenter.DetailTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.t = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r1 = new com.bca.smartbranch.presenter.RateTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.y = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r0 = r0.t
            r1 = r5
            r0.e = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r0 = r0.y
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
            r0.v = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "token"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.x = r1
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
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.H
            r1 = 65
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        int i = F + 27;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
        }
        this.tvErrorMessage.setText(str);
        this.z.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        ViewAnimator viewAnimator;
        int i = F + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        H = i % Property.TYPE_ARRAY;
        try {
            if ((i % 2 == 0 ? (char) 3 : 11) != 3) {
                this.tvErrorMessage.setText(str);
                viewAnimator = this.z;
            } else {
                this.tvErrorMessage.setText(str);
                viewAnimator = this.z;
            }
            viewAnimator.setDisplayedChild(1);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        boolean z = true;
        int i = F + 1;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            z = false;
        }
        if (z) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        } else {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            Object[] objArr = null;
            int length = objArr.length;
        }
        H = (F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        try {
            try {
                F = (H + 73) % Property.TYPE_ARRAY;
                this.z.setDisplayedChild(0);
                H = (F + 45) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
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
        boolean z = false;
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setEnabled(false);
        int i = F + 113;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            z = true;
        }
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        H = (F + 93) % Property.TYPE_ARRAY;
        boolean z2 = false;
        if (z) {
            int i = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                int id = view.getId();
                Object[] objArr = null;
                int length = objArr.length;
                if (id != 2131297031) {
                    return;
                }
            } else {
                if (view.getId() == 2131297031) {
                    z2 = true;
                }
                if (!z2) {
                    return;
                }
            }
            this.tilKomentar.setHintEnabled(true);
            return;
        }
        if (view.getId() == 2131297031) {
            if (this.etKomentar.getText().toString().isEmpty()) {
                int i2 = H + 53;
                F = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    this.tilKomentar.setHintEnabled(true);
                } else {
                    this.tilKomentar.setHintEnabled(false);
                }
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilTarikanActivity.c(DetailBerhasilTarikanActivity.this);
            }
        }).g();
        int i = F + 85;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'W' : ' ') != ' ') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.t;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        boolean z = true;
        if (call != null) {
            H = (F + 87) % Property.TYPE_ARRAY;
            call.cancel();
        }
        detailTransactionPresenter.e = null;
        RateTransactionPresenter rateTransactionPresenter = this.y;
        Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
        if ((call2 != null ? 'K' : '3') != '3') {
            int i = H + 73;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z = false;
            }
            if (z) {
                try {
                    call2.cancel();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                call2.cancel();
                throw new ArithmeticException("divide by zero");
            }
        }
        rateTransactionPresenter.e = null;
        H = (F + 45) % Property.TYPE_ARRAY;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = F + 87;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            menuItem.getItemId();
            throw new NullPointerException();
        }
        if ((menuItem.getItemId() == 16908332 ? '$' : 16) != '$') {
            return onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        int i2 = F + 101;
        H = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? 23 : '`') != 23) {
            return true;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        H = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? '/' : '!') != '/') {
            onRequestPermissionsResult(i, strArr, iArr);
            CC24SubVisaInfoActivity.e(this, i, iArr);
            int i3 = F + setHasDecor$MediaBrowserCompat$MediaItem.aD;
            H = i3 % Property.TYPE_ARRAY;
            if ((i3 % 2 == 0 ? 27 : 'R') == 27) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        onRequestPermissionsResult(i, strArr, iArr);
        CC24SubVisaInfoActivity.e(this, i, iArr);
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = F + 41;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 25 : '\t') != 25) {
            setCardSlogan.e().b = "DetailBerhasilTarikanActivity";
            this.j = "DetailBerhasilTarikanActivity";
            return;
        }
        setCardSlogan.e().b = "DetailBerhasilTarikanActivity";
        this.j = "DetailBerhasilTarikanActivity";
        throw new ArithmeticException("divide by zero");
    }

    @OnClick({2131296440})
    public void proses(View view) {
        F = (H + 71) % Property.TYPE_ARRAY;
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f) {
            int i = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'Z' : 'O') != 'O') {
                this.tvErrorKomentar.setVisibility(1);
            } else {
                this.tvErrorKomentar.setVisibility(0);
            }
            this.tvErrorKomentar.setText(2131820982);
            int i2 = F + 11;
            H = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                throw new NullPointerException();
            }
            return;
        }
        if ((this.etKomentar.getText().toString().isEmpty() ? 29 : '+') != '+') {
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
            return;
        }
        u();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        H = (F + 53) % Property.TYPE_ARRAY;
        H = (F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        return 2131492927;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = H + 21;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return this;
        }
        throw new ArithmeticException("divide by zero");
    }

    @OnClick({2131296446})
    public void retry(View view) {
        int i = F + 35;
        H = i % Property.TYPE_ARRAY;
        char c = i % 2 == 0 ? 24 : '-';
        v();
        if (c == 24) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        F = (H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0035;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.H + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.F = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        if ((r0 % 2) == 0) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r5 == false) goto L_0x0066;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        o.CC24SubVisaInfoActivity.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        if ((android.os.Build.VERSION.SDK_INT < 31) != false) goto L_0x0067;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.H
            r1 = 97
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.F = r0
            r0 = 0
            r6 = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x002d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x0024
            r0 = 0
            r5 = r0
            goto L_0x0026
        L_0x0024:
            r0 = 1
            r5 = r0
        L_0x0026:
            r0 = r5
            if (r0 == 0) goto L_0x0035
            goto L_0x0067
        L_0x002d:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x006f
            r1 = 33
            if (r0 < r1) goto L_0x0067
        L_0x0035:
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.H     // Catch: Exception -> 0x006f, Exception -> 0x006f
            r5 = r0
            r0 = r5
            r1 = 105(0x69, float:1.47E-43)
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.F = r0     // Catch: Exception -> 0x006f
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0053
            r0 = 1
            r5 = r0
        L_0x0053:
            r0 = r3
            r0.y()
            r0 = r5
            if (r0 == 0) goto L_0x0066
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x0063
            r1 = r0
            r1.<init>()     // Catch: all -> 0x0063
            throw r0     // Catch: all -> 0x0063
        L_0x0063:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0066:
            return
        L_0x0067:
            r0 = r3
            o.CC24SubVisaInfoActivity.b(r0)     // Catch: Exception -> 0x006c
            return
        L_0x006c:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x006f:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTarikanActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        F = (H + 89) % Property.TYPE_ARRAY;
        z();
        H = (F + 85) % Property.TYPE_ARRAY;
    }

    public final void y() {
        H = (F + 23) % Property.TYPE_ARRAY;
        a(c(this.llShare));
        int i = F + 57;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new NullPointerException();
        }
    }
}
