package o;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedExceptionAction;
/* loaded from: classes2-dex2jar.jar:o/ListUtil$MediaBrowserCompat$CustomActionResultReceiver.class */
abstract class ListUtil$MediaBrowserCompat$CustomActionResultReceiver<T, E extends AccessibleObject> implements PrivilegedExceptionAction<T> {
    private final E a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ListUtil$MediaBrowserCompat$CustomActionResultReceiver(E e) {
        this.a = e;
    }

    public abstract T a(E e) throws Exception;

    @Override // java.security.PrivilegedExceptionAction
    public T run() throws Exception {
        boolean isAccessible = this.a.isAccessible();
        this.a.setAccessible(true);
        T a = a(this.a);
        this.a.setAccessible(isAccessible);
        return a;
    }
}
