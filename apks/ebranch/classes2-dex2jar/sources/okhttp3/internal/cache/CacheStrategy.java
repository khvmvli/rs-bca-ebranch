package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache/CacheStrategy.class */
public final class CacheStrategy {
    @Nullable
    public final Response cacheResponse;
    @Nullable
    public final Request networkRequest;

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache/CacheStrategy$Factory.class */
    public static class Factory {
        private int ageSeconds;
        final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        final long nowMillis;
        private long receivedResponseMillis;
        final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long j, Request request, Response response) {
            this.ageSeconds = -1;
            this.nowMillis = j;
            this.request = request;
            this.cacheResponse = response;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    String value = headers.value(i);
                    if ("Date".equalsIgnoreCase(name)) {
                        this.servedDate = HttpDate.parse(value);
                        this.servedDateString = value;
                    } else if ("Expires".equalsIgnoreCase(name)) {
                        this.expires = HttpDate.parse(value);
                    } else if ("Last-Modified".equalsIgnoreCase(name)) {
                        this.lastModified = HttpDate.parse(value);
                        this.lastModifiedString = value;
                    } else if ("ETag".equalsIgnoreCase(name)) {
                        this.etag = value;
                    } else if ("Age".equalsIgnoreCase(name)) {
                        this.ageSeconds = HttpHeaders.parseSeconds(value, -1);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v4 */
        private long cacheResponseAge() {
            Date date = this.servedDate;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.receivedResponseMillis - date.getTime());
            }
            boolean z = j == 1 ? 1 : 0;
            if (this.ageSeconds != -1) {
                z = Math.max(j == 1 ? 1 : 0, TimeUnit.SECONDS.toMillis((long) this.ageSeconds));
            }
            long j2 = this.receivedResponseMillis;
            return (z == true ? 1 : 0) + (j2 - this.sentRequestMillis) + (this.nowMillis - j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v39, types: [long] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private long computeFreshnessLifetime() {
            /*
                r5 = this;
                r0 = r5
                okhttp3.Response r0 = r0.cacheResponse
                okhttp3.CacheControl r0 = r0.cacheControl()
                r6 = r0
                r0 = r6
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 == r1) goto L_0x001c
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                r1 = r6
                int r1 = r1.maxAgeSeconds()
                long r1 = (long) r1
                long r0 = r0.toMillis(r1)
                return r0
            L_0x001c:
                r0 = r5
                java.util.Date r0 = r0.expires
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = r6
                if (r0 == 0) goto L_0x0057
                r0 = r5
                java.util.Date r0 = r0.servedDate
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L_0x0039
                r0 = r6
                long r0 = r0.getTime()
                r9 = r0
                goto L_0x003f
            L_0x0039:
                r0 = r5
                long r0 = r0.receivedResponseMillis
                r9 = r0
            L_0x003f:
                r0 = r5
                java.util.Date r0 = r0.expires
                long r0 = r0.getTime()
                r1 = r9
                long r0 = r0 - r1
                r9 = r0
                r0 = r9
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0055
                r0 = r9
                r7 = r0
            L_0x0055:
                r0 = r7
                return r0
            L_0x0057:
                r0 = r7
                r9 = r0
                r0 = r5
                java.util.Date r0 = r0.lastModified
                if (r0 == 0) goto L_0x00aa
                r0 = r7
                r9 = r0
                r0 = r5
                okhttp3.Response r0 = r0.cacheResponse
                okhttp3.Request r0 = r0.request()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.query()
                if (r0 != 0) goto L_0x00aa
                r0 = r5
                java.util.Date r0 = r0.servedDate
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L_0x0086
                r0 = r6
                long r0 = r0.getTime()
                r9 = r0
                goto L_0x008c
            L_0x0086:
                r0 = r5
                long r0 = r0.sentRequestMillis
                r9 = r0
            L_0x008c:
                r0 = r9
                r1 = r5
                java.util.Date r1 = r1.lastModified
                long r1 = r1.getTime()
                long r0 = r0 - r1
                r11 = r0
                r0 = r7
                r9 = r0
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x00aa
                r0 = r11
                r1 = 10
                long r0 = r0 / r1
                r9 = r0
            L_0x00aa:
                r0 = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Factory.computeFreshnessLifetime():long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v23, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [long] */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private okhttp3.internal.cache.CacheStrategy getCandidate() {
            /*
            // Method dump skipped, instructions count: 433
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Factory.getCandidate():okhttp3.internal.cache.CacheStrategy");
        }

        private static boolean hasConditions(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }

        private boolean isFreshnessLifetimeHeuristic() {
            return this.cacheResponse.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        public CacheStrategy get() {
            CacheStrategy candidate = getCandidate();
            CacheStrategy cacheStrategy = candidate;
            if (candidate.networkRequest != null) {
                cacheStrategy = candidate;
                if (this.request.cacheControl().onlyIfCached()) {
                    cacheStrategy = new CacheStrategy(null, null);
                }
            }
            return cacheStrategy;
        }
    }

    CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public static boolean isCacheable(Response response, Request request) {
        int code = response.code();
        if (!(code == 200 || code == 410 || code == 414 || code == 501 || code == 203 || code == 204)) {
            if (code != 307) {
                if (!(code == 308 || code == 404 || code == 405)) {
                    switch (code) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (response.header("Expires") == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                return false;
            }
        }
        boolean z = false;
        if (!response.cacheControl().noStore()) {
            z = false;
            if (!request.cacheControl().noStore()) {
                z = true;
            }
        }
        return z;
    }
}
