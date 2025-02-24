package o;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes-dex2jar.jar:o/setTypeTransaction2$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setTypeTransaction2$MediaBrowserCompat$CustomActionResultReceiver extends Handler {
    private WeakReference<setTypeTransaction2> a;

    public setTypeTransaction2$MediaBrowserCompat$CustomActionResultReceiver(setTypeTransaction2 settypetransaction2) {
        this.a = new WeakReference<>(settypetransaction2);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        setTypeTransaction2 settypetransaction2 = this.a.get();
        if (settypetransaction2 != null) {
            setTypeTransaction2.b(settypetransaction2);
            setTypeTransaction2.d(settypetransaction2, (long) settypetransaction2.r);
        }
    }
}
