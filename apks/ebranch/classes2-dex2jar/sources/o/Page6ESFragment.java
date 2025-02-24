package o;

import java.util.concurrent.Callable;
/* loaded from: classes2-dex2jar.jar:o/Page6ESFragment.class */
public final class Page6ESFragment {
    public static volatile Page6FLKTPFragment_ViewBinding<Callable<ivfotoDiri>, ivfotoDiri> c;

    public static <T, R> R c(Page6FLKTPFragment_ViewBinding<T, R> page6FLKTPFragment_ViewBinding, T t) {
        try {
            return page6FLKTPFragment_ViewBinding.d();
        } catch (Throwable th) {
            throw ubahDataRekening.d(th);
        }
    }

    public static ivfotoDiri e(Callable<ivfotoDiri> callable) {
        try {
            ivfotoDiri call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ubahDataRekening.d(th);
        }
    }
}
