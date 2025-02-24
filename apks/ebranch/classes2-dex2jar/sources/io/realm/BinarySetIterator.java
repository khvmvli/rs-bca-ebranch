package io.realm;

import io.realm.internal.OsSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/BinarySetIterator.class */
public class BinarySetIterator extends SetIterator<byte[]> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BinarySetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.realm.SetIterator
    public byte[] getValueAtIndex(int i) {
        Object valueAtIndex = this.osSet.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return (byte[]) valueAtIndex;
    }
}
