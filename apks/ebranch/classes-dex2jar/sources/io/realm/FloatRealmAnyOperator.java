package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/FloatRealmAnyOperator.class */
public final class FloatRealmAnyOperator extends PrimitiveRealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FloatRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Float.valueOf(nativeRealmAny.asFloat()), RealmAny.Type.FLOAT, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FloatRealmAnyOperator(Float f) {
        super(f, RealmAny.Type.FLOAT);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Float) getValue(Float.class));
    }
}
