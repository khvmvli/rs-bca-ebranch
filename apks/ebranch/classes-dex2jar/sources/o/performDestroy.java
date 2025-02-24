package o;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/performDestroy.class */
public final class performDestroy {
    private static Map<Class<?>, Integer> d = new HashMap();
    private static Map<Class<?>, List<Constructor<? extends onOptionsMenuClosed>>> b = new HashMap();

    private static Constructor<? extends onOptionsMenuClosed> a(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(".", "_"));
            sb.append("_LifecycleAdapter");
            String obj = sb.toString();
            if (name.isEmpty()) {
                str = obj;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                str = sb2.toString();
            }
            Constructor declaredConstructor = Class.forName(str).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static onOptionsMenuClosed a(Constructor<? extends onOptionsMenuClosed> constructor, Object obj) {
        try {
            return (onOptionsMenuClosed) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static onResume b(Object obj) {
        boolean z = obj instanceof onResume;
        boolean z2 = obj instanceof onPictureInPictureModeChanged;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((onPictureInPictureModeChanged) obj, (onResume) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((onPictureInPictureModeChanged) obj, null);
        }
        if (z) {
            return (onResume) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends onOptionsMenuClosed>> list = b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        onOptionsMenuClosed[] onoptionsmenuclosedArr = new onOptionsMenuClosed[list.size()];
        for (int i = 0; i < list.size(); i++) {
            onoptionsmenuclosedArr[i] = a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(onoptionsmenuclosedArr);
    }

    private static int d(Class<?> cls) {
        int i;
        boolean z;
        ArrayList arrayList;
        Integer num = d.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            Constructor<? extends onOptionsMenuClosed> a = a(cls);
            if (a != null) {
                b.put(cls, Collections.singletonList(a));
                i = 2;
            } else {
                onOptionsItemSelected onoptionsitemselected = onOptionsItemSelected.b;
                Boolean bool = onoptionsitemselected.a.get(cls);
                if (bool == null) {
                    Method[] b2 = onOptionsItemSelected.b(cls);
                    int length = b2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            onoptionsitemselected.a.put(cls, Boolean.FALSE);
                            z = false;
                            break;
                        } else if (((performMultiWindowModeChanged) b2[i2].getAnnotation(performMultiWindowModeChanged.class)) != null) {
                            onoptionsitemselected.e(cls, b2);
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    z = bool.booleanValue();
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (!(superclass != null && performActivityCreated.class.isAssignableFrom(superclass))) {
                        arrayList = null;
                    } else if (d(superclass) != 1) {
                        arrayList = new ArrayList(b.get(superclass));
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            arrayList = arrayList;
                            if (cls2 != null && performActivityCreated.class.isAssignableFrom(cls2)) {
                                if (d(cls2) == 1) {
                                    break;
                                }
                                arrayList = arrayList;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll(b.get(cls2));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            b.put(cls, arrayList);
                            i = 2;
                        }
                    }
                }
            }
            d.put(cls, Integer.valueOf(i));
            return i;
        }
        i = 1;
        d.put(cls, Integer.valueOf(i));
        return i;
    }
}
