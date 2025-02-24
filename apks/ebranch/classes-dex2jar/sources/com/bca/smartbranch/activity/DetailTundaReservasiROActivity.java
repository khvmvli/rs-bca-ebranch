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
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ListDetailOpenTransaksiAdapter;
import com.bca.smartbranch.adapter.ListDetailTransaksiROAdapter;
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
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Warkat;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CancelAskTransaksiDialog;
import com.bca.smartbranch.dialog.CancelReservasiDialog;
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
import io.realm.RealmList;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.BN7PengambilanUpdateReceiverActivity;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC23CFormKartuKreditFragment;
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
import o.getCardDescription;
import o.getPromotion;
import o.onChooseBidangUsaha;
import o.onClickDetail;
import o.onClickMenu;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener;
import o.subscribeRemoveVisaCardEvent;
import o.subscribeUbahVisaCardEvent;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaReservasiROActivity.class */
public class DetailTundaReservasiROActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, DaftarTransferPresenter.RemoteActionCompatParcelizer, GetCustAcctListPresenter.read, CancelTundaPresenter.IconCompatParcelizer, GetFundPurposePresenter.IconCompatParcelizer, CancelReservationPresenter.write, InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver, GetTxnTellerDetailKUPresenter.write, InquiryLoadDataBTPresenter.IconCompatParcelizer, KliringPresenter.RemoteActionCompatParcelizer, BankListPresenter.IconCompatParcelizer {
    private static long Z;
    private static int aa;
    private static int ag;
    private BankListPresenter B;
    private CancelReservationPresenter C;
    private CancelTundaPresenter D;
    private DetailTransactionPresenter E;
    private DaftarTransferPresenter F;
    private GetCustAcctListPresenter G;
    private String H;
    private GetCustAcctListResponse J;
    private GetTxnTellerDetailKUPresenter K;
    private GetTxnTellerDetailPresenter L;
    private InquiryEditDataORPresenter M;
    private GetFundPurposePresenter N;
    private String O;
    private KliringPresenter P;
    private String Q;
    private InquiryLoadDataBTPresenter R;
    private TransaksiTunda S;
    private String T;
    private MasterFundSourcePurposeResponse U;
    private String X;
    private ViewAnimator Y;
    private boolean ac;
    @BindView(2131296443)
    Button btnReschedule;
    @BindString(2131820609)
    String buktiPengisianForm;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297408)
    ImageView ivQRCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297875)
    LinearLayout llRuangan;
    private Bitmap n;
    @BindString(2131821357)
    String note;
    private GetTxnTellerDetailKUResponse p;
    private List<DetailTransactionResponse.TxnDataDetail> q;
    private int r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298329)
    setOnStartEnterTransitionListener rvListTransaksi;
    private QRCodeDialog s;
    @BindString(2131822498)
    String tarikanCek;
    @BindString(2131822499)
    String tarikanTunai;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298914)
    TextView tvDate;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299268)
    TextView tvHeader;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299467)
    TextView tvNoReff;
    @BindView(2131299502)
    TextView tvNote;
    private GetTxnTellerDetailResponse w;
    private boolean x;
    private ListDetailTransaksiROAdapter z;
    private long v = 0;
    setMessage f = new setMessage();
    private List<DetailTransactionResponse.ValueTxnDataDetail> ab = new ArrayList();
    private Integer t = -1;
    private ArrayList<Long> A = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> V = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> W = new ArrayList<>();
    private boolean y = false;
    private boolean u = false;
    private String I = "";

    private void C() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.Q;
        infoDocumentUnderlyingActivity.d = "TUNDA";
        infoDocumentUnderlyingActivity.b = this.O;
        infoDocumentUnderlyingActivity.a = this.S.getType();
        this.E.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
        try {
            try {
                aa = (ag + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private Context D() {
        int i = ag + 49;
        aa = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return this;
        }
        throw new ArithmeticException("divide by zero");
    }

    private void D(String str) {
        int i = ag + setHasDecor$MediaBrowserCompat$MediaItem.aI;
        aa = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            str.isEmpty();
            throw new NullPointerException();
        }
        if ((str.isEmpty() ? 'E' : ' ') != ' ') {
            aa = (ag + 35) % Property.TYPE_ARRAY;
            str = "Individu";
        }
        this.P.d(this.m, str);
    }

    private void a(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.Q);
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
                int i = aa + 7;
                ag = i % Property.TYPE_ARRAY;
                file2.delete();
                if (i % 2 == 0) {
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
            c(new char[]{56525, 56494, 18385, 12762, 39111, 38752, 40919, 33621, 36875, 60019, 30046, 23631, 23118, 49347, 47302, 5003, 5841, 3140, 64605, 55056, 53571, 18877, 16383, 27175, 36325, 46372, 25456, 10743, 18548, 62122, 42722, 60779}, getResources().getString(2131821267).substring(2, 4).length() - 2, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (!(this.ac)) {
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            QRCodeDialog qRCodeDialog = this.s;
            if ((qRCodeDialog != null ? '*' : ':') != ':') {
                int i2 = ag + 65;
                aa = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    qRCodeDialog.dismiss();
                    throw new ArithmeticException("divide by zero");
                } else {
                    qRCodeDialog.dismiss();
                }
            }
        } else {
            int i3 = ag + 1;
            aa = i3 % Property.TYPE_ARRAY;
            if ((i3 % 2 != 0 ? 16 : 'U') != 'U') {
                consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
                Object[] objArr2 = null;
                int length = objArr2.length;
                return;
            }
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment.b) {
            char[] b = CC23CFormKartuKreditFragment.b(Z, cArr, i);
            CC23CFormKartuKreditFragment.a = 4;
            while (CC23CFormKartuKreditFragment.a < b.length) {
                CC23CFormKartuKreditFragment.d = CC23CFormKartuKreditFragment.a - 4;
                b[CC23CFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (b[CC23CFormKartuKreditFragment.a] ^ b[CC23CFormKartuKreditFragment.a % 4])) ^ (((long) CC23CFormKartuKreditFragment.d) * Z))));
                CC23CFormKartuKreditFragment.a++;
            }
            str = new String(b, 4, b.length - 4);
        }
        objArr[0] = str;
    }

    private static Kliring d(GetTxnTellerDetailResponse getTxnTellerDetailResponse) {
        Kliring kliring = new Kliring();
        kliring.setId(System.currentTimeMillis());
        kliring.setNamaPenerima(getTxnTellerDetailResponse.getTxnDetail().getReceiverName());
        kliring.setNomorRekening(getTxnTellerDetailResponse.getTxnDetail().getReceiverAccount());
        kliring.setKodeNegara(getTxnTellerDetailResponse.getTxnDetail().getHandphoneNumberCountryCd());
        kliring.setNomorHp(getTxnTellerDetailResponse.getTxnDetail().getHandphoneNumber());
        StringBuilder sb = new StringBuilder();
        if (getTxnTellerDetailResponse.getTxnDetail().getTxnNotes() == null || getTxnTellerDetailResponse.getTxnDetail().getTxnNotes().isEmpty()) {
            try {
                try {
                    if (getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2() != null) {
                        if (!getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2().isEmpty()) {
                            sb.append(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2());
                        }
                    }
                    aa = (ag + 79) % Property.TYPE_ARRAY;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i = ag + setHasDecor$MediaBrowserCompat$MediaItem.aN;
            aa = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                sb.append(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes());
                getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2();
                throw new NullPointerException();
            }
            sb.append(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes());
            if (getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2() != null) {
                if (!getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2().isEmpty()) {
                    sb.append(" ");
                    sb.append(getTxnTellerDetailResponse.getTxnDetail().getTxnNotes2());
                }
            }
        }
        kliring.setBeritaAcara(sb.toString());
        kliring.setTanggalJatuhTempo(getTxnTellerDetailResponse.getTxnDetail().getWarkatDueDate());
        kliring.setTipeNasabahId(getTxnTellerDetailResponse.getTxnDetail().getCustomerType());
        kliring.setTipeNasabah(getTxnTellerDetailResponse.getTxnDetail().getCustomerType());
        kliring.setSumberDana(getTxnTellerDetailResponse.getTxnDetail().getTxnSource());
        kliring.setSumberDanaCode(getTxnTellerDetailResponse.getTxnDetail().getTxnSource());
        kliring.setTujuanTransaksi(getTxnTellerDetailResponse.getTxnDetail().getTxnPurpose());
        kliring.setTujuanTransaksiCode(getTxnTellerDetailResponse.getTxnDetail().getTxnPurpose());
        kliring.setTotalWarkat(Double.parseDouble(getTxnTellerDetailResponse.getTxnDetail().getTotalAmountWarkat()));
        kliring.setCurrentPage("K3KonfirmasiWarkatFragment");
        kliring.setCreatedAt(System.currentTimeMillis());
        kliring.setSequenceId(0);
        RealmList<Warkat> realmList = new RealmList<>();
        for (int i2 = 0; i2 < getTxnTellerDetailResponse.getTxnDetail().getWarkat().size(); i2++) {
            Warkat warkat = new Warkat();
            warkat.setId(System.currentTimeMillis());
            warkat.setNomorWarkat(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i2).getWarkatNumber());
            warkat.setNamaBank(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i2).getBankName());
            warkat.setKodeBank(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i2).getBankName());
            warkat.setLocalClearingCodeBank(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i2).getClearingCode());
            warkat.setJenisWarkat(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i2).getWarkatType());
            warkat.setKodeJenisWarkat(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i2).getWarkatType());
            warkat.setNominal(Double.valueOf(Double.parseDouble(getTxnTellerDetailResponse.getTxnDetail().getWarkat().get(i2).getAmount())));
            warkat.setJatuhTempo(getTxnTellerDetailResponse.getTxnDetail().getWarkatDueDate());
            realmList.add(warkat);
        }
        kliring.setListWarkat(realmList);
        return kliring;
    }

    public static void e(LogRedirector.Logger logger) {
        try {
            try {
                ag = (aa + 87) % Property.TYPE_ARRAY;
                logger.a();
                int i = ag + 87;
                aa = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? '!' : '[') != '[') {
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

    private void v() {
        int i = aa + 19;
        ag = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'T' : 'S') != 'S') {
            this.V.clear();
            this.W.clear();
            throw new NullPointerException();
        }
        this.V.clear();
        this.W.clear();
    }

    private void z(String str) {
        int i = ag + 57;
        aa = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            this.G.b(this.m, str);
            throw new ArithmeticException("divide by zero");
        } else {
            this.G.b(this.m, str);
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
        ag = (aa + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = aa + 31;
        ag = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 18 : 4) != 4) {
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
        ag = (aa + 13) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    public final void C(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = aa + 111;
        ag = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void a(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse, GetCustAcctListResponse getCustAcctListResponse, List<onClickDetail.RemoteActionCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list3, List<? extends DaftarTransferResponse.DaftarTransferOutput> list4, String str) {
        try {
            try {
                aa = (ag + 67) % Property.TYPE_ARRAY;
                x();
                if ((str != null ? 'B' : 4) == 'B') {
                    ag = (aa + 23) % Property.TYPE_ARRAY;
                    if (str.equals("EDIT_DATA")) {
                        Intent intent = new Intent(this, BN7PengambilanUpdateReceiverActivity.class);
                        BN7PengambilanUpdateReceiverActivity.write write = BN7PengambilanUpdateReceiverActivity.j;
                        intent.putExtra(BN7PengambilanUpdateReceiverActivity.v, ListUtil.OneItemImmutableList.e(getTxnTellerDetailKUResponse));
                        if (!(getCustAcctListResponse == null)) {
                            ag = (aa + 63) % Property.TYPE_ARRAY;
                            BN7PengambilanUpdateReceiverActivity.write write2 = BN7PengambilanUpdateReceiverActivity.j;
                            intent.putExtra(BN7PengambilanUpdateReceiverActivity.w, ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
                        }
                        BN7PengambilanUpdateReceiverActivity.write write3 = BN7PengambilanUpdateReceiverActivity.j;
                        intent.putExtra(BN7PengambilanUpdateReceiverActivity.y, ListUtil.OneItemImmutableList.e(list));
                        BN7PengambilanUpdateReceiverActivity.write write4 = BN7PengambilanUpdateReceiverActivity.j;
                        intent.putExtra(BN7PengambilanUpdateReceiverActivity.z, ListUtil.OneItemImmutableList.e(list2));
                        BN7PengambilanUpdateReceiverActivity.write write5 = BN7PengambilanUpdateReceiverActivity.j;
                        intent.putExtra(BN7PengambilanUpdateReceiverActivity.I, ListUtil.OneItemImmutableList.e(list3));
                        BN7PengambilanUpdateReceiverActivity.write write6 = BN7PengambilanUpdateReceiverActivity.j;
                        intent.putExtra(BN7PengambilanUpdateReceiverActivity.u, ListUtil.OneItemImmutableList.e(list4));
                        BN7PengambilanUpdateReceiverActivity.write write7 = BN7PengambilanUpdateReceiverActivity.j;
                        intent.putExtra(BN7PengambilanUpdateReceiverActivity.A, this.I);
                        startActivity(intent);
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        int i = aa + 43;
        ag = i % Property.TYPE_ARRAY;
        boolean z = false;
        if (i % 2 == 0) {
        }
        this.tvErrorMessage.setText(str);
        this.Y.setDisplayedChild(1);
        int i2 = ag + 9;
        aa = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            z = true;
        }
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        char c;
        this.q = list;
        for (DetailTransactionResponse.TxnDataDetail txnDataDetail : list) {
            String key = txnDataDetail.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1933709509:
                    if (!(!key.equals("TxnDetail"))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1238485368:
                    if (key.equals("Transaksi")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1091538172:
                    if (key.equals("Ruangan")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -778638512:
                    if ((key.equals("Waktu Reservasi") ? 'V' : 18) != 18) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1260938190:
                    if (key.equals("Nomor Referensi")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1963632682:
                    if (key.equals("Alamat")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2010750902:
                    if (key.equals("Cabang")) {
                        c = 6;
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
                    this.ab.addAll(txnDataDetail.getValueArray());
                    for (DetailTransactionResponse.ValueTxnDataDetail valueTxnDataDetail : this.ab) {
                        if (valueTxnDataDetail.getTxnType().equals("Transfer Valuta Asing")) {
                            this.y = true;
                            if ((valueTxnDataDetail.getProductType() != null ? '1' : '<') != '<') {
                                int i = ag + 73;
                                aa = i % Property.TYPE_ARRAY;
                                if (!(i % 2 == 0)) {
                                    valueTxnDataDetail.getProductType().equals("L");
                                    throw new NullPointerException();
                                } else if (valueTxnDataDetail.getProductType().equals("L")) {
                                    this.u = true;
                                }
                            }
                        }
                        if (valueTxnDataDetail.getTxnSubDataDetails() != null) {
                            if ((valueTxnDataDetail.getTxnSubDataDetails().size() > 0 ? 'c' : 18) != 18) {
                                valueTxnDataDetail.setViewType(ListDetailOpenTransaksiAdapter.e);
                            }
                        }
                        valueTxnDataDetail.setViewType(ListDetailOpenTransaksiAdapter.b);
                    }
                    if (this.ab.size() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String str = "Penerima";
                        for (int i2 = 0; i2 < this.ab.size(); i2++) {
                            int i3 = ag + 63;
                            aa = i3 % Property.TYPE_ARRAY;
                            if (i3 % 2 != 0) {
                                this.ab.get(i2).getTxnType().equalsIgnoreCase("Setoran Tunai");
                                throw new NullPointerException();
                            }
                            if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Setoran Tunai")) {
                                sb.append(ReservasiOnline.SETORAN_TUNAI);
                                str = str;
                            } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Tarikan Tunai")) {
                                sb.append(ReservasiOnline.TARIKAN_TUNAI);
                                str = str;
                            } else if ((this.ab.get(i2).getTxnType().equalsIgnoreCase("Pemesanan Mata Uang Asing") ? 23 : ',') == 23) {
                                aa = (ag + 3) % Property.TYPE_ARRAY;
                                sb.append(ReservasiOnline.PEMESANAN_MATA_UANG_ASING);
                                str = str;
                            } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Kiriman Uang") || this.ab.get(i2).getTxnType().equals("Transfer ke Bank Lain")) {
                                sb.append(ReservasiOnline.KIRIMAN_UANG);
                                str = str;
                            } else {
                                int i4 = aa + 61;
                                ag = i4 % Property.TYPE_ARRAY;
                                if (!(i4 % 2 != 0)) {
                                    this.ab.get(i2).getTxnType().equalsIgnoreCase("Kliring");
                                    throw new ArithmeticException("divide by zero");
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Kliring")) {
                                    sb.append(ReservasiOnline.KLIRING);
                                    str = "Warkat";
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Outward Remittance") || this.ab.get(i2).getTxnType().equalsIgnoreCase("Transfer Valuta Asing")) {
                                    sb.append(ReservasiOnline.OUTWARD_REMITTANCE);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Pemindahbukuan")) {
                                    sb.append(ReservasiOnline.PEMINDAHBUKUAN);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Setoran Pajak")) {
                                    sb.append(ReservasiOnline.SETORAN_PAJAK);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Pembukaan Rekening Individu")) {
                                    sb.append(ReservasiOnline.PEMBUKAAN_REKENING);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Pengajuan Kartu Kredit")) {
                                    aa = (ag + 85) % Property.TYPE_ARRAY;
                                    sb.append(ReservasiOnline.PENGAJUAN_KARTU_KREDIT);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Internet/Mobile Banking")) {
                                    ag = (aa + 9) % Property.TYPE_ARRAY;
                                    sb.append(ReservasiOnline.INTERNET_MOBILE_BANKING);
                                    ag = (aa + 13) % Property.TYPE_ARRAY;
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Penggantian Key BCA")) {
                                    sb.append(ReservasiOnline.PENGGANTIAN_KEY_BCA);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Deposito")) {
                                    sb.append(ReservasiOnline.DEPOSITO);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Layanan Giro")) {
                                    sb.append(ReservasiOnline.LAYANAN_GIRO);
                                    str = str;
                                } else if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Pembukaan Blokir")) {
                                    aa = (ag + 47) % Property.TYPE_ARRAY;
                                    sb.append(ReservasiOnline.PEMBUKAAN_BLOKIR);
                                    str = str;
                                } else {
                                    str = str;
                                    if (this.ab.get(i2).getTxnType().equalsIgnoreCase("Pengajuan Surat Referensi")) {
                                        int i5 = ag + 37;
                                        aa = i5 % Property.TYPE_ARRAY;
                                        if (i5 % 2 != 0) {
                                            sb.append(ReservasiOnline.PENGAJUAN_SURAT_REFERENSI);
                                            throw new NullPointerException();
                                        } else {
                                            sb.append(ReservasiOnline.PENGAJUAN_SURAT_REFERENSI);
                                            str = str;
                                        }
                                    }
                                }
                            }
                            if (i2 != this.ab.size() - 1) {
                                sb.append(",");
                            }
                        }
                        this.T = sb.toString();
                        this.z = new ListDetailTransaksiROAdapter(this, this.ab, false, str);
                        this.rvListTransaksi.setLayoutManager(new LinearLayoutManager(1, false));
                        this.rvListTransaksi.setHasFixedSize(true);
                        this.rvListTransaksi.setAdapter(this.z);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    this.X = txnDataDetail.getValue();
                    this.tvHeader.setText(txnDataDetail.getValue());
                    break;
                case 2:
                    if (!txnDataDetail.getValue().equals("Reguler")) {
                        aa = (ag + 55) % Property.TYPE_ARRAY;
                        this.llRuangan.setVisibility(0);
                        this.tvJenisRuangan.setText(txnDataDetail.getValue());
                        break;
                    } else {
                        break;
                    }
                case 3:
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm aa", new Locale("id", "ID"));
                        Date parse = simpleDateFormat.parse(txnDataDetail.getValue());
                        simpleDateFormat.applyPattern("HH.mm 'WIB' '-' EEEE, dd MMM yyyy");
                        this.tvDate.setText(simpleDateFormat.format(parse));
                        break;
                    } catch (ParseException e) {
                        this.tvDate.setText(txnDataDetail.getValue());
                        break;
                    }
                case 4:
                    this.tvNoReff.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case 5:
                    this.tvBranchAddress.setText(txnDataDetail.getValue());
                    break;
                case 6:
                    this.tvBranchName.setText(txnDataDetail.getValue());
                    break;
            }
        }
        this.tvNote.setText(Html.fromHtml(this.note));
        if (this.y) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "Jangan lupa untuk membawa kelengkapan berikut ke kantor cabang BCA terdekat:\n");
            int length = spannableStringBuilder.length();
            if (this.u) {
                spannableStringBuilder.append((CharSequence) "Membawa Dokumen Underlying\n");
                spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099731)), length + 7, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "Dokumen Underlying (untuk akumulasi transaksi minimal 100.000 USD per bulan)\n");
                spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099731)), length, length + 18, 33);
                spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length, spannableStringBuilder.length(), 33);
            }
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "Kartu ATM BCA\n");
            spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length2, spannableStringBuilder.length(), 33);
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "Bukti identitas (KTP/Paspor)\n");
            spannableStringBuilder.setSpan(new StyleSpan(1), length3, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length3, spannableStringBuilder.length(), 33);
            this.tvNote.setText(spannableStringBuilder);
        }
        this.Y.setDisplayedChild(2);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void b(GetCustAcctListResponse getCustAcctListResponse) {
        aa = (ag + 113) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [double] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [double] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Unknown variable types count: 3 */
    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse r8) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaReservasiROActivity.b(com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse):void");
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
        int i = ag + 79;
        aa = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '%' : 24) == '%') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b_(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("imei", this.m.getImei());
            bundle.putString("email", this.m.getEmail());
            bundle.putString("message", str);
            AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
            autoLogoutDialog.setArguments(bundle);
            autoLogoutDialog.show(l(), "AutoLogoutDialog");
            ag = (aa + 79) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296380})
    public void batal() {
        if (this.x) {
            CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", this.O);
            bundle.putString("noref", this.Q);
            cancelTransaksiDialog.setArguments(bundle);
            cancelTransaksiDialog.show(l(), "CancelTransaksiDialog");
            return;
        }
        if (!(this.Q.substring(0, 3).equalsIgnoreCase("E98"))) {
            int i = ag + 13;
            aa = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 24 : '[') == '[' ? !this.Q.substring(0, 3).equalsIgnoreCase("E99") : !this.Q.substring(1, 3).equalsIgnoreCase("E99")) {
                CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("token", this.O);
                    bundle2.putString("noref", this.Q);
                    cancelAskTransaksiDialog.setArguments(bundle2);
                    cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
                    ag = (aa + 111) % Property.TYPE_ARRAY;
                    return;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        CancelReservasiDialog cancelReservasiDialog = new CancelReservasiDialog();
        Bundle bundle3 = new Bundle();
        bundle3.putString("token", this.O);
        bundle3.putString("noref", this.Q);
        cancelReservasiDialog.setArguments(bundle3);
        cancelReservasiDialog.show(l(), "CancelReservasiDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void c(GetCustAcctListResponse getCustAcctListResponse) {
        this.J = getCustAcctListResponse;
        if (this.w.getTxnDetail().getType().equals("Tarikan Tunai")) {
            x();
            Intent intent = new Intent(D(), TarikanUbahTransaksiActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.w));
            intent.putExtra("token", this.O);
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent);
            ag = (aa + 23) % Property.TYPE_ARRAY;
            return;
        }
        try {
            try {
                if ((this.w.getTxnDetail().getType().equals("Kliring") ? 14 : '*') != '*') {
                    v();
                    D("Individu");
                    ag = (aa + 77) % Property.TYPE_ARRAY;
                }
                aa = (ag + 41) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
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
        int i = aa + 11;
        ag = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131296443})
    public void clickedReservation(View view) {
        Intent intent = new Intent(this, BranchMapROActivity.class);
        Reservation reservation = new Reservation();
        reservation.setTypeTransaction("RESERVASI ONLINE");
        reservation.setTypeReservation("RESCHEDULE_RESERVATION");
        reservation.setFromForm(true);
        reservation.setNoReff(this.Q);
        reservation.setTnxStatus("1");
        reservation.setTxnType(this.X);
        reservation.setTransactionCode(this.T);
        intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        intent.putExtra("txn_data_tunda", ListUtil.OneItemImmutableList.e(this.q));
        startActivity(intent);
        int i = aa + 83;
        ag = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? (char) 31 : 21) == 31) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        int i;
        Button button;
        d(bundle);
        this.Y = (ViewAnimator) findViewById(2131299752);
        DetailTransactionPresenter detailTransactionPresenter = new DetailTransactionPresenter();
        this.E = detailTransactionPresenter;
        detailTransactionPresenter.e = this;
        GetTxnTellerDetailPresenter getTxnTellerDetailPresenter = new GetTxnTellerDetailPresenter();
        this.L = getTxnTellerDetailPresenter;
        getTxnTellerDetailPresenter.c = this;
        DaftarTransferPresenter daftarTransferPresenter = new DaftarTransferPresenter();
        this.F = daftarTransferPresenter;
        daftarTransferPresenter.c = this;
        GetCustAcctListPresenter getCustAcctListPresenter = new GetCustAcctListPresenter();
        this.G = getCustAcctListPresenter;
        getCustAcctListPresenter.e = this;
        CancelTundaPresenter cancelTundaPresenter = new CancelTundaPresenter();
        this.D = cancelTundaPresenter;
        cancelTundaPresenter.a = this;
        GetFundPurposePresenter getFundPurposePresenter = new GetFundPurposePresenter();
        this.N = getFundPurposePresenter;
        getFundPurposePresenter.e = this;
        CancelReservationPresenter cancelReservationPresenter = new CancelReservationPresenter();
        this.C = cancelReservationPresenter;
        cancelReservationPresenter.a = this;
        InquiryEditDataORPresenter inquiryEditDataORPresenter = new InquiryEditDataORPresenter();
        this.M = inquiryEditDataORPresenter;
        inquiryEditDataORPresenter.b = this;
        GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = new GetTxnTellerDetailKUPresenter();
        this.K = getTxnTellerDetailKUPresenter;
        getTxnTellerDetailKUPresenter.a = this;
        InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = new InquiryLoadDataBTPresenter();
        this.R = inquiryLoadDataBTPresenter;
        inquiryLoadDataBTPresenter.e = this;
        KliringPresenter kliringPresenter = new KliringPresenter();
        this.P = kliringPresenter;
        kliringPresenter.d = this;
        BankListPresenter bankListPresenter = new BankListPresenter();
        this.B = bankListPresenter;
        bankListPresenter.d = this;
        Bundle extras = getIntent().getExtras();
        this.S = (TransaksiTunda) ListUtil.OneItemImmutableList.a(extras.getParcelable("transaksi_tunda"));
        this.r = extras.getInt("data_position");
        this.Q = this.S.getNoReff();
        this.O = this.S.getToken();
        this.H = this.S.getFlagBooking();
        boolean z = extras.getBoolean("is_from_multiple");
        this.x = z;
        if (z) {
            int i2 = aa + 47;
            ag = i2 % Property.TYPE_ARRAY;
            if ((i2 % 2 == 0 ? 'F' : '3') != '3') {
                button = this.btnReschedule;
                i = 5;
            } else {
                button = this.btnReschedule;
                i = 4;
            }
            button.setVisibility(i);
        } else {
            this.btnReschedule.setVisibility(0);
        }
        Bitmap a = getPromotion.a(this.Q, this);
        this.n = a;
        this.ivQRCode.setImageBitmap(a);
        C();
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(GetTxnTellerDetailResponse getTxnTellerDetailResponse, GetCustAcctListResponse getCustAcctListResponse, KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse, CategoriesORResponse categoriesORResponse, List<DaftarTransferResponse.DaftarTransferOutput> list) {
        x();
        Intent intent = new Intent(this, OutwardRemittanceFormUbahActivity.class);
        intent.putExtra("TellerType", "kirim_uang");
        intent.putExtra("data_kategori_tujuan", ListUtil.OneItemImmutableList.e(kategoriTujuanTransaksiORResponse));
        intent.putExtra("data_sumber_dana", ListUtil.OneItemImmutableList.e(categoriesORResponse));
        intent.putExtra("data_daftar_transfer", ListUtil.OneItemImmutableList.e(list));
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(getTxnTellerDetailResponse));
        intent.putExtra("token", this.O);
        if ((getCustAcctListResponse != null ? 'K' : 'L') == 'K') {
            aa = (ag + 81) % Property.TYPE_ARRAY;
            try {
                intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
                try {
                    ag = (aa + 35) % Property.TYPE_ARRAY;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final <T> void d(T t) {
        x();
        onClickMenu onclickmenu = (onClickMenu) t;
        Intent intent = new Intent(D(), subscribeUbahVisaCardEvent.class);
        if (!this.m.getVerified().equals("Y")) {
            intent.putExtra("is_draft", false);
            intent.putExtra("token_ubah_tunda", this.O);
            intent.putExtra("isUbahForm", true);
            intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.V));
            intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.W));
            intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.A));
            intent.putExtra("BANK_LOCAL_LIST", ListUtil.OneItemImmutableList.e(onclickmenu));
            intent.putExtra("isUbahFormEnabled", true);
            intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(d(this.w)));
            intent.putExtra("isAutoFill", true);
        } else {
            ag = (aa + 11) % Property.TYPE_ARRAY;
            try {
                intent.putExtra("is_draft", false);
                try {
                    intent.putExtra("isUbahForm", true);
                    intent.putExtra("isUbahFormEnabled", true);
                    intent.putExtra("list_acct", ListUtil.OneItemImmutableList.e(this.J));
                    intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.V));
                    intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.W));
                    intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.A));
                    intent.putExtra("BANK_LOCAL_LIST", ListUtil.OneItemImmutableList.e(onclickmenu));
                    intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(d(this.w)));
                    intent.putExtra("token_ubah_tunda", this.O);
                    intent.putExtra("isAutoFill", true);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        startActivity(intent);
        int i = ag + setHasDecor$MediaBrowserCompat$MediaItem.aI;
        aa = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '\"' : 28) == '\"') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        aa = (ag + 37) % Property.TYPE_ARRAY;
        this.tvErrorMessage.setText(str);
        boolean z = true;
        this.Y.setDisplayedChild(1);
        int i = ag + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
        aa = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            z = false;
        }
        if (z) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void d(List<clikedKeyHilang> list) {
        clikedKeyHilang next;
        aa = (ag + 87) % Property.TYPE_ARRAY;
        this.A.clear();
        Iterator<clikedKeyHilang> it = list.iterator();
        while (true) {
            if ((it.hasNext() ? '\"' : 'b') != '\"') {
                this.B.e(this.m);
                return;
            }
            int i = ag + 27;
            aa = i % Property.TYPE_ARRAY;
            boolean z = false;
            boolean z2 = false;
            if (i % 2 != 0) {
                try {
                    try {
                        next = it.next();
                        boolean equals = next.d.equals("Y");
                        Object[] objArr = null;
                        int length = objArr.length;
                        if (equals) {
                            z2 = true;
                        }
                        if (z2) {
                            this.A.add(Long.valueOf(next.e));
                            aa = (ag + 97) % Property.TYPE_ARRAY;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                next = it.next();
                if (!next.d.equals("Y")) {
                    z = true;
                }
                if (!z) {
                    this.A.add(Long.valueOf(next.e));
                    aa = (ag + 97) % Property.TYPE_ARRAY;
                }
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer
    public final void e(GetTxnTellerDetailResponse getTxnTellerDetailResponse) {
        try {
            this.w = getTxnTellerDetailResponse;
            if (!(!getTxnTellerDetailResponse.getTxnDetail().getType().equals("Tarikan Tunai"))) {
                if (this.m != null) {
                    ag = (aa + 23) % Property.TYPE_ARRAY;
                    if (this.m.getVerified().equals("Y")) {
                        z("Tarikan Tunai");
                        return;
                    }
                }
                x();
                Intent intent = new Intent(D(), TarikanUbahTransaksiActivity.class);
                intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(getTxnTellerDetailResponse));
                intent.putExtra("token", this.O);
                startActivity(intent);
                int i = aa + 87;
                ag = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? ')' : 16) != 16) {
                    throw new ArithmeticException("divide by zero");
                }
            } else if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Setoran Tunai")) {
                if ((new BigInteger(getTxnTellerDetailResponse.getTxnDetail().getTxnAmount()).compareTo(BigInteger.valueOf(100000000)) >= 0 ? (char) 0 : 17) != 17) {
                    boolean equalsIgnoreCase = getTxnTellerDetailResponse.getTxnDetail().getSourceAccountOwnerType().equalsIgnoreCase("ORG");
                    GetFundPurposePresenter getFundPurposePresenter = this.N;
                    String e = getPromotion.e(this.m);
                    getFundPurposePresenter.e.g_();
                    getFundPurposePresenter.b(e, "Y", equalsIgnoreCase);
                    return;
                }
                this.F.d(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), false);
            } else if (getTxnTellerDetailResponse.getTxnDetail().getType().equals("Transfer Valuta Asing")) {
                this.M.a(this.m, this.w);
            } else {
                if ((getTxnTellerDetailResponse.getTxnDetail().getType().equals("Kliring") ? 'J' : '$') != '$' && SystemClock.elapsedRealtime() - this.v >= 3000) {
                    this.v = SystemClock.elapsedRealtime();
                    if (this.m == null || !this.m.getVerified().equals("Y")) {
                        v();
                        D("Individu");
                        return;
                    }
                    z("Kliring");
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void e(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse) {
        this.U = masterFundSourcePurposeResponse;
        this.F.d(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), false);
        try {
            aa = (ag + 85) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(D(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.w));
        intent.putExtra("token", this.O);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.U;
        if ((masterFundSourcePurposeResponse != null ? 'K' : 19) != 19) {
            int i = aa + 11;
            ag = i % Property.TYPE_ARRAY;
            char c = i % 2 == 0 ? '4' : ',';
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
            if (c == '4') {
                Object[] objArr = null;
                int length = objArr.length;
            }
            aa = (ag + 15) % Property.TYPE_ARRAY;
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        x();
        ArrayList arrayList = new ArrayList();
        ag = (aa + 87) % Property.TYPE_ARRAY;
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
            DaftarTransfer daftarTransfer = new DaftarTransfer();
            daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
            daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
            daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
            arrayList.add(daftarTransfer);
        }
        Intent intent = new Intent(D(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.w));
        intent.putExtra("token", this.O);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.U;
        if (!(masterFundSourcePurposeResponse == null)) {
            ag = (aa + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
            intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
        }
        try {
            startActivity(intent);
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r10 != 'Z') goto L_0x0109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
        r0 = com.bca.smartbranch.activity.DetailTundaReservasiROActivity.aa + 71;
        com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ag = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        if ((r0 % 2) != 0) goto L_0x00a6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
        if (r7.W.size() >= 3) goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
        r10 = '6';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
        r10 = 'W';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
        if (r10 == 'W') goto L_0x0109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
        if (r7.W.size() >= 2) goto L_0x0109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
        if (r7.m.getVerified().equals("Y") != false) goto L_0x00c9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
        r10 = 'P';
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
        if (r10 == 6) goto L_0x0109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        D("Perusahaan");
        r0 = com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ag + 25;
        com.bca.smartbranch.activity.DetailTundaReservasiROActivity.aa = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if ((r0 % 2) == 0) goto L_0x00f4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
        r10 = 'J';
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
        r10 = 'T';
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
        if (r10 == 'J') goto L_0x00fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fd, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0162, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0164, code lost:
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0165, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0167, code lost:
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r7.V.size() < 2) goto L_0x0074;
     */
    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void e(java.util.List<o.OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> r8, java.util.List<o.OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> r9) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaReservasiROActivity.e(java.util.List, java.util.List):void");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(D(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.w));
        intent.putExtra("token", this.O);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.U;
        if ((masterFundSourcePurposeResponse != null ? '\t' : '\"') != '\"') {
            int i = ag + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
            aa = i % Property.TYPE_ARRAY;
            try {
                if (i % 2 == 0) {
                    intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
                    aa = (ag + 99) % Property.TYPE_ARRAY;
                } else {
                    intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        try {
            aa = (ag + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
            this.tvErrorMessage.setText(str);
            this.Y.setDisplayedChild(1);
            int i = ag + 51;
            aa = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'P' : ':') != ':') {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        try {
            int i = aa + 21;
            ag = i % Property.TYPE_ARRAY;
            boolean z = i % 2 != 0;
            z();
            if (!z) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(D(), FormUbahTellerActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.w));
        intent.putExtra("token", this.O);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = this.U;
        if ((masterFundSourcePurposeResponse != null ? '\t' : '&') != '&') {
            aa = (ag + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
            try {
                intent.putExtra("fund_purpose", ListUtil.OneItemImmutableList.e(masterFundSourcePurposeResponse));
            } catch (Exception e) {
                throw e;
            }
        }
        startActivity(intent);
        try {
            aa = (ag + 113) % Property.TYPE_ARRAY;
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        try {
            ag = (aa + 77) % Property.TYPE_ARRAY;
            this.Y.setDisplayedChild(0);
            aa = (ag + 67) % Property.TYPE_ARRAY;
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
        try {
            int i = aa + 11;
            ag = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? 25 : 'P') == 25) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        aa = (ag + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void k(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = aa + 97;
        ag = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'V' : '1') != '1') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
    public final void l(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = aa + 33;
        ag = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void m(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = aa + 97;
        ag = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void n(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = ag + 67;
        aa = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'H' : 'Y') == 'H') {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void o(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = ag + 17;
        aa = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        aa = (ag + 95) % Property.TYPE_ARRAY;
        try {
            finish();
            aa = (ag + 45) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 != false) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r5.y != false) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        startActivity(new android.content.Intent(r5, com.bca.smartbranch.activity.InfoDocumentUnderlyingActivity.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ag = (com.bca.smartbranch.activity.DetailTundaReservasiROActivity.aa + 55) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ag + 93;
        com.bca.smartbranch.activity.DetailTundaReservasiROActivity.aa = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
        if ((r0 % 2) == 0) goto L_0x0080;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r7 == false) goto L_0x0085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        throw new java.lang.ArithmeticException("divide by zero");
     */
    @butterknife.OnClick({2131299502})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onClickNote(android.view.View r6) {
        /*
            r5 = this;
            int r0 = com.bca.smartbranch.activity.DetailTundaReservasiROActivity.aa
            r1 = 93
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ag = r0
            r0 = 1
            r8 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001c
            r0 = 0
            r7 = r0
            goto L_0x001e
        L_0x001c:
            r0 = 1
            r7 = r0
        L_0x001e:
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x0037
            r0 = r5
            boolean r0 = r0.y
            r9 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0034
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0064
            goto L_0x003e
        L_0x0034:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x0037:
            r0 = r5
            boolean r0 = r0.y
            if (r0 == 0) goto L_0x0064
        L_0x003e:
            android.content.Intent r0 = new android.content.Intent
            r1 = r0
            r2 = r5
            java.lang.Class<com.bca.smartbranch.activity.InfoDocumentUnderlyingActivity> r3 = com.bca.smartbranch.activity.InfoDocumentUnderlyingActivity.class
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.startActivity(r1)     // Catch: Exception -> 0x0061
            int r0 = com.bca.smartbranch.activity.DetailTundaReservasiROActivity.aa     // Catch: Exception -> 0x0061
            r1 = 55
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ag = r0
            goto L_0x0064
        L_0x0061:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x0064:
            int r0 = com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ag
            r1 = 93
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailTundaReservasiROActivity.aa = r0
            r0 = r8
            r7 = r0
            r0 = r10
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0080
            r0 = 0
            r7 = r0
        L_0x0080:
            r0 = r7
            if (r0 == 0) goto L_0x0085
            return
        L_0x0085:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: all -> 0x008f
            r1 = r0
            java.lang.String r2 = "divide by zero"
            r1.<init>(r2)     // Catch: all -> 0x008f
            throw r0     // Catch: all -> 0x008f
        L_0x008f:
            r6 = move-exception
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaReservasiROActivity.onClickNote(android.view.View):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = ag + 113;
        aa = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        ag = (aa + 29) % Property.TYPE_ARRAY;
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.E;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        if (call != null) {
            try {
                call.cancel();
            } catch (Exception e) {
                throw e;
            }
        }
        detailTransactionPresenter.e = null;
        this.L.e();
        DaftarTransferPresenter daftarTransferPresenter = this.F;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call2 = daftarTransferPresenter.a;
        if ((call2 != null ? '8' : 'Q') != 'Q') {
            call2.cancel();
        }
        daftarTransferPresenter.c = null;
        GetCustAcctListPresenter getCustAcctListPresenter = this.G;
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call3 = getCustAcctListPresenter.b;
        if (call3 != null) {
            call3.cancel();
        }
        getCustAcctListPresenter.e = null;
        CancelTundaPresenter cancelTundaPresenter = this.D;
        Call<OpenAccountSuccessActivity<Object>> call4 = cancelTundaPresenter.d;
        if (call4 != null) {
            call4.cancel();
        }
        cancelTundaPresenter.a = null;
        GetFundPurposePresenter getFundPurposePresenter = this.N;
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call5 = getFundPurposePresenter.c;
        if (call5 != null) {
            call5.cancel();
            try {
                aa = (ag + 83) % Property.TYPE_ARRAY;
            } catch (Exception e2) {
                throw e2;
            }
        }
        getFundPurposePresenter.e = null;
        CancelReservationPresenter cancelReservationPresenter = this.C;
        Call<OpenAccountSuccessActivity<Object>> call6 = cancelReservationPresenter.c;
        if (call6 != null) {
            call6.cancel();
        }
        cancelReservationPresenter.a = null;
        this.M.d();
        this.R.e();
        GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = this.K;
        Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> call7 = getTxnTellerDetailKUPresenter.c;
        if ((call7 != null ? (char) '\t' : 0) != 0) {
            call7.cancel();
            aa = (ag + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        }
        getTxnTellerDetailKUPresenter.a = null;
        this.P.b();
        this.B.b();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        aa = (ag + 15) % Property.TYPE_ARRAY;
        int itemId = menuItem.getItemId();
        boolean z = false;
        if (itemId != 16908332) {
            aa = (ag + 91) % Property.TYPE_ARRAY;
            if (itemId == 2131298038) {
                z = true;
            }
            if (!z) {
                boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
                aa = (ag + 113) % Property.TYPE_ARRAY;
                return onOptionsItemSelected;
            }
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        int i = ag + 111;
        aa = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? ' ' : 'U') != 'U') {
            onPointerCaptureChanged(z);
            throw new ArithmeticException("divide by zero");
        } else {
            onPointerCaptureChanged(z);
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ag = (aa + 101) % Property.TYPE_ARRAY;
        onRequestPermissionsResult(i, strArr, iArr);
        subscribeRemoveVisaCardEvent.e(this, i, iArr);
        aa = (ag + 99) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        ag = (aa + 45) % Property.TYPE_ARRAY;
        try {
            try {
                setCardSlogan.e().b = "DetailTundaReservasiROActivity";
                this.j = "DetailTundaReservasiROActivity";
                aa = (ag + 1) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void p(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            int i = ag + 101;
            try {
                aa = i % Property.TYPE_ARRAY;
                if ((i % 2 != 0 ? 'I' : '<') == 'I') {
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = aa + 67;
        ag = i % Property.TYPE_ARRAY;
        if (!(i % 2 == 0)) {
            return 2131492942;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492942;
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
            ag = (aa + 89) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            aa = (ag + 79) % Property.TYPE_ARRAY;
            aa = (ag + 43) % Property.TYPE_ARRAY;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void r(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            ag = (aa + 99) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
        ag = (aa + 115) % Property.TYPE_ARRAY;
        this.Y.setDisplayedChild(0);
        aa = (ag + 21) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void s(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
                int i = aa + 97;
                ag = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        try {
            try {
                aa = (ag + 51) % Property.TYPE_ARRAY;
                this.ac = branchMapItemBNAdapter$BranchMapItemVH.c;
                if ((Build.VERSION.SDK_INT >= 33 ? 16 : 'G') != 16) {
                    subscribeRemoveVisaCardEvent.b(this);
                    ag = (aa + 47) % Property.TYPE_ARRAY;
                    return;
                }
                ag = (aa + 33) % Property.TYPE_ARRAY;
                y();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            ag = (aa + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
            this.f.b(this.llDetail, this.ivDetail);
            try {
                int i = aa + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
                ag = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? '8' : '%') == '8') {
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
        try {
            try {
                ag = (aa + 115) % Property.TYPE_ARRAY;
                if (chooseBCACardAdapter$ViewHolder.e) {
                    this.C.e(new FormUbahTellerActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.m.getImei()));
                    return;
                }
                this.D.a(new choosePic(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
                int i = aa + 29;
                ag = i % Property.TYPE_ARRAY;
                if ((i % 2 == 0 ? 30 : 'U') == 30) {
                    throw new NullPointerException();
                }
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
        boolean z = true;
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = aa + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
        ag = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            z = false;
        }
        if (z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.IconCompatParcelizer
    public final void t(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        aa = (ag + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
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
        aa = (ag + 65) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void u(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        aa = (ag + 33) % Property.TYPE_ARRAY;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void ubah(ChooseSubMastercardAdapter$ViewHolder_ViewBinding chooseSubMastercardAdapter$ViewHolder_ViewBinding) {
        aa = (ag + 41) % Property.TYPE_ARRAY;
        try {
            this.p = null;
            this.w = null;
            try {
                this.t = Integer.valueOf(chooseSubMastercardAdapter$ViewHolder_ViewBinding.b);
                this.O = chooseSubMastercardAdapter$ViewHolder_ViewBinding.a;
                this.I = chooseSubMastercardAdapter$ViewHolder_ViewBinding.d;
                if (chooseSubMastercardAdapter$ViewHolder_ViewBinding.c.equals("Transfer ke Bank Lain")) {
                    GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter = this.K;
                    String str = this.O;
                    String e = getPromotion.e(this.m);
                    getTxnTellerDetailKUPresenter.a.g_();
                    Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> l = getTxnTellerDetailKUPresenter.apiService.l(e, str);
                    getTxnTellerDetailKUPresenter.c = l;
                    l.enqueue(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007f: INVOKE  
                          (r0v40 'l' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse>>)
                          (wrap: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter$4 : 0x007c: CONSTRUCTOR  (r1v17 com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter$4 A[REMOVE]) = (r0v30 'getTxnTellerDetailKUPresenter' com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter) call: com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.4.<init>(com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter):void type: CONSTRUCTOR)
                         type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ubah(o.ChooseSubMastercardAdapter$ViewHolder_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaReservasiROActivity.class
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
                    // Method dump skipped, instructions count: 220
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailTundaReservasiROActivity.ubah(o.ChooseSubMastercardAdapter$ViewHolder_ViewBinding):void");
                }

                @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
                public final void v(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    aa = (ag + 65) % Property.TYPE_ARRAY;
                }

                @Override // com.bca.smartbranch.presenter.InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void w(String str) {
                    try {
                        x();
                        Bundle bundle = new Bundle();
                        bundle.putString("MessageDialogContent", str);
                        MessageDialog messageDialog = new MessageDialog();
                        messageDialog.setArguments(bundle);
                        messageDialog.show(l(), "MessageDialog");
                        int i = aa + 111;
                        ag = i % Property.TYPE_ARRAY;
                        if ((i % 2 == 0 ? 16 : 'H') != 'H') {
                            throw new ArithmeticException("divide by zero");
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }

                @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
                public final void w_(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    ag = (aa + 27) % Property.TYPE_ARRAY;
                }

                @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
                public final void x(String str) {
                    try {
                        x();
                        Bundle bundle = new Bundle();
                        try {
                            bundle.putString("MessageDialogContent", str);
                            MessageDialog messageDialog = new MessageDialog();
                            messageDialog.setArguments(bundle);
                            messageDialog.show(l(), "MessageDialog");
                            int i = aa + 25;
                            ag = i % Property.TYPE_ARRAY;
                            if ((i % 2 == 0 ? 'G' : '\f') == 'G') {
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

                @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
                public final void x_(String str) {
                    x();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(l(), "MessageDialog");
                    ag = (aa + 13) % Property.TYPE_ARRAY;
                }

                public final void y() {
                    int i = aa + 113;
                    ag = i % Property.TYPE_ARRAY;
                    if (!(i % 2 == 0)) {
                        a(this.n);
                    } else {
                        a(this.n);
                        throw new NullPointerException();
                    }
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
                        int i = ag + 79;
                        try {
                            aa = i % Property.TYPE_ARRAY;
                            if (!(i % 2 == 0)) {
                                throw new ArithmeticException("divide by zero");
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }

                @OnClick({2131297408})
                public void zoomQRCode() {
                    try {
                        int i = aa + 29;
                        ag = i % Property.TYPE_ARRAY;
                        if (i % 2 == 0) {
                            QRCodeDialog qRCodeDialog = this.s;
                            throw new ArithmeticException("divide by zero");
                        }
                        if (this.s == null) {
                            this.s = new QRCodeDialog();
                            aa = (ag + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
                        }
                        QRCodeDialog qRCodeDialog2 = this.s;
                        Bitmap bitmap = this.n;
                        String str = this.Q;
                        qRCodeDialog2.b = bitmap;
                        qRCodeDialog2.d = str;
                        this.s.show(l(), "QRCodeDialog");
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
