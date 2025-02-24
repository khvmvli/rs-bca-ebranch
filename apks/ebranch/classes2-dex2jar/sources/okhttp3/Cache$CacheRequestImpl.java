package okhttp3;

import java.io.IOException;
import o.initialize;
import o.setResponseTlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
/* loaded from: classes2-dex2jar.jar:okhttp3/Cache$CacheRequestImpl.class */
final class Cache$CacheRequestImpl implements CacheRequest {
    private initialize body;
    private initialize cacheOut;
    boolean done;
    private final DiskLruCache.Editor editor;
    final /* synthetic */ Cache this$0;

    Cache$CacheRequestImpl(final Cache cache, final DiskLruCache.Editor editor) {
        this.this$0 = cache;
        this.editor = editor;
        this.cacheOut = editor.newSink(1);
        this.body = new setResponseTlsVersion(this.cacheOut) { // from class: okhttp3.Cache$CacheRequestImpl.1
            @Override // o.setResponseTlsVersion
            public void close() throws IOException {
                synchronized (Cache$CacheRequestImpl.this.this$0) {
                    if (!Cache$CacheRequestImpl.this.done) {
                        Cache$CacheRequestImpl.this.done = true;
                        Cache$CacheRequestImpl.this.this$0.writeSuccessCount++;
                        close();
                        editor.commit();
                    }
                }
            }
        };
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final void abort() {
        synchronized (this.this$0) {
            if (!this.done) {
                this.done = true;
                this.this$0.writeAbortCount++;
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException e) {
                }
            }
        }
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final initialize body() {
        return this.body;
    }
}
