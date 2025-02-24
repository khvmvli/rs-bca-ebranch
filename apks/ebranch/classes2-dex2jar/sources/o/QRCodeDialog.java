package o;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2-dex2jar.jar:o/QRCodeDialog.class */
public class QRCodeDialog<T> implements Provider<Set<T>> {
    public volatile Set<T> c = null;
    public volatile Set<Provider<T>> d = Collections.newSetFromMap(new ConcurrentHashMap());

    private QRCodeDialog(Collection<Provider<T>> collection) {
        this.d.addAll(collection);
    }

    public static QRCodeDialog<?> b(Collection<Provider<?>> collection) {
        return new QRCodeDialog<>((Set) collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        synchronized (this) {
            for (Provider<T> provider : this.d) {
                this.c.add(provider.get());
            }
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public Set<T> get() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.newSetFromMap(new ConcurrentHashMap());
                    b();
                }
            }
        }
        return Collections.unmodifiableSet(this.c);
    }
}
