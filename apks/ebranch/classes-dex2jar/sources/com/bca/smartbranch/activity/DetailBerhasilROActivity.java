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
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import o.CC24SubVisaInfoActivity_ViewBinding;
import o.CC25BFormKartuKreditFragment_ViewBinding;
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
import o.setOnHierarchyChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilROActivity.class */
public class DetailBerhasilROActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static long B;
    private static int C;
    private static int F;
    private static int H;
    private static char z;
    private String A;
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
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297875)
    LinearLayout llRuangan;
    @BindView(2131297887)
    LinearLayout llShare;
    @BindView(2131297977)
    ListView lvTransaksi;
    private DetailTransactionPresenter p;
    private String r;
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
    private String v;
    private String x;
    private RateTransactionPresenter y;
    private setMessage f = new setMessage();
    private boolean q = false;
    private String w = "";
    private String n = "";

    static /* synthetic */ void a(DetailBerhasilROActivity detailBerhasilROActivity) {
        F = (H + 67) % Property.TYPE_ARRAY;
        detailBerhasilROActivity.v();
        H = (F + 57) % Property.TYPE_ARRAY;
    }

    private static void b(int i, char[] cArr, char[] cArr2, char[] cArr3, char c, Object[] objArr) {
        String str;
        synchronized (CC25BFormKartuKreditFragment_ViewBinding.a) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) ((char) (c ^ cArr4[0]));
            cArr5[2] = (char) ((char) (cArr5[2] + ((char) i)));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            CC25BFormKartuKreditFragment_ViewBinding.d = 0;
            while (CC25BFormKartuKreditFragment_ViewBinding.d < length) {
                int i2 = (CC25BFormKartuKreditFragment_ViewBinding.d + 2) % 4;
                int i3 = (CC25BFormKartuKreditFragment_ViewBinding.d + 3) % 4;
                CC25BFormKartuKreditFragment_ViewBinding.b = (char) ((char) (((cArr4[CC25BFormKartuKreditFragment_ViewBinding.d % 4] * 32718) + cArr5[i2]) % 65535));
                cArr5[i3] = (char) ((char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535));
                cArr4[i3] = (char) CC25BFormKartuKreditFragment_ViewBinding.b;
                cArr6[CC25BFormKartuKreditFragment_ViewBinding.d] = (char) ((char) ((int) (((((long) (cArr4[i3] ^ cArr3[CC25BFormKartuKreditFragment_ViewBinding.d])) ^ B) ^ ((long) C)) ^ ((long) z))));
                CC25BFormKartuKreditFragment_ViewBinding.d++;
            }
            str = new String(cArr6);
        }
        objArr[0] = str;
    }

    public static void b(LogRedirector.Logger logger) {
        try {
            int i = F + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
            try {
                H = i % Property.TYPE_ARRAY;
                char c = i % 2 == 0 ? 'J' : '(';
                logger.a();
                if (c != '(') {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
                F = (H + 81) % Property.TYPE_ARRAY;
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
        if (!(Build.VERSION.SDK_INT < 29)) {
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
            if ((file2.exists() ? 'a' : 'R') != 'R') {
                int i = F + 13;
                H = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
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
            b(getPackageName().length() - 19, new char[]{39473, 14979, 21414, 30588}, new char[]{0, 0, 0, 0}, new char[]{57043, 50809, 60262, 6193, 50838, 45568, 2965, 65451, 32514, 20955, 9826, 40069, 61332, 21874, 51532, 52555, 46340, 6337, 31102, 12182, 44188, 44356, 42975, 47366, 32923, 19390, 46795, 40883}, (char) (getResources().getString(2131821267).substring(2, 4).length() + 31825), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        int i2 = H + 77;
        F = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            throw new NullPointerException();
        }
    }

    private static Bitmap e(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = H + 89;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return createBitmap;
        }
        throw new ArithmeticException("divide by zero");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0421, code lost:
        if (r0.equals("1") != false) goto L_0x0424;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void e(com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail r8) {
        /*
        // Method dump skipped, instructions count: 1278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilROActivity.e(com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail):void");
    }

    private void v() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.t;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.x;
        this.y.d(loginasguest);
        try {
            int i = F + 55;
            H = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void y() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.t;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.v;
        infoDocumentUnderlyingActivity.a = this.A;
        this.p.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        F = (H + 49) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        int i = F + 57;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 1 : '#') != '#') {
            this.tvErrorMessage.setText(str);
            this.D.setDisplayedChild(0);
            return;
        }
        this.tvErrorMessage.setText(str);
        this.D.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        F = (H + 53) % Property.TYPE_ARRAY;
        for (DetailTransactionResponse.TxnDataDetail txnDataDetail : list) {
            try {
                H = (F + 43) % Property.TYPE_ARRAY;
                e(txnDataDetail);
            } catch (Exception e) {
                throw e;
            }
        }
        if ((!this.w.isEmpty()) && !this.w.equals("Reguler")) {
            try {
                int i = H + 97;
                F = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                }
                this.llRuangan.setVisibility(0);
                this.tvJenisRuangan.setText(this.w);
            } catch (Exception e2) {
                throw e2;
            }
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH.mm");
            Date parse = simpleDateFormat.parse(this.r);
            TextView textView = this.tvWaktu;
            StringBuilder sb = new StringBuilder();
            sb.append(this.u);
            sb.append(", ");
            sb.append(simpleDateFormat2.format(parse));
            sb.append(" WIB");
            textView.setText(sb.toString());
            H = (F + 19) % Property.TYPE_ARRAY;
        } catch (Exception e3) {
            TextView textView2 = this.tvWaktu;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.u);
            sb2.append(", ");
            sb2.append(this.r);
            sb2.append(" WIB");
            textView2.setText(sb2.toString());
        }
        this.D.setDisplayedChild(2);
        int i2 = F + 89;
        H = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
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
        H = (F + 83) % Property.TYPE_ARRAY;
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
                int i = F + 19;
                H = i % Property.TYPE_ARRAY;
                if (!(i % 2 != 0)) {
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

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = H + 9;
        F = i % Property.TYPE_ARRAY;
        char c = 2;
        if (i % 2 == 0) {
            c = 22;
        }
        if (c != 22) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.D = (ViewAnimator) findViewById(2131299751);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        this.p = new DetailTransactionPresenter();
        this.y = new RateTransactionPresenter();
        this.p.e = this;
        this.y.e = this;
        Bundle extras = getIntent().getExtras();
        this.t = extras.getString("no_reff", "");
        this.v = extras.getString("token", "");
        this.s = extras.getString("flag_rating", "");
        this.A = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a8: INVOKE  
              (wrap: o.LogoutDialog : 0x009e: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilROActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilROActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00a5: CONSTRUCTOR  (r1v21 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilROActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilROActivity.class
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
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilROActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        F = (H + 77) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        boolean z2 = true;
        this.D.setDisplayedChild(1);
        try {
            int i = H + 93;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z2 = false;
            }
            if (!z2) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        int i;
        ViewAnimator viewAnimator;
        int i2 = H + 81;
        F = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 26 : '@') != 26) {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.D;
            i = 1;
        } else {
            this.tvErrorMessage.setText(str);
            viewAnimator = this.D;
            i = 0;
        }
        viewAnimator.setDisplayedChild(i);
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        H = (F + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        F = (H + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        int i = F + 65;
        H = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            this.D.setDisplayedChild(0);
        } else {
            this.D.setDisplayedChild(1);
        }
        F = (H + 45) % Property.TYPE_ARRAY;
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
        try {
            int i = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
            try {
                F = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z2 = true;
                }
                if (!z2) {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z2) {
        F = (H + 9) % Property.TYPE_ARRAY;
        if ((z2 ? 7 : ',') == ',') {
            if ((view.getId() == 2131297031 ? 'M' : '4') == 'M') {
                if ((this.etKomentar.getText().toString().isEmpty() ? '+' : '\\') == '+') {
                    F = (H + 23) % Property.TYPE_ARRAY;
                    this.tilKomentar.setHintEnabled(false);
                    F = (H + 65) % Property.TYPE_ARRAY;
                }
            }
        } else if (view.getId() == 2131297031) {
            this.tilKomentar.setHintEnabled(true);
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        try {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilROActivity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailBerhasilROActivity.a(DetailBerhasilROActivity.this);
                }
            }).g();
            int i = H + 111;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '=' : '?') != '?') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        int i = F + 5;
        H = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            this.h.equalsIgnoreCase("");
            throw new ArithmeticException("divide by zero");
        } else if (this.h.equalsIgnoreCase("")) {
            startActivity(new Intent(this, LandingActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
        } else {
            onBackPressed();
            H = (F + 81) % Property.TYPE_ARRAY;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        F = (H + 63) % Property.TYPE_ARRAY;
        getMenuInflater().inflate(2131558410, menu);
        F = (H + 5) % Property.TYPE_ARRAY;
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        F = (H + 91) % Property.TYPE_ARRAY;
        onDestroy();
        try {
            RateTransactionPresenter rateTransactionPresenter = this.y;
            Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
            if (!(call == null)) {
                H = (F + 31) % Property.TYPE_ARRAY;
                call.cancel();
            }
            rateTransactionPresenter.e = null;
            try {
                DetailTransactionPresenter detailTransactionPresenter = this.p;
                Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call2 = detailTransactionPresenter.c;
                if ((call2 != null ? 3 : 'O') != 'O') {
                    call2.cancel();
                }
                detailTransactionPresenter.e = null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        H = (F + 67) % Property.TYPE_ARRAY;
        if ((menuItem.getItemId() == 16908332 ? 1 : 'b') != 'b') {
            onBackPressed();
            F = (H + 61) % Property.TYPE_ARRAY;
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
            int i2 = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
            F = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? ',' : 30) != ',') {
                onRequestPermissionsResult(i, strArr, iArr);
                CC24SubVisaInfoActivity_ViewBinding.d(this, i, iArr);
                return;
            }
            onRequestPermissionsResult(i, strArr, iArr);
            try {
                CC24SubVisaInfoActivity_ViewBinding.d(this, i, iArr);
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        F = (H + 53) % Property.TYPE_ARRAY;
        try {
            setCardSlogan.e().b = "DetailBerhasilROActivity";
            this.j = "DetailBerhasilROActivity";
            int i = H + 91;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 7 : 'V') == 7) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        boolean z2 = true;
        if ((((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f ? 'Q' : 17) != 'Q') {
            if ((this.etKomentar.getText().toString().isEmpty() ? 'R' : 'P') != 'R') {
                v();
                return;
            }
            int i = F + 97;
            H = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z2 = false;
            }
            if (z2) {
                this.tvErrorKomentar.setVisibility(0);
                this.tvErrorKomentar.setText(2131820765);
                this.tilKomentar.setBackgroundResource(2131230870);
                this.etKomentar.requestFocus();
                return;
            }
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
            return;
        }
        int i2 = H + 115;
        F = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            this.tvErrorKomentar.setVisibility(1);
            this.tvErrorKomentar.setText(2131820982);
            return;
        }
        this.tvErrorKomentar.setVisibility(0);
        this.tvErrorKomentar.setText(2131820982);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = H + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 0 : 'H') != 0) {
            int i2 = H + 97;
            F = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '*' : 'O') != '*') {
                return 2131492938;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = H + 81;
        F = i % Property.TYPE_ARRAY;
        boolean z2 = false;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = H + 79;
        F = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            z2 = true;
        }
        if (!z2) {
            return this;
        }
        Object[] objArr2 = null;
        int length2 = objArr2.length;
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        int i = H + 23;
        F = i % Property.TYPE_ARRAY;
        boolean z2 = i % 2 == 0;
        y();
        if (!z2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 33 ? 20 : '-') != '-') goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 5) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        com.bca.smartbranch.activity.DetailBerhasilROActivity.F = (com.bca.smartbranch.activity.DetailBerhasilROActivity.H + 43) % io.realm.internal.Property.TYPE_ARRAY;
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        o.CC24SubVisaInfoActivity_ViewBinding.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilROActivity.F
            r1 = 113(0x71, float:1.58E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilROActivity.H = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001a
            r0 = 0
            r5 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 1
            r5 = r0
        L_0x001c:
            r0 = r5
            if (r0 == 0) goto L_0x003a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x002e
            r0 = 20
            r5 = r0
            goto L_0x0031
        L_0x002e:
            r0 = 45
            r5 = r0
        L_0x0031:
            r0 = r5
            r1 = 45
            if (r0 == r1) goto L_0x0055
            goto L_0x0041
        L_0x003a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 5
            if (r0 < r1) goto L_0x0055
        L_0x0041:
            int r0 = com.bca.smartbranch.activity.DetailBerhasilROActivity.H
            r1 = 43
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilROActivity.F = r0
            r0 = r3
            r0.u()
            return
        L_0x0055:
            r0 = r3
            o.CC24SubVisaInfoActivity_ViewBinding.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilROActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        int i = H + 97;
        F = i % Property.TYPE_ARRAY;
        char c = 17;
        char c2 = i % 2 != 0 ? 17 : 'R';
        z();
        if (c2 != 17) {
            int i2 = H + 5;
            F = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                c = '#';
            }
            if (c == '#') {
                throw new ArithmeticException("divide by zero");
            }
            return;
        }
        throw new ArithmeticException("divide by zero");
    }

    public final void u() {
        H = (F + 85) % Property.TYPE_ARRAY;
        try {
            c(e(this.llShare));
            int i = H + 21;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 29 : 'K') == 29) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
