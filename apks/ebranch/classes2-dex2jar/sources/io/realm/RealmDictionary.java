package io.realm;

import io.realm.RealmMap;
import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmDictionary.class */
public class RealmDictionary<V> extends RealmMap<String, V> {
    public RealmDictionary() {
    }

    public RealmDictionary(BaseRealm baseRealm, OsMap osMap, Class<V> cls) {
        super((RealmMap.MapStrategy) getStrategy(cls, baseRealm, osMap));
    }

    public RealmDictionary(BaseRealm baseRealm, OsMap osMap, String str) {
        super((RealmMap.MapStrategy) getStrategy(str, baseRealm, osMap));
    }

    public RealmDictionary(Map<String, V> map) {
        super(map);
    }

    private static <V> DictionaryManager<V> getManager(Class<V> cls, BaseRealm baseRealm, OsMap osMap) {
        MapValueOperator mapValueOperator;
        SelectorForMap selectorForMap = new SelectorForMap(baseRealm, osMap, String.class, cls);
        if (cls == RealmAny.class) {
            mapValueOperator = new RealmAnyValueOperator(baseRealm, osMap, selectorForMap);
        } else if (cls == Long.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(Long.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.LONG);
        } else if (cls == Float.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(Float.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.FLOAT);
        } else if (cls == Double.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(Double.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.DOUBLE);
        } else if (cls == String.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(String.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.STRING);
        } else if (cls == Boolean.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(Boolean.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.BOOLEAN);
        } else if (cls == Date.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(Date.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.DATE);
        } else if (cls == Decimal128.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(Decimal128.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.DECIMAL128);
        } else if (cls == Integer.class) {
            mapValueOperator = new IntegerValueOperator(baseRealm, osMap, selectorForMap);
        } else if (cls == Short.class) {
            mapValueOperator = new ShortValueOperator(baseRealm, osMap, selectorForMap);
        } else if (cls == Byte.class) {
            mapValueOperator = new ByteValueOperator(baseRealm, osMap, selectorForMap);
        } else if (cls == byte[].class) {
            mapValueOperator = new GenericPrimitiveValueOperator(byte[].class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.BINARY, new BinaryEquals());
        } else if (cls == ObjectId.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(ObjectId.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.OBJECT_ID);
        } else if (cls == UUID.class) {
            mapValueOperator = new GenericPrimitiveValueOperator(UUID.class, baseRealm, osMap, selectorForMap, RealmMapEntrySet.IteratorType.UUID);
        } else {
            throw new IllegalArgumentException("Only Maps of RealmAny or one of the types that can be boxed inside RealmAny can be used.");
        }
        return new DictionaryManager<>(baseRealm, mapValueOperator, selectorForMap);
    }

    private static <V> DictionaryManager<V> getManager(String str, BaseRealm baseRealm, OsMap osMap) {
        MapValueOperator realmAnyValueOperator = str.equals(RealmAny.class.getCanonicalName()) ? new RealmAnyValueOperator(baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, RealmAny.class)) : str.equals(Long.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(Long.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Long.class), RealmMapEntrySet.IteratorType.LONG) : str.equals(Float.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(Float.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Float.class), RealmMapEntrySet.IteratorType.FLOAT) : str.equals(Double.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(Double.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Double.class), RealmMapEntrySet.IteratorType.DOUBLE) : str.equals(String.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(String.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, String.class), RealmMapEntrySet.IteratorType.STRING) : str.equals(Boolean.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(Boolean.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Boolean.class), RealmMapEntrySet.IteratorType.BOOLEAN) : str.equals(Date.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(Date.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Date.class), RealmMapEntrySet.IteratorType.DATE) : str.equals(Decimal128.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(Decimal128.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Decimal128.class), RealmMapEntrySet.IteratorType.DECIMAL128) : str.equals(Integer.class.getCanonicalName()) ? new IntegerValueOperator(baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Integer.class)) : str.equals(Short.class.getCanonicalName()) ? new ShortValueOperator(baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Short.class)) : str.equals(Byte.class.getCanonicalName()) ? new ByteValueOperator(baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, Byte.class)) : str.equals(byte[].class.getCanonicalName()) ? new GenericPrimitiveValueOperator(byte[].class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, byte[].class), RealmMapEntrySet.IteratorType.BINARY, new BinaryEquals()) : str.equals(ObjectId.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(ObjectId.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, ObjectId.class), RealmMapEntrySet.IteratorType.OBJECT_ID) : str.equals(UUID.class.getCanonicalName()) ? new GenericPrimitiveValueOperator(UUID.class, baseRealm, osMap, new SelectorForMap(baseRealm, osMap, String.class, UUID.class), RealmMapEntrySet.IteratorType.UUID) : new RealmModelValueOperator(baseRealm, osMap, new DynamicSelectorForMap(baseRealm, osMap, str));
        return new DictionaryManager<>(baseRealm, realmAnyValueOperator, realmAnyValueOperator.typeSelectorForMap);
    }

    private static <V extends RealmModel> LinkSelectorForMap<String, V> getRealmSelector(Class<V> cls, BaseRealm baseRealm, OsMap osMap) {
        return new LinkSelectorForMap<>(baseRealm, osMap, String.class, cls);
    }

    private static <V> RealmMap.ManagedMapStrategy<String, V> getStrategy(Class<V> cls, BaseRealm baseRealm, OsMap osMap) {
        if (!CollectionUtils.isClassForRealmModel(cls)) {
            return new RealmMap.ManagedMapStrategy<>(getManager(cls, baseRealm, osMap));
        }
        LinkSelectorForMap realmSelector = getRealmSelector(cls, baseRealm, osMap);
        return new RealmMap.ManagedMapStrategy<>(new DictionaryManager(baseRealm, new RealmModelValueOperator(baseRealm, osMap, realmSelector), realmSelector));
    }

    private static <V> RealmMap.ManagedMapStrategy<String, V> getStrategy(String str, BaseRealm baseRealm, OsMap osMap) {
        return new RealmMap.ManagedMapStrategy<>(getManager(str, baseRealm, osMap));
    }

    private Map<String, V> toMap() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, V> entry : entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
}
