package o;

import android.content.Context;
/* loaded from: classes-dex2jar.jar:o/realmSet$NegaraTujuanPenerima.class */
public final class realmSet$NegaraTujuanPenerima {
    private static write b = write.LEGACY;
    private static boolean d;
    private static final String e;

    /* loaded from: classes-dex2jar.jar:o/realmSet$NegaraTujuanPenerima$write.class */
    public enum write {
        LEGACY,
        LATEST
    }

    private realmSet$NegaraTujuanPenerima() {
    }

    public static int a(Context context) {
        int b2;
        synchronized (realmSet$NegaraTujuanPenerima.class) {
            try {
                b2 = b(context, null, null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:12|(2:14|(1:16)(2:17|18))|19|20|21|(9:23|(2:25|(1:27))|60|29|(1:31)|32|33|36|37)|28|60|29|(0)|32|33|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        android.util.Log.e(o.realmSet$NegaraTujuanPenerima.e, "Failed to retrieve renderer type or log initialization.", r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: RemoteException -> 0x00b4, all -> 0x010a, TryCatch #3 {RemoteException -> 0x00b4, blocks: (B:29:0x008f, B:31:0x0099, B:32:0x009f, B:32:0x009f, B:33:0x00a2), top: B:60:0x008f, outer: #1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static int b(android.content.Context r4, o.realmSet$NegaraTujuanPenerima.write r5, o.realmSet$NegaraBagianPenerimaCode r6) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$NegaraTujuanPenerima.b(android.content.Context, o.realmSet$NegaraTujuanPenerima$write, o.realmSet$NegaraBagianPenerimaCode):int");
    }
}
