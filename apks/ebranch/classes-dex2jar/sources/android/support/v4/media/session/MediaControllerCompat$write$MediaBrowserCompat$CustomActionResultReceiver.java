package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;
import o.MediaBrowserCompat$SearchResultReceiver;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaControllerCompat$write$MediaBrowserCompat$CustomActionResultReceiver.class */
class MediaControllerCompat$write$MediaBrowserCompat$CustomActionResultReceiver implements MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer {
    private final WeakReference<MediaControllerCompat.write> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaControllerCompat$write$MediaBrowserCompat$CustomActionResultReceiver(MediaControllerCompat.write write) {
        this.e = new WeakReference<>(write);
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void a() {
        MediaControllerCompat.write write = this.e.get();
        if (write != null) {
            write.c();
        }
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void a(CharSequence charSequence) {
        MediaControllerCompat.write write = this.e.get();
        if (write != null) {
            write.b(charSequence);
        }
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void a(Object obj) {
        MediaControllerCompat.write write = this.e.get();
        if (write != null) {
            write.c(MediaMetadataCompat.d(obj));
        }
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void b(int i, int i2, int i3, int i4, int i5) {
        MediaControllerCompat.write write = this.e.get();
        if (write != null) {
            write.e(new MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, i4, i5));
        }
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void b(List<?> list) {
        MediaControllerCompat.write write = this.e.get();
        if (write != null) {
            write.d(MediaSessionCompat.QueueItem.e(list));
        }
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void c(String str, Bundle bundle) {
        MediaControllerCompat.write write = this.e.get();
        if (write == null) {
            return;
        }
        if (write.e == null || Build.VERSION.SDK_INT >= 23) {
            write.b(str, bundle);
        }
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void d(Object obj) {
        MediaControllerCompat.write write = this.e.get();
        if (write != null && write.e == null) {
            write.b(PlaybackStateCompat.a(obj));
        }
    }

    @Override // o.MediaBrowserCompat$SearchResultReceiver.RemoteActionCompatParcelizer
    public void e(Bundle bundle) {
        MediaControllerCompat.write write = this.e.get();
        if (write != null) {
            write.e(bundle);
        }
    }
}
