package o;

import android.content.res.Configuration;
import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/setOnScrollChangeListener.class */
public final class setOnScrollChangeListener {
    public static setDrawerTitle b(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? setDrawerTitle.c(configuration.getLocales()) : setDrawerTitle.e(configuration.locale);
    }
}
