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
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ListDetailOpenTransaksiAdapter;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC23AFormKartuKreditFragment;
import o.CC3SKartuUtamaActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.LoginSessionActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getCardDescription;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailOpenTellerActivity.class */
public class DetailOpenTellerActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static int B;
    private static int D;
    private boolean C;
    @BindString(2131820609)
    String buktiPengisianForm;
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297408)
    ImageView ivQRCode;
    @BindView(2131297562)
    LinearLayout llCapture;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297711)
    LinearLayout llKcp;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297858)
    LinearLayout llPhoneWrapper;
    private Bitmap n;
    @BindString(2131821357)
    String note;
    private ListDetailOpenTransaksiAdapter p;
    private QRCodeDialog q;
    @BindString(2131822092)
    String retry;
    @BindView(2131298329)
    setOnStartEnterTransitionListener rvListTransaksi;
    private String t;
    @BindString(2131822498)
    String tarikanCek;
    @BindString(2131822499)
    String tarikanTunai;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298866)
    TextView tvBranchCityProvince;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298868)
    TextView tvBranchPhone;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299409)
    TextView tvMessage;
    @BindView(2131299467)
    TextView tvNoReff;
    @BindView(2131299502)
    TextView tvNote;
    private TxnTellerResponse.TxnDataOutput u;
    private ViewAnimator v;
    private GetBranchROResponse.DetailBranch w;
    private SendEmailTransactionSuccessPresenter x;
    private String y;
    private static char[] A = {13813, 13811, 13812, 13817, 13823, 13748, 13801, 13810, 13822, 13800, 13806, 13804, 13816, 13815, 13802, 13819};
    private static char z = (char) 4;
    setMessage f = new setMessage();
    private boolean r = false;
    private boolean s = false;

    static /* synthetic */ String a(DetailOpenTellerActivity detailOpenTellerActivity) {
        B = (D + 57) % Property.TYPE_ARRAY;
        String str = detailOpenTellerActivity.t;
        try {
            D = (B + 93) % Property.TYPE_ARRAY;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void b(byte b, char[] cArr, int i, Object[] objArr) {
        int i2;
        String str;
        synchronized (CC23AFormKartuKreditFragment.i) {
            char[] cArr2 = A;
            char c = z;
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

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.y);
        sb.append(".jpg");
        String obj = sb.toString();
        boolean z2 = false;
        if ((Build.VERSION.SDK_INT >= 29 ? 18 : ';') != ';') {
            B = (D + 75) % Property.TYPE_ARRAY;
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
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                D = (B + 25) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            b((byte) ((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 120), new char[]{0, 1, 1, '\t', 15, 0, '\r', 7, 5, 14, '\r', 11, '\b', 14, 11, '\r', 3, 0, 4, 6, '\r', '\n', 3, '\b', 0, '\t', 5, '\b'}, getResources().getString(2131822451).substring(0, 4).length() + 24, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if ((this.C ? '#' : 29) != 29) {
            B = (D + 67) % Property.TYPE_ARRAY;
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
            z2 = true;
        }
        if (z2) {
            qRCodeDialog.dismiss();
        }
    }

    public static void b(LogRedirector.Logger logger) {
        B = (D + 31) % Property.TYPE_ARRAY;
        try {
            logger.a();
            B = (D + 91) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    private static Bitmap c(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        B = (D + 31) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        if ((Build.VERSION.SDK_INT >= 29 ? '*' : 'M') != '*') {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if (!(!file2.exists())) {
                B = (D + 23) % Property.TYPE_ARRAY;
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
            b((byte) (getResources().getString(2131822451).substring(0, 4).codePointAt(2) + 85), new char[]{0, 1, 1, '\t', 15, 0, '\r', 7, 5, 14, '\r', 11, '\b', 14, 11, '\r', 3, 0, 4, 6, '\r', '\n', 3, '\b', 0, '\t', 5, '\b'}, getPackageName().codePointAt(15) - 69, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            D = (B + 95) % Property.TYPE_ARRAY;
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter d(DetailOpenTellerActivity detailOpenTellerActivity) {
        try {
            int i = B + 37;
            D = i % Property.TYPE_ARRAY;
            char c = i % 2 != 0 ? '3' : '^';
            SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = detailOpenTellerActivity.x;
            if (c != '3') {
                return sendEmailTransactionSuccessPresenter;
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ String e(DetailOpenTellerActivity detailOpenTellerActivity) {
        B = (D + 27) % Property.TYPE_ARRAY;
        String str = detailOpenTellerActivity.y;
        try {
            try {
                D = (B + 25) % Property.TYPE_ARRAY;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021c A[EDGE_INSN: B:96:0x021c->B:73:0x021c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void u() {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailOpenTellerActivity.u():void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        try {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            D = (B + 53) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailOpenTellerActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailOpenTellerActivity.d(DetailOpenTellerActivity.this).a(getPromotion.e(DetailOpenTellerActivity.this.m, DetailOpenTellerActivity.this.m != null ? "N" : "Y", DetailOpenTellerActivity.this.m != null ? DetailOpenTellerActivity.this.m.getImei() : Settings.Secure.getString(DetailOpenTellerActivity.this.getContentResolver(), "android_id"), DetailOpenTellerActivity.a(DetailOpenTellerActivity.this)), DetailOpenTellerActivity.a(DetailOpenTellerActivity.this), new LoginSessionActivity(DetailOpenTellerActivity.e(DetailOpenTellerActivity.this)));
            }
        }).g();
        try {
            int i = B + 77;
            D = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'c' : ']') == 'c') {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        D = (B + 49) % Property.TYPE_ARRAY;
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        B = (D + 33) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.v = (ViewAnimator) findViewById(2131299752);
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.x = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        Bundle extras = getIntent().getExtras();
        this.u = (TxnTellerResponse.TxnDataOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.t = extras.getString("email");
        String string = extras.getString("email_success", "");
        if (!string.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("MessageDialogTitle", getString(2131821716));
            bundle2.putString("MessageDialogContent", string);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle2);
            messageDialog.show(l(), "MessageDialog");
        }
        if ((extras.getParcelable("dataReservasiJumbes") != null ? '[' : 30) == '[') {
            D = (B + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
            this.w = (GetBranchROResponse.DetailBranch) ListUtil.OneItemImmutableList.a(extras.getParcelable("dataReservasiJumbes"));
        }
        String noReff = this.u.getNoReff();
        this.y = noReff;
        this.tvNoReff.setText(noReff);
        Bitmap a = getPromotion.a(this.y, this);
        this.n = a;
        this.ivQRCode.setImageBitmap(a);
        u();
        if (this.w != null) {
            boolean z2 = false;
            this.llKcp.setVisibility(0);
            TextView textView = this.tvBranchName;
            StringBuilder sb = new StringBuilder();
            sb.append(this.w.getBranchType());
            sb.append(" ");
            sb.append(this.w.getBranchName());
            textView.setText(sb.toString());
            this.tvBranchAddress.setText(this.w.getAddress());
            TextView textView2 = this.tvBranchCityProvince;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.w.getCity());
            sb2.append(", ");
            sb2.append(this.w.getProvince());
            textView2.setText(sb2.toString());
            if (!this.w.getPhone().isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                int i = B + 5;
                D = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    this.tvBranchPhone.setText("-");
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    this.tvBranchPhone.setText("-");
                }
                B = (D + 85) % Property.TYPE_ARRAY;
            } else {
                this.tvBranchPhone.setText(this.w.getPhone());
            }
            this.tvMessage.setText(2131821913);
        }
        if (this.r) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "Jangan lupa untuk membawa kelengkapan berikut ke kantor cabang BCA terdekat:\n");
            int length2 = spannableStringBuilder.length();
            if (this.s) {
                spannableStringBuilder.append((CharSequence) "Membawa Dokumen Underlying\n");
                spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099731)), length2 + 7, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length2, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "Dokumen Underlying (untuk akumulasi transaksi minimal 100.000 USD per bulan)\n");
                spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099731)), length2, length2 + 18, 33);
                spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length2, spannableStringBuilder.length(), 33);
            }
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "Kartu ATM BCA\n");
            spannableStringBuilder.setSpan(new StyleSpan(1), length3, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length3, spannableStringBuilder.length(), 33);
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "Bukti identitas (KTP/Paspor)\n");
            spannableStringBuilder.setSpan(new StyleSpan(1), length4, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new getCardDescription(20, getResources().getColor(2131099731), 7), length4, spannableStringBuilder.length(), 33);
            this.tvNote.setText(spannableStringBuilder);
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = D + 15;
        B = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        D = (B + 63) % Property.TYPE_ARRAY;
        try {
            z();
            D = (B + 89) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        int i = B + 91;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? (char) 23 : 14) == 23) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @OnClick({2131299502})
    public void onClickNote(View view) {
        int i = B + 9;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? '+' : 11) != 11) {
            boolean z2 = this.r;
            throw new NullPointerException();
        }
        if (this.r) {
            startActivity(new Intent(this, InfoDocumentUnderlyingActivity.class));
        }
        int i2 = D + 25;
        B = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? 7 : '*') != '*') {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = B + 51;
        D = i % Property.TYPE_ARRAY;
        boolean z2 = true;
        if (i % 2 != 0) {
            getMenuInflater().inflate(2131558409, menu);
            z2 = false;
        } else {
            getMenuInflater().inflate(2131558409, menu);
        }
        return z2;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        int i = B + 25;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 26 : 'D') != 26) {
            onDestroy();
            return;
        }
        onDestroy();
        Object[] objArr = null;
        int length = objArr.length;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        D = (B + 25) % Property.TYPE_ARRAY;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        int i = B + 29;
        D = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 27 : '0') == 27) {
            throw new ArithmeticException("divide by zero");
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = B + 5;
        D = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 4 : ']') != ']') {
            onRequestPermissionsResult(i, strArr, iArr);
            try {
                CC3SKartuUtamaActivity_ViewBinding.c(this, i, iArr);
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            onRequestPermissionsResult(i, strArr, iArr);
            CC3SKartuUtamaActivity_ViewBinding.c(this, i, iArr);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        try {
            try {
                D = (B + 35) % Property.TYPE_ARRAY;
                setCardSlogan.e().b = "DetailOpenTellerActivity";
                this.j = "DetailOpenTellerActivity";
                D = (B + 77) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        int i = D + 99;
        B = i % Property.TYPE_ARRAY;
        boolean z2 = true;
        if (i % 2 != 0) {
            int i2 = D + 47;
            B = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                z2 = false;
            }
            if (z2) {
                return 2131492937;
            }
            throw new NullPointerException();
        }
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        B = (D + 67) % Property.TYPE_ARRAY;
        try {
            int i = B + 59;
            D = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? 'P' : '=') == '=') {
                return this;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        D = (B + 111) % Property.TYPE_ARRAY;
        this.C = branchMapItemBNAdapter$BranchMapItemVH.c;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 33) {
            int i = B + 89;
            D = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                z2 = false;
            }
            if (z2) {
                v();
                throw new NullPointerException();
            }
            try {
                v();
            } catch (Exception e) {
                throw e;
            }
        } else {
            CC3SKartuUtamaActivity_ViewBinding.b(this);
        }
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        int i = D + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        B = i % Property.TYPE_ARRAY;
        boolean z2 = i % 2 != 0;
        onBackPressed();
        if (!z2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @OnClick({2131296448})
    public void sendEmail(View view) {
        D = (B + 75) % Property.TYPE_ARRAY;
        if ((Build.VERSION.SDK_INT >= 33 ? '8' : '&') != '8') {
            CC3SKartuUtamaActivity_ViewBinding.a(this);
            return;
        }
        int i = D + 87;
        B = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            t();
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        t();
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        int i = D + 69;
        B = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            this.f.b(this.llDetail, this.ivDetail);
            throw new NullPointerException();
        }
        try {
            this.f.b(this.llDetail, this.ivDetail);
        } catch (Exception e) {
            throw e;
        }
    }

    public final void t() {
        try {
            int i = B + 53;
            D = i % Property.TYPE_ARRAY;
            if (!(i % 2 != 0)) {
                c(c(this.llCapture));
            } else {
                c(c(this.llCapture));
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final void v() {
        int i = D + 5;
        B = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            b(this.n);
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            b(this.n);
        }
        int i2 = B + 19;
        D = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 'Q' : 20) != 20) {
            throw new NullPointerException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r4.q == null) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        r4.q = new com.bca.smartbranch.dialog.QRCodeDialog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        com.bca.smartbranch.activity.DetailOpenTellerActivity.B = (com.bca.smartbranch.activity.DetailOpenTellerActivity.D + 23) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = r4.q;
        r0 = r4.n;
        r0 = r4.y;
        r0.b = r0;
        r0.d = r0;
        r4.q.show(l(), "QRCodeDialog");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        return;
     */
    @butterknife.OnClick({2131297408})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void zoomQRCode() {
        /*
            r4 = this;
            int r0 = com.bca.smartbranch.activity.DetailOpenTellerActivity.D     // Catch: Exception -> 0x0081
            r5 = r0
            int r5 = r5 + 43
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailOpenTellerActivity.B = r0     // Catch: Exception -> 0x007e
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001a
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
            if (r0 != 0) goto L_0x0054
            goto L_0x003a
        L_0x0030:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x0033:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            if (r0 != 0) goto L_0x0054
        L_0x003a:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r1 = new com.bca.smartbranch.dialog.QRCodeDialog
            r2 = r1
            r2.<init>()
            r0.q = r1
            int r0 = com.bca.smartbranch.activity.DetailOpenTellerActivity.D     // Catch: Exception -> 0x007e
            r1 = 23
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.DetailOpenTellerActivity.B = r0     // Catch: Exception -> 0x007e
        L_0x0054:
            r0 = r4
            com.bca.smartbranch.dialog.QRCodeDialog r0 = r0.q
            r6 = r0
            r0 = r4
            android.graphics.Bitmap r0 = r0.n
            r7 = r0
            r0 = r4
            java.lang.String r0 = r0.y
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailOpenTellerActivity.zoomQRCode():void");
    }
}
