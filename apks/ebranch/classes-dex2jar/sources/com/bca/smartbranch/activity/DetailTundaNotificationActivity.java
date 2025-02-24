package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.util.Log;
import android.util.TypedValue;
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
import com.bca.smartbranch.data.global.Reservation;
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
import java.util.Iterator;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC25AFormKartuKreditFragment;
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
import o.getAnnualFeeBasicAmount;
import o.getPromotion;
import o.onChooseBidangUsaha;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnHierarchyChangeListener;
import o.subscribeChooseMastercardVisaEvent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaNotificationActivity.class */
public class DetailTundaNotificationActivity extends BaseActivityPostLogin implements CancelTundaPresenter.IconCompatParcelizer, CancelReservationPresenter.write {
    private static boolean E;
    private static int K;
    private static int M;
    private String A;
    private Menu B;
    private MenuItem D;
    private boolean H;
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
    private String p;
    private QRCodeDialog q;
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
    private CancelReservationPresenter v;
    private String x;
    private CancelTundaPresenter y;
    private ViewAnimator z;
    private static char[] G = {213, 225, 223, 160, 212, 211, 229, 228, 230, 224, 218, 226, 232, 219, 214, 215};
    private static boolean I = true;
    private static int F = 114;
    setMessage f = new setMessage();
    private String w = "";
    private String u = "";
    private String C = "";
    private String r = "";

