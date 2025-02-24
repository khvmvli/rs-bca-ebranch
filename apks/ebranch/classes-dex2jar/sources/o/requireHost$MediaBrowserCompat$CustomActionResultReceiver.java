package o;

import o.performStop;
import o.requireHost;
/* loaded from: classes-dex2jar.jar:o/requireHost$MediaBrowserCompat$CustomActionResultReceiver.class */
class requireHost$MediaBrowserCompat$CustomActionResultReceiver extends performPictureInPictureModeChanged {
    private static final performStop.read c = new performStop.read() { // from class: o.requireHost$MediaBrowserCompat$CustomActionResultReceiver.3
        @Override // o.performStop.read
        public final <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
            return new requireHost$MediaBrowserCompat$CustomActionResultReceiver();
        }
    };
    setTrackTintList<requireHost.IconCompatParcelizer> e = new setTrackTintList<>();
    private boolean a = false;

    requireHost$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static requireHost$MediaBrowserCompat$CustomActionResultReceiver c(performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged) {
        return (requireHost$MediaBrowserCompat$CustomActionResultReceiver) new performStop(performprimarynavigationfragmentchanged, c).c(requireHost$MediaBrowserCompat$CustomActionResultReceiver.class);
    }

    @Override // o.performPictureInPictureModeChanged
    public final void a() {
        a();
        int b = this.e.b();
        for (int i = 0; i < b; i++) {
            this.e.e(i).d(true);
        }
        this.e.e();
    }
}
