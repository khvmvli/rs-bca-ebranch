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
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.QRCodeDialog;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileOutputStream;
import o.CC23AFormKartuKreditFragment;
import o.LogRedirector;
import o.clickedTvFinger;
import o.consumeDisplayCutout;
import o.equals;
import o.getPromotion;
import o.setCardSlogan;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OpenCCSuccessActivity.class */
public class OpenCCSuccessActivity extends BaseActivityPostLogin {
    private static int r;
    private static int x;
    private Bitmap f;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297978)
    ListView lvNotes;
    private QRCodeDialog n;
    private boolean q;
    @BindString(2131822092)
    String retry;
    private String s;
    @BindView(2131299467)
    TextView tvNoReferensi;
    private static char[] p = {13806, 13802, 13810, 13815, 13822, 13804, 13800, 13816, 13823, 13811, 13748, 13801, 13813, 13817, 13819, 13812};
    private static char t = (char) 4;

    private static void a(byte b, char[] cArr, int i, Object[] objArr) {
        int i2;
        String str;
        synchronized (CC23AFormKartuKreditFragment.i) {
            char[] cArr2 = p;
            char c = t;
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

    public static void b(LogRedirector.Logger logger) {
        r = (x + 23) % Property.TYPE_ARRAY;
        logger.a();
        x = (r + 23) % Property.TYPE_ARRAY;
    }

    private static Bitmap c(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        r = (x + 39) % Property.TYPE_ARRAY;
        return createBitmap;
    }

    private void c(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("eBranch");
        sb.append(System.currentTimeMillis());
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
            if (!(!file2.exists())) {
                file2.delete();
                x = (r + 63) % Property.TYPE_ARRAY;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                x = (r + 89) % Property.TYPE_ARRAY;
            } catch (Exception e) {
                Log.i("EBRANCH", String.valueOf(e));
            }
            Object[] objArr = new Object[1];
            a((byte) (getPackageName().codePointAt(15) - 20), new char[]{14, '\r', 2, 11, 5, 15, 2, 14, 15, 7, 2, '\n', 3, 4, '\n', 2, '\f', 14, 6, 14, 2, 5, '\r', 4, '\b', 5, '\n', 4}, View.MeasureSpec.makeMeasureSpec(0, 0) + 28, objArr);
            uri = equals.d(this, ((String) objArr[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
        r = (x + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
    }

    private void d(Bitmap bitmap) {
        Uri uri;
        StringBuilder sb = new StringBuilder("qr_");
        sb.append(this.s);
        sb.append(".jpg");
        String obj = sb.toString();
        if (Build.VERSION.SDK_INT >= 29) {
            int i = r + 89;
            x = i % Property.TYPE_ARRAY;
            if ((i % 2 == 0 ? '3' : 24) != '3') {
                uri = getPromotion.c(this, bitmap, obj);
                MediaScannerConnection.scanFile(this, new String[]{uri.getPath()}, new String[]{"image/jpeg"}, null);
            } else {
                uri = getPromotion.c(this, bitmap, obj);
                String[] strArr = new String[0];
                strArr[0] = uri.getPath();
                MediaScannerConnection.scanFile(this, strArr, new String[]{"image/jpeg"}, null);
            }
        } else {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/eBranch");
            File file = new File(sb2.toString());
            file.mkdirs();
            File file2 = new File(file, obj);
            if ((file2.exists() ? '\"' : 25) == '\"') {
                int i2 = r + 75;
                x = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 == 0) {
                    file2.delete();
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    file2.delete();
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
            Object[] objArr2 = new Object[1];
            a((byte) (getResources().getString(2131822451).substring(0, 4).length() + 73), new char[]{14, '\r', 2, 11, 5, 15, 2, 14, 15, 7, 2, '\n', 3, 4, '\n', 2, '\f', 14, 6, 14, 2, 5, '\r', 4, '\b', 5, '\n', 4}, getResources().getString(2131822451).substring(0, 4).codePointAt(2) - 8, objArr2);
            uri = equals.d(this, ((String) objArr2[0]).intern(), file2);
            MediaScannerConnection.scanFile(this, new String[]{file2.getPath()}, new String[]{"image/jpeg"}, null);
        }
        x();
        if (this.q) {
            consumeDisplayCutout.read.e(this).c((CharSequence) "Share image").b(uri).d("image/*").b();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", "QR Code berhasil disimpan.");
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        QRCodeDialog qRCodeDialog = this.n;
        if (qRCodeDialog != null) {
            int i3 = r + 3;
            x = i3 % Property.TYPE_ARRAY;
            char c = i3 % 2 == 0 ? 'Z' : 14;
            qRCodeDialog.dismiss();
            if (c == 'Z') {
                Object[] objArr3 = null;
                int length2 = objArr3.length;
            }
            x = (r + 91) % Property.TYPE_ARRAY;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        this.s = extras.getString("no_reff");
        String[] stringArray = extras.getStringArray("notes");
        this.tvNoReferensi.setText(this.s);
        Bitmap a = getPromotion.a(this.tvNoReferensi.getText().toString(), this);
        this.f = a;
        this.ivQrCode.setImageBitmap(a);
        this.lvNotes.setAdapter((ListAdapter) new ArrayAdapter(this, 2131493323, 2131299502, stringArray));
        r = (x + 65) % Property.TYPE_ARRAY;
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        r = (x + 61) % Property.TYPE_ARRAY;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = x + 15;
        r = i % Property.TYPE_ARRAY;
        boolean z = false;
        if (i % 2 != 0) {
            menuItem.getItemId();
            throw new NullPointerException();
        }
        if (menuItem.getItemId() != 16908332) {
            boolean onOptionsItemSelected = onOptionsItemSelected(menuItem);
            int i2 = x + 21;
            r = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (z) {
                return onOptionsItemSelected;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return onOptionsItemSelected;
        }
        onBackPressed();
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            x = (r + 81) % Property.TYPE_ARRAY;
            onRequestPermissionsResult(i, strArr, iArr);
            clickedTvFinger.a(this, i, iArr);
            r = (x + 41) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        r = (x + 17) % Property.TYPE_ARRAY;
        setCardSlogan.e().b = "OpenCCSuccessActivity";
        this.j = "OpenCCSuccessActivity";
        int i = x + 7;
        r = i % Property.TYPE_ARRAY;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        x = (r + 21) % Property.TYPE_ARRAY;
        r = (x + 17) % Property.TYPE_ARRAY;
        return 2131492970;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        try {
            try {
                r = (x + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
                int i = x + 53;
                r = i % Property.TYPE_ARRAY;
                if (!(i % 2 != 0)) {
                    return this;
                }
                throw new NullPointerException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void s() {
        r = (x + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
        d(this.f);
        int i = r + 71;
        x = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 'a' : 'X') != 'X') {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 33 ? 'Y' : ',') != ',') goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 112) != false) goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        r0 = com.bca.smartbranch.activity.OpenCCSuccessActivity.x + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
        com.bca.smartbranch.activity.OpenCCSuccessActivity.r = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if ((r0 % 2) == 0) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
        o.clickedTvFinger.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
        com.bca.smartbranch.activity.OpenCCSuccessActivity.r = (com.bca.smartbranch.activity.OpenCCSuccessActivity.x + 99) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        throw r4;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH r4) {
        /*
            r3 = this;
            int r0 = com.bca.smartbranch.activity.OpenCCSuccessActivity.x
            r1 = 95
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.OpenCCSuccessActivity.r = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001b
            r0 = 7
            r5 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 62
            r5 = r0
        L_0x001e:
            r0 = r5
            r1 = 7
            if (r0 == r1) goto L_0x004c
            r0 = r3
            r1 = r4
            boolean r1 = r1.c     // Catch: Exception -> 0x0048
            r0.q = r1     // Catch: Exception -> 0x0048
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0048
            r5 = r0
            r0 = r5
            r1 = 33
            if (r0 < r1) goto L_0x003c
            r0 = 89
            r5 = r0
            goto L_0x003f
        L_0x003c:
            r0 = 44
            r5 = r0
        L_0x003f:
            r0 = r5
            r1 = 44
            if (r0 == r1) goto L_0x0092
            goto L_0x0067
        L_0x0048:
            r4 = move-exception
            goto L_0x0090
        L_0x004c:
            r0 = r3
            r1 = r4
            boolean r1 = r1.c
            r0.q = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 112(0x70, float:1.57E-43)
            if (r0 < r1) goto L_0x0061
            r0 = 1
            r5 = r0
            goto L_0x0063
        L_0x0061:
            r0 = 0
            r5 = r0
        L_0x0063:
            r0 = r5
            if (r0 == 0) goto L_0x0092
        L_0x0067:
            int r0 = com.bca.smartbranch.activity.OpenCCSuccessActivity.x
            r1 = 105(0x69, float:1.47E-43)
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.OpenCCSuccessActivity.r = r0
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x008b
            r0 = r3
            r0.s()
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x0088
            r1 = r0
            r1.<init>()     // Catch: all -> 0x0088
            throw r0     // Catch: all -> 0x0088
        L_0x0088:
            r4 = move-exception
            r0 = r4
            throw r0
        L_0x008b:
            r0 = r3
            r0.s()     // Catch: Exception -> 0x0048
            return
        L_0x0090:
            r0 = r4
            throw r0
        L_0x0092:
            r0 = r3
            o.clickedTvFinger.a(r0)
            int r0 = com.bca.smartbranch.activity.OpenCCSuccessActivity.x     // Catch: Exception -> 0x00a6
            r1 = 99
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.bca.smartbranch.activity.OpenCCSuccessActivity.r = r0     // Catch: Exception -> 0x00a6
            return
        L_0x00a6:
            r4 = move-exception
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.OpenCCSuccessActivity.saveQRCode(o.BranchMapItemBNAdapter$BranchMapItemVH):void");
    }

    @OnClick({2131296447})
    public void selesai() {
        r = (x + 65) % Property.TYPE_ARRAY;
        try {
            onBackPressed();
            int i = r + 23;
            x = i % Property.TYPE_ARRAY;
            if (i % 2 == 0) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131296448})
    public void simpanGallery(View view) {
        try {
            try {
                r = (x + 67) % Property.TYPE_ARRAY;
                boolean z = false;
                if (Build.VERSION.SDK_INT < 33) {
                    clickedTvFinger.d(this);
                    return;
                }
                t();
                int i = x + 37;
                r = i % Property.TYPE_ARRAY;
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

    public final void t() {
        x = (r + 21) % Property.TYPE_ARRAY;
        c(c(this.llMain));
        try {
            r = (x + 113) % Property.TYPE_ARRAY;
        } catch (Exception e) {
            throw e;
        }
    }

    @OnClick({2131297409})
    public void zoomQRCode() {
        r = (x + 45) % Property.TYPE_ARRAY;
        if (this.n == null) {
            this.n = new QRCodeDialog();
            r = (x + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
        }
        QRCodeDialog qRCodeDialog = this.n;
        Bitmap bitmap = this.f;
        String charSequence = this.tvNoReferensi.getText().toString();
        qRCodeDialog.b = bitmap;
        qRCodeDialog.d = charSequence;
        this.n.show(l(), "QRCodeDialog");
    }
}
