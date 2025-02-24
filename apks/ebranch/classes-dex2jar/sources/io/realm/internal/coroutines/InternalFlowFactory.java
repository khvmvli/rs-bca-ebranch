package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.coroutines.FlowFactory;
import io.realm.rx.CollectionChange;
import io.realm.rx.ObjectChange;
import o.ProsesTarikanFragment;
import o.ProsesTarikanFragment_ViewBinding;
import o.getDurationString;
import o.getHost;
import o.getMethod;
import o.getPath;
import o.subscribeDraftEvent;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:io/realm/internal/coroutines/InternalFlowFactory.class */
public final class InternalFlowFactory implements FlowFactory {
    private final boolean returnFrozenObjects;

    public InternalFlowFactory() {
        this(false, 1, null);
    }

    public InternalFlowFactory(boolean z) {
        this.returnFrozenObjects = z;
    }

    public /* synthetic */ InternalFlowFactory(boolean z, int i, subscribeDraftEvent subscribedraftevent) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final getMethod<ObjectChange<DynamicRealmObject>> changesetFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        subscribeReservationRescheduleEvent.b((Object) dynamicRealm, "");
        subscribeReservationRescheduleEvent.b((Object) dynamicRealmObject, "");
        return dynamicRealm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(new ObjectChange(dynamicRealmObject, null)) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new changesetFrom.6(this, dynamicRealmObject, dynamicRealm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<CollectionChange<RealmList<T>>> changesetFrom(DynamicRealm dynamicRealm, RealmList<T> realmList) {
        subscribeReservationRescheduleEvent.b((Object) dynamicRealm, "");
        subscribeReservationRescheduleEvent.b((Object) realmList, "");
        return dynamicRealm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(new CollectionChange(realmList, null)) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new changesetFrom.4(this, realmList, dynamicRealm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<CollectionChange<RealmResults<T>>> changesetFrom(DynamicRealm dynamicRealm, RealmResults<T> realmResults) {
        subscribeReservationRescheduleEvent.b((Object) dynamicRealm, "");
        subscribeReservationRescheduleEvent.b((Object) realmResults, "");
        return dynamicRealm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(new CollectionChange(realmResults, null)) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new changesetFrom.2(this, realmResults, dynamicRealm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<CollectionChange<RealmList<T>>> changesetFrom(Realm realm, RealmList<T> realmList) {
        subscribeReservationRescheduleEvent.b((Object) realm, "");
        subscribeReservationRescheduleEvent.b((Object) realmList, "");
        return realm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(new CollectionChange(realmList, null)) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new changesetFrom.3(this, realmList, realm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T extends RealmModel> getMethod<ObjectChange<T>> changesetFrom(Realm realm, T t) {
        subscribeReservationRescheduleEvent.b((Object) realm, "");
        subscribeReservationRescheduleEvent.b((Object) t, "");
        return realm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(new ObjectChange(t, null)) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new changesetFrom.5(this, realm, realm.getConfiguration(), t, (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<CollectionChange<RealmResults<T>>> changesetFrom(Realm realm, RealmResults<T> realmResults) {
        subscribeReservationRescheduleEvent.b((Object) realm, "");
        subscribeReservationRescheduleEvent.b((Object) realmResults, "");
        return realm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(new CollectionChange(realmResults, null)) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new changesetFrom.1(this, realmResults, realm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final getMethod<DynamicRealm> from(DynamicRealm dynamicRealm) {
        subscribeReservationRescheduleEvent.b((Object) dynamicRealm, "");
        return dynamicRealm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(dynamicRealm) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.2(this, dynamicRealm, (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final getMethod<DynamicRealmObject> from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        subscribeReservationRescheduleEvent.b((Object) dynamicRealm, "");
        subscribeReservationRescheduleEvent.b((Object) dynamicRealmObject, "");
        return dynamicRealm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(dynamicRealmObject) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.8(this, dynamicRealm, dynamicRealm.getConfiguration(), dynamicRealmObject, (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<RealmList<T>> from(DynamicRealm dynamicRealm, RealmList<T> realmList) {
        subscribeReservationRescheduleEvent.b((Object) dynamicRealm, "");
        subscribeReservationRescheduleEvent.b((Object) realmList, "");
        return dynamicRealm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(realmList) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.6(this, realmList, dynamicRealm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<RealmResults<T>> from(DynamicRealm dynamicRealm, RealmResults<T> realmResults) {
        subscribeReservationRescheduleEvent.b((Object) dynamicRealm, "");
        subscribeReservationRescheduleEvent.b((Object) realmResults, "");
        return dynamicRealm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(realmResults) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.4(this, realmResults, dynamicRealm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final getMethod<Realm> from(Realm realm) {
        subscribeReservationRescheduleEvent.b((Object) realm, "");
        return realm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(realm) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.1(this, realm, (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<RealmList<T>> from(Realm realm, RealmList<T> realmList) {
        subscribeReservationRescheduleEvent.b((Object) realm, "");
        subscribeReservationRescheduleEvent.b((Object) realmList, "");
        return realm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(realmList) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.5(this, realmList, realm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T extends RealmModel> getMethod<T> from(Realm realm, T t) {
        subscribeReservationRescheduleEvent.b((Object) realm, "");
        subscribeReservationRescheduleEvent.b((Object) t, "");
        return realm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(t) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.7(this, realm, realm.getConfiguration(), t, (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }

    @Override // io.realm.coroutines.FlowFactory
    public final <T> getMethod<RealmResults<T>> from(Realm realm, RealmResults<T> realmResults) {
        subscribeReservationRescheduleEvent.b((Object) realm, "");
        subscribeReservationRescheduleEvent.b((Object) realmResults, "");
        return realm.isFrozen() ? new getPath.com_github_ChuckerTeam_Chucker_library.RemoteActionCompatParcelizer<>(realmResults) : new getHost.com_github_ChuckerTeam_Chucker_library<>(new from.3(this, realmResults, realm.getConfiguration(), (ProsesTarikanFragment) null), (ProsesTarikanFragment_ViewBinding) null, 0, (getDurationString.com_github_ChuckerTeam_Chucker_library) null, 14);
    }
}
