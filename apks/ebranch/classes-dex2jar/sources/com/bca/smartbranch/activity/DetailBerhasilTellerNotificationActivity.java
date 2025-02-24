package com.bca.smartbranch.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
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
import java.util.ArrayList;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23AFormKartuKreditFragment;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
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
import o.onClickedYes;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTellerNotificationActivity.class */
public class DetailBerhasilTellerNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int A;
    private static int G;
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
    private String r;
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
    private String v;
    private String w;
    private String x;
    private RateTransactionPresenter y;
    private ViewAnimator z;
    private static char[] C = {13810, 13812, 13823, 13801, 13802, 13748, 13811, 13804, 13800, 13819, 13816, 13817, 13815, 13822, 13806, 13813};
    private static char B = (char) 4;
    private String q = "";
    private setMessage f = new setMessage();
    private boolean s = false;
    private String u = "";
    private String t = "";
    private String p = "IDR";
    private String D = "";
    private String n = "";

    private static Bitmap a(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            G = (A + 25) % Property.TYPE_ARRAY;
            return createBitmap;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void a(byte b, char[] cArr, int i, Object[] objArr) {
        int i2;
        String str;
        synchronized (CC23AFormKartuKreditFragment.i) {
            char[] cArr2 = C;
            char c = B;
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

    static /* synthetic */ void b(DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity) {
        A = (G + 99) % Property.TYPE_ARRAY;
        detailBerhasilTellerNotificationActivity.u();
        try {
            G = (A + 79) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0269, code lost:
        if (r0.equals("Comment") != false) goto L_0x026c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(java.util.List<com.bca.smartbranch.data.api.response.FirebaseResponse.TxnDataDetail> r5) {
        /*
        // Method dump skipped, instructions count: 1975
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.b(java.util.List):void");
    }

    public static void b(LogRedirector.Logger logger) {
        G = (A + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
        logger.a();
        A = (G + 87) % Property.TYPE_ARRAY;
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? 'P' : 'H') != 'P') {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                A = (G + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                G = (A + 75) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            a((byte) (getResources().getString(2131821267).substring(2, 4).codePointAt(0) + 12), new char[]{15, 3, '\r', 4, 11, '\b', '\r', '\t', 0, 15, '\n', '\t', 2, 14, '\t', '\n', 3, '\t', 1, 4, '\b', '\f', 3, 11, 5, 14, 0, '\n'}, getResources().getString(2131821267).substring(2, 4).codePointAt(1) - 87, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            A = (G + 91) % Property.TYPE_ARRAY;
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.q;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.x;
        this.y.d(loginasguest);
        int i = G + 33;
        A = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 15 : 'B') != 'B') {
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
        int i = G + 53;
        A = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '\b' : '6') != '6') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.z = (ViewAnimator) findViewById(2131299751);
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.y = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if ((firebaseResponse == null ? 'W' : 21) != 21) {
            Bundle extras = getIntent().getExtras();
            firebaseResponse2 = firebaseResponse;
            if (extras != null) {
                firebaseResponse2 = new FirebaseResponse();
                firebaseResponse2.setType(extras.getString("Type"));
                firebaseResponse2.setAlert(extras.getString("Alert"));
                firebaseResponse2.setRefNo(extras.getString("RefNo"));
                try {
                    JSONArray jSONArray = new JSONArray(extras.getString("TxnDataDetail"));
                    ArrayList arrayList = new ArrayList();
                    A = (G + 85) % Property.TYPE_ARRAY;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
                        txnDataDetail.setKey(optJSONObject.optString("Key"));
                        txnDataDetail.setValue(optJSONObject.optString("Value"));
                        arrayList.add(txnDataDetail);
                    }
                    firebaseResponse2.setTxnDataDetailList(arrayList);
                    G = (A + 27) % Property.TYPE_ARRAY;
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
            }
        }
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014e: INVOKE  
              (wrap: o.LogoutDialog : 0x0144: IGET  (r0v23 o.LogoutDialog A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x014b: CONSTRUCTOR  (r1v14 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTellerNotificationActivity.class
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
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        G = (A + 49) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        int i = G + 65;
        A = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
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
            G = (A + 29) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        boolean z2 = true;
        if (!(z)) {
            if ((view.getId() == 2131297031 ? 'S' : '/') != '/') {
                G = (A + 15) % Property.TYPE_ARRAY;
                if (!this.etKomentar.getText().toString().isEmpty()) {
                    z2 = false;
                }
                if (z2) {
                    this.tilKomentar.setHintEnabled(false);
                    return;
                }
                return;
            }
            return;
        }
        int i = G + 61;
        A = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            int id = view.getId();
            Object[] objArr = null;
            int length = objArr.length;
            if (id != 2131297031) {
                return;
            }
        } else if (view.getId() != 2131297031) {
            return;
        }
        this.tilKomentar.setHintEnabled(true);
        int i2 = G + 111;
        A = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        try {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailBerhasilTellerNotificationActivity.b(DetailBerhasilTellerNotificationActivity.this);
                }
            }).g();
            G = (A + 39) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r0 != false) goto L_0x0044;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        startActivity(new android.content.Intent(r6, com.bca.smartbranch.activity.LandingActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        o.setOnHierarchyChangeListener.d((android.app.Activity) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        onBackPressed();
        r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G + o.setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
        if ((r0 % 2) == 0) goto L_0x0081;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
        r7 = 'D';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        if (r7 == 'D') goto L_0x008a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        r0 = null;
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r6.h.equalsIgnoreCase("") != false) goto L_0x0044;
     */
    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onBackPressed() {
        /*
            r6 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G
            r1 = 25
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 13
            r7 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 89
            r7 = r0
        L_0x001e:
            r0 = r7
            r1 = 13
            if (r0 == r1) goto L_0x0033
            r0 = r6
            java.lang.String r0 = r0.h
            java.lang.String r1 = ""
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0062
            goto L_0x0044
        L_0x0033:
            r0 = r6
            java.lang.String r0 = r0.h
            java.lang.String r1 = ""
            boolean r0 = r0.equalsIgnoreCase(r1)
            r8 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0091
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0062
        L_0x0044:
            r0 = r6
            android.content.Intent r1 = new android.content.Intent
            r2 = r1
            r3 = r6
            java.lang.Class<com.bca.smartbranch.activity.LandingActivity> r4 = com.bca.smartbranch.activity.LandingActivity.class
            r2.<init>(r3, r4)
            r0.startActivity(r1)
            r0 = r6
            r1 = 2130772009(0x7f010029, float:1.7147124E38)
            r2 = 2130772012(0x7f01002c, float:1.714713E38)
            r0.overridePendingTransition(r1, r2)
            r0 = r6
            o.setOnHierarchyChangeListener.d(r0)
            return
        L_0x0062:
            r0 = r6
            r0.onBackPressed()
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G
            r1 = 119(0x77, float:1.67E-43)
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0081
            r0 = 68
            r7 = r0
            goto L_0x0083
        L_0x0081:
            r0 = 5
            r7 = r0
        L_0x0083:
            r0 = r7
            r1 = 68
            if (r0 == r1) goto L_0x008a
            return
        L_0x008a:
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x008e
            r7 = r0
            return
        L_0x008e:
            r9 = move-exception
            r0 = r9
            throw r0
        L_0x0091:
            r9 = move-exception
            r0 = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.onBackPressed():void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        try {
            int i = G + 65;
            try {
                A = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? '3' : '0') != '0') {
                    onDestroy();
                    Call<OpenAccountSuccessActivity<Object>> call = this.y.a;
                    throw new ArithmeticException("divide by zero");
                }
                onDestroy();
                RateTransactionPresenter rateTransactionPresenter = this.y;
                Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
                RateTransactionPresenter rateTransactionPresenter2 = rateTransactionPresenter;
                if ((call2 != null ? ',' : '(') != '(') {
                    call2.cancel();
                    A = (G + 113) % Property.TYPE_ARRAY;
                    rateTransactionPresenter2 = rateTransactionPresenter;
                }
                rateTransactionPresenter2.e = null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if ((r0 != 16908332) != true) goto L_0x0050;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        onBackPressed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        r0 = onOptionsItemSelected(r4);
        r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A + 89;
        com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        if ((r0 % 2) != 0) goto L_0x007d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r4.getItemId() == 16908332) goto L_0x0050;
     */
    @Override // android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onOptionsItemSelected(android.view.MenuItem r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G
            r1 = 91
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 42
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 57
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 42
            if (r0 == r1) goto L_0x0033
            r0 = r4
            int r0 = r0.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto L_0x0056
            goto L_0x0050
        L_0x0033:
            r0 = r4
            int r0 = r0.getItemId()
            r6 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0080
            r5 = r0
            r0 = r6
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto L_0x0049
            r0 = 0
            r5 = r0
            goto L_0x004b
        L_0x0049:
            r0 = 1
            r5 = r0
        L_0x004b:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x0056
        L_0x0050:
            r0 = r3
            r0.onBackPressed()
            r0 = 1
            return r0
        L_0x0056:
            r0 = r3
            r1 = r4
            boolean r0 = r0.onOptionsItemSelected(r1)
            r7 = r0
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A
            r1 = 89
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x007d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x007a
            r1 = r0
            r1.<init>()     // Catch: all -> 0x007a
            throw r0     // Catch: all -> 0x007a
        L_0x007a:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x007d:
            r0 = r7
            return r0
        L_0x0080:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = A + 37;
        G = i2 % Property.TYPE_ARRAY;
        boolean z = false;
        if (i2 % 2 == 0) {
            onRequestPermissionsResult(i, strArr, iArr);
            onClickedYes.b(this, i, iArr);
            throw new NullPointerException();
        }
        onRequestPermissionsResult(i, strArr, iArr);
        onClickedYes.b(this, i, iArr);
        int i3 = G + 71;
        A = i3 % Property.TYPE_ARRAY;
        if (i3 % 2 != 0) {
            z = true;
        }
        if (z) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = A + 31;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 1 : 'F') != 'F') {
            setCardSlogan.e().b = "DetailBerhasilTellerNotificationActivity";
            this.j = "DetailBerhasilTellerNotificationActivity";
            throw new ArithmeticException("divide by zero");
        }
        try {
            setCardSlogan.e().b = "DetailBerhasilTellerNotificationActivity";
            this.j = "DetailBerhasilTellerNotificationActivity";
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r5 != false) goto L_0x00d4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        if ((((o.pilihTipeTujuanTransaksiPenerima) r3.ratingBar).a <= 0.0f) != true) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r3.etKomentar.getText().toString().isEmpty() == false) goto L_0x00cf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820765);
        r3.tilKomentar.setBackgroundResource(2131230870);
        r3.etKomentar.requestFocus();
        r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G + 89;
        com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
        if ((r0 % 2) == 0) goto L_0x00ce;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
        r0 = null;
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820982);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
        return;
     */
    @butterknife.OnClick({2131296440})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void proses(android.view.View r4) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.proses(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = G + 29;
        A = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return 2131492928;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            A = (G + 23) % Property.TYPE_ARRAY;
            int i = A + setHasDecor$MediaBrowserCompat$MediaItem.aI;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '#' : '\f') != '#') {
                return this;
            }
            throw new ArithmeticException("divide by zero");
        } catch (Exception e) {
            throw e;
        }
    }

    public final void s() {
        G = (A + 73) % Property.TYPE_ARRAY;
        d(a(this.llShare));
        G = (A + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 33 ? 'Z' : 'K') != 'Z') goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        o.onClickedYes.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G = (com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A + 33) % io.realm.internal.Property.TYPE_ARRAY;
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ((android.os.Build.VERSION.SDK_INT < 126) != true) goto L_0x004a;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G
            r1 = 107(0x6b, float:1.5E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x002c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 < r1) goto L_0x0022
            r0 = 0
            r5 = r0
            goto L_0x0024
        L_0x0022:
            r0 = 1
            r5 = r0
        L_0x0024:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x0045
            goto L_0x004a
        L_0x002c:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x005e
            r5 = r0
            r0 = r5
            r1 = 33
            if (r0 < r1) goto L_0x003c
            r0 = 90
            r5 = r0
            goto L_0x003f
        L_0x003c:
            r0 = 75
            r5 = r0
        L_0x003f:
            r0 = r5
            r1 = 90
            if (r0 == r1) goto L_0x004a
        L_0x0045:
            r0 = r3
            o.onClickedYes.b(r0)
            return
        L_0x004a:
            int r0 = com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.A
            r1 = 33
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.G = r0
            r0 = r3
            r0.s()
            return
        L_0x005e:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        try {
            int i = G + 5;
            A = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z();
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                z();
            }
            int i2 = G + 11;
            A = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? 'P' : '?') == 'P') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
