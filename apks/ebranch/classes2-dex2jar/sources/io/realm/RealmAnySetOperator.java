package io.realm;

import io.realm.RealmAny;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmAnySetOperator.class */
class RealmAnySetOperator extends SetValueOperator<RealmAny> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmAnySetOperator(BaseRealm baseRealm, OsSet osSet, Class<RealmAny> cls) {
        super(baseRealm, osSet, cls);
    }

    private void checkValidObject(RealmAny realmAny) {
        try {
            realmAny.checkValidObject(this.baseRealm);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("RealmAny collection contains unmanaged objects.", e);
        }
    }

    private RealmAny getManagedRealmAny(@Nullable RealmAny realmAny) {
        RealmAny realmAny2;
        if (realmAny == null) {
            realmAny2 = RealmAny.nullValue();
        } else {
            realmAny2 = realmAny;
            if (realmAny.getType() == RealmAny.Type.OBJECT) {
                RealmObjectProxy asRealmModel = realmAny.asRealmModel(RealmModel.class);
                RealmObjectProxy realmObjectProxy = asRealmModel;
                if (CollectionUtils.checkCanObjectBeCopied(this.baseRealm, asRealmModel, this.valueClass.getName(), "set")) {
                    realmObjectProxy = CollectionUtils.copyToRealm(this.baseRealm, asRealmModel);
                }
                realmAny2 = RealmAny.valueOf(realmObjectProxy);
            }
        }
        return realmAny2;
    }

    private NativeRealmAnyCollection getNativeRealmAnyCollection(Collection<? extends RealmAny> collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (RealmAny realmAny : collection) {
            if (realmAny != null) {
                checkValidObject(realmAny);
                jArr[i] = realmAny.getNativePtr();
                zArr[i] = true;
            }
            i++;
        }
        return NativeRealmAnyCollection.newRealmAnyCollection(jArr, zArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean add(@Nullable RealmAny realmAny) {
        return this.osSet.addRealmAny(getManagedRealmAny(realmAny).getNativePtr());
    }

    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends RealmAny> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (RealmAny realmAny : collection) {
            arrayList.add(getManagedRealmAny(realmAny));
        }
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsInternal(@Nullable Object obj) {
        RealmAny nullValue = obj == null ? RealmAny.nullValue() : (RealmAny) obj;
        checkValidObject(nullValue);
        return this.osSet.containsRealmAny(nullValue.getNativePtr());
    }

    @Override // io.realm.SetValueOperator
    boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean removeInternal(@Nullable Object obj) {
        RealmAny nullValue = obj == null ? RealmAny.nullValue() : (RealmAny) obj;
        checkValidObject(nullValue);
        return this.osSet.removeRealmAny(nullValue.getNativePtr());
    }

    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }
}
