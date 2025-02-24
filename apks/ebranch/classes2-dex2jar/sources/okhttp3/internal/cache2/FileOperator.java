package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import o.setResponseContentType;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache2/FileOperator.class */
final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public final void read(long j, setResponseContentType setresponsecontenttype, long j2) throws IOException {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, setresponsecontenttype);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [long] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [long] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void write(long r8, o.setResponseContentType r10, long r11) throws java.io.IOException {
        /*
            r7 = this;
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            r0 = r11
            r1 = r10
            long r1 = r1.b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x003e
            r0 = r8
            r13 = r0
            r0 = r11
            r8 = r0
            r0 = r13
            r11 = r0
        L_0x001b:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            r0 = r7
            java.nio.channels.FileChannel r0 = r0.fileChannel
            r1 = r10
            r2 = r11
            r3 = r8
            long r0 = r0.transferFrom(r1, r2, r3)
            r13 = r0
            r0 = r11
            r1 = r13
            long r0 = r0 + r1
            r11 = r0
            r0 = r8
            r1 = r13
            long r0 = r0 - r1
            r8 = r0
            goto L_0x001b
        L_0x003d:
            return
        L_0x003e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.FileOperator.write(long, o.setResponseContentType, long):void");
    }
}
