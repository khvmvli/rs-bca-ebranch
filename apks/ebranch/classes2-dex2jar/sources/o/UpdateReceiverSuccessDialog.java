package o;

import com.google.firebase.messaging.FirebaseMessaging;
/* loaded from: classes2-dex2jar.jar:o/UpdateReceiverSuccessDialog.class */
public final /* synthetic */ class UpdateReceiverSuccessDialog implements realmSet$namaBank {
    private final String b;

    public UpdateReceiverSuccessDialog(String str) {
        this.b = str;
    }

    @Override // o.realmSet$namaBank
    public final setJatuhTempo a(Object obj) {
        return FirebaseMessaging.lambda$unsubscribeFromTopic$7$FirebaseMessaging(this.b, (BN1NoATMFragment) obj);
    }
}
