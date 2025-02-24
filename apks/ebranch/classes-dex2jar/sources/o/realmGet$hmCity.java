package o;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/realmGet$hmCity.class */
final class realmGet$hmCity {
    private final Messenger c;
    private final realmGet$emailIB d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$hmCity(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.c = new Messenger(iBinder);
            this.d = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.d = new realmGet$emailIB(iBinder);
            this.c = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Message message) throws RemoteException {
        Messenger messenger = this.c;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        realmGet$emailIB realmget_emailib = this.d;
        if (realmget_emailib != null) {
            realmget_emailib.c(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
