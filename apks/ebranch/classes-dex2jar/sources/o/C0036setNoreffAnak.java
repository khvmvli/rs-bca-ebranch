package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import o.getCategoryCd;
import o.setProductTypeName;
import o.setTotalPayment;
/* renamed from: o.setNoreffAnak  reason: case insensitive filesystem */
/* loaded from: classes-dex2jar.jar:o/setNoreffAnak.class */
public final class C0036setNoreffAnak implements setProductTypeName {
    private final long a;
    private final File b;
    private getCategoryCd c;
    private final setTotalPayment d = new setTotalPayment();
    private final DetailTransactionResponse$ValueTxnSubDataDetail$$Parcelable e = new DetailTransactionResponse$ValueTxnSubDataDetail$$Parcelable();

    @Deprecated
    private C0036setNoreffAnak(File file, long j) {
        this.b = file;
        this.a = j;
    }

    public static setProductTypeName a(File file, long j) {
        return new C0036setNoreffAnak(file, j);
    }

    private getCategoryCd d() throws IOException {
        getCategoryCd getcategorycd;
        synchronized (this) {
            if (this.c == null) {
                this.c = getCategoryCd.e(this.b, 1, 1, this.a);
            }
            getcategorycd = this.c;
        }
        return getcategorycd;
    }

    /* JADX WARN: Finally extract failed */
    @Override // o.setProductTypeName
    public final void a(setCode setcode, setProductTypeName.write write) {
        setTotalPayment.read read;
        String c = this.e.c(setcode);
        setTotalPayment settotalpayment = this.d;
        synchronized (settotalpayment) {
            setTotalPayment.read read2 = settotalpayment.e.get(c);
            read = read2;
            if (read2 == null) {
                read = settotalpayment.c.c();
                settotalpayment.e.put(c, read);
            }
            read.c++;
        }
        read.b.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder("Put: Obtained: ");
                sb.append(c);
                sb.append(" for for Key: ");
                sb.append(setcode);
                Log.v("DiskLruCacheWrapper", sb.toString());
            }
            try {
                getCategoryCd d = d();
                if (d.c(c) == null) {
                    getCategoryCd.write a = d.a(c, -1);
                    if (a != null) {
                        try {
                            if (write.b(a.b(0))) {
                                a.a();
                            }
                            a.e();
                        } catch (Throwable th) {
                            a.e();
                            throw th;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Had two simultaneous puts for: ");
                        sb2.append(c);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.c(c);
        }
    }

    @Override // o.setProductTypeName
    public final File e(setCode setcode) {
        File file;
        String c = this.e.c(setcode);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder("Get: Obtained: ");
            sb.append(c);
            sb.append(" for for Key: ");
            sb.append(setcode);
            Log.v("DiskLruCacheWrapper", sb.toString());
        }
        try {
            getCategoryCd$MediaBrowserCompat$CustomActionResultReceiver c2 = d().c(c);
            file = null;
            if (c2 != null) {
                file = c2.e[0];
            }
        } catch (IOException e) {
            file = null;
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
                file = null;
            }
        }
        return file;
    }
}
