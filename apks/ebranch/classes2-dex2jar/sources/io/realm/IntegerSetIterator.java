package io.realm;

import io.realm.internal.OsSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/IntegerSetIterator.class */
public class IntegerSetIterator extends SetIterator<Integer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegerSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.SetIterator
    public Integer getValueAtIndex(int i) {
        Object valueAtIndex = this.osSet.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Integer.valueOf(((Long) valueAtIndex).intValue());
    }
}
