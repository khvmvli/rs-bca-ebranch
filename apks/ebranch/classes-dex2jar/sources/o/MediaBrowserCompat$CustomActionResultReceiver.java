package o;

import android.media.MediaDescription;
import android.net.Uri;
/* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$CustomActionResultReceiver.class */
public class MediaBrowserCompat$CustomActionResultReceiver {
    public static Uri e(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
