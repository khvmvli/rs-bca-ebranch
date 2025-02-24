package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
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
import com.bca.smartbranch.adapter.ListDetailTransaksiAdapter;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.global.TransaksiTunda;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CancelAskTransaksiDialog;
import com.bca.smartbranch.dialog.CancelTransaksiDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.BankListPresenter;
import com.bca.smartbranch.presenter.CancelReservationPresenter;
import com.bca.smartbranch.presenter.CancelTundaPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.GetCustAcctListPresenter;
import com.bca.smartbranch.presenter.GetFundPurposePresenter;
import com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter;
import com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter;
import com.bca.smartbranch.presenter.InquiryEditDataORPresenter;
import com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter;
import com.bca.smartbranch.presenter.KliringPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BN7PengambilanUpdateReceiverActivity;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.CC23AFormKartuKreditFragment;
import o.ChooseBCACardAdapter$ViewHolder;
import o.ChooseSubMastercardAdapter$ViewHolder_ViewBinding;
import o.FormUbahTellerActivity_ViewBinding;
import o.InfoDocumentUnderlyingActivity;
import o.InfoProductActivity;
import o.ListUtil;
import o.LogRedirector;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.choosePic;
import o.clikedKeyHilang;
import o.consumeDisplayCutout;
import o.documentProvider;
import o.equals;
import o.getPromotion;
import o.onChooseBidangUsaha;
import o.onClickDetail;
import o.onClickMenu;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener;
import o.subscribeRemoveMasterCardEvent;
import o.subscribeUbahVisaCardEvent;
import org.joda.time.format.DateTimeFormat;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaTellerActivity.class */
public class DetailTundaTellerActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, DaftarTransferPresenter.RemoteActionCompatParcelizer, GetCustAcctListPresenter.read, CancelReservationPresenter.write, CancelTundaPresenter.IconCompatParcelizer, GetFundPurposePresenter.IconCompatParcelizer, InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver, GetTxnTellerDetailKUPresenter.write, InquiryLoadDataBTPresenter.IconCompatParcelizer, KliringPresenter.RemoteActionCompatParcelizer, BankListPresenter.IconCompatParcelizer {
    private static char[] ad = {13806, 13800, 13816, 13817, 13801, 13813, 13812, 13748, 13823, 13819, 13802, 13822, 13811, 13804, 13810, 13815};
    private static char ag = (char) 4;
    private static int ah;
    private static int ak;
    private boolean A;
    private boolean D;
    private ListDetailTransaksiAdapter E;
    private CancelTundaPresenter G;
    private BankListPresenter H;
    private CancelReservationPresenter I;
    private DaftarTransferPresenter J;
    private String K;
    private DetailTransactionPresenter L;
    private GetCustAcctListResponse M;
    private GetCustAcctListPresenter N;
    private GetTxnTellerDetailKUPresenter O;
    private InquiryEditDataORPresenter P;
    private InquiryLoadDataBTPresenter Q;
    private GetTxnTellerDetailPresenter R;
    private GetFundPurposePresenter S;
    private MasterFundSourcePurposeResponse T;
    private KliringPresenter U;
    private String V;
    private TransaksiTunda W;
    private String X;
    private ViewAnimator Z;
    private String ac;
    private boolean af;
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
    private List<DetailTransactionResponse.TxnDataDetail> p;
    private QRCodeDialog r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298329)
    setOnStartEnterTransitionListener rvListTransaksi;
    private int s;
    private View t;
    @BindString(2131822498)
    String tarikanCek;
    @BindString(2131822499)
    String tarikanTunai;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299409)
    TextView tvMessage;
    @BindView(2131299467)
    TextView tvNoReff;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299554)
    TextView tvWaktu;
    @BindView(2131299803)
    View vwSeparator;
    private GetTxnTellerDetailKUResponse w;
    private GetTxnTellerDetailResponse x;
    private boolean y;
    setMessage f = new setMessage();
    private Integer q = -1;
    private List<DetailTransactionResponse.ValueTxnDataDetail> ae = new ArrayList();
    private String ab = "";
    private String B = "";
    private boolean v = false;
    private boolean u = false;
    private String F = "";
    private long C = 0;
    private ArrayList<Long> z = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> Y = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> aa = new ArrayList<>();

    private void A() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        try {
            infoDocumentUnderlyingActivity.e = this.V;
            infoDocumentUnderlyingActivity.d = "TUNDA";
            infoDocumentUnderlyingActivity.b = this.X;
            infoDocumentUnderlyingActivity.a = this.W.getType();
            this.L.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
            int i = ak + 81;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'L' : ')') != ')') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private Context B() {
        int i = ah + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
        ak = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            return this;
        }
        throw new NullPointerException();
    }

    private void D(String str) {
        ah = (ak + 5) % Property.TYPE_ARRAY;
        if ((str.isEmpty() ? 'c' : 'a') == 'c') {
            ah = (ak + 101) % Property.TYPE_ARRAY;
            str = "Individu";
        }
        this.U.d(this.m, str);
        ah = (ak + 59) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
        if ((!r4.getTxnDetail().getTxnNotes().isEmpty()) != true) goto L_0x0148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
        r0.append(r4.getTxnDetail().getTxnNotes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
        if (r4.getTxnDetail().getTxnNotes2() == null) goto L_0x00c4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c9, code lost:
        if (r9 == false) goto L_0x01bf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
        r0 = com.bca.smartbranch.activity.DetailTundaTellerActivity.ak + 115;
        com.bca.smartbranch.activity.DetailTundaTellerActivity.ah = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
        if ((r0 % 2) == 0) goto L_0x00eb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
        r9 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
        r9 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
        if (r9 == '\b') goto L_0x0106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
        if (r4.getTxnDetail().getTxnNotes2().isEmpty() != false) goto L_0x01bf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
        r0 = r4.getTxnDetail().getTxnNotes2().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
        r0 = null;
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
        if (r0 != false) goto L_0x0121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011b, code lost:
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
        r9 = '\"';
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
        if (r9 == 3) goto L_0x012e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012e, code lost:
        r0.append(" ");
        r0.append(r4.getTxnDetail().getTxnNotes2());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
        if (r0 == false) goto L_0x00a7;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static com.bca.smartbranch.data.localdb.Kliring c(com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse r4) {
        /*
        // Method dump skipped, instructions count: 816
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaTellerActivity.c(com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse):com.bca.smartbranch.data.localdb.Kliring");
    }

    private static void c(byte b, char[] cArr, int i, Object[] objArr) {
        int i2;
        String str;
        synchronized (CC23AFormKartuKreditFragment.i) {
            char[] cArr2 = ad;
            char c = ag;
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

    public static void c(LogRedirector.Logger logger) {
        ah = (ak + 25) % Property.TYPE_ARRAY;
        logger.a();
        ak = (ah + 99) % Property.TYPE_ARRAY;
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.V);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            int i = ah + 85;
            ak = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            } else {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[0];
                strArr[1] = uri.getPath();
                String[] strArr2 = new String[1];
                strArr2[1] = "image/jpeg";
                MediaScannerConnection.scanFile(this, strArr, strArr2, null);
            }
        } else {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (!(!file2.exists())) {
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
            c((byte) (13 - TextUtils.getOffsetAfter("", 0)), new char[]{1, 7, 3, 11, 3, 0, 11, 5, 7, '\f', '\r', 5, 1, 3, 5, '\r', 7, 2, 15, 6, '\t', 2, '\t', 1, 15, '\b', '\t', 0}, getResources().getString(2131821267).substring(2, 4).codePointAt(0) - 8, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
            ah = (ak + 77) % Property.TYPE_ARRAY;
        }
        x();
        if (this.af) {
            ah = (ak + 37) % Property.TYPE_ARRAY;
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.r;
        if (qRCodeDialog == null) {
            z = true;
        }
        if (!z) {
            ah = (ak + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
            qRCodeDialog.dismiss();
            ah = (ak + 55) % Property.TYPE_ARRAY;
        }
    }

    private void y() {
        ah = (ak + 55) % Property.TYPE_ARRAY;
        this.Y.clear();
        this.aa.clear();
        int i = ak + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        ah = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private void z(String str) {
        int i = ah + 57;
        ak = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '<' : '-') != '<') {
            try {
                this.N.b(this.m, str);
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.N.b(this.m, str);
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void A(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            int i = ah + 7;
            try {
                ak = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 'T' : 'P') == 'T') {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
        ah = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'C' : '\\') == 'C') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void B(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            int i = ak + 27;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '$' : ';') != ';') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    public final void C(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = ah + 87;
        ak = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void a(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse, GetCustAcctListResponse getCustAcctListResponse, List<onClickDetail.RemoteActionCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list3, List<? extends DaftarTransferResponse.DaftarTransferOutput> list4, String str) {
        ak = (ah + 65) % Property.TYPE_ARRAY;
        if (str != null) {
            try {
                ah = (ak + 53) % Property.TYPE_ARRAY;
                if (str.equals("EDIT_DATA")) {
                    Intent intent = new Intent(this, BN7PengambilanUpdateReceiverActivity.class);
                    BN7PengambilanUpdateReceiverActivity.write write = BN7PengambilanUpdateReceiverActivity.j;
                    intent.putExtra(BN7PengambilanUpdateReceiverActivity.v, ListUtil.OneItemImmutableList.e(getTxnTellerDetailKUResponse));
                    boolean z = false;
                    if (getCustAcctListResponse != null) {
                        try {
                            int i = ah + 33;
                            ak = i % Property.TYPE_ARRAY;
                            if (i % 2 == 0) {
                                z = true;
                            }
                            if (!z) {
                                BN7PengambilanUpdateReceiverActivity.write write2 = BN7PengambilanUpdateReceiverActivity.j;
                                intent.putExtra(BN7PengambilanUpdateReceiverActivity.w, ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
                            } else {
                                BN7PengambilanUpdateReceiverActivity.write write3 = BN7PengambilanUpdateReceiverActivity.j;
                                intent.putExtra(BN7PengambilanUpdateReceiverActivity.w, ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
                                throw new NullPointerException();
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    BN7PengambilanUpdateReceiverActivity.write write4 = BN7PengambilanUpdateReceiverActivity.j;
                    intent.putExtra(BN7PengambilanUpdateReceiverActivity.y, ListUtil.OneItemImmutableList.e(list));
                    BN7PengambilanUpdateReceiverActivity.write write5 = BN7PengambilanUpdateReceiverActivity.j;
                    intent.putExtra(BN7PengambilanUpdateReceiverActivity.z, ListUtil.OneItemImmutableList.e(list2));
                    BN7PengambilanUpdateReceiverActivity.write write6 = BN7PengambilanUpdateReceiverActivity.j;
                    intent.putExtra(BN7PengambilanUpdateReceiverActivity.I, ListUtil.OneItemImmutableList.e(list3));
                    BN7PengambilanUpdateReceiverActivity.write write7 = BN7PengambilanUpdateReceiverActivity.j;
                    intent.putExtra(BN7PengambilanUpdateReceiverActivity.u, ListUtil.OneItemImmutableList.e(list4));
                    BN7PengambilanUpdateReceiverActivity.write write8 = BN7PengambilanUpdateReceiverActivity.j;
                    intent.putExtra(BN7PengambilanUpdateReceiverActivity.A, this.F);
                    x();
                    startActivity(intent);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        ah = (ak + 61) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        ah = (ak + 91) % Property.TYPE_ARRAY;
        try {
            try {
                this.tvErrorMessage.setText(str);
                this.Z.setDisplayedChild(1);
                int i = ak + 33;
                ah = i % Property.TYPE_ARRAY;
                if (!(i % 2 == 0)) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04ef, code lost:
        if (r0 == false) goto L_0x0512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x050f, code lost:
        if (r8.ae.get(r12).getTxnType().equals("Pendebetan Dana") == false) goto L_0x0512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0529, code lost:
        if (r8.ae.get(r12).getTxnType().equals("Kliring") == false) goto L_0x056a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x052c, code lost:
        r0.append(com.bca.smartbranch.data.localdb.ReservasiOnline.KLIRING);
        r9 = "Warkat";
     */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a_(java.util.List<com.bca.smartbranch.data.api.response.DetailTransactionResponse.TxnDataDetail> r9) {
        /*
        // Method dump skipped, instructions count: 1943
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaTellerActivity.a_(java.util.List):void");
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void b(GetCustAcctListResponse getCustAcctListResponse) {
        int i = ak + 51;
        ah = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v36, types: [double] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [double] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse r8) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaTellerActivity.b(com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse):void");
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
            int i = ak + 15;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '0' : 'O') == '0') {
                Object[] objArr = null;
                int length = objArr.length;
            }
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
        try {
            ak = (ah + 113) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296380})
    public void batal() {
        ah = (ak + 115) % Property.TYPE_ARRAY;
        if (this.K.equals("Y")) {
            CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("token", this.X);
                bundle.putString("noref", this.V);
                cancelAskTransaksiDialog.setArguments(bundle);
                cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
            } catch (Exception e) {
                throw e;
            }
        } else {
            CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
            Bundle bundle2 = new Bundle();
            bundle2.putString("token", this.X);
            bundle2.putString("noref", this.V);
            cancelTransaksiDialog.setArguments(bundle2);
            cancelTransaksiDialog.show(l(), "CancelTransaksiDialog");
            ak = (ah + 71) % Property.TYPE_ARRAY;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void c(GetCustAcctListResponse getCustAcctListResponse) {
        ah = (ak + 99) % Property.TYPE_ARRAY;
        this.M = getCustAcctListResponse;
        if (this.x.getTxnDetail().getType().equals("Tarikan Tunai")) {
            x();
            Intent intent = new Intent(B(), TarikanUbahTransaksiActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
            intent.putExtra("token", this.X);
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent);
            return;
        }
        if ((this.x.getTxnDetail().getType().equals("Kliring") ? 'V' : 'D') == 'V') {
            y();
            D("Individu");
        }
        try {
            ak = (ah + 65) % Property.TYPE_ARRAY;
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
        try {
            try {
                ak = (ah + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296444, 2131296443})
    public void clickedReservation(View view) {
        this.t = view;
        Reservation reservation = new Reservation();
        reservation.setNoReff(this.W.getNoReff());
        reservation.setTypeTransaction("Transaksi Teller");
        reservation.setTxnType("Transaksi Teller");
        boolean z = false;
        String str = "NEW_RESERVATION";
        if (!(this.t.getId() == 2131296444)) {
            ak = (ah + 17) % Property.TYPE_ARRAY;
            str = "RESCHEDULE_RESERVATION";
        } else {
            int i = ah + 53;
            ak = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                z = true;
            }
            if (z) {
                throw new NullPointerException();
            }
        }
        reservation.setTypeReservation(str);
        reservation.setTnxStatus("8");
        reservation.setTransactionCode(this.ac);
        Intent intent = new Intent(this, BranchMapActivity.class);
        intent.putExtra("reff_no", reservation.getNoReff());
        intent.putExtra("type_transaksi", reservation.getTypeTransaction());
        intent.putExtra("type_reservation", reservation.getTypeReservation());
        intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        intent.putExtra("txn_data_tunda", ListUtil.OneItemImmutableList.e(this.p));
        intent.putExtra("is_tartun_jumbes", this.D);
        startActivity(intent);
        ak = (ah + 101) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.Z = (ViewAnimator) findViewById(2131299752);
        DetailTransactionPresenter detailTransactionPresenter = new DetailTransactionPresenter();
        this.L = detailTransactionPresenter;
        detailTransactionPresenter.e = this;
        GetTxnTellerDetailPresenter getTxnTellerDetailPresenter = new GetTxnTellerDetailPresenter();
        this.R = getTxnTellerDetailPresenter;
        getTxnTellerDetailPresenter.c = this;
        DaftarTransferPresenter daftarTransferPresenter = new DaftarTransferPresenter();
        this.J = daftarTransferPresenter;
        daftarTransferPresenter.c = this;
        GetCustAcctListPresenter getCustAcctListPresenter = new GetCustAcctListPresenter();
        this.N = getCustAcctListPresenter;
        getCustAcctListPresenter.e = this;
        CancelTundaPresenter cancelTundaPresenter = new CancelTundaPresenter();
        this.G = cancelTundaPresenter;
        cancelTundaPresenter.a = this;
        GetFundPurposePresenter getFundPurposePresenter = new GetFundPurposePresenter();
        this.S = getFundPurposePresenter;
        getFundPurposePresenter.e = this;
        CancelReservationPresenter cancelReservationPresenter = new CancelReservationPresenter();
        this.I = cancelReservationPresenter;
        cancelReservationPresenter.a = this;
        InquiryEditDataORPresenter inquiryEditDataORPresenter = new InquiryEditDataORPresenter();
        this.P = inquiryEditDataORPresenter;
        inquiryEditDataORPresenter.b = this;
        InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = new InquiryLoadDataBTPresenter();
        this.Q = inquiryLoadDataBTPresenter;
        inquiryLoadDataBTPresenter.e = this;
        GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = new GetTxnTellerDetailKUPresenter();
        this.O = getTxnTellerDetailKUPresenter;
        getTxnTellerDetailKUPresenter.a = this;
        KliringPresenter kliringPresenter = new KliringPresenter();
        this.U = kliringPresenter;
        kliringPresenter.d = this;
        BankListPresenter bankListPresenter = new BankListPresenter();
        this.H = bankListPresenter;
        bankListPresenter.d = this;
        Bundle extras = getIntent().getExtras();
        this.W = (TransaksiTunda) ListUtil.OneItemImmutableList.a(extras.getParcelable("transaksi_tunda"));
        this.s = extras.getInt("data_position");
        this.A = extras.getBoolean("is_multiple");
        this.y = extras.getBoolean("is_from_multiple");
        this.V = this.W.getNoReff();
        this.X = this.W.getToken();
        String flagBooking = this.W.getFlagBooking();
        this.K = flagBooking;
        if (this.y) {
            ah = (ak + 71) % Property.TYPE_ARRAY;
            this.btnReservasi.setVisibility(4);
            this.btnReschedule.setVisibility(8);
        } else {
            if (flagBooking.equals("Y")) {
                this.btnReschedule.setVisibility(0);
                this.btnReservasi.setVisibility(8);
                this.llKcp.setVisibility(0);
                this.vwSeparator.setVisibility(8);
                ah = (ak + 57) % Property.TYPE_ARRAY;
            } else {
                this.btnReservasi.setVisibility(0);
                this.btnReschedule.setVisibility(8);
                this.llKcp.setVisibility(8);
                this.vwSeparator.setVisibility(0);
            }
        }
        Bitmap a = getPromotion.a(this.V, this);
        this.n = a;
        this.ivQRCode.setImageBitmap(a);
        A();
        ak = (ah + 81) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(GetTxnTellerDetailResponse getTxnTellerDetailResponse, GetCustAcctListResponse getCustAcctListResponse, KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse, CategoriesORResponse categoriesORResponse, List<DaftarTransferResponse.DaftarTransferOutput> list) {
        Intent intent = new Intent(this, OutwardRemittanceFormUbahActivity.class);
        intent.putExtra("TellerType", "kirim_uang");
        intent.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(kategoriTujuanTransaksiORResponse));
        intent.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(categoriesORResponse));
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(getTxnTellerDetailResponse));
        intent.putExtra("token", this.X);
        intent.putExtra("data_daftar_transfer", ListUtil.OneItemImmutableList.e(list));
        char c = 3;
        if ((getCustAcctListResponse != null ? 19 : 'O') != 'O') {
            try {
                try {
                    ah = (ak + 3) % Property.TYPE_ARRAY;
                    intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        x();
        startActivity(intent);
        int i = ah + 53;
        ak = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            c = 'I';
        }
        if (c != 'I') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final <T> void d(T t) {
        x();
        onClickMenu onclickmenu = (onClickMenu) t;
        Intent intent = new Intent(B(), subscribeUbahVisaCardEvent.class);
        if (this.m.getVerified().equals("Y")) {
            ah = (ak + 83) % Property.TYPE_ARRAY;
            try {
                intent.putExtra("is_draft", false);
                intent.putExtra("isUbahForm", true);
                intent.putExtra("isUbahFormEnabled", true);
                intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.Y));
                intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.aa));
                intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.z));
                intent.putExtra("BANK_LOCAL_LIST", ListUtil.OneItemImmutableList.e(onclickmenu));
                intent.putExtra("list_acct", ListUtil.OneItemImmutableList.e(this.M));
                intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(c(this.x)));
                intent.putExtra("token_ubah_tunda", this.X);
                intent.putExtra("isAutoFill", true);
                ak = (ah + 1) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } else {
            intent.putExtra("is_draft", false);
            intent.putExtra("isUbahForm", true);
            intent.putExtra("isUbahFormEnabled", true);
            intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.Y));
            intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.aa));
            intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.z));
            intent.putExtra("BANK_LOCAL_LIST", ListUtil.OneItemImmutableList.e(onclickmenu));
            intent.putExtra("token_ubah_tunda", this.X);
            intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(c(this.x)));
            intent.putExtra("isAutoFill", true);
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        int i = ak + 93;
        ah = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
        }
        this.tvErrorMessage.setText(str);
        this.Z.setDisplayedChild(1);
        ah = (ak + 83) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void d(List<clikedKeyHilang> list) {
        this.z.clear();
        Iterator<clikedKeyHilang> it = list.iterator();
        while (true) {
            if ((it.hasNext() ? (char) 29 : '\b') != '\b') {
                try {
                    int i = ah + 67;
                    ak = i % Property.TYPE_ARRAY;
                    boolean z = true;
                    if (i % 2 == 0) {
                        it.next().d.equals("Y");
                        throw new ArithmeticException("divide by zero");
                    }
                    clikedKeyHilang next = it.next();
                    if (!next.d.equals("Y")) {
                        z = false;
                    }
                    if (z) {
                        this.z.add(Long.valueOf(next.e));
                        ah = (ak + 15) % Property.TYPE_ARRAY;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                this.H.e(this.m);
                return;
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer
    public final void e(GetTxnTellerDetailResponse getTxnTellerDetailResponse) {
        this.x = getTxnTellerDetailResponse;
        boolean z = true;
        try {
            if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Tarikan Tunai")) {
                int i = ah + 61;
                ak = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    User user = this.m;
                    throw new NullPointerException();
                }
                if (this.m == null) {
                    z = false;
                }
                if (!z || !this.m.getVerified().equals("Y")) {
                    x();
                    Intent intent = new Intent(B(), TarikanUbahTransaksiActivity.class);
                    intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(getTxnTellerDetailResponse));
                    intent.putExtra("token", this.X);
                    startActivity(intent);
                    return;
                }
                ak = (ah + 75) % Property.TYPE_ARRAY;
                z("Tarikan Tunai");
                ak = (ah + 39) % Property.TYPE_ARRAY;
                return;
            }
            try {
                if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Setoran Tunai")) {
                    if (new BigInteger(getTxnTellerDetailResponse.getTxnDetail().getTxnAmount()).compareTo(BigInteger.valueOf(100000000)) >= 0) {
                        boolean equalsIgnoreCase = getTxnTellerDetailResponse.getTxnDetail().getSourceAccountOwnerType().equalsIgnoreCase("ORG");
                        GetFundPurposePresenter getFundPurposePresenter = this.S;
                        String e = getPromotion.e(this.m);
                        getFundPurposePresenter.e.g_();
                        getFundPurposePresenter.b(e, "Y", equalsIgnoreCase);
                        return;
                    }
                    this.J.d(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), false);
                } else if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Transfer Valuta Asing")) {
                    this.P.a(this.m, this.x);
                } else if (!getTxnTellerDetailResponse.getTxnDetail().getType().equals("Kliring")) {
                } else {
                    if (SystemClock.elapsedRealtime() - this.C < 3000) {
                        int i2 = ah + 33;
                        ak = i2 % Property.TYPE_ARRAY;
                        if (!(i2 % 2 != 0)) {
                            throw new ArithmeticException("divide by zero");
                        }
                        return;
                    }
                    this.C = SystemClock.elapsedRealtime();
                    if (this.m == null || !this.m.getVerified().equals("Y")) {
                        y();
                        D("Individu");
                        return;
                    }
                    ak = (ah + 99) % Property.TYPE_ARRAY;
                    z("Kliring");
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void e(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse) {
        try {
            this.T = masterFundSourcePurposeResponse;
            this.J.d(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), false);
            int i = ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'J' : 'H') == 'J') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(B(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        intent.putExtra("token", this.X);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.T;
        if ((masterFundSourcePurposeResponse != null ? 'c' : '<') != '<') {
            int i = ah + 113;
            ak = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                try {
                    intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
                } catch (Exception e) {
                    throw e;
                }
            } else {
                intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
                Object[] objArr = null;
                int length = objArr.length;
            }
            ak = (ah + 81) % Property.TYPE_ARRAY;
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        x();
        ArrayList arrayList = new ArrayList();
        ak = (ah + 81) % Property.TYPE_ARRAY;
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
            DaftarTransfer daftarTransfer = new DaftarTransfer();
            daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
            daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
            daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
            arrayList.add(daftarTransfer);
        }
        Intent intent = new Intent(B(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        intent.putExtra("token", this.X);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.T;
        if (!(masterFundSourcePurposeResponse == null)) {
            int i = ak + 27;
            ah = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                try {
                    intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
                    throw new ArithmeticException("divide by zero");
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
                    ah = (ak + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void e(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2) {
        try {
            ak = (ah + 73) % Property.TYPE_ARRAY;
            this.Y.add(list);
            this.aa.add(list2);
            boolean z = false;
            if (this.Y.size() < 2) {
                try {
                    if (this.aa.size() < 2) {
                        int i = ah + 15;
                        ak = i % Property.TYPE_ARRAY;
                        if (!(i % 2 != 0)) {
                            this.m.getVerified().equals("Y");
                            throw new ArithmeticException("divide by zero");
                        } else if (!this.m.getVerified().equals("Y")) {
                            D("Perusahaan");
                            int i2 = ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
                            ah = i2 % Property.TYPE_ARRAY;
                            if (i2 % 2 == 0) {
                                z = true;
                            }
                            if (!z) {
                                Object[] objArr = null;
                                int length = objArr.length;
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            this.U.a(this.m, DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(0).getTimeInMillis()), DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(14).getTimeInMillis()));
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(B(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
        intent.putExtra("token", this.X);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.T;
        boolean z = true;
        if (masterFundSourcePurposeResponse != null) {
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
            try {
                ak = (ah + 65) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            startActivity(intent);
            int i = ah + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
            ak = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z = false;
            }
            if (z) {
                throw new NullPointerException();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        int i = ah + 23;
        ak = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
        }
        this.tvErrorMessage.setText(str);
        this.Z.setDisplayedChild(1);
        try {
            int i2 = ak + 115;
            ah = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 != 0 ? 'Q' : 'L') != 'L') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        try {
            int i = ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'W' : '\b') != 'W') {
                z();
                return;
            }
            z();
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Intent intent = new Intent(B(), FormUbahTellerActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.x));
            intent.putExtra("token", this.X);
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.T;
            if (!(masterFundSourcePurposeResponse == null)) {
                ak = (ah + 59) % Property.TYPE_ARRAY;
                intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
                ak = (ah + 51) % Property.TYPE_ARRAY;
            }
            x();
            startActivity(intent);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        ak = (ah + 39) % Property.TYPE_ARRAY;
        try {
            this.Z.setDisplayedChild(0);
            ak = (ah + 5) % Property.TYPE_ARRAY;
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
        ah = (ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            ak = (ah + 57) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void k(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        ak = (ah + 101) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    public final void l(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        ah = (ak + 97) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void m(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            int i = ak + 41;
            ah = i % Property.TYPE_ARRAY;
            if (!(i % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void n(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        ah = (ak + 91) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void o(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        ah = (ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        ah = (ak + 55) % Property.TYPE_ARRAY;
        finish();
        ah = (ak + 113) % Property.TYPE_ARRAY;
    }

    @OnClick({2131299502})
    public void onClickNote(View view) {
        ak = (ah + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
        if (this.v) {
            startActivity(new Intent(this, InfoDocumentUnderlyingActivity.class));
            ak = (ah + 93) % Property.TYPE_ARRAY;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ah = (ak + 11) % Property.TYPE_ARRAY;
        getMenuInflater().inflate(2131558409, menu);
        int i = ah + 95;
        ak = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            return true;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = ah + 63;
        ak = i % Property.TYPE_ARRAY;
        boolean z = false;
        if (i % 2 == 0) {
            onDestroy();
            Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = this.L.c;
            throw new ArithmeticException("divide by zero");
        }
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.L;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call2 = detailTransactionPresenter.c;
        DetailTransactionPresenter detailTransactionPresenter2 = detailTransactionPresenter;
        if (call2 != null) {
            call2.cancel();
            detailTransactionPresenter2 = detailTransactionPresenter;
        }
        try {
            detailTransactionPresenter2.e = null;
            try {
                this.R.e();
                DaftarTransferPresenter daftarTransferPresenter = this.J;
                Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call3 = daftarTransferPresenter.a;
                if (call3 != null) {
                    call3.cancel();
                }
                daftarTransferPresenter.c = null;
                GetCustAcctListPresenter getCustAcctListPresenter = this.N;
                Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call4 = getCustAcctListPresenter.b;
                if (call4 != null) {
                    ak = (ah + 75) % Property.TYPE_ARRAY;
                    call4.cancel();
                }
                getCustAcctListPresenter.e = null;
                CancelTundaPresenter cancelTundaPresenter = this.G;
                Call<OpenAccountSuccessActivity<Object>> call5 = cancelTundaPresenter.d;
                if (call5 != null) {
                    call5.cancel();
                }
                cancelTundaPresenter.a = null;
                GetFundPurposePresenter getFundPurposePresenter = this.S;
                Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call6 = getFundPurposePresenter.c;
                if (call6 == null) {
                    z = true;
                }
                if (!z) {
                    call6.cancel();
                }
                getFundPurposePresenter.e = null;
                CancelReservationPresenter cancelReservationPresenter = this.I;
                Call<OpenAccountSuccessActivity<Object>> call7 = cancelReservationPresenter.c;
                if (call7 != null) {
                    call7.cancel();
                }
                cancelReservationPresenter.a = null;
                this.P.d();
                this.Q.e();
                GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = this.O;
                Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> call8 = getTxnTellerDetailKUPresenter.c;
                if (call8 != null) {
                    ah = (ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
                    call8.cancel();
                }
                getTxnTellerDetailKUPresenter.a = null;
                this.U.b();
                this.H.b();
                documentProvider.b().e(this);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ah = (ak + 11) % Property.TYPE_ARRAY;
        int itemId = menuItem.getItemId();
        boolean z = false;
        if (!(itemId == 16908332)) {
            if (itemId != 2131298038) {
                z = true;
            }
            if (z) {
                return onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            ak = (ah + 27) % Property.TYPE_ARRAY;
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        int i = ak + 13;
        ah = i % Property.TYPE_ARRAY;
        boolean z2 = i % 2 == 0;
        onPointerCaptureChanged(z);
        if (!z2) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            ak = (ah + 17) % Property.TYPE_ARRAY;
            onRequestPermissionsResult(i, strArr, iArr);
            subscribeRemoveMasterCardEvent.d(this, i, iArr);
            ak = (ah + 97) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onStart() {
        try {
            int i = ak + 83;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? (char) '\b' : 11) != 11) {
                onStart();
                ListDetailTransaksiAdapter listDetailTransaksiAdapter = this.E;
                throw new NullPointerException();
            }
            onStart();
            try {
                ListDetailTransaksiAdapter listDetailTransaksiAdapter2 = this.E;
                if (listDetailTransaksiAdapter2 == null) {
                    ak = (ah + 65) % Property.TYPE_ARRAY;
                } else {
                    listDetailTransaksiAdapter2.a.b();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onStop() {
        try {
            int i = ak + 93;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'H' : 'Y') != 'H') {
                onStop();
                documentProvider.b().e(this);
                return;
            }
            onStop();
            documentProvider.b().e(this);
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        ah = (ak + 45) % Property.TYPE_ARRAY;
        try {
            setCardSlogan.e().b = "DetailTundaTellerActivity";
            this.j = "DetailTundaTellerActivity";
            ah = (ak + 99) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void p(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            int i = ah + 5;
            ak = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = ak + 29;
        ah = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return 2131492943;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void q(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            ah = (ak + 81) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = ak + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        ah = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
        int i2 = ah + 71;
        ak = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? '4' : 4) == 4) {
            return this;
        }
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void r(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            try {
                ah = (ak + 31) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296446})
    public void retry(View view) {
        ah = (ak + 13) % Property.TYPE_ARRAY;
        A();
        ak = (ah + 5) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
        ak = (ah + 23) % Property.TYPE_ARRAY;
        this.Z.setDisplayedChild(0);
        ah = (ak + 15) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void s(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        ak = (ah + 115) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if ((android.os.Build.VERSION.SDK_INT < 93) != false) goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0050;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        com.bca.smartbranch.activity.DetailTundaTellerActivity.ak = (com.bca.smartbranch.activity.DetailTundaTellerActivity.ah + 19) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        o.subscribeRemoveMasterCardEvent.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        return;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaTellerActivity.ak     // Catch: Exception -> 0x006c
            r1 = 33
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaTellerActivity.ah = r0     // Catch: Exception -> 0x006c
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 33
            r5 = r0
            goto L_0x001d
        L_0x001b:
            r0 = 3
            r5 = r0
        L_0x001d:
            r0 = r5
            r1 = 3
            if (r0 == r1) goto L_0x0040
            r0 = r3
            r1 = r4
            boolean r1 = r1.c
            r0.af = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 93
            if (r0 < r1) goto L_0x0037
            r0 = 0
            r5 = r0
            goto L_0x0039
        L_0x0037:
            r0 = 1
            r5 = r0
        L_0x0039:
            r0 = r5
            if (r0 == 0) goto L_0x0050
            goto L_0x0067
        L_0x0040:
            r0 = r3
            r1 = r4
            boolean r1 = r1.c
            r0.af = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0067
        L_0x0050:
            r0 = r3
            r0.v()     // Catch: Exception -> 0x0064
            int r0 = com.bca.smartbranch.activity.DetailTundaTellerActivity.ah     // Catch: Exception -> 0x0064
            r1 = 19
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaTellerActivity.ak = r0
            return
        L_0x0064:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x0067:
            r0 = r3
            o.subscribeRemoveMasterCardEvent.e(r0)
            return
        L_0x006c:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaTellerActivity.saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH):void");
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            int i = ak + 41;
            ah = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'T' : 'L') != 'L') {
                this.f.b(this.llDetail, this.ivDetail);
                throw new NullPointerException();
            }
            this.f.b(this.llDetail, this.ivDetail);
            ak = (ah + 41) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
        if (chooseBCACardAdapter$ViewHolder.e) {
            this.I.e(new FormUbahTellerActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.m.getImei()));
            ah = (ak + 65) % Property.TYPE_ARRAY;
            return;
        }
        try {
            try {
                this.G.a(new choosePic(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
                ah = (ak + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
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
        ak = (ah + 93) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void t(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            ah = (ak + 65) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
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
        ak = (ah + 33) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void u(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
                int i = ah + 19;
                ak = i % Property.TYPE_ARRAY;
                if (!(i % 2 != 0)) {
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public void ubah(ChooseSubMastercardAdapter$ViewHolder_ViewBinding chooseSubMastercardAdapter$ViewHolder_ViewBinding) {
        ah = (ak + 87) % Property.TYPE_ARRAY;
        try {
            this.w = null;
            try {
                this.x = null;
                this.q = Integer.valueOf(chooseSubMastercardAdapter$ViewHolder_ViewBinding.b);
                if ((this.A ? 'F' : 7) != 7) {
                    this.X = chooseSubMastercardAdapter$ViewHolder_ViewBinding.a;
                }
                this.F = chooseSubMastercardAdapter$ViewHolder_ViewBinding.d;
                if (chooseSubMastercardAdapter$ViewHolder_ViewBinding.c.equals("Transfer ke Bank Lain")) {
                    GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = this.O;
                    String str = this.X;
                    String e = getPromotion.e(this.m);
                    getTxnTellerDetailKUPresenter.a.g_();
                    Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> l = getTxnTellerDetailKUPresenter.apiService.l(e, str);
                    getTxnTellerDetailKUPresenter.c = l;
                    l.enqueue(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0095: INVOKE  
                          (r0v46 'l' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse>>)
                          (wrap: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter$4 : 0x0092: CONSTRUCTOR  (r1v18 com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter$4 A[REMOVE]) = (r0v36 'getTxnTellerDetailKUPresenter' com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter) call: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.4.<init>(com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter):void type: CONSTRUCTOR)
                         type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.DetailTundaTellerActivity.ubah(o.ChooseSubMastercardAdapter$ViewHolder_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaTellerActivity.class
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:301)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter, state: GENERATED_AND_UNLOADED
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
                        	... 35 more
                        */
                    /*
                    // Method dump skipped, instructions count: 242
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaTellerActivity.ubah(o.ChooseSubMastercardAdapter$ViewHolder_ViewBinding):void");
                }

                public final void v() {
                    int i = ah + 59;
                    ak = i % Property.TYPE_ARRAY;
                    if (i % 2 != 0) {
                        d(this.n);
                    } else {
                        d(this.n);
                        throw new ArithmeticException("divide by zero");
                    }
                }

                @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
                public final void v(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    ah = (ak + 5) % Property.TYPE_ARRAY;
                }

                @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void w(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    ak = (ah + 55) % Property.TYPE_ARRAY;
                }

                @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
                public final void w_(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    int i = ah + 37;
                    ak = i % Property.TYPE_ARRAY;
                    if (i % 2 == 0) {
                        Object[] objArr = null;
                        int length = objArr.length;
                    }
                }

                @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
                public final void x(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    int i = ak + 53;
                    ah = i % Property.TYPE_ARRAY;
                    if ((i % 2 != 0 ? '+' : 'T') == '+') {
                        throw new NullPointerException();
                    }
                }

                @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
                public final void x_(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    ah = (ak + 101) % Property.TYPE_ARRAY;
                }

                @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
                public final void y(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    try {
                        int i = ah + 61;
                        try {
                            ak = i % Property.TYPE_ARRAY;
                            if ((i % 2 == 0 ? '1' : 14) != 14) {
                                throw new ArithmeticException("divide by zero");
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
                    if (r0 == null) goto L_0x003a;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
                    r4.r = new com.bca.smartbranch.dialog.QRCodeDialog();
                    com.bca.smartbranch.activity.DetailTundaTellerActivity.ah = (com.bca.smartbranch.activity.DetailTundaTellerActivity.ak + 17) % io.realm.internal.Property.TYPE_ARRAY;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
                    r0 = r4.r;
                    r0 = r4.n;
                    r0 = r4.V;
                    r0.b = r0;
                    r0.d = r0;
                    r4.r.show(l(), "QRCodeDialog");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
                    if (r4.r == null) goto L_0x003a;
                 */
                @butterknife.OnClick({2131297408})
                /* Code decompiled incorrectly, please refer to instructions dump */
                public void zoomQRCode() {
                    /*
                        r4 = this;
                        int r0 = com.bca.smartbranch.activity.DetailTundaTellerActivity.ah
                        r1 = 83
                        int r0 = r0 + r1
                        r5 = r0
                        r0 = r5
                        r1 = 128(0x80, float:1.8E-43)
                        int r0 = r0 % r1
                        com.bca.smartbranch.activity.DetailTundaTellerActivity.ak = r0
                        r0 = r5
                        r1 = 2
                        int r0 = r0 % r1
                        if (r0 != 0) goto L_0x001b
                        r0 = 64
                        r5 = r0
                        goto L_0x001e
                    L_0x001b:
                        r0 = 33
                        r5 = r0
                    L_0x001e:
                        r0 = r5
                        r1 = 64
                        if (r0 == r1) goto L_0x002e
                        r0 = r4
                        com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r
                        if (r0 != 0) goto L_0x0054
                        goto L_0x003a
                    L_0x002e:
                        r0 = r4
                        com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r     // Catch: Exception -> 0x0081
                        r6 = r0
                        r0 = 0
                        int r0 = r0.length     // Catch: all -> 0x007e
                        r5 = r0
                        r0 = r6
                        if (r0 != 0) goto L_0x0054
                    L_0x003a:
                        r0 = r4
                        com.bca.smartbranch.dialog.QRCodeDialog r1 = new com.bca.smartbranch.dialog.QRCodeDialog
                        r2 = r1
                        r2.<init>()
                        r0.r = r1
                        int r0 = com.bca.smartbranch.activity.DetailTundaTellerActivity.ak
                        r1 = 17
                        int r0 = r0 + r1
                        r5 = r0
                        r0 = r5
                        r1 = 128(0x80, float:1.8E-43)
                        int r0 = r0 % r1
                        com.bca.smartbranch.activity.DetailTundaTellerActivity.ah = r0
                    L_0x0054:
                        r0 = r4
                        com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r
                        r7 = r0
                        r0 = r4
                        android.graphics.Bitmap r0 = r0.n
                        r8 = r0
                        r0 = r4
                        java.lang.String r0 = r0.V
                        r6 = r0
                        r0 = r7
                        r1 = r8
                        r0.b = r1
                        r0 = r7
                        r1 = r6
                        r0.d = r1
                        r0 = r4
                        com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.r
                        r1 = r4
                        o.isDetached r1 = r1.l()
                        java.lang.String r2 = "QRCodeDialog"
                        r0.show(r1, r2)
                        return
                    L_0x007e:
                        r6 = move-exception
                        r0 = r6
                        throw r0
                    L_0x0081:
                        r6 = move-exception
                        r0 = r6
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaTellerActivity.zoomQRCode():void");
                }
            }
