package o;

import android.view.View;
import io.realm.internal.Property;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem;
/* loaded from: classes-dex2jar.jar:o/setPostOnViewCreatedAlpha.class */
public abstract class setPostOnViewCreatedAlpha extends setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem {
    boolean n = true;

    public abstract boolean b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);

    public abstract boolean b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i, int i2, int i3, int i4);

    public abstract boolean b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, int i, int i2, int i3, int i4);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (((r4.c & 4) != 0) == false) goto L_0x0027;
     */
    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean c(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r4) {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.n
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0025
            r0 = r4
            int r0 = r0.c
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L_0x001a
            r0 = 1
            r7 = r0
            goto L_0x001d
        L_0x001a:
            r0 = 0
            r7 = r0
        L_0x001d:
            r0 = r7
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 1
            r6 = r0
        L_0x0027:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPostOnViewCreatedAlpha.c(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable):boolean");
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2) {
        int i = write.e;
        int i2 = write.c;
        View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
        int left = write2 == null ? view.getLeft() : write2.e;
        int top = write2 == null ? view.getTop() : write2.c;
        if (((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 8) != 0) || (i == left && i2 == top)) {
            return e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, i, i2, left, top);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2) {
        int i;
        int i2;
        int i3 = write.e;
        int i4 = write.c;
        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c & Property.TYPE_ARRAY) != 0) {
            i2 = write.e;
            i = write.c;
        } else {
            i2 = write2.e;
            i = write2.c;
        }
        return b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, i3, i4, i2, i);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final boolean d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2) {
        if (write.e != write2.e || write.c != write2.c) {
            return b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write.e, write.c, write2.e, write2.c);
        }
        i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        return false;
    }

    public abstract boolean e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final boolean e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2) {
        return (write == null || (write.e == write2.e && write.c == write2.c)) ? b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) : b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write.e, write.c, write2.e, write2.c);
    }
}
