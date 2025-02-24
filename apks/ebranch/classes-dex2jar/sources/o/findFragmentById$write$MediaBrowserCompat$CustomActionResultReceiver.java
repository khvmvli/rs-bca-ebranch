package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/findFragmentById$write$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class findFragmentById$write$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentById {
    public static findFragmentById e;
    private IBinder d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public findFragmentById$write$MediaBrowserCompat$CustomActionResultReceiver(IBinder iBinder) {
        this.d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override // o.findFragmentById
    public final void d(String[] strArr) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            if (!this.d.transact(1, obtain, null, 1) && e != null) {
                e.d(strArr);
            }
        } finally {
            obtain.recycle();
        }
    }
}
