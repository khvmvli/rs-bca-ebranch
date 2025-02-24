package o;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o.GetTxnTellerDetailResponse;
/* loaded from: classes-dex2jar.jar:o/setCategorySttDesc.class */
public final class setCategorySttDesc implements setCategorySttCode {
    private final AudioAttributesImplApi21Parcelizer a;
    private final onActivityStopped c;
    private final AudioAttributesImplApi21Parcelizer d;
    private final findFragmentByTag<GetTxnTellerDetailResponse.TxnDetail.Representative> e;

    public setCategorySttDesc(onActivityStopped onactivitystopped) {
        this.c = onactivitystopped;
        this.e = new findFragmentByTag<GetTxnTellerDetailResponse.TxnDetail.Representative>(onactivitystopped) { // from class: o.setCategorySttDesc.2
            @Override // o.AudioAttributesImplApi21Parcelizer
            public final String b() {
                return "INSERT OR ABORT INTO `throwables` (`id`,`tag`,`date`,`clazz`,`message`,`content`) VALUES (?,?,?,?,?,?)";
            }
        };
        this.a = new AudioAttributesImplApi21Parcelizer(onactivitystopped) { // from class: o.setCategorySttDesc.4
            @Override // o.AudioAttributesImplApi21Parcelizer
            public final String b() {
                return "DELETE FROM throwables";
            }
        };
        this.d = new AudioAttributesImplApi21Parcelizer(onactivitystopped) { // from class: o.setCategorySttDesc.5
            @Override // o.AudioAttributesImplApi21Parcelizer
            public final String b() {
                return "DELETE FROM throwables WHERE date <= ?";
            }
        };
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // o.setCategorySttCode
    public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable>> c() {
        final AudioAttributesCompat b = AudioAttributesCompat.b("SELECT id,tag,date,clazz,message FROM throwables ORDER BY date DESC", 0);
        return this.c.i.e(new String[]{"throwables"}, false, new Callable<List<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable>>() { // from class: o.setCategorySttDesc.1
            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public List<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable> call() throws Exception {
                Cursor c = setCategorySttDesc.this.c.c(b, (CancellationSignal) null);
                try {
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        arrayList.add(new GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable(c.isNull(0) ? null : Long.valueOf(c.getLong(0)), c.isNull(1) ? null : c.getString(1), c.isNull(2) ? null : Long.valueOf(c.getLong(2)), c.isNull(3) ? null : c.getString(3), c.isNull(4) ? null : c.getString(4)));
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

    @Override // o.setCategorySttCode
    public final Object d(ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
        return FragmentContainerView.d(this.c, true, new Callable<onCLickStatusNpwp>() { // from class: o.setCategorySttDesc.3
            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public onCLickStatusNpwp call() throws Exception {
                Recreator c = setCategorySttDesc.this.a.c();
                setCategorySttDesc.this.c.b();
                try {
                    c.c();
                    setCategorySttDesc.this.c.g.e().g();
                    return onCLickStatusNpwp.e;
                } finally {
                    onActivityStopped onactivitystopped = setCategorySttDesc.this.c;
                    setUserVisibleHint setuservisiblehint = onactivitystopped.e;
                    if (setuservisiblehint == null) {
                        onactivitystopped.e();
                    } else {
                        setuservisiblehint.a(new SingleGeneratedAdapterObserver(onactivitystopped));
                    }
                    AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = setCategorySttDesc.this.a;
                    if (c == audioAttributesImplApi21Parcelizer.d) {
                        audioAttributesImplApi21Parcelizer.a.set(false);
                    }
                }
            }
        }, prosesTarikanFragment);
    }

    @Override // o.setCategorySttCode
    public final LiveData<GetTxnTellerDetailResponse.TxnDetail.Representative> e(long j) {
        final AudioAttributesCompat b = AudioAttributesCompat.b("SELECT * FROM throwables WHERE id = ?", 1);
        b.a[1] = 2;
        b.j[1] = j;
        return this.c.i.e(new String[]{"throwables"}, false, new Callable<GetTxnTellerDetailResponse.TxnDetail.Representative>() { // from class: o.setCategorySttDesc.9
            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public GetTxnTellerDetailResponse.TxnDetail.Representative call() throws Exception {
                GetTxnTellerDetailResponse.TxnDetail.Representative representative = null;
                String str = null;
                Cursor c = setCategorySttDesc.this.c.c(b, (CancellationSignal) null);
                try {
                    int a = setAccessibilityDelegateCompat.a(c, "id");
                    int a2 = setAccessibilityDelegateCompat.a(c, "tag");
                    int a3 = setAccessibilityDelegateCompat.a(c, "date");
                    int a4 = setAccessibilityDelegateCompat.a(c, "clazz");
                    int a5 = setAccessibilityDelegateCompat.a(c, "message");
                    int a6 = setAccessibilityDelegateCompat.a(c, "content");
                    if (c.moveToFirst()) {
                        Long valueOf = c.isNull(a) ? null : Long.valueOf(c.getLong(a));
                        String string = c.isNull(a2) ? null : c.getString(a2);
                        Long valueOf2 = c.isNull(a3) ? null : Long.valueOf(c.getLong(a3));
                        String string2 = c.isNull(a4) ? null : c.getString(a4);
                        String string3 = c.isNull(a5) ? null : c.getString(a5);
                        if (!c.isNull(a6)) {
                            str = c.getString(a6);
                        }
                        representative = new GetTxnTellerDetailResponse.TxnDetail.Representative(valueOf, string, valueOf2, string2, string3, str);
                    }
                    return representative;
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
}
