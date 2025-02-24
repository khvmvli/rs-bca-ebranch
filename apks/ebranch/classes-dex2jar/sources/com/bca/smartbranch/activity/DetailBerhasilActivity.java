package com.bca.smartbranch.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.AndroidCharacter;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.CC22SubBCACardInfoActivity;
import o.CC23BFormKartuKreditFragment_ViewBinding;
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
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilActivity.class */
public class DetailBerhasilActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static short[] E;
    private static int F;
    private static int G;
    private static int z;
    private ViewAnimator D;
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
    @BindView(2131297784)
    LinearLayout llNamaNasabah;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297875)
    LinearLayout llRuangan;
    @BindView(2131297887)
    LinearLayout llShare;
    private String p;
    private String q;
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
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299689)
    TextView tvTransaksi;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private String w;
    private String x;
    private RateTransactionPresenter y;
    private static byte[] B = {-45, -35, -47, -53, -61, -41, -51, -46, 18, -106, -43, -59, -35, -65, -32, -66, -46, -31, -60, -54, 21, -99, -50, -47, 4, -111, -50, -36};
    private static int A = -2017658260;
    private static int C = 73;
    private boolean n = false;
    private String v = "";
    private String f = "";

    static /* synthetic */ void a(DetailBerhasilActivity detailBerhasilActivity) {
        int i = G + 111;
        F = i % Property.TYPE_ARRAY;
        boolean z2 = i % 2 != 0;
        detailBerhasilActivity.u();
        if (z2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        G = (F + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
    }

    public static void a(LogRedirector.Logger logger) {
        F = (G + 13) % Property.TYPE_ARRAY;
        logger.a();
        try {
            G = (F + 95) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void b(byte b, int i, short s, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (CC23BFormKartuKreditFragment_ViewBinding.e) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + C;
            boolean z2 = i4 == -1;
            if (z2) {
                i4 = B != null ? (byte) (B[A + i3] + C) : (short) (E[A + i3] + C);
            }
            if (i4 > 0) {
                CC23BFormKartuKreditFragment_ViewBinding.d = ((i3 + i4) - 2) + A + (z2 ? 1 : 0);
                CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (i2 + z));
                sb.append(CC23BFormKartuKreditFragment_ViewBinding.c);
                CC23BFormKartuKreditFragment_ViewBinding.b = (char) CC23BFormKartuKreditFragment_ViewBinding.c;
                CC23BFormKartuKreditFragment_ViewBinding.a = 1;
                while (CC23BFormKartuKreditFragment_ViewBinding.a < i4) {
                    if (B != null) {
                        byte[] bArr = B;
                        int i5 = CC23BFormKartuKreditFragment_ViewBinding.d;
                        CC23BFormKartuKreditFragment_ViewBinding.d = i5 - 1;
                        CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (CC23BFormKartuKreditFragment_ViewBinding.b + (((byte) (bArr[i5] + s)) ^ b)));
                    } else {
                        short[] sArr = E;
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

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 4 : 'W') != 'W') {
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
                G = (F + 35) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                F = (G + 63) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            b((byte) (getResources().getString(2131821267).substring(2, 4).codePointAt(0) - 36), getApplicationInfo().targetSdkVersion - setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, (short) (getPackageName().length() + 29), 1259299173 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1476 - AndroidCharacter.getMirror('0'), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private static Bitmap c(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = G + 77;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            return createBitmap;
        }
        throw new ArithmeticException("divide by zero");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018c, code lost:
        if ((!r0.equals("Ruangan")) != false) goto L_0x0237;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035c  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void e(com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail r5) {
        /*
        // Method dump skipped, instructions count: 1166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilActivity.e(com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail):void");
    }

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        try {
            loginasguest.c = this.p;
            loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
            loginasguest.a = this.etKomentar.getText().toString();
            loginasguest.b = this.s;
            this.y.d(loginasguest);
            int i = F + 53;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '4' : 1) != 1) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void y() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        try {
            infoDocumentUnderlyingActivity.e = this.p;
            infoDocumentUnderlyingActivity.d = "SUKSES";
            infoDocumentUnderlyingActivity.b = this.u;
            infoDocumentUnderlyingActivity.a = this.x;
            this.t.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
            F = (G + 95) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        F = (G + 3) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.D.setDisplayedChild(1);
        int i = F + 21;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'X' : 24) == 'X') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        int i = F + 85;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            for (DetailTransactionResponse.TxnDataDetail txnDataDetail : list) {
                e(txnDataDetail);
            }
            if (this.n) {
                this.tvTransaksi.setText(2131822000);
                if (!this.v.isEmpty() && !this.v.equals("Reguler")) {
                    int i2 = G + 33;
                    F = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 != 0) {
                        this.llRuangan.setVisibility(1);
                    } else {
                        this.llRuangan.setVisibility(0);
                    }
                    this.tvJenisRuangan.setText(this.v);
                }
                if (!this.f.isEmpty()) {
                    this.trCabang.setVisibility(0);
                    this.tvCabang.setText(Html.fromHtml(this.f));
                    F = (G + 3) % Property.TYPE_ARRAY;
                }
            }
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH.mm");
                Date parse = simpleDateFormat.parse(this.r);
                TextView textView = this.tvWaktu;
                StringBuilder sb = new StringBuilder();
                sb.append(this.w);
                sb.append(", ");
                sb.append(simpleDateFormat2.format(parse));
                sb.append(" WIB");
                textView.setText(sb.toString());
                G = (F + 35) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                TextView textView2 = this.tvWaktu;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.w);
                sb2.append(", ");
                sb2.append(this.r);
                sb2.append(" WIB");
                textView2.setText(sb2.toString());
            }
            this.D.setDisplayedChild(2);
            return;
        }
        list.iterator();
        throw new ArithmeticException("divide by zero");
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
            G = (F + 33) % Property.TYPE_ARRAY;
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
        int i = F + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
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
        int i = G + 19;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '/' : '?') != '?') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.D = (ViewAnimator) findViewById(2131299751);
        this.t = new DetailTransactionPresenter();
        this.y = new RateTransactionPresenter();
        this.t.e = this;
        this.y.e = this;
        b(this.toolbar);
        i();
        boolean z2 = true;
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(2131822201);
        Bundle extras = getIntent().getExtras();
        this.p = extras.getString("no_reff", "");
        this.u = extras.getString("token", "");
        this.q = extras.getString("flag_rating", "");
        this.x = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: INVOKE  
              (wrap: o.LogoutDialog : 0x00a2: IGET  (r0v27 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00a9: CONSTRUCTOR  (r1v21 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilActivity.class
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
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        G = (F + 5) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.D.setDisplayedChild(1);
        int i = F + 93;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '$' : 'F') != 'F') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        F = (G + 35) % Property.TYPE_ARRAY;
        try {
            try {
                this.tvErrorMessage.setText(str);
                this.D.setDisplayedChild(1);
                int i = G + 97;
                F = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? '1' : '9') == '1') {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        try {
            int i = F + 3;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '6' : 30) != '6') {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
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
        try {
            int i2 = G + 69;
            F = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? 22 : 'P') != 22) {
                viewAnimator = this.D;
                i = 0;
            } else {
                viewAnimator = this.D;
                i = 1;
            }
            viewAnimator.setDisplayedChild(i);
            G = (F + 71) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
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
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.etKomentar.setEnabled(false);
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.btnProses.setEnabled(false);
        G = (F + 67) % Property.TYPE_ARRAY;
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z2) {
        boolean z3 = false;
        if (z2) {
            G = (F + 21) % Property.TYPE_ARRAY;
            if (view.getId() == 2131297031) {
                this.tilKomentar.setHintEnabled(true);
                return;
            }
        } else if (view.getId() == 2131297031) {
            if ((this.etKomentar.getText().toString().isEmpty() ? '$' : 'c') != 'c') {
                this.tilKomentar.setHintEnabled(false);
            }
        }
        int i = G + 45;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            z3 = true;
        }
        if (z3) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilActivity.a(DetailBerhasilActivity.this);
            }
        }).g();
        int i = G + 45;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'J' : '=') == 'J') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.t;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        boolean z2 = false;
        if (!(call == null)) {
            G = (F + 59) % Property.TYPE_ARRAY;
            call.cancel();
        }
        detailTransactionPresenter.e = null;
        RateTransactionPresenter rateTransactionPresenter = this.y;
        Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
        if (call2 == null) {
            z2 = true;
        }
        if (!z2) {
            F = (G + 95) % Property.TYPE_ARRAY;
            call2.cancel();
        }
        rateTransactionPresenter.e = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = G + 37;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            if ((menuItem.getItemId() == 16908332 ? 'D' : 'R') == 'R') {
                return onOptionsItemSelected(menuItem);
            }
            onBackPressed();
            F = (G + 111) % Property.TYPE_ARRAY;
            return true;
        }
        menuItem.getItemId();
        throw new ArithmeticException("divide by zero");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        G = (F + 61) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        try {
            CC22SubBCACardInfoActivity.a(this, i, iArr);
            try {
                G = (F + 43) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = F + 37;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '!' : 'E') != '!') {
            setCardSlogan.e().b = "DetailBerhasilActivity";
            this.j = "DetailBerhasilActivity";
        } else {
            try {
                setCardSlogan.e().b = "DetailBerhasilActivity";
                this.j = "DetailBerhasilActivity";
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = G + 51;
        F = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? '!' : 31) == '!') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if ((((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f ? '6' : '>') != '6') {
            if ((this.etKomentar.getText().toString().isEmpty() ? '\'' : 'B') != 'B') {
                G = (F + 35) % Property.TYPE_ARRAY;
                this.tvErrorKomentar.setVisibility(0);
                this.tvErrorKomentar.setText(2131820765);
                this.tilKomentar.setBackgroundResource(2131230870);
                this.etKomentar.requestFocus();
                return;
            }
            u();
            return;
        }
        G = (F + 65) % Property.TYPE_ARRAY;
        this.tvErrorKomentar.setVisibility(0);
        this.tvErrorKomentar.setText(2131820982);
        G = (F + 23) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = G + 59;
        F = i % Property.TYPE_ARRAY;
        boolean z2 = false;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = G + 59;
        F = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            z2 = true;
        }
        if (!z2) {
            return 2131492922;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492922;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = G + 71;
        F = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            G = (F + 35) % Property.TYPE_ARRAY;
            return this;
        }
        throw new NullPointerException();
    }

    @OnClick({2131296446})
    public void retry(View view) {
        G = (F + 47) % Property.TYPE_ARRAY;
        y();
        G = (F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
    }

    @OnClick({2131296448})
    public void share(View view) {
        G = (F + 5) % Property.TYPE_ARRAY;
        try {
            boolean z2 = false;
            if (!(Build.VERSION.SDK_INT >= 33)) {
                CC22SubBCACardInfoActivity.a(this);
                int i = F + 75;
                G = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z2 = true;
                }
                if (z2) {
                    throw new NullPointerException();
                }
                return;
            }
            v();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        int i = F + 67;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'U' : 'W') != 'W') {
            z();
            throw new ArithmeticException("divide by zero");
        }
        z();
        G = (F + 93) % Property.TYPE_ARRAY;
    }

    public final void v() {
        int i = F + 61;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? ':' : '\"') != '\"') {
            b(c(this.llShare));
            throw new NullPointerException();
        }
        b(c(this.llShare));
        try {
            try {
                G = (F + 69) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
