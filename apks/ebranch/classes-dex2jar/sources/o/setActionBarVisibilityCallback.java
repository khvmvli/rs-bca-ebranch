package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setActionBarVisibilityCallback.class */
public abstract class setActionBarVisibilityCallback {
    Object b;
    boolean e;

    /* loaded from: classes-dex2jar.jar:o/setActionBarVisibilityCallback$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        boolean c(setActionBarVisibilityCallback setactionbarvisibilitycallback, Menu menu);

        boolean c(setActionBarVisibilityCallback setactionbarvisibilitycallback, MenuItem menuItem);

        void d(setActionBarVisibilityCallback setactionbarvisibilitycallback);

        boolean d(setActionBarVisibilityCallback setactionbarvisibilitycallback, Menu menu);
    }

    public abstract MenuInflater a();

    public abstract View b();

    public abstract void b(int i);

    public abstract void b(View view);

    public abstract void c(CharSequence charSequence);

    public abstract void d();

    public abstract void d(int i);

    public void d(boolean z) {
        this.e = z;
    }

    public abstract Menu e();

    public abstract void e(CharSequence charSequence);

    public abstract CharSequence f();

    public abstract void g();

    public abstract CharSequence i();

    public boolean j() {
        return false;
    }
}
