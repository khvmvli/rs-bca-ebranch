package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/getFlagReservation.class */
public final class getFlagReservation {
    private static volatile boolean b = true;

    public static Drawable e(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (b) {
                return setPrimaryBackground.c(theme != null ? new setShowingForActionMode(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException e) {
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return copyWindowDataInto.b(context2, i);
            }
            throw e2;
        } catch (NoClassDefFoundError e3) {
            b = false;
        }
        Resources.Theme theme2 = theme;
        if (theme == null) {
            theme2 = context2.getTheme();
        }
        return inset.a(context2.getResources(), i, theme2);
    }
}
