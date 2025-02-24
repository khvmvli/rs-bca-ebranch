package io.realm.coroutines;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.internal.coroutines.InternalFlowFactory;
import io.realm.rx.CollectionChange;
import io.realm.rx.ObjectChange;
import javax.annotation.Nonnull;
import o.getMethod;
/* loaded from: classes-dex2jar.jar:io/realm/coroutines/RealmFlowFactory.class */
public class RealmFlowFactory implements FlowFactory {
    private final InternalFlowFactory factory;

    public RealmFlowFactory(Boolean bool) {
        this.factory = new InternalFlowFactory(bool.booleanValue());
    }

    @Override // io.realm.coroutines.FlowFactory
    public getMethod<ObjectChange<DynamicRealmObject>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull DynamicRealmObject dynamicRealmObject) {
        return this.factory.changesetFrom(dynamicRealm, dynamicRealmObject);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<CollectionChange<RealmList<T>>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmList<T> realmList) {
        return this.factory.changesetFrom(dynamicRealm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<CollectionChange<RealmResults<T>>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmResults<T> realmResults) {
        return this.factory.changesetFrom(dynamicRealm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<CollectionChange<RealmList<T>>> changesetFrom(@Nonnull Realm realm, @Nonnull RealmList<T> realmList) {
        return this.factory.changesetFrom(realm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> getMethod<ObjectChange<T>> changesetFrom(@Nonnull Realm realm, @Nonnull T t) {
        return this.factory.changesetFrom(realm, (Realm) t);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<CollectionChange<RealmResults<T>>> changesetFrom(@Nonnull Realm realm, @Nonnull RealmResults<T> realmResults) {
        return this.factory.changesetFrom(realm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public getMethod<DynamicRealm> from(@Nonnull DynamicRealm dynamicRealm) {
        return this.factory.from(dynamicRealm);
    }

    @Override // io.realm.coroutines.FlowFactory
    public getMethod<DynamicRealmObject> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull DynamicRealmObject dynamicRealmObject) {
        return this.factory.from(dynamicRealm, dynamicRealmObject);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<RealmList<T>> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmList<T> realmList) {
        return this.factory.from(dynamicRealm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<RealmResults<T>> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmResults<T> realmResults) {
        return this.factory.from(dynamicRealm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public getMethod<Realm> from(@Nonnull Realm realm) {
        return this.factory.from(realm);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<RealmList<T>> from(@Nonnull Realm realm, @Nonnull RealmList<T> realmList) {
        return this.factory.from(realm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> getMethod<T> from(@Nonnull Realm realm, @Nonnull T t) {
        return this.factory.from(realm, (Realm) t);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> getMethod<RealmResults<T>> from(@Nonnull Realm realm, @Nonnull RealmResults<T> realmResults) {
        return this.factory.from(realm, realmResults);
    }
}
