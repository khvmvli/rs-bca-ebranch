package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/setHideReplaced.class */
public class setHideReplaced extends onDismiss {
    final setOnStartEnterTransitionListener a;
    final IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:o/setHideReplaced$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends onDismiss {
        final setHideReplaced a;
        Map<View, onDismiss> d = new WeakHashMap();

        public IconCompatParcelizer(setHideReplaced sethidereplaced) {
            this.a = sethidereplaced;
        }

        @Override // o.onDismiss
        public final void b(View view, int i) {
            onDismiss ondismiss = this.d.get(view);
            if (ondismiss != null) {
                ondismiss.b(view, i);
            } else {
                b(view, i);
            }
        }

        @Override // o.onDismiss
        public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
            if (this.a.a.c() || this.a.a.z == null) {
                b(view, getchildfragmentmanager);
                return;
            }
            this.a.a.z.e(view, getchildfragmentmanager);
            onDismiss ondismiss = this.d.get(view);
            if (ondismiss != null) {
                ondismiss.b(view, getchildfragmentmanager);
            } else {
                b(view, getchildfragmentmanager);
            }
        }

        @Override // o.onDismiss
        public final boolean b(View view, int i, Bundle bundle) {
            if (this.a.a.c() || this.a.a.z == null) {
                return b(view, i, bundle);
            }
            onDismiss ondismiss = this.d.get(view);
            if (ondismiss != null) {
                if (ondismiss.b(view, i, bundle)) {
                    return true;
                }
            } else if (b(view, i, bundle)) {
                return true;
            }
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.a.a.z;
            return false;
        }

        @Override // o.onDismiss
        public final boolean b(View view, AccessibilityEvent accessibilityEvent) {
            onDismiss ondismiss = this.d.get(view);
            return ondismiss != null ? ondismiss.b(view, accessibilityEvent) : b(view, accessibilityEvent);
        }

        @Override // o.onDismiss
        public final getEnterAnim c(View view) {
            onDismiss ondismiss = this.d.get(view);
            return ondismiss != null ? ondismiss.c(view) : c(view);
        }

        @Override // o.onDismiss
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            onDismiss ondismiss = this.d.get(view);
            if (ondismiss != null) {
                ondismiss.c(view, accessibilityEvent);
            } else {
                c(view, accessibilityEvent);
            }
        }

        @Override // o.onDismiss
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            onDismiss ondismiss = this.d.get(view);
            if (ondismiss != null) {
                ondismiss.d(view, accessibilityEvent);
            } else {
                d(view, accessibilityEvent);
            }
        }

        @Override // o.onDismiss
        public final boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            onDismiss ondismiss = this.d.get(viewGroup);
            return ondismiss != null ? ondismiss.d(viewGroup, view, accessibilityEvent) : d(viewGroup, view, accessibilityEvent);
        }

        @Override // o.onDismiss
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            onDismiss ondismiss = this.d.get(view);
            if (ondismiss != null) {
                ondismiss.e(view, accessibilityEvent);
            } else {
                e(view, accessibilityEvent);
            }
        }
    }

    public setHideReplaced(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        this.a = setonstartentertransitionlistener;
        IconCompatParcelizer iconCompatParcelizer = this.e;
        if (iconCompatParcelizer == null || !(iconCompatParcelizer instanceof IconCompatParcelizer)) {
            this.e = new IconCompatParcelizer(this);
        } else {
            this.e = iconCompatParcelizer;
        }
    }

    @Override // o.onDismiss
    public void b(View view, getChildFragmentManager getchildfragmentmanager) {
        b(view, getchildfragmentmanager);
        if (!this.a.c() && this.a.z != null) {
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.a.z;
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.d(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.x.L, setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.x.R, getchildfragmentmanager);
        }
    }

    @Override // o.onDismiss
    public boolean b(View view, int i, Bundle bundle) {
        if (b(view, i, bundle)) {
            return true;
        }
        if (this.a.c() || this.a.z == null) {
            return false;
        }
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.a.z;
        return setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.d(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.x.L, setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.x.R, i, bundle);
    }

    @Override // o.onDismiss
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        c(view, accessibilityEvent);
        if ((view instanceof setOnStartEnterTransitionListener) && !this.a.c()) {
            setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) view;
            if (setonstartentertransitionlistener.z != null) {
                setonstartentertransitionlistener.z.c(accessibilityEvent);
            }
        }
    }
}
