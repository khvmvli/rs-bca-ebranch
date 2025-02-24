package o;

import java.util.concurrent.Executor;
import o.onActivityStopped;
import o.setScrollingTouchSlop;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/onActivitySaveInstanceState.class */
public final class onActivitySaveInstanceState implements setScrollingTouchSlop.read {
    private final Executor a;
    private final setScrollingTouchSlop.read c;
    private final onActivityStopped.RemoteActionCompatParcelizer d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onActivitySaveInstanceState(setScrollingTouchSlop.read read, onActivityStopped.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Executor executor) {
        this.c = read;
        this.d = remoteActionCompatParcelizer;
        this.a = executor;
    }

    @Override // o.setScrollingTouchSlop.read
    public final setScrollingTouchSlop d(setScrollingTouchSlop.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return new onActivityPrePaused(this.c.d(remoteActionCompatParcelizer), this.d, this.a);
    }
}
