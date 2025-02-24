package io.realm.internal;

import io.realm.internal.ObserverPairList;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/ObservableCollection$Callback.class */
public class ObservableCollection$Callback implements ObserverPairList.Callback<ObservableCollection$CollectionObserverPair> {
    private final OsCollectionChangeSet changeSet;

    ObservableCollection$Callback(OsCollectionChangeSet osCollectionChangeSet) {
        this.changeSet = osCollectionChangeSet;
    }

    public void onCalled(ObservableCollection$CollectionObserverPair observableCollection$CollectionObserverPair, Object obj) {
        observableCollection$CollectionObserverPair.onChange(obj, this.changeSet);
    }
}
