package o;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutorService;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/TujuanTransaksiDialog.class */
public final /* synthetic */ class TujuanTransaksiDialog implements realmSet.kodeBank {
    private final FirebaseMessaging a;
    private final ExecutorService d;

    public TujuanTransaksiDialog(FirebaseMessaging firebaseMessaging, ExecutorService executorService) {
        this.a = firebaseMessaging;
        this.d = executorService;
    }

    public final Object then(setJatuhTempo setjatuhtempo) {
        return this.a.lambda$deleteToken$5$FirebaseMessaging(this.d, setjatuhtempo);
    }
}
