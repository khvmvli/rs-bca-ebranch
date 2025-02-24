package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/onOptionsItemSelected.class */
public final class onOptionsItemSelected {
    public static onOptionsItemSelected b = new onOptionsItemSelected();
    private final Map<Class<?>, write> e = new HashMap();
    final Map<Class<?>, Boolean> a = new HashMap();

    /* loaded from: classes-dex2jar.jar:o/onOptionsItemSelected$write.class */
    public static final class write {
        public final Map<onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver, List<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver>> a = new HashMap();
        final Map<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver> b;

        write(Map<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver> map) {
            this.b = map;
            for (Map.Entry<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver> entry : map.entrySet()) {
                onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver value = entry.getValue();
                List<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver> list = this.a.get(value);
                List<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver> list2 = list;
                if (list == null) {
                    list2 = new ArrayList<>();
                    this.a.put(value, list2);
                }
                list2.add(entry.getKey());
            }
        }

        public static void a(List<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver> list, performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver onoptionsitemselected_mediabrowsercompat_customactionresultreceiver = list.get(size);
                    try {
                        int i = onoptionsitemselected_mediabrowsercompat_customactionresultreceiver.d;
                        if (i == 0) {
                            onoptionsitemselected_mediabrowsercompat_customactionresultreceiver.a.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            onoptionsitemselected_mediabrowsercompat_customactionresultreceiver.a.invoke(obj, performcontextitemselected);
                        } else if (i == 2) {
                            onoptionsitemselected_mediabrowsercompat_customactionresultreceiver.a.invoke(obj, performcontextitemselected, onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    onOptionsItemSelected() {
    }

    private static void a(Map<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver> map, onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver onoptionsitemselected_mediabrowsercompat_customactionresultreceiver, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver, Class<?> cls) {
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver2 = map.get(onoptionsitemselected_mediabrowsercompat_customactionresultreceiver);
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver2 != null && onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver != onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver2) {
            Method method = onoptionsitemselected_mediabrowsercompat_customactionresultreceiver.a;
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver2);
            sb.append(", new value ");
            sb.append(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
            throw new IllegalArgumentException(sb.toString());
        } else if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver2 == null) {
            map.put(onoptionsitemselected_mediabrowsercompat_customactionresultreceiver, onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public final write a(Class<?> cls) {
        write write2 = this.e.get(cls);
        return write2 != null ? write2 : e(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public write e(Class<?> cls, Method[] methodArr) {
        int i;
        write a;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a = a(superclass)) == null)) {
            hashMap.putAll(a.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver> entry : a(cls2).b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        Method[] methodArr2 = methodArr;
        if (methodArr == null) {
            methodArr2 = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr2) {
            performMultiWindowModeChanged performmultiwindowmodechanged = (performMultiWindowModeChanged) method.getAnnotation(performMultiWindowModeChanged.class);
            if (performmultiwindowmodechanged != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(performContextItemSelected.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver b2 = performmultiwindowmodechanged.b();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (b2 == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver(i, method), b2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        write write2 = new write(hashMap);
        this.e.put(cls, write2);
        this.a.put(cls, Boolean.valueOf(z));
        return write2;
    }
}
