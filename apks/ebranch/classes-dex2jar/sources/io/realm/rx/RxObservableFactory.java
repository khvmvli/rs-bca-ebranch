package io.realm.rx;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import o.Page6DTahapanXpresiSFragment_ViewBinding;
import o.Page6DTapresSFragment_ViewBinding;
import o.Page6ESFragment_ViewBinding;
/* loaded from: classes-dex2jar.jar:io/realm/rx/RxObservableFactory.class */
public interface RxObservableFactory {
    Page6DTapresSFragment_ViewBinding<ObjectChange<DynamicRealmObject>> changesetsFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);

    <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmList<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmList<E> realmList);

    <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmResults<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmResults<E> realmResults);

    <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmList<E>>> changesetsFrom(Realm realm, RealmList<E> realmList);

    <E extends RealmModel> Page6DTapresSFragment_ViewBinding<ObjectChange<E>> changesetsFrom(Realm realm, E e);

    <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmResults<E>>> changesetsFrom(Realm realm, RealmResults<E> realmResults);

    Page6DTahapanXpresiSFragment_ViewBinding<DynamicRealm> from(DynamicRealm dynamicRealm);

    Page6DTahapanXpresiSFragment_ViewBinding<DynamicRealmObject> from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);

    <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmList<E>> from(DynamicRealm dynamicRealm, RealmList<E> realmList);

    <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmResults<E>> from(DynamicRealm dynamicRealm, RealmResults<E> realmResults);

    Page6DTahapanXpresiSFragment_ViewBinding<Realm> from(Realm realm);

    <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmList<E>> from(Realm realm, RealmList<E> realmList);

    <E extends RealmModel> Page6DTahapanXpresiSFragment_ViewBinding<E> from(Realm realm, E e);

    <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmResults<E>> from(Realm realm, RealmResults<E> realmResults);

    <E> Page6ESFragment_ViewBinding<RealmQuery<E>> from(DynamicRealm dynamicRealm, RealmQuery<E> realmQuery);

    <E> Page6ESFragment_ViewBinding<RealmQuery<E>> from(Realm realm, RealmQuery<E> realmQuery);
}
