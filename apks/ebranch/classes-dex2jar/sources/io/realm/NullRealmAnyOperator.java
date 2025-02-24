package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/NullRealmAnyOperator.class */
public final class NullRealmAnyOperator extends RealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public NullRealmAnyOperator() {
        super(RealmAny.Type.NULL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NullRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(RealmAny.Type.NULL, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny();
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass().equals(obj.getClass());
    }

    @Override // io.realm.RealmAnyOperator
    public final <T> T getValue(Class<T> cls) {
        return null;
    }

    public final int hashCode() {
        return hashCode();
    }

    public final String toString() {
        return "null";
    }
}
