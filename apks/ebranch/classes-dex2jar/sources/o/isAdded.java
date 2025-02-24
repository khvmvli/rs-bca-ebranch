package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes-dex2jar.jar:o/isAdded.class */
public final class isAdded {
    public final CopyOnWriteArrayList<isAdded$MediaBrowserCompat$CustomActionResultReceiver> a = new CopyOnWriteArrayList<>();
    private final isDetached e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isAdded(isDetached isdetached) {
        this.e = isdetached;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.a(fragment, bundle, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Fragment fragment, boolean z) {
        Context context = this.e.f.c;
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.a(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.b(fragment, bundle, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.b(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.c(fragment, bundle, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.c(fragment, view, bundle, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (!z || next.c) {
                next.b.c(this.e, fragment, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.c(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.d(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.e(fragment, bundle, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Fragment fragment, boolean z) {
        Context context = this.e.f.c;
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.e(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.g(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.h(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.i(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(Fragment fragment, boolean z) {
        Fragment fragment2 = this.e.r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.j(fragment, true);
        }
        Iterator<isAdded$MediaBrowserCompat$CustomActionResultReceiver> it = this.a.iterator();
        while (it.hasNext()) {
            isAdded$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.c;
            }
        }
    }
}
