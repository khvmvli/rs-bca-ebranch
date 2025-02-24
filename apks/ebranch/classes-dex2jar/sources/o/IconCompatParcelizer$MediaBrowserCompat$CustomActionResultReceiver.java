package o;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.class */
public class IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver {
    public static void a(Object obj, CharSequence charSequence) {
        ((MediaDescription.Builder) obj).setSubtitle(charSequence);
    }

    public static void c(Object obj, Bitmap bitmap) {
        ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
    }

    public static void c(Object obj, Bundle bundle) {
        ((MediaDescription.Builder) obj).setExtras(bundle);
    }

    public static void c(Object obj, CharSequence charSequence) {
        ((MediaDescription.Builder) obj).setDescription(charSequence);
    }

    public static void d(Object obj, Uri uri) {
        ((MediaDescription.Builder) obj).setIconUri(uri);
    }

    public static void d(Object obj, CharSequence charSequence) {
        ((MediaDescription.Builder) obj).setTitle(charSequence);
    }

    public static void d(Object obj, String str) {
        ((MediaDescription.Builder) obj).setMediaId(str);
    }

    public static Object e() {
        return new MediaDescription.Builder();
    }

    public static Object e(Object obj) {
        return ((MediaDescription.Builder) obj).build();
    }
}
