package okhttp3.internal.cache;

import java.io.IOException;
import o.initialize;
import okhttp3.internal.cache.DiskLruCache;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache/DiskLruCache$Editor$1.class */
class DiskLruCache$Editor$1 extends FaultHidingSink {
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$1(DiskLruCache.Editor editor, initialize initialize) {
        super(initialize);
        this.this$1 = editor;
    }

    @Override // okhttp3.internal.cache.FaultHidingSink
    protected void onException(IOException iOException) {
        synchronized (this.this$1.this$0) {
            this.this$1.detach();
        }
    }
}
