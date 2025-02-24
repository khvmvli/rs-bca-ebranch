package o;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;
/* loaded from: classes-dex2jar.jar:o/subscribeReservationRescheduleEvent.class */
public class subscribeReservationRescheduleEvent {
    private subscribeReservationRescheduleEvent() {
    }

    public static int a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        return i < 0 ? -1 : i == 0 ? 0 : 1;
    }

    private static <T extends Throwable> T a(T t) {
        return (T) c((Throwable) t, subscribeReservationRescheduleEvent.class.getName());
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((IllegalStateException) a(new IllegalStateException(sb.toString())));
        }
    }

    public static boolean a(Double d, double d2) {
        return d != null && d.doubleValue() == 0.0d;
    }

    public static String b(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalArgumentException) a(new IllegalArgumentException(c(str))));
        }
    }

    private static void b(String str) {
        throw ((UninitializedPropertyAccessException) c(new UninitializedPropertyAccessException(str), subscribeReservationRescheduleEvent.class.getName()));
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static String c(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }

    static <T extends Throwable> T c(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw ((NullPointerException) a(new NullPointerException()));
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) a(new NullPointerException(str)));
        }
    }

    public static int d(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((NullPointerException) a(new NullPointerException(sb.toString())));
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) a(new NullPointerException(c(str))));
        }
    }

    public static void e(String str) {
        StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        b(sb.toString());
    }
}
