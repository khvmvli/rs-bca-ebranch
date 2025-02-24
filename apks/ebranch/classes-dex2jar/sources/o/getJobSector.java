package o;

import java.util.ListIterator;
/* loaded from: classes-dex2jar.jar:o/getJobSector.class */
final class getJobSector implements ListIterator<String> {
    final /* synthetic */ int b;
    final /* synthetic */ getRelationship c;
    final ListIterator<String> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getJobSector(getRelationship getrelationship, int i) {
        this.c = getrelationship;
        this.b = i;
        this.d = getrelationship.b.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.d.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.d.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
