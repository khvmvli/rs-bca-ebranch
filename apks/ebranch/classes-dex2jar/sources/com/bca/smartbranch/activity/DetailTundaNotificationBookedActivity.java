package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CancelAskTransaksiDialog;
import com.bca.smartbranch.dialog.CancelTransaksiDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.CancelReservationPresenter;
import com.bca.smartbranch.presenter.CancelTundaPresenter;
import io.realm.Case;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC25BFormKartuKreditFragment;
import o.CC3UbahBCACardActivity_ViewBinding;
import o.ChooseBCACardAdapter$ViewHolder;
import o.FormUbahTellerActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.choosePic;
import o.consumeDisplayCutout;
import o.documentProvider;
import o.equals;
import o.getPromotion;
import o.onChooseBidangUsaha;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnHierarchyChangeListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaNotificationBookedActivity.class */
public class DetailTundaNotificationBookedActivity extends BaseActivityPostLogin implements CancelTundaPresenter.IconCompatParcelizer, CancelReservationPresenter.write {
    private static int G;
    private static int H;
    private static long I;
    private boolean A;
    private ViewAnimator B;
    private MenuItem C;
    @BindView(2131296380)
    Button btnBatal;
    @BindView(2131296443)
    Button btnReschedule;
    @BindView(2131296444)
    Button btnReservasi;
    @BindString(2131820609)
    String buktiPengisianForm;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297408)
    ImageView ivQRCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297711)
    LinearLayout llKcp;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297875)
    LinearLayout llRuangan;
    private Bitmap n;
    @BindString(2131821357)
    String note;
    private QRCodeDialog p;
    private String r;
    @BindString(2131822092)
    String retry;
    private View s;
    private String t;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298925)
    TextView tvDescriptionKey;
    @BindView(2131298928)
    TextView tvDescriptionValue;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299557)
    TextView tvWaktu;
    private String u;
    private CancelReservationPresenter w;
    private CancelTundaPresenter x;
    private Menu z;
    setMessage f = new setMessage();
    private String y = "";
    private String v = "";
    private String D = "";
    private String q = "";

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if ((r0 != null) != false) goto L_0x0064;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if ((r3.z != null ? ',' : 15) != ',') goto L_0x0070;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        r3.C.setVisible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void D() {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.G
            r1 = 23
            int r0 = r0 + r1
            r4 = r0
            r0 = r4
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.H = r0
            r0 = r3
            java.lang.String r0 = r0.h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0070
            int r0 = com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.G
            r1 = 109(0x6d, float:1.53E-43)
            int r0 = r0 + r1
            r4 = r0
            r0 = r4
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.H = r0
            r0 = r4
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x004b
            r0 = r3
            android.view.Menu r0 = r0.z
            r5 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0048
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L_0x003f
            r0 = 1
            r4 = r0
            goto L_0x0041
        L_0x003f:
            r0 = 0
            r4 = r0
        L_0x0041:
            r0 = r4
            if (r0 == 0) goto L_0x0070
            goto L_0x0064
        L_0x0048:
            r5 = move-exception
            r0 = r5
            throw r0
        L_0x004b:
            r0 = r3
            android.view.Menu r0 = r0.z
            if (r0 == 0) goto L_0x0058
            r0 = 44
            r4 = r0
            goto L_0x005b
        L_0x0058:
            r0 = 15
            r4 = r0
        L_0x005b:
            r0 = r4
            r1 = 44
            if (r0 == r1) goto L_0x0064
            goto L_0x0070
        L_0x0064:
            r0 = r3
            android.view.MenuItem r0 = r0.C
            r1 = 1
            android.view.MenuItem r0 = r0.setVisible(r1)
            return
        L_0x0070:
            r0 = r3
            java.lang.String r0 = r0.h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009b
            r0 = r3
            android.view.Menu r0 = r0.z
            if (r0 == 0) goto L_0x0086
            r0 = 1
            r4 = r0
            goto L_0x0088
        L_0x0086:
            r0 = 0
            r4 = r0
        L_0x0088:
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L_0x0090
            goto L_0x009b
        L_0x0090:
            r0 = r3
            android.view.MenuItem r0 = r0.C
            r1 = 0
            android.view.MenuItem r0 = r0.setVisible(r1)
        L_0x009b:
            int r0 = com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.H     // Catch: Exception -> 0x00ab
            r1 = 43
            int r0 = r0 + r1
            r4 = r0
            r0 = r4
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.G = r0     // Catch: Exception -> 0x00ab
            return
        L_0x00ab:
            r5 = move-exception
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.D():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03d9, code lost:
        if ((!r0.equals("1")) != false) goto L_0x03dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a(java.util.List<com.bca.smartbranch.data.api.response.FirebaseResponse.TxnDataDetail> r6) {
        /*
        // Method dump skipped, instructions count: 1258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.a(java.util.List):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC25BFormKartuKreditFragment.b) {
            CC25BFormKartuKreditFragment.d = i;
            char[] cArr2 = new char[cArr.length];
            CC25BFormKartuKreditFragment.a = 0;
            while (CC25BFormKartuKreditFragment.a < cArr.length) {
                cArr2[CC25BFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (cArr[CC25BFormKartuKreditFragment.a] ^ (CC25BFormKartuKreditFragment.a * CC25BFormKartuKreditFragment.d))) ^ I)));
                CC25BFormKartuKreditFragment.a++;
            }
            str = new String(cArr2);
        }
        objArr[0] = str;
    }

    public static void b(LogRedirector.Logger logger) {
        try {
            int i = G + 63;
            H = i % Property.TYPE_ARRAY;
            boolean z = i % 2 == 0;
            logger.a();
            if (z) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.y);
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT >= 29) {
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
                int i = G + 97;
                H = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 'J' : 16) != 'J') {
                    file2.delete();
                } else {
                    file2.delete();
                    throw new NullPointerException();
                }
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            a(new char[]{5857, 11462, 25273, 47149, 65100, 13366, 19425, 33153, 51113, 7532, 21325, 26921, 44274, 58063, 14506, 32358, 46172, 51770, 492, 18333, 40366, 54135, 59743, 12073, 25315, 47317, 65209, 13433}, getApplicationInfo().targetSdkVersion + 14857, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
            H = (G + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
        }
        x();
        if (this.A) {
            int i2 = G + 79;
            H = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
                throw new NullPointerException();
            } else {
                consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            QRCodeDialog qRCodeDialog = this.p;
            if (qRCodeDialog != null) {
                int i3 = H + 87;
                G = i3 % Property.TYPE_ARRAY;
                if ((i3 % 2 != 0 ? ';' : 21) != 21) {
                    qRCodeDialog.dismiss();
                    throw new ArithmeticException("divide by zero");
                } else {
                    qRCodeDialog.dismiss();
                }
            }
        }
    }

    private void y() {
        try {
            H = (G + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
            this.h = this.sharedPreferences.getString("email", "");
            this.m = (User) this.k.where(User.class).equalTo("email", this.h, Case.INSENSITIVE).findFirst();
            H = (G + 71) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        int i = H + setHasDecor$MediaBrowserCompat$MediaItem.aI;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.B, str, -1).g();
            return;
        }
        try {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.B, str, -1).g();
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
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
        G = (H + 115) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void b_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
        int i = G + 43;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '6' : '5') == '6') {
            throw new NullPointerException();
        }
    }

    @OnClick({2131296380})
    public void batal(View view) {
        if (this.h.isEmpty()) {
            int i = G + 53;
            H = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                this.h.equalsIgnoreCase("");
                throw new NullPointerException();
            }
            if (this.h.equalsIgnoreCase("")) {
                if ((this.r != null ? 'R' : 'M') != 'M') {
                    this.sharedPreferences.edit().putString("email_session", this.r).commit();
                }
                Intent intent = new Intent(this, LoginSessionActivity.class);
                intent.putExtra("email", this.r);
                startActivity(intent);
                return;
            }
        }
        if (this.v.equals("Y")) {
            CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", "");
            bundle.putString("noref", this.y);
            cancelAskTransaksiDialog.setArguments(bundle);
            cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
            int i2 = H + 33;
            G = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
            return;
        }
        CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
        Bundle bundle2 = new Bundle();
        try {
            bundle2.putString("token", "");
            bundle2.putString("noref", this.y);
            cancelTransaksiDialog.setArguments(bundle2);
            cancelTransaksiDialog.show(l(), "CancelTransaksiDialog");
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        H = (G + 37) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        if ((r0 ? '\n' : '=') != '\n') goto L_0x00e3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r5.h.equalsIgnoreCase("") != false) goto L_0x0082;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r5.r == null) goto L_0x008f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
        r7 = 'S';
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
        r7 = '<';
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r7 == 'S') goto L_0x009b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.G = (com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.H + 91) % io.realm.internal.Property.TYPE_ARRAY;
        r5.sharedPreferences.edit().putString("email_session", r5.r).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
        r0 = new android.content.Intent(r5, com.bca.smartbranch.activity.LoginSessionActivity.class);
        r0.putExtra("email", r5.r);
        startActivity(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
        return;
     */
    @butterknife.OnClick({2131296444, 2131296443})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void clickedReservation(android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity.clickedReservation(android.view.View):void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        String str;
        d(bundle);
        this.B = (ViewAnimator) findViewById(2131299752);
        this.w = new CancelReservationPresenter();
        this.x = new CancelTundaPresenter();
        this.w.a = this;
        this.x.a = this;
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if ((firebaseResponse == null ? ';' : '\"') != '\"') {
            G = (H + 93) % Property.TYPE_ARRAY;
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
                    H = (G + 75) % Property.TYPE_ARRAY;
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
            }
        }
        boolean z = true;
        if (firebaseResponse2 != null) {
            this.y = firebaseResponse2.getRefNo();
            if ((firebaseResponse2.getType().equals(ReservasiOnline.PENGAJUAN_KARTU_KREDIT) ? 'Y' : '^') != 'Y') {
                str = "N";
            } else {
                G = (H + 43) % Property.TYPE_ARRAY;
                str = "Y";
            }
            this.v = str;
            a(firebaseResponse2.getTxnDataDetailList());
        }
        if (!this.v.equals("Y")) {
            z = false;
        }
        if (z) {
            G = (H + 57) % Property.TYPE_ARRAY;
            this.btnReservasi.setVisibility(8);
            this.btnReschedule.setVisibility(0);
            this.llKcp.setVisibility(0);
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        int i = H + 1;
        G = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            z();
            throw new ArithmeticException("divide by zero");
        } else {
            z();
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void i(String str) {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = G + 19;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        int i = H + 89;
        G = i % Property.TYPE_ARRAY;
        char c = 2;
        if ((i % 2 != 0 ? (char) 7 : 4) != 7) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.B, str, -1).g();
            int i2 = G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
            H = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                c = 29;
            }
            if (c != 29) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.B, str, -1).g();
        throw new ArithmeticException("divide by zero");
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        int i = H + 39;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 7 : 'b') != 'b') {
            this.h.equalsIgnoreCase("");
            throw new NullPointerException();
        } else if (this.h.equalsIgnoreCase("")) {
            startActivity(new Intent(this, LandingActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
            G = (H + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
        } else {
            onBackPressed();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        try {
            int i = G + 57;
            try {
                H = i % Property.TYPE_ARRAY;
                boolean z = i % 2 != 0;
                finish();
                if (!z) {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        H = (G + 89) % Property.TYPE_ARRAY;
        getMenuInflater().inflate(2131558410, menu);
        this.z = menu;
        this.C = menu.findItem(2131298038);
        D();
        H = (G + 73) % Property.TYPE_ARRAY;
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        H = (G + 11) % Property.TYPE_ARRAY;
        onDestroy();
        H = (G + 87) % Property.TYPE_ARRAY;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = H + 101;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            int itemId = menuItem.getItemId();
            if ((itemId != 16908332 ? ']' : 28) != ']') {
                onBackPressed();
                return true;
            }
            if ((itemId != 2131298038 ? 'a' : 1) != 1) {
                int i2 = G + 19;
                H = i2 % Property.TYPE_ARRAY;
                boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
                if (i2 % 2 != 0) {
                    return onOptionsItemSelected;
                }
                throw new ArithmeticException("divide by zero");
            }
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
        menuItem.getItemId();
        throw new NullPointerException();
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        G = (H + 11) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        CC3UbahBCACardActivity_ViewBinding.b(this, i, iArr);
        int i2 = G + 27;
        H = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, android.app.Activity
    public void onResume() {
        try {
            H = (G + 67) % Property.TYPE_ARRAY;
            onResume();
            D();
            H = (G + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = H + 21;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            try {
                try {
                    setCardSlogan.e().b = "DetailTundaNotificationBookedActivity";
                    this.j = "DetailTundaNotificationBookedActivity";
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            setCardSlogan.e().b = "DetailTundaNotificationBookedActivity";
            this.j = "DetailTundaNotificationBookedActivity";
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = H + 111;
        G = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return 2131492940;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = G + 95;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            return this;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        this.A = branchMapItemBNAdapter$BranchMapItemVH.c;
        if (!(Build.VERSION.SDK_INT >= 33)) {
            CC3UbahBCACardActivity_ViewBinding.b(this);
            G = (H + 73) % Property.TYPE_ARRAY;
            return;
        }
        G = (H + 57) % Property.TYPE_ARRAY;
        v();
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        H = (G + 65) % Property.TYPE_ARRAY;
        this.f.b(this.llDetail, this.ivDetail);
        int i = H + 113;
        G = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            throw new NullPointerException();
        }
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", this.u);
        startActivity(intent);
        G = (H + 1) % Property.TYPE_ARRAY;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
        if (chooseBCACardAdapter$ViewHolder.e) {
            this.w.e(new FormUbahTellerActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.m.getImei()));
            int i = H + 33;
            G = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                throw new NullPointerException();
            }
            return;
        }
        this.x.a(new choosePic(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
        int i2 = G + 53;
        H = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? 4 : '>') != '>') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void t() {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131822441));
        bundle.putString("MessageDialogTitle", getString(2131822128));
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = G + 69;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '&' : '\f') != '\f') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void u() {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131822441));
        bundle.putString("MessageDialogTitle", getString(2131822128));
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = G + 79;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '0' : 'H') == '0') {
            throw new NullPointerException();
        }
    }

    public final void v() {
        G = (H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        try {
            d(this.n);
            int i = H + 113;
            G = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '/' : ',') != ',') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void w_(String str) {
        G = (H + 25) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.B, str, 0).g();
        int i = G + 69;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'G' : 20) != 20) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void x_(String str) {
        KeluarFormReservationDialog_ViewBinding keluarFormReservationDialog_ViewBinding;
        int i = H + 55;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            x();
            keluarFormReservationDialog_ViewBinding = KeluarFormReservationDialog_ViewBinding.a(null, this.B, str, 1);
        } else {
            x();
            keluarFormReservationDialog_ViewBinding = KeluarFormReservationDialog_ViewBinding.a(null, this.B, str, 0);
        }
        keluarFormReservationDialog_ViewBinding.g();
        H = (G + 39) % Property.TYPE_ARRAY;
    }

    @OnClick({2131297408})
    public void zoomQRCode() {
        try {
            int i = H + 79;
            G = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                QRCodeDialog qRCodeDialog = this.p;
                throw new ArithmeticException("divide by zero");
            }
            if (this.p == null) {
                this.p = new QRCodeDialog();
            }
            QRCodeDialog qRCodeDialog2 = this.p;
            Bitmap bitmap = this.n;
            String str = this.y;
            qRCodeDialog2.b = bitmap;
            qRCodeDialog2.d = str;
            this.p.show(l(), "QRCodeDialog");
            H = (G + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }
}
