package o;

import java.util.concurrent.Executor;
import o.onActivityStopped;
/* loaded from: classes-dex2jar.jar:o/onActivityPrePaused.class */
final class onActivityPrePaused implements setScrollingTouchSlop, FragmentManager$6 {
    private final onActivityStopped.RemoteActionCompatParcelizer a;
    private final Executor b;
    private final setScrollingTouchSlop d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onActivityPrePaused(setScrollingTouchSlop setscrollingtouchslop, onActivityStopped.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Executor executor) {
        this.d = setscrollingtouchslop;
        this.a = remoteActionCompatParcelizer;
        this.b = executor;
    }

    @Override // o.FragmentManager$6
    public final setScrollingTouchSlop a() {
        return this.d;
    }

    @Override // o.setScrollingTouchSlop
    public final String b() {
        return this.d.b();
    }

    @Override // o.setScrollingTouchSlop
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // o.setScrollingTouchSlop, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener d() {
        return new registerIn(this.d.d(), this.a, this.b);
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener e() {
        return new registerIn(this.d.e(), this.a, this.b);
    }
}
