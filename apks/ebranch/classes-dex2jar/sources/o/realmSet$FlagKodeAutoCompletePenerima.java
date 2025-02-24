package o;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* loaded from: classes-dex2jar.jar:o/realmSet$FlagKodeAutoCompletePenerima.class */
public interface realmSet$FlagKodeAutoCompletePenerima extends IInterface {
    void b(LocationResult locationResult) throws RemoteException;

    void e(LocationAvailability locationAvailability) throws RemoteException;
}
