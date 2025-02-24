package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes2-dex2jar.jar:io/realm/DynamicSetOperator.class */
class DynamicSetOperator extends SetValueOperator<DynamicRealmObject> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicSetOperator(BaseRealm baseRealm, OsSet osSet, String str) {
        super(baseRealm, osSet, DynamicRealmObject.class, str);
    }

    private void checkValidCollection(Collection<? extends DynamicRealmObject> collection) {
        for (DynamicRealmObject dynamicRealmObject : collection) {
            checkValidObject(dynamicRealmObject);
        }
    }

    private void checkValidObject(RealmModel realmModel) {
        if (realmModel == null) {
            throw new NullPointerException("This set does not permit null values.");
        } else if (!RealmObject.isValid(realmModel) || !RealmObject.isManaged(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        } else if (((RealmObjectProxy) realmModel).realmGet$proxyState().getRealm$realm() != this.baseRealm) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
    }

    private DynamicRealmObject getManagedObject(DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealmObject != null) {
            DynamicRealmObject dynamicRealmObject2 = dynamicRealmObject;
            if (CollectionUtils.checkCanObjectBeCopied(this.baseRealm, dynamicRealmObject, this.className, "set")) {
                dynamicRealmObject2 = CollectionUtils.copyToRealm(this.baseRealm, dynamicRealmObject);
            }
            return dynamicRealmObject2;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean add(DynamicRealmObject dynamicRealmObject) {
        return this.osSet.addRow(getManagedObject(dynamicRealmObject).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends DynamicRealmObject> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (DynamicRealmObject dynamicRealmObject : collection) {
            arrayList.add(getManagedObject(dynamicRealmObject));
        }
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsAllInternal(Collection<?> collection) {
        checkValidCollection(collection);
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsInternal(Object obj) {
        checkValidObject((RealmModel) obj);
        return this.osSet.containsRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // io.realm.SetValueOperator
    boolean removeAllInternal(Collection<?> collection) {
        checkValidCollection(collection);
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean removeInternal(Object obj) {
        checkValidObject((RealmModel) obj);
        return this.osSet.removeRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        checkValidCollection(collection);
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // io.realm.SetValueOperator
    RealmQuery<DynamicRealmObject> where() {
        return new RealmQuery<>(this.baseRealm, this.osSet, this.valueClass);
    }
}
