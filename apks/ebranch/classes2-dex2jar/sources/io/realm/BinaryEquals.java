package io.realm;

import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:io/realm/BinaryEquals.class */
class BinaryEquals<K> extends EqualsHelper<K, byte[]> {
    /* JADX INFO: Access modifiers changed from: protected */
    public boolean compareInternal(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }
}
