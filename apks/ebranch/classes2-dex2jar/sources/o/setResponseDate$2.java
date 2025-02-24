package o;

import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:o/setResponseDate$2.class */
final class setResponseDate$2 implements defaultInspectorModulesProvider {
    final /* synthetic */ setResponseDate b;
    final /* synthetic */ defaultInspectorModulesProvider e;

    setResponseDate$2(setResponseDate setresponsedate, defaultInspectorModulesProvider defaultinspectormodulesprovider) {
        this.b = setresponsedate;
        this.e = defaultinspectormodulesprovider;
    }

    public final void close() throws IOException {
        try {
            this.b.enter();
            try {
                this.e.close();
                this.b.exit(true);
            } catch (IOException e) {
                throw this.b.exit(e);
            }
        } catch (Throwable th) {
            this.b.exit(false);
            throw th;
        }
    }

    public final long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
        this.b.enter();
        try {
            try {
                long read = this.e.read(setresponsecontenttype, j);
                this.b.exit(true);
                return read;
            } catch (IOException e) {
                throw this.b.exit(e);
            }
        } catch (Throwable th) {
            this.b.exit(false);
            throw th;
        }
    }

    public final newInitializerBuilder timeout() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
