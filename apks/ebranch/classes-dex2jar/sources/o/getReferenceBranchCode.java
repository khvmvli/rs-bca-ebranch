package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/getReferenceBranchCode.class */
public final class getReferenceBranchCode extends getHmKecamatan implements getTotalSupplementCard {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getReferenceBranchCode(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // o.getTotalSupplementCard
    public final void c(Bundle bundle) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        e(1, c);
    }
}
