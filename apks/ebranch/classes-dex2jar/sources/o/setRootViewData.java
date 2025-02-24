package o;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/setRootViewData.class */
public class setRootViewData extends setOverriddenInsets {
    @Override // o.setOverriddenInsets
    protected Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.e.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.setOverriddenInsets
    protected Method c(Class<?> cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
