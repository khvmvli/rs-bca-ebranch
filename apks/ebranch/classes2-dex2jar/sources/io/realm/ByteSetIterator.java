package io.realm;

import io.realm.internal.OsSet;
/* loaded from: classes2-dex2jar.jar:io/realm/ByteSetIterator.class */
class ByteSetIterator extends SetIterator<Byte> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.SetIterator
    public Byte getValueAtIndex(int i) {
        Object valueAtIndex = this.osSet.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Byte.valueOf(((Long) valueAtIndex).byteValue());
    }
}
