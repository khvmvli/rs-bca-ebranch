package o;

import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setTrackTintMode.class */
public final class setTrackTintMode {
    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception e) {
            return "UNKNOWN";
        }
    }
}
