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
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.global.TransaksiTunda;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CancelAskTransaksiDialog;
import com.bca.smartbranch.dialog.CancelTransaksiDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.CancelReservationPresenter;
import com.bca.smartbranch.presenter.CancelTundaPresenter;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC25CFormKartuKreditFragment;
import o.CC4BCACardInfoActivity_ViewBinding;
import o.ChooseBCACardAdapter$ViewHolder;
import o.FormUbahTellerActivity_ViewBinding;
import o.InfoDocumentUnderlyingActivity;
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
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaActivity.class */
public class DetailTundaActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, CancelTundaPresenter.IconCompatParcelizer, CancelReservationPresenter.write {
    private static int G;
    private static char[] H = {'o', 229, 234, 201, 196, 222, 222, 195, 204, 236, 227, 229, 239, 231, 230, 229, 227, 228, 225, 199, 203, 237, 236, 238, 235, 226, 224, 231};
    private static int I;
    private TransaksiTunda A;
    private String B;
    private List<DetailTransactionResponse.TxnDataDetail> D;
    private ViewAnimator E;
    private boolean F;
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
    private CancelReservationPresenter p;
    private View q;
    private QRCodeDialog r;
    @BindString(2131822092)
    String retry;
    private String s;
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
    private DetailTransactionPresenter u;
    private CancelTundaPresenter v;
    private String w;
    private String x;
    private String y;
    private String z;
    setMessage f = new setMessage();
    private String C = "";
    private String t = "";

