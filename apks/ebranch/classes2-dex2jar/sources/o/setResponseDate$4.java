package o;

import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:o/setResponseDate$4.class */
final class setResponseDate$4 implements initialize {
    final /* synthetic */ setResponseDate b;
    final /* synthetic */ initialize c;

    setResponseDate$4(setResponseDate setresponsedate, initialize initialize) {
        this.b = setresponsedate;
        this.c = initialize;
    }

    public final void close() throws IOException {
        try {
            this.b.enter();
            try {
                this.c.close();
                this.b.exit(true);
            } catch (IOException e) {
                throw this.b.exit(e);
            }
        } catch (Throwable th) {
            this.b.exit(false);
            throw th;
        }
    }

    public final void flush() throws IOException {
        try {
            this.b.enter();
            try {
                this.c.flush();
                this.b.exit(true);
            } catch (IOException e) {
                throw this.b.exit(e);
            }
        } catch (Throwable th) {
            this.b.exit(false);
            throw th;
        }
    }

    public final newInitializerBuilder timeout() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [long] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void write(o.setResponseContentType r8, long r9) throws java.io.IOException {
        /*
            r7 = this;
            r0 = r8
            long r0 = r0.b
            r1 = 0
            r2 = r9
            o.defaultDumperPluginsProvider.a(r0, r1, r2)
        L_0x0009:
            r0 = 0
            r11 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r0 = r8
            o.Stetho r0 = r0.d
            r13 = r0
        L_0x0018:
            r0 = r11
            r14 = r0
            r0 = r11
            r1 = 65536(0x10000, double:3.2379E-319)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            r0 = r11
            r1 = r13
            int r1 = r1.c
            r2 = r13
            int r2 = r2.b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r0 = r0 + r1
            r11 = r0
            r0 = r11
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0043
            r0 = r9
            r14 = r0
            goto L_0x004d
        L_0x0043:
            r0 = r13
            o.Stetho r0 = r0.a
            r13 = r0
            goto L_0x0018
        L_0x004d:
            r0 = r7
            o.setResponseDate r0 = r0.b
            r0.enter()
            r0 = r7
            o.initialize r0 = r0.c     // Catch: IOException -> 0x0074, all -> 0x0070
            r1 = r8
            r2 = r14
            r0.write(r1, r2)     // Catch: IOException -> 0x0074, all -> 0x0070
            r0 = r9
            r1 = r14
            long r0 = r0 - r1
            r9 = r0
            r0 = r7
            o.setResponseDate r0 = r0.b
            r1 = 1
            r0.exit(r1)
            goto L_0x0009
        L_0x0070:
            r8 = move-exception
            goto L_0x007e
        L_0x0074:
            r8 = move-exception
            r0 = r7
            o.setResponseDate r0 = r0.b     // Catch: all -> 0x0070
            r1 = r8
            java.io.IOException r0 = r0.exit(r1)     // Catch: all -> 0x0070
            throw r0     // Catch: all -> 0x0070
        L_0x007e:
            r0 = r7
            o.setResponseDate r0 = r0.b
            r1 = 0
            r0.exit(r1)
            r0 = r8
            throw r0
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseDate$4.write(o.setResponseContentType, long):void");
    }
}
