package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/DoubleRealmAnyOperator.class */
public final class DoubleRealmAnyOperator extends PrimitiveRealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DoubleRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Double.valueOf(nativeRealmAny.asDouble()), RealmAny.Type.DOUBLE, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DoubleRealmAnyOperator(Double d) {
        super(d, RealmAny.Type.DOUBLE);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Double) getValue(Double.class));
    }
}
