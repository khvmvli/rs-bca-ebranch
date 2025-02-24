package o;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/getRelationship.class */
public final class getRelationship extends AbstractList<String> implements RandomAccess, setReferalCode {
    private final setReferalCode b;

    public getRelationship(setReferalCode setreferalcode) {
        this.b = setreferalcode;
    }

    @Override // o.setReferalCode
    public final Object b(int i) {
        return this.b.b(i);
    }

    @Override // o.setReferalCode
    public final void b(setCurrOfficePostCode setcurrofficepostcode) {
        throw new UnsupportedOperationException();
    }

    @Override // o.setReferalCode
    public final List<?> d() {
        return this.b.d();
    }

    @Override // o.setReferalCode
    public final setReferalCode e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return ((setPrevWorkPeriod) this.b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new Iterator<String>() { // from class: o.realmSet$promotion
            final Iterator<String> b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = getRelationship.this.b.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public final /* bridge */ /* synthetic */ String next() {
                return this.b.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new getJobSector(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }
}
