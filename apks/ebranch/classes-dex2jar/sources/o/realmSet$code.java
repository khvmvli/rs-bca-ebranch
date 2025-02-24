package o;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes-dex2jar.jar:o/realmSet$code.class */
public final class realmSet$code implements realmSet$BankBicKey {
    @Override // o.realmSet$BankBicKey
    public final realmGet$occupationFlagFreeText<Status> d(realmGet$occupation realmget_occupation, LocationRequest locationRequest, realmSet$CodewordBankPenerima realmset_codewordbankpenerima) {
        setFotoKtp.a(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return realmget_occupation.e((realmGet$occupation) new setCardNumber(this, realmget_occupation, locationRequest, realmset_codewordbankpenerima));
    }
}
