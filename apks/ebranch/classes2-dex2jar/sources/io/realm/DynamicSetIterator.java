package io.realm;

import io.realm.internal.OsSet;
/* loaded from: classes2-dex2jar.jar:io/realm/DynamicSetIterator.class */
class DynamicSetIterator extends SetIterator<DynamicRealmObject> {
    private final String className;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicSetIterator(OsSet osSet, BaseRealm baseRealm, String str) {
        super(osSet, baseRealm);
        this.className = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.SetIterator
    public DynamicRealmObject getValueAtIndex(int i) {
        return this.baseRealm.get(DynamicRealmObject.class, this.className, this.osSet.getRow(i));
    }
}
