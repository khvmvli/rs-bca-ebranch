package o;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import o.PilihTahunBulanDialog;
/* loaded from: classes2-dex2jar.jar:o/PilihTahunBulanDialog.class */
public class PilihTahunBulanDialog<T> implements Provider<T>, Deferred<T> {
    private static final Deferred$DeferredHandler<Object> c = new Deferred$DeferredHandler() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0
        @Override // com.google.firebase.inject.Deferred$DeferredHandler
        public final void handle(Provider provider) {
            PilihTahunBulanDialog.c();
        }
    };
    public static final Provider<Object> d = new Provider() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda1
        public final Object get() {
            return PilihTahunBulanDialog.e();
        }
    };
    public volatile Provider<T> a;
    public Deferred$DeferredHandler<T> b;

    private PilihTahunBulanDialog(Deferred$DeferredHandler<T> deferred$DeferredHandler, Provider<T> provider) {
        this.b = deferred$DeferredHandler;
        this.a = provider;
    }

    public static <T> PilihTahunBulanDialog<T> a() {
        return new PilihTahunBulanDialog<>(c, d);
    }

    public static /* synthetic */ void b(Deferred$DeferredHandler deferred$DeferredHandler, Deferred$DeferredHandler deferred$DeferredHandler2, Provider provider) {
        deferred$DeferredHandler.handle(provider);
        deferred$DeferredHandler2.handle(provider);
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public static <T> PilihTahunBulanDialog<T> e(Provider<T> provider) {
        return new PilihTahunBulanDialog<>(null, provider);
    }

    public T get() {
        return (T) this.a.get();
    }

    public void whenAvailable(Deferred$DeferredHandler<T> deferred$DeferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.a;
        Provider<Object> provider4 = d;
        if (provider3 != provider4) {
            deferred$DeferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.a;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                this.b = new Deferred$DeferredHandler(deferred$DeferredHandler) { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda2
                    public final /* synthetic */ Deferred$DeferredHandler f$1;

                    {
                        this.f$1 = r5;
                    }

                    @Override // com.google.firebase.inject.Deferred$DeferredHandler
                    public final void handle(Provider provider5) {
                        PilihTahunBulanDialog.b(Deferred$DeferredHandler.this, this.f$1, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferred$DeferredHandler.handle(provider);
        }
    }
}
