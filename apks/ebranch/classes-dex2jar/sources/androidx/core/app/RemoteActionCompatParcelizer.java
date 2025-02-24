package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes-dex2jar.jar:androidx/core/app/RemoteActionCompatParcelizer.class */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.b = (IconCompat) versionedParcel.d((VersionedParcel) remoteActionCompat.b, 1);
        remoteActionCompat.i = versionedParcel.a(remoteActionCompat.i, 2);
        remoteActionCompat.e = versionedParcel.a(remoteActionCompat.e, 3);
        remoteActionCompat.a = (PendingIntent) versionedParcel.d((VersionedParcel) remoteActionCompat.a, 4);
        remoteActionCompat.c = versionedParcel.a(remoteActionCompat.c, 5);
        remoteActionCompat.d = versionedParcel.a(remoteActionCompat.d, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.b(remoteActionCompat.b, 1);
        versionedParcel.c(remoteActionCompat.i, 2);
        versionedParcel.c(remoteActionCompat.e, 3);
        versionedParcel.e(remoteActionCompat.a, 4);
        versionedParcel.d(remoteActionCompat.c, 5);
        versionedParcel.d(remoteActionCompat.d, 6);
    }
}
