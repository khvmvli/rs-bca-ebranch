package io.realm;

import io.realm.internal.OsSet;
/* loaded from: classes2-dex2jar.jar:io/realm/ShortSetIterator.class */
class ShortSetIterator extends SetIterator<Short> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ShortSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.realm.SetIterator
    public Short getValueAtIndex(int i) {
        Object valueAtIndex = this.osSet.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Short.valueOf(((Long) valueAtIndex).shortValue());
    }
}
