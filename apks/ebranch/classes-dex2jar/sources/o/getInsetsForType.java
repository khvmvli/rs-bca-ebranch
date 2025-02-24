package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/getInsetsForType.class */
public final class getInsetsForType {
    private static boolean a;
    private static Method b;
    private static boolean c;
    private static Method d;

    public static int a(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void b(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static boolean b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static int c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!a) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            a = true;
        }
        Method method = d;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, new Object[0])).intValue();
        } catch (Exception e2) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
            d = null;
            return 0;
        }
    }

    public static void c(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void c(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean c(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (!c) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            c = true;
        }
        Method method = b;
        if (method == null) {
            return false;
        }
        try {
            method.invoke(drawable, Integer.valueOf(i));
            return true;
        } catch (Exception e2) {
            Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
            b = null;
            return false;
        }
    }

    public static void d(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            d(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof WindowInsetsCompat$Impl30) {
            d(((WindowInsetsCompat$Impl30) drawable).e());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    d(child);
                }
            }
        }
    }

    public static void d(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void d(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static void d(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static ColorFilter e(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void e(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void e(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean f(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static <T extends Drawable> T g(Drawable drawable) {
        T t = (T) drawable;
        if (drawable instanceof WindowInsetsCompat$Impl30) {
            t = (T) ((WindowInsetsCompat$Impl30) drawable).e();
        }
        return t;
    }

    public static Drawable h(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof getVisibleInsets)) {
            return new WindowInsetsCompat$Impl28(drawable);
        }
        return drawable;
    }

    @Deprecated
    public static void j(Drawable drawable) {
        drawable.jumpToCurrentState();
    }
}
