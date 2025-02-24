package o;

import android.media.MediaMetadata;
import android.os.Parcel;
/* loaded from: classes-dex2jar.jar:o/RemoteActionCompatParcelizer.class */
public class RemoteActionCompatParcelizer {
    public static void c(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
