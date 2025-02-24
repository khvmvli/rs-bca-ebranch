package io.realm.rx;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.rx.RealmObservableFactory;
import o.Page6DTapresSFragment;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
import o.showPelajarPage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$16.class */
public class RealmObservableFactory$16 implements showPelajarPage<DynamicRealmObject> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ DynamicRealmObject val$object;
    final /* synthetic */ DynamicRealm val$realm;
    final /* synthetic */ RealmConfiguration val$realmConfig;

    RealmObservableFactory$16(RealmObservableFactory realmObservableFactory, DynamicRealm dynamicRealm, RealmConfiguration realmConfiguration, DynamicRealmObject dynamicRealmObject) {
        this.this$0 = realmObservableFactory;
        this.val$realm = dynamicRealm;
        this.val$realmConfig = realmConfiguration;
        this.val$object = dynamicRealmObject;
    }

    public void subscribe(final Page6DTapresSFragment<DynamicRealmObject> page6DTapresSFragment) {
        if (!this.val$realm.isClosed()) {
            final DynamicRealm instance = DynamicRealm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(this.this$0).get()).acquireReference(this.val$object);
            final AnonymousClass1 r0 = new RealmChangeListener<DynamicRealmObject>() { // from class: io.realm.rx.RealmObservableFactory$16.1
                public void onChange(DynamicRealmObject dynamicRealmObject) {
                    if (!page6DTapresSFragment.a() && RealmObservableFactory.access$100(RealmObservableFactory$16.this.this$0)) {
                        RealmObject.freeze(dynamicRealmObject);
                    }
                }
            };
            RealmObject.addChangeListener(this.val$object, r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$16.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObject.removeChangeListener(RealmObservableFactory$16.this.val$object, r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$400(RealmObservableFactory$16.this.this$0).get()).releaseReference(RealmObservableFactory$16.this.val$object);
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
