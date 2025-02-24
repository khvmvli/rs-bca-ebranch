package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import o.findFragmentById;
/* loaded from: classes-dex2jar.jar:o/setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver.class */
public abstract class setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver extends Binder implements setOnApplyWindowInsetsListener {

    /* loaded from: classes-dex2jar.jar:o/setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver$read.class */
    static final class read implements setOnApplyWindowInsetsListener {
        public static setOnApplyWindowInsetsListener b;
        private IBinder c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public read(IBinder iBinder) {
            this.c = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.c;
        }

        @Override // o.setOnApplyWindowInsetsListener
        public final int c(findFragmentById findfragmentbyid, String str) throws RemoteException {
            int readInt;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                obtain.writeStrongBinder(findfragmentbyid != null ? findfragmentbyid.asBinder() : null);
                obtain.writeString(str);
                if (this.c.transact(1, obtain, obtain2, 0) || b == null) {
                    obtain2.readException();
                    readInt = obtain2.readInt();
                } else {
                    readInt = b.c(findfragmentbyid, str);
                }
                return readInt;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // o.setOnApplyWindowInsetsListener
        public final void c(int i, String[] strArr) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                obtain.writeInt(i);
                obtain.writeStringArray(strArr);
                if (!this.c.transact(3, obtain, null, 1) && b != null) {
                    b.c(i, strArr);
                }
            } finally {
                obtain.recycle();
            }
        }

        @Override // o.setOnApplyWindowInsetsListener
        public final void e(findFragmentById findfragmentbyid, int i) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                obtain.writeStrongBinder(findfragmentbyid != null ? findfragmentbyid.asBinder() : null);
                obtain.writeInt(i);
                if (this.c.transact(2, obtain, obtain2, 0) || b == null) {
                    obtain2.readException();
                } else {
                    b.e(findfragmentbyid, i);
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int c = c(findFragmentById.write.a(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(c);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            e(findFragmentById.write.a(parcel.readStrongBinder()), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            c(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
