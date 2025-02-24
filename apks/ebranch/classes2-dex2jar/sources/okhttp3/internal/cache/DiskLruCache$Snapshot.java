package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;
import o.defaultInspectorModulesProvider;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache/DiskLruCache$Snapshot.class */
public final class DiskLruCache$Snapshot implements Closeable {
    private final String key;
    private final long[] lengths;
    private final long sequenceNumber;
    private final defaultInspectorModulesProvider[] sources;
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$Snapshot(DiskLruCache diskLruCache, String str, long j, defaultInspectorModulesProvider[] defaultinspectormodulesproviderArr, long[] jArr) {
        this.this$0 = diskLruCache;
        this.key = str;
        this.sequenceNumber = j;
        this.sources = defaultinspectormodulesproviderArr;
        this.lengths = jArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (Closeable closeable : this.sources) {
            Util.closeQuietly(closeable);
        }
    }

    @Nullable
    public final DiskLruCache.Editor edit() throws IOException {
        return this.this$0.edit(this.key, this.sequenceNumber);
    }

    public final long getLength(int i) {
        return this.lengths[i];
    }

    public final defaultInspectorModulesProvider getSource(int i) {
        return this.sources[i];
    }

    public final String key() {
        return this.key;
    }
}
