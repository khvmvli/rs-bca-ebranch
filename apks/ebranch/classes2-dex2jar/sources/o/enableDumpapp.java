package o;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2-dex2jar.jar:o/enableDumpapp.class */
public final class enableDumpapp {
    String a;
    final int b;
    final Class<?> c;
    final Method d;
    final boolean e;
    final ThreadMode f;

    public enableDumpapp(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.d = method;
        this.f = threadMode;
        this.c = cls;
        this.b = i;
        this.e = z;
    }

    private void e() {
        synchronized (this) {
            if (this.a == null) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(this.d.getDeclaringClass().getName());
                sb.append('#');
                sb.append(this.d.getName());
                sb.append('(');
                sb.append(this.c.getName());
                this.a = sb.toString();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof enableDumpapp)) {
            return false;
        }
        e();
        enableDumpapp enabledumpapp = (enableDumpapp) obj;
        enabledumpapp.e();
        return this.a.equals(enabledumpapp.a);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
