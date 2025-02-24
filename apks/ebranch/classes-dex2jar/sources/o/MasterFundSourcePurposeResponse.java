package o;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o.requireParentFragment;
import o.setRecyclerListener;
/* loaded from: classes-dex2jar.jar:o/MasterFundSourcePurposeResponse.class */
public final class MasterFundSourcePurposeResponse implements getFundSource {
    private final onActivityStopped a;
    private final AudioAttributesImplApi21Parcelizer b;
    private final findFragmentByTag<HttpTransaction> c;
    private final AudioAttributesImplApi21Parcelizer d;
    private final setLayoutTransition<HttpTransaction> e;

    /* loaded from: classes-dex2jar.jar:o/MasterFundSourcePurposeResponse$Category.class */
    public final /* synthetic */ class Category implements requireParentFragment.IconCompatParcelizer {
        public final /* synthetic */ int e;

        public /* synthetic */ Category(int i) {
            this.e = i;
        }

        @Override // o.requireParentFragment.IconCompatParcelizer
        public final boolean c(int i, float[] fArr) {
            int i2 = this.e;
            return subscribeReservationRescheduleEvent.e(fArr, "");
        }
    }

    public MasterFundSourcePurposeResponse(onActivityStopped onactivitystopped) {
        this.a = onactivitystopped;
        this.c = new findFragmentByTag<HttpTransaction>(onactivitystopped) { // from class: o.MasterFundSourcePurposeResponse.4
            @Override // o.AudioAttributesImplApi21Parcelizer
            public final String b() {
                return "INSERT OR ABORT INTO `transactions` (`id`,`requestDate`,`responseDate`,`tookMs`,`protocol`,`method`,`url`,`host`,`path`,`scheme`,`responseTlsVersion`,`responseCipherSuite`,`requestPayloadSize`,`requestContentType`,`requestHeaders`,`requestBody`,`isRequestBodyPlainText`,`responseCode`,`responseMessage`,`error`,`responsePayloadSize`,`responseContentType`,`responseHeaders`,`responseBody`,`isResponseBodyPlainText`,`responseImageData`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.e = new setLayoutTransition<HttpTransaction>(onactivitystopped) { // from class: o.MasterFundSourcePurposeResponse.3
            @Override // o.setLayoutTransition, o.AudioAttributesImplApi21Parcelizer
            public final String b() {
                return "UPDATE OR REPLACE `transactions` SET `id` = ?,`requestDate` = ?,`responseDate` = ?,`tookMs` = ?,`protocol` = ?,`method` = ?,`url` = ?,`host` = ?,`path` = ?,`scheme` = ?,`responseTlsVersion` = ?,`responseCipherSuite` = ?,`requestPayloadSize` = ?,`requestContentType` = ?,`requestHeaders` = ?,`requestBody` = ?,`isRequestBodyPlainText` = ?,`responseCode` = ?,`responseMessage` = ?,`error` = ?,`responsePayloadSize` = ?,`responseContentType` = ?,`responseHeaders` = ?,`responseBody` = ?,`isResponseBodyPlainText` = ?,`responseImageData` = ? WHERE `id` = ?";
            }
        };
        this.d = new AudioAttributesImplApi21Parcelizer(onactivitystopped) { // from class: o.MasterFundSourcePurposeResponse.1
            @Override // o.AudioAttributesImplApi21Parcelizer
            public final String b() {
                return "DELETE FROM transactions";
            }
        };
        this.b = new AudioAttributesImplApi21Parcelizer(onactivitystopped) { // from class: o.MasterFundSourcePurposeResponse.6
            @Override // o.AudioAttributesImplApi21Parcelizer
            public final String b() {
                return "DELETE FROM transactions WHERE requestDate <= ?";
            }
        };
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // o.getFundSource
    public final Object a(ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
        return FragmentContainerView.d(this.a, true, new Callable<onCLickStatusNpwp>() { // from class: o.MasterFundSourcePurposeResponse.7
            /* renamed from: e */
            public onCLickStatusNpwp call() throws Exception {
                Recreator c = MasterFundSourcePurposeResponse.this.d.c();
                MasterFundSourcePurposeResponse.this.a.b();
                try {
                    c.c();
                    MasterFundSourcePurposeResponse.this.a.g.e().g();
                    return onCLickStatusNpwp.e;
                } finally {
                    onActivityStopped onactivitystopped = MasterFundSourcePurposeResponse.this.a;
                    setUserVisibleHint setuservisiblehint = onactivitystopped.e;
                    if (setuservisiblehint == null) {
                        onactivitystopped.e();
                    } else {
                        setuservisiblehint.a(new SingleGeneratedAdapterObserver(onactivitystopped));
                    }
                    AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = MasterFundSourcePurposeResponse.this.d;
                    if (c == audioAttributesImplApi21Parcelizer.d) {
                        audioAttributesImplApi21Parcelizer.a.set(false);
                    }
                }
            }
        }, prosesTarikanFragment);
    }

    @Override // o.getFundSource
    public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> c() {
        final AudioAttributesCompat b = AudioAttributesCompat.b("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error FROM transactions ORDER BY requestDate DESC", 0);
        return this.a.i.e(new String[]{"transactions"}, false, new Callable<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>>() { // from class: o.MasterFundSourcePurposeResponse.9
            /* renamed from: c */
            public List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable> call() throws Exception {
                Cursor c = MasterFundSourcePurposeResponse.this.a.c(b, (CancellationSignal) null);
                try {
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        arrayList.add(new GetTxnTellerDetailResponse$TxnDetail$$Parcelable(c.getLong(0), c.isNull(1) ? null : Long.valueOf(c.getLong(1)), c.isNull(2) ? null : Long.valueOf(c.getLong(2)), c.isNull(3) ? null : c.getString(3), c.isNull(4) ? null : c.getString(4), c.isNull(5) ? null : c.getString(5), c.isNull(6) ? null : c.getString(6), c.isNull(7) ? null : c.getString(7), c.isNull(8) ? null : Integer.valueOf(c.getInt(8)), c.isNull(9) ? null : Long.valueOf(c.getLong(9)), c.isNull(10) ? null : Long.valueOf(c.getLong(10)), c.isNull(11) ? null : c.getString(11)));
                    }
                    return arrayList;
                } finally {
                    c.close();
                }
            }

            @Override // java.lang.Object
            protected final void finalize() {
                b.c();
            }
        });
    }

    @Override // o.getFundSource
    public final LiveData<HttpTransaction> d(long j) {
        final AudioAttributesCompat b = AudioAttributesCompat.b("SELECT * FROM transactions WHERE id = ?", 1);
        b.a[1] = 2;
        b.j[1] = j;
        return this.a.i.e(new String[]{"transactions"}, false, new Callable<HttpTransaction>() { // from class: o.MasterFundSourcePurposeResponse.5
            /* renamed from: d */
            public HttpTransaction call() throws Exception {
                HttpTransaction httpTransaction;
                Cursor c = MasterFundSourcePurposeResponse.this.a.c(b, (CancellationSignal) null);
                try {
                    int a = setAccessibilityDelegateCompat.a(c, "id");
                    int a2 = setAccessibilityDelegateCompat.a(c, "requestDate");
                    int a3 = setAccessibilityDelegateCompat.a(c, "responseDate");
                    int a4 = setAccessibilityDelegateCompat.a(c, "tookMs");
                    int a5 = setAccessibilityDelegateCompat.a(c, "protocol");
                    int a6 = setAccessibilityDelegateCompat.a(c, "method");
                    int a7 = setAccessibilityDelegateCompat.a(c, "url");
                    int a8 = setAccessibilityDelegateCompat.a(c, "host");
                    int a9 = setAccessibilityDelegateCompat.a(c, "path");
                    int a10 = setAccessibilityDelegateCompat.a(c, "scheme");
                    int a11 = setAccessibilityDelegateCompat.a(c, "responseTlsVersion");
                    int a12 = setAccessibilityDelegateCompat.a(c, "responseCipherSuite");
                    int a13 = setAccessibilityDelegateCompat.a(c, "requestPayloadSize");
                    int a14 = setAccessibilityDelegateCompat.a(c, "requestContentType");
                    int a15 = setAccessibilityDelegateCompat.a(c, "requestHeaders");
                    int a16 = setAccessibilityDelegateCompat.a(c, "requestBody");
                    int a17 = setAccessibilityDelegateCompat.a(c, "isRequestBodyPlainText");
                    int a18 = setAccessibilityDelegateCompat.a(c, "responseCode");
                    int a19 = setAccessibilityDelegateCompat.a(c, "responseMessage");
                    int a20 = setAccessibilityDelegateCompat.a(c, "error");
                    int a21 = setAccessibilityDelegateCompat.a(c, "responsePayloadSize");
                    int a22 = setAccessibilityDelegateCompat.a(c, "responseContentType");
                    int a23 = setAccessibilityDelegateCompat.a(c, "responseHeaders");
                    int a24 = setAccessibilityDelegateCompat.a(c, "responseBody");
                    int a25 = setAccessibilityDelegateCompat.a(c, "isResponseBodyPlainText");
                    int a26 = setAccessibilityDelegateCompat.a(c, "responseImageData");
                    if (c.moveToFirst()) {
                        httpTransaction = new HttpTransaction(c.getLong(a), c.isNull(a2) ? null : Long.valueOf(c.getLong(a2)), c.isNull(a3) ? null : Long.valueOf(c.getLong(a3)), c.isNull(a4) ? null : Long.valueOf(c.getLong(a4)), c.isNull(a5) ? null : c.getString(a5), c.isNull(a6) ? null : c.getString(a6), c.isNull(a7) ? null : c.getString(a7), c.isNull(a8) ? null : c.getString(a8), c.isNull(a9) ? null : c.getString(a9), c.isNull(a10) ? null : c.getString(a10), c.isNull(a11) ? null : c.getString(a11), c.isNull(a12) ? null : c.getString(a12), c.isNull(a13) ? null : Long.valueOf(c.getLong(a13)), c.isNull(a14) ? null : c.getString(a14), c.isNull(a15) ? null : c.getString(a15), c.isNull(a16) ? null : c.getString(a16), c.getInt(a17) != 0, c.isNull(a18) ? null : Integer.valueOf(c.getInt(a18)), c.isNull(a19) ? null : c.getString(a19), c.isNull(a20) ? null : c.getString(a20), c.isNull(a21) ? null : Long.valueOf(c.getLong(a21)), c.isNull(a22) ? null : c.getString(a22), c.isNull(a23) ? null : c.getString(a23), c.isNull(a24) ? null : c.getString(a24), c.getInt(a25) != 0, c.isNull(a26) ? null : c.getBlob(a26));
                    } else {
                        httpTransaction = null;
                    }
                    return httpTransaction;
                } finally {
                    c.close();
                }
            }

            @Override // java.lang.Object
            protected final void finalize() {
                b.c();
            }
        });
    }

    @Override // o.getFundSource
    public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> d(String str, String str2) {
        final AudioAttributesCompat b = AudioAttributesCompat.b("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error FROM transactions WHERE responseCode LIKE ? AND path LIKE ? ORDER BY requestDate DESC", 2);
        if (str == null) {
            b.a[1] = 1;
        } else {
            b.a[1] = 4;
            b.i[1] = str;
        }
        if (str2 == null) {
            b.a[2] = 1;
        } else {
            b.a[2] = 4;
            b.i[2] = str2;
        }
        return this.a.i.e(new String[]{"transactions"}, false, new Callable<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>>() { // from class: o.MasterFundSourcePurposeResponse.8
            /* renamed from: b */
            public List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable> call() throws Exception {
                Cursor c = MasterFundSourcePurposeResponse.this.a.c(b, (CancellationSignal) null);
                try {
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        arrayList.add(new GetTxnTellerDetailResponse$TxnDetail$$Parcelable(c.getLong(0), c.isNull(1) ? null : Long.valueOf(c.getLong(1)), c.isNull(2) ? null : Long.valueOf(c.getLong(2)), c.isNull(3) ? null : c.getString(3), c.isNull(4) ? null : c.getString(4), c.isNull(5) ? null : c.getString(5), c.isNull(6) ? null : c.getString(6), c.isNull(7) ? null : c.getString(7), c.isNull(8) ? null : Integer.valueOf(c.getInt(8)), c.isNull(9) ? null : Long.valueOf(c.getLong(9)), c.isNull(10) ? null : Long.valueOf(c.getLong(10)), c.isNull(11) ? null : c.getString(11)));
                    }
                    return arrayList;
                } finally {
                    c.close();
                }
            }

            @Override // java.lang.Object
            protected final void finalize() {
                b.c();
            }
        });
    }

