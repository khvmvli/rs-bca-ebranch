package o;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import o.BankTransfer$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$hmCountry.class */
public final class realmSet$hmCountry extends BankTransfer$$Parcelable.AnonymousClass1 {
    final /* synthetic */ realmSet$hmPhoneCodeNumber b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmSet$hmCountry(realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber, Looper looper) {
        super(looper);
        this.b = realmset_hmphonecodenumber;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((realmSet$fotoPribadi) message.obj).b(this.b);
        } else if (i != 2) {
            int i2 = message.what;
            Log.w("GACStateManager", "Unknown message id: " + i2);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