    private static void a(boolean z, int[] iArr, byte[] bArr, Object[] objArr) {
        String str;
        synchronized (CC25CFormKartuKreditFragment.b) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(H, i, cArr, 0, i2);
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
            if (z) {
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

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.y);
        sb.append(".jpg");
        String obj = sb.toString();
        if (!(Build.VERSION.SDK_INT < 29)) {
            I = (G + 33) % Property.TYPE_ARRAY;
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
                G = (I + 21) % Property.TYPE_ARRAY;
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                G = (I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 28, setHasDecor$MediaBrowserCompat$MediaItem.aP, 0}, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (this.F) {
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            G = (I + 91) % Property.TYPE_ARRAY;
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.r;
        if ((qRCodeDialog != null ? 'N' : ']') == 'N') {
            qRCodeDialog.dismiss();
        }
    }

    public static void b(LogRedirector.Logger logger) {
        int i = G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        I = i % Property.TYPE_ARRAY;
        boolean z = i % 2 == 0;
        logger.a();
        if (z) {
            throw new ArithmeticException("divide by zero");
        }
    }

    private void y() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.y;
        infoDocumentUnderlyingActivity.d = "TUNDA";
        infoDocumentUnderlyingActivity.b = this.w;
        infoDocumentUnderlyingActivity.a = this.A.getType();
        this.u.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        try {
            G = (I + 61) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        int i = G + 67;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'E' : 23) != 23) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.E, str, -1).g();
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.E, str, -1).g();
        }
        try {
            int i2 = G + 3;
            I = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 == 0 ? 'T' : 15) == 'T') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        G = (I + 95) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        boolean z = true;
        this.E.setDisplayedChild(1);
        int i = G + 55;
        I = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            z = false;
        }
        if (z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        char c;
        char c2;
        G = (I + 73) % Property.TYPE_ARRAY;
        this.D = list;
        for (DetailTransactionResponse.TxnDataDetail txnDataDetail : list) {
            G = (I + 35) % Property.TYPE_ARRAY;
            String key = txnDataDetail.getKey();
            key.hashCode();
            char c3 = '5';
            boolean z = false;
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
                    if ((key.equals("ReservationTime") ? '+' : 4) == '+') {
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
                    if (key.equals("Ruangan")) {
                        int i = I + 53;
                        G = i % Property.TYPE_ARRAY;
                        if (i % 2 != 0) {
                        }
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
                    if (key.equals("BranchAddress")) {
                        I = (G + 13) % Property.TYPE_ARRAY;
                        c = 6;
                        G = (I + 11) % Property.TYPE_ARRAY;
                        break;
                    }
                    c = 65535;
                    break;
                case 1260938190:
                    if (!key.equals("Nomor Referensi")) {
                        c3 = 'R';
                    }
                    if (c3 != 'R') {
                        c = 7;
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
                        case 49:
                            if (value.equals("1")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 50:
                            if (value.equals("2")) {
                                int i2 = I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
                                G = i2 % Property.TYPE_ARRAY;
                                if ((i2 % 2 != 0 ? 18 : '!') != '!') {
                                    c2 = 0;
                                    break;
                                } else {
                                    c2 = 1;
                                    break;
                                }
                            }
                            c2 = 65535;
                            break;
                        case 51:
                            if (value.equals("3")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                            if (value.equals("4")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 53:
                            if (value.equals("5")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 54:
                            if (value.equals("6")) {
                                z = true;
                            }
                            if (z) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
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
                                        if (c2 != 5) {
                                            break;
                                        } else {
                                            this.z = "6";
                                            this.s = "DEPOSITO";
                                            break;
                                        }
                                    } else {
                                        this.z = "5";
                                        this.s = "Tahapan Berjangka";
                                        break;
                                    }
                                } else {
                                    this.z = "4";
                                    this.s = "BCA Dollar";
                                    break;
                                }
                            } else {
                                this.z = "3";
                                this.s = "Tapres BCA";
                                break;
                            }
                        } else {
                            this.z = "2";
                            this.s = "Tahapan Xpresi";
                            break;
                        }
                    } else {
                        this.z = "1";
                        this.s = "Tahapan BCA";
                        break;
                    }
                case 1:
                    this.C = txnDataDetail.getValue();
                    break;
                case 2:
                    this.t = txnDataDetail.getValue();
                    break;
                case 3:
                    this.B = txnDataDetail.getValue();
                    this.tvDescriptionKey.setText(getResources().getString(2131822000));
                    break;
                case 4:
                    if (!txnDataDetail.getValue().equals("Reguler")) {
                        this.llRuangan.setVisibility(0);
                        this.tvJenisRuangan.setText(txnDataDetail.getValue());
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.tvBranchName.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case 6:
                    this.tvBranchAddress.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case 7:
                    this.tvNoReferensi.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
            }
        }
        if (this.x.equals("Y")) {
            TextView textView = this.tvWaktu;
            StringBuilder sb = new StringBuilder();
            sb.append(this.t.replace(":", "."));
            sb.append(" WIB - ");
            sb.append(getAnnualFeeBasicAmount.f(this.C));
            textView.setText(sb.toString());
        }
        this.tvNote.setText(Html.fromHtml(this.note));
        Bitmap a = getPromotion.a(this.tvNoReferensi.getText().toString(), this);
        this.n = a;
        this.ivQRCode.setImageBitmap(a);
        this.tvDescriptionValue.setText(this.s);
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
        int i = G + 29;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '%' : '\t') == '%') {
            Object[] objArr = null;
            int length = objArr.length;
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
        int i = I + 19;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131296380})
    public void batal(View view) {
        G = (I + 115) % Property.TYPE_ARRAY;
        if (this.x.equals("Y")) {
            CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", this.w);
            bundle.putString("noref", this.y);
            cancelAskTransaksiDialog.setArguments(bundle);
            cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
            return;
        }
        CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
        Bundle bundle2 = new Bundle();
        bundle2.putString("token", this.w);
        bundle2.putString("noref", this.y);
        cancelTransaksiDialog.setArguments(bundle2);
        cancelTransaksiDialog.show(l(), "CancelTransaksiDialog");
        int i = I + 33;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? (char) 0 : 2) != 2) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void c(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            G = (I + 23) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296444, 2131296443})
    public void clickedReservation(View view) {
        String str;
        this.q = view;
        Reservation reservation = new Reservation();
        reservation.setNoReff(this.A.getNoReff());
        reservation.setTypeTransaction(this.s);
        reservation.setTxnType(this.B);
        if ((this.q.getId() == 2131296444 ? '[' : 17) != 17) {
            G = (I + 17) % Property.TYPE_ARRAY;
            str = "NEW_RESERVATION";
        } else {
            str = "RESCHEDULE_RESERVATION";
        }
        reservation.setTypeReservation(str);
        reservation.setTnxStatus(this.z);
        reservation.setTransactionCode(ReservasiOnline.PEMBUKAAN_REKENING);
        Intent intent = new Intent(this, BranchMapActivity.class);
        intent.putExtra("reff_no", reservation.getNoReff());
        intent.putExtra("type_transaksi", reservation.getTypeTransaction());
        intent.putExtra("type_reservation", reservation.getTypeReservation());
        intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        startActivity(intent);
        int i = I + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '1' : '<') != '<') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.E = (ViewAnimator) findViewById(2131299752);
        this.u = new DetailTransactionPresenter();
        this.p = new CancelReservationPresenter();
        this.v = new CancelTundaPresenter();
        this.u.e = this;
        this.p.a = this;
        this.v.a = this;
        TransaksiTunda transaksiTunda = (TransaksiTunda) ListUtil.OneItemImmutableList.a(getIntent().getExtras().getParcelable("transaksi_tunda"));
        this.A = transaksiTunda;
        this.y = transaksiTunda.getNoReff();
        this.x = this.A.getFlagBooking();
        this.w = this.A.getToken();
        if ((this.x.equals("Y") ? '8' : '\'') != '\'') {
            int i = G + 7;
            I = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '&' : 1) != 1) {
                this.btnReservasi.setVisibility(63);
            } else {
                this.btnReservasi.setVisibility(8);
            }
            this.btnReschedule.setVisibility(0);
            this.llKcp.setVisibility(0);
        }
        if (this.A.getServiceType() != null) {
            I = (G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
            if (this.A.getServiceType().equals("TL")) {
                I = (G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
                this.btnReservasi.setVisibility(8);
                this.btnReschedule.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.btnBatal.getLayoutParams();
                layoutParams.width = -2;
                int dimensionPixelSize = getResources().getDimensionPixelSize(2131165353);
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                layoutParams.weight = 0.0f;
                this.btnBatal.setLayoutParams(layoutParams);
            }
        }
        y();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        int i = G + 75;
        I = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
        }
        this.tvErrorMessage.setText(str);
        this.E.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        I = (G + 17) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        this.E.setDisplayedChild(1);
        I = (G + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        int i = I + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        G = i % Property.TYPE_ARRAY;
        boolean z = i % 2 != 0;
        z();
        if (z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        try {
            G = (I + 69) % Property.TYPE_ARRAY;
            this.E.setDisplayedChild(0);
            int i = G + 95;
            I = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
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
        int i = I + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '\b' : '/') != '/') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        G = (I + 63) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.E, str, -1).g();
        int i = G + 43;
        I = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new NullPointerException();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        G = (I + 83) % Property.TYPE_ARRAY;
        finish();
        int i = I + 75;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        I = (G + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
        getMenuInflater().inflate(2131558410, menu);
        G = (I + 57) % Property.TYPE_ARRAY;
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        I = (G + 111) % Property.TYPE_ARRAY;
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.u;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        if ((call != null ? 11 : 'F') == 11) {
            call.cancel();
        }
        detailTransactionPresenter.e = null;
        int i = I + 43;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '?' : 2) != 2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (!(itemId == 16908332)) {
            I = (G + 91) % Property.TYPE_ARRAY;
            if (itemId != 2131298038) {
                int i = I + 113;
                G = i % Property.TYPE_ARRAY;
                char c = i % 2 != 0 ? '/' : 29;
                boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
                if (c == 29) {
                    return onOptionsItemSelected;
                }
                throw new NullPointerException();
            }
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        I = (G + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        CC4BCACardInfoActivity_ViewBinding.e(this, i, iArr);
        G = (I + 77) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = I + 5;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            try {
                setCardSlogan.e().b = "DetailTundaActivity";
                this.j = "DetailTundaActivity";
            } catch (Exception e) {
                throw e;
            }
        } else {
            setCardSlogan.e().b = "DetailTundaActivity";
            this.j = "DetailTundaActivity";
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = I + 73;
        G = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return 2131492940;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492940;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        I = (G + 21) % Property.TYPE_ARRAY;
        I = (G + 13) % Property.TYPE_ARRAY;
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        I = (G + 65) % Property.TYPE_ARRAY;
        y();
        int i = I + 5;
        G = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        I = (G + 3) % Property.TYPE_ARRAY;
        this.F = branchMapItemBNAdapter$BranchMapItemVH.c;
        if (Build.VERSION.SDK_INT < 33) {
            CC4BCACardInfoActivity_ViewBinding.d(this);
            return;
        }
        try {
            v();
            int i = G + 87;
            I = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 21 : '(') != '(') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        G = (I + 111) % Property.TYPE_ARRAY;
        this.f.b(this.llDetail, this.ivDetail);
        G = (I + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", this.z);
        startActivity(intent);
        int i = G + 87;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 30 : 2) != 2) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
        if (chooseBCACardAdapter$ViewHolder.e) {
            this.p.e(new FormUbahTellerActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.m.getImei()));
            try {
                I = (G + 15) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.v.a(new choosePic(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
            int i = G + 37;
            I = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
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
        int i = G + 77;
        I = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
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
        G = (I + 115) % Property.TYPE_ARRAY;
    }

    public final void v() {
        int i = G + 113;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 26 : '\t') != 26) {
            try {
                b(this.n);
            } catch (Exception e) {
                throw e;
            }
        } else {
            b(this.n);
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void w_(String str) {
        I = (G + 21) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.E, str, 0).g();
        int i = G + setHasDecor$MediaBrowserCompat$MediaItem.aM;
        I = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 27 : 'D') != 'D') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void x_(String str) {
        G = (I + 67) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.E, str, 0).g();
        int i = I + 71;
        G = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? ':' : 'a') == ':') {
            throw new NullPointerException();
        }
    }

    @OnClick({2131297408})
    public void zoomQRCode() {
        try {
            G = (I + 65) % Property.TYPE_ARRAY;
            if (this.r == null) {
                this.r = new QRCodeDialog();
            }
            try {
                QRCodeDialog qRCodeDialog = this.r;
                Bitmap bitmap = this.n;
                String str = this.y;
                qRCodeDialog.b = bitmap;
                qRCodeDialog.d = str;
                this.r.show(l(), "QRCodeDialog");
                int i = G + 3;
                I = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
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
