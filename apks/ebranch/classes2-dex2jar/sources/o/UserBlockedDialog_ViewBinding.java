package o;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import java.util.concurrent.Executor;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/UserBlockedDialog_ViewBinding.class */
public class UserBlockedDialog_ViewBinding {
    private final Map<String, setJatuhTempo<String>> b = new setThumbTextPadding();
    private final Executor d;

    /* loaded from: classes2-dex2jar.jar:o/UserBlockedDialog_ViewBinding$write.class */
    interface write {
        setJatuhTempo<String> e();
    }

    public UserBlockedDialog_ViewBinding(Executor executor) {
        this.d = executor;
    }

    public final /* synthetic */ setJatuhTempo a(String str, setJatuhTempo setjatuhtempo) throws Exception {
        synchronized (this) {
            this.b.remove(str);
        }
        return setjatuhtempo;
    }

    public final setJatuhTempo<String> b(String str, write write2) {
        synchronized (this) {
            setJatuhTempo<String> setjatuhtempo = this.b.get(str);
            if (setjatuhtempo != null) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    String valueOf = String.valueOf(str);
                    Log.d(Constants.TAG, valueOf.length() != 0 ? "Joining ongoing request for: ".concat(valueOf) : new String("Joining ongoing request for: "));
                }
                return setjatuhtempo;
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                String valueOf2 = String.valueOf(str);
                Log.d(Constants.TAG, valueOf2.length() != 0 ? "Making new request for: ".concat(valueOf2) : new String("Making new request for: "));
            }
            setJatuhTempo<String> d = write2.e().d(this.d, new realmSet.kodeBank(this, str) { // from class: o.UserBlockedDialog
                private final UserBlockedDialog_ViewBinding b;
                private final String d;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = r4;
                    this.d = r5;
                }

                public final Object then(setJatuhTempo setjatuhtempo2) {
                    this.b.a(this.d, setjatuhtempo2);
                    return setjatuhtempo2;
                }
            });
            this.b.put(str, d);
            return d;
        }
    }
}
