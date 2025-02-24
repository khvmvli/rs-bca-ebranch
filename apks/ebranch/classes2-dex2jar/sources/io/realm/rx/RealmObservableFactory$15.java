package io.realm.rx;

import io.realm.ObjectChangeSet;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.rx.RealmObservableFactory;
import o.Page6ELFragment;
import o.Page6ELFragment_ViewBinding;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$15.class */
class RealmObservableFactory$15 implements Page6ELFragment_ViewBinding<ObjectChange<E>> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ RealmModel val$object;
    final /* synthetic */ RealmConfiguration val$realmConfig;

    RealmObservableFactory$15(RealmObservableFactory realmObservableFactory, RealmModel realmModel, RealmConfiguration realmConfiguration) {
        this.this$0 = realmObservableFactory;
        this.val$object = realmModel;
        this.val$realmConfig = realmConfiguration;
    }

    public void subscribe(final Page6ELFragment<ObjectChange<E>> page6ELFragment) {
        if (RealmObject.isValid(this.val$object)) {
            final Realm instance = Realm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(this.this$0).get()).acquireReference(this.val$object);
            final AnonymousClass1 r0 = new RealmObjectChangeListener<E>() { // from class: io.realm.rx.RealmObservableFactory$15.1
                /* JADX WARN: Incorrect types in method signature: (TE;Lio/realm/ObjectChangeSet;)V */
                public void onChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
                    if (!page6ELFragment.a()) {
                        RealmModel realmModel2 = realmModel;
                        if (RealmObservableFactory.access$100(RealmObservableFactory$15.this.this$0)) {
                            realmModel2 = RealmObject.freeze(realmModel);
                        }
                        new ObjectChange(realmModel2, objectChangeSet);
                    }
                }
            };
            RealmObject.addChangeListener(this.val$object, r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$15.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObject.removeChangeListener(RealmObservableFactory$15.this.val$object, r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(RealmObservableFactory$15.this.this$0).get()).releaseReference(RealmObservableFactory$15.this.val$object);
                }
            };
            onChooseBahasa.b(r02, "run is null");
            new Page6FLKartuPelajarFragment_ViewBinding(r02);
            new ObjectChange(RealmObservableFactory.access$100(this.this$0) ? RealmObject.freeze(this.val$object) : this.val$object, (ObjectChangeSet) null);
        }
    }
}
