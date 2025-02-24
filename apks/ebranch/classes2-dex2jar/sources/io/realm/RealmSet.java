package io.realm;

import io.realm.internal.ManageableObject;
import io.realm.internal.OsSet;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmSet.class */
public class RealmSet<E> implements Set<E>, ManageableObject, RealmCollection<E> {
    protected final SetStrategy<E> setStrategy;

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmSet$ManagedSetStrategy.class */
    public static class ManagedSetStrategy<E> extends SetStrategy<E> {
        private final SetValueOperator<E> setValueOperator;
        private Class<E> valueClass;

        ManagedSetStrategy(SetValueOperator<E> setValueOperator, Class<E> cls) {
            super();
            this.setValueOperator = setValueOperator;
            this.valueClass = cls;
        }

        private <T> void checkValidArray(T[] tArr) {
            if (tArr != null) {
                String simpleName = this.valueClass.getSimpleName();
                String simpleName2 = tArr.getClass().getComponentType().getSimpleName();
                if (!simpleName.equals(simpleName2)) {
                    StringBuilder sb = new StringBuilder("Array type must be of type '");
                    sb.append(simpleName);
                    sb.append("' but it was of type '");
                    sb.append(simpleName2);
                    sb.append("'.");
                    throw new ArrayStoreException(sb.toString());
                }
                return;
            }
            throw new NullPointerException("Cannot pass a null array when calling 'toArray'.");
        }

