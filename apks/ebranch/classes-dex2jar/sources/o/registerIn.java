package o;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import o.onActivityStopped;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/registerIn.class */
public final class registerIn implements setOnScrollListener {
    private final setOnScrollListener a;
    private final Executor d;
    private final onActivityStopped.RemoteActionCompatParcelizer e;

    public registerIn(setOnScrollListener setonscrolllistener, onActivityStopped.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Executor executor) {
        this.a = setonscrolllistener;
        this.e = remoteActionCompatParcelizer;
        this.d = executor;
    }

    @Override // o.setOnScrollListener
    public final Recreator a(String str) {
        return new onActivityStarted(this.a.a(str), this.e, str, this.d);
    }

    @Override // o.setOnScrollListener
    public final void a() {
        this.d.execute(new Runnable() { // from class: o.onActivityPostCreated
            @Override // java.lang.Runnable
            public final void run() {
                Collections.emptyList();
            }
        });
        this.a.a();
    }

    @Override // o.setOnScrollListener
    public final Cursor b(setRecycledViewPool setrecycledviewpool, CancellationSignal cancellationSignal) {
        onActivityPreStopped onactivityprestopped = new onActivityPreStopped();
        setrecycledviewpool.a(onactivityprestopped);
        this.d.execute(new Runnable(setrecycledviewpool, onactivityprestopped) { // from class: o.onActivityPostResumed
            public final /* synthetic */ onActivityPreStopped a;
            public final /* synthetic */ setRecycledViewPool c;

            {
                this.c = r5;
                this.a = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                setRecycledViewPool setrecycledviewpool2 = this.c;
                onActivityPreStopped onactivityprestopped2 = this.a;
                setrecycledviewpool2.b();
                List<Object> list = onactivityprestopped2.d;
            }
        });
        return this.a.e(setrecycledviewpool);
    }

    @Override // o.setOnScrollListener
    public final List<Pair<String, String>> b() {
        return this.a.b();
    }

    @Override // o.setOnScrollListener
    public final void b(String str) throws SQLException {
        this.d.execute(new Runnable(str) { // from class: o.LiveData$LifecycleBoundObserver
            public final /* synthetic */ String a;

            {
                this.a = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                new ArrayList(0);
            }
        });
        this.a.b(str);
    }

    @Override // o.setOnScrollListener
    public final void c() {
        this.d.execute(new Runnable() { // from class: o.ReflectiveGenericLifecycleObserver
            @Override // java.lang.Runnable
            public final void run() {
                Collections.emptyList();
            }
        });
        this.a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // o.setOnScrollListener
    public final Cursor d(String str) {
        this.d.execute(new Runnable(str) { // from class: o.onActivityPaused
            public final /* synthetic */ String c;

            {
                this.c = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Collections.emptyList();
            }
        });
        return this.a.d(str);
    }

    @Override // o.setOnScrollListener
    public final String d() {
        return this.a.d();
    }

    @Override // o.setOnScrollListener
    public final void d(int i) {
        this.a.d(i);
    }

    @Override // o.setOnScrollListener
    public final Cursor e(setRecycledViewPool setrecycledviewpool) {
        onActivityPreStopped onactivityprestopped = new onActivityPreStopped();
        setrecycledviewpool.a(onactivityprestopped);
        this.d.execute(new Runnable(setrecycledviewpool, onactivityprestopped) { // from class: o.onActivityPostStarted
            public final /* synthetic */ onActivityPreStopped a;
            public final /* synthetic */ setRecycledViewPool d;

            {
                this.d = r5;
                this.a = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                setRecycledViewPool setrecycledviewpool2 = this.d;
                onActivityPreStopped onactivityprestopped2 = this.a;
                setrecycledviewpool2.b();
                List<Object> list = onactivityprestopped2.d;
            }
        });
        return this.a.e(setrecycledviewpool);
    }

    @Override // o.setOnScrollListener
    public final void e() {
        this.d.execute(new Runnable() { // from class: o.onActivityDestroyed
            @Override // java.lang.Runnable
            public final void run() {
                Collections.emptyList();
            }
        });
        this.a.e();
    }

    @Override // o.setOnScrollListener
    public final boolean f() {
        return this.a.f();
    }

    @Override // o.setOnScrollListener
    public final void g() {
        this.d.execute(new Runnable() { // from class: o.onActivityPreDestroyed
            @Override // java.lang.Runnable
            public final void run() {
                Collections.emptyList();
            }
        });
        this.a.g();
    }

    @Override // o.setOnScrollListener
    public final boolean h() {
        return this.a.h();
    }

    @Override // o.setOnScrollListener
    public final boolean i() {
        return this.a.i();
    }
}
