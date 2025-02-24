package o;

import android.content.Context;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes-dex2jar.jar:o/getStatusPendudukPengirim.class */
public final class getStatusPendudukPengirim {
    private static final String[] d = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    public static boolean e(Context context, Throwable th) {
        try {
            if (context == null) {
                throw new NullPointerException("null reference");
            } else if (th != null) {
                return false;
            } else {
                throw new NullPointerException("null reference");
            }
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
