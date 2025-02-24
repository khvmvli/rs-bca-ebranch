package io.github.inflationx.calligraphy3;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:io/github/inflationx/calligraphy3/TypefaceUtils.class */
public final class TypefaceUtils {
    private static final Map<String, Typeface> sCachedFonts = new HashMap();
    private static final Map<Typeface, CalligraphyTypefaceSpan> sCachedSpans = new HashMap();

    private TypefaceUtils() {
    }

    public static CalligraphyTypefaceSpan getSpan(Typeface typeface) {
        if (typeface == null) {
            return null;
        }
        Map<Typeface, CalligraphyTypefaceSpan> map = sCachedSpans;
        synchronized (map) {
            if (!map.containsKey(typeface)) {
                CalligraphyTypefaceSpan calligraphyTypefaceSpan = new CalligraphyTypefaceSpan(typeface);
                map.put(typeface, calligraphyTypefaceSpan);
                return calligraphyTypefaceSpan;
            }
            return map.get(typeface);
        }
    }

    public static boolean isLoaded(Typeface typeface) {
        return typeface != null && sCachedFonts.containsValue(typeface);
    }

    public static Typeface load(AssetManager assetManager, String str) {
        Map<String, Typeface> map = sCachedFonts;
        synchronized (map) {
            try {
                if (!map.containsKey(str)) {
                    Typeface createFromFile = str.startsWith("/") ? Typeface.createFromFile(str) : Typeface.createFromAsset(assetManager, str);
                    map.put(str, createFromFile);
                    return createFromFile;
                }
                return map.get(str);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Can't create asset from ");
                sb.append(str);
                sb.append(". Make sure you have passed in the correct path and file name.");
                Log.w("Calligraphy", sb.toString(), e);
                sCachedFonts.put(str, null);
                return null;
            }
        }
    }
}
