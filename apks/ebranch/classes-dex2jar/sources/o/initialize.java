package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/initialize.class */
public interface initialize extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    newInitializerBuilder timeout();

    void write(setResponseContentType setresponsecontenttype, long j) throws IOException;
}
