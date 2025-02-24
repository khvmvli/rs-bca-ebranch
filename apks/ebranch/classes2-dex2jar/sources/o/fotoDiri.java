package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
/* loaded from: classes2-dex2jar.jar:o/fotoDiri.class */
public final class fotoDiri {
    private static final ivfotoDiri d;

    /* loaded from: classes2-dex2jar.jar:o/fotoDiri$write.class */
    static final class write {
        static final ivfotoDiri c = new Page6FLPasporFragment(new Handler(Looper.getMainLooper()), false);
    }

    static {
        ivfotoDiri ivfotodiri;
        AnonymousClass5 r0 = new Callable<ivfotoDiri>() { // from class: o.fotoDiri.5
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ ivfotoDiri call() throws Exception {
                return write.c;
            }
        };
        Page6FLKTPFragment_ViewBinding<Callable<ivfotoDiri>, ivfotoDiri> page6FLKTPFragment_ViewBinding = Page6ESFragment.c;
        if (page6FLKTPFragment_ViewBinding == null) {
            ivfotodiri = Page6ESFragment.e(r0);
        } else {
            ivfotodiri = (ivfotoDiri) Page6ESFragment.c(page6FLKTPFragment_ViewBinding, r0);
            if (ivfotodiri == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
        }
        d = ivfotodiri;
    }

    public static ivfotoDiri e(Looper looper) {
        if (looper != null) {
            return new Page6FLPasporFragment(new Handler(looper), false);
        }
        throw new NullPointerException("looper == null");
    }
}
