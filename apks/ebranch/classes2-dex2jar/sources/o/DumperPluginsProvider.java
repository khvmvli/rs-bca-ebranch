package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/DumperPluginsProvider.class */
public final class DumperPluginsProvider implements setTookMs {
    public final defaultInspectorModulesProvider b;
    public final setResponseContentType c = new setResponseContentType();
    boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DumperPluginsProvider(defaultInspectorModulesProvider defaultinspectormodulesprovider) {
        if (defaultinspectormodulesprovider != null) {
            this.b = defaultinspectormodulesprovider;
            return;
        }
        throw new NullPointerException("source == null");
    }

    private long d(byte b, long j, long j2) throws IOException {
        if (this.e) {
            throw new IllegalStateException("closed");
        } else if (j2 >= 0) {
            while (j < j2) {
                long b2 = this.c.b(b, j, j2);
                if (b2 != -1) {
                    return b2;
                }
                long j3 = this.c.b;
                if (j3 >= j2 || this.b.read(this.c, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j3);
            }
            return -1;
        } else {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j2)));
        }
    }

    public final String a(Charset charset) throws IOException {
        if (charset != null) {
            this.c.a(this.b);
            return this.c.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final void a(byte[] bArr) throws IOException {
        try {
            if (h((long) bArr.length)) {
                this.c.a(bArr);
                return;
            }
            throw new EOFException();
        } catch (EOFException e) {
            int i = 0;
            while (this.c.b > 0) {
                setResponseContentType setresponsecontenttype = this.c;
                int c = setresponsecontenttype.c(bArr, i, (int) setresponsecontenttype.b);
                if (c != -1) {
                    i += c;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public final int c(BuildConfig buildConfig) throws IOException {
        if (!this.e) {
            do {
                int e = this.c.e(buildConfig, true);
                if (e == -1) {
                    return -1;
                }
                if (e != -2) {
                    this.c.f((long) buildConfig.e[e].g());
                    return e;
                }
            } while (this.b.read(this.c, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [long] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long c(o.initialize r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r7 = r0
        L_0x0002:
            r0 = r5
            o.defaultInspectorModulesProvider r0 = r0.b
            r1 = r5
            o.setResponseContentType r1 = r1.c
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003d
            r0 = r5
            o.setResponseContentType r0 = r0.c
            long r0 = r0.b()
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0002
            r0 = r7
            r1 = r9
            long r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r5
            o.setResponseContentType r1 = r1.c
            r2 = r9
            r0.write(r1, r2)
            goto L_0x0002
        L_0x003d:
            r0 = r7
            r9 = r0
            r0 = r5
            o.setResponseContentType r0 = r0.c
            long r0 = r0.b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            r0 = r7
            r1 = r5
            o.setResponseContentType r1 = r1.c
            long r1 = r1.b
            long r0 = r0 + r1
            r9 = r0
            r0 = r5
            o.setResponseContentType r0 = r0.c
            r11 = r0
            r0 = r6
            r1 = r11
            r2 = r11
            long r2 = r2.b
            r0.write(r1, r2)
        L_0x006a:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DumperPluginsProvider.c(o.initialize):long");
    }

    public final long c(setResponseMessage setresponsemessage) throws IOException {
        if (!this.e) {
            long j = 0;
            while (true) {
                long c = this.c.c(setresponsemessage, j);
                if (c != -1) {
                    return c;
                }
                long j2 = this.c.b;
                if (this.b.read(this.c, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final setResponseContentType c() {
        return this.c;
    }

    public final setResponseMessage c(long j) throws IOException {
        if (h(j)) {
            return this.c.c(j);
        }
        throw new EOFException();
    }

    public final void close() throws IOException {
        if (!this.e) {
            this.e = true;
            this.b.close();
            setResponseContentType setresponsecontenttype = this.c;
            try {
                setresponsecontenttype.f(setresponsecontenttype.b);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final long d(setResponseMessage setresponsemessage) throws IOException {
        if (!this.e) {
            long j = 0;
            while (true) {
                long b = this.c.b(setresponsemessage, j);
                if (b != -1) {
                    return b;
                }
                long j2 = this.c.b;
                if (this.b.read(this.c, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) setresponsemessage.g())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final String d(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long d = d((byte) 10, 0, j2);
            if (d != -1) {
                return this.c.a(d);
            }
            if (j2 < Long.MAX_VALUE && h(j2) && this.c.b(j2 - 1) == 13 && h(1 + j2) && this.c.b(j2) == 10) {
                return this.c.a(j2);
            }
            setResponseContentType setresponsecontenttype = new setResponseContentType();
            setResponseContentType setresponsecontenttype2 = this.c;
            setresponsecontenttype2.d(setresponsecontenttype, 0, Math.min(32L, setresponsecontenttype2.b));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.c.b, j));
            sb.append(" content=");
            sb.append(new setResponseMessage(setresponsecontenttype.l()).e());
            sb.append((char) 8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void d(setResponseContentType setresponsecontenttype, long j) throws IOException {
        try {
            if (h(j)) {
                this.c.d(setresponsecontenttype, j);
                return;
            }
            throw new EOFException();
        } catch (EOFException e) {
            setresponsecontenttype.a(this.c);
            throw e;
        }
    }

    public final long e(byte b) throws IOException {
        return d((byte) 0, 0, Long.MAX_VALUE);
    }

    public final boolean e(long j, setResponseMessage setresponsemessage) throws IOException {
        int g = setresponsemessage.g();
        if (this.e) {
            throw new IllegalStateException("closed");
        } else if (g < 0 || setresponsemessage.g() < g) {
            return false;
        } else {
            for (int i = 0; i < g; i++) {
                long j2 = ((long) i) + 0;
                if (!(h(1 + j2) && this.c.b(j2) == setresponsemessage.a(i + 0))) {
                    return false;
                }
            }
            return true;
        }
    }

    public final byte[] e(long j) throws IOException {
        if (h(j)) {
            return this.c.e(j);
        }
        throw new EOFException();
    }

    public final void f(long j) throws IOException {
        if (!this.e) {
            while (j > 0) {
                if (this.c.b == 0 && this.b.read(this.c, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.c.b);
                this.c.f(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean f() throws IOException {
        if (!this.e) {
            boolean z = true;
            if (!(this.c.b == 0) || this.b.read(this.c, 8192) != -1) {
                z = false;
            }
            return z;
        }
        throw new IllegalStateException("closed");
    }

    public final InputStream h() {
        return new InputStream() { // from class: o.DumperPluginsProvider.3
            @Override // java.io.InputStream
            public final int available() throws IOException {
                if (!DumperPluginsProvider.this.e) {
                    return (int) Math.min(DumperPluginsProvider.this.c.b, 2147483647L);
                }
                throw new IOException("closed");
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                DumperPluginsProvider.this.close();
            }

            @Override // java.io.InputStream
            public final int read() throws IOException {
                if (DumperPluginsProvider.this.e) {
                    throw new IOException("closed");
                } else if (DumperPluginsProvider.this.c.b == 0 && DumperPluginsProvider.this.b.read(DumperPluginsProvider.this.c, 8192) == -1) {
                    return -1;
                } else {
                    return DumperPluginsProvider.this.c.i() & 255;
                }
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                if (!DumperPluginsProvider.this.e) {
                    defaultDumperPluginsProvider.a((long) bArr.length, (long) i, (long) i2);
                    if (DumperPluginsProvider.this.c.b == 0 && DumperPluginsProvider.this.b.read(DumperPluginsProvider.this.c, 8192) == -1) {
                        return -1;
                    }
                    return DumperPluginsProvider.this.c.c(bArr, i, i2);
                }
                throw new IOException("closed");
            }

            @Override // java.lang.Object
            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(DumperPluginsProvider.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final boolean h(long j) throws IOException {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.e) {
            while (this.c.b < j) {
                if (this.b.read(this.c, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final byte i() throws IOException {
        if (h(1)) {
            return this.c.i();
        }
        throw new EOFException();
    }

    public final void i(long j) throws IOException {
        if (!h(j)) {
            throw new EOFException();
        }
    }

    public final boolean isOpen() {
        return !this.e;
    }

    public final setTookMs j() {
        return ChuckerDatabase.b((defaultInspectorModulesProvider) new defaultInspectorModulesProvider(this) { // from class: o.R$bool
            private boolean a;
            private Stetho b;
            private long c;
            private int d;
            private final setResponseContentType e;
            private final setTookMs f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f = r4;
                setResponseContentType c = r4.c();
                this.e = c;
                Stetho stetho = c.d;
                this.b = stetho;
                this.d = stetho != null ? stetho.b : -1;
            }

            public final void close() throws IOException {
                this.a = true;
            }

            public final long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    StringBuilder sb = new StringBuilder("byteCount < 0: ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString());
                } else if (!this.a) {
                    Stetho stetho = this.b;
                    if (stetho != null && (stetho != this.e.d || this.d != this.e.d.b)) {
                        throw new IllegalStateException("Peek source is invalid because upstream source was used");
                    } else if (i == 0) {
                        return 0;
                    } else {
                        if (!this.f.h(this.c + 1)) {
                            return -1;
                        }
                        if (this.b == null && this.e.d != null) {
                            this.b = this.e.d;
                            this.d = this.e.d.b;
                        }
                        long min = Math.min(j, this.e.b - this.c);
                        this.e.d(setresponsecontenttype, this.c, min);
                        this.c += min;
                        return min;
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }

            public final newInitializerBuilder timeout() {
                return this.f.timeout();
            }
        });
    }

    public final int k() throws IOException {
        if (h(4)) {
            return this.c.k();
        }
        throw new EOFException();
    }

    public final byte[] l() throws IOException {
        this.c.a(this.b);
        return this.c.l();
    }

    public final long m() throws IOException {
        byte b;
        if (h(1)) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!h((long) i2)) {
                    break;
                }
                b = this.c.b((long) i);
                if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                    break;
                }
                i = i2;
            }
            if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b)));
            }
            return this.c.m();
        }
        throw new EOFException();
    }

    public final int n() throws IOException {
        if (h(4)) {
            return this.c.n();
        }
        throw new EOFException();
    }

    public final long o() throws IOException {
        byte b;
        if (h(1)) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!h((long) i2)) {
                    break;
                }
                b = this.c.b((long) i);
                if ((b < 48 || b > 57) && !(i == 0 && b == 45)) {
                    break;
                }
                i = i2;
            }
            if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(b)));
            }
            return this.c.o();
        }
        throw new EOFException();
    }

    public final short p() throws IOException {
        if (h(2)) {
            return this.c.p();
        }
        throw new EOFException();
    }

    public final long q() throws IOException {
        if (h(8)) {
            return this.c.q();
        }
        throw new EOFException();
    }

    public final String r() throws IOException {
        return d(Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.c.b == 0 && this.b.read(this.c, 8192) == -1) {
            return -1;
        }
        return this.c.read(byteBuffer);
    }

    public final long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
        if (setresponsecontenttype == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.e) {
            throw new IllegalStateException("closed");
        } else if (this.c.b == 0 && this.b.read(this.c, 8192) == -1) {
            return -1;
        } else {
            return this.c.read(setresponsecontenttype, Math.min(j, this.c.b));
        }
    }

    public final short s() throws IOException {
        if (h(2)) {
            return this.c.s();
        }
        throw new EOFException();
    }

    public final String t() throws IOException {
        this.c.a(this.b);
        return this.c.t();
    }

    public final newInitializerBuilder timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
