package io.realm;

import io.realm.RealmModel;
import io.realm.internal.ObserverPairList;
import io.realm.internal.OsObject;
import io.realm.internal.PendingRow;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.UncheckedRow;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/ProxyState.class */
public final class ProxyState<E extends RealmModel> implements PendingRow.FrontEnd {
    private static QueryCallback queryCallback = new QueryCallback();
    private boolean acceptDefaultValue;
    private List<String> excludeFields;
    private E model;
    private OsObject osObject;
    private BaseRealm realm;
    private Row row;
    private boolean underConstruction = true;
    private ObserverPairList<OsObject.ObjectObserverPair> observerPairs = new ObserverPairList<>();

    /* loaded from: classes-dex2jar.jar:io/realm/ProxyState$QueryCallback.class */
    public static class QueryCallback implements ObserverPairList.Callback<OsObject.ObjectObserverPair> {
        private QueryCallback() {
        }

        public void onCalled(OsObject.ObjectObserverPair objectObserverPair, Object obj) {
            objectObserverPair.onChange((RealmModel) obj, null);
        }
    }

    /* loaded from: classes-dex2jar.jar:io/realm/ProxyState$RealmChangeListenerWrapper.class */
    public static class RealmChangeListenerWrapper<T extends RealmModel> implements RealmObjectChangeListener<T> {
        private final RealmChangeListener<T> listener;

        public RealmChangeListenerWrapper(RealmChangeListener<T> realmChangeListener) {
            if (realmChangeListener != null) {
                this.listener = realmChangeListener;
                return;
            }
            throw new IllegalArgumentException("Listener should not be null");
        }

        public boolean equals(Object obj) {
            return (obj instanceof RealmChangeListenerWrapper) && this.listener == ((RealmChangeListenerWrapper) obj).listener;
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        @Override // io.realm.RealmObjectChangeListener
        public void onChange(T t, @Nullable ObjectChangeSet objectChangeSet) {
            this.listener.onChange(t);
        }
    }

    public ProxyState() {
    }

    public ProxyState(E e) {
        this.model = e;
    }

    private void notifyQueryFinished() {
        this.observerPairs.foreach(queryCallback);
    }

    private void registerToObjectNotifier() {
        if (this.realm.sharedRealm != null && !this.realm.sharedRealm.isClosed() && this.row.isValid() && this.osObject == null) {
            OsObject osObject = new OsObject(this.realm.sharedRealm, (UncheckedRow) this.row);
            this.osObject = osObject;
            osObject.setObserverPairs(this.observerPairs);
            this.observerPairs = null;
        }
    }

    public final void addChangeListener(RealmObjectChangeListener<E> realmObjectChangeListener) {
        Row row = this.row;
        if (row instanceof PendingRow) {
            this.observerPairs.add(new OsObject.ObjectObserverPair(this.model, realmObjectChangeListener));
        } else if (row instanceof UncheckedRow) {
            registerToObjectNotifier();
            OsObject osObject = this.osObject;
            if (osObject != null) {
                osObject.addListener(this.model, realmObjectChangeListener);
            }
        }
    }

    public final void checkValidObject(RealmModel realmModel) {
        if (!RealmObject.isValid(realmModel) || !RealmObject.isManaged(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        } else if (((RealmObjectProxy) realmModel).realmGet$proxyState().getRealm$realm() != getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
    }

    public final boolean getAcceptDefaultValue$realm() {
        return this.acceptDefaultValue;
    }

    public final List<String> getExcludeFields$realm() {
        return this.excludeFields;
    }

    public final BaseRealm getRealm$realm() {
        return this.realm;
    }

    public final Row getRow$realm() {
        return this.row;
    }

    public final boolean isLoaded() {
        return this.row.isLoaded();
    }

    public final boolean isUnderConstruction() {
        return this.underConstruction;
    }

    public final void load() {
        Row row = this.row;
        if (row instanceof PendingRow) {
            ((PendingRow) row).executeQuery();
        }
    }

    @Override // io.realm.internal.PendingRow.FrontEnd
    public final void onQueryFinished(Row row) {
        this.row = row;
        notifyQueryFinished();
        if (row.isValid()) {
            registerToObjectNotifier();
        }
    }

    public final void removeAllChangeListeners() {
        OsObject osObject = this.osObject;
        if (osObject != null) {
            osObject.removeListener(this.model);
        } else {
            this.observerPairs.clear();
        }
    }

    public final void removeChangeListener(RealmObjectChangeListener<E> realmObjectChangeListener) {
        OsObject osObject = this.osObject;
        if (osObject != null) {
            osObject.removeListener(this.model, realmObjectChangeListener);
        } else {
            this.observerPairs.remove(this.model, realmObjectChangeListener);
        }
    }

    public final void setAcceptDefaultValue$realm(boolean z) {
        this.acceptDefaultValue = z;
    }

    public final void setConstructionFinished() {
        this.underConstruction = false;
        this.excludeFields = null;
    }

    public final void setExcludeFields$realm(List<String> list) {
        this.excludeFields = list;
    }

    public final void setRealm$realm(BaseRealm baseRealm) {
        this.realm = baseRealm;
    }

    public final void setRow$realm(Row row) {
        this.row = row;
    }
}
