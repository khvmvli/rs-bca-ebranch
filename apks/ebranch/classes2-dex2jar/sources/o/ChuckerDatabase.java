package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import o.setScheme;
/* loaded from: classes2-dex2jar.jar:o/ChuckerDatabase.class */
public final class ChuckerDatabase {
    static final Logger a = Logger.getLogger(ChuckerDatabase.class.getName());

    private ChuckerDatabase() {
    }

    public static defaultInspectorModulesProvider a(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileInputStream(file), new newInitializerBuilder());
        }
        throw new IllegalArgumentException("file == null");
    }

    private static defaultInspectorModulesProvider a(final InputStream inputStream, final newInitializerBuilder newinitializerbuilder) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (newinitializerbuilder != null) {
            return new defaultInspectorModulesProvider() { // from class: o.ChuckerDatabase.1
                public final void close() throws IOException {
                    inputStream.close();
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
                        try {
                            newinitializerbuilder.throwIfReached();
                            Stetho c = setresponsecontenttype.c(1);
                            int read = inputStream.read(c.d, c.c, (int) Math.min(j, (long) (8192 - c.c)));
                            if (read == -1) {
                                return -1;
                            }
                            c.c += read;
                            long j2 = (long) read;
                            setresponsecontenttype.b += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (ChuckerDatabase.b(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final newInitializerBuilder timeout() {
                    return newinitializerbuilder;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("source(");
                    sb.append(inputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static defaultInspectorModulesProvider a(final Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            AnonymousClass4 r0 = new setResponseDate() { // from class: o.ChuckerDatabase.4
                protected final IOException newTimeoutException(@Nullable IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                protected final void timedOut() {
                    try {
                        r4.close();
                    } catch (AssertionError e) {
                        if (ChuckerDatabase.b(e)) {
                            Logger logger = ChuckerDatabase.a;
                            Level level = Level.WARNING;
                            StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                            sb.append(r4);
                            logger.log(level, sb.toString(), (Throwable) e);
                            return;
                        }
                        throw e;
                    } catch (Exception e2) {
                        Logger logger2 = ChuckerDatabase.a;
                        Level level2 = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                        sb2.append(r4);
                        logger2.log(level2, sb2.toString(), (Throwable) e2);
                    }
                }
            };
            return r0.source(a(socket.getInputStream(), r0));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    public static initialize b(OutputStream outputStream) {
        return b(outputStream, new newInitializerBuilder());
    }

    private static initialize b(final OutputStream outputStream, final newInitializerBuilder newinitializerbuilder) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (newinitializerbuilder != null) {
            return new initialize() { // from class: o.ChuckerDatabase.2
                public final void close() throws IOException {
                    outputStream.close();
                }

                public final void flush() throws IOException {
                    outputStream.flush();
                }

                public final newInitializerBuilder timeout() {
                    return newinitializerbuilder;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(outputStream);
                    sb.append(")");
                    return sb.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v17, types: [long] */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Type inference failed for: r9v3 */
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
                        r0 = r9
                        r1 = 0
                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                        if (r0 <= 0) goto L_0x0089
                        r0 = r7
                        o.newInitializerBuilder r0 = r6
                        r0.throwIfReached()
                        r0 = r8
                        o.Stetho r0 = r0.d
                        r11 = r0
                        r0 = r9
                        r1 = r11
                        int r1 = r1.c
                        r2 = r11
                        int r2 = r2.b
                        int r1 = r1 - r2
                        long r1 = (long) r1
                        long r0 = java.lang.Math.min(r0, r1)
                        int r0 = (int) r0
                        r12 = r0
                        r0 = r7
                        java.io.OutputStream r0 = r5
                        r1 = r11
                        byte[] r1 = r1.d
                        r2 = r11
                        int r2 = r2.b
                        r3 = r12
                        r0.write(r1, r2, r3)
                        r0 = r11
                        r1 = r11
                        int r1 = r1.b
                        r2 = r12
                        int r1 = r1 + r2
                        r0.b = r1
                        r0 = r12
                        long r0 = (long) r0
                        r13 = r0
                        r0 = r9
                        r1 = r13
                        long r0 = r0 - r1
                        r15 = r0
                        r0 = r8
                        r1 = r8
                        long r1 = r1.b
                        r2 = r13
                        long r1 = r1 - r2
                        r0.b = r1
                        r0 = r15
                        r9 = r0
                        r0 = r11
                        int r0 = r0.b
                        r1 = r11
                        int r1 = r1.c
                        if (r0 != r1) goto L_0x0009
                        r0 = r8
                        r1 = r11
                        o.Stetho r1 = r1.c()
                        r0.d = r1
                        r0 = r11
                        o.InspectorModulesProvider.c(r0)
                        r0 = r15
                        r9 = r0
                        goto L_0x0009
                    L_0x0089:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.ChuckerDatabase.AnonymousClass2.write(o.setResponseContentType, long):void");
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static setTookMs b(defaultInspectorModulesProvider defaultinspectormodulesprovider) {
        return new DumperPluginsProvider(defaultinspectormodulesprovider);
    }

    static boolean b(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static initialize c() {
        return new initialize() { // from class: o.ChuckerDatabase.5
            public final void close() throws IOException {
            }

            public final void flush() throws IOException {
            }

            public final newInitializerBuilder timeout() {
                return newInitializerBuilder.NONE;
            }

            public final void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
                setresponsecontenttype.f(j);
            }
        };
    }

    public static defaultInspectorModulesProvider d(InputStream inputStream) {
        return a(inputStream, new newInitializerBuilder());
    }

    public static initialize d(File file) throws FileNotFoundException {
        if (file != null) {
            return b(new FileOutputStream(file, true), new newInitializerBuilder());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static setScheme.com_github_ChuckerTeam_Chucker_library d(initialize initialize) {
        return new setScheme.com_github_ChuckerTeam_Chucker_library(initialize) { // from class: o.R$anim
            public final initialize a;
            boolean b;
            public final setResponseContentType d = new setResponseContentType();

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (r5 != null) {
                    this.a = r5;
                    return;
                }
                throw new NullPointerException("sink == null");
            }

            public final long a(defaultInspectorModulesProvider defaultinspectormodulesprovider) throws IOException {
                if (defaultinspectormodulesprovider != null) {
                    long j = 0;
                    while (true) {
                        long read = defaultinspectormodulesprovider.read(this.d, 8192);
                        if (read == -1) {
                            return j;
                        }
                        j += read;
                        g();
                    }
                } else {
                    throw new IllegalArgumentException("source == null");
                }
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library a(int i) throws IOException {
                if (!this.b) {
                    this.d.d(i);
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library a(setResponseMessage setresponsemessage) throws IOException {
                if (!this.b) {
                    setResponseContentType setresponsecontenttype = this.d;
                    if (setresponsemessage != null) {
                        setresponsemessage.c(setresponsecontenttype);
                        return g();
                    }
                    throw new IllegalArgumentException("byteString == null");
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library a(byte[] bArr, int i, int i2) throws IOException {
                if (!this.b) {
                    this.d.e(bArr, i, i2);
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final setResponseContentType c() {
                return this.d;
            }

            public final void close() throws IOException {
                Throwable th;
                Throwable th2;
                if (!this.b) {
                    try {
                        if (this.d.b > 0) {
                            initialize initialize2 = this.a;
                            setResponseContentType setresponsecontenttype = this.d;
                            initialize2.write(setresponsecontenttype, setresponsecontenttype.b);
                        }
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        this.a.close();
                        th2 = th;
                    } catch (Throwable th4) {
                        th2 = th4;
                        th2 = th;
                        if (th == null) {
                        }
                    }
                    this.b = true;
                    if (th2 != null) {
                        defaultDumperPluginsProvider.d(th2);
                    }
                }
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library e() throws IOException {
                if (!this.b) {
                    long j = this.d.b;
                    if (j > 0) {
                        this.a.write(this.d, j);
                    }
                    return this;
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library e(int i) throws IOException {
                if (!this.b) {
                    this.d.b(i);
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library e(String str) throws IOException {
                if (!this.b) {
                    this.d.d(str, 0, str.length());
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library e(String str, int i, int i2) throws IOException {
                if (!this.b) {
                    this.d.d(str, i, i2);
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library e(byte[] bArr) throws IOException {
                if (!this.b) {
                    setResponseContentType setresponsecontenttype = this.d;
                    if (bArr != null) {
                        setresponsecontenttype.e(bArr, 0, bArr.length);
                        return g();
                    }
                    throw new IllegalArgumentException("source == null");
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library f(int i) throws IOException {
                if (!this.b) {
                    this.d.i(i);
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final void flush() throws IOException {
                if (!this.b) {
                    if (this.d.b > 0) {
                        initialize initialize2 = this.a;
                        setResponseContentType setresponsecontenttype = this.d;
                        initialize2.write(setresponsecontenttype, setresponsecontenttype.b);
                    }
                    this.a.flush();
                    return;
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library g() throws IOException {
                if (!this.b) {
                    long b = this.d.b();
                    if (b > 0) {
                        this.a.write(this.d, b);
                    }
                    return this;
                }
                throw new IllegalStateException("closed");
            }

            public final boolean isOpen() {
                return !this.b;
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library j(long j) throws IOException {
                if (!this.b) {
                    this.d.g(j);
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final setScheme.com_github_ChuckerTeam_Chucker_library m(long j) throws IOException {
                if (!this.b) {
                    this.d.o(j);
                    return g();
                }
                throw new IllegalStateException("closed");
            }

            public final newInitializerBuilder timeout() {
                return this.a.timeout();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("buffer(");
                sb.append(this.a);
                sb.append(")");
                return sb.toString();
            }

            public final int write(ByteBuffer byteBuffer) throws IOException {
                if (!this.b) {
                    int write = this.d.write(byteBuffer);
                    g();
                    return write;
                }
                throw new IllegalStateException("closed");
            }

            public final void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
                if (!this.b) {
                    this.d.write(setresponsecontenttype, j);
                    g();
                    return;
                }
                throw new IllegalStateException("closed");
            }
        };
    }

    public static initialize e(File file) throws FileNotFoundException {
        if (file != null) {
            return b(new FileOutputStream(file), new newInitializerBuilder());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static initialize e(final Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            AnonymousClass4 r0 = new setResponseDate() { // from class: o.ChuckerDatabase.4
                protected final IOException newTimeoutException(@Nullable IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                protected final void timedOut() {
                    try {
                        socket.close();
                    } catch (AssertionError e) {
                        if (ChuckerDatabase.b(e)) {
                            Logger logger = ChuckerDatabase.a;
                            Level level = Level.WARNING;
                            StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                            sb.append(socket);
                            logger.log(level, sb.toString(), (Throwable) e);
                            return;
                        }
                        throw e;
                    } catch (Exception e2) {
                        Logger logger2 = ChuckerDatabase.a;
                        Level level2 = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                        sb2.append(socket);
                        logger2.log(level2, sb2.toString(), (Throwable) e2);
                    }
                }
            };
            return r0.sink(b(socket.getOutputStream(), r0));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }
}
