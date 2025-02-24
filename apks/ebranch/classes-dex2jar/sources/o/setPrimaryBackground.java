package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/setPrimaryBackground.class */
public final class setPrimaryBackground {
    private static final ThreadLocal<TypedValue> d = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<IconCompatParcelizer>> a = new WeakHashMap<>(0);
    private static final Object c = new Object();

    /* loaded from: classes-dex2jar.jar:o/setPrimaryBackground$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        final Configuration c;
        final ColorStateList d;

        IconCompatParcelizer(ColorStateList colorStateList, Configuration configuration) {
            this.d = colorStateList;
            this.c = configuration;
        }
    }

    private static ColorStateList a(Context context, int i) {
        IconCompatParcelizer iconCompatParcelizer;
        synchronized (c) {
            SparseArray<IconCompatParcelizer> sparseArray = a.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (iconCompatParcelizer = sparseArray.get(i)) == null)) {
                if (iconCompatParcelizer.c.equals(context.getResources().getConfiguration())) {
                    return iconCompatParcelizer.d;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a2 = a(context, i);
        if (a2 != null) {
            return a2;
        }
        ColorStateList d2 = d(context, i);
        if (d2 == null) {
            return copyWindowDataInto.d(context, i);
        }
        c(context, i, d2);
        return d2;
    }

    public static Drawable c(Context context, int i) {
        return SearchView.e().c(context, i);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = d;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }

    private static void c(Context context, int i, ColorStateList colorStateList) {
        synchronized (c) {
            WeakHashMap<Context, SparseArray<IconCompatParcelizer>> weakHashMap = a;
            SparseArray<IconCompatParcelizer> sparseArray = weakHashMap.get(context);
            SparseArray<IconCompatParcelizer> sparseArray2 = sparseArray;
            if (sparseArray == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new IconCompatParcelizer(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList d(Context context, int i) {
        if (e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return getTappableElementInsets.b(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static boolean e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue c2 = c();
        boolean z = true;
        resources.getValue(i, c2, true);
        if (c2.type < 28 || c2.type > 31) {
            z = false;
        }
        return z;
    }
}
