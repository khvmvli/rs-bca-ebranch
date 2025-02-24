package o;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import o.BankTransfer$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$fotoKtp.class */
public final class realmSet$fotoKtp extends BankTransfer$$Parcelable.AnonymousClass1 {
    final /* synthetic */ realmSet$handPhoneNumber c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmSet$fotoKtp(realmSet$handPhoneNumber realmset_handphonenumber, Looper looper) {
        super(looper);
        this.c = realmset_handphonenumber;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            realmSet$handPhoneNumber.d(this.c);
        } else if (i != 2) {
            int i2 = message.what;
            Log.w("GoogleApiClientImpl", "Unknown message id: " + i2);
        } else {
            realmSet$handPhoneNumber.e(this.c);
        }
    }
}
