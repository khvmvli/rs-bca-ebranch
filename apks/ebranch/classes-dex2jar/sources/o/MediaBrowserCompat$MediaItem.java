package o;

import android.media.session.MediaSession;
/* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$MediaItem.class */
class MediaBrowserCompat$MediaItem {

    /* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$MediaItem$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer {
        public static long a(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }

        public static Object e(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }
    }
}
