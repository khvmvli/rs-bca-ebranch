package o;

import o.setScrollingTouchSlop;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/unregisterForContextMenu.class */
public final class unregisterForContextMenu implements setScrollingTouchSlop.read {
    private final setUserVisibleHint a;
    private final setScrollingTouchSlop.read c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public unregisterForContextMenu(setScrollingTouchSlop.read read, setUserVisibleHint setuservisiblehint) {
        this.c = read;
        this.a = setuservisiblehint;
    }

    @Override // o.setScrollingTouchSlop.read
    public final /* synthetic */ setScrollingTouchSlop d(setScrollingTouchSlop.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return new setTargetFragment(this.c.d(remoteActionCompatParcelizer), this.a);
    }
}
