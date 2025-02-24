package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import o.Keep;
import o.getInsetsIgnoringVisibility;
import o.performViewCreated;
import o.registerForContextMenu;
import o.setActionBarVisibilityCallback;
import o.setEdgeEffectFactory;
/* loaded from: classes-dex2jar.jar:o/setPadding.class */
public class setPadding extends getView implements setItemInvoker, getInsetsIgnoringVisibility.IconCompatParcelizer, Keep$MediaBrowserCompat$CustomActionResultReceiver {
    private Resources h;
    private setIcon j;

    public setPadding() {
        s();
    }

    private boolean d(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    private void r() {
        getWindow().getDecorView().setTag(registerForContextMenu.write.e, this);
        getWindow().getDecorView().setTag(performViewCreated.read.e, this);
        getWindow().getDecorView().setTag(setEdgeEffectFactory.RemoteActionCompatParcelizer.b, this);
    }

    private void s() {
        setOnFlingListener savedStateRegistry = getSavedStateRegistry();
        if (savedStateRegistry.d.e("androidx:appcompat", new setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setPadding.5
            @Override // o.setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver
            public Bundle c() {
                Bundle bundle = new Bundle();
                setPadding.this.h().b(bundle);
                return bundle;
            }
        }) == null) {
            b(new ParcelableVolumeInfo() { // from class: o.setPadding.3
                @Override // o.ParcelableVolumeInfo
                public void b(Context context) {
                    setIcon h = setPadding.this.h();
                    h.j();
                    h.e(setPadding.this.getSavedStateRegistry().d("androidx:appcompat"));
                }
            });
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    @Override // o.Keep$MediaBrowserCompat$CustomActionResultReceiver
    public Keep.RemoteActionCompatParcelizer a() {
        return h().b();
    }

    public boolean a(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        h().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        attachBaseContext(h().e(context));
    }

    public void b(getInsetsIgnoringVisibility getinsetsignoringvisibility) {
        Intent j = j();
        Intent intent = j;
        if (j == null) {
            intent = setStatusBarBackgroundResource.b(this);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                componentName = intent.resolveActivity(getinsetsignoringvisibility.c.getPackageManager());
            }
            getinsetsignoringvisibility.d(componentName);
            getinsetsignoringvisibility.a.add(intent);
        }
    }

    @Override // o.setItemInvoker
    public void b(setActionBarVisibilityCallback setactionbarvisibilitycallback) {
    }

    public void b(setInputType setinputtype) {
        h().a(setinputtype);
    }

    @Override // o.setItemInvoker
    public setActionBarVisibilityCallback c(setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return null;
    }

    public void c(int i) {
    }

    public void c(getInsetsIgnoringVisibility getinsetsignoringvisibility) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        setBackgroundResource i = i();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (i == null || !i.d()) {
            closeOptionsMenu();
        }
    }

    @Override // o.IconCompat, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        setBackgroundResource i = i();
        if (keyCode != 82 || i == null || !i.b(keyEvent)) {
            return dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void e(Intent intent) {
        navigateUpTo(intent);
    }

    @Override // o.setItemInvoker
    public void e(setActionBarVisibilityCallback setactionbarvisibilitycallback) {
    }

    @Deprecated
    public void f() {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) h().d(i);
    }

    public boolean g() {
        Intent j = j();
        if (j == null) {
            return false;
        }
        if (a(j)) {
            getInsetsIgnoringVisibility getinsetsignoringvisibility = new getInsetsIgnoringVisibility(this);
            b(getinsetsignoringvisibility);
            c(getinsetsignoringvisibility);
            if (!getinsetsignoringvisibility.a.isEmpty()) {
                ArrayList<Intent> arrayList = getinsetsignoringvisibility.a;
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!copyWindowDataInto.d(getinsetsignoringvisibility.c, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    getinsetsignoringvisibility.c.startActivity(intent);
                }
                try {
                    setOnHierarchyChangeListener.d((Activity) this);
                    return true;
                } catch (IllegalStateException e) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            e(j);
            return true;
        }
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return h().d();
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public Resources getResources() {
        Resources resources = this.h;
        Resources resources2 = resources;
        if (resources == null) {
            resources2 = getResources();
        }
        return resources2;
    }

    public setIcon h() {
        if (this.j == null) {
            this.j = setIcon.a(this, this);
        }
        return this.j;
    }

    public setBackgroundResource i() {
        return h().e();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        h().i();
    }

    @Override // o.getInsetsIgnoringVisibility.IconCompatParcelizer
    public Intent j() {
        return setStatusBarBackgroundResource.b(this);
    }

    @Override // o.getView
    public void n() {
        h().i();
    }

    @Override // o.getView, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.h != null) {
            this.h.updateConfiguration(configuration, getResources().getDisplayMetrics());
        }
        h().d(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        f();
    }

    @Override // o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        h().h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (d(keyEvent)) {
            return true;
        }
        return onKeyDown(i, keyEvent);
    }

    @Override // o.getView, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (onMenuItemSelected(i, menuItem)) {
            return true;
        }
        setBackgroundResource i2 = i();
        if (menuItem.getItemId() != 16908332 || i2 == null || (i2.e() & 4) == 0) {
            return false;
        }
        return g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return onMenuOpened(i, menu);
    }

    @Override // o.getView, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        onPostCreate(bundle);
        h().a(bundle);
    }

    @Override // o.getView, android.app.Activity
    public void onPostResume() {
        onPostResume();
        h().g();
    }

    @Override // o.getView, android.app.Activity
    public void onStart() {
        onStart();
        h().f();
    }

    @Override // o.getView, android.app.Activity
    public void onStop() {
        onStop();
        h().m();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        onTitleChanged(charSequence, i);
        h().b(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        setBackgroundResource i = i();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (i == null || !i.g()) {
            openOptionsMenu();
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void setContentView(int i) {
        r();
        h().e(i);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void setContentView(View view) {
        r();
        h().a(view);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        h().b(view, layoutParams);
    }

    @Override // android.app.Activity, android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void setTheme(int i) {
        setTheme(i);
        h().b(i);
    }
}
