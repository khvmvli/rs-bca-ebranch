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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
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
import o.CC24SubMastercardInfoActivity_ViewBinding;
import o.CC25CFormKartuKreditFragment;
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
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setInputType;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnHierarchyChangeListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTarikanNotificationActivity.class */
public class DetailBerhasilTarikanNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static char[] A = {'Z', 187, 192, 159, 154, 180, 180, 153, 162, 194, 185, 187, 197, 189, 188, 187, 185, 186, 183, 157, 161, 195, 194, 196, 193, 184, 182, 189};
    private static int B;
    private static int z;
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
    private String p;
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
    private ViewAnimator u;
    private String v;
    private String w;
    private RateTransactionPresenter y;
    private String s = "";
    private setMessage f = new setMessage();
    private boolean t = false;
    private String x = "";
    private String n = "";
    private String q = "IDR";

    static /* synthetic */ void a(DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity) {
        z = (B + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
        detailBerhasilTarikanNotificationActivity.v();
        z = (B + 57) % Property.TYPE_ARRAY;
    }

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
                int i = B + 23;
                z = i % Property.TYPE_ARRAY;
                if (!(i % 2 != 0)) {
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
            e(false, new int[]{0, 28, 82, 0}, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            z = (B + 37) % Property.TYPE_ARRAY;
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(FirebaseResponse.TxnDataDetail txnDataDetail) {
        char c;
        char c2;
        String key = txnDataDetail.getKey();
        key.hashCode();
        char c3 = '=';
        switch (key.hashCode()) {
            case -2053478804:
                if (key.equals("StatusType")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1854235203:
                if (key.equals("Rating")) {
                    B = (z + 61) % Property.TYPE_ARRAY;
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1808614382:
                if (key.equals("Status")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1679915457:
                if (!(!key.equals("Comment"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1238485368:
                if (key.equals("Transaksi")) {
                    B = (z + 25) % Property.TYPE_ARRAY;
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
            case -507420484:
                if (key.equals("Nominal")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 74230:
                if (key.equals("Jam")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 80988633:
                if (key.equals("Token")) {
                    int i = z + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
                    B = i % Property.TYPE_ARRAY;
                    if (i % 2 == 0) {
                        c = '\b';
                        break;
                    } else {
                        c = 'H';
                        break;
                    }
                }
                c = 65535;
                break;
            case 122683404:
                if (key.equals("Tanggal")) {
                    c3 = 'N';
                }
                if (c3 == 'N') {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 981984652:
                if (key.equals("Penarik")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1260938190:
                if (key.equals("Nomor Referensi")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1950516649:
                if (!(!key.equals("Kode Mata Uang"))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1963638442:
                if (key.equals("Alasan")) {
                    int i2 = B + 31;
                    z = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 != 0) {
                        c = '\r';
                        break;
                    } else {
                        c = '0';
                        break;
                    }
                }
                c = 65535;
                break;
            case 2010750902:
                if (!(!key.equals("Cabang"))) {
                    c = 14;
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
                        c2 = 65535;
                        if (value.equals("1")) {
                            c2 = 1;
                            break;
                        }
                        break;
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
                    this.t = true;
                    this.llRating.setVisibility(0);
                    this.btnShare.setVisibility(0);
                    this.btnProses.setEnabled(true);
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
                    z = (B + 43) % Property.TYPE_ARRAY;
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
                this.x = txnDataDetail.getValue();
                return;
            case 6:
                this.w = txnDataDetail.getValue();
                return;
            case 7:
                this.p = txnDataDetail.getValue();
                return;
            case '\b':
                this.r = txnDataDetail.getValue();
                return;
            case '\t':
                this.v = txnDataDetail.getValue();
                return;
            case '\n':
                this.tvNama.setText(txnDataDetail.getValue());
                return;
            case 11:
                this.tvNoReferensi.setText(Html.fromHtml(txnDataDetail.getValue()));
                return;
            case '\f':
                this.q = txnDataDetail.getValue();
                return;
            case '\r':
                try {
                    try {
                        this.etAlasan.setText(txnDataDetail.getValue());
                        this.tilAlasan.setHintEnabled(true);
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            case 14:
                this.n = txnDataDetail.getValue();
                return;
            default:
                return;
        }
    }

    public static void d(LogRedirector.Logger logger) {
        try {
            int i = B + 25;
            z = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                logger.a();
                throw new ArithmeticException("divide by zero");
            }
            logger.a();
            B = (z + 15) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    private static Bitmap e(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        z = (B + 39) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    private static void e(boolean z2, int[] iArr, byte[] bArr, Object[] objArr) {
        String str;
        synchronized (CC25CFormKartuKreditFragment.b) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(A, i, cArr, 0, i2);
            char[] cArr2 = cArr;
            if (bArr != null) {
                cArr2 = new char[i2];
                CC25CFormKartuKreditFragment.d = 0;
                char c = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    if (bArr[CC25CFormKartuKreditFragment.d] == 1) {
                        cArr2[CC25CFormKartuKreditFragment.d] = (char) ((char) (((cArr[CC25CFormKartuKreditFragment.d] << 1) + 1) - c));
                    } else {
                        cArr2[CC25CFormKartuKreditFragment.d] = (char) ((char) ((cArr[CC25CFormKartuKreditFragment.d] << 1) - c));
                    }
                    c = cArr2[CC25CFormKartuKreditFragment.d];
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr2, i5, i4);
                System.arraycopy(cArr3, i4, cArr2, 0, i5);
            }
            char[] cArr4 = cArr2;
            if (z2) {
                cArr4 = new char[i2];
                CC25CFormKartuKreditFragment.d = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    cArr4[CC25CFormKartuKreditFragment.d] = (char) cArr2[(i2 - CC25CFormKartuKreditFragment.d) - 1];
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            if (i3 > 0) {
                CC25CFormKartuKreditFragment.d = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    cArr4[CC25CFormKartuKreditFragment.d] = (char) ((char) (cArr4[CC25CFormKartuKreditFragment.d] - iArr[2]));
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            str = new String(cArr4);
        }
        objArr[0] = str;
    }

    private void u() {
        try {
            z = (B + 37) % Property.TYPE_ARRAY;
            FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
            boolean z2 = true;
            FirebaseResponse firebaseResponse2 = firebaseResponse;
            if (!(firebaseResponse != null)) {
                z = (B + 11) % Property.TYPE_ARRAY;
                try {
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
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
                                txnDataDetail.setKey(optJSONObject.optString("Key"));
                                txnDataDetail.setValue(optJSONObject.optString("Value"));
                                arrayList.add(txnDataDetail);
                            }
                            firebaseResponse2.setTxnDataDetailList(arrayList);
                            B = (z + 31) % Property.TYPE_ARRAY;
                        } catch (JSONException e) {
                            Log.i("EBRANCH", String.valueOf(e));
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            this.etKomentar.addTextChangedListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011f: INVOKE  
                  (wrap: o.LogoutDialog : 0x0115: IGET  (r0v15 o.LogoutDialog A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.etKomentar o.LogoutDialog)
                  (wrap: o.getPromotion$3 : 0x011c: CONSTRUCTOR  (r1v4 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.u():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTarikanNotificationActivity.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:301)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                	... 21 more
                */
            /*
            // Method dump skipped, instructions count: 730
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.u():void");
        }

        private void v() {
            loginAsGuest loginasguest = new loginAsGuest();
            try {
                loginasguest.c = this.s;
                loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
                loginasguest.a = this.etKomentar.getText().toString();
                loginasguest.b = this.r;
                this.y.d(loginasguest);
                int i = z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
                B = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? 'V' : 7) != 7) {
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
            int i = B + 45;
            z = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new NullPointerException();
            }
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        public final void d(Bundle bundle) {
            d(bundle);
            this.u = (ViewAnimator) findViewById(2131299751);
            b(this.toolbar);
            i();
            i().d(true);
            i().d("");
            this.txtToolbarTitle.setText("Bukti Transaksi");
            RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
            this.y = rateTransactionPresenter;
            rateTransactionPresenter.e = this;
            u();
            B = (z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        }

        @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void g(String str) {
            try {
                int i = B + 99;
                z = i % Property.TYPE_ARRAY;
                if (!(i % 2 != 0)) {
                    x();
                    KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
                    Object[] objArr = null;
                    int length = objArr.length;
                    return;
                }
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
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
            this.ratingBar.setClickable(false);
            this.ratingBar.setScrollable(false);
            this.etKomentar.setFocusable(false);
            this.etKomentar.setFocusableInTouchMode(false);
            this.etKomentar.setLongClickable(false);
            this.etKomentar.setEnabled(false);
            this.btnProses.setVisibility(8);
            int i = z + setHasDecor$MediaBrowserCompat$MediaItem.aM;
            B = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
        }

        @OnFocusChange({2131297031})
        public void inputChange(View view, boolean z2) {
            int i = z + 31;
            B = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                if ((z2 ? 'C' : ';') != ';') {
                    if (view.getId() == 2131297031) {
                        this.tilKomentar.setHintEnabled(true);
                    }
                } else if (view.getId() == 2131297031) {
                    B = (z + 63) % Property.TYPE_ARRAY;
                    if (this.etKomentar.getText().toString().isEmpty()) {
                        this.tilKomentar.setHintEnabled(false);
                        z = (B + 97) % Property.TYPE_ARRAY;
                    }
                }
            } else {
                throw new NullPointerException();
            }
        }

        @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void j(String str) {
            try {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DetailBerhasilTarikanNotificationActivity.a(DetailBerhasilTarikanNotificationActivity.this);
                    }
                }).g();
                int i = B + 93;
                z = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '9' : 'N') != 'N') {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        }

        @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
        public void onBackPressed() {
            B = (z + 3) % Property.TYPE_ARRAY;
            if (this.h.equalsIgnoreCase("")) {
                startActivity(new Intent(this, LandingActivity.class));
                overridePendingTransition(2130772009, 2130772012);
                setOnHierarchyChangeListener.d((Activity) this);
                int i = B + 89;
                z = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return;
                }
                return;
            }
            onBackPressed();
        }

        @Override // android.app.Activity
        public boolean onCreateOptionsMenu(Menu menu) {
            boolean z2;
            int i = B + 17;
            z = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 'H' : '&') != '&') {
                getMenuInflater().inflate(2131558410, menu);
                z2 = false;
            } else {
                getMenuInflater().inflate(2131558410, menu);
                z2 = true;
            }
            return z2;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
        public void onDestroy() {
            try {
                z = (B + 61) % Property.TYPE_ARRAY;
                onDestroy();
                RateTransactionPresenter rateTransactionPresenter = this.y;
                Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
                if ((call != null ? 23 : '9') != '9') {
                    z = (B + 79) % Property.TYPE_ARRAY;
                    call.cancel();
                    z = (B + 19) % Property.TYPE_ARRAY;
                }
                rateTransactionPresenter.e = null;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            int i = B + 23;
            z = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                menuItem.getItemId();
                throw new NullPointerException();
            } else if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                B = (z + 51) % Property.TYPE_ARRAY;
                return true;
            } else if (menuItem.getItemId() != 2131298038) {
                return onOptionsItemSelected(menuItem);
            } else {
                startActivity(new Intent(this, MainActivity.class));
                overridePendingTransition(2130772009, 2130772012);
                int i2 = z + 75;
                B = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw new ArithmeticException("divide by zero");
            }
        }

        @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            int i2 = z + 97;
            B = i2 % Property.TYPE_ARRAY;
            if (!(i2 % 2 == 0)) {
                onRequestPermissionsResult(i, strArr, iArr);
                CC24SubMastercardInfoActivity_ViewBinding.a(this, i, iArr);
                throw new ArithmeticException("divide by zero");
            }
            onRequestPermissionsResult(i, strArr, iArr);
            CC24SubMastercardInfoActivity_ViewBinding.a(this, i, iArr);
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            try {
                B = (z + 77) % Property.TYPE_ARRAY;
                setCardSlogan.e().b = "DetailBerhasilTarikanNotificationActivity";
                this.j = "DetailBerhasilTarikanNotificationActivity";
                B = (z + 59) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        }

        @OnClick({2131296440})
        public void proses(View view) {
            B = (z + 99) % Property.TYPE_ARRAY;
            this.tvErrorKomentar.setVisibility(8);
            this.tilKomentar.setBackgroundResource(2131230847);
            if (!(((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f)) {
                if (!(this.etKomentar.getText().toString().isEmpty())) {
                    v();
                    return;
                }
                B = (z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
                this.tvErrorKomentar.setVisibility(0);
                this.tvErrorKomentar.setText(2131820765);
                this.tilKomentar.setBackgroundResource(2131230870);
                this.etKomentar.requestFocus();
                return;
            }
            z = (B + 113) % Property.TYPE_ARRAY;
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820982);
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            int i = z + 53;
            B = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'a' : '6') != 'a') {
                return 2131492927;
            }
            throw new NullPointerException();
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            z = (B + 67) % Property.TYPE_ARRAY;
            try {
                int i = B + 11;
                try {
                    z = i % Property.TYPE_ARRAY;
                    if ((i % 2 == 0 ? 'V' : '.') == '.') {
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
        }

        public final void s() {
            int i = z + setHasDecor$MediaBrowserCompat$MediaItem.aN;
            B = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 26 : 'I') != 'I') {
                b(e(this.llShare));
                throw new NullPointerException();
            }
            try {
                b(e(this.llShare));
            } catch (Exception e) {
                throw e;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((android.os.Build.VERSION.SDK_INT < 33) != true) goto L_0x007b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
            if ((android.os.Build.VERSION.SDK_INT >= 52) != true) goto L_0x004f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
            o.CC24SubMastercardInfoActivity_ViewBinding.d(r3);
            r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.B + 41;
            com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.z = r0 % io.realm.internal.Property.TYPE_ARRAY;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
            if ((r0 % 2) != 0) goto L_0x006d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
            if (r5 == false) goto L_0x0074;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
            r0 = null;
            r0 = r0.length;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
            s();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
            com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.z = (com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.B + 65) % io.realm.internal.Property.TYPE_ARRAY;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
            return;
         */
        @butterknife.OnClick({2131296448})
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void share(android.view.View r4) {
            /*
                r3 = this;
                int r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.z
                r1 = 13
                int r0 = r0 + r1
                r5 = r0
                r0 = r5
                r1 = 128(0x80, float:1.8E-43)
                int r0 = r0 % r1
                com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.B = r0
                r0 = 0
                r6 = r0
                r0 = r5
                r1 = 2
                int r0 = r0 % r1
                if (r0 == 0) goto L_0x001c
                r0 = 0
                r5 = r0
                goto L_0x001e
            L_0x001c:
                r0 = 1
                r5 = r0
            L_0x001e:
                r0 = r5
                if (r0 == 0) goto L_0x0039
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x008f
                r1 = 33
                if (r0 < r1) goto L_0x002f
                r0 = 0
                r5 = r0
                goto L_0x0031
            L_0x002f:
                r0 = 1
                r5 = r0
            L_0x0031:
                r0 = r5
                r1 = 1
                if (r0 == r1) goto L_0x004f
                goto L_0x007b
            L_0x0039:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x008f
                r5 = r0
                r0 = r5
                r1 = 52
                if (r0 < r1) goto L_0x0048
                r0 = 1
                r5 = r0
                goto L_0x004a
            L_0x0048:
                r0 = 0
                r5 = r0
            L_0x004a:
                r0 = r5
                r1 = 1
                if (r0 == r1) goto L_0x007b
            L_0x004f:
                r0 = r3
                o.CC24SubMastercardInfoActivity_ViewBinding.d(r0)
                int r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.B
                r1 = 41
                int r0 = r0 + r1
                r5 = r0
                r0 = r5
                r1 = 128(0x80, float:1.8E-43)
                int r0 = r0 % r1
                com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.z = r0
                r0 = r5
                r1 = 2
                int r0 = r0 % r1
                if (r0 != 0) goto L_0x006d
                r0 = r6
                r5 = r0
                goto L_0x006f
            L_0x006d:
                r0 = 1
                r5 = r0
            L_0x006f:
                r0 = r5
                if (r0 == 0) goto L_0x0074
                return
            L_0x0074:
                r0 = 0
                int r0 = r0.length     // Catch: all -> 0x0078
                r5 = r0
                return
            L_0x0078:
                r4 = move-exception
                r0 = r4
                throw r0
            L_0x007b:
                r0 = r3
                r0.s()     // Catch: Exception -> 0x008f
                int r0 = com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.B     // Catch: Exception -> 0x008f
                r5 = r0
                int r5 = r5 + 65
                r0 = r5
                r1 = 128(0x80, float:1.8E-43)
                int r0 = r0 % r1
                com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.z = r0     // Catch: Exception -> 0x008f
                return
            L_0x008f:
                r4 = move-exception
                r0 = r4
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity.share(android.view.View):void");
        }

        @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void t() {
            B = (z + 73) % Property.TYPE_ARRAY;
            z();
            int i = z + 5;
            B = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                throw new ArithmeticException("divide by zero");
            }
        }
    }
