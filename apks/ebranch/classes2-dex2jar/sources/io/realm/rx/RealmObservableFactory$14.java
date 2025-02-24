package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.rx.RealmObservableFactory;
import o.Page6DTapresSFragment;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
import o.showPelajarPage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$14.class */
public class RealmObservableFactory$14 implements showPelajarPage<E> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ RealmModel val$object;
    final /* synthetic */ Realm val$realm;
    final /* synthetic */ RealmConfiguration val$realmConfig;

    RealmObservableFactory$14(RealmObservableFactory realmObservableFactory, Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel) {
        this.this$0 = realmObservableFactory;
        this.val$realm = realm;
        this.val$realmConfig = realmConfiguration;
        this.val$object = realmModel;
    }

    public void subscribe(final Page6DTapresSFragment<E> page6DTapresSFragment) {
        if (!this.val$realm.isClosed()) {
            final Realm instance = Realm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(this.this$0).get()).acquireReference(this.val$object);
            final AnonymousClass1 r0 = new RealmChangeListener<E>() { // from class: io.realm.rx.RealmObservableFactory$14.1
                /* JADX WARN: Incorrect types in method signature: (TE;)V */
                public void onChange(RealmModel realmModel) {
                    if (!page6DTapresSFragment.a() && RealmObservableFactory.access$100(RealmObservableFactory$14.this.this$0)) {
                        RealmObject.freeze(realmModel);
                    }
                }
            };
            RealmObject.addChangeListener(this.val$object, r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$14.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObject.removeChangeListener(RealmObservableFactory$14.this.val$object, r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(RealmObservableFactory$14.this.this$0).get()).releaseReference(RealmObservableFactory$14.this.val$object);
                }
            };
            onChooseBahasa.b(r02, "run is null");
            new Page6FLKartuPelajarFragment_ViewBinding(r02);
            if (RealmObservableFactory.access$100(this.this$0)) {
                RealmObject.freeze(this.val$object);
            }
        }
    }
}
