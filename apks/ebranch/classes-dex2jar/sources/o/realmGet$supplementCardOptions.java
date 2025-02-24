package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$supplementCardOptions.class */
public abstract class realmGet$supplementCardOptions {
    final Unsafe c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$supplementCardOptions(Unsafe unsafe) {
        this.c = unsafe;
    }

    public final long a(Object obj, long j) {
        return this.c.getLong(obj, j);
    }

    public abstract void a(Object obj, long j, double d);

    public abstract void a(Object obj, long j, float f);

    public final int b(Class<?> cls) {
        return this.c.arrayIndexScale(cls);
    }

    public abstract boolean b(Object obj, long j);

    public final int c(Object obj, long j) {
        return this.c.getInt(obj, j);
    }

    public abstract void c(Object obj, long j, boolean z);

    public abstract double d(Object obj, long j);

    public final int d(Class<?> cls) {
        return this.c.arrayBaseOffset(cls);
    }

    public abstract void d(Object obj, long j, byte b);

    public final void d(Object obj, long j, long j2) {
        this.c.putLong(obj, j, j2);
    }

    public abstract float e(Object obj, long j);

    public final long e(Field field) {
        return this.c.objectFieldOffset(field);
    }

    public final void e(Object obj, long j, int i) {
        this.c.putInt(obj, j, i);
    }

    public final void e(Object obj, long j, Object obj2) {
        this.c.putObject(obj, j, obj2);
    }

    public final Object h(Object obj, long j) {
        return this.c.getObject(obj, j);
    }
}
