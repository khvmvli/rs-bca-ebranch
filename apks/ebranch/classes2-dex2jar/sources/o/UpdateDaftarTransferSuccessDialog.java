package o;

import com.google.firebase.messaging.FirebaseMessaging;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/UpdateDaftarTransferSuccessDialog.class */
public final /* synthetic */ class UpdateDaftarTransferSuccessDialog implements realmSet.kodeBank {
    private final FirebaseMessaging a;
    private final String c;

    public UpdateDaftarTransferSuccessDialog(FirebaseMessaging firebaseMessaging, String str) {
        this.a = firebaseMessaging;
        this.c = str;
    }

    public final Object then(setJatuhTempo setjatuhtempo) {
        return this.a.lambda$blockingGetToken$9$FirebaseMessaging(this.c, setjatuhtempo);
    }
}
