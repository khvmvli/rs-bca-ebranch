package o;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes-dex2jar.jar:o/IconCompatParcelizer.class */
public class IconCompatParcelizer {
    public static Bitmap a(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    public static Bundle b(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    public static void b(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    public static String c(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    public static Uri d(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    public static Object d(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    public static CharSequence e(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    public static CharSequence f(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    public static CharSequence h(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }
}
