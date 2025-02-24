package o;

import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/MediaSessionCompat$Token$MediaBrowserCompat$CustomActionResultReceiver.class */
final class MediaSessionCompat$Token$MediaBrowserCompat$CustomActionResultReceiver implements Runnable {
    final int a;
    final Bundle b;
    final /* synthetic */ MediaSessionCompat$Token c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaSessionCompat$Token$MediaBrowserCompat$CustomActionResultReceiver(MediaSessionCompat$Token mediaSessionCompat$Token, int i, Bundle bundle) {
        this.c = mediaSessionCompat$Token;
        this.a = i;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.a, this.b);
    }
}
