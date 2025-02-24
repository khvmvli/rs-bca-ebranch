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
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.CreateReservationResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.CC23CFormKartuKreditFragment;
import o.DetailBerhasilEChannelActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogRedirector;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.equals;
import o.getAnnualFeeBasicAmount;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiSuccessEChannelActivity.class */
public class ReservasiSuccessEChannelActivity extends BaseActivityPostLogin implements SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private static long v;
    private static int x;
    private static int y;
    private setMessage f = new setMessage();
    @BindView(2131297355)
    ImageView ivDetail;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    private Bitmap n;
    @BindString(2131821358)
    String note;
    private QRCodeDialog p;
    private String q;
    private String r;
    @BindString(2131822092)
    String retry;
    private CreateReservationResponse s;
    @BindView(2131298420)
    ScrollView svMain;
    private SendEmailTransactionSuccessPresenter t;
    @BindView(2131298864)
    TextView tvBranchAddress;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131298925)
    TextView tvDescriptionKey;
    @BindView(2131298928)
    TextView tvDescriptionValue;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299554)
    TextView tvReservasiDate;
    @BindView(2131299615)
    TextView tvTitle;
    private boolean u;

    private static Bitmap a(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        int i = x + 51;
        y = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? ';' : 29) != ';') {
            return createBitmap;
        }
        throw new ArithmeticException("divide by zero");
    }

    private void a(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        String obj = sb.toString();
        char c = 29;
        if ((Build.VERSION.SDK_INT >= 29 ? '9' : '0') != '0') {
            y = (x + 45) % Property.TYPE_ARRAY;
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
                c = 'b';
            }
            if (c == 'b') {
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
            b(new char[]{6181, 12401, 6214, 21319, 27288, 7546, 2530, 58010, 44503, 53990, 17278, 22282, 29558, 43160, 38606, 39334, 14561, 32263, 10317, 49701, 52747, 13238, 25127, 13530, 37765, 35127, 46512, 30994, 22828, 24273, 53002, 41830}, View.MeasureSpec.getMode(0), objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        int i = x + 69;
        y = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? '`' : '[') == '`') {
            throw new ArithmeticException("divide by zero");
        }
    }

    private void b(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.q);
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
                file2.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                x = (y + 81) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            b(new char[]{6181, 12401, 6214, 21319, 27288, 7546, 2530, 58010, 44503, 53990, 17278, 22282, 29558, 43160, 38606, 39334, 14561, 32263, 10317, 49701, 52747, 13238, 25127, 13530, 37765, 35127, 46512, 30994, 22828, 24273, 53002, 41830}, ViewConfiguration.getLongPressTimeout() >> 16, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        } else {
            uri = getPromotion.c(this, bitmap, obj);
            MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if ((this.u ? 'N' : 'M') != 'N') {
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            QRCodeDialog qRCodeDialog = this.p;
            if ((qRCodeDialog != null ? '#' : 'Y') != 'Y') {
                qRCodeDialog.dismiss();
                return;
            }
            return;
        }
        x = (y + 27) % Property.TYPE_ARRAY;
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment.b) {
            char[] b = CC23CFormKartuKreditFragment.b(v, cArr, i);
            CC23CFormKartuKreditFragment.a = 4;
            while (CC23CFormKartuKreditFragment.a < b.length) {
                CC23CFormKartuKreditFragment.d = CC23CFormKartuKreditFragment.a - 4;
                b[CC23CFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (b[CC23CFormKartuKreditFragment.a] ^ b[CC23CFormKartuKreditFragment.a % 4])) ^ (((long) CC23CFormKartuKreditFragment.d) * v))));
                CC23CFormKartuKreditFragment.a++;
            }
            str = new String(b, 4, b.length - 4);
        }
        objArr[0] = str;
    }

    static /* synthetic */ SendEmailTransactionSuccessPresenter c(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity) {
        try {
            y = (x + 73) % Property.TYPE_ARRAY;
            SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = reservasiSuccessEChannelActivity.t;
            int i = x + 47;
            y = i % Property.TYPE_ARRAY;
            if (i % 2 != 0) {
                return sendEmailTransactionSuccessPresenter;
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void d(LogRedirector.Logger logger) {
        try {
            try {
                y = (x + 27) % Property.TYPE_ARRAY;
                logger.a();
                x = (y + 17) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ String e(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity) {
        String str;
        int i = x + 83;
        y = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            try {
                str = reservasiSuccessEChannelActivity.q;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = reservasiSuccessEChannelActivity.q;
        }
        return str;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        try {
            x = (y + 63) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReservasiSuccessEChannelActivity.c(ReservasiSuccessEChannelActivity.this).c(new LoginSessionActivity_ViewBinding(ReservasiSuccessEChannelActivity.this.m.getEmail(), ReservasiSuccessEChannelActivity.e(ReservasiSuccessEChannelActivity.this)));
            }
        }).g();
        x = (y + 61) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        int i = x + 73;
        y = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
            return;
        }
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
        throw new NullPointerException();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.t = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        this.s = (CreateReservationResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservasi"));
        this.r = extras.getString("type_reservation", "");
        if ((extras.getBoolean("from_form", false) ? 'b' : 29) != 29) {
            y = (x + 75) % Property.TYPE_ARRAY;
            this.tvTitle.setText(2131822033);
            y = (x + 45) % Property.TYPE_ARRAY;
        }
        this.tvNoReferensi.setText(extras.getString("reff_no", ""));
        this.tvNote.setText(Html.fromHtml(this.note));
        this.q = extras.getString("reff_no", "");
        this.tvDescriptionKey.setText(extras.getString("type_transaksi", ""));
        this.tvBranchName.setText(this.s.getBranchName());
        this.tvBranchAddress.setText(this.s.getBranchAddress());
        TextView textView = this.tvReservasiDate;
        StringBuilder sb = new StringBuilder();
        sb.append(this.s.getReservationTime());
        sb.append(" WIB - ");
        sb.append(getAnnualFeeBasicAmount.f(this.s.getReservationDate()));
        textView.setText(sb.toString());
        Bitmap a = getPromotion.a(this.tvNoReferensi.getText().toString(), this);
        this.n = a;
        this.ivQrCode.setImageBitmap(a);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        int i = y + 5;
        x = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? (char) 20 : '\n') == 20) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        x = (y + 29) % Property.TYPE_ARRAY;
        z();
        try {
            x = (y + 93) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        int i = x + 91;
        y = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        try {
            try {
                x = (y + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
                onDestroy();
                SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.t;
                Call<OpenAccountSuccessActivity<Object>> call = sendEmailTransactionSuccessPresenter.a;
                boolean z = false;
                if (!(call == null)) {
                    call.cancel();
                }
                sendEmailTransactionSuccessPresenter.b = null;
                int i = y + 51;
                x = i % Property.TYPE_ARRAY;
                if (i % 2 == 0) {
                    z = true;
                }
                if (!z) {
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

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = x + 53;
        y = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 == 0 ? '\"' : '`') != '\"') {
            onRequestPermissionsResult(i, strArr, iArr);
            DetailBerhasilEChannelActivity.e(this, i, iArr);
            return;
        }
        onRequestPermissionsResult(i, strArr, iArr);
        DetailBerhasilEChannelActivity.e(this, i, iArr);
        throw new ArithmeticException("divide by zero");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        int i = y + 11;
        x = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 'W' : 14) != 'W') {
            setCardSlogan.e().b = "ReservasiSuccessEChannelActivity";
            this.j = "ReservasiSuccessEChannelActivity";
        } else {
            setCardSlogan.e().b = "ReservasiSuccessEChannelActivity";
            this.j = "ReservasiSuccessEChannelActivity";
            Object[] objArr = null;
            int length = objArr.length;
        }
        y = (x + 75) % Property.TYPE_ARRAY;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        y = (x + 9) % Property.TYPE_ARRAY;
        x = (y + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
        return 2131492996;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        y = (x + 101) % Property.TYPE_ARRAY;
        int i = y + 115;
        x = i % Property.TYPE_ARRAY;
        if (!(i % 2 != 0)) {
            return this;
        }
        throw new ArithmeticException("divide by zero");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void saveQRCode(BranchMapItemBNAdapter$BranchMapItemVH branchMapItemBNAdapter$BranchMapItemVH) {
        try {
            y = (x + 3) % Property.TYPE_ARRAY;
            this.u = branchMapItemBNAdapter$BranchMapItemVH.c;
            try {
                if (Build.VERSION.SDK_INT < 33) {
                    DetailBerhasilEChannelActivity.e(this);
                    return;
                }
                y = (x + 9) % Property.TYPE_ARRAY;
                y();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @OnClick({2131296447})
    public void selesai(View view) {
        y = (x + 73) % Property.TYPE_ARRAY;
        onBackPressed();
        int i = y + 5;
        x = i % Property.TYPE_ARRAY;
        if ((i % 2 != 0 ? 14 : '3') == 14) {
            throw new NullPointerException();
        }
    }

    @OnClick({2131297650, 2131299268, 2131297355})
    public void showDetail() {
        try {
            y = (x + 93) % Property.TYPE_ARRAY;
            try {
                this.f.b(this.llDetail, this.ivDetail);
                int i = y + 33;
                x = i % Property.TYPE_ARRAY;
                if (i % 2 != 0) {
                    throw new ArithmeticException("divide by zero");
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
        intent.putExtra("txn_status", "7");
        startActivity(intent);
        int i = x + 111;
        y = i % Property.TYPE_ARRAY;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r5.llDetail.getVisibility() == 8) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if ((r5.llDetail.getVisibility() != 56) != true) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.x = (com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.y + o.setHasDecor$MediaBrowserCompat$MediaItem.aD) % io.realm.internal.Property.TYPE_ARRAY;
        r5.f.b(r5.llDetail, r5.ivDetail);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        z();
        new android.os.Handler().postDelayed(new com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.AnonymousClass5(), 500);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        r0 = com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.y + 41;
        com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.x = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if ((r0 % 2) == 0) goto L_0x00ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
        return;
     */
    @butterknife.OnClick({2131296448})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void simpanGallery(android.view.View r6) {
        /*
            r5 = this;
            int r0 = com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.y
            r1 = 97
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.x = r0
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 94
            r7 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 86
            r7 = r0
        L_0x001e:
            r0 = r7
            r1 = 94
            if (r0 == r1) goto L_0x003e
            r0 = r5
            android.widget.LinearLayout r0 = r0.llDetail     // Catch: Exception -> 0x003a
            r6 = r0
            r0 = r6
            int r0 = r0.getVisibility()     // Catch: Exception -> 0x0037
            r7 = r0
            r0 = r7
            r1 = 8
            if (r0 != r1) goto L_0x0074
            goto L_0x0056
        L_0x0037:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x003a:
            r6 = move-exception
            goto L_0x00af
        L_0x003e:
            r0 = r5
            android.widget.LinearLayout r0 = r0.llDetail
            int r0 = r0.getVisibility()
            r1 = 56
            if (r0 != r1) goto L_0x004f
            r0 = 0
            r7 = r0
            goto L_0x0051
        L_0x004f:
            r0 = 1
            r7 = r0
        L_0x0051:
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x0074
        L_0x0056:
            int r0 = com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.y
            r1 = 117(0x75, float:1.64E-43)
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.x = r0
            r0 = r5
            o.setMessage r0 = r0.f
            r1 = r5
            android.widget.LinearLayout r1 = r1.llDetail
            r2 = r5
            android.widget.ImageView r2 = r2.ivDetail
            r0.b(r1, r2)
        L_0x0074:
            r0 = r5
            r0.z()
            android.os.Handler r0 = new android.os.Handler
            r1 = r0
            r1.<init>()
            com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity$5 r1 = new com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity$5
            r2 = r1
            r3 = r5
            r2.<init>()
            r2 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r0.postDelayed(r1, r2)
            int r0 = com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.y     // Catch: Exception -> 0x003a
            r1 = 41
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.x = r0     // Catch: Exception -> 0x003a
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x00ae
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x00ab
            r1 = r0
            r1.<init>()     // Catch: all -> 0x00ab
            throw r0     // Catch: all -> 0x00ab
        L_0x00ab:
            r6 = move-exception
            r0 = r6
            throw r0
        L_0x00ae:
            return
        L_0x00af:
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity.simpanGallery(android.view.View):void");
    }

    public final void t() {
        x = (y + 95) % Property.TYPE_ARRAY;
        a(a(this.llMain));
        x = (y + 19) % Property.TYPE_ARRAY;
    }

    public final void y() {
        int i = x + 87;
        y = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'P' : 'I') != 'P') {
            b(this.n);
        } else {
            b(this.n);
            Object[] objArr = null;
            int length = objArr.length;
        }
        y = (x + 33) % Property.TYPE_ARRAY;
    }

    @OnClick({2131297409})
    public void zoomQRCode() {
        y = (x + 111) % Property.TYPE_ARRAY;
        try {
            if (this.p == null) {
                this.p = new QRCodeDialog();
            }
            QRCodeDialog qRCodeDialog = this.p;
            Bitmap bitmap = this.n;
            String charSequence = this.tvNoReferensi.getText().toString();
            qRCodeDialog.b = bitmap;
            qRCodeDialog.d = charSequence;
            this.p.show(l(), "QRCodeDialog");
            x = (y + 13) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }
}
