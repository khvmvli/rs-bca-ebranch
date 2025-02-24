package o;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import o.Stetho;
import o.excludeSqliteDatabaseDriver;
import o.start;
import org.greenrobot.eventbus.EventBusException;
/* loaded from: classes-dex2jar.jar:o/documentProvider.class */
public class documentProvider {
    public static String a = "EventBus";
    static volatile documentProvider e;
    final start c;
    final ExecutorService d;
    private final boolean g;
    private final Stetho.DefaultInspectorModulesBuilder h;
    private final resolveDocumentProvider i;
    private final ThreadLocal<IconCompatParcelizer> j;
    private final Stetho.InitializerBuilder k;
    private final boolean l;
    private final int m;
    private final excludeSqliteDatabaseDriver n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f137o;
    private final enableWebKitInspector p;
    private final Map<Class<?>, CopyOnWriteArrayList<store>> q;
    private final Map<Class<?>, Object> r;
    private final boolean s;
    private final boolean t;
    private final boolean v;
    private final Map<Object, List<Class<?>>> w;
    private static final databaseFiles b = new databaseFiles();
    private static final Map<Class<?>, List<Class<?>>> f = new HashMap();

    public documentProvider() {
        this(b);
    }

    private documentProvider(databaseFiles databasefiles) {
        Object b2;
        this.j = new 2(this);
        start.write write = databasefiles.g;
        this.c = write == null ? (!start.write.a() || databaseFiles.b() == null) ? new start.RemoteActionCompatParcelizer() : new start.write("EventBus") : write;
        this.q = new HashMap();
        this.w = new HashMap();
        this.r = new ConcurrentHashMap();
        excludeSqliteDatabaseDriver.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = databasefiles.f;
        Stetho.InitializerBuilder initializerBuilder = null;
        excludeSqliteDatabaseDriver.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2 = customActionResultReceiver == null ? (!start.write.a() || (b2 = databaseFiles.b()) == null) ? null : new excludeSqliteDatabaseDriver.MediaBrowserCompat.CustomActionResultReceiver((Looper) b2) : customActionResultReceiver;
        this.n = customActionResultReceiver2;
        this.k = customActionResultReceiver2 != null ? customActionResultReceiver2.d(this) : initializerBuilder;
        this.h = new Stetho.DefaultInspectorModulesBuilder(this);
        this.i = new resolveDocumentProvider(this);
        this.m = databasefiles.m != null ? databasefiles.m.size() : 0;
        this.p = new enableWebKitInspector(databasefiles.m, databasefiles.j, databasefiles.a);
        this.f137o = databasefiles.e;
        this.l = databasefiles.c;
        this.t = databasefiles.h;
        this.s = databasefiles.i;
        this.v = databasefiles.l;
        this.g = databasefiles.b;
        this.d = databasefiles.d;
    }

