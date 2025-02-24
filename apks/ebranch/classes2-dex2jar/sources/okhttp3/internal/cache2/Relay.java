package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import o.defaultInspectorModulesProvider;
import o.newInitializerBuilder;
import o.setResponseContentType;
import o.setResponseMessage;
import okhttp3.internal.Util;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache2/Relay.class */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final setResponseMessage PREFIX_CLEAN = setResponseMessage.a("OkHttp cache v1\n");
    static final setResponseMessage PREFIX_DIRTY = setResponseMessage.a("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final setResponseMessage metadata;
    int sourceCount;
    defaultInspectorModulesProvider upstream;
    long upstreamPos;
    Thread upstreamReader;
    final setResponseContentType upstreamBuffer = new setResponseContentType();
    final setResponseContentType buffer = new setResponseContentType();

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache2/Relay$RelaySource.class */
    class RelaySource implements defaultInspectorModulesProvider {
        private FileOperator fileOperator;
        private long sourcePos;
        private final newInitializerBuilder timeout = new newInitializerBuilder();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay.this.sourceCount--;
                    if (Relay.this.sourceCount == 0) {
                        randomAccessFile = Relay.this.file;
                        Relay.this.file = null;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
            }
        }

        public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
            long j2;
            char c;
            if (this.fileOperator != null) {
                synchronized (Relay.this) {
                    while (true) {
                        try {
                            long j3 = this.sourcePos;
                            j2 = Relay.this.upstreamPos;
                            if (j3 == j2) {
                                if (!Relay.this.complete) {
                                    if (Relay.this.upstreamReader == null) {
                                        Relay.this.upstreamReader = Thread.currentThread();
                                        c = 1;
                                        break;
                                    }
                                    this.timeout.waitUntilNotified(Relay.this);
                                } else {
                                    return -1;
                                }
                            } else {
                                long j4 = j2 - Relay.this.buffer.b;
                                long j5 = this.sourcePos;
                                if (j5 < j4) {
                                    c = 2;
                                } else {
                                    long min = Math.min(j, j2 - j5);
                                    Relay.this.buffer.d(setresponsecontenttype, this.sourcePos - j4, min);
                                    this.sourcePos += min;
                                    return min;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (c == 2) {
                        long min2 = Math.min(j, j2 - this.sourcePos);
                        this.fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, setresponsecontenttype, min2);
                        this.sourcePos += min2;
                        return min2;
                    }
                    try {
                        long read = Relay.this.upstream.read(Relay.this.upstreamBuffer, Relay.this.bufferMaxSize);
                        if (read == -1) {
                            Relay.this.commit(j2);
                            synchronized (Relay.this) {
                                try {
                                    Relay.this.upstreamReader = null;
                                    Relay.this.notifyAll();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return -1;
                        }
                        long min3 = Math.min(read, j);
                        Relay.this.upstreamBuffer.d(setresponsecontenttype, 0, min3);
                        this.sourcePos += min3;
                        this.fileOperator.write(j2 + Relay.FILE_HEADER_SIZE, Relay.this.upstreamBuffer.d(), read);
                        synchronized (Relay.this) {
                            Relay.this.buffer.write(Relay.this.upstreamBuffer, read);
                            if (Relay.this.buffer.b > Relay.this.bufferMaxSize) {
                                Relay.this.buffer.f(Relay.this.buffer.b - Relay.this.bufferMaxSize);
                            }
                            Relay.this.upstreamPos += read;
                        }
                        synchronized (Relay.this) {
                            try {
                                Relay.this.upstreamReader = null;
                                Relay.this.notifyAll();
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        return min3;
                    } catch (Throwable th4) {
                        synchronized (Relay.this) {
                            try {
                                Relay.this.upstreamReader = null;
                                Relay.this.notifyAll();
                                throw th4;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public newInitializerBuilder timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, defaultInspectorModulesProvider defaultinspectormodulesprovider, long j, setResponseMessage setresponsemessage, long j2) {
        this.file = randomAccessFile;
        this.upstream = defaultinspectormodulesprovider;
        this.complete = defaultinspectormodulesprovider == null;
        this.upstreamPos = j;
        this.metadata = setresponsemessage;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file, defaultInspectorModulesProvider defaultinspectormodulesprovider, setResponseMessage setresponsemessage, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, defaultinspectormodulesprovider, 0, setresponsemessage, j);
        randomAccessFile.setLength(0);
        relay.writeHeader(PREFIX_DIRTY, -1, -1);
        return relay;
    }

    public static Relay read(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        fileOperator.read(0, setresponsecontenttype, FILE_HEADER_SIZE);
        setResponseMessage setresponsemessage = PREFIX_CLEAN;
        if (new setResponseMessage(setresponsecontenttype.e((long) setresponsemessage.g())).equals(setresponsemessage)) {
            long q = setresponsecontenttype.q();
            long q2 = setresponsecontenttype.q();
            setResponseContentType setresponsecontenttype2 = new setResponseContentType();
            fileOperator.read(q + FILE_HEADER_SIZE, setresponsecontenttype2, q2);
            return new Relay(randomAccessFile, null, q, new setResponseMessage(setresponsecontenttype2.l()), 0);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(setResponseMessage setresponsemessage, long j, long j2) throws IOException {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        if (setresponsemessage != null) {
            setresponsemessage.c(setresponsecontenttype);
            setresponsecontenttype.n(j);
            setresponsecontenttype.n(j2);
            if (setresponsecontenttype.b == FILE_HEADER_SIZE) {
                new FileOperator(this.file.getChannel()).write(0, setresponsecontenttype, FILE_HEADER_SIZE);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("byteString == null");
    }

    private void writeMetadata(long j) throws IOException {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        setResponseMessage setresponsemessage = this.metadata;
        if (setresponsemessage != null) {
            setresponsemessage.c(setresponsecontenttype);
            new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j, setresponsecontenttype, (long) this.metadata.g());
            return;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    final void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.g());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    final boolean isClosed() {
        return this.file == null;
    }

    public final setResponseMessage metadata() {
        return this.metadata;
    }

    public final defaultInspectorModulesProvider newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }
}
