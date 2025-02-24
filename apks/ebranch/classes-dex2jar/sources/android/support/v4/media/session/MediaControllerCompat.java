package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import o.CoordinatorLayout;
import o.MediaBrowserCompat$ItemReceiver;
import o.MediaBrowserCompat$SearchResultReceiver;
import o.write;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat.class */
public final class MediaControllerCompat {

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.class */
    static class MediaControllerImplApi21 {
        final Object a;
        final MediaSessionCompat.Token b;
        private HashMap<write, write> c;
        private final List<write> d;

        /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.class */
        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> b;

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.b.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.a) {
                        mediaControllerImplApi21.b.c(MediaBrowserCompat$ItemReceiver.read.e(CoordinatorLayout.b(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.b.d(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.a();
                    }
                }
            }
        }

        /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$write.class */
        public static class write extends write.RemoteActionCompatParcelizer {
            write(write write) {
                super(write);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.write.RemoteActionCompatParcelizer, o.write
            public void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.write.RemoteActionCompatParcelizer, o.write
            public void b(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.write.RemoteActionCompatParcelizer, o.write
            public void d(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.write.RemoteActionCompatParcelizer, o.write
            public void e() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.write.RemoteActionCompatParcelizer, o.write
            public void e(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.write.RemoteActionCompatParcelizer, o.write
            public void e(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }

        void a() {
            if (this.b.a() != null) {
                for (write write2 : this.d) {
                    write write3 = new write(write2);
                    this.c.put(write2, write3);
                    write2.e = write3;
                    try {
                        this.b.a().e(write3);
                        write2.a(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.d.clear();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat$write.class */
    public static abstract class write implements IBinder.DeathRecipient {
        final Object a = MediaBrowserCompat$SearchResultReceiver.a(new MediaControllerCompat$write$MediaBrowserCompat$CustomActionResultReceiver(this));
        read b;
        o.write e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat$write$RemoteActionCompatParcelizer.class */
        public static class RemoteActionCompatParcelizer extends write.AbstractBinderC0007write {
            private final WeakReference<write> b;

            RemoteActionCompatParcelizer(write write) {
                this.b = new WeakReference<>(write);
            }

            @Override // o.write
            public void a(int i) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(9, Integer.valueOf(i), null);
                }
            }

            @Override // o.write
            public void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(5, list, null);
                }
            }

            @Override // o.write
            public void b(int i) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(12, Integer.valueOf(i), null);
                }
            }

            @Override // o.write
            public void b(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(4, parcelableVolumeInfo != null ? new MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver(parcelableVolumeInfo.d, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.a, parcelableVolumeInfo.e) : null, null);
                }
            }

            @Override // o.write
            public void c() throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(13, null, null);
                }
            }

            @Override // o.write
            public void c(boolean z) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // o.write
            public void d(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(2, playbackStateCompat, null);
                }
            }

            @Override // o.write
            public void d(CharSequence charSequence) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(6, charSequence, null);
                }
            }

            @Override // o.write
            public void d(String str, Bundle bundle) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(1, str, bundle);
                }
            }

            @Override // o.write
            public void e() throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(8, null, null);
                }
            }

            @Override // o.write
            public void e(Bundle bundle) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(7, bundle, null);
                }
            }

            @Override // o.write
            public void e(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                write write = this.b.get();
                if (write != null) {
                    write.a(3, mediaMetadataCompat, null);
                }
            }

            @Override // o.write
            public void e(boolean z) throws RemoteException {
            }
        }

        /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat$write$read.class */
        public class read extends Handler {
            final /* synthetic */ write a;
            boolean e;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.e) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.d(data);
                            this.a.b((String) message.obj, data);
                            return;
                        case 2:
                            this.a.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.a.c((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.a.e((MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver) message.obj);
                            return;
                        case 5:
                            this.a.d((List) message.obj);
                            return;
                        case 6:
                            this.a.b((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.d(bundle);
                            this.a.e(bundle);
                            return;
                        case 8:
                            this.a.c();
                            return;
                        case 9:
                            this.a.a(((Integer) message.obj).intValue());
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            this.a.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            this.a.c(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            this.a.b();
                            return;
                    }
                }
            }
        }

        public void a(int i) {
        }

        void a(int i, Object obj, Bundle bundle) {
            read read2 = this.b;
            if (read2 != null) {
                Message obtainMessage = read2.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void b() {
        }

        public void b(PlaybackStateCompat playbackStateCompat) {
        }

        public void b(CharSequence charSequence) {
        }

        public void b(String str, Bundle bundle) {
        }

        public void b(boolean z) {
        }

        public void c() {
        }

        public void c(int i) {
        }

        public void c(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void d(List<MediaSessionCompat.QueueItem> list) {
        }

        public void e(Bundle bundle) {
        }

        public void e(MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver) {
        }
    }
}
