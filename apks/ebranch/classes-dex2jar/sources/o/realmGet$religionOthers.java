package o;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import o.realmGet$name;
/* loaded from: classes-dex2jar.jar:o/realmGet$religionOthers.class */
public final class realmGet$religionOthers {

    /* loaded from: classes-dex2jar.jar:o/realmGet$religionOthers$write.class */
    public static abstract class write<R extends realmGet$oldCustFlag, A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver> extends realmGet$purposePemRekOthers<R> implements realmGet$religionOthers$MediaBrowserCompat$CustomActionResultReceiver<R> {
        private final realmGet$name<?> c;
        private final realmGet$name.read<A> e;

        public write(realmGet$name<?> realmget_name, realmGet$occupation realmget_occupation) {
            super((realmGet$occupation) setFotoKtp.a(realmget_occupation, "GoogleApiClient must not be null"));
            setFotoKtp.a(realmget_name, "Api must not be null");
            this.e = realmget_name.d();
            this.c = realmget_name;
        }

        private void d(RemoteException remoteException) {
            a(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        public final realmGet$name<?> a() {
            return this.c;
        }

        public final void a(Status status) {
            setFotoKtp.d(!status.c(), "Failed result must not be success");
            R e = e(status);
            e((write<R, A>) e);
            d((write<R, A>) e);
        }

        public final void b(A a) throws DeadObjectException {
            try {
                d((write<R, A>) a);
            } catch (DeadObjectException e) {
                d((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                d(e2);
            }
        }

        public final realmGet$name.read<A> d() {
            return this.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.realmGet$religionOthers$MediaBrowserCompat$CustomActionResultReceiver
        public /* synthetic */ void d(Object obj) {
            e((write<R, A>) ((realmGet$oldCustFlag) obj));
        }

        protected abstract void d(A a) throws RemoteException;

        protected void d(R r) {
        }
    }
}
