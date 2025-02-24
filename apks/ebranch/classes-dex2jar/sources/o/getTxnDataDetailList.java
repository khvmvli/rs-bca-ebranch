package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes-dex2jar.jar:o/getTxnDataDetailList.class */
final class getTxnDataDetailList {
    private boolean a;
    private final Handler e = new Handler(Looper.getMainLooper(), new read());

    /* loaded from: classes-dex2jar.jar:o/getTxnDataDetailList$read.class */
    static final class read implements Handler.Callback {
        read() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((setIbanFlag) message.obj).b();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(setIbanFlag<?> setibanflag, boolean z) {
        synchronized (this) {
            if (this.a || z) {
                this.e.obtainMessage(1, setibanflag).sendToTarget();
            } else {
                this.a = true;
                setibanflag.b();
                this.a = false;
            }
        }
    }
}
