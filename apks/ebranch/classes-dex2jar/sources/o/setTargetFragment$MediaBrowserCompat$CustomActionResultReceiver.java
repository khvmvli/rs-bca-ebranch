package o;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import o.setTargetFragment;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver implements setOnScrollListener {
    final setUserVisibleHint a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver(setUserVisibleHint setuservisiblehint) {
        this.a = setuservisiblehint;
    }

    @Override // o.setOnScrollListener
    public final Recreator a(String str) {
        return new setTargetFragment.RemoteActionCompatParcelizer(str, this.a);
    }

    @Override // o.setOnScrollListener
    public final void a() {
        try {
            this.a.b().a();
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // o.setOnScrollListener
    public final Cursor b(setRecycledViewPool setrecycledviewpool, CancellationSignal cancellationSignal) {
        try {
            return new setTargetFragment.write(this.a.b().b(setrecycledviewpool, cancellationSignal), this.a);
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // o.setOnScrollListener
    public final List<Pair<String, String>> b() {
        return (List) this.a.a(new setSwitchMinWidth() { // from class: o.shouldShowRequestPermissionRationale
            @Override // o.setSwitchMinWidth
            public final Object c(Object obj) {
                return ((setOnScrollListener) obj).b();
            }
        });
    }

    @Override // o.setOnScrollListener
    public final void b(String str) throws SQLException {
        this.a.a(new setSwitchMinWidth(str) { // from class: o.startPostponedEnterTransition
            public final /* synthetic */ String b;

            {
                this.b = r4;
            }

            @Override // o.setSwitchMinWidth
            public final Object c(Object obj) {
                ((setOnScrollListener) obj).b(this.b);
                return null;
            }
        });
    }

    @Override // o.setOnScrollListener
    public final void c() {
        if (this.a.d() != null) {
            try {
                this.a.d().c();
            } finally {
                this.a.c();
            }
        } else {
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        setUserVisibleHint setuservisiblehint = this.a;
        synchronized (setuservisiblehint.i) {
            setuservisiblehint.h = true;
            setOnScrollListener setonscrolllistener = setuservisiblehint.c;
            if (setonscrolllistener != null) {
                setonscrolllistener.close();
            }
            setuservisiblehint.c = null;
        }
    }

    @Override // o.setOnScrollListener
    public final Cursor d(String str) {
        try {
            return new setTargetFragment.write(this.a.b().d(str), this.a);
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // o.setOnScrollListener
    public final String d() {
        return (String) this.a.a(new setSwitchMinWidth() { // from class: o.setSharedElementNames
            @Override // o.setSwitchMinWidth
            public final Object c(Object obj) {
                return ((setOnScrollListener) obj).d();
            }
        });
    }

    @Override // o.setOnScrollListener
    public final void d(int i) {
        this.a.a(new setSwitchMinWidth(i) { // from class: o.startActivityForResult
            public final /* synthetic */ int d;

            {
                this.d = r4;
            }

            @Override // o.setSwitchMinWidth
            public final Object c(Object obj) {
                ((setOnScrollListener) obj).d(this.d);
                return null;
            }
        });
    }

    @Override // o.setOnScrollListener
    public final Cursor e(setRecycledViewPool setrecycledviewpool) {
        try {
            return new setTargetFragment.write(this.a.b().e(setrecycledviewpool), this.a);
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // o.setOnScrollListener
    public final void e() {
        try {
            this.a.b().e();
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // o.setOnScrollListener
    public final boolean f() {
        return ((Boolean) this.a.a(new setSwitchMinWidth() { // from class: o.setSharedElementReturnTransition
            @Override // o.setSwitchMinWidth
            public final Object c(Object obj) {
                return Boolean.valueOf(((setOnScrollListener) obj).f());
            }
        })).booleanValue();
    }

    @Override // o.setOnScrollListener
    public final void g() {
        setOnScrollListener d = this.a.d();
        if (d != null) {
            d.g();
            return;
        }
        throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
    }

    @Override // o.setOnScrollListener
    public final boolean h() {
        setOnScrollListener d = this.a.d();
        if (d == null) {
            return false;
        }
        return d.h();
    }

    @Override // o.setOnScrollListener
    public final boolean i() {
        if (this.a.d() == null) {
            return false;
        }
        return ((Boolean) this.a.a(new setSwitchMinWidth() { // from class: o.startActivity
            @Override // o.setSwitchMinWidth
            public final Object c(Object obj) {
                return Boolean.valueOf(((setOnScrollListener) obj).i());
            }
        })).booleanValue();
    }
}
