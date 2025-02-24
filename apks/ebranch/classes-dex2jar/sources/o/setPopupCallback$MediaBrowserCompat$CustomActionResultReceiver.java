package o;

import android.content.Context;
import android.content.res.Configuration;
/* loaded from: classes-dex2jar.jar:o/setPopupCallback$MediaBrowserCompat$CustomActionResultReceiver.class */
class setPopupCallback$MediaBrowserCompat$CustomActionResultReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context b(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        if (configuration.densityDpi != configuration2.densityDpi) {
            configuration3.densityDpi = configuration2.densityDpi;
        }
    }
}
