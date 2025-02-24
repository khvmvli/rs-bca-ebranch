package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes-dex2jar.jar:o/realmGet$jobSector.class */
public final class realmGet$jobSector {
    static final boolean a;
    private static final boolean b;
    private static final Class<?> c = setBirthDate.b();
    private static final Unsafe d;
    static final long e;
    private static final boolean f;
    private static final boolean g;
    private static final realmGet$supplementCardOptions i;
    private static final boolean j;

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020f  */
    static {
        /*
        // Method dump skipped, instructions count: 534
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$jobSector.m828clinit():void");
    }

    private realmGet$jobSector() {
    }

    public static float a(Object obj, long j2) {
        return i.e(obj, j2);
    }

    private static Field a(Class<?> cls, String str) {
        Field field;
        try {
            field = cls.getDeclaredField(str);
        } catch (Throwable th) {
            field = null;
        }
        return field;
    }

    public static void a(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        realmGet$supplementCardOptions realmget_supplementcardoptions = i;
        int c2 = realmget_supplementcardoptions.c(obj, j3);
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        realmget_supplementcardoptions.e(obj, j3, (((255 << i2) ^ -1) & c2) | ((b2 & 255) << i2));
    }

    static /* synthetic */ void a(Throwable th) {
        Logger logger = Logger.getLogger(realmGet$jobSector.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    public static boolean a() {
        return j;
    }

    private static int b(Class<?> cls) {
        if (j) {
            return i.b(cls);
        }
        return -1;
    }

    public static Unsafe b() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.realmGet$relationship
                public static final Unsafe a() throws Exception {
                    Field[] declaredFields = Unsafe.class.getDeclaredFields();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }

                @Override // java.security.PrivilegedExceptionAction
                public final /* synthetic */ Unsafe run() throws Exception {
                    return a();
                }
            });
        } catch (Throwable th) {
            unsafe = null;
        }
        return unsafe;
    }

    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        realmGet$supplementCardOptions realmget_supplementcardoptions = i;
        int c2 = realmget_supplementcardoptions.c(obj, j3);
        int i2 = (((int) j2) & 3) << 3;
        realmget_supplementcardoptions.e(obj, j3, (((255 << i2) ^ -1) & c2) | ((b2 & 255) << i2));
    }

    public static void b(Object obj, long j2, long j3) {
        i.d(obj, j2, j3);
    }

    public static void b(byte[] bArr, long j2, byte b2) {
        i.d((Object) bArr, e + j2, b2);
    }

    public static boolean b(Object obj, long j2) {
        return i.b(obj, j2);
    }

    private static int c(Class<?> cls) {
        if (j) {
            return i.d(cls);
        }
        return -1;
    }

    public static int c(Object obj, long j2) {
        return i.c(obj, j2);
    }

    public static void c(Object obj, long j2, double d2) {
        i.a(obj, j2, d2);
    }

    public static boolean c() {
        return f;
    }

    public static double d(Object obj, long j2) {
        return i.d(obj, j2);
    }

    private static Field d() {
        int i2 = setBirthDate.c;
        Field a2 = a(Buffer.class, "effectiveDirectAddress");
        Field field = a2;
        if (a2 == null) {
            Field a3 = a(Buffer.class, "address");
            if (a3 != null && a3.getType() == Long.TYPE) {
                return a3;
            }
            field = null;
        }
        return field;
    }

    public static void d(Object obj, long j2, float f2) {
        i.a(obj, j2, f2);
    }

    public static void d(Object obj, long j2, boolean z) {
        i.c(obj, j2, z);
    }

    static boolean d(Class<?> cls) {
        int i2 = setBirthDate.c;
        try {
            Class<?> cls2 = c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    public static long e(Object obj, long j2) {
        return i.a(obj, j2);
    }

    public static <T> T e(Class<T> cls) {
        try {
            return (T) d.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void e(Object obj, long j2, int i2) {
        i.e(obj, j2, i2);
    }

    public static void e(Object obj, long j2, Object obj2) {
        i.e(obj, j2, obj2);
    }

    public static Object f(Object obj, long j2) {
        return i.h(obj, j2);
    }

    public static /* synthetic */ boolean g(Object obj, long j2) {
        return ((byte) ((i.c(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean j(Object obj, long j2) {
        return ((byte) ((i.c(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3))) & 255)) != 0;
    }
}
