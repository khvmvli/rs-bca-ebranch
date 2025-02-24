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
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
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
import com.bca.smartbranch.data.global.TransaksiTunda;
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
import o.CC23BFormKartuKreditFragment_ViewBinding;
import o.CC5ChooseMastercardVisaActivity;
import o.ChooseBCACardAdapter$ViewHolder;
import o.FormUbahTellerActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.OpenAccountSuccessActivity;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaEChannelNotificationActivity.class */
public class DetailTundaEChannelNotificationActivity extends BaseActivityPostLogin implements CancelTundaPresenter.IconCompatParcelizer, CancelReservationPresenter.write {
    private static short[] F;
    private static int H;
    private static int J;
    private static int M;
    private TransaksiTunda A;
    private boolean B;
    private ViewAnimator C;
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
    private View p;
    private QRCodeDialog q;
    @BindString(2131822092)
    String retry;
    private String s;
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
    private String z;
    private static byte[] G = {7, -120, 124, 114, 106, 126, 120, 123, -69, 63, Byte.MIN_VALUE, 112, -120, 102, -115, 103, 123, -116, 113, 115, -64, 72, 119, 124, -79, 60, 119, -119};
    private static int I = 1462966581;
    private static int E = 21;
    setMessage f = new setMessage();
    private String u = "";
    private String w = "";
    private String D = "";
    private String r = "";

