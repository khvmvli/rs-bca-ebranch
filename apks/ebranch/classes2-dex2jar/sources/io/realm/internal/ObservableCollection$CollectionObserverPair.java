package io.realm.internal;

import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.internal.ObserverPairList;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/ObservableCollection$CollectionObserverPair.class */
public class ObservableCollection$CollectionObserverPair<T> extends ObserverPairList.ObserverPair<T, Object> {
    ObservableCollection$CollectionObserverPair(T t, Object obj) {
        super(t, obj);
    }

    public void onChange(T t, OsCollectionChangeSet osCollectionChangeSet) {
        if (this.listener instanceof OrderedRealmCollectionChangeListener) {
            ((OrderedRealmCollectionChangeListener) this.listener).onChange(t, new StatefulCollectionChangeSet(osCollectionChangeSet));
        } else if (this.listener instanceof RealmChangeListener) {
            ((RealmChangeListener) this.listener).onChange(t);
        } else {
            StringBuilder sb = new StringBuilder("Unsupported listener type: ");
            sb.append(this.listener);
            throw new RuntimeException(sb.toString());
        }
    }
}
