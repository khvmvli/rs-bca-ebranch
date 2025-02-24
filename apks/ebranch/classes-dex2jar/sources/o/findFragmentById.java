package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/findFragmentById.class */
public interface findFragmentById extends IInterface {

    /* loaded from: classes-dex2jar.jar:o/findFragmentById$write.class */
    public static abstract class write extends Binder implements findFragmentById {
        public write() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static findFragmentById a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof findFragmentById)) ? new findFragmentById$write$MediaBrowserCompat$CustomActionResultReceiver(iBinder) : (findFragmentById) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                d(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void d(String[] strArr) throws RemoteException;
}
