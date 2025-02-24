package o;

import android.content.res.Resources;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/setTitle.class */
final class setTitle {
    private static boolean a;
    private static Field b;
    private static Class<?> c;
    private static Field d;
    private static boolean e;
    private static Field f;
    private static boolean g;
    private static boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        Object obj;
        if (!e) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            e = true;
        }
        Field field = b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                obj = null;
            }
            if (obj != null) {
                if (!a) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        d = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    a = true;
                }
                Field field2 = d;
                Object obj2 = null;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    b(obj2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Resources resources) {
        Map map;
        if (!a) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            a = true;
        }
        Field field = d;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void b(Object obj) {
        LongSparseArray longSparseArray;
        if (!h) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            h = true;
        }
        Class<?> cls = c;
        if (cls != null) {
            if (!g) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                g = true;
            }
            Field field = f;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void e(android.content.res.Resources r4) {
        /*
            boolean r0 = o.setTitle.a
            if (r0 != 0) goto L_0x0028
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r1 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: NoSuchFieldException -> 0x001a
            r5 = r0
            r0 = r5
            o.setTitle.d = r0     // Catch: NoSuchFieldException -> 0x001a
            r0 = r5
            r1 = 1
            r0.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x001a
            goto L_0x0024
        L_0x001a:
            r5 = move-exception
            java.lang.String r0 = "ResourcesFlusher"
            java.lang.String r1 = "Could not retrieve Resources#mDrawableCache field"
            r2 = r5
            int r0 = android.util.Log.e(r0, r1, r2)
        L_0x0024:
            r0 = 1
            o.setTitle.a = r0
        L_0x0028:
            java.lang.reflect.Field r0 = o.setTitle.d
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0043
            r0 = r5
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: IllegalAccessException -> 0x0039
            r4 = r0
            goto L_0x0045
        L_0x0039:
            r4 = move-exception
            java.lang.String r0 = "ResourcesFlusher"
            java.lang.String r1 = "Could not retrieve value from Resources#mDrawableCache"
            r2 = r4
            int r0 = android.util.Log.e(r0, r1, r2)
        L_0x0043:
            r0 = 0
            r4 = r0
        L_0x0045:
            r0 = r4
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            r0 = r4
            b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitle.e(android.content.res.Resources):void");
    }
}
