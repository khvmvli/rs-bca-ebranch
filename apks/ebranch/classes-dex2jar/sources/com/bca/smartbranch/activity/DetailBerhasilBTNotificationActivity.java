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
import android.widget.ListView;
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
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC25BFormKartuKreditFragment;
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
import o.setSplitTrack;
import o.subscribeChooseUbahMastercardEvent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilBTNotificationActivity.class */
public class DetailBerhasilBTNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int B;
    private static long D;
    private static int F;
    private String A;
    private String C;
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
    private RateTransactionPresenter r;
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
    private String v;
    private String w;
    private String x;
    private String y;
    private ViewAnimator z;
    private setMessage f = new setMessage();
    private boolean t = false;
    private List<FirebaseResponse.ValueTxnDataDetail> s = new ArrayList();

    private static void a(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC25BFormKartuKreditFragment.b) {
            CC25BFormKartuKreditFragment.d = i;
            char[] cArr2 = new char[cArr.length];
            CC25BFormKartuKreditFragment.a = 0;
            while (CC25BFormKartuKreditFragment.a < cArr.length) {
                cArr2[CC25BFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (cArr[CC25BFormKartuKreditFragment.a] ^ (CC25BFormKartuKreditFragment.a * CC25BFormKartuKreditFragment.d))) ^ D)));
                CC25BFormKartuKreditFragment.a++;
            }
            str = new String(cArr2);
        }
        objArr[0] = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d6, code lost:
        if (r0.equals("Total Nominal") != false) goto L_0x030b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(com.bca.smartbranch.data.api.response.FirebaseResponse.TxnDataDetail r8) {
        /*
        // Method dump skipped, instructions count: 2621
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.b(com.bca.smartbranch.data.api.response.FirebaseResponse$TxnDataDetail):void");
    }

    private void b(List<FirebaseResponse.TxnDataDetail> list) {
        for (FirebaseResponse.TxnDataDetail txnDataDetail : list) {
            b(txnDataDetail);
        }
        String substring = this.w.substring(0, 3);
        if ((this.v.equalsIgnoreCase("0") ? '?' : 14) == '?') {
            try {
                if ((!substring.equalsIgnoreCase("E96") ? 'H' : 'Z') != 'Z') {
                    int i = F + 59;
                    B = i % Property.TYPE_ARRAY;
                    if (i % 2 != 0) {
                        try {
                            this.llBerita.setVisibility(0);
                            this.llCatatan.setVisibility(1);
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        this.llBerita.setVisibility(0);
                        this.llCatatan.setVisibility(0);
                    }
                } else {
                    this.llRating.setVisibility(8);
                }
                this.tvNoReferensi.setText(Html.fromHtml(this.w));
                if (substring.equalsIgnoreCase("E95")) {
                    F = (B + 35) % Property.TYPE_ARRAY;
                    this.llTotalPembayaran.setVisibility(8);
                    this.cvInfo.setVisibility(0);
                    this.tvTransactionType.setText(this.buktiKirim.toUpperCase());
                } else if (substring.equalsIgnoreCase("E96")) {
                    B = (F + 47) % Property.TYPE_ARRAY;
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
            } catch (Exception e2) {
                throw e2;
            }
        } else if (substring.equalsIgnoreCase("E23")) {
            B = (F + 111) % Property.TYPE_ARRAY;
            this.tvNoReferensi.setText(Html.fromHtml(this.w));
        } else {
            this.tvNoReferensi.setText(Html.fromHtml(this.x));
        }
        this.z.setDisplayedChild(2);
    }

    public static void b(LogRedirector.Logger logger) {
        int i = B + 47;
        F = i % Property.TYPE_ARRAY;
        boolean z = i % 2 != 0;
        logger.a();
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private static Bitmap c(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        try {
            int i = F + 57;
            B = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                return createBitmap;
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ void c(DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity) {
        try {
            try {
                F = (B + 113) % Property.TYPE_ARRAY;
                detailBerhasilBTNotificationActivity.u();
                int i = B + 21;
                F = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 'K' : 31) != 31) {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT >= 29) {
            int i = F + 73;
            B = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '\r' : '-') != '-') {
                uri = getPromotion.c(this, bitmap, obj);
                String path = uri.getPath();
                String[] strArr = new String[0];
                strArr[0] = "image/jpeg";
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
                F = (B + 71) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                F = (B + 55) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            a(new char[]{61132, 11447, 27180, 43492, 59153, 8863, 24580, 49088, 64868, 14573, 30312, 46528, 62287, 3782, 19551, 35383, 51633, 1835, 17049, 32852, 57235, 7454, 22778, 38504, 54766, 4948, 11996, 27728}, getApplicationInfo().targetSdkVersion + 49749, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        int i2 = B + 73;
        F = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? 'a' : '\'') == 'a') {
            Object[] objArr2 = null;
            int length = objArr2.length;
        }
    }

    private void u() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.q;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.p;
        this.r.d(loginasguest);
        try {
            int i = F + 45;
            B = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                throw new NullPointerException();
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
        int i = B + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        d(bundle);
        this.z = (ViewAnimator) findViewById(2131299751);
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.r = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        if ((firebaseResponse == null ? '?' : '(') == '?') {
            B = (F + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                FirebaseResponse firebaseResponse2 = new FirebaseResponse();
                firebaseResponse2.setType(extras.getString("Type"));
                firebaseResponse2.setAlert(extras.getString("Alert"));
                firebaseResponse2.setRefNo(extras.getString("RefNo"));
                try {
                    jSONArray = new JSONArray(extras.getString("TxnDataDetail"));
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                    jSONArray = null;
                }
                ArrayList arrayList = new ArrayList();
                B = (F + 115) % Property.TYPE_ARRAY;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
                    txnDataDetail.setKey(optJSONObject.optString("Key"));
                    txnDataDetail.setValue(optJSONObject.optString("Value"));
                    JSONArray optJSONArray = optJSONObject.optJSONArray("ValueArray");
                    if (optJSONArray != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail = new FirebaseResponse.ValueTxnDataDetail();
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                            try {
                                str = optJSONObject2.getString("TxnType");
                            } catch (JSONException e2) {
                                str = null;
                            }
                            try {
                                str2 = optJSONObject2.getString("AccountNumber");
                            } catch (JSONException e3) {
                                str2 = null;
                            }
                            try {
                                str3 = optJSONObject2.getString("BankName");
                            } catch (JSONException e4) {
                                str3 = null;
                            }
                            try {
                                str4 = optJSONObject2.getString("Amount");
                            } catch (JSONException e5) {
                                str4 = null;
                            }
                            try {
                                str5 = optJSONObject2.getString("ReceiverName");
                                F = (B + 81) % Property.TYPE_ARRAY;
                            } catch (JSONException e6) {
                                str5 = null;
                            }
                            valueTxnDataDetail.setTxnType(str);
                            valueTxnDataDetail.setAccountNumber(str2);
                            valueTxnDataDetail.setBankName(str3);
                            valueTxnDataDetail.setAmount(str4);
                            valueTxnDataDetail.setReceiverName(str5);
                            arrayList2.add(valueTxnDataDetail);
                        }
                        txnDataDetail.setValueArray(arrayList2);
                    }
                    arrayList.add(txnDataDetail);
                }
                firebaseResponse2.setTxnDataDetailList(arrayList);
                firebaseResponse = firebaseResponse2;
            }
        }
        this.q = firebaseResponse.getRefNo();
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x022d: INVOKE  
              (wrap: o.LogoutDialog : 0x0223: IGET  (r0v23 o.LogoutDialog A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x022a: CONSTRUCTOR  (r1v16 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilBTNotificationActivity.class
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
        // Method dump skipped, instructions count: 583
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        int i = B + 83;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '\"' : '-') != '-') {
            try {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
                throw new ArithmeticException("divide by zero");
            } catch (Exception e) {
                throw e;
            }
        } else {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
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
        int i = F + 73;
        B = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        F = (B + 7) % Property.TYPE_ARRAY;
        boolean z2 = true;
        if (z) {
            if (view.getId() == 2131297031) {
                this.tilKomentar.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297031) {
            int i = F + 93;
            B = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z2 = false;
            }
            if (!z2) {
                boolean isEmpty = this.etKomentar.getText().toString().isEmpty();
                Object[] objArr = null;
                int length = objArr.length;
                if ((isEmpty ? '>' : 'H') == 'H') {
                    return;
                }
            } else if (!this.etKomentar.getText().toString().isEmpty()) {
                return;
            }
            this.tilKomentar.setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        try {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailBerhasilBTNotificationActivity.c(DetailBerhasilBTNotificationActivity.this);
                }
            }).g();
            F = (B + 77) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        B = (F + 53) % Property.TYPE_ARRAY;
        onDestroy();
        RateTransactionPresenter rateTransactionPresenter = this.r;
        Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
        if ((call != null ? (char) 7 : 30) == 7) {
            call.cancel();
        }
        rateTransactionPresenter.e = null;
        int i = B + 39;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = false;
        if ((menuItem.getItemId() == 16908332 ? 'D' : 31) != 'D') {
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            int i = B + 61;
            F = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                return onOptionsItemSelected;
            }
            throw new NullPointerException();
        }
        int i2 = B + 15;
        F = i2 % Property.TYPE_ARRAY;
        boolean z2 = i2 % 2 != 0;
        onBackPressed();
        return z2;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        F = (B + 115) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        subscribeChooseUbahMastercardEvent.c(this, i, iArr);
        B = (F + 65) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        B = (F + 41) % Property.TYPE_ARRAY;
        setCardSlogan.e().b = "DetailBerhasilBTNotificationActivity";
        this.j = "DetailBerhasilBTNotificationActivity";
        try {
            int i = B + 93;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 'W' : '\f') == 'W') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        if ((((o.pilihTipeTujuanTransaksiPenerima) r3.ratingBar).a <= 0.0f ? '\\' : 15) != 15) goto L_0x00f0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
        if ((((o.pilihTipeTujuanTransaksiPenerima) r3.ratingBar).a <= 0.0f) != true) goto L_0x0080;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        if (r3.etKomentar.getText().toString().isEmpty() == false) goto L_0x0096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
        r5 = '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        r5 = '\"';
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
        if (r5 == '\"') goto L_0x00eb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
        r0 = com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.B + 11;
        com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.F = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
        if ((r0 % 2) != 0) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820765);
        r3.tilKomentar.setBackgroundResource(2131230870);
        r3.etKomentar.requestFocus();
        com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.B = (com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.F + 19) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
        r3.tvErrorKomentar.setVisibility(0);
        r3.tvErrorKomentar.setText(2131820982);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
        return;
     */
    @butterknife.OnClick({2131296440})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void proses(android.view.View r4) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.proses(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        B = (F + 67) % Property.TYPE_ARRAY;
        B = (F + 99) % Property.TYPE_ARRAY;
        return 2131492925;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = F + 79;
        B = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '.' : 'S') != '.') {
            return this;
        }
        throw new ArithmeticException("divide by zero");
    }

    public final void s() {
        F = (B + 91) % Property.TYPE_ARRAY;
        try {
            try {
                d(c(this.llShare));
                F = (B + 27) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if ((android.os.Build.VERSION.SDK_INT < 33) != false) goto L_0x0049;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 89) goto L_0x0044;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        o.subscribeChooseUbahMastercardEvent.e(r3);
        com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.F = (com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.B + 7) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.B
            r1 = 123(0x7b, float:1.72E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.F = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001b
            r0 = 48
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 54
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 48
            if (r0 == r1) goto L_0x003a
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x005d
            r1 = 33
            if (r0 < r1) goto L_0x0031
            r0 = 0
            r5 = r0
            goto L_0x0033
        L_0x0031:
            r0 = 1
            r5 = r0
        L_0x0033:
            r0 = r5
            if (r0 == 0) goto L_0x0044
            goto L_0x0049
        L_0x003a:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x005d
            r5 = r0
            r0 = r5
            r1 = 89
            if (r0 < r1) goto L_0x0049
        L_0x0044:
            r0 = r3
            r0.s()
            return
        L_0x0049:
            r0 = r3
            o.subscribeChooseUbahMastercardEvent.e(r0)
            int r0 = com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.B
            r1 = 7
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.F = r0
            return
        L_0x005d:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        B = (F + 17) % Property.TYPE_ARRAY;
        z();
        int i = F + 49;
        B = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'J' : 0) != 0) {
            throw new NullPointerException();
        }
    }
}
