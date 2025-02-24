package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
/* loaded from: classes2-dex2jar.jar:o/HubunganKeuanganDialog_ViewBinding.class */
public final class HubunganKeuanganDialog_ViewBinding {
    public static Drawable a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = setPrimaryBackground.c(context, resourceId)) == null) ? typedArray.getDrawable(i) : c;
    }

    public static ColorStateList c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = setPrimaryBackground.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : b;
    }

    public static ColorStateList c(Context context, setIconifiedByDefault seticonifiedbydefault, int i) {
        int resourceId;
        ColorStateList b;
        return (!seticonifiedbydefault.d.hasValue(i) || (resourceId = seticonifiedbydefault.d.getResourceId(i, 0)) == 0 || (b = setPrimaryBackground.b(context, resourceId)) == null) ? seticonifiedbydefault.e(i) : b;
    }

    public static int d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