        private void checkValidCollection(Collection<?> collection) {
            if (collection == null) {
                throw new NullPointerException("Collection must not be null.");
            }
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(@Nullable E e) {
            return this.setValueOperator.add(e);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            checkValidCollection(collection);
            return this.setValueOperator.addAll(collection);
        }

        @Override // io.realm.RealmSet.SetStrategy
        void addChangeListener(RealmSet<E> realmSet, RealmChangeListener<RealmSet<E>> realmChangeListener) {
            this.setValueOperator.addChangeListener(realmSet, realmChangeListener);
        }

        @Override // io.realm.RealmSet.SetStrategy
        void addChangeListener(RealmSet<E> realmSet, SetChangeListener<E> setChangeListener) {
            this.setValueOperator.addChangeListener(realmSet, setChangeListener);
        }

        public double average(String str) {
            return where().average(str);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.setValueOperator.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(@Nullable Object obj) {
            return this.setValueOperator.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            checkValidCollection(collection);
            return this.setValueOperator.containsAll(collection);
        }

        public boolean deleteAllFromRealm() {
            this.setValueOperator.baseRealm.checkIfValid();
            if (this.setValueOperator.isEmpty()) {
                return false;
            }
            this.setValueOperator.deleteAll();
            return true;
        }

        @Override // io.realm.RealmSet.SetStrategy
        public RealmSet<E> freeze() {
            return this.setValueOperator.freeze();
        }

        @Override // io.realm.RealmSet.SetStrategy
        OsSet getOsSet() {
            return this.setValueOperator.getOsSet();
        }

        @Override // io.realm.RealmSet.SetStrategy
        public Class<E> getValueClass() {
            return this.setValueOperator.getValueClass();
        }

        @Override // io.realm.RealmSet.SetStrategy
        public String getValueClassName() {
            return this.setValueOperator.getValueClassName();
        }

        @Override // io.realm.RealmSet.SetStrategy
        boolean hasListeners() {
            return this.setValueOperator.hasListeners();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.setValueOperator.isEmpty();
        }

        public boolean isFrozen() {
            return this.setValueOperator.isFrozen();
        }

        public boolean isLoaded() {
            return true;
        }

        public boolean isManaged() {
            return true;
        }

        public boolean isValid() {
            return this.setValueOperator.isValid();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return this.setValueOperator.iterator();
        }

        public boolean load() {
            return true;
        }

        @Nullable
        public Number max(String str) {
            return where().max(str);
        }

        @Nullable
        public Date maxDate(String str) {
            return where().maximumDate(str);
        }

        @Nullable
        public Number min(String str) {
            return where().min(str);
        }

        @Nullable
        public Date minDate(String str) {
            return where().minimumDate(str);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(@Nullable Object obj) {
            return this.setValueOperator.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            checkValidCollection(collection);
            return this.setValueOperator.removeAll(collection);
        }

        @Override // io.realm.RealmSet.SetStrategy
        void removeAllChangeListeners() {
            this.setValueOperator.removeAllChangeListeners();
        }

        @Override // io.realm.RealmSet.SetStrategy
        void removeChangeListener(RealmSet<E> realmSet, RealmChangeListener<RealmSet<E>> realmChangeListener) {
            this.setValueOperator.removeChangeListener(realmSet, realmChangeListener);
        }

        @Override // io.realm.RealmSet.SetStrategy
        void removeChangeListener(RealmSet<E> realmSet, SetChangeListener<E> setChangeListener) {
            this.setValueOperator.removeChangeListener(realmSet, setChangeListener);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            checkValidCollection(collection);
            return this.setValueOperator.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.setValueOperator.size();
        }

        public Number sum(String str) {
            return where().sum(str);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            Object[] objArr = new Object[size()];
            Iterator<E> it = iterator();
            int i = 0;
            while (it.hasNext()) {
                objArr[i] = it.next();
                i++;
            }
            return objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            checkValidArray(tArr);
            long size = (long) size();
            T[] tArr2 = (((long) tArr.length) == size || ((long) tArr.length) > size) ? tArr : (T[]) ((Object[]) Array.newInstance((Class<?>) this.valueClass, (int) size));
            Iterator<E> it = iterator();
            int i = 0;
            while (it.hasNext()) {
                E next = it.next();
                if (next == null) {
                    tArr2[i] = null;
                } else {
                    tArr2[i] = next;
                }
                i++;
            }
            if (((long) tArr.length) > size) {
                tArr2[i] = null;
            }
            return tArr2;
        }

        public RealmQuery<E> where() {
            return this.setValueOperator.where();
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmSet$SetStrategy.class */
    public static abstract class SetStrategy<E> implements Set<E>, ManageableObject, RealmCollection<E> {
        private SetStrategy() {
        }

        abstract void addChangeListener(RealmSet<E> realmSet, RealmChangeListener<RealmSet<E>> realmChangeListener);

        abstract void addChangeListener(RealmSet<E> realmSet, SetChangeListener<E> setChangeListener);

        public abstract RealmSet<E> freeze();

        abstract OsSet getOsSet();

        abstract Class<E> getValueClass();

        abstract String getValueClassName();

        abstract boolean hasListeners();

        abstract void removeAllChangeListeners();

        abstract void removeChangeListener(RealmSet<E> realmSet, RealmChangeListener<RealmSet<E>> realmChangeListener);

        abstract void removeChangeListener(RealmSet<E> realmSet, SetChangeListener<E> setChangeListener);
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmSet$UnmanagedSetStrategy.class */
    static class UnmanagedSetStrategy<E> extends SetStrategy<E> {
        private static final String ONLY_IN_MANAGED_MODE_MESSAGE;
        private final Set<E> unmanagedSet;

        UnmanagedSetStrategy() {
            super();
            this.unmanagedSet = new HashSet();
        }

        UnmanagedSetStrategy(Collection<E> collection) {
            this();
            this.unmanagedSet.addAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(@Nullable E e) {
            return this.unmanagedSet.add(e);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            return this.unmanagedSet.addAll(collection);
        }

        @Override // io.realm.RealmSet.SetStrategy
        void addChangeListener(RealmSet<E> realmSet, RealmChangeListener<RealmSet<E>> realmChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.RealmSet.SetStrategy
        void addChangeListener(RealmSet<E> realmSet, SetChangeListener<E> setChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        public double average(String str) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.unmanagedSet.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(@Nullable Object obj) {
            return this.unmanagedSet.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.unmanagedSet.containsAll(collection);
        }

        public boolean deleteAllFromRealm() {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }

        @Override // io.realm.RealmSet.SetStrategy
        public RealmSet<E> freeze() {
            throw new UnsupportedOperationException("Unmanaged RealmSets cannot be frozen.");
        }

        @Override // io.realm.RealmSet.SetStrategy
        OsSet getOsSet() {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not have a representation in native code.");
        }

        @Override // io.realm.RealmSet.SetStrategy
        public Class<E> getValueClass() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class.");
        }

        @Override // io.realm.RealmSet.SetStrategy
        public String getValueClassName() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class name.");
        }

        @Override // io.realm.RealmSet.SetStrategy
        boolean hasListeners() {
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.unmanagedSet.isEmpty();
        }

        public boolean isFrozen() {
            return false;
        }

        public boolean isLoaded() {
            return true;
        }

        public boolean isManaged() {
            return false;
        }

        public boolean isValid() {
            return true;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return this.unmanagedSet.iterator();
        }

        public boolean load() {
            return true;
        }

        @Nullable
        public Number max(String str) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }

        @Nullable
        public Date maxDate(String str) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }

        @Nullable
        public Number min(String str) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }

        @Nullable
        public Date minDate(String str) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(@Nullable Object obj) {
            return this.unmanagedSet.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.unmanagedSet.removeAll(collection);
        }

        @Override // io.realm.RealmSet.SetStrategy
        void removeAllChangeListeners() {
            throw new UnsupportedOperationException("Cannot remove change listeners because unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.RealmSet.SetStrategy
        void removeChangeListener(RealmSet<E> realmSet, RealmChangeListener<RealmSet<E>> realmChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.RealmSet.SetStrategy
        void removeChangeListener(RealmSet<E> realmSet, SetChangeListener<E> setChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.unmanagedSet.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.unmanagedSet.size();
        }

        public Number sum(String str) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.unmanagedSet.toArray();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.unmanagedSet.toArray(tArr);
        }

        public RealmQuery<E> where() {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
    }

    public RealmSet() {
        this.setStrategy = new UnmanagedSetStrategy();
    }

    public RealmSet(BaseRealm baseRealm, OsSet osSet, Class<E> cls) {
        this.setStrategy = getStrategy(baseRealm, osSet, cls);
    }

    public RealmSet(BaseRealm baseRealm, OsSet osSet, String str) {
        this.setStrategy = getStrategy(baseRealm, osSet, str);
    }

    public RealmSet(Collection<E> collection) {
        this.setStrategy = new UnmanagedSetStrategy(collection);
    }

    private static <T> ManagedSetStrategy<T> getStrategy(BaseRealm baseRealm, OsSet osSet, Class<T> cls) {
        SetValueOperator setValueOperator;
        if (CollectionUtils.isClassForRealmModel(cls)) {
            return new ManagedSetStrategy<>(new RealmModelSetOperator(baseRealm, osSet, cls), cls);
        }
        if (cls == Boolean.class) {
            setValueOperator = new BooleanOperator(baseRealm, osSet, Boolean.class);
        } else if (cls == String.class) {
            setValueOperator = new StringOperator(baseRealm, osSet, String.class);
        } else if (cls == Integer.class) {
            setValueOperator = new IntegerOperator(baseRealm, osSet, Integer.class);
        } else if (cls == Long.class) {
            setValueOperator = new LongOperator(baseRealm, osSet, Long.class);
        } else if (cls == Short.class) {
            setValueOperator = new ShortOperator(baseRealm, osSet, Short.class);
        } else if (cls == Byte.class) {
            setValueOperator = new ByteOperator(baseRealm, osSet, Byte.class);
        } else if (cls == Float.class) {
            setValueOperator = new FloatOperator(baseRealm, osSet, Float.class);
        } else if (cls == Double.class) {
            setValueOperator = new DoubleOperator(baseRealm, osSet, Double.class);
        } else if (cls == byte[].class) {
            setValueOperator = new BinaryOperator(baseRealm, osSet, byte[].class);
        } else if (cls == Date.class) {
            setValueOperator = new DateOperator(baseRealm, osSet, Date.class);
        } else if (cls == Decimal128.class) {
            setValueOperator = new Decimal128Operator(baseRealm, osSet, Decimal128.class);
        } else if (cls == ObjectId.class) {
            setValueOperator = new ObjectIdOperator(baseRealm, osSet, ObjectId.class);
        } else if (cls == UUID.class) {
            setValueOperator = new UUIDOperator(baseRealm, osSet, UUID.class);
        } else if (cls == RealmAny.class) {
            setValueOperator = new RealmAnySetOperator(baseRealm, osSet, RealmAny.class);
        } else if (cls == Number.class) {
            setValueOperator = new NumberOperator(baseRealm, osSet, Number.class);
        } else {
            StringBuilder sb = new StringBuilder("getStrategy: missing class '");
            sb.append(cls.getSimpleName());
            sb.append("'");
            throw new UnsupportedOperationException(sb.toString());
        }
        return new ManagedSetStrategy<>(setValueOperator, cls);
    }

    private static <T> ManagedSetStrategy<T> getStrategy(BaseRealm baseRealm, OsSet osSet, String str) {
        SetValueOperator booleanOperator = str.equals(Boolean.class.getCanonicalName()) ? new BooleanOperator(baseRealm, osSet, Boolean.class) : str.equals(String.class.getCanonicalName()) ? new StringOperator(baseRealm, osSet, String.class) : str.equals(Integer.class.getCanonicalName()) ? new IntegerOperator(baseRealm, osSet, Integer.class) : str.equals(Long.class.getCanonicalName()) ? new LongOperator(baseRealm, osSet, Long.class) : str.equals(Short.class.getCanonicalName()) ? new ShortOperator(baseRealm, osSet, Short.class) : str.equals(Byte.class.getCanonicalName()) ? new ByteOperator(baseRealm, osSet, Byte.class) : str.equals(Float.class.getCanonicalName()) ? new FloatOperator(baseRealm, osSet, Float.class) : str.equals(Double.class.getCanonicalName()) ? new DoubleOperator(baseRealm, osSet, Double.class) : str.equals(byte[].class.getCanonicalName()) ? new BinaryOperator(baseRealm, osSet, byte[].class) : str.equals(Date.class.getCanonicalName()) ? new DateOperator(baseRealm, osSet, Date.class) : str.equals(Decimal128.class.getCanonicalName()) ? new Decimal128Operator(baseRealm, osSet, Decimal128.class) : str.equals(ObjectId.class.getCanonicalName()) ? new ObjectIdOperator(baseRealm, osSet, ObjectId.class) : str.equals(UUID.class.getCanonicalName()) ? new UUIDOperator(baseRealm, osSet, UUID.class) : str.equals(RealmAny.class.getCanonicalName()) ? new RealmAnySetOperator(baseRealm, osSet, RealmAny.class) : new DynamicSetOperator(baseRealm, osSet, str);
        return new ManagedSetStrategy<>(booleanOperator, booleanOperator.getValueClass());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(@Nullable E e) {
        return this.setStrategy.add(e);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.setStrategy.addAll(collection);
    }

    public void addChangeListener(RealmChangeListener<RealmSet<E>> realmChangeListener) {
        this.setStrategy.addChangeListener(this, realmChangeListener);
    }

    public void addChangeListener(SetChangeListener<E> setChangeListener) {
        this.setStrategy.addChangeListener(this, setChangeListener);
    }

    public double average(String str) {
        return this.setStrategy.average(str);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.setStrategy.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        return this.setStrategy.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.setStrategy.containsAll(collection);
    }

    public boolean deleteAllFromRealm() {
        return this.setStrategy.deleteAllFromRealm();
    }

    public RealmSet<E> freeze() {
        return this.setStrategy.freeze();
    }

    public OsSet getOsSet() {
        return this.setStrategy.getOsSet();
    }

    public Class<E> getValueClass() {
        return this.setStrategy.getValueClass();
    }

    public String getValueClassName() {
        return this.setStrategy.getValueClassName();
    }

    boolean hasListeners() {
        return this.setStrategy.hasListeners();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.setStrategy.isEmpty();
    }

    public boolean isFrozen() {
        return this.setStrategy.isFrozen();
    }

    public boolean isLoaded() {
        return true;
    }

    public boolean isManaged() {
        return this.setStrategy.isManaged();
    }

    public boolean isValid() {
        return this.setStrategy.isValid();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.setStrategy.iterator();
    }

    public boolean load() {
        return true;
    }

    @Nullable
    public Number max(String str) {
        return this.setStrategy.max(str);
    }

    @Nullable
    public Date maxDate(String str) {
        return this.setStrategy.maxDate(str);
    }

    @Nullable
    public Number min(String str) {
        return this.setStrategy.min(str);
    }

    @Nullable
    public Date minDate(String str) {
        return this.setStrategy.minDate(str);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        return this.setStrategy.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.setStrategy.removeAll(collection);
    }

    public void removeAllChangeListeners() {
        this.setStrategy.removeAllChangeListeners();
    }

    public void removeChangeListener(RealmChangeListener<RealmSet<E>> realmChangeListener) {
        this.setStrategy.removeChangeListener(this, realmChangeListener);
    }

    public void removeChangeListener(SetChangeListener<E> setChangeListener) {
        this.setStrategy.removeChangeListener(this, setChangeListener);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.setStrategy.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.setStrategy.size();
    }

    public Number sum(String str) {
        return this.setStrategy.sum(str);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.setStrategy.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.setStrategy.toArray(tArr);
    }

    public RealmQuery<E> where() {
        return this.setStrategy.where();
    }
}
