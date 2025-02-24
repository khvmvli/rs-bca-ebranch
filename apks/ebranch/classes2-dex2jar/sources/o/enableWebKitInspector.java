package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.Stetho$Initializer;
import org.greenrobot.eventbus.EventBusException;
/* loaded from: classes2-dex2jar.jar:o/enableWebKitInspector.class */
final class enableWebKitInspector {
    private static final Map<Class<?>, List<enableDumpapp>> a = new ConcurrentHashMap();
    private static final enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver[] e = new enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver[4];
    private final boolean b;
    private List<throwIfFinished> c;
    private final boolean d;

    enableWebKitInspector(List<throwIfFinished> list, boolean z, boolean z2) {
        this.c = list;
        this.d = z;
        this.b = z2;
    }

    private List<enableDumpapp> a(Class<?> cls) {
        enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver c = c();
        c.c = cls;
        c.a = cls;
        c.b = false;
        c.j = null;
        while (c.c != null) {
            b(c);
            c.b();
        }
        return e(c);
    }

    private void b(enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver enablewebkitinspector_mediabrowsercompat_customactionresultreceiver) {
        Method[] methodArr;
        try {
            methodArr = enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.c.getDeclaredMethods();
        } catch (Throwable th) {
            methodArr = enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.c.getMethods();
            enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.b = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    Stetho$Initializer.RealSocketHandlerFactory annotation = method.getAnnotation(Stetho$Initializer.RealSocketHandlerFactory.class);
                    if (annotation != null) {
                        Class<?> cls = parameterTypes[0];
                        if (enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.d(method, cls)) {
                            enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.g.add(new enableDumpapp(method, cls, annotation.e(), annotation.b(), annotation.c()));
                        }
                    }
                } else if (this.d && method.isAnnotationPresent(Stetho$Initializer.RealSocketHandlerFactory.class)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(method.getDeclaringClass().getName());
                    sb.append(".");
                    sb.append(method.getName());
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder("@Subscribe method ");
                    sb2.append(obj);
                    sb2.append("must have exactly 1 parameter but has ");
                    sb2.append(parameterTypes.length);
                    throw new EventBusException(sb2.toString());
                }
            } else if (this.d && method.isAnnotationPresent(Stetho$Initializer.RealSocketHandlerFactory.class)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(method.getDeclaringClass().getName());
                sb3.append(".");
                sb3.append(method.getName());
                String obj2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj2);
                sb4.append(" is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                throw new EventBusException(sb4.toString());
            }
        }
    }

    private static enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver c() {
        synchronized (e) {
            for (int i = 0; i < 4; i++) {
                enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver[] enablewebkitinspector_mediabrowsercompat_customactionresultreceiverArr = e;
                enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver enablewebkitinspector_mediabrowsercompat_customactionresultreceiver = enablewebkitinspector_mediabrowsercompat_customactionresultreceiverArr[i];
                if (enablewebkitinspector_mediabrowsercompat_customactionresultreceiver != null) {
                    enablewebkitinspector_mediabrowsercompat_customactionresultreceiverArr[i] = null;
                    return enablewebkitinspector_mediabrowsercompat_customactionresultreceiver;
                }
            }
            return new enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r0.c == r5.e()) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.util.List<o.enableDumpapp> d(java.lang.Class<?> r5) {
        /*
            r4 = this;
            o.enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver r0 = c()
            r6 = r0
            r0 = r6
            r1 = r5
            r0.c = r1
            r0 = r6
            r1 = r5
            r0.a = r1
            r0 = r6
            r1 = 0
            r0.b = r1
            r0 = r6
            r1 = 0
            r0.j = r1
        L_0x0018:
            r0 = r6
            java.lang.Class<?> r0 = r0.c
            if (r0 == 0) goto L_0x00d2
            r0 = r6
            o.Accumulator r0 = r0.j
            if (r0 == 0) goto L_0x004c
            r0 = r6
            o.Accumulator r0 = r0.j
            o.Accumulator r0 = r0.c()
            if (r0 == 0) goto L_0x004c
            r0 = r6
            o.Accumulator r0 = r0.j
            o.Accumulator r0 = r0.c()
            r5 = r0
            r0 = r6
            java.lang.Class<?> r0 = r0.c
            r1 = r5
            java.lang.Class r1 = r1.e()
            if (r0 != r1) goto L_0x004c
            goto L_0x007d
        L_0x004c:
            r0 = r4
            java.util.List<o.throwIfFinished> r0 = r0.c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x007b
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L_0x005c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x007b
            r0 = r7
            java.lang.Object r0 = r0.next()
            o.throwIfFinished r0 = (o.throwIfFinished) r0
            o.Accumulator r0 = r0.c()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x005c
            goto L_0x007d
        L_0x007b:
            r0 = 0
            r5 = r0
        L_0x007d:
            r0 = r6
            r1 = r5
            r0.j = r1
            r0 = r6
            o.Accumulator r0 = r0.j
            if (r0 == 0) goto L_0x00c6
            r0 = r6
            o.Accumulator r0 = r0.j
            o.enableDumpapp[] r0 = r0.b()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L_0x009a:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L_0x00cb
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r5 = r0
            r0 = r6
            r1 = r5
            java.lang.reflect.Method r1 = r1.d
            r2 = r5
            java.lang.Class<?> r2 = r2.c
            boolean r0 = r0.d(r1, r2)
            if (r0 == 0) goto L_0x00c0
            r0 = r6
            java.util.List<o.enableDumpapp> r0 = r0.g
            r1 = r5
            boolean r0 = r0.add(r1)
        L_0x00c0:
            int r9 = r9 + 1
            goto L_0x009a
        L_0x00c6:
            r0 = r4
            r1 = r6
            r0.b(r1)
        L_0x00cb:
            r0 = r6
            r0.b()
            goto L_0x0018
        L_0x00d2:
            r0 = r6
            java.util.List r0 = e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableWebKitInspector.d(java.lang.Class):java.util.List");
    }

    private static List<enableDumpapp> e(enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver enablewebkitinspector_mediabrowsercompat_customactionresultreceiver) {
        ArrayList arrayList = new ArrayList(enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.g);
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.g.clear();
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.e.clear();
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.f.clear();
        int i = 0;
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.d.setLength(0);
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.a = null;
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.c = null;
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.b = false;
        enablewebkitinspector_mediabrowsercompat_customactionresultreceiver.j = null;
        synchronized (e) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver[] enablewebkitinspector_mediabrowsercompat_customactionresultreceiverArr = e;
                if (enablewebkitinspector_mediabrowsercompat_customactionresultreceiverArr[i] == null) {
                    enablewebkitinspector_mediabrowsercompat_customactionresultreceiverArr[i] = enablewebkitinspector_mediabrowsercompat_customactionresultreceiver;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    final List<enableDumpapp> e(Class<?> cls) {
        Map<Class<?>, List<enableDumpapp>> map = a;
        List<enableDumpapp> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<enableDumpapp> a2 = this.b ? a(cls) : d(cls);
        if (!a2.isEmpty()) {
            map.put(cls, a2);
            return a2;
        }
        StringBuilder sb = new StringBuilder("Subscriber ");
        sb.append(cls);
        sb.append(" and its super classes have no public methods with the @Subscribe annotation");
        throw new EventBusException(sb.toString());
    }
}
