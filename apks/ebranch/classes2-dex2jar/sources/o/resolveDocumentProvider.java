package o;
/* loaded from: classes2-dex2jar.jar:o/resolveDocumentProvider.class */
final class resolveDocumentProvider implements Runnable, Stetho$InitializerBuilder {
    final build b = new build();
    final documentProvider e;

    resolveDocumentProvider(documentProvider documentprovider) {
        this.e = documentprovider;
    }

    @Override // o.Stetho$InitializerBuilder
    public final void a(store store, Object obj) {
        this.b.a(runtimeRepl.c(store, obj));
        this.e.d.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        runtimeRepl e = this.b.e();
        if (e != null) {
            documentProvider documentprovider = this.e;
            Object obj = e.e;
            store store = e.b;
            runtimeRepl.e(e);
            if (store.e) {
                documentprovider.a(store, obj);
                return;
            }
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
