package o;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/defaultInspectorModulesProvider.class */
public interface defaultInspectorModulesProvider extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(setResponseContentType setresponsecontenttype, long j) throws IOException;

    @Override // o.initialize
    newInitializerBuilder timeout();
}
