package o;
/* loaded from: classes2-dex2jar.jar:o/remove.class */
public final class remove {
    public static void b(String str, boolean z) {
        if (!z) {
            StringBuilder sb = new StringBuilder("state should be: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <T> T e(String str, T t) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" can not be null");
        throw new IllegalArgumentException(sb.toString());
    }
}
