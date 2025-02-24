package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setOccupation.class */
public final class setOccupation {
    private final List<RemoteActionCompatParcelizer<?>> a = new ArrayList();

    /* loaded from: classes-dex2jar.jar:o/setOccupation$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer<T> {
        final Class<T> c;
        final setDescription<T> d;

        RemoteActionCompatParcelizer(Class<T> cls, setDescription<T> setdescription) {
            this.c = cls;
            this.d = setdescription;
        }
    }

    public final <Z> void a(Class<Z> cls, setDescription<Z> setdescription) {
        synchronized (this) {
            this.a.add(new RemoteActionCompatParcelizer<>(cls, setdescription));
        }
    }

    public final <Z> setDescription<Z> c(Class<Z> cls) {
        synchronized (this) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer = this.a.get(i);
                if (remoteActionCompatParcelizer.c.isAssignableFrom(cls)) {
                    return (setDescription<Z>) remoteActionCompatParcelizer.d;
                }
            }
            return null;
        }
    }
}
