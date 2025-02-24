package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache/DiskLruCache$3.class */
class DiskLruCache$3 implements Iterator<DiskLruCache$Snapshot> {
    final Iterator<DiskLruCache.Entry> delegate;
    DiskLruCache$Snapshot nextSnapshot;
    DiskLruCache$Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$3(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        this.delegate = new ArrayList(diskLruCache.lruEntries.values()).iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        DiskLruCache$Snapshot snapshot;
        if (this.nextSnapshot != null) {
            return true;
        }
        synchronized (this.this$0) {
            if (this.this$0.closed) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next.readable && (snapshot = next.snapshot()) != null) {
                    this.nextSnapshot = snapshot;
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Iterator
    public DiskLruCache$Snapshot next() {
        if (hasNext()) {
            DiskLruCache$Snapshot diskLruCache$Snapshot = this.nextSnapshot;
            this.removeSnapshot = diskLruCache$Snapshot;
            this.nextSnapshot = null;
            return diskLruCache$Snapshot;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache$Snapshot diskLruCache$Snapshot = this.removeSnapshot;
        if (diskLruCache$Snapshot != null) {
            try {
                this.this$0.remove(diskLruCache$Snapshot.key);
            } catch (IOException e) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }
}
