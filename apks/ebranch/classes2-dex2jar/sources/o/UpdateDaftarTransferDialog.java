package o;

import com.google.firebase.messaging.FirebaseMessaging;
/* loaded from: classes2-dex2jar.jar:o/UpdateDaftarTransferDialog.class */
public final /* synthetic */ class UpdateDaftarTransferDialog implements Runnable {
    private final setJenisWarkat c;
    private final FirebaseMessaging e;

    public UpdateDaftarTransferDialog(FirebaseMessaging firebaseMessaging, setJenisWarkat setjeniswarkat) {
        this.e = firebaseMessaging;
        this.c = setjeniswarkat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.lambda$deleteToken$3$FirebaseMessaging(this.c);
    }
}
