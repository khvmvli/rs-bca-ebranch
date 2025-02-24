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
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC25CFormKartuKreditFragment;
import o.CC2AskAccountActivity;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilRONotificationActivity.class */
public class DetailBerhasilRONotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private static int v;
    private static char[] x = {23, 'O', 'q', 'p', 'r', 'o', 'f', 'd', 'k', 'j', 'i', 'n', 'M', 'H', 'b', 'b', 'G', 'P', 'p', 'g', 'i', 's', 'k', 'j', 'i', 'g', 'h', 'e'};
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
    @BindView(2131297977)
    ListView lvTransaksi;
    private String q;
    private RateTransactionPresenter r;
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
    private ViewAnimator y;
    private setMessage f = new setMessage();
    private boolean p = false;
    private String w = "";
    private String n = "";

    private void a(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? '\\' : 11) != 11) {
            z = (v + 115) % Property.TYPE_ARRAY;
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
                int i = v + setHasDecor$MediaBrowserCompat$MediaItem.aN;
                z = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '[' : 17) != 17) {
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
            b(false, new int[]{0, 28, 0, 9}, new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0107, code lost:
        if (r0.equals("Cabang") != false) goto L_0x026c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(com.bca.smartbranch.data.api.response.FirebaseResponse.TxnDataDetail r8) {
        /*
        // Method dump skipped, instructions count: 1395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.b(com.bca.smartbranch.data.api.response.FirebaseResponse$TxnDataDetail):void");
    }

    public static void b(LogRedirector.Logger logger) {
        int i = v + 9;
        z = i % Property.TYPE_ARRAY;
        boolean z2 = i % 2 != 0;
        logger.a();
        if (!z2) {
            throw new NullPointerException();
        }
    }

    private static void b(boolean z2, int[] iArr, byte[] bArr, Object[] objArr) {
        String str;
        synchronized (CC25CFormKartuKreditFragment.b) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(x, i, cArr, 0, i2);
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

    private static Bitmap d(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            int i = z + 5;
            v = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '[' : '\"') != '[') {
                return createBitmap;
            }
            throw new ArithmeticException("divide by zero");
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ void e(DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity) {
        z = (v + 21) % Property.TYPE_ARRAY;
        detailBerhasilRONotificationActivity.y();
        int i = z + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
        v = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private void v() {
        JSONArray jSONArray;
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if (firebaseResponse == null) {
            Bundle extras = getIntent().getExtras();
            firebaseResponse2 = firebaseResponse;
            if (extras != null) {
                FirebaseResponse firebaseResponse3 = new FirebaseResponse();
                firebaseResponse3.setType(extras.getString("Type"));
                firebaseResponse3.setAlert(extras.getString("Alert"));
                firebaseResponse3.setRefNo(extras.getString("RefNo"));
                try {
                    jSONArray = new JSONArray(extras.getString("TxnDataDetail"));
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                    jSONArray = null;
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
                        try {
                            txnDataDetail.setKey(optJSONObject.optString("Key"));
                            txnDataDetail.setValue(optJSONObject.optString("Value"));
                            JSONArray optJSONArray = optJSONObject.optJSONArray("ValueArray");
                            if (optJSONArray != null) {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                        FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail = new FirebaseResponse.ValueTxnDataDetail();
                                        valueTxnDataDetail.setTxnType(optJSONArray.optJSONObject(i2).getString("TxnType"));
                                        arrayList2.add(valueTxnDataDetail);
                                    }
                                    txnDataDetail.setValueArray(arrayList2);
                                } catch (JSONException e2) {
                                    Log.i("EBRANCH", String.valueOf(e2));
                                }
                            }
                            arrayList.add(txnDataDetail);
                            i++;
                            v = (z + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
                        } catch (Exception e3) {
                            throw e3;
                        }
                    } catch (Exception e4) {
                        throw e4;
                    }
                }
                firebaseResponse3.setTxnDataDetailList(arrayList);
                firebaseResponse2 = firebaseResponse3;
            }
        }
        getIntent().getExtras();
        this.etKomentar.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0168: INVOKE  
              (wrap: o.LogoutDialog : 0x015e: IGET  (r0v12 o.LogoutDialog A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$3 : 0x0165: CONSTRUCTOR  (r1v1 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.v():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilRONotificationActivity.class
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
        // Method dump skipped, instructions count: 729
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.v():void");
    }

    private void y() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.q;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.s;
        this.r.d(loginasguest);
        z = (v + 65) % Property.TYPE_ARRAY;
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
            z = (v + 9) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.y = (ViewAnimator) findViewById(2131299751);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.r = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        v();
        v = (z + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        int i = z + 39;
        v = i % Property.TYPE_ARRAY;
        boolean z2 = false;
        if ((i % 2 != 0 ? 'C' : 24) != 24) {
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
            int i2 = z + 35;
            v = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                z2 = true;
            }
            if (z2) {
                throw new NullPointerException();
            }
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
            int i = z + setHasDecor$MediaBrowserCompat$MediaItem.aI;
            try {
                v = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? '.' : 'c') == '.') {
                    throw new ArithmeticException("divide by zero");
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
        if (z2) {
            if (!(view.getId() != 2131297031)) {
                int i = z + 35;
                v = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                }
                this.tilKomentar.setHintEnabled(true);
                return;
            }
            return;
        }
        if ((view.getId() == 2131297031 ? 'N' : 'E') != 'E') {
            int i2 = z + 85;
            v = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                this.etKomentar.getText().toString().isEmpty();
                throw new NullPointerException();
            } else if (this.etKomentar.getText().toString().isEmpty()) {
                this.tilKomentar.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBerhasilRONotificationActivity.e(DetailBerhasilRONotificationActivity.this);
            }
        }).g();
        int i = z + 81;
        v = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'c' : '(') == 'c') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        int i = z + 27;
        v = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'H' : 20) == 'H') {
            this.h.equalsIgnoreCase("");
            throw new ArithmeticException("divide by zero");
        } else if (this.h.equalsIgnoreCase("")) {
            startActivity(new Intent(this, LandingActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
            int i2 = z + 69;
            v = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '\f' : '1') == '\f') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } else {
            onBackPressed();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = z + 89;
        v = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
        }
        getMenuInflater().inflate(2131558410, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        try {
            RateTransactionPresenter rateTransactionPresenter = this.r;
            Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
            if (!(call == null)) {
                v = (z + 13) % Property.TYPE_ARRAY;
                call.cancel();
            }
            try {
                rateTransactionPresenter.e = null;
                v = (z + 73) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v = (z + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        boolean z2 = false;
        if (!(menuItem.getItemId() != 16908332)) {
            z = (v + 95) % Property.TYPE_ARRAY;
            onBackPressed();
            int i = v + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
            z = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            throw new NullPointerException();
        } else if (menuItem.getItemId() == 2131298038) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        } else {
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            v = (z + 33) % Property.TYPE_ARRAY;
            return onOptionsItemSelected;
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            int i2 = z + 55;
            v = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? '>' : '=') != '=') {
                onRequestPermissionsResult(i, strArr, iArr);
                try {
                    CC2AskAccountActivity.a(this, i, iArr);
                    Object[] objArr = null;
                    int length = objArr.length;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                onRequestPermissionsResult(i, strArr, iArr);
                CC2AskAccountActivity.a(this, i, iArr);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = v + 57;
        z = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            setCardSlogan.e().b = "DetailBerhasilRONotificationActivity";
            this.j = "DetailBerhasilRONotificationActivity";
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            setCardSlogan.e().b = "DetailBerhasilRONotificationActivity";
            this.j = "DetailBerhasilRONotificationActivity";
        }
        try {
            try {
                z = (v + 57) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296440})
    public void proses(View view) {
        v = (z + 49) % Property.TYPE_ARRAY;
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a > 0.0f) {
            if ((this.etKomentar.getText().toString().isEmpty() ? '9' : 'O') != 'O') {
                z = (v + 15) % Property.TYPE_ARRAY;
                this.tvErrorKomentar.setVisibility(0);
                this.tvErrorKomentar.setText(2131820765);
                this.tilKomentar.setBackgroundResource(2131230870);
                this.etKomentar.requestFocus();
                return;
            }
            y();
            z = (v + 91) % Property.TYPE_ARRAY;
            return;
        }
        this.tvErrorKomentar.setVisibility(0);
        this.tvErrorKomentar.setText(2131820982);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = v + 17;
        z = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new NullPointerException();
        }
        int i2 = v + 69;
        z = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? '<' : 'B') == 'B') {
            return 2131492938;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            int i = v + 13;
            z = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
            try {
                z = (v + 63) % Property.TYPE_ARRAY;
                return this;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void s() {
        int i = v + 97;
        z = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            a(d(this.llShare));
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        try {
            a(d(this.llShare));
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0034;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        o.CC2AskAccountActivity.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        r5 = com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.z + 55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.v = r5 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if ((r5 % 2) == 0) goto L_0x005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        r5 = 'Y';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = 'U';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r5 == 'U') goto L_0x006c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        r0 = null;
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 113) != true) goto L_0x003d;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void share(android.view.View r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.z
            r1 = 49
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.v = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x002c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 113(0x71, float:1.58E-43)
            if (r0 < r1) goto L_0x0022
            r0 = 1
            r5 = r0
            goto L_0x0024
        L_0x0022:
            r0 = 0
            r5 = r0
        L_0x0024:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x0034
            goto L_0x003d
        L_0x002c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x003d
        L_0x0034:
            r0 = r3
            r0.s()     // Catch: Exception -> 0x0039
            return
        L_0x0039:
            r4 = move-exception
            goto L_0x006d
        L_0x003d:
            r0 = r3
            o.CC2AskAccountActivity.e(r0)
            int r0 = com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.z     // Catch: Exception -> 0x006f
            r5 = r0
            int r5 = r5 + 55
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.v = r0     // Catch: Exception -> 0x0039
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x005c
            r0 = 89
            r5 = r0
            goto L_0x005f
        L_0x005c:
            r0 = 85
            r5 = r0
        L_0x005f:
            r0 = r5
            r1 = 85
            if (r0 == r1) goto L_0x006c
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0069
            r5 = r0
            return
        L_0x0069:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x006c:
            return
        L_0x006d:
            r0 = r4
            throw r0
        L_0x006f:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity.share(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        v = (z + 21) % Property.TYPE_ARRAY;
        z();
        z = (v + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
    }
}
