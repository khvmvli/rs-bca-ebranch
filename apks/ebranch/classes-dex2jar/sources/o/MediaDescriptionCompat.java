package o;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/MediaDescriptionCompat.class */
public class MediaDescriptionCompat {

    /* loaded from: classes-dex2jar.jar:o/MediaDescriptionCompat$write.class */
    public static final class write {
        public static int b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        public static CharSequence c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        public static String d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        public static Bundle e(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }
    }

    public static long a(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    public static CharSequence b(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    public static List<Object> c(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    public static long d(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static long e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static long f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static float g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static int h(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static long j(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }
}
