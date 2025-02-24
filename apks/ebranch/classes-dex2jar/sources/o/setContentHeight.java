package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import o.onHasView;
import o.setActionBarVisibilityCallback;
/* loaded from: classes-dex2jar.jar:o/setContentHeight.class */
public class setContentHeight extends Dialog implements setItemInvoker {
    private setIcon a;
    private final onHasView.read d = new onHasView.read() { // from class: o.setContentHeight.1
        @Override // o.onHasView.read
        public boolean b(KeyEvent keyEvent) {
            return setContentHeight.this.b(keyEvent);
        }
    };

    public setContentHeight(Context context, int i) {
        super(context, a(context, i));
        setIcon c = c();
        c.b(a(context, i));
        c.e((Bundle) null);
    }

    private static int a(Context context, int i) {
        int i2 = i;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.C, typedValue, true);
            i2 = typedValue.resourceId;
        }
        return i2;
    }

    public boolean a(int i) {
        return c().a(i);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().d(view, layoutParams);
    }

    @Override // o.setItemInvoker
    public void b(setActionBarVisibilityCallback setactionbarvisibilitycallback) {
    }

    boolean b(KeyEvent keyEvent) {
        return dispatchKeyEvent(keyEvent);
    }

    @Override // o.setItemInvoker
    public setActionBarVisibilityCallback c(setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return null;
    }

    public setIcon c() {
        if (this.a == null) {
            this.a = setIcon.a(this, this);
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        dismiss();
        c().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return onHasView.a(this.d, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // o.setItemInvoker
    public void e(setActionBarVisibilityCallback setactionbarvisibilitycallback) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) c().d(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        c().i();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().j();
        onCreate(bundle);
        c().e(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        onStop();
        c().m();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c().e(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        c().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        setTitle(i);
        c().b(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence);
        c().b(charSequence);
    }
}
