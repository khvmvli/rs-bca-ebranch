package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/Decimal128RealmAnyOperator.class */
public final class Decimal128RealmAnyOperator extends PrimitiveRealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Decimal128RealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), RealmAny.Type.DECIMAL128, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Decimal128RealmAnyOperator(Decimal128 decimal128) {
        super(decimal128, RealmAny.Type.DECIMAL128);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Decimal128) getValue(Decimal128.class));
    }
}
