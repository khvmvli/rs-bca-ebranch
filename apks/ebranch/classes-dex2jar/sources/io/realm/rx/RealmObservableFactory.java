package io.realm.rx;

import android.os.Looper;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import java.util.IdentityHashMap;
import java.util.Map;
import o.Page6DTahapanXpresiSFragment_ViewBinding;
import o.Page6DTapresFragment;
import o.Page6DTapresSFragment_ViewBinding;
import o.Page6ELFragment_ViewBinding;
import o.Page6ESFragment_ViewBinding;
import o.fotoDiri;
import o.ivfotoDiri;
/* loaded from: classes-dex2jar.jar:io/realm/rx/RealmObservableFactory.class */
public class RealmObservableFactory implements RxObservableFactory {
    private static final Page6DTapresFragment BACK_PRESSURE_STRATEGY = Page6DTapresFragment.LATEST;
    private final boolean returnFrozenObjects;
    private ThreadLocal<StrongReferenceCounter<RealmResults>> resultsRefs = new ThreadLocal<StrongReferenceCounter<RealmResults>>() { // from class: io.realm.rx.RealmObservableFactory.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public StrongReferenceCounter<RealmResults> initialValue() {
            return new StrongReferenceCounter<>();
        }
    };
    private ThreadLocal<StrongReferenceCounter<RealmList>> listRefs = new ThreadLocal<StrongReferenceCounter<RealmList>>() { // from class: io.realm.rx.RealmObservableFactory.2
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public StrongReferenceCounter<RealmList> initialValue() {
            return new StrongReferenceCounter<>();
        }
    };
    private ThreadLocal<StrongReferenceCounter<RealmModel>> objectRefs = new ThreadLocal<StrongReferenceCounter<RealmModel>>() { // from class: io.realm.rx.RealmObservableFactory.3
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public StrongReferenceCounter<RealmModel> initialValue() {
            return new StrongReferenceCounter<>();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/rx/RealmObservableFactory$StrongReferenceCounter.class */
    public static class StrongReferenceCounter<K> {
        private final Map<K, Integer> references;

        private StrongReferenceCounter() {
            this.references = new IdentityHashMap();
        }

        public void acquireReference(K k) {
            Integer num = this.references.get(k);
            if (num == null) {
                this.references.put(k, 1);
            } else {
                this.references.put(k, Integer.valueOf(num.intValue() + 1));
            }
        }

        public void releaseReference(K k) {
            Integer num = this.references.get(k);
            if (num == null) {
                StringBuilder sb = new StringBuilder("Object does not have any references: ");
                sb.append(k);
                throw new IllegalStateException(sb.toString());
            } else if (num.intValue() > 1) {
                this.references.put(k, Integer.valueOf(num.intValue() - 1));
            } else if (num.intValue() == 1) {
                this.references.remove(k);
            } else {
                StringBuilder sb2 = new StringBuilder("Invalid reference count: ");
                sb2.append(num);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public RealmObservableFactory(boolean z) {
        this.returnFrozenObjects = z;
    }

    private ivfotoDiri getScheduler() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return fotoDiri.e(myLooper);
        }
        throw new IllegalStateException("No looper found");
    }

    @Override // io.realm.rx.RxObservableFactory
    public Page6DTapresSFragment_ViewBinding<ObjectChange<DynamicRealmObject>> changesetsFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.isFrozen()) {
            return Page6DTapresSFragment_ViewBinding.d(new ObjectChange(dynamicRealmObject, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTapresSFragment_ViewBinding.c((Page6ELFragment_ViewBinding) new 17(this, dynamicRealmObject, configuration)).c(scheduler).e(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmList<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmList<E> realmList) {
        if (dynamicRealm.isFrozen()) {
            return Page6DTapresSFragment_ViewBinding.d(new CollectionChange(realmList, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTapresSFragment_ViewBinding.c((Page6ELFragment_ViewBinding) new 13(this, realmList, configuration)).c(scheduler).e(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmResults<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmResults<E> realmResults) {
        if (dynamicRealm.isFrozen()) {
            return Page6DTapresSFragment_ViewBinding.d(new CollectionChange(realmResults, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTapresSFragment_ViewBinding.c((Page6ELFragment_ViewBinding) new 9(this, realmResults, configuration)).c(scheduler).e(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmList<E>>> changesetsFrom(Realm realm, RealmList<E> realmList) {
        if (realm.isFrozen()) {
            return Page6DTapresSFragment_ViewBinding.d(new CollectionChange(realmList, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTapresSFragment_ViewBinding.c((Page6ELFragment_ViewBinding) new 11(this, realmList, configuration)).c(scheduler).e(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E extends RealmModel> Page6DTapresSFragment_ViewBinding<ObjectChange<E>> changesetsFrom(Realm realm, E e) {
        if (realm.isFrozen()) {
            return Page6DTapresSFragment_ViewBinding.d(new ObjectChange(e, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTapresSFragment_ViewBinding.c((Page6ELFragment_ViewBinding) new 15(this, e, configuration)).c(scheduler).e(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTapresSFragment_ViewBinding<CollectionChange<RealmResults<E>>> changesetsFrom(Realm realm, RealmResults<E> realmResults) {
        if (realm.isFrozen()) {
            return Page6DTapresSFragment_ViewBinding.d(new CollectionChange(realmResults, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTapresSFragment_ViewBinding.c((Page6ELFragment_ViewBinding) new 7(this, realmResults, configuration)).c(scheduler).e(scheduler);
    }

    public boolean equals(Object obj) {
        return obj instanceof RealmObservableFactory;
    }

    @Override // io.realm.rx.RxObservableFactory
    public Page6DTahapanXpresiSFragment_ViewBinding<DynamicRealm> from(DynamicRealm dynamicRealm) {
        if (dynamicRealm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(dynamicRealm);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 5(this, configuration), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public Page6DTahapanXpresiSFragment_ViewBinding<DynamicRealmObject> from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(dynamicRealmObject);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 16(this, dynamicRealm, configuration, dynamicRealmObject), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmList<E>> from(DynamicRealm dynamicRealm, RealmList<E> realmList) {
        if (dynamicRealm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(realmList);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 12(this, realmList, configuration), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmResults<E>> from(DynamicRealm dynamicRealm, RealmResults<E> realmResults) {
        if (dynamicRealm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(realmResults);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 8(this, realmResults, configuration), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public Page6DTahapanXpresiSFragment_ViewBinding<Realm> from(Realm realm) {
        if (realm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(realm);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 4(this, configuration), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmList<E>> from(Realm realm, RealmList<E> realmList) {
        if (realm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(realmList);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 10(this, realmList, configuration), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E extends RealmModel> Page6DTahapanXpresiSFragment_ViewBinding<E> from(Realm realm, E e) {
        if (realm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(e);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 14(this, realm, configuration, e), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6DTahapanXpresiSFragment_ViewBinding<RealmResults<E>> from(Realm realm, RealmResults<E> realmResults) {
        if (realm.isFrozen()) {
            return Page6DTahapanXpresiSFragment_ViewBinding.a(realmResults);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        ivfotoDiri scheduler = getScheduler();
        return Page6DTahapanXpresiSFragment_ViewBinding.c(new 6(this, realmResults, configuration), BACK_PRESSURE_STRATEGY).d(scheduler).a(scheduler);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6ESFragment_ViewBinding<RealmQuery<E>> from(DynamicRealm dynamicRealm, RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> Page6ESFragment_ViewBinding<RealmQuery<E>> from(Realm realm, RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }

    public int hashCode() {
        return 37;
    }
}
