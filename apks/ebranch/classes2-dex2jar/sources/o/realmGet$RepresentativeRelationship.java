package o;

import android.content.Context;
import android.content.res.Resources;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$RepresentativeRelationship.class */
public final class realmGet$RepresentativeRelationship {
    public static String c(Context context) {
        String str;
        try {
            str = context.getResources().getResourcePackageName(realmGet.kitasKitapExpDate.RemoteActionCompatParcelizer.d);
        } catch (Resources.NotFoundException e) {
            str = context.getPackageName();
        }
        return str;
    }

    public static final String c(String str, Resources resources, String str2) {
        String string;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
                string = resources.getString(identifier);
            } catch (Resources.NotFoundException e) {
            }
            return string;
        }
        string = null;
        return string;
    }
}
