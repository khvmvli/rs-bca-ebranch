package o;

import android.content.Context;
import android.graphics.Typeface;
/* loaded from: classes2-dex2jar.jar:o/onChooseNegaraTujuan.class */
public final class onChooseNegaraTujuan {
    private static final setCollapseIcon<String, Typeface> b = new setCollapseIcon<>();

    public static Typeface d(Context context, String str) {
        setCollapseIcon<String, Typeface> setcollapseicon = b;
        synchronized (setcollapseicon) {
            if (!setcollapseicon.containsKey(str)) {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s.ttf", str));
                setcollapseicon.put(str, createFromAsset);
                return createFromAsset;
            }
            return (Typeface) setcollapseicon.get(str);
        }
    }
}
