package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.util.Pair;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet.class */
class RealmMapEntrySet<K, V> implements Set<Map.Entry<K, V>> {
    private final BaseRealm baseRealm;
    private final EqualsHelper<K, V> equalsHelper;
    private final IteratorType iteratorType;
    private final OsMap osMap;
    private final TypeSelectorForMap<K, V> typeSelectorForMap;

    /* renamed from: io.realm.RealmMapEntrySet$1 */
    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmMapEntrySet$IteratorType;

        static {
            int[] iArr = new int[IteratorType.values().length];
            $SwitchMap$io$realm$RealmMapEntrySet$IteratorType = iArr;
            try {
                iArr[IteratorType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.DATE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.BINARY.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.OBJECT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.UUID.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.MIXED.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.OBJECT.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$BinaryValueIterator.class */
    public static class BinaryValueIterator<K> extends EntrySetIterator<K, byte[]> {
        BinaryValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, byte[]> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (byte[]) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$BooleanValueIterator.class */
    public static class BooleanValueIterator<K> extends EntrySetIterator<K, Boolean> {
        BooleanValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Boolean> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Boolean) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$ByteValueIterator.class */
    public static class ByteValueIterator<K> extends EntrySetIterator<K, Byte> {
        ByteValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Byte> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Byte.valueOf(((Long) entryForPrimitive.second).byteValue()));
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$DateValueIterator.class */
    public static class DateValueIterator<K> extends EntrySetIterator<K, Date> {
        DateValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Date> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Date) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$Decimal128ValueIterator.class */
    public static class Decimal128ValueIterator<K> extends EntrySetIterator<K, Decimal128> {
        Decimal128ValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Decimal128> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Decimal128) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$DoubleValueIterator.class */
    public static class DoubleValueIterator<K> extends EntrySetIterator<K, Double> {
        DoubleValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Double> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Double) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$EntrySetIterator.class */
    public static abstract class EntrySetIterator<K, V> implements Iterator<Map.Entry<K, V>> {
        protected final BaseRealm baseRealm;
        protected final OsMap osMap;
        private int pos = -1;

        EntrySetIterator(OsMap osMap, BaseRealm baseRealm) {
            this.osMap = osMap;
            this.baseRealm = baseRealm;
        }

        protected abstract Map.Entry<K, V> getEntryInternal(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z = true;
            if (((long) (this.pos + 1)) >= this.osMap.size()) {
                z = false;
            }
            return z;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.pos++;
            long size = this.osMap.size();
            int i = this.pos;
            if (((long) i) < size) {
                return getEntryInternal(i);
            }
            StringBuilder sb = new StringBuilder("Cannot access index ");
            sb.append(this.pos);
            sb.append(" when size is ");
            sb.append(size);
            sb.append(". Remember to check hasNext() before using next().");
            throw new NoSuchElementException(sb.toString());
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$FloatValueIterator.class */
    public static class FloatValueIterator<K> extends EntrySetIterator<K, Float> {
        FloatValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Float> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Float) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$IntegerValueIterator.class */
    public static class IntegerValueIterator<K> extends EntrySetIterator<K, Integer> {
        IntegerValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Integer> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Integer.valueOf(((Long) entryForPrimitive.second).intValue()));
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$IteratorType.class */
    public enum IteratorType {
        LONG,
        BYTE,
        SHORT,
        INTEGER,
        FLOAT,
        DOUBLE,
        STRING,
        BOOLEAN,
        DATE,
        DECIMAL128,
        BINARY,
        OBJECT_ID,
        UUID,
        MIXED,
        OBJECT
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$LongValueIterator.class */
    public static class LongValueIterator<K> extends EntrySetIterator<K, Long> {
        LongValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Long> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Long) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$ObjectIdValueIterator.class */
    public static class ObjectIdValueIterator<K> extends EntrySetIterator<K, ObjectId> {
        ObjectIdValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, ObjectId> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (ObjectId) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$RealmAnyValueIterator.class */
    public static class RealmAnyValueIterator<K> extends EntrySetIterator<K, RealmAny> {
        RealmAnyValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, RealmAny> getEntryInternal(int i) {
            Pair<K, NativeRealmAny> keyRealmAnyPair = this.osMap.getKeyRealmAnyPair(i);
            return new AbstractMap.SimpleImmutableEntry(keyRealmAnyPair.first, new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, (NativeRealmAny) keyRealmAnyPair.second)));
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$RealmModelValueIterator.class */
    public static class RealmModelValueIterator<K, V> extends EntrySetIterator<K, V> {
        private final TypeSelectorForMap<K, V> typeSelectorForMap;

        RealmModelValueIterator(OsMap osMap, BaseRealm baseRealm, TypeSelectorForMap<K, V> typeSelectorForMap) {
            super(osMap, baseRealm);
            this.typeSelectorForMap = typeSelectorForMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, V> getEntryInternal(int i) {
            Pair<K, Long> keyObjRowPair = this.osMap.getKeyObjRowPair(i);
            Object obj = keyObjRowPair.first;
            long longValue = ((Long) keyObjRowPair.second).longValue();
            return longValue == -1 ? new AbstractMap.SimpleImmutableEntry(obj, null) : this.typeSelectorForMap.getModelEntry(this.baseRealm, longValue, obj);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$ShortValueIterator.class */
    public static class ShortValueIterator<K> extends EntrySetIterator<K, Short> {
        ShortValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, Short> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Short.valueOf(((Long) entryForPrimitive.second).shortValue()));
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$StringValueIterator.class */
    public static class StringValueIterator<K> extends EntrySetIterator<K, String> {
        StringValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, String> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (String) entryForPrimitive.second);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/RealmMapEntrySet$UUIDValueIterator.class */
    public static class UUIDValueIterator<K> extends EntrySetIterator<K, UUID> {
        UUIDValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        protected Map.Entry<K, UUID> getEntryInternal(int i) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (UUID) entryForPrimitive.second);
        }
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, EqualsHelper<K, V> equalsHelper, TypeSelectorForMap<K, V> typeSelectorForMap) {
        this.baseRealm = baseRealm;
        this.osMap = osMap;
        this.iteratorType = iteratorType;
        this.equalsHelper = equalsHelper;
        this.typeSelectorForMap = typeSelectorForMap;
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, TypeSelectorForMap<K, V> typeSelectorForMap) {
        this.baseRealm = baseRealm;
        this.osMap = osMap;
        this.iteratorType = iteratorType;
        this.equalsHelper = new GenericEquals();
        this.typeSelectorForMap = typeSelectorForMap;
    }

    private static <K, V> EntrySetIterator<K, V> iteratorFactory(IteratorType iteratorType, OsMap osMap, BaseRealm baseRealm, TypeSelectorForMap typeSelectorForMap) {
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType[iteratorType.ordinal()]) {
            case 1:
                return new LongValueIterator(osMap, baseRealm);
            case 2:
                return new ByteValueIterator(osMap, baseRealm);
            case 3:
                return new ShortValueIterator(osMap, baseRealm);
            case 4:
                return new IntegerValueIterator(osMap, baseRealm);
            case 5:
                return new FloatValueIterator(osMap, baseRealm);
            case 6:
                return new DoubleValueIterator(osMap, baseRealm);
            case 7:
                return new StringValueIterator(osMap, baseRealm);
            case 8:
                return new BooleanValueIterator(osMap, baseRealm);
            case 9:
                return new DateValueIterator(osMap, baseRealm);
            case 10:
                return new Decimal128ValueIterator(osMap, baseRealm);
            case 11:
                return new BinaryValueIterator(osMap, baseRealm);
            case 12:
                return new ObjectIdValueIterator(osMap, baseRealm);
            case 13:
                return new UUIDValueIterator(osMap, baseRealm);
            case 14:
                return new RealmAnyValueIterator(osMap, baseRealm);
            case 15:
                if (typeSelectorForMap != null) {
                    return new RealmModelValueIterator(osMap, baseRealm, typeSelectorForMap);
                }
                throw new IllegalArgumentException("Missing class container when creating RealmModelValueIterator.");
            default:
                throw new IllegalArgumentException("Invalid iterator type.");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((Map.Entry) ((Map.Entry) obj));
    }

    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (next == null && obj == null) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            if (next != null && this.equalsHelper.equalsHelper(next, (Map.Entry) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // java.util.Set, java.util.Collection
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean containsAll(java.util.Collection<?> r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            r0 = r3
            boolean r0 = r0.isEmpty()
            return r0
        L_0x000e:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L_0x0015:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0039
            r0 = r5
            java.lang.Object r0 = r0.next()
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0037
            r0 = r3
            r1 = r4
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0015
        L_0x0037:
            r0 = 0
            return r0
        L_0x0039:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmMapEntrySet.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.osMap.size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return iteratorFactory(this.iteratorType, this.osMap, this.baseRealm, this.typeSelectorForMap);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        long size = this.osMap.size();
        return size < 2147483647L ? (int) size : Integer.MAX_VALUE;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[(int) this.osMap.size()];
        Iterator<Map.Entry<K, V>> it = iterator();
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
        long size = this.osMap.size();
        T[] tArr2 = (((long) tArr.length) == size || ((long) tArr.length) > size) ? tArr : (T[]) ((Object[]) Array.newInstance(Map.Entry.class, (int) size));
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            tArr2[i] = it.next();
            i++;
        }
        if (((long) tArr.length) > size) {
            tArr2[i] = null;
        }
        return tArr2;
    }
}
