package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.OsResults$ListIterator;
import io.realm.internal.UncheckedRow;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$RealmCollectionListIterator.class */
class OrderedRealmCollectionImpl$RealmCollectionListIterator extends OsResults$ListIterator<E> {
    final /* synthetic */ OrderedRealmCollectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderedRealmCollectionImpl$RealmCollectionListIterator(OrderedRealmCollectionImpl orderedRealmCollectionImpl, int i) {
        new ListIterator<T>(orderedRealmCollectionImpl.osResults, i) { // from class: io.realm.internal.OsResults$ListIterator
            {
                if (r8 < 0 || ((long) r8) > this.iteratorOsResults.size()) {
                    StringBuilder sb = new StringBuilder("Starting location must be a valid index: [0, ");
                    sb.append(this.iteratorOsResults.size() - 1);
                    sb.append("]. Yours was ");
                    sb.append(r8);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                this.pos = r8 - 1;
            }

            @Override // java.util.ListIterator
            @Deprecated
            public void add(@Nullable T t) {
                throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                checkValid();
                return this.pos >= 0;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                checkValid();
                return this.pos + 1;
            }

            @Override // java.util.ListIterator
            @Nullable
            public T previous() {
                checkValid();
                try {
                    T t = (T) get(this.pos);
                    this.pos--;
                    return t;
                } catch (IndexOutOfBoundsException e) {
                    StringBuilder sb = new StringBuilder("Cannot access index less than zero. This was ");
                    sb.append(this.pos);
                    sb.append(". Remember to check hasPrevious() before using previous().");
                    throw new NoSuchElementException(sb.toString());
                }
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                checkValid();
                return this.pos;
            }

            @Override // java.util.ListIterator
            @Deprecated
            public void set(@Nullable T t) {
                throw new UnsupportedOperationException("Replacing an element is not supported.");
            }
        };
        this.this$0 = orderedRealmCollectionImpl;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    public E convertRowToObject(UncheckedRow uncheckedRow) {
        return this.this$0.operator.convertRowToObject(uncheckedRow);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    public E getInternal(int i, OsResults osResults) {
        return this.this$0.operator.getFromResults(i, osResults);
    }
}
