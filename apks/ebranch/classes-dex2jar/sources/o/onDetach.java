package o;

import java.util.Objects;
/* loaded from: classes-dex2jar.jar:o/onDetach.class */
public class onDetach {
    public static String a(Object obj, String str) {
        if (obj != null) {
            str = obj.toString();
        }
        return str;
    }

    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int c(Object... objArr) {
        return Objects.hash(objArr);
    }
}
