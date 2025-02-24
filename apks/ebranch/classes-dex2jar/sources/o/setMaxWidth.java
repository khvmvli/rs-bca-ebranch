package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
/* loaded from: classes-dex2jar.jar:o/setMaxWidth.class */
public final class setMaxWidth extends ContextWrapper {
    private static final Object b = new Object();
    private final Resources a;
    private final Resources.Theme e;

    public static Context c(Context context) {
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.e;
        Resources.Theme theme2 = theme;
        if (theme == null) {
            theme2 = getTheme();
        }
        return theme2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        Resources.Theme theme = this.e;
        if (theme == null) {
            setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
