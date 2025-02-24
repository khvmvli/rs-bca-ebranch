package io.realm.rx;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.rx.RealmObservableFactory;
import o.Page6ELFragment;
import o.Page6ELFragment_ViewBinding;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$11.class */
public class RealmObservableFactory$11 implements Page6ELFragment_ViewBinding<CollectionChange<RealmList<E>>> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ RealmList val$list;
    final /* synthetic */ RealmConfiguration val$realmConfig;

    RealmObservableFactory$11(RealmObservableFactory realmObservableFactory, RealmList realmList, RealmConfiguration realmConfiguration) {
        this.this$0 = realmObservableFactory;
        this.val$list = realmList;
        this.val$realmConfig = realmConfiguration;
    }

    public void subscribe(final Page6ELFragment<CollectionChange<RealmList<E>>> page6ELFragment) {
        if (this.val$list.isValid()) {
            final Realm instance = Realm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$300(this.this$0).get()).acquireReference(this.val$list);
            final AnonymousClass1 r0 = new OrderedRealmCollectionChangeListener<RealmList<E>>() { // from class: io.realm.rx.RealmObservableFactory$11.1
                public void onChange(RealmList<E> realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                    if (realmList.isValid() && !page6ELFragment.a()) {
                        RealmList realmList2 = realmList;
                        if (RealmObservableFactory.access$100(RealmObservableFactory$11.this.this$0)) {
                            realmList2 = realmList.freeze();
                        }
                        new CollectionChange(realmList2, orderedCollectionChangeSet);
                    }
                }
            };
            this.val$list.addChangeListener(r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$11.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObservableFactory$11.this.val$list.removeChangeListener(r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$300(RealmObservableFactory$11.this.this$0).get()).releaseReference(RealmObservableFactory$11.this.val$list);
                }
            };
            onChooseBahasa.b(r02, "run is null");
            new Page6FLKartuPelajarFragment_ViewBinding(r02);
            new CollectionChange(RealmObservableFactory.access$100(this.this$0) ? this.val$list.freeze() : this.val$list, (OrderedCollectionChangeSet) null);
        }
    }
}
