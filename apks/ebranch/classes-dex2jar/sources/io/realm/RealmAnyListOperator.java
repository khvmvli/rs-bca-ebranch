package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.core.NativeRealmAny;
import java.util.Locale;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/RealmAnyListOperator.class */
public final class RealmAnyListOperator extends ManagedListOperator<RealmAny> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmAnyListOperator(BaseRealm baseRealm, OsList osList, Class<RealmAny> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public final void appendValue(Object obj) {
        this.osList.addRealmAny(CollectionUtils.copyToRealmIfNeeded(this.realm, (RealmAny) obj).getNativePtr());
    }

    @Override // io.realm.ManagedListOperator
    protected final void checkValidValue(@Nullable Object obj) {
        if (obj != null && !(obj instanceof RealmAny)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.RealmAny", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public final boolean forRealmModel() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    public final RealmAny get(int i) {
        NativeRealmAny nativeRealmAny = (NativeRealmAny) this.osList.getValue((long) i);
        NativeRealmAny nativeRealmAny2 = nativeRealmAny;
        if (nativeRealmAny == null) {
            nativeRealmAny2 = new NativeRealmAny();
        }
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.realm, nativeRealmAny2));
    }

    @Override // io.realm.ManagedListOperator
    public final void insertValue(int i, Object obj) {
        checkInsertIndex(i);
        this.osList.insertRealmAny((long) i, CollectionUtils.copyToRealmIfNeeded(this.realm, (RealmAny) obj).getNativePtr());
    }

    @Override // io.realm.ManagedListOperator
    protected final void setValue(int i, Object obj) {
        this.osList.setRealmAny((long) i, CollectionUtils.copyToRealmIfNeeded(this.realm, (RealmAny) obj).getNativePtr());
    }
}
