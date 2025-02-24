package o;

import o.setScrollingTouchSlop;
/* loaded from: classes-dex2jar.jar:o/setViewCacheExtension.class */
public final class setViewCacheExtension implements setScrollingTouchSlop.read {
    @Override // o.setScrollingTouchSlop.read
    public final setScrollingTouchSlop d(setScrollingTouchSlop.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return new SavedStateRegistry$1(remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.d, remoteActionCompatParcelizer.b, remoteActionCompatParcelizer.e);
    }
}
