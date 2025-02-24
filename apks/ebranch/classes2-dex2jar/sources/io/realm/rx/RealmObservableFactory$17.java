package io.realm.rx;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.ObjectChangeSet;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.rx.RealmObservableFactory;
import o.Page6ELFragment;
import o.Page6ELFragment_ViewBinding;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$17.class */
public class RealmObservableFactory$17 implements Page6ELFragment_ViewBinding<ObjectChange<DynamicRealmObject>> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ DynamicRealmObject val$object;
    final /* synthetic */ RealmConfiguration val$realmConfig;

    RealmObservableFactory$17(RealmObservableFactory realmObservableFactory, DynamicRealmObject dynamicRealmObject, RealmConfiguration realmConfiguration) {
        this.this$0 = realmObservableFactory;
        this.val$object = dynamicRealmObject;
        this.val$realmConfig = realmConfiguration;
    }

    public void subscribe(final Page6ELFragment<ObjectChange<DynamicRealmObject>> page6ELFragment) {
        if (RealmObject.isValid(this.val$object)) {
            final DynamicRealm instance = DynamicRealm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(this.this$0).get()).acquireReference(this.val$object);
            final AnonymousClass1 r0 = new RealmObjectChangeListener<DynamicRealmObject>() { // from class: io.realm.rx.RealmObservableFactory$17.1
                public void onChange(DynamicRealmObject dynamicRealmObject, ObjectChangeSet objectChangeSet) {
                    if (!page6ELFragment.a()) {
                        DynamicRealmObject dynamicRealmObject2 = dynamicRealmObject;
                        if (RealmObservableFactory.access$100(RealmObservableFactory$17.this.this$0)) {
                            dynamicRealmObject2 = (DynamicRealmObject) RealmObject.freeze(dynamicRealmObject);
                        }
                        new ObjectChange(dynamicRealmObject2, objectChangeSet);
                    }
                }
            };
            this.val$object.addChangeListener(r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$17.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObject.removeChangeListener(RealmObservableFactory$17.this.val$object, r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(RealmObservableFactory$17.this.this$0).get()).releaseReference(RealmObservableFactory$17.this.val$object);
                }
            };
            onChooseBahasa.b(r02, "run is null");
            new Page6FLKartuPelajarFragment_ViewBinding(r02);
            new ObjectChange(RealmObservableFactory.access$100(this.this$0) ? (DynamicRealmObject) RealmObject.freeze(this.val$object) : this.val$object, (ObjectChangeSet) null);
        }
    }
}
