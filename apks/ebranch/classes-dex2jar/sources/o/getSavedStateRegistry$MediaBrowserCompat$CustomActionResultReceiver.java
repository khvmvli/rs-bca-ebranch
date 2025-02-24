package o;

import android.os.SystemClock;
import android.view.Choreographer;
import o.getSavedStateRegistry;
/* loaded from: classes-dex2jar.jar:o/getSavedStateRegistry$MediaBrowserCompat$CustomActionResultReceiver.class */
final class getSavedStateRegistry$MediaBrowserCompat$CustomActionResultReceiver extends getSavedStateRegistry.read {
    private final Choreographer a = Choreographer.getInstance();
    private final Choreographer.FrameCallback d = new Choreographer.FrameCallback() { // from class: o.getSavedStateRegistry$MediaBrowserCompat$CustomActionResultReceiver.1
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            getSavedStateRegistry.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getSavedStateRegistry$MediaBrowserCompat$CustomActionResultReceiver.this.b;
            getSavedStateRegistry.this.b = SystemClock.uptimeMillis();
            getSavedStateRegistry getsavedstateregistry = getSavedStateRegistry.this;
            long j2 = getsavedstateregistry.b;
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= getsavedstateregistry.e.size()) {
                    break;
                }
                getSavedStateRegistry.write write = getsavedstateregistry.e.get(i);
                if (write != null) {
                    Long l = getsavedstateregistry.c.get(write);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            getsavedstateregistry.c.remove(write);
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        write.e(j2);
                    }
                }
                i++;
            }
            if (getsavedstateregistry.h) {
                for (int size = getsavedstateregistry.e.size() - 1; size >= 0; size--) {
                    if (getsavedstateregistry.e.get(size) == null) {
                        getsavedstateregistry.e.remove(size);
                    }
                }
                getsavedstateregistry.h = false;
            }
            if (getSavedStateRegistry.this.e.size() > 0) {
                getSavedStateRegistry getsavedstateregistry2 = getSavedStateRegistry.this;
                if (getsavedstateregistry2.f == null) {
                    getsavedstateregistry2.f = new getSavedStateRegistry$MediaBrowserCompat$CustomActionResultReceiver(getsavedstateregistry2.d);
                }
                getsavedstateregistry2.f.d();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public getSavedStateRegistry$MediaBrowserCompat$CustomActionResultReceiver(getSavedStateRegistry.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(remoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getSavedStateRegistry.read
    public final void d() {
        this.a.postFrameCallback(this.d);
    }
}
