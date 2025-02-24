package io.realm;

import io.realm.RealmAny;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAny;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/RealmModelOperator.class */
public class RealmModelOperator extends RealmAnyOperator {
    private final Class<? extends RealmModel> clazz;
    private final RealmModel value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T extends RealmModel> RealmModelOperator(BaseRealm baseRealm, NativeRealmAny nativeRealmAny, Class<T> cls) {
        super(RealmAny.Type.OBJECT, nativeRealmAny);
        this.clazz = cls;
        this.value = getRealmModel(baseRealm, cls, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmModelOperator(RealmModel realmModel) {
        super(RealmAny.Type.OBJECT);
        this.value = realmModel;
        this.clazz = realmModel.getClass();
    }

    private static <T extends RealmModel> T getRealmModel(BaseRealm baseRealm, Class<T> cls, NativeRealmAny nativeRealmAny) {
        return (T) baseRealm.get(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.emptyList());
    }

    @Override // io.realm.RealmAnyOperator
    public void checkValidObject(BaseRealm baseRealm) {
        if (!RealmObject.isValid(this.value) || !RealmObject.isManaged(this.value)) {
            throw new IllegalArgumentException("Realm object is not a valid managed object.");
        } else if (((RealmObjectProxy) this.value).realmGet$proxyState().getRealm$realm() != baseRealm) {
            throw new IllegalArgumentException("Realm object belongs to a different Realm.");
        }
    }

    @Override // io.realm.RealmAnyOperator
    protected NativeRealmAny createNativeRealmAny() {
        if (this.value instanceof RealmObjectProxy) {
            return new NativeRealmAny((RealmObjectProxy) getValue(RealmObjectProxy.class));
        }
        throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (!getClass().equals(obj.getClass())) {
                z = false;
            } else {
                RealmModel realmModel = this.value;
                RealmModel realmModel2 = ((RealmModelOperator) obj).value;
                if (realmModel == null) {
                    z = false;
                    if (realmModel2 == null) {
                        z = true;
                    }
                } else {
                    z = realmModel.equals(realmModel2);
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.RealmAnyOperator
    public Class<?> getTypedClass() {
        return RealmObjectProxy.class.isAssignableFrom(this.clazz) ? this.clazz.getSuperclass() : this.clazz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.RealmAnyOperator
    public <T> T getValue(Class<T> cls) {
        return cls.cast(this.value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return this.value.toString();
    }
}
