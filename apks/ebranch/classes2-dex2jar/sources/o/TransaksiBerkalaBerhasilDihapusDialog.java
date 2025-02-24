package o;

import com.google.firebase.messaging.FirebaseMessaging;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/TransaksiBerkalaBerhasilDihapusDialog.class */
public final /* synthetic */ class TransaksiBerkalaBerhasilDihapusDialog implements realmSet.kodeBank {
    private final FirebaseMessaging d;

    public TransaksiBerkalaBerhasilDihapusDialog(FirebaseMessaging firebaseMessaging) {
        this.d = firebaseMessaging;
    }

    public final Object then(setJatuhTempo setjatuhtempo) {
        this.d.lambda$deleteToken$4$FirebaseMessaging(setjatuhtempo);
        return null;
    }
}
