package o;

import java.util.logging.Level;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/Stetho$DefaultInspectorModulesBuilder.class */
final class Stetho$DefaultInspectorModulesBuilder implements Runnable, Stetho$InitializerBuilder {
    private final build a = new build();
    private final documentProvider c;
    private volatile boolean d;

    Stetho$DefaultInspectorModulesBuilder(documentProvider documentprovider) {
        this.c = documentprovider;
    }

    @Override // o.Stetho$InitializerBuilder
    public final void a(store store, Object obj) {
        runtimeRepl c = runtimeRepl.c(store, obj);
        synchronized (this) {
            this.a.a(c);
            if (!this.d) {
                this.d = true;
                this.c.d.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                runtimeRepl b = this.a.b(DateTimeConstants.MILLIS_PER_SECOND);
                runtimeRepl runtimerepl = b;
                if (b == null) {
                    synchronized (this) {
                        runtimerepl = this.a.e();
                        if (runtimerepl == null) {
                            return;
                        }
                    }
                }
                documentProvider documentprovider = this.c;
                Object obj = runtimerepl.e;
                store store = runtimerepl.b;
                runtimeRepl.e(runtimerepl);
                if (store.e) {
                    documentprovider.a(store, obj);
                }
            } catch (InterruptedException e) {
                start start = this.c.c;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder();
                sb.append(Thread.currentThread().getName());
                sb.append(" was interruppted");
                start.e(level, sb.toString(), e);
                return;
            } finally {
                this.d = false;
            }
        }
    }
}
