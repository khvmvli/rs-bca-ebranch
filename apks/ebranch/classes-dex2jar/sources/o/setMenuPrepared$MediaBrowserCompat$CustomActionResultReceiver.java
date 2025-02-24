package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import o.setActionBarVisibilityCallback;
/* loaded from: classes-dex2jar.jar:o/setMenuPrepared$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setMenuPrepared$MediaBrowserCompat$CustomActionResultReceiver implements setActionBarVisibilityCallback.RemoteActionCompatParcelizer {
    final ActionMode.Callback a;
    final Context b;
    final ArrayList<setMenuPrepared> d = new ArrayList<>();
    final setCollapseIcon<Menu, Menu> e = new setCollapseIcon<>();

    public setMenuPrepared$MediaBrowserCompat$CustomActionResultReceiver(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    private Menu d(Menu menu) {
        Menu menu2 = this.e.get(menu);
        Menu menu3 = menu2;
        if (menu2 == null) {
            menu3 = new setSupportBackgroundTintList(this.b, (WindowInsetsCompat$Impl29) menu);
            this.e.put(menu, menu3);
        }
        return menu3;
    }

    public final ActionMode b(setActionBarVisibilityCallback setactionbarvisibilitycallback) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            setMenuPrepared setmenuprepared = this.d.get(i);
            if (setmenuprepared != null && setmenuprepared.d == setactionbarvisibilitycallback) {
                return setmenuprepared;
            }
        }
        setMenuPrepared setmenuprepared2 = new setMenuPrepared(this.b, setactionbarvisibilitycallback);
        this.d.add(setmenuprepared2);
        return setmenuprepared2;
    }

    @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
    public final boolean c(setActionBarVisibilityCallback setactionbarvisibilitycallback, Menu menu) {
        return this.a.onPrepareActionMode(b(setactionbarvisibilitycallback), d(menu));
    }

    @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
    public final boolean c(setActionBarVisibilityCallback setactionbarvisibilitycallback, MenuItem menuItem) {
        return this.a.onActionItemClicked(b(setactionbarvisibilitycallback), new setProvider(this.b, (setDrawerElevation) menuItem));
    }

    @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
    public final void d(setActionBarVisibilityCallback setactionbarvisibilitycallback) {
        this.a.onDestroyActionMode(b(setactionbarvisibilitycallback));
    }

    @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
    public final boolean d(setActionBarVisibilityCallback setactionbarvisibilitycallback, Menu menu) {
        return this.a.onCreateActionMode(b(setactionbarvisibilitycallback), d(menu));
    }
}