    private static List<Class<?>> a(Class<?> cls) {
        ArrayList arrayList;
        Map<Class<?>, List<Class<?>>> map = f;
        synchronized (map) {
            List<Class<?>> list = map.get(cls);
            arrayList = list;
            if (list == null) {
                ArrayList arrayList2 = new ArrayList();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    arrayList2.add(cls2);
                    c(arrayList2, cls2.getInterfaces());
                }
                f.put(cls, arrayList2);
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    private void a(Object obj, enableDumpapp enabledumpapp) {
        Class<?> cls = enabledumpapp.c;
        store store = new store(obj, enabledumpapp);
        CopyOnWriteArrayList<store> copyOnWriteArrayList = this.q.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.q.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(store)) {
            StringBuilder sb = new StringBuilder("Subscriber ");
            sb.append(obj.getClass());
            sb.append(" already registered to event ");
            sb.append(cls);
            throw new EventBusException(sb.toString());
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || enabledumpapp.b > copyOnWriteArrayList.get(i).a.b) {
                copyOnWriteArrayList.add(i, store);
                break;
            }
        }
        List<Class<?>> list = this.w.get(obj);
        List<Class<?>> list2 = list;
        if (list == null) {
            list2 = new ArrayList<>();
            this.w.put(obj, list2);
        }
        list2.add(cls);
        if (!enabledumpapp.e) {
            return;
        }
        if (this.g) {
            for (Map.Entry<Class<?>, Object> entry : this.r.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    c(store, entry.getValue());
                }
            }
            return;
        }
        c(store, this.r.get(cls));
    }

    private void a(store store, Object obj, Throwable th) {
        if (obj instanceof create) {
            if (this.f137o) {
                start start = this.c;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("SubscriberExceptionEvent subscriber ");
                sb.append(store.c.getClass());
                sb.append(" threw an exception");
                start.e(level, sb.toString(), th);
                create create = (create) obj;
                start start2 = this.c;
                Level level2 = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("Initial event ");
                sb2.append(create.d);
                sb2.append(" caused exception in ");
                sb2.append(create.a);
                start2.e(level2, sb2.toString(), create.b);
            }
        } else if (!this.v) {
            if (this.f137o) {
                start start3 = this.c;
                Level level3 = Level.SEVERE;
                StringBuilder sb3 = new StringBuilder("Could not dispatch event: ");
                sb3.append(obj.getClass());
                sb3.append(" to subscribing class ");
                sb3.append(store.c.getClass());
                start3.e(level3, sb3.toString(), th);
            }
            if (this.t) {
                d(new create(this, th, obj, store.c));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    private boolean a(Object obj, IconCompatParcelizer iconCompatParcelizer, Class<?> cls) {
        CopyOnWriteArrayList<store> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.q.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<store> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            store next = it.next();
            iconCompatParcelizer.c = obj;
            iconCompatParcelizer.f = next;
            try {
                b(next, obj, iconCompatParcelizer.d);
                if (iconCompatParcelizer.e) {
                    return true;
                }
            } finally {
                iconCompatParcelizer.c = null;
                iconCompatParcelizer.f = null;
                iconCompatParcelizer.e = false;
            }
        }
        return true;
    }

    public static documentProvider b() {
        if (e == null) {
            synchronized (documentProvider.class) {
                try {
                    if (e == null) {
                        e = new documentProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    private void b(store store, Object obj, boolean z) {
        int i = 1.c[store.a.f.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Stetho.InitializerBuilder initializerBuilder = this.k;
                    if (initializerBuilder != null) {
                        initializerBuilder.a(store, obj);
                        return;
                    } else {
                        a(store, obj);
                        return;
                    }
                } else if (i != 4) {
                    if (i == 5) {
                        Runnable runnable = this.i;
                        ((resolveDocumentProvider) runnable).b.a(runtimeRepl.c(store, obj));
                        ((resolveDocumentProvider) runnable).e.d.execute(runnable);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Unknown thread mode: ");
                    sb.append(store.a.f);
                    throw new IllegalStateException(sb.toString());
                } else if (z) {
                    this.h.a(store, obj);
                    return;
                } else {
                    a(store, obj);
                    return;
                }
            } else if (!z) {
                this.k.a(store, obj);
                return;
            }
        }
        a(store, obj);
    }

    private void c(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<store> copyOnWriteArrayList = this.q.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                store store = copyOnWriteArrayList.get(i);
                size = size;
                int i2 = i;
                if (store.c == obj) {
                    store.e = false;
                    copyOnWriteArrayList.remove(i);
                    i2 = i - 1;
                    size--;
                }
                i = i2 + 1;
            }
        }
    }

    private void c(Object obj, IconCompatParcelizer iconCompatParcelizer) throws Error {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.g) {
            List<Class<?>> a2 = a(cls);
            int size = a2.size();
            boolean z2 = false;
            int i = 0;
            while (true) {
                z = z2;
                if (i >= size) {
                    break;
                }
                z2 |= a(obj, iconCompatParcelizer, a2.get(i));
                i++;
            }
        } else {
            z = a(obj, iconCompatParcelizer, cls);
        }
        if (!z) {
            if (this.l) {
                start start = this.c;
                Level level = Level.FINE;
                StringBuilder sb = new StringBuilder("No subscribers registered for event ");
                sb.append(cls);
                start.e(level, sb.toString());
            }
            if (this.s && cls != provideDatabaseDriver.class && cls != create.class) {
                d(new provideDatabaseDriver(this, obj));
            }
        }
    }

    private static void c(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                c(list, cls.getInterfaces());
            }
        }
    }

    private void c(store store, Object obj) {
        if (obj != null) {
            excludeSqliteDatabaseDriver excludesqlitedatabasedriver = this.n;
            b(store, obj, excludesqlitedatabasedriver != null ? excludesqlitedatabasedriver.d() : true);
        }
    }

    final void a(store store, Object obj) {
        try {
            store.a.d.invoke(store.c, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e3) {
            a(store, obj, e3.getCause());
        }
    }

    public final boolean b(Object obj) {
        boolean containsKey;
        synchronized (this) {
            containsKey = this.w.containsKey(obj);
        }
        return containsKey;
    }

    public final void c(Object obj) {
        List<enableDumpapp> e2 = this.p.e(obj.getClass());
        synchronized (this) {
            for (enableDumpapp enabledumpapp : e2) {
                a(obj, enabledumpapp);
            }
        }
    }

    public final void d(Object obj) {
        IconCompatParcelizer iconCompatParcelizer = this.j.get();
        List list = iconCompatParcelizer.b;
        list.add(obj);
        if (!iconCompatParcelizer.a) {
            excludeSqliteDatabaseDriver excludesqlitedatabasedriver = this.n;
            iconCompatParcelizer.d = excludesqlitedatabasedriver != null ? excludesqlitedatabasedriver.d() : true;
            iconCompatParcelizer.a = true;
            if (!iconCompatParcelizer.e) {
                while (!list.isEmpty()) {
                    try {
                        c(list.remove(0), iconCompatParcelizer);
                    } finally {
                        iconCompatParcelizer.a = false;
                        iconCompatParcelizer.d = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    public final void e(Object obj) {
        synchronized (this) {
            List<Class<?>> list = this.w.get(obj);
            if (list != null) {
                for (Class<?> cls : list) {
                    c(obj, cls);
                }
                this.w.remove(obj);
            } else {
                start start = this.c;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder("Subscriber to unregister was not registered before: ");
                sb.append(obj.getClass());
                start.e(level, sb.toString());
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventBus[indexCount=");
        sb.append(this.m);
        sb.append(", eventInheritance=");
        sb.append(this.g);
        sb.append("]");
        return sb.toString();
    }
}
