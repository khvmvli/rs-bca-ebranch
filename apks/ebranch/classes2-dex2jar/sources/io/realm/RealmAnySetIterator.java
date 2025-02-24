package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAny;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmAnySetIterator.class */
class RealmAnySetIterator extends SetIterator<RealmAny> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmAnySetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.SetIterator
    public RealmAny getValueAtIndex(int i) {
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, new NativeRealmAny(this.osSet.getRealmAny(i))));
    }
}
