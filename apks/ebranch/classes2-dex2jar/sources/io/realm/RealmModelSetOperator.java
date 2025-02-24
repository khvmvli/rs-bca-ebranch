package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmModelSetOperator.class */
class RealmModelSetOperator<T extends RealmModel> extends SetValueOperator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmModelSetOperator(BaseRealm baseRealm, OsSet osSet, Class<T> cls) {
        super(baseRealm, osSet, cls);
    }

    private void checkValidCollection(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            checkValidObject((RealmModel) it.next());
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

    private T getManagedObject(T t) {
        if (t != null) {
            T t2 = t;
            if (CollectionUtils.checkCanObjectBeCopied(this.baseRealm, t, this.valueClass.getName(), "set")) {
                t2 = (T) CollectionUtils.copyToRealm(this.baseRealm, t);
            }
            return t2;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    boolean add(T t) {
        return this.osSet.addRow(getManagedObject(t).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.SetValueOperator
    /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((RealmModelSetOperator<T>) ((RealmModel) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getManagedObject((RealmModel) it.next()));
        }
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    /* JADX WARN: Multi-variable type inference failed */
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

    /* JADX WARN: Multi-variable type inference failed */
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        checkValidCollection(collection);
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // io.realm.SetValueOperator
    RealmQuery<T> where() {
        return new RealmQuery<>(this.baseRealm, this.osSet, this.valueClass);
    }
}
