package o;

import android.view.View;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setRetainInstance.class */
public final class setRetainInstance {
    public static int b(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, setMenuVisibility setmenuvisibility, View view, View view2, setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, boolean z) {
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.m() == 0) {
            return 0;
        }
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f;
        }
        return (int) ((((float) (setmenuvisibility.b(view2) - setmenuvisibility.d(view))) / ((float) (Math.abs(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view) - setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view2)) + 1))) * ((float) (immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f)));
    }

    public static int d(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, setMenuVisibility setmenuvisibility, View view, View view2, setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, boolean z, boolean z2) {
        int i;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.m() == 0) {
            return 0;
        }
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view), setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view2));
        int max = Math.max(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view), setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view2));
        if (z2) {
            i = Math.max(0, ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(setmenuvisibility.b(view2) - setmenuvisibility.d(view))) / ((float) (Math.abs(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view) - setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view2)) + 1)))) + ((float) (setmenuvisibility.g() - setmenuvisibility.d(view))));
    }

    public static int e(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, setMenuVisibility setmenuvisibility, View view, View view2, setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, boolean z) {
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.m() == 0) {
            return 0;
        }
        if ((immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view) - setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.f(view2)) + 1;
        }
        return Math.min(setmenuvisibility.i(), setmenuvisibility.b(view2) - setmenuvisibility.d(view));
    }
}
