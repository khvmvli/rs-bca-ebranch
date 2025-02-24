package o;

import java.util.concurrent.ScheduledExecutorService;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/setResRW.class */
public class setResRW {
    private static IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:o/setResRW$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        @Deprecated
        ScheduledExecutorService e();
    }

    private setResRW() {
    }

    @Deprecated
    public static IconCompatParcelizer c() {
        IconCompatParcelizer iconCompatParcelizer;
        synchronized (setResRW.class) {
            try {
                if (e == null) {
                    e = new setSalaryValue();
                }
                iconCompatParcelizer = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iconCompatParcelizer;
    }
}
