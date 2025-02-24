package okhttp3;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import o.ChuckerDatabase;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
/* loaded from: classes2-dex2jar.jar:okhttp3/Cache$2.class */
class Cache$2 implements Iterator<String> {
    boolean canRemove;
    final Iterator<DiskLruCache$Snapshot> delegate;
    @Nullable
    String nextUrl;
    final /* synthetic */ Cache this$0;

    Cache$2(Cache cache) throws IOException {
        this.this$0 = cache;
        this.delegate = cache.cache.snapshots();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextUrl != null) {
            return true;
        }
        this.canRemove = false;
        while (this.delegate.hasNext()) {
            DiskLruCache$Snapshot next = this.delegate.next();
            try {
                this.nextUrl = ChuckerDatabase.b(next.getSource(0)).r();
                next.close();
                return true;
            } catch (IOException e) {
                next.close();
            } catch (Throwable th) {
                next.close();
                throw th;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }
}
