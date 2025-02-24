package o;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* loaded from: classes-dex2jar.jar:o/onChooseValueFotoNPWP.class */
final class onChooseValueFotoNPWP extends CC14FormKartuKreditPekerjaanFragment_ViewBinding {
    private static Class a;
    private final Object e = b();
    private final Field d = d();

    private static Object b() {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception e) {
        }
        return obj;
    }

    private boolean c(AccessibleObject accessibleObject) {
        if (this.e == null || this.d == null) {
            return false;
        }
        try {
            a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.e, accessibleObject, Long.valueOf(((Long) a.getMethod("objectFieldOffset", Field.class).invoke(this.e, this.d)).longValue()), Boolean.TRUE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static Field d() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    @Override // o.CC14FormKartuKreditPekerjaanFragment_ViewBinding
    public final void a(AccessibleObject accessibleObject) {
        if (!c(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new JsonIOException(sb.toString(), e);
            }
        }
    }
}
