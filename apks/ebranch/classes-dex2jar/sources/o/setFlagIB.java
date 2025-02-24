package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setFlagIB.class */
public final class setFlagIB {

    /* loaded from: classes-dex2jar.jar:o/setFlagIB$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private final Object d;
        private final List e;

        public /* synthetic */ IconCompatParcelizer(Object obj) {
            if (obj != null) {
                this.d = obj;
                this.e = new ArrayList();
                return;
            }
            throw new NullPointerException("null reference");
        }

        public final IconCompatParcelizer b(String str, Object obj) {
            if (str != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("=");
                sb.append(valueOf);
                this.e.add(sb.toString());
                return this;
            }
            throw new NullPointerException("null reference");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.d.getClass().getSimpleName());
            sb.append('{');
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.e.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean d(Object obj, Object obj2) {
        boolean z = false;
        if (obj != obj2) {
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    public static IconCompatParcelizer e(Object obj) {
        return new IconCompatParcelizer(obj);
    }
}
