package o;

import com.google.firebase.messaging.FirebaseMessaging;
import o.UserBlockedDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/UpdateDaftarTransferSuccessDialog_ViewBinding.class */
public final /* synthetic */ class UpdateDaftarTransferSuccessDialog_ViewBinding implements UserBlockedDialog_ViewBinding.write {
    private final setJatuhTempo a;
    private final FirebaseMessaging b;

    public UpdateDaftarTransferSuccessDialog_ViewBinding(FirebaseMessaging firebaseMessaging, setJatuhTempo setjatuhtempo) {
        this.b = firebaseMessaging;
        this.a = setjatuhtempo;
    }

    @Override // o.UserBlockedDialog_ViewBinding.write
    public final setJatuhTempo e() {
        return this.b.lambda$blockingGetToken$8$FirebaseMessaging(this.a);
    }
}
