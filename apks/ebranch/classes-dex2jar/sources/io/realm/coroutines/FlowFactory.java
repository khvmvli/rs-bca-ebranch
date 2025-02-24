package io.realm.coroutines;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.rx.CollectionChange;
import io.realm.rx.ObjectChange;
import javax.annotation.Nonnull;
import o.getMethod;
/* loaded from: classes-dex2jar.jar:io/realm/coroutines/FlowFactory.class */
public interface FlowFactory {
    getMethod<ObjectChange<DynamicRealmObject>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull DynamicRealmObject dynamicRealmObject);

    <T> getMethod<CollectionChange<RealmList<T>>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmList<T> realmList);

    <T> getMethod<CollectionChange<RealmResults<T>>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmResults<T> realmResults);

    <T> getMethod<CollectionChange<RealmList<T>>> changesetFrom(@Nonnull Realm realm, @Nonnull RealmList<T> realmList);

    <T extends RealmModel> getMethod<ObjectChange<T>> changesetFrom(@Nonnull Realm realm, @Nonnull T t);

    <T> getMethod<CollectionChange<RealmResults<T>>> changesetFrom(@Nonnull Realm realm, @Nonnull RealmResults<T> realmResults);

    getMethod<DynamicRealm> from(@Nonnull DynamicRealm dynamicRealm);

    getMethod<DynamicRealmObject> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull DynamicRealmObject dynamicRealmObject);

    <T> getMethod<RealmList<T>> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmList<T> realmList);

    <T> getMethod<RealmResults<T>> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmResults<T> realmResults);

    getMethod<Realm> from(@Nonnull Realm realm);

    <T> getMethod<RealmList<T>> from(@Nonnull Realm realm, @Nonnull RealmList<T> realmList);

    <T extends RealmModel> getMethod<T> from(@Nonnull Realm realm, @Nonnull T t);

    <T> getMethod<RealmResults<T>> from(@Nonnull Realm realm, @Nonnull RealmResults<T> realmResults);
}
