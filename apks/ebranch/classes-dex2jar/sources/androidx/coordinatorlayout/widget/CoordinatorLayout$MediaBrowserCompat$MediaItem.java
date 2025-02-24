package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$MediaBrowserCompat$MediaItem.class */
public final class CoordinatorLayout$MediaBrowserCompat$MediaItem implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ CoordinatorLayout d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CoordinatorLayout$MediaBrowserCompat$MediaItem(CoordinatorLayout coordinatorLayout) {
        this.d = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.d.d(0);
        return true;
    }
}
