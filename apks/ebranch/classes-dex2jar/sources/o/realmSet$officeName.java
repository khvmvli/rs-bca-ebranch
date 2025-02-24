package o;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import o.BankTransfer$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmSet$officeName.class */
final class realmSet$officeName extends BankTransfer$$Parcelable.AnonymousClass1 {
    final /* synthetic */ realmSet$officePostCode d;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            realmGet$occupationFlagFreeText realmget_occupationflagfreetext = (realmGet$occupationFlagFreeText) message.obj;
            synchronized (this.d.e) {
                realmSet$officePostCode realmset_officepostcode = (realmSet$officePostCode) setFotoKtp.b(this.d.b);
                if (realmget_occupationflagfreetext == null) {
                    realmset_officepostcode.c(new Status(13, "Transform returned null"));
                } else if (realmget_occupationflagfreetext instanceof realmSet$motherMaidenName) {
                    realmset_officepostcode.c(((realmSet$motherMaidenName) realmget_occupationflagfreetext).e());
                } else {
                    realmset_officepostcode.e(realmget_occupationflagfreetext);
                }
            }
        } else if (i != 1) {
            int i2 = message.what;
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i2);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
    }
}