    @Override // o.getFundSource
    public final Object e(ProsesTarikanFragment<? super List<HttpTransaction>> prosesTarikanFragment) {
        final AudioAttributesCompat b = AudioAttributesCompat.b("SELECT * FROM transactions", 0);
        return FragmentContainerView.a(this.a, false, setRecyclerListener.write.e(), new Callable<List<HttpTransaction>>() { // from class: o.MasterFundSourcePurposeResponse.2
            /* renamed from: b */
            public List<HttpTransaction> call() throws Exception {
                Throwable th;
                int a;
                int a2;
                int a3;
                int a4;
                int a5;
                int a6;
                int a7;
                int a8;
                int a9;
                int a10;
                int a11;
                int a12;
                int a13;
                int a14;
                Cursor c = MasterFundSourcePurposeResponse.this.a.c(b, (CancellationSignal) null);
                try {
                    a = setAccessibilityDelegateCompat.a(c, "id");
                    a2 = setAccessibilityDelegateCompat.a(c, "requestDate");
                    a3 = setAccessibilityDelegateCompat.a(c, "responseDate");
                    a4 = setAccessibilityDelegateCompat.a(c, "tookMs");
                    a5 = setAccessibilityDelegateCompat.a(c, "protocol");
                    a6 = setAccessibilityDelegateCompat.a(c, "method");
                    a7 = setAccessibilityDelegateCompat.a(c, "url");
                    a8 = setAccessibilityDelegateCompat.a(c, "host");
                    a9 = setAccessibilityDelegateCompat.a(c, "path");
                    a10 = setAccessibilityDelegateCompat.a(c, "scheme");
                    a11 = setAccessibilityDelegateCompat.a(c, "responseTlsVersion");
                    a12 = setAccessibilityDelegateCompat.a(c, "responseCipherSuite");
                    a13 = setAccessibilityDelegateCompat.a(c, "requestPayloadSize");
                    a14 = setAccessibilityDelegateCompat.a(c, "requestContentType");
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    int a15 = setAccessibilityDelegateCompat.a(c, "requestHeaders");
                    int a16 = setAccessibilityDelegateCompat.a(c, "requestBody");
                    int a17 = setAccessibilityDelegateCompat.a(c, "isRequestBodyPlainText");
                    int a18 = setAccessibilityDelegateCompat.a(c, "responseCode");
                    int a19 = setAccessibilityDelegateCompat.a(c, "responseMessage");
                    int a20 = setAccessibilityDelegateCompat.a(c, "error");
                    int a21 = setAccessibilityDelegateCompat.a(c, "responsePayloadSize");
                    int a22 = setAccessibilityDelegateCompat.a(c, "responseContentType");
                    int a23 = setAccessibilityDelegateCompat.a(c, "responseHeaders");
                    int a24 = setAccessibilityDelegateCompat.a(c, "responseBody");
                    int a25 = setAccessibilityDelegateCompat.a(c, "isResponseBodyPlainText");
                    int a26 = setAccessibilityDelegateCompat.a(c, "responseImageData");
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        arrayList.add(new HttpTransaction(c.getLong(a), c.isNull(a2) ? null : Long.valueOf(c.getLong(a2)), c.isNull(a3) ? null : Long.valueOf(c.getLong(a3)), c.isNull(a4) ? null : Long.valueOf(c.getLong(a4)), c.isNull(a5) ? null : c.getString(a5), c.isNull(a6) ? null : c.getString(a6), c.isNull(a7) ? null : c.getString(a7), c.isNull(a8) ? null : c.getString(a8), c.isNull(a9) ? null : c.getString(a9), c.isNull(a10) ? null : c.getString(a10), c.isNull(a11) ? null : c.getString(a11), c.isNull(a12) ? null : c.getString(a12), c.isNull(a13) ? null : Long.valueOf(c.getLong(a13)), c.isNull(a14) ? null : c.getString(a14), c.isNull(a15) ? null : c.getString(a15), c.isNull(a16) ? null : c.getString(a16), c.getInt(a17) != 0, c.isNull(a18) ? null : Integer.valueOf(c.getInt(a18)), c.isNull(a19) ? null : c.getString(a19), c.isNull(a20) ? null : c.getString(a20), c.isNull(a21) ? null : Long.valueOf(c.getLong(a21)), c.isNull(a22) ? null : c.getString(a22), c.isNull(a23) ? null : c.getString(a23), c.isNull(a24) ? null : c.getString(a24), c.getInt(a25) != 0, c.isNull(a26) ? null : c.getBlob(a26)));
                    }
                    c.close();
                    b.c();
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                    c.close();
                    b.c();
                    throw th;
                }
            }
        }, prosesTarikanFragment);
    }
}
