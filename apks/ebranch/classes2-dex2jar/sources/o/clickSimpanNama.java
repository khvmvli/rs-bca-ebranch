package o;

import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/clickSimpanNama.class */
public abstract class clickSimpanNama implements Iterator<Integer>, subscriberLoadDraftPemrekEvent {
    public abstract int c();

    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        return Integer.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
