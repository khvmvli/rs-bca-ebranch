package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ListDetailOpenTransaksiAdapter;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import o.CC23BFormKartuKreditFragment_ViewBinding;
import o.DetailBerhasilTarikanNotificationActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.consumeDisplayCutout;
import o.equals;
import o.getCardDescription;
import o.getLifecycle;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiTellerSuccessActivity.class */
public class ReservasiTellerSuccessActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static int D;
    private static int F;
    private static int H;
    private static short[] I;
    private boolean B;
    private String C;
    private setMessage f;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297858)
    LinearLayout llPhoneWrapper;
    @BindView(2131297875)
    LinearLayout llRuangan;
    private Bitmap n;
    @BindString(2131821358)
    String note;
    private ListDetailOpenTransaksiAdapter p;
    private QRCodeDialog q;
    private boolean r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298336)
    setOnStartEnterTransitionListener rvTransaksi;
    private boolean s;
    @BindView(2131298420)
    getLifecycle svMain;
    private Boolean t;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298866)
    TextView tvBranchCityProvince;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298868)
    TextView tvBranchPhone;
    @BindView(2131298869)
    TextView tvBranchTitle;
    @BindView(2131298925)
    TextView tvDescriptionKey;
    @BindView(2131298928)
    TextView tvDescriptionValue;
    @BindView(2131299312)
    TextView tvJenisRuangan;
    @BindView(2131299409)
    TextView tvMessage;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299554)
    TextView tvReservasiDate;
    @BindView(2131299559)
    TextView tvReservasiTitle;
    @BindView(2131299615)
    TextView tvTitle;
    private TxnTellerResponse u;
    private String v;
    private CreateQueueReservationResponse w;
    private SendEmailTransactionSuccessPresenter x;
    private GetBranchROResponse.DetailBranch y;
    private static byte[] E = {-70, -72, -84, -90, -98, -78, -88, -83, -19, 113, -80, -96, -72, -102, -69, -103, -83, -68, -97, -91, -16, 120, -87, -84, -33, 108, -87, -73};
    private static int A = 128582883;
    private static int z = 98;

    public ReservasiTellerSuccessActivity() {
        try {
            this.f = new setMessage();
            this.r = false;
            this.s = false;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void a(int i, byte b, int i2, int i3, short s, Object[] objArr) {
        String obj;
        synchronized (CC23BFormKartuKreditFragment_ViewBinding.e) {
            StringBuilder sb = new StringBuilder();
            int i4 = i3 + z;
            boolean z2 = i4 == -1;
            if (z2) {
                i4 = E != null ? (byte) (E[A + i2] + z) : (short) (I[A + i2] + z);
            }
            if (i4 > 0) {
                CC23BFormKartuKreditFragment_ViewBinding.d = ((i2 + i4) - 2) + A + (z2 ? 1 : 0);
                CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (i + D));
                sb.append(CC23BFormKartuKreditFragment_ViewBinding.c);
                CC23BFormKartuKreditFragment_ViewBinding.b = (char) CC23BFormKartuKreditFragment_ViewBinding.c;
                CC23BFormKartuKreditFragment_ViewBinding.a = 1;
                while (CC23BFormKartuKreditFragment_ViewBinding.a < i4) {
                    if (E != null) {
                        byte[] bArr = E;
                        int i5 = CC23BFormKartuKreditFragment_ViewBinding.d;
                        CC23BFormKartuKreditFragment_ViewBinding.d = i5 - 1;
                        CC23BFormKartuKreditFragment_ViewBinding.c = (char) ((char) (CC23BFormKartuKreditFragment_ViewBinding.b + (((byte) (bArr[i5] + s)) ^ b)));
                    } else {
                        short[] sArr = I;
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

    private static Bitmap b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        H = (F + 31) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter b(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
        H = (F + setHasDecor$MediaBrowserCompat$MediaItem.aN) % Property.TYPE_ARRAY;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = reservasiTellerSuccessActivity.x;
        int i = F + 101;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '9' : '&') == '&') {
            return sendEmailTransactionSuccessPresenter;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return sendEmailTransactionSuccessPresenter;
    }

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.v);
        sb.append(".jpg");
        String obj = sb.toString();
        char c = 29;
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
            if ((file2.exists() ? '-' : '6') == '-') {
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                H = (F + 99) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            a(getPackageName().codePointAt(2) - 578855920, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -128582884 - ((byte) KeyEvent.getModifierMetaStateMask()), getResources().getString(2131822451).substring(0, 4).codePointAt(1) - 148, (short) (getResources().getString(2131822451).substring(0, 4).length() + 81), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if ((this.B ? '%' : '-') != '-') {
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
            c = '7';
        }
        if (c == '7') {
            int i = H + setHasDecor$MediaBrowserCompat$MediaItem.aM;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'S' : '^') != '^') {
                qRCodeDialog.dismiss();
                throw new ArithmeticException("divide by zero");
            } else {
                qRCodeDialog.dismiss();
            }
        }
    }

    private void c(String str) {
        try {
            SpannableString spannableString = new SpannableString(Html.fromHtml(str));
            int indexOf = str.indexOf("bukti identitas");
            boolean z2 = true;
            spannableString.setSpan(new StyleSpan(1), indexOf, indexOf + 15, 33);
            int indexOf2 = str.indexOf("kartu ATM BCA");
            spannableString.setSpan(new StyleSpan(1), indexOf2, indexOf2 + 13, 33);
            this.tvNote.setText(spannableString);
            int i = F + 53;
            H = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                z2 = false;
            }
            if (z2) {
                Object[] objArr = null;
                int length = objArr.length;
            }
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
        if (!(Build.VERSION.SDK_INT < 29)) {
            F = (H + 11) % Property.TYPE_ARRAY;
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
            if (!(!file2.exists())) {
                int i = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
                F = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    file2.delete();
                    throw new NullPointerException();
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
            a(-595633027 - Color.rgb(0, 0, 0), (byte) (1 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))), getApplicationInfo().targetSdkVersion - 128582917, getResources().getString(2131821267).substring(2, 4).length() - 101, (short) ((ViewConfiguration.getEdgeSlop() >> 16) + 85), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    static /* synthetic */ String e(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
        try {
            H = (F + 113) % Property.TYPE_ARRAY;
            try {
                String str = reservasiTellerSuccessActivity.v;
                H = (F + 35) % Property.TYPE_ARRAY;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void e(LogRedirector.Logger logger) {
        int i = F + 61;
        H = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 6 : '[') != '[') {
            try {
                logger.a();
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                logger.a();
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private void u() {
        Iterator<TxnTellerResponse.Description> it = this.u.getTxnDataOutput().getDescriptionList().iterator();
        while (true) {
            if ((it.hasNext() ? 'X' : '\f') != 'X') {
                this.tvNote.setText(Html.fromHtml(this.note));
                if (this.r) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "Jangan lupa untuk membawa kelengkapan berikut ke kantor cabang BCA terdekat:\n");
                    int length = spannableStringBuilder.length();
                    if (this.s) {
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
                    F = (H + 35) % Property.TYPE_ARRAY;
                }
                c("Jangan lupa bawa bukti identitas (KTP/Paspor) dan kartu ATM BCA kamu");
                return;
            }
            TxnTellerResponse.Description next = it.next();
            String key = next.getKey();
            key.hashCode();
            if (key.equals("TxnDetail")) {
                ArrayList<TxnTellerResponse.ValueTxnDataDetail> arrayList = new ArrayList();
                arrayList.addAll(next.getValueArray());
                F = (H + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
                for (TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail : arrayList) {
                    if (valueTxnDataDetail.getTxnType().equals("Transfer Valuta Asing")) {
                        this.r = true;
                        if (valueTxnDataDetail.getProductType().equals("L")) {
                            this.s = true;
                        }
                    }
                    if (valueTxnDataDetail.getTxnSubDataDetails() == null || valueTxnDataDetail.getTxnSubDataDetails().size() <= 0) {
                        valueTxnDataDetail.setViewType(ListDetailOpenTransaksiAdapter.b);
                    } else {
                        valueTxnDataDetail.setViewType(ListDetailOpenTransaksiAdapter.e);
                    }
                    if (valueTxnDataDetail.getTxnType().equals("Tarikan Tunai")) {
                        int i = F + 67;
                        H = i % Property.TYPE_ARRAY;
                        if (i % 2 == 0) {
                            valueTxnDataDetail.getAmount().isEmpty();
                            throw new NullPointerException();
                        }
                        if (Long.parseLong(valueTxnDataDetail.getAmount().isEmpty() ? "0" : valueTxnDataDetail.getAmount()) > 100000000) {
                            this.tvMessage.setText(2131821913);
                            this.llPhoneWrapper.setVisibility(0);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    this.p = new ListDetailOpenTransaksiAdapter(this, arrayList, false);
                    this.rvTransaksi.setLayoutManager(new LinearLayoutManager(1, false));
                    this.rvTransaksi.setHasFixedSize(true);
                    this.rvTransaksi.setAdapter(this.p);
                }
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        F = (H + 39) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReservasiTellerSuccessActivity.b(ReservasiTellerSuccessActivity.this).c(new LoginSessionActivity_ViewBinding(ReservasiTellerSuccessActivity.this.m.getEmail(), ReservasiTellerSuccessActivity.e(ReservasiTellerSuccessActivity.this)));
            }
        }).g();
        F = (H + 83) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        H = (F + 61) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
        F = (H + 51) % Property.TYPE_ARRAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x02a3, code lost:
        if (r0 == false) goto L_0x02b6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02b3, code lost:
        if (r5.t.booleanValue() == false) goto L_0x02b6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02b6, code lost:
        r9 = r5.y.getBranchName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02c2, code lost:
        r9 = "";
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 1691
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
                F = (H + 45) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        int i = H + 15;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '\\' : 'a') != '\\') {
            z();
            return;
        }
        z();
        Object[] objArr = null;
        int length = objArr.length;
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        F = (H + 25) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        try {
            int i = F + 77;
            H = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? (char) 29 : 20) != 29) {
                onDestroy();
                SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.x;
                Call<OpenAccountSuccessActivity<Object>> call = sendEmailTransactionSuccessPresenter.a;
                SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
                if (call != null) {
                    int i2 = F + 61;
                    H = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 == 0) {
                        try {
                            call.cancel();
                            throw new NullPointerException();
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        call.cancel();
                        sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
                    }
                }
                sendEmailTransactionSuccessPresenter2.b = null;
                H = (F + 15) % Property.TYPE_ARRAY;
                return;
            }
            onDestroy();
            Call<OpenAccountSuccessActivity<Object>> call2 = this.x.a;
            throw new ArithmeticException("divide by zero");
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = F + 3;
        H = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            onRequestPermissionsResult(i, strArr, iArr);
            DetailBerhasilTarikanNotificationActivity_ViewBinding.b(this, i, iArr);
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        onRequestPermissionsResult(i, strArr, iArr);
        DetailBerhasilTarikanNotificationActivity_ViewBinding.b(this, i, iArr);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = H + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        F = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'N' : 5) != 'N') {
            setCardSlogan.e().b = "ReservasiTellerSuccessActivity";
            this.j = "ReservasiTellerSuccessActivity";
            return;
        }
        setCardSlogan.e().b = "ReservasiTellerSuccessActivity";
        this.j = "ReservasiTellerSuccessActivity";
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        H = (F + 77) % Property.TYPE_ARRAY;
        int i = F + 13;
        H = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            return 2131492999;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return 2131492999;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        int i = H + 71;
        F = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return this;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 25 ? 'K' : 23) != 23) goto L_0x0052;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x0052;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        o.DetailBerhasilTarikanNotificationActivity_ViewBinding.c(r4);
        r0 = com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.H + 15;
        com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.F = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if ((r0 % 2) == 0) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        return;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH r5) {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.H
            r1 = 23
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.F = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001a
            r0 = 1
            r6 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r6 = r0
        L_0x001c:
            r0 = r6
            if (r0 == 0) goto L_0x0042
            r0 = r4
            r1 = r5
            boolean r1 = r1.c
            r0.B = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L_0x0036
            r0 = 75
            r6 = r0
            goto L_0x0039
        L_0x0036:
            r0 = 23
            r6 = r0
        L_0x0039:
            r0 = r6
            r1 = 23
            if (r0 == r1) goto L_0x0057
            goto L_0x0052
        L_0x0042:
            r0 = r4
            r1 = r5
            boolean r1 = r1.c
            r0.B = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0057
        L_0x0052:
            r0 = r4
            r0.y()
            return
        L_0x0057:
            r0 = r4
            o.DetailBerhasilTarikanNotificationActivity_ViewBinding.c(r0)
            int r0 = com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.H
            r1 = 15
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.F = r0
            r0 = r6
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x007e
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: all -> 0x007b
            r1 = r0
            java.lang.String r2 = "divide by zero"
            r1.<init>(r2)     // Catch: all -> 0x007b
            throw r0     // Catch: all -> 0x007b
        L_0x007b:
            r5 = move-exception
            r0 = r5
            throw r0
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH):void");
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        H = (F + 63) % Property.TYPE_ARRAY;
        try {
            onBackPressed();
            F = (H + 21) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        H = (F + 115) % Property.TYPE_ARRAY;
        this.f.b(this.llDetail, this.ivDetail);
        H = (F + 55) % Property.TYPE_ARRAY;
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        int i = F + 21;
        H = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            boolean z2 = this.r;
            throw new NullPointerException();
        }
        try {
            if (this.r) {
                startActivity(new Intent(this, InfoDocumentUnderlyingActivity.class));
            }
            H = (F + 55) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296448})
    public void simpanGallery(View view) {
        H = (F + 97) % Property.TYPE_ARRAY;
        boolean z2 = false;
        if (this.llDetail.getVisibility() == 8) {
            try {
                int i = F + 53;
                H = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z2 = true;
                }
                if (z2) {
                    this.f.b(this.llDetail, this.ivDetail);
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    this.f.b(this.llDetail, this.ivDetail);
                }
            } catch (Exception e) {
                throw e;
            }
        }
        z();
        new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.3
            @Override // java.lang.Runnable
            public final void run() {
                if (Build.VERSION.SDK_INT >= 33) {
                    ReservasiTellerSuccessActivity.this.t();
                } else {
                    DetailBerhasilTarikanNotificationActivity_ViewBinding.b(ReservasiTellerSuccessActivity.this);
                }
            }
        }, 500);
    }

    public final void t() {
        int i = F + 113;
        H = i % Property.TYPE_ARRAY;
        boolean z2 = false;
        if (!(i % 2 == 0)) {
            d(b(this.llMain));
            int i2 = H + 87;
            F = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                z2 = true;
            }
            if (z2) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        d(b(this.llMain));
        throw new ArithmeticException("divide by zero");
    }

    public final void y() {
        try {
            int i = H + 43;
            F = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? (char) 20 : 18) != 20) {
                c(this.n);
            } else {
                c(this.n);
                throw new ArithmeticException("divide by zero");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r4.q == null) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        r4.q = new com.bca.smartbranch.dialog.QRCodeDialog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = r4.q;
        r0 = r4.n;
        r0 = r4.tvNoReferensi.getText().toString();
        r0.b = r0;
        r0.d = r0;
        r4.q.show(l(), "QRCodeDialog");
        r0 = com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.F + 5;
        com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.H = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
        if ((r0 % 2) != 0) goto L_0x0090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        r5 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
        r5 = 'O';
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        if (r5 == '\b') goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
        throw new java.lang.NullPointerException();
     */
    @butterknife.OnClick({2131297409})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void zoomQRCode() {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.H
            r1 = 53
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.F = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001a
            r0 = 0
            r5 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 1
            r5 = r0
        L_0x001c:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x0033
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            r6 = r0
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0030
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0045
            goto L_0x003a
        L_0x0030:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x0033:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            if (r0 != 0) goto L_0x0045
        L_0x003a:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r1 = new com.bca.smartbranch.dialog.QRCodeDialog
            r2 = r1
            r2.<init>()
            r0.q = r1
        L_0x0045:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            r7 = r0
            r0 = r4
            android.graphics.Bitmap r0 = r0.n
            r8 = r0
            r0 = r4
            android.widget.TextView r0 = r0.tvNoReferensi
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r7
            r1 = r8
            r0.b = r1
            r0 = r7
            r1 = r6
            r0.d = r1
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            r1 = r4
            o.isDetached r1 = r1.l()
            java.lang.String r2 = "QRCodeDialog"
            r0.show(r1, r2)
            int r0 = com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.F
            r1 = 5
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.H = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0090
            r0 = 8
            r5 = r0
            goto L_0x0093
        L_0x0090:
            r0 = 79
            r5 = r0
        L_0x0093:
            r0 = r5
            r1 = 8
            if (r0 == r1) goto L_0x009a
            return
        L_0x009a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x00a2
            r1 = r0
            r1.<init>()     // Catch: all -> 0x00a2
            throw r0     // Catch: all -> 0x00a2
        L_0x00a2:
            r6 = move-exception
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity.zoomQRCode():void");
    }
}
