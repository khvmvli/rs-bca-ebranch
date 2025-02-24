package o;

import android.content.Context;
import android.util.TypedValue;
/* loaded from: classes2-dex2jar.jar:o/HubunganDialog_ViewBinding.class */
public final class HubunganDialog_ViewBinding {
    public static int c(Context context, int i, String str) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue != null) {
            return typedValue.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean e(Context context, int i, boolean z) {
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue : null;
        boolean z2 = z;
        if (typedValue2 != null) {
            z2 = z;
            if (typedValue2.type == 18) {
                z2 = typedValue2.data != 0;
            }
        }
        return z2;
    }
}
