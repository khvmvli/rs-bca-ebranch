package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/internal/ObservableCollection.class */
public interface ObservableCollection {

    /* loaded from: classes-dex2jar.jar:io/realm/internal/ObservableCollection$RealmChangeListenerWrapper.class */
    public static class RealmChangeListenerWrapper<T> implements OrderedRealmCollectionChangeListener<T> {
        private final RealmChangeListener<T> listener;

        public RealmChangeListenerWrapper(RealmChangeListener<T> realmChangeListener) {
            this.listener = realmChangeListener;
        }

        public boolean equals(Object obj) {
            return (obj instanceof RealmChangeListenerWrapper) && this.listener == ((RealmChangeListenerWrapper) obj).listener;
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        @Override // io.realm.OrderedRealmCollectionChangeListener
        public void onChange(T t, @Nullable OrderedCollectionChangeSet orderedCollectionChangeSet) {
            this.listener.onChange(t);
        }
    }

    void notifyChangeListeners(long j);
}
