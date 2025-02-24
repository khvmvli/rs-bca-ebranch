package okhttp3;

import java.io.IOException;
import javax.annotation.Nullable;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.setResponsePayloadSize;
import o.setTookMs;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
/* loaded from: classes2-dex2jar.jar:okhttp3/Cache$CacheResponseBody.class */
class Cache$CacheResponseBody extends ResponseBody {
    private final setTookMs bodySource;
    @Nullable
    private final String contentLength;
    @Nullable
    private final String contentType;
    final DiskLruCache$Snapshot snapshot;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cache$CacheResponseBody(final DiskLruCache$Snapshot diskLruCache$Snapshot, String str, String str2) {
        this.snapshot = diskLruCache$Snapshot;
        this.contentType = str;
        this.contentLength = str2;
        this.bodySource = ChuckerDatabase.b((defaultInspectorModulesProvider) new setResponsePayloadSize(diskLruCache$Snapshot.getSource(1)) { // from class: okhttp3.Cache$CacheResponseBody.1
            @Override // o.setResponsePayloadSize
            public void close() throws IOException {
                diskLruCache$Snapshot.close();
                close();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long contentLength() {
        /*
            r3 = this;
            r0 = -1
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.contentLength     // Catch: NumberFormatException -> 0x0019
            r6 = r0
            r0 = r4
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0016
            r0 = r6
            long r0 = java.lang.Long.parseLong(r0)     // Catch: NumberFormatException -> 0x0019
            r7 = r0
        L_0x0016:
            r0 = r7
            return r0
        L_0x0019:
            r6 = move-exception
            r0 = r4
            r7 = r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache$CacheResponseBody.contentLength():long");
    }

    public MediaType contentType() {
        String str = this.contentType;
        return str != null ? MediaType.parse(str) : null;
    }

    public setTookMs source() {
        return this.bodySource;
    }
}
