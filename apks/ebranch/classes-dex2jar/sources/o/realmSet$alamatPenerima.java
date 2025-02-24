package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* loaded from: classes-dex2jar.jar:o/realmSet$alamatPenerima.class */
public final class realmSet$alamatPenerima {
    static final Logger e = Logger.getLogger(realmSet$alamatPenerima.class.getName());

    private realmSet$alamatPenerima() {
    }

    public static void d(@CheckForNull InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                try {
                    e.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e2);
                } catch (IOException e3) {
                    throw new AssertionError(e3);
                }
            }
        }
    }
}
