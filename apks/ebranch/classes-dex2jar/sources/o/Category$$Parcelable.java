package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/Category$$Parcelable.class */
public class Category$$Parcelable extends Binder implements IInterface {

    /* renamed from: o.Category$$Parcelable$1 */
    /* loaded from: classes-dex2jar.jar:o/Category$$Parcelable$1.class */
    public abstract class AnonymousClass1 extends Category$$Parcelable implements cascadeDelete {
        public static cascadeDelete d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            return queryLocalInterface instanceof cascadeDelete ? (cascadeDelete) queryLocalInterface : new realmGet$description(iBinder);
        }
    }

    public Category$$Parcelable(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    protected boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return c(i, parcel, parcel2, i2);
    }
}
