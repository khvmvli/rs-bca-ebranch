package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getBusinessField.class */
public final class getBusinessField {
    private final List<IconCompatParcelizer<?>> c = new ArrayList();

    /* loaded from: classes-dex2jar.jar:o/getBusinessField$IconCompatParcelizer.class */
    static final class IconCompatParcelizer<T> {
        final setContentOrder<T> b;
        final Class<T> e;

        IconCompatParcelizer(Class<T> cls, setContentOrder<T> setcontentorder) {
            this.e = cls;
            this.b = setcontentorder;
        }
    }

    public final <T> void b(Class<T> cls, setContentOrder<T> setcontentorder) {
        synchronized (this) {
            this.c.add(new IconCompatParcelizer<>(cls, setcontentorder));
        }
    }

    public final <T> setContentOrder<T> c(Class<T> cls) {
        IconCompatParcelizer<?> next;
        synchronized (this) {
            Iterator<IconCompatParcelizer<?>> it = this.c.iterator();
            do {
                if (!it.hasNext()) {
                    return null;
                }
                next = it.next();
            } while (!next.e.isAssignableFrom(cls));
            return (setContentOrder<T>) next.b;
        }
    }
}
