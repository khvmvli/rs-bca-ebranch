package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* loaded from: classes2-dex2jar.jar:o/ChuckerDatabase_Impl.class */
public final class ChuckerDatabase_Impl implements defaultInspectorModulesProvider {
    private final setUrl$com_github_ChuckerTeam_Chucker_library a;
    private final Inflater c;
    private final setTookMs e;
    private int b = 0;
    private final CRC32 d = new CRC32();

    public ChuckerDatabase_Impl(defaultInspectorModulesProvider defaultinspectormodulesprovider) {
        if (defaultinspectormodulesprovider != null) {
            Inflater inflater = new Inflater(true);
            this.c = inflater;
            setTookMs b = ChuckerDatabase.b(defaultinspectormodulesprovider);
            this.e = b;
            this.a = new setUrl$com_github_ChuckerTeam_Chucker_library(b, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private static void a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private void e(setResponseContentType setresponsecontenttype, long j, long j2) {
        Stetho stetho = setresponsecontenttype.d;
        while (j >= ((long) (stetho.c - stetho.b))) {
            j -= (long) (stetho.c - stetho.b);
            stetho = stetho.a;
        }
        while (j2 > 0) {
            int i = (int) (((long) stetho.b) + j);
            int min = (int) Math.min((long) (stetho.c - i), j2);
            this.d.update(stetho.d, i, min);
            j2 -= (long) min;
            stetho = stetho.a;
            j = 0;
        }
    }

    public final void close() throws IOException {
        this.a.close();
    }

    public final long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.b == 0) {
                this.e.i(10);
                byte b = this.e.c().b(3);
                boolean z = ((b >> 1) & 1) == 1;
                if (z) {
                    e(this.e.c(), 0, 10);
                }
                a("ID1ID2", 8075, this.e.s());
                this.e.f(8);
                if (((b >> 2) & 1) == 1) {
                    this.e.i(2);
                    if (z) {
                        e(this.e.c(), 0, 2);
                    }
                    long e = (long) defaultDumperPluginsProvider.e(this.e.c().s());
                    this.e.i(e);
                    if (z) {
                        e(this.e.c(), 0, e);
                    }
                    this.e.f(e);
                }
                if (((b >> 3) & 1) == 1) {
                    long e2 = this.e.e((byte) 0);
                    if (e2 != -1) {
                        if (z) {
                            e(this.e.c(), 0, e2 + 1);
                        }
                        this.e.f(e2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((b >> 4) & 1) == 1) {
                    long e3 = this.e.e((byte) 0);
                    if (e3 != -1) {
                        if (z) {
                            e(this.e.c(), 0, e3 + 1);
                        }
                        this.e.f(e3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    a("FHCRC", this.e.p(), (short) ((int) this.d.getValue()));
                    this.d.reset();
                }
                this.b = 1;
            }
            if (this.b == 1) {
                long j2 = setresponsecontenttype.b;
                long read = this.a.read(setresponsecontenttype, j);
                if (read != -1) {
                    e(setresponsecontenttype, j2, read);
                    return read;
                }
                this.b = 2;
            }
            if (this.b != 2) {
                return -1;
            }
            a("CRC", this.e.k(), (int) this.d.getValue());
            a("ISIZE", this.e.k(), (int) this.c.getBytesWritten());
            this.b = 3;
            if (this.e.f()) {
                return -1;
            }
            throw new IOException("gzip finished without exhausting source");
        }
    }

    public final newInitializerBuilder timeout() {
        return this.e.timeout();
    }
}
