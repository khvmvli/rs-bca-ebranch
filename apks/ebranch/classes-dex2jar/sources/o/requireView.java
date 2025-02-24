package o;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
/* loaded from: classes-dex2jar.jar:o/requireView.class */
final class requireView {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/requireView$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        long d;
        long e;

        IconCompatParcelizer() {
        }
    }

    requireView() {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static o.requireView.IconCompatParcelizer c(java.io.RandomAccessFile r6) throws java.io.IOException, java.util.zip.ZipException {
        /*
            r0 = r6
            long r0 = r0.length()
            r1 = 22
            long r0 = r0 - r1
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0094
            r0 = r7
            r1 = 65536(0x10000, double:3.2379E-319)
            long r0 = r0 - r1
            r11 = r0
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            r0 = r11
            r9 = r0
        L_0x0022:
            r0 = 101010256(0x6054b50, float:2.506985E-35)
            int r0 = java.lang.Integer.reverseBytes(r0)
            r13 = r0
        L_0x0029:
            r0 = r6
            r1 = r7
            r0.seek(r1)
            r0 = r6
            int r0 = r0.readInt()
            r1 = r13
            if (r0 != r1) goto L_0x007d
            r0 = r6
            r1 = 2
            int r0 = r0.skipBytes(r1)
            r0 = r6
            r1 = 2
            int r0 = r0.skipBytes(r1)
            r0 = r6
            r1 = 2
            int r0 = r0.skipBytes(r1)
            r0 = r6
            r1 = 2
            int r0 = r0.skipBytes(r1)
            o.requireView$IconCompatParcelizer r0 = new o.requireView$IconCompatParcelizer
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r14
            r1 = r6
            int r1 = r1.readInt()
            int r1 = java.lang.Integer.reverseBytes(r1)
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            r0.d = r1
            r0 = r14
            r1 = r6
            int r1 = r1.readInt()
            int r1 = java.lang.Integer.reverseBytes(r1)
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            r0.e = r1
            r0 = r14
            return r0
        L_0x007d:
            r0 = r7
            r1 = 1
            long r0 = r0 - r1
            r7 = r0
            r0 = r7
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008a
            goto L_0x0029
        L_0x008a:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            r1 = r0
            java.lang.String r2 = "End Of Central Directory signature not found"
            r1.<init>(r2)
            throw r0
        L_0x0094:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "File too short to be a zip file: "
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            r1 = r6
            long r1 = r1.length()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            r1 = r0
            r2 = r14
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requireView.c(java.io.RandomAccessFile):o.requireView$IconCompatParcelizer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return d(randomAccessFile, c(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    private static long d(RandomAccessFile randomAccessFile, IconCompatParcelizer iconCompatParcelizer) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = iconCompatParcelizer.d;
        randomAccessFile.seek(iconCompatParcelizer.e);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }
}
