package o;

import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/setTransitioning$MediaBrowserCompat$CustomActionResultReceiver.class */
class setTransitioning$MediaBrowserCompat$CustomActionResultReceiver {
    public static void a(Drawable drawable, Outline outline) {
        drawable.getOutline(outline);
    }

    public static Resources c(Resources.Theme theme) {
        return theme.getResources();
    }

    public static boolean d(Drawable.ConstantState constantState) {
        return constantState.canApplyTheme();
    }
}
