package o;

import android.media.MediaDescription;
import android.net.Uri;
/* loaded from: classes-dex2jar.jar:o/MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.class */
public class MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver {
    public static void b(Object obj, Uri uri) {
        ((MediaDescription.Builder) obj).setMediaUri(uri);
    }
}
