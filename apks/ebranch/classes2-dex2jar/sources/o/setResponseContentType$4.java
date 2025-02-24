package o;

import java.io.OutputStream;
/* loaded from: classes2-dex2jar.jar:o/setResponseContentType$4.class */
public final class setResponseContentType$4 extends OutputStream {
    final /* synthetic */ setResponseContentType a;

    public setResponseContentType$4(setResponseContentType setresponsecontenttype) {
        this.a = setresponsecontenttype;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".outputStream()");
        return sb.toString();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.b((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.e(bArr, i, i2);
    }
}
