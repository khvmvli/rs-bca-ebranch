package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setShowingForActionMode.class */
public final class setShowingForActionMode extends ContextWrapper {
    private LayoutInflater a;
    public int b;
    private Resources c;
    private Resources.Theme d;
    private Configuration e;

    public setShowingForActionMode() {
        super(null);
    }

    public setShowingForActionMode(Context context, int i) {
        super(context);
        this.b = i;
    }

    public setShowingForActionMode(Context context, Resources.Theme theme) {
        super(context);
        this.d = theme;
    }

    private void a() {
        if (this.d == null) {
            this.d = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.d.setTo(theme);
            }
        }
        this.d.applyStyle(this.b, true);
    }

    public final void a(Configuration configuration) {
        if (this.c != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.e == null) {
            this.e = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.c == null) {
            Configuration configuration = this.e;
            if (configuration == null) {
                this.c = getResources();
            } else {
                this.c = createConfigurationContext(configuration).getResources();
            }
        }
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.a == null) {
            this.a = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.d;
        if (theme != null) {
            return theme;
        }
        if (this.b == 0) {
            this.b = setHasDecor.MediaDescriptionCompat.b;
        }
        a();
        return this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.b != i) {
            this.b = i;
            a();
        }
    }
}
