package o;

import io.realm.RealmFieldTypeConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver.class */
final class enableWebKitInspector$MediaBrowserCompat$CustomActionResultReceiver {
    Class<?> a;
    boolean b;
    Class<?> c;
    Accumulator j;
    final List<enableDumpapp> g = new ArrayList();
    final Map<Class, Object> e = new HashMap();
    final Map<String, Class> f = new HashMap();
    final StringBuilder d = new StringBuilder((int) RealmFieldTypeConstants.LIST_OFFSET);

    private boolean e(Method method, Class<?> cls) {
        this.d.setLength(0);
        this.d.append(method.getName());
        StringBuilder sb = this.d;
        sb.append('>');
        sb.append(cls.getName());
        String obj = this.d.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        Class put = this.f.put(obj, declaringClass);
        if (put == null || put.isAssignableFrom(declaringClass)) {
            return true;
        }
        this.f.put(obj, put);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (!this.b) {
            Class<? super Object> superclass = this.c.getSuperclass();
            this.c = superclass;
            String name = superclass.getName();
            if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                return;
            }
        }
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(Method method, Class<?> cls) {
        Object put = this.e.put(cls, method);
        if (put == null) {
            return true;
        }
        if (put instanceof Method) {
            if (e((Method) put, cls)) {
                this.e.put(cls, this);
            } else {
                throw new IllegalStateException();
            }
        }
        return e(method, cls);
    }
}
