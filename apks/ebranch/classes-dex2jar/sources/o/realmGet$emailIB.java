package o;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/realmGet$emailIB.class */
public class realmGet$emailIB implements Parcelable {
    public static final Parcelable.Creator<realmGet$emailIB> CREATOR = new Parcelable.Creator<realmGet$emailIB>() { // from class: o.realmGet$flagMB
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmGet$emailIB createFromParcel(Parcel parcel) {
            return new realmGet$emailIB(parcel.readStrongBinder());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmGet$emailIB[] newArray(int i) {
            return new realmGet$emailIB[i];
        }
    };
    private realmGet$expID d;
    private Messenger e;

    /* loaded from: classes-dex2jar.jar:o/realmGet$emailIB$read.class */
    public static final class read extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return loadClass(str, z);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return realmGet$emailIB.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return realmGet$emailIB.class;
        }
    }

    public realmGet$emailIB(IBinder iBinder) {
        this.e = new Messenger(iBinder);
    }

    private final IBinder d() {
        Messenger messenger = this.e;
        return messenger != null ? messenger.getBinder() : this.d.asBinder();
    }

    public final void c(Message message) throws RemoteException {
        Messenger messenger = this.e;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.d.e(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return d().equals(((realmGet$emailIB) obj).d());
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override // java.lang.Object
    public int hashCode() {
        return d().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.e;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.d.asBinder());
        }
    }
}
