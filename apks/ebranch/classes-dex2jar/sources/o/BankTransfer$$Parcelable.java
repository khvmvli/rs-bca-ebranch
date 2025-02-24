package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes-dex2jar.jar:o/BankTransfer$$Parcelable.class */
public interface BankTransfer$$Parcelable {

    /* renamed from: o.BankTransfer$$Parcelable$1  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:o/BankTransfer$$Parcelable$1.class */
    public class AnonymousClass1 extends Handler {
        private final Looper b = Looper.getMainLooper();

        public AnonymousClass1() {
        }

        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        public AnonymousClass1(Looper looper, Handler.Callback callback) {
            super(looper, callback);
        }
    }

    ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2);

    ExecutorService d(ThreadFactory threadFactory, int i);
}
