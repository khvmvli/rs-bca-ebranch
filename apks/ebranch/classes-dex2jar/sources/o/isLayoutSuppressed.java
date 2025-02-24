package o;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes-dex2jar.jar:o/isLayoutSuppressed.class */
public final class isLayoutSuppressed {
    private static final Map<String, Lock> a = new HashMap();
    public final File b;
    public final Lock c;
    public FileChannel d;
    public final boolean e;

    public isLayoutSuppressed(String str, File file, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        File file2 = new File(file, sb.toString());
        this.b = file2;
        this.c = c(file2.getAbsolutePath());
        this.e = z;
    }

    private static Lock c(String str) {
        Lock lock;
        Map<String, Lock> map = a;
        synchronized (map) {
            Lock lock2 = map.get(str);
            lock = lock2;
            if (lock2 == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public final void b() {
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
            }
        }
        this.c.unlock();
    }
}
