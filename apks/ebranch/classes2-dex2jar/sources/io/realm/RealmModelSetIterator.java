package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsSet;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/RealmModelSetIterator.class */
public class RealmModelSetIterator<T extends RealmModel> extends SetIterator<T> {
    private final Class<T> valueClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmModelSetIterator(OsSet osSet, BaseRealm baseRealm, Class<T> cls) {
        super(osSet, baseRealm);
        this.valueClass = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.realm.SetIterator
    public T getValueAtIndex(int i) {
        return (T) this.baseRealm.get(this.valueClass, this.osSet.getRow(i), false, new ArrayList());
    }
}
