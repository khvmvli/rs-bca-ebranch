package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:io/realm/BinaryRealmAnyOperator.class */
public final class BinaryRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public BinaryRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), RealmAny.Type.BINARY, nativeRealmAny);
    }

    public BinaryRealmAnyOperator(byte[] bArr) {
        super(bArr, RealmAny.Type.BINARY);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((byte[]) getValue(byte[].class));
    }

    @Override // io.realm.PrimitiveRealmAnyOperator
    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals((byte[]) getValue(byte[].class), (byte[]) ((RealmAnyOperator) obj).getValue(byte[].class));
    }
}
