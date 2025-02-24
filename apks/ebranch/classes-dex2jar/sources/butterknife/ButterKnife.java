package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:butterknife/ButterKnife.class */
public final class ButterKnife {
    static final Map<Class<?>, Constructor<? extends Unbinder>> BINDINGS = new LinkedHashMap();
    private static final String TAG = "ButterKnife";
    private static boolean debug = false;

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder bind(Activity activity) {
        return bind(activity, activity.getWindow().getDecorView());
    }

    public static Unbinder bind(Dialog dialog) {
        return bind(dialog, dialog.getWindow().getDecorView());
    }

    public static Unbinder bind(View view) {
        return bind(view, view);
    }

    public static Unbinder bind(Object obj, Activity activity) {
        return bind(obj, activity.getWindow().getDecorView());
    }

    public static Unbinder bind(Object obj, Dialog dialog) {
        return bind(obj, dialog.getWindow().getDecorView());
    }

    public static Unbinder bind(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (debug) {
            StringBuilder sb = new StringBuilder("Looking up binding for ");
            sb.append(cls.getName());
            Log.d(TAG, sb.toString());
        }
        Constructor<? extends Unbinder> findBindingConstructorForClass = findBindingConstructorForClass(cls);
        if (findBindingConstructorForClass == null) {
            return Unbinder.EMPTY;
        }
        try {
            return (Unbinder) findBindingConstructorForClass.newInstance(obj, view);
        } catch (IllegalAccessException e) {
            StringBuilder sb2 = new StringBuilder("Unable to invoke ");
            sb2.append(findBindingConstructorForClass);
            throw new RuntimeException(sb2.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb3 = new StringBuilder("Unable to invoke ");
            sb3.append(findBindingConstructorForClass);
            throw new RuntimeException(sb3.toString(), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    private static Constructor<? extends Unbinder> findBindingConstructorForClass(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Map<Class<?>, Constructor<? extends Unbinder>> map = BINDINGS;
        Constructor<? extends Unbinder> constructor2 = map.get(cls);
        if (constructor2 != null || map.containsKey(cls)) {
            if (debug) {
                Log.d(TAG, "HIT: Cached in binding map.");
            }
            return constructor2;
        }
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("java.") && !name.startsWith("androidx.")) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append("_ViewBinding");
                Constructor<? extends Unbinder> constructor3 = classLoader.loadClass(sb.toString()).getConstructor(cls, View.class);
                constructor = constructor3;
                if (debug) {
                    Log.d(TAG, "HIT: Loaded binding class and constructor.");
                    constructor = constructor3;
                }
            } catch (ClassNotFoundException e) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder("Not found. Trying superclass ");
                    sb2.append(cls.getSuperclass().getName());
                    Log.d(TAG, sb2.toString());
                }
                constructor = findBindingConstructorForClass(cls.getSuperclass());
            } catch (NoSuchMethodException e2) {
                StringBuilder sb3 = new StringBuilder("Unable to find binding constructor for ");
                sb3.append(name);
                throw new RuntimeException(sb3.toString(), e2);
            }
            BINDINGS.put(cls, constructor);
            return constructor;
        } else if (!debug) {
            return null;
        } else {
            Log.d(TAG, "MISS: Reached framework class. Abandoning search.");
            return null;
        }
    }

    public static void setDebug(boolean z) {
        debug = z;
    }
}
