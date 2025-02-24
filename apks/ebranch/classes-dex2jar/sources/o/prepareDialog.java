package o;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* loaded from: classes-dex2jar.jar:o/prepareDialog.class */
public class prepareDialog {
    public static boolean e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
