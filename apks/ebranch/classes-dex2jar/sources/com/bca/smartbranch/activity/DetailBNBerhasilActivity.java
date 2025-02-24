package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioTrack;
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
import o.CC21UbahSubBCACardActivity_ViewBinding;
import o.CC23BFormKartuKreditFragment_ViewBinding;
import o.InfoDocumentUnderlyingActivity;
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
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNBerhasilActivity.class */
public class DetailBNBerhasilActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int G;
    private static int J;
    private static int L;
    private static short[] M;
    private RateTransactionPresenter A;
    private String B;
    private String C;
    private String D;
    private ViewAnimator I;
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
    private DetailTransactionPresenter s;
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
    private String y;
    private String z;
    private static byte[] E = {-53, 36, 40, 18, 26, 46, 20, 41, 105, -19, 44, 28, 36, 6, 55, 5, 41, 56, 27, 17, 108, -28, 21, 40, 91, -24, 21, 35};
    private static int F = -2124138195;
    private static int H = 81;
    private setMessage f = new setMessage();
    private String r = "";

    private void b(Bitmap bitmap) {
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
                J = (L + 21) % Property.TYPE_ARRAY;
                file2.delete();
                J = (L + 51) % Property.TYPE_ARRAY;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                J = (L + 61) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            e((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - setHasDecor$MediaBrowserCompat$MediaItem.aI), getPackageName().codePointAt(8) + 218027332, getApplicationInfo().targetSdkVersion + 2124138161, getPackageName().length() - 101, (short) (97 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    public static void b(LogRedirector.Logger logger) {
        L = (J + 53) % Property.TYPE_ARRAY;
        logger.a();
        try {
            int i = L + 43;
            J = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fa, code lost:
        if (r0.equals("Jam") != false) goto L_0x02a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0207, code lost:
        if (r0.equals("Pecahan Uang") != false) goto L_0x020a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0217, code lost:
        if (r0.equals("Comment") != false) goto L_0x021a;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04fa A[Catch: Exception -> 0x0271, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0271, blocks: (B:98:0x0309, B:165:0x04fa), top: B:192:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x052a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail r4) {
        /*
        // Method dump skipped, instructions count: 1417
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilActivity.c(com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail):void");
    }

    static /* synthetic */ void d(DetailBNBerhasilActivity detailBNBerhasilActivity) {
        int i = L + 1;
        J = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? ']' : '9') != '9') {
            detailBNBerhasilActivity.u();
            throw new ArithmeticException("divide by zero");
        } else {
            detailBNBerhasilActivity.u();
        }
    }

    private static Bitmap e(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = L + 91;
        J = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '%' : 'L') != '%') {
            return createBitmap;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return createBitmap;
    }

    private static void e(byte b, int i, int i2, int i3, short s, Object[] objArr) {
        String obj;
        synchronized (CC23BFormKartuKreditFragment_ViewBinding.e) {
            StringBuilder sb = new StringBuilder();
            int i4 = i3 + H;
            boolean z = i4 == -1;
            if (z) {
                i4 = E != null ? (byte) (E[F + i2] + H) : (short) (M[F + i2] + H);
            }
            if (i4 > 0) {
                CC23BFormKartuKreditFragment_ViewBinding.d = ((i2 + i4) - 2) + F + (z ? 1 : 0);
                CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (i + G));
                sb.append(CC23BFormKartuKreditFragment_ViewBinding.c);
                CC23BFormKartuKreditFragment_ViewBinding.b = (char) CC23BFormKartuKreditFragment_ViewBinding.c;
                CC23BFormKartuKreditFragment_ViewBinding.a = 1;
                while (CC23BFormKartuKreditFragment_ViewBinding.a < i4) {
                    if (E != null) {
                        byte[] bArr = E;
                        int i5 = CC23BFormKartuKreditFragment_ViewBinding.d;
                        CC23BFormKartuKreditFragment_ViewBinding.d = i5 - 1;
                        CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (CC23BFormKartuKreditFragment_ViewBinding.b + (((byte) (bArr[i5] + s)) ^ b)));
                    } else {
                        short[] sArr = M;
                        int i6 = CC23BFormKartuKreditFragment_ViewBinding.d;
                        CC23BFormKartuKreditFragment_ViewBinding.d = i6 - 1;
                        CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (CC23BFormKartuKreditFragment_ViewBinding.b + (((short) (sArr[i6] + s)) ^ b)));
                    }
                    sb.append(CC23BFormKartuKreditFragment_ViewBinding.c);
                    CC23BFormKartuKreditFragment_ViewBinding.b = (char) CC23BFormKartuKreditFragment_ViewBinding.c;
                    CC23BFormKartuKreditFragment_ViewBinding.a++;
                }
            }
            obj = sb.toString();
        }
        objArr[0] = obj;
    }

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        try {
            loginasguest.c = this.C;
            loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
            loginasguest.a = this.etKomentar.getText().toString();
            loginasguest.b = this.w;
            this.A.d(loginasguest);
            J = (L + 45) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    private void y() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.x;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.B;
        infoDocumentUnderlyingActivity.a = this.z;
        this.s.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        J = (L + 87) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        try {
            int i = L + 45;
            J = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
            }
            boolean z = true;
            this.tvErrorMessage.setText(str);
            this.I.setDisplayedChild(1);
            int i2 = L + 75;
            J = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                z = false;
            }
            if (z) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|(2:5|3)|38|6|(1:8)(1:9)|10|(4:12|(1:14)(1:15)|16|(2:18|(6:23|24|36|29|32|33))(4:20|34|21|22))|28|36|29|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0178, code lost:
        r0 = r4.tvWaktu;
        r0 = new java.lang.StringBuilder();
        r0.append(r4.D);
        r0.append(", ");
        r0.append(r4.p);
        r0.setText(r0.toString());
     */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a_(java.util.List<com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail> r5) {
        /*
        // Method dump skipped, instructions count: 573
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilActivity.a_(java.util.List):void");
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
        L = (J + 21) % Property.TYPE_ARRAY;
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
        int i = L + 17;
        J = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new NullPointerException();
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
        int i = L + 37;
        J = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.I = (ViewAnimator) findViewById(2131299751);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        this.s = new DetailTransactionPresenter();
        this.A = new RateTransactionPresenter();
        this.s.e = this;
        this.A.e = this;
        Bundle extras = getIntent().getExtras();
        this.x = extras.getString("no_reff", "");
        this.B = extras.getString("token", "");
        this.t = extras.getString("flag_rating", "");
        this.z = extras.getString("TYPE", "");
        this.etKomentar.setOnTouchListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: INVOKE  
              (wrap: android.widget.EditText : 0x00a2: IGET  (r0v25 android.widget.EditText A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBNBerhasilActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBNBerhasilActivity.etKomentar android.widget.EditText)
              (wrap: o.getPromotion$4 : 0x00a9: CONSTRUCTOR  (r1v23 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.activity.DetailBNBerhasilActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNBerhasilActivity.class
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
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        J = (L + 77) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.I.setDisplayedChild(1);
        int i = J + 69;
        L = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 18 : '+') != '+') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        J = (L + 113) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.I.setDisplayedChild(1);
        J = (L + 55) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        L = (J + 113) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        J = (L + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        J = (L + 57) % Property.TYPE_ARRAY;
        this.I.setDisplayedChild(0);
        int i = J + 87;
        L = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void i(String str) {
        x();
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
        J = (L + 75) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBNBerhasilActivity.d(DetailBNBerhasilActivity.this);
            }
        }).g();
        try {
            int i = J + 57;
            L = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 17 : '^') != '^') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        L = (J + 31) % Property.TYPE_ARRAY;
        getMenuInflater().inflate(2131558409, menu);
        int i = L + 97;
        J = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            return true;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.s;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        if (call != null) {
            try {
                int i = L + 85;
                try {
                    J = i % Property.TYPE_ARRAY;
                    if ((i % 2 != 0 ? 3 : '8') != '8') {
                        call.cancel();
                        throw new NullPointerException();
                    }
                    call.cancel();
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        detailTransactionPresenter.e = null;
        RateTransactionPresenter rateTransactionPresenter = this.A;
        Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
        if ((call2 != null ? ']' : 3) != 3) {
            int i2 = L + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
            J = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                call2.cancel();
                throw new ArithmeticException("divide by zero");
            }
            call2.cancel();
        }
        rateTransactionPresenter.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r5 != false) goto L_0x0038;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r4.getId() != 2131297031) goto L_0x0047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        r6 = '[';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        r6 = '\\';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r6 == '\\') goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        r3.tilKomentar.setHintEnabled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r4.getId() != 2131297031) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r3.etKomentar.getText().toString().isEmpty() == false) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r6 == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = (com.bca.smartbranch.activity.DetailBNBerhasilActivity.L + 89) % io.realm.internal.Property.TYPE_ARRAY;
        r3.tilKomentar.setHintEnabled(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if ((r5 ? 26 : '\'') != '\'') goto L_0x0038;
     */
    @butterknife.OnFocusChange({2131297031})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onFocus(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBNBerhasilActivity.L
            r6 = r0
            r0 = 1
            r7 = r0
            int r6 = r6 + 1
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0034
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0031
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0025
            r0 = 26
            r6 = r0
            goto L_0x0028
        L_0x0025:
            r0 = 39
            r6 = r0
        L_0x0028:
            r0 = r6
            r1 = 39
            if (r0 == r1) goto L_0x0059
            goto L_0x0038
        L_0x0031:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0034:
            r0 = r5
            if (r0 == 0) goto L_0x0059
        L_0x0038:
            r0 = r4
            int r0 = r0.getId()
            r1 = 2131297031(0x7f090307, float:1.8211995E38)
            if (r0 != r1) goto L_0x0047
            r0 = 91
            r6 = r0
            goto L_0x004a
        L_0x0047:
            r0 = 92
            r6 = r0
        L_0x004a:
            r0 = r6
            r1 = 92
            if (r0 == r1) goto L_0x0095
            r0 = r3
            o.LogoutDialog_ViewBinding r0 = r0.tilKomentar
            r1 = 1
            r0.setHintEnabled(r1)
            return
        L_0x0059:
            r0 = r4
            int r0 = r0.getId()
            r1 = 2131297031(0x7f090307, float:1.8211995E38)
            if (r0 != r1) goto L_0x0095
            r0 = r3
            android.widget.EditText r0 = r0.etKomentar
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0078
            r0 = r7
            r6 = r0
            goto L_0x007a
        L_0x0078:
            r0 = 0
            r6 = r0
        L_0x007a:
            r0 = r6
            if (r0 == 0) goto L_0x0095
            int r0 = com.bca.smartbranch.activity.DetailBNBerhasilActivity.L
            r1 = 89
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = r0
            r0 = r3
            o.LogoutDialog_ViewBinding r0 = r0.tilKomentar
            r1 = 0
            r0.setHintEnabled(r1)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilActivity.onFocus(android.view.View, boolean):void");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        L = (J + 51) % Property.TYPE_ARRAY;
        if ((menuItem.getItemId() == 16908332 ? 31 : '7') == 31) {
            J = (L + 61) % Property.TYPE_ARRAY;
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == 2131298038) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        } else {
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            int i = J + 99;
            L = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 15 : '#') != 15) {
                return onOptionsItemSelected;
            }
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = L + 15;
        J = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            onRequestPermissionsResult(i, strArr, iArr);
            CC21UbahSubBCACardActivity_ViewBinding.e(this, i, iArr);
            throw new ArithmeticException("divide by zero");
        }
        onRequestPermissionsResult(i, strArr, iArr);
        CC21UbahSubBCACardActivity_ViewBinding.e(this, i, iArr);
        L = (J + 43) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        J = (L + 45) % Property.TYPE_ARRAY;
        try {
            try {
                setCardSlogan.e().b = "DetailBNBerhasilActivity";
                this.j = "DetailBNBerhasilActivity";
                J = (L + 31) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r3.etKomentar.getText().toString().isEmpty() == false) goto L_0x0077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
        if (r0 == false) goto L_0x0077;
     */
    @butterknife.OnClick({2131296440})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void proses(android.view.View r4) {
        /*
        // Method dump skipped, instructions count: 279
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilActivity.proses(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        L = (J + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
        int i = L + 3;
        J = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            return 2131492929;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492929;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = L + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        J = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = L + 97;
        J = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 'c' : 'J') == 'J') {
            return this;
        }
        Object[] objArr2 = null;
        int length2 = objArr2.length;
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        int i = L + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        J = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? 'P' : '^';
        y();
        if (c == 'P') {
            throw new NullPointerException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 97 ? 'Q' : '&') != 'Q') goto L_0x005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = (com.bca.smartbranch.activity.DetailBNBerhasilActivity.L + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % io.realm.internal.Property.TYPE_ARRAY;
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        o.CC21UbahSubBCACardActivity_ViewBinding.c(r3);
        r0 = com.bca.smartbranch.activity.DetailBNBerhasilActivity.L + 115;
        com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        if ((r0 % 2) == 0) goto L_0x0080;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBNBerhasilActivity.L
            r1 = 121(0x79, float:1.7E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 13
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 27
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 27
            if (r0 == r1) goto L_0x003e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 97
            if (r0 < r1) goto L_0x0032
            r0 = 81
            r5 = r0
            goto L_0x0035
        L_0x0032:
            r0 = 38
            r5 = r0
        L_0x0035:
            r0 = r5
            r1 = 81
            if (r0 == r1) goto L_0x0048
            goto L_0x005c
        L_0x003e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0081
            r5 = r0
            r0 = r5
            r1 = 33
            if (r0 < r1) goto L_0x005c
        L_0x0048:
            int r0 = com.bca.smartbranch.activity.DetailBNBerhasilActivity.L
            r1 = 105(0x69, float:1.47E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = r0
            r0 = r3
            r0.v()
            return
        L_0x005c:
            r0 = r3
            o.CC21UbahSubBCACardActivity_ViewBinding.c(r0)
            int r0 = com.bca.smartbranch.activity.DetailBNBerhasilActivity.L
            r1 = 115(0x73, float:1.61E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBNBerhasilActivity.J = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0080
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x007d
            r1 = r0
            r1.<init>()     // Catch: all -> 0x007d
            throw r0     // Catch: all -> 0x007d
        L_0x007d:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0080:
            return
        L_0x0081:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNBerhasilActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        int i = J + 67;
        L = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 15 : 4) != 15) {
            z();
            int i2 = L + 79;
            J = i2 % Property.TYPE_ARRAY;
            if (!(i2 % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        try {
            z();
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    public final void v() {
        L = (J + 25) % Property.TYPE_ARRAY;
        b(e(this.llShare));
        int i = L + 49;
        J = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 1 : 'G') == 1) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }
}
