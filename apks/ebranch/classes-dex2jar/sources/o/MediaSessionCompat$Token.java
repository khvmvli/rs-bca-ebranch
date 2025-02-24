package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import o.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
/* loaded from: classes-dex2jar.jar:o/MediaSessionCompat$Token.class */
public class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new Parcelable.Creator<MediaSessionCompat$Token>() { // from class: o.MediaSessionCompat$Token.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaSessionCompat$Token createFromParcel(Parcel parcel) {
            return new MediaSessionCompat$Token(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaSessionCompat$Token[] newArray(int i) {
            return new MediaSessionCompat$Token[i];
        }
    };
    MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver e;
    final boolean b = false;
    final Handler a = null;

    /* loaded from: classes-dex2jar.jar:o/MediaSessionCompat$Token$write.class */
    final class write extends MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.read {
        write() {
            MediaSessionCompat$Token.this = r4;
        }

        @Override // o.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
        public final void b(int i, Bundle bundle) {
            if (MediaSessionCompat$Token.this.a != null) {
                MediaSessionCompat$Token.this.a.post(new MediaSessionCompat$Token$MediaBrowserCompat$CustomActionResultReceiver(MediaSessionCompat$Token.this, i, bundle));
            } else {
                MediaSessionCompat$Token.this.c(i, bundle);
            }
        }
    }

    MediaSessionCompat$Token(Parcel parcel) {
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = (queryLocalInterface == null || !(queryLocalInterface instanceof MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver)) ? new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(readStrongBinder) { // from class: o.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$read$MediaBrowserCompat$CustomActionResultReceiver
                public static MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver c;
                private IBinder a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r4;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
                    return this.a;
                }

                @Override // o.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                public final void b(int i, Bundle bundle) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                        obtain.writeInt(i);
                        if (bundle != null) {
                            obtain.writeInt(1);
                            bundle.writeToParcel(obtain, 0);
                        } else {
                            obtain.writeInt(0);
                        }
                        if (!this.a.transact(1, obtain, null, 1) && c != null) {
                            c.b(i, bundle);
                        }
                    } finally {
                        obtain.recycle();
                    }
                }
            } : (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) queryLocalInterface;
        }
        this.e = mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    }

    public void c(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.e == null) {
                this.e = new write();
            }
            parcel.writeStrongBinder(this.e.asBinder());
        }
    }
}
