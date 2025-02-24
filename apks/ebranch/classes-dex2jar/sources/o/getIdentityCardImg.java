package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/getIdentityCardImg.class */
public final class getIdentityCardImg extends getHmKecamatan implements getIdentityCardNumber {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getIdentityCardImg(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // o.getIdentityCardNumber
    public final Bundle d(Bundle bundle) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        Parcel c2 = c(1, c);
        Bundle bundle2 = (Bundle) getHmStayPeriod.c(c2, Bundle.CREATOR);
        c2.recycle();
        return bundle2;
    }
}
