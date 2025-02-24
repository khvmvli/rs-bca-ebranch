package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import o.isDetached;
/* loaded from: classes-dex2jar.jar:o/setPathData.class */
public abstract class setPathData extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<getRootAlpha> implements getPathName {
    public setPathData$MediaBrowserCompat$CustomActionResultReceiver b;
    public final isDetached e;
    public final onRequestPermissionsResult f;
    public final setTrackDrawable<Fragment> j;

    public static void e(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public void d(final Fragment fragment, final FrameLayout frameLayout) {
        this.e.l.a.add(new isAdded$MediaBrowserCompat$CustomActionResultReceiver(new isDetached.write() { // from class: o.setPathData.3
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
                r0.a.remove(r8);
             */
            @Override // o.isDetached.write
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void c(o.isDetached r4, androidx.fragment.app.Fragment r5, android.view.View r6) {
                /*
                    r3 = this;
                    r0 = r5
                    r1 = r3
                    androidx.fragment.app.Fragment r1 = r7
                    if (r0 != r1) goto L_0x005f
                    r0 = r4
                    o.isAdded r0 = r0.l
                    r5 = r0
                    r0 = r5
                    java.util.concurrent.CopyOnWriteArrayList<o.isAdded$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.a
                    r4 = r0
                    r0 = r4
                    monitor-enter(r0)
                    r0 = r5
                    java.util.concurrent.CopyOnWriteArrayList<o.isAdded$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.a     // Catch: all -> 0x005a
                    int r0 = r0.size()     // Catch: all -> 0x005a
                    r7 = r0
                    r0 = 0
                    r8 = r0
                L_0x0020:
                    r0 = r8
                    r1 = r7
                    if (r0 >= r1) goto L_0x004d
                    r0 = r5
                    java.util.concurrent.CopyOnWriteArrayList<o.isAdded$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.a     // Catch: all -> 0x005a
                    r1 = r8
                    java.lang.Object r0 = r0.get(r1)     // Catch: all -> 0x005a
                    o.isAdded$MediaBrowserCompat$CustomActionResultReceiver r0 = (o.isAdded$MediaBrowserCompat$CustomActionResultReceiver) r0     // Catch: all -> 0x005a
                    o.isDetached$write r0 = r0.b     // Catch: all -> 0x005a
                    r1 = r3
                    if (r0 != r1) goto L_0x0047
                    r0 = r5
                    java.util.concurrent.CopyOnWriteArrayList<o.isAdded$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.a     // Catch: all -> 0x005a
                    r1 = r8
                    java.lang.Object r0 = r0.remove(r1)     // Catch: all -> 0x005a
                    goto L_0x004d
                L_0x0047:
                    int r8 = r8 + 1
                    goto L_0x0020
                L_0x004d:
                    r0 = r4
                    monitor-exit(r0)
                    r0 = r6
                    r1 = r3
                    android.widget.FrameLayout r1 = r8
                    o.setPathData.e(r0, r1)
                    goto L_0x005f
                L_0x005a:
                    r5 = move-exception
                    r0 = r4
                    monitor-exit(r0)
                    r0 = r5
                    throw r0
                L_0x005f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setPathData.AnonymousClass3.c(o.isDetached, androidx.fragment.app.Fragment, android.view.View):void");
            }
        }, false));
    }
}
