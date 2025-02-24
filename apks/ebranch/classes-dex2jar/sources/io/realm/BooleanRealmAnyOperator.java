package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/BooleanRealmAnyOperator.class */
public final class BooleanRealmAnyOperator extends PrimitiveRealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BooleanRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), RealmAny.Type.BOOLEAN, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BooleanRealmAnyOperator(Boolean bool) {
        super(bool, RealmAny.Type.BOOLEAN);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Boolean) getValue(Boolean.class));
    }
}
