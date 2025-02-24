package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/IntegerRealmAnyOperator.class */
public final class IntegerRealmAnyOperator extends PrimitiveRealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegerRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), RealmAny.Type.INTEGER, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegerRealmAnyOperator(Byte b) {
        super(b, RealmAny.Type.INTEGER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegerRealmAnyOperator(Integer num) {
        super(num, RealmAny.Type.INTEGER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegerRealmAnyOperator(Long l) {
        super(l, RealmAny.Type.INTEGER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegerRealmAnyOperator(Short sh) {
        super(sh, RealmAny.Type.INTEGER);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Number) getValue(Number.class));
    }

    @Override // io.realm.PrimitiveRealmAnyOperator
    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (!getClass().equals(obj.getClass())) {
                z = false;
            } else {
                z = false;
                if (((Number) getValue(Number.class)).longValue() == ((Number) ((RealmAnyOperator) obj).getValue(Number.class)).longValue()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
