package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/getTotalDependent.class */
public final class getTotalDependent extends getHmKecamatan implements getSelectedCardOptions {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getTotalDependent(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // o.getSelectedCardOptions
    public final int e() throws RemoteException {
        Parcel c = c(2, c());
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // o.getSelectedCardOptions
    public final void e(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.d(c, bundle);
        c.writeLong(j);
        e(1, c);
    }
}
