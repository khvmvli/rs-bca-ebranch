package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/UUIDRealmAnyOperator.class */
public final class UUIDRealmAnyOperator extends PrimitiveRealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public UUIDRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), RealmAny.Type.UUID, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UUIDRealmAnyOperator(UUID uuid) {
        super(uuid, RealmAny.Type.UUID);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((UUID) getValue(UUID.class));
    }
}
