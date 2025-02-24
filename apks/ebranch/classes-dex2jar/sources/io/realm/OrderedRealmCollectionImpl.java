package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Table;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/OrderedRealmCollectionImpl.class */
public abstract class OrderedRealmCollectionImpl<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    private static final String NOT_SUPPORTED_MESSAGE;
    public final BaseRealm baseRealm;
    @Nullable
    final String className;
    @Nullable
    final Class<E> classSpec;
    final CollectionOperator<E> operator;
    final OsResults osResults;

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, Class<E> cls) {
        this(baseRealm, osResults, cls, null, getCollectionOperator(false, baseRealm, osResults, cls, null));
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, Class<E> cls, CollectionOperator<E> collectionOperator) {
        this(baseRealm, osResults, cls, null, collectionOperator);
    }

    private OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, @Nullable Class<E> cls, @Nullable String str, CollectionOperator<E> collectionOperator) {
        this.baseRealm = baseRealm;
        this.osResults = osResults;
        this.classSpec = cls;
        this.className = str;
        this.operator = collectionOperator;
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, String str) {
        this(baseRealm, osResults, null, str, getCollectionOperator(false, baseRealm, osResults, null, str));
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, String str, CollectionOperator<E> collectionOperator) {
        this(baseRealm, osResults, null, str, collectionOperator);
    }

    @Nullable
    private E firstImpl(boolean z, @Nullable E e) {
        return (E) this.operator.firstImpl(z, e);
    }

    protected static <T> CollectionOperator<T> getCollectionOperator(boolean z, BaseRealm baseRealm, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
        return z ? cls == Integer.class ? new IntegerValueOperator(baseRealm, osResults, Integer.class, str) : cls == Short.class ? new ShortValueOperator(baseRealm, osResults, Short.class, str) : cls == Byte.class ? new ByteValueOperator(baseRealm, osResults, Byte.class, str) : cls == RealmAny.class ? new RealmAnyValueOperator(baseRealm, osResults, RealmAny.class, str) : new PrimitiveValueOperator(baseRealm, osResults, cls, str) : new ModelCollectionOperator(baseRealm, osResults, cls, str);
    }

    private long getColumnKeyForSort(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty field name required.");
        } else if (!str.contains(".")) {
            long columnKey = this.osResults.getTable().getColumnKey(str);
            if (columnKey >= 0) {
                return columnKey;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' does not exist.", str));
        } else {
            StringBuilder sb = new StringBuilder("Aggregates on child object fields are not supported: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Nullable
    private E lastImpl(boolean z, @Nullable E e) {
        return (E) this.operator.lastImpl(z, e);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i, E e) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public boolean add(E e) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // io.realm.RealmCollection
    public double average(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.AVERAGE, getColumnKeyForSort(str)).doubleValue();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, io.realm.RealmCollection
    public boolean contains(@Nullable Object obj) {
        if (!isLoaded()) {
            return false;
        }
        if ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm() == InvalidRow.INSTANCE) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (!(next instanceof byte[]) || !(obj instanceof byte[])) {
                if (next != null && next.equals(obj)) {
                    return true;
                }
                if (next == null && obj == null) {
                    return true;
                }
            } else if (Arrays.equals((byte[]) next, (byte[]) obj)) {
                return true;
            }
        }
        return false;
    }

    RealmResults<E> createLoadedResults(OsResults osResults) {
        String str = this.className;
        RealmResults<E> realmResults = str != null ? new RealmResults<>(this.baseRealm, osResults, str) : new RealmResults<>(this.baseRealm, osResults, this.classSpec);
        realmResults.load();
        return realmResults;
    }

    @Override // io.realm.OrderedRealmCollection
    public OrderedRealmCollectionSnapshot<E> createSnapshot() {
        String str = this.className;
        return str != null ? new OrderedRealmCollectionSnapshot<>(this.baseRealm, this.osResults, str) : new OrderedRealmCollectionSnapshot<>(this.baseRealm, this.osResults, this.classSpec);
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
        this.baseRealm.checkIfValid();
        if (size() <= 0) {
            return false;
        }
        this.osResults.clear();
        return true;
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        return this.osResults.deleteFirst();
    }

    @Override // io.realm.OrderedRealmCollection
    public void deleteFromRealm(int i) {
        this.baseRealm.checkIfValidAndInTransaction();
        this.osResults.delete((long) i);
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        return this.osResults.deleteLast();
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E first() {
        return firstImpl(true, null);
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E first(@Nullable E e) {
        return firstImpl(false, e);
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public E get(int i) {
        this.baseRealm.checkIfValid();
        return (E) this.operator.get(i);
    }

    OsResults getOsResults() {
        return this.osResults;
    }

    public Realm getRealm() {
        this.baseRealm.checkIfValid();
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return (Realm) baseRealm;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    Table getTable() {
        return this.osResults.getTable();
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isManaged() {
        return true;
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isValid() {
        return this.osResults.isValid();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new RealmCollectionIterator(this);
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E last() {
        return lastImpl(true, null);
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E last(@Nullable E e) {
        return lastImpl(false, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new RealmCollectionListIterator(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        return new RealmCollectionListIterator(this, i);
    }

    @Override // io.realm.RealmCollection
    public Number max(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.MAXIMUM, getColumnKeyForSort(str));
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Date maxDate(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateDate(OsResults.Aggregate.MAXIMUM, getColumnKeyForSort(str));
    }

    @Override // io.realm.RealmCollection
    public Number min(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.MINIMUM, getColumnKeyForSort(str));
    }

    @Override // io.realm.RealmCollection
    public Date minDate(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateDate(OsResults.Aggregate.MINIMUM, getColumnKeyForSort(str));
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i, E e) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        if (!isLoaded()) {
            return 0;
        }
        long size = this.osResults.size();
        return size > 2147483647L ? Integer.MAX_VALUE : (int) size;
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str) {
        return createLoadedResults(this.osResults.sort(this.baseRealm.getSchema().getKeyPathMapping(), str, Sort.ASCENDING));
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort) {
        return createLoadedResults(this.osResults.sort(this.baseRealm.getSchema().getKeyPathMapping(), str, sort));
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String[] strArr, Sort[] sortArr) {
        return createLoadedResults(this.osResults.sort(this.baseRealm.getSchema().getKeyPathMapping(), strArr, sortArr));
    }

    @Override // io.realm.RealmCollection
    public Number sum(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.SUM, getColumnKeyForSort(str));
    }
}
