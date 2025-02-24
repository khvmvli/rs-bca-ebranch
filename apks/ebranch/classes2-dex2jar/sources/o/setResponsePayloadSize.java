package o;

import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:o/setResponsePayloadSize.class */
public abstract class setResponsePayloadSize implements defaultInspectorModulesProvider {
    private final defaultInspectorModulesProvider delegate;

    public setResponsePayloadSize(defaultInspectorModulesProvider defaultinspectormodulesprovider) {
        if (defaultinspectormodulesprovider != null) {
            this.delegate = defaultinspectormodulesprovider;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final defaultInspectorModulesProvider delegate() {
        return this.delegate;
    }

    public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
        return this.delegate.read(setresponsecontenttype, j);
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
}
