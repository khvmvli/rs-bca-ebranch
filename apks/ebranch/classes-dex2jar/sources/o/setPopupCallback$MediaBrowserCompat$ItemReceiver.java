package o;

import android.content.res.Configuration;
/* loaded from: classes-dex2jar.jar:o/setPopupCallback$MediaBrowserCompat$ItemReceiver.class */
class setPopupCallback$MediaBrowserCompat$ItemReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
            configuration3.colorMode |= configuration2.colorMode & 3;
        }
        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
            configuration3.colorMode |= configuration2.colorMode & 12;
        }
    }
}
