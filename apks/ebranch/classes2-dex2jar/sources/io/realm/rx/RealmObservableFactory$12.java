package io.realm.rx;

import io.realm.DynamicRealm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.rx.RealmObservableFactory;
import o.Page6DTapresSFragment;
import o.Page6FLKartuPelajarFragment_ViewBinding;
import o.onChooseBahasa;
import o.showPelajarPage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/rx/RealmObservableFactory$12.class */
public class RealmObservableFactory$12 implements showPelajarPage<RealmList<E>> {
    final /* synthetic */ RealmObservableFactory this$0;
    final /* synthetic */ RealmList val$list;
    final /* synthetic */ RealmConfiguration val$realmConfig;

    RealmObservableFactory$12(RealmObservableFactory realmObservableFactory, RealmList realmList, RealmConfiguration realmConfiguration) {
        this.this$0 = realmObservableFactory;
        this.val$list = realmList;
        this.val$realmConfig = realmConfiguration;
    }

    public void subscribe(final Page6DTapresSFragment<RealmList<E>> page6DTapresSFragment) {
        if (this.val$list.isValid()) {
            final DynamicRealm instance = DynamicRealm.getInstance(this.val$realmConfig);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$300(this.this$0).get()).acquireReference(this.val$list);
            final AnonymousClass1 r0 = new RealmChangeListener<RealmList<E>>() { // from class: io.realm.rx.RealmObservableFactory$12.1
                public void onChange(RealmList<E> realmList) {
                    if (realmList.isValid() && !page6DTapresSFragment.a() && RealmObservableFactory.access$100(RealmObservableFactory$12.this.this$0)) {
                        realmList.freeze();
                    }
                }
            };
            this.val$list.addChangeListener(r0);
            AnonymousClass2 r02 = new Runnable() { // from class: io.realm.rx.RealmObservableFactory$12.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!instance.isClosed()) {
                        RealmObservableFactory$12.this.val$list.removeChangeListener(r0);
                        instance.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.access$300(RealmObservableFactory$12.this.this$0).get()).releaseReference(RealmObservableFactory$12.this.val$list);
                }
            };
            onChooseBahasa.b(r02, "run is null");
            new Page6FLKartuPelajarFragment_ViewBinding(r02);
            if (RealmObservableFactory.access$100(this.this$0)) {
                this.val$list.freeze();
            }
        }
    }
}
