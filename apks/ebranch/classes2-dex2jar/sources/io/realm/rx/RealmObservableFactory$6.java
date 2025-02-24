package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import io.realm.rx.RealmObservableFactory;
import o.Page6DTapresSFragment;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
import o.showPelajarPage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$6.class */
public class RealmObservableFactory$6 implements showPelajarPage<RealmResults<E>> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ RealmConfiguration val$realmConfig;
    final /* synthetic */ RealmResults val$results;

    RealmObservableFactory$6(RealmObservableFactory realmObservableFactory, RealmResults realmResults, RealmConfiguration realmConfiguration) {
        this.this$0 = realmObservableFactory;
        this.val$results = realmResults;
        this.val$realmConfig = realmConfiguration;
    }

    public void subscribe(final Page6DTapresSFragment<RealmResults<E>> page6DTapresSFragment) {
        if (this.val$results.isValid()) {
            final Realm instance = Realm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$200(this.this$0).get()).acquireReference(this.val$results);
            final AnonymousClass1 r0 = new RealmChangeListener<RealmResults<E>>() { // from class: io.realm.rx.RealmObservableFactory$6.1
                public void onChange(RealmResults<E> realmResults) {
                    if (!page6DTapresSFragment.a() && RealmObservableFactory.access$100(RealmObservableFactory$6.this.this$0)) {
                        realmResults.freeze();
                    }
                }
            };
            this.val$results.addChangeListener(r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$6.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObservableFactory$6.this.val$results.removeChangeListener(r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$200(RealmObservableFactory$6.this.this$0).get()).releaseReference(RealmObservableFactory$6.this.val$results);
                }
            };
            onChooseBahasa.b(r02, "run is null");
            new Page6FLKartuPelajarFragment_ViewBinding(r02);
            if (RealmObservableFactory.access$100(this.this$0)) {
                this.val$results.freeze();
            }
        }
    }
}
