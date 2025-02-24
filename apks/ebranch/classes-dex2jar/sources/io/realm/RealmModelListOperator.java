package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import java.util.Locale;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/RealmModelListOperator.class */
public final class RealmModelListOperator<T> extends ManagedListOperator<T> {
    @Nullable
    private final String className;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmModelListOperator(BaseRealm baseRealm, OsList osList, @Nullable Class<T> cls, @Nullable String str) {
        super(baseRealm, osList, cls);
        this.className = str;
    }

    @Override // io.realm.ManagedListOperator
    public final void appendValue(Object obj) {
        RealmModel realmModel = (RealmModel) obj;
        boolean checkCanObjectBeCopied = CollectionUtils.checkCanObjectBeCopied(this.realm, realmModel, this.className, CollectionUtils.LIST_TYPE);
        if (!CollectionUtils.isEmbedded(this.realm, realmModel)) {
            RealmModel realmModel2 = realmModel;
            if (checkCanObjectBeCopied) {
                realmModel2 = CollectionUtils.copyToRealm(this.realm, realmModel);
            }
            this.osList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (!(obj instanceof DynamicRealmObject)) {
            CollectionUtils.updateEmbeddedObject((Realm) this.realm, realmModel, this.osList.createAndAddEmbeddedObject());
        } else {
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
    }

    @Override // io.realm.ManagedListOperator
    protected final void checkValidValue(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("RealmList does not accept null values.");
        } else if (!(obj instanceof RealmModel)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public final boolean forRealmModel() {
        return true;
    }

    @Override // io.realm.ManagedListOperator
    public final T get(int i) {
        return (T) this.realm.get(this.clazz, this.className, this.osList.getUncheckedRow((long) i));
    }

    @Override // io.realm.ManagedListOperator
    protected final void insertNull(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.ManagedListOperator
    public final void insertValue(int i, Object obj) {
        checkInsertIndex(i);
        RealmModel realmModel = (RealmModel) obj;
        boolean checkCanObjectBeCopied = CollectionUtils.checkCanObjectBeCopied(this.realm, realmModel, this.className, CollectionUtils.LIST_TYPE);
        if (!CollectionUtils.isEmbedded(this.realm, realmModel)) {
            RealmModel realmModel2 = realmModel;
            if (checkCanObjectBeCopied) {
                realmModel2 = CollectionUtils.copyToRealm(this.realm, realmModel);
            }
            this.osList.insertRow((long) i, ((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (!(obj instanceof DynamicRealmObject)) {
            CollectionUtils.updateEmbeddedObject((Realm) this.realm, realmModel, this.osList.createAndAddEmbeddedObject((long) i));
        } else {
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
    }

    @Override // io.realm.ManagedListOperator
    protected final void setNull(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.ManagedListOperator
    protected final void setValue(int i, Object obj) {
        RealmModel realmModel = (RealmModel) obj;
        boolean checkCanObjectBeCopied = CollectionUtils.checkCanObjectBeCopied(this.realm, realmModel, this.className, CollectionUtils.LIST_TYPE);
        if (!CollectionUtils.isEmbedded(this.realm, realmModel)) {
            RealmModel realmModel2 = realmModel;
            if (checkCanObjectBeCopied) {
                realmModel2 = CollectionUtils.copyToRealm(this.realm, realmModel);
            }
            this.osList.setRow((long) i, ((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (!(obj instanceof DynamicRealmObject)) {
            CollectionUtils.updateEmbeddedObject((Realm) this.realm, realmModel, this.osList.createAndSetEmbeddedObject((long) i));
        } else {
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
    }
}
