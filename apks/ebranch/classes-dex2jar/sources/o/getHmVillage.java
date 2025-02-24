package o;

import android.app.job.JobInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/getHmVillage.class */
public abstract class getHmVillage {

    /* loaded from: classes-dex2jar.jar:o/getHmVillage$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<read> e();
    }

    /* loaded from: classes-dex2jar.jar:o/getHmVillage$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public Map<getTxbDate, IconCompatParcelizer> c = new HashMap();
        public realmGet$businessField d;
    }

    /* loaded from: classes-dex2jar.jar:o/getHmVillage$read.class */
    public enum read {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    private static long a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((((j > 1 ? 1 : (j == 1 ? 0 : -1)) > 0 ? j : 2) == true ? 1 : 0) * ((long) i2)))));
    }

    private static void c(JobInfo.Builder builder, Set<read> set) {
        if (set.contains(read.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(read.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(read.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<getTxbDate, IconCompatParcelizer> a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract realmGet$businessField b();

    public final long d(getTxbDate gettxbdate, long j, int i) {
        long c = b().c();
        IconCompatParcelizer iconCompatParcelizer = a().get(gettxbdate);
        return Math.min(Math.max(a(i, iconCompatParcelizer.b()), j - c), iconCompatParcelizer.a());
    }

    public final JobInfo.Builder e(JobInfo.Builder builder, getTxbDate gettxbdate, long j, int i) {
        builder.setMinimumLatency(d(gettxbdate, j, i));
        c(builder, a().get(gettxbdate).e());
        return builder;
    }
}
