package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import o.Page6DTapresSFragment;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
import o.showPelajarPage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$4.class */
public class RealmObservableFactory$4 implements showPelajarPage<Realm> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ RealmConfiguration val$realmConfig;

    RealmObservableFactory$4(RealmObservableFactory realmObservableFactory, RealmConfiguration realmConfiguration) {
        this.this$0 = realmObservableFactory;
        this.val$realmConfig = realmConfiguration;
    }

    public void subscribe(final Page6DTapresSFragment<Realm> page6DTapresSFragment) throws Exception {
        final Realm instance = Realm.getInstance(this.val$realmConfig);
        final AnonymousClass1 r0 = new RealmChangeListener<Realm>() { // from class: io.realm.rx.RealmObservableFactory$4.1
            public void onChange(Realm realm) {
                if (!page6DTapresSFragment.a() && RealmObservableFactory.access$100(RealmObservableFactory$4.this.this$0)) {
                    realm.freeze();
                }
            }
        };
        instance.addChangeListener(r0);
        AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$4.2
            @Override // java.lang.Runnable
            public void run() {
                if (!instance.isClosed()) {
                    instance.removeChangeListener(r0);
                    instance.close();
                }
            }
        };
        onChooseBahasa.b(r02, "run is null");
        new Page6FLKartuPelajarFragment_ViewBinding(r02);
        if (RealmObservableFactory.access$100(this.this$0)) {
            instance.freeze();
        }
    }
}
