package butterknife.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import o.copyWindowDataInto;
import o.getInsetsForType;
/* loaded from: classes-dex2jar.jar:butterknife/internal/Utils.class */
public final class Utils {
    private static final TypedValue VALUE = new TypedValue();

    private Utils() {
        throw new AssertionError("No instances.");
    }

    @SafeVarargs
    public static <T> T[] arrayFilteringNull(T... tArr) {
        int length = tArr.length;
        int i = 0;
        for (T t : tArr) {
            i = i;
            if (t != null) {
                tArr[i] = t;
                i++;
            }
        }
        T[] tArr2 = tArr;
        if (i != length) {
            tArr2 = (T[]) Arrays.copyOf(tArr, i);
        }
        return tArr2;
    }

    public static <T> T castParam(Object obj, String str, int i, String str2, int i2, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder("Parameter #");
            sb.append(i + 1);
            sb.append(" of method '");
            sb.append(str);
            sb.append("' was of the wrong type for parameter #");
            sb.append(i2 + 1);
            sb.append(" of method '");
            sb.append(str2);
            sb.append("'. See cause for more info.");
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public static <T> T castView(View view, int i, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            String resourceEntryName = getResourceEntryName(view, i);
            StringBuilder sb = new StringBuilder("View '");
            sb.append(resourceEntryName);
            sb.append("' with ID ");
            sb.append(i);
            sb.append(" for ");
            sb.append(str);
            sb.append(" was of the wrong type. See cause for more info.");
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public static <T> T findOptionalViewAsType(View view, int i, String str, Class<T> cls) {
        return (T) castView(view.findViewById(i), i, str, cls);
    }

    public static View findRequiredView(View view, int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        String resourceEntryName = getResourceEntryName(view, i);
        StringBuilder sb = new StringBuilder("Required view '");
        sb.append(resourceEntryName);
        sb.append("' with ID ");
        sb.append(i);
        sb.append(" for ");
        sb.append(str);
        sb.append(" was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
        throw new IllegalStateException(sb.toString());
    }

    public static <T> T findRequiredViewAsType(View view, int i, String str, Class<T> cls) {
        return (T) castView(findRequiredView(view, i, str), i, str, cls);
    }

    public static float getFloat(Context context, int i) {
        TypedValue typedValue = VALUE;
        context.getResources().getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        StringBuilder sb = new StringBuilder("Resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" type #0x");
        sb.append(Integer.toHexString(typedValue.type));
        sb.append(" is not valid");
        throw new Resources.NotFoundException(sb.toString());
    }

    private static String getResourceEntryName(View view, int i) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i);
    }

    public static Drawable getTintedDrawable(Context context, int i, int i2) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = VALUE;
        if (theme.resolveAttribute(i2, typedValue, true)) {
            Drawable h = getInsetsForType.h(copyWindowDataInto.b(context, i).mutate());
            getInsetsForType.b(h, copyWindowDataInto.a(context, typedValue.resourceId));
            return h;
        }
        StringBuilder sb = new StringBuilder("Required tint color attribute with name ");
        sb.append(context.getResources().getResourceEntryName(i2));
        sb.append(" and attribute ID ");
        sb.append(i2);
        sb.append(" was not found.");
        throw new Resources.NotFoundException(sb.toString());
    }

    @SafeVarargs
    public static <T> List<T> listFilteringNull(T... tArr) {
        return new ImmutableList(arrayFilteringNull(tArr));
    }
}
