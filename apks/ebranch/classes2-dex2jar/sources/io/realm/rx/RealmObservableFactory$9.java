package io.realm.rx;

import io.realm.DynamicRealm;
import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import io.realm.rx.RealmObservableFactory;
import o.Page6ELFragment;
import o.Page6ELFragment_ViewBinding;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$9.class */
public class RealmObservableFactory$9 implements Page6ELFragment_ViewBinding<CollectionChange<RealmResults<E>>> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ RealmConfiguration val$realmConfig;
    final /* synthetic */ RealmResults val$results;

    RealmObservableFactory$9(RealmObservableFactory realmObservableFactory, RealmResults realmResults, RealmConfiguration realmConfiguration) {
        this.this$0 = realmObservableFactory;
        this.val$results = realmResults;
        this.val$realmConfig = realmConfiguration;
    }

    public void subscribe(final Page6ELFragment<CollectionChange<RealmResults<E>>> page6ELFragment) {
        if (this.val$results.isValid()) {
            final DynamicRealm instance = DynamicRealm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$200(this.this$0).get()).acquireReference(this.val$results);
            final AnonymousClass1 r0 = new OrderedRealmCollectionChangeListener<RealmResults<E>>() { // from class: io.realm.rx.RealmObservableFactory$9.1
                public void onChange(RealmResults<E> realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                    if (!page6ELFragment.a()) {
                        RealmResults realmResults2 = realmResults;
                        if (RealmObservableFactory.access$100(RealmObservableFactory$9.this.this$0)) {
                            realmResults2 = realmResults.freeze();
                        }
                        new CollectionChange(realmResults2, orderedCollectionChangeSet);
                    }
                }
            };
            this.val$results.addChangeListener(r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$9.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObservableFactory$9.this.val$results.removeChangeListener(r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$200(RealmObservableFactory$9.this.this$0).get()).releaseReference(RealmObservableFactory$9.this.val$results);
                }
            };
            onChooseBahasa.b(r02, "run is null");
            new Page6FLKartuPelajarFragment_ViewBinding(r02);
            new CollectionChange(RealmObservableFactory.access$100(this.this$0) ? this.val$results.freeze() : this.val$results, (OrderedCollectionChangeSet) null);
        }
    }
}
