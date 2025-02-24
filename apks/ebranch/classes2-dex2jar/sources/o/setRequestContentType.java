package o;

import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:o/setRequestContentType.class */
public final class setRequestContentType {
    public static final int a;
    public static final int c;
    public static final long e;
    public static setProtocol f;
    public static final long d = getResponseTlsVersion.c("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final int b = getResponseSizeString$com_github_ChuckerTeam_Chucker_library.e("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);

    static {
        int e2 = getStatus$com_github_ChuckerTeam_Chucker_library.e();
        if (e2 < 2) {
            e2 = 2;
        }
        int e3 = getResponseSizeString$com_github_ChuckerTeam_Chucker_library.e("kotlinx.coroutines.scheduler.core.pool.size", e2, 1, 0, 8, null);
        c = e3;
        a = getResponseSizeString$com_github_ChuckerTeam_Chucker_library.e("kotlinx.coroutines.scheduler.max.pool.size", DataModule.e(getStatus$com_github_ChuckerTeam_Chucker_library.e() << 7, e3, 2097150), 0, 2097150, 4, null);
        e = TimeUnit.SECONDS.toNanos(getResponseTlsVersion.c("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
        f = setId$com_github_ChuckerTeam_Chucker_library.b;
    }
}
