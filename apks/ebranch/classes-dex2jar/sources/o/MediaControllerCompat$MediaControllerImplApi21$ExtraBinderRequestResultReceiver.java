package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.class */
public interface MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends IInterface {

    /* loaded from: classes-dex2jar.jar:o/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$read.class */
    public static abstract class read extends Binder implements MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver {
        public read() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void b(int i, Bundle bundle) throws RemoteException;
}
