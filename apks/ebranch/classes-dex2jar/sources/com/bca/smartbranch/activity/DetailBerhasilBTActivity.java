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
import android.text.TextUtils;
import android.util.Log;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23AFormKartuKreditFragment;
import o.CC23UbahSubMastercardActivity;
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
import o.setSplitTrack;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilBTActivity.class */
public class DetailBerhasilBTActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int G;
    private static int N;
    private String A;
    private String B;
    private String C;
    private String D;
    private ViewAnimator E;
    private String H;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296448)
    Button btnShare;
    @BindString(2131821412)
    String buktiKirim;
    @BindView(2131296838)
    setSplitTrack cvInfo;
    @BindView(2131296945)
    LogoutDialog etAlasan;
    @BindView(2131297031)
    LogoutDialog etKomentar;
    @BindView(2131297539)
    LinearLayout llBankTujuan;
    @BindView(2131297548)
    LinearLayout llBerita;
    @BindView(2131297550)
    LinearLayout llBiayaTransfer;
    @BindView(2131297559)
    LinearLayout llCabang;
    @BindView(2131297566)
    LinearLayout llCatatan;
    @BindView(2131297624)
    LinearLayout llDetailPenerima;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297825)
    LinearLayout llNoTelpCabang;
    @BindView(2131297830)
    LinearLayout llNominal;
    @BindView(2131297835)
    LinearLayout llNomorWarkat;
    @BindView(2131297837)
    LinearLayout llNorekSumberDana;
    @BindView(2131297850)
    LinearLayout llPenerima;
    @BindView(2131297856)
    LinearLayout llPengirim;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindView(2131297878)
    LinearLayout llSaranaPembayaran;
    @BindView(2131297887)
    LinearLayout llShare;
    @BindView(2131297910)
    LinearLayout llTanggalPelaksanaan;
    @BindView(2131297919)
    LinearLayout llTotalBiayaTransfer;
    @BindView(2131297920)
    LinearLayout llTotalNominal;
    @BindView(2131297921)
    LinearLayout llTotalPembayaran;
    @BindView(2131297932)
    LinearLayout llWaktuPengiriman;
    @BindView(2131297976)
    ListView lvDetailPenerima;
    private String n;
    private String p;
    @BindString(2131822007)
    String pendebetanDana;
    private String q;
    private DetailTransactionPresenter r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822262)
    String toolbarTitle;
    @BindView(2131298837)
    TextView tvBankTujuan;
    @BindView(2131298847)
    TextView tvBerita;
    @BindView(2131298859)
    TextView tvBiayaTransfer;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298904)
    TextView tvNamaPenerima;
    @BindView(2131298910)
    TextView tvNamaPengirim;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299495)
    TextView tvNoTelpCabang;
    @BindView(2131299485)
    TextView tvNominal;
    @BindView(2131299496)
    TextView tvNomorWarkat;
    @BindView(2131299501)
    TextView tvNorekSumberDana;
    @BindView(2131299567)
    TextView tvSaranaPembayaran;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299602)
    TextView tvTanggalPelaksanaan;
    @BindView(2131299679)
    TextView tvTotalBiayaTransfer;
    @BindView(2131299681)
    TextView tvTotalNominal;
    @BindView(2131299684)
    TextView tvTotalPembayaran;
    @BindView(2131299688)
    TextView tvTransactionType;
    @BindView(2131299689)
    TextView tvTransaksi;
    @BindView(2131299736)
    TextView tvWaktu;
    @BindView(2131299737)
    TextView tvWaktuPengiriman;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private RateTransactionPresenter v;
    private String w;
    private String x;
    private String y;
    private String z;
    private static char[] F = {13748, 13819, 13801, 13812, 13810, 13822, 13806, 13817, 13804, 13815, 13800, 13823, 13813, 13811, 13816, 13802};
    private static char I = (char) 4;
    private setMessage f = new setMessage();
    private boolean s = false;
    private List<DetailTransactionResponse.ValueTxnDataDetail> t = new ArrayList();

    private static Bitmap b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = G + 47;
        N = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            return createBitmap;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ad, code lost:
        if ((r0.equals("Nomor Referensi Anak") ? '\'' : 23) != 23) goto L_0x02b0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02ca, code lost:
        if ((r0.equals("Detail Penerima")) != true) goto L_0x0352;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail r8) {
        /*
        // Method dump skipped, instructions count: 2678
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilBTActivity.b(com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail):void");
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 5 : '=') != '=') {
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
                G = (N + 19) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                N = (G + 113) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            e(new char[]{4, 15, '\b', 1, 15, 6, 2, 1, 1, '\n', 2, '\t', '\n', 2, '\t', 2, 7, 11, '\b', 4, 14, 11, 0, '\f', 1, '\t', '\b', 11}, (byte) (getResources().getString(2131822451).substring(0, 4).length() + 53), TextUtils.getCapsMode("", 0, 0) + 28, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    static /* synthetic */ void e(DetailBerhasilBTActivity detailBerhasilBTActivity) {
        G = (N + 83) % Property.TYPE_ARRAY;
        detailBerhasilBTActivity.y();
        int i = N + 5;
        G = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public static void e(LogRedirector.Logger logger) {
        try {
            try {
                N = (G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
                logger.a();
                int i = G + 101;
                N = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '2' : '@') != '@') {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) {
        int i2;
        String str;
        synchronized (CC23AFormKartuKreditFragment.i) {
            char[] cArr2 = F;
            char c = I;
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

    private void v() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.q;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.x;
        infoDocumentUnderlyingActivity.a = this.H;
        this.r.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        int i = N + 23;
        G = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private void y() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.q;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.u;
        this.v.d(loginasguest);
        int i = N + 35;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? (char) 17 : '\f') == 17) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        N = (G + 63) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.E.setDisplayedChild(1);
        try {
            N = (G + 9) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        N = (G + 11) % Property.TYPE_ARRAY;
        Iterator<DetailTransactionResponse.TxnDataDetail> it = list.iterator();
        while (true) {
            if (!(it.hasNext())) {
                break;
            }
            b(it.next());
        }
        String substring = this.D.substring(0, 3);
        if ((this.B.equalsIgnoreCase("0") ? (char) '\t' : 31) != 31) {
            N = (G + 51) % Property.TYPE_ARRAY;
            if (!substring.equalsIgnoreCase("E96")) {
                int i = G + 45;
                N = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '%' : 30) != 30) {
                    try {
                        this.llBerita.setVisibility(0);
                        this.llCatatan.setVisibility(0);
                        this.llRating.setVisibility(0);
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    this.llBerita.setVisibility(0);
                    this.llCatatan.setVisibility(0);
                    this.llRating.setVisibility(0);
                }
            } else {
                this.llRating.setVisibility(8);
                G = (N + 35) % Property.TYPE_ARRAY;
            }
            this.tvNoReferensi.setText(Html.fromHtml(this.D));
            if (substring.equalsIgnoreCase("E95")) {
                this.llTotalPembayaran.setVisibility(8);
                this.cvInfo.setVisibility(0);
                this.tvTransactionType.setText(this.buktiKirim.toUpperCase());
            } else if (substring.equalsIgnoreCase("E96")) {
                this.cvInfo.setVisibility(0);
                this.tvTransactionType.setText(this.pendebetanDana.toUpperCase());
            } else if (substring.equalsIgnoreCase("E23")) {
                this.cvInfo.setVisibility(0);
                TextView textView = this.tvTransactionType;
                StringBuilder sb = new StringBuilder();
                sb.append(this.pendebetanDana.toUpperCase());
                sb.append(" + ");
                sb.append(this.buktiKirim.toUpperCase());
                textView.setText(sb.toString());
            }
        } else if (substring.equalsIgnoreCase("E23")) {
            int i2 = G + 69;
            N = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                this.tvNoReferensi.setText(Html.fromHtml(this.D));
                throw new ArithmeticException("divide by zero");
            }
            this.tvNoReferensi.setText(Html.fromHtml(this.D));
        } else {
            this.tvNoReferensi.setText(Html.fromHtml(this.y));
        }
        this.E.setDisplayedChild(2);
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
        try {
            G = (N + 81) % Property.TYPE_ARRAY;
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
        N = (G + 71) % Property.TYPE_ARRAY;
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
            int i = N + 43;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'Q' : 6) != 6) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.E = (ViewAnimator) findViewById(2131299751);
        this.r = new DetailTransactionPresenter();
        this.v = new RateTransactionPresenter();
        this.r.e = this;
        this.v.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        Bundle extras = getIntent().getExtras();
        this.q = extras.getString("no_reff", "");
        this.x = extras.getString("token", "");
        this.p = extras.getString("flag_rating", "");
        this.H = extras.getString("TYPE", "");
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ad: INVOKE  
              (wrap: o.LogoutDialog : 0x00a3: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBerhasilBTActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilBTActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x00aa: CONSTRUCTOR  (r1v21 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilBTActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilBTActivity.class
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
            r0.E = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r1 = new com.bca.smartbranch.presenter.DetailTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.r = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r1 = new com.bca.smartbranch.presenter.RateTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.v = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r0 = r0.r
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
            r0.q = r1
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
            r0.p = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "TYPE"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.H = r1
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
            int r0 = com.bca.smartbranch.activity.DetailBerhasilBTActivity.N
            r1 = 41
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilBTActivity.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilBTActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        try {
            int i = N + setHasDecor$MediaBrowserCompat$MediaItem.aM;
            G = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
            }
            this.tvErrorMessage.setText(str);
            this.E.setDisplayedChild(1);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        try {
            int i = N + 5;
            G = i % Property.TYPE_ARRAY;
            boolean z = true;
            if (i % 2 != 0) {
            }
            this.tvErrorMessage.setText(str);
            this.E.setDisplayedChild(1);
            int i2 = N + 89;
            G = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                z = false;
            }
            if (!z) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        int i = N + 93;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '^' : ';') != '^') {
            try {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
                G = (N + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        try {
            N = (G + 47) % Property.TYPE_ARRAY;
            this.E.setDisplayedChild(0);
            try {
                G = (N + 87) % Property.TYPE_ARRAY;
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
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setEnabled(false);
        try {
            int i = G + 35;
            N = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '1' : 14) == '1') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        boolean z2 = false;
        if (z) {
            int i = G + 63;
            N = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                view.getId();
                throw new NullPointerException();
            }
            if (view.getId() != 2131297031) {
                z2 = true;
            }
            if (!z2) {
                N = (G + 25) % Property.TYPE_ARRAY;
                this.tilKomentar.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297031 && this.etKomentar.getText().toString().isEmpty()) {
            this.tilKomentar.setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilBTActivity.e(DetailBerhasilBTActivity.this);
            }
        }).g();
        int i = N + 73;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.r;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        if ((call != null ? (char) 19 : '\n') != '\n') {
            G = (N + 47) % Property.TYPE_ARRAY;
            call.cancel();
            G = (N + 63) % Property.TYPE_ARRAY;
        }
        detailTransactionPresenter.e = null;
        RateTransactionPresenter rateTransactionPresenter = this.v;
        Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
        if ((call2 != null ? '_' : 'B') != 'B') {
            try {
                call2.cancel();
                G = (N + 11) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        }
        rateTransactionPresenter.e = null;
        G = (N + 71) % Property.TYPE_ARRAY;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        N = (G + 3) % Property.TYPE_ARRAY;
        if ((menuItem.getItemId() == 16908332 ? ';' : '?') != ';') {
            return onOptionsItemSelected(menuItem);
        }
        int i = G + 25;
        N = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 22 : '?') != '?') {
            onBackPressed();
            z = false;
        } else {
            onBackPressed();
            z = true;
        }
        N = (G + 71) % Property.TYPE_ARRAY;
        return z;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            G = (N + 95) % Property.TYPE_ARRAY;
            onRequestPermissionsResult(i, strArr, iArr);
            CC23UbahSubMastercardActivity.e(this, i, iArr);
            int i2 = N + 57;
            G = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        try {
            try {
                G = (N + 17) % Property.TYPE_ARRAY;
                setCardSlogan.e().b = "DetailBerhasilBTActivity";
                this.j = "DetailBerhasilBTActivity";
                int i = N + 71;
                G = i % Property.TYPE_ARRAY;
                if (!(i % 2 == 0)) {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (!(((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f)) {
            if (!(this.etKomentar.getText().toString().isEmpty())) {
                y();
                return;
            }
            G = (N + 15) % Property.TYPE_ARRAY;
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
            return;
        }
        G = (N + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
        this.tvErrorKomentar.setVisibility(0);
        this.tvErrorKomentar.setText(2131820982);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = N + 91;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '@' : '.') == '.') {
            return 2131492925;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = G + 7;
        N = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 27 : '/') != 27) {
            try {
                int i2 = G + 113;
                try {
                    N = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 != 0) {
                        return this;
                    }
                    Object[] objArr = null;
                    int length = objArr.length;
                    return this;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OnClick({2131296446})
    public void retry(View view) {
        int i = N + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        G = i % Property.TYPE_ARRAY;
        char c = i % 2 != 0 ? 'N' : 'a';
        v();
        if (c != 'a') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnClick({2131296448})
    public void share(View view) {
        int i = N + 95;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 6 : 'D') == 6 ? Build.VERSION.SDK_INT < 78 : Build.VERSION.SDK_INT < 33) {
            CC23UbahSubMastercardActivity.b(this);
            N = (G + 59) % Property.TYPE_ARRAY;
            return;
        }
        u();
        int i2 = G + 93;
        N = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        int i = G + 77;
        N = i % Property.TYPE_ARRAY;
        boolean z = i % 2 == 0;
        z();
        if (z) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public final void u() {
        int i = G + 53;
        N = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? ',' : 29) != 29) {
            e(b(this.llShare));
            throw new ArithmeticException("divide by zero");
        }
        e(b(this.llShare));
        try {
            try {
                N = (G + 99) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
