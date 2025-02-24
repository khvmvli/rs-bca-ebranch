package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/OrderedRealmCollectionSnapshot.class */
public class OrderedRealmCollectionSnapshot<E> extends OrderedRealmCollectionImpl<E> {
    private int size = -1;

    public OrderedRealmCollectionSnapshot(BaseRealm baseRealm, OsResults osResults, Class<E> cls) {
        super(baseRealm, osResults.createSnapshot(), cls);
    }

    public OrderedRealmCollectionSnapshot(BaseRealm baseRealm, OsResults osResults, String str) {
        super(baseRealm, osResults.createSnapshot(), str);
    }

    private UnsupportedOperationException getUnsupportedException(String str) {
        return new UnsupportedOperationException(String.format(Locale.US, "'%s()' is not supported by OrderedRealmCollectionSnapshot. Call '%s()' on the original 'RealmCollection' instead.", str, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        add(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i, Collection collection) {
        return addAll(i, collection);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return addAll(collection);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ double average(String str) {
        return average(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        clear();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean contains(@Nullable Object obj) {
        return contains(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public OrderedRealmCollectionSnapshot<E> createSnapshot() {
        this.baseRealm.checkIfValid();
        return this;
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
        return deleteAllFromRealm();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        UncheckedRow firstUncheckedRow = this.osResults.firstUncheckedRow();
        return firstUncheckedRow != null && firstUncheckedRow.isValid() && this.osResults.deleteFirst();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public void deleteFromRealm(int i) {
        this.baseRealm.checkIfValidAndInTransaction();
        if (this.osResults.getUncheckedRow(i).isValid()) {
            this.osResults.delete((long) i);
        }
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        UncheckedRow lastUncheckedRow = this.osResults.lastUncheckedRow();
        return lastUncheckedRow != null && lastUncheckedRow.isValid() && this.osResults.deleteLast();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object first() {
        return first();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object first(@Nullable Object obj) {
        return first(obj);
    }

    @Override // io.realm.internal.Freezable
    public OrderedRealmCollection<E> freeze() {
        throw getUnsupportedException("freeze");
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Nullable
    public /* bridge */ /* synthetic */ Object get(int i) {
        return get(i);
    }

    @Override // io.realm.OrderedRealmCollectionImpl
    public /* bridge */ /* synthetic */ Realm getRealm() {
        return getRealm();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        return false;
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isManaged() {
        return isManaged();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isValid() {
        return isValid();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object last() {
        return last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object last(@Nullable Object obj) {
        return last(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
        return true;
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number max(String str) {
        return max(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Date maxDate(String str) {
        return maxDate(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number min(String str) {
        return min(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Date minDate(String str) {
        return minDate(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return remove(i);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return remove(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return removeAll(collection);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return set(i, obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        if (this.size == -1) {
            this.size = size();
        }
        return this.size;
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str) {
        throw getUnsupportedException("sort");
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort) {
        throw getUnsupportedException("sort");
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        throw getUnsupportedException("sort");
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String[] strArr, Sort[] sortArr) {
        throw getUnsupportedException("sort");
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number sum(String str) {
        return sum(str);
    }

    @Override // io.realm.RealmCollection
    @Deprecated
    public RealmQuery<E> where() {
        throw getUnsupportedException("where");
    }
}
