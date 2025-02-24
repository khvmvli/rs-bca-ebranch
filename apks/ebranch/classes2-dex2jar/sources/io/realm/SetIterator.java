package io.realm;

import io.realm.internal.OsSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/SetIterator.class */
public abstract class SetIterator<E> implements Iterator<E> {
    protected final BaseRealm baseRealm;
    protected final OsSet osSet;
    private int pos = -1;

    public SetIterator(OsSet osSet, BaseRealm baseRealm) {
        this.osSet = osSet;
        this.baseRealm = baseRealm;
    }

    protected E getValueAtIndex(int i) {
        return (E) this.osSet.getValueAtIndex(i);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = true;
        if (((long) (this.pos + 1)) >= this.osSet.size()) {
            z = false;
        }
        return z;
    }

    @Override // java.util.Iterator
    public E next() {
        this.pos++;
        long size = this.osSet.size();
        int i = this.pos;
        if (((long) i) < size) {
            return getValueAtIndex(i);
        }
        StringBuilder sb = new StringBuilder("Cannot access index ");
        sb.append(this.pos);
        sb.append(" when size is ");
        sb.append(size);
        sb.append(". Remember to check hasNext() before using next().");
        throw new NoSuchElementException(sb.toString());
    }
}
