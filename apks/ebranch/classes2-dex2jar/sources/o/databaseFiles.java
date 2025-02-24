package o;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2-dex2jar.jar:o/databaseFiles.class */
public final class databaseFiles {
    private static final ExecutorService n = Executors.newCachedThreadPool();
    boolean a;
    excludeSqliteDatabaseDriver f;
    start g;
    boolean j;
    boolean l;
    List<throwIfFinished> m;
    boolean e = true;
    boolean c = true;
    boolean h = true;
    boolean i = true;
    boolean b = true;
    ExecutorService d = n;

    databaseFiles() {
    }

    static Object b() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException e) {
            return null;
        }
    }
}
