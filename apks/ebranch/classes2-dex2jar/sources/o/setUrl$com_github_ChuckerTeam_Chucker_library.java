package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes2-dex2jar.jar:o/setUrl$com_github_ChuckerTeam_Chucker_library.class */
public final class setUrl$com_github_ChuckerTeam_Chucker_library implements defaultInspectorModulesProvider {
    private int b;
    private boolean c;
    private final Inflater d;
    private final setTookMs e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setUrl$com_github_ChuckerTeam_Chucker_library(setTookMs settookms, Inflater inflater) {
        if (settookms != null) {
            this.e = settookms;
            this.d = inflater;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void e() throws IOException {
        int i = this.b;
        if (i != 0) {
            int remaining = i - this.d.getRemaining();
            this.b -= remaining;
            this.e.f((long) remaining);
        }
    }

    public final void close() throws IOException {
        if (!this.c) {
            this.d.end();
            this.c = true;
            this.e.close();
        }
    }

    public final long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.c) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            do {
                z = false;
                if (this.d.needsInput()) {
                    e();
                    if (this.d.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.e.f()) {
                        z = true;
                    } else {
                        Stetho stetho = this.e.c().d;
                        this.b = stetho.c - stetho.b;
                        this.d.setInput(stetho.d, stetho.b, this.b);
                    }
                }
                try {
                    Stetho c = setresponsecontenttype.c(1);
                    int inflate = this.d.inflate(c.d, c.c, (int) Math.min(j, (long) (8192 - c.c)));
                    if (inflate > 0) {
                        c.c += inflate;
                        long j2 = (long) inflate;
                        setresponsecontenttype.b += j2;
                        return j2;
                    }
                    if (!this.d.finished() && !this.d.needsDictionary()) {
                    }
                    e();
                    if (c.b != c.c) {
                        return -1;
                    }
                    setresponsecontenttype.d = c.c();
                    InspectorModulesProvider.c(c);
                    return -1;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            } while (!z);
            throw new EOFException("source exhausted prematurely");
        }
    }

    public final newInitializerBuilder timeout() {
        return this.e.timeout();
    }
}
