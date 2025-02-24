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
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23CFormKartuKreditFragment_ViewBinding;
import o.CC24SubMastercardInfoActivity;
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
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnHierarchyChangeListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilNotificationActivity.class */
public class DetailBerhasilNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int C;
    private static char[] w = {'c', 37832, 10019, 47835, 20222, 57888, 30091, 2495, 40267, 12466, 50407, 22623, 60320, 32537, 4944, 42664, 14878, 52852, 25046, 62795, 35196, 7361, 45109, 17527, 55233, 27435, 65171, 37615};
    private static long x = 6181788342210499495L;
    private static int y;
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
    private String r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private String s;
    private RateTransactionPresenter t;
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
    private ViewAnimator u;
    private String v;
    private String p = "";
    private boolean n = false;
    private String q = "";
    private String f = "";

    private static Bitmap b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        y = (C + 53) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    private static void b(int i, char c, int i2, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment_ViewBinding.b) {
            char[] cArr = new char[i];
            CC23CFormKartuKreditFragment_ViewBinding.a = 0;
            while (CC23CFormKartuKreditFragment_ViewBinding.a < i) {
                cArr[CC23CFormKartuKreditFragment_ViewBinding.a] = (char) ((char) ((int) ((((long) w[CC23CFormKartuKreditFragment_ViewBinding.a + i2]) ^ (((long) CC23CFormKartuKreditFragment_ViewBinding.a) * x)) ^ ((long) c))));
                CC23CFormKartuKreditFragment_ViewBinding.a++;
            }
            str = new String(cArr);
        }
        objArr[0] = str;
    }

    static /* synthetic */ void b(DetailBerhasilNotificationActivity detailBerhasilNotificationActivity) {
        try {
            int i = y + 29;
            C = i % Property.TYPE_ARRAY;
            boolean z = false;
            if (i % 2 != 0) {
                detailBerhasilNotificationActivity.v();
            } else {
                detailBerhasilNotificationActivity.v();
                Object[] objArr = null;
                int length = objArr.length;
            }
            int i2 = y + 113;
            C = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (z) {
                Object[] objArr2 = null;
                int length2 = objArr2.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void c(LogRedirector.Logger logger) {
        int i = C + 113;
        y = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '&' : 29) != 29) {
            logger.a();
            throw new NullPointerException();
        }
        try {
            logger.a();
            C = (y + 17) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? '\r' : ',') != '\r') {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if ((file2.exists() ? '=' : 'U') != 'U') {
                C = (y + 97) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                y = (C + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            b(getPackageName().codePointAt(1) - 83, (char) (getPackageName().length() - 19), getResources().getString(2131821267).substring(2, 4).length() - 2, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            y = (C + 5) % Property.TYPE_ARRAY;
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a1, code lost:
        if (r0.equals("Jam") != false) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void d(java.util.List<com.bca.smartbranch.data.api.response.FirebaseResponse.TxnDataDetail> r5) {
        /*
        // Method dump skipped, instructions count: 1386
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilNotificationActivity.d(java.util.List):void");
    }

    private void v() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.p;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.s;
        this.t.d(loginasguest);
        try {
            y = (C + 33) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            y = (C + 55) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.u = (ViewAnimator) findViewById(2131299751);
        App.d().b(this);
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.t = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        b(this.toolbar);
        i();
        boolean z = true;
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(2131822201);
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if (!(firebaseResponse != null)) {
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
                    C = (y + 101) % Property.TYPE_ARRAY;
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
            }
        }
        if (firebaseResponse2 != null) {
            z = false;
        }
        char c = 17;
        if (!z) {
            C = (y + 17) % Property.TYPE_ARRAY;
            this.p = firebaseResponse2.getRefNo();
            y = (C + 5) % Property.TYPE_ARRAY;
        }
        this.etKomentar.setOnTouchListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x018d: INVOKE  
              (wrap: o.LogoutDialog : 0x0183: IGET  (r0v30 o.LogoutDialog A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.DetailBerhasilNotificationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilNotificationActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$4 : 0x018a: CONSTRUCTOR  (r1v15 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.activity.DetailBerhasilNotificationActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilNotificationActivity.class
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
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilNotificationActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        y = (C + 53) % Property.TYPE_ARRAY;
        try {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
            int i = C + 101;
            y = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? (char) 27 : 26) == 27) {
                Object[] objArr = null;
                int length = objArr.length;
            }
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
        bundle.putBoolean("isMessageSuccess", true);
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
        y = (C + 1) % Property.TYPE_ARRAY;
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        boolean z2 = true;
        if (!z) {
            if ((view.getId() == 2131297031 ? '\t' : '0') != '0') {
                if (this.etKomentar.getText().toString().isEmpty()) {
                    z2 = false;
                }
                if (!z2) {
                    this.tilKomentar.setHintEnabled(false);
                    return;
                }
                return;
            }
            return;
        }
        y = (C + 7) % Property.TYPE_ARRAY;
        if (view.getId() == 2131297031) {
            int i = y + 101;
            C = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
            }
            this.tilKomentar.setHintEnabled(true);
            y = (C + 25) % Property.TYPE_ARRAY;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilNotificationActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilNotificationActivity.b(DetailBerhasilNotificationActivity.this);
            }
        }).g();
        y = (C + 5) % Property.TYPE_ARRAY;
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        int i = C + 43;
        y = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? (char) 29 : 11) != 11) {
            this.h.equalsIgnoreCase("");
            throw new NullPointerException();
        } else if (this.h.equalsIgnoreCase("")) {
            startActivity(new Intent(this, LandingActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
            int i2 = y + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
            C = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                throw new NullPointerException();
            }
        } else {
            onBackPressed();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = y + 7;
        C = i % Property.TYPE_ARRAY;
        boolean z = false;
        if (i % 2 != 0) {
            onDestroy();
            RateTransactionPresenter rateTransactionPresenter = this.t;
            Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
            if (call != null) {
                z = true;
            }
            RateTransactionPresenter rateTransactionPresenter2 = rateTransactionPresenter;
            if (z) {
                call.cancel();
                rateTransactionPresenter2 = rateTransactionPresenter;
            }
            try {
                rateTransactionPresenter2.e = null;
                try {
                    C = (y + 89) % Property.TYPE_ARRAY;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            onDestroy();
            Call<OpenAccountSuccessActivity<Object>> call2 = this.t.a;
            throw new NullPointerException();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        y = (C + 79) % Property.TYPE_ARRAY;
        if (!(menuItem.getItemId() == 16908332)) {
            return onOptionsItemSelected(menuItem);
        }
        y = (C + 3) % Property.TYPE_ARRAY;
        onBackPressed();
        y = (C + 45) % Property.TYPE_ARRAY;
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C = (y + 111) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        CC24SubMastercardInfoActivity.a(this, i, iArr);
        try {
            int i2 = y + 1;
            try {
                C = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? 'V' : 'O') != 'O') {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        C = (y + 9) % Property.TYPE_ARRAY;
        try {
            setCardSlogan.e().b = "DetailBerhasilNotificationActivity";
            try {
                this.j = "DetailBerhasilNotificationActivity";
                int i = C + 17;
                y = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? 'Q' : 6) == 'Q') {
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

    @OnClick({2131296440})
    public void proses(View view) {
        C = (y + 85) % Property.TYPE_ARRAY;
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a > 0.0f) {
            if (!(this.etKomentar.getText().toString().isEmpty())) {
                v();
                return;
            }
            C = (y + 97) % Property.TYPE_ARRAY;
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
            return;
        }
        int i = y + 81;
        C = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            this.tvErrorKomentar.setVisibility(1);
        } else {
            this.tvErrorKomentar.setVisibility(0);
        }
        this.tvErrorKomentar.setText(2131820982);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = y + setHasDecor$MediaBrowserCompat$MediaItem.aI;
        C = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '1' : 'U') == '1') {
            Object[] objArr = null;
            int length = objArr.length;
        }
        C = (y + 19) % Property.TYPE_ARRAY;
        return 2131492922;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = y + 113;
        C = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        y = (C + 11) % Property.TYPE_ARRAY;
        return this;
    }

    public final void s() {
        try {
            try {
                C = (y + 75) % Property.TYPE_ARRAY;
                d(b(this.llShare));
                C = (y + 11) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296448})
    public void share(View view) {
        C = (y + 5) % Property.TYPE_ARRAY;
        boolean z = false;
        try {
            if (!(Build.VERSION.SDK_INT < 33)) {
                int i = y + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
                C = i % Property.TYPE_ARRAY;
                s();
                if (i % 2 == 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return;
                }
                return;
            }
            CC24SubMastercardInfoActivity.a(this);
            int i2 = y + 5;
            C = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (z) {
                Object[] objArr2 = null;
                int length2 = objArr2.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        y = (C + 111) % Property.TYPE_ARRAY;
        try {
            z();
            try {
                y = (C + 39) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
