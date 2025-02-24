package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/setTnxStatus.class */
public final class setTnxStatus implements Closeable, isFromForm {
    private final FileChannel b;
    private final int c = 1179403647;

    public setTnxStatus(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.b = new FileInputStream(file).getChannel();
    }

    private static long a(isFromForm.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            isFromForm.IconCompatParcelizer b = remoteActionCompatParcelizer.b(j3);
            if (b.b == 1 && b.e <= j2 && j2 <= b.e + b.c) {
                return (j2 - b.e) + b.a;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    private String c(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            short e = e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j++;
        }
    }

    private void c(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    private short e(ByteBuffer byteBuffer, long j) throws IOException {
        c(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public final long a(ByteBuffer byteBuffer, long j) throws IOException {
        c(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public final int b(ByteBuffer byteBuffer, long j) throws IOException {
        c(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [long] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [long] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.util.List<java.lang.String> c() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTnxStatus.c():java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final long d(ByteBuffer byteBuffer, long j) throws IOException {
        c(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
