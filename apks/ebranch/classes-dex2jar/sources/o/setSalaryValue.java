package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o.setResRW;
/* loaded from: classes-dex2jar.jar:o/setSalaryValue.class */
final class setSalaryValue implements setResRW.IconCompatParcelizer {
    @Override // o.setResRW.IconCompatParcelizer
    public final ScheduledExecutorService e() {
        getStatusKewarganegaraanPenerima.e();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
