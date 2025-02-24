package o;

import android.content.Context;
import java.io.File;
/* loaded from: classes-dex2jar.jar:o/getTnxStatus.class */
public final class getTnxStatus {

    /* loaded from: classes-dex2jar.jar:o/getTnxStatus$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
    }

    /* loaded from: classes-dex2jar.jar:o/getTnxStatus$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(Context context, String[] strArr, String str, File file, getTypeReservation gettypereservation);
    }

    public static void b(Context context, String str, String str2) {
        new getTypeReservation().c(context, str, str2, (IconCompatParcelizer) null);
    }
}
