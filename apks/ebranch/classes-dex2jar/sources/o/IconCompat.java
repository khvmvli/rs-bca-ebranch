package o;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import o.onHasView;
import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/IconCompat.class */
public class IconCompat extends Activity implements performContextItemSelected, onHasView.read {
    private setCollapseIcon<Class<? extends Object>, Object> a = new setCollapseIcon<>();
    private performCreate e = new performCreate(this);

    @Override // o.onHasView.read
    public boolean b(KeyEvent keyEvent) {
        return dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !findFragmentByWho.a(decorView, keyEvent)) {
            return onHasView.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !findFragmentByWho.a(decorView, keyEvent)) {
            return dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // o.performContextItemSelected
    public onRequestPermissionsResult getLifecycle() {
        return this.e;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        performPause.a(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        performCreate performcreate = this.e;
        onRequestPermissionsResult.read read = onRequestPermissionsResult.read.CREATED;
        performcreate.b("markState");
        performcreate.b("setCurrentState");
        performcreate.b(read);
        onSaveInstanceState(bundle);
    }
}
