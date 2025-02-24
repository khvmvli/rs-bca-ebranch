package o;

import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/getSavedStateRegistry.class */
final class getSavedStateRegistry {
    public static final ThreadLocal<getSavedStateRegistry> a = new ThreadLocal<>();
    read f;
    final setCollapseIcon<write, Long> c = new setCollapseIcon<>();
    final ArrayList<write> e = new ArrayList<>();
    final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer();
    long b = 0;
    boolean h = false;

    /* loaded from: classes-dex2jar.jar:o/getSavedStateRegistry$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSavedStateRegistry$read.class */
    static abstract class read {
        final RemoteActionCompatParcelizer b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.b = remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void d();
    }

    /* loaded from: classes-dex2jar.jar:o/getSavedStateRegistry$write.class */
    interface write {
        boolean e(long j);
    }

    getSavedStateRegistry() {
    }

    public static getSavedStateRegistry c() {
        ThreadLocal<getSavedStateRegistry> threadLocal = a;
        if (threadLocal.get() == null) {
            threadLocal.set(new getSavedStateRegistry());
        }
        return threadLocal.get();
    }
}
