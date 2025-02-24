package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$cardID.class */
public final class realmSet$cardID {
    private static final Iterator<Object> d = new Iterator<Object>() { // from class: o.realmSet$annualFeeAddOnDisplayAmount
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    };
    private static final Iterable<Object> c = new Iterable<Object>() { // from class: o.realmSet$cardImagePath
        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            return realmSet$cardID.d;
        }
    };

    public static <T> Iterable<T> b() {
        return (Iterable<T>) c;
    }
}
