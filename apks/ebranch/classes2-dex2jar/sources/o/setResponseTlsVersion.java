package o;

import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:o/setResponseTlsVersion.class */
public abstract class setResponseTlsVersion implements initialize {
    private final initialize delegate;

    public setResponseTlsVersion(initialize initialize) {
        if (initialize != null) {
            this.delegate = initialize;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final initialize delegate() {
        return this.delegate;
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    public newInitializerBuilder timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.delegate.toString());
        sb.append(")");
        return sb.toString();
    }

    public void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
        this.delegate.write(setresponsecontenttype, j);
    }
}
