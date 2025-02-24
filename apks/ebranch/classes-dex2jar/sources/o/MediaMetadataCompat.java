package o;

import android.media.session.PlaybackState;
import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/MediaMetadataCompat.class */
public class MediaMetadataCompat {
    public static Bundle d(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }
}
