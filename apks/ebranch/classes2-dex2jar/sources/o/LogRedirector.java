package o;

import java.util.Collection;
import java.util.HashSet;
/* loaded from: classes2-dex2jar.jar:o/LogRedirector.class */
public abstract class LogRedirector<T> extends d<T, HashSet<T>> {

    /* loaded from: classes2-dex2jar.jar:o/LogRedirector$Logger.class */
    public interface Logger {
        void a();
    }

    @Override // o.d
    public final /* synthetic */ Collection e() {
        return new HashSet();
    }
}
