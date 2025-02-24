package o;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$SearchResultReceiver.class */
public class MediaBrowserCompat$SearchResultReceiver {

    /* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$SearchResultReceiver$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        public static int a(Object obj) {
            return c(c(obj));
        }

        private static int c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }

        public static AudioAttributes c(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$SearchResultReceiver$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a();

        void a(CharSequence charSequence);

        void a(Object obj);

        void b(int i, int i2, int i3, int i4, int i5);

        void b(List<?> list);

        void c(String str, Bundle bundle);

        void d(Object obj);

        void e(Bundle bundle);
    }

    /* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$SearchResultReceiver$read.class */
    static class read<T extends RemoteActionCompatParcelizer> extends MediaController.Callback {
        protected final T e;

        public read(T t) {
            this.e = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.e.b(playbackInfo.getPlaybackType(), IconCompatParcelizer.a(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.d(bundle);
            this.e.e(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.e.a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.e.d(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.e.b(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.e.a(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.e.a();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.d(bundle);
            this.e.c(str, bundle);
        }
    }

    public static Object a(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return new read(remoteActionCompatParcelizer);
    }
}
