package o;

import com.google.firebase.messaging.FirebaseMessaging;
/* loaded from: classes2-dex2jar.jar:o/TujuanTransaksiORDialog_ViewBinding.class */
public final /* synthetic */ class TujuanTransaksiORDialog_ViewBinding implements Runnable {
    private final setJenisWarkat b;
    private final FirebaseMessaging d;

    public TujuanTransaksiORDialog_ViewBinding(FirebaseMessaging firebaseMessaging, setJenisWarkat setjeniswarkat) {
        this.d = firebaseMessaging;
        this.b = setjeniswarkat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.lambda$getToken$2$FirebaseMessaging(this.b);
    }
}
