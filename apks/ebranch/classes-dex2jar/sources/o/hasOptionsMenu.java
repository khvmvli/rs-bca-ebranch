package o;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes-dex2jar.jar:o/hasOptionsMenu.class */
public class hasOptionsMenu {
    private static final setCollapseIcon<ClassLoader, setCollapseIcon<String, Class<?>>> e = new setCollapseIcon<>();

    private static Class<?> a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        setCollapseIcon<ClassLoader, setCollapseIcon<String, Class<?>>> setcollapseicon = e;
        setCollapseIcon<String, Class<?>> setcollapseicon2 = setcollapseicon.get(classLoader);
        setCollapseIcon<String, Class<?>> setcollapseicon3 = setcollapseicon2;
        if (setcollapseicon2 == null) {
            setcollapseicon3 = new setCollapseIcon<>();
            setcollapseicon.put(classLoader, setcollapseicon3);
        }
        Class<?> cls = setcollapseicon3.get(str);
        Class<?> cls2 = cls;
        if (cls == null) {
            cls2 = Class.forName(str, false, classLoader);
            setcollapseicon3.put(str, cls2);
        }
        return cls2;
    }

    public static Class<? extends Fragment> b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e2) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new Fragment.InstantiationException(sb.toString(), e2);
        } catch (ClassNotFoundException e3) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists");
            throw new Fragment.InstantiationException(sb2.toString(), e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(a(classLoader, str));
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    public Fragment d(ClassLoader classLoader, String str) {
        try {
            return (Fragment) b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.InstantiationException(sb.toString(), e2);
        } catch (InstantiationException e3) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.InstantiationException(sb2.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new Fragment.InstantiationException(sb3.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new Fragment.InstantiationException(sb4.toString(), e5);
        }
    }
}
