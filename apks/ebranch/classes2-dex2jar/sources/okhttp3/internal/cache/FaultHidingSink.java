package okhttp3.internal.cache;

import java.io.IOException;
import o.initialize;
import o.setResponseContentType;
import o.setResponseTlsVersion;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/cache/FaultHidingSink.class */
class FaultHidingSink extends setResponseTlsVersion {
    private boolean hasErrors;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(initialize initialize) {
        super(initialize);
    }

    @Override // o.setResponseTlsVersion
    public void close() throws IOException {
        if (!this.hasErrors) {
            try {
                close();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    @Override // o.setResponseTlsVersion
    public void flush() throws IOException {
        if (!this.hasErrors) {
            try {
                flush();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    protected void onException(IOException iOException) {
    }

    @Override // o.setResponseTlsVersion
    public void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
        if (this.hasErrors) {
            setresponsecontenttype.f(j);
            return;
        }
        try {
            write(setresponsecontenttype, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}
