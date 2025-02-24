package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes-dex2jar.jar:androidx/core/graphics/drawable/IconCompatParcelizer.class */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.k = versionedParcel.e(iconCompat.k, 1);
        iconCompat.d = versionedParcel.b(iconCompat.d, 2);
        iconCompat.f = versionedParcel.d((VersionedParcel) iconCompat.f, 3);
        iconCompat.e = versionedParcel.e(iconCompat.e, 4);
        iconCompat.c = versionedParcel.e(iconCompat.c, 5);
        iconCompat.g = (ColorStateList) versionedParcel.d((VersionedParcel) iconCompat.g, 6);
        iconCompat.j = versionedParcel.c(iconCompat.j, 7);
        iconCompat.i = versionedParcel.c(iconCompat.i, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        iconCompat.d(false);
        if (-1 != iconCompat.k) {
            versionedParcel.b(iconCompat.k, 1);
        }
        if (iconCompat.d != null) {
            versionedParcel.a(iconCompat.d, 2);
        }
        if (iconCompat.f != null) {
            versionedParcel.e(iconCompat.f, 3);
        }
        if (iconCompat.e != 0) {
            versionedParcel.b(iconCompat.e, 4);
        }
        if (iconCompat.c != 0) {
            versionedParcel.b(iconCompat.c, 5);
        }
        if (iconCompat.g != null) {
            versionedParcel.e(iconCompat.g, 6);
        }
        if (iconCompat.j != null) {
            versionedParcel.d(iconCompat.j, 7);
        }
        if (iconCompat.i != null) {
            versionedParcel.d(iconCompat.i, 8);
        }
    }
}
