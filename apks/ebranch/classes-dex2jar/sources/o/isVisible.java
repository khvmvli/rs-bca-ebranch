package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes-dex2jar.jar:o/isVisible.class */
public final class isVisible {
    public static getSystemWindowInsets a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return getSystemWindowInsets.b(typedValue.data);
            }
            getSystemWindowInsets d = getSystemWindowInsets.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (d != null) {
                return d;
            }
        }
        return getSystemWindowInsets.b(0);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static TypedValue c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) ? i2 : typedArray.getInt(i, i2);
    }

    public static String d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static float e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) ? f : typedArray.getFloat(i, f);
    }

    public static boolean e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) ? z : typedArray.getBoolean(i, z);
    }
}
