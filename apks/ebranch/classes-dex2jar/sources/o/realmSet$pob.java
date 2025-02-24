package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes-dex2jar.jar:o/realmSet$pob.class */
public abstract class realmSet$pob {
    public final int c;

    public realmSet$pob(int i) {
        this.c = i;
    }

    public static /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(realmGet$updatedAt realmget_updatedat, boolean z);

    public abstract void a(realmSet$hmPhoneNumber realmset_hmphonenumber) throws DeadObjectException;

    public abstract void b(Status status);

    public abstract void d(Exception exc);
}
