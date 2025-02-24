package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/performPictureInPictureModeChanged.class */
public abstract class performPictureInPictureModeChanged {
    private final Map<String, Object> a = new HashMap();
    private volatile boolean d = false;

    public final <T> T a(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T c(String str, T t) {
        Object obj;
        synchronized (this.a) {
            obj = this.a.get(str);
            if (obj == null) {
                this.a.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.d && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.d = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.a.values()) {
                    if (obj instanceof Closeable) {
                        try {
                            ((Closeable) obj).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        a();
    }
}
