package o;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/onCreateDialog.class */
public abstract class onCreateDialog {
    private write a;
    private IconCompatParcelizer b;
    private final Context c;

    /* loaded from: classes-dex2jar.jar:o/onCreateDialog$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void e(boolean z);
    }

    /* loaded from: classes-dex2jar.jar:o/onCreateDialog$write.class */
    public interface write {
        void c();
    }

    public onCreateDialog(Context context) {
        this.c = context;
    }

    public boolean a() {
        return true;
    }

    public abstract View b();

    public void c(IconCompatParcelizer iconCompatParcelizer) {
        this.b = iconCompatParcelizer;
    }

    public void c(write write2) {
        if (!(this.a == null || write2 == null)) {
            StringBuilder sb = new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.a = write2;
    }

    public boolean c() {
        return false;
    }

    public View d(MenuItem menuItem) {
        return b();
    }

    public void d(boolean z) {
        IconCompatParcelizer iconCompatParcelizer = this.b;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.e(z);
        }
    }

    public boolean d() {
        return false;
    }

    public void e(SubMenu subMenu) {
    }

    public boolean e() {
        return false;
    }

    public void f() {
        this.a = null;
        this.b = null;
    }
}