    private static void a(int i, byte b, int i2, int i3, short s, Object[] objArr) {
        String obj;
        synchronized (CC23BFormKartuKreditFragment_ViewBinding.e) {
            StringBuilder sb = new StringBuilder();
            int i4 = i3 + E;
            boolean z = i4 == -1;
            if (z) {
                i4 = G != null ? (byte) (G[I + i2] + E) : (short) (F[I + i2] + E);
            }
            if (i4 > 0) {
                CC23BFormKartuKreditFragment_ViewBinding.d = ((i2 + i4) - 2) + I + (z ? 1 : 0);
                CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (i + H));
                sb.append(CC23BFormKartuKreditFragment_ViewBinding.c);
                CC23BFormKartuKreditFragment_ViewBinding.b = (char) CC23BFormKartuKreditFragment_ViewBinding.c;
                CC23BFormKartuKreditFragment_ViewBinding.a = 1;
                while (CC23BFormKartuKreditFragment_ViewBinding.a < i4) {
                    if (G != null) {
                        byte[] bArr = G;
                        int i5 = CC23BFormKartuKreditFragment_ViewBinding.d;
                        CC23BFormKartuKreditFragment_ViewBinding.d = i5 - 1;
                        CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (CC23BFormKartuKreditFragment_ViewBinding.b + (((byte) (bArr[i5] + s)) ^ b)));
                    } else {
                        short[] sArr = F;
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

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.u);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = true;
        if ((Build.VERSION.SDK_INT >= 29 ? 'X' : '0') != '0') {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            M = (J + 41) % Property.TYPE_ARRAY;
        } else {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (file2.exists()) {
                M = (J + 33) % Property.TYPE_ARRAY;
                file2.delete();
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
            a(getResources().getString(2131821267).substring(2, 4).codePointAt(0) - 59101338, (byte) (-126 - TextUtils.lastIndexOf("", '0', 0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1462966581, getPackageName().length() - 41, (short) (getResources().getString(2131822451).substring(0, 4).length() + 2), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (this.B) {
            int i = M + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
            J = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                z = false;
            }
            if (z) {
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
            QRCodeDialog qRCodeDialog = this.q;
            if ((qRCodeDialog != null ? 'A' : '1') == 'A') {
                int i2 = J + 33;
                M = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 == 0) {
                    qRCodeDialog.dismiss();
                    throw new NullPointerException();
                } else {
                    qRCodeDialog.dismiss();
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void d(List<FirebaseResponse.TxnDataDetail> list) {
        Iterator<FirebaseResponse.TxnDataDetail> it = list.iterator();
        while (true) {
            boolean z = true;
            boolean z2 = true;
            char c = 1;
            boolean z3 = true;
            if (!(!it.hasNext())) {
                FirebaseResponse.TxnDataDetail next = it.next();
                String key = next.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1335256710:
                        if ((key.equals("ReservationDate") ? 27 : '%') == 27) {
                            J = (M + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
                            J = (M + 113) % Property.TYPE_ARRAY;
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1334772583:
                        if (key.equals("ReservationTime")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case -1238485368:
                        if (key.equals("Transaksi")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1091538172:
                        if (key.equals("Ruangan")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -948547731:
                        if (key.equals("BranchName")) {
                            z2 = false;
                        }
                        if (!z2) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -170196014:
                        if (key.equals("BranchAddress")) {
                            z = false;
                        }
                        if (!z) {
                            c = 5;
                            M = (J + 35) % Property.TYPE_ARRAY;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2622298:
                        if (key.equals("Type")) {
                            c = 6;
                            try {
                                try {
                                    J = (M + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
                                    break;
                                } catch (Exception e) {
                                    throw e;
                                }
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        c = 65535;
                        break;
                    case 67066748:
                        if (key.equals("Email")) {
                            M = (J + 59) % Property.TYPE_ARRAY;
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 75456161:
                        if (key.equals("Notes")) {
                            z3 = false;
                        }
                        if (!z3) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 639588141:
                        if (key.equals("FlagBooking")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1260938190:
                        if (key.equals("Nomor Referensi")) {
                            c = '\n';
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
                        this.D = next.getValue();
                        break;
                    case 1:
                        this.r = next.getValue();
                        break;
                    case 2:
                        String value = next.getValue();
                        this.s = value;
                        this.tvDescriptionKey.setText(value);
                        break;
                    case 3:
                        if (next.getValue().equals("Reguler")) {
                            break;
                        } else {
                            this.llRuangan.setVisibility(0);
                            this.tvJenisRuangan.setText(next.getValue());
                            break;
                        }
                    case 4:
                        this.tvBranchName.setText(Html.fromHtml(next.getValue()));
                        break;
                    case 5:
                        this.tvBranchAddress.setText(Html.fromHtml(next.getValue()));
                        break;
                    case 6:
                        this.z = next.getValue();
                        break;
                    case 7:
                        this.t = next.getValue();
                        break;
                    case '\b':
                        this.tvNote.setText(Html.fromHtml(next.getValue()));
                        break;
                    case '\t':
                        this.w = next.getValue();
                        break;
                    case '\n':
                        this.tvNoReferensi.setText(Html.fromHtml(next.getValue()));
                        break;
                }
            } else {
                if (this.w.equals("Y")) {
                    TextView textView = this.tvWaktu;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.r.replace(":", "."));
                    sb.append(" WIB - ");
                    sb.append(getAnnualFeeBasicAmount.f(this.D));
                    textView.setText(sb.toString());
                }
                this.tvNote.setText(Html.fromHtml(this.note));
                Bitmap a = getPromotion.a(this.tvNoReferensi.getText().toString(), this);
                this.n = a;
                this.ivQRCode.setImageBitmap(a);
                this.C.setDisplayedChild(2);
                return;
            }
        }
    }

    public static void e(LogRedirector.Logger logger) {
        try {
            M = (J + 67) % Property.TYPE_ARRAY;
            logger.a();
            int i = M + 97;
            J = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '_' : 'W') == '_') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void v() {
        M = (J + 79) % Property.TYPE_ARRAY;
        this.h = this.sharedPreferences.getString("email", "");
        this.m = (User) this.k.where(User.class).equalTo("email", this.h, Case.INSENSITIVE).findFirst();
        J = (M + 47) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        J = (M + 115) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.C, str, -1).g();
        M = (J + 7) % Property.TYPE_ARRAY;
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
        int i = J + setHasDecor$MediaBrowserCompat$MediaItem.aN;
        M = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
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
        int i = J + 49;
        M = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131296380})
    public void batal(View view) {
        boolean z = false;
        if (!(!this.h.isEmpty())) {
            int i = M + 3;
            J = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                this.h.equalsIgnoreCase("");
                throw new ArithmeticException("divide by zero");
            } else if (this.h.equalsIgnoreCase("")) {
                if (this.t != null) {
                    z = true;
                }
                if (z) {
                    this.sharedPreferences.edit().putString("email_session", this.t).commit();
                }
                Intent intent = new Intent(this, LoginSessionActivity.class);
                intent.putExtra("email", this.t);
                startActivity(intent);
                return;
            }
        }
        if (this.w.equals("Y")) {
            CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", this.x);
            bundle.putString("noref", this.u);
            cancelAskTransaksiDialog.setArguments(bundle);
            cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
            int i2 = J + 17;
            M = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
        Bundle bundle2 = new Bundle();
        try {
            bundle2.putString("token", this.x);
            bundle2.putString("noref", this.u);
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
        M = (J + 91) % Property.TYPE_ARRAY;
    }

    @OnClick({2131296444, 2131296443})
    public void clickedReservation(View view) {
        String str;
        char c = 'Z';
        if (this.h.isEmpty()) {
            if ((this.h.equalsIgnoreCase("") ? '1' : ' ') != ' ') {
                int i = J + 89;
                M = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    String str2 = this.t;
                    throw new ArithmeticException("divide by zero");
                }
                if (this.t != null) {
                    this.sharedPreferences.edit().putString("email_session", this.t).commit();
                }
                Intent intent = new Intent(this, LoginSessionActivity.class);
                intent.putExtra("email", this.t);
                startActivity(intent);
                int i2 = J + 31;
                M = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? 'A' : 'Z') != 'Z') {
                    throw new ArithmeticException("divide by zero");
                }
                return;
            }
        }
        v();
        this.p = view;
        Reservation reservation = new Reservation();
        reservation.setNoReff(this.A.getNoReff());
        reservation.setTypeTransaction(this.s);
        reservation.setTxnType(this.s);
        reservation.setTransactionCode(ReservasiOnline.INTERNET_MOBILE_BANKING);
        if (this.p.getId() == 2131296444) {
            c = 24;
        }
        if (c != 24) {
            str = "RESCHEDULE_RESERVATION";
        } else {
            J = (M + 29) % Property.TYPE_ARRAY;
            str = "NEW_RESERVATION";
        }
        reservation.setTypeReservation(str);
        reservation.setTnxStatus(this.z);
        Intent intent2 = new Intent(this, BranchMapActivity.class);
        intent2.putExtra("reff_no", reservation.getNoReff());
        intent2.putExtra("type_transaksi", reservation.getTypeTransaction());
        intent2.putExtra("type_reservation", reservation.getTypeReservation());
        intent2.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.C = (ViewAnimator) findViewById(2131299752);
        CancelTundaPresenter cancelTundaPresenter = new CancelTundaPresenter();
        this.y = cancelTundaPresenter;
        cancelTundaPresenter.a = this;
        CancelReservationPresenter cancelReservationPresenter = new CancelReservationPresenter();
        this.v = cancelReservationPresenter;
        cancelReservationPresenter.a = this;
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if (firebaseResponse == null) {
            M = (J + 49) % Property.TYPE_ARRAY;
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
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
            }
        }
        if (firebaseResponse2 != null) {
            int i2 = J + 31;
            M = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 == 0 ? 4 : ';') != ';') {
                this.u = firebaseResponse2.getRefNo();
                d(firebaseResponse2.getTxnDataDetailList());
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                this.u = firebaseResponse2.getRefNo();
                d(firebaseResponse2.getTxnDataDetailList());
            }
        }
        if ((this.w.equals("Y") ? '`' : 17) != 17) {
            M = (J + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
            this.btnReservasi.setVisibility(8);
            this.btnReschedule.setVisibility(0);
            this.llKcp.setVisibility(0);
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        try {
            M = (J + 65) % Property.TYPE_ARRAY;
            z();
            int i = J + 67;
            M = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void i(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        J = (M + 49) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        try {
            int i = J + 67;
            try {
                M = i % Property.TYPE_ARRAY;
                if (!(i % 2 != 0)) {
                    x();
                    KeluarFormReservationDialog_ViewBinding.a(null, this.C, str, -1).g();
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    x();
                    KeluarFormReservationDialog_ViewBinding.a(null, this.C, str, -1).g();
                }
                M = (J + 85) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        int i = J + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
        M = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            onBackPressed();
            if (this.h.equalsIgnoreCase("")) {
                startActivity(new Intent(this, LandingActivity.class));
                overridePendingTransition(2130772009, 2130772012);
                setOnHierarchyChangeListener.d((Activity) this);
                int i2 = J + 79;
                M = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 == 0 ? '@' : ')') == '@') {
                    throw new ArithmeticException("divide by zero");
                }
                return;
            }
            onBackPressed();
            return;
        }
        onBackPressed();
        this.h.equalsIgnoreCase("");
        throw new NullPointerException();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        try {
            J = (M + 11) % Property.TYPE_ARRAY;
            finish();
            J = (M + 49) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        int i = M + 71;
        J = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 21 : ',') != ',') {
            getMenuInflater().inflate(2131558410, menu);
            z = false;
        } else {
            getMenuInflater().inflate(2131558410, menu);
            z = true;
        }
        return z;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        CancelTundaPresenter cancelTundaPresenter = this.y;
        Call<OpenAccountSuccessActivity<Object>> call = cancelTundaPresenter.d;
        boolean z = false;
        if (!(call == null)) {
            M = (J + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
            try {
                call.cancel();
            } catch (Exception e) {
                throw e;
            }
        }
        cancelTundaPresenter.a = null;
        CancelReservationPresenter cancelReservationPresenter = this.v;
        Call<OpenAccountSuccessActivity<Object>> call2 = cancelReservationPresenter.c;
        if (!(call2 == null)) {
            try {
                int i = M + 49;
                J = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    z = true;
                }
                if (z) {
                    call2.cancel();
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    call2.cancel();
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        cancelReservationPresenter.a = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        if ((r0 != 2131298038 ? (char) 24 : 31) != 24) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (r0 != 2131298038) goto L_0x0082;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        return onOptionsItemSelected(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        startActivity(new android.content.Intent(r6, com.bca.smartbranch.activity.MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        return true;
     */
    @Override // android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            r6 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.M
            r1 = 51
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.J = r0
            r0 = r8
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x002a
            r0 = r7
            int r0 = r0.getItemId()
            r8 = r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: all -> 0x0027
            r1 = r0
            java.lang.String r2 = "divide by zero"
            r1.<init>(r2)     // Catch: all -> 0x0027
            throw r0     // Catch: all -> 0x0027
        L_0x0027:
            r7 = move-exception
            r0 = r7
            throw r0
        L_0x002a:
            r0 = r7
            int r0 = r0.getItemId()
            r9 = r0
            r0 = r9
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 == r1) goto L_0x003e
            r0 = 73
            r8 = r0
            goto L_0x0041
        L_0x003e:
            r0 = 77
            r8 = r0
        L_0x0041:
            r0 = r8
            r1 = 77
            if (r0 == r1) goto L_0x00a3
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.M
            r1 = 115(0x73, float:1.61E-43)
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.J = r0
            r0 = r8
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x007b
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0078
            r8 = r0
            r0 = r9
            r1 = 2131298038(0x7f0906f6, float:1.8214038E38)
            if (r0 == r1) goto L_0x006c
            r0 = 24
            r8 = r0
            goto L_0x006f
        L_0x006c:
            r0 = 31
            r8 = r0
        L_0x006f:
            r0 = r8
            r1 = 24
            if (r0 == r1) goto L_0x0082
            goto L_0x0088
        L_0x0078:
            r7 = move-exception
            r0 = r7
            throw r0
        L_0x007b:
            r0 = r9
            r1 = 2131298038(0x7f0906f6, float:1.8214038E38)
            if (r0 == r1) goto L_0x0088
        L_0x0082:
            r0 = r6
            r1 = r7
            boolean r0 = r0.onOptionsItemSelected(r1)
            return r0
        L_0x0088:
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
        L_0x00a3:
            r0 = r6
            r0.onBackPressed()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        M = (J + 87) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        CC5ChooseMastercardVisaActivity.c(this, i, iArr);
        int i2 = J + 91;
        M = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? '/' : 'K') != 'K') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        J = (M + 11) % Property.TYPE_ARRAY;
        setCardSlogan.e().b = "DetailTundaEChannelNotificationActivity";
        this.j = "DetailTundaEChannelNotificationActivity";
        int i = J + 115;
        M = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        M = (J + 13) % Property.TYPE_ARRAY;
        char c = 2;
        int i = J + 73;
        M = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            c = 17;
        }
        if (c == 17) {
            return 2131492941;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492941;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        J = (M + 1) % Property.TYPE_ARRAY;
        int i = J + 73;
        M = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'B' : 1) == 1) {
            return this;
        }
        throw new NullPointerException();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        this.B = branchMapItemBNAdapter$BranchMapItemVH.c;
        if (Build.VERSION.SDK_INT < 33) {
            CC5ChooseMastercardVisaActivity.c(this);
            int i = M + 15;
            J = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                throw new NullPointerException();
            }
            return;
        }
        M = (J + 67) % Property.TYPE_ARRAY;
        y();
        try {
            int i2 = M + 53;
            J = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? 'E' : '=') == 'E') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        int i = M + 19;
        J = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            this.f.b(this.llDetail, this.ivDetail);
            return;
        }
        this.f.b(this.llDetail, this.ivDetail);
        Object[] objArr = null;
        int length = objArr.length;
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", this.z);
        startActivity(intent);
        try {
            int i = M + 115;
            J = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
        M = (J + 17) % Property.TYPE_ARRAY;
        if (chooseBCACardAdapter$ViewHolder.e) {
            this.v.e(new FormUbahTellerActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.m.getImei()));
            J = (M + 39) % Property.TYPE_ARRAY;
            return;
        }
        this.y.a(new choosePic(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
        int i = M + 45;
        J = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'L' : 'O') == 'L') {
            throw new ArithmeticException("divide by zero");
        }
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
        M = (J + 69) % Property.TYPE_ARRAY;
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
        int i = M + 99;
        J = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void w_(String str) {
        ViewAnimator viewAnimator;
        int i;
        int i2 = M + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        J = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? '8' : 'V') != 'V') {
            x();
            viewAnimator = this.C;
            i = 1;
        } else {
            x();
            viewAnimator = this.C;
            i = 0;
        }
        KeluarFormReservationDialog_ViewBinding.a(null, viewAnimator, str, i).g();
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void x_(String str) {
        KeluarFormReservationDialog_ViewBinding keluarFormReservationDialog_ViewBinding;
        int i = M + 11;
        J = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            x();
            keluarFormReservationDialog_ViewBinding = KeluarFormReservationDialog_ViewBinding.a(null, this.C, str, 0);
        } else {
            x();
            keluarFormReservationDialog_ViewBinding = KeluarFormReservationDialog_ViewBinding.a(null, this.C, str, 1);
        }
        keluarFormReservationDialog_ViewBinding.g();
    }

    public final void y() {
        int i = J + 41;
        M = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            c(this.n);
            throw new NullPointerException();
        } else {
            c(this.n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        r4.q = new com.bca.smartbranch.dialog.QRCodeDialog();
        com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.M = (com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.J + 81) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        r0 = r4.q;
        r0 = r4.n;
        r0 = r4.u;
        r0.b = r0;
        r0.d = r0;
        r4.q.show(l(), "QRCodeDialog");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
        com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.M = (com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.J + 3) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r4.q == null) goto L_0x0037;
     */
    @butterknife.OnClick({2131297408})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void zoomQRCode() {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.M
            r1 = 123(0x7b, float:1.72E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.J = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001a
            r0 = 1
            r5 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r5 = r0
        L_0x001c:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x002b
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            if (r0 != 0) goto L_0x0051
            goto L_0x0037
        L_0x002b:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q     // Catch: Exception -> 0x008f
            r6 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x008c
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0051
        L_0x0037:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r1 = new com.bca.smartbranch.dialog.QRCodeDialog
            r2 = r1
            r2.<init>()
            r0.q = r1
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.J
            r1 = 81
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.M = r0
        L_0x0051:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            r6 = r0
            r0 = r4
            android.graphics.Bitmap r0 = r0.n
            r7 = r0
            r0 = r4
            java.lang.String r0 = r0.u
            r8 = r0
            r0 = r6
            r1 = r7
            r0.b = r1
            r0 = r6
            r1 = r8
            r0.d = r1
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            r1 = r4
            o.isDetached r1 = r1.l()
            java.lang.String r2 = "QRCodeDialog"
            r0.show(r1, r2)
            int r0 = com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.J     // Catch: Exception -> 0x0089
            r1 = 3
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.M = r0     // Catch: Exception -> 0x0089
            return
        L_0x0089:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x008c:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x008f:
            r6 = move-exception
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity.zoomQRCode():void");
    }
}
