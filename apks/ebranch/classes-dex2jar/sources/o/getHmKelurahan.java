package o;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes-dex2jar.jar:o/getHmKelurahan.class */
public abstract class getHmKelurahan extends getGender implements getIdentityCardNumber {
    public static getIdentityCardNumber c(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof getIdentityCardNumber ? (getIdentityCardNumber) queryLocalInterface : new getIdentityCardImg(iBinder);
    }
}