    private void C() {
        if (!this.h.isEmpty()) {
            int i = K + 61;
            M = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                Menu menu = this.B;
                throw new ArithmeticException("divide by zero");
            }
            try {
                if (!(this.B == null)) {
                    this.D.setVisible(true);
                    return;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        if ((this.h.isEmpty() ? '>' : 'U') != 'U' && this.B != null) {
            try {
                K = (M + 65) % Property.TYPE_ARRAY;
                this.D.setVisible(false);
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private static void a(int i, int[] iArr, char[] cArr, byte[] bArr, Object[] objArr) {
        synchronized (CC25AFormKartuKreditFragment.d) {
            char[] cArr2 = G;
            int i2 = F;
            if (E) {
                int length = bArr.length;
                CC25AFormKartuKreditFragment.b = length;
                char[] cArr3 = new char[length];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr3[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[bArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] + i] - i2));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr3);
            } else if (I) {
                int length2 = cArr.length;
                CC25AFormKartuKreditFragment.b = length2;
                char[] cArr4 = new char[length2];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr4[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[cArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] - i] - i2));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr4);
            } else {
                int length3 = iArr.length;
                CC25AFormKartuKreditFragment.b = length3;
                char[] cArr5 = new char[length3];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr5[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[iArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] - i] - i2));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr5);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void c(List<FirebaseResponse.TxnDataDetail> list) {
        char c;
        char c2;
        Iterator<FirebaseResponse.TxnDataDetail> it = list.iterator();
        while (true) {
            if (!(!it.hasNext())) {
                FirebaseResponse.TxnDataDetail next = it.next();
                String key = next.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1490966820:
                        if (key.equals("TxnStatus")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1335256710:
                        if (key.equals("ReservationDate")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1334772583:
                        if (key.equals("ReservationTime")) {
                            K = (M + 95) % Property.TYPE_ARRAY;
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1238485368:
                        if (key.equals("Transaksi")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1091538172:
                        if (!(!key.equals("Ruangan"))) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -948547731:
                        if (key.equals("BranchName")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -170196014:
                        try {
                            if (key.equals("BranchAddress")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        } catch (Exception e) {
                            throw e;
                        }
                    case 67066748:
                        if ((key.equals("Email") ? ',' : 'M') == ',') {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1260938190:
                        if (key.equals("Nomor Referensi")) {
                            K = (M + 25) % Property.TYPE_ARRAY;
                            c = '\b';
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
                        String value = next.getValue();
                        value.hashCode();
                        switch (value.hashCode()) {
                            case 49:
                                c2 = 65535;
                                if (value.equals("1")) {
                                    try {
                                        K = (M + 41) % Property.TYPE_ARRAY;
                                        c2 = 0;
                                        break;
                                    } catch (Exception e2) {
                                        throw e2;
                                    }
                                }
                                break;
                            case 50:
                                c2 = 65535;
                                if (value.equals("2")) {
                                    K = (M + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
                                    M = (K + 17) % Property.TYPE_ARRAY;
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 51:
                                if (value.equals("3")) {
                                    c2 = 2;
                                    break;
                                } else {
                                    c2 = 65535;
                                    break;
                                }
                            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                                c2 = 65535;
                                if (value.equals("4")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 53:
                                c2 = 65535;
                                if (value.equals("5")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 54:
                                c2 = 65535;
                                if (value.equals("6")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 != 0) {
                            if (c2 != 1) {
                                if (c2 != 2) {
                                    if (c2 != 3) {
                                        if (c2 != 4) {
                                            if (c2 == 5) {
                                                this.x = "6";
                                                this.t = "DEPOSITO";
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            this.x = "5";
                                            this.t = "Tahapan Berjangka";
                                            break;
                                        }
                                    } else {
                                        this.x = "4";
                                        this.t = "BCA Dollar";
                                        break;
                                    }
                                } else {
                                    this.x = "3";
                                    this.t = "Tapres BCA";
                                    break;
                                }
                            } else {
                                this.x = "2";
                                this.t = "Tahapan Xpresi";
                                break;
                            }
                        } else {
                            this.x = "1";
                            this.t = "Tahapan BCA";
                            break;
                        }
                    case 1:
                        this.C = next.getValue();
                        break;
                    case 2:
                        this.r = next.getValue();
                        break;
                    case 3:
                        this.A = next.getValue();
                        this.tvDescriptionKey.setText(next.getValue().replace(":@:", "\n"));
                        break;
                    case 4:
                        if (next.getValue().equals("Reguler")) {
                            break;
                        } else {
                            K = (M + 57) % Property.TYPE_ARRAY;
                            this.llRuangan.setVisibility(0);
                            this.tvJenisRuangan.setText(next.getValue());
                            break;
                        }
                    case 5:
                        this.tvBranchName.setText(Html.fromHtml(next.getValue()));
                        break;
                    case 6:
                        this.tvBranchAddress.setText(Html.fromHtml(next.getValue()));
                        break;
                    case 7:
                        this.p = next.getValue();
                        break;
                    case '\b':
                        this.tvNoReferensi.setText(Html.fromHtml(next.getValue()));
                        K = (M + 17) % Property.TYPE_ARRAY;
                        break;
                }
            } else {
                if (this.u.equals("Y")) {
                    TextView textView = this.tvWaktu;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.r.replace(":", "."));
                    sb.append(" WIB - ");
                    sb.append(getAnnualFeeBasicAmount.f(this.C));
                    textView.setText(sb.toString());
                }
                this.tvNote.setText(Html.fromHtml(this.note));
                Bitmap a = getPromotion.a(this.tvNoReferensi.getText().toString(), this);
                this.n = a;
                this.ivQRCode.setImageBitmap(a);
                this.tvDescriptionValue.setText(this.t);
                this.z.setDisplayedChild(2);
                return;
            }
        }
    }

    public static void d(LogRedirector.Logger logger) {
        K = (M + 53) % Property.TYPE_ARRAY;
        logger.a();
        K = (M + 3) % Property.TYPE_ARRAY;
    }

    private void e(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.w);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = false;
        if ((Build.VERSION.SDK_INT >= 29 ? '1' : '[') != '[') {
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
            if ((file2.exists() ? 30 : '&') == 30) {
                K = (M + 85) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                M = (K + 49) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            a(127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, new byte[]{-120, -112, -113, -114, -115, -126, -120, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if ((this.H ? 26 : 'E') != 'E') {
            K = (M + 55) % Property.TYPE_ARRAY;
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.q;
        if (qRCodeDialog != null) {
            z = true;
        }
        if (z) {
            M = (K + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
            qRCodeDialog.dismiss();
            M = (K + 99) % Property.TYPE_ARRAY;
        }
        M = (K + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
    }

    private void v() {
        try {
            M = (K + 25) % Property.TYPE_ARRAY;
            this.h = this.sharedPreferences.getString("email", "");
            this.m = (User) this.k.where(User.class).equalTo("email", this.h, Case.INSENSITIVE).findFirst();
            int i = M + 5;
            K = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? ' ' : 'U') != 'U') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        try {
            int i = M + 9;
            K = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.z, str, -1).g();
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                x();
                KeluarFormReservationDialog_ViewBinding.a(null, this.z, str, -1).g();
            }
            M = (K + 33) % Property.TYPE_ARRAY;
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
        try {
            try {
                M = (K + 95) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
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
        int i = M + 71;
        K = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 2 : '8') == 2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131296380})
    public void batal(View view) {
        K = (M + 99) % Property.TYPE_ARRAY;
        boolean z = false;
        if (this.h.isEmpty()) {
            int i = M + 55;
            K = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                if (this.h.equalsIgnoreCase("")) {
                    if (this.p != null) {
                        z = true;
                    }
                    if (z) {
                        this.sharedPreferences.edit().putString("email_session", this.p).commit();
                        K = (M + 9) % Property.TYPE_ARRAY;
                    }
                    Intent intent = new Intent(this, LoginSessionActivity.class);
                    intent.putExtra("email", this.p);
                    startActivity(intent);
                    return;
                }
            } else {
                this.h.equalsIgnoreCase("");
                throw new NullPointerException();
            }
        }
        if (this.u.equals("Y")) {
            CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("token", "");
                bundle.putString("noref", this.w);
                cancelAskTransaksiDialog.setArguments(bundle);
                cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
            } catch (Exception e) {
                throw e;
            }
        } else {
            CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
            Bundle bundle2 = new Bundle();
            bundle2.putString("token", "");
            bundle2.putString("noref", this.w);
            cancelTransaksiDialog.setArguments(bundle2);
            cancelTransaksiDialog.show(l(), "CancelTransaksiDialog");
            int i2 = K + 91;
            M = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
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
        K = (M + 93) % Property.TYPE_ARRAY;
    }

    @OnClick({2131296444, 2131296443})
    public void clickedReservation(View view) {
        if ((this.h.isEmpty() ? ')' : 'U') == ')') {
            M = (K + 13) % Property.TYPE_ARRAY;
            if (this.h.equalsIgnoreCase("")) {
                if (this.p != null) {
                    int i = K + 113;
                    M = i % Property.TYPE_ARRAY;
                    if (!(i % 2 == 0)) {
                        this.sharedPreferences.edit().putString("email_session", this.p).commit();
                    } else {
                        this.sharedPreferences.edit().putString("email_session", this.p).commit();
                        throw new NullPointerException();
                    }
                }
                Intent intent = new Intent(this, LoginSessionActivity.class);
                intent.putExtra("email", this.p);
                startActivity(intent);
                return;
            }
        }
        v();
        this.s = view;
        Reservation reservation = new Reservation();
        reservation.setNoReff(this.w);
        reservation.setTypeTransaction(this.tvDescriptionKey.getText().toString());
        reservation.setTransactionCode(ReservasiOnline.PEMBUKAAN_REKENING);
        reservation.setTxnType(this.A);
        reservation.setTypeReservation((this.s.getId() == 2131296444 ? 29 : ':') != 29 ? "RESCHEDULE_RESERVATION" : "NEW_RESERVATION");
        reservation.setTnxStatus(this.x);
        Intent intent2 = new Intent(this, BranchMapActivity.class);
        intent2.putExtra("reff_no", reservation.getNoReff());
        intent2.putExtra("type_transaksi", reservation.getTypeTransaction());
        intent2.putExtra("type_reservation", reservation.getTypeReservation());
        intent2.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        String str;
        d(bundle);
        this.z = (ViewAnimator) findViewById(2131299752);
        this.v = new CancelReservationPresenter();
        this.y = new CancelTundaPresenter();
        this.v.a = this;
        this.y.a = this;
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if ((firebaseResponse == null ? '[' : 'R') != 'R') {
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
                    M = (K + 33) % Property.TYPE_ARRAY;
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
            }
        }
        if ((firebaseResponse2 != null ? '[' : 'Z') != 'Z') {
            this.w = firebaseResponse2.getRefNo();
            if (firebaseResponse2.getType().equals(ReservasiOnline.PENGAJUAN_KARTU_KREDIT)) {
                int i2 = K + 25;
                M = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? '[' : '_') != '[') {
                    str = "Y";
                } else {
                    throw new ArithmeticException("divide by zero");
                }
            } else {
                str = "N";
            }
            this.u = str;
            c(firebaseResponse2.getTxnDataDetailList());
        }
        if ((this.u.equals("Y") ? '-' : 21) != 21) {
            int i3 = K + 49;
            M = i3 % Property.TYPE_ARRAY;
            if (i3 % 2 == 0) {
                this.btnReservasi.setVisibility(69);
                this.btnReschedule.setVisibility(1);
            } else {
                this.btnReservasi.setVisibility(8);
                this.btnReschedule.setVisibility(0);
            }
            this.llKcp.setVisibility(0);
        }
        M = (K + 47) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        M = (K + 65) % Property.TYPE_ARRAY;
        try {
            z();
            K = (M + 75) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void i(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            int i = K + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
            M = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        int i = K + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        M = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.z, str, -1).g();
            return;
        }
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.z, str, -1).g();
        throw new NullPointerException();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        M = (K + 111) % Property.TYPE_ARRAY;
        if (this.h.equalsIgnoreCase("")) {
            startActivity(new Intent(this, LandingActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
            int i = K + setHasDecor$MediaBrowserCompat$MediaItem.aD;
            M = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 'Y' : 'K') != 'K') {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        onBackPressed();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        int i = K + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        M = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '*' : 'F') != 'F') {
            try {
                finish();
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = M + 91;
        K = i % Property.TYPE_ARRAY;
        boolean z = true;
        if (i % 2 != 0) {
            getMenuInflater().inflate(2131558410, menu);
            this.B = menu;
            this.D = menu.findItem(2131298038);
            C();
            z = false;
        } else {
            getMenuInflater().inflate(2131558410, menu);
            this.B = menu;
            this.D = menu.findItem(2131298038);
            C();
        }
        int i2 = M + 5;
        K = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 'K' : 'G') != 'K') {
            return z;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        M = (K + 85) % Property.TYPE_ARRAY;
        onDestroy();
        try {
            int i = K + 101;
            try {
                M = i % Property.TYPE_ARRAY;
                if (!(i % 2 != 0)) {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r8 != 16908332) goto L_0x0054;
     */
    @Override // android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            r6 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaNotificationActivity.K
            r1 = 9
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaNotificationActivity.M = r0
            r0 = r8
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r8 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r8 = r0
        L_0x001c:
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L_0x0032
            r0 = r7
            int r0 = r0.getItemId()
            r8 = r0
            r0 = r8
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 == r1) goto L_0x009c
            goto L_0x0054
        L_0x0032:
            r0 = r7
            int r0 = r0.getItemId()
            r9 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x00a2
            r8 = r0
            r0 = r9
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 == r1) goto L_0x0049
            r0 = 10
            r8 = r0
            goto L_0x004c
        L_0x0049:
            r0 = 74
            r8 = r0
        L_0x004c:
            r0 = r8
            r1 = 74
            if (r0 == r1) goto L_0x009c
            r0 = r9
            r8 = r0
        L_0x0054:
            int r0 = com.bca.smartbranch.activity.DetailTundaNotificationActivity.M
            r1 = 125(0x7d, float:1.75E-43)
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaNotificationActivity.K = r0
            r0 = r9
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0074
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x0071
            r1 = r0
            r1.<init>()     // Catch: all -> 0x0071
            throw r0     // Catch: all -> 0x0071
        L_0x0071:
            r7 = move-exception
            r0 = r7
            throw r0
        L_0x0074:
            r0 = r8
            r1 = 2131298038(0x7f0906f6, float:1.8214038E38)
            if (r0 == r1) goto L_0x0081
            r0 = r6
            r1 = r7
            boolean r0 = r0.onOptionsItemSelected(r1)
            return r0
        L_0x0081:
            r0 = r6
            android.content.Intent r1 = new android.content.Intent
            r2 = r1
            r3 = r6
            java.lang.Class<com.bca.smartbranch.activity.MainActivity> r4 = com.bca.smartbranch.activity.MainActivity.class
            r2.<init>(r3, r4)
            r0.startActivity(r1)
            r0 = r6
            r1 = 2130772009(0x7f010029, float:1.7147124E38)
            r2 = 2130772012(0x7f01002c, float:1.714713E38)
            r0.overridePendingTransition(r1, r2)
            r0 = 1
            return r0
        L_0x009c:
            r0 = r6
            r0.onBackPressed()
            r0 = 1
            return r0
        L_0x00a2:
            r7 = move-exception
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaNotificationActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            try {
                M = (K + 43) % Property.TYPE_ARRAY;
                onRequestPermissionsResult(i, strArr, iArr);
                subscribeChooseMastercardVisaEvent.d(this, i, iArr);
                K = (M + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, android.app.Activity
    public void onResume() {
        K = (M + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        onResume();
        C();
        K = (M + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        M = (K + 83) % Property.TYPE_ARRAY;
        setCardSlogan.e().b = "DetailTundaNotificationActivity";
        this.j = "DetailTundaNotificationActivity";
        K = (M + 71) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        K = (M + 3) % Property.TYPE_ARRAY;
        M = (K + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        return 2131492940;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        K = (M + 15) % Property.TYPE_ARRAY;
        try {
            K = (M + 113) % Property.TYPE_ARRAY;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        M = (K + 21) % Property.TYPE_ARRAY;
        this.H = branchMapItemBNAdapter$BranchMapItemVH.c;
        if (!(Build.VERSION.SDK_INT >= 33)) {
            subscribeChooseMastercardVisaEvent.e(this);
            return;
        }
        M = (K + 81) % Property.TYPE_ARRAY;
        y();
        int i = K + 67;
        M = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '%' : 2) != 2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            boolean z = true;
            try {
                K = (M + 1) % Property.TYPE_ARRAY;
                this.f.b(this.llDetail, this.ivDetail);
                int i = M + 97;
                K = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    z = false;
                }
                if (!z) {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        try {
            intent.putExtra("txn_status", this.x);
            startActivity(intent);
            K = (M + 47) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
        M = (K + 97) % Property.TYPE_ARRAY;
        if (chooseBCACardAdapter$ViewHolder.e) {
            this.v.e(new FormUbahTellerActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.m.getImei()));
            int i = M + 53;
            K = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 4 : '%') != '%') {
                throw new ArithmeticException("divide by zero");
            }
            return;
        }
        this.y.a(new choosePic(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void t() {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131822441));
        bundle.putString("MessageDialogTitle", getString(2131822128));
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = M + 95;
        K = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 5 : '[') != '[') {
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
        K = (M + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void w_(String str) {
        K = (M + 77) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.z, str, 0).g();
        M = (K + 27) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void x_(String str) {
        int i = M + 61;
        K = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
        }
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.z, str, 0).g();
    }

    public final void y() {
        M = (K + 49) % Property.TYPE_ARRAY;
        e(this.n);
        int i = M + 31;
        K = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 16 : '\"') == 16) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131297408})
    public void zoomQRCode() {
        try {
            try {
                K = (M + 79) % Property.TYPE_ARRAY;
                if (this.q == null) {
                    this.q = new QRCodeDialog();
                    K = (M + 111) % Property.TYPE_ARRAY;
                }
                QRCodeDialog qRCodeDialog = this.q;
                Bitmap bitmap = this.n;
                String str = this.w;
                qRCodeDialog.b = bitmap;
                qRCodeDialog.d = str;
                this.q.show(l(), "QRCodeDialog");
                boolean z = true;
                int i = K + 1;
                M = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z = false;
                }
                if (!z) {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
